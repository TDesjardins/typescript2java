package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.TemplateRef;
import ng.core.ViewContainerRef;
import ng.core.NgPlural;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\directives\ng_plural.d.ts
  * Package ng.core
  * Name NgPluralCase
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgPluralCase  {
    @JsProperty(name="value")
    String getValue();
    @JsProperty(name="value")
    void setValue(String value);
    @JsConstructor
    public NgPluralCase(String value,TemplateRef<Object> template,ViewContainerRef viewContainer,NgPlural ngPlural) {}
}
