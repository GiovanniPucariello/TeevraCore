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
 * $Id: FlParserTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 26, 2008 
 */

package com.headstrong.fusion.services.message.parser.fl.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptorCache;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlBinding;

/**
 * 
 */
public class FlParserTest extends TestCase {
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

	/**
	 * 
	 * @throws Exception
	 */
	public void testParseSingleDimentionData() throws Exception {

		// ***********************************************************************************//
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

		// ***********************************************************************************//

		// ***********************************************************************************//
		// create schema description for the DB parser.
		SchemaDescriptor<FlBinding> schemaDesc = new SchemaDescriptor<FlBinding>();

		List<SchemaDescriptor<FlBinding>> children = new ArrayList<SchemaDescriptor<FlBinding>>();

		SchemaDescriptor<FlBinding> idSchema = new SchemaDescriptor<FlBinding>();
		idSchema.setFieldName("id");
		FlBinding idBinding = new FlBinding();
		idBinding.setStartIndex(1);
		idBinding.setEndIndex(5);
		idSchema.setBinding(idBinding);
		children.add(idSchema);

		SchemaDescriptor<FlBinding> nameSchema = new SchemaDescriptor<FlBinding>();
		nameSchema.setFieldName("name");
		FlBinding nameBinding = new FlBinding();
		nameBinding.setStartIndex(6);
		nameBinding.setEndIndex(10);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);

		schemaDesc.setChildren(children);
		// ***********************************************************************************//

		// ***********************************************************************************//
		// create the data map
		String data = "1    dummy";

		FlBodyParser parser = new FlBodyParser();
		BusinessObject output = parser.parse(objectDesc, schemaDesc, data, 0);

		// ***********************************************************************************//

		// ***********************************************************************************//
		// check the values
		assertEquals(new Long(1), output.getValue("id"));
		assertEquals("dummy", output.getValue("name"));
	}

	public void testParseHierarchicalData() throws Exception {

		// *****************************************************************************//
		// setup object descriptor
		/**
		 * Schema desc would be Employee -- id -- LONG -- name -- STRING --
		 * address -- ADDRESS
		 * 
		 * Address -- line1 - STRING -- line2 - STRING
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
		// *****************************************************************************//

		// *****************************************************************************//
		// create schema description for the DB parser.
		SchemaDescriptor<FlBinding> schemaDesc = new SchemaDescriptor<FlBinding>();

		List<SchemaDescriptor<FlBinding>> children = new ArrayList<SchemaDescriptor<FlBinding>>();

		SchemaDescriptor<FlBinding> idSchema = new SchemaDescriptor<FlBinding>();
		idSchema.setFieldName("id");
		FlBinding idBinding = new FlBinding();
		idBinding.setStartIndex(1);
		idBinding.setEndIndex(5);
		idSchema.setBinding(idBinding);
		children.add(idSchema);

		SchemaDescriptor<FlBinding> nameSchema = new SchemaDescriptor<FlBinding>();
		nameSchema.setFieldName("name");
		FlBinding nameBinding = new FlBinding();
		nameBinding.setStartIndex(6);
		nameBinding.setEndIndex(10);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);

		SchemaDescriptor<FlBinding> addressSchema = new SchemaDescriptor<FlBinding>();
		addressSchema.setFieldName("address");

		SchemaDescriptor<FlBinding> line1Schema = new SchemaDescriptor<FlBinding>();
		line1Schema.setFieldName("line1");
		FlBinding line1Binding = new FlBinding();
		line1Binding.setStartIndex(11);
		line1Binding.setEndIndex(21);
		line1Schema.setBinding(line1Binding);
		addressSchema.getChildren().add(line1Schema);

		SchemaDescriptor<FlBinding> line2Schema = new SchemaDescriptor<FlBinding>();
		line2Schema.setFieldName("line2");
		FlBinding line2Binding = new FlBinding();
		line2Binding.setStartIndex(22);
		line2Binding.setEndIndex(32);
		line2Schema.setBinding(line2Binding);
		addressSchema.getChildren().add(line2Schema);
		children.add(addressSchema);

		schemaDesc.setChildren(children);
		// *****************************************************************************//

		// *****************************************************************************//

		// create the data map
		String data = "1    dummy11111111111222222222  ";

		FlBodyParser parser = new FlBodyParser();
		BusinessObject output = parser.parse(employeeObjectDesc, schemaDesc,
				data, 0);

		// *****************************************************************************//
		// check the values
		assertEquals(new Long(1), output.getValue("id"));
		assertEquals("dummy", output.getValue("name"));
		assertEquals("11111111111", output.getValue("address.line1"));
		assertEquals("222222222", output.getValue("address.line2"));
	}
}
