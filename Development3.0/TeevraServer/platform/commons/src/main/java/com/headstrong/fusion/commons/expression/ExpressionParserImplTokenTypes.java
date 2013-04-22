// $ANTLR 2.7.7 (2006-11-01): "E:/Projects/eclipse workspaces/testing/antrlJava/src/com/antlr/expression.g" -> "ExpressionParserImpl.java"$

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

public interface ExpressionParserImplTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int AND = 4;
	int OR = 5;
	int EQUALS = 6;
	int NOT_EQUALS = 7;
	int GREATERTHAN = 8;
	int LESSTHAN = 9;
	int GREATERTHANEQUALTO = 10;
	int LESSTHANEQUALTO = 11;
	int PLUS = 12;
	int MINUS = 13;
	int STAR = 14;
	int SLASH = 15;
	int PERCENT = 16;
	int LPAREN = 17;
	int RPAREN = 18;
	int LBRACKET = 19;
	int RBRACKET = 20;
	int COMMA = 21;
	int IDENTIFIER = 22;
	int BOIDENTIFIER = 23;
	int ARITHBOIDENTIFIER = 24;
	int HEX_LITERAL = 25;
	int OCTAL_LITERAL = 26;
	int INT_LITERAL = 27;
	int DECIMAL_LITERAL = 28;
	int STRING = 29;
	int CHAR_ESC = 30;
	int NUMERIC_LITERAL = 31;
	int OCTAL_DIGIT = 32;
	int ZERO = 33;
	int Xx = 34;
	int HEX_DIGIT = 35;
	int DIGITS = 36;
	int SIGN = 37;
	int WORDCHAR = 38;
	int DIGIT = 39;
	int DOT = 40;
	int BANG = 41;
	int SINGLEQUOTE = 42;
	int DOUBLEQUOTE = 43;
	int WS = 44;
}
