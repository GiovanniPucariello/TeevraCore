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
 * $Id: FusionBootstrap.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 15, 2008 
 */

package com.headstrong.fusion.core;

import java.io.File;
import java.util.Collection;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.config.Configuration;
import com.headstrong.fusion.config.ProcessConfiguration;
import com.headstrong.fusion.config.CacheReloadSchedule;
import com.headstrong.fusion.config.CacheReloadScheduleConfiguration;

/**
 * {@link FusionBootstrapManager} bootstraps the Fusion core. It's core
 * responsibility is to configure and setup the Fusion core.
 * 
 * <p>
 * It performs following startup operations.
 * <li>create {@link ApplicationContext}
 * <li>Load existing processes under $fusion.process.dir} directory.
 * <li>Loads the schedule of all the processes.
 * 
 */
public class FusionBootstrapManager implements BootstrapManager {

	private ApplicationContext applicationContext;
	private static final Logger logger = LoggerFactory
			.getLogger(FusionBootstrapManager.class);

	private volatile boolean running = false;

	/**
	 * @param bundleContext
	 */
	public FusionBootstrapManager(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.Bootstrap#init()
	 */
	/**
	 * Bootstrap the application node. start processes start scheduler.
	 * 
	 */
	public synchronized void bootstrap() throws Exception {
		if (!this.isRunning()) {
			this.setRunning(true);
			if (logger.isInfoEnabled()) {
				logger.info("Bootstrapping fusion.");
			}
			// Read the latest fusion configuration.
			this.getApplicationContext().getConfigurationManager().refresh();

			// Load all the process definitions
			this.loadProcesses();

			// Schedule all the processes.
			this.scheduleProcesses();

			// Schedule all Cache reloading.
			this.scheduleCacheReload();

			// Auto-Start processes as marked.
			this.autoStartProcesses();

			// Start the scheduler
			boolean startScheduler = false;
			try {
				startScheduler = this.getApplicationContext().getProperty(
						FusionConstants.FUSION_SCHEDULER_ACTIVE) == null ? false
						: Boolean
								.valueOf(this
										.getApplicationContext()
										.getProperty(
												FusionConstants.FUSION_SCHEDULER_ACTIVE));
			} catch (Throwable e) {
				// ignored.
			}
			if (startScheduler) {
				this.getApplicationContext().getQuartzScheduler().start();
			}

			// Stop would be taken care of by the FusionActivator shutdown.
			// Start the scheduler
			boolean startDefReader = false;
			try {
				startDefReader = this.getApplicationContext().getProperty(
						FusionConstants.FUSION_PRCS_DEF_READER_ACTIVE) == null ? false
						: Boolean
								.valueOf(this
										.getApplicationContext()
										.getProperty(
												FusionConstants.FUSION_PRCS_DEF_READER_ACTIVE));
			} catch (Throwable e) {
				// ignored.
			}
			if (startDefReader) {
				ProcessDefinitionReader processDefinitionReader = new ProcessDefinitionReader(
						applicationContext);
				processDefinitionReader.start();
			}
			logger.info("Fusion core bootstrap complete.");
		} else {
			logger.info("Application already running");
			// TODO check if need to throw exception.
		}
	}

	/**
	 * It checks for the process schedule in the fusion configuration and
	 * schedules the process as per the configuration if the process is
	 * registered with Fusion.
	 * 
	 * @precondition process is registered.
	 */
	private void scheduleProcesses() throws Exception {
		Configuration configuration = this.getApplicationContext()
				.getConfigurationManager().getConfiguration();
		if (configuration != null) {
			Collection<ProcessConfiguration> processes = configuration
					.getProcesses();
			if (processes != null) {
				// Schedule all the processes as specified in the definition
				for (ProcessConfiguration process : processes) {
					// check if the process is registered.
					if (process.getSchedule() != null) {
						try {
							this.getApplicationContext().scheduleProcess(
									process.getSchedule());
						} catch (Exception e) {
							logger.error("Error scheduling process "
									+ process.getId(), e);
						}
					}
				}
			}
		}
	}

	/**
	 * Similar to process scheduling, it handles scheduling of cache reloading.
	 * @throws Exception
	 */
	private void scheduleCacheReload() throws Exception {
		Configuration configuration = this.getApplicationContext()
				.getConfigurationManager().getConfiguration();
		if (configuration != null) {
			Collection<CacheReloadScheduleConfiguration> cacheReloadSchedules = configuration
					.getCacheReloadConfigurations();
			if (cacheReloadSchedules != null) {
				for (CacheReloadScheduleConfiguration cacheReloadScheduleConfs : cacheReloadSchedules) {
					CacheReloadSchedule schedule = cacheReloadScheduleConfs
							.getSchedule();
					if (schedule != null) {
						try {
							this.getApplicationContext().scheduleCacheReload(
									schedule);
						} catch (Exception e) {
							logger.error(
									"Error scheduling cache reload for the cache "
											+ cacheReloadScheduleConfs
													.getCacheName(), e);
						}
					}
				}
			}
		}
	}

	/**
	 * Processes that are marked for auto-startup are started.
	 * 
	 */
	private void autoStartProcesses() {
		Configuration configuration = this.getApplicationContext()
				.getConfigurationManager().getConfiguration();
		if (configuration != null) {
			Collection<ProcessConfiguration> processes = configuration
					.getProcesses();
			if (processes != null) {
				// Schedule all the processes as specified in the definition
				for (ProcessConfiguration process : processes) {
					// check if the process is registered.
					if (process.isRunning()) {
						try {
							this.getApplicationContext().startProcess(
									process.getId());
						} catch (Exception e) {
							logger.error("Error auto-starting process "
									+ process.getId(), e);
						}
					}
				}
			}
		}
	}

	/**
	 * Stops the instance temporarily putting it in stand-by mode.
	 * 
	 * @throws Exception
	 */
	public void pause() throws Exception {
		logger.info("Fusion stopping.");
		if (this.isRunning()) {
			this.setRunning(false);
			// stop the scheduler
			this.getApplicationContext().getQuartzScheduler().shutDown();
			// Iteratively stop all the running processes.
			for (Map.Entry<String, ProcessContext> entry : this
					.getApplicationContext().getProcessMap().entrySet()) {
				String processId = entry.getKey();
				ProcessContext processContext = entry.getValue();
				logger.info("Stopping process " + processId);
				try {
					if (processContext.isRunning()) {
						processContext.stop();
					}
				} catch (Exception e) {
					logger.info("Error while stopping process " + processId, e);
				}
			}
			FusionRunnable.STOP = true;
		}
	}

	/**
	 * Handles application startup . Checks the application mode. If clustered
	 * checks if the application node is master node. In that case it sends an
	 * Self activation request to other nodes and on non-negative responses from
	 * all the other nodes bootstraps application.
	 * 
	 * 
	 * @precondition Application Context is initialized.
	 */
	@SuppressWarnings("unchecked")
	/**
	 * Loads all the processes in the memory.
	 * 
	 * @param fusionContext
	 * @throws Exception
	 */
	private void loadProcesses() throws Exception {
		// 1: pick the process definition file from the configuration directory.
		String processDirectory = this.getApplicationContext().getProperty(
				Properties.PROCESS_HOME);
		if (processDirectory != null) {
			File directory = new File(processDirectory);
			if (directory != null && directory.listFiles() != null) {
				for (File processFile : directory.listFiles()) {
					if (processFile.isFile()) {
						try {
							this.getApplicationContext().registerProcess(
									processFile, false);
						} catch (Exception ex) {
							logger.error("Error registering process "
									+ processFile.getName(), ex);
						}
					}
				}
			} else {
				logger.debug("Process directory " + processDirectory
						+ "missing.");
			}
		}
	}

	/**
	 * @return the applicationContext
	 */
	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * @param applicationContext
	 *            the applicationContext to set
	 */
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	/**
	 * @return the running
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * @param running
	 *            the running to set
	 */
	public void setRunning(boolean running) {
		this.running = running;
	}

}
