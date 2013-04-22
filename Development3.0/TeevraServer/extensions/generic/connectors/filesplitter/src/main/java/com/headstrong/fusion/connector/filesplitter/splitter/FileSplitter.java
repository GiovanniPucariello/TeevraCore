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
 * $Id: FileSplitter.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 5, 2010 
 */

package com.headstrong.fusion.connector.filesplitter.splitter;

import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.connector.filesplitter.FileSplitterEndpoint;
import com.headstrong.fusion.connector.filesplitter.config.FileSplitterConfiguration;

/**
 * Splits the files based on the configurations
 */
public abstract class FileSplitter {

	/**
	 * Fusion processor
	 */
	FusionProcessor processor;

	/**
	 * File splitter endpoint
	 */
	FileSplitterEndpoint endpoint;

	/**
	 * File Splitter configuration
	 */
	FileSplitterConfiguration config;

	/**
	 * @return the processor
	 */
	public FusionProcessor getProcessor() {
		return processor;
	}

	/**
	 * @param processor
	 *            the processor to set
	 */
	public void setProcessor(FusionProcessor processor) {
		this.processor = processor;
	}

	/**
	 * @return the endpoint
	 */
	public FileSplitterEndpoint getEndpoint() {
		return endpoint;
	}

	/**
	 * @param endpoint
	 *            the endpoint to set
	 */
	public void setEndpoint(FileSplitterEndpoint endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * @return the config
	 */
	public FileSplitterConfiguration getConfig() {
		return config;
	}

	/**
	 * @param config
	 *            the config to set
	 */
	public void setConfig(FileSplitterConfiguration config) {
		this.config = config;
	}

	/**
	 * Method should be implemented in child classes. Splits the files based on
	 * the criteria and the type of the files
	 * 
	 * @precondition
	 * @postcondition
	 * @throws Exception
	 */
	public abstract void split() throws Exception;

}
