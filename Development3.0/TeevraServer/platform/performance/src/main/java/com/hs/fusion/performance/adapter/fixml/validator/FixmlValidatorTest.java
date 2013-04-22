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
 * $Id: FixmlValidatorTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jul 15, 2009 
 */

package com.hs.fusion.performance.adapter.fixml.validator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;

import org.fixprotocol.fixml_5_0.AbstractMessageT;
import org.fixprotocol.fixml_5_0.FIXML;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.PartiesBlockT;
import org.fixprotocol.fixml_5_0.PosTypeEnumT;
import org.fixprotocol.fixml_5_0.PositionMaintenanceRequestMessageT;
import org.fixprotocol.fixml_5_0.PositionQtyBlockT;
import org.fixprotocol.fixml_5_0.PtysSubGrpBlockT;
import org.fixprotocol.fixml_5_0.TradeCaptureReportMessageT;
import org.fixprotocol.fixml_5_0.TrdCapRptSideGrpBlockT;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.java.JavaBusinessObject;
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
 * Performance test for fixml validator.
 */
public class FixmlValidatorTest implements PerformanceTest {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hs.fusion.performance.PerformanceTest#execute(org.osgi.framework.BundleContext,
	 *      com.hs.fusion.performance.PerformanceDataLogger)
	 */
	@Override
	public void execute(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		this.testPositionMaintenanceRequestMessage(bundleContext, logger);
		this.testTradeCaptureReportMessage(bundleContext, logger);
		this.testPositionMaintenanceRequestMessage(bundleContext, logger);
		this.testTradeCaptureReportMessage(bundleContext, logger);
	}

	public void testPositionMaintenanceRequestMessage(
			BundleContext bundleContext, PerformanceDataLogger logger)
			throws Exception {
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		BusinessObject javaBusinessObject = new JavaBusinessObject(fixml);

		// retrieve the service
		MediationService service = (MediationService) ServiceAliasManager
				.getInstance().getServiceByAlias("FixmlValidatorService", 100);
		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(FixmlValidatorTest.class
				.getSimpleName());
		performanceData.setTestCase("PositionMaintenanceRequestMessage");

		int input = 1000;
		int output = 0;
		long startTime = System.nanoTime();
		for (int x = 0; x < input; x++) {
			// since we have the list of input records.. same can be processed.
			MessageExchange messageExchange = new PerfTestMessageExchange();
			NormalizedMessage message = new PerfTestMessage();
			message.setBody(javaBusinessObject);
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

	public void testTradeCaptureReportMessage(BundleContext bundleContext,
			PerformanceDataLogger logger) throws Exception {
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"trdCaptRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();
		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		BusinessObject javaBusinessObject = new JavaBusinessObject(fixml);

		// retrieve the service
		MediationService service = (MediationService) ServiceAliasManager
				.getInstance().getServiceByAlias("FixmlValidatorService", 100);
		PerformanceData performanceData = new PerformanceData();
		performanceData.setTestScenario(FixmlValidatorTest.class
				.getSimpleName());
		performanceData.setTestCase("TradeCaptureReportMessage");

		int input = 1000;
		int output = 0;
		long startTime = System.nanoTime();
		for (int x = 0; x < input; x++) {
			// since we have the list of input records.. same can be processed.
			MessageExchange messageExchange = new PerfTestMessageExchange();
			NormalizedMessage message = new PerfTestMessage();
			message.setBody(javaBusinessObject);
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

	public PositionMaintenanceRequestMessageT createPositionMaintenanceRequestMessageT()
			throws Exception {
		PositionMaintenanceRequestMessageT positionMaintenanceRequestMessageT = new PositionMaintenanceRequestMessageT();
		positionMaintenanceRequestMessageT.setReqID("reqId");
		positionMaintenanceRequestMessageT.setTxnTyp(1);
		positionMaintenanceRequestMessageT.setActn(1);
		positionMaintenanceRequestMessageT
				.setBizDt(DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(new GregorianCalendar()));
		positionMaintenanceRequestMessageT
				.setTxnTm(DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(new GregorianCalendar()));

		PartiesBlockT partiesBlockT1 = new PartiesBlockT();
		partiesBlockT1.setID("id");
		partiesBlockT1.setR(1);

		PtysSubGrpBlockT ptysSubGrpBlockT1 = new PtysSubGrpBlockT();
		ptysSubGrpBlockT1.setID("id");
		ptysSubGrpBlockT1.setTyp("typ");

		PartiesBlockT partiesBlockT2 = new PartiesBlockT();
		partiesBlockT2.setID("id");
		partiesBlockT2.setR(1);

		PtysSubGrpBlockT ptysSubGrpBlockT2 = new PtysSubGrpBlockT();
		ptysSubGrpBlockT2.setID("id");
		ptysSubGrpBlockT2.setTyp("typ");

		partiesBlockT2.getSub().add(ptysSubGrpBlockT1);
		partiesBlockT2.getSub().add(ptysSubGrpBlockT2);

		positionMaintenanceRequestMessageT.getPty().add(partiesBlockT2);
		InstrumentBlockT instrumentBlockT = new InstrumentBlockT();
		instrumentBlockT.setID("id");
		instrumentBlockT.setCFI("cfi");
		instrumentBlockT.setMMY("mmy");
		instrumentBlockT.setStrkPx(BigDecimal.ONE);
		instrumentBlockT.setExch("exch");

		positionMaintenanceRequestMessageT.setInstrmt(instrumentBlockT);

		PositionQtyBlockT positionQtyBlockT = new PositionQtyBlockT();
		positionQtyBlockT.setTyp(PosTypeEnumT.ALC);
		positionQtyBlockT.setLong(BigDecimal.ONE);
		positionQtyBlockT.setStat(1);
		positionMaintenanceRequestMessageT.getQty().add(positionQtyBlockT);
		positionMaintenanceRequestMessageT.setAdjTyp(1);
		return positionMaintenanceRequestMessageT;
	}

	public TradeCaptureReportMessageT createCaptureReportMessageT() {
		TradeCaptureReportMessageT tradeCaptureReportMessageT = new TradeCaptureReportMessageT();
		InstrumentBlockT instrumentBlockT = new InstrumentBlockT();
		instrumentBlockT.setID("id");
		instrumentBlockT.setCFI("cfi");
		instrumentBlockT.setMMY("mmy");
		instrumentBlockT.setStrkPx(BigDecimal.ONE);
		instrumentBlockT.setExch("exch");

		tradeCaptureReportMessageT.setInstrmt(instrumentBlockT);
		tradeCaptureReportMessageT.setLastQty(BigDecimal.ONE);
		tradeCaptureReportMessageT.setLastPx(BigDecimal.ONE);

		TrdCapRptSideGrpBlockT trdCapRptSideGrpBlockT1 = new TrdCapRptSideGrpBlockT();
		trdCapRptSideGrpBlockT1.setSide("side");
		TrdCapRptSideGrpBlockT trdCapRptSideGrpBlockT2 = new TrdCapRptSideGrpBlockT();
		trdCapRptSideGrpBlockT2.setSide("side");
		tradeCaptureReportMessageT.getRptSide().add(trdCapRptSideGrpBlockT1);
		tradeCaptureReportMessageT.getRptSide().add(trdCapRptSideGrpBlockT2);

		return tradeCaptureReportMessageT;
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
