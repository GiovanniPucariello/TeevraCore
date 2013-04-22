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
 * $Id: CallFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;

/**
 * <p>
 * Assigns a value to a symbolic identifier.
 * </p>
 * 
 * <p>
 * Usage: set(id: String, value: Object)
 * </p>
 * 
 * <p>
 * Returns the value to which the identifier was set.
 * </p>
 * 
 */
public class CallFunction extends IJWInvocation {
	public Object call(EvaluationContext ec, String functionName,
			Object[] arguments) throws EvaluationException {
		if (null == arguments || 2 > arguments.length) {
			throw new EvaluationException("Expected at least 2 arguments, got "
					+ (null == arguments ? "0" : String
							.valueOf(arguments.length)));
		}

		functionName = (String) arguments[0];
		Object[] args = new Object[arguments.length - 1];
		System.arraycopy(arguments, 1, args, 0, arguments.length - 1);
		return super.call(ec, functionName, args);
	}
}
