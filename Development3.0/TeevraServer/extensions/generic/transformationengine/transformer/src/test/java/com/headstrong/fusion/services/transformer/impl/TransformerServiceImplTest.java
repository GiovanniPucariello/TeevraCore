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
 * $Id: TransformerServiceImplTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 5, 2010 
 */

package com.headstrong.fusion.services.transformer.impl;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptorCache;
import com.headstrong.fusion.commons.FusionMessageExchange;
import com.headstrong.fusion.commons.FusionNormalizedMessage;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.config.OnErrorConfig;
import com.headstrong.fusion.core.ApplicationContext;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.commons.DefaultServiceConfig;
import com.headstrong.fusion.services.config.ServiceConfigurationCache;
import com.headstrong.fusion.services.config.parse.ServiceConfigurationParserRegistry;
import com.headstrong.fusion.services.config.vo.ServiceConfiguration;
import com.headstrong.fusion.services.transformer.TransformerService;
import com.headstrong.fusion.services.transformer.rulemanager.impl.RuleManagerImpl;
import com.headstrong.fusion.services.transformer.serviceconfig.FieldSet;
import com.headstrong.fusion.services.transformer.serviceconfig.RuleSet;
import com.headstrong.fusion.services.transformer.serviceconfig.TransformerServiceConfig;

/**
 * 
 */
public class TransformerServiceImplTest {

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void init() throws Exception {

		BundleContext contextMock = createMock(BundleContext.class);
		Bundle bundleMock = createMock(Bundle.class);
		expect(contextMock.getBundle()).andReturn(bundleMock);

		replay(contextMock);
		replay(bundleMock);
		RuleManagerImpl ruleManager = new RuleManagerImpl(contextMock);

		TransformerServiceImpl transformerService = new TransformerServiceImpl(
				ruleManager);

		transformerService.init();

		ServiceConfigurationParserRegistry serviceConfigurationParserRegistry = ServiceConfigurationParserRegistry
				.getInstance();

		Assert.assertEquals("TransformerServiceConfigParser",
				serviceConfigurationParserRegistry
						.getServiceConfigurationParser(TransformerService.class
								.getSimpleName(), "schemaMapping"));
	}

	@Test
	public void processTransform() throws Exception {

		// create input business object
		BusinessObject inputBO = new DefaultBusinessObject();
		inputBO.setObjectDescriptor(sampleObjectDescriptor1());
		inputBO.setValue("sourceAttr", "TeevraTransfor");

		NormalizedMessage normalizedMessage = new FusionNormalizedMessage();
		normalizedMessage.setBody(inputBO);
		MessageExchange messageExchange = new FusionMessageExchange();
		messageExchange.setIn(normalizedMessage);

		// output object descriptor should be cahced
		ObjectDescriptorCache.getInstance().addDescriptor("sampletargetschema",
				sampleObjectDescriptor2());

		// create process context
		CamelProcessContext processContext = createProcessContext();

		// create service config
		String serviceType = "TestService";
		String serviceId = "test";
		String processId = "test";
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put("objectSchemaDescriptor", "sampletargetschema");
		properties.put("schemaMapping", "samplesrcschema");
		ServiceConfig config = new DefaultServiceConfig(processContext,
				serviceType, serviceId, processId, properties,
				new ArrayList<OnErrorConfig>());

		// create transformer service config
		TransformerServiceConfig transformerServiceConfig = createTransformerServiceConfig();

		// add output parameters
		List<RuleSet> rules = transformerServiceConfig.getRules();
		RuleSet ruleSet = rules.get(0);
		FieldSet fieldset = new FieldSet();
		fieldset.setParamName("result");
		fieldset.setParamType("output");
		fieldset.setParamValue("targetAttr");
		ruleSet.addOutputField(fieldset);
		rules.remove(0);
		rules.add(ruleSet);

		// create a service configuration and add transformer service config to
		// service configuration cache with
		// key as service config
		addTransformerConfigToCache(config, transformerServiceConfig);

		// create rule manager
		RuleManagerImpl ruleManager = createRuleManager();

		TransformerServiceImpl transformerService = new TransformerServiceImpl(
				ruleManager);

		transformerService.process(messageExchange, config);
		Assert.assertNotNull(messageExchange.getIn().getBody());

		Assert.assertEquals(true,
				messageExchange.getIn().getBody() instanceof BusinessObject);

		BusinessObject outputBO = (BusinessObject) messageExchange.getIn()
				.getBody();

		Assert.assertEquals("Transfor", outputBO.getValue("targetAttr"));

	}

	@Test
	public void processEnrich() throws Exception {
		// create input business object
		BusinessObject inputBO = new DefaultBusinessObject();
		inputBO.setObjectDescriptor(sampleObjectDescriptor1());
		inputBO.setValue("sourceAttr", "TeevraTransfor");

		NormalizedMessage normalizedMessage = new FusionNormalizedMessage();
		normalizedMessage.setBody(inputBO);
		MessageExchange messageExchange = new FusionMessageExchange();
		messageExchange.setIn(normalizedMessage);

		// create process context
		CamelProcessContext processContext = createProcessContext();

		// create service config
		String serviceType = "TestService";
		String serviceId = "test";
		String processId = "test";
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put("objectSchemaDescriptor", "sampletargetschema");
		properties.put("schemaMapping", "samplesrcschema");
		properties.put("enrich", "TRUE");
		ServiceConfig config = new DefaultServiceConfig(processContext,
				serviceType, serviceId, processId, properties,
				new ArrayList<OnErrorConfig>());

		// create transformer service config
		TransformerServiceConfig transformerServiceConfig = createTransformerServiceConfig();

		List<RuleSet> rules = transformerServiceConfig.getRules();
		RuleSet ruleSet = rules.get(0);
		FieldSet fieldset = new FieldSet();
		fieldset.setParamName("result");
		fieldset.setParamType("input");
		fieldset.setParamValue("sourceAttr");
		ruleSet.addOutputField(fieldset);
		rules.remove(0);
		rules.add(ruleSet);

		// create a service configuration and add transformer service config to
		// service configuration cache with
		// key as service config
		addTransformerConfigToCache(config, transformerServiceConfig);

		// create rule manager
		RuleManagerImpl ruleManager = createRuleManager();

		TransformerServiceImpl transformerService = new TransformerServiceImpl(
				ruleManager);

		transformerService.process(messageExchange, config);
		Assert.assertNotNull(messageExchange.getIn().getBody());

		Assert.assertEquals(true,
				messageExchange.getIn().getBody() instanceof BusinessObject);

		BusinessObject outputBO = (BusinessObject) messageExchange.getIn()
				.getBody();

		Assert.assertEquals("Transfor", outputBO.getValue("sourceAttr"));
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	private ObjectDescriptor sampleObjectDescriptor1() {
		ObjectDescriptor schema = new ObjectDescriptor();

		AttributeDescriptor attribute = new AttributeDescriptor();
		attribute.setAttributeId(new Long(1));
		attribute.setAttributeName("sourceAttr");

		Map<String, AttributeDescriptor> attribites = new HashMap<String, AttributeDescriptor>();
		attribites.put("sourceAttr", attribute);

		schema.setId(new Long(1));
		schema.setName("samplesrcschema");
		schema.setDesc("Sample Schema");
		schema.setAttributes(attribites);

		return schema;
	}

	private ObjectDescriptor sampleObjectDescriptor2() throws Exception {
		ObjectDescriptor schema = new ObjectDescriptor();

		AttributeDescriptor attribute = new AttributeDescriptor();
		attribute.setAttributeId(new Long(1));
		attribute.setAttributeName("targetAttr");

		Map<String, AttributeDescriptor> attribites = new HashMap<String, AttributeDescriptor>();
		attribites.put("targetAttr", attribute);

		schema.setId(new Long(2));
		schema.setName("sampletargetschema");
		schema.setDesc("Sample Schema");
		schema.setAttributes(attribites);

		return schema;
	}

	/**
	 * Creates Transformer service Config with input fields
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	private TransformerServiceConfig createTransformerServiceConfig()
			throws Exception {
		// create transformer service config
		List<RuleSet> rules = new ArrayList<RuleSet>();

		RuleSet ruleSet = new RuleSet();
		ruleSet.setSequenceId(1);
		ruleSet.setRuleName("substring");

		List<FieldSet> inputFields = new ArrayList<FieldSet>();
		FieldSet fieldset = new FieldSet();
		fieldset.setParamName("operand");
		fieldset.setParamType("input");
		fieldset.setParamValue("sourceAttr");
		inputFields.add(fieldset);

		fieldset = new FieldSet();
		fieldset.setParamName("beginindex");
		fieldset.setParamType("constant");
		fieldset.setParamValue(6);
		inputFields.add(fieldset);

		fieldset = new FieldSet();
		fieldset.setParamName("endindex");
		fieldset.setParamType("constant");
		fieldset.setParamValue(14);
		inputFields.add(fieldset);

		ruleSet.setInputFields(inputFields);

		rules.add(ruleSet);

		TransformerServiceConfig transformerServiceConfig = new TransformerServiceConfig();
		transformerServiceConfig.setRules(rules);

		return transformerServiceConfig;
	}

	private void addTransformerConfigToCache(ServiceConfig config,
			TransformerServiceConfig transformerServiceConfig) throws Exception {
		// create a service configuration
		ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
		serviceConfiguration.setProcessId(config.getProcessId());
		serviceConfiguration.setServiceId(config.getServiceId());
		serviceConfiguration.setPropertyId("samplesrcschema");
		// add transformer service config to service configuration cache with
		// key as service config
		ServiceConfigurationCache.getInstance().addPropertyConfiguration(
				serviceConfiguration, transformerServiceConfig);
	}

	private CamelProcessContext createProcessContext() throws Exception {
		CamelContext camelContextMock = createMock(CamelContext.class);
		ApplicationContext applicationContextMock = createMock(ApplicationContext.class);
		CamelProcessContext processContext = new CamelProcessContext(
				applicationContextMock, null);
		processContext.setCamelContext(camelContextMock);
		return processContext;
	}

	private RuleManagerImpl createRuleManager() throws Exception {
		BundleContext contextMock = createMock(BundleContext.class);
		Bundle bundleMock = createMock(Bundle.class);
		expect(contextMock.getBundle()).andReturn(bundleMock);

		replay(contextMock);
		replay(bundleMock);
		RuleManagerImpl ruleManager = new RuleManagerImpl(contextMock);
		ruleManager.setServiceResolver(new DummyTransformerServiceResolver(
				ruleManager));
		return ruleManager;
	}
}
