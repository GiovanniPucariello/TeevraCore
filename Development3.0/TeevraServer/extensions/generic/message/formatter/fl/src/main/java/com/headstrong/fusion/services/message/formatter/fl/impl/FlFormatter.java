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
 * $Id: FlFormatter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 26, 2008 
 */

package com.headstrong.fusion.services.message.formatter.fl.impl;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.DataFormatterFactory;
import com.headstrong.fusion.commons.NumberFormatter;
import com.headstrong.fusion.commons.StringFormatter;
import com.headstrong.fusion.commons.DataFormatterFactory.Formatter;
import com.headstrong.fusion.commons.exception.DataFormattingException;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlBinding;

/**
 * Fixed Length Message Formatter.
 * 
 */
public class FlFormatter {

	private enum PrintType {
		NUMBER, STRING, SIGNED_NUMERIC;
	}

	/**
	 * Formats single business Object.
	 * 
	 * @param message
	 * @param schemaDescriptor
	 * @return
	 * @throws AttributeNotFoundException
	 * @throws DataFormattingException
	 * @throws InvalidAttributeExpressionException 
	 */
	public String format(BusinessObject message,
			SchemaDescriptor<FlBinding> schemaDescriptor)
			throws AttributeNotFoundException, DataFormattingException, InvalidAttributeExpressionException {
		StringBuilder buf = new StringBuilder();
		Map<Integer, Object> dataMap = new TreeMap<Integer, Object>();
		// populate the map
		this.formatData(message, schemaDescriptor, dataMap);
		for (Entry<Integer, Object> entry : dataMap.entrySet()) {
			buf.append(entry.getValue().toString());
		}
		return buf.toString();
	}

	/**
	 * Create a map of data with index as the start index.
	 * 
	 * @param businessObject
	 * @param schemaDesc
	 * @param dataMap
	 * @throws AttributeNotFoundException
	 * @throws DataFormattingException
	 * @throws InvalidAttributeExpressionException 
	 */
	public void formatData(BusinessObject businessObject,
			SchemaDescriptor<FlBinding> schemaDesc, Map<Integer, Object> dataMap)
			throws AttributeNotFoundException, DataFormattingException, InvalidAttributeExpressionException {
		for (SchemaDescriptor<FlBinding> childSchema : schemaDesc.getChildren()) {
			if (childSchema.isBind()) {
				int startIndex = childSchema.getBinding().getStartIndex();
				int endIndex = childSchema.getBinding().getEndIndex();
				Object value = businessObject.getValue(childSchema
						.getFieldName());
				dataMap.put(startIndex, formatData(value, (endIndex
						- startIndex + 1), childSchema.getBinding()
						.getPrintType()));
			} else {
				// Only 121 relationship is supported.
				BusinessObject childBo = (BusinessObject) businessObject
						.getValue(childSchema.getFieldName());
				this.formatData(childBo, childSchema, dataMap);
			}
		}
	}

	/**
	 * formats the data as per the print type specified.
	 * 
	 * @param input
	 *            data input
	 * @param size
	 *            size of the field.
	 * @param printTypeStr
	 *            print type specified.
	 * @return formatted string.
	 * @throws DataFormattingException
	 */
	private static String formatData(Object input, int size, String printTypeStr)
			throws DataFormattingException {
		PrintType printType = null;
		if (printTypeStr == null) {
			printType = getPrintType(input);
		} else {
			printType = PrintType.valueOf(printTypeStr.toUpperCase());
		}

		if (printType != null && printType.equals(PrintType.NUMBER)) {
			NumberFormatter numberFormatter = (NumberFormatter) DataFormatterFactory
					.getDataFormatter(Formatter.Number);
			return numberFormatter.format(input, size, '0');
		} else {
			StringFormatter stringFormatter = (StringFormatter) DataFormatterFactory
					.getDataFormatter(Formatter.String);
			return stringFormatter.format(input, size, ' ');
		}
	}

	/**
	 * dynamically identifies the print type if not specified.
	 * 
	 * @param input
	 *            data input.
	 * @return {@link PrintType}
	 */
	private static PrintType getPrintType(Object input) {
		PrintType printType = PrintType.STRING;
		if (input instanceof Number) {
			printType = PrintType.NUMBER;
		}
		if(input!=null && input.toString().contains("+")){
			printType=PrintType.NUMBER;
		}
		return printType;
	}
}
