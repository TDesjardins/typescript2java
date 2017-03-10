package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\pipes\date_pipe.d.ts
  * Package ng.core
  * Name DatePipe
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DatePipe extends PipeTransform {
    @JsProperty(name="_locale")
    Object get_locale();
    @JsProperty(name="_locale")
    void set_locale(Object value);
    @JsConstructor
    public DatePipe(String _locale) {}
     String transform(Object value,String /* optional */ pattern);
}
