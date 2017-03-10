package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileIdentifierMetadata;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\deps.d.ts
  * Package ng.core
  * Name ComponentFactoryDependency
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ComponentFactoryDependency  {
    @JsProperty(name="comp")
    CompileIdentifierMetadata getComp();
    @JsProperty(name="comp")
    void setComp(CompileIdentifierMetadata value);
    @JsProperty(name="placeholder")
    CompileIdentifierMetadata getPlaceholder();
    @JsProperty(name="placeholder")
    void setPlaceholder(CompileIdentifierMetadata value);
    @JsConstructor
    public ComponentFactoryDependency(CompileIdentifierMetadata comp,CompileIdentifierMetadata placeholder) {}
}
