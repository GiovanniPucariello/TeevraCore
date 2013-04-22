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
 * $Id: RuleAlreadyExistsException.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 4, 2008 
 */

package com.headstrong.fusion.services.transformer.rulemanager.exception;

/**
 * RuleAlreadyExistsException is the {@link Exception} thrown when the rule
 * bundle tries to register itself twice with the same name.
 */
public class RuleAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RuleAlreadyExistsException(String message) {
		super(message);
	}

}
