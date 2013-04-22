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
 * $Id: DefaultApplicationContext.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 4, 2008 
 */

package com.headstrong.fusion.core;

import static com.headstrong.fusion.core.ApplicationContextHelper.persistDefinitionToTemp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.MediationService;
import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.commons.exception.ConfigurationException;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.commons.resolver.ServiceResolverImpl;
import com.headstrong.fusion.commons.resolver.exception.ServiceUnavailableException;
import com.headstrong.fusion.config.ProcessConfiguration;
import com.headstrong.fusion.config.ProcessConfigurationModel;
import com.headstrong.fusion.config.ProcessSchedule;
import com.headstrong.fusion.config.manager.ConfigurationManager;
import com.headstrong.fusion.config.manager.ProcessDefinitionManager;
import com.headstrong.fusion.config.manager.ProcessDefinitionParser;
import com.headstrong.fusion.core.recovery.RecoveryManager;
import com.headstrong.fusion.messaging.model.process.CamelProcessModeler;
import com.headstrong.fusion.messaging.model.process.ProcessModeler;
import com.headstrong.fusion.config.CacheReloadSchedule;
import com.headstrong.fusion.config.CacheReloadScheduleConfiguration;
import com.headstrong.fusion.scheduler.QuartzScheduler;

/**
 * Default implementation of {@link ApplicationContext} interface.
 */
public class DefaultApplicationContext implements ApplicationContext {

	private static Logger logger = LoggerFactory
			.getLogger(DefaultApplicationContext.class);

	/**
	 * Apache Felix {@link BundleContext}
	 */
	private BundleContext bundleContext;

	/**
	 * {@link ServiceResolverImpl}
	 */
	private ServiceResolver<MediationService> mediationServiceResolver;

	/**
	 * Any process that is registered and resolved is kept in the process map
	 * with process Id as the key. On removal of the process from the context
	 * the data is removed from the map.
	 * 
	 */
	private volatile Map<String, ProcessContext> processMap = new Hashtable<String, ProcessContext>();

	/**
	 * Quartz Scheduler .
	 */
	private QuartzScheduler processScheduler;

	/**
	 * Process Definition Parser.
	 */
	private ProcessDefinitionParser processDefinitionParser;

	/**
	 * Reads/Commits Fusion Configuration.
	 */
	private ConfigurationManager configurationManager;

	private RecoveryManager recoveryManager;

	private static DefaultApplicationContext singletonInstance ;
	
	/**
	 * Default constructor.
	 * 
	 */
	private DefaultApplicationContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	public static DefaultApplicationContext getInstance(BundleContext bundleContext)
	{
		if(singletonInstance == null && bundleContext != null)
		{
			singletonInstance = new DefaultApplicationContext(bundleContext);
		}
		return singletonInstance;
	}
	/**
	 * Bootstrap manager that bootstrap the Fusion.
	 */
	private BootstrapManager bootstrapManager;

	/**
	 * persists/deletes the process definition files.
	 */
	private ProcessDefinitionManager processDefinitionManager;

	/**
	 * PROCESS REGISTRATION / UPDATE / REMOVE ..START..
	 */
	// **********************************************************************************//
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#registerProcess(byte[],
	 *      java.lang.String)
	 */

	public  synchronized ProcessContext registerProcess(ProcessConfigurationModel model)
			throws Exception {
		boolean run = false;
		ProcessContext processContext = null;
		// TC: Verify if the process is already registered.
		if (this.getProcessMap().containsKey(model.getProcess().getId())) {
			// stop the current process.
			processContext = this.getProcessMap().get(
					model.getProcess().getId());
			if (processContext.isRunning()) {
				processContext.stop();
				run = true;
			}
			// New process would be registered.
		}
		// 2: Create the process using the ProcessConfigurationModel and
		// register the same
		// with the ApplicationContext.
		try {
			// Default ProcessModeler is CamelProcessModeler
			ProcessModeler processModeler = new CamelProcessModeler();
			processContext = processModeler.createProcess(this, model);
			// Put the processContext in the processMap with the
			// ApplicationContext
			this.getProcessMap()
					.put(model.getProcess().getId(), processContext);
			if (run) {
				processContext.start();
			}
		} catch (InitializationException e) {
			logger.error("Error initializing the components", e);
			throw e;
		} catch (ProcessModellingException e) {
			logger.error("Error modelling the process", e);
			throw e;
		}
		return processContext;
	}

	/**
	 * Create a temporary file in the ${fusion.process.temp.dir} directory. file
	 * name would be Fusion_${System.currentTimeMillis()}. This file is further
	 * used to create the process configuration.
	 * <p>
	 * Once the process is successfully registered temporary file is deleted
	 * from ${fusion.process.temp.dir} directory.
	 * <p>
	 * This method would be accessed remotely using JMX client.
	 * 
	 * @throws Exception
	 *             All exceptions are caught and wrapped in a new Exception with
	 *             the messages.
	 * 
	 * 
	 */
	public void registerProcess(byte[] file) throws Exception {
		File tempProcessFile = null;
		try {
			String processTemp = this.getBundleContext().getProperty(
					Properties.PROCESS_TEMP);
			tempProcessFile = persistDefinitionToTemp(file, processTemp);
			// 2: Register the process
			this.registerProcess(tempProcessFile, true);
			// 3: Remove the temporary file
		} catch (Exception ex) {
			// Log the exception before throwing.
			logger.error("Error while registering the process", ex);
			throw ex;
		} finally {
			if (tempProcessFile != null && tempProcessFile.exists()) {
				tempProcessFile.delete();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#registerProcess(java.io.File)
	 */
	/**
	 * Generates {@link ProcessConfigurationModel} using the process definition
	 * file. In case of duplicate process definition throws Exception.
	 * 
	 */
	public void registerProcess(File definition, boolean toPersist)
			throws Exception {
		// // parse only files with extension xml
		// if (!definition.getPath().endsWith(".xml")) {
		// logger.info("Process definition file " + definition.getName()
		// + " doesn't end with .xml");
		// return;
		// }
		// 1: parse the process definition and create ProcessConfigurationModel
		ProcessConfigurationModel model = null;
		ProcessConfiguration processConfiguration = null;
		try {
			model = this.getProcessDefinitionHandler().parseProcessDefinition(
					definition);
			processConfiguration = this.getConfigurationManager()
					.getProcessConfiguration(model.getProcess().getId());
			if (processConfiguration == null) {
				processConfiguration = new ProcessConfiguration();
				processConfiguration.setId(model.getProcess().getId());
				this.getConfigurationManager().getConfiguration().addProcess(
						processConfiguration);
			}
			try {
				// Persist the configuration .
				this.getConfigurationManager().persist();
			} catch (ConfigurationException e) {
				logger.error(
						"Error persisting the process configuration for process "
								+ model.getProcess().getId() + " , "
								+ model.getProcess().getName() + ".", e);
				throw new Exception(
						"Error persisting the process configuration for process "
								+ model.getProcess().getId() + " , "
								+ model.getProcess().getName() + ".", e);
			}
		} catch (ConfigurationException e) {
			logger.error("Error generating the process configuration from "
					+ definition.getName(), e);
			throw e;
		}
		try {
			this.registerProcess(model);
		} catch (Exception ex) {
			logger.error("Error registering the process.", ex);
			// remove the configuration.
			this.getConfigurationManager().getConfiguration().getProcesses()
					.remove(processConfiguration);
			this.getConfigurationManager().persist();
			throw ex;
		}

		String processId = model.getProcess().getId();
		// copy the process file to process home directory.
		if (toPersist) {
			// TC: On startup process definitions will be picked up from the
			// conf/process directory itself so no need to persist these file.
			// TC: In case of remote call registerProcess(byte[] file) file
			// would always be persisted.
			try {
				InputStream stream = new FileInputStream(definition);
				byte[] bytes = new byte[(int) definition.length()];
				stream.read(bytes);
				this.getProcessDefinitionManager().write(processId, bytes);
				stream.close();
			} catch (Exception e) {
				logger
						.error(
								"Error copying the process definition to the process directory",
								e);
				throw e;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#updateProcess(java.lang.String,
	 *      java.io.File)
	 */
	public void updateProcess(String processId, File definition)
			throws Exception {
		ProcessContext processContext = this.getProcessMap().get(processId);
		// 1: stop the process
		try {
			if (processContext.isRunning()) {
				processContext.stop();
			}
		} catch (Exception e) {
			logger.error("Error stopping the existing process", e);
			throw e;
		}
		// 4: register new process
		try {
			this.registerProcess(definition, true);
		} catch (Exception e) {
			logger.error("Error registering new process definition", e);
			throw e;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#updateProcess(java.lang.String,
	 *      byte[])
	 */
	public void updateProcess(String processId, byte[] file) throws Exception {
		// 1: Persist the byte array to process temp directory.
		File tempProcessFile;
		try {
			String processHome = this.getBundleContext().getProperty(
					Properties.PROCESS_TEMP);
			tempProcessFile = persistDefinitionToTemp(file, processHome);
		} catch (Exception e) {
			logger.error("Error persing the process definition", e);
			throw e;
		}
		// 2: update the process.
		try {
			this.updateProcess(processId, tempProcessFile);
		} catch (Exception e) {
			logger.error("Error updating the process", e);
			throw e;
		} finally {
			// 3: Remove the temporary file
			tempProcessFile.delete();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#removeProcess(java.lang.String)
	 */
	public void removeProcess(String processId) throws Exception {
		ProcessContext processContext = this.getProcessMap().get(processId);
		// TC : verify if the process is registered with the system.
		if (processContext == null) {
			logger.error("Error while removing the process. "
					+ "No process found for the specified processId = "
					+ processId);
			throw new Exception(
					"No process found for the specified processId = "
							+ processId);
		}
		// 1: stop the process
		if (processContext.isRunning()) {
			processContext.stop();
		}
		ProcessConfiguration processConfiguration = this
				.getConfigurationManager().getProcessConfiguration(processId);
		this.getConfigurationManager().getConfiguration().getProcesses()
				.remove(processConfiguration);
		try {
			this.getConfigurationManager().persist();
		} catch (ConfigurationException e) {
			logger.error(
					"Error removing the process configuration for process "
							+ processId + ".", e);
			throw new Exception(
					"Error removing the process configuration for process "
							+ processId + ".", e);
		}
		// 2: Remove the process from the map
		this.getProcessMap().remove(processId);
		try {
			this.getProcessDefinitionManager().delete(processId);
		} catch (Exception e) {
			logger
					.error(
							"Error copying the process definition to the process directory",
							e);
			throw e;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#registerProcess(java.lang.String)
	 */
	public void registerProcess(String processDefinition) throws Exception {
		File tempProcessFile = null;
		try {
			String processTemp = this.getBundleContext().getProperty(
					Properties.PROCESS_TEMP);
			tempProcessFile = persistDefinitionToTemp(processDefinition,
					processTemp);
			// 2: Register the process
			this.registerProcess(tempProcessFile, true);
		} catch (Exception ex) {
			// Log the exception before throwing.
			logger.error("Error while registering the process", ex);
			throw ex;
		} finally {
			// 3: Remove the temporary file
			if (tempProcessFile != null && tempProcessFile.exists()) {
				tempProcessFile.delete();
			}
		}
	}

	// **********************************************************************************//

	/**
	 * 
	 * PROCESS ADMINISTRATION - START/ STOP
	 */
	// **********************************************************************************//
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#startProcess(java.lang.String)
	 */
	public synchronized void startProcess(String processId) throws Exception {
		ProcessConfiguration processConfiguration = this
				.getConfigurationManager().getProcessConfiguration(processId);
		// Retrieve the process context
		ProcessContext processContext = this.getProcessMap().get(processId);
		if (processContext == null) {
			throw new Exception("Invalid process id specified.");
		}
		// modified by akrishnamooorthy 23-Jun-2009 as ftpconsumer is not thread
		// safe
		
		processContext = registerProcess(processContext
				.getProcessConfigurationModel());
		
		if (!processContext.isRunning()) {
		
			if (processConfiguration != null) {
			processConfiguration.setRunning(true);
		}
		this.getConfigurationManager().persist();

		
			try {
				processContext.start();
			} catch (Exception e) {
				logger.error("Error while starting the process ", e);
				processConfiguration.setRunning(false);
				this.getConfigurationManager().persist();
				throw e;
			}
		} else {
			throw new Exception("Process already started.");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#stopProcess(java.lang.String)
	 */
	public synchronized void stopProcess(String processId) throws Exception {
		ProcessConfiguration processConfiguration = this
				.getConfigurationManager().getProcessConfiguration(processId);
		if (processConfiguration != null) {
			processConfiguration.setRunning(false);
		}
		this.getConfigurationManager().persist();

		// Retrieve the process context
		ProcessContext processContext = this.getProcessMap().get(processId);
		if (processContext == null) {
			throw new Exception("Invalid process id specified.");
		}
		if (processContext.isRunning()) {
			try {
				processContext.stop();
			} catch (Exception e) {
				logger.error("Error while stopping the process.", e);
				processConfiguration.setRunning(true);
				this.getConfigurationManager().persist();

				throw e;
			}
		} else {
			throw new Exception("Process already stopped.");
		}
	}

	// **********************************************************************************//

	/**
	 * PROCESS SCHEDULING . SCHEDULE / UPDATE SCHEDULE
	 */
	// **********************************************************************************//
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#scheduleProcess(com.headstrong.fusion.config.ProcessSchedule)
	 */
	public void scheduleProcess(ProcessSchedule processSchedule)
			throws Exception {
		// verify if the process scheduler is set and active
		if (this.getQuartzScheduler() == null
				|| !this.getQuartzScheduler().isActive()) {
			throw new Exception("Process scheduler is inactive");
		}

		// verify the process is registered
		if (this.getProcessMap().get(processSchedule.getProcessId()) == null) {
			Exception ex = new Exception("Process "
					+ processSchedule.getProcessId()
					+ " not registered with the system yet");
			logger.error("Error scheduling the process", ex);
			throw ex;
		}
		try {
			this.getQuartzScheduler().scheduleProcess(
					this.getProcessMap().get(processSchedule.getProcessId()),
					processSchedule);
		} catch (Exception e) {
			logger.error("Error while scheduling the process");
			throw e;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#scheduleProcess(java.lang.String,
	 *      java.util.Date, java.util.Date, java.util.Date)
	 */
	public void scheduleProcess(String processId, Date scheduleStartTime,
			Date scheduleEndTime, Long processStopTime, String cronExpression)
			throws Exception {

		if (this.getQuartzScheduler() == null
				|| !this.getQuartzScheduler().isActive()) {
			throw new Exception("Process scheduler is inactive");
		}
		// 1: verify if the process is not already scheduled.
		// currently multiple schedules of the process not allowed.

		// Generate the process schedule information.
		ProcessSchedule processSchedule = new ProcessSchedule();
		processSchedule.setProcessId(processId);
		processSchedule.setScheduleStartTime(scheduleStartTime);
		processSchedule.setScheduleStopTime(scheduleEndTime);
		processSchedule.setProcessStopTime(processStopTime);
		processSchedule.setCronExpression(cronExpression);

		ProcessConfiguration processConfiguration = this
				.getConfigurationManager().getProcessConfiguration(processId);
		if (processConfiguration != null) {
			processConfiguration.setSchedule(processSchedule);
			try {
				this.getConfigurationManager().persist();
			} catch (ConfigurationException e) {
				logger.error(
						"Error persisting the schedule, This would again need to "
								+ "persisted with the framework.", e);
				throw new Exception("Error persisting the schedule.");
			}

			try {
				this.scheduleProcess(processSchedule);
			} catch (Exception e) {
				// REMOVE AND MARSHAL the CONFIGURATION
				this.getConfigurationManager().getProcessConfiguration(
						processId).setSchedule(null);
				this.getConfigurationManager().persist();
				// --
				logger.error("Error scheduling the Process.", e);
				throw e;
			}
		} else {
			throw new Exception("Process configuration not found.");
		}

	}

	// ********************************************************************************//

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#getMediationService(java.lang.String,
	 *      long)
	 */
	public MediationService getMediationService(String type, long timeToWait)
			throws ServiceUnavailableException {
		MediationService mediationService = this.mediationServiceResolver
				.getService(type, timeToWait);
		if (mediationService == null) {
			throw new ServiceUnavailableException(
					"Unable to resolve the service");
		}
		return mediationService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#getProcessContext(java.lang.String)
	 */
	public ProcessContext getProcessContext(String processId) throws Exception {
		if (processId == null) {
			throw new Exception("Null process Id specified");
		}
		ProcessContext processContext = this.getProcessMap().get(processId);
		if (processContext == null) {
			throw new Exception("Invalid Process Id" + processId);
		}
		return processContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#installBundle(byte[],
	 *      java.lang.String)
	 */
	public void installBundle(byte[] bundle, String bundleName)
			throws Exception {

		String bundleDirectoryPath = this.getBundleContext().getProperty(
				Properties.BUNDLES_DIR);
		File bundleDirectory = new File(bundleDirectoryPath);
		if (!bundleDirectory.exists()) {
			boolean success = bundleDirectory.mkdirs();
			if (!success) {
				throw new InitializationException(
						"Unable to create Bundle directory.");
			}
		}

		String bundlePath = bundleDirectoryPath + "/" + bundleName + ".jar";
		FileOutputStream out = new FileOutputStream(bundlePath);
		try {
			out.write(bundle);
		} finally {
			out.close();
		}

		// install the bundle.
		Bundle newBundle = this.getBundleContext().installBundle(bundlePath,
				new FileInputStream(new File(bundlePath)));
		newBundle.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#getProcesses()
	 */
	public List<String> getProcesses() throws Exception {
		return new ArrayList<String>(this.getProcessMap().keySet());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#getBundleContext()
	 */
	public BundleContext getBundleContext() {
		return bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#setBundleContext(org.osgi.framework.BundleContext)
	 */
	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#getProcessScheduler()
	 */
	public QuartzScheduler getQuartzScheduler() {
		return processScheduler;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#setProcessScheduler(com.headstrong.fusion.scheduler.ProcessScheduler)
	 */
	public void setQuartzScheduler(QuartzScheduler processScheduler) {
		this.processScheduler = processScheduler;
	}

	/**
	 * @return the mediationServiceResolver
	 */
	public ServiceResolver<MediationService> getMediationServiceResolver() {
		return mediationServiceResolver;
	}

	/**
	 * @param mediationServiceResolver
	 *            the mediationServiceResolver to set
	 */
	public void setMediationServiceResolver(
			ServiceResolver<MediationService> mediationServiceResolver) {
		this.mediationServiceResolver = mediationServiceResolver;
	}

	/**
	 * @return the processMap
	 */
	public Map<String, ProcessContext> getProcessMap() {
		return processMap;
	}

	/**
	 * @param processMap
	 *            the processMap to set
	 */
	public void setProcessMap(Map<String, ProcessContext> processMap) {
		this.processMap = processMap;
	}

	/**
	 * @return the processDefinitionParser
	 */
	public ProcessDefinitionParser getProcessDefinitionHandler() {
		return processDefinitionParser;
	}

	/**
	 * @param processDefinitionParser
	 *            the processDefinitionParser to set
	 */
	public void setProcessDefinitionHandler(
			ProcessDefinitionParser processDefinitionParser) {
		this.processDefinitionParser = processDefinitionParser;
	}

	/**
	 * @return the configurationManager
	 */
	public ConfigurationManager getConfigurationManager() {
		return configurationManager;
	}

	/**
	 * @param configurationManager
	 *            the configurationManager to set
	 */
	public void setConfigurationManager(
			ConfigurationManager configurationManager) {
		this.configurationManager = configurationManager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#bootStrap()
	 */
	public void bootStrap() throws Exception {
		this.getBootstrapManager().bootstrap();
	}

	/**
	 * @return the bootStrapManager
	 */
	public BootstrapManager getBootstrapManager() {
		return bootstrapManager;
	}

	/**
	 * @param bootstrapManager
	 *            the bootStrapManager to set
	 */
	public void setBootstrapManager(BootstrapManager bootstrapManager) {
		this.bootstrapManager = bootstrapManager;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#shutDown()
	 */
	public void shutDown() throws Exception {
		this.getBootstrapManager().pause();
		// persist the fusion configuration
		// TODO Commented as the application configuration should
		// remain as it was before shutdown was called.
		// so that next start would bring the application to the
		// state where the last run has left it.
		// this.getConfigurationManager().persist();
		logger.debug("Fusion core shutting down.");
	}

	/**
	 * @return the processDefinitionManager
	 */
	public ProcessDefinitionManager getProcessDefinitionManager() {
		return processDefinitionManager;
	}

	/**
	 * @param processDefinitionManager
	 *            the processDefinitionManager to set
	 */
	public void setProcessDefinitionManager(
			ProcessDefinitionManager processDefinitionManager) {
		this.processDefinitionManager = processDefinitionManager;
	}

	@Override
	public void errorProcess(String processId, String errorMsg)
			throws Exception {
		ProcessConfiguration processConfiguration = this
				.getConfigurationManager().getProcessConfiguration(processId);
		if (processConfiguration != null) {
			processConfiguration.setRunning(false);
		}
		this.getConfigurationManager().persist();

		// Retrieve the process context
		ProcessContext processContext = this.getProcessMap().get(processId);
		if (processContext == null) {
			throw new Exception("Invalid process id specified.");
		}
		if (processContext.isRunning()) {
			try {
				processContext.error(errorMsg);
			} catch (Exception e) {
				logger.error("Error while logging error for the process.", e);
				processConfiguration.setRunning(true);
				this.getConfigurationManager().persist();

				throw e;
			}
		} else {
			throw new Exception("Process already stopped.");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ApplicationContext#getProperty(java.lang.String)
	 */
	@Override
	public String getProperty(String name) {
		String value = null;
		if (this.getBundleContext() != null) {
			value = this.getBundleContext().getProperty(name);
		}
		return value;
	}

	public RecoveryManager getRecoveryManager() {
		return recoveryManager;
	}

	public void setRecoveryManager(RecoveryManager recoveryManager) {
		this.recoveryManager = recoveryManager;
	}

	@Override
	public void scheduleCacheReload(String cacheName, Date scheduleStartDate,
			Date scheduleEndDate, String cronExpression) throws Exception {

		if (getQuartzScheduler() == null
				|| !getQuartzScheduler().isActive()) {
			throw new Exception("Cache Reload scheduler is inactive");
		}

		// Generate the Cache reload schedule information.
		CacheReloadSchedule cacheReloadSchedule = new CacheReloadSchedule();
		cacheReloadSchedule.setCacheName(cacheName);
		cacheReloadSchedule.setScheduleStartTime(scheduleStartDate);
		cacheReloadSchedule.setScheduleStopTime(scheduleEndDate);
		cacheReloadSchedule.setCronExpression(cronExpression);

		CacheReloadScheduleConfiguration cacheReloadScheduleConfig = this
				.getConfigurationManager().getCacheReloadScheduleConfiguration(
						cacheName);

		// In case of Process scheduling the ProcessConfiguration is getting
		// created when process is registered.
		// While process scheduling, the schedule gets set to the
		// ProcessConfiguration.
		// In case of Cache Reload, lets create the
		// CacheReloadScheduleConfiguration, if not already present.
		if (cacheReloadScheduleConfig == null) {
			cacheReloadScheduleConfig = new CacheReloadScheduleConfiguration();
			cacheReloadScheduleConfig.setCacheName(cacheName);
			cacheReloadScheduleConfig.setSchedule(cacheReloadSchedule);
			this.getConfigurationManager().getConfiguration()
					.addCacheReloadScheduleConfiguration(
							cacheReloadScheduleConfig);
		}

		// If the CacheReloadScheduleConfiguration is already present, re
		// configure the schedule with the new schedule.
		if (cacheReloadScheduleConfig != null) {
			cacheReloadScheduleConfig.setSchedule(cacheReloadSchedule);
			try {
				this.getConfigurationManager().persist();
			} catch (ConfigurationException e) {
				logger.error(
						"Error persisting the schedule, This would again need to be "
								+ "persisted with the framework.", e);
				throw new Exception("Error persisting the schedule.");
			}

			try {
				this.scheduleCacheReload(cacheReloadSchedule);
			} catch (Exception e) {

				this.getConfigurationManager()
						.getCacheReloadScheduleConfiguration(cacheName)
						.setSchedule(null);
				this.getConfigurationManager().persist();
				// --
				logger.error("Error scheduling the reloading of cache.", e);
				throw e;
			}
		} else {
			throw new Exception(
					"Cache Reload Schedule configuration not found.");
		}
	}

	@Override
	public void scheduleCacheReload(CacheReloadSchedule schedule)
			throws Exception {

		if (this.getQuartzScheduler() == null
				|| !this.getQuartzScheduler().isActive()) {
			throw new Exception("Cache Reload scheduler is inactive.");
		}

		try {
			this.getQuartzScheduler().scheduleCacheReload(schedule);
		} catch (Exception e) {
			logger.error("Error while scheduling the cache reloading.");
			throw e;
		}

	}

}
