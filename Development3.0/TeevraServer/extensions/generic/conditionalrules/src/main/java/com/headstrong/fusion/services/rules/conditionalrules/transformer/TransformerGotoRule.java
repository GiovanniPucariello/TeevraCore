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
 * $Id: TransformerGotoRule.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 25, 2008 
 */

package com.headstrong.fusion.services.rules.conditionalrules.transformer;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.services.rules.conditionalrules.GotoOperation;
import com.headstrong.fusion.services.transformer.rulemanager.Rule;
import com.headstrong.fusion.services.transformer.rulemanager.RuleVO;
import com.headstrong.fusion.services.transformer.rulemanager.exception.RuleOperationFailedException;

/**
 * 
 */
public class TransformerGotoRule extends GotoOperation implements Rule {

	/**
	 * Returns {@link RuleVO} for {@link TransformerGotoRule}
	 * 
	 * @return
	 */
	public static final RuleVO getRuleVO() {
		RuleVO ruleVO = new RuleVO();
		ruleVO.setAliasName("gotorule");
		ruleVO.setClassName(TransformerGotoRule.class.getName());
		ruleVO.addInParameter(SEQUENCEID);
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
		try {
			int nextSequenceId = this.performGotoOperation(data);
			Map<String, Object> result = new HashMap<String, Object>();
			result.put(NEXT_SEQUENCE_ID, nextSequenceId);
			return result;
		} catch (Exception e) {
			String errorMsg = "Error while operating rule gotorule on :" + data;
			throw new RuleOperationFailedException(errorMsg);
		}
	}

}
