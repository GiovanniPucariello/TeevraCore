package com.headstrong.fusion.services.transformer.rules.mathrules;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Test case for Integer Division Rule
 */
public class IntegerDivisionRuleTest {

	/**
	 * Test method for
	 * {@link com.headstrong.fusion.services.transformer.rules.mathrules.IntegerDivisionRule#operate(java.util.Map)}.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testOperateMixData() throws Exception {
		IntegerDivisionRule rule = new IntegerDivisionRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "267.5");
		data.put("operand2", "2");
		data.put("operand3", "CEIL");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.ceil(267.5 / 2), Double
				.parseDouble((String) outputData.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOnlyInteger() throws Exception {
		IntegerDivisionRule rule = new IntegerDivisionRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "267");
		data.put("operand2", "2");
		data.put("operand3", "FLOOR");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.floor(267 / 2), Double
				.parseDouble((String) outputData.get("result")), 0.00);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateOnlyDouble() throws Exception {
		IntegerDivisionRule rule = new IntegerDivisionRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "267.5");
		data.put("operand2", "2.3");
		data.put("operand3", "ROUND");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.round(267.5 / 2.3), Double
				.parseDouble((String) outputData.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateCeilUpperCase() throws Exception {
		IntegerDivisionRule rule = new IntegerDivisionRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "267.5");
		data.put("operand2", "2");
		data.put("operand3", "CEIL");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.ceil(267.5 / 2), Double.parseDouble((String) outputData
				.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateCeilLowerCase() throws Exception {
		IntegerDivisionRule rule = new IntegerDivisionRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "267.5");
		data.put("operand2", "2");
		data.put("operand3", "ceil");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.ceil(267.5 / 2), Double.parseDouble((String) outputData
				.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateFloorUpperCase() throws Exception {
		IntegerDivisionRule rule = new IntegerDivisionRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "267.5");
		data.put("operand2", "2");
		data.put("operand3", "FLOOR");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.floor(267.5 / 2), Double.parseDouble((String) outputData
				.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateFloorLowerCase() throws Exception {
		IntegerDivisionRule rule = new IntegerDivisionRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "267.5");
		data.put("operand2", "2");
		data.put("operand3", "floor");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.floor(267.5 / 2), Double.parseDouble((String) outputData
				.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateRoundUpperCase() throws Exception {
		IntegerDivisionRule rule = new IntegerDivisionRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "267.5");
		data.put("operand2", "2");
		data.put("operand3", "ROUND");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.round(267.5 / 2), Double.parseDouble((String) outputData
				.get("result")), 0.01);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testOperateRoundLowerCase() throws Exception {
		IntegerDivisionRule rule = new IntegerDivisionRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "267.5");
		data.put("operand2", "2");
		data.put("operand3", "round");
		Object output = rule.operate(data);
		assertNotNull(output);
		assertTrue(output instanceof Map);
		Map<String, Object> outputData = (Map) output;
		assertTrue(outputData.containsKey("result"));
		assertEquals(Math.round(267.5 / 2), Double.parseDouble((String) outputData
				.get("result")), 0.01);
	}

	@Test
	public void testOperateOneOperandString() throws Exception {
		IntegerDivisionRule rule = new IntegerDivisionRule();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand1", "abcd");
		data.put("operand2", "200.2");
		data.put("operand3", "floor");
		try {
			@SuppressWarnings("unused")
			Object output = rule.operate(data);
			fail("Incorrect input");
		} catch (Exception e) {

		}
	}
}
