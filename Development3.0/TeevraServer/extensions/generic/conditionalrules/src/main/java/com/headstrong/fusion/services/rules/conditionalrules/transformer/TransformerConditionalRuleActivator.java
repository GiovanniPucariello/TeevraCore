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
 * $Id: TransformerConditionalRuleActivator.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 25, 2008 
 */

package com.headstrong.fusion.services.rules.conditionalrules.transformer;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.resolver.ServiceResolverImpl;
import com.headstrong.fusion.services.transformer.rulemanager.RuleManager;

/**
 * 
 */
public class TransformerConditionalRuleActivator {

	public void start(BundleContext bundleContext) throws Exception {
		// transformer registration
		RuleManager tranRuleManager = new ServiceResolverImpl<RuleManager>(
				bundleContext).getService(RuleManager.class.getName(), 0);
		if (tranRuleManager == null) {
			throw new FusionException("Cannot initialize rule manager");
		}

		tranRuleManager.registerRule(TransformerIfThenElseRule.getRuleVO());
		bundleContext.registerService(
				TransformerIfThenElseRule.class.getName(),
				new TransformerIfThenElseRule(), null);

		tranRuleManager.registerRule(TransformerGotoRule.getRuleVO());
		bundleContext.registerService(TransformerGotoRule.class.getName(),
				new TransformerGotoRule(), null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		RuleManager tranRuleManager = new ServiceResolverImpl<RuleManager>(
				bundleContext).getService(RuleManager.class.getName(), 0);
		if (tranRuleManager == null) {
			throw new FusionException("Cannot initialize rule manager");
		}
		tranRuleManager.unRegisterRule(TransformerIfThenElseRule.getRuleVO());
		tranRuleManager.unRegisterRule(TransformerGotoRule.getRuleVO());
	}

}
