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
 * $Id: XmlFormatterServiceActivator.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 13, 2008 
 */

package com.headstrong.fusion.services.message.formatter.xml;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.formatter.xml.impl.XmlFormatterServiceImpl;

/**
 * 
 */
public class XmlFormatterServiceActivator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		XmlFormatterService xmlParserService = new XmlFormatterServiceImpl();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, XmlFormatterService.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION, "XML Formatter");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");

		context.registerService(XmlFormatterService.class.getName(),
				xmlParserService, props);

		ServiceAliasManager.getInstance().registerServiceAlias(
				XmlFormatterService.class.getSimpleName(),
				XmlFormatterService.class.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub

	}

}
