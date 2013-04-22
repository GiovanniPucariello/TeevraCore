/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: ProcessRuntimeDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.processadmin.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.teevra.common.dao.hibernate.BaseHibernateDAO;
import com.headstrong.teevra.common.exception.ObjectConversionException;
import com.headstrong.teevra.common.utils.ObjectConverter;
import com.headstrong.teevra.services.process.vo.ProcessStatusVO;
import com.headstrong.teevra.services.processadmin.dao.ProcessRuntimeDAO;
import com.headstrong.teevra.services.processadmin.eo.ProcessRuntimeEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;

/**
 * ProcessRuntimeDAOImpl implements ProcessRuntimeDAO and performs operations to
 * start, stop, monitor schedule, publish and unpublish processes
 */
public class ProcessRuntimeDAOImpl extends BaseHibernateDAO<ProcessRuntimeEO>
		implements ProcessRuntimeDAO {
	/**
	 * Logger for ProcessRuntimeDAOImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ProcessRuntimeDAOImpl.class);

	private String getProcessStatus_query = "SELECT * FROM process_runlog prcs "
			+ "LEFT OUTER JOIN process_serverlog server ON server.prcs_id = prcs.prcs_id";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.dao.ProcessRuntimeDAO#
	 *      getProcessStatus()
	 */
	@SuppressWarnings("unchecked")
	public List<ProcessStatusVO> getProcessStatus()
			throws ProcessAdminServiceException {

		Iterator resultSet = super.createSQLQuery(getProcessStatus_query);
		List<ProcessStatusVO> processStatusList = new ArrayList<ProcessStatusVO>();
		if (resultSet != null) {
			while (resultSet.hasNext()) {
				Object[] tuple = (Object[]) resultSet.next();
				ProcessStatusVO processStatusVO = new ProcessStatusVO();

				try {
					if (tuple[0] != null)
						processStatusVO.setPrcsId(ObjectConverter
								.getLong(tuple[0]));
					if (tuple[1] != null)
						processStatusVO.setPrcsName(ObjectConverter
								.getString(tuple[1]));
					if (tuple[2] != null)
						processStatusVO.setPrcsStatus(ObjectConverter
								.getString(tuple[2]));
					if (tuple[3] != null)
						processStatusVO.setPrcsRunStatus(ObjectConverter
								.getString(tuple[3]));
					if (tuple[4] != null)
						processStatusVO.setPrcsRunSequence(ObjectConverter
								.getInt(tuple[4]));
					if (tuple[5] != null)
						processStatusVO.setPrcsRunStartTime(ObjectConverter
								.getTimeStamp(tuple[5]));
					if (tuple[6] != null)
						processStatusVO.setPrcsRunStopTime(ObjectConverter
								.getTimeStamp(tuple[6]));
					if (tuple[7] != null)
						processStatusVO.setPrcsMsgsRecd(ObjectConverter
								.getLong(tuple[7]));
					if (tuple[8] != null)
						processStatusVO.setPrcsMsgsError(ObjectConverter
								.getLong(tuple[8]));
					if (tuple[9] != null)
						processStatusVO.setPrcsMsgsProcessed(ObjectConverter
								.getLong(tuple[9]));
					if (tuple[10] != null)
						processStatusVO.setPrcsRunId(ObjectConverter
								.getLong(tuple[10]));
					if (tuple[11] != null)
						processStatusVO.setServerId(ObjectConverter
								.getLong(tuple[11]));
					if (tuple[12] != null)
						processStatusVO.setServerName(ObjectConverter
								.getString(tuple[12]));
				} catch (ObjectConversionException e) {
					logger.error("Error While converting the object", e);
					throw new ProcessAdminServiceException(e.getMessage());
				}
				processStatusList.add(processStatusVO);
			}
		}

		return processStatusList;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.processadmin.dao.ProcessRuntimeDAO#getProcessRunStatus(java.lang.Long)
	 */
	@SuppressWarnings("unchecked")
	public String getProcessRunStatus(Long processId)
			throws ProcessAdminServiceException {
		String query = "SELECT runtime.prcsRunStatus FROM ProcessRuntimeEO runtime "
				+ "WHERE runtime.prcsId = "
				+ processId
				+ " AND runtime.prcsRunSequence =(SELECT MAX(B.prcsRunSequence)"
				+ "FROM ProcessRuntimeEO B WHERE B.prcsId = runtime.prcsId )";

		Iterator resultSet = super.createQuery(query);
		if (resultSet != null) {
			while (resultSet.hasNext()) {
				Object status = resultSet.next();
				return status.toString();
			}
		}

		return null;

	}
}
