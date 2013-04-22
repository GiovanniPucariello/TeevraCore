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
 * $Id: ListFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.Function;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;

/**
 * <p>
 *    Returns a list containing the arguments to the function.
 * </p>
 *
 * <p>
 *   Usage: list(arg1, arg2, ...)
 * </p>
 *
 * <p>
 *    Returns a list containing all of the function's arguments.
 *    An empty argument list returns an empty list.
 * </p>
 *
 */
public class ListFunction implements Function {
	@SuppressWarnings("unchecked")
	public Object call(EvaluationContext ec, String functionName,
			List argumentExpressions) throws EvaluationException, InvalidAttributeExpressionException {
		if (null == argumentExpressions)
			return new ArrayList();

		ArrayList values = new ArrayList(argumentExpressions.size());

		for (Iterator i = argumentExpressions.iterator(); i.hasNext();)
			values.add(StandardFunction.getExpressionValue(ec, i.next()));

		return values;
	}
}
