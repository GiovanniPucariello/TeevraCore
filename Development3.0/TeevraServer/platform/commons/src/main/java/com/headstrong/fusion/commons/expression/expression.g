header {
/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 */
package com.headstrong.fusion.commons.expression;
    
import com.headstrong.fusion.commons.expression.evaluator.*;
}

class ExpressionParserImpl extends Parser;

options {
    buildAST = false;
    k=1;
    defaultErrorHandler = false;
}

/* This is the top-level expression */
expression returns [Expression exp = null] throws EvaluationException
    :
        exp = expr
        (EOF!)
    ;

/* We have expr and mexpr separate, with the addition and subtraction
   separate from multiplication in order to enforce order-of-operations. */
expr returns [Expression exp = null] throws EvaluationException
    {
        Expression right;
    }
    :
        exp=relexpr (
            ( AND^ right=relexpr) { exp = new BinaryOperatorExpression(exp, "&&", right); }
            | (OR^ right=relexpr)  { exp = new BinaryOperatorExpression(exp, "||", right); }
        )*
    ;

// Relational Expression
relexpr returns [Expression exp = null] throws EvaluationException
    {
        Expression right;
    }
    :
        exp=addexpr (
            (EQUALS^ right=addexpr) { exp = new BinaryOperatorExpression(exp, "=", right); }
            | (NOT_EQUALS^ right=addexpr) { exp = new BinaryOperatorExpression(exp, "!=", right); }
            | (GREATERTHAN^ right=addexpr) { exp = new BinaryOperatorExpression(exp, ">", right); }
            | (LESSTHAN^ right=addexpr) { exp = new BinaryOperatorExpression(exp, "<", right); }
            | (GREATERTHANEQUALTO^ right=addexpr) { exp = new BinaryOperatorExpression(exp, ">=", right); }
            | (LESSTHANEQUALTO^ right=addexpr) { exp = new BinaryOperatorExpression(exp, "<=", right); }
        )*
    ;

// Arithmetic Expression
addexpr returns [Expression exp = null] throws EvaluationException
    {
        Expression right;
    }
    :
        exp=multexpr (( PLUS^ right=multexpr { exp = new BinaryOperatorExpression(exp, "+", right); }
                      | MINUS^ right=multexpr { exp = new BinaryOperatorExpression(exp, "-", right); } ))*
    ;

// Multiplicative (or divisive) expression
multexpr returns [Expression exp = null] throws EvaluationException
    {
        Expression right;
    }
    :
        exp=unaryExpr (
            ( STAR^ right=unaryExpr { exp = new BinaryOperatorExpression(exp, "*", right); } )
            |
            ( SLASH right=unaryExpr { exp = new BinaryOperatorExpression(exp, "/", right); } )
            |
            ( PERCENT right=unaryExpr { exp = new BinaryOperatorExpression(exp, "%", right); } )
            
        )*
    ;

// (Logically) negated expression
unaryExpr returns [ Expression exp = null ] throws EvaluationException
    :
        (
         (PLUS!)? exp=atom
        )
    ;

functionsuffix returns [ java.util.List args = null ] throws EvaluationException
    :
        LPAREN! ( args=argumentlist )? RPAREN!
    ;

arraysuffix returns [ Expression index = null ] throws EvaluationException
    :
        LBRACKET! ( index=expr ) RBRACKET!
    ;

// Argument List
argumentlist returns [java.util.List list = new java.util.ArrayList()] throws EvaluationException
    {
        Expression arg;
    }
    :
        arg=argument { if(null != arg) { list.add(arg); } }
        (COMMA! arg=argument { if(null != arg) { list.add(arg); } })*
    ;

// Argument (i.e. anything)
argument returns [Expression exp = null] throws EvaluationException
    :
        exp=expr
    ;

// Indentifiers (i.e. symbols)
identifier returns [ Expression exp = null ] throws EvaluationException
    :
        id:IDENTIFIER
        {
            exp = new IdentifierExpression(id.getText());
        }
    ;

// Indentifiers (i.e. symbols)
boIdentifier returns [ Expression exp = null ] throws EvaluationException
    :
        id:BOIDENTIFIER
        {
            exp = new BusinessObjectExpression(id.getText());
        }
    ;

arithBoIdentifier returns [ Expression exp = null ] throws EvaluationException
    :
        id:ARITHBOIDENTIFIER
        {
            exp = new ArithBusinessObjectExpression(id.getText());
        }
    ;

// Atoms
atom returns [Expression exp = null] throws EvaluationException
    {
        Expression index;
        java.util.List args;
    }
    :
        exp=arithBoIdentifier
        ( 
        )|exp=boIdentifier
        ( 
        )|
        exp=identifier
        ( args=functionsuffix { exp=new FunctionCallExpression(exp, args); }
          |
          index=arraysuffix { exp=new ArrayReferenceExpression(exp, index); }
        )*
        |
        hex:HEX_LITERAL {   Object value;
                            String hexStr = hex.getText();
                            int length = hexStr.length();
                            // All these temporary objects, here, will
                            // allow us to create the correctly-sized
                            // object (byte, short, int, long) with the
                            // specified bit pattern.
//9223372036854775807

                            if(length > 10) // 8 hex + leading "0x"
                            {
                                value = Long.decode(hexStr);
                            }
                            else if(length > 6)
                            {
                                Long tl = Long.decode(hexStr);
                                if(tl.longValue() > Integer.MAX_VALUE)
                                    value = new Integer((int)(tl.longValue() - Integer.MAX_VALUE));
                                else
                                    value = new Integer(tl.intValue());
                            }
                            else if(length > 4)
                            {
                                Integer ti = Integer.decode(hexStr);
                                if(ti.intValue() > Short.MAX_VALUE)
                                    value = new Short((short)(ti.intValue() - Short.MAX_VALUE));
                                else
                                    value = new Short(ti.shortValue());
                            }
                            else
                            {
                                Short ts = Short.decode(hexStr);
                                if(ts.shortValue() > Byte.MAX_VALUE)
                                    value = new Byte((byte)(ts.shortValue() - Byte.MAX_VALUE));
                                else
                                    value = new Byte(ts.byteValue());
                            }
                            exp = new ConstantExpression(value);
                        }
        |
        oct:OCTAL_LITERAL { Object value;
                            String octalStr = oct.getText();
                            int length = octalStr.length();
                            if(length > 11) // 10 octal + leading "0"
                                value = Long.decode(octalStr);
                            else if(length > 6)
                                value = Integer.decode(octalStr);
                            else if(length > 3)
                                value = Short.decode(octalStr);
                            else
                                value = Byte.decode(octalStr);
                            exp = new ConstantExpression(value);
                        }
        |
/* TODO: allow larger precision than simply 32-bit integer. Long? BigInteger? */
/* TODO: How can we use a BigInteger to determine if the value fits into a certain type of primitive? Just make BigInteger objects out of Integer.MAX_VALUE, etc? */
        i:INT_LITERAL { exp = new ConstantExpression(new Integer(i.getText())); }
        |
        f:DECIMAL_LITERAL { exp = new ConstantExpression(new Double(f.getText())); }
        |
        s:STRING { exp = new ConstantExpression(s.getText()); }
        |
        LPAREN! exp=expr RPAREN!
    ;

class ExpressionLexerImpl extends Lexer;

options {
    k=2; // (2)needed for newline junk and relations like <, <= and >, >=
    charVocabulary = '\3'..'\377';
}

IDENTIFIER: WORDCHAR (WORDCHAR | DIGIT)*;
BOIDENTIFIER: '$' (WORDCHAR | DOT)*;
ARITHBOIDENTIFIER: '@' (WORDCHAR | DOT)*;

STRING
    :
        DOUBLEQUOTE!
        (CHAR_ESC | ~('\"' | '\\') )*
        DOUBLEQUOTE!
    ;

protected CHAR_ESC
    :
        '\\'
        ( 'n'  { $setText("\n"); }
        | 'r'  { $setText("\r"); }
        | 't'  { $setText("\t"); }
        | 'b'  { $setText("\b"); }
        | 'f'  { $setText("\f"); }
        | '\"' { $setText("\""); }
        | '\'' { $setText("\'"); }
        | '\\' { $setText("\\"); }
        )
    ;

NUMERIC_LITERAL:
        (ZERO (OCTAL_DIGIT)+) => OCTAL_LITERAL { $setType(OCTAL_LITERAL); }
        |
        (ZERO Xx) => HEX_LITERAL  { $setType(HEX_LITERAL); }
        |
        (DOT DIGITS) => DECIMAL_LITERAL { $setType(DECIMAL_LITERAL); }
        |
        (DIGITS DOT) => DECIMAL_LITERAL { $setType(DECIMAL_LITERAL); }
        |
        (DIGITS)    { $setType(INT_LITERAL); }
        ;

protected OCTAL_LITERAL: (ZERO (OCTAL_DIGIT)+) ;

protected OCTAL_DIGIT: '0'..'7' ;

protected HEX_LITERAL :  (ZERO Xx (HEX_DIGIT)+) ;

protected ZERO: '0' ;

protected Xx: ('x' | 'X') ;

protected HEX_DIGIT: ( 'a'..'z' | 'A'..'Z' | DIGIT ) ;

protected INT_LITERAL: DIGITS ;

protected DECIMAL_LITERAL: ( ( DIGITS )? DOT ( DIGITS )? ) ;

protected DIGITS : ( DIGIT )+ ;

protected SIGN: ( PLUS | MINUS ) ;

protected
WORDCHAR:   'a'..'z' | 'A'..'Z' | '_' ;

protected
DIGIT: '0'..'9';

protected
DOT: '.' ;

BANG: '!' ;

COMMA: ','
        ;

LBRACKET: '['
        ;

RBRACKET: ']'
        ;

LPAREN: '('
        ;

RPAREN: ')'
        ;

PLUS: '+'
        ;

MINUS: '-'
        ;

STAR: '*'
    ;

PERCENT: '%'
    ;

SLASH: '/'
    ;

AND: '&''&'
        ;

OR: '|''|'
        ;

EQUALS: '='
        ;

NOT_EQUALS
    :
        BANG EQUALS
    ;

GREATERTHAN: '>' ;

LESSTHAN: '<' ;

GREATERTHANEQUALTO: '>' '=' ;

LESSTHANEQUALTO: '<' '=' ;

SINGLEQUOTE: '\'' ;

DOUBLEQUOTE: '\"' ;

WS:
        (   ' '
        |   '\t'
        |   '\r' '\n' { newline(); }
        |   '\r'      { newline(); }
        |   '\n'      { newline(); }
        )
        {$setType(Token.SKIP);} //ignore this token
    ;
