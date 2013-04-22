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
 * $Id: StateMachineIdGenerator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 19, 2009 
 */

package com.headstrong.fusion.services.statemachine;

import java.text.MessageFormat;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.AttributeDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.FusionConstants;

/**
 * Generates an Id for state machine based on the message.
 * 
 */
public class StateMachineIdGenerator {
	/**
	 * State Machine key is generated using the key columns in the Business
	 * Object. Following is the format used to generate the State Machine Key
	 * String.
	 */
	private static final MessageFormat STATEMACHINE_KEY_FORMAT = new MessageFormat(
			"<statemachine><schema>{0}</schema><attributes>{1}</attributes></statemachine>");
	/**
	 * List of attributes in the state machine key is added in the following
	 * format.
	 */
	private static final MessageFormat ATTRIBUTE_LIST_FORMAT = new MessageFormat(
			"<attribute><name>{0}</name><value>{1}</value></attribute>");

	/**
	 * Generates the state machine key using the business object.
	 * 
	 * @param defaultBusinessObject
	 * @return State Machine Id.
	 * @throws InvalidAttributeExpressionException 
	 */
	public static String generateStateMachineId(BusinessObject defaultBusinessObject) throws InvalidAttributeExpressionException {
		StringBuffer stateMachineId = new StringBuffer();
		ObjectDescriptor objectDescriptor = defaultBusinessObject
				.getObjectDescriptor();
		StringBuffer attributeListBuffer = new StringBuffer();
		for (AttributeDescriptor attributeDesc : objectDescriptor
				.getAttributes().values()) {
			// FIXME Assumption key attributes are flat. No hierarchy need to be
			// changed.
			if (attributeDesc.isKey()) {
				Object[] attribute = new Object[2];
				attribute[0] = attributeDesc.getAttributeName();
				try {
					attribute[1] = defaultBusinessObject.getValue(attributeDesc
							.getAttributeName());
				} catch (AttributeNotFoundException e) {
					attribute[1] = FusionConstants.EMPTY;
				}
				attributeListBuffer.append(ATTRIBUTE_LIST_FORMAT
						.format(attribute));
				// FIXME check assumption that it'll generate unique keys.
			}
		}
		Object[] statemachine = new Object[2];
		statemachine[0] = objectDescriptor.getName();
		statemachine[1] = attributeListBuffer;
		stateMachineId.append(STATEMACHINE_KEY_FORMAT.format(statemachine));
		return stateMachineId.toString();
	}
}
