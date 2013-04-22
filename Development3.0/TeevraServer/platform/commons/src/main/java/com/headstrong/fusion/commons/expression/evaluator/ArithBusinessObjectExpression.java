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
 * $Id: BusinessObjectExpression.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * 
 */
public class ArithBusinessObjectExpression extends BusinessObjectExpression {
	/**
	 * Creates a new IdentifierExpression with the given identifier.
	 * 
	 * @param identifier
	 *            The identifier for this IdentifierExpressions.
	 * 
	 * @throws IllegalArgumentException
	 *             If the identifier is <code>null</code> or empty.
	 */
	public ArithBusinessObjectExpression(String identifier) {
		super(identifier);
	}

	@SuppressWarnings("unchecked")
	public Object evaluate(EvaluationContext ec) throws EvaluationException, InvalidAttributeExpressionException {
		Object result = super.evaluate(ec);
		if (result != null) {
			try {
				return Double.parseDouble(result.toString());
			} catch (NumberFormatException e) {
				throw new EvaluationException(e);
			}
		}
		return result;
	}

	public String toString() {
		return "<" + this.getSymbol() + ">";
	}
}
