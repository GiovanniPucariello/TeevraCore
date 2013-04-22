package com.headstrong.fusion.services.validator.rules.integer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.headstrong.fusion.services.validator.rulemanager.exception.RuleOperationFailedException;

public class IntegerValidationTest {

	@Test
	public void testValidate() throws Exception {
		IntegerValidation integerValidation = new IntegerValidation();
		Map<String, Object> data = new HashMap<String, Object>();

		data.put("operand", 100);
		Object outputData = integerValidation
				.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		data.put("operand", "abc");
		outputData = integerValidation.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

		data.put("operand", "123");
		outputData = integerValidation.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		data.put("operand", "123.23");
		outputData = integerValidation.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

	}

	@Test
	public void testValidateMinCheck() throws Exception {
		IntegerValidation integerValidation = new IntegerValidation();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand", 100);

		data.put("minvalue", 50);
		Object outputData = integerValidation
				.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		data.put("minvalue", "50");
		outputData = integerValidation.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		data.put("minvalue", 150);
		outputData = integerValidation.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

		data.put("minvalue", "150");
		outputData = integerValidation.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

	}

	@Test
	public void testValidateMaxCheck() throws Exception {
		IntegerValidation integerValidation = new IntegerValidation();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand", 100);

		data.put("maxvalue", 150);
		Object outputData = integerValidation
				.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		data.put("maxvalue", "150");
		outputData = integerValidation.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		data.put("maxvalue", 50);
		outputData = integerValidation.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

		data.put("maxvalue", "50");
		outputData = integerValidation.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);
	}

	@Test
	public void testValidateRangeCheck() throws Exception {
		IntegerValidation integerValidation = new IntegerValidation();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand", 100);

		data.put("maxvalue", 150);
		data.put("minvalue", 50);
		Object outputData = integerValidation
				.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		data.put("maxvalue", 50);
		data.put("minvalue", 50);
		outputData = integerValidation.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

		data.put("maxvalue", 100);
		data.put("minvalue", 100);
		outputData = integerValidation.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertTrue((Boolean) outputData);

		data.put("maxvalue", 150);
		data.put("minvalue", 150);
		outputData = integerValidation.validate(data, new StringBuffer());
		assertTrue(outputData instanceof Boolean);
		assertFalse((Boolean) outputData);

	}

	@Test
	public void testValidateInvalidateMinValue() {

		IntegerValidation integerValidation = new IntegerValidation();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand", 100);

		data.put("minvalue", "abc");

		try {
			integerValidation.validate(data, new StringBuffer());
			fail("Min value is not integer. should have thrown error");

		} catch (RuleOperationFailedException e) {
		}

	}
	
	@Test
	public void testValidateInvalidateMaxValue() {

		IntegerValidation integerValidation = new IntegerValidation();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("operand", 100);

		data.put("maxvalue", "abc");

		try {
			integerValidation.validate(data, new StringBuffer());
			fail("Max value is not integer. should have thrown error");

		} catch (RuleOperationFailedException e) {
		}

	}

}
