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
 * $Id: MessageEventlogDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 17, 2008 
 */

package com.headstrong.teevra.services.processadmin.dao;

import java.util.List;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.process.exception.ProcessServiceException;
import com.headstrong.teevra.services.processadmin.eo.MessageEventlogEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;

/**
 * MessageEventlogDAO extends BaseDAO and performs operations to perform
 * operations on MessageEventlogEO
 */
public interface MessageEventlogDAO extends BaseDAO<MessageEventlogEO> {

	/**
	 * Retrieves the list of Error Message Eventlogs for the given process run
	 * id
	 * 
	 * @precondition
	 * @postcondition
	 * @param prcsRunId
	 * @throws ProcessServiceException
	 * @return
	 */
	public List<MessageEventlogEO> getErrorLogs(Long prcsRunId)
			throws ProcessAdminServiceException;

	/**
	 * Retrieves the list of all the error message eventlogs in the system
	 * 
	 * @precondition
	 * @postcondition
	 * @throws ProcessServiceException
	 * @return
	 */
	public List<MessageEventlogEO> getErrorLogs()
			throws ProcessAdminServiceException;

	/**
	 * Retrieves the Message details for the given message eventlog id
	 * 
	 * @precondition
	 * @postcondition
	 * @param messageEventlogId
	 * @throws ProcessServiceException
	 * @return
	 */
	public List<MessageEventlogEO> getMessageData(Long messageEventlogId)
			throws ProcessAdminServiceException;

}
