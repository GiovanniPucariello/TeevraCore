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
 * $Id: GotoOperation.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 12, 2008 
 */

package com.headstrong.fusion.services.rules.conditionalrules;

import java.util.Map;

import com.headstrong.fusion.commons.util.FusionUtil;

/**
 * <code>GotoOperation<code> is the rule which will do unconditional branching. 
 * <p>
 * The input parameters for this rule includes:
 * <ul>
 * <li>sequenceid : The next sequence id to be executed
 * <ul>
 * <p>
 * The output set by this rule includes:
 * <ul>
 * <li>nextsequenceid : Next sequence id
 * <ul>
 */
public class GotoOperation {
	protected static String SEQUENCEID = "sequenceid";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.transformer.rulemanager.Rule#operate(java.util.Map)
	 */
	public int performGotoOperation(Map<String, Object> data) throws Exception {
		try {
			Integer sequenceId = FusionUtil.parseInt(data.get(SEQUENCEID));
			return sequenceId;
		} catch (Exception e) {
			String errorMsg = "Error while operating rule goto on :" + data;
			throw new Exception(errorMsg, e);
		}
	}

}
