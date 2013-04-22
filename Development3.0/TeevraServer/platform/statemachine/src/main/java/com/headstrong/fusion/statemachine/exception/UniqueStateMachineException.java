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
 * $Id: UniqueStateMachineException.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 15, 2009 
 */

package com.headstrong.fusion.statemachine.exception;

/**
 * when already a state machine is registered with the system with the same id.
 * 
 */
public class UniqueStateMachineException extends StateMachineException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message Error Message
	 * @param cause
	 */
	public UniqueStateMachineException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message Error Message
	 */
	public UniqueStateMachineException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public UniqueStateMachineException(Throwable cause) {
		super(cause);
	}

}
