package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AppView;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\element_injector.d.ts
  * Package ng.core
  * Name ElementInjector
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ElementInjector extends Injector {
    @JsProperty(name="_view")
    Object get_view();
    @JsProperty(name="_view")
    void set_view(Object value);
    @JsProperty(name="_nodeIndex")
    Object get_nodeIndex();
    @JsProperty(name="_nodeIndex")
    void set_nodeIndex(Object value);
    @JsConstructor
    public ElementInjector(AppView<Object> _view,int _nodeIndex) {}
     Object get(Object token,Object /* optional */ notFoundValue);
}
