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
 * $Id: ContainsAnyFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.util.Collection;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;
import com.headstrong.fusion.commons.expression.evaluator.util.PrimitiveArrayWrapper;

/**
 * <p>
 * Returns <code>true</code> if the array or collection in the first argument
 * contains any one of the remaining arguments.
 * </p>
 * 
 * <p>
 * Usage: containsAny(a:array or list, element1, element2, ... elementN)
 * </p>
 * 
 * <p>
 * This function respects the value of {@link MathFunction#NULL_RETURNS_NULL};
 * if the array or list argument is <code>null</code>, the behavior is
 * defined by the current value of MathExpression.NULL_RETURNS_NULL. If the
 * property is set to <code>true</code>, then a <code>null</code> is
 * returned. If the property is set to <code>false</code>, then
 * <code>false</code> is returned (since null cannot contain anything).
 * </p>
 * 
 */
public class ContainsAnyFunction extends StandardFunction {
	public Object call(EvaluationContext ec, String functionName, Object[] args)
			throws EvaluationException {
		if (null == args || 2 > args.length)
			throw new EvaluationException("Expected 2 or more arguments, got "
					+ (null == args ? "0" : String.valueOf(args.length)));

		Object haystack = args[0];
		Collection c;
		if (null == haystack) {
			if (Boolean.FALSE.equals(ec
					.getProperty(MathFunction.NULL_RETURNS_NULL)))
				return Boolean.FALSE; // Cannot containAny
			else
				return null; // Default is NULL_RETURNS_NULL => true
		}
		if (haystack instanceof Collection) {
			c = (Collection) haystack;
		} else if (haystack.getClass().isArray()) {
			if (haystack.getClass().getComponentType().isPrimitive()) {
				c = new PrimitiveArrayWrapper(haystack);
			} else {
				c = java.util.Arrays.asList((Object[]) haystack);
			}
		} else
			throw new EvaluationException(
					"First argument must be an array or list (was "
							+ haystack.getClass().getName() + " instead)");

		for (int i = 1; i < args.length; ++i)
			if (c.contains(args[i]))
				return Boolean.TRUE;

		// Must have found nothing
		return Boolean.FALSE;
	}
}
