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

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

public class ExpressionParserImpl extends antlr.LLkParser       implements ExpressionParserImplTokenTypes
 {

protected ExpressionParserImpl(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public ExpressionParserImpl(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected ExpressionParserImpl(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public ExpressionParserImpl(TokenStream lexer) {
  this(lexer,1);
}

public ExpressionParserImpl(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final Expression  expression() throws RecognitionException, TokenStreamException, EvaluationException {
		Expression exp = null;
		
		
		exp=expr();
		{
		match(Token.EOF_TYPE);
		}
		return exp;
	}
	
	public final Expression  expr() throws RecognitionException, TokenStreamException, EvaluationException {
		Expression exp = null;
		
		
		Expression right;
		
		
		exp=relexpr();
		{
		_loop7:
		do {
			switch ( LA(1)) {
			case AND:
			{
				{
				match(AND);
				right=relexpr();
				}
				exp = new BinaryOperatorExpression(exp, "&&", right);
				break;
			}
			case OR:
			{
				{
				match(OR);
				right=relexpr();
				}
				exp = new BinaryOperatorExpression(exp, "||", right);
				break;
			}
			default:
			{
				break _loop7;
			}
			}
		} while (true);
		}
		return exp;
	}
	
	public final Expression  relexpr() throws RecognitionException, TokenStreamException, EvaluationException {
		Expression exp = null;
		
		
		Expression right;
		
		
		exp=addexpr();
		{
		_loop16:
		do {
			switch ( LA(1)) {
			case EQUALS:
			{
				{
				match(EQUALS);
				right=addexpr();
				}
				exp = new BinaryOperatorExpression(exp, "=", right);
				break;
			}
			case NOT_EQUALS:
			{
				{
				match(NOT_EQUALS);
				right=addexpr();
				}
				exp = new BinaryOperatorExpression(exp, "!=", right);
				break;
			}
			case GREATERTHAN:
			{
				{
				match(GREATERTHAN);
				right=addexpr();
				}
				exp = new BinaryOperatorExpression(exp, ">", right);
				break;
			}
			case LESSTHAN:
			{
				{
				match(LESSTHAN);
				right=addexpr();
				}
				exp = new BinaryOperatorExpression(exp, "<", right);
				break;
			}
			case GREATERTHANEQUALTO:
			{
				{
				match(GREATERTHANEQUALTO);
				right=addexpr();
				}
				exp = new BinaryOperatorExpression(exp, ">=", right);
				break;
			}
			case LESSTHANEQUALTO:
			{
				{
				match(LESSTHANEQUALTO);
				right=addexpr();
				}
				exp = new BinaryOperatorExpression(exp, "<=", right);
				break;
			}
			default:
			{
				break _loop16;
			}
			}
		} while (true);
		}
		return exp;
	}
	
	public final Expression  addexpr() throws RecognitionException, TokenStreamException, EvaluationException {
		Expression exp = null;
		
		
		Expression right;
		
		
		exp=multexpr();
		{
		_loop20:
		do {
			if ((LA(1)==PLUS||LA(1)==MINUS)) {
				{
				switch ( LA(1)) {
				case PLUS:
				{
					match(PLUS);
					right=multexpr();
					exp = new BinaryOperatorExpression(exp, "+", right);
					break;
				}
				case MINUS:
				{
					match(MINUS);
					right=multexpr();
					exp = new BinaryOperatorExpression(exp, "-", right);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
			}
			else {
				break _loop20;
			}
			
		} while (true);
		}
		return exp;
	}
	
	public final Expression  multexpr() throws RecognitionException, TokenStreamException, EvaluationException {
		Expression exp = null;
		
		
		Expression right;
		
		
		exp=unaryExpr();
		{
		_loop26:
		do {
			switch ( LA(1)) {
			case STAR:
			{
				{
				match(STAR);
				right=unaryExpr();
				exp = new BinaryOperatorExpression(exp, "*", right);
				}
				break;
			}
			case SLASH:
			{
				{
				match(SLASH);
				right=unaryExpr();
				exp = new BinaryOperatorExpression(exp, "/", right);
				}
				break;
			}
			case PERCENT:
			{
				{
				match(PERCENT);
				right=unaryExpr();
				exp = new BinaryOperatorExpression(exp, "%", right);
				}
				break;
			}
			default:
			{
				break _loop26;
			}
			}
		} while (true);
		}
		return exp;
	}
	
	public final Expression  unaryExpr() throws RecognitionException, TokenStreamException, EvaluationException {
		 Expression exp = null ;
		
		
		{
		{
		switch ( LA(1)) {
		case PLUS:
		{
			match(PLUS);
			break;
		}
		case LPAREN:
		case IDENTIFIER:
		case BOIDENTIFIER:
		case ARITHBOIDENTIFIER:
		case HEX_LITERAL:
		case OCTAL_LITERAL:
		case INT_LITERAL:
		case DECIMAL_LITERAL:
		case STRING:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		exp=atom();
		}
		return exp;
	}
	
	public final Expression  atom() throws RecognitionException, TokenStreamException, EvaluationException {
		Expression exp = null;
		
		Token  hex = null;
		Token  oct = null;
		Token  i = null;
		Token  f = null;
		Token  s = null;
		
		Expression index;
		java.util.List args;
		
		
		switch ( LA(1)) {
		case ARITHBOIDENTIFIER:
		{
			exp=arithBoIdentifier();
			{
			}
			break;
		}
		case BOIDENTIFIER:
		{
			exp=boIdentifier();
			{
			}
			break;
		}
		case IDENTIFIER:
		{
			exp=identifier();
			{
			_loop45:
			do {
				switch ( LA(1)) {
				case LPAREN:
				{
					args=functionsuffix();
					exp=new FunctionCallExpression(exp, args);
					break;
				}
				case LBRACKET:
				{
					index=arraysuffix();
					exp=new ArrayReferenceExpression(exp, index);
					break;
				}
				default:
				{
					break _loop45;
				}
				}
			} while (true);
			}
			break;
		}
		case HEX_LITERAL:
		{
			hex = LT(1);
			match(HEX_LITERAL);
			Object value;
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
			
			break;
		}
		case OCTAL_LITERAL:
		{
			oct = LT(1);
			match(OCTAL_LITERAL);
			Object value;
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
			
			break;
		}
		case INT_LITERAL:
		{
			i = LT(1);
			match(INT_LITERAL);
			exp = new ConstantExpression(new Integer(i.getText()));
			break;
		}
		case DECIMAL_LITERAL:
		{
			f = LT(1);
			match(DECIMAL_LITERAL);
			exp = new ConstantExpression(new Double(f.getText()));
			break;
		}
		case STRING:
		{
			s = LT(1);
			match(STRING);
			exp = new ConstantExpression(s.getText());
			break;
		}
		case LPAREN:
		{
			match(LPAREN);
			exp=expr();
			match(RPAREN);
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		return exp;
	}
	
	public final java.util.List  functionsuffix() throws RecognitionException, TokenStreamException, EvaluationException {
		 java.util.List args = null ;
		
		
		match(LPAREN);
		{
		switch ( LA(1)) {
		case PLUS:
		case LPAREN:
		case IDENTIFIER:
		case BOIDENTIFIER:
		case ARITHBOIDENTIFIER:
		case HEX_LITERAL:
		case OCTAL_LITERAL:
		case INT_LITERAL:
		case DECIMAL_LITERAL:
		case STRING:
		{
			args=argumentlist();
			break;
		}
		case RPAREN:
		{
			break;
		}
		default:
		{
			throw new NoViableAltException(LT(1), getFilename());
		}
		}
		}
		match(RPAREN);
		return args;
	}
	
	public final java.util.List  argumentlist() throws RecognitionException, TokenStreamException, EvaluationException {
		java.util.List list = new java.util.ArrayList();
		
		
		Expression arg;
		
		
		arg=argument();
		if(null != arg) { list.add(arg); }
		{
		_loop36:
		do {
			if ((LA(1)==COMMA)) {
				match(COMMA);
				arg=argument();
				if(null != arg) { list.add(arg); }
			}
			else {
				break _loop36;
			}
			
		} while (true);
		}
		return list;
	}
	
	public final Expression  arraysuffix() throws RecognitionException, TokenStreamException, EvaluationException {
		 Expression index = null ;
		
		
		match(LBRACKET);
		{
		index=expr();
		}
		match(RBRACKET);
		return index;
	}
	
	public final Expression  argument() throws RecognitionException, TokenStreamException, EvaluationException {
		Expression exp = null;
		
		
		exp=expr();
		return exp;
	}
	
	public final Expression  identifier() throws RecognitionException, TokenStreamException, EvaluationException {
		 Expression exp = null ;
		
		Token  id = null;
		
		id = LT(1);
		match(IDENTIFIER);
		
		exp = new IdentifierExpression(id.getText());
		
		return exp;
	}
	
	public final Expression  boIdentifier() throws RecognitionException, TokenStreamException, EvaluationException {
		 Expression exp = null ;
		
		Token  id = null;
		
		id = LT(1);
		match(BOIDENTIFIER);
		
		exp = new BusinessObjectExpression(id.getText());
		
		return exp;
	}
	
	public final Expression  arithBoIdentifier() throws RecognitionException, TokenStreamException, EvaluationException {
		 Expression exp = null ;
		
		Token  id = null;
		
		id = LT(1);
		match(ARITHBOIDENTIFIER);
		
		exp = new ArithBusinessObjectExpression(id.getText());
		
		return exp;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"AND",
		"OR",
		"EQUALS",
		"NOT_EQUALS",
		"GREATERTHAN",
		"LESSTHAN",
		"GREATERTHANEQUALTO",
		"LESSTHANEQUALTO",
		"PLUS",
		"MINUS",
		"STAR",
		"SLASH",
		"PERCENT",
		"LPAREN",
		"RPAREN",
		"LBRACKET",
		"RBRACKET",
		"COMMA",
		"IDENTIFIER",
		"BOIDENTIFIER",
		"ARITHBOIDENTIFIER",
		"HEX_LITERAL",
		"OCTAL_LITERAL",
		"INT_LITERAL",
		"DECIMAL_LITERAL",
		"STRING",
		"CHAR_ESC",
		"NUMERIC_LITERAL",
		"OCTAL_DIGIT",
		"ZERO",
		"Xx",
		"HEX_DIGIT",
		"DIGITS",
		"SIGN",
		"WORDCHAR",
		"DIGIT",
		"DOT",
		"BANG",
		"SINGLEQUOTE",
		"DOUBLEQUOTE",
		"WS"
	};
	
	
	}
