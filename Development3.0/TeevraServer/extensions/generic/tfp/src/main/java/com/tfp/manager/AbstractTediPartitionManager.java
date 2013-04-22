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
 * $Id: AbstractTediPartitionManager.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 9, 2010 
 */

package com.tfp.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tedi.util.RandomGUID;

import com.headstrong.fusion.commons.FusionNormalizedMessage;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.tfp.interfaces.PartitionManager;
import com.tfp.interfaces.ProcessObject;

/**
 * TEDI Partition Manager abstract class.
 */
public abstract class AbstractTediPartitionManager extends
		AbstractProcessManager implements PartitionManager {

	private Logger logger = LoggerFactory
			.getLogger(AbstractTediPartitionManager.class);

	/**
	 * Default constructor required for factories.
	 */
	public AbstractTediPartitionManager() {
		super();
	}

	/**
	 * Begin processing.
	 * 
	 * @throws Exception
	 */
	public void beginProcessing() throws Exception {
	}

	/**
	 * End processing.
	 * 
	 * @throws Exception
	 */
	public void endProcessing() throws Exception {
	}

	/**
	 * Get next transaction.
	 * 
	 * @return
	 * @throws Exception
	 */
	public ProcessObject getNextTransaction() throws Exception {
		return null;
	}

	/**
	 * Send process object.
	 * 
	 * @param processObject
	 *            the process object.
	 * @throws Exception
	 */
	public void sendProcessObject(ProcessObject processObject) throws Exception {
		MessageExchange exchange = processObject.getEndpoint().createExchange();
		exchange.setIn(createMessage(processObject));
		processObject.getProcessor().process(exchange);
	}

	/**
	 * Create the message exchange out of the passed process object.
	 * 
	 * @param processObject
	 *            The process object.
	 * @return The process object.
	 */
	private NormalizedMessage createMessage(ProcessObject processObject) {
		NormalizedMessage message = new FusionNormalizedMessage();
		// set headers
		setProperty(message, "BatchID", processObject.getBatchID());
		setProperty(message, "BatchName", processObject.getBatchName());
		setProperty(message, "BatchType", processObject.getBatchType());
		setProperty(message, "FileName", processObject.getFileName());
		setProperty(message, "PartitionID", processObject.getPartitionID());
		setProperty(message, "PartitionType", processObject.getPartitionType());
		setProperty(message, "PayloadType", processObject.getPayloadType());
		setProperty(message, "SourceID", processObject.getSourceID());
		setProperty(message, "SourceTimestamp", processObject
				.getSourceTimestamp());
		setProperty(message, "TransactionID", processObject.getTransactionID());
		setProperty(message, "TransactionName", processObject
				.getTransactionName());
		setProperty(message, "TransactionType", processObject
				.getTransactionType());
		setProperty(message, "BatchSize", processObject.getBatchSize());
		setProperty(message, "PartitionSize", processObject.getPartitionSize());
		message.setBody(processObject.getPayload());
		message.setMessageId((new RandomGUID()).toString());
//		message.setMessageId(message.getHeader("BatchID").toString());
		return message;
	}

	/**
	 * Set the properties to the header of the message exchange.
	 * 
	 * @param message
	 *            The message exchange.
	 * @param key
	 *            The key.
	 * @param value
	 *            The value.
	 */
	private void setProperty(NormalizedMessage message, String key, Object value) {
		if (value != null) {
			message.setHeader(key, value);
		}
	}

	/**
	 * Send the transaction.
	 * 
	 * @param processObject
	 *            The process object.
	 * @throws Exception
	 */
	public void sendTransaction(ProcessObject processObject) throws Exception {
		sendProcessObject(processObject);
	}

	/**
	 * Process the partition. Generic template for processing the partition
	 */
	public void processPartition() throws Exception {
		logger.info("Processing partition.");
		// Make sure the input process is specified
		if (inputProcessObject != null) {
			beginProcessing();
			ProcessObject nextProcessObject;
			while ((nextProcessObject = getNextTransaction()) != null) {
				// Make sure the next transaction ID is set
				if (nextProcessObject.getTransactionID() == null) {
					nextProcessObject.setTransactionID((new RandomGUID()).toString());
				}
				sendTransaction(nextProcessObject);
			}
			endProcessing();
		} else {
			logger.error("No input process object provided");
		}
	}
}
