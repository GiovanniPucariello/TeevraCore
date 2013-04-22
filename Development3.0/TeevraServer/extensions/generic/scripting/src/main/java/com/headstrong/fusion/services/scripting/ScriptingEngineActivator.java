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
 * $Id: ScriptingEngineActivator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Dec 16, 2008 
 */

package com.headstrong.fusion.services.scripting;

import java.util.Dictionary;
import java.util.Hashtable;

import org.apache.bsf.BSFManager;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.scripting.engine.BSFScriptingManager;
import com.headstrong.fusion.services.scripting.engine.ScriptingManager;

/**
 * 
 */
public class ScriptingEngineActivator implements BundleActivator {

	private static Logger logger = LoggerFactory
			.getLogger(ScriptingEngineActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		// register scripting engines.
		BSFManager.registerScriptingEngine(ScriptingManager.GROOVY_ENGINE,
				"org.codehaus.groovy.bsf.GroovyEngine",
				new String[] { "groovy" });
		// register Scripting Manager.

		ScriptingManager scriptingManager = new BSFScriptingManager();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, ScriptingManager.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "Scripting Manager");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger
				.debug("Registering service :"
						+ ScriptingManager.class.getName());

		context.registerService(ScriptingManager.class.getName(),
				scriptingManager, props);

		ServiceAliasManager.getInstance().registerServiceAlias(
				ScriptingManager.class.getSimpleName(),
				ScriptingManager.class.getName());

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		logger.debug("Stopping service :" + ScriptingManager.class.getName());
	}

}
