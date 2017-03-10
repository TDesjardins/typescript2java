package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.StatementVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name CommentStmt
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CommentStmt extends Statement {
    @JsProperty(name="comment")
    String getComment();
    @JsProperty(name="comment")
    void setComment(String value);
    @JsConstructor
    public CommentStmt(String comment) {}
     Object visitStatement(StatementVisitor visitor,Object context);
}
