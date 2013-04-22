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
 * $Id: NullFunction.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator.function;

import java.util.List;

import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationException;
import com.headstrong.fusion.commons.expression.evaluator.Function;

/**
 * <p>
 *     Returns <code>null</code>. Yep, that's it.
 * </p>
 *
 */
public class NullFunction implements Function {
	/**
	 * Creates a new NullFunction object.
	 */
	public NullFunction() {
	}

	public Object call(EvaluationContext ec, String functionName,
			List argumentExpressions) throws EvaluationException {
		return null;
	}
}
