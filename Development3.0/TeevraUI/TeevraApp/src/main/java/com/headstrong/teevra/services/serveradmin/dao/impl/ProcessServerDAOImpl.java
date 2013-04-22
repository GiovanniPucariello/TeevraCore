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
 * $Id: ProcessServerDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Feb 12, 2009 
 */

package com.headstrong.teevra.services.serveradmin.dao.impl;

import java.sql.Timestamp;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.services.serveradmin.dao.ProcessServerDAO;
import com.headstrong.teevra.services.serveradmin.eo.ProcessServerEO;
import com.headstrong.teevra.services.serveradmin.exception.ServerAdminServiceException;

/**
 * ProcessServerDAOImpl implements ProcessDAO and contains methods to perform
 * CRUD operations on process server mappings.
 */
public class ProcessServerDAOImpl extends BaseHibernateDAO<ProcessServerEO>
		implements ProcessServerDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.serveradmin.dao.ProcessServerDAO#savePrcsServerMapping(com.headstrong.teevra.services.serveradmin.eo.ProcessServerEO)
	 */
	public void savePrcsServerMapping(ProcessServerEO prcsServerMapping)
			throws ServerAdminServiceException {
		super.save(prcsServerMapping);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.serveradmin.dao.ProcessServerDAO#updatePrcsServerMapping(java.lang.Long,
	 *      java.lang.Long)
	 */
	public void updatePrcsServerMapping(Long prcsId, Long serverId)
			throws ServerAdminServiceException {
		// List<ProcessServerEO> mappingList = super
		// .getByCriteria(DetachedCriteria.forClass(ProcessServerEO.class)
		// .add(Restrictions.eq("prcsId", prcsId)));
		ProcessServerEO mappingToUpdate = getPrcsServerMapping(prcsId);
		mappingToUpdate.setServerId(serverId);
		mappingToUpdate.setModifiedBy(System.getProperty("user.name"));
		mappingToUpdate.setModifiedDate(new Timestamp(System
				.currentTimeMillis()));
		super.update(mappingToUpdate);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.serveradmin.dao.ProcessServerDAO#getPrcsServerMapping(java.lang.Long)
	 */
	public ProcessServerEO getPrcsServerMapping(Long prcsId)
			throws ServerAdminServiceException {

		List<ProcessServerEO> mappingList = super
				.getByCriteria(DetachedCriteria.forClass(ProcessServerEO.class)
						.add(Restrictions.eq("prcsId", prcsId)));
		ProcessServerEO prcsServerMapping = null;
		if (!mappingList.isEmpty()) {
			prcsServerMapping = mappingList.get(0);
		}
		return prcsServerMapping;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.serveradmin.dao.ProcessServerDAO#deletePrcsServerMapping(com.headstrong.teevra.services.serveradmin.eo.ProcessServerEO)
	 */
	public void deletePrcsServerMapping(ProcessServerEO mappingToDelete)
			throws ServerAdminServiceException {
		super.delete(mappingToDelete);

	}

}
