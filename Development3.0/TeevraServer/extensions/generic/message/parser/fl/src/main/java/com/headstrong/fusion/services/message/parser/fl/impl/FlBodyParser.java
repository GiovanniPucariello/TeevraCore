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
 * $Id: FlParser.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 26, 2008 
 */

package com.headstrong.fusion.services.message.parser.fl.impl;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectFactory;
import com.headstrong.fusion.bo.BusinessObjectFactory.Type;
import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.Primitive;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlBinding;

/**
 * Fixed Length Parser.
 * 
 */
public class FlBodyParser extends AbstractRecordParser {
	private static FlBodyParser instance = new FlBodyParser();
	
	public static FlBodyParser getInstance() {
		return instance;
	}
	
	/**
	 * Type of Business Object to be created. Initialized to
	 * {@link Type#Default}.
	 */
	private Type businessObjectType = Type.Default;

	/**
	 * This method parses the record list and creates a list of business
	 * objects.
	 * 
	 * @precondition objectDescriptor != null && schemaDescriptor != null
	 * @param objectDescriptor
	 *            Object Schema Descriptor
	 * @param schemaDescriptor
	 *            Message configuration schema ( Fixed Length )
	 * @param records
	 *            List of Records.
	 * @return List<DefaultBusinessObject>
	 * @throws Exception
	 */
	public BusinessObject parse(ObjectDescriptor objectDescriptor,
			SchemaDescriptor<FlBinding> schemaDescriptor, String record,
			int offset) throws Exception {
		BusinessObject businessObject = this
				.getBusinessObject(objectDescriptor);
		Map<String, Object> attributeValues = this.parseSchema(
				objectDescriptor, record, schemaDescriptor, offset);
		businessObject.setAttributeValues(attributeValues);
		return businessObject;
	}

	/**
	 * Parses the Record for the schema Descriptor and creates a Map of
	 * Attributes as expected by Business Object.
	 * 
	 * @param message
	 *            Record.
	 * @param schemaDescriptor
	 *            Message configuration schema ( Fixed Length )
	 * @return Attributes Map of attribute name v/s value.
	 * @throws Exception
	 */
	public Map<String, Object> parseSchema(ObjectDescriptor objectDescriptor,
			String record, SchemaDescriptor<FlBinding> schemaDescriptor,
			int offset) throws Exception {
		Map<String, Object> attributes = new HashMap<String, Object>();
		for (SchemaDescriptor<FlBinding> childSchema : schemaDescriptor
				.getChildren()) {
			// retrieve the actual value and set the data.
			// check if the schema has any binding or not.
			if (childSchema.isBind()) {
				Object value = super.getValue(record, childSchema, offset);
				if (objectDescriptor != null) {
					// data is primitive 
					String primitiveType = objectDescriptor.getAttribute(
							childSchema.getFieldName()).getType().getDesc();
					Primitive primitive = Primitive.valueOf(primitiveType);
					value = primitive.eval(value);
				}
				attributes.put(childSchema.getFieldName(), value);
			} else {
				ObjectDescriptor attributeObjectDescriptor = null;
				// create new Business Object
				if ( objectDescriptor != null ) {
					AttributeDescriptor childSchemaAttrDesc = objectDescriptor
					.getAttribute(childSchema.getFieldName());
					attributeObjectDescriptor = childSchemaAttrDesc.getType();
				}
				
				BusinessObject childBo = this.getBusinessObject(attributeObjectDescriptor);
				
				Map<String, Object> childAttributes = this.parseSchema(childBo
						.getObjectDescriptor(), record, childSchema, offset);
				childBo.setAttributeValues(childAttributes);
				attributes.put(childSchema.getFieldName(), childBo);
				// TODO Need to look at the possibility of 12M
			}
		}
		return attributes;
	}

	/**
	 * @return the businessObjectType
	 */
	public Type getBusinessObjectType() {
		return businessObjectType;
	}

	/**
	 * @param businessObjectType
	 *            the businessObjectType to set
	 */
	public void setBusinessObjectType(Type businessObjectType) {
		this.businessObjectType = businessObjectType;
	}

	/**
	 * Returns the Business Object based on the Type.
	 * 
	 * @param objectDescriptor
	 * @return Business Object
	 */
	private BusinessObject getBusinessObject(ObjectDescriptor objectDescriptor) {
		BusinessObject businessObject = BusinessObjectFactory
				.getBusinessObject(this.getBusinessObjectType());
		businessObject.setObjectDescriptor(objectDescriptor);
		return businessObject;
	}
}
