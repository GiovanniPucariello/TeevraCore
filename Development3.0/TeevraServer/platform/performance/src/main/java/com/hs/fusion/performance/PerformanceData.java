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
 * $Id: PerformanceData.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 14, 2009 
 */

package com.hs.fusion.performance;

/**
 * Performance Related data.
 */
public class PerformanceData {
	private String testScenario;
	private String testCase;
	private String input;
	private String output;
	private String totalTime;
	private String meanTime;
	private String maxTime;
	private String minTime;
	private String additionalData;

	/**
	 * @return the testScenario
	 */
	public String getTestScenario() {
		return testScenario;
	}

	/**
	 * @param testScenario
	 *            the testScenario to set
	 */
	public void setTestScenario(String testScenario) {
		this.testScenario = testScenario;
	}

	/**
	 * @return the testCase
	 */
	public String getTestCase() {
		return testCase;
	}

	/**
	 * @param testCase
	 *            the testCase to set
	 */
	public void setTestCase(String testCase) {
		this.testCase = testCase;
	}

	/**
	 * @return the input
	 */
	public String getInput() {
		return input;
	}

	/**
	 * @param input
	 *            the input to set
	 */
	public void setInput(String input) {
		this.input = input;
	}

	/**
	 * @return the output
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * @param output
	 *            the output to set
	 */
	public void setOutput(String output) {
		this.output = output;
	}

	/**
	 * @return the totalTime
	 */
	public String getTotalTime() {
		return totalTime;
	}

	/**
	 * @param totalTime
	 *            the totalTime to set
	 */
	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}

	/**
	 * @return the meanTime
	 */
	public String getMeanTime() {
		return meanTime;
	}

	/**
	 * @param meanTime
	 *            the meanTime to set
	 */
	public void setMeanTime(String meanTime) {
		this.meanTime = meanTime;
	}

	/**
	 * @return the maxTime
	 */
	public String getMaxTime() {
		return maxTime;
	}

	/**
	 * @param maxTime
	 *            the maxTime to set
	 */
	public void setMaxTime(String maxTime) {
		this.maxTime = maxTime;
	}

	/**
	 * @return the minTime
	 */
	public String getMinTime() {
		return minTime;
	}

	/**
	 * @param minTime
	 *            the minTime to set
	 */
	public void setMinTime(String minTime) {
		this.minTime = minTime;
	}

	/**
	 * @return the additionalData
	 */
	public String getAdditionalData() {
		return additionalData;
	}

	/**
	 * @param additionalData
	 *            the additionalData to set
	 */
	public void setAdditionalData(String additionalData) {
		this.additionalData = additionalData;
	}
}
