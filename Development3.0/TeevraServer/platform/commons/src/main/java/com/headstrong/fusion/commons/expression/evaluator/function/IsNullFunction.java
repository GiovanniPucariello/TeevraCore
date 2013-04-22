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
 * $Id: IsNullFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;

/**
 * <p>
 *     Returns true if all arguments are null.
 * </p>
 *
 * <p>
 *    This method will typically take a single argument, but you may invoke
 *    it with an arbitrary number of arguments. <code>true</code> is returned
 *    if all arguments are null.
 * </p>
 *
 */
public class IsNullFunction extends StandardFunction {
	public Object call(EvaluationContext ec, String functionName,
			Object[] arguments) throws EvaluationException {
		if (null == arguments || 0 == arguments.length)
			throw new EvaluationException("Expected at least one argument");

		boolean isNull = true;

		for (int i = 0; i < arguments.length; ++i) {
			if (null != arguments[i]) {
				isNull = false;
				break;
			}
		}

		return isNull ? Boolean.TRUE : Boolean.FALSE;
	}
}
