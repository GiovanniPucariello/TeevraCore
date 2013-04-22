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
 * $Id: SetVariableFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.Function;
import com.headstrong.fusion.commons.expression.evaluator.IdentifierExpression;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;

/**
 * <p>
 *    Assigns a value to a symbolic identifier.
 * </p>
 *
 * <p>
 *   Usage: set(id: String, value: Object)
 * </p>
 *
 * <p>
 *    Returns the value to which the identifier was set.
 * </p>
 *
 */
public class SetVariableFunction implements Function {
	public Object call(EvaluationContext ec, String functionName,
			List argumentExpressions) throws EvaluationException, InvalidAttributeExpressionException {
		if (null == argumentExpressions || 2 != argumentExpressions.size())
			throw new EvaluationException("Expected 2 arguments, got "
					+ (null == argumentExpressions ? "0" : String
							.valueOf(argumentExpressions.size())));

		Expression varNameExp = (Expression) argumentExpressions.get(0);

		// Can only set the values of identifiers / symbols
		Expression exp = varNameExp;

		while (null != exp && !(exp instanceof IdentifierExpression)) {
			Object result = exp.evaluate(ec);

			if (result instanceof Expression) {
				exp = (Expression) result;
			} else {
				exp = null;
			}
		}

		if (null == exp || !(exp instanceof IdentifierExpression))
			throw new EvaluationException("Cannot define a non-identifier: "
					+ varNameExp);

		String varName = (String) ((IdentifierExpression) exp).getValue();
		Object value = StandardFunction.getExpressionValue(ec,
				(Expression) argumentExpressions.get(1));

		ec.set(varName, value);

		return value;
	}
}
