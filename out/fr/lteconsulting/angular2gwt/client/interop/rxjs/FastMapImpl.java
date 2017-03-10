package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.FastMap;
import fr.lteconsulting.angular2gwt.client.JsFunction2;

/**
  * Generated from tests\rxjs\util\FastMap.d.ts
  * Package rxjs
  * Name FastMap
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="FastMap" )
public class FastMapImpl  {
    @JsProperty(name="values")
    Object getValues();
    @JsProperty(name="values")
    void setValues(Object value);
    public native  boolean delete(String key);
    public native  FastMap set(String key,Object value);
    public native  Object get(String key);
    public native  void forEach(JsFunction2<Object,Object,Void> cb,Object /* optional */ thisArg);
    public native  void clear();
}
