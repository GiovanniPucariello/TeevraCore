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
 * $Id: RuleBundleActivator.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 5, 2008 
 */

package com.headstrong.fusion.services.validator.rules;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.resolver.ServiceResolverImpl;
import com.headstrong.fusion.services.validator.rulemanager.RuleManager;
import com.headstrong.fusion.services.validator.rules.integer.IntegerValidation;
import com.headstrong.fusion.services.validator.rules.nullchecks.IsNotNullValidation;
import com.headstrong.fusion.services.validator.rules.nullchecks.IsNotNullandNotEmptyValidation;
import com.headstrong.fusion.services.validator.rules.nullchecks.IsNullValidation;
import com.headstrong.fusion.services.validator.rules.string.InListValidation;
import com.headstrong.fusion.services.validator.rules.string.NotInListValidation;
import com.headstrong.fusion.services.validator.rules.string.StringLengthCheck;

/**
 * <code>RuleBundleActivator</code> is the {@link BundleActivator} which
 * registers all the rules in the bundle with the {@link RuleManager} and also
 * registers the objects of the rules as the Service.
 */
public class RuleBundleActivator implements BundleActivator {

	public static final Logger logger = LoggerFactory
			.getLogger(RuleBundleActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		RuleManager ruleManager = new ServiceResolverImpl<RuleManager>(
				bundleContext).getService(RuleManager.class.getName(), 0);
		if (ruleManager == null) {
			throw new FusionException("Cannot initialize rule manager");
		}

		ruleManager.registerRule(IntegerValidation.getRuleVO());
		bundleContext.registerService(IntegerValidation.class.getName(),
				new IntegerValidation(), null);

		ruleManager.registerRule(InListValidation.getRuleVO());
		bundleContext.registerService(InListValidation.class.getName(),
				new InListValidation(), null);

		ruleManager.registerRule(NotInListValidation.getRuleVO());
		bundleContext.registerService(NotInListValidation.class.getName(),
				new NotInListValidation(), null);

		ruleManager.registerRule(IsNullValidation.getRuleVO());
		bundleContext.registerService(IsNullValidation.class.getName(),
				new IsNullValidation(), null);

		ruleManager.registerRule(IsNotNullValidation.getRuleVO());
		bundleContext.registerService(IsNotNullValidation.class.getName(),
				new IsNotNullValidation(), null);

		ruleManager.registerRule(IsNotNullandNotEmptyValidation.getRuleVO());
		bundleContext.registerService(IsNotNullandNotEmptyValidation.class
				.getName(), new IsNotNullandNotEmptyValidation(), null);

		ruleManager.registerRule(StringLengthCheck.getRuleVO());
		bundleContext.registerService(StringLengthCheck.class.getName(),
				new StringLengthCheck(), null);

	}

	public void stop(BundleContext bundleContext) throws Exception {
		RuleManager ruleManager = new ServiceResolverImpl<RuleManager>(
				bundleContext).getService(RuleManager.class.getName(), 0);
		if (ruleManager == null) {
			throw new FusionException("Cannot initialize rule manager");
		}
		ruleManager.unRegisterRule(IntegerValidation.getRuleVO());
		ruleManager.unRegisterRule(InListValidation.getRuleVO());
		ruleManager.unRegisterRule(NotInListValidation.getRuleVO());
		ruleManager.unRegisterRule(IsNullValidation.getRuleVO());
		ruleManager.unRegisterRule(IsNotNullValidation.getRuleVO());
		ruleManager.unRegisterRule(IsNotNullandNotEmptyValidation.getRuleVO());
		ruleManager.unRegisterRule(StringLengthCheck.getRuleVO());
	}

}
