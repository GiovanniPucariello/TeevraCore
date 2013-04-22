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
 * $Id: UnaryMinusExpression.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

import java.util.ArrayList;
import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * 
 */
public class UnaryMinusExpression extends Expression {
	/**
	 * The expression whose result should be sign-inverted.
	 */
	private Expression sub;

	/**
	 * Creates a new UnaryMinusExpression with the given sub-expression.
	 * 
	 * @param subExpression
	 *            The expression whose result will be sign inverted when
	 *            evaluated.
	 * 
	 * @throws IllegalArgumentException
	 *             If the sub expression is null.
	 */
	public UnaryMinusExpression(Expression subExpression)
			throws EvaluationException {
		if (null == subExpression)
			throw new IllegalArgumentException(
					"Sub-expression of a negation must not be null.");

		// TODO: Put in an optimization to eliminate superfluous multiple
		// TODO: UnaryMinusExpressions ??

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
	 * @return The value of this UnaryMinusExpression.
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
		} else if (subValue instanceof Integer) {
			return new Integer(-((Integer) subValue).intValue());
		} else if (subValue instanceof Double) {
			return new Double(-((Double) subValue).doubleValue());
		} else if (subValue instanceof Long) {
			return new Long(-((Long) subValue).longValue());
		} else if (subValue instanceof Float) {
			return new Float(-((Float) subValue).floatValue());
		} else if (subValue instanceof Short) {
			return new Short((short) -((Short) subValue).shortValue());
		} else if (subValue instanceof Byte) {
			return new Byte((byte) -((Byte) subValue).byteValue());
		} else {
			throw new EvaluationException("Illegal numeric value: " + subValue);
		}
	}

	/**
	 * Gets the Expression which is being sign inverted by this one.
	 * 
	 * @return The Expression which is being sign inverted by this one.
	 */
	public Expression getSubExpression() {
		return sub;
	}

	/**
	 * Returns a list containing this UnaryMinusExpression and the expression to
	 * be sign inverted (in that order).
	 * 
	 * @return A list containing this UnaryMinusExpression and the expression to
	 *         be sign inverted (in that order).
	 */
	@SuppressWarnings("unchecked")
	public List getSubExpressions() {
		ArrayList subs = new ArrayList(2);
		subs.add(this);
		subs.addAll(sub.getSubExpressions());

		return subs;
	}

	public void acceptVisitor(ExpressionVisitor visitor) {
		visitor.visitUnaryMinusExpression(this);
	}

	/**
	 * Returns the hash code for this UnaryMinusExpression.
	 * 
	 * The hash code of the UnaryMinusExpression is equal to the hash code of
	 * the value of this UnaryMinusExpression.
	 * 
	 * @return The hash code for this UnaryMinusExpression.
	 */
	public int hashCode() {
		return -(sub.hashCode());
	}

	/**
	 * Returns a String representation of this UnaryMinusExpression.
	 * 
	 * @return A String representation of this UnaryMinusExpression.
	 */
	public String toString() {
		return "-(" + sub + ")";
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
						.equals(((UnaryMinusExpression) o).sub)));
	}
}
