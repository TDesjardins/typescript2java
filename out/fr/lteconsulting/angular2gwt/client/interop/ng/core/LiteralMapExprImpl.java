package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.LiteralMapEntry;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import ng.core.MapType;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name LiteralMapExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="LiteralMapExpr" )
public class LiteralMapExprImpl extends Expression {
    @JsProperty(name="entries")
    JsArray<LiteralMapEntry> getEntries();
    @JsProperty(name="entries")
    void setEntries(JsArray<LiteralMapEntry> value);
    @JsProperty(name="valueType")
    Type getValueType();
    @JsProperty(name="valueType")
    void setValueType(Type value);
    @JsConstructor
    public LiteralMapExprImpl(JsArray<LiteralMapEntry> entries,MapType /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
