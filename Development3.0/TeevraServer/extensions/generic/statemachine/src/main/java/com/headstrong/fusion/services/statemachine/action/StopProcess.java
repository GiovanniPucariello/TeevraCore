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
 * $Id: StartProcess.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 20, 2009 
 */

package com.headstrong.fusion.services.statemachine.action;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.ApplicationContextService;
import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.commons.resolver.exception.ServiceUnavailableException;
import com.headstrong.fusion.statemachine.action.Action;
import com.headstrong.fusion.statemachine.exception.StateMachineException;

/**
 * 
 */
public class StopProcess implements Action {

	private static final String PROCESS_ID = "processId";
	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(StopProcess.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.statemachine.action.Action#execute(com.headstrong.fusion.statemachine.StateMachine)
	 */
	@Override
	public void execute(Map<String, String> configuration)
			throws StateMachineException {
		String processId = configuration.get(PROCESS_ID);
		if (processId == null) {
			throw new StateMachineException(
					"No process id specified in the Action configuration");
		}

		// Retrieve the ApplicationContextService.
		ApplicationContextService applicationContextService = null;
		try {
			applicationContextService = (ApplicationContextService) ServiceAliasManager
					.getInstance().getServiceByAlias(
							ApplicationContextService.class.getSimpleName(), 0);
		} catch (ServiceUnavailableException e) {
			logger.error("ApplicationContextService not found.", e);
			throw new StateMachineException("Process " + processId
					+ " could not be stopped..");
		}
		try {
			applicationContextService.stopProcess(processId);
		} catch (Exception e) {
			logger.error("Error stopping the process.", e);
			throw new StateMachineException("Process " + processId
					+ " could not be stopped.");
		}
	}

}
