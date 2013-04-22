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
 * $Id: StandardFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

import java.util.Iterator;
import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * <p>
 * Implements a Function with standard arugment evaluation semantics.
 * </p>
 * 
 * <p>
 * In most programming languages and expression evaluators, all arguments are
 * evaluated before the call is actually made to the function in question. In
 * {@link FunctionCallExpression}, the expressions themselves are passed to the
 * function, leaving those semantics up to the implementing function.
 * </p>
 * 
 * <p>
 * Given that most functions will want their argument expressions evaluated
 * prior to function invocation, this class has been written to provide that
 * service, free of charge.
 * </p>
 * 
 * <p>
 * Simply implement the {@link #call(EvaluationContext,String,Object[])} method
 * and register your function with FunctionCallExpression, and you won't have to
 * worry about evaluating your own argument expressions.
 * </p>
 * 
 * <p>
 * If this all seems very silly, you are probably right. However, I have decided
 * to implement mathematical operators as functions, including the logical
 * operators. In order to implement short-circuit boolean evaluation as a
 * function, the ability for a function to evaluate its own arguments allows a
 * function to short-circuit its own argument evaluation.
 * </p>
 */
public abstract class StandardFunction implements Function {
	/**
	 * Creates a new StandardFunction.
	 */
	protected StandardFunction() {
		super();
	}

	/**
	 * <p>
	 * Invokes the function with the specified argument expressions in the
	 * specified evaluation context.
	 * </p>
	 * 
	 * <p>
	 * This function implementation evaluates all argument expressions and then
	 * invokes the {@link #call(EvaluationContext,String,Object[])} method.
	 * </p>
	 * 
	 * @param ec
	 *            The EvaluationContext in which this function is being called.
	 * @param functionName
	 *            The name of the function being invoked.
	 * @param argumentExpressions
	 *            The expressions which, when evaluated, result in the arguments
	 *            to the function.
	 * 
	 * @return The result of the function.
	 * 
	 * @throws EvaluationException
	 *             If there is a problem evaluating any of the arguments'
	 *             expressions, or if there is an error during function
	 *             execution.
	 * @throws InvalidAttributeExpressionException 
	 */
	public final Object call(EvaluationContext ec, String functionName,
			List argumentExpressions) throws EvaluationException, InvalidAttributeExpressionException {
		return this.call(ec, functionName, getExpressionValueArray(ec,
				argumentExpressions));
	}

	/**
	 * Calls this function with standard argument evaluation semantics.
	 * 
	 * @param ec
	 *            The EvaluationContext in which this function is being called.
	 * @param functionName
	 *            The name of the function being invoked.
	 * @param arguments
	 *            The argument values to pass to this function.
	 * 
	 * @return The result of the function.
	 * 
	 * @throws EvaluationException
	 *             If there is an error during function execution.
	 */
	public abstract Object call(EvaluationContext ec, String functionName,
			Object[] arguments) throws EvaluationException,InvalidAttributeExpressionException;

	/**
	 * Evaluates the specified list of expressions and returns the results in an
	 * array.
	 * 
	 * Note that non-expression elements in the list will silently be
	 * passed-through to the array.
	 * 
	 * @param ec
	 *            The context in which the expressions should be evaluated.
	 * @param expressions
	 *            A List of Expressions which should be evaluated.
	 * 
	 * @return An array of values representing the return values of each
	 *         expression in <code>expressions</code>, or <code>null</code>
	 *         if there are no expressions in the <code>expressions</code>
	 *         list.
	 * 
	 * @throws EvaluationException
	 *             If there is a problem evaluating any of the expressions.
	 * @throws InvalidAttributeExpressionException 
	 */
	public static Object[] getExpressionValueArray(EvaluationContext ec,
			List expressions) throws EvaluationException, InvalidAttributeExpressionException {
		if (null == expressions || 0 == expressions.size())
			return null;

		Object[] values = new Object[expressions.size()];

		int j = 0;
		for (Iterator i = expressions.iterator(); i.hasNext(); ++j)
			values[j] = getExpressionValue(ec, i.next());

		return values;
	}

	/**
	 * Gets the value of an expression.
	 * 
	 * If the argument <code>expression</code> is not an instance of
	 * {@link Expression}, then the value is returned unchanged.
	 * 
	 * If the argument is an Expression, then it will be evaluated using the
	 * current context and the resulting value will be returned.
	 * @throws InvalidAttributeExpressionException 
	 */
	public static Object getExpressionValue(EvaluationContext ec,
			Object expression) throws EvaluationException, InvalidAttributeExpressionException {
		if (expression instanceof Expression)
			return ((Expression) expression).evaluate(ec);
		else
			return expression;
	}

	public String toString() {
		String className = getClass().getName();

		return className.substring(className.lastIndexOf('.') + 1);
	}
}
