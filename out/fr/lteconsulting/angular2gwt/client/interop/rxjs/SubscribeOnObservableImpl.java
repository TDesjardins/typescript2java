package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Observable;
import jsinterop.annotations.JsProperty;
import rxjs.IScheduler;
import rxjs.Action;
import rxjs.DispatchArg;
import rxjs.Subscription;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\SubscribeOnObservable.d.ts
  * Package rxjs
  * Name SubscribeOnObservable
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="SubscribeOnObservable" )
public class SubscribeOnObservableImpl<T> extends Observable<T> {
    @JsProperty(name="source")
    Observable<T> getSource();
    @JsProperty(name="source")
    void setSource(Observable<T> value);
    @JsProperty(name="delayTime")
    Object getDelayTime();
    @JsProperty(name="delayTime")
    void setDelayTime(Object value);
    @JsProperty(name="scheduler")
    Object getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(Object value);
    public static native <T> Observable<T> create(Observable<T> source,int /* optional */ delay,IScheduler /* optional */ scheduler);
    public static native <T> Subscription dispatch(Action<T> this,DispatchArg<T> arg);
    @JsConstructor
    public SubscribeOnObservableImpl(Observable<T> source,int /* optional */ delayTime,IScheduler /* optional */ scheduler) {}
    public native  Subscription _subscribe(Subscriber<T> subscriber);
}
