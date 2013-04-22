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
 * $Id: TransformerServiceConfigParserImplTest.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 10, 2008 
 */

package com.headstrong.fusion.services.transformer.serviceconfig;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 */
public class TransformerServiceConfigParserImplTest {

	
	/**
	 * Test method for {@link com.headstrong.fusion.services.transformer.serviceconfig.TransformerServiceConfigParserImpl#parseConfiguration(java.lang.Object)}.
	 */
	@Test
	public void testParseConfiguration() throws Exception{
		String ruleConfig="<ruleset>	" +
				"<rule name='substring' sequence='1'>		" +
				"	<input name='operand' value='name' type='input'/>" +
				"	<input name='beginindex' value='id' type='input'/>" +
				"	<input name='endIndex' value='5' type='constant'/>" +
				"	<output name='result' value='newname1' type='temp'/>" +
				
				"</rule>" +
				"<rule name='addrule' sequence='2'>		" +
				"	<input name='operand1' value='name' type='input'/>" +
				"	<input name='operand2' value='id' type='input'/>" +
				"	<input name='operand3' value='5' type='constant'/>" +
				"	<input name='totaloperand' value='3' type='constant'/>" +
				"	<output name='result' value='newname' type='output'/>" +
				"</rule>" +
				"</ruleset>";
	TransformerServiceConfigParser parser=new  TransformerServiceConfigParserImpl();
	TransformerServiceConfig config=(TransformerServiceConfig
			)parser.parseConfiguration(ruleConfig);
	
	List<RuleSet> rules=config.getRules();
	assertEquals(2, rules.size());
	
	RuleSet rule1=rules.get(0);
	assertEquals("substring", rule1.getRuleName());
	assertEquals(1, rule1.getSequenceId());
	assertEquals(3, rule1.getInputFields().size());
	assertEquals(1, rule1.getOutputFields().size());
	List<FieldSet> inputFields1=rule1.getInputFields();
	
	assertEquals("operand", inputFields1.get(0).getParamName());
	assertEquals("name", inputFields1.get(0).getParamValue());
	assertEquals("input", inputFields1.get(0).getParamType());
	
	assertEquals("beginindex", inputFields1.get(1).getParamName());
	assertEquals("id", inputFields1.get(1).getParamValue());
	assertEquals("input", inputFields1.get(1).getParamType());
	
	assertEquals("endindex", inputFields1.get(2).getParamName());
	assertEquals("5", inputFields1.get(2).getParamValue());
	assertEquals("constant", inputFields1.get(2).getParamType());
	
	
	RuleSet rule2=rules.get(1);
	assertEquals("addrule", rule2.getRuleName());
	assertEquals(2, rule2.getSequenceId());
	assertEquals(4, rule2.getInputFields().size());
	assertEquals(1, rule2.getOutputFields().size());
	
	
	}

}
