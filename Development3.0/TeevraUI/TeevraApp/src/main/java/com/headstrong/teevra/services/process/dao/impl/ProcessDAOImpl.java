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
 * $Id: ProcessDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.teevra.services.process.dao.impl;

import java.sql.Timestamp;
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
import com.headstrong.teevra.services.process.dao.ProcessDAO;
import com.headstrong.teevra.services.process.eo.ProcessEO;
import com.headstrong.teevra.services.process.exception.ProcessServiceException;
import com.headstrong.teevra.services.process.exception.UniqueProcessException;

/**
 * ProcessDAOImpl implements ProcessDAO and contains methods to perform CRUD
 * operations on processes.
 */
public class ProcessDAOImpl extends BaseHibernateDAO<ProcessEO> implements
		ProcessDAO {
	/**
	 * Logger for ProcessDAOImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ProcessDAOImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.dao.ProcessDAO#deleteProcess
	 *      (java.lang.Long)
	 */
	public void deleteProcess(Long processId) throws ProcessServiceException {

		// try {
		// processAdminService.stopProcess(processId);
		// } catch (ProcessAdminServiceException e) {
		// logger.error("Exception while stopping the process ", e);throw new
		// ProcessServiceException(e.getMessage());
		// }
		
		// Get the process run status from database to check if the process is
		// in running state.
		String runStatusQuery = "select count(*) from ProcessRuntimeEO process_runtime where process_runtime.prcsId= "
				+ processId + " and process_runtime.prcsRunStatus ='RUNNING'";
		Iterator resultSet = super.createQuery(runStatusQuery);

		if (resultSet != null) {
			Object resultSetItem = resultSet.next();
			if (resultSetItem != null) {
				if (Integer.parseInt(resultSetItem.toString()) > 0) {
					throw new ProcessServiceException(
							"Process is running. Cannot be deleted.");
				}
			}
		}
		String eventLogDeleteQuery = "delete from MessageEventlogEO eventlog "
				+ "where eventlog.prcsRunId in "
				+ "(select prcsRuntime.prcsRunId from ProcessRuntimeEO prcsRuntime "
				+ "where prcsRuntime.prcsId = ?)";
		bulkUpdate(eventLogDeleteQuery, new Object[] { processId });
		// delete from Process_Service_Configuration
		bulkUpdate(
				"delete from ProcessServiceConfigurationEO where prcsId = ?",
				new Object[] { processId });
		// delete from Process_Runtime table
		bulkUpdate("delete from ProcessRuntimeEO where prcsId = ?",
				new Object[] { processId });
		// delete from Process_Server table
		bulkUpdate("delete from ProcessServerEO where prcsId = ?",
				new Object[] { processId });
		// delete from Process_Schedule table
		bulkUpdate("delete from ProcessScheduleEO where prcsId = ?",
				new Object[] { processId });
		// finally delete from Process table
		bulkUpdate("delete from ProcessEO where prcsId = ?",
				new Object[] { processId });

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.dao.ProcessDAO#getProcesses()
	 */
	@SuppressWarnings("unchecked")
	public List<ProcessEO> getProcesses() throws ProcessServiceException {
		String query = "select process.prcsId,process.prcsName,process.prcsDesc,"
				+ "process.prcsStatus,process.prcsIsTemplate,"
				+ "process.prcsGrpId,process.prcsLatestVersionId,process.createdBy,"
				+ "process.createdDate,process.modifiedBy,process.modifiedDate "
				+ "from ProcessEO process";
		Iterator resultSet = super.createQuery(query);
		List<ProcessEO> processList = new ArrayList<ProcessEO>();
		if (resultSet != null) {
			while (resultSet.hasNext()) {
				Object[] tuple = (Object[]) resultSet.next();
				ProcessEO process = new ProcessEO();

				try {
					if (tuple[0] != null)
						process.setPrcsId(ObjectConverter.getLong(tuple[0]));
					if (tuple[1] != null)
						process
								.setPrcsName(ObjectConverter
										.getString(tuple[1]));
					if (tuple[2] != null)
						process
								.setPrcsDesc(ObjectConverter
										.getString(tuple[2]));
					if (tuple[3] != null)
						process.setPrcsStatus(ObjectConverter
								.getString(tuple[3]));
					if (tuple[4] != null)
						process.setPrcsIsTemplate(ObjectConverter
								.getBoolean(tuple[4]));
					if (tuple[5] != null)
						process.setPrcsGrpId(ObjectConverter.getLong(tuple[5]));
					if (tuple[6] != null)
						process.setPrcsLatestVersionId(ObjectConverter
								.getLong(tuple[6]));
					if (tuple[7] != null)
						process.setCreatedBy(ObjectConverter
								.getString(tuple[7]));
					if (tuple[8] != null)
						process.setCreatedDate(ObjectConverter
								.getTimeStamp(tuple[8]));
					if (tuple[9] != null)
						process.setModifiedBy(ObjectConverter
								.getString(tuple[9]));
					if (tuple[10] != null)
						process.setModifiedDate(ObjectConverter
								.getTimeStamp(tuple[10]));
				} catch (ObjectConversionException e) {
					logger.error("Error While converting the object", e);
					throw new ProcessServiceException(e.getMessage());
				}
				processList.add(process);
			}
		}

		return processList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.dao.ProcessDAO#getProcesses
	 *      (com.headstrong.teevra.services.process.eo.ProcessEO)
	 */
	public List<ProcessEO> getProcesses(ProcessEO criteria)
			throws ProcessServiceException {

		return super.getByCriteria(DetachedCriteria.forClass(ProcessEO.class)
				.add(Restrictions.eq("prcsId", criteria.getPrcsId())));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.teevra.services.process.dao.ProcessDAO#saveProcess(
	 *      com.headstrong.teevra.services.process.eo.ProcessEO)
	 */
	public void saveProcess(ProcessEO processToSave)
			throws ProcessServiceException {

		DetachedCriteria criteria = DetachedCriteria.forClass(ProcessEO.class);
		criteria.add(Restrictions.eq("prcsName", processToSave.getPrcsName()));
		// processToSave.getPrcsId() != null, it means the process is not new so
		// we set the modified details whenever the process is to be saved
		if (processToSave.getPrcsId() != null) {
			criteria.add(Restrictions.ne("prcsId", processToSave.getPrcsId()));
			// set process modified details
			processToSave.setModifiedBy(System.getProperty("user.name"));
			processToSave.setModifiedDate(new Timestamp(System
					.currentTimeMillis()));
		}

		List<ProcessEO> processList = super.getByCriteria(criteria);

		if (!processList.isEmpty()) {
			logger
					.error("Couldn't save process: "
							+ processToSave.getPrcsName()
							+ ". A process with the same name already exists in the system");
			throw new UniqueProcessException("A process with the name " + "'"
					+ processToSave.getPrcsName() + "'"
					+ " already exists in the system");
		} else {
			super.saveOrUpdate(processToSave);
		}

	}
}
