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

import java.util.Map;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * 
 */
public class BusinessObjectExpression extends ConstantExpression {
	/**
	 * Creates a new IdentifierExpression with the given identifier.
	 * 
	 * @param identifier
	 *            The identifier for this IdentifierExpressions.
	 * 
	 * @throws IllegalArgumentException
	 *             If the identifier is <code>null</code> or empty.
	 */
	public BusinessObjectExpression(String identifier) {
		super(identifier.substring(1));
		if (null == identifier || 0 == identifier.trim().length())
			throw new IllegalArgumentException("Identifier must have a value");
	}

	/**
	 * Gets the symbol used by this identifier.
	 */
	public String getSymbol() {
		return (String) super.getValue();
	}

	/**
	 * Gets the symbol used by this identifier.
	 */
	public String getIdentifier() {
		return (String) super.getValue();
	}

	public void acceptVisitor(ExpressionVisitor visitor) {
		// visitor.visitIdentifierExpression(this);
	}

	@SuppressWarnings("unchecked")
	public Object evaluate(EvaluationContext ec) throws EvaluationException, InvalidAttributeExpressionException {
		Map<String, Object> header = (Map<String, Object>) ec
				.get(EvaluationContext.HEADER);
		BusinessObject businessObject = (BusinessObject) ec
				.get(EvaluationContext.BUSINESS_OBJECT);
		Object value = null;
		try {
			if (ec.get("#" + (String)super.getValue()) != null) {
				value = ec.get("#" + (String)super.getValue());
			}
			else if (header != null && header.containsKey((String) super.getValue())) {
				value = header.get((String) super.getValue());
			} else {
				value = businessObject.getValue((String) super.getValue());
			}
		} catch (AttributeNotFoundException e) {
			//throw new EvaluationException(e);
			//if attribute not found return null
			return null;
		}
		return value;
	}

	public String toString() {
		return "<" + this.getSymbol() + ">";
	}
}
