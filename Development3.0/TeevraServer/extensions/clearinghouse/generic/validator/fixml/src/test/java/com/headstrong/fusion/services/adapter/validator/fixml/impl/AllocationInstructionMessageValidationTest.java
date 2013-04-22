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
 * $Id: AllocationInstructionMessageValidationTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 25, 2009 
 */

package com.headstrong.fusion.services.adapter.validator.fixml.impl;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;

import junit.framework.TestCase;

import org.fixprotocol.fixml_5_0.AbstractMessageT;
import org.fixprotocol.fixml_5_0.AllocationInstructionMessageT;
import org.fixprotocol.fixml_5_0.FIXML;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
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
public class AllocationInstructionMessageValidationTest extends TestCase {
	public AllocationInstructionMessageValidationTest() throws Exception {
		FixmlValidatorConfigCache.init();
	}

	@SuppressWarnings("unchecked")
	public void testIdNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		((AllocationInstructionMessageT) abstractBody).setID(null);

		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
					"ID is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testIdNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
	public void testTransTypNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		((AllocationInstructionMessageT) abstractBody).setTransTyp(null);

		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
					"transTyp is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testTransTypNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
	public void testSideNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		((AllocationInstructionMessageT) abstractBody).setSide(null);

		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
					"side is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testSideNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
	public void testInstrmntIDNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		((AllocationInstructionMessageT) abstractBody).getInstrmt().setID(null);

		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
	public void testInstrmntIDNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
	public void testInstrmntCFINotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		((AllocationInstructionMessageT) abstractBody).getInstrmt()
				.setCFI(null);

		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
	public void testInstrmntCFINotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
	public void testInstrmntMMYNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		((AllocationInstructionMessageT) abstractBody).getInstrmt()
				.setMMY(null);

		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
	public void testInstrmntMMYNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
	public void testInstrmntStrkpxNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		((AllocationInstructionMessageT) abstractBody).getInstrmt().setStrkPx(
				null);

		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
	public void testInstrmntStrkpxNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		((AllocationInstructionMessageT) abstractBody).getInstrmt().setExch(
				null);

		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
	public void testQtyNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		((AllocationInstructionMessageT) abstractBody).setQty(null);

		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
					"qty is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testQtyNotNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
	public void testTrdDtNotNullWithIdNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		((AllocationInstructionMessageT) abstractBody).setTrdDt(null);

		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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
					"tradeDate is required and can not be null"));
		}
	}

	@SuppressWarnings("unchecked")
	public void testTrdDtNullWithIdNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createAllocationInstructionMessageT();
		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionMessageT.class, null, abstractBody);
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

	public AllocationInstructionMessageT createAllocationInstructionMessageT()
			throws DatatypeConfigurationException {
		AllocationInstructionMessageT allocationInstructionMessageT = new AllocationInstructionMessageT();
		allocationInstructionMessageT.setID("ID");
		allocationInstructionMessageT.setTransTyp("transTyp");
		allocationInstructionMessageT.setSide("side");
		InstrumentBlockT instrumentBlockT = new InstrumentBlockT();
		instrumentBlockT.setID("ID");
		instrumentBlockT.setCFI("CFI");
		instrumentBlockT.setMMY("MMY");
		instrumentBlockT.setStrkPx(BigDecimal.ONE);
		instrumentBlockT.setExch("EXCH");
		allocationInstructionMessageT.setInstrmt(instrumentBlockT);
		allocationInstructionMessageT.setQty(BigDecimal.ONE);
		allocationInstructionMessageT.setTrdDt(DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(new GregorianCalendar()));
		return allocationInstructionMessageT;
	}
}
