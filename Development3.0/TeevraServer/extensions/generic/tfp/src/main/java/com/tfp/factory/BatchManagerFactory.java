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
 * $Id: BatchManagerFactory.java
 */
package com.tfp.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tfp.interfaces.BatchManager;
import com.tfp.interfaces.ProcessObject;
import com.tfp.manager.PropertiesManager;
import com.tfp.manager.PropertyConstants;

/**
 * This file is provided by MCH team for TFP integration.
 */
public class BatchManagerFactory {

	private static Logger logger = LoggerFactory
			.getLogger(BatchManagerFactory.class);

	/**
	 * Return the batch manager based on the process object.
	 * 
	 * @param processObject
	 *            The process object.
	 * @return The batch manager based on the process object.
	 * @throws Exception
	 */
	public static BatchManager getBatchManager(ProcessObject processObject)
			throws Exception {
		BatchManager batchManager = null;
		if (processObject != null) {

			String className = PropertiesManager.getSDMProperties()
					.getBatchManager();

			if (className == null || className.trim().isEmpty()) {
				className = PropertyConstants.DEFAULT_BATCH_MANAGER;

				logger.info("No batch manager specified for batch type "
						+ processObject.getBatchType() + ". Using " + className);
			}
			try {
				Class<?> manager;
				manager = Class.forName(className);
				Object obj = manager.newInstance();
				batchManager = (BatchManager) obj;
				batchManager.setInputProcessObject(processObject);
			} catch (Exception e) {
				String errStr = "Error instantiating class " + className;
				logger.error(errStr, e);
				throw new RuntimeException(errStr);
			}
		} else {
			String errStr = "Null input process object.";
			logger.error(errStr);
			throw new RuntimeException(errStr);
		}
		return batchManager;
	}
}
