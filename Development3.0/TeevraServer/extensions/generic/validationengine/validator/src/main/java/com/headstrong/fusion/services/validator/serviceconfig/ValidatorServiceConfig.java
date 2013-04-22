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
 * $Id: ValidatorServiceConfig.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 6, 2008 
 */

package com.headstrong.fusion.services.validator.serviceconfig;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>ValidatorServiceConfig</code> contains the configuration
 * information required by TranformerService. It contains the set of
 * rules in the sequence of the sequence id provided in the rules.
 */
public class ValidatorServiceConfig {
	/**
	 * The list of the ruleset that needs to be operated on the business object
	 */
	private List<RuleSet> rules;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Rules:").append(rules);
		return sb.toString();

	}

	/**
	 * @return the rules
	 */
	public List<RuleSet> getRules() {
		return rules;
	}
	
	public RuleSet getRule(int sequenceId) {
		for (RuleSet rule:rules) {
			if (rule.getSequenceId()==sequenceId) {
				return rule;
			}
		}
		return null;
		
	}

	/**
	 * @param rules
	 *            the rules to set
	 */
	public void setRules(List<RuleSet> rules) {
		this.rules = rules;
	}

	public void addRule(RuleSet rule) {
		if (rules == null) {
			rules = new ArrayList<RuleSet>();
		}
		rules.add(rule);
	}
}
