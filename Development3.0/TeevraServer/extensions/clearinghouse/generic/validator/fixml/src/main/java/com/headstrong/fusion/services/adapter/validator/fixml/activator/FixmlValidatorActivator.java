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
 * $Id: FixmlValidatorActivator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jun 22, 2009 
 */

package com.headstrong.fusion.services.adapter.validator.fixml.activator;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.adapter.validator.fixml.FixmlValidatorService;
import com.headstrong.fusion.services.adapter.validator.fixml.config.FixmlValidatorConfigCache;
import com.headstrong.fusion.services.adapter.validator.fixml.impl.FixmlValidatorServiceImpl;
import com.headstrong.fusion.services.validator.ValidatorService;
import com.headstrong.fusion.services.validator.impl.Validator;

/**
 * Activates fixml validation services.
 */
public class FixmlValidatorActivator implements BundleActivator {
	private ServiceAliasManager serviceAliasManager = ServiceAliasManager
			.getInstance();
	private static Logger logger = LoggerFactory
			.getLogger(FixmlValidatorActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		// initialize the cache.
		//FixmlValidatorConfigCache.init();
		FixmlValidatorConfigCache.init(bundleContext);	
		this.registerValidationService(bundleContext);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
	}

	/**
	 * Register Validation service.
	 * 
	 * @param ruleManager
	 * @param bundleContext
	 * @throws Exception
	 */
	private void registerValidationService(BundleContext bundleContext)
			throws Exception {

		Validator validator = (Validator) serviceAliasManager
				.getServiceByAlias(Validator.class.getSimpleName(), 0);

		// Creating a new Validation Generic Mediation service which is an
		// mediation service.
		FixmlValidatorService validatorService = new FixmlValidatorServiceImpl();
		validatorService.setValidator(validator);

		// Initialize the service.
		validatorService.init();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, ValidatorService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "Fixml validator service.");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger
				.debug("Registering service :"
						+ ValidatorService.class.getName());
		// Validation service registration.
		bundleContext.registerService(FixmlValidatorService.class.getName(),
				validatorService, props);
		// Validation service alias registration.
		serviceAliasManager.registerServiceAlias(FixmlValidatorService.class
				.getSimpleName(), FixmlValidatorService.class.getName());
	}
}
