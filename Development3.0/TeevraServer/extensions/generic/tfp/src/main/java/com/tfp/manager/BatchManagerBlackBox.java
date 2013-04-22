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
 * $Id: BatchManagerBlackBox.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 9, 2010 
 */
package com.tfp.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tfp.factory.BatchManagerFactory;
import com.tfp.interfaces.BatchManager;
import com.tfp.interfaces.ProcessObject;

/**
 * This file is provided by MCH team for TFP integration.
 */
public class BatchManagerBlackBox {

	/**
	 * Logger
	 */
	private static Logger logger = LoggerFactory
			.getLogger(BatchManagerBlackBox.class);

	/**
	 * Processing of message
	 * 
	 * @param inputProcessObject
	 *            The Process Object
	 * @throws Exception
	 */
	public static void invokeBatchManager(ProcessObject inputProcessObject)
			throws Exception {
		if (inputProcessObject != null) {
			BatchManager batchManager = BatchManagerFactory
					.getBatchManager(inputProcessObject);
			batchManager.processBatch();
		} else {
			String errStr = "Null input process object.";
			logger.error(errStr);
			throw new RuntimeException(errStr);
		}
	}
}
