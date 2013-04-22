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
 * $Id: StateEventException.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 10, 2009 
 */

package com.headstrong.fusion.statemachine.exception;

/**
 * Exception thrown by State Machine on Trigger Event failure.
 */
public class StateEventException extends StateMachineException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public StateEventException() {
		super();
	}

	/**
	 * @param message Error Message.
	 * @param cause
	 */
	public StateEventException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message Error Message.
	 */
	public StateEventException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public StateEventException(Throwable cause) {
		super(cause);
	}

}
