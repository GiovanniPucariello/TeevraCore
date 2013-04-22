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
 * $Id: Rule.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 4, 2008 
 */

package com.headstrong.fusion.services.transformer.rulemanager;

import java.util.Map;

import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * Rule interface is implemented by the all the rules that are managed by RuleManager. 
 */
public interface Rule {
	
	/**
	 *	Operate method is implemented by all the rules. 
	 *	It accepts data in the form of {@link Map} name value pair. 
	 * @param data
	 * 		Data in the form of name value pair. 
	 * @return
	 * 		Data return by Rule. Can be of anytype. 
	 * @throws RuleOperationFailedException
	 * 		If rule fails to operate on the data provided. 
	 */
	Object operate(Map<String, Object> data) throws RuleOperationFailedException;
	static String OPERAND="operand";
	static String RESULT="result";
	static String NEXT_SEQUENCE_ID="nextsequenceid";
}
