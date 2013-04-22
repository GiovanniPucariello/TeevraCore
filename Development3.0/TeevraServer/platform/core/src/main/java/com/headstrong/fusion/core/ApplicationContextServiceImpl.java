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
 * $Id: ApplicationContextServiceImpl.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 20, 2009 
 */

package com.headstrong.fusion.core;

import com.headstrong.fusion.commons.ApplicationContextService;

/**
 * 
 */
public class ApplicationContextServiceImpl implements ApplicationContextService {

	private ApplicationContext applicationContext;
	public ApplicationContextServiceImpl(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}
	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.ApplicationContextService#startProcess(java.lang.String)
	 */
	@Override
	public void startProcess(String processId) throws Exception {
		this.applicationContext.startProcess(processId);
	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.ApplicationContextService#stopProcess(java.lang.String)
	 */
	@Override
	public void stopProcess(String processId) throws Exception {
		this.applicationContext.stopProcess(processId);
	}
	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.ApplicationContextService#errorProcess(java.lang.String, java.lang.String)
	 */
	@Override
	public void errorProcess(String processId, String errorMsg)
			throws Exception {
		this.applicationContext.errorProcess(processId, errorMsg);
		
	}

}
