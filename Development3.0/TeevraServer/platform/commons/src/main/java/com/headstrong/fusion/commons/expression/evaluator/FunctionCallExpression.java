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
 * $Id: FunctionCallExpression.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * Expression representing function call.
 */
public class FunctionCallExpression extends Expression {
	/**
	 * An expression which returns the function to call.
	 */
	private Expression functionExp;

	/**
	 * The name used to invoke this FunctionCallExpression, or
	 * <code>&lt;anonymous&gt;</code> if the function will be determined at
	 * evaluation-time.
	 */
	private String functionName;

	/**
	 * A List of argument expressions.
	 */
	private List<Expression> arguments;

	/**
	 * <p>
	 * Creates a new FunctionCallExpression where the function to call is
	 * determined at evaluation time.
	 * </p>
	 */
	public FunctionCallExpression(Expression functionExp,
			List<Expression> arguments) throws EvaluationException {
		if (null == functionExp)
			throw new IllegalArgumentException(
					"Function expression must not be null.");

		this.functionExp = functionExp;
		this.arguments = arguments;

		this.functionExp.setParent(this);

		if (null != arguments) {
			for (Expression exp : this.arguments) {
				if (null != exp)
					exp.setParent(this);
			}
		}

		if (this.functionExp instanceof IdentifierExpression) {
			this.functionName = (String) ((IdentifierExpression) this.functionExp)
					.getValue();
		} else {
			this.functionName = "<anonymous>";
		}
	}

	/**
	 * Returns the name of the function to be called by this
	 * FunctionCallExpression, or <code>&lt;anonymous&gt;</code> if the
	 * function will be determined at evaluation-time.
	 * 
	 * @return The name of the function to be called by this
	 *         FunctionCallExpression.
	 */
	public String getFunctionName() {
		return functionName;
	}

	/**
	 * Gets the expression which will evaluate to the function to be called by
	 * this FunctionCallExpression.
	 * 
	 * @return The expression which, when evaluated, will return the Function to
	 *         be called by this FunctionCallExpression.
	 */
	public Expression getFunctionExpression() {
		return functionExp;
	}

	/**
	 * Gets the list of argument expressions for this FunctionCallExpression.
	 * 
	 * @return A List of Expressions objects which are the arguments to this
	 *         FunctionCallExpression.
	 */
	@SuppressWarnings("unchecked")
	public List getArgumentExpressions() {
		return arguments;
	}

	@SuppressWarnings("unchecked")
	public List getSubExpressions() {
		ArrayList subs = new ArrayList(2 + (null == arguments ? 0 : arguments
				.size()));
		subs.add(this);
		subs.add(functionExp);

		if (null != arguments && 0 < arguments.size())
			for (Iterator i = arguments.iterator(); i.hasNext();)
				subs.addAll(((Expression) i.next()).getSubExpressions());

		return subs;
	}

	public void acceptVisitor(ExpressionVisitor visitor) {
		visitor.visitFunctionCallExpression(this);
	}

	/**
	 * Evaluates this Expression by evaluating all of the arguments'
	 * expressions, and then passing their resulting values to the function
	 * bound to this FunctionCallExpression's name.
	 * 
	 * @param ec
	 *            The context in which this function call should be evaluated.
	 * 
	 * @return The result of calling this FunctionVallExpression's function with
	 *         it's arguments.
	 * 
	 * @throws EvaluationException
	 *             If there is an error evaluating any of the argument
	 *             expressions or calling the function itself.
	 * @throws InvalidAttributeExpressionException 
	 */
	public Object evaluate(EvaluationContext ec) throws EvaluationException, InvalidAttributeExpressionException {
		Object func = this.functionExp.evaluate(ec);

		if (null == func) {
			throw new EvaluationException("No function found for '"
					+ functionExp + "'");
		} else if (func instanceof Function) {
			return ((Function) func).call(ec, functionName, arguments);
		} else {
			throw new EvaluationException("Invalid function: " + func);
		}
	}

	/**
	 * Returns a String representation of this FunctionCallExpression.
	 * 
	 * @return A String representation of this FunctionCallExpression.
	 */
	public String toString() {
		return functionName + "("
				+ (null == arguments ? "" : String.valueOf(arguments)) + ")";
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

		FunctionCallExpression that = (FunctionCallExpression) o;

		return (this.functionExp.equals(that.functionExp))
				&& (this.arguments == that.arguments || ((null == this.arguments) && this.arguments
						.equals(that.arguments)));
	}

	@SuppressWarnings("unchecked")
	public int hashCode() {
		int hashCode = super.hashCode(); // Just in case

		if (null != functionExp)
			hashCode = functionExp.hashCode();
		else if (null != functionName)
			hashCode = functionName.hashCode();

		if (null != arguments)
			for (Iterator i = arguments.iterator(); i.hasNext();)
				hashCode ^= i.next().hashCode();

		return hashCode;
	}
}
