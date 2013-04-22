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
 * $Id: DistributeFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.util.ArrayList;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.Function;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;

/**
 * <p>
 * Executes a function on the remaining parameters, returning an array.
 * </p>
 * 
 * <p>
 * Usage: distribute(f: Function, arg1, ..., argN)
 * </p>
 * 
 * <p>
 * Returns an array containing all of the results of calling the function
 * <code>f</code> for each other argument individually.
 * </p>
 * 
 */
public class DistributeFunction extends StandardFunction {
	public Object call(EvaluationContext ec, String functionName,
			Object[] arguments) throws EvaluationException, InvalidAttributeExpressionException {
		if (null == arguments || 2 > arguments.length)
			throw new EvaluationException("Expected at least 2 arguments, got "
					+ (null == arguments ? "0" : String
							.valueOf(arguments.length)));

		Function func = (Function) arguments[0];

		Object[] results = new Object[arguments.length - 1];
		ArrayList arg = new ArrayList(1);
		arg.add(null); // Prime the array

		for (int i = 0; i < results.length; ++i) {
			arg.set(0, arguments[i + 1]);

			results[i] = func.call(ec, null, // function name?
					arg);
		}

		return results;
	}
}
