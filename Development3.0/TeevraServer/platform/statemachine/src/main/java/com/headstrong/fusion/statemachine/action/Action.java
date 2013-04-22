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
 * $Id: Action.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 10, 2009 
 */

package com.headstrong.fusion.statemachine.action;

import java.util.Map;

import com.headstrong.fusion.statemachine.exception.StateMachineException;

/**
 * Default action interface which can be used to implement new action services.
 * 
 */
public interface Action {

	/**
	 * Execute the state Machine.
	 * 
	 * @throws StateMachineException
	 */
	public void execute(Map<String, String> configuration)
			throws StateMachineException;
}