package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\view_utils.d.ts
  * Package ng.core
  * Name InlineArray2
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface InlineArray2<T> extends InlineArray<T> {
    @JsProperty(name="length")
    int getLength();
    @JsProperty(name="length")
    void setLength(int value);
    @JsProperty(name="_v0")
    Object get_v0();
    @JsProperty(name="_v0")
    void set_v0(Object value);
    @JsProperty(name="_v1")
    Object get_v1();
    @JsProperty(name="_v1")
    void set_v1(Object value);
    @JsConstructor
    public InlineArray2(int length,T /* optional */ _v0,T /* optional */ _v1) {}
     T get(int index);
     void set(int index,T value);
}
