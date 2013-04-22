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
 * $Id: TradeCaptureReportAckMessageValidationTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 29, 2009 
 */

package com.headstrong.fusion.services.adapter.validator.fixml.impl;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.math.BigDecimal;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import junit.framework.TestCase;

import org.fixprotocol.fixml_5_0.AbstractMessageT;
import org.fixprotocol.fixml_5_0.FIXML;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.TradeCaptureReportAckMessageT;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.java.JavaBusinessObject;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.adapter.validator.fixml.ServiceMessageExchange;
import com.headstrong.fusion.services.adapter.validator.fixml.ServiceNormalizedMessage;
import com.headstrong.fusion.services.adapter.validator.fixml.ValidatorServiceResolver;
import com.headstrong.fusion.services.adapter.validator.fixml.config.FixmlValidatorConfigCache;
import com.headstrong.fusion.services.validator.impl.DefaultValidator;
import com.headstrong.fusion.services.validator.rulemanager.impl.RuleManagerImpl;

/**
 * 
 */
public class TradeCaptureReportAckMessageValidationTest extends TestCase {
	public TradeCaptureReportAckMessageValidationTest() throws Exception {
		FixmlValidatorConfigCache.init();
	}

	@SuppressWarnings("unchecked")
	public void testInstrmntIdNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createTradeCaptureReportAckMessageT();
		((TradeCaptureReportAckMessageT) abstractBody).getInstrmt().setID(null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportAckMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		BusinessObject businessObject = new JavaBusinessObject(fixml);

		FixmlValidatorServiceImpl fixmlValidator = new FixmlValidatorServiceImpl();
		RuleManagerImpl ruleManagerImpl = new RuleManagerImpl(null);
		ruleManagerImpl.setServiceResolver(new ValidatorServiceResolver(
				ruleManagerImpl));

		fixmlValidator.setValidator(new DefaultValidator(ruleManagerImpl));
		// Camel message
		ServiceConfig config = createMock(ServiceConfig.class);
		expect(config.getErrorHandler()).andReturn(null).anyTimes();
		expect(config.getProcessId()).andReturn("1").anyTimes();
		expect(config.getServiceId()).andReturn("sample").anyTimes();
		expect(config.getServiceType()).andReturn("FixmlValidatorService")
				.anyTimes();
		replay(config);
		replay(bundleContext);

		NormalizedMessage normalizedMessage = new ServiceNormalizedMessage();
		normalizedMessage.setBody(businessObject);
		MessageExchange messageExchange = new ServiceMessageExchange();
		messageExchange.setIn(normalizedMessage);
		try {
			fixmlValidator.process(messageExchange, config);
		} catch (FusionException e) {
			assertTrue(e.getCause().getMessage().contains(
					"instrmt.ID is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testInstrmntIdNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createTradeCaptureReportAckMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportAckMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		BusinessObject businessObject = new JavaBusinessObject(fixml);

		FixmlValidatorServiceImpl fixmlValidator = new FixmlValidatorServiceImpl();
		RuleManagerImpl ruleManagerImpl = new RuleManagerImpl(null);
		ruleManagerImpl.setServiceResolver(new ValidatorServiceResolver(
				ruleManagerImpl));

		fixmlValidator.setValidator(new DefaultValidator(ruleManagerImpl));
		// Camel message
		ServiceConfig config = createMock(ServiceConfig.class);
		expect(config.getErrorHandler()).andReturn(null).anyTimes();
		expect(config.getProcessId()).andReturn("1").anyTimes();
		expect(config.getServiceId()).andReturn("sample").anyTimes();
		expect(config.getServiceType()).andReturn("FixmlValidatorService")
				.anyTimes();
		replay(config);
		replay(bundleContext);

		NormalizedMessage normalizedMessage = new ServiceNormalizedMessage();
		normalizedMessage.setBody(businessObject);
		MessageExchange messageExchange = new ServiceMessageExchange();
		messageExchange.setIn(normalizedMessage);
		fixmlValidator.process(messageExchange, config);
	}

	@SuppressWarnings("unchecked")
	public void testInstrmntCfiNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createTradeCaptureReportAckMessageT();
		((TradeCaptureReportAckMessageT) abstractBody).getInstrmt()
				.setCFI(null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportAckMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		BusinessObject businessObject = new JavaBusinessObject(fixml);

		FixmlValidatorServiceImpl fixmlValidator = new FixmlValidatorServiceImpl();
		RuleManagerImpl ruleManagerImpl = new RuleManagerImpl(null);
		ruleManagerImpl.setServiceResolver(new ValidatorServiceResolver(
				ruleManagerImpl));

		fixmlValidator.setValidator(new DefaultValidator(ruleManagerImpl));
		// Camel message
		ServiceConfig config = createMock(ServiceConfig.class);
		expect(config.getErrorHandler()).andReturn(null).anyTimes();
		expect(config.getProcessId()).andReturn("1").anyTimes();
		expect(config.getServiceId()).andReturn("sample").anyTimes();
		expect(config.getServiceType()).andReturn("FixmlValidatorService")
				.anyTimes();
		replay(config);
		replay(bundleContext);

		NormalizedMessage normalizedMessage = new ServiceNormalizedMessage();
		normalizedMessage.setBody(businessObject);
		MessageExchange messageExchange = new ServiceMessageExchange();
		messageExchange.setIn(normalizedMessage);
		try {
			fixmlValidator.process(messageExchange, config);
		} catch (FusionException e) {
			assertTrue(e.getCause().getMessage().contains(
					"instrmt.cfi is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testInstrmntCfiNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createTradeCaptureReportAckMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportAckMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		BusinessObject businessObject = new JavaBusinessObject(fixml);

		FixmlValidatorServiceImpl fixmlValidator = new FixmlValidatorServiceImpl();
		RuleManagerImpl ruleManagerImpl = new RuleManagerImpl(null);
		ruleManagerImpl.setServiceResolver(new ValidatorServiceResolver(
				ruleManagerImpl));

		fixmlValidator.setValidator(new DefaultValidator(ruleManagerImpl));
		// Camel message
		ServiceConfig config = createMock(ServiceConfig.class);
		expect(config.getErrorHandler()).andReturn(null).anyTimes();
		expect(config.getProcessId()).andReturn("1").anyTimes();
		expect(config.getServiceId()).andReturn("sample").anyTimes();
		expect(config.getServiceType()).andReturn("FixmlValidatorService")
				.anyTimes();
		replay(config);
		replay(bundleContext);

		NormalizedMessage normalizedMessage = new ServiceNormalizedMessage();
		normalizedMessage.setBody(businessObject);
		MessageExchange messageExchange = new ServiceMessageExchange();
		messageExchange.setIn(normalizedMessage);
		fixmlValidator.process(messageExchange, config);
	}

	@SuppressWarnings("unchecked")
	public void testInstrmntMmyNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createTradeCaptureReportAckMessageT();
		((TradeCaptureReportAckMessageT) abstractBody).getInstrmt()
				.setMMY(null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportAckMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		BusinessObject businessObject = new JavaBusinessObject(fixml);

		FixmlValidatorServiceImpl fixmlValidator = new FixmlValidatorServiceImpl();
		RuleManagerImpl ruleManagerImpl = new RuleManagerImpl(null);
		ruleManagerImpl.setServiceResolver(new ValidatorServiceResolver(
				ruleManagerImpl));

		fixmlValidator.setValidator(new DefaultValidator(ruleManagerImpl));
		// Camel message
		ServiceConfig config = createMock(ServiceConfig.class);
		expect(config.getErrorHandler()).andReturn(null).anyTimes();
		expect(config.getProcessId()).andReturn("1").anyTimes();
		expect(config.getServiceId()).andReturn("sample").anyTimes();
		expect(config.getServiceType()).andReturn("FixmlValidatorService")
				.anyTimes();
		replay(config);
		replay(bundleContext);

		NormalizedMessage normalizedMessage = new ServiceNormalizedMessage();
		normalizedMessage.setBody(businessObject);
		MessageExchange messageExchange = new ServiceMessageExchange();
		messageExchange.setIn(normalizedMessage);
		try {
			fixmlValidator.process(messageExchange, config);
		} catch (FusionException e) {
			assertTrue(e.getCause().getMessage().contains(
					"instrmt.mmy is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testInstrmntMmyNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createTradeCaptureReportAckMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportAckMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		BusinessObject businessObject = new JavaBusinessObject(fixml);

		FixmlValidatorServiceImpl fixmlValidator = new FixmlValidatorServiceImpl();
		RuleManagerImpl ruleManagerImpl = new RuleManagerImpl(null);
		ruleManagerImpl.setServiceResolver(new ValidatorServiceResolver(
				ruleManagerImpl));

		fixmlValidator.setValidator(new DefaultValidator(ruleManagerImpl));
		// Camel message
		ServiceConfig config = createMock(ServiceConfig.class);
		expect(config.getErrorHandler()).andReturn(null).anyTimes();
		expect(config.getProcessId()).andReturn("1").anyTimes();
		expect(config.getServiceId()).andReturn("sample").anyTimes();
		expect(config.getServiceType()).andReturn("FixmlValidatorService")
				.anyTimes();
		replay(config);
		replay(bundleContext);

		NormalizedMessage normalizedMessage = new ServiceNormalizedMessage();
		normalizedMessage.setBody(businessObject);
		MessageExchange messageExchange = new ServiceMessageExchange();
		messageExchange.setIn(normalizedMessage);
		fixmlValidator.process(messageExchange, config);
	}

	@SuppressWarnings("unchecked")
	public void testInstrmntStrkPxNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createTradeCaptureReportAckMessageT();
		((TradeCaptureReportAckMessageT) abstractBody).getInstrmt().setStrkPx(
				null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportAckMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		BusinessObject businessObject = new JavaBusinessObject(fixml);

		FixmlValidatorServiceImpl fixmlValidator = new FixmlValidatorServiceImpl();
		RuleManagerImpl ruleManagerImpl = new RuleManagerImpl(null);
		ruleManagerImpl.setServiceResolver(new ValidatorServiceResolver(
				ruleManagerImpl));

		fixmlValidator.setValidator(new DefaultValidator(ruleManagerImpl));
		// Camel message
		ServiceConfig config = createMock(ServiceConfig.class);
		expect(config.getErrorHandler()).andReturn(null).anyTimes();
		expect(config.getProcessId()).andReturn("1").anyTimes();
		expect(config.getServiceId()).andReturn("sample").anyTimes();
		expect(config.getServiceType()).andReturn("FixmlValidatorService")
				.anyTimes();
		replay(config);
		replay(bundleContext);

		NormalizedMessage normalizedMessage = new ServiceNormalizedMessage();
		normalizedMessage.setBody(businessObject);
		MessageExchange messageExchange = new ServiceMessageExchange();
		messageExchange.setIn(normalizedMessage);
		try {
			fixmlValidator.process(messageExchange, config);
		} catch (FusionException e) {
			assertTrue(e.getCause().getMessage().contains(
					"instrmt.strkPx is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testInstrmntStrkPxNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createTradeCaptureReportAckMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportAckMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		BusinessObject businessObject = new JavaBusinessObject(fixml);

		FixmlValidatorServiceImpl fixmlValidator = new FixmlValidatorServiceImpl();
		RuleManagerImpl ruleManagerImpl = new RuleManagerImpl(null);
		ruleManagerImpl.setServiceResolver(new ValidatorServiceResolver(
				ruleManagerImpl));

		fixmlValidator.setValidator(new DefaultValidator(ruleManagerImpl));
		// Camel message
		ServiceConfig config = createMock(ServiceConfig.class);
		expect(config.getErrorHandler()).andReturn(null).anyTimes();
		expect(config.getProcessId()).andReturn("1").anyTimes();
		expect(config.getServiceId()).andReturn("sample").anyTimes();
		expect(config.getServiceType()).andReturn("FixmlValidatorService")
				.anyTimes();
		replay(config);
		replay(bundleContext);

		NormalizedMessage normalizedMessage = new ServiceNormalizedMessage();
		normalizedMessage.setBody(businessObject);
		MessageExchange messageExchange = new ServiceMessageExchange();
		messageExchange.setIn(normalizedMessage);
		fixmlValidator.process(messageExchange, config);
	}

	@SuppressWarnings("unchecked")
	public void testInstrmntExchNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createTradeCaptureReportAckMessageT();
		((TradeCaptureReportAckMessageT) abstractBody).getInstrmt().setExch(
				null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportAckMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		BusinessObject businessObject = new JavaBusinessObject(fixml);

		FixmlValidatorServiceImpl fixmlValidator = new FixmlValidatorServiceImpl();
		RuleManagerImpl ruleManagerImpl = new RuleManagerImpl(null);
		ruleManagerImpl.setServiceResolver(new ValidatorServiceResolver(
				ruleManagerImpl));

		fixmlValidator.setValidator(new DefaultValidator(ruleManagerImpl));
		// Camel message
		ServiceConfig config = createMock(ServiceConfig.class);
		expect(config.getErrorHandler()).andReturn(null).anyTimes();
		expect(config.getProcessId()).andReturn("1").anyTimes();
		expect(config.getServiceId()).andReturn("sample").anyTimes();
		expect(config.getServiceType()).andReturn("FixmlValidatorService")
				.anyTimes();
		replay(config);
		replay(bundleContext);

		NormalizedMessage normalizedMessage = new ServiceNormalizedMessage();
		normalizedMessage.setBody(businessObject);
		MessageExchange messageExchange = new ServiceMessageExchange();
		messageExchange.setIn(normalizedMessage);
		try {
			fixmlValidator.process(messageExchange, config);
		} catch (FusionException e) {
			assertTrue(e.getCause().getMessage().contains(
					"instrmt.exch is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testInstrmntExchNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createTradeCaptureReportAckMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportAckMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		BusinessObject businessObject = new JavaBusinessObject(fixml);

		FixmlValidatorServiceImpl fixmlValidator = new FixmlValidatorServiceImpl();
		RuleManagerImpl ruleManagerImpl = new RuleManagerImpl(null);
		ruleManagerImpl.setServiceResolver(new ValidatorServiceResolver(
				ruleManagerImpl));

		fixmlValidator.setValidator(new DefaultValidator(ruleManagerImpl));
		// Camel message
		ServiceConfig config = createMock(ServiceConfig.class);
		expect(config.getErrorHandler()).andReturn(null).anyTimes();
		expect(config.getProcessId()).andReturn("1").anyTimes();
		expect(config.getServiceId()).andReturn("sample").anyTimes();
		expect(config.getServiceType()).andReturn("FixmlValidatorService")
				.anyTimes();
		replay(config);
		replay(bundleContext);

		NormalizedMessage normalizedMessage = new ServiceNormalizedMessage();
		normalizedMessage.setBody(businessObject);
		MessageExchange messageExchange = new ServiceMessageExchange();
		messageExchange.setIn(normalizedMessage);
		fixmlValidator.process(messageExchange, config);
	}

	public TradeCaptureReportAckMessageT createTradeCaptureReportAckMessageT()
			throws Exception {
		TradeCaptureReportAckMessageT tradeCaptureReportAckMessageT = new TradeCaptureReportAckMessageT();
		InstrumentBlockT instrumentBlockT = new InstrumentBlockT();
		instrumentBlockT.setID("id");
		instrumentBlockT.setCFI("cfi");
		instrumentBlockT.setMMY("mmy");
		instrumentBlockT.setStrkPx(BigDecimal.ONE);
		instrumentBlockT.setExch("exch");
		tradeCaptureReportAckMessageT.setInstrmt(instrumentBlockT);
		return tradeCaptureReportAckMessageT;
	}
}
