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
 * $Id: RuleVO.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 4, 2008 
 */

package com.headstrong.fusion.services.transformer.rulemanager;

import java.util.ArrayList;
import java.util.List;

/**
 * Basic Implementation of the rule VO. 
 */
public class RuleVO {
	
	/**
	 * Alias name of the rule
	 */
	private String aliasName;
	
	
	/**
	 * ClassName under whose name the rule is registered as service. 
	 */
	private String className;
	
	
	/**
	 * InParameters
	 */
	private List<String> inParameters;
	
	/**
	 * OutParameters
	 */
	private List<String> outParameters;
	
	
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("AliasName:").append(aliasName).append(":className:").append(className);
		return sb.toString();
	}
	/**
	 * @return the aliasName
	 */
	public String getAliasName() {
		return aliasName;
	}
	/**
	 * @param aliasName the aliasName to set
	 */
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the inParameters
	 */
	public List<String> getInParameters() {
		return inParameters;
	}
	/**
	 * @param inParameters the inParameters to set
	 */
	public void setInParameters(List<String> inParameters) {
		this.inParameters = inParameters;
	}
	/**
	 * @param inParameter the inParameter to be adde
	 */
	public void addInParameter(String inParameter) {
		if (inParameters==null) {
			inParameters=new ArrayList<String>();
		}
		inParameters.add(inParameter);
	}
	/**
	 * @return the outParameters
	 */
	public List<String> getOutParameters() {
		return outParameters;
	}
	/**
	 * @param outParameters the outParameters to set
	 */
	public void setOutParameters(List<String> outParameters) {
		this.outParameters = outParameters;
	}
	/**
	 * @param outParameter the outParameter to be adde
	 */
	public void addOutParameter(String outParameter) {
		if (outParameters==null) {
			outParameters=new ArrayList<String>();
		}
		outParameters.add(outParameter);
	}
		
}
