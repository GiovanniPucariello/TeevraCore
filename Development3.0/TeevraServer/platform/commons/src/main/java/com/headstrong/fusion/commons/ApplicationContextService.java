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
 * $Id: ApplicationContextService.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 20, 2009 
 */

package com.headstrong.fusion.commons;


/**
 * 
 */
public interface ApplicationContextService {

	/**
	 * Start the Process.
	 * 
	 * @param processId
	 * @throws Exception
	 */
	public void startProcess(String processId) throws Exception;
	
	/**
	 * Stop the Process.
	 * 
	 * @param processId
	 * @throws Exception
	 */
	public void stopProcess(String processId) throws Exception;
	
	/**
	 * Stop the Process because of the error.
	 * 
	 * @param processId
	 * @param errorMsg
	 * @throws Exception
	 */
	public void errorProcess(String processId,String errorMsg) throws Exception;
	
}
