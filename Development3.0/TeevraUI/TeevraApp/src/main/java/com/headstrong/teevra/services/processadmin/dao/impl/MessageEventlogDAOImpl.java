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
 * $Id: MessageEventlogDAOImpl.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 17, 2008 
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
import com.headstrong.teevra.services.processadmin.dao.MessageEventlogDAO;
import com.headstrong.teevra.services.processadmin.eo.MessageEventlogEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;

/**
 * MessageEventlogDAOImpl implements ProcessRuntimeDAO and performs operations
 * to get error logs and message data
 */
public class MessageEventlogDAOImpl extends BaseHibernateDAO<MessageEventlogEO>
		implements MessageEventlogDAO {

	/**
	 * Logger for MessageEventlogDAOImpl
	 */
	private static Logger logger = LoggerFactory
			.getLogger(MessageEventlogDAOImpl.class);

	private static String NO_ERR_DETAILS_MSGDATA = "No details of error record available";

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.teevra.services.processadmin.MessageEventlogDAO#
	 * getErrorLogs(long)
	 */
	@SuppressWarnings("unchecked")
	public List<MessageEventlogEO> getErrorLogs(Long prcsRunId)
			throws ProcessAdminServiceException {
		String query = null;
		query = "select "
				+ "eventlog.messageEventlogId,eventlog.prcsRunId,prcsRuntime.prcsId,prcs.prcsName,"
				+ "eventlog.logMessage,eventlog.savepointTime "
				+ "from MessageEventlogEO eventlog,ProcessRuntimeEO prcsRuntime,ProcessEO prcs "
				+ "where eventlog.prcsRunId = prcsRuntime.prcsRunId "
				+ "and prcsRuntime.prcsId = prcs.prcsId "
				+ "and  eventlog.savepointName='ERROR'"
				+ "and eventlog.prcsRunId =" + prcsRunId;

		Iterator resultSet = super.createQuery(query);
		List<MessageEventlogEO> errorLogs = new ArrayList<MessageEventlogEO>();

		if (resultSet != null) {
			while (resultSet.hasNext()) {
				Object[] tuple = (Object[]) resultSet.next();
				MessageEventlogEO eventLog = new MessageEventlogEO();
				try {
					if (tuple[0] != null)
						eventLog.setMessageEventlogId(ObjectConverter
								.getLong(tuple[0]));
					if (tuple[1] != null)
						eventLog
								.setPrcsRunId(ObjectConverter.getLong(tuple[1]));
					if (tuple[2] != null)
						eventLog.setPrcsId(ObjectConverter.getLong(tuple[2]));
					if (tuple[3] != null)
						eventLog.setPrcsName(ObjectConverter
								.getString(tuple[3]));
					if (tuple[4] != null){
						String logMsg = ObjectConverter.getString(tuple[4]);
						if(logMsg != null && logMsg.length() > 500){
							logMsg = logMsg.substring(0, 500) + "...";
						}
						eventLog.setLogMessage(logMsg);
					}
					if (tuple[5] != null)
						eventLog.setSavepointTime(ObjectConverter
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

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.teevra.services.processadmin.MessageEventlogDAO#
	 * getErrorLogs()
	 */
	@SuppressWarnings("unchecked")
	public List<MessageEventlogEO> getErrorLogs()
			throws ProcessAdminServiceException {
		String query = null;
		query = "select "
				+ "eventlog.messageEventlogId,eventlog.prcsRunId,prcsRuntime.prcsId,prcs.prcsName,"
				+ "eventlog.logMessage,eventlog.savepointTime "
				+ "from MessageEventlogEO eventlog,ProcessRuntimeEO prcsRuntime,ProcessEO prcs "
				+ "where eventlog.prcsRunId = prcsRuntime.prcsRunId "
				+ "and prcsRuntime.prcsId = prcs.prcsId "
				+ "and  eventlog.savepointName='ERROR'";
		Iterator resultSet = super.createQuery(query);
		List<MessageEventlogEO> errorLogs = new ArrayList<MessageEventlogEO>();

		if (resultSet != null) {
			while (resultSet.hasNext()) {
				Object[] tuple = (Object[]) resultSet.next();
				MessageEventlogEO eventLog = new MessageEventlogEO();
				try {
					if (tuple[0] != null)
						eventLog.setMessageEventlogId(ObjectConverter
								.getLong(tuple[0]));
					if (tuple[1] != null)
						eventLog
								.setPrcsRunId(ObjectConverter.getLong(tuple[1]));
					if (tuple[2] != null)
						eventLog.setPrcsId(ObjectConverter.getLong(tuple[2]));
					if (tuple[3] != null)
						eventLog.setPrcsName(ObjectConverter
								.getString(tuple[3]));
					if (tuple[4] != null){
						String logMsg = ObjectConverter.getString(tuple[4]);
						if(logMsg != null && logMsg.length() > 500){
							logMsg = logMsg.substring(0, 500) + "...";
						}
						eventLog.setLogMessage(logMsg);
					}
					if (tuple[5] != null)
						eventLog.setSavepointTime(ObjectConverter
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

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.teevra.services.processadmin.MessageEventlogDAO#
	 * getMessageData(long)
	 */
	@SuppressWarnings("unchecked")
	public List<MessageEventlogEO> getMessageData(Long messageEventlogId)
			throws ProcessAdminServiceException {

		String query = null;
		query = "select "
				+ "prcs.prcsName,eventlog.prcsRunId,eventlog.savepointTime,"
				+ "eventlog.logMessage,eventlog.messageData "
				+ "from MessageEventlogEO eventlog,ProcessRuntimeEO prcsRuntime,ProcessEO prcs "
				+ "where eventlog.prcsRunId = prcsRuntime.prcsRunId "
				+ "and prcsRuntime.prcsId = prcs.prcsId "
				+ "and eventlog.messageEventlogId =" + messageEventlogId;

		Iterator resultSet = super.createQuery(query);
		List<MessageEventlogEO> messageDetails = new ArrayList<MessageEventlogEO>();

		if (resultSet != null) {
			while (resultSet.hasNext()) {
				Object[] tuple = (Object[]) resultSet.next();
				MessageEventlogEO eventLog = new MessageEventlogEO();
				try {

					if (tuple[0] != null)
						eventLog.setPrcsName(ObjectConverter
								.getString(tuple[0]));
					if (tuple[1] != null)
						eventLog
								.setPrcsRunId(ObjectConverter.getLong(tuple[1]));
					if (tuple[2] != null)
						eventLog.setSavepointTime(ObjectConverter
								.getTimeStamp(tuple[2]));
					if (tuple[3] != null)
						eventLog.setLogMessage(ObjectConverter
								.getString(tuple[3]));
					if (tuple[4] != null) {
						eventLog.setMessageData(ObjectConverter
								.getString(tuple[4]));
					} else {
						eventLog.setMessageData(NO_ERR_DETAILS_MSGDATA);
					}
				} catch (ObjectConversionException e) {
					logger.error("Error While converting the object", e);
					throw new ProcessAdminServiceException(e.getMessage());
				}
				messageDetails.add(eventLog);
			}
		}

		return messageDetails;
	}

}
