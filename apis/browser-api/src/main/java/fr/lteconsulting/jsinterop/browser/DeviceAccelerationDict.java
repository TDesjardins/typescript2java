package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: DeviceAccelerationDict
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:257193
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeviceAccelerationDict")
public class DeviceAccelerationDict
{

    /*
        Properties
    */

    public Number x;

    @JsProperty( name = "x")
    public native Number getX();

    @JsProperty( name = "x")
    public native void setX( Number value );

    public Number y;

    @JsProperty( name = "y")
    public native Number getY();

    @JsProperty( name = "y")
    public native void setY( Number value );

    public Number z;

    @JsProperty( name = "z")
    public native Number getZ();

    @JsProperty( name = "z")
    public native void setZ( Number value );
}
