package com.headstrong.fusion.services.transformer.rules.mathrules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Test unit for ExponentialRule
 */
public class ExponentialRuleTest {

	/**
	 * Test method for
	 * {@link com.headstrong.fusion.services.transformer.rules.mathrules.ExponentialRule#operate(java.util.Map)}.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateMixData() throws Exception {
		ExponentialRule rule = new ExponentialRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "10.5");
		data.put("operand2", "2");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.pow(10.5, 2), Double.parseDouble((String) outputData
				.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOnlyInteger() throws Exception {
		ExponentialRule rule = new ExponentialRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "10");
		data.put("operand2", "2");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.pow(10, 2), Double.parseDouble((String) outputData
				.get("result")), 0.00);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOnlyDouble() throws Exception {
		ExponentialRule rule = new ExponentialRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "200.1");
		data.put("operand2", "99.34");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.pow(200.1, 99.34), Double
				.parseDouble((String) outputData.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOneOperandNull() throws Exception {
		ExponentialRule rule = new ExponentialRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand2", "200.2");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.pow(0, 200.2), Double.parseDouble((String) outputData
				.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOneOperandString() throws Exception {
		ExponentialRule rule = new ExponentialRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "abcd");
		data.put("operand2", "200.2");
		try {
			@SuppressWarnings("unused")
			Object output = rule.operate(data);
			fail("String operands not allowed");
		} catch (Exception e) {

		}
	}

}
