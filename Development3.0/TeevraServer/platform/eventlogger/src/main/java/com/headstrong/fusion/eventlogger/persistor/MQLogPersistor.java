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
 * $Id: MQLogPersistor.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 15, 2010 
 */

package com.headstrong.fusion.eventlogger.persistor;

import java.beans.XMLDecoder;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.beans.ComponentEventLogBean;
import com.headstrong.fusion.eventlogger.beans.MessageEventLogBean;
import com.headstrong.fusion.eventlogger.beans.ProcessEventLogBean;
import com.headstrong.fusion.eventlogger.util.MQConnectionManager;

/**
 * An implementation of LogPersistor. It logs the events from temporary MQ
 * system to a relational database
 */
public class MQLogPersistor implements EventLogPersistor {

	private static final Logger logger = LoggerFactory
			.getLogger(MQLogPersistor.class);

	private static int delayTime = 5000;

	private static BundleContext context;

	/**
	 * variable to stop executing message eventlog persist thread
	 */
	private static volatile boolean stopMsgEventLogPersisting;
	/**
	 * variable to stop executing process eventlog persist thread
	 */
	private static volatile boolean stopPrcsEventLogPersisting;
	/**
	 * variable to stop executing component eventlog persist thread
	 */
	private static volatile boolean stopCompEventLogPersisting;

	public MQLogPersistor(BundleContext bundleContext) throws FusionException {
		context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.persistor.EventLogPersistor#persistProcessEventLogs()
	 */
	@Override
	public void persistProcessEventLogs() throws FusionException {
		String queueName = null;
		if (context.getProperty(Properties.PRCS_EVENTLOG_QUEUE) != null) {
			queueName = context.getProperty(Properties.PRCS_EVENTLOG_QUEUE)
					.trim();

		}
		logger.info("Starting MQ Process eventlog Persistor thread");
		PrcsEventlogService service = new PrcsEventlogService(queueName);
		Thread t = new Thread(service);
		t.start();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.persistor.EventLogPersistor#persistMessageEventLogs()
	 */
	@Override
	public void persistMessageEventLogs() throws FusionException {
		String queueName = null;
		if (context.getProperty(Properties.MSG_EVENTLOG_QUEUE) != null) {
			queueName = context.getProperty(Properties.MSG_EVENTLOG_QUEUE)
					.trim();

		}
		logger.info("Starting MQ Message eventlog Persistor thread");
		MsgEventlogService service = new MsgEventlogService(queueName);
		Thread t = new Thread(service);
		t.start();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.persistor.EventLogPersistor#persistComponentEventLogs()
	 */
	@Override
	public void persistComponentEventLogs() throws FusionException {
		String queueName = null;
		if (context.getProperty(Properties.COMP_EVENTLOG_QUEUE) != null) {
			queueName = context.getProperty(Properties.COMP_EVENTLOG_QUEUE)
					.trim();

		}
		logger.info("Starting MQ Component eventlog Persistor thread");
		CompEventlogService service = new CompEventlogService(queueName);
		Thread t = new Thread(service);
		t.start();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.persistor.EventLogPersistor#stopPersistProcessEventLogs()
	 */
	@Override
	public void stopPersistProcessEventLogs() throws FusionException {
		logger.info("Stopping process eventlog persistor thread stopped)");

		stopPrcsEventLogPersisting = true;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.persistor.EventLogPersistor#stopPersistMessageEventLogs()
	 */
	@Override
	public void stopPersistMessageEventLogs() throws FusionException {
		logger.info("Stopping message eventlog persistor thread stopped)");

		stopMsgEventLogPersisting = true;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.persistor.EventLogPersistor#stopPersistComponentEventLogs()
	 */
	@Override
	public void stopPersistComponentEventLogs() throws FusionException {
		logger.info("Stopping component eventlog persistor thread stopped)");

		stopCompEventLogPersisting = true;

	}

	/**
	 * Service for persisting message event logs to database
	 */
	private static class MsgEventlogService implements Runnable {

		private String queuename;

		public MsgEventlogService(String queueName) {
			this.queuename = queueName;
		}

		@Override
		public void run() {
			stopMsgEventLogPersisting = false;

			Connection conn = null;
			Session session = null;
			MessageConsumer consumer = null;
			try {
				consumer = getMQMessageConsumer(conn, session, queuename);
			} catch (FusionException e) {
				logger.error(
						"Error while creating message consumer for the queue:"
								+ queuename, e);
			}
			// HACK required to avoid ClassNotFoundException while
			// retrieving the Eventlogbean
			Thread.currentThread().setContextClassLoader(
					getClass().getClassLoader());

			while (!stopMsgEventLogPersisting) {
				// get the mesage and obtain a message in string format
				Object obj = null;
				try {
					obj = getEventlogObject(consumer);
				} catch (FusionException e) {
					logger
							.error(
									"Error while receiving and formatting a message from the queue",
									e);
				}
				// The message will be in serialized form. de-serialize it
				// and convert it to message eventlog bean
				persistObject(obj);
				try {
					Thread.sleep(delayTime);
				} catch (InterruptedException ex) {
					logger.debug("Message eventlog thread interrupted");
				}
			}
			try {
				releaseResources(conn, session, consumer);
			} catch (FusionException e) {
				logger.error("Error while closing MQ resources", e);
			}
		}

	}

	/**
	 * Service for persisting process event logs to database
	 */
	private static class PrcsEventlogService implements Runnable {

		private String queuename;

		public PrcsEventlogService(String queueName) {
			this.queuename = queueName;
		}

		@Override
		public void run() {
			stopPrcsEventLogPersisting = false;
			Connection conn = null;
			Session session = null;
			MessageConsumer consumer = null;
			try {
				consumer = getMQMessageConsumer(conn, session, queuename);
			} catch (FusionException e) {
				logger.error(
						"Error while creating message consumer for the queue:"
								+ queuename, e);
			}
			// HACK required to avoid ClassNotFoundException while
			// retrieving the Eventlogbean
			Thread.currentThread().setContextClassLoader(
					getClass().getClassLoader());

			while (!stopPrcsEventLogPersisting) {
				// get the mesage and obtain a message in string format
				Object obj = null;
				try {
					obj = getEventlogObject(consumer);
				} catch (FusionException e) {
					logger
							.error(
									"Error while receiving and formatting a message from the queue",
									e);
				}
				// The message will be in serialized form. de-serialize it
				// and convert it to process eventlog bean
				persistObject(obj);
				try {
					Thread.sleep(delayTime);
				} catch (InterruptedException ex) {
					logger.debug("Process eventlog thread interrupted");
				}

			}
			try {
				releaseResources(conn, session, consumer);
			} catch (FusionException e) {
				logger.error("Error while closing MQ resources", e);
			}
		}
	}

	/**
	 * Service for persisting component event logs to database
	 */
	private static class CompEventlogService implements Runnable {

		private String queuename;

		public CompEventlogService(String queueName) {
			this.queuename = queueName;
		}

		@Override
		public void run() {
			stopCompEventLogPersisting = false;

			Connection conn = null;
			Session session = null;
			MessageConsumer consumer = null;
			try {
				consumer = getMQMessageConsumer(conn, session, queuename);
			} catch (FusionException e) {
				logger.error(
						"Error while creating message consumer for the queue:"
								+ queuename, e);
			}
			// HACK required to avoid ClassNotFoundException while
			// retrieving the Eventlogbean
			Thread.currentThread().setContextClassLoader(
					getClass().getClassLoader());

			while (!stopCompEventLogPersisting) {
				// get the mesage and obtain a message in string format
				Object obj = null;
				try {
					obj = getEventlogObject(consumer);
				} catch (FusionException e) {
					logger
							.error(
									"Error while receiving and formatting a message from the queue",
									e);
				}
				// The message will be in serialized form. de-serialize it
				// and convert it to component eventlog bean
				persistObject(obj);
				try {
					Thread.sleep(delayTime);
				} catch (InterruptedException ex) {
					logger.debug("Component eventlog thread interrupted");
				}

			}
			try {
				releaseResources(conn, session, consumer);
			} catch (FusionException e) {
				logger.error("Error while closing MQ resources", e);
			}
		}
	}

	/**
	 * Gets the eventlog object using message consumer
	 * 
	 * @precondition
	 * @postcondition
	 * @param consumer
	 * @return
	 * @throws FusionException
	 */
	private static Object getEventlogObject(MessageConsumer consumer)
			throws FusionException {
		String message = getMessage(consumer);
		Object obj = createEventlogObject(message);
		return obj;
	}

	/**
	 * Gets the message consumer for the queue
	 * 
	 * @precondition
	 * @postcondition
	 * @param queuename
	 * @param conn
	 *            TODO
	 * @param session
	 *            TODO
	 * @return
	 * @throws FusionException
	 */
	private static MessageConsumer getMQMessageConsumer(Connection conn,
			Session session, String queuename) throws FusionException {
		// poll the queue and check if there are any logs
		// connect to MQ and send the message
		MQConnectionManager mqConnectivity = null;
		try {
			mqConnectivity = new MQConnectionManager(context);
		} catch (FusionException e) {
			logger.error("Error while obtaining Active MQ connection", e);
			throw new FusionException(
					"Error while obtaining Active MQ connection", e);
		}

		conn = mqConnectivity.getConnection();

		MessageConsumer consumer = null;
		try {
			conn.start();
			session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);

			Destination destination = session.createQueue(queuename);
			consumer = session.createConsumer(destination);
		} catch (JMSException e) {
			logger.error("Error while creating message consumer for the queue:"
					+ queuename, e);
			throw new FusionException(
					"Error while creating message consumer for the queue:"
							+ queuename, e);
		}
		return consumer;
	}

	/**
	 * Gets the string message after consuming a message from queue
	 * 
	 * @precondition
	 * @postcondition
	 * @param consumer
	 * @return
	 * @throws FusionException
	 */
	private static String getMessage(MessageConsumer consumer)
			throws FusionException {
		ObjectMessage objMsg = null;
		TextMessage txtMsg = null;
		String message = null;
		try {
			// receive a message
			Message msg = consumer.receive();
			if (msg instanceof ObjectMessage) {
				objMsg = (ObjectMessage) msg;
				message = (String) objMsg.getObject();
			} else if (msg instanceof TextMessage) {
				txtMsg = (TextMessage) msg;
				message = txtMsg.getText();
			}

		} catch (JMSException e) {
			logger
					.error(
							"Error while receiving and formatting a message from the queue",
							e);
			throw new FusionException(
					"Error while receiving and formatting a message from the queue",
					e);
		}
		return message;
	}

	/**
	 * Creates Eventlog bean from the serialized message
	 * 
	 * @precondition
	 * @postcondition
	 * @param message
	 * @return
	 * @throws FusionException
	 */
	private static Object createEventlogObject(String message)
			throws FusionException {
		Object obj = null;
		if (message != null) {
			logger.debug("Event log message received to persist: " + message);
			byte[] bytes;
			try {
				bytes = message.toString().getBytes("UTF-8");
				ByteArrayInputStream io = new ByteArrayInputStream(bytes);
				XMLDecoder decoder = new XMLDecoder(io);
				obj = decoder.readObject();

			} catch (UnsupportedEncodingException e) {
				logger
						.error("Error while generating process event log bean",
								e);
				throw new FusionException(
						"Error while generating process event log bean", e);
			}
		} else {
			logger.info("No Message Found");
		}
		return obj;
	}

	/**
	 * Persists the object by edlegating to DBPersistor
	 * 
	 * @precondition
	 * @postcondition
	 * @param obj
	 */
	private static void persistObject(Object obj) {
		if (obj != null) {
			try {
				DBPersistor persistor = new DBPersistor();
				persistor.persistEventLogBean(obj);
			} catch (FusionException e) {
				logger
						.error(
								"Error while instantiating DBPersistor and persisting to database",
								e);
			}
		} else {
			logger.info("Object received is null");
		}

	}

	/**
	 * Releases JMS queue resources
	 * 
	 * @precondition
	 * @postcondition
	 * @param conn
	 * @param session
	 * @param consumer
	 * @throws FusionException
	 */
	private static void releaseResources(Connection conn, Session session,
			MessageConsumer consumer) throws FusionException {
		try {
			if (consumer != null) {
				consumer.close();
			}
			if (session != null) {
				session.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (JMSException e) {
			logger.error("Error while closing MQ resources", e);
			throw new FusionException("Error while closing MQ resources", e);
		}

	}
}
