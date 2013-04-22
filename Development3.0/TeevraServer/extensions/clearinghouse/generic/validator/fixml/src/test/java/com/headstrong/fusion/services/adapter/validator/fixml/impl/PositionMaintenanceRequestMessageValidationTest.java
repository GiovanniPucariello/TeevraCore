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
 * $Id: PositionMaintenanceRequestMessageValidationTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 24, 2009 
 */

package com.headstrong.fusion.services.adapter.validator.fixml.impl;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;

import junit.framework.TestCase;

import org.fixprotocol.fixml_5_0.AbstractMessageT;
import org.fixprotocol.fixml_5_0.FIXML;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.PartiesBlockT;
import org.fixprotocol.fixml_5_0.PosTypeEnumT;
import org.fixprotocol.fixml_5_0.PositionMaintenanceRequestMessageT;
import org.fixprotocol.fixml_5_0.PositionQtyBlockT;
import org.fixprotocol.fixml_5_0.PtysSubGrpBlockT;
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
 * {@link FixmlValidatorServiceImpl} unit test class for PositionMaintenanceRequestMessage.
 */
public class PositionMaintenanceRequestMessageValidationTest extends TestCase {
	public PositionMaintenanceRequestMessageValidationTest() throws Exception {
		FixmlValidatorConfigCache.init();
	}

	@SuppressWarnings("unchecked")
	public void testReqIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).setReqID(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
					"reqID is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testBizDtNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).setBizDt(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
					"bizDt is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testTxnTmNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).setTxnTm(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
					"txnTm is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testPtyIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).getPty().get(0)
				.setID(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
					"pty.ID is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testPtyRNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).getPty().get(0)
				.setR(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
					"pty.r is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testPtySubIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).getPty().get(0)
				.getSub().get(0).setID(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
					"pty.sub.iD is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testPtySubTypNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).getPty().get(0)
				.getSub().get(0).setTyp(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
					"pty.sub.typ is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testInstrmntIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).getInstrmt().setID(
				null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
	public void testInstrmntCFINotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).getInstrmt()
				.setCFI(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
	public void testInstrmntMMYNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).getInstrmt()
				.setMMY(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
	public void testInstrmntStrkPxNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).getInstrmt()
				.setStrkPx(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
	public void testInstrmntExchNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).getInstrmt()
				.setExch(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
	public void testQtyTypNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).getQty().get(0)
				.setTyp(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
					"qty.typ is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testQtyLongNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).getQty().get(0)
				.setLong(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
					"qty.long is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testQtyStatNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		((PositionMaintenanceRequestMessageT) abstractBody).getQty().get(0)
				.setStat(null);
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
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
					"qty.stat is required and can not be null"));
		}
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
}
