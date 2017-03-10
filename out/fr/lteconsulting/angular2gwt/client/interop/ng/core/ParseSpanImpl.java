package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name ParseSpan
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ParseSpan" )
public class ParseSpanImpl  {
    @JsProperty(name="start")
    int getStart();
    @JsProperty(name="start")
    void setStart(int value);
    @JsProperty(name="end")
    int getEnd();
    @JsProperty(name="end")
    void setEnd(int value);
    @JsConstructor
    public ParseSpanImpl(int start,int end) {}
}
