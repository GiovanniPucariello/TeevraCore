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
 * $Id: StateMachineServiceImpl.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Mar 4, 2009 
 */

package com.headstrong.teevra.services.statemachine;

import java.sql.Timestamp;
import java.util.List;

import com.headstrong.teevra.services.statemachine.dao.StateMachineDAO;
import com.headstrong.teevra.services.statemachine.eo.StateMachineEO;
import com.headstrong.teevra.services.statemachine.exception.StateMachineServiceException;
import com.headstrong.teevra.services.userauthorization.exception.SessionTimeOutException;
import com.headstrong.teevra.services.userauthorization.exception.UserAuthorizationException;

/**
 * Service to perform CRUD operations of state machine configurations
 */
public class StateMachineServiceImpl implements StateMachineService {

	private StateMachineDAO stateMachineDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.statemachine.StateMachineService#deleteStateMachine(java.lang.String)
	 */
	public void deleteStateMachine(String stateMachineName)
			throws StateMachineServiceException, UserAuthorizationException,
			SessionTimeOutException {
		stateMachineDAO.deleteStateMachine(stateMachineName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.statemachine.StateMachineService#getStateMachineList()
	 */
	public List<StateMachineEO> getStateMachineList()
			throws StateMachineServiceException, UserAuthorizationException,
			SessionTimeOutException {
		return stateMachineDAO.getStateMachineList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.statemachine.StateMachineService#saveStateMachine(com.headstrong.teevra.services.statemachine.eo.StateMachineEO)
	 */
	public StateMachineEO saveStateMachine(StateMachineEO stateMachineToSave)
			throws StateMachineServiceException, UserAuthorizationException,
			SessionTimeOutException {
		// if the state machine is a new one, set its id to null and set created
		// values
		if (stateMachineToSave.getStateMachineId().intValue() == 0) {
			stateMachineToSave.setStateMachineId(null);
			stateMachineToSave.setCreatedBy(System.getProperty("user.name"));
			stateMachineToSave.setCreatedDate(new Timestamp(System
					.currentTimeMillis()));
		}
		// if the state machine is existing one, set modified values
		else {
			stateMachineToSave.setModifiedBy(System.getProperty("user.name"));
			stateMachineToSave.setModifiedDate(new Timestamp(System
					.currentTimeMillis()));
		}
		// if the state machine is already published, change the status to
		// unpublished
		if (stateMachineToSave.getStateMachineStatus().equals(
				StateMachineEO.STATUS_PUBLISHED)) {
			stateMachineToSave
					.setStateMachineStatus(StateMachineEO.STATUS_UNPUBLISHED);
		}
		// save the state machine in the system
		stateMachineDAO.saveStateMachine(stateMachineToSave);
		return stateMachineToSave;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.statemachine.StateMachineService#publishStateMachine(com.headstrong.teevra.services.statemachine.eo.StateMachineEO)
	 */
	public StateMachineEO publishStateMachine(
			StateMachineEO stateMachineToPublish)
			throws StateMachineServiceException, UserAuthorizationException,
			SessionTimeOutException {

		// generate state machine model
		String stateMachineModel = StateMachineModelGenerator
				.generateStateMachineModel(stateMachineToPublish);
		// set the state machine model in the state machine to be published
		stateMachineToPublish.setStateMachineModel(stateMachineModel);
		// set the status of the state machine to published
		stateMachineToPublish
				.setStateMachineStatus(StateMachineEO.STATUS_PUBLISHED);
		// save the state machine in the system
		stateMachineDAO.saveStateMachine(stateMachineToPublish);

		return stateMachineToPublish;
	}

	/**
	 * @return the stateMachineDAO
	 */
	public StateMachineDAO getStateMachineDAO() {
		return stateMachineDAO;
	}

	/**
	 * @param stateMachineDAO
	 *            the stateMachineDAO to set
	 */
	public void setStateMachineDAO(StateMachineDAO stateMachineDAO) {
		this.stateMachineDAO = stateMachineDAO;
	}

}
