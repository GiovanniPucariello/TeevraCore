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
 * $Id: CBREndPoint.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 4, 2008 
 */

package com.headstrong.fusion.config;

import java.util.List;

public class CBREndPointConfig implements RouterConfig {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9035011423832956787L;

	
	private String id;
	/**
	 * XPATH|JEXPRESSION 
	 */
	private String expressionType;
	private List<When> when;
	private Otherwise otherwise;
	/**
	 * @return the when
	 */
	public List<When> getWhen() {
		return when;
	}
	/**
	 * @param when the when to set
	 */
	public void setWhen(List<When> when) {
		this.when = when;
	}
	/**
	 * @return the otherwise
	 */
	public Otherwise getOtherwise() {
		return otherwise;
	}
	/**
	 * @param otherwise the otherwise to set
	 */
	public void setOtherwise(Otherwise otherwise) {
		this.otherwise = otherwise;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the expressionType
	 */
	public String getExpressionType() {
		return expressionType;
	}
	/**
	 * @param expressionType the expressionType to set
	 */
	public void setExpressionType(String expressionType) {
		this.expressionType = expressionType;
	}
	
	

}
