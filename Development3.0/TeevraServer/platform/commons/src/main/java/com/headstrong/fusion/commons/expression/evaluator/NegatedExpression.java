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
 * $Id: NegatedExpression.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

import java.util.ArrayList;
import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * An Expression to perform a logical negation (i.e. NOT) of a sub-expression.
 */
public class NegatedExpression extends Expression {
	/**
	 * The expression whose result should be logically negated.
	 */
	private Expression sub;

	/**
	 * Creates a new NegatedExpression with the given sub-expression.
	 * 
	 * @param subExpression
	 *            The expression whose result will be logically negated when
	 *            evaluated.
	 * 
	 * @throws IllegalArgumentException
	 *             If the sub expression is null.
	 */
	public NegatedExpression(Expression subExpression)
			throws EvaluationException {
		if (null == subExpression)
			throw new IllegalArgumentException(
					"Sub-expression of a negation must not be null.");

		// TODO: Put in an optimization to eliminate superfluous multiple
		// TODO: NegatedExpressions ??

		this.sub = subExpression;
		this.sub.setParent(this);
	}

	/**
	 * Evaluates this Expression by returning the logical negation of the
	 * sub-expression.
	 * 
	 * @param ec
	 *            The EvaluationContext in which this expression should be
	 *            evaluated.
	 * 
	 * @return The value of this NegatedExpression.
	 * 
	 * @throws EvaluationException
	 *             If the sub-expression fails evaluation, or does not return a
	 *             Boolean value.
	 * @throws InvalidAttributeExpressionException 
	 */
	public Object evaluate(EvaluationContext ec) throws EvaluationException, InvalidAttributeExpressionException {
		Object subValue = this.sub.evaluate(ec);

		if (null == subValue) {
			return null;
		} else if (subValue instanceof Boolean) {
			return ((Boolean) subValue).booleanValue() ? Boolean.FALSE
					: Boolean.TRUE;
		} else {
			throw new EvaluationException("Illegal boolean value: " + subValue);
		}
	}

	/**
	 * Gets the Expression which is being negated by this one.
	 * 
	 * @return The Expression which is being negated by this one.
	 */
	public Expression getSubExpression() {
		return sub;
	}

	/**
	 * Returns a list containing this NegatedExpression and the expression to be
	 * negated (in that order).
	 * 
	 * @return A list containing this NegatedExpression and the expression to be
	 *         negated (in that order).
	 */
	@SuppressWarnings("unchecked")
	public List getSubExpressions() {
		ArrayList subs = new ArrayList(2);
		subs.add(this);
		subs.addAll(sub.getSubExpressions());

		return subs;
	}

	public void acceptVisitor(ExpressionVisitor visitor) {
		visitor.visitNegatedExpression(this);
	}

	/**
	 * Returns the hash code for this NegatedExpression.
	 * 
	 * The hash code of the NegatedExpression is equal to the hash code of the
	 * value of this NegatedExpression.
	 * 
	 * @return The hash code for this NegatedExpression.
	 */
	public int hashCode() {
		return -(sub.hashCode());
	}

	/**
	 * Returns a String representation of this NegatedExpression.
	 * 
	 * @return A String representation of this NegatedExpression.
	 */
	public String toString() {
		return "!(" + sub + ")";
	}

	/**
	 * Returns <code>true</code> if the specified object is equal to this one.
	 * 
	 * @param o
	 *            The object to test for equality.
	 * 
	 * @return <code>true</code> if the specified object is equal to this one,
	 *         <code>false</code> otherwise.
	 */
	public boolean equals(Object o) {
		return (this == o)
				|| ((null != o) && (this.getClass().equals(o.getClass())) && (sub
						.equals(((NegatedExpression) o).sub)));
	}
}
