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
 * $Id: StateMachineService.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Mar 4, 2009 
 */

package com.headstrong.teevra.services.statemachine;

import java.util.List;

import com.headstrong.teevra.services.statemachine.eo.StateMachineEO;
import com.headstrong.teevra.services.statemachine.exception.StateMachineServiceException;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Service to perform CRUD operations of state machine configurations
 */
public interface StateMachineService {

	/**
	 * Fetches all the state machines modeled in the system.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws StateMachineServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public List<StateMachineEO> getStateMachineList()
			throws StateMachineServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Persists and returns the given state machine
	 * 
	 * @precondition
	 * @postcondition
	 * @param stateMachineToSave
	 * @return
	 * @throws StateMachineServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public StateMachineEO saveStateMachine(StateMachineEO stateMachineToSave)
			throws StateMachineServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Deletes the given state machine from the system
	 * 
	 * @precondition
	 * @postcondition
	 * @param stateMachineName
	 * @throws StateMachineServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public void deleteStateMachine(String stateMachineName)
			throws StateMachineServiceException, UserAuthorizationException,
			SessionTimeOutException;

	/**
	 * Publishes the given state machine and returns back the same after
	 * publishing
	 * 
	 * @precondition
	 * @postcondition
	 * @param stateMachineToPublish
	 * @return
	 * @throws StateMachineServiceException
	 * @throws UserAuthorizationException
	 * @throws SessionTimeOutException
	 */
	public StateMachineEO publishStateMachine(
			StateMachineEO stateMachineToPublish)
			throws StateMachineServiceException, UserAuthorizationException,
			SessionTimeOutException;
}
