package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser\src\browser\tools\common_tools.d.ts
  * Package ng.platformBrowser
  * Name ChangeDetectionPerfRecord
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="ChangeDetectionPerfRecord" )
public class ChangeDetectionPerfRecordImpl  {
    @JsProperty(name="msPerTick")
    int getMsPerTick();
    @JsProperty(name="msPerTick")
    void setMsPerTick(int value);
    @JsProperty(name="numTicks")
    int getNumTicks();
    @JsProperty(name="numTicks")
    void setNumTicks(int value);
    @JsConstructor
    public ChangeDetectionPerfRecordImpl(int msPerTick,int numTicks) {}
}
