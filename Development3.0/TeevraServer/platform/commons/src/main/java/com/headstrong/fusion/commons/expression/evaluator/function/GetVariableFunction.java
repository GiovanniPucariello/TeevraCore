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
 * $Id: GetVariableFunction.java
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
import com.headstrong.fusion.commons.expression.evaluator.IdentifierExpression;

/**
 * <p>
 *    Retrieves the value of a symbolic identifier.
 * </p>
 *
 * <p>
 *   Usage: get(id: String)
 * </p>
 *
 * <p>
 *    Returns the value to which the identifier is set.
 * </p>
 *
 */
public class GetVariableFunction implements Function {
	public Object call(EvaluationContext ec, String functionName,
			List argumentExpressions) throws EvaluationException {
		if (null == argumentExpressions || 1 != argumentExpressions.size())
			throw new EvaluationException("Expected 1 argument, got "
					+ (null == argumentExpressions ? "0" : String
							.valueOf(argumentExpressions.size())));

		Expression varNameExp = (Expression) argumentExpressions.get(0);

		// Can only set the values of identifiers / symbols
		if (!(varNameExp instanceof IdentifierExpression))
			throw new EvaluationException("Cannot get a non-identifier: "
					+ varNameExp);

		String varName = (String) ((IdentifierExpression) varNameExp)
				.getValue();

		return ec.get(varName);
	}
}
