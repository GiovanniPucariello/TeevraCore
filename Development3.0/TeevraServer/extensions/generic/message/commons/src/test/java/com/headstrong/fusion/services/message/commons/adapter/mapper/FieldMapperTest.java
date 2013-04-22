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
 * $Id: FieldMapperTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Apr 29, 2010 
 */

package com.headstrong.fusion.services.message.commons.adapter.mapper;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.dyn.DynamicBusinessObject;
import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.java.JavaBusinessObject;
import com.headstrong.fusion.services.message.commons.adapter.mapper.config.FieldMapping;

/**
 * 
 */
public class FieldMapperTest {

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void mapConstantTypeDynBO() throws Exception {

		Map<String, Object> headers = new HashMap<String, Object>();

		FieldMapping statement = new FieldMapping();

		statement.setType("constant");
		statement.setSource("sourceAttr");
		statement.setTarget("targetAttr");

		BusinessObject source = new DynamicBusinessObject();
		BusinessObject target = new DynamicBusinessObject();

		FieldMapper mapper = new FieldMapper();

		mapper.map(headers, statement, source, target);

		Assert.assertEquals("sourceAttr", target.getValue("targetAttr"));

	}

	@Test
	public void mapConstantTypeDefBO() throws Exception {

		Map<String, Object> headers = new HashMap<String, Object>();

		FieldMapping statement = new FieldMapping();

		statement.setType("constant");
		statement.setSource("sourceAttr");
		statement.setTarget("targetAttr");

		BusinessObject source = new DefaultBusinessObject();
		source.setObjectDescriptor(sampleObjectDescriptor1());
		source.setValue("sourceAttr", "sourceVal");

		BusinessObject target = new DefaultBusinessObject();
		target.setObjectDescriptor(sampleObjectDescriptor2());

		FieldMapper mapper = new FieldMapper();

		mapper.map(headers, statement, source, target);

		Assert.assertEquals("sourceAttr", target.getValue("targetAttr"));

	}

	@Test
	public void mapConstantTypeJavaBO() throws Exception {

		Map<String, Object> headers = new HashMap<String, Object>();

		FieldMapping statement = new FieldMapping();

		statement.setType("constant");
		statement.setSource("sourceAttr");
		statement.setTarget("targetAttr");

		JavaBusinessObject source = new JavaBusinessObject(SampleJavaBO.class);
		source.setValue("sourceAttr", "sourceVal");

		JavaBusinessObject target = new JavaBusinessObject(SampleJavaBO.class);

		FieldMapper mapper = new FieldMapper();

		mapper.map(headers, statement, source, target);

		Assert.assertEquals("sourceAttr", target.getValue("targetAttr"));

	}

	@Test
	public void mapSimpleTypeDynBO() throws Exception {

		Map<String, Object> headers = new HashMap<String, Object>();

		FieldMapping statement = new FieldMapping();

		statement.setType("simple");
		statement.setSource("sourceAttr");
		statement.setTarget("targetAttr");

		BusinessObject source = new DynamicBusinessObject();
		source.setValue("sourceAttr", "teevra");

		BusinessObject target = new DynamicBusinessObject();

		FieldMapper mapper = new FieldMapper();

		mapper.map(headers, statement, source, target);

		Assert.assertEquals("teevra", target.getValue("targetAttr"));

	}

	@Test
	public void mapSimpleTypeDefBO() throws Exception {

		Map<String, Object> headers = new HashMap<String, Object>();

		FieldMapping statement = new FieldMapping();

		statement.setType("simple");
		statement.setSource("sourceAttr");
		statement.setTarget("targetAttr");

		BusinessObject source = new DefaultBusinessObject();
		source.setObjectDescriptor(sampleObjectDescriptor1());
		source.setValue("sourceAttr", "sourceVal");

		BusinessObject target = new DefaultBusinessObject();
		target.setObjectDescriptor(sampleObjectDescriptor2());

		FieldMapper mapper = new FieldMapper();

		mapper.map(headers, statement, source, target);

		Assert.assertEquals("sourceVal", target.getValue("targetAttr"));

	}

	@Test
	public void mapSimpleTypeJavaBO() throws Exception {

		Map<String, Object> headers = new HashMap<String, Object>();

		FieldMapping statement = new FieldMapping();

		statement.setType("simple");
		statement.setSource("sourceAttr");
		statement.setTarget("targetAttr");

		JavaBusinessObject source = new JavaBusinessObject(SampleJavaBO.class);
		source.setValue("sourceAttr", "sourceVal");

		JavaBusinessObject target = new JavaBusinessObject(SampleJavaBO.class);

		FieldMapper mapper = new FieldMapper();

		mapper.map(headers, statement, source, target);

		Assert.assertEquals("sourceVal", target.getValue("targetAttr"));

	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	private ObjectDescriptor sampleObjectDescriptor1() {
		ObjectDescriptor schema = new ObjectDescriptor();

		AttributeDescriptor attribute = new AttributeDescriptor();
		attribute.setAttributeId(new Long(1));
		attribute.setAttributeName("sourceAttr");

		Map<String, AttributeDescriptor> attribites = new HashMap<String, AttributeDescriptor>();
		attribites.put("sourceAttr", attribute);

		schema.setId(new Long(1));
		schema.setName("samplesrcschema");
		schema.setDesc("Sample Schema");
		schema.setAttributes(attribites);

		return schema;
	}

	private ObjectDescriptor sampleObjectDescriptor2() {
		ObjectDescriptor schema = new ObjectDescriptor();

		AttributeDescriptor attribute = new AttributeDescriptor();
		attribute.setAttributeId(new Long(1));
		attribute.setAttributeName("targetAttr");

		Map<String, AttributeDescriptor> attribites = new HashMap<String, AttributeDescriptor>();
		attribites.put("targetAttr", attribute);

		schema.setId(new Long(1));
		schema.setName("sampletargetschema");
		schema.setDesc("Sample Schema");
		schema.setAttributes(attribites);

		return schema;
	}

	public static class SampleJavaBO {
		private String sourceAttr;
		private String targetAttr;

		public SampleJavaBO() {

		}

		/**
		 * @return the sourceAttr
		 */
		public String getSourceAttr() {
			return sourceAttr;
		}

		/**
		 * @param sourceAttr
		 *            the sourceAttr to set
		 */
		public void setSourceAttr(String sourceAttr) {
			this.sourceAttr = sourceAttr;
		}

		/**
		 * @return the targetAttr
		 */
		public String getTargetAttr() {
			return targetAttr;
		}

		/**
		 * @param targetAttr
		 *            the targetAttr to set
		 */
		public void setTargetAttr(String targetAttr) {
			this.targetAttr = targetAttr;
		}
	}
}
