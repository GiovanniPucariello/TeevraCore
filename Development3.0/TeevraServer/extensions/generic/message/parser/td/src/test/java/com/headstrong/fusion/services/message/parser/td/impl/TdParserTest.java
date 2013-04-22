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
 * $Id: TdParserTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 21, 2008 
 */

package com.headstrong.fusion.services.message.parser.td.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptorCache;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.td.ColumnIndexBinding;

/**
 * Tag-Delimited parser test class.
 */
public class TdParserTest extends TestCase {
	ObjectDescriptorCache cache = ObjectDescriptorCache.getInstance();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		// setup primitive schema descriptors.
		ObjectDescriptor stringDesc = new ObjectDescriptor();
		stringDesc.setId(new Long(1));
		stringDesc.setName("STRING");
		stringDesc.setDesc("STRING");
		stringDesc.setPrimitive(true);
		cache.addDescriptor("STRING", stringDesc);

		ObjectDescriptor longDesc = new ObjectDescriptor();
		longDesc.setId(new Long(2));
		longDesc.setName("LONG");
		longDesc.setDesc("LONG");
		longDesc.setPrimitive(true);
		cache.addDescriptor("LONG", longDesc);
	}

	public void testParseSingleDimentionData() throws Exception {
		// setup object descriptor
		/**
		 * Schema desc would be Employee -- ID -- LONG -- NAME -- STRING
		 */
		Map<String, AttributeDescriptor> attributes = new HashMap<String, AttributeDescriptor>();
		AttributeDescriptor attributeDescId = new AttributeDescriptor();
		attributeDescId.setAttributeId(new Long(1));
		attributeDescId.setAttributeName("id");
		attributeDescId.setAttrRelation("121");
		attributeDescId.setType(cache.getDescriptor("LONG"));
		attributes.put("id", attributeDescId);

		AttributeDescriptor attributeDescName = new AttributeDescriptor();
		attributeDescName.setAttributeId(new Long(1));
		attributeDescName.setAttributeName("name");
		attributeDescName.setAttrRelation("121");
		attributeDescName.setType(cache.getDescriptor("STRING"));
		attributes.put("name", attributeDescName);

		ObjectDescriptor objectDesc = new ObjectDescriptor();
		objectDesc.setId(new Long(3));
		objectDesc.setName("employee");
		objectDesc.setPrimitive(false);
		objectDesc.setAttributes(attributes);

		// create schema description for the DB parser.
		SchemaDescriptor<ColumnIndexBinding> schemaDesc = new SchemaDescriptor<ColumnIndexBinding>();

		List<SchemaDescriptor<ColumnIndexBinding>> children = new ArrayList<SchemaDescriptor<ColumnIndexBinding>>();

		SchemaDescriptor<ColumnIndexBinding> idSchema = new SchemaDescriptor<ColumnIndexBinding>();
		idSchema.setFieldName("id");
		ColumnIndexBinding idBinding = new ColumnIndexBinding();
		idBinding.setColumnIndex(1);
		idSchema.setBinding(idBinding);
		children.add(idSchema);

		SchemaDescriptor<ColumnIndexBinding> nameSchema = new SchemaDescriptor<ColumnIndexBinding>();
		nameSchema.setFieldName("name");
		ColumnIndexBinding nameBinding = new ColumnIndexBinding();
		nameBinding.setColumnIndex(2);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);

		schemaDesc.setChildren(children);

		// create the data map
		String data = "11,dummy";

		TdBodyParser dbParser = new TdBodyParser();
		DefaultBusinessObject output = dbParser.parse(",", objectDesc,
				schemaDesc, data);

		// check the values
		assertEquals(new Long(11), output.getValue("id"));
		assertEquals("dummy", output.getValue("name"));

	}

	public void testParseSingleDimentionDataComplexDelimiter() throws Exception {
		// setup object descriptor
		/**
		 * Schema desc would be Employee -- ID -- LONG -- NAME -- STRING
		 */
		Map<String, AttributeDescriptor> attributes = new HashMap<String, AttributeDescriptor>();
		AttributeDescriptor attributeDescId = new AttributeDescriptor();
		attributeDescId.setAttributeId(new Long(1));
		attributeDescId.setAttributeName("id");
		attributeDescId.setAttrRelation("121");
		attributeDescId.setType(cache.getDescriptor("LONG"));
		attributes.put("id", attributeDescId);

		AttributeDescriptor attributeDescName = new AttributeDescriptor();
		attributeDescName.setAttributeId(new Long(1));
		attributeDescName.setAttributeName("name");
		attributeDescName.setAttrRelation("121");
		attributeDescName.setType(cache.getDescriptor("STRING"));
		attributes.put("name", attributeDescName);

		ObjectDescriptor objectDesc = new ObjectDescriptor();
		objectDesc.setId(new Long(3));
		objectDesc.setName("employee");
		objectDesc.setPrimitive(false);
		objectDesc.setAttributes(attributes);

		// create schema description for the DB parser.
		SchemaDescriptor<ColumnIndexBinding> schemaDesc = new SchemaDescriptor<ColumnIndexBinding>();

		List<SchemaDescriptor<ColumnIndexBinding>> children = new ArrayList<SchemaDescriptor<ColumnIndexBinding>>();

		SchemaDescriptor<ColumnIndexBinding> idSchema = new SchemaDescriptor<ColumnIndexBinding>();
		idSchema.setFieldName("id");
		ColumnIndexBinding idBinding = new ColumnIndexBinding();
		idBinding.setColumnIndex(1);
		idSchema.setBinding(idBinding);
		children.add(idSchema);

		SchemaDescriptor<ColumnIndexBinding> nameSchema = new SchemaDescriptor<ColumnIndexBinding>();
		nameSchema.setFieldName("name");
		ColumnIndexBinding nameBinding = new ColumnIndexBinding();
		nameBinding.setColumnIndex(2);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);

		schemaDesc.setChildren(children);

		// create the data map
		String data = "1^&^dummy";

		TdBodyParser dbParser = new TdBodyParser();
		DefaultBusinessObject output = dbParser.parse("^&^", objectDesc,
				schemaDesc, data);

		// check the values
		assertEquals(new Long(1), output.getValue("id"));
		assertEquals("dummy", output.getValue("name"));
	}

	public void testParseHierarchicalData() throws Exception {
		// setup object descriptor
		/**
		 * Schema desc would be 
		 * Employee
		 *   -- id -- LONG
		 *   -- name -- STRING
		 *   -- address -- ADDRESS
		 *   
		 * Address
		 *   -- line1 - STRING
		 *   -- line2 - STRING
		 */
		
		// Address Object Descriptor setup
		Map<String, AttributeDescriptor> addressAttributes = new HashMap<String, AttributeDescriptor>();
		
		AttributeDescriptor attrLine1 = new AttributeDescriptor();
		attrLine1.setAttributeId(new Long(1));
		attrLine1.setAttributeName("line1");
		attrLine1.setAttrRelation("121");
		attrLine1.setType(cache.getDescriptor("STRING"));
		
		addressAttributes.put("line1", attrLine1);
		
		AttributeDescriptor line2Attr = new AttributeDescriptor();
		line2Attr.setAttributeId(new Long(2));
		line2Attr.setAttributeName("line2");
		line2Attr.setAttrRelation("121");
		line2Attr.setType(cache.getDescriptor("STRING"));
		
		addressAttributes.put("line2", line2Attr);

		ObjectDescriptor addressObjectDesc = new ObjectDescriptor();
		addressObjectDesc.setId(new Long(5));
		addressObjectDesc.setName("address");
		addressObjectDesc.setPrimitive(false);
		
		addressObjectDesc.setAttributes(addressAttributes);
		
		cache.addDescriptor("address", addressObjectDesc);
		
		// Employee Object Descriptor Setup
		Map<String, AttributeDescriptor> employeeAttributes = new HashMap<String, AttributeDescriptor>();
		AttributeDescriptor attributeDescId = new AttributeDescriptor();
		attributeDescId.setAttributeId(new Long(3));
		attributeDescId.setAttributeName("id");
		attributeDescId.setAttrRelation("121");
		attributeDescId.setType(cache.getDescriptor("LONG"));
		
		employeeAttributes.put("id", attributeDescId);
		
		AttributeDescriptor attributeDescName = new AttributeDescriptor();
		attributeDescName.setAttributeId(new Long(4));
		attributeDescName.setAttributeName("name");
		attributeDescName.setAttrRelation("121");
		attributeDescName.setType(cache.getDescriptor("STRING"));
		
		employeeAttributes.put("name", attributeDescName);
		
		AttributeDescriptor attributeAddressDesc = new AttributeDescriptor();
		attributeAddressDesc.setAttributeId(new Long(4));
		attributeAddressDesc.setAttributeName("address");
		attributeAddressDesc.setAttrRelation("121");
		attributeAddressDesc.setType(cache.getDescriptor("address"));
		
		employeeAttributes.put("address", attributeAddressDesc);

		ObjectDescriptor employeeObjectDesc = new ObjectDescriptor();
		employeeObjectDesc.setId(new Long(3));
		employeeObjectDesc.setName("employee");
		employeeObjectDesc.setPrimitive(false);
		employeeObjectDesc.setAttributes(employeeAttributes);
		
		// create schema description for the DB parser.
		SchemaDescriptor<ColumnIndexBinding> schemaDesc = new SchemaDescriptor<ColumnIndexBinding>();
		
		List<SchemaDescriptor<ColumnIndexBinding>> children = new ArrayList<SchemaDescriptor<ColumnIndexBinding>>();
		
		SchemaDescriptor<ColumnIndexBinding> idSchema = new SchemaDescriptor<ColumnIndexBinding>();
		idSchema.setFieldName("id");
		ColumnIndexBinding idBinding = new ColumnIndexBinding();
		idBinding.setColumnIndex(1);
		idSchema.setBinding(idBinding);
		children.add(idSchema);
		
		SchemaDescriptor<ColumnIndexBinding> nameSchema = new SchemaDescriptor<ColumnIndexBinding>();
		nameSchema.setFieldName("name");
		ColumnIndexBinding nameBinding = new ColumnIndexBinding();
		nameBinding.setColumnIndex(2);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);
		
		SchemaDescriptor<ColumnIndexBinding> addressSchema = new SchemaDescriptor<ColumnIndexBinding>();
		addressSchema.setFieldName("address");
		
		SchemaDescriptor<ColumnIndexBinding> line1Schema = new SchemaDescriptor<ColumnIndexBinding>();
		line1Schema.setFieldName("line1");
		ColumnIndexBinding line1Binding = new ColumnIndexBinding();
		line1Binding.setColumnIndex(3);
		line1Schema.setBinding(line1Binding);
		addressSchema.getChildren().add(line1Schema);

		SchemaDescriptor<ColumnIndexBinding> line2Schema = new SchemaDescriptor<ColumnIndexBinding>();
		line2Schema.setFieldName("line2");
		ColumnIndexBinding line2Binding = new ColumnIndexBinding();
		line2Binding.setColumnIndex(4);
		line2Schema.setBinding(line2Binding);
		addressSchema.getChildren().add(line2Schema);
		children.add(addressSchema);
		
		schemaDesc.setChildren(children);
		
		// create the data map
		String data = "1^&^dummy^&^J P \"Techno\" Park^&^Bangalore - 56000";

		TdBodyParser dbParser = new TdBodyParser();
		DefaultBusinessObject output = dbParser.parse("^&^", employeeObjectDesc,
				schemaDesc, data);
	
		
		// check the values
		assertEquals(new Long(1), output.getValue("id"));
		assertEquals("dummy", output.getValue("name"));
		assertEquals("J P \"Techno\" Park", output.getValue("address.line1"));
		assertEquals("Bangalore - 56000", output.getValue("address.line2"));
		
	}

	public void testParseWithEmptyData() throws Exception {
		// setup object descriptor
		/**
		 * Schema desc would be Employee -- ID -- LONG -- NAME -- STRING
		 */
		Map<String, AttributeDescriptor> attributes = new HashMap<String, AttributeDescriptor>();
		AttributeDescriptor attributeDescId = new AttributeDescriptor();
		attributeDescId.setAttributeId(new Long(1));
		attributeDescId.setAttributeName("id");
		attributeDescId.setAttrRelation("121");
		attributeDescId.setType(cache.getDescriptor("LONG"));
		attributes.put("id", attributeDescId);

		AttributeDescriptor attributeDescName = new AttributeDescriptor();
		attributeDescName.setAttributeId(new Long(1));
		attributeDescName.setAttributeName("name");
		attributeDescName.setAttrRelation("121");
		attributeDescName.setType(cache.getDescriptor("STRING"));
		attributes.put("name", attributeDescName);

		ObjectDescriptor objectDesc = new ObjectDescriptor();
		objectDesc.setId(new Long(3));
		objectDesc.setName("employee");
		objectDesc.setPrimitive(false);
		objectDesc.setAttributes(attributes);

		// create schema description for the DB parser.
		SchemaDescriptor<ColumnIndexBinding> schemaDesc = new SchemaDescriptor<ColumnIndexBinding>();

		List<SchemaDescriptor<ColumnIndexBinding>> children = new ArrayList<SchemaDescriptor<ColumnIndexBinding>>();

		SchemaDescriptor<ColumnIndexBinding> idSchema = new SchemaDescriptor<ColumnIndexBinding>();
		idSchema.setFieldName("id");
		ColumnIndexBinding idBinding = new ColumnIndexBinding();
		idBinding.setColumnIndex(1);
		idSchema.setBinding(idBinding);
		children.add(idSchema);

		SchemaDescriptor<ColumnIndexBinding> nameSchema = new SchemaDescriptor<ColumnIndexBinding>();
		nameSchema.setFieldName("name");
		ColumnIndexBinding nameBinding = new ColumnIndexBinding();
		nameBinding.setColumnIndex(2);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);

		schemaDesc.setChildren(children);

		// create the data map
		String data = ",";

		TdBodyParser dbParser = new TdBodyParser();
		DefaultBusinessObject output = dbParser.parse(",", objectDesc,
				schemaDesc, data);
		// check the values
		assertEquals(new Long(0), output.getValue("id"));
		assertEquals("", output.getValue("name"));
	}

	public void testParseWithAllDataInQuotes() throws Exception {
		// setup object descriptor
		/**
		 * Schema desc would be Employee -- ID -- LONG -- NAME -- STRING
		 */
		Map<String, AttributeDescriptor> attributes = new HashMap<String, AttributeDescriptor>();
		AttributeDescriptor attributeDescId = new AttributeDescriptor();
		attributeDescId.setAttributeId(new Long(1));
		attributeDescId.setAttributeName("id");
		attributeDescId.setAttrRelation("121");
		attributeDescId.setType(cache.getDescriptor("LONG"));
		attributes.put("id", attributeDescId);

		AttributeDescriptor attributeDescName = new AttributeDescriptor();
		attributeDescName.setAttributeId(new Long(1));
		attributeDescName.setAttributeName("name");
		attributeDescName.setAttrRelation("121");
		attributeDescName.setType(cache.getDescriptor("STRING"));
		attributes.put("name", attributeDescName);

		ObjectDescriptor objectDesc = new ObjectDescriptor();
		objectDesc.setId(new Long(3));
		objectDesc.setName("employee");
		objectDesc.setPrimitive(false);
		objectDesc.setAttributes(attributes);

		// create schema description for the DB parser.
		SchemaDescriptor<ColumnIndexBinding> schemaDesc = new SchemaDescriptor<ColumnIndexBinding>();

		List<SchemaDescriptor<ColumnIndexBinding>> children = new ArrayList<SchemaDescriptor<ColumnIndexBinding>>();

		SchemaDescriptor<ColumnIndexBinding> idSchema = new SchemaDescriptor<ColumnIndexBinding>();
		idSchema.setFieldName("id");
		ColumnIndexBinding idBinding = new ColumnIndexBinding();
		idBinding.setColumnIndex(1);
		idSchema.setBinding(idBinding);
		children.add(idSchema);

		SchemaDescriptor<ColumnIndexBinding> nameSchema = new SchemaDescriptor<ColumnIndexBinding>();
		nameSchema.setFieldName("name");
		ColumnIndexBinding nameBinding = new ColumnIndexBinding();
		nameBinding.setColumnIndex(2);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);

		schemaDesc.setChildren(children);

		// create the data map
		String data = "\"11\",\"ice fish\"";

		TdBodyParser dbParser = new TdBodyParser();
		DefaultBusinessObject output = dbParser.parse(",", objectDesc,
				schemaDesc, data);

		// check the values
		assertEquals(new Long(11), output.getValue("id"));
		assertEquals("ice fish", output.getValue("name"));
	}
	
	public void testParseWithQuotes() throws Exception {
		// setup object descriptor
		/**
		 * Schema desc would be Employee -- ID -- LONG -- NAME -- STRING
		 */
		Map<String, AttributeDescriptor> attributes = new HashMap<String, AttributeDescriptor>();
		AttributeDescriptor attributeDescId = new AttributeDescriptor();
		attributeDescId.setAttributeId(new Long(1));
		attributeDescId.setAttributeName("id");
		attributeDescId.setAttrRelation("121");
		attributeDescId.setType(cache.getDescriptor("LONG"));
		attributes.put("id", attributeDescId);

		AttributeDescriptor attributeDescName = new AttributeDescriptor();
		attributeDescName.setAttributeId(new Long(1));
		attributeDescName.setAttributeName("name");
		attributeDescName.setAttrRelation("121");
		attributeDescName.setType(cache.getDescriptor("STRING"));
		attributes.put("name", attributeDescName);

		ObjectDescriptor objectDesc = new ObjectDescriptor();
		objectDesc.setId(new Long(3));
		objectDesc.setName("employee");
		objectDesc.setPrimitive(false);
		objectDesc.setAttributes(attributes);

		// create schema description for the DB parser.
		SchemaDescriptor<ColumnIndexBinding> schemaDesc = new SchemaDescriptor<ColumnIndexBinding>();

		List<SchemaDescriptor<ColumnIndexBinding>> children = new ArrayList<SchemaDescriptor<ColumnIndexBinding>>();

		SchemaDescriptor<ColumnIndexBinding> idSchema = new SchemaDescriptor<ColumnIndexBinding>();
		idSchema.setFieldName("id");
		ColumnIndexBinding idBinding = new ColumnIndexBinding();
		idBinding.setColumnIndex(1);
		idSchema.setBinding(idBinding);
		children.add(idSchema);

		SchemaDescriptor<ColumnIndexBinding> nameSchema = new SchemaDescriptor<ColumnIndexBinding>();
		nameSchema.setFieldName("name");
		ColumnIndexBinding nameBinding = new ColumnIndexBinding();
		nameBinding.setColumnIndex(2);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);

		schemaDesc.setChildren(children);

		// create the data map
		String data = "\"11\",\"ice,fish\"";

		TdBodyParser dbParser = new TdBodyParser();
		DefaultBusinessObject output = dbParser.parse(",", objectDesc,
				schemaDesc, data);

		// check the values
		assertEquals(new Long(11), output.getValue("id"));
		assertEquals("ice,fish", output.getValue("name"));
	}
	
	public void testParseWithQuotesAsData() throws Exception {
		// setup object descriptor
		/**
		 * Schema desc would be Employee -- ID -- LONG -- NAME -- STRING
		 */
		Map<String, AttributeDescriptor> attributes = new HashMap<String, AttributeDescriptor>();
		AttributeDescriptor attributeDescId = new AttributeDescriptor();
		attributeDescId.setAttributeId(new Long(1));
		attributeDescId.setAttributeName("id");
		attributeDescId.setAttrRelation("121");
		attributeDescId.setType(cache.getDescriptor("LONG"));
		attributes.put("id", attributeDescId);

		AttributeDescriptor attributeDescName = new AttributeDescriptor();
		attributeDescName.setAttributeId(new Long(1));
		attributeDescName.setAttributeName("name");
		attributeDescName.setAttrRelation("121");
		attributeDescName.setType(cache.getDescriptor("STRING"));
		attributes.put("name", attributeDescName);

		ObjectDescriptor objectDesc = new ObjectDescriptor();
		objectDesc.setId(new Long(3));
		objectDesc.setName("employee");
		objectDesc.setPrimitive(false);
		objectDesc.setAttributes(attributes);

		// create schema description for the DB parser.
		SchemaDescriptor<ColumnIndexBinding> schemaDesc = new SchemaDescriptor<ColumnIndexBinding>();

		List<SchemaDescriptor<ColumnIndexBinding>> children = new ArrayList<SchemaDescriptor<ColumnIndexBinding>>();

		SchemaDescriptor<ColumnIndexBinding> idSchema = new SchemaDescriptor<ColumnIndexBinding>();
		idSchema.setFieldName("id");
		ColumnIndexBinding idBinding = new ColumnIndexBinding();
		idBinding.setColumnIndex(1);
		idSchema.setBinding(idBinding);
		children.add(idSchema);

		SchemaDescriptor<ColumnIndexBinding> nameSchema = new SchemaDescriptor<ColumnIndexBinding>();
		nameSchema.setFieldName("name");
		ColumnIndexBinding nameBinding = new ColumnIndexBinding();
		nameBinding.setColumnIndex(2);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);

		schemaDesc.setChildren(children);

		// create the data map
		String data = "\"11\",\"ice\"fish\"\"";

		TdBodyParser dbParser = new TdBodyParser();
		DefaultBusinessObject output = dbParser.parse(",", objectDesc,
				schemaDesc, data);
		// check the values
		assertEquals(new Long(11), output.getValue("id"));
		assertEquals("ice\"fish\"", output.getValue("name"));
	}


	public void testParseWithQuotesAndSpaceDelimiter() throws Exception {
		// setup object descriptor
		/**
		 * Schema desc would be Employee -- ID -- LONG -- NAME -- STRING
		 */
		Map<String, AttributeDescriptor> attributes = new HashMap<String, AttributeDescriptor>();
		AttributeDescriptor attributeDescId = new AttributeDescriptor();
		attributeDescId.setAttributeId(new Long(1));
		attributeDescId.setAttributeName("id");
		attributeDescId.setAttrRelation("121");
		attributeDescId.setType(cache.getDescriptor("LONG"));
		attributes.put("id", attributeDescId);

		AttributeDescriptor attributeDescName = new AttributeDescriptor();
		attributeDescName.setAttributeId(new Long(1));
		attributeDescName.setAttributeName("name");
		attributeDescName.setAttrRelation("121");
		attributeDescName.setType(cache.getDescriptor("STRING"));
		attributes.put("name", attributeDescName);

		ObjectDescriptor objectDesc = new ObjectDescriptor();
		objectDesc.setId(new Long(3));
		objectDesc.setName("employee");
		objectDesc.setPrimitive(false);
		objectDesc.setAttributes(attributes);

		// create schema description for the DB parser.
		SchemaDescriptor<ColumnIndexBinding> schemaDesc = new SchemaDescriptor<ColumnIndexBinding>();

		List<SchemaDescriptor<ColumnIndexBinding>> children = new ArrayList<SchemaDescriptor<ColumnIndexBinding>>();

		SchemaDescriptor<ColumnIndexBinding> idSchema = new SchemaDescriptor<ColumnIndexBinding>();
		idSchema.setFieldName("id");
		ColumnIndexBinding idBinding = new ColumnIndexBinding();
		idBinding.setColumnIndex(1);
		idSchema.setBinding(idBinding);
		children.add(idSchema);

		SchemaDescriptor<ColumnIndexBinding> nameSchema = new SchemaDescriptor<ColumnIndexBinding>();
		nameSchema.setFieldName("name");
		ColumnIndexBinding nameBinding = new ColumnIndexBinding();
		nameBinding.setColumnIndex(2);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);

		schemaDesc.setChildren(children);

		// create the data map
		String data = "\"11\" \"ice fish\"";

		TdBodyParser dbParser = new TdBodyParser();
		DefaultBusinessObject output = dbParser.parse(" ", objectDesc,
				schemaDesc, data);
		// check the values
		assertEquals(new Long(11), output.getValue("id"));
		assertEquals("ice fish", output.getValue("name"));
	}
	
	public void testParseWithQuotesAndComplexDelimiter() throws Exception {
		// setup object descriptor
		/**
		 * Schema desc would be Employee -- ID -- LONG -- NAME -- STRING
		 */
		Map<String, AttributeDescriptor> attributes = new HashMap<String, AttributeDescriptor>();
		AttributeDescriptor attributeDescId = new AttributeDescriptor();
		attributeDescId.setAttributeId(new Long(1));
		attributeDescId.setAttributeName("id");
		attributeDescId.setAttrRelation("121");
		attributeDescId.setType(cache.getDescriptor("LONG"));
		attributes.put("id", attributeDescId);

		AttributeDescriptor attributeDescName = new AttributeDescriptor();
		attributeDescName.setAttributeId(new Long(1));
		attributeDescName.setAttributeName("name");
		attributeDescName.setAttrRelation("121");
		attributeDescName.setType(cache.getDescriptor("STRING"));
		attributes.put("name", attributeDescName);

		ObjectDescriptor objectDesc = new ObjectDescriptor();
		objectDesc.setId(new Long(3));
		objectDesc.setName("employee");
		objectDesc.setPrimitive(false);
		objectDesc.setAttributes(attributes);

		// create schema description for the DB parser.
		SchemaDescriptor<ColumnIndexBinding> schemaDesc = new SchemaDescriptor<ColumnIndexBinding>();

		List<SchemaDescriptor<ColumnIndexBinding>> children = new ArrayList<SchemaDescriptor<ColumnIndexBinding>>();

		SchemaDescriptor<ColumnIndexBinding> idSchema = new SchemaDescriptor<ColumnIndexBinding>();
		idSchema.setFieldName("id");
		ColumnIndexBinding idBinding = new ColumnIndexBinding();
		idBinding.setColumnIndex(1);
		idSchema.setBinding(idBinding);
		children.add(idSchema);

		SchemaDescriptor<ColumnIndexBinding> nameSchema = new SchemaDescriptor<ColumnIndexBinding>();
		nameSchema.setFieldName("name");
		ColumnIndexBinding nameBinding = new ColumnIndexBinding();
		nameBinding.setColumnIndex(2);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);

		schemaDesc.setChildren(children);

		// create the data map
		String data = "\"11\"|||\"ice|||fish\"";

		TdBodyParser dbParser = new TdBodyParser();
		DefaultBusinessObject output = dbParser.parse("|||", objectDesc,
				schemaDesc, data);
		// check the values
		assertEquals(new Long(11), output.getValue("id"));
		assertEquals("ice|||fish", output.getValue("name"));
	}

/*	public void testParseMultiDelimOccurQuotes() throws Exception {
		// setup object descriptor
		*//**
		 * Schema desc would be Employee -- ID -- LONG -- NAME -- STRING
		 *//*
		Map<String, AttributeDescriptor> attributes = new HashMap<String, AttributeDescriptor>();
		AttributeDescriptor attributeDescId = new AttributeDescriptor();
		attributeDescId.setAttributeId(new Long(1));
		attributeDescId.setAttributeName("id");
		attributeDescId.setAttrRelation("121");
		attributeDescId.setType(cache.getDescriptor("LONG"));
		attributes.put("id", attributeDescId);

		AttributeDescriptor attributeDescName = new AttributeDescriptor();
		attributeDescName.setAttributeId(new Long(1));
		attributeDescName.setAttributeName("name");
		attributeDescName.setAttrRelation("121");
		attributeDescName.setType(cache.getDescriptor("STRING"));
		attributes.put("name", attributeDescName);

		ObjectDescriptor objectDesc = new ObjectDescriptor();
		objectDesc.setId(new Long(3));
		objectDesc.setName("employee");
		objectDesc.setPrimitive(false);
		objectDesc.setAttributes(attributes);

		// create schema description for the DB parser.
		SchemaDescriptor<ColumnIndexBinding> schemaDesc = new SchemaDescriptor<ColumnIndexBinding>();

		List<SchemaDescriptor<ColumnIndexBinding>> children = new ArrayList<SchemaDescriptor<ColumnIndexBinding>>();

		SchemaDescriptor<ColumnIndexBinding> idSchema = new SchemaDescriptor<ColumnIndexBinding>();
		idSchema.setFieldName("id");
		ColumnIndexBinding idBinding = new ColumnIndexBinding();
		idBinding.setColumnIndex(1);
		idSchema.setBinding(idBinding);
		children.add(idSchema);

		SchemaDescriptor<ColumnIndexBinding> nameSchema = new SchemaDescriptor<ColumnIndexBinding>();
		nameSchema.setFieldName("name");
		ColumnIndexBinding nameBinding = new ColumnIndexBinding();
		nameBinding.setColumnIndex(2);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);

		schemaDesc.setChildren(children);

		// create the data map
		String data = "11,\"ic,e,fi\",sh\"\r\n22,\"str,ide,hu,b\"";

		TdBodyParser dbParser = new TdBodyParser();
		List<DefaultBusinessObject> output = dbParser.parse(",", objectDesc,
				schemaDesc, data);
		assertEquals(2, output.size());

		// check the values
		assertEquals(new Long(11), output.get(0).getValue("id"));
		assertEquals("ic,e,fi,sh", output.get(0).getValue("name"));

		assertEquals(new Long(22), output.get(1).getValue("id"));
		assertEquals("str,ide,hu,b", output.get(1).getValue("name"));
	}*/
}

