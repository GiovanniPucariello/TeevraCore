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
 * $Id: CountMatchesFunction.java
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
 *    Returns the number (int) of arguments that appear in the
 *    first (array or list) argument.
 * </p>
 *
 * <p>
 *    Usage: countMatches(a:array or list, element1, element2, ... elementN)
 * </p>
 *
 */
public class CountMatchesFunction extends StandardFunction {
	public Object call(EvaluationContext ec, String functionName, Object[] args)
			throws EvaluationException {
		if (null == args || 2 > args.length)
			throw new EvaluationException("Expected 2 or more arguments, got "
					+ (null == args ? "0" : String.valueOf(args.length)));

		Object haystack = args[0];
		Collection c;
		if (null == haystack) {
			return new Integer(0); // Cannot contain any
		}
		if (haystack instanceof Collection) {
			c = (Collection) haystack;
		} else if (haystack.getClass().isArray()) {
			// Check for primitive array... must treat it slightly differently
			if (haystack.getClass().getComponentType().isPrimitive()) {
				c = new PrimitiveArrayWrapper(haystack);
			} else {
				c = java.util.Arrays.asList((Object[]) haystack);
			}
		} else
			throw new EvaluationException(
					"First argument must be an array or list (was "
							+ haystack.getClass().getName() + " instead)");

		int count = 0;

		for (int i = 1; i < args.length; ++i)
			if (c.contains(args[i]))
				++count;

		return new Integer(count);
	}
}
