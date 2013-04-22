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
 * $Id: BinaryOperatorExpression.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * <p>
 * An expression to describe expressions with binary operators.
 * </p>
 * 
 * <p>
 * The operators supported are limited only by the parser's ability to recognize
 * the operator as a binary (probably mathematical) expression, and the
 * availability of a function which matches the operator.
 * </p>
 */
public class BinaryOperatorExpression extends Expression {
	/**
	 * The left-hand operand of this binary expression.
	 */
	private Expression left;

	/**
	 * The operator operating on the left- and right-hand expressions.
	 */
	private String operator;

	/**
	 * The right-hand operand of this binary expression.
	 */
	private Expression right;

	/**
	 * The argument expressions for this BinaryOperatorExpression.
	 */
	private List argumentExpressions;

	/**
	 * Creates a new BinaryOperatorExpression with the specified sub expressions
	 * and operator.
	 * 
	 * @param left
	 *            The left-hand operand of this binary expresssion.
	 * @param operator
	 *            The operator to be used (i.e. "+", "-", "&&", etc.)
	 * @param right
	 *            The right-hand operand of this binary expresssion.
	 * 
	 * @throws IllegalArgumentException
	 *             If either of the sub-expressions are <code>null</code>, or
	 *             the operator is not recognized.
	 */
	@SuppressWarnings("unchecked")
	public BinaryOperatorExpression(Expression left, String operator,
			Expression right) throws EvaluationException {
		if (null == left) {
			throw new IllegalArgumentException(
					"Left-hand side of a BinaryOperatorExpression must not be null.");
		}
		if (null == right) {
			throw new IllegalArgumentException(
					"Right-hand side of a BinaryOperatorExpression must not be null.");
		}
		if (null == operator) {
			throw new IllegalArgumentException("Operator must not be null.");
		}

		this.left = left;
		this.operator = operator;
		this.right = right;

		left.setParent(this);
		right.setParent(this);

		this.argumentExpressions = new ArrayList(2);
		this.argumentExpressions.add(left);
		this.argumentExpressions.add(right);

		this.argumentExpressions = Collections
				.unmodifiableList(this.argumentExpressions);
	}

	/**
	 * Gets the expression which is the left-hand operand of this binary
	 * operator.
	 * 
	 * @return The expression which is the left-hand operand of this binary
	 *         operator.
	 */
	public Expression getLeftExpression() {
		return left;
	}

	/**
	 * <p>
	 * Gets the operator for this BinaryOperatorExpression.
	 * </p>
	 * 
	 * <p>
	 * Note that the operator is nothing magic: it's just the name of a function
	 * that will be looked-up in the EvaluationContext to determine which
	 * function to invoke on the two arguments.
	 * </p>
	 * 
	 * @return The operator for this BinaryOperatorExpression.
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * Gets the expression which is the right-hand operand of this binary
	 * operator.
	 * 
	 * @return The expression which is the right-hand operand of this binary
	 *         operator.
	 */
	public Expression getRightExpression() {
		return right;
	}

	/**
	 * Returns a List containing both sides of this binary
	 * BinaryOperatorExpression.
	 * 
	 * @return A List containing both sides of this binary
	 *         BinaryOperatorExpression.
	 */
	@SuppressWarnings("unchecked")
	public List getSubExpressions() {
		ArrayList subs = new ArrayList(3);

		subs.addAll(left.getSubExpressions());
		subs.add(this);
		subs.addAll(right.getSubExpressions());

		return subs;
	}

	public void acceptVisitor(ExpressionVisitor visitor) {
		visitor.visitBinaryOperatorExpression(this);
	}

	/**
	 * Evaluates this Expression by returning the appropriate combination of the
	 * left and right-hand sub expressions with the operator.
	 * 
	 * Mathmatical operators return the same type as their inputs (i.e.
	 * {@link Integer}s). Logical and relational operators return objects of
	 * type {@link Boolean}.
	 * 
	 * @param ec
	 *            The EvaluationContext in which this expression should be
	 *            evaluated.
	 * 
	 * @return The value of this BinaryOperatorExpression.
	 * 
	 * @throws EvaluationException
	 *             If there is a problem performing the mathematical operation
	 *             (which is a function).
	 * @throws InvalidAttributeExpressionException 
	 */
	public Object evaluate(EvaluationContext ec) throws EvaluationException, InvalidAttributeExpressionException {
		Object func = ec.get(this.operator);
		if (null == func) {
			throw new EvaluationException(
					"Can't find function implementation for " + operator);
		} else if (func instanceof Function) {
			return ((Function) func).call(ec, operator, argumentExpressions);
		} else {
			throw new EvaluationException(
					"Function reference is not a function. It is "
							+ func.getClass().getName() + ", instead.");
		}
	}

	/**
	 * Returns an infix String representation of this BinaryOperatorExpression.
	 * 
	 * @return An infix String representation of this BinaryOperatorExpression.
	 */
	public String toString() {
		return "( " + left + " " + operator + " " + right + " )";
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
		if (this == o) {
			return true;
		}

		if ((null == o) || (!this.getClass().equals(o.getClass()))) {
			return false;
		}

		BinaryOperatorExpression that = (BinaryOperatorExpression) o;

		return ((this.operator.equals(that.operator))
				&& this.left.equals(that.left) && this.right.equals(that.right));
	}

	public int hashCode() {
		return left.hashCode() ^ right.hashCode();
	}
}
