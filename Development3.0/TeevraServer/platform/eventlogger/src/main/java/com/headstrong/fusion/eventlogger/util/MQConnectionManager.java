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
 * $Id: MQConnectionManager.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 18, 2010 
 */

package com.headstrong.fusion.eventlogger.util;

import javax.jms.Connection;
import javax.jms.JMSException;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.commons.exception.FusionException;
import com.ibm.msg.client.jms.JmsConnectionFactory;
import com.ibm.msg.client.jms.JmsConstants;
import com.ibm.msg.client.jms.JmsFactoryFactory;
import com.ibm.msg.client.wmq.WMQConstants;

/**
 * Connect to the 'Active MQ'/'IBM MQ' for which the configurations are provided
 */
public class MQConnectionManager {

	private static Logger logger = LoggerFactory
			.getLogger(MQConnectionManager.class);

	private Connection conn;
	private BundleContext bundleContext;

	private boolean canCloseConn;

	/**
	 * Constructor which sets bundle context
	 * 
	 * @param context
	 * @throws FusionException
	 */
	public MQConnectionManager(BundleContext context) throws FusionException {
		this.bundleContext = context;
		connect();
	}

	/**
	 * Connects to the queue type provided
	 * 
	 * @precondition
	 * @postcondition
	 * @throws FusionException
	 */
	private void connect() throws FusionException {

		String providerType = bundleContext
				.getProperty(Properties.QUEUE_PROVIDER_TYPE);

		if (providerType != null || providerType.trim().length() != 0) {
			if (providerType.equals(Provider.activemq.toString())) {
				connectActiveMQ();
			} else if (providerType.equals(Provider.ibmmq.name().toString())) {
				connectIBMMQ();
			}
		}
	}

	/**
	 * Gets the connection for IBM MQ
	 * 
	 * @precondition
	 * @postcondition
	 * @throws FusionException
	 */
	private void connectIBMMQ() throws FusionException {
		logger.info("About to connect to IBM MQ");
		try {
			JmsFactoryFactory ff = JmsFactoryFactory
					.getInstance(JmsConstants.WMQ_PROVIDER);
			JmsConnectionFactory factory = ff.createConnectionFactory();
			factory.setStringProperty(WMQConstants.WMQ_QUEUE_MANAGER,
					bundleContext.getProperty(Properties.QUEUE_MANAGER));
			factory.setStringProperty(WMQConstants.WMQ_HOST_NAME, bundleContext
					.getProperty(Properties.JMS_BROKER_URL));
			factory.setIntProperty(WMQConstants.WMQ_PORT, Integer
					.parseInt(bundleContext.getProperty(Properties.PORT)));
			factory.setStringProperty(WMQConstants.WMQ_CHANNEL, bundleContext
					.getProperty(Properties.CHANNEL));
			conn = factory.createConnection(bundleContext
					.getProperty(Properties.USER_NAME), bundleContext
					.getProperty(Properties.PASSWORD));
		} catch (JMSException e) {
			logger.error("Error while creating connection with IBM MQ", e);
			throw new FusionException(
					"Error while creating connection with IBM MQ", e);
		}

	}

	/**
	 * Gets the connection for Active MQ
	 * 
	 * @precondition
	 * @postcondition
	 * @throws FusionException
	 */
	@SuppressWarnings("unchecked")
	private void connectActiveMQ() throws FusionException {
		logger.info("About to connect to Active MQ");

		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				bundleContext.getProperty(Properties.JMS_BROKER_URL));
		try {
			conn = connectionFactory.createConnection();
		} catch (JMSException e) {
			logger.error("Error while creating connection with Active MQ", e);
			throw new FusionException(
					"Error while creating connection with Active MQ", e);

		}

	}

	/**
	 * Enumeration for MQ provider types
	 */
	public static enum Provider {
		activemq {
			public String toString() {
				return "Active MQ";
			}
		},
		ibmmq {
			public String toString() {
				return "IBM MQ";
			}
		}
	}

	/**
	 * @return the conn
	 */
	public Connection getConnection() {
		return conn;
	}

	/**
	 * Closes connection
	 * 
	 * @precondition
	 * @postcondition
	 * @throws FusionException
	 */
	public void closeConnection() throws FusionException {
		if (conn != null && canCloseConn) {
			try {
				conn.close();
			} catch (JMSException e) {
				logger.error("Error while closing connection", e);
				throw new FusionException("Error while closing connection", e);
			}
		}
	}

	/**
	 * Tells if the connection can be closed
	 * 
	 * @precondition
	 * @postcondition
	 * @param val
	 */
	public void canCloseConnection(boolean val) {
		canCloseConn = val;
	}
}
