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
 * $Id: EventLogWriterFactory.java
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

import com.headstrong.fusion.eventlogger.writer.DBLogWriter;
import com.headstrong.fusion.eventlogger.writer.EventLogWriter;
import com.headstrong.fusion.eventlogger.writer.FileLogWriter;
import com.headstrong.fusion.eventlogger.writer.MQLogWriter;

/**
 * An implementation of factory pattern. It provides different event log writers
 * to the fusion framework
 */
public final class EventLogWriterFactory {

	private static final Logger logger = LoggerFactory
			.getLogger(EventLogWriterFactory.class);

	private static EventLogWriterFactory factory;
	private static BundleContext bundleContext;
	/**
	 * Map to store all the event log writers
	 */
	private static Map<EVENT_LOG_WRITERS, EventLogWriter> eventLogWriterMap = new HashMap<EVENT_LOG_WRITERS, EventLogWriter>();

	/**
	 * Event log writers supported by this factory
	 */
	public static enum EVENT_LOG_WRITERS {
		FILE, MQ, DB
	};

	/**
	 * Singleton implementation
	 */
	private EventLogWriterFactory() {

	}

	/**
	 * Creates a factory for event log writers
	 * 
	 * @precondition
	 * @postcondition
	 * @param context
	 */
	public static synchronized void createEventLogWriterFactory(
			BundleContext context) {
		if (factory == null) {
			logger.info("Creating event log writer factory");
			factory = new EventLogWriterFactory();
			bundleContext = context;
			init();
		}
	}

	private static void init() {
		eventLogWriterMap.put(EventLogWriterFactory.EVENT_LOG_WRITERS.FILE,
				new FileLogWriter());
		eventLogWriterMap.put(EventLogWriterFactory.EVENT_LOG_WRITERS.MQ,
				new MQLogWriter());
		eventLogWriterMap.put(EventLogWriterFactory.EVENT_LOG_WRITERS.DB,
				new DBLogWriter());
		if (logger.isDebugEnabled()) {
			logger.debug("Initialized event log writer map with :"
					+ eventLogWriterMap);
		}

	}

	/**
	 * @return the bundleContext
	 */
	public static BundleContext getBundleContext() {
		return bundleContext;
	}

	/**
	 * Returns the corresponding event log writer
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventLogWriter
	 * @return
	 */
	public static EventLogWriter getEventLogWriter(
			EVENT_LOG_WRITERS eventLogWriter) {
		return eventLogWriterMap.get(eventLogWriter);
	}

	/**
	 * Returns the corresponding event log writer type
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventLogWriter
	 * @return
	 */
	public static EventLogWriter getEventLogWriter(String eventLogWriterType) {
		return eventLogWriterMap.get(EVENT_LOG_WRITERS
				.valueOf(eventLogWriterType));
	}

}
