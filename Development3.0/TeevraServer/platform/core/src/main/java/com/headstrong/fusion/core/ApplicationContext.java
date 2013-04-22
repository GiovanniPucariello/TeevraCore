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
 * $Id: ApplicationContext.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 4, 2008 
 */

package com.headstrong.fusion.core;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.MediationService;
import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.commons.resolver.exception.ServiceUnavailableException;
import com.headstrong.fusion.config.ProcessSchedule;
import com.headstrong.fusion.config.manager.ConfigurationManager;
import com.headstrong.fusion.config.manager.ProcessDefinitionManager;
import com.headstrong.fusion.config.manager.ProcessDefinitionParser;
import com.headstrong.fusion.core.recovery.RecoveryManager;
import com.headstrong.fusion.config.CacheReloadSchedule;
import com.headstrong.fusion.scheduler.CacheReloadScheduler;
import com.headstrong.fusion.scheduler.ProcessScheduler;
import com.headstrong.fusion.scheduler.QuartzScheduler;

/**
 * <code>ApplicationContext</code> serves as the entry point for Fusion
 * framework.
 * <p>
 * {@link ApplicationContext} exposes API for administration of Fusion
 * framework.
 * 
 */
public interface ApplicationContext {

	/**
	 * The method registers a process and returns the process Id to the calling
	 * method.
	 * 
	 * @param definition
	 * @return
	 */
	public void registerProcess(File definition, boolean toPersist)
			throws Exception;

	/**
	 * Method updates a process definition.
	 * 
	 * @param processId
	 * @param definition
	 */
	public void updateProcess(String processId, File definition)
			throws Exception;

	public BundleContext getBundleContext();

	/**
	 * @param bundleContext
	 *            the bundleContext to set
	 */
	public void setBundleContext(BundleContext bundleContext);

	/**
	 * Is invoked during the system shutdown. performs following operations.
	 * <p>
	 * <li>Stop all the running processes</li>
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void shutDown() throws Exception;

	/**
	 * Process is removed from the application context.
	 * 
	 * @param processId
	 * @throws Exception
	 */
	public void removeProcess(String processId) throws Exception;

	/**
	 * 
	 * @precondition {@link ServiceResolver} is set.
	 * @param type
	 *            service type
	 * @param timeToWait
	 *            Time that {@link ServiceResolver} waits for the service before
	 *            existing.
	 * @return Registered <code>service</code> instance for the given service
	 *         type.
	 * @throws ServiceUnavailableException
	 */
	public MediationService getMediationService(String type, long timeToWait)
			throws ServiceUnavailableException;

	/**
	 * Method registers a process using the process definition
	 * <code>byte array</code>.
	 * 
	 * @param file
	 *            process definition byte array for remote invocation.
	 * @return processId
	 * @throws Exception
	 */
	public void registerProcess(byte[] file) throws Exception;

	/**
	 * It searches for the processDefiniton for the given process id. if found
	 * first it stops the process and then updates the process definition. It
	 * also keeps a local copy the updated process definition.
	 * 
	 * @param processId
	 * @param file
	 */
	public void updateProcess(String processId, byte[] file) throws Exception;

	/**
	 * It searches for the process for the mentioned processId. If found stops
	 * the process. Else throws Exception.
	 * 
	 * @param processId
	 * @throws Exception
	 */
	public void stopProcess(String processId) throws Exception;

	/**
	 * It searches for the process for the mentioned processId. If found stops
	 * the process and throws an error. Else throws Exception.
	 * 
	 * @param processId
	 * @param errorMsg
	 * @throws Exception
	 */
	public void errorProcess(String processId, String errorMsg)
			throws Exception;

	/**
	 * It checks for the {@link ProcessContext} in the local processMap is found
	 * returns the {@link ProcessContext}. In case the {@link ProcessContext}
	 * is not found it throws an Exception.
	 * 
	 * @param processId
	 * @return {@link ProcessContext}
	 * @throws Exception
	 */
	public ProcessContext getProcessContext(String processId) throws Exception;

	/**
	 * Returns a list of all the registered processes.
	 * 
	 * @return List List of process ids.
	 * @throws Exception
	 */
	public List<String> getProcesses() throws Exception;

	/**
	 * Schedules a process.
	 * 
	 * @param processId
	 *            Process Identifier
	 * @param scheduleStartTime
	 *            Process start time. If not specified current time is taken as
	 *            process start time.
	 * @param scheduleEndTime
	 *            Process stop time.
	 * @param cron
	 *            cron information for the process run.
	 * @throws Exception
	 */
	public void scheduleProcess(String processId, Date scheduleStartTime,
			Date scheduleEndTime, Long processStopTime, String cronExpression)
			throws Exception;

	/**
	 * Registeres a process schedule.
	 * 
	 * @param schedule
	 * @throws Exception
	 */
	public void scheduleProcess(ProcessSchedule schedule) throws Exception;

	/**
	 * @return the processScheduler
	 */
	public QuartzScheduler getQuartzScheduler();

	/**
	 * @param processScheduler
	 *            the processScheduler to set
	 */
	public void setQuartzScheduler(QuartzScheduler processScheduler);

	public void startProcess(String processId) throws Exception;

	/**
	 * Registers a process using the process schema definition passes as string.
	 * 
	 * @precondition
	 * @postcondition
	 * @param processDefinition
	 * @return
	 * @throws Exception
	 */
	public void registerProcess(String processDefinition) throws Exception;

	/**
	 * @return the processDefinitionHandler
	 */
	public ProcessDefinitionParser getProcessDefinitionHandler();

	/**
	 * @param processDefinitionParser
	 *            the processDefinitionHandler to set
	 */
	public void setProcessDefinitionHandler(
			ProcessDefinitionParser processDefinitionParser);

	/**
	 * @return the fusionConfigurationManager
	 */
	public ConfigurationManager getConfigurationManager();

	/**
	 * @param configurationManager
	 *            the fusionConfigurationManager to set
	 */
	public void setConfigurationManager(
			ConfigurationManager configurationManager);

	/**
	 * Installs a new OSGi Bundle.
	 * 
	 * @param bundle
	 *            Bundle jar's byte array.
	 * @param bundleName
	 *            Bundle name would be used to copy the jar file.
	 * @throws Exception
	 */
	public void installBundle(byte[] bundle, String bundleName)
			throws Exception;

	public Map<String, ProcessContext> getProcessMap();

	public BootstrapManager getBootstrapManager();

	/**
	 * It bootstraps the Fusion.
	 * 
	 * @throws Exception
	 */
	public void bootStrap() throws Exception;

	public ProcessDefinitionManager getProcessDefinitionManager();

	/**
	 * @param processDefinitionManager
	 *            the processDefinitionManager to set
	 */
	public void setProcessDefinitionManager(
			ProcessDefinitionManager processDefinitionManager);

	/**
	 * 
	 * @param name
	 *            Property name
	 * @return property value.
	 */
	public String getProperty(String name);

	/**
	 * @return RecoveryManager.
	 */
	public RecoveryManager getRecoveryManager();

	/**
	 * @param recoveryManager
	 */
	public void setRecoveryManager(RecoveryManager recoveryManager);

	/**
	 * Schedules cache reloading.
	 * 
	 * @precondition
	 * @postcondition
	 * @param cacheName
	 * @param scheduleStartDate
	 * @param scheduleEndDate
	 * @param cronExpression
	 * @throws Exception
	 */
	public void scheduleCacheReload(String cacheName, Date scheduleStartDate,
			Date scheduleEndDate, String cronExpression) throws Exception;

	/**
	 * Schedules cache reloading.
	 * 
	 * @precondition
	 * @postcondition
	 * @param schedule
	 * @throws Exception
	 */
	public void scheduleCacheReload(CacheReloadSchedule schedule)
			throws Exception;

}
