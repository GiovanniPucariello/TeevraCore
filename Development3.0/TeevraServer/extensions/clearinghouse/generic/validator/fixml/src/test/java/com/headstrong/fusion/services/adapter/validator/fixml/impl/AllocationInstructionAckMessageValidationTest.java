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
 * $Id: AllocationInstructionAckMessageValidationTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 25, 2009 
 */

package com.headstrong.fusion.services.adapter.validator.fixml.impl;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import junit.framework.TestCase;

import org.fixprotocol.fixml_5_0.AbstractMessageT;
import org.fixprotocol.fixml_5_0.AllocationInstructionAckMessageT;
import org.fixprotocol.fixml_5_0.FIXML;
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
public class AllocationInstructionAckMessageValidationTest extends TestCase {
	public AllocationInstructionAckMessageValidationTest() throws Exception {
		FixmlValidatorConfigCache.init();
	}

	@SuppressWarnings("unchecked")
	public void testIdNotNullwithIDNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = new AllocationInstructionAckMessageT();

		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionAckMessageT.class, null, abstractBody);
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
	public void testIdNotNullWithIDNotNull() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		QName qName = new QName("http://www.fixprotocol.org/FIXML-5-0",
				"posMntReq");
		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = new AllocationInstructionAckMessageT();

		((AllocationInstructionAckMessageT) abstractBody).setID("id");
		JAXBElement element = new JAXBElement(qName,
				AllocationInstructionAckMessageT.class, null, abstractBody);
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
}
