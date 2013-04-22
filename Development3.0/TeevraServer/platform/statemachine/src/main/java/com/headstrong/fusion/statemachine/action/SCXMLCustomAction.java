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
 * $Id: SCXMLCustomAction.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 10, 2009 
 */

package com.headstrong.fusion.statemachine.action;

import java.util.Collection;
import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.scxml.ErrorReporter;
import org.apache.commons.scxml.EventDispatcher;
import org.apache.commons.scxml.SCInstance;
import org.apache.commons.scxml.SCXMLExpressionException;
import org.apache.commons.scxml.model.Action;
import org.apache.commons.scxml.model.ModelException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.commons.resolver.exception.ServiceUnavailableException;
import com.headstrong.fusion.statemachine.exception.StateMachineException;

/**
 * Apache SCXML Custom Action class.
 */
public class SCXMLCustomAction extends Action {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory
			.getLogger(SCXMLCustomAction.class);
	private String name;

	private HashMap<String, String> properties;

	public void execute(final EventDispatcher evtDispatcher,
			final ErrorReporter errRep, final SCInstance scInstance,
			final Log appLog, final Collection derivedEvents)
			throws ModelException, SCXMLExpressionException {
		if (logger.isDebugEnabled()) {
			logger.debug("SCXML Custom action invoked with properties."
					+ properties);
		}
		com.headstrong.fusion.statemachine.action.Action action = null;
		try {
			action = (com.headstrong.fusion.statemachine.action.Action) ServiceAliasManager
					.getInstance().getServiceByAlias(name, 0);
		} catch (ServiceUnavailableException e) {
			logger.error("Service " + name + " not available.", e);
			throw new ModelException("Action service not available.", e);
		}
		try {
			action.execute(properties);
		} catch (StateMachineException e) {
			logger.error("Error while invoking the action " + name, e);
			throw new ModelException("Error while invoking the action " + name,
					e);
		}

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String service) {
		this.name = service;
	}

	/**
	 * @return the properties
	 */
	public HashMap<String, String> getProperties() {
		return properties;
	}

	/**
	 * @param properties
	 *            the properties to set
	 */
	public void setProperties(HashMap<String, String> properties) {
		this.properties = properties;
	}
}
