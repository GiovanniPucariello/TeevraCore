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
 * $Id: When.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 1, 2008 
 */

package com.headstrong.fusion.config;

import java.io.Serializable;

/**
 * 
 */
public class When implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Deprecated
	private Predicate predicate;
	private EndPointSequence to;
	
	/**
	 * Currently the expression would be JEXL expression.
	 * but the field name would be object schema field names 
	 * in dotted format. Expression would be converted to
	 * actual JEXL expression for further processing.
	 * Samples
	 * HEADER ONLY 
	 * (#header{type}.equals("type1"))
	 * COMPLETE
	 * (#header{type}.equals("type1") && #body{parent.child}.equals("data"))
	 * #header refers to the header data and #body refers to the field in 
	 * the message body.
	 */
	private String expression;
	/**
	 * @return the predicate
	 */
	public Predicate getPredicate() {
		return predicate;
	}
	/**
	 * @param predicate the predicate to set
	 */
	public void setPredicate(Predicate predicate) {
		this.predicate = predicate;
	}
	/**
	 * @return the to
	 */
	public EndPointSequence getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(EndPointSequence to) {
		this.to = to;
	}
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
