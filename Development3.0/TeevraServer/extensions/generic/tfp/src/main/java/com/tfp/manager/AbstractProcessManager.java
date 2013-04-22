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
 * $Id: AbstractProcessManager.java
 */
package com.tfp.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tfp.event.Event;
import com.tfp.event.EventManager;
import com.tfp.interfaces.ProcessManager;
import com.tfp.interfaces.ProcessObject;

/**
 * This file is provided by MCH team for TFP integration.
 */
public abstract class AbstractProcessManager implements ProcessManager {

	/**
	 * Logger
	 */
	private static Logger logger = LoggerFactory
			.getLogger(AbstractProcessManager.class);
	/**
	 * Process object
	 */
	protected ProcessObject inputProcessObject;
	/**
	 * Event manager
	 */
	protected EventManager eventManager;
	/**
	 * Default constructor.
	 */
	public AbstractProcessManager() {
	}
	/**
	 * Get input object.
	 */
	public ProcessObject getInputProcessObject() {
		return inputProcessObject;
	}
	/**
	 * Set input object.
	 */
	public void setInputProcessObject(ProcessObject inputProcessObject)
			throws Exception {
		this.inputProcessObject = inputProcessObject;
		// Make sure the event manager is set as appropriate
		// if (eventManager == null) {
		// // Get the event manager configured for the batch type
		// String logger =
		// PropertiesManager.getBatchProperty(inputProcessObject.getBatchType(),
		// PropertyConstants.EVENT_MANAGER);
		// if (logger == null || logger.trim().equals("")) {
		// logger = PropertyConstants.DEFAULT_EVENT_MGR;
		// }
		// try {
		// setEventManager(EventManagerFactory.getEventManager(logger));
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// }
	}
	/**
	 * Get event Manager
	 * @return EventManager
	 */
	public EventManager getEventManager() {
		return eventManager;
	}
	/**
	 * Set event Manager
	 * @param eventManager Event manager
	 */
	public void setEventManager(EventManager eventManager) {
		this.eventManager = eventManager;
	}
	/**
	 * Post event
	 * @param event The event.
	 * @exception
	 */
	public void postEvent(Event event) throws Exception {
	}
}
