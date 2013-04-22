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
 * $Id: TdFormatter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 21, 2008 
 */

package com.headstrong.fusion.services.message.formatter.td.impl;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.td.ColumnIndexBinding;

/**
 * Tag-Delimited Message formatter.
 */
public class TdFormatter {
	/**
	 * converts the {@link DefaultBusinessObject} into a delimiter separated
	 * messages.
	 * 
	 * @param messages
	 *            Business Object.
	 * @param tdSchemaDescriptor
	 *            Schema Descriptor.
	 * @return Tag-Delimited Message
	 * @throws AttributeNotFoundException
	 * @throws InvalidAttributeExpressionException
	 */
	public String format(BusinessObject message,
			SchemaDescriptor<ColumnIndexBinding> tdSchemaDescriptor,
			String delimiter) throws AttributeNotFoundException,
			InvalidAttributeExpressionException {
		int delimLength = delimiter.length();
		StringBuilder buf = new StringBuilder();
		Map<Integer, Object> dataMap = new TreeMap<Integer, Object>();
		// populate the map
		this.formatData(message, tdSchemaDescriptor, dataMap);
		// convert the map into List.
		for (Entry<Integer, Object> entry : dataMap.entrySet()) {
			if (entry.getValue() == null) {
				buf.append(FusionConstants.EMPTY);
			} else {
				buf.append(entry.getValue().toString());
			}
			buf.append(delimiter);
		}
		return buf.substring(0, buf.length() - delimLength);
	}

	/**
	 * 
	 * @param defaultBusinessObject
	 * @param schemaDesc
	 * @param dataMap
	 * @throws AttributeNotFoundException
	 * @throws InvalidAttributeExpressionException
	 */
	public void formatData(BusinessObject defaultBusinessObject,
			SchemaDescriptor<ColumnIndexBinding> schemaDesc,
			Map<Integer, Object> dataMap) throws AttributeNotFoundException,
			InvalidAttributeExpressionException {

		for (SchemaDescriptor<ColumnIndexBinding> childSchema : schemaDesc
				.getChildren()) {
			if (childSchema.isBind()) {
				int index = childSchema.getBinding().getColumnIndex();
				dataMap.put(index - 1, defaultBusinessObject
						.getValue(childSchema.getFieldName()));
			} else {
				// Only 121 relationship is supported.
				BusinessObject childBo = (BusinessObject) defaultBusinessObject
						.getValue(childSchema.getFieldName());
				this.formatData(childBo, childSchema, dataMap);
			}
		}
	}

	/**
	 * converts the {@link DefaultBusinessObject} into a delimiter separated
	 * messages. Method is specific to LME as delimiter separated messages need
	 * to be generated in the FIX messages format like "11=9917=9935=837=88"
	 * 
	 * @param messages
	 *            Business Object.
	 * @param tdSchemaDescriptor
	 *            Schema Descriptor.
	 * @return Tag-Delimited Message
	 * @throws AttributeNotFoundException
	 * @throws InvalidAttributeExpressionException
	 */
	public String lmeFormat(BusinessObject message,
			SchemaDescriptor<ColumnIndexBinding> tdSchemaDescriptor,
			String delimiter) throws AttributeNotFoundException,
			InvalidAttributeExpressionException {
		int delimLength = delimiter.length();
		StringBuilder buf = new StringBuilder();
		Map<Integer, Object> dataMap = new LinkedHashMap<Integer, Object>();
		// populate the map
		this.lmeFormatData(message, tdSchemaDescriptor, dataMap);
		// convert the map into List.
		for (Entry<Integer, Object> entry : dataMap.entrySet()) {
			if (entry.getValue() == null) {
				buf.append(FusionConstants.EMPTY);
			} else {
				if (entry.getValue() != null) {
					buf.append(entry.getKey().toString());
					buf.append("=");
					buf.append(entry.getValue().toString());
					buf.append(delimiter);
				}
			}

		}
		buf.append(delimiter);
		return buf.substring(0, buf.length() - delimLength);
	}

	/**
	 * Populating the dataMap with attribute values where its key value will be
	 * the index. Specific to LME in the way the key value is being populated in
	 * the map
	 * 
	 * @param index
	 *            Represents the FIX message TAG Number
	 * @param defaultBusinessObject
	 * @param schemaDesc
	 * @param dataMap
	 * @throws AttributeNotFoundException
	 * @throws InvalidAttributeExpressionException
	 */
	public void lmeFormatData(BusinessObject defaultBusinessObject,
			SchemaDescriptor<ColumnIndexBinding> schemaDesc,
			Map<Integer, Object> dataMap) throws AttributeNotFoundException,
			InvalidAttributeExpressionException {

		for (SchemaDescriptor<ColumnIndexBinding> childSchema : schemaDesc
				.getChildren()) {
			if (childSchema.isBind()) {
				int index = childSchema.getBinding().getColumnIndex();
				dataMap.put(index, defaultBusinessObject.getValue(childSchema
						.getFieldName()));
			} else {
				// Only 121 relationship is supported.
				BusinessObject childBo = (BusinessObject) defaultBusinessObject
						.getValue(childSchema.getFieldName());
				this.formatData(childBo, childSchema, dataMap);
			}
		}
	}
}
