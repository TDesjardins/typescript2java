package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileIdentifierMetadata;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Expression;
import ng.core.ReadPropExpr;
import ng.core.BoundElementPropertyAst;
import ng.core.Statement;
import ng.core.CompileDirectiveSummary;
import ng.core.BoundEventAst;

/**
  * Generated from tests\@angular\compiler\src\directive_wrapper_compiler.d.ts
  * Package ng.core
  * Name DirectiveWrapperExpressions
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="DirectiveWrapperExpressions" )
public class DirectiveWrapperExpressionsImpl  {
    public static native  Expression create(CompileIdentifierMetadata dir,JsArray<Expression> depsExpr);
    public static native  ReadPropExpr context(Expression dirWrapper);
    public static native  Expression ngDoCheck(Expression dirWrapper,Expression view,Expression renderElement,Expression throwOnChange);
    public static native  JsArray<Statement> checkHost(JsArray<BoundElementPropertyAst> hostProps,Expression dirWrapper,Expression view,Expression componentView,Expression renderElement,Expression throwOnChange,JsArray<Expression> runtimeSecurityContexts);
    public static native  JsArray<Statement> ngOnDetach(JsArray<BoundElementPropertyAst> hostProps,Expression dirWrapper,Expression view,Expression componentView,Expression renderEl);
    public static native  JsArray<Statement> ngOnDestroy(CompileDirectiveSummary dir,Expression dirWrapper);
    public static native  JsArray<Statement> subscribe(CompileDirectiveSummary dirMeta,JsArray<BoundElementPropertyAst> hostProps,JsArray<String> usedEvents,Expression dirWrapper,Expression view,Expression eventListener);
    public static native  Expression handleEvent(JsArray<BoundEventAst> hostEvents,Expression dirWrapper,Expression eventName,Expression event);
}
