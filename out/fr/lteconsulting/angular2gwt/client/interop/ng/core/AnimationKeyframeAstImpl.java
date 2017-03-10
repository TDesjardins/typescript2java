package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationStylesAst;
import jsinterop.annotations.JsConstructor;
import ng.core.AnimationAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationKeyframeAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="AnimationKeyframeAst" )
public class AnimationKeyframeAstImpl extends AnimationAst {
    @JsProperty(name="offset")
    int getOffset();
    @JsProperty(name="offset")
    void setOffset(int value);
    @JsProperty(name="styles")
    AnimationStylesAst getStyles();
    @JsProperty(name="styles")
    void setStyles(AnimationStylesAst value);
    @JsConstructor
    public AnimationKeyframeAstImpl(int offset,AnimationStylesAst styles) {}
    public native  Object visit(AnimationAstVisitor visitor,Object context);
}
