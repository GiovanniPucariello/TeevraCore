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
 * $Id: EventLoggerFactory.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.fusion.eventlogger.factory;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.impl.ComponentEventLogger;
import com.headstrong.fusion.eventlogger.impl.DefaultEventLogger;
import com.headstrong.fusion.eventlogger.impl.MessageEventLogger;
import com.headstrong.fusion.eventlogger.impl.MessageRecoveryLogger;
import com.headstrong.fusion.eventlogger.impl.ProcessAdminEventLogger;

/**
 * <code>EventLoggerFactory</code> is an implementation of the factory
 * pattern. It provides event loggers to the fusion framework.
 */
public final class EventLoggerFactory {
	private static final Logger logger = LoggerFactory
			.getLogger(EventLoggerFactory.class);
	private static EventLoggerFactory factory;
	private static BundleContext bundleContext;
	private static Map<EVENT_LOGGERS, EventLogger> eventLoggerMap = new HashMap<EVENT_LOGGERS, EventLogger>();

	/**
	 * EVENT_LOGGERS supported by this factory
	 */
	public static enum EVENT_LOGGERS {
		PROCESS_LOGGER, SESSION_ADMIN, MESSAGE_LOGGER, COMPONENT_LOGGER, MESSAGE_RECOVER_LOG, DEFAULT
	};

	/**
	 * It's singleton :-)
	 */
	private EventLoggerFactory() {

	}

	/**
	 * It creates the event logger factory.
	 * 
	 * @precondition
	 * @postcondition
	 * @param context
	 *            {@link BundleContext}
	 */
	public static synchronized void createEventLoggerFactory(
			BundleContext context) {
		if (factory == null) {
			logger.info("Creating event logger factory");
			factory = new EventLoggerFactory();
			bundleContext = context;
			init();
		}
	}

	/**
	 * @return the bundleContext
	 */
	public static BundleContext getBundleContext() {
		return bundleContext;
	}

	/**
	 * It initailizes the eventLogger map with the event loggers available to
	 * the factory. Factory will provide the same event logger from the map.
	 * 
	 * @precondition
	 * @postcondition
	 */
	private static void init() {
		EventLogger eventLogger = new DefaultEventLogger();
		eventLoggerMap.put(EventLoggerFactory.EVENT_LOGGERS.PROCESS_LOGGER,
				new ProcessAdminEventLogger());
		eventLoggerMap.put(EventLoggerFactory.EVENT_LOGGERS.MESSAGE_LOGGER,
				new MessageEventLogger());
		eventLoggerMap.put(EventLoggerFactory.EVENT_LOGGERS.COMPONENT_LOGGER,
				new ComponentEventLogger());
		eventLoggerMap.put(EventLoggerFactory.EVENT_LOGGERS.SESSION_ADMIN,
				eventLogger);
		eventLoggerMap.put(
				EventLoggerFactory.EVENT_LOGGERS.MESSAGE_RECOVER_LOG,
				new MessageRecoveryLogger());
		eventLoggerMap.put(EventLoggerFactory.EVENT_LOGGERS.DEFAULT,
				eventLogger);

		if (logger.isDebugEnabled()) {
			logger
					.debug("Initialized event logger map with :"
							+ eventLoggerMap);
		}

	}

	/**
	 * Returns the eventloggers corresponding to the eventLog passed.
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventLog
	 *            {@link EVENT_LOGGERS}
	 * @return {@link EventLogger}
	 */
	public static EventLogger getEventLogger(EVENT_LOGGERS eventLog) {
		return eventLoggerMap.get(eventLog);
	}

}
