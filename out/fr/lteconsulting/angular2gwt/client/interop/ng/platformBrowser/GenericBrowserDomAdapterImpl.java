package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\platform-browser\src\browser\generic_browser_adapter.d.ts
  * Package ng.platformBrowser
  * Name GenericBrowserDomAdapter
  * Provides DOM operations in any browser environment.
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="GenericBrowserDomAdapter" )
public abstract class GenericBrowserDomAdapterImpl extends DomAdapter {
    @JsProperty(name="_animationPrefix")
    Object get_animationPrefix();
    @JsProperty(name="_animationPrefix")
    void set_animationPrefix(Object value);
    @JsProperty(name="_transitionEnd")
    Object get_transitionEnd();
    @JsProperty(name="_transitionEnd")
    void set_transitionEnd(Object value);
    @JsConstructor
    public GenericBrowserDomAdapterImpl() {}
    public native  JsArray<Node> getDistributedNodes(HTMLElement el);
    public native  void resolveAndSetHref(HTMLAnchorElement el,String baseUrl,String href);
    public native  boolean supportsDOMEvents();
    public native  boolean supportsNativeShadowDOM();
    public native  String getAnimationPrefix();
    public native  String getTransitionEnd();
    public native  boolean supportsAnimation();
}
