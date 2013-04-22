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
 * $Id: ValidatorServiceConfigParserImplTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 26, 2010 
 */

package com.headstrong.fusion.services.validator.serviceconfig;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class ValidatorServiceConfigParserImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void parseConfiguration() throws Exception {
		String ruleConfig = "<ruleset>	"
				+ "<rule name='isnull' sequence='1'>		"
				+ "	<input name='operand' value='name' type='input'/>"
				+ "</rule>" + "<rule name='integervalidation' sequence='2'>		"
				+ "	<input name='operand' value='name' type='input'/>"
				+ "	<input name='minvalue' value='1' type='constant'/>"
				+ "	<input name='maxvalue' value='5' type='constant'/>"
				+ "</rule>" + "</ruleset>";

		ValidatorServiceConfigParser parser = new ValidatorServiceConfigParserImpl();
		ValidatorServiceConfig config = (ValidatorServiceConfig) parser
				.parseConfiguration(ruleConfig);

		List<RuleSet> rules = config.getRules();
		assertEquals(2, rules.size());

		RuleSet rule1 = rules.get(0);
		assertEquals("isnull", rule1.getRuleName());
		assertEquals(1, rule1.getSequenceId());
		assertEquals(1, rule1.getInputFields().size());
		List<FieldSet> inputFields1 = rule1.getInputFields();

		assertEquals("operand", inputFields1.get(0).getParamName());
		assertEquals("name", inputFields1.get(0).getParamValue());
		assertEquals("input", inputFields1.get(0).getParamType());

		RuleSet rule2 = rules.get(1);
		assertEquals("integervalidation", rule2.getRuleName());
		assertEquals(2, rule2.getSequenceId());
		assertEquals(3, rule2.getInputFields().size());
		List<FieldSet> inputFields2 = rule2.getInputFields();

		assertEquals("operand", inputFields2.get(0).getParamName());
		assertEquals("name", inputFields2.get(0).getParamValue());
		assertEquals("input", inputFields2.get(0).getParamType());

		assertEquals("minvalue", inputFields2.get(1).getParamName());
		assertEquals("1", inputFields2.get(1).getParamValue());
		assertEquals("constant", inputFields2.get(1).getParamType());

		assertEquals("maxvalue", inputFields2.get(2).getParamName());
		assertEquals("5", inputFields2.get(2).getParamValue());
		assertEquals("constant", inputFields2.get(2).getParamType());

	}

	@After
	public void tearDown() throws Exception {
	}
}
