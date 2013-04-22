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
 * $Id: TdBodyParser.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 21, 2008 
 */

package com.headstrong.fusion.services.message.parser.td.impl;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectFactory;
import com.headstrong.fusion.bo.BusinessObjectFactory.Type;
import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.DefaultBusinessObject;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.Primitive;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.td.ColumnIndexBinding;

/**
 * Tag-Delimited Body Parser.
 */
public class TdBodyParser extends AbstractRecordParser {

	private static TdBodyParser instance = new TdBodyParser();

	public static TdBodyParser getInstance() {
		return instance;
	}

	/**
	 * Added By Kapil (2011.03.24)
	 * 
	 * Default value is set as Type.Default
	 * 
	 * Type of Business Object to be created. Initialized to
	 * {@link Type#Default}.
	 */
	private Type businessObjectType = Type.Default;

	/**
	 * Added By Kapil (2011.03.24)
	 * 
	 * @return
	 */
	public Type getBusinessObjectType() {
		return businessObjectType;
	}

	/**
	 * Added By Kapil (2011.03.24)
	 * 
	 * @param businessObjectType
	 */
	public void setBusinessObjectType(Type businessObjectType) {
		this.businessObjectType = businessObjectType;
	}

	/**
	 * Parses a record and creates Business Object.
	 * 
	 * @param objectDescriptor
	 * @param schemaDescriptor
	 * @param message
	 * @return
	 * @throws Exception
	 */
	public DefaultBusinessObject parse(String delimiter,
			ObjectDescriptor objectDescriptor,
			SchemaDescriptor<ColumnIndexBinding> schemaDescriptor, String record)
			throws Exception {

		DefaultBusinessObject defaultBusinessObject = null;
		if (record != null && !record.trim().equals(FusionConstants.EMPTY)) {
			defaultBusinessObject = new DefaultBusinessObject();
			defaultBusinessObject.setObjectDescriptor(objectDescriptor);
			String[] columns = super.split(record, delimiter, true);
			Map<String, Object> attributeValues = this.parseSchema(
					objectDescriptor, columns, schemaDescriptor);
			defaultBusinessObject.setAttributeValues(attributeValues);
		}

		return defaultBusinessObject;
	}

	/**
	 * Parses a record and creates Business Object.
	 * 
	 * @param objectDescriptor
	 * @param schemaDescriptor
	 * @param message
	 * @return
	 * @throws Exception
	 */
	public DefaultBusinessObject parse(String delimiter,
			ObjectDescriptor objectDescriptor,
			SchemaDescriptor<ColumnIndexBinding> schemaDescriptor,
			String record, Boolean considerQuote) throws Exception {

		DefaultBusinessObject defaultBusinessObject = null;
		if (record != null && !record.trim().equals(FusionConstants.EMPTY)) {
			defaultBusinessObject = new DefaultBusinessObject();
			defaultBusinessObject.setObjectDescriptor(objectDescriptor);
			String[] columns = super.split(record, delimiter, considerQuote);
			Map<String, Object> attributeValues = this.parseSchema(
					objectDescriptor, columns, schemaDescriptor);
			defaultBusinessObject.setAttributeValues(attributeValues);
		}
		return defaultBusinessObject;
	}

	/**
	 * 
	 * @param message
	 * @param schemaDescriptor
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> parseSchema(ObjectDescriptor objectDescriptor,
			String[] message,
			SchemaDescriptor<ColumnIndexBinding> schemaDescriptor)
			throws Exception {

		Map<String, Object> attributes = new HashMap<String, Object>();
		for (SchemaDescriptor<ColumnIndexBinding> childSchema : schemaDescriptor
				.getChildren()) {
			// retrieve the actual value and set the data.
			// check if the schema has any binding or not.
			if (childSchema.isBind()) {

				Object value = message[childSchema.getBinding()
						.getColumnIndex() - 1];

				// data is primitive
				String primitiveType = objectDescriptor.getAttribute(
						childSchema.getFieldName()).getType().getDesc();
				Primitive primitive = Primitive.valueOf(primitiveType);
				value = primitive.eval(value);

				attributes.put(childSchema.getFieldName(), value);

			} else {

				// only 121 relationship is handled.
				DefaultBusinessObject childBo = new DefaultBusinessObject();
				AttributeDescriptor childSchemaAttrDesc = objectDescriptor
						.getAttribute(childSchema.getFieldName());
				// its a complex type and needs recursive parsing.
				childBo.setObjectDescriptor(childSchemaAttrDesc.getType());

				Map<String, Object> childAttributes = this.parseSchema(childBo
						.getObjectDescriptor(), message, childSchema);
				childBo.setAttributeValues(childAttributes);
				attributes.put(childSchema.getFieldName(), childBo);
				// TODO Need to look at the possibility of 12M
			}
		}
		return attributes;
	}

	/**
	 * Added by Kapil (2011.03.24)
	 * 
	 * @param delimiter
	 * @param objectDescriptor
	 * @param schemaDescriptor
	 * @param record
	 * @return
	 * @throws Exception
	 */
	public BusinessObject parseFIX(String delimiter,
			ObjectDescriptor objectDescriptor,
			SchemaDescriptor<ColumnIndexBinding> schemaDescriptor, String record)
			throws Exception {

		BusinessObject businessObject = this
				.getBusinessObject(objectDescriptor);

		// Array contains delimiter separated values
		String[] delimSplitedArray = super.split(record, delimiter, true);

		// Map contains '=' separated values as key value pair
		Map<String, String> values = new HashMap<String, String>();

		for (String str : delimSplitedArray) {
			if(str!=null && !str.equals("")) {
				String[] equalsSplitedArray = str.split("=");
				if (equalsSplitedArray.length == 2) {
					values.put(equalsSplitedArray[0], equalsSplitedArray[1]);
				}
			}
		}

		Map<String, Object> attributeValues = this.parseSchemaFIX(
				objectDescriptor, values, schemaDescriptor);

		businessObject.setAttributeValues(attributeValues);

		return businessObject;
	}

	/**
	 * Added By Kapil (2011.03.24)
	 * 
	 * @param objectDescriptor
	 * @param values
	 * @param schemaDescriptor
	 * @return
	 */
	private Map<String, Object> parseSchemaFIX(
			ObjectDescriptor objectDescriptor, Map<String, String> values,
			SchemaDescriptor<ColumnIndexBinding> schemaDescriptor)
			throws Exception {

		Map<String, Object> attributes = new HashMap<String, Object>();
		for (SchemaDescriptor<ColumnIndexBinding> childSchema : schemaDescriptor
				.getChildren()) {
			// retrieve the actual value and set the data.
			// check if the schema has any binding or not.
			if (childSchema.isBind()) {

				Object value = values.get(Integer.toString(childSchema
						.getBinding().getColumnIndex()));

				if (objectDescriptor != null) {

					// data is primitive
					String primitiveType = objectDescriptor.getAttribute(
							childSchema.getFieldName()).getType().getDesc();
					Primitive primitive = Primitive.valueOf(primitiveType);
					value = primitive.eval(value);
				}

				attributes.put(childSchema.getFieldName(), value);

			} else {

				// only 121 relationship is handled.
				DefaultBusinessObject childBo = new DefaultBusinessObject();
				AttributeDescriptor childSchemaAttrDesc = objectDescriptor
						.getAttribute(childSchema.getFieldName());
				// its a complex type and needs recursive parsing.
				childBo.setObjectDescriptor(childSchemaAttrDesc.getType());

				Map<String, Object> childAttributes = this.parseSchemaFIX(
						childBo.getObjectDescriptor(), values, childSchema);
				childBo.setAttributeValues(childAttributes);
				attributes.put(childSchema.getFieldName(), childBo);
				// TODO Need to look at the possibility of 12M
			}
		}

		return attributes;
	}

	/**
	 * Added By Kapil (2011.03.24)
	 * 
	 * @param objectDescriptor
	 * @return
	 */
	private BusinessObject getBusinessObject(ObjectDescriptor objectDescriptor) {

		BusinessObject businessObject = BusinessObjectFactory
				.getBusinessObject(this.getBusinessObjectType());
		businessObject.setObjectDescriptor(objectDescriptor);
		return businessObject;
	}

}