package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\view_utils.d.ts
  * Package ng.core
  * Name InlineArray4
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="InlineArray4" )
public class InlineArray4Impl<T> extends InlineArray<T> {
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
    @JsProperty(name="_v2")
    Object get_v2();
    @JsProperty(name="_v2")
    void set_v2(Object value);
    @JsProperty(name="_v3")
    Object get_v3();
    @JsProperty(name="_v3")
    void set_v3(Object value);
    @JsConstructor
    public InlineArray4Impl(int length,T /* optional */ _v0,T /* optional */ _v1,T /* optional */ _v2,T /* optional */ _v3) {}
    public native  T get(int index);
    public native  void set(int index,T value);
}
