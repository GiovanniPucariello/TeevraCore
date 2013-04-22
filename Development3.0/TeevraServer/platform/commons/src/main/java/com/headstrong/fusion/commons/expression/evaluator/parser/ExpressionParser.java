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
 * $Id: ExpressionParser.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.parser;

import java.io.StringReader;

import com.headstrong.fusion.commons.expression.ExpressionLexerImpl;
import com.headstrong.fusion.commons.expression.ExpressionParserImpl;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.Expression;

/**
 * A parser to convert string expressions into Expression objects for subsequent
 * evaluation.
 */
public class ExpressionParser {
	/**
	 * Creates a new ExpressionParser.
	 */
	public ExpressionParser() {
		super();
	}

	/**
	 * Parses the given string expression into a tree of evaluatable Expression
	 * objects.
	 * 
	 * @param expression
	 *            The string expression to parse.
	 * 
	 * @return An Expression object which is the root of an expression
	 *         evaluation tree.
	 * 
	 * @throws ParseException
	 *             If the expression was not parsable.
	 */
	public Expression parse(String expression) throws ParseException {
		try {
			ExpressionLexerImpl lexer = new ExpressionLexerImpl(
					new StringReader(expression));
			ExpressionParserImpl parser = new ExpressionParserImpl(lexer);
			return (parser.expression());
		} catch (antlr.RecognitionException re) {
			throw new ParseException("Invalid expression: " + expression, re);
		} catch (antlr.TokenStreamException tse) {
			throw new ParseException("Invalid expression: " + expression, tse);
		} catch (EvaluationException ee) {
			throw new ParseException("Internal expression error??", ee);
		}
	}

	/**
	 * A convenience method to create a new ExpressionParser and return an
	 * Expression object for that expression.
	 * 
	 * @param expression
	 *            The string expression to parse.
	 * 
	 * @return An Expression object which is the root of an expression
	 *         evaluation tree.
	 * 
	 * @throws ParseException
	 *             If the expression was not parsable.
	 */
	public static Expression parseExpression(String expression)
			throws ParseException {
		return new ExpressionParser().parse(expression);
	}
}
