package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.http.Headers;
import ng.http.RequestArgs;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\src\static_request.d.ts
  * Package ng.http
  * Name Request
  * Creates `Request` instances from provided values.
  * 
  * The Request's interface is inspired by the Request constructor defined in the [Fetch
  * Spec](https://fetch.spec.whatwg.org/#request-class),
  * but is considered a static value whose body can be accessed many times. There are other
  * differences in the implementation, but this is the most significant.
  * 
  * `Request` instances are typically created by higher-level classes, like {@link Http} and
  * {@link Jsonp}, but it may occasionally be useful to explicitly create `Request` instances.
  * One such example is when creating services that wrap higher-level services, like {@link Http},
  * where it may be useful to generate a `Request` with arbitrary headers and search params.
  * 
  * ```typescript
  * import {Injectable, Injector} from '@angular/core';
  * import {HTTP_PROVIDERS, Http, Request, RequestMethod} from '@angular/http';
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Request extends Body {
    @JsProperty(name="method")
    /* ng.http.RequestMethod */ int getMethod();
    @JsProperty(name="method")
    void setMethod(/* ng.http.RequestMethod */ int value);
    @JsProperty(name="headers")
    Headers getHeaders();
    @JsProperty(name="headers")
    void setHeaders(Headers value);
    @JsProperty(name="url")
    String getUrl();
    @JsProperty(name="url")
    void setUrl(String value);
    @JsProperty(name="contentType")
    Object getContentType();
    @JsProperty(name="contentType")
    void setContentType(Object value);
    @JsProperty(name="withCredentials")
    boolean getWithCredentials();
    @JsProperty(name="withCredentials")
    void setWithCredentials(boolean value);
    @JsProperty(name="responseType")
    /* ng.http.ResponseContentType */ int getResponseType();
    @JsProperty(name="responseType")
    void setResponseType(/* ng.http.ResponseContentType */ int value);
    @JsConstructor
    public Request(RequestArgs requestOptions) {}
     /* ng.http.ContentType */ int detectContentType();
     /* ng.http.ContentType */ int detectContentTypeFromBody();
     Object getBody();
}
