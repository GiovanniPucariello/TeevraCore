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
 * $Id: IBMMQProducer.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: July 24, 2009 
 */
package com.headstrong.fusion.connector.ibm.mq;

import java.io.Serializable;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.commons.component.FusionServiceSupport;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.connector.ibm.mq.config.ConfigurationUtil;
import com.headstrong.fusion.connector.ibm.mq.config.ConfigurationUtil.Config;

/**
 * IMB MQ producer. Sends message to Messaging queue.
 */
public class IBMMQProducer implements FusionProducer<MessageExchange> {

	private static final Logger logger = LoggerFactory
			.getLogger(IBMMQProducer.class);
	/**
	 * MQ connection.
	 */
	private Connection connection;
	/**
	 * JMS Session
	 */
	private Session session = null;
	/**
	 * JMS Message producer.
	 */
	private MessageProducer producer = null;
	/**
	 * {@link IBMMQEndpoint}
	 */
	private IBMMQEndpoint endpoint;

	/**
	 * @param ibmMqEndpoint
	 */
	public IBMMQProducer(IBMMQEndpoint ibmMqEndpoint) {
		this.endpoint = ibmMqEndpoint;
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

	@Override
	public void process(MessageExchange exchange) throws Exception {
		try {
			logger.debug("In process method");
			this.send(exchange);
		} catch (Exception e) {
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

	/**
	 * sends the message to IBM MQ queue.
	 * 
	 * @param exchange
	 * @throws Exception
	 */
	private void send(MessageExchange exchange) throws Exception {
		Message message = null;
		Object inMessage = exchange.getIn().getBody();
		if (inMessage instanceof String) {
			String messageBody = (String) exchange.getIn().getBody();
			logger.debug("inMessage is instanceof String");
			message = session.createTextMessage(messageBody);
		} else if (inMessage instanceof Serializable) {
			Serializable messageBody = (Serializable) exchange.getIn()
					.getBody();
			logger.debug("inMessage is instanceof Serializable");
			message = session.createObjectMessage(messageBody);
		} else {
			throw new Exception("unsupported message type."
					+ inMessage.getClass().getName());
		}
		boolean resend = false;
		if (producer != null) {
			try {
				logger.debug("Before using prodcuer.send(message)");
				producer.send(message);
			} catch (Exception ex) {
				resend = true;
			}
		} else {
			resend = true;
		}
		if (resend) {
			// try reconnecting .
			logger.debug("While trying to reconnect");
			this.connect();
			producer.send(message);
		}
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

	/**
	 * Creates a connection to IBM MQ.
	 * 
	 * @throws Exception
	 */
	private void connect() throws Exception {
		// initialize the producer.
		logger.debug("In connect() method");
		Connection connection = null;
		if (ConfigurationUtil.isPresent(this.getConfig(), Config.userName)) {
			logger
					.debug("If userName is provided in Config, creating connection");
			String encryptedPassword = ConfigurationUtil.getConfig(this.getConfig(), Config.password);
			
			if (!encryptedPassword.trim().equals("")) {
				connection = this.getEndpoint().getConnectionFactory()
				.createConnection(
						ConfigurationUtil.getConfig(this.getConfig(),
								Config.userName), FusionUtil.decrypt(encryptedPassword));
			} else {
				connection = this.getEndpoint().getConnectionFactory()
				.createConnection(
						ConfigurationUtil.getConfig(this.getConfig(),
								Config.userName), encryptedPassword);
			}
		} else {
			logger
					.debug("If userName is not provided in Config, creating connection");
			connection = this.getEndpoint().getConnectionFactory()
					.createConnection();
		}
		connection.start();
		this.setConnection(connection);
		logger.debug("Connection Successfull");
		session = this.getConnection().createSession(false,
				Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue(ConfigurationUtil
				.getConfig(this.getEndpoint().getBindingConfig(),
						Config.destination));
		logger.debug("Creating MessageProducer");
		producer = session.createProducer(destination);
	}

	@Override
	public void stop() throws Exception {
		this.producer.close();
		this.session.close();
		this.getConnection().close();
	}

	public IBMMQEndpoint getEndpoint() {
		return endpoint;
	}

	private BindingConfig getConfig() {
		return this.endpoint.getBindingConfig();
	}
}
