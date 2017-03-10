package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\core\src\security.d.ts
  * Package ng.core
  * Name Sanitizer
  * Sanitizer is used by the views to sanitize potentially dangerous values.
  **/
@JsType( isNative=true, namespace="ng.core", name="Sanitizer" )
public abstract class SanitizerImpl  {
    public native  String sanitize(/* ng.core.SecurityContext */ int context,String value);
}
