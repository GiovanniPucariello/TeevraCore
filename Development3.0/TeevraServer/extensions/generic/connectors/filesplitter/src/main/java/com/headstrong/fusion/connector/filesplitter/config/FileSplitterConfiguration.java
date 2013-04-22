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
 * $Id: FileSplitterConfiguration.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.connector.filesplitter.config;

import java.io.File;
import java.util.Map;

/**
 * File Splitter Configurations
 */
public class FileSplitterConfiguration {

	/**
	 * Start pattern of a record
	 */
	private String recordStartPattern;

	/**
	 * End Pattern of a record
	 */
	private String recordEndPattern;
	/**
	 * Footer Pattern of the file
	 */
	private String footerPattern;
	/**
	 * Path of input file to split
	 */
	private String inputDirectory;
	/**
	 * Pattern of the file to split
	 */
	private String filePattern;

	/**
	 * Number of records to go in one file
	 */
	private Integer batchSize = 1;

	/**
	 * Files in the input directory
	 */
	private File[] filesToProcess;
	/**
	 * Delay between current and next poll.
	 */
	private Long delay = new Long(5000);

	/**
	 * Default COnstructor
	 */
	public FileSplitterConfiguration() {

	}

	/**
	 * Constructor, sets all the configuration properties of the connector
	 * 
	 * @param properties
	 */
	public FileSplitterConfiguration(Map<String, String> properties) {
		if (properties.get("inputDirectory") != null) {
			this.inputDirectory = properties.get("inputDirectory");
		}
		if (properties.get("filePattern") != null) {
			this.filePattern = properties.get("filePattern");
		}
		if (properties.get("batchSize") != null) {
			this.batchSize = Integer.parseInt(properties.get("batchSize"));
		}
		if (properties.get("recordStartPattern") != null) {
			this.recordStartPattern = properties.get("recordStartPattern");
		}
		if (properties.get("recordEndPattern") != null) {
			this.recordEndPattern = properties.get("recordEndPattern");
		}
		if (properties.get("footerPattern") != null) {
			this.footerPattern = properties.get("footerPattern");
		}
		if (properties.get("delay") != null) {
			this.delay = Long.parseLong(properties.get("delay"));
		}

	}

	/**
	 * @return the batchSize
	 */
	public Integer getBatchSize() {
		return batchSize;
	}

	/**
	 * @param batchSize
	 *            the batchSize to set
	 */
	public void setBatchSize(Integer batchSize) {
		this.batchSize = batchSize;
	}

	/**
	 * @return the recordStartPattern
	 */
	public String getRecordStartPattern() {
		return recordStartPattern;
	}

	/**
	 * @param recordStartPattern
	 *            the recordStartPattern to set
	 */
	public void setRecordStartPattern(String recordStartPattern) {
		this.recordStartPattern = recordStartPattern;
	}

	/**
	 * @return the recordEndPattern
	 */
	public String getRecordEndPattern() {
		return recordEndPattern;
	}

	/**
	 * @param recordEndPattern
	 *            the recordEndPattern to set
	 */
	public void setRecordEndPattern(String recordEndPattern) {
		this.recordEndPattern = recordEndPattern;
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
	public void setInputDirectory(String inputDirectory) {
		this.inputDirectory = inputDirectory;
	}

	/**
	 * @return the footerPattern
	 */
	public String getFooterPattern() {
		return footerPattern;
	}

	/**
	 * @param footerPattern
	 *            the footerPattern to set
	 */
	public void setFooterPattern(String footerPattern) {
		this.footerPattern = footerPattern;
	}

	/**
	 * @return the filesToProcess
	 */
	public File[] getFilesToProcess() {
		return filesToProcess;
	}

	/**
	 * @param filesToProcess
	 *            the filesToProcess to set
	 */
	public void setFilesToProcess(File[] filesToProcess) {
		this.filesToProcess = filesToProcess;
	}

	/**
	 * @return the filePattern
	 */
	public String getFilePattern() {
		return filePattern;
	}

	/**
	 * @param filePattern
	 *            the filePattern to set
	 */
	public void setFilePattern(String filePattern) {
		this.filePattern = filePattern;
	}

	/**
	 * @return the delay
	 */
	public Long getDelay() {
		return delay;
	}

	/**
	 * @param delay
	 *            the delay to set
	 */
	public void setDelay(Long delay) {
		this.delay = delay;
	}

}
