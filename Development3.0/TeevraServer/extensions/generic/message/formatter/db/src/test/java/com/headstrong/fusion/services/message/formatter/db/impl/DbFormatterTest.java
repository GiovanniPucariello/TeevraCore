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
 * $Id: DbFormatterTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 21, 2008 
 */

package com.headstrong.fusion.services.message.formatter.db.impl;

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
import com.headstrong.fusion.services.message.commons.config.parser.db.DbFieldIndexBinding;

/**
 * 
 */
public class DbFormatterTest extends TestCase {

	ObjectDescriptorCache cache = ObjectDescriptorCache.getInstance();
	
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
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
	 * @precondition
	 * @postcondition 	
	 */
	public void testFormatWithSingleDimentionalData() throws Exception {
		// setup object descriptor
		/**
		 * Schema desc would be 
		 * Employee
		 *   -- ID -- LONG
		 *   -- NAME -- STRING
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
		
		ObjectDescriptor employeeObjDesc = new ObjectDescriptor();
		employeeObjDesc.setId(new Long(3));
		employeeObjDesc.setName("employee");
		employeeObjDesc.setPrimitive(false);
		employeeObjDesc.setAttributes(attributes);
		
		// create schema description for the DB parser.
		SchemaDescriptor<DbFieldIndexBinding> schemaDesc = new SchemaDescriptor<DbFieldIndexBinding>();
		
		List<SchemaDescriptor<DbFieldIndexBinding>> children = new ArrayList<SchemaDescriptor<DbFieldIndexBinding>>();
		
		SchemaDescriptor<DbFieldIndexBinding> idSchema = new SchemaDescriptor<DbFieldIndexBinding>();
		idSchema.setFieldName("id");
		DbFieldIndexBinding idBinding = new DbFieldIndexBinding();
		idBinding.setDbFieldIndex(2);
		idSchema.setBinding(idBinding);
		children.add(idSchema);
		
		SchemaDescriptor<DbFieldIndexBinding> nameSchema = new SchemaDescriptor<DbFieldIndexBinding>();
		nameSchema.setFieldName("name");
		DbFieldIndexBinding nameBinding = new DbFieldIndexBinding();
		nameBinding.setDbFieldIndex(1);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);
		
		schemaDesc.setChildren(children);
		
		// create actual data.
		DefaultBusinessObject bo = new DefaultBusinessObject();
		bo.setObjectDescriptor(employeeObjDesc);
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("id", new Long(1));
		data.put("name", "Dummy");
		
		bo.setAttributeValues(data);
		
		DbFormatter formatter = new DbFormatter();
		List<Object> output = formatter.format(bo, schemaDesc);
		assertEquals("Dummy", output.get(0));
		assertEquals(new Long(1), output.get(1));
	}
	
	public void testFormatWithHierarchicalData() throws Exception {
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
		
		// schema descriptor
		
		// create schema description for the DB parser.
		SchemaDescriptor<DbFieldIndexBinding> schemaDesc = new SchemaDescriptor<DbFieldIndexBinding>();
		
		List<SchemaDescriptor<DbFieldIndexBinding>> children = new ArrayList<SchemaDescriptor<DbFieldIndexBinding>>();
		
		SchemaDescriptor<DbFieldIndexBinding> idSchema = new SchemaDescriptor<DbFieldIndexBinding>();
		idSchema.setFieldName("id");
		DbFieldIndexBinding idBinding = new DbFieldIndexBinding();
		idBinding.setDbFieldIndex(2);
		idSchema.setBinding(idBinding);
		children.add(idSchema);
		
		SchemaDescriptor<DbFieldIndexBinding> nameSchema = new SchemaDescriptor<DbFieldIndexBinding>();
		nameSchema.setFieldName("name");
		DbFieldIndexBinding nameBinding = new DbFieldIndexBinding();
		nameBinding.setDbFieldIndex(1);
		nameSchema.setBinding(nameBinding);
		children.add(nameSchema);
		
		
		SchemaDescriptor<DbFieldIndexBinding> addressSchema = new SchemaDescriptor<DbFieldIndexBinding>();
		addressSchema.setFieldName("address");
		
		SchemaDescriptor<DbFieldIndexBinding> line1Schema = new SchemaDescriptor<DbFieldIndexBinding>();
		line1Schema.setFieldName("line1");
		DbFieldIndexBinding line1Binding = new DbFieldIndexBinding();
		line1Binding.setDbFieldIndex(3);
		line1Schema.setBinding(line1Binding);
		addressSchema.getChildren().add(line1Schema);

		SchemaDescriptor<DbFieldIndexBinding> line2Schema = new SchemaDescriptor<DbFieldIndexBinding>();
		line2Schema.setFieldName("line2");
		DbFieldIndexBinding line2Binding = new DbFieldIndexBinding();
		line2Binding.setDbFieldIndex(4);
		line2Schema.setBinding(line2Binding);
		addressSchema.getChildren().add(line2Schema);
		children.add(addressSchema);

		schemaDesc.setChildren(children);


		DefaultBusinessObject addressBO = new DefaultBusinessObject();
		addressBO.setObjectDescriptor(addressObjectDesc);
		Map<String, Object> addData = new HashMap<String, Object>();

		addData.put("line1", "J P Techno Park");
		addData.put("line2", "Bangalore");
		
		addressBO.setAttributeValues(addData);

		
		// create actual data.
		DefaultBusinessObject empBO = new DefaultBusinessObject();
		empBO.setObjectDescriptor(employeeObjectDesc);
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("id", new Long(1));
		data.put("name", "Dummy");
		data.put("address", addressBO);
		empBO.setAttributeValues(data);
		
		
		
		DbFormatter formatter = new DbFormatter();
		List<Object> output = formatter.format(empBO, schemaDesc);
		assertEquals("Dummy", output.get(0));
		assertEquals(new Long(1), output.get(1));
		assertEquals("J P Techno Park", output.get(2));
		assertEquals("Bangalore", output.get(3));

	} 
}
