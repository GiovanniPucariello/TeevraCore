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

import com.headstrong.fusion.statemachine.action.Action;
import com.headstrong.fusion.statemachine.exception.StateMachineException;

/**
 * Simple Log service.
 * 
 */
public class Log implements Action {
	private static final Logger logger = LoggerFactory
			.getLogger(Log.class);
	private String expr;
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.statemachine.action.Action#execute(com.headstrong.fusion.statemachine.StateMachine)
	 */
	@Override
	public void execute(Map<String, String> configuration)
			throws StateMachineException {
		if (logger.isDebugEnabled()) {
			logger.debug("Start Process request received with configuration "
					+ configuration);
		}
		logger.info(this.getExpr());
	}

	/**
	 * @return the expr
	 */
	public String getExpr() {
		return expr;
	}

	/**
	 * @param expr the expr to set
	 */
	public void setExpr(String expr) {
		this.expr = expr;
	}

}
