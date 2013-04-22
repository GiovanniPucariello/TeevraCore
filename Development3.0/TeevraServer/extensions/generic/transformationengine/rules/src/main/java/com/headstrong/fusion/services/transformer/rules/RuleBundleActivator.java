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

package com.headstrong.fusion.services.transformer.rules;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.resolver.ServiceResolverImpl;
import com.headstrong.fusion.services.transformer.rulemanager.RuleManager;
import com.headstrong.fusion.services.transformer.rules.clearinghouserules.DecodeC21ExtCodeRule;
import com.headstrong.fusion.services.transformer.rules.clearinghouserules.EncodeC21ExtCodeRule;
import com.headstrong.fusion.services.transformer.rules.daterules.CurrentTimeStampRule;
import com.headstrong.fusion.services.transformer.rules.daterules.DateFormattingRule;
import com.headstrong.fusion.services.transformer.rules.lookup.DBCacheLookupRule;
import com.headstrong.fusion.services.transformer.rules.mathrules.AddRule;
import com.headstrong.fusion.services.transformer.rules.mathrules.ArithmeticExpressionRule;
import com.headstrong.fusion.services.transformer.rules.mathrules.DivisionRule;
import com.headstrong.fusion.services.transformer.rules.mathrules.ExponentialRule;
import com.headstrong.fusion.services.transformer.rules.mathrules.IntegerDivisionRule;
import com.headstrong.fusion.services.transformer.rules.mathrules.ModulusRule;
import com.headstrong.fusion.services.transformer.rules.mathrules.MultiplyRule;
import com.headstrong.fusion.services.transformer.rules.mathrules.NumberFormatterRule;
import com.headstrong.fusion.services.transformer.rules.mathrules.SubtractRule;
import com.headstrong.fusion.services.transformer.rules.stringrules.SimpleMappingRule;
import com.headstrong.fusion.services.transformer.rules.stringrules.StringConcatenateRule;
import com.headstrong.fusion.services.transformer.rules.stringrules.StringToListConverter;
import com.headstrong.fusion.services.transformer.rules.stringrules.StringTrimRule;
import com.headstrong.fusion.services.transformer.rules.stringrules.SubStringRule;

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

		// String rules registering
		ruleManager.registerRule(SubStringRule.getRuleVO());
		bundleContext.registerService(SubStringRule.class.getName(),
				new SubStringRule(), null);

		ruleManager.registerRule(SimpleMappingRule.getRuleVO());
		bundleContext.registerService(SimpleMappingRule.class.getName(),
				new SimpleMappingRule(), null);

		ruleManager.registerRule(StringConcatenateRule.getRuleVO());
		bundleContext.registerService(StringConcatenateRule.class.getName(),
				new StringConcatenateRule(), null);

		ruleManager.registerRule(StringToListConverter.getRuleVO());
		bundleContext.registerService(StringToListConverter.class.getName(),
				new StringToListConverter(), null);

		ruleManager.registerRule(StringTrimRule.getRuleVO());
		bundleContext.registerService(StringTrimRule.class.getName(),
				new StringTrimRule(), null);

		// Math rules registering
		ruleManager.registerRule(DivisionRule.getRuleVO());
		bundleContext.registerService(DivisionRule.class.getName(),
				new DivisionRule(), null);

		ruleManager.registerRule(AddRule.getRuleVO());
		bundleContext.registerService(AddRule.class.getName(), new AddRule(),
				null);

		ruleManager.registerRule(SubtractRule.getRuleVO());
		bundleContext.registerService(SubtractRule.class.getName(),
				new SubtractRule(), null);

		ruleManager.registerRule(MultiplyRule.getRuleVO());
		bundleContext.registerService(MultiplyRule.class.getName(),
				new MultiplyRule(), null);

		ruleManager.registerRule(NumberFormatterRule.getRuleVO());
		bundleContext.registerService(NumberFormatterRule.class.getName(),
				new NumberFormatterRule(), null);

		ruleManager.registerRule(ArithmeticExpressionRule.getRuleVO());
		bundleContext.registerService(ArithmeticExpressionRule.class.getName(),
				new ArithmeticExpressionRule(), null);

		// Date rules registering
		ruleManager.registerRule(DateFormattingRule.getRuleVO());
		bundleContext.registerService(DateFormattingRule.class.getName(),
				new DateFormattingRule(), null);

		ruleManager.registerRule(CurrentTimeStampRule.getRuleVO());
		bundleContext.registerService(CurrentTimeStampRule.class.getName(),
				new CurrentTimeStampRule(), null);

		// lookuprule
		ruleManager.registerRule(DBCacheLookupRule.getRuleVO());
		bundleContext.registerService(DBCacheLookupRule.class.getName(),
				new DBCacheLookupRule(), null);

		//clearing house rules
		ruleManager.registerRule(EncodeC21ExtCodeRule.getRuleVO());
		bundleContext.registerService(EncodeC21ExtCodeRule.class.getName(),
				new EncodeC21ExtCodeRule(), null);

		ruleManager.registerRule(DecodeC21ExtCodeRule.getRuleVO());
		bundleContext.registerService(DecodeC21ExtCodeRule.class.getName(),
				new DecodeC21ExtCodeRule(), null);
		
		ruleManager.registerRule(ModulusRule.getRuleVO());
		bundleContext.registerService(ModulusRule.class.getName(),
				new ModulusRule(), null);
		
		ruleManager.registerRule(ExponentialRule.getRuleVO());
		bundleContext.registerService(ExponentialRule.class.getName(),
				new ExponentialRule(), null);
		
		ruleManager.registerRule(IntegerDivisionRule.getRuleVO());
		bundleContext.registerService(IntegerDivisionRule.class.getName(),
				new IntegerDivisionRule(), null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		RuleManager ruleManager = new ServiceResolverImpl<RuleManager>(
				bundleContext).getService(RuleManager.class.getName(), 0);
		if (ruleManager == null) {
			throw new FusionException("Cannot initialize rule manager");
		}
		// String rules unregistering
		ruleManager.unRegisterRule(SubStringRule.getRuleVO());
		ruleManager.unRegisterRule(SimpleMappingRule.getRuleVO());
		ruleManager.unRegisterRule(StringConcatenateRule.getRuleVO());
		ruleManager.unRegisterRule(StringToListConverter.getRuleVO());

		// Math rules unregistering
		ruleManager.unRegisterRule(AddRule.getRuleVO());
		ruleManager.unRegisterRule(SubtractRule.getRuleVO());
		ruleManager.unRegisterRule(MultiplyRule.getRuleVO());
		ruleManager.unRegisterRule(DivisionRule.getRuleVO());
		ruleManager.unRegisterRule(NumberFormatterRule.getRuleVO());
		ruleManager.unRegisterRule(ArithmeticExpressionRule.getRuleVO());

		// Date rules unregistering
		ruleManager.unRegisterRule(DateFormattingRule.getRuleVO());
		ruleManager.unRegisterRule(CurrentTimeStampRule.getRuleVO());

		// lookup unregistering
		ruleManager.unRegisterRule(DBCacheLookupRule.getRuleVO());

		//clearing house rules
		ruleManager.unRegisterRule(EncodeC21ExtCodeRule.getRuleVO());
		ruleManager.unRegisterRule(DecodeC21ExtCodeRule.getRuleVO());
	}

}
