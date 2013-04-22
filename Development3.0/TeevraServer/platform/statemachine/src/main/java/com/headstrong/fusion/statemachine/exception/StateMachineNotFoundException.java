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
 * $Id: StateMachineNotFoundException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 15, 2009 
 */

package com.headstrong.fusion.statemachine.exception;

/**
 * Thrown when State Machine is not found for the id provided.
 */
public class StateMachineNotFoundException extends StateMachineException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message Error Message
	 * @param cause
	 */
	public StateMachineNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message Error Message
	 */
	public StateMachineNotFoundException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public StateMachineNotFoundException(Throwable cause) {
		super(cause);
	}

}
