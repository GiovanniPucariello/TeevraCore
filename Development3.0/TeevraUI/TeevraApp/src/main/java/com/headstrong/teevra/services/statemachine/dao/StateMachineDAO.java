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
 * $Id: StateMachineDAO.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Mar 4, 2009 
 */

package com.headstrong.teevra.services.statemachine.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.statemachine.eo.StateMachineEO;
import com.headstrong.teevra.services.statemachine.exception.StateMachineServiceException;

/**
 * Offers APIs to perform CRUD operations of state machine configurations
 */
public interface StateMachineDAO extends BaseDAO<StateMachineEO> {
	/**
	 * Fetches all the state machines modeled in the system.
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws StateMachineServiceException
	 */
	public List<StateMachineEO> getStateMachineList()
			throws StateMachineServiceException;

	/**
	 * Persists the given state machine
	 * 
	 * @precondition
	 * @postcondition
	 * @param stateMachineToSave
	 * @throws StateMachineServiceException
	 */
	public void saveStateMachine(StateMachineEO stateMachineToSave)
			throws StateMachineServiceException;

	/**
	 * Deletes the given state machine from the system
	 * 
	 * @precondition
	 * @postcondition
	 * @param stateMachineName
	 * @throws StateMachineServiceException
	 */
	public void deleteStateMachine(String stateMachineName)
			throws StateMachineServiceException;
}
