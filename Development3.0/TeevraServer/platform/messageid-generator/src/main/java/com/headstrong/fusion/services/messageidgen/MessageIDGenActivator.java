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
 * $Id: MessageIDGenActivator.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Sep 23, 2008 
 */

package com.headstrong.fusion.services.messageidgen;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.MessageIDGenerator;
import com.headstrong.fusion.services.messageidgen.impl.MessageIdGenImpl;


/**
 * The <code>MessageIDGenActivator</code> class is the <code>BundleActivator</code>
 * for the generating messageid for the messages processed by fusion.  
 * It registers the bean <code>MessageIDGen</code>. 
 */

public class MessageIDGenActivator implements BundleActivator {

	private static Logger logger= LoggerFactory.getLogger(MessageIDGenActivator.class);
	
	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		MessageIDGenerator messageIdGen= new MessageIdGenImpl(context);
		
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(Constants.SERVICE_PID, MessageIDGenerator.class.getName());
		props.put(Constants.SERVICE_DESCRIPTION,"Fusion Messageid generation");
		props.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.debug("Registering service :" + MessageIDGenerator.class.getName());
	
		context.registerService(MessageIDGenerator.class.getName(), messageIdGen, props);

	}

	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {}

}
