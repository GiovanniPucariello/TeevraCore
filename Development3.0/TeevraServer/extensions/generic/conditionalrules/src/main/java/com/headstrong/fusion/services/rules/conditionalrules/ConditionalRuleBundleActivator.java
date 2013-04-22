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
 * $Id: ConditionalRuleBundleActivator.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 25, 2008 
 */

package com.headstrong.fusion.services.rules.conditionalrules;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.services.rules.conditionalrules.transformer.TransformerConditionalRuleActivator;
import com.headstrong.fusion.services.rules.conditionalrules.validator.ValidatorConditionalRuleActivator;

/**
 * 
 */
public class ConditionalRuleBundleActivator implements BundleActivator {

	public static final Logger logger = LoggerFactory
			.getLogger(ConditionalRuleBundleActivator.class);
	private TransformerConditionalRuleActivator tranActivator;
	private ValidatorConditionalRuleActivator validActivator;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {

		tranActivator = new TransformerConditionalRuleActivator();
		tranActivator.start(bundleContext);

		validActivator = new ValidatorConditionalRuleActivator();
		validActivator.start(bundleContext);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		tranActivator.stop(bundleContext);
		validActivator.stop(bundleContext);

	}

}
