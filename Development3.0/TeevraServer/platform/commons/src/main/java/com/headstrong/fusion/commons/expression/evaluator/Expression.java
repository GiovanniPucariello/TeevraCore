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
 * $Id: Expression.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * An evaluatable Expression.
 * 
 * To obtain an Expression, you should use the ExpressionParser class:
 * 
 * <pre>
 * Expression exp = ExpressionParser.parseExpression(&quot;1 + 2 + 3 * 5&quot;);
 * </pre>
 * 
 * This expression can later be evaluated:
 * 
 * <pre>
 * EvaluationContext ctx = ...;
 * Object result = exp.evaluate(ctx);
 * </pre>
 * 
 * The expression in the example will return an Integer result.
 */
public abstract class Expression {
	/**
	 * Evaluates this expression and returns the result.
	 * 
	 * @param ec
	 *            The context in which this expression should be evaluated.
	 * 
	 * @return The result of evaluating this Expression. This may by an object
	 *         of any type, including <code>null</code>.
	 * 
	 * @throws EvaluationException
	 *             If there is an error evaluating this Expression.
	 * @throws InvalidAttributeExpressionException 
	 */
	public abstract Object evaluate(EvaluationContext ec)
			throws EvaluationException, InvalidAttributeExpressionException;

	/**
	 * Gets a flattened, depth-first traversal of the expressions in this
	 * Expression (including this Expression).
	 * 
	 * @return A List of sub-expressions for this Expression.
	 */
	public abstract List<Expression> getSubExpressions();

	/**
	 * Accepts an ExpressionVisitor.
	 */
	public abstract void acceptVisitor(ExpressionVisitor visitor);

	protected void setParent(Expression parent) throws EvaluationException {
		if (null == parent) {
			throw new IllegalArgumentException("Parent must not be null.");
		}
		if (null != this.parent) {
			throw new EvaluationException("Expression already has a parent.");
		}
		this.parent = parent;
	}

	private Expression parent;

	public Expression getParent() {
		return this.parent;
	}
}
