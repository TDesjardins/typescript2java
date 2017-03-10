package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.StaticReflector;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.core.StaticSymbol;

/**
  * Generated from tests\@angular\compiler\src\aot\static_reflection_capabilities.d.ts
  * Package ng.core
  * Name StaticAndDynamicReflectionCapabilities
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="StaticAndDynamicReflectionCapabilities" )
public class StaticAndDynamicReflectionCapabilitiesImpl  {
    @JsProperty(name="staticDelegate")
    Object getStaticDelegate();
    @JsProperty(name="staticDelegate")
    void setStaticDelegate(Object value);
    public static native  void install(StaticReflector staticDelegate);
    @JsProperty(name="dynamicDelegate")
    Object getDynamicDelegate();
    @JsProperty(name="dynamicDelegate")
    void setDynamicDelegate(Object value);
    @JsConstructor
    public StaticAndDynamicReflectionCapabilitiesImpl(StaticReflector staticDelegate) {}
    public native  boolean isReflectionEnabled();
    public native  Function factory(Object type);
    public native  boolean hasLifecycleHook(Object type,String lcProperty);
    public native  JsArray<JsArray<Object>> parameters(Object type);
    public native  JsArray<Object> annotations(Object type);
    public native  JsTypedObject<String,JsArray<Object>> propMetadata(Object typeOrFunc);
    public native  GetterFn getter(String name);
    public native  SetterFn setter(String name);
    public native  MethodFn method(String name);
    public native  String importUri(Object type);
    public native  StaticSymbol resolveIdentifier(String name,String moduleUrl,Object runtime);
    public native  Object resolveEnum(Object enumIdentifier,String name);
}
