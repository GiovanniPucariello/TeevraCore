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
 * $Id: ArithmeticExpressionRuleTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 29, 2009 
 */

package com.headstrong.fusion.services.transformer.rules.mathrules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectFactory;
import com.headstrong.fusion.bo.BusinessObjectFactory.Type;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.parser.ExpressionParser;
import com.headstrong.fusion.commons.util.FusionUtil;

/**
 * Test Case for Arithmetic Expression Rule which tests a complex expression, an
 * expression with one of the temporary field null,an expression with one of the
 * input business object field null,an expression with incorrect format(i.e, not
 * appending '@' before input BO fields), an expression with string as one of
 * the fields
 */
public class ArithmeticExpressionRuleTest {
	/**
	 * Test method for
	 * {@link com.headstrong.fusion.services.transformer.rules.mathrules.ArithmeticExpressionRule#operate(java.util.Map)}.
	 */

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateExpression() throws Exception {
		ArithmeticExpressionRule rule = new ArithmeticExpressionRule();

		BusinessObject inputBO = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		inputBO.setValue("a", 10.01);
		inputBO.setValue("b", 10);

		Map<String, Object> header = new HashMap<String, Object>();
		header.put("header", "header");

		Map<String, Object> tempFields = new HashMap<String, Object>();
		tempFields.put("c", 1.1);
		tempFields.put("d", 2);
		String line = "((@a +c)* @b)/d";
		ExpressionParser parser = new ExpressionParser();
		Expression exp = parser.parse(line);

		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(FusionConstants.INPUT_BO, inputBO);
		dataMap.put(FusionConstants.TEMP_FIELDS, tempFields);
		dataMap.put(FusionConstants.HEADERS, header);
		FusionUtil.populateMap(dataMap, "expression", exp);

		Object output = rule.operate(dataMap);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));

		assertEquals(((10.01 + 1.1) * 10) / 2, Double
				.parseDouble((String) outputData.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOneTempFieldNull() throws Exception {
		ArithmeticExpressionRule rule = new ArithmeticExpressionRule();

		BusinessObject inputBO = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		inputBO.setValue("a", 10.01);
		inputBO.setValue("b", 10);

		Map<String, Object> header = new HashMap<String, Object>();
		header.put("header", "header");

		Map<String, Object> tempFields = new HashMap<String, Object>();
		tempFields.put("c", null);
		tempFields.put("d", 2);
		String line = "((@a +c)* @b)/d";
		ExpressionParser parser = new ExpressionParser();
		Expression exp = parser.parse(line);

		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(FusionConstants.INPUT_BO, inputBO);
		dataMap.put(FusionConstants.TEMP_FIELDS, tempFields);
		dataMap.put(FusionConstants.HEADERS, header);
		FusionUtil.populateMap(dataMap, "expression", exp);

		try {
			rule.operate(dataMap);
			fail("Temp fields cannot be null");
		} catch (Exception e) {

		}
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOneBOFieldNull() throws Exception {
		ArithmeticExpressionRule rule = new ArithmeticExpressionRule();

		BusinessObject inputBO = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		inputBO.setValue("a", 10.01);
		inputBO.setValue("b", null);

		Map<String, Object> header = new HashMap<String, Object>();
		header.put("header", "header");

		Map<String, Object> tempFields = new HashMap<String, Object>();
		tempFields.put("c", 1.1);
		tempFields.put("d", 2);
		String line = "((@a +c)* @b)/d";
		ExpressionParser parser = new ExpressionParser();
		Expression exp = parser.parse(line);

		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(FusionConstants.INPUT_BO, inputBO);
		dataMap.put(FusionConstants.TEMP_FIELDS, tempFields);
		dataMap.put(FusionConstants.HEADERS, header);
		FusionUtil.populateMap(dataMap, "expression", exp);

		try {
			rule.operate(dataMap);
			fail("Input BO fields cannot be null");
		} catch (Exception e) {

		}

	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateIncorrectFormat() throws Exception {
		ArithmeticExpressionRule rule = new ArithmeticExpressionRule();

		BusinessObject inputBO = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		inputBO.setValue("a", 10.01);
		inputBO.setValue("b", 10);

		Map<String, Object> header = new HashMap<String, Object>();
		header.put("header", "header");

		Map<String, Object> tempFields = new HashMap<String, Object>();
		tempFields.put("c", 1.1);
		tempFields.put("d", 2);
		String line = "((@a +c)* b)/d";
		ExpressionParser parser = new ExpressionParser();
		Expression exp = parser.parse(line);

		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(FusionConstants.INPUT_BO, inputBO);
		dataMap.put(FusionConstants.TEMP_FIELDS, tempFields);
		dataMap.put(FusionConstants.HEADERS, header);
		FusionUtil.populateMap(dataMap, "expression", exp);

		try {
			rule.operate(dataMap);
			fail("@ should be appended before Input BO fields ");
		} catch (Exception e) {

		}
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOneFieldString() throws Exception {
		ArithmeticExpressionRule rule = new ArithmeticExpressionRule();

		BusinessObject inputBO = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		inputBO.setValue("a", 10.01);
		inputBO.setValue("b", "test");

		Map<String, Object> header = new HashMap<String, Object>();
		header.put("header", "header");

		Map<String, Object> tempFields = new HashMap<String, Object>();
		tempFields.put("c", 1.1);
		tempFields.put("d", 2);
		String line = "((@a +c)* @b)/d";
		ExpressionParser parser = new ExpressionParser();
		Expression exp = parser.parse(line);

		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(FusionConstants.INPUT_BO, inputBO);
		dataMap.put(FusionConstants.TEMP_FIELDS, tempFields);
		dataMap.put(FusionConstants.HEADERS, header);
		FusionUtil.populateMap(dataMap, "expression", exp);

		try {
			rule.operate(dataMap);
			fail("String operands not allowed ");
		} catch (Exception e) {

		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateMathExpression() throws Exception {
		ArithmeticExpressionRule rule = new ArithmeticExpressionRule();

		BusinessObject inputBO = BusinessObjectFactory
				.getBusinessObject(Type.Dynamic);
		inputBO.setValue("a", 64.9);
		inputBO.setValue("b", 10);

		Map<String, Object> header = new HashMap<String, Object>();
		header.put("header", "header");

		Map<String, Object> tempFields = new HashMap<String, Object>();
		tempFields.put("#L", 1);
		tempFields.put("#D", 10);
		//String line = "(@message.value.instrmt.strkpx-(@message.value.instrmt.strkpx%pow(10,@L)))/pow(10,@L) + ((@message.value.instrmt.strkpx%pow(10,@L))/@D)";
		
		String line = "((@a-(@a%1))*pow(10,@L))+((@a%1)*@D)";
		
		//String line = "((#a +c)* #b)/d";
		//String line = "pow(#a,#b)";
		ExpressionParser parser = new ExpressionParser();
		Expression exp = parser.parse(line);

		Map<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put(FusionConstants.INPUT_BO, inputBO);
		dataMap.put(FusionConstants.TEMP_FIELDS, tempFields);
		dataMap.put(FusionConstants.HEADERS, header);
		FusionUtil.populateMap(dataMap, "expression", exp);

		Object output = rule.operate(dataMap);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));

		assertEquals(649, Double
				.parseDouble((String) outputData.get("result")), 0.01);
	}
}
