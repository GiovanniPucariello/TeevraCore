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
 * $Id: GenericBatchManager.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 9, 2010 
 */
package com.tfp.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tfp.factory.PartitionManagerFactory;
import com.tfp.interfaces.BatchManager;
import com.tfp.interfaces.PartitionManager;
import com.tfp.interfaces.ProcessObject;

import tedi.util.RandomGUID;

/**
 * This file is provided by MCH team for TFP integration.
 */
public class GenericBatchManager extends AbstractProcessManager implements
		BatchManager {

	/**
	 * Logger
	 */
	private static Logger logger = LoggerFactory
			.getLogger(GenericBatchManager.class);

	/**
	 * Used for default getNextPartition() implementation.
	 */
	protected boolean isProcessed = false;

	/**
	 * Default constructor needed for factory.
	 */
	public GenericBatchManager() {
		super();
	}

	@Override
	public void setInputProcessObject(ProcessObject inputProcessObject)
			throws Exception {
		super.setInputProcessObject(inputProcessObject);
		// Make sure the batch ID is set
		String batchID = this.getInputProcessObject().getBatchID();
		if (batchID == null || batchID.trim().equals("")) {
			batchID = (new RandomGUID()).toString();
			this.inputProcessObject.setBatchID(batchID);
		}
	}

	public void beginProcessing() throws Exception {
	}

	public void endProcessing() throws Exception {
	}

	/**
	 * @return Default implementation assumes 1 partition containing the entire
	 *         batch.
	 */
	public ProcessObject getNextPartition() throws Exception {
		if (isProcessed) {
			return null;
		} else {
			isProcessed = true;
			return inputProcessObject;
		}
	}

	/**
	 * Current implementation just redirects to PartitionManager POJO.
	 * 
	 * @param processObject
	 * @throws Exception
	 */
	public void sendPartition(ProcessObject processObject) throws Exception {
		PartitionManager partitionManager = PartitionManagerFactory
				.getPartitionManager(processObject);
		partitionManager.processPartition();
	}

	/**
	 * Default batch process template.
	 */
	public void processBatch() throws Exception {
		logger.info("Processing batch.");
		if (inputProcessObject != null) {
			beginProcessing();
			ProcessObject nextProcessObject;
			while ((nextProcessObject = getNextPartition()) != null) {
				// Make sure the next partition ID is set
				if (nextProcessObject.getPartitionID() == null) {
					nextProcessObject.setPartitionID((new RandomGUID())
							.toString());
				}
				sendPartition(nextProcessObject);
			}
			endProcessing();
		} else {
			String errStr = "No input process object provided.";
			logger.error(errStr);
			throw new RuntimeException(errStr);
		}
	}
}
