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
 * $Id: SwitchCaseStatement.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 11, 2009 
 */

package com.headstrong.fusion.services.message.commons.adapter.mapper.config;

import java.util.List;
import java.util.Map;

import com.headstrong.fusion.commons.expression.evaluator.Expression;

/**
 * Conditional Euronext Adapter Statement.
 */
public class SwitchCaseStatement implements Statement {
	/**
	 * Expressions to be evaluated.
	 */
	private Expression expression;

	/**
	 * A Map of expression values v/s the mapping to be assigned.
	 */
	private Map<String, List<Statement>> cases;

	/**
	 * Switch Type. defaults to Default.
	 */
	private SwitchType type = SwitchType.Default;

	/**
	 * @return the expression
	 */
	public Expression getExpression() {
		return expression;
	}

	/**
	 * @param expression
	 *            the expression to set
	 */
	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	/**
	 * @return the type
	 */
	public SwitchType getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(SwitchType type) {
		this.type = type;
	}

	public Map<String, List<Statement>> getCases() {
		return cases;
	}

	public void setCases(Map<String, List<Statement>> cases) {
		this.cases = cases;
	}
}
