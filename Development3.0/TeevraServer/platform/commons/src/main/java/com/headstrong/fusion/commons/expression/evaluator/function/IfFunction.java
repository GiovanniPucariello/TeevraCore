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
 * $Id: IfFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.Function;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;
import com.headstrong.fusion.commons.expression.evaluator.UnexpectedArgumentException;

/**
 * <p>
 * Implements an if-then-else construct as a function.
 * </p>
 * 
 * <p>
 * Usage: if(predicate, then-expression, else-expression)
 * </p>
 * 
 * <p>
 * This function returns the result of the <i>then-expression</i> if the
 * predicate evaluates to <code>true</code>, or returns the result of the
 * <i>else-expression</i> if <i>predicate</i> evaluates to <code>false</code>.
 * <code>null</code> is returned if the predicate returns <code>null</code>.
 * </p>
 * 
 */
public class IfFunction implements Function {
	/**
	 * Creates a new IfFunction object.
	 */
	public IfFunction() {
		super();
	}

	public Object call(EvaluationContext ec, String functionName,
			List argumentExpressions) throws EvaluationException, InvalidAttributeExpressionException {
		if (null == argumentExpressions || 3 != argumentExpressions.size())
			throw new EvaluationException(
					"Incorrect number of arguments. Expected 3, got "
							+ (null == argumentExpressions ? "0" : String
									.valueOf(argumentExpressions.size())));

		Object predicate = StandardFunction.getExpressionValue(ec,
				argumentExpressions.get(0));

		// Bail-out of the result is null.
		if (null == predicate)
			return null;

		if (!(predicate instanceof Boolean))
			throw new UnexpectedArgumentException(
					"Expected boolean predicate, not " + predicate.getClass());

		if (((Boolean) predicate).booleanValue()) {
			return StandardFunction.getExpressionValue(ec, argumentExpressions
					.get(1));
		} else {
			return StandardFunction.getExpressionValue(ec, argumentExpressions
					.get(2));
		}
	}

	public String toString() {
		return "IfFunction";
	}
}
