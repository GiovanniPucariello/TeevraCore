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
 * $Id: FixmlParserTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 15, 2009 
 */

package com.hs.fusion.performance.processor.fixml;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

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
 * 
 */
public class FixmlParserTest implements PerformanceTest {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hs.fusion.performance.PerformanceTest#execute(org.osgi.framework.BundleContext,
	 *      com.hs.fusion.performance.PerformanceDataLogger)
	 */
	@Override
	public void execute(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		this.testPosMntReq1(bundleContext, logger);
		this.testPosMntReq2(bundleContext, logger);
	}

	private void testPosMntReq1(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(FixmlParserTest.class.getSimpleName());
		performanceData.setTestCase("PositionMaintenanceRequest-set1");
		// retrieve the service.
		String record = "<FIXML xmlns=\"http://www.fixprotocol.org/FIXML-5-0\"><PosMntReq ReqID=\"1081EN\" TxnTyp=\"2\" Actn=\"1\" BizDt=\"2003-12-04\" TxnTm=\"2003-09-10T00:00:00\" CntraryInstrctnInd=\"Y\" Acct=\"JPMC1081B\"><Pty ID=\"EN\" R=\"21\" /><Pty ID=\"600\" R=\"4\" /><Pty ID=\"600\" R=\"1\" /><Instrmt CFI=\"CAXXS\" ID=\"ED\" /><Qty Long=\"1001\" Typ=\"TQ\" /></PosMntReq></FIXML>";

		List<String> inputRecs = new ArrayList<String>();
		int input = 1000;
		for (int x = 0; x < input; x++) {
			inputRecs.add(record);
		}
		MediationService service = (MediationService) ServiceAliasManager
				.getInstance().getServiceByAlias("FixmlParserService", 100);
		long startTime = System.nanoTime();
		int output = 0;
		for (String inputMessage : inputRecs) {
			// since we have the list of input records.. same can be processed.
			MessageExchange messageExchange = new PerfTestMessageExchange();
			NormalizedMessage message = new PerfTestMessage();
			message.setBody(inputMessage);
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

	private void testPosMntReq2(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(FixmlParserTest.class.getSimpleName());
		performanceData.setTestCase("PositionMaintenanceRequest-set2");
		// retrieve the service.
		String record = "<FIXML xmlns=\"http://www.fixprotocol.org/FIXML-5-0\"><PosMntReq ReqID=\"1081EN\" TxnTyp=\"2\" Actn=\"1\" BizDt=\"2003-12-04\" TxnTm=\"2003-09-10T00:00:00\" CntraryInstrctnInd=\"Y\" Acct=\"JPMC1081B\"><Pty ID=\"EN\" R=\"21\" /><Pty ID=\"600\" R=\"4\" /><Pty ID=\"600\" R=\"1\" /><Instrmt CFI=\"CAXXS\" ID=\"ED\" /><Qty Long=\"1001\" Typ=\"TQ\" /></PosMntReq></FIXML>";

		List<String> inputRecs = new ArrayList<String>();
		int input = 1000;
		for (int x = 0; x < input; x++) {
			inputRecs.add(record);
		}
		MediationService service = (MediationService) ServiceAliasManager
				.getInstance().getServiceByAlias("FixmlParserService", 100);
		long startTime = System.nanoTime();
		int output = 0;
		for (String inputMessage : inputRecs) {
			// since we have the list of input records.. same can be processed.
			MessageExchange messageExchange = new PerfTestMessageExchange();
			NormalizedMessage message = new PerfTestMessage();
			message.setBody(inputMessage);
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
