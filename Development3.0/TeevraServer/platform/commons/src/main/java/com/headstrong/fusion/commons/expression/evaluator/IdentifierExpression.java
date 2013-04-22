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
 * $Id: IdentifierExpression.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 17, 2009 
 */

package com.headstrong.fusion.commons.expression.evaluator;

/**
 * An Expression which represents an identifier.
 */
public class IdentifierExpression extends ConstantExpression {
	/**
	 * Creates a new IdentifierExpression with the given identifier.
	 * 
	 * @param identifier
	 *            The identifier for this IdentifierExpressions.
	 * 
	 * @throws IllegalArgumentException
	 *             If the identifier is <code>null</code> or empty.
	 */
	public IdentifierExpression(String identifier) {
		super(identifier);
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
		visitor.visitIdentifierExpression(this);
	}

	public Object evaluate(EvaluationContext ec) throws EvaluationException {
		return ec.get((String) super.getValue());
	}

	public String toString() {
		return "<" + this.getSymbol() + ">";
	}
}
