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
 * $Id: VariablesFunction.java
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
 *    Returns a map of all named variables, including functions.
 * </p>
 *
 * <p>
 *    This method takes no arguments.
 * </p>
 *
 */
public class VariablesFunction extends StandardFunction {
	public Object call(EvaluationContext ec, String functionName,
			Object[] arguments) throws EvaluationException {
		return ec.getAll();
	}
}
