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
 * $Id: DefaultTransformerTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 26, 2010 
 */

package com.headstrong.fusion.services.transformer.impl;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.headstrong.fusion.services.transformer.rulemanager.impl.RuleManagerImpl;
import com.headstrong.fusion.services.transformer.serviceconfig.FieldSet;
import com.headstrong.fusion.services.transformer.serviceconfig.RuleSet;
import com.headstrong.fusion.services.transformer.serviceconfig.TransformerServiceConfig;

/**
 * 
 */
public class DefaultTransformerTest {

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
	public void transform() throws Exception {

		Map<String, Object> headers = new HashMap<String, Object>();

		BusinessObject inputBO = new DefaultBusinessObject();
		inputBO.setObjectDescriptor(sampleObjectDescriptor1());
		inputBO.setValue("sourceAttr", "TeevraTransfor");

		Assert.assertEquals("TeevraTransfor", inputBO.getValue("sourceAttr"));

		BusinessObject outputBO = new DefaultBusinessObject();
		outputBO.setObjectDescriptor(sampleObjectDescriptor2());
		outputBO.setValue("targetAttr", null);

		Assert.assertEquals(null, outputBO.getValue("targetAttr"));

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

		RuleManagerImpl ruleManager = createRuleManager();

		DefaultTransformer transformer = new DefaultTransformer(ruleManager);
		transformer.transform(headers, inputBO, outputBO,
				transformerServiceConfig);

		Assert.assertEquals("Transfor", outputBO.getValue("targetAttr"));

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

	private ObjectDescriptor sampleObjectDescriptor2() {
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
