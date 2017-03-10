package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.VirtualTimeScheduler;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.VirtualAction;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\scheduler\VirtualTimeScheduler.d.ts
  * Package rxjs
  * Name VirtualAction
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="VirtualAction" )
public class VirtualActionImpl<T> extends AsyncAction<T> {
    @JsProperty(name="scheduler")
    VirtualTimeScheduler getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(VirtualTimeScheduler value);
    @JsProperty(name="work")
    JsFunction2<VirtualAction<T>,T,Void> getWork();
    @JsProperty(name="work")
    void setWork(JsFunction2<VirtualAction<T>,T,Void> value);
    @JsProperty(name="index")
    int getIndex();
    @JsProperty(name="index")
    void setIndex(int value);
    @JsConstructor
    public VirtualActionImpl(VirtualTimeScheduler scheduler,JsFunction2<VirtualAction<T>,T,Void> work,int /* optional */ index) {}
    public native  Subscription schedule(T /* optional */ state,int /* optional */ delay);
    public native  Object requestAsyncId(VirtualTimeScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
    public native  Object recycleAsyncId(VirtualTimeScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
    public static native <T> int sortActions(VirtualAction<T> a,VirtualAction<T> b);
}
