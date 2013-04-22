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
 * $Id: EventLogManager.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Jun 24, 2010 
 */

package com.headstrong.fusion.eventlogger.logmanager;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.beans.ComponentEventLogBean;
import com.headstrong.fusion.eventlogger.beans.DefaultEventLogBean;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;
import com.headstrong.fusion.eventlogger.beans.MessageEventLogBean;
import com.headstrong.fusion.eventlogger.beans.ProcessEventLogBean;
import com.headstrong.fusion.eventlogger.factory.EventLogWriterFactory;
import com.headstrong.fusion.eventlogger.logmanager.EventLogQueue.EVENT_LOG_QUEUES;
import com.headstrong.fusion.eventlogger.writer.EventLogWriter;

/**
 * Log Manager takes the event log messages and forwards them to respective
 * storage locations
 */
public class EventLogManager {

	/*
	 * 2 Jan 2013
	 * Karthikeyan Punniakrishnan
	 * Earlier, 'ArrayList' was used as the queue to store and process the messages.
	 * This was causing issues in multi-threading enviornment.
	 * 
	 * In this revision, 
	 * The queue implementation is hidden and only the generic 'add' and 'get' methods are used.
	 * The queue retrieval algo has been changed a bit. 
	 * The delay has been reduced from 5000 to 500.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(EventLogManager.class);

	private static int delayTime = 500;

	private static volatile Boolean stopEventLogging;

	private static BundleContext context = EventLogQueue.getBundleContext();

	/**
	 * Writes the event logs to in memory
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventlogBean
	 * @throws FusionException
	 */
	public static void writeToQueue(EventLogBean eventlogBean)
			throws FusionException {
		logger.debug("Inside writeToQueue method of EventLogManager");
		if (eventlogBean instanceof ProcessEventLogBean) {
			logger.debug("About to add ProcessEventLogBean to EventLogQueue");
			EventLogQueue.addBeanToQueue(EVENT_LOG_QUEUES.PROCESS_EVENTLOG, eventlogBean);
		} else if (eventlogBean instanceof MessageEventLogBean) {
			logger.debug("About to add MessageEventLogBean to EventLogQueue");
			EventLogQueue.addBeanToQueue(EVENT_LOG_QUEUES.MESSAGE_EVENTLOG, eventlogBean);
		} else if (eventlogBean instanceof ComponentEventLogBean) {
			logger.debug("About to add ComponentEventLogBean to EventLogQueue");
			EventLogQueue.addBeanToQueue(EVENT_LOG_QUEUES.COMPONENT_EVENTLOG, eventlogBean);
		} else {
			logger.debug("About to add Default EventLogBean to EventLogQueue");
			EventLogQueue.addBeanToQueue(EVENT_LOG_QUEUES.DEFAULT, eventlogBean);
		}
	}

	/**
	 * Logs the events to temporary storage
	 * 
	 * @precondition
	 * @postcondition
	 * @throws FusionException
	 */
	public static void logEvents() throws FusionException {
		// log all available eventlogs from in-memory queues
		logger
				.info("Starting EventlogService thread log all available eventlogs from in-memory queues");
		EventlogService evntLogService = new EventlogService();
		Thread evntLogT = new Thread(evntLogService);
		evntLogT.start();
	}

	public static void stopLogEvents() throws FusionException {
		stopEventLogging = true;
	}

	/**
	 * Service for logging Process event logs
	 */
	private static class EventlogService implements Runnable {
		@Override
		public void run() {
			logger.debug("EventlogService Thread started");
			stopEventLogging = false;

			EventLogWriter logWriter = getEventlogWriter();

			while (!EventLogQueue.isEmpty() || !stopEventLogging) {
				logger.debug("About to log process events");
				logProcessEvents(logWriter);
				logger.debug("About to log message events");
				logMessageEvents(logWriter);
				logger.debug("About to log component events");
				logComponentEvents(logWriter);
				logger.debug("About to log default events");
				logDefaultEvents(logWriter);

				try {
					Thread.sleep(delayTime);
				} catch (InterruptedException ex) {
					logger.debug("EventlogService thread interrupted");
				}
			}

		}

		/**
		 * Logs all the process events in the queue
		 * 
		 * @precondition
		 * @postcondition
		 * @param logWriter
		 */
		private static void logProcessEvents(EventLogWriter logWriter) {
			int size = EventLogQueue.getQueueSize(EVENT_LOG_QUEUES.PROCESS_EVENTLOG);
			if(size <= 0) {
				return;
			}
			
			//Get 'size' number of messages from queue and process
			for (int i = 0; i < size; i++) {
				ProcessEventLogBean prcsEventLogBean = (ProcessEventLogBean) EventLogQueue
						.getBeanFromQueue(EVENT_LOG_QUEUES.PROCESS_EVENTLOG);
				if (prcsEventLogBean == null) {
					break;
				}
				logger.debug("EventLogManager about to write prcsEventLogBean");
				try {
					logWriter.write(prcsEventLogBean, context);
				} catch (FusionException e) {
					logger.error("Error While writing the event log bean ", e);
				}
			}
		}
	

		/**
		 * Logs all the message events in the queue
		 * 
		 * @precondition
		 * @postcondition
		 * @param logWriter
		 */
		private static void logMessageEvents(EventLogWriter logWriter) {
			int size = EventLogQueue.getQueueSize(EVENT_LOG_QUEUES.MESSAGE_EVENTLOG);
			if(size <= 0) {
				return;
			}
			
			//Get 'size' number of messages from queue and process
			for (int i = 0; i < size; i++) {
				MessageEventLogBean msgEventLogBean = (MessageEventLogBean) EventLogQueue
						.getBeanFromQueue(EVENT_LOG_QUEUES.MESSAGE_EVENTLOG);
				if (msgEventLogBean == null) {
					return;
				}
				logger.debug("EventLogManager about to write msgEventLogBean");
				try {
					logWriter.write(msgEventLogBean, context);
				} catch (FusionException e) {
					logger.error("Error While writing the event log bean ", e);
				}
			}
		}

		/**
		 * Logs all the component events in the queue
		 * 
		 * @precondition
		 * @postcondition
		 * @param logWriter
		 */
		private static void logComponentEvents(EventLogWriter logWriter) {
			int size = EventLogQueue.getQueueSize(EVENT_LOG_QUEUES.COMPONENT_EVENTLOG);
			if(size <= 0) {
				return;
			}
			
			//Get 'size' number of messages from queue and process
			for (int i = 0; i < size; i++) {
				ComponentEventLogBean compEventLogBean = (ComponentEventLogBean) EventLogQueue
						.getBeanFromQueue(EVENT_LOG_QUEUES.COMPONENT_EVENTLOG);
				if (compEventLogBean == null) {
					return;
				}
				logger.debug("EventLogManager about to write compEventLogBean");
				try {
					logWriter.write(compEventLogBean, context);
				} catch (FusionException e) {
					logger.error("Error While writing the event log bean ", e);
				}
			}
		}

		/**
		 * Logs all the default events in the queue
		 * 
		 * @precondition
		 * @postcondition
		 * @param logWriter
		 */
		private static void logDefaultEvents(EventLogWriter logWriter) {
			int size = EventLogQueue.getQueueSize(EVENT_LOG_QUEUES.DEFAULT);
			if(size <= 0) {
				return;
			}
			
			//Get 'size' number of messages from queue and process
			for (int i = 0; i < size; i++) {
				DefaultEventLogBean defaultEventLogBean = (DefaultEventLogBean) EventLogQueue
						.getBeanFromQueue(EVENT_LOG_QUEUES.DEFAULT);
				if (defaultEventLogBean == null) {
					return;
				}
				logger.debug("EventLogManager about to write defaultEventLogBean");
				try {
					logWriter.write(defaultEventLogBean, context);
				} catch (FusionException e) {
					logger.error("Error While writing the event log bean ", e);
				}
			}
		}
	
		/**
		 * Returns Eventlog writer
		 * 
		 * @precondition
		 * @postcondition
		 * @return
		 */
		private static EventLogWriter getEventlogWriter() {
			return EventLogWriterFactory.getEventLogWriter(context
					.getProperty(Properties.EVENT_LOG_STORAGE));
		}
	}
}
