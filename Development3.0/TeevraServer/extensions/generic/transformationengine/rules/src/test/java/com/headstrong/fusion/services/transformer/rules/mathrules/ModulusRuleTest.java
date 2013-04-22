package com.headstrong.fusion.services.transformer.rules.mathrules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Test unit for ModulusRule
 */
public class ModulusRuleTest {

	/**
	 * Test method for
	 * {@link com.headstrong.fusion.services.transformer.rules.mathrules.ModulusRuleTest#operate(java.util.Map)}.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateMixData() throws Exception {
		ModulusRule rule = new ModulusRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "101.6");
		data.put("operand2", "50");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(101.6 % 50, Double.parseDouble((String) outputData
				.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOnlyInteger() throws Exception {
		ModulusRule rule = new ModulusRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "101");
		data.put("operand2", "50");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(101 % 50, Double.parseDouble((String) outputData
				.get("result")), 0.00);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOnlyDouble() throws Exception {
		ModulusRule rule = new ModulusRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "101.5");
		data.put("operand2", "50.5");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(101.5 % 50.5, Double.parseDouble((String) outputData
				.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOneOperandNull() throws Exception {
		ModulusRule rule = new ModulusRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand2", "101.5");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(0 % 101.5, Double.parseDouble((String) outputData
				.get("result")), 0.01);
	}

	@Test
	public void testOperateOneOperandString() throws Exception {
		ModulusRule rule = new ModulusRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "abcd");
		data.put("operand2", "50");
		try {
			@SuppressWarnings("unused")
			Object output = rule.operate(data);
			fail("String operands not allowed");
		} catch (Exception e) {
		}
	}

}
