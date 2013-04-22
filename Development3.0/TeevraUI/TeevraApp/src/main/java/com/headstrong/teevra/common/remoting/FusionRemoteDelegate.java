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
 * $Id: RemoteDelegate.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 24, 2009 
 * 
 * $Revision :1.0
 * $Feature : Redmine#611 [ProcessMonitoringConsole]
 * $DateTime: Feb 9 , 2011 
 */

package com.headstrong.teevra.common.remoting;

import java.util.HashMap;
import java.util.Map;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.config.ConfigurationReader;


/**
 * Remotely invokes Fusion server
 */
public class FusionRemoteDelegate {

	/**
	 * Invokes the given method on server
	 * 
	 * @precondition
	 * @postcondition
	 * @param method
	 * @param params
	 * @param signature
	 * @param server
	 * @param mbeanName
	 * @return
	 * @throws FusionRemotingException
	 */
	
	private static String JMX_USER = "jmxuser";
	
	private static String JMX_PASSWORD = "jmxpwd";
	
	private static Logger logger = LoggerFactory.getLogger(FusionRemoteDelegate.class);

	
	public Object invoke(String method, Object[] params, String[] signature,
			String server, ObjectName mbeanName) throws Exception {

		Object returnType = null;
		JMXConnector jmxc =null;
		// Call RMI connector client
		try {
		jmxc= this.getJMXConnection(server);
		MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();
		returnType = mbsc.invoke(mbeanName, method, params, signature);
		
		}// Let the caller handle the Exception 		
		finally
		{		try {
					jmxc.close();
				}
				catch(Exception e)
				{
					logger.error("Could not close JMXConnector"+e.getMessage());
				}							
		}	

		return returnType;
	}
	
	// new method added as a part of Refractoring for  Feature# 611 [ProcessMonitoringConsole] 
	public JMXConnector getJMXConnection(String server) throws Exception
	{
		JMXServiceURL url = new JMXServiceURL(server);
		
		//authentication
		Map<String, String[]> env = new HashMap<String, String[]>();
		String[] creds = {ConfigurationReader.getInstance().getConfigValue(JMX_USER), 
				ConfigurationReader.getInstance().getConfigValue(JMX_PASSWORD)};
		env.put(JMXConnector.CREDENTIALS, creds);

		//	JMX Connection
		JMXConnector jmxc = JMXConnectorFactory.connect(url, env);
		
		return jmxc;
		
	}
}
