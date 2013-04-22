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
 * $Id: ShortCircuitAnd.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.util.Iterator;
import java.util.List;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.Function;
import com.headstrong.fusion.commons.expression.evaluator.StandardFunction;

/**
 * <p>
 *    Implements a short-circuit boolean AND operation for an arbitrary number
 *    of arguments.
 * </p>
 *
 * <p>
 *    In a short-circuit boolean operation, arguments are evaluated
 *    in a left-to-right fashion, stopping at the fist argument that
 *    fails to meet the criteria. For example, an AND operation would
 *    immediately return FALSE at the first FALSE argument that was
 *    encountered. Likewise, an OR operation would immediately return
 *    TRUE at the first TRUE argument that was encountered.
 * </p>
 *
 * <p>
 *    If a <code>null</code> is encountered before the operation can
 *    determine a value (possibly by short-circuiting), then <code>null</code>
 *    is returned.
 * </p>
 *
 */
public class ShortCircuitAnd implements Function {
	/**
	 * Creates a new ShortCircuitAnd object.
	 */
	public ShortCircuitAnd() {
		super();
	}

	public Object call(EvaluationContext ec, String functionName,
			List argumentExpressions) throws EvaluationException, InvalidAttributeExpressionException {
		if (null == argumentExpressions || 0 == argumentExpressions.size())
			throw new EvaluationException("Inappropriate number of objects: "
					+ (null == argumentExpressions ? "0" : String
							.valueOf(argumentExpressions.size())));

		boolean sawNull = false;
		for (Iterator i = argumentExpressions.iterator(); i.hasNext();) {
			Object result = StandardFunction.getExpressionValue(ec, i.next());

			if (null == result) {
				sawNull = true;
			} else if (result instanceof Boolean) {
				// Any FALSE is a deal-breaker

				if (!((Boolean) result).booleanValue())
					return Boolean.FALSE;
			} else
				throw new EvaluationException(
						"Encountered non-boolean argument: " + result);
		}

		if (sawNull)
			return null;
		else
			return Boolean.TRUE;
	}

	public String toString() {
		return "ShortCircuitAnd";
	}
}
