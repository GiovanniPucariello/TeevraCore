package com.headstrong.fusion.services.rules.conditionalrules.validator;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.resolver.ServiceResolverImpl;
import com.headstrong.fusion.services.validator.rulemanager.RuleManager;

public class ValidatorConditionalRuleActivator {

	public void start(BundleContext bundleContext) throws Exception {
		RuleManager validRuleManager = new ServiceResolverImpl<RuleManager>(
				bundleContext).getService(RuleManager.class.getName(), 0);
		if (validRuleManager == null) {
			throw new FusionException("Cannot initialize rule manager");
		}

		validRuleManager.registerRule(ValidatorIfThenElseRule.getRuleVO());
		bundleContext.registerService(ValidatorIfThenElseRule.class.getName(),
				new ValidatorIfThenElseRule(), null);

		validRuleManager.registerRule(ValidatorGotoRule.getRuleVO());
		bundleContext.registerService(ValidatorGotoRule.class.getName(),
				new ValidatorGotoRule(), null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		RuleManager validRuleManager = new ServiceResolverImpl<RuleManager>(
				bundleContext).getService(RuleManager.class.getName(), 0);
		if (validRuleManager == null) {
			throw new FusionException("Cannot initialize rule manager");
		}
		validRuleManager.unRegisterRule(ValidatorIfThenElseRule.getRuleVO());
		validRuleManager.unRegisterRule(ValidatorGotoRule.getRuleVO());
	}

}
