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
 * $Id: EventLogQueue.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Jun 25, 2010 
 */

package com.headstrong.fusion.eventlogger.logmanager;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.eventlogger.beans.EventLogBean;

/**
 * Event log queue to store all the eventlogs
 */
public class EventLogQueue {

	/*
	 * 2 Jan 2013
	 * Karthikeyan Punniakrishnan
	 * Earlier, 'ArrayList' was used as the queue to store and process the messages.
	 * This was causing issues in multi-threading enviornment.
	 * 
	 * In this revision, 
	 * 'ArrayList' has been replaced by the 'LinkedBlockingQueue'
	 * Generic 'addBeanToQueue' and 'getBeanFromQueue' methods are added and will be used.
	 * If delay is observed while adding (which can happen when the queue is full - 
	 * producers are much faster than the consumer), then try increasing the capacity.  
	 */
	
	private static final Logger logger = LoggerFactory
			.getLogger(EventLogQueue.class);

	private static EventLogQueue eventlogQueue;
	private static BundleContext bundleContext;

	private static Map<EVENT_LOG_QUEUES, BlockingQueue<EventLogBean>> queueMap = new HashMap<EVENT_LOG_QUEUES, BlockingQueue<EventLogBean>>();

	/**
	 * Event log Queues supported by this factory
	 */
	public static enum EVENT_LOG_QUEUES {
		PROCESS_EVENTLOG, MESSAGE_EVENTLOG, COMPONENT_EVENTLOG, DEFAULT
	};

	/**
	 * Singleton Implementation
	 */
	private EventLogQueue() {

	}

	public static synchronized void createEventlogQueue(BundleContext context) {

		if (eventlogQueue == null) {
			logger.info("Creating EventLog queue");
			eventlogQueue = new EventLogQueue();
			bundleContext = context;
			init();
		}
	}

	private static void init() {
		//For Process EventLog queue, Less capcity is enough
		queueMap.put(EventLogQueue.EVENT_LOG_QUEUES.PROCESS_EVENTLOG,
				new LinkedBlockingQueue<EventLogBean>());
		queueMap.put(EventLogQueue.EVENT_LOG_QUEUES.MESSAGE_EVENTLOG,
				new LinkedBlockingQueue<EventLogBean>());
		queueMap.put(EventLogQueue.EVENT_LOG_QUEUES.COMPONENT_EVENTLOG,
				new LinkedBlockingQueue<EventLogBean>());
		queueMap.put(EventLogQueue.EVENT_LOG_QUEUES.DEFAULT,
				new LinkedBlockingQueue<EventLogBean>());
		if (logger.isDebugEnabled()) {
			logger.debug("Initialized event log queue map with :" + queueMap);
		}

	}

	/**
	 * @return the bundleContext
	 */
	public static BundleContext getBundleContext() {
		return bundleContext;
	}

	/**
	 * Returns the corresponding event log queue
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventlogQueues
	 * @return
	 */
	public static BlockingQueue<EventLogBean> getEventLogQueue(
			EVENT_LOG_QUEUES eventlogQueues) {
		return queueMap.get(eventlogQueues);
	}

	/**
	 * Updates the eventlog map
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventlogQueueType
	 * @param eventlogQueue
	 */
	public static void addEventLogQueue(EVENT_LOG_QUEUES eventlogQueueType,
			BlockingQueue<EventLogBean> eventlogQueue) {
		queueMap.put(eventlogQueueType, eventlogQueue);
		logger.debug("Eventlog bean is added to EventLogQueue");
	}

	/**
	 * Returns the corresponding event log queue
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventlogQueueType
	 * @return
	 */
	public static BlockingQueue<EventLogBean> getEventLogQueue(
			String eventlogQueueType) {
		return queueMap.get(EventLogQueue.EVENT_LOG_QUEUES
				.valueOf(eventlogQueueType));
	}

	/**
	 * Gives the size of the corresponding event log queue
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventlogQueues
	 * @return
	 */
	public static int getQueueSize(EVENT_LOG_QUEUES eventlogQueues) {
		return queueMap.get(eventlogQueues).size();
	}

	/**
	 * Tells if all the queues are empty
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	public static boolean isEmpty() {
		if (getQueueSize(EVENT_LOG_QUEUES.PROCESS_EVENTLOG) == 0
				&& getQueueSize(EVENT_LOG_QUEUES.MESSAGE_EVENTLOG) == 0
				&& getQueueSize(EVENT_LOG_QUEUES.COMPONENT_EVENTLOG) == 0) {
			return true;
		}

		return false;
	}
	
	/**
	 * Get the <code>head</code> message from the given queue. 
	 * This method will return <code>null</code> if the queue is empty.
	 * 
	 * @param eventlogQueues The queue from which the message has to be retrieved.
	 * @return <code>EventLogBean</code> or <code>null</code> if the queue is empty.
	 */
	public static EventLogBean getBeanFromQueue(EVENT_LOG_QUEUES eventlogQueues) {
		EventLogBean eventLogBean = queueMap.get(eventlogQueues).poll();
		return eventLogBean;
	}
	

	/**
	 * Add the message to the queue, waiting if necessary for space to become available.
	 * 
	 * @param eventlogQueues The queue to which the message has to be added.
	 * @param eventLogBean The message to be added
	 */
	public static void addBeanToQueue(EVENT_LOG_QUEUES eventlogQueues, EventLogBean eventLogBean) {
		try {
			queueMap.get(eventlogQueues).put(eventLogBean);
		} catch (InterruptedException e) {
			logger.error("Interrupted while adding Bean to Queue.. " + eventlogQueues);
		}
	}
}
