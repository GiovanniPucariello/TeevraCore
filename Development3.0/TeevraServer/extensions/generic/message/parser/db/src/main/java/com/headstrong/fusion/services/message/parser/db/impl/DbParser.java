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
 * $Id: DbParser.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 22, 2008 
 */

package com.headstrong.fusion.services.message.parser.db.impl;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectFactory;
import com.headstrong.fusion.bo.BusinessObjectFactory.Type;
import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.commons.DataTypeConverter;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.db.DbFieldBinding;

/**
 * Database record parser. A single database record is a Map where key if the
 * column name and value is the actual value.
 */
public class DbParser {

	/**
	 * creates list of business objects taking data from row map.
	 * 
	 * @precondition objectDescriptor != null && schemaDescriptor != null &&
	 *               messages != null
	 * @param type
	 *            Type of Business Object. <code>Dynamic,Default</code>
	 * @param objectDescriptor
	 *            output object schema descriptor.
	 * @param schemaDescriptor
	 *            Input message schema descriptor.
	 * @param messages
	 *            List of input records.
	 * @return {@link DefaultBusinessObject}
	 * @throws Exception
	 */
	public BusinessObject parse(Type type, ObjectDescriptor objectDescriptor,
			SchemaDescriptor<DbFieldBinding> schemaDescriptor,
			Map<String, Object> message) throws Exception {
		BusinessObject businessObject = BusinessObjectFactory
				.getBusinessObject(type);
		businessObject.setObjectDescriptor(objectDescriptor);
		Map<String, Object> attributeValues = this.parseSchema(type,
				objectDescriptor, message, schemaDescriptor);
		businessObject.setAttributeValues(attributeValues);
		return businessObject;
	}

	/**
	 * Parses the message.
	 * 
	 * @precondition objectDescriptor != null && schemaDescriptor != null &&
	 *               message != null
	 * @param ObjectDescriptor
	 * @param message
	 * @param schemaDescriptor
	 * @throws Exception
	 */
	public Map<String, Object> parseSchema(Type type,
			ObjectDescriptor objectDescriptor, Map<String, Object> message,
			SchemaDescriptor<DbFieldBinding> schemaDescriptor) throws Exception {
		Map<String, Object> attributes = new HashMap<String, Object>();
		for (SchemaDescriptor<DbFieldBinding> childSchema : schemaDescriptor
				.getChildren()) {
			// retrieve the actual value and set the data.
			// check if the schema has any binding or not.
			if (childSchema.isBind()) {
				Object value = message.get(childSchema.getBinding()
						.getDbField());
				// parse the data is object descriptor is present.
				if (objectDescriptor != null) {
					// data is primitive
					String primitiveType = objectDescriptor.getAttribute(
							childSchema.getFieldName()).getType().getDesc();
					value = DataTypeConverter.parse(value, primitiveType);
				}
				attributes.put(childSchema.getFieldName(), value);
			} else {
				// only 121 relationship is handled.
				BusinessObject childBo = BusinessObjectFactory
						.getBusinessObject(type);
				// set the descriptor if provided.
				if (objectDescriptor != null) {
					AttributeDescriptor childSchemaAttrDesc = objectDescriptor
							.getAttribute(childSchema.getFieldName());
					// its a complex type and needs recursive parsing.
					childBo.setObjectDescriptor(childSchemaAttrDesc.getType());
				}
				Map<String, Object> childAttributes = this.parseSchema(type,
						childBo.getObjectDescriptor(), message, childSchema);
				childBo.setAttributeValues(childAttributes);
				attributes.put(childSchema.getFieldName(), childBo);
				// TODO Need to look at the possibility of 12M
			}
		}
		return attributes;
	}
}
