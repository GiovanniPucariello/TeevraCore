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
 * $Id: StateMachineModelGenerationException.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 8, 2009 
 */

package com.headstrong.teevra.services.statemachine.exception;

/**
 * When there are issues in generating SCXML
 */
public class StateMachineModelGenerationException extends
		StateMachineServiceException {

	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 751053011405351481L;

	/**
	 * Creates an exception with the given message
	 * 
	 * @param message
	 *            Error message
	 */
	public StateMachineModelGenerationException(String string) {
		super(string);
	}

	/**
	 * Default constructor
	 */
	public StateMachineModelGenerationException() {
		super();
	}
}
