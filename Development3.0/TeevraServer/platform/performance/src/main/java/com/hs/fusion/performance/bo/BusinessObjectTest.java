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
 * $Id: BusinessObjectTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 15, 2009 
 */

package com.hs.fusion.performance.bo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.fixprotocol.fixml_5_0.AbstractMessageT;
import org.fixprotocol.fixml_5_0.FIXML;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.bo.dyn.DynamicBusinessObject;
import com.headstrong.fusion.bo.java.JavaBusinessObject;
import com.hs.fusion.performance.PerformanceData;
import com.hs.fusion.performance.PerformanceDataLogger;
import com.hs.fusion.performance.PerformanceTest;

/**
 * Does a comparative test study for java business object and dynamic business
 * object,
 */
public class BusinessObjectTest implements PerformanceTest {

	@Override
	public void execute(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		this.javaBoSetterSet1Level1(bundleContext, logger);
		this.dynBoSetterSet1Level1(bundleContext, logger);
		this.javaBoSetterSet1Level2(bundleContext, logger);
		this.dynBoSetterSet1Level2(bundleContext, logger);
		this.javaBoGetterSet1Level1(bundleContext, logger);
		this.dynBoGetterSet1Level1(bundleContext, logger);
	}

	@SuppressWarnings("unchecked")
	private void javaBoSetterSet1Level1(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"PosMntRpt");
		FIXML fixml = new FIXML();
		Class bodyClass = Class
				.forName("org.fixprotocol.fixml_5_0.PositionMaintenanceReportMessageT");
		AbstractMessageT abstractBody = (AbstractMessageT) bodyClass
				.newInstance();
		JAXBElement element = new JAXBElement(qName, bodyClass, null,
				abstractBody);
		fixml.setMessage(element);
		JavaBusinessObject javaBusinessObject = new JavaBusinessObject(fixml);

		String field = "message.value.actn";
		int value = 1;

		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(BusinessObjectTest.class
				.getSimpleName());
		performanceData.setTestCase("level 1(setter) - java business object");
		int input = 2000;
		int output = 0;
		long startTime = System.nanoTime();
		for (int x = 0; x < input; x++) {
			try {
				javaBusinessObject.setValue(field, value);
			} catch (Exception e) {

			}
			output++;
		}
		long endTime = System.nanoTime();
		this.updatePerformanceData(performanceData, startTime, endTime, input,
				output);
		logger.logPerformanceData(performanceData);
	}

	private void dynBoSetterSet1Level1(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		DynamicBusinessObject dynamicBusinessObject = new DynamicBusinessObject();

		String field = "message.actn";
		int value = 1;
		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(BusinessObjectTest.class
				.getSimpleName());
		performanceData
				.setTestCase("level 1(setter) - dynamic business object");
		int input = 2000;
		int output = 0;
		long startTime = System.nanoTime();
		for (int x = 0; x < input; x++) {
			try {
				dynamicBusinessObject.setValue(field, value);
			} catch (Exception e) {

			}
			output++;
		}
		long endTime = System.nanoTime();
		this.updatePerformanceData(performanceData, startTime, endTime, input,
				output);
		logger.logPerformanceData(performanceData);
	}

	@SuppressWarnings("unchecked")
	private void javaBoSetterSet1Level2(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"PosMntReq");
		FIXML fixml = new FIXML();
		Class bodyClass = Class
				.forName("org.fixprotocol.fixml_5_0.PositionMaintenanceRequestMessageT");
		AbstractMessageT abstractBody = (AbstractMessageT) bodyClass
				.newInstance();
		JAXBElement element = new JAXBElement(qName, bodyClass, null,
				abstractBody);
		fixml.setMessage(element);
		JavaBusinessObject javaBusinessObject = new JavaBusinessObject(fixml);

		String field = "message.value.qty.long";
		BigDecimal value = BigDecimal.ONE;

		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(BusinessObjectTest.class
				.getSimpleName());
		performanceData.setTestCase("level 2(setter)- java business object");
		int input = 2000;
		int output = 0;
		long startTime = System.nanoTime();
		for (int x = 0; x < input; x++) {
			try {
				javaBusinessObject.setValue(field, value);
			} catch (Exception e) {

			}
			output++;
		}
		long endTime = System.nanoTime();
		this.updatePerformanceData(performanceData, startTime, endTime, input,
				output);
		logger.logPerformanceData(performanceData);
	}

	private void dynBoSetterSet1Level2(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		DynamicBusinessObject dynamicBusinessObject = new DynamicBusinessObject();

		String field = "message.qty.long";
		BigDecimal value = BigDecimal.ONE;

		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(BusinessObjectTest.class
				.getSimpleName());
		performanceData
				.setTestCase("level 2 (setter)- dynamic business object");
		int input = 2000;
		int output = 0;
		long startTime = System.nanoTime();
		for (int x = 0; x < input; x++) {
			try {
				dynamicBusinessObject.setValue(field, value);
			} catch (Exception e) {

			}
			output++;
		}
		long endTime = System.nanoTime();
		this.updatePerformanceData(performanceData, startTime, endTime, input,
				output);
		logger.logPerformanceData(performanceData);
	}

	@SuppressWarnings("unchecked")
	private void javaBoGetterSet1Level1(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"PosMntRpt");
		FIXML fixml = new FIXML();
		Class bodyClass = Class
				.forName("org.fixprotocol.fixml_5_0.PositionMaintenanceReportMessageT");
		AbstractMessageT abstractBody = (AbstractMessageT) bodyClass
				.newInstance();
		JAXBElement element = new JAXBElement(qName, bodyClass, null,
				abstractBody);
		fixml.setMessage(element);
		JavaBusinessObject javaBusinessObject = new JavaBusinessObject(fixml);

		String field = "message.value.actn";
		int value = 1;
		javaBusinessObject.setValue(field, value);

		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(BusinessObjectTest.class
				.getSimpleName());
		performanceData.setTestCase("level 1 (getter)- java business object");
		int input = 2000;
		int output = 0;
		long startTime = System.nanoTime();
		for (int x = 0; x < input; x++) {
			try {
				javaBusinessObject.getValue(field);
			} catch (Exception e) {

			}
			output++;
		}
		long endTime = System.nanoTime();
		this.updatePerformanceData(performanceData, startTime, endTime, input,
				output);
		logger.logPerformanceData(performanceData);
	}

	private void dynBoGetterSet1Level1(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		DynamicBusinessObject dynamicBusinessObject = new DynamicBusinessObject();

		String field = "message.actn";
		int value = 1;
		dynamicBusinessObject.setValue(field, value);

		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(BusinessObjectTest.class
				.getSimpleName());
		performanceData
				.setTestCase("level 1(getter) - dynamic business object");
		int input = 2000;
		int output = 0;
		long startTime = System.nanoTime();
		for (int x = 0; x < input; x++) {
			try {
				dynamicBusinessObject.getValue(field);
			} catch (Exception e) {

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

		performanceData.setInput(input + " field");
		performanceData.setOutput(output + " field");
		// Total Time taken in milli sec*
		double totalTimeTaken = (endTime - startTime) / 1000000;
		performanceData
				.setTotalTime(formatter.format(totalTimeTaken) + " MSec");
		// Mean time taken per record.
		double meanTimeTakenPerRecord = totalTimeTaken / output;
		performanceData.setMeanTime(formatter.format(meanTimeTakenPerRecord)
				+ " MSec/field");
		// records per/sec
		performanceData.setAdditionalData(formatter
				.format((1 / meanTimeTakenPerRecord) * 1000)
				+ " fields/Sec");
	}

}
