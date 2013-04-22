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
 * $Id: DefaultValidatorTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 6, 2010 
 */

package com.headstrong.fusion.services.validator.impl;

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
import com.headstrong.fusion.services.validator.rulemanager.impl.RuleManagerImpl;
import com.headstrong.fusion.services.validator.serviceconfig.FieldSet;
import com.headstrong.fusion.services.validator.serviceconfig.RuleSet;
import com.headstrong.fusion.services.validator.serviceconfig.ValidatorServiceConfig;

/**
 * 
 */
public class DefaultValidatorTest {

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
	public void validate() throws Exception {
		Map<String, Object> headers = new HashMap<String, Object>();

		BusinessObject inputBO = new DefaultBusinessObject();
		inputBO.setObjectDescriptor(sampleObjectDescriptor1());
		inputBO.setValue("sourceAttr", "4");

		Assert.assertEquals("4", inputBO.getValue("sourceAttr"));

		// create valdiator service config with rules list
		ValidatorServiceConfig valdiatorServiceConfig = createValidatorServiceConfig();

		RuleManagerImpl ruleManager = createRuleManager();

		DefaultValidator validator = new DefaultValidator(ruleManager);

		boolean error = false;
		try {
			validator.validate(headers, inputBO, valdiatorServiceConfig);
		} catch (Exception ex) {
			// This catch block should not be executes
			Assert.fail();
		}

		inputBO.setValue("sourceAttr", "test");

		Assert.assertEquals("test", inputBO.getValue("sourceAttr"));

		try {
			validator.validate(headers, inputBO, valdiatorServiceConfig);
		} catch (Exception ex) {
			error = true;
		}
		if (!error) {
			Assert.fail();
		} else {
			error = false;
		}

		inputBO.setValue("sourceAttr", "7");

		Assert.assertEquals("7", inputBO.getValue("sourceAttr"));

		try {
			validator.validate(headers, inputBO, valdiatorServiceConfig);
		} catch (Exception ex) {
			error = true;
		}
		if (!error) {
			Assert.fail();
		} else {
			error = false;
		}

		inputBO.setValue("sourceAttr", "3");

		Assert.assertEquals("3", inputBO.getValue("sourceAttr"));

		try {
			validator.validate(headers, inputBO, valdiatorServiceConfig);
		} catch (Exception ex) {
			Assert.fail();
		}
		if (error) {
			Assert.fail();
		}

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

	/**
	 * Creates Validator service Config with input fields
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	private ValidatorServiceConfig createValidatorServiceConfig()
			throws Exception {
		// create transformer service config
		List<RuleSet> rules = new ArrayList<RuleSet>();

		RuleSet ruleSet = new RuleSet();
		ruleSet.setSequenceId(1);
		ruleSet.setRuleName("integervalidation");

		List<FieldSet> inputFields = new ArrayList<FieldSet>();
		FieldSet fieldset = new FieldSet();
		fieldset.setParamName("operand");
		fieldset.setParamType("input");
		fieldset.setParamValue("sourceAttr");
		inputFields.add(fieldset);

		fieldset = new FieldSet();
		fieldset.setParamName("minvalue");
		fieldset.setParamType("constant");
		fieldset.setParamValue("1");
		inputFields.add(fieldset);

		fieldset = new FieldSet();
		fieldset.setParamName("maxvalue");
		fieldset.setParamType("constant");
		fieldset.setParamValue("5");
		inputFields.add(fieldset);

		ruleSet.setInputFields(inputFields);

		rules.add(ruleSet);

		ValidatorServiceConfig validatorServiceConfig = new ValidatorServiceConfig();
		validatorServiceConfig.setRules(rules);

		return validatorServiceConfig;
	}

	private RuleManagerImpl createRuleManager() throws Exception {
		BundleContext contextMock = createMock(BundleContext.class);
		Bundle bundleMock = createMock(Bundle.class);
		expect(contextMock.getBundle()).andReturn(bundleMock);

		replay(contextMock);
		replay(bundleMock);
		RuleManagerImpl ruleManager = new RuleManagerImpl(contextMock);
		ruleManager.setServiceResolver(new DummyValidatorServiceResolver(
				ruleManager));
		return ruleManager;
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

}
