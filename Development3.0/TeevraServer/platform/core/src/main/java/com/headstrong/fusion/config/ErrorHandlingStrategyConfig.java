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
 * $Id: ErrorHandlingStrategyConfig.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 19, 2009 
 */

package com.headstrong.fusion.config;

import java.io.Serializable;
import java.util.Map;

/**
 * Represents Error handling strategies.
 */
public class ErrorHandlingStrategyConfig implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 696389695224541092L;

	/**
	 * Strategy Types.
	 */
	public static enum Strategy {
		ReportAndContinueJob, ReportAndAbortJob, ReportAndAbortJobIfThresholdCrossed, ReportAndStopProcess
	}

	/**
	 * Strategy Type.
	 */
	private String strategy;

	/**
	 * To report the errors as & when its occurred or 
	 * batch it and send it.
	 */
	private boolean batch;
	/**
	 * Properties related to the strategy if required.
	 */
	private Map<String, String> properties;

	/**
	 * @return the strategy
	 */
	public String getStrategy() {
		return strategy;
	}

	/**
	 * @param strategy
	 *            the strategy to set
	 */
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	/**
	 * @return the properties
	 */
	public Map<String, String> getProperties() {
		return properties;
	}

	/**
	 * @param properties
	 *            the properties to set
	 */
	public void setProperties(Map<String, String> properties) {
		this.properties = properties;
	}

	/**
	 * @return the batch
	 */
	public boolean isBatch() {
		return batch;
	}

	/**
	 * @param batch the batch to set
	 */
	public void setBatch(boolean batch) {
		this.batch = batch;
	}

}
