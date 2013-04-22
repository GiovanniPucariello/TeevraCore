package com.headstrong.fusion.bo.java;

import org.junit.Test;
import junit.framework.TestCase;
import com.headstrong.fusion.bo.AttributeExpression;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

public class AttributeExpressionTest extends TestCase {

	public void testParseAttributeExpressionForNullValue() throws Exception {
		boolean thrown = false;
		@SuppressWarnings("unused")
		AttributeExpression attributeExpression = null;
		try {
			attributeExpression = AttributeExpression
					.parseAttributeExpression(null);
		} catch (InvalidAttributeExpressionException e1) {
			thrown = true;
		}
		assertTrue(thrown);
	}

	public void testParseAttributeExpressionForConsecutiveDots()
			throws Exception {
		boolean thrown = false;
		@SuppressWarnings("unused")
		AttributeExpression attributeExpression = null;
		try {
			attributeExpression = AttributeExpression
					.parseAttributeExpression("sampleJavaClass1...attribute1");
		} catch (InvalidAttributeExpressionException e1) {
			thrown = true;
		}
		assertTrue(thrown);
	}

	public void testParseAttributeExpressionForSpaces() throws Exception {
		AttributeExpression attributeExpression = null;
			attributeExpression = AttributeExpression
					.parseAttributeExpression("sampleJavaClass1.  attribute1");
			String os = attributeExpression.getAttribute();
			assertEquals("sampleJavaClass1", os);
	}

	public void testParseAttributeExpressionForSplChars() throws Exception {
		boolean thrown = false;
		@SuppressWarnings("unused")
		AttributeExpression attributeExpression = null;
		try {
			attributeExpression = AttributeExpression
					.parseAttributeExpression("sampleJavaClass1.#????");
		} catch (InvalidAttributeExpressionException e1) {
			thrown = true;
		}
		assertTrue(thrown);
	}

	public void testParseAttributeExpression() throws Exception {
		AttributeExpression attributeExpression = null;
		attributeExpression = AttributeExpression
				.parseAttributeExpression("sampleJavaClass1.attribute1");
		String os = attributeExpression.getAttribute();
		assertEquals("sampleJavaClass1", os);
	}

	public void testParseAttributeExpressionForArrFilter1() throws Exception {
		AttributeExpression attributeExpression = null;
		attributeExpression = AttributeExpression
				.parseAttributeExpression("sampleJavaClass2List[0].attribute1");
		String os = attributeExpression.getAttribute();
		assertEquals("sampleJavaClass2List", os);
	}

	public void testParseAttributeExpressionForArrFilter2() throws Exception {
		AttributeExpression attributeExpression = null;
		attributeExpression = AttributeExpression
				.parseAttributeExpression("sampleJavaClass2List[0].sampleJavaClass3.attribute3[0]");
		String os1 = attributeExpression.getAttribute();
		AttributeExpression os2 = attributeExpression.nextAttribute();
		String os3 = os2.getAttribute();
		assertEquals("sampleJavaClass2List", os1);
		assertEquals("sampleJavaClass3", os3);
	}

	public void testParseAttributeExpressionForKeyValueArrFilter()
			throws Exception {
		AttributeExpression attributeExpression = null;
		attributeExpression = AttributeExpression
				.parseAttributeExpression("sampleJavaClass2List[stringAttribute=attribute3].stringAttribute");
		String os = attributeExpression.getAttribute();
		assertEquals("sampleJavaClass2List", os);
	}

	public void testParseAttributeExpressionForComplexAllocationSetter()
			throws Exception {
		AttributeExpression attributeExpression = null;
		attributeExpression = AttributeExpression
				.parseAttributeExpression("Alloc[0].Pty[R=1].ID");
		String os = attributeExpression.getAttribute();
		assertEquals("Alloc", os);
	}

	public void testParseAttributeExpressionForEnumInFilter() throws Exception {
		AttributeExpression attributeExpression = null;
		attributeExpression = AttributeExpression
				.parseAttributeExpression("message.value.Amt[Typ = PREM].Amt");
		String os = attributeExpression.getAttribute();
		assertEquals("message", os);
	}
}
