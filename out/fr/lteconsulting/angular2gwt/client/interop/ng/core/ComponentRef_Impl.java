package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AppView;
import jsinterop.annotations.JsConstructor;
import ng.core.ElementRef;
import ng.core.Injector;
import ng.core.ViewRef;
import ng.core.ChangeDetectorRef;
import ng.core.Type;

/**
  * Generated from tests\@angular\core\src\linker\component_factory.d.ts
  * Package ng.core
  * Name ComponentRef_
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ComponentRef_" )
public class ComponentRef_Impl<C> extends ComponentRef<C> {
    @JsProperty(name="_index")
    Object get_index();
    @JsProperty(name="_index")
    void set_index(Object value);
    @JsProperty(name="_parentView")
    Object get_parentView();
    @JsProperty(name="_parentView")
    void set_parentView(Object value);
    @JsProperty(name="_nativeElement")
    Object get_nativeElement();
    @JsProperty(name="_nativeElement")
    void set_nativeElement(Object value);
    @JsProperty(name="_component")
    Object get_component();
    @JsProperty(name="_component")
    void set_component(Object value);
    @JsConstructor
    public ComponentRef_Impl(int _index,AppView<Object> _parentView,Object _nativeElement,C _component) {}
    @JsProperty(name="location")
    ElementRef getLocation();
    @JsProperty(name="location")
    void setLocation(ElementRef value);
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    @JsProperty(name="instance")
    C getInstance();
    @JsProperty(name="instance")
    void setInstance(C value);
    @JsProperty(name="hostView")
    ViewRef getHostView();
    @JsProperty(name="hostView")
    void setHostView(ViewRef value);
    @JsProperty(name="changeDetectorRef")
    ChangeDetectorRef getChangeDetectorRef();
    @JsProperty(name="changeDetectorRef")
    void setChangeDetectorRef(ChangeDetectorRef value);
    @JsProperty(name="componentType")
    Type<Object> getComponentType();
    @JsProperty(name="componentType")
    void setComponentType(Type<Object> value);
    public native  void destroy();
    public native  void onDestroy(Function callback);
}
