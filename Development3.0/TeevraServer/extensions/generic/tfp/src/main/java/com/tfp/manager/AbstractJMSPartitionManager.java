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
 * $Id: AbstractJMSPartitionManager.java
 */
package com.tfp.manager;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tfp.interfaces.PartitionManager;
import com.tfp.interfaces.ProcessObject;

import tedi.util.RandomGUID;

/**
 * This class is for JMS connectivity. This file is provided by MCH team for TFP
 * integration.
 */
public abstract class AbstractJMSPartitionManager extends
		AbstractProcessManager implements PartitionManager {

	/**
	 * JMS JNDI name
	 */
	protected String jmsJndiName = null;
	/**
	 * JMS cf name
	 */
	protected String jmsCfName = null;
	/**
	 * JMS context
	 */
	protected Context jmsContext = null;
	/**
	 * Connection factory
	 */
	protected ConnectionFactory jmsCf;
	/**
	 * JMS session
	 */
	protected Session jmsSession;
	/**
	 * JMS connection
	 */
	protected Connection jmsConnection;
	/**
	 * JMS producer
	 */
	protected MessageProducer jmsProducer = null;
	/**
	 * JMS destination
	 */
	protected Destination jmsDestination = null;
	/**
	 * Logger
	 */
	private static Logger logger = LoggerFactory
			.getLogger(AbstractJMSPartitionManager.class);

	/**
	 * Default constructor required for factories
	 */
	public AbstractJMSPartitionManager() {
		super();
	}

	/**
	 * Begins the processing
	 * 
	 * @throws Exception
	 */
	public void beginProcessing() throws Exception {
		// Get the JNDI
		jmsJndiName = PropertiesManager.getBatchProperty(inputProcessObject
				.getBatchType(), PropertyConstants.TRANSACTION_JNDI);
		if (jmsJndiName == null || jmsJndiName.trim().isEmpty()) {

			String noJNDIErrStr = "No JMS JNDI specified for transactions for batch type "
					+ inputProcessObject.getBatchType();
			logger.error(noJNDIErrStr);
			throw new RuntimeException(noJNDIErrStr);
		}
		// Get the connection factory
		jmsCfName = PropertiesManager.getBatchProperty(inputProcessObject
				.getBatchType(), PropertyConstants.TRANSACTION_CONNFACTORY);
		if (jmsCfName == null || jmsCfName.trim().isEmpty()) {

			String noJMSConnErrStr = "No JMS connection factory specified for transactions for batch type "
					+ inputProcessObject.getBatchType();
			logger.error(noJMSConnErrStr);
			throw new RuntimeException(noJMSConnErrStr);
		}
		// Open the JMS resources
		try {
			jmsContext = new InitialContext();
			jmsCf = (ConnectionFactory) jmsContext.lookup(jmsCfName);
			jmsConnection = jmsCf.createConnection();
			jmsSession = jmsConnection.createSession(false,
					Session.AUTO_ACKNOWLEDGE);
			jmsDestination = (Destination) jmsContext.lookup(jmsJndiName);
			jmsProducer = jmsSession.createProducer(jmsDestination);
		} catch (Exception e) {
			String errStr = "Error opening JMS producer for JNDI "
					+ jmsJndiName + " and connection factory " + jmsCfName
					+ " for batch type " + inputProcessObject.getBatchType();
			logger.error(errStr, e);
			throw new RuntimeException(errStr);
		}
	}

	/**
	 * End processing
	 * 
	 * @throws Exception
	 */
	public void endProcessing() throws Exception {
		// Close down the JMS resources
		if (jmsProducer != null) {
			jmsProducer.close();
			logger.info("JMS Producer is closed.");
		}
		if (jmsSession != null) {
			jmsSession.close();
			logger.info("JMS Session is closed.");
		}
		if (jmsConnection != null) {
			jmsConnection.close();
			logger.info("JMS Connection is closed.");
		}
	}

	/**
	 * No default implementation; must be overridden by specific subclass.
	 */
	public ProcessObject getNextTransaction() throws Exception {
		return null;
	}

	/**
	 * Send the process object.
	 * 
	 * @param processObject
	 *            The object.
	 * @throws Exception
	 */
	public void sendProcessObject(ProcessObject processObject) throws Exception {
		ObjectMessage objectMessage = jmsSession.createObjectMessage();
		objectMessage.setObject(processObject);
		jmsProducer.send(objectMessage);
	}

	/**
	 * Send transaction.
	 * 
	 * @param processObject
	 * @throws Exception
	 */
	public void sendTransaction(ProcessObject processObject) throws Exception {
		logger.info(processObject.toString());
		sendProcessObject(processObject);
	}

	/**
	 * Generic template for processing the partition.
	 * 
	 * @throws Exception
	 */
	public void processPartition() throws Exception {

		// Make sure the input process is specified
		if (inputProcessObject != null) {
			beginProcessing();
			ProcessObject nextProcessObject;
			while ((nextProcessObject = getNextTransaction()) != null) {
				// Make sure the next transaction ID is set
				if (nextProcessObject.getTransactionID() == null) {
					nextProcessObject.setTransactionID((new RandomGUID())
							.toString());
				}
				sendTransaction(nextProcessObject);
			}
			endProcessing();
		} else {
			logger.error("No input process object provided");
		}
	}
}
