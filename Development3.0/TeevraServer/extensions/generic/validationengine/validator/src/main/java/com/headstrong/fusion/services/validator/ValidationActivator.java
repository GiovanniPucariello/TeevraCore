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
 * $Id: ValidationActivator.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Sep 23, 2008 
 */

package com.headstrong.fusion.services.validator;

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
import com.headstrong.fusion.services.validator.impl.DefaultValidator;
import com.headstrong.fusion.services.validator.impl.Validator;
import com.headstrong.fusion.services.validator.impl.ValidatorServiceImpl;
import com.headstrong.fusion.services.validator.rulemanager.RuleManager;
import com.headstrong.fusion.services.validator.serviceconfig.ValidatorServiceConfigParser;
import com.headstrong.fusion.services.validator.serviceconfig.ValidatorServiceConfigParserImpl;

/**
 * The <code>ValidationActivator is the <code>BundleActivator</code>
 * for the Validation Engine. This bundle starts the validation mediation service.
 */
public class ValidationActivator implements BundleActivator {

	private static final Logger logger = LoggerFactory
			.getLogger(ValidationActivator.class);
	private ServiceAliasManager serviceAliasManager = ServiceAliasManager
			.getInstance();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		logger.info("starting validation service bundle");
		// Registering Validation configuration parser.
		ValidatorServiceConfigParser validatorConfigParser = new ValidatorServiceConfigParserImpl();
		Dictionary<String, String> configParserProps = new Hashtable<String, String>();
		configParserProps.put(Constants.SERVICE_PID,
				ValidatorServiceConfigParser.class.getName());
		configParserProps.put(Constants.SERVICE_DESCRIPTION,
				"Transformation Service Configuration Parser");
		configParserProps.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ ValidatorServiceConfigParser.class.getName());

		/**
		 * Validation service configuration parser service registration
		 */
		// Register Validation Service Configuration parser.
		context.registerService(ValidatorServiceConfigParser.class.getName(),
				validatorConfigParser, configParserProps);

		// Alias registration for validation service configuration parser.
		serviceAliasManager.registerServiceAlias(
				ValidatorServiceConfigParser.class.getSimpleName(),
				ValidatorServiceConfigParser.class.getName());

		// Getting the rule manager which is passed to transformation service
		RuleManager ruleManager = new ServiceResolverImpl<RuleManager>(context)
				.getService(RuleManager.class.getName(), 0);
		if (ruleManager == null) {
			throw new FusionException("Cannot initialize rule manager");
		}

		this.registerValidationService(ruleManager, context);
		logger.info("validation service bundle startup complete.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		logger.debug("Unregistering service :"
				+ ValidatorService.class.getName());
		logger.debug("Unregistering service :"
				+ ValidatorServiceConfigParser.class.getName());

	}

	/**
	 * Register Validation service.
	 * 
	 * @param ruleManager
	 * @param bundleContext
	 * @throws Exception
	 */
	private void registerValidationService(RuleManager ruleManager,
			BundleContext bundleContext) throws Exception {

		Validator validator = new DefaultValidator(ruleManager);
		// Register Validator.
		Dictionary<String, String> validatorProps = new Hashtable<String, String>();
		validatorProps.put(Constants.SERVICE_PID, Validator.class.getName());
		validatorProps.put(Constants.SERVICE_DESCRIPTION, "Validator");
		validatorProps.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.debug("Registering service :" + Validator.class.getName());

		// validator registration.
		bundleContext.registerService(Validator.class.getName(), validator,
				validatorProps);

		// Validation service alias registration.
		serviceAliasManager.registerServiceAlias(Validator.class
				.getSimpleName(), Validator.class.getName());

		// Creating a new Validation Generic Mediation service which is an
		// mediation service.
		ValidatorService validatorService = new ValidatorServiceImpl(validator);
		// Initialize the service.
		validatorService.init();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, ValidatorService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION,
				"Fusion validator Implementation");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger
				.debug("Registering service :"
						+ ValidatorService.class.getName());

		// Validation service registration.
		bundleContext.registerService(ValidatorService.class.getName(),
				validatorService, props);
		// Validation service alias registration.
		serviceAliasManager.registerServiceAlias(ValidatorService.class
				.getSimpleName(), ValidatorService.class.getName());
	}

}
