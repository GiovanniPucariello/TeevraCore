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
 * $Id: XMLParserActivator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 17, 2008 
 */

package com.headstrong.fusion.services.message.parser.xml;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.parser.xml.impl.XmlParserServiceImpl;

/**
 * XML parser service.
 * 
 */
public class XmlParserActivator implements BundleActivator {

	private static Logger logger = LoggerFactory
			.getLogger(XmlParserActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		XmlParserService xmlParser = new XmlParserServiceImpl();
		// Initialize the service.
		xmlParser.init();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, XmlParserService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "XML Parser");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :" + XmlParserService.class.getName());

		context.registerService(XmlParserService.class.getName(), xmlParser,
				props);

		ServiceAliasManager.getInstance().registerServiceAlias(
				XmlParserService.class.getSimpleName(),
				XmlParserService.class.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		logger.info("Stopping XML Parser");
	}

}
