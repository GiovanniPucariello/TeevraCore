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
 * $Id: RuleOperationFailedException.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 5, 2008 
 */

package com.headstrong.fusion.services.validator.rulemanager.exception;

/**
 * {@link RuleOperationFailedException} is the {@link Exception} that is thrown
 * when the rule fails on operate.
 */
public class RuleOperationFailedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RuleOperationFailedException(String message) {
		super(message);
	}

	public RuleOperationFailedException(String message, Throwable t) {
		super(message, t);
	}

}
