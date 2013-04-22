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
 * $Id: PartitionManagerFactory.java
 */
package com.tfp.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tfp.interfaces.PartitionManager;
import com.tfp.interfaces.ProcessObject;
import com.tfp.manager.PropertiesManager;

/**
 * This file is provided by MCH team for TFP integration.
 */
public class PartitionManagerFactory {

	private static Logger logger = LoggerFactory
			.getLogger(PartitionManagerFactory.class);

	/**
	 * Return the partition manager based on the process object.
	 * 
	 * @param processObject
	 *            The process object.
	 * @return The partition manager based on the process object.
	 * @throws Exception
	 */
	public static PartitionManager getPartitionManager(
			ProcessObject processObject) throws Exception {
		PartitionManager partitionManager = null;
		if (processObject != null) {
			
			String className = PropertiesManager.getSDMProperties().getPartitionManager();
			if (className != null && !className.trim().isEmpty()) {
				try {
					Class<?> manager = Class.forName(className);
					Object obj = manager.newInstance();
					partitionManager = (PartitionManager) obj;
					partitionManager.setInputProcessObject(processObject);
				} catch (Exception e) {
					String errStr = "Error instantiating class " + className;
					logger.error(errStr, e);
					throw new RuntimeException(errStr);
				}
			} else {
				String errStr = "No partition manager specified for batch type "
						+ processObject.getBatchType()
						+ ". Using "
						+ className;
				logger.error(errStr);
				throw new RuntimeException(errStr);
			}
		} else {
			String errStr = "Null input process object.";
			logger.error(errStr);
			throw new RuntimeException(errStr);
		}
		return partitionManager;
	}
}
