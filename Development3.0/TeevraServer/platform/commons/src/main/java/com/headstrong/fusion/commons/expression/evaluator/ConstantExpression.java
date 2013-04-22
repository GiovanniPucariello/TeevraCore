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
 * $Id: ConstantExpression.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

import java.util.Collections;
import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * An Expression which represents a fixed value (a constant).
 */
public class ConstantExpression extends Expression {
	/**
	 * The value of this ConstantExpression.
	 */
	private Object value;

	/**
	 * Creates a new ConstantExpression with the given value.
	 * 
	 * @param value
	 *            The value of the new ConstantExpressions.
	 * 
	 * @throws IllegalArgumentException
	 *             If the value is <code>null</code>.
	 */
	public ConstantExpression(Object value) {
		if (null == value) {
			throw new IllegalArgumentException("Constant must not be null.");
		}
		this.value = value;
	}

	/**
	 * Evaluates this Expression by returning its constant value.
	 * 
	 * @param ec
	 *            The EvaluationContext in which this expression should be
	 *            evaluated.
	 * 
	 * @return The value of this constant Expression.
	 * @throws InvalidAttributeExpressionException 
	 */
	public Object evaluate(EvaluationContext ec) throws EvaluationException, InvalidAttributeExpressionException {
		return this.value;
	}

	/**
	 * Returns a list containing a single element: this ConstantExpression.
	 * 
	 * @return An immutable list containing this ConstantExpression.
	 */
	public List getSubExpressions() {
		return Collections.singletonList(this);
	}

	/**
	 * Gets the value of this constant Expression.
	 * 
	 * @return The value of this constant Expression.
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * Returns the hash code for this ConstantExpression.
	 * 
	 * The hash code of the ConstantExpression is equal to the hash code of the
	 * value of this ConstantExpression.
	 * 
	 * @return The hash code for this ConstantExpression.
	 */
	public int hashCode() {
		return value.hashCode();
	}

	/**
	 * Returns a String representation of this Expression.
	 * 
	 * @return A String representation of this Expression.
	 */
	public String toString() {
		return "Constant "
				+ (null == value ? "<null>" : "<" + value.getClass().getName()
						+ ">" + String.valueOf(value));
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
				|| ((null != o) && (this.getClass().equals(o.getClass())) && (value
						.equals(((ConstantExpression) o).value)));
	}

	public void acceptVisitor(ExpressionVisitor visitor) {
		visitor.visitConstantExpression(this);
	}
}
