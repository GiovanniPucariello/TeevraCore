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
 * $Id: StateMachineManager.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 10, 2009 
 */

package com.headstrong.fusion.statemachine;

import com.headstrong.fusion.statemachine.exception.StateMachineException;

/**
 * State Machine Manager service.
 * 
 */
public interface StateMachineManager {

	/**
	 * Register a new state machine based on the definition provided.
	 * 
	 * @param id
	 *            state machine id.
	 * @param definition
	 */
	public void registerStateMachine(String id, String definition,
			Object payload) throws StateMachineException;

	/**
	 * Trigger an event on the state machine.
	 * 
	 * @param id state machine id.
	 * @param event Trigger Event Name
	 * @param payload Message Payload.
	 * @throws StateMachineException
	 */
	public void triggerEvent(String id, String event, Object payload)
			throws StateMachineException;
}
