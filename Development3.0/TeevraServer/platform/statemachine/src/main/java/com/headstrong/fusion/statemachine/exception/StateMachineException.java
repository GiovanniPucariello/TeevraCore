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
 * $Id: StateMachineException.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 10, 2009 
 */

package com.headstrong.fusion.statemachine.exception;

/**
 * Base class for all state machine related exception.
 */
public class StateMachineException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StateMachineException() {
		super();
	}

	/**
	 * @param message Error Message
	 * @param cause 
	 */
	public StateMachineException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message Error Message
	 */
	public StateMachineException(String message) {
		super(message);
	}

	/**
	 * @param cause 
	 */
	public StateMachineException(Throwable cause) {
		super(cause);
	}


}
