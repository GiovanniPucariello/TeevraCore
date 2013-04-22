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
 * $Id: TradeCaptureReportMessageValidationTest.java
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

import org.fixprotocol.fixml_5_0.AbstractMessageT;
import org.fixprotocol.fixml_5_0.FIXML;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.PositionMaintenanceRequestMessageT;
import org.fixprotocol.fixml_5_0.TradeCaptureReportAckMessageT;
import org.fixprotocol.fixml_5_0.TradeCaptureReportMessageT;
import org.fixprotocol.fixml_5_0.TrdCapRptSideGrpBlockT;
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

import junit.framework.TestCase;

/**
 * 
 */
public class TradeCaptureReportMessageValidationTest extends TestCase {

	public TradeCaptureReportMessageValidationTest() throws Exception {
		FixmlValidatorConfigCache.init();
	}

	@SuppressWarnings("unchecked")
	public void testInstrmntIdNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();
		((TradeCaptureReportMessageT) abstractBody).getInstrmt().setID(null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();
		((TradeCaptureReportMessageT) abstractBody).getInstrmt().setCFI(null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();
		((TradeCaptureReportMessageT) abstractBody).getInstrmt().setMMY(null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();
		((TradeCaptureReportMessageT) abstractBody).getInstrmt()
				.setStrkPx(null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();
		((TradeCaptureReportMessageT) abstractBody).getInstrmt().setExch(null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
	public void testLastQtyNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();
		((TradeCaptureReportMessageT) abstractBody).setLastQty(null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
					"lastQty is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testLastQtyNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
	public void testLastPxNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();
		((TradeCaptureReportMessageT) abstractBody).setLastPx(null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
					"lastPx is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testLastPxNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
	public void testRptSideNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();
		((TradeCaptureReportMessageT) abstractBody).getRptSide().get(0).setSide(null);

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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
					"rptSide.side is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testRptSideNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntRpt");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this.createCaptureReportMessageT();

		JAXBElement element = new JAXBElement(qName,
				TradeCaptureReportMessageT.class, null, abstractBody);
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

}
