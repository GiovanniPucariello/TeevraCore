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
 * $Id: StateMachineSerializationException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 18, 2009 
 */

package com.headstrong.fusion.statemachine.exception;

/**
 * Thrown on error while serializing the state machine.
 */
public class StateMachineSerializationException extends StateMachineException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public StateMachineSerializationException() {
		super();
	}

	/**
	 * @param message Error Message
	 * @param cause
	 */
	public StateMachineSerializationException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message Error Message
	 */
	public StateMachineSerializationException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public StateMachineSerializationException(Throwable cause) {
		super(cause);
	}

}
