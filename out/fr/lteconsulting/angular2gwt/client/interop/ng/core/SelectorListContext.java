package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CssSelector;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\selector.d.ts
  * Package ng.core
  * Name SelectorListContext
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SelectorListContext  {
    @JsProperty(name="selectors")
    JsArray<CssSelector> getSelectors();
    @JsProperty(name="selectors")
    void setSelectors(JsArray<CssSelector> value);
    @JsProperty(name="alreadyMatched")
    boolean getAlreadyMatched();
    @JsProperty(name="alreadyMatched")
    void setAlreadyMatched(boolean value);
    @JsConstructor
    public SelectorListContext(JsArray<CssSelector> selectors) {}
}
