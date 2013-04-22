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
 * $Id: CamelProcessContext.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 4, 2008 
 */

package com.headstrong.fusion.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.component.seda.SedaEndpoint;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.ConfigurationService;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.MediationService;
import com.headstrong.fusion.commons.MessageIDGenerator;
import com.headstrong.fusion.commons.ProcessStateController;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.commons.resolver.ServiceResolverImpl;
import com.headstrong.fusion.commons.resolver.exception.ServiceUnavailableException;
import com.headstrong.fusion.config.MediatorConfig;
import com.headstrong.fusion.config.ProcessConfiguration;
import com.headstrong.fusion.config.ProcessConfigurationModel;
import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.beans.ProcessEventLogBean;
import com.headstrong.fusion.eventlogger.factory.EventLoggerFactory;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * Represents a process context in fusion.
 * 
 */
public class CamelProcessContext implements ProcessContext, LifeCycle {

	/**
	 * Event logger.
	 */
	private static EventLogger eventLogger = EventLoggerFactory
			.getEventLogger(EventLoggerFactory.EVENT_LOGGERS.PROCESS_LOGGER);

	/**
	 * Logger
	 */
	private final static Logger logger = LoggerFactory
			.getLogger(CamelProcessContext.class);

	/**
	 * To update the process runtime when the process is started.
	 */
	private static String updateRuntimeStatusStarted = "update process_runtime set prcs_run_status=?,"
			+ "prcs_run_start_time=? where prcs_run_id=?";

	/**
	 * To update the process runtime when the process is stopped.
	 */
	private static String updateRuntimeStatusStopped = "update process_runtime set prcs_run_status=?,"
			+ "prcs_run_stop_time=? where prcs_run_id=?";

	/**
	 * To update the process runtime other than started and stopped.
	 */
	private static String updateRuntimeStatus = "update process_runtime set prcs_run_status=?"
			+ " where prcs_run_id=?";

	/**
	 * Underlying Camel Process Context.
	 */
	private CamelContext camelContext;

	/**
	 * Fusion Application Context.
	 */
	private ApplicationContext applicationContext;

	private ProcessStateController processStateController;

	/**
	 * Process Run Id. Every Run is assigned a new Process run id.
	 * 
	 */
	private String processRunId;
	/**
	 * Variable identifies if the process is running or not.
	 */
	private boolean running = false;
	/**
	 * The current state of the process. Can be possible values
	 * <ol>
	 * <li>Resolved - During process creation</li>
	 * <li>Starting</li>
	 * <li>Started</li>
	 * <li>Stopped</li>
	 * </ol>
	 */
	private String state = "Resolved";

	/**
	 * Process configuration model.
	 */
	private ProcessConfigurationModel processConfigurationModel;
	/**
	 * Description of the process. Will be set by the constructor
	 */

	private CamelProcessMetaData processMetaData;
	
	/**
	 * Whether a process has a multicast router.
	 */
	private boolean isMulticastProcess;

	/**
	 * Default Constructor. It also creates the information required for the
	 * mbean server.
	 */
	public CamelProcessContext(ApplicationContext applicationContext,
			ProcessConfigurationModel processConfigurationModel) {
		super();
		this.applicationContext = applicationContext;
		this.processConfigurationModel = processConfigurationModel;
		// Create empty process metadata object.
		// this will be populated by the process modeler
		// with the relevant information.
		this.processMetaData = new CamelProcessMetaData();
		// FIXME :: Not a good practice to pass this reference.
		this.processStateController = new DefaultProcessStateController(this);
	}

	/**
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/**
	 * 
	 * @return {@link CamelContext}
	 */
	public CamelContext getCamelContext() {
		return camelContext;
	}

	/**
	 * 
	 * @param camelContext
	 */
	public void setCamelContext(CamelContext camelContext) {
		this.camelContext = camelContext;
	}

	public synchronized void start(boolean reloadConfiguration)
			throws Exception {
		state = "Starting";
		logger.info("Starting context :"
				+ this.getProcessConfigurationModel().getProcess().getName());
		/**
		 * if the process event logging is required, then only create process
		 * event logs and log the events
		 */
		boolean prcsEvntlogOn = this.getProcessConfigurationModel()
				.getProcess().isToLogPrcsEvents();
		if (!this.init(reloadConfiguration)) {
			state = "Unavailable";
			// create an event log
			throw new Exception("All the services are not available");
		} else {
			// set the process run id .
			String processRunId = this.generateProcessRunId();
			// verify if all mediation services are available
			if (processRunId != null) {
				this.setProcessRunId(processRunId);
				try {
					if (this.camelContext.getRoutes() != null) {
						this.camelContext.getRoutes().clear();
					}
					if (this.getProcessConfigurationModel().getProcess()
							.isToRecover()) {
						this.recoverMessages();
					}
					this.camelContext.start();
				} catch (Exception e) {
					logger.error("Error starting camel context", e);
					//update process status
					updateProcessStatus(FusionConstants.PROCESS_ERROR);
					// update process runtime table with error
					if (prcsEvntlogOn) {
						eventLogger.log(createProcessEventLog("INFO",
								"Error while starting the process",
								FusionConstants.PROCESS_ERROR));

					}
					throw new Exception("Unable to start the process.", e);
				}
				state = "Started";
				//update process status
				updateProcessStatus(FusionConstants.PROCESS_STARTED);
				// update process runtime table with running
				if (prcsEvntlogOn) {
					eventLogger
							.log(createProcessEventLog("INFO",
									"Process started",
									FusionConstants.PROCESS_STARTED));
				}
			} else {
				logger.error("Unable to generate process run id.");
				//update process status
				updateProcessStatus(FusionConstants.PROCESS_ERROR);
				// update process runtime table with error record
				if (prcsEvntlogOn) {
					eventLogger.log(createProcessEventLog("INFO",
							"Error while starting the process",
							FusionConstants.PROCESS_ERROR));
				}
				throw new Exception("Unable to start the process.");
			}
		}
		// set the status
		// this.updateProcessConfiguration(true);
		this.setRunning(true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ProcessContext#start()
	 */
	public synchronized void start() throws Exception {
		this.start(true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ProcessContext#stop()
	 */
	public synchronized void stop() throws Exception {
		this.stop(false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ProcessContext#stop()
	 */
	public synchronized void stop(boolean updateConfig) throws Exception {
		/**
		 * if the process event logging is required, then only create process
		 * event logs and log the events
		 */
		boolean prcsEvntlogOn = this.getProcessConfigurationModel()
				.getProcess().isToLogPrcsEvents();
		if (updateConfig) {
			ProcessConfiguration processConfiguration = this
					.getApplicationContext().getConfigurationManager()
					.getProcessConfiguration(
							this.getProcessConfigurationModel().getProcess()
									.getId());
			if (processConfiguration != null) {
				processConfiguration.setRunning(false);
			}
			this.getApplicationContext().getConfigurationManager().persist();
		}
		logger.info("Stopping context :"
				+ this.getProcessConfigurationModel().getProcess().getName());
		this.camelContext.stop();
		if (this.camelContext.getRoutes() != null) {
			this.camelContext.getRoutes().clear();
		}
		state = "Stopped";
		// update process runtime table with stopped
		updateProcessStatus(FusionConstants.PROCESS_STOPPED);
		//log the event
		if (prcsEvntlogOn) {
			eventLogger.log(createProcessEventLog("INFO",
					"Process successfully stopped",
					FusionConstants.PROCESS_STOPPED));
		}
		// this.updateProcessConfiguration(false);
		this.setRunning(false);
		this.processStateController.clear();
	}

	@Override
	public synchronized void error(String errorMsg) throws Exception {
		logger.info("Error in context :"
				+ this.getProcessConfigurationModel().getProcess().getName());
		/**
		 * if the process event logging is required, then only create process
		 * event logs and log the events
		 */
		boolean prcsEvntlogOn = this.getProcessConfigurationModel()
				.getProcess().isToLogPrcsEvents();
		try {
			this.camelContext.stop();
			if (this.camelContext.getRoutes() != null) {
				this.camelContext.getRoutes().clear();
			}
		} catch (Exception e) {
			logger.error("Error while stopping camel context", e);
			throw e;
		} finally {
			state = "error";

			// update process runtime table with error
			updateProcessStatus(FusionConstants.PROCESS_ERROR);
			//log the event
			if (prcsEvntlogOn) {
				eventLogger.log(createProcessEventLog("ERROR", errorMsg,
						FusionConstants.PROCESS_ERROR));
			}

		}
		// this.updateProcessConfiguration(false);
		this.setRunning(false);
		this.processStateController.clear();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ProcessContext#getProcessRunId()
	 */
	public String getProcessRunId() {
		return this.processRunId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ProcessContext#setProcessRunId(java.lang.String )
	 */
	public void setProcessRunId(String processRunId) {
		this.processRunId = processRunId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.core.ProcessContext#getApplicationContext()
	 */
	public ApplicationContext getApplicationContext() {
		return this.applicationContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.fusion.core.ProcessContext#setApplicationContext(com.
	 * headstrong.fusion.core.ApplicationContext)
	 */
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	/**
	 * 
	 * @return processRunId
	 * @throws FusionException
	 */
	private String generateProcessRunId() throws FusionException {
		String processRunId = null;
		BundleContext context = this.getApplicationContext().getBundleContext();
		ServiceResolver<MessageIDGenerator> messageIdGeneratorServiceResolver = new ServiceResolverImpl<MessageIDGenerator>(
				context);
		MessageIDGenerator messageIdGenerator = null;
		messageIdGenerator = messageIdGeneratorServiceResolver.getService(
				MessageIDGenerator.class.getName(), 0);
		if (messageIdGenerator == null) {
			throw new FusionException(
					"Unable to locate messageId generator service");
		}
		processRunId = messageIdGenerator.getSessionId(this
				.getProcessConfigurationModel().getProcess().getId());
		return processRunId;
	}

	/**
	 * @return the processConfigurationModel
	 */
	public ProcessConfigurationModel getProcessConfigurationModel() {
		return processConfigurationModel;
	}

	/**
	 * @param processConfigurationModel
	 *            the processConfigurationModel to set
	 */
	public void setProcessConfigurationModel(
			ProcessConfigurationModel processConfigurationModel) {
		this.processConfigurationModel = processConfigurationModel;
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 */
	private boolean init(boolean reloadConfiguration) throws Exception {
		if (reloadConfiguration) {
			// initialize the cache
			ConfigurationService configurationService;
			String processId = this.getProcessConfigurationModel().getProcess()
					.getId();
			try {
				configurationService = (ConfigurationService) ServiceAliasManager
						.getInstance().getServiceByAlias(
								ConfigurationService.class.getSimpleName(), 0);
				configurationService.reloadConfiguration(processId);
			} catch (ServiceUnavailableException e1) {
				logger.error(
						"Unable to load service configuration for process : "
								+ processId, e1);
				throw e1;
			} catch (Exception e) {
				logger.error(
						"Unable to load service configuration for process : "
								+ processId, e);
				throw e;
			}
		}
		// Initialize all the mediation services.
		boolean available = true;
		// Add Mediator Services list
		for (MediatorConfig mediator : this.processConfigurationModel
				.getMediators()) {
			MediationService mediationService;
			try {
				mediationService = (MediationService) this.applicationContext
						.getMediationService(mediator.getType(), 0);
				if (mediationService == null) {
					logger.info("Mediation service " + mediator.getType()
							+ " not available");
					available = false;
				}
			} catch (ServiceUnavailableException e) {
				logger.info("Mediation service " + mediator.getType()
						+ " not available");
				available = false;
			}
		}
		return available;
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 */
	private ProcessEventLogBean createProcessEventLog(String eventType,
			String eventDesc, String status) {
		ProcessEventLogBean processBean = new ProcessEventLogBean();
		processBean.setProcessId(Integer
				.parseInt(this.processConfigurationModel.getProcess().getId()));
		processBean.setSessionId(this.processRunId);
		processBean.setEventType(eventType);
		processBean.setEventSource("Fusion Core");
		processBean.setEventCategory("Process Administration");
		processBean.setEventDesc(eventDesc);
		processBean.setProcessStatus(status);
		return processBean;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void recoverMessages() {
		logger.info("Recovering messages for :" + this.getProcessId());
		try {
			this.getApplicationContext().getRecoveryManager().runRecovery(this);
		} catch (FusionException e) {
			logger.error("Message recovery failed for process id :"
					+ this.getProcessId(), e);
		}
	}

	public boolean isRunning() {
		return this.running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	/**
	 * @return the processMetaData
	 */
	public CamelProcessMetaData getProcessMetaData() {
		return processMetaData;
	}

	/**
	 * @param processMetaData
	 *            the processMetaData to set
	 */
	public void setProcessMetaData(CamelProcessMetaData processMetaData) {
		this.processMetaData = processMetaData;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String getProcessId() {
		return this.processConfigurationModel.getProcess().getId();
	}

	@Override
	public String getStatgeInfo() {
		HashMap<String, Endpoint> sedaEndpoints = this.processMetaData
				.getSourceEndpoints();
		StringBuffer sbf = new StringBuffer();
		for (Entry<String, Endpoint> endpointEntry : sedaEndpoints
				.entrySet()) {
			if (endpointEntry.getValue() instanceof SedaEndpoint) {
				SedaEndpoint sep = (SedaEndpoint) endpointEntry.getValue();
				sbf.append("endpoint id: " + endpointEntry.getKey());
				sbf.append("queue size: " + sep.getQueue().size());
				sbf.append("\n");
			}
		}
		return sbf.toString();
	}

	public ProcessStateController getProcessStateController() {
		return processStateController;
	}

	public void setProcessStateController(
			ProcessStateController processStateController) {
		this.processStateController = processStateController;
	}

	/**
	 * <code>updateStatus</code> method updates the status of the process in
	 * the database.
	 * 
	 * @precondition
	 * @postcondition
	 * @param conn
	 *            {@link Connection}
	 * @param processStatus
	 *            The status of the process to be updated.
	 * @param sessionId
	 *            The process runtime id.
	 * @throws FusionException
	 *             If the update fails.
	 */
	private void updateProcessStatus(String processStatus)
			throws FusionException {

		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		if (dbPool == null) {
			logger.error("Error obtaining database manager");
			throw new FusionException("Error obtaining database manager");
		}

		Connection conn = null;

		try {
			conn = dbPool.getConnection();
			int sessionId = Integer.parseInt(this.processRunId);
			// get session id - run id
			updateStatus(conn, processStatus, sessionId);

		} catch (SQLException e) {
			logger.error(
					"Error while updating the runtime status in the database",
					e);
			throw new FusionException(
					"Error while updating the runtime status in the database",
					e);
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				logger.error("Error while clsoing connections", e);
			}

		}
	}

	/**
	 * <code>updateStatus</code> method updates the status of the process in
	 * the database.
	 * 
	 * @precondition
	 * @postcondition
	 * @param conn
	 *            {@link Connection}
	 * @param processStatus
	 *            The status of the process to be updated.
	 * @param sessionId
	 *            The process runtime id.
	 * @throws FusionException
	 *             If the update fails.
	 */
	private void updateStatus(Connection conn, String processStatus,
			int sessionId) throws FusionException {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		PreparedStatement pStmt = null;

		try {

			if (FusionConstants.PROCESS_STARTED.equals(processStatus)) {
				pStmt = conn.prepareStatement(updateRuntimeStatusStarted);
				pStmt.setString(1, processStatus);
				pStmt.setTimestamp(2, timestamp);
				pStmt.setInt(3, sessionId);

			} else if (FusionConstants.PROCESS_STOPPED.equals(processStatus)) {
				pStmt = conn.prepareStatement(updateRuntimeStatusStopped);
				pStmt.setString(1, processStatus);
				pStmt.setTimestamp(2, timestamp);
				pStmt.setInt(3, sessionId);

			} else {
				pStmt = conn.prepareStatement(updateRuntimeStatus);
				pStmt.setString(1, processStatus);
				pStmt.setInt(2, sessionId);
			}

			int totalRowsUpdated = pStmt.executeUpdate();

			if (totalRowsUpdated == 0) {
				logger.error("No records updated in update status ");
				throw new FusionException("No records updated in update status");
			}

			if (logger.isDebugEnabled()) {
				logger.debug("Update successful " + processStatus
						+ " for run-id " + sessionId);
			}
		} catch (SQLException e) {
			logger.error("Error while updating the status in database", e);
			throw new FusionException(
					"Error while updating the status in database", e);
		} finally {
			try {
				pStmt.close();
			} catch (SQLException e) {
				logger.error("Error while closing the statement", e);
			}
		}

	}

	/**
	 * Check whether a process has a multicast router.
	 * @return
	 */
	public boolean isMulticastProcess() {
		return isMulticastProcess;
	}

	/**
	 * Set if the process has a multicast router.
	 * @param isMulticastProcess
	 */
	public void setMulticastProcess(boolean isMulticastProcess) {
		this.isMulticastProcess = isMulticastProcess;
	}
}
