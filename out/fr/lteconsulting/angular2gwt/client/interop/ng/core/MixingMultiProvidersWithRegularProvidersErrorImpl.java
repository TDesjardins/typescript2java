package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_errors.d.ts
  * Package ng.core
  * Name MixingMultiProvidersWithRegularProvidersError
  * Thrown when a multi provider and a regular provider are bound to the same token.
  * 
  * ### Example
  * 
  * ```typescript
  * expect(() => Injector.resolveAndCreate([
  *    { provide: "Strings", useValue: "string1", multi: true},
  *    { provide: "Strings", useValue: "string2", multi: false}
  * ])).toThrowError();
  * ```
  **/
@JsType( isNative=true, namespace="ng.core", name="MixingMultiProvidersWithRegularProvidersError" )
public class MixingMultiProvidersWithRegularProvidersErrorImpl extends BaseError {
    @JsConstructor
    public MixingMultiProvidersWithRegularProvidersErrorImpl(Object provider1,Object provider2) {}
}
