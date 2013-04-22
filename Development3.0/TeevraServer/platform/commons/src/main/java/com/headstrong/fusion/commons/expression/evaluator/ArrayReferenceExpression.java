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
 * $Id: ArrayReferenceExpression.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * An expression describing an array reference.
 */
public class ArrayReferenceExpression extends Expression {
	/**
	 * The name of the array, or <code>&lt;anonymous&gt;</code> if the array
	 * will be determined at evaluation-time.
	 */
	private String arrayName;

	/**
	 * The expression that will evaluate to the array to be indexed.
	 */
	private Expression arrayExp;

	/**
	 * The expression that identifies the index into the array.
	 */
	private Expression indexExp;

	/**
	 * Creates a new ArrayReferenceExpression from the specified array and index
	 * expressions.
	 * 
	 * @param arrayExp
	 *            The expression that will evaluate to the array to index.
	 * @param indexExp
	 *            The expression that will evaluate to the index of the array.
	 */
	public ArrayReferenceExpression(Expression arrayExp, Expression indexExp) {
		if (null == arrayExp)
			throw new IllegalArgumentException("Array must not be null.");
		if (null == indexExp)
			throw new IllegalArgumentException("Index must not be null.");

		this.arrayExp = arrayExp;
		this.indexExp = indexExp;

		if (arrayExp instanceof IdentifierExpression) {
			this.arrayName = (String) ((IdentifierExpression) arrayExp)

			.getValue();
		} else {
			this.arrayName = "<anonymous>";
		}
	}

	public void acceptVisitor(ExpressionVisitor visitor) {
		visitor.visitArrayReferenceExpression(this);
	}

	/**
	 * Evaluates this Expression by evaluating the expression used for the array
	 * index, and then returning the element of the array at that location.
	 * 
	 * @param ec
	 *            The context in which this function call should be evaluated.
	 * 
	 * @return The element in the array at the location specified by the index.
	 * 
	 * @throws EvaluationException
	 *             If there is an error evaluating the index expression or
	 *             locating the array element.
	 * @throws InvalidAttributeExpressionException 
	 */
	public Object evaluate(EvaluationContext ec) throws EvaluationException, InvalidAttributeExpressionException {
		Object array = this.arrayExp.evaluate(ec);

		if (null == array) {
			return null; // TODO: ?
		}
		// TODO: Allow Lists and other collections?
		else if (!array.getClass().isArray()) {
			throw new EvaluationException("Array reference '" + arrayExp
					+ "' is not an array (it is" + array.getClass()
					+ "instead)");
		}

		Object indexValue = this.indexExp.evaluate(ec);
		if (null == indexValue) {
			return null; // TODO: ?
		}

		// TODO: accept LONG values within range?
		if (!(indexValue instanceof Integer)) {
			throw new EvaluationException("Array index must be an int (it is "
					+ indexValue.getClass() + " instead)");
		}

		Object value = Array.get(array, ((Integer) indexValue).intValue());
		// Evaluate the object if it's an expression
		if (value instanceof Expression) {
			value = ((Expression) value).evaluate(ec);
		}
		return value;
	}

	/**
	 * Gets the expression that will evaluate to an array.
	 */
	public Expression getArrayExpression() {
		return arrayExp;
	}

	/**
	 * Gets the expression that will evaluate to an index into the array.
	 */
	public Expression getIndexExpression() {
		return indexExp;
	}

	/**
	 * Gets the name of the array, or <code>&lt;anonymous&gt;</code> if the
	 * array will be determined at runtime.
	 */
	public String getArrayName() {
		return arrayName;
	}

	@SuppressWarnings("unchecked")
	public List getSubExpressions() {
		ArrayList subs = new ArrayList(2);
		subs.add(this.arrayExp);
		subs.add(this.indexExp);

		return subs;
	}

	public String toString() {
		return arrayName + "[ " + indexExp + " ]";
	}
}
