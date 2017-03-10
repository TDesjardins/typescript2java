package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Expression;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.TypeVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ExpressionType
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ExpressionType extends Type {
    @JsProperty(name="value")
    Expression getValue();
    @JsProperty(name="value")
    void setValue(Expression value);
    @JsProperty(name="typeParams")
    JsArray<Type> getTypeParams();
    @JsProperty(name="typeParams")
    void setTypeParams(JsArray<Type> value);
    @JsConstructor
    public ExpressionType(Expression value,JsArray<Type> /* optional */ typeParams,JsArray</* ng.core.TypeModifier */ int> /* optional */ modifiers) {}
     Object visitType(TypeVisitor visitor,Object context);
}
