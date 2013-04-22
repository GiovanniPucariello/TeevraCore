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
 * $Id: IBMMQConsumer.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 29, 2009 
 */

package com.headstrong.fusion.connector.ibm.mq;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;

import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionServiceSupport;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.connector.ibm.mq.config.ConfigurationUtil;
import com.headstrong.fusion.connector.ibm.mq.config.ConfigurationUtil.Config;

/**
 * IBM MQ default consumer.
 */
public class IBMMQConsumer implements FusionConsumer<MessageExchange> {

	private static Logger logger = LoggerFactory.getLogger(IBMMQConsumer.class);
	/**
	 * JMS Session
	 */
	private Session session = null;
	/**
	 * Message Consumer.
	 */
	private MessageConsumer consumer = null;
	/**
	 * JMS Connection.
	 */
	private Connection connection;

	/**
	 * Fusion endpoint
	 */
	private IBMMQEndpoint endPoint;

	/**
	 * processor in pipeline.
	 */
	private FusionProcessor processor;

	/**
	 * @param endpoint
	 * @param processor
	 */
	public IBMMQConsumer(IBMMQEndpoint endpoint, FusionProcessor processor) {
		this.endPoint = endpoint;
		this.processor = processor;

	}

	/**
	 * @return the connection
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * @param connection
	 *            the connection to set
	 */
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	/**
	 * @return the session
	 */
	public Session getSession() {
		return session;
	}

	/**
	 * @param session
	 *            the session to set
	 */
	public void setSession(Session session) {
		this.session = session;
	}

	/**
	 * @return the consumer
	 */
	public MessageConsumer getConsumer() {
		return consumer;
	}

	/**
	 * @param consumer
	 *            the consumer to set
	 */
	public void setConsumer(MessageConsumer consumer) {
		this.consumer = consumer;
	}

	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {
		// NA
	}

	@Override
	public void start() throws Exception {
		try {
			logger.debug("In start() method");
			this.connect();
		} catch (Exception e) {
			logger.debug("Couldn't establish Connection");
			if (this.getConfig().getErrorHandler() != null) {
				BindingConfig bindingConfig = this.getConfig();
				ErrorHandler errorHandler = bindingConfig.getErrorHandler();
				try {
					FusionUtil.handleError(errorHandler, bindingConfig
							.getProcessId(), bindingConfig.getServiceId(),
							"System", "IBMMQComponent", e, null, null, true);
				} catch (FusionException ex) {
					logger.error(
							"Error handling the error using error handler", ex);
					throw e;
				}
			} else {
				throw e;
			}
		}
	}

	private void connect() throws Exception {
		// initialize the producer.
		logger.debug("In connect() method");
		Connection connection = null;
		if (ConfigurationUtil.isPresent(this.getConfig(), Config.userName)) {
			logger
					.debug("If userName is provided in Config, creating connection");
			
			String encryptedPassword = ConfigurationUtil.getConfig(this.getConfig(), Config.password);
			
			if (!encryptedPassword.trim().equals("")) {
				connection = this.getEndPoint().getConnectionFactory()
				.createConnection(
						ConfigurationUtil.getConfig(this.getConfig(),
								Config.userName),
								FusionUtil.decrypt(encryptedPassword)
								);
			} else {
				connection = this.getEndPoint().getConnectionFactory()
				.createConnection(
						ConfigurationUtil.getConfig(this.getConfig(),
								Config.userName), encryptedPassword
								);
			}
		} else {
			logger
					.debug("If userName is not provided in Config, creating connection");
			connection = this.getEndPoint().getConnectionFactory()
					.createConnection();
		}
		this.setConnection(connection);
		this.getConnection().start();
		logger.debug("Connection Successfull");
		this.setSession(this.getConnection().createSession(false,
				Session.AUTO_ACKNOWLEDGE));
		Destination destination = this.getSession().createQueue(
				ConfigurationUtil.getConfig(this.getEndPoint()
						.getBindingConfig(), Config.destination));
		this.setConsumer(this.getSession().createConsumer(destination));
		this.getConsumer().setMessageListener(
				new IBMMQMessageListener(this.getEndPoint(), this
						.getProcessor()));
	}

	@Override
	public void stop() throws Exception {
		this.consumer.close();
		this.connection.close();
	}

	public IBMMQEndpoint getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(IBMMQEndpoint endPoint) {
		this.endPoint = endPoint;
	}

	public FusionProcessor getProcessor() {
		return processor;
	}

	public void setProcessor(FusionProcessor processor) {
		this.processor = processor;
	}

	private BindingConfig getConfig() {
		return this.endPoint.getBindingConfig();
	}
}