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
 * $Id: TransformerIfThenElseRule.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 25, 2008 
 */

package com.headstrong.fusion.services.rules.conditionalrules.transformer;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.services.rules.conditionalrules.IfThenElseOperation;
import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * Refer {@link IfThenElseOperation}
 */
public class TransformerIfThenElseRule extends IfThenElseOperation implements
		Rule {

	/**
	 * Returns {@link RuleVO} for {@link TransformerIfThenElseRule}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("ifthenelserule");
		ruleVO.setClassName(TransformerIfThenElseRule.class.getName());
		ruleVO.addInParameter(IFOPERAND);
		ruleVO.addInParameter(IfMATCHVALUE);
		ruleVO.addInParameter(IfMATCHCONDITION);
		ruleVO.addInParameter(THENSEQUENCEID);
		ruleVO.addInParameter(ELSESEQUENCEID);
		ruleVO.addOutParameter(Rule.NEXT_SEQUENCE_ID);
		return ruleVO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.transformer.rulemanager.Rule#operate(java.util.Map)
	 */
	public Object operate(Map<String, Object> data)
			throws RuleOperationFailedException {
		int nextSequenceId;
		try {
			nextSequenceId = this.performConditionalCheck(data);
			Map<String, Object> result = new HashMap<String, Object>();
			result.put(NEXT_SEQUENCE_ID, nextSequenceId);
			return result;
		} catch (Exception e) {
			String errorMsg = "Error while operating rule ifthenelse on :"
					+ data;
			throw new RuleOperationFailedException(errorMsg);
		}
	}
}
