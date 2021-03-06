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
 * $Id: RuleNotFoundException.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 4, 2008 
 */

package com.headstrong.fusion.services.transformer.rulemanager.exception;

/**
 * RuleNotFoundException is the {@link Exception} which is thrown when the rule
 * service could not be found.
 */
public class RuleNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RuleNotFoundException(String message) {
		super(message);
	}

	public RuleNotFoundException(String message, Throwable t) {
		super(message, t);
	}

}
