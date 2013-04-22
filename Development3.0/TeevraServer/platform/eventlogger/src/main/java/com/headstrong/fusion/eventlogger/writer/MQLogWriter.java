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
 * $Id: MQLogWriter.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 15, 2010 
 */

package com.headstrong.fusion.eventlogger.writer;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.beans.ComponentEventLogBean;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;
import com.headstrong.fusion.eventlogger.beans.MessageEventLogBean;
import com.headstrong.fusion.eventlogger.beans.ProcessEventLogBean;
import com.headstrong.fusion.eventlogger.logformatters.MQLogMessageFormatter;
import com.headstrong.fusion.eventlogger.util.MQConnectionManager;

/**
 * An implementation of EventLogWriter. It logs the events logged by EventLogger
 * to a MQ system
 */
public class MQLogWriter implements EventLogWriter {

	private static final Logger logger = LoggerFactory
			.getLogger(MQLogWriter.class);

	private BundleContext context;

	protected static final String default_eventlog_queue = "default_eventlog";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.writer.EventLogWriter#log(com.headstrong.fusion.eventlogger.beans.MessageEventLogBean)
	 */
	@Override
	public synchronized void write(EventLogBean eventLogBean,
			BundleContext context) throws FusionException {
		logger.debug("Log write started : " + eventLogBean);

		this.context = context;
		// HACK required to avoid ClassNotFoundException while
		// retrieving the Eventlogbean
		Thread.currentThread().setContextClassLoader(
				getClass().getClassLoader());

		// create the message
		String logMessage = MQLogMessageFormatter
				.formatLogMessage(eventLogBean);

		// get the queue name for logging
		String queueName = getQueueName(eventLogBean);

		// connect to MQ and send the message
		MQConnectionManager mqConnectivity = new MQConnectionManager(context);

		Connection conn = mqConnectivity.getConnection();
		try {
			conn.start();

			Session session = conn.createSession(false,
					Session.AUTO_ACKNOWLEDGE);

			Destination destination = session.createQueue(queueName);

			MessageProducer producer = session.createProducer(destination);
			TextMessage message = session.createTextMessage(logMessage);
			producer.send(message);

			producer.close();
			session.close();
			conn.close();

		} catch (JMSException e) {
			logger
					.error(
							"Error while creating a connection and a message produxer to MQ ",
							e);
			throw new FusionException(
					"Error while creating a connection and a message produxer to MQ ",
					e);
		}

	}

	/**
	 * Gets the name of the queue to log the events based on the event log bean
	 * provided to the event log writer
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventLogBean
	 * @return
	 */
	private String getQueueName(EventLogBean eventLogBean) {
		String queueName = null;
		if (eventLogBean instanceof MessageEventLogBean) {
			if (context.getProperty(Properties.MSG_EVENTLOG_QUEUE) != null) {
				queueName = context.getProperty(Properties.MSG_EVENTLOG_QUEUE)
						.trim();

			}
		} else if (eventLogBean instanceof ProcessEventLogBean) {
			if (context.getProperty(Properties.PRCS_EVENTLOG_QUEUE) != null) {
				queueName = context.getProperty(Properties.PRCS_EVENTLOG_QUEUE)
						.trim();

			}
		} else if (eventLogBean instanceof ComponentEventLogBean) {
			if (context.getProperty(Properties.COMP_EVENTLOG_QUEUE) != null) {
				queueName = context.getProperty(Properties.COMP_EVENTLOG_QUEUE)
						.trim();

			}
		} else {
			queueName = default_eventlog_queue;
		}
		return queueName;
	}
}
