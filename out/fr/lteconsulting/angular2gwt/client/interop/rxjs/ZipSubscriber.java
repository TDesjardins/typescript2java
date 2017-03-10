package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.Subscriber;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\rxjs\operator\zip.d.ts
  * Package rxjs
  * Name ZipSubscriber
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ZipSubscriber<T,R> extends Subscriber<T> {
    @JsProperty(name="values")
    Object getValues();
    @JsProperty(name="values")
    void setValues(Object value);
    @JsProperty(name="project")
    Object getProject();
    @JsProperty(name="project")
    void setProject(Object value);
    @JsProperty(name="iterators")
    Object getIterators();
    @JsProperty(name="iterators")
    void setIterators(Object value);
    @JsProperty(name="active")
    Object getActive();
    @JsProperty(name="active")
    void setActive(Object value);
    @JsConstructor
    public ZipSubscriber(Subscriber<R> destination,JsFunction1<Array<Object>,R> /* optional */ project,Object /* optional */ values) {}
     void _next(Object value);
     void _complete();
     void notifyInactive();
     void checkIterators();
     void _tryProject(JsArray<Object> args);
}
