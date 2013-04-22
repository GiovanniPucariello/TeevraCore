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
 * $Id: RuleManagerActivator.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 11, 2008 
 */

package com.headstrong.fusion.services.transformer.rulemanager;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.services.transformer.rulemanager.impl.RuleManagerImpl;

/**
 * <code>RuleManagerActivator</code> is the {@link BundleActivator} which
 * registers the rule manager as a service.
 */
public class RuleManagerActivator implements BundleActivator {

	private static final Logger logger = LoggerFactory
			.getLogger(RuleManagerActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		RuleManager ruleManager = new RuleManagerImpl(context);

		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, RuleManager.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Fusion transformer Rule manager Implementation");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.debug("Registering service :" + RuleManager.class.getName());

		context
				.registerService(RuleManager.class.getName(), ruleManager,
						props);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		//Nothing to be done on stop

	}

}
