package com.headstrong.fusion.services.message.formatter.binary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.dyn.DynamicBusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.services.message.formatter.binary.config.BinaryElement;
import com.headstrong.fusion.services.message.formatter.binary.config.StructsConfigBean;
import com.headstrong.fusion.services.message.formatter.binary.impl.BinaryParserFormatter;

public class BinaryParserFormatterTest {

	static {
		System.loadLibrary("BinaryParserFormatterTest");
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Fetches the byte[] corresponding to the given test case to parse and
	 * convert it to BO
	 * 
	 * @param testCaseNum
	 * @return
	 */
	public native byte[] getByteArray(int testCaseNum);

	/**
	 * Compares the given byte[] corresponding to the test case identified by
	 * testCaseNum to check if the formatting is correct or not
	 * 
	 * @param testCaseNum
	 * @param byteArray
	 * @return
	 */
	public native String compareByteArray(int testCaseNum, byte[] byteArray);

	@Test
	public void testParseEnum() {
		byte[] structContents = getByteArray(3);

		BinaryParserFormatter parserFormatter = BinaryParserFormatter
				.getInstance();
		Map<String, StructsConfigBean> structMap = createStructWithEnum();
		BusinessObject bo = new DynamicBusinessObject();
		String msgStructName = "EnumStructDataT";
		
		try {
			parserFormatter.parse(structContents, bo, structMap, msgStructName, "LITTLE");
			System.out.println("connectionID " + bo.getValue("connectionID"));
			System.out.println("complSeverity " + bo.getValue("complSeverity"));
		} catch (Exception e) {
			fail("Exception received while trying to parse the byte array"
					+ e.getMessage());
		}
	}

	public void Parse() throws NumberFormatException, InvalidAttributeExpressionException {
		// get a pre-defined byte array from native library
		byte[] structContents = getByteArray(1);

		// try to parse the obtained byte array to a business object
		BinaryParserFormatter parserFormatter = BinaryParserFormatter
				.getInstance();
		Map<String, StructsConfigBean> structMap = GenericBinaryStructTest
				.createNewStructConfig();
		BusinessObject bo = new DynamicBusinessObject();
		String msgStructName = "CnctRespDataT";
		try {
			parserFormatter.parse(structContents, bo, structMap, msgStructName,
					"LITTLE");
		} catch (Exception e) {
			fail("Exception received while trying to parse the byte array"
					+ e.getMessage());
		}
		try {

			// check the values in BO if it is conforming to what we have
			// specified in native side
			assertEquals("connectionID doesn't match", (Short) bo
					.getValue("connectionID"), Short.valueOf("-56"));
			assertEquals("connectionID1 doesn't match", (Integer) bo
					.getValue("connectionID1"), Short.valueOf("156"));
			assertEquals("VMQname doesn't match", (String) bo
					.getValue("VMQname"), "TESTING VMQ");
			Character prodMode = (Character) bo.getValue("prodMode");
			Character prodModeVal = new Character('R');
			assertEquals("ProdMode doesn't match", prodMode, prodModeVal);
		} catch (AttributeNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void Format() throws InvalidAttributeExpressionException {
		BinaryParserFormatter parserFormatter = BinaryParserFormatter
				.getInstance();
		Map<String, StructsConfigBean> structMap = GenericBinaryStructTest
				.createNewStructConfig();

		// get a pre-defined business object corresponding to the struct in
		// native side
		BusinessObject bo = null;
		try {
			bo = GenericBinaryStructTest.createBusinessObject();
			bo = (BusinessObject) bo
					.getValue("thirdLevel.secondLevel.firstLevel");
		} catch (AttributeNotFoundException e) {
			fail("Not able to get the required Business Object for testing");
		}

		// format BO to a byte array
		String msgStructName = "CnctRespDataT";
		byte[] byteArray = null;
		try {
			byteArray = parserFormatter.format(bo, structMap, msgStructName,
					"LITTLE");
		} catch (Exception e) {
			fail("Exception received while trying to format the BO into a byte array"
					+ e.getMessage());
		}

		// pass the array to native side to check the contents if valid or not
		String status = compareByteArray(1, byteArray);
		assertEquals(status, "true", status);
	}

	@Test
	public void testDummy() {
		assertEquals("true", "true");
	}

	public void WithArray() throws NumberFormatException, InvalidAttributeExpressionException {
		// get a pre-defined byte array from native library
		byte[] structContents = getByteArray(2);

		// try to parse the obtained byte array to a business object
		BinaryParserFormatter parserFormatter = BinaryParserFormatter
				.getInstance();
		Map<String, StructsConfigBean> structMap = GenericBinaryStructTest
				.createNewStructConfig();
		BusinessObject bo = new DynamicBusinessObject();
		String msgStructName = "LoginReqDataT";
		try {
			parserFormatter.parse(structContents, bo, structMap, msgStructName,
					"LITTLE");
		} catch (Exception e) {
			fail("Exception received while trying to parse the byte array"
					+ e.getMessage());
		}
		try {

			// check the values in BO if it is conforming to what we have
			// specified in native side
			assertEquals("connectionID doesn't match", (Short) bo
					.getValue("firstLevel[0].connectionID"), Short
					.valueOf("-56"));
			assertEquals("connectionID1 doesn't match", (Integer) bo
					.getValue("firstLevel[0].connectionID1"), Short
					.valueOf("156"));
			assertEquals("VMQname doesn't match", (String) bo
					.getValue("firstLevel[0].VMQname"), "TESTING VMQ");
			Character prodMode = (Character) bo
					.getValue("firstLevel[0].prodMode");
			Character prodModeVal = new Character('R');
			assertEquals("ProdMode doesn't match", prodMode, prodModeVal);
		} catch (AttributeNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Map<String, StructsConfigBean> createStructWithEnum() {
		Map<String, StructsConfigBean> structsMap = new HashMap<String, StructsConfigBean>();

		StructsConfigBean config = new StructsConfigBean();
		List<BinaryElement> enumStructElements = new ArrayList<BinaryElement>();
		enumStructElements.add(new BinaryElement("connectionID", "SHORT"));
		enumStructElements.add(new BinaryElement("complSeverity", "INT"));
		config.setElements(enumStructElements);
		config.setParentStructName("EnumStructDataT");
		structsMap.put("EnumStructDataT", config);

		return structsMap;

	}
}
