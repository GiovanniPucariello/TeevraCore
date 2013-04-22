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
 * $Id: TFPConfiguration.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.connector.tfp.config;

import java.io.File;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.tfp.manager.PropertyConstants;

public class TFPConfiguration {

	/**
	 * Path of input file to split
	 */
	private String inputDirectory;

	/**
	 * Files in the input directory
	 */
	private File[] filesToProcess;

	/**
	 * Batch Type.
	 */
	private String batchType;

	/**
	 * Source file name
	 */
	private String sourceFileName;
	
	/**
	 * Source file name
	 */
	private long pollingDelay;

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(TFPConfiguration.class);

	/**
	 * Default COnstructor
	 */
	public TFPConfiguration() {

	}

	/**
	 * Constructor, sets all the configuration properties of the connector
	 * 
	 * @param properties
	 *            Properties to initialize the configuration.
	 */
	public TFPConfiguration(Map<String, String> properties) throws Exception {

		String inputDir = properties.get("inputDirectory");
		if (inputDir != null && !inputDir.trim().equals("")) {
			this.inputDirectory = inputDir;
		} else {
			String errStr = "Invalid input directory.";
			logger.error(errStr);
			throw new InitializationException(errStr);
		}

		String srcFileName = properties.get("srcFileName");
		if (srcFileName != null && !srcFileName.trim().equals("")) {
			this.sourceFileName = srcFileName;
		} else {
			String errStr = "Invalid source name.";
			logger.error(errStr);
			throw new InitializationException(errStr);
		}
		
		String pollingDelay = properties.get("delay");
		if (pollingDelay != null && !pollingDelay.trim().equals("")) {
			this.pollingDelay = Long.parseLong(pollingDelay);
		} else {
			this.pollingDelay = Long.parseLong("1");
		}

		// This can be made configurable to support future scope.
		this.batchType = PropertyConstants.SDM_BATCH_TYPE;
	}

	/**
	 * @return the inputDirectory
	 */
	public String getInputDirectory() {
		return inputDirectory;
	}

	/**
	 * @param inputDirectory
	 *            the inputDirectory to set
	 */
	public void setInputDirectory(String inputDirectory)
			throws RuntimeException {

		if (inputDirectory != null && !inputDirectory.trim().equals("")) {
			this.inputDirectory = inputDirectory;
		} else {
			String errStr = "Invalid input directory.";
			logger.error(errStr);
			throw new RuntimeException(errStr);
		}
	}

	/**
	 * @return the filesToProcess
	 */
	public File[] getFilesToProcess() {
		return filesToProcess;
	}

	/**
	 * @param filesToProcess
	 *            the files to be processed are set
	 */
	public void setFilesToProcess(File[] filesToProcess) {
		this.filesToProcess = filesToProcess;
	}

	/**
	 * Fetch batch type
	 * 
	 * @return The batch type
	 */
	public String getBatchType() {
		return batchType;
	}

	/**
	 * Set the batch type to this configuration.
	 * 
	 * @param batchType
	 *            The batch type.
	 */
	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

	/**
	 * Fetch source file name
	 * 
	 * @return The source file name
	 */
	public String getSourceFileName() {
		return sourceFileName;
	}

	/**
	 * Set the source file name to this configuration.
	 * 
	 * @param sourceFileName
	 *            The source file name.
	 */
	public void setSourceFileName(String sourceFileName)
			throws RuntimeException {
		if (sourceFileName != null && !sourceFileName.trim().equals("")) {
			this.sourceFileName = sourceFileName;
		} else {
			String errStr = "Invalid source name.";
			logger.error(errStr);
			throw new RuntimeException(errStr);
		}
	}

	/**
	 * Get the polling delay.
	 *
	 * @return pollingDelay
	 */
	public long getPollingDelay() {
		return pollingDelay;
	}

	/**
	 * Set the polling delay.
	 *
	 * @param pollingDelay Delay in milliseconds.
	 */
	public void setPollingDelay(long pollingDelay) {
		this.pollingDelay = pollingDelay;
	}
}
