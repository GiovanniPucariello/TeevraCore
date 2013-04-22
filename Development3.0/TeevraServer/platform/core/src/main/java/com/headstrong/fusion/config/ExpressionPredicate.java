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
 * $Id: ExpressionPredicate.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Dec 4, 2008 
 */

package com.headstrong.fusion.config;

/**
 * 
 */
public class ExpressionPredicate implements Predicate {
	private String expression;

	/**
	 * @return the expression
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * @param expression the expression to set
	 */
	public void setExpression(String expression) {
		this.expression = expression;
	}

}
