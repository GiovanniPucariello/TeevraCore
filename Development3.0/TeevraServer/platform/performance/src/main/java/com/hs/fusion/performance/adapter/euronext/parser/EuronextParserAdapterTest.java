/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: EuronextParserAdapterTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 14, 2009 
 */

package com.hs.fusion.performance.adapter.euronext.parser;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Map.Entry;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.MediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.hs.fusion.performance.PerfTestMessage;
import com.hs.fusion.performance.PerfTestMessageExchange;
import com.hs.fusion.performance.PerfTestServiceConfig;
import com.hs.fusion.performance.PerformanceData;
import com.hs.fusion.performance.PerformanceDataLogger;
import com.hs.fusion.performance.PerformanceTest;

/**
 * Log performance data for Euronext parser adapter.
 */
public class EuronextParserAdapterTest implements PerformanceTest {

	@Override
	public void execute(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		set1(bundleContext, logger);
		set2(bundleContext, logger);
		set3(bundleContext, logger);
		set4(bundleContext, logger);
	}

	private void set1(BundleContext bundleContext, PerformanceDataLogger logger)
			throws Exception {
		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(EuronextParserAdapterTest.class
				.getSimpleName());
		performanceData.setTestCase("set-1");
		// retrieve the service.
		Properties properties = new Properties();
		properties.load(bundleContext.getBundle().getEntry(
				"EuronextParserAdapterTest.properties").openStream());
		List<String> inputRecs = new ArrayList<String>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey().toString().startsWith("set1")) {
				String[] value = entry.getValue().toString().split(",");
				int numOfRecs = Integer.parseInt(value[0]);
				String record = value[1];
				for (int x = 0; x < numOfRecs; x++) {
					inputRecs.add(record);
				}
			}
		}

		int input = inputRecs.size();
		MediationService service = (MediationService) ServiceAliasManager
				.getInstance().getServiceByAlias(
						"EuronextParserAdapterService", 100);
		long startTime = System.nanoTime();
		int output = 0;
		for (String record : inputRecs) {
			// since we have the list of input records.. same can be processed.
			MessageExchange messageExchange = new PerfTestMessageExchange();
			NormalizedMessage message = new PerfTestMessage();
			message.setBody(record);
			messageExchange.setIn(message);
			ServiceConfig config = new PerfTestServiceConfig();
			try {
				service.process(messageExchange, config);
			} catch (Throwable e) {
				// ignore
				e.printStackTrace();
			}
			output++;
		}
		long endTime = System.nanoTime();
		this.updatePerformanceData(performanceData, startTime, endTime, input,
				output);
		logger.logPerformanceData(performanceData);
	}

	private void set2(BundleContext bundleContext, PerformanceDataLogger logger)
			throws Exception {
		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(EuronextParserAdapterTest.class
				.getSimpleName());
		performanceData.setTestCase("set-2");
		// retrieve the service.
		Properties properties = new Properties();
		properties.load(bundleContext.getBundle().getEntry(
				"EuronextParserAdapterTest.properties").openStream());
		List<String> inputRecs = new ArrayList<String>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey().toString().startsWith("set2")) {
				String[] value = entry.getValue().toString().split(",");
				int numOfRecs = Integer.parseInt(value[0]);
				String record = value[1];
				for (int x = 0; x < numOfRecs; x++) {
					inputRecs.add(record);
				}
			}
		}
		int input = inputRecs.size();
		MediationService service = (MediationService) ServiceAliasManager
				.getInstance().getServiceByAlias(
						"EuronextParserAdapterService", 100);
		long startTime = System.nanoTime();
		int output = 0;
		for (String record : inputRecs) {
			// since we have the list of input records.. same can be processed.
			MessageExchange messageExchange = new PerfTestMessageExchange();
			NormalizedMessage message = new PerfTestMessage();
			message.setBody(record);
			messageExchange.setIn(message);
			ServiceConfig config = new PerfTestServiceConfig();
			try {
				service.process(messageExchange, config);
			} catch (Throwable e) {
				// ignore
				e.printStackTrace();
			}
			output++;
		}
		long endTime = System.nanoTime();
		this.updatePerformanceData(performanceData, startTime, endTime, input,
				output);
		logger.logPerformanceData(performanceData);
	}

	private void set3(BundleContext bundleContext, PerformanceDataLogger logger)
			throws Exception {
		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(EuronextParserAdapterTest.class
				.getSimpleName());
		performanceData.setTestCase("set-3");
		// retrieve the service.
		Properties properties = new Properties();
		properties.load(bundleContext.getBundle().getEntry(
				"EuronextParserAdapterTest.properties").openStream());
		List<String> inputRecs = new ArrayList<String>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey().toString().startsWith("set1")) {
				String[] value = entry.getValue().toString().split(",");
				int numOfRecs = Integer.parseInt(value[0]);
				String record = value[1];
				for (int x = 0; x < numOfRecs; x++) {
					inputRecs.add(record);
				}
			}
		}
		int input = inputRecs.size();
		MediationService service = (MediationService) ServiceAliasManager
				.getInstance().getServiceByAlias(
						"EuronextParserAdapterService", 100);
		long startTime = System.nanoTime();
		int output = 0;
		for (String record : inputRecs) {
			// since we have the list of input records.. same can be processed.
			MessageExchange messageExchange = new PerfTestMessageExchange();
			NormalizedMessage message = new PerfTestMessage();
			message.setBody(record);
			messageExchange.setIn(message);
			ServiceConfig config = new PerfTestServiceConfig();
			try {
				service.process(messageExchange, config);
			} catch (Throwable e) {
				// ignore
				e.printStackTrace();
			}
			output++;
		}
		long endTime = System.nanoTime();
		this.updatePerformanceData(performanceData, startTime, endTime, input,
				output);
		logger.logPerformanceData(performanceData);
	}

	private void set4(BundleContext bundleContext, PerformanceDataLogger logger)
			throws Exception {
		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(EuronextParserAdapterTest.class
				.getSimpleName());
		performanceData.setTestCase("set-4");
		// retrieve the service.
		Properties properties = new Properties();
		properties.load(bundleContext.getBundle().getEntry(
				"EuronextParserAdapterTest.properties").openStream());
		List<String> inputRecs = new ArrayList<String>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey().toString().startsWith("set2")) {
				String[] value = entry.getValue().toString().split(",");
				int numOfRecs = Integer.parseInt(value[0]);
				String record = value[1];
				for (int x = 0; x < numOfRecs; x++) {
					inputRecs.add(record);
				}
			}
		}
		int input = inputRecs.size();
		MediationService service = (MediationService) ServiceAliasManager
				.getInstance().getServiceByAlias(
						"EuronextParserAdapterService", 100);
		long startTime = System.nanoTime();
		int output = 0;
		for (String record : inputRecs) {
			// since we have the list of input records.. same can be processed.
			MessageExchange messageExchange = new PerfTestMessageExchange();
			NormalizedMessage message = new PerfTestMessage();
			message.setBody(record);
			messageExchange.setIn(message);
			ServiceConfig config = new PerfTestServiceConfig();
			try {
				service.process(messageExchange, config);
			} catch (Throwable e) {
				// ignore
				e.printStackTrace();
			}
			output++;
		}
		long endTime = System.nanoTime();
		this.updatePerformanceData(performanceData, startTime, endTime, input,
				output);
		logger.logPerformanceData(performanceData);
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param performanceData --
	 * @param startTime
	 *            start time in nano seconds
	 * @param endTime
	 *            end time in nano seconds.
	 */
	private void updatePerformanceData(PerformanceData performanceData,
			long startTime, long endTime, int input, int output) {
		NumberFormat formatter = new DecimalFormat("#.00000");

		performanceData.setInput(input + " records");
		performanceData.setOutput(output + " records");
		// Total Time taken in milli sec*
		double totalTimeTaken = (endTime - startTime) / 1000000;
		performanceData
				.setTotalTime(formatter.format(totalTimeTaken) + " MSec");
		// Mean time taken per record.
		double meanTimeTakenPerRecord = totalTimeTaken / output;
		performanceData.setMeanTime(formatter.format(meanTimeTakenPerRecord)
				+ " MSec/Record");
		// records per/sec
		performanceData.setAdditionalData(formatter
				.format((1 / meanTimeTakenPerRecord) * 1000)
				+ " Records/Sec");
	}
}
