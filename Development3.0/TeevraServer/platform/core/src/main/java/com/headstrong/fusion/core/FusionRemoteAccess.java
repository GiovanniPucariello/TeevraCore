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
 * $Id: FusionRemoteAccess.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 17, 2008 
 */

package com.headstrong.fusion.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;

import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.failover.AdminService;
import com.headstrong.fusion.failover.State;

/**
 * This provides JMX remote access to fusion framework.
 * 
 */
public class FusionRemoteAccess implements FusionRemoteAccessMBean {
	private static Logger logger = LoggerFactory
			.getLogger(FusionRemoteAccess.class);
	private ApplicationContext applicationContext;

	/**
	 * Before any call to fusion it verifies the state of the application. which
	 * should be in RUNNING state.
	 * 
	 * @throws Exception
	 */
	private void verifyState() throws Exception {
		boolean active = false;
		ServiceReference serviceReference = this.applicationContext
				.getBundleContext().getServiceReference(
						AdminService.class.getName());
		if (serviceReference != null) {
			AdminService adminService = (AdminService) this.applicationContext
					.getBundleContext().getService(serviceReference);
			if (adminService != null) {
				if (adminService.getMemberState() != null
						&& adminService.getMemberState().equals(State.RUNNING)) {
					active = true;
				}
			}
		}
		if (!active) {
			throw new Exception(
					"Application instance is currently not running.");
		}
	}

	public FusionRemoteAccess(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.FusionRemoteAccessMBean#getProcesses()
	 */
	public synchronized List<String> getProcesses() throws Exception {
		logger.info("Get Process Request received");
		this.verifyState();
		try {
			return this.applicationContext.getProcesses();
		} catch (Exception ex) {
			logger.error("Error retrieving the processes.", ex);
			throw new Exception(ex.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.FusionRemoteAccessMBean#registerProcess(byte
	 *      [])
	 */
	public synchronized void registerProcess(byte[] file) throws Exception {
		logger
				.info("Process registration request received. Process definition "
						+ file);
		this.verifyState();
		try {
			this.applicationContext.registerProcess(file);
		} catch (Exception ex) {
			logger.error("Error registering the process.", ex);
			throw new Exception(ex.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.FusionRemoteAccessMBean#registerProcess(java
	 *      .lang.String)
	 */
	public synchronized void registerProcess(String processDefinition)
			throws Exception {
		logger
				.info("Process registration request received. Process definition "
						+ processDefinition);
		this.verifyState();
		try {
			this.applicationContext.registerProcess(processDefinition);
		} catch (RejectedExecutionException ex) {
			logger.error("Error registering the process.", ex);
			throw new Exception("Fusion can not stop the process now please "
					+ "try starting the process after sometime.");
		} catch (Exception ex) {
			logger.error("Error registering the process.", ex);
			throw new Exception(ex.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.FusionRemoteAccessMBean#removeProcess(java
	 *      .lang.String)
	 */
	public synchronized void removeProcess(String processId) throws Exception {
		logger.info("Remove process request received for process id "
				+ processId);

		this.verifyState();
		try {
			this.applicationContext.removeProcess(processId);
		} catch (Exception ex) {
			logger.error("Error removing the process.", ex);
			throw new Exception(ex.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.FusionRemoteAccessMBean#scheduleProcess(java
	 *      .lang.String, java.util.Date, java.util.Date, java.lang.String)
	 */
	public synchronized void scheduleProcess(String processId,
			Date scheduleStartTime, Date scheduleStopTime,
			Long processStopTime, String cronExpression) throws Exception {
		logger.info("Schedule process request received details [ process id = "
				+ processId + " , schedule start time = " + scheduleStartTime
				+ " , schedule stop time = " + scheduleStopTime
				+ ", cron expression = " + cronExpression
				+ ", process stop time = " + processStopTime);
		this.verifyState();
		try {
			this.applicationContext.scheduleProcess(processId,
					scheduleStartTime, scheduleStopTime, processStopTime,
					cronExpression);
		} catch (Exception ex) {
			logger.error("Error scheduling the process.", ex);
			throw new Exception(ex.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.FusionRemoteAccessMBean#startProcess(java.
	 *      lang.String)
	 */
	public synchronized void startProcess(String processId) throws Exception {
		logger.info("Start process request received for process id "
				+ processId);

		this.verifyState();
		try {
			this.applicationContext.startProcess(processId);
		} catch (Exception ex) {
			logger.error("Error starting the process.", ex);
			throw new Exception(ex.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.FusionRemoteAccessMBean#stopProcess(java.lang
	 *      .String)
	 */
	public synchronized void stopProcess(String processId) throws Exception {
		logger
				.info("Stop process request received for process Id "
						+ processId);

		this.verifyState();
		try {
			this.applicationContext.stopProcess(processId);
		} catch (Exception ex) {
			logger.error("Error stopping the process.", ex);
			throw new Exception(ex.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.FusionRemoteAccessMBean#updateProcess(java
	 *      .lang.String, byte[])
	 */
	public synchronized void updateProcess(String processId, byte[] file)
			throws Exception {
		logger.info("Update process request received for process Id "
				+ processId);
		this.verifyState();
		try {
			this.applicationContext.updateProcess(processId, file);
		} catch (Exception ex) {
			logger.error("Error updating the process.", ex);
			throw new Exception(ex.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.FusionRemoteAccessMBean#installBundle(byte[],
	 *      java.lang.String)
	 */
	public void installBundle(byte[] bundle, String bundleName)
			throws Exception {
		logger.info("Install bundle request received " + bundleName);
		this.verifyState();
		try {
			this.applicationContext.installBundle(bundle, bundleName);
		} catch (Exception e) {
			logger.error("Error installing Bundle.", e);
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public String getProcessStageInfo(String processId) {
		return this.applicationContext.getProcessMap().get(processId)
				.getStatgeInfo();
	}

	@Override
	public String getProcessStatus(String processId) throws Exception {
		logger.info("Get Process Status Request received");
		this.verifyState();
		String status = "";

		if (this.applicationContext.getProcessMap().get(processId) == null) {
			status = "Process id " + processId
					+ " is not registered in the system";

		} else {
			boolean isRunning = this.applicationContext.getProcessMap().get(
					processId).isRunning();
			if (isRunning) {
				status = "RUNNING";
			} else {
				status = "STOPPED";
			}
		}

		return status;
	}

	@Override
	public List<String> getRunningProcesses() throws Exception {

		Map<String, ProcessContext> prcsMap = this.applicationContext
				.getProcessMap();
		List<String> runningProcesses = new ArrayList<String>();

		Set<String> prcsIds = prcsMap.keySet();
		Iterator<String> it = prcsIds.iterator();
		String id = null;
		while (it.hasNext()) {
			if (prcsMap.get(id = it.next()).isRunning()) {
				runningProcesses.add(id);
			}
		}
		return runningProcesses;
	}

	@Override
	public void scheduleCacheReload(String cacheName, Date scheduleStartDate,
			Date scheduleEndDate, String cronExpression) throws Exception {

		logger
				.info("Schedule cache reload request received details [ cache name = "
						+ cacheName
						+ " , schedule start date = "
						+ scheduleStartDate
						+ " , schedule end date = "
						+ scheduleEndDate
						+ ", cron expression = "
						+ cronExpression);
		this.verifyState();
		try {
			this.applicationContext.scheduleCacheReload(cacheName,
					scheduleStartDate, scheduleEndDate, cronExpression);
		} catch (Exception ex) {
			logger.error("Error scheduling the cache reloading.", ex);
			throw new Exception(ex.getMessage());
		}

	}

}
