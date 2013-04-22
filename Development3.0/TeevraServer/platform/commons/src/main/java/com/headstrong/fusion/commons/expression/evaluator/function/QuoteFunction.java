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
 * $Id: QuoteFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.util.List;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.Function;

/**
 * <p>
 *    Returns the symbol as a ConstantExpression instead of evaluating it.
 * </p>
 *
 * <p>
 *   Usage: quote(identifier)
 * </p>
 *
 * <p>
 *    Returns the identifier itself.
 * </p>
 *
 */
public class QuoteFunction implements Function {
	public Object call(EvaluationContext ec, String functionName,
			List argumentExpressions) throws EvaluationException {
		if (null == argumentExpressions || 1 != argumentExpressions.size())
			throw new EvaluationException("Expected 1 argument, got "
					+ (null == argumentExpressions ? "0" : String
							.valueOf(argumentExpressions.size())));

		return (Expression) argumentExpressions.get(0);
	}
}
