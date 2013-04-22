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
 * $Id: UnsetVariableFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.util.Iterator;
import java.util.List;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.Function;
import com.headstrong.fusion.commons.expression.evaluator.IdentifierExpression;

/**
 * <p>
 *    Removes the value for any number of identifiers.
 *    Note that this is different than setting their values to
 *    <code>null</code>.
 * </p>
 *
 * <p>
 *   Usage: unset(id [id id id...])
 * </p>
 *
 * <p>
 *    Returns the old value for the last identifier mentioned or
 *    <code>null</code> if that identifier has no value.
 * </p>
 *
 */
public class UnsetVariableFunction implements Function {
	public Object call(EvaluationContext ec, String functionName,
			List argumentExpressions) throws EvaluationException {
		Object value = null;

		if (null != argumentExpressions && 0 < argumentExpressions.size())
			for (Iterator i = argumentExpressions.iterator(); i.hasNext();) {
				Expression varNameExp = (Expression) i.next();

				// Can only remove the values of identifiers / symbols
				if (!(varNameExp instanceof IdentifierExpression))
					throw new EvaluationException(
							"Cannot remove a non-identifier: " + varNameExp);

				String varName = (String) ((IdentifierExpression) varNameExp)
						.getValue();

				value = ec.remove(varName);
			}

		return value;
	}
}
