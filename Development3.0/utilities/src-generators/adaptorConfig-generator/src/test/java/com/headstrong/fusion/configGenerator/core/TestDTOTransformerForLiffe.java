package com.headstrong.fusion.configGenerator.core;

import junit.framework.TestCase;

public class TestDTOTransformerForLiffe extends TestCase {

	public void setUp() {

	}

	public void testConvertToCamelCase() {
		String str = "Transaction ID";
		String strSpecialChar = " text";
		String actSpecialChar = "text";
		String expectedOutput = "transactionId";
		String strCamelCase = DTOTransformerForLiffe.convertToCamelCase(str);
		String strRemoveSpecialChars = DTOTransformerForLiffe
				.removeSpecialChars(strSpecialChar);
		assertEquals(expectedOutput, strCamelCase);
		assertEquals(actSpecialChar, strRemoveSpecialChars);

	}

}
