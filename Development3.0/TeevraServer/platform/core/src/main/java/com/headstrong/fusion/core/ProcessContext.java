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
 * $Id: ServiceContext.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 4, 2008 
 */

package com.headstrong.fusion.core;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.config.ProcessConfigurationModel;

public interface ProcessContext {

	/**
	 * Starts the Process.
	 * 
	 * @throws Exception
	 */
	public void start() throws Exception;

	/**
	 * Stops the Process.
	 * 
	 * @throws Exception
	 */
	public void stop() throws Exception;

	/**
	 * Stops the Process.
	 * 
	 * @throws Exception
	 */
	public void stop(boolean updateConfiguration) throws Exception;

	/**
	 * Error in the Process.
	 * 
	 * @param errorMsg
	 * @throws Exception
	 */
	public void error(String errorMsg) throws Exception;

	/**
	 * 
	 * @return unique process identifier
	 */
	public String getProcessId();

	/**
	 * Returns the processRunId.
	 * 
	 * @return processRunId;
	 */
	public String getProcessRunId();

	/**
	 * For Each run of the process a unique id is assigned to the process.
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void setProcessRunId(String processRunId);

	/**
	 * Returns the {@link ApplicationContext}
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 */
	public ApplicationContext getApplicationContext();

	/**
	 * Sets the ApplicationContext.
	 * 
	 * @precondition
	 * @postcondition
	 * @param applicationContext
	 */
	public void setApplicationContext(ApplicationContext applicationContext);

	/**
	 * @return the processConfigurationModel
	 */
	public ProcessConfigurationModel getProcessConfigurationModel();

	/**
	 * @return the isRunning
	 */
	public boolean isRunning();

	/**
	 * @param isRunning
	 *            the isRunning to set
	 */
	public void setRunning(boolean isRunning);

	public abstract void recoverMessages() throws FusionException;

	public String getStatgeInfo(); 
}
