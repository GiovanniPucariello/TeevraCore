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
 * $Id: TransformationActivator.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Sep 23, 2008 
 */

package com.headstrong.fusion.services.transformer;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.commons.resolver.ServiceResolverImpl;
import com.headstrong.fusion.services.transformer.impl.TransformerServiceImpl;
import com.headstrong.fusion.services.transformer.rulemanager.RuleManager;
import com.headstrong.fusion.services.transformer.serviceconfig.TransformerServiceConfigParser;
import com.headstrong.fusion.services.transformer.serviceconfig.TransformerServiceConfigParserImpl;

/**
 * The <code>TransformationActivator is the <code>BundleActivator</code>
 * for the Transformation Engine. This bundle starts the transformation mediation service.
 */
public class TransformationActivator implements BundleActivator {

	private static final Logger logger = LoggerFactory
			.getLogger(TransformationActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		logger.info("starting bundle transformation service");
		ServiceAliasManager serviceAliasManager = ServiceAliasManager
				.getInstance();
		// Register Transformation Service Configuration Parser.
		TransformerServiceConfigParser transformerConfigParser = new TransformerServiceConfigParserImpl();
		Dictionary<String, String> configParserProps = new Hashtable<String, String>();
		configParserProps.put(Constants.SERVICE_PID,
				TransformerServiceConfigParser.class.getName());
		configParserProps.put(Constants.SERVICE_DESCRIPTION,
				"Transformation Service Configuration Parser");
		configParserProps.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ TransformerServiceConfigParser.class.getName());

		context.registerService(TransformerServiceConfigParser.class.getName(),
				transformerConfigParser, configParserProps);

		serviceAliasManager.registerServiceAlias(
				TransformerServiceConfigParser.class.getSimpleName(),
				TransformerServiceConfigParser.class.getName());

		// Getting the rule manager which is passed to transformation service
		RuleManager ruleManager = new ServiceResolverImpl<RuleManager>(context)
				.getService(RuleManager.class.getName(), 0);
		if (ruleManager == null) {
			throw new FusionException("Cannot initialize rule manager");
		}

		// Creating a new Transformation service which is an mediation service.
		TransformerService transformerService = new TransformerServiceImpl(
				ruleManager);
		// Initialize the service.
		transformerService.init();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, TransformerService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Fusion transformer Implementation");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.debug("Registering service :"
				+ TransformerService.class.getName());

		context.registerService(TransformerService.class.getName(),
				transformerService, props);

		serviceAliasManager.registerServiceAlias(TransformerService.class
				.getSimpleName(), TransformerService.class.getName());
		logger.info("bundle transformation service started");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {

		logger.debug("Unregistering service :"
				+ TransformerService.class.getName());

		logger.debug("Unregistering service :"
				+ TransformerServiceConfigParser.class.getName());

	}

}
