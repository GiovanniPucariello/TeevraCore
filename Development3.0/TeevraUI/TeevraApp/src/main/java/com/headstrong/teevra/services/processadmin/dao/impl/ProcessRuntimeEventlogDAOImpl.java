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
 * $Id: ProcessRuntimeEventlogDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.processadmin.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.common.exception.ObjectConversionException;
import com.headstrong.teevra.common.utils.ObjectConverter;
import com.headstrong.teevra.services.processadmin.dao.ProcessRuntimeEventlogDAO;
import com.headstrong.teevra.services.processadmin.eo.ProcessRuntimeEventlogEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;

/**
 * ProcessRuntimeEventlogDAOImpl implements ProcessRuntimeEventlogDAO and offers
 * methods to perform operations on ProcessRuntimeEventlogs
 */
public class ProcessRuntimeEventlogDAOImpl extends
		BaseHibernateDAO<ProcessRuntimeEventlogEO> implements
		ProcessRuntimeEventlogDAO {
	/**
	 * Logger for ProcessRuntimeEventlogDAOImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ProcessRuntimeEventlogDAOImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.dao.ProcessRuntimeEventlogDAO
	 *      #getProcessEventLogs(com.headstrong.teevra.services.processadmin.eo.
	 *      ProcessRuntimeEventlogEO)
	 */
	public List<ProcessRuntimeEventlogEO> getProcessEventLogs(
			ProcessRuntimeEventlogEO criteria) throws ProcessAdminServiceException{
		// TODO citeria specifications to be defined properly
		return super.getByCriteria(DetachedCriteria.forClass(
				ProcessRuntimeEventlogEO.class).add(
				Restrictions.eq("prcsRunId", criteria.getPrcsRunId())));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.dao.ProcessRuntimeEventlogDAO#getErrorLogs(java.lang.Long)
	 */
	@SuppressWarnings("unchecked")
	public List<ProcessRuntimeEventlogEO> getErrorLogs(Long prcsRunId)
			throws ProcessAdminServiceException {
		String query = null;
		query = "select "
				+ "eventlog.prcsRunEventlogId,eventlog.prcsRunId,prcsRuntime.prcsId,prcs.prcsName,"
				+ "eventlog.prcsEventDesc,eventlog.prcsEventTime "
				+ "from ProcessRuntimeEventlogEO eventlog,ProcessRuntimeEO prcsRuntime,ProcessEO prcs "
				+ "where eventlog.prcsRunId = prcsRuntime.prcsRunId "
				+ "and prcsRuntime.prcsId = prcs.prcsId "
				+ "and  eventlog.prcsEventType='ERROR'"
				+ "and eventlog.prcsRunId =" + prcsRunId;

		Iterator resultSet = super.createQuery(query);
		List<ProcessRuntimeEventlogEO> errorLogs = new ArrayList<ProcessRuntimeEventlogEO>();

		if (resultSet != null) {
			while (resultSet.hasNext()) {
				Object[] tuple = (Object[]) resultSet.next();
				ProcessRuntimeEventlogEO eventLog = new ProcessRuntimeEventlogEO();
				try {
					if (tuple[0] != null)
						eventLog.setPrcsRunEventlogId(ObjectConverter
								.getLong(tuple[0]));
					if (tuple[1] != null)
						eventLog
								.setPrcsRunId(ObjectConverter.getLong(tuple[1]));
					if (tuple[2] != null)
						eventLog.setPrcsId(ObjectConverter.getLong(tuple[2]));
					if (tuple[3] != null)
						eventLog.setPrcsName(ObjectConverter
								.getString(tuple[3]));
					if (tuple[4] != null)
						eventLog.setPrcsEventDesc(ObjectConverter
								.getString(tuple[4]));
					if (tuple[5] != null)
						eventLog.setPrcsEventTime(ObjectConverter
								.getTimeStamp(tuple[5]));
				} catch (ObjectConversionException e) {
					logger.error("Error While converting the object", e);
					throw new ProcessAdminServiceException(e.getMessage());
				}
				errorLogs.add(eventLog);
			}
		}

		return errorLogs;

	}
}
