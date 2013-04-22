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
 * $Id: FieldMapper.java
 * $Revision:
 * $Author: Ssoni
 * $DateTime: Jun 15, 2009
 */

package com.headstrong.fusion.services.message.commons.adapter.mapper;

import java.util.Map;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.DataTypeConverter;
import com.headstrong.fusion.commons.expression.evaluator.EvaluationContext;
import com.headstrong.fusion.commons.expression.evaluator.Expression;
import com.headstrong.fusion.commons.expression.evaluator.util.DefaultEvaluationContext;
import com.headstrong.fusion.services.message.commons.adapter.mapper.config.FieldMapping;
import com.headstrong.fusion.services.message.commons.adapter.mapper.config.Statement;
import com.headstrong.fusion.services.message.commons.adapter.mapper.exception.MappingException;

/**
 * Maps source field to target field.
 * 
 */
public class FieldMapper implements Mapper {

	public static final String SIGNED_NUMERIC = "SIGNED_NUMERIC";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.services.adapter.message.euronext.mapper.Mapper
	 * #map(com.headstrong.fusion.bo.BusinessObject,
	 * com.headstrong.fusion.bo.BusinessObject)
	 */
	public void map(Map<String, Object> headers, Statement statement,
			BusinessObject source, BusinessObject target)
			throws MappingException, InvalidAttributeExpressionException {
		if (!(statement instanceof FieldMapping)) {

			throw new MappingException("invalid configuration provided");
		}

		// copy the source field data to target field.
		FieldMapping fieldMapping = (FieldMapping) statement;
		String type = fieldMapping.getType();
		Object sourceValue = null;

		if ("constant".equals(type)) {
			sourceValue = fieldMapping.getSource();
		} else if ("simple".equals(type)) {
			try {
				sourceValue = source
						.getValue((String) fieldMapping.getSource());
			} catch (AttributeNotFoundException e) {
				throw new MappingException("invalid attribute name specified "
						+ fieldMapping.getSource() + ".", e);
			}
		} else if ("expression".equals(type)) {
			// expression evaluator required.
			EvaluationContext evaluationContext = new DefaultEvaluationContext();
			evaluationContext.set(EvaluationContext.HEADER, headers);
			try {
				evaluationContext
						.set(EvaluationContext.BUSINESS_OBJECT, source);
				sourceValue = ((Expression) fieldMapping.getSource())
						.evaluate(evaluationContext);
			} catch (Exception e) {
				throw new MappingException("Error evaluating the expression ",
						e);
			}
		} else {

			throw new MappingException("unsupported mapping type " + type
					+ "provided");
		}

		// set to null if empty
		if (sourceValue != null && sourceValue instanceof String
				&& ((String) sourceValue).trim().length() == 0) {
			sourceValue = null;
		}

		// Check for mandatory field mapping. Use default value if specified
		if (sourceValue == null) {
			if (fieldMapping.getDefaultValue() != null) {
				sourceValue = fieldMapping.getDefaultValue();
			}

			if (fieldMapping.isRequired()) {

				throw new MappingException(
						"Mandatory field required for mapping " + "{source:"
								+ fieldMapping.getSource() + ",target:"
								+ fieldMapping.getTarget() + "}" + ".");
			}

			// no need to map as we can't with a null source value
			/*
			 * if (sourceValue == null) //no default set too return;
			 */
		}

		// set the value
		if (fieldMapping.getDataTypeParserConfig() != null) {
			try {
				sourceValue = DataTypeConverter.parse(sourceValue, fieldMapping
						.getDataTypeParserConfig().getDataType(), fieldMapping
						.getDataTypeParserConfig().getInput());
			} catch (Exception e) {

				throw new MappingException("Unable to format the data "
						+ sourceValue + "{source:" + fieldMapping.getSource()
						+ ",target:" + fieldMapping.getTarget() + "}" + ".", e);
			}
		}
		// if the mapper is called from the formatter ..
		if (fieldMapping.getDataTypeFormatterConfig() != null) {
			if ((fieldMapping.getDataTypeFormatterConfig().getDataType())
					.equalsIgnoreCase(SIGNED_NUMERIC)) {
				if (sourceValue == null) {
					sourceValue = "+";
				} else if (!sourceValue.toString().contains("-")) {
					sourceValue = "+" + sourceValue;
				}
				String[] input = fieldMapping.getDataTypeFormatterConfig()
						.getInput();
				if (input != null && input.length != 0) {
					try {
						sourceValue = DataTypeConverter.format(sourceValue,
								fieldMapping.getDataTypeFormatterConfig()
										.getDataType(), fieldMapping
										.getDataTypeFormatterConfig()
										.getInput());
					} catch (Exception e) {

						throw new MappingException("Unable to format the data."
								+ sourceValue + ".", e);
					}
				}
			} else {
				try {
					sourceValue = DataTypeConverter.format(sourceValue,
							fieldMapping.getDataTypeFormatterConfig()
									.getDataType(), fieldMapping
									.getDataTypeFormatterConfig().getInput());
				} catch (Exception e) {
					throw new MappingException("Unable to format the data."
							+ sourceValue + ".", e);
				}
			}

		}

		try {
			String targetAttribute = fieldMapping.getTarget();
			// if target attribute contains reference to source field replace
			// the same with the actual value
			if (targetAttribute.contains("$")) {
				int startIndex = 0;
				int endIndex = 0;
				while (true) {
					startIndex = targetAttribute.indexOf("$", endIndex);
					if (startIndex < 0) {
						break;
					}
					endIndex = targetAttribute.indexOf("]", startIndex);
					String attr = targetAttribute.substring(startIndex + 1,
							endIndex);
					Object replacement = source.getValue(attr);
					targetAttribute = targetAttribute
							.replace("$" + attr, replacement == null ? null
									: replacement.toString());
				}
			}
			target.setValue(targetAttribute, sourceValue);
		} catch (AttributeNotFoundException e) {
			throw new MappingException("invalid attribute name specified "
					+ fieldMapping.getTarget() + ".", e);
		}

	}
}
