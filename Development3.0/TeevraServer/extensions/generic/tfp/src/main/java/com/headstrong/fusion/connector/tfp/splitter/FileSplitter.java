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

package com.headstrong.fusion.connector.tfp.splitter;

import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.connector.tfp.TFPEndpoint;
import com.headstrong.fusion.connector.tfp.config.TFPConfiguration;

/**
 * Splits the files based on the configurations
 */
public abstract class FileSplitter {

	/**
	 * Fusion processor
	 */
	private FusionProcessor processor;

	/**
	 * File splitter endpoint
	 */
	private TFPEndpoint endpoint;

	/**
	 * File Splitter configuration
	 */
	private TFPConfiguration config;

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
	public TFPEndpoint getEndpoint() {
		return endpoint;
	}

	/**
	 * @param endpoint
	 *            the endpoint to set
	 */
	public void setEndpoint(TFPEndpoint endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * @return the config
	 */
	public TFPConfiguration getConfig() {
		return config;
	}

	/**
	 * @param config
	 *            the config to set
	 */
	public void setConfig(TFPConfiguration config) {
		this.config = config;
	}

	/**
	 * Method should be implemented in child classes. Splits the files based on
	 * the criteria and the type of the files.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws Exception
	 */
	public abstract void split() throws Exception;

}
