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
 * $Id: StateMachine.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 10, 2009 
 */

package com.headstrong.fusion.statemachine;

import java.io.Serializable;

import com.headstrong.fusion.statemachine.event.Event;
import com.headstrong.fusion.statemachine.exception.StateEventException;
import com.headstrong.fusion.statemachine.exception.StateMachineException;

/**
 * State Machine interface.
 *  
 */
public interface StateMachine extends Serializable {

	/**
	 * Returns the current state of the state machine.
	 * @return state of the machine.
	 */
	public String getCurrentState();
	
	/**
	 * Sends an Trigger Event to the state machine.
	 * @param event Trigger Event.
	 */
	public void triggerEvent(Event event) throws StateEventException;
	
	/**
	 *
	 * @precondition
	 * @postcondition 	
	 */
	public String getId();
	
	/**
	 *
	 * @precondition
	 * @postcondition 	
	 * @param id
	 */
	public void setId(String id);
	
	/**
	 * Initialize the state machine but doesn't start it.
	 * So no event can be trigger on the state machine.
	 * 
	 * @throws StateMachineException
	 */
	public void init() throws StateMachineException;

	/**
	 * Start the State Machine. It can accept events now.
	 * 
	 * @throws StateMachineException
	 */
	public void start() throws StateMachineException;
	
}
