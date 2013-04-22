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
 * $Id: DbFormatter.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 13, 2008 
 */

package com.headstrong.fusion.services.message.formatter.db.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.db.DbFieldIndexBinding;

/**
 * Formats the incoming message and creates a list of fields.
 * 
 */
public class DbFormatter {

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param businessObject
	 * @param schemaDescriptor
	 * @return
	 * @throws AttributeNotFoundException
	 * @throws InvalidAttributeExpressionException 
	 */
	public List<Object> format(BusinessObject businessObject,
			SchemaDescriptor<DbFieldIndexBinding> schemaDescriptor)
			throws AttributeNotFoundException, InvalidAttributeExpressionException {

		List<Object> fields = new ArrayList<Object>();
		Map<Integer, Object> dataMap = new TreeMap<Integer, Object>();
		// populate the map
		this.formatData(dataMap, businessObject, schemaDescriptor);

		// convert the map into List.
		for (Entry<Integer, Object> entry : dataMap.entrySet()) {
			fields.add(entry.getValue());
		}
		return fields;
	}

	private void formatData(Map<Integer, Object> dataMap,
			BusinessObject businessObject,
			SchemaDescriptor<DbFieldIndexBinding> schemaDescriptor)
			throws AttributeNotFoundException, InvalidAttributeExpressionException {

		for (SchemaDescriptor<DbFieldIndexBinding> childSchema : schemaDescriptor
				.getChildren()) {

			if (childSchema.isBind()) {
				int index = childSchema.getBinding().getDbFieldIndex();
				dataMap.put(index - 1, businessObject.getValue(childSchema
						.getFieldName()));
			} else {
				// Only 121 relationship is supported.
				BusinessObject childBo = (BusinessObject) businessObject
						.getValue(childSchema.getFieldName());
				this.formatData(dataMap, childBo, childSchema);
			}
		}

	}
}
