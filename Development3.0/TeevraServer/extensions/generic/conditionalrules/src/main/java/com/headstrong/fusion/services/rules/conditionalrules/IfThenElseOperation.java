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
 * $Id: IfThenElseOperation.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 12, 2008 
 */

package com.headstrong.fusion.services.rules.conditionalrules;

import java.util.Map;

import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * <code>IfThenElseOperation</code> is the rule which can perform conditional
 * branching. It was do comparsion of data based on the condition and will
 * return either of the specified sequenceid.
 * <p>
 * The input parameters for this rule includes:
 * <ul>
 * <li>ifoperand : Data to be matched
 * <li>ifmatchvalue :data to be matched with
 * <li>ifmatchcondition : condition for matching. can be =,<,>,<=,>=,!=. It
 * will inturn do condition check of ifoperand {ifmatchcondition| ifmatchvalue
 * <li>thensequenceid : If condition is true, then return this sequence id
 * <li>elsesequenceid : If condition is false, then return this sequence id
 * <ul>
 * <p>
 * The output set by this rule includes:
 * <ul>
 * <li>nextsequenceid : Next sequence id
 * <ul>
 * 
 */
public class IfThenElseOperation {
	protected static String IFOPERAND = "ifoperand";
	protected static String IfMATCHVALUE = "ifmatchvalue";
	protected static String IfMATCHCONDITION = "ifmatchcondition";
	protected static String THENSEQUENCEID = "thensequenceid";
	protected static String ELSESEQUENCEID = "elsesequenceid";

	protected int performConditionalCheck(Map<String, Object> data)
			throws Exception {

		Object ifOperand = data.get(IFOPERAND);
		Object ifMatchValue = data.get(IfMATCHVALUE);
		String ifMatchCondition = (String) data.get(IfMATCHCONDITION);
		Integer thenSequenceId = FusionUtil.parseInt(data.get(THENSEQUENCEID));
		Integer elseSequenceId = FusionUtil.parseInt(data.get(ELSESEQUENCEID));
		Integer nextSequenceId = 0;
		
		//check null checks
		if(ifMatchValue.toString().equalsIgnoreCase("NULL")) {
			if("=".equals(ifMatchCondition)) {
				return ifOperand==null? thenSequenceId: elseSequenceId;
			} else if ("!=".equals(ifMatchCondition)) {
				return ifOperand!=null?thenSequenceId:elseSequenceId;
			} else {
				String errorMsg = "Matchcondition not supported" + ifMatchCondition;
				throw new RuleOperationFailedException(errorMsg);
			}
		}

		if (ifOperand == null) {
			String errorMsg = "If operand cannot be null";
			throw new Exception(errorMsg);
		}

		if ("=".equals(ifMatchCondition)) {
			nextSequenceId = compare(ifOperand, ifMatchValue) == 0 ? thenSequenceId
					: elseSequenceId;
		} else if ("<".equals(ifMatchCondition)) {
			nextSequenceId = compare(ifOperand, ifMatchValue) < 0 ? thenSequenceId
					: elseSequenceId;
		} else if (">".equals(ifMatchCondition)) {
			nextSequenceId = compare(ifOperand, ifMatchValue) > 0 ? thenSequenceId
					: elseSequenceId;
		} else if ("<=".equals(ifMatchCondition)) {
			nextSequenceId = compare(ifOperand, ifMatchValue) <= 0 ? thenSequenceId
					: elseSequenceId;
		} else if (">=".equals(ifMatchCondition)) {
			nextSequenceId = compare(ifOperand, ifMatchValue) >= 0 ? thenSequenceId
					: elseSequenceId;
		} else if ("!=".equals(ifMatchCondition)) {
			nextSequenceId = compare(ifOperand, ifMatchValue) != 0 ? thenSequenceId
					: elseSequenceId;
		} else {
			String errorMsg = "Matchcondition not supported" + ifMatchCondition;
			throw new RuleOperationFailedException(errorMsg);
		}

		return nextSequenceId;

	}

	private int compare(Object obj1, Object obj2) {
		if ((obj1 instanceof String) || (obj2 instanceof String)) {
			return FusionUtil.compareString(obj1.toString(), obj2.toString());
		}
		if ((obj1 instanceof Integer) && (obj2 instanceof Integer)) {
			return FusionUtil.compareInteger(obj1, obj2);
		}
		return 0;
	}

}
