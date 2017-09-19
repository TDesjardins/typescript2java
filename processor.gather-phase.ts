import * as ts from "typescript";
import * as path from "path";
import { Identifier } from "typescript";
import { type } from "os";
import * as TypeMap from './type-map'
import { TsToPreJavaTypemap } from './type-map'

import { PreJavaType, ProcessContext } from './prejavatypes/PreJavaType'
import { PreJavaTypeClassOrInterface } from './prejavatypes/PreJavaTypeClassOrInterface'
import { PreJavaTypeCallSignature } from './prejavatypes/PreJavaTypeCallSignature'

function guessName(identifier: ts.Identifier | ts.BindingPattern): string {
    if (identifier.kind == ts.SyntaxKind.Identifier)
        return identifier.text;
    return "[UNKNOWN]";
}

export class GatherPhase {
    typeMap: TsToPreJavaTypemap

    private ignoredSyntaxKinds: Set<ts.SyntaxKind> = new Set()

    constructor(private baseJavaPackage: string,
        private javaPackages: { [key: string]: string },
        private program: ts.Program) {
        this.typeMap = new TsToPreJavaTypemap(program, sourceFile => this.getJavaPackage(sourceFile))
    }

    private getJavaPackage(sourceFile: ts.SourceFile) {
        let relative = path.relative(this.program.getCurrentDirectory(), sourceFile.fileName);
        for (let pathPrefix in this.javaPackages) {
            let sourceRelativePath = path.relative(pathPrefix, relative)
            if (!sourceRelativePath.startsWith('..')) {
                let dirRelativePackagePath = path.dirname(sourceRelativePath).replace(new RegExp('\\\\', 'g'), '.').replace(new RegExp('-', 'g'), '.').replace(new RegExp('\\/', 'g'), '.')
                let packagePrefix = this.javaPackages[pathPrefix] + (dirRelativePackagePath == '.' ? '' : ('.' + dirRelativePackagePath))

                return packagePrefix
            }
        }
        return null
    }

    addTypesFromSourceFile(sourceFile: ts.SourceFile, onlyExportedSymbols: boolean) {
        ts.forEachChild(sourceFile, (node) => {
            if (node.kind == ts.SyntaxKind.VariableStatement) {
                this.registerVariableStatement(node as ts.VariableStatement)
                return
            }

            if (node.kind == ts.SyntaxKind.FunctionDeclaration) {
                this.registerFunctionDeclaration(node as ts.FunctionDeclaration)
                return
            }

            if (node.kind == ts.SyntaxKind.InterfaceDeclaration || node.kind == ts.SyntaxKind.ClassDeclaration) {
                this.typeMap.getOrCreatePreJavaTypeForTsType(this.program.getTypeChecker().getTypeAtLocation(node))
                return;
            }

            if (node.kind == ts.SyntaxKind.EnumDeclaration) {
                let t = this.program.getTypeChecker().getTypeAtLocation(node)
                this.typeMap.getOrCreatePreJavaTypeForTsType(t)
                return;
            }

            if (!this.ignoredSyntaxKinds.has(node.kind)) {
                this.ignoredSyntaxKinds.add(node.kind)
                console.log(`Ignored SyntaxKind: ${ts.SyntaxKind[node.kind]}`)
            }
        });
    }

    sumup() {
        console.log(`removing unsupported types`)
        this.typeMap.removeNotSupportedTypes()

        console.log(`removing OverridingProperties`)
        this.typeMap.removeOverridingProperties()

        console.log(`reducing anonymous types`)
        this.typeMap.reduceAnonymousTypes()

        console.log(`unanonymising types`)
        this.typeMap.ensureAllTypesHaveNameAndPackage(this.baseJavaPackage)

        console.log(`simplifying unions`)
        this.typeMap.simplifyUnions()

        console.log(`removing duplicate overloads (with same type erasure)`)
        this.typeMap.removeDuplicateOverloads()

        console.log(`changing DTO interfaces into classes`)
        this.typeMap.changeDtoInterfacesIntoClasses()

        while (true) {
            console.log(`transforming types inheriting multiple implementations`)
            if (!this.typeMap.arrangeMultipleImplementationInheritance())
                break
        }

        console.log(`add missing methods from interface hierarchy in classes`)
        this.typeMap.addMethodsFromInterfaceHierarchy()

        console.log(`(todo) develop union types in methods parameters into overrides`)
        console.log(`(todo) removing invalid method duplicates (same type erasure overrides and so on...)`)
        console.log(`(todo) merge types with same name and same structure`)
        console.log(`(todo) Array should be replaced by an externally provided type`)

        console.log(`(todo) add methods from hierarchy`)
        console.log(`(todo) remove duplicate methods in hierarchy`)

        console.log(`replacing anonymous types`)
        this.typeMap.replaceAnonymousTypes()

        console.log(`renaming duplicate fqns`)
        this.typeMap.checkNoDuplicateTypeNames()

        console.log(`statistics:`)
        console.log(`${this.globalClasses.size} global scope classes`)
        console.log(`${this.typeMap.typeMap.size} jsinterop types`)
    }

    // maps js package names to global element holder java classes
    private globalClasses = new Map<string, PreJavaTypeClassOrInterface>()

    private getGlobalClass(jsPackage: string): PreJavaTypeClassOrInterface {
        if (!jsPackage)
            jsPackage = 'global'

        if (!this.globalClasses.has(jsPackage)) {
            let globalClass = new PreJavaTypeClassOrInterface()
            globalClass.comments = [`Wrapper class for all global definition of ${jsPackage} package`]
            globalClass.isClass = true
            globalClass.name = "GlobalScope"
            globalClass.packageName = jsPackage

            this.globalClasses.set(jsPackage, globalClass)
            this.typeMap.typeMap.set('global-declarations-class-' + jsPackage, globalClass)

            return globalClass
        }

        return this.globalClasses.get(jsPackage)
    }

    private registerVariableStatement(statement: ts.VariableStatement) {
        statement.declarationList.declarations.forEach((declaration) => {
            let t = this.program.getTypeChecker().getTypeFromTypeNode(declaration.type)

            let cs = t.getConstructSignatures()
            if (cs && cs.length) {
                cs.forEach(constructorSignature => {
                    if (constructorSignature.getReturnType()) {
                        let preJava = this.typeMap.getOrCreatePreJavaTypeForTsType(constructorSignature.getReturnType())
                        if (preJava instanceof PreJavaTypeClassOrInterface) {
                            preJava.addPrototypeName(null, guessName(declaration.name))
                            preJava.setSimpleName(guessName(declaration.name))
                        }
                    }
                })
            }

            if (t.getNumberIndexType()
                || t.getStringIndexType()
                || (t.getCallSignatures() && t.getCallSignatures().some(s => s.declaration && s.declaration.name && s.declaration.name.getText() != '__call'))
                || (t.getProperties() && t.getProperties().some(p => p.name != 'prototype'))) {
                let variableType = this.typeMap.getOrCreatePreJavaTypeForTsType(t, false)

                this.getGlobalClass(this.getJavaPackage(declaration.getSourceFile())).addStaticProperty({ name: guessName(declaration.name), comments: null, type: variableType, writable: true })
            }
        })
    }

    private registerFunctionDeclaration(declaration: ts.FunctionDeclaration) {
        let t = this.program.getTypeChecker().getTypeAtLocation(declaration)

        let name = declaration && declaration.name && declaration.name.text
        if (!name)
            return

        let javaPackage = this.getJavaPackage(declaration.getSourceFile())

        let callSignatures = t.getCallSignatures()
        if (callSignatures && callSignatures.length) {
            callSignatures.forEach(tsSignature => {
                let signature = this.typeMap.convertSignature(name, tsSignature, null)
                if (signature) {
                    this.getGlobalClass(javaPackage).addStaticMethod(signature)
                }
            })
        }
    }
}
