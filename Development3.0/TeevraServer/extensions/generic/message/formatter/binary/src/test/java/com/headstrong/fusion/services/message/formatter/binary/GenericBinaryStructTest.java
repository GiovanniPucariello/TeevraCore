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
 * $Id: GenericBinaryStructTest.java
 * $Revision:
 * $Author: MBafna
 * $DateTime: Apr 20, 2009
 */

package com.headstrong.fusion.services.message.formatter.binary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectSource;
import com.headstrong.fusion.bo.dyn.DynamicBusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.services.message.formatter.binary.config.BinaryElement;
import com.headstrong.fusion.services.message.formatter.binary.config.StructsConfigBean;

/**
 * 
 */
public class GenericBinaryStructTest {

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	public static Map<String, StructsConfigBean> createNewStructConfig() {
		Map<String, StructsConfigBean> structsMap = new HashMap<String, StructsConfigBean>();

		StructsConfigBean config = new StructsConfigBean();
		List<BinaryElement> cnctRespData = new ArrayList<BinaryElement>();
		cnctRespData.add(new BinaryElement("connectionID", "SHORT"));
		cnctRespData.add(new BinaryElement("connectionID1", "USHORT"));
		cnctRespData.add(new BinaryElement("VMQname", "UTFSTRING", "20"));
		cnctRespData.add(new BinaryElement("prodMode", "CHAR"));
		config.setElements(cnctRespData);
		config.setParentStructName("CnctRespDataT");
		structsMap.put("CnctRespDataT", config);

		config = new StructsConfigBean();
		List<BinaryElement> loginReqDataT = new ArrayList<BinaryElement>();
		loginReqDataT.add(new BinaryElement("userID", "UTFSTRING", "20"));
		loginReqDataT.add(new BinaryElement("closure", "CHAR"));
		loginReqDataT.add(new BinaryElement("applVersion", "INT"));
		loginReqDataT.add(new BinaryElement("authorizationDataLength", "INT"));
		loginReqDataT
				.add(new BinaryElement("firstLevel", "CnctRespDataT", "2"));
		loginReqDataT.add(new BinaryElement("x", "FLOAT"));
		loginReqDataT.add(new BinaryElement("y", "DOUBLE"));
		config.setElements(loginReqDataT);
		config.setParentStructName("LoginReqDataT");
		structsMap.put("LoginReqDataT", config);

		config = new StructsConfigBean();
		List<BinaryElement> reqCntrlT = new ArrayList<BinaryElement>();
		reqCntrlT.add(new BinaryElement("connectionID", "INT"));
		reqCntrlT.add(new BinaryElement("dbApplID", "UINT"));
		reqCntrlT.add(new BinaryElement("appDescr", "UTFSTRING", "20"));
		reqCntrlT.add(new BinaryElement("secondLevel", "LoginReqDataT"));
		reqCntrlT.add(new BinaryElement("reqID", "INT"));
		reqCntrlT.add(new BinaryElement("resubmitFlag", "INT"));
		reqCntrlT.add(new BinaryElement("resubmitNo", "UINT"));
		reqCntrlT.add(new BinaryElement("VCIver", "UTFSTRING", "20"));
		reqCntrlT.add(new BinaryElement("loginID", "INT"));
		config.setElements(reqCntrlT);
		config.setParentStructName("ReqCntrlT");
		structsMap.put("ReqCntrlT", config);

		config = new StructsConfigBean();
		List<BinaryElement> complexStruct = new ArrayList<BinaryElement>();
		complexStruct.add(new BinaryElement("num", "INT"));
		complexStruct.add(new BinaryElement("num1", "LONG"));
		complexStruct.add(new BinaryElement("num2", "LONG"));
		complexStruct.add(new BinaryElement("thirdLevel", "ReqCntrlT"));
		complexStruct.add(new BinaryElement("dummy", "FLOAT"));
		complexStruct.add(new BinaryElement("name", "UTFSTRING", "30"));
		complexStruct.add(new BinaryElement("x", "INT"));
		complexStruct.add(new BinaryElement("y", "DOUBLE"));
		complexStruct.add(new BinaryElement("z", "CHAR"));
		config.setElements(complexStruct);
		config.setParentStructName("complexStruct");
		structsMap.put("complexStruct", config);

		return structsMap;

	}

	/**
	 * This method will create {@link AbstractBinaryStruct} using the
	 * {@link StructsConfigBean} given.
	 * 
	 * @param config
	 * @return
	 * @throws Exception
	 */
	public static AbstractBinaryStruct createStruct(StructsConfigBean config,
			Map<String, StructsConfigBean> structsMap) throws Exception {
		return createInnerStruct(config, config.getParentStructName(),
				structsMap);
	}

	/**
	 * This method will create the structs using the {@link StructsConfigBean}
	 * given and for the structure specified by the name structName. It will
	 * recursively call the method to create inner structures.
	 * 
	 * @param config
	 * @param structName
	 * @return
	 * @throws Exception
	 */
	private static AbstractBinaryStruct createInnerStruct(
			StructsConfigBean config, String structName,
			Map<String, StructsConfigBean> structsMap) throws Exception {
		AbstractBinaryStruct struct;

		/**
		 * Check if Union or not. If union, create genericbinaryUnion else
		 * create genericbinarystruct.
		 */
		if (config.isUnion()) {
			struct = new GenericBinaryUnion();
		} else {
			struct = new GenericBinaryStruct();

		}
		struct.setBoSource(new BusinessObjectSource() {
			@Override
			public BusinessObject getBusinessObject() {
				return new DynamicBusinessObject(){
					int counter=0;
					/* (non-Javadoc)
					 * @see com.headstrong.fusion.bo.dyn.DynamicBusinessObject#getValue(java.lang.String)
					 */
					@Override
					public Object getValue(String attributeName) throws AttributeNotFoundException, InvalidAttributeExpressionException {
						if(counter++<1){
							System.out.println("Substituted the Bo Source");
						}
						return super.getValue(attributeName);
					}
				};
			}
		});
		/**
		 * Go thru each element in the structure.
		 */
		for (BinaryElement element : config.getElements()) {
			/**
			 * If element is a structure, then make a recursive call. else, add
			 * member element.
			 */
			if (structsMap.get(element.getType()) == null) {
				struct.addMember(element.getName(), element.getType(), element
						.getSize());
			} else {
				struct
						.addInner(element.getName(), createInnerStruct(
								structsMap.get(element.getType()), element
										.getType(), structsMap));
			}
		}
		return struct;
	}

	private GenericBinaryStruct createStruct() throws Exception {
		GenericBinaryStruct CnctRespDataT = new GenericBinaryStruct();
		CnctRespDataT.addMember("connectionID", GenericBinaryStruct.SHORT);
		CnctRespDataT.addMember("connectionID1", GenericBinaryStruct.USHORT);
		CnctRespDataT.addMember("VMQname", GenericBinaryStruct.UTFSTRING, "20");
		CnctRespDataT.addMember("prodMode", GenericBinaryStruct.CHAR);

		GenericBinaryStruct LoginReqDataT = new GenericBinaryStruct();
		LoginReqDataT.addMember("userID", GenericBinaryStruct.UTFSTRING, "20");
		LoginReqDataT.addMember("closure", GenericBinaryStruct.CHAR);
		LoginReqDataT.addMember("applVersion", GenericBinaryStruct.INT);
		LoginReqDataT.addMember("authorizationDataLength",
				GenericBinaryStruct.INT);
		LoginReqDataT.addInner("firstLevel", CnctRespDataT);
		LoginReqDataT.addMember("x", GenericBinaryStruct.FLOAT);
		LoginReqDataT.addMember("y", GenericBinaryStruct.DOUBLE);

		GenericBinaryStruct ReqCntrlT = new GenericBinaryStruct();
		ReqCntrlT.addMember("connectionID", GenericBinaryStruct.INT);
		ReqCntrlT.addMember("dbApplID", GenericBinaryStruct.UINT);
		ReqCntrlT.addMember("appDescr", GenericBinaryStruct.UTFSTRING, "20");
		ReqCntrlT.addInner("secondLevel", LoginReqDataT);
		ReqCntrlT.addMember("reqID", GenericBinaryStruct.INT);
		ReqCntrlT.addMember("resubmitFlag", GenericBinaryStruct.INT);
		ReqCntrlT.addMember("resubmitNo", GenericBinaryStruct.UINT);
		ReqCntrlT.addMember("VCIver", GenericBinaryStruct.UTFSTRING, "20");
		ReqCntrlT.addMember("loginID", GenericBinaryStruct.INT);

		GenericBinaryStruct complexStruct = new GenericBinaryStruct();
		complexStruct.addMember("num", GenericBinaryStruct.INT);
		complexStruct.addMember("num1", GenericBinaryStruct.LONG);
		complexStruct.addMember("num2", GenericBinaryStruct.LONG);
		complexStruct.addInner("thirdLevel", ReqCntrlT);
		complexStruct.addMember("dummy", GenericBinaryStruct.FLOAT);
		complexStruct.addMember("name", GenericBinaryStruct.UTFSTRING, "30");
		complexStruct.addMember("x", GenericBinaryStruct.INT);
		complexStruct.addMember("y", GenericBinaryStruct.DOUBLE);
		complexStruct.addMember("z", GenericBinaryStruct.CHAR);

		return complexStruct;

	}

	public static BusinessObject createBusinessObject()
			throws AttributeNotFoundException, InvalidAttributeExpressionException {
		BusinessObject data = new DynamicBusinessObject();

		data.setValue("num", -123);
		data.setValue("num1", (long) -1234556);
		data.setValue("num2", (long) 3434);
		data.setValue("x", 23821);
		data.setValue("y", (double) 63783.3482);
		data.setValue("z", 'z');
		data.setValue("name", "ARUN");
		data.setValue("dummy", (float) 10.25);

		BusinessObject thirdLeveldata = new DynamicBusinessObject();
		thirdLeveldata.setValue("connectionID", 456);
		thirdLeveldata.setValue("dbApplID", (long) 678);
		thirdLeveldata.setValue("appDescr", "App Description");
		thirdLeveldata.setValue("reqID", 356);
		thirdLeveldata.setValue("resubmitFlag", 0);
		thirdLeveldata.setValue("resubmitNo", (long) 12345);
		thirdLeveldata.setValue("VCIver", "VERSION 1");
		thirdLeveldata.setValue("loginID", 4657);

		BusinessObject secondLevel = new DynamicBusinessObject();
		secondLevel.setValue("userID", "ARUN");
		secondLevel.setValue("closure", 'Y');
		secondLevel.setValue("applVersion", 145);
		secondLevel.setValue("authorizationDataLength", 4531);
		secondLevel.setValue("x", (float) 454.23);
		secondLevel.setValue("y", (double) 3485);

		BusinessObject firstLevel = new DynamicBusinessObject();
		firstLevel.setValue("connectionID", (short) -56);
		firstLevel.setValue("connectionID1", 156);
		firstLevel.setValue("VMQname", "TESTING VMQ");
		firstLevel.setValue("prodMode", 'R');
		secondLevel.setValue("firstLevel", firstLevel);

		thirdLeveldata.setValue("secondLevel", secondLevel);
		data.setValue("thirdLevel", thirdLeveldata);

		return data;

	}

	public void testDummy() {
		assertEquals("true", "true");
	}

	/**
	 * Test method for
	 * {@link com.headstrong.fusion.services.message.formatter.binary.GenericBinaryStruct#addMember(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAddMember() throws Exception {

		GenericBinaryStruct struct1 = createStruct();
		BusinessObject data1 = createBusinessObject();
		struct1.setBusinessObjectIntoStruct("", data1);

		byte[] struct1Data = struct1.getByteArray();

		Map<String, StructsConfigBean> structsMap = createNewStructConfig();
		AbstractBinaryStruct struct2 = createStruct(structsMap
				.get("complexStruct"), structsMap);
		ByteBuffer byteBuffer = ByteBuffer.wrap(struct1Data);
		byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
		struct2.setByteBuffer(byteBuffer, 0);
		BusinessObject data2 = new DynamicBusinessObject();
		data2 = struct2.getBusinessObjectFromStruct("", data2, "RESPONSE");

		StringBuffer errorMsg = new StringBuffer();
		assertTrue("Error in comparing BO " + errorMsg.toString(),
				compareBusinessObject(data1, data2, errorMsg));
		/*
		 * FileOutputStream fos = new FileOutputStream(new
		 * File("d:\\temp.bin")); struct1.write(fos);
		 * 
		 * fos.close();
		 * 
		 * FileOutputStream fos1 = new FileOutputStream(new
		 * File("d:\\temp1.bin")); struct2.write(fos1);
		 * 
		 * fos1.close();
		 */
	}

	/**
	 * 
	 * @param src
	 * @param dest
	 * @param errorMsg
	 *            TODO
	 * @return
	 * @throws AttributeNotFoundException
	 * @throws InvalidAttributeExpressionException 
	 */
	public boolean compareBusinessObject(BusinessObject src,
			BusinessObject dest, StringBuffer errorMsg)
			throws AttributeNotFoundException, InvalidAttributeExpressionException {
		Map<String, Object> attrMap = src.getAttributeValues();
		for (String attrName : attrMap.keySet()) {
			if (attrMap.get(attrName) instanceof BusinessObject) {

				if (dest.getValue(attrName) instanceof BusinessObject) {
					if (!compareBusinessObject((BusinessObject) src
							.getValue(attrName), (BusinessObject) dest
							.getValue(attrName), errorMsg)) {
						errorMsg.append("Attribute " + attrName
								+ " doesn't match");
						return false;
					}
				} else {
					errorMsg.append("Attribute " + attrName + " doesn't match");
					return false;
				}
			} else {
				if (!src.getValue(attrName).equals(dest.getValue(attrName))) {
					errorMsg.append("Attribute " + attrName + " doesn't match");
					errorMsg.append("Src " + src.getValue(attrName) + " Destn "
							+ dest.getValue(attrName));
					return false;
				}
			}
		}
		return true;
	}

	public void union() throws Exception {

		GenericBinaryStruct CnctRespDataT = new GenericBinaryStruct();
		CnctRespDataT.addMember("connectionID", GenericBinaryStruct.SHORT);
		CnctRespDataT.addMember("connectionID1", GenericBinaryStruct.USHORT);
		CnctRespDataT.addMember("VMQname", GenericBinaryStruct.UTFSTRING, "20");
		CnctRespDataT.addMember("prodMode", GenericBinaryStruct.CHAR);

		GenericBinaryStruct LoginReqDataT = new GenericBinaryStruct();
		LoginReqDataT.addMember("userID", GenericBinaryStruct.UTFSTRING, "20");
		LoginReqDataT.addMember("closure", GenericBinaryStruct.CHAR);
		LoginReqDataT.addMember("applVersion", GenericBinaryStruct.INT);
		LoginReqDataT.addMember("authorizationDataLength",
				GenericBinaryStruct.INT);
		LoginReqDataT.addMember("x", GenericBinaryStruct.FLOAT);
		LoginReqDataT.addMember("y", GenericBinaryStruct.DOUBLE);

		GenericBinaryUnion genericUnion = new GenericBinaryUnion();
		genericUnion.addInner("ctr", CnctRespDataT);
		genericUnion.addInner("login", LoginReqDataT);

		GenericBinaryStruct mainStruct = new GenericBinaryStruct();
		mainStruct.addMember("msgType", GenericBinaryStruct.INT);
		mainStruct.addInner("union", genericUnion);

		Map<String, Object> data = new HashMap<String, Object>();
		data.put("msgType", 100);

		data.put("union.login.userID", "ARUN");
		data.put("union.login.closure", 'Y');
		data.put("union.login.applVersion", 145);
		data.put("union.login.authorizationDataLength", 4531);
		data.put("union.login.x", 454.23);
		data.put("union.login.y", 3485);

		Set<String> memberKey = data.keySet();
		for (String s : memberKey) {
			mainStruct.setMember("", s, data.get(s),"RESPONSE");
		}

		/*
		 * FileOutputStream fos = new FileOutputStream(new
		 * File("d:\\temp2.bin")); mainStruct.write(fos);
		 * 
		 * fos.close();
		 */
		Map<String, Object> data1 = new HashMap<String, Object>();
		data1.put("msgType", 200);

		data1.put("union.ctr.connectionID", -56);
		data1.put("union.ctr.connectionID1", 156);
		data1.put("union.ctr.VMQname", "TESTING VMQ");
		data1.put("union.ctr.prodMode", 'R');

		Set<String> memberKey1 = data1.keySet();
		for (String s : memberKey1) {
			mainStruct.setMember("", s, data1.get(s),"RESPONSE");
		}
		/*
		 * FileOutputStream fos1 = new FileOutputStream(new
		 * File("d:\\temp3.bin")); mainStruct.write(fos1);
		 * 
		 * fos1.close();
		 */
	}

}
