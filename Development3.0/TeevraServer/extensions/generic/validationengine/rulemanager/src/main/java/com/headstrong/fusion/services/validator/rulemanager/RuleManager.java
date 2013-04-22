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
 * $Id: RuleManager.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 4, 2008 
 */

package com.headstrong.fusion.services.validator.rulemanager;

import java.util.Map;

import com.headstrong.fusion.services.validator.rulemanager.exception.RuleAlreadyExistsException;
import com.headstrong.fusion.services.validator.rulemanager.exception.RuleNotFoundException;
import com.headstrong.fusion.services.validator.rulemanager.exception.RuleOperationFailedException;

/**
 * <code>RuleManager is the interface that needs to be implemented by the validator rulemanager who can manage the rules and their objects.
 */
public interface RuleManager {

	/**
	 * All rules will register itself with rule manager using registerRule
	 * 
	 * @param ruleVO
	 *            RuleVO that contains information for registration
	 * @throws RuleAlreadyExistsException
	 *             If the rule with same name already exists.
	 */
	void registerRule(RuleVO ruleVO) throws RuleAlreadyExistsException;

	/**
	 * Executes the rule on the data provided.
	 * 
	 * @param aliasName
	 *            Alias name of the rule that needs to be executed.
	 * @param data
	 *            Data in the form of name value pair.
	 * @param sb
	 *            StringBuffer that can be appended by the rule for additional information.
	 * @return Data returned by the rule.
	 * @throws RuleNotFoundException
	 *             If the rule could not be found.
	 * @throws RuleOperationFailedException
	 *             If the rule fails on operate on the data provided.
	 */
	Object executeRule(String aliasName, Map<String, Object> data,StringBuffer sb)
			throws RuleNotFoundException, RuleOperationFailedException;

	/**
	 * All rules will unregister itself with rule manager using unregisterRule
	 * 
	 * @param ruleVO
	 *            RuleVO that contains information for unregistration
	 */
	void unRegisterRule(RuleVO ruleVO);

}
