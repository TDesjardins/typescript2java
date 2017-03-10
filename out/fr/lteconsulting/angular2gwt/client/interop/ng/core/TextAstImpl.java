package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.TemplateAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name TextAst
  * A segment of text within the template.
  **/
@JsType( isNative=true, namespace="ng.core", name="TextAst" )
public class TextAstImpl extends TemplateAst {
    @JsProperty(name="value")
    String getValue();
    @JsProperty(name="value")
    void setValue(String value);
    @JsProperty(name="ngContentIndex")
    int getNgContentIndex();
    @JsProperty(name="ngContentIndex")
    void setNgContentIndex(int value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public TextAstImpl(String value,int ngContentIndex,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
