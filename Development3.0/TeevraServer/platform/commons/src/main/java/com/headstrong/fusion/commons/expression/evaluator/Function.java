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
 * $Id: Function.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * An interface to describe functions callable from expressions.
 */
public interface Function {
	/**
	 * Invokes the function with the specified argument expressions in
	 * the specified evaluation context.
	 *
	 * @param ec The EvaluationContext in which this function is being called.
	 * @param functionName The name of the function being called.
	 * @param argumentExpressions The expressions which, when evaluated, result
	 *                            in the arguments to the function.
	 *
	 * @return The result of the function.
	 *
	 * @throws EvaluationException If there is a problem evaluating any of
	 *                             the arguments' expressions, or if there is
	 *                             an error during function execution.
	 * @throws InvalidAttributeExpressionException 
	 */
	public Object call(EvaluationContext ec, String functionName,
			List argumentExpressions) throws EvaluationException, InvalidAttributeExpressionException;
}
