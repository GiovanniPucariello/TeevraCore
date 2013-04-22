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
 * $Id: EventManagerFactory.java
 */
package com.tfp.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tfp.event.EventManager;
import com.tfp.interfaces.ProcessObject;
import com.tfp.manager.PropertiesManager;
import com.tfp.manager.PropertyConstants;

/**
 * Event Manager Factory class. This file is provided by MCH team for TFP
 * integration.
 */
public class EventManagerFactory {

	private static Logger logger = LoggerFactory
			.getLogger(EventManagerFactory.class);

	/**
	 * Default constructor
	 */
	private EventManagerFactory() {
	}

	/**
	 * Return the default event manager.
	 * 
	 * @return The default event manager.
	 * @throws Exception
	 */
	public static EventManager getEventManager() throws Exception {
		return getEventManager(PropertyConstants.DEFAULT_EVENT_MGR);
	}

	/**
	 * Get the event manager associated with the passed ProcessObject.
	 * 
	 * @param processObject
	 *            The process object.
	 * @return The event manager associated with the passed ProcessObject.
	 * @throws Exception
	 */
	public static EventManager getEventManager(ProcessObject processObject)
			throws Exception {
		String className = PropertiesManager.getBatchProperty(processObject
				.getBatchType(), PropertyConstants.EVENT_MANAGER);
		return getEventManager(className);
	}

	/**
	 * Returns the corresponding EventManager instance based on className that
	 * was passed.
	 * 
	 * @param className
	 *            The class name.
	 * @return EventManager the event manager instance.
	 * @throws Exception
	 */
	public static EventManager getEventManager(String className)
			throws Exception {
		EventManager eventManager = null;

		try {
			Class<?> manager = Class.forName(className);
			Object obj = manager.newInstance();
			eventManager = (EventManager) obj;
		} catch (ClassNotFoundException e) {
			logger.error("Failed to load event manager. ", e);
			throw new Exception("Failed to load event manager.");
		} catch (InstantiationException e) {
			logger.error("Failed to load event manager. ", e);
			throw new Exception("Failed to load event manager.");
		} catch (IllegalAccessException e) {
			logger.error("Failed to load event manager. ", e);
			throw new Exception("Failed to load event manager.");
		}
		return eventManager;
	}
}
