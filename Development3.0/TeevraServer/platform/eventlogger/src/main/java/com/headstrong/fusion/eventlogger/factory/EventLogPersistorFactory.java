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
 * $Id: EventLogPersistorFactory.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 15, 2010 
 */

package com.headstrong.fusion.eventlogger.factory;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.persistor.DBLogPersistor;
import com.headstrong.fusion.eventlogger.persistor.EventLogPersistor;
import com.headstrong.fusion.eventlogger.persistor.FileLogPersistor;
import com.headstrong.fusion.eventlogger.persistor.MQLogPersistor;

/**
 * An implementation of factory pattern. It provides different event log
 * persistors to the fusion framework
 */
public final class EventLogPersistorFactory {

	private static final Logger logger = LoggerFactory
			.getLogger(EventLogPersistorFactory.class);

	private static EventLogPersistorFactory factory;
	private static BundleContext bundleContext;
	/**
	 * Map to store all the event log persistors
	 */
	private static Map<EVENT_LOG_PERSISTORS, EventLogPersistor> eventLogPersistorMap = new HashMap<EVENT_LOG_PERSISTORS, EventLogPersistor>();

	/**
	 * Event log persistors supported by this factory
	 */
	public static enum EVENT_LOG_PERSISTORS {
		FILE, MQ, DB
	};

	/**
	 * Singleton implementation
	 */
	private EventLogPersistorFactory() {

	}

	/**
	 * Creates a factory for event log persistors
	 * 
	 * @precondition
	 * @postcondition
	 * @param context
	 */
	public static synchronized void createEventLogPersistorFactory(
			BundleContext context) throws FusionException {
		if (factory == null) {
			logger.info("Creating event log persistor factory");
			factory = new EventLogPersistorFactory();
			bundleContext = context;
			init();
		}
	}

	private static void init() throws FusionException {
		eventLogPersistorMap.put(
				EventLogPersistorFactory.EVENT_LOG_PERSISTORS.FILE,
				new FileLogPersistor(bundleContext));
		eventLogPersistorMap.put(
				EventLogPersistorFactory.EVENT_LOG_PERSISTORS.MQ,
				new MQLogPersistor(bundleContext));
		eventLogPersistorMap.put(
				EventLogPersistorFactory.EVENT_LOG_PERSISTORS.DB,
				new DBLogPersistor(bundleContext));
		if (logger.isDebugEnabled()) {
			logger.debug("Initialized event log persistor map with :"
					+ eventLogPersistorMap);
		}

	}

	/**
	 * @return the bundleContext
	 */
	public static BundleContext getBundleContext() {
		return bundleContext;
	}

	/**
	 * Returns the corresponding event log persistor
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventLogPersistor
	 * @return
	 */
	public static EventLogPersistor getEventLogPersistor(
			EVENT_LOG_PERSISTORS eventLogPersistor) {
		return eventLogPersistorMap.get(eventLogPersistor);
	}

	/**
	 * Returns the corresponding event log persistor type
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventLogPersistor
	 * @return
	 */
	public static EventLogPersistor getEventLogPersistor(
			String eventLogPersistorType) {
		return eventLogPersistorMap
				.get(EventLogPersistorFactory.EVENT_LOG_PERSISTORS
						.valueOf(eventLogPersistorType));
	}
}
