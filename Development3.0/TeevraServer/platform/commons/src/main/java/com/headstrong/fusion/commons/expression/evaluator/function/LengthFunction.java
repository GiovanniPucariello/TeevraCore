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
 * $Id: LengthFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.util.Collection;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;

/**
 * <p>
 *    Returns the length of the specified array or collection.
 * </p>
 *
 * <p>
 *    Usage: length(a:array or list)
 * </p>
 *
 * <p>
 *    This function respects the value of
 *    {@link MathFunction#NULL_RETURNS_NULL}; if the array or list argument
 *    is <code>null</code>, the behavior is defined by the current value
 *    of MathExpression.NULL_RETURNS_NULL. If the property is set to
 *    <code>true</code>, then a <code>null</code> is returned. If the property
 *    is set to <code>false</code>, then zero is returned
 *    (since null contains no elements).
 * </p>
 *
 */
public class LengthFunction extends StandardFunction {
	private static final Integer ZERO = new Integer(0);

	public Object call(EvaluationContext ec, String functionName, Object[] args)
			throws EvaluationException {
		if (null == args || 1 != args.length)
			throw new EvaluationException("Expected 1 argument, got "
					+ (null == args ? "0" : String.valueOf(args.length)));

		Object haystack = args[0];

		if (null == haystack) {
			if (Boolean.FALSE.equals(ec
					.getProperty(MathFunction.NULL_RETURNS_NULL)))
				return ZERO; // Contains zero elements
			else
				return null; // Default is NULL_RETURNS_NULL => true
		}
		if (haystack instanceof Collection) {
			return new Integer(((Collection) haystack).size());
		} else if (haystack.getClass().isArray()) {
			return new Integer(java.lang.reflect.Array.getLength(haystack));
		} else
			throw new EvaluationException(
					"First argument must be an array or list (was "
							+ haystack.getClass().getName() + " instead)");
	}
}
