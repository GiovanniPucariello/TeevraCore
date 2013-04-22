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
 * $Id: MemoryFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.util.HashMap;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;

/**
 * <p>
 *    Returns the current memory usage as a Map of descriptions to Integers.
 * </p>
 *
 * <p>
 *    This method takes no arguments.
 * </p>
 *
 */
public class MemoryFunction extends StandardFunction {
	@SuppressWarnings("unchecked")
	public Object call(EvaluationContext ec, String functionName,
			Object[] arguments) throws EvaluationException {
		Runtime rt = Runtime.getRuntime();

		long total = rt.totalMemory();
		long max = rt.maxMemory();
		long free = rt.freeMemory();

		HashMap info = new HashMap();

		info.put("free", new Long(free));
		info.put("max", new Long(max));
		info.put("total", new Long(total));

		return info;
	}
}
