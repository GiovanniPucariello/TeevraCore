/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: RemoteProcessAdminDelegate.java
 * $Author: akrishnamoorthy
 * $DateTime: Sep 16, 2008 
 * 
 * $Revision :1.0
 * $Feature : Redmine#611 [ProcessMonitoringConsole]
 * $DateTime: Feb 9, 2011 
 */

package com.headstrong.teevra.services.processadmin.remoting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.management.MBeanServerConnection;
import javax.management.ObjectName;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.config.ConfigurationReader;
import com.headstrong.teevra.common.remoting.FusionRemoteDelegate;
import com.headstrong.teevra.services.processadmin.eo.ProcessScheduleEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;
import com.headstrong.teevra.services.processadmin.exception.ProcessPublishException;
import com.headstrong.teevra.services.processadmin.exception.ProcessRemoveException;
import com.headstrong.teevra.services.processadmin.exception.ProcessStartException;
import com.headstrong.teevra.services.processadmin.exception.ProcessStopException;
import com.headstrong.teevra.services.processadmin.vo.ComponentDetailsVO;
import com.headstrong.teevra.services.refdata.exception.RefDataServiceException;
import com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO;


/**
 * Interacts with fusion runtime using JMX API to realize process admin
 * operations
 */
public class RemoteProcessAdminDelegate extends FusionRemoteDelegate {

	/**
	 * Logger for RemoteProcessAdminDelegate
	 */
	private static Logger logger = LoggerFactory
			.getLogger(RemoteProcessAdminDelegate.class);

	private static final String DOMAIN = "fusion";
	private static final String BEAN_TYPE = "ApplicationContext";
	private static final String BEAN_NAME = "Application Context";
	
	private static final String CACHE_BEAN_TYPE = "CacheContext";
	private static final String CACHE_BEAN_NAME = "Cache Context";
	

	// private static final String KEY_JMX_URL = "jmxUrl";
	private static final String KEY_DOMAIN = "domain";
	private static final String KEY_BEAN_TYPE = "beanType";
	private static final String KEY_BEAN_NAME = "beanName";
	private static final String CAMEL_DOMAIN = "cameldomain";
	private static final String ROUTE_KEY = "routekey";
	private static final String CONTEXT = "context";
	
	// Constants to filter MBean
	private static final String ERROR = "ERROR";
	private static final String ERRREP = "ERRREP";
	private static final String RECEIVED = "RECEIVED";
	
	private static final String SEPERATOR = ".";
	

	private static RemoteProcessAdminDelegate instance = new RemoteProcessAdminDelegate();

	private RemoteProcessAdminDelegate() {
	}

	public static RemoteProcessAdminDelegate getInstance() {
		return instance;
	}

	/**
	 * Register process through JMX
	 * 
	 * @precondition
	 * @postcondition
	 * @param xml
	 * @param serverToAssign
	 *            Server to which the process will be assigned
	 * @throws ProcessPublishException
	 */
	public void publishProcess(String xml, String server)
			throws ProcessPublishException {
		Object[] params = new String[1];
		params[0] = xml;
		String[] signature = new String[1];
		signature[0] = String.class.getName();

		try {
			invoke("registerProcess", params, signature, server);
		} catch (ProcessAdminServiceException e) {
			logger.error("Exception while publishing the process ", e);
			throw new ProcessPublishException(e.getMessage());

		}
	}

	/**
	 * Starts process through JMX
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @param server
	 * @throws ProcessStartException
	 */
	public void startProcess(Long processId, String server)
			throws ProcessStartException {
		Object[] params = new String[1];
		params[0] = processId.toString();

		String[] signature = new String[1];
		signature[0] = String.class.getName();

		try {
			invoke("startProcess", params, signature, server);
		} catch (ProcessAdminServiceException e) {
			logger.error("Exception while starting the process ", e);
			throw new ProcessStartException(e.getMessage());
		}
	}

	/**
	 * Stops process through JMX
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @param server
	 * @throws ProcessStopException
	 */
	public void stopProcess(Long processId, String server)
			throws ProcessStopException {
		Object[] params = new String[1];
		params[0] = processId.toString();

		String[] signature = new String[1];
		signature[0] = String.class.getName();

		try {
			invoke("stopProcess", params, signature, server);
		} catch (ProcessAdminServiceException e) {
			logger.error("Exception while stopping the process ", e);
			throw new ProcessStopException(e.getMessage());
		}
	}

	/**
	 * JMX client to get process monitoring details
	 * 
	 * @param processId
	 * @param processName
	 * @param jmx_url
	 * @throws ProcessAdminServiceException 
	 */
	
	/* Method added as part of  Feature#611 [ProcessMonitoringConsole] */
	public List<ComponentDetailsVO> getProcessDetails(Long processId,
			String processName, String jmx_url)
			throws ProcessAdminServiceException {
	
		String enpoint_uri;
		
		/* Return this list */
		List<ComponentDetailsVO> componentList = new ArrayList<ComponentDetailsVO>();
		ComponentDetailsVO component = null;

		/* Get required properties for JMX  */
		ConfigurationReader config = ConfigurationReader.getInstance();		
		
		JMXConnector jmxc=null;		

		try {
			// Query ObjectName
			ObjectName queryName=new ObjectName(config.getConfigValue(CAMEL_DOMAIN)+":"
					+config.getConfigValue(CONTEXT)+"=*"+processName+","+config.getConfigValue(ROUTE_KEY)+",name=*");
			
			jmxc= super.getJMXConnection(jmx_url);
			MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();

			// Query MBean server to retrieve Set of all registered Camel Mbean ObjectNames 
			// for which type = route and Process name contained in context  
			Set<ObjectName> names = new TreeSet<ObjectName>(mbsc.queryNames(queryName, null));
			for (ObjectName name : names) {
		
				enpoint_uri=mbsc.getAttribute(name, ComponentDetailsVO.ENDPOINT_URI) .toString().toUpperCase();
				
				if (!( enpoint_uri.contains(RemoteProcessAdminDelegate.ERROR)
							|| enpoint_uri.contains(RemoteProcessAdminDelegate.ERRREP) 
							|| enpoint_uri.contains(RemoteProcessAdminDelegate.RECEIVED) )
							// Logic to filter SEDA queues, Error queues etc..
					 )				
				{
					component = new ComponentDetailsVO();
					component.setName(mbsc.getAttribute(name, ComponentDetailsVO.ENDPOINT_URI)
							.toString().replaceAll(processId+RemoteProcessAdminDelegate.SEPERATOR, ""));
					component.setFirstMsgTime((Date) mbsc.getAttribute(name,
							ComponentDetailsVO.FIRST_MSG_TIME));
					component.setLastMsgTime((Date) mbsc.getAttribute(name,
							ComponentDetailsVO.LAST_MSG_TIME));
					component.setMeanProcessingRate((Long) mbsc.getAttribute(
							name, ComponentDetailsVO.MEAN_PROCESSING_TIME));
					
					componentList.add(component);
				}
			}			
			logger.info(componentList.toString());			
		} catch (Exception e) {
			logger.error("Exception while retrieving the process details from the server ",e);
			if (e.getMessage() == null)				
				throw new ProcessAdminServiceException(e.toString());	
			else				
				throw new ProcessAdminServiceException(e.getMessage());
		}
		finally
		{
			try {
				jmxc.close();
			}
			catch(Exception e)
			{
				logger.error("Could not close JMXConnector");
			}
		}
		return componentList;
	}

	/**
	 * Removes the process from JMX
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @param server
	 * @throws ProcessStopException
	 */
	public void removeProcess(Long processId, String server)
			throws ProcessRemoveException {
		Object[] params = new String[1];
		params[0] = processId.toString();

		String[] signature = new String[1];
		signature[0] = String.class.getName();

		try {
			invoke("removeProcess", params, signature, server);
		} catch (ProcessAdminServiceException e) {
			logger.error(
					"Exception while removing the process from the server ", e);
			throw new ProcessRemoveException(e.getMessage());
		}
	}
	
	public void reloadCache(String cacheName,String server) throws RefDataServiceException
	{
		Object[] params = new String[1];
		params[0] = cacheName;

		String[] signature = new String[1];
		signature[0] = String.class.getName();		
		ObjectName mbeanName = null;
		try {
			mbeanName = ObjectName.getInstance(DOMAIN + ":type=" + CACHE_BEAN_TYPE
					+ ",index=" + CACHE_BEAN_NAME);
			super.invoke("reloadCache", params, signature, server, mbeanName);
		} catch (Exception e) {
			logger.error("Exception while invoking remote method", e);
			throw new RefDataServiceException(e.getMessage());

		}
		
	}

	/**
	 * creates mbean name before invoking super class
	 * 
	 * @precondition
	 * @postcondition
	 * @param method
	 * @param params
	 * @param signature
	 * @param jmxUrl
	 * @throws ProcessAdminServiceException
	 */
	private void invoke(String method, Object[] params, String[] signature,
			String jmxUrl) throws ProcessAdminServiceException {
		ConfigurationReader config = ConfigurationReader.getInstance();
		String domain = config.getConfigValue(KEY_DOMAIN);
		String beanType = config.getConfigValue(KEY_BEAN_TYPE);
		String beanName = config.getConfigValue(KEY_BEAN_NAME);

		// set default values if not present
		// jmxUrl = (jmxUrl != null) ? jmxUrl : JMX_URL;
		domain = (domain != null) ? domain : DOMAIN;
		beanType = (beanType != null) ? beanType : BEAN_TYPE;
		beanName = (beanName != null) ? beanName : BEAN_NAME;

		ObjectName mbeanName = null;
		try {
			mbeanName = ObjectName.getInstance(domain + ":type=" + beanType
					+ ",index=" + beanName);
			super.invoke(method, params, signature, jmxUrl, mbeanName);
		} catch (Exception e) {
			logger.error("Exception while invoking remote method", e);
			throw new ProcessAdminServiceException(e.getMessage());

		}
	}

	/**
	 * Starts process through JMX
	 * 
	 * @precondition
	 * @postcondition
	 * @param procesSchedule
	 * @param server
	 * @throws ProcessStartException
	 */
	public void scheduleProcess(ProcessScheduleEO procesSchedule, String server)
			throws ProcessStartException {

		String[] signature = new String[5];
		signature[0] = String.class.getName();
		signature[1] = Date.class.getName();
		signature[2] = Date.class.getName();
		signature[3] = Long.class.getName();
		signature[4] = String.class.getName();

		Object[] params = new Object[5];
		params[0] = procesSchedule.getPrcsId().toString();
		params[1] = procesSchedule.getRecurrence().getRecurrenceRange()
				.getStartDate();
		params[2] = procesSchedule.getRecurrence().getRecurrenceRange()
				.getEndDate();
		params[3] = procesSchedule.getRecurrence().getExecutionTime()
				.getEndTime();
		params[4] = procesSchedule.getRecurrence().getCronExpression();

		try {
			invoke("scheduleProcess", params, signature, server);
		} catch (ProcessAdminServiceException e) {
			logger.error("Exception while scheduling the process ", e);
			throw new ProcessStartException(e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		RemoteProcessAdminDelegate client = new RemoteProcessAdminDelegate();
		Object[] params = new Object[1];
		params[0] = "sample";

		String[] signature = new String[1];
		signature[0] = byte[].class.getName();

		client.invoke("reloadCache", params, signature, "service:jmx:rmi:///jndi/rmi://10.200.41.52:8004/jmxrmi");
		
	}

	public byte[] createByteArray() throws Exception {
		File file = new File("7.xml");

		InputStream stream = new FileInputStream(file);

		byte[] bytes = new byte[(int) file.length()];

		// Read in the bytes
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length
				&& (numRead = stream.read(bytes, offset, bytes.length - offset)) >= 0) {
			offset += numRead;
		}
		// Ensure all the bytes have been read in
		if (offset < bytes.length) {
			logger.error("Could not completely read file: " + file.getName());
			throw new IOException("Could not completely read file "
					+ file.getName());
		}
		stream.close();
		return bytes;
	}

}
