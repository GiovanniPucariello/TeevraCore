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
 * $Id: ProcessServerDAO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Feb 12, 2009 
 */

package com.headstrong.teevra.services.serveradmin.dao;

import com.headstrong.teevra.common.dao.BaseDAO;
import com.headstrong.teevra.services.serveradmin.eo.ProcessServerEO;
import com.headstrong.teevra.services.serveradmin.exception.ServerAdminServiceException;

/**
 * Offers APIs to perform CRUD of process-server mappings
 */
public interface ProcessServerDAO extends BaseDAO<ProcessServerEO> {

	/**
	 * Persists the given process-server mapping
	 * 
	 * @precondition
	 * @postcondition
	 * @param prcsServerMapping
	 * @throws ServerAdminServiceException
	 */
	public void savePrcsServerMapping(ProcessServerEO prcsServerMapping)
			throws ServerAdminServiceException;

	/**
	 * updates the process-server mapping for the given process id
	 * 
	 * @precondition
	 * @postcondition
	 * @param prcsId
	 * @param serverId
	 * @throws ServerAdminServiceException
	 */
	public void updatePrcsServerMapping(Long prcsId, Long serverId)
			throws ServerAdminServiceException;

	/**
	 * Retrieves server mapping for the given process id
	 * 
	 * @precondition
	 * @postcondition
	 * @param prcsId
	 * @return
	 * @throws ServerAdminServiceException
	 */
	public ProcessServerEO getPrcsServerMapping(Long prcsId)
			throws ServerAdminServiceException;

	/**
	 * deletes the given process-server mapping
	 * 
	 * @precondition
	 * @postcondition
	 * @param prcsServerMapping
	 * @throws ServerAdminServiceException
	 */
	public void deletePrcsServerMapping(ProcessServerEO prcsServerMapping)
			throws ServerAdminServiceException;
}
