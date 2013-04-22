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
 * $Id: MessageEventlogDAOTest.java
 * $Revision:
 * $Author: ViswanathP
 * $DateTime: Dec 17, 2008
 */

package com.headstrong.teevra.services.processadmin.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import com.headstrong.teevra.common.dao.AbstractDAOTestCase;
import com.headstrong.teevra.common.dao.hibernate.HibernateUtil;
import com.headstrong.teevra.common.util.CreateQueries;
import com.headstrong.teevra.common.util.DropQueries;
import com.headstrong.teevra.common.util.InsertParamsGenerator;
import com.headstrong.teevra.common.util.InsertQueries;
import com.headstrong.teevra.services.process.eo.ProcessEO;
import com.headstrong.teevra.services.processadmin.dao.MessageEventlogDAO;
import com.headstrong.teevra.services.processadmin.eo.MessageEventlogEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;

/**
 * 
 */
public class MessageEventlogDAOTest extends AbstractDAOTestCase {

	private MessageEventlogDAO messageEventlogDAO;

	public void onSetUp() {
		messageEventlogDAO = (MessageEventlogDAO) getBean("messageEventlogDAO");

		HibernateUtil.setUp();
		// create process and process_runtime tables and insert one record into
		// process table, two records into process_runtime table
		HibernateUtil.createTable(CreateQueries.create_process_Table);
		HibernateUtil.createTable(CreateQueries.create_process_runtime_Table);

		List<Object> processParamList = InsertParamsGenerator.setProcessParams(
				new Long(1), "test_process", "process for unit testing",
				ProcessEO.STATUS_UNPUBLISHED, new Long(0), new Long(0), false,
				true, null, null, System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null, 0, 0);

		List<Object> processRuntimeParamList1 = InsertParamsGenerator
				.setProcessRuntimeParams(new Long(1), new Long(1), new Long(1),
						1, "RUNNING",
						new Timestamp(System.currentTimeMillis()),
						new Timestamp(System.currentTimeMillis()), new Long(5),
						new Long(1), new Long(4), System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> processRuntimeParamList2 = InsertParamsGenerator
				.setProcessRuntimeParams(new Long(2), new Long(1), new Long(1),
						2, "STOPPED",
						new Timestamp(System.currentTimeMillis()),
						new Timestamp(System.currentTimeMillis()), new Long(5),
						new Long(1), new Long(4), System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil
				.insertData(InsertQueries.insert_process, processParamList);
		HibernateUtil.insertData(InsertQueries.insert_process_runtime,
				processRuntimeParamList1);
		HibernateUtil.insertData(InsertQueries.insert_process_runtime,
				processRuntimeParamList2);

		// create message_eventlog table
		HibernateUtil.createTable(CreateQueries.create_message_eventlog_Table);

	}

	public void testGetErrorLogs() {
		System.out.println("TESTING GetErrorLogs");
		// insert 2 records
		List<Object> messageEventLongParamList1 = InsertParamsGenerator
				.setMessageEventlogParams(new Long(1), new Long(1),
						new Long(1), new Long(0), new Long(0), "ERROR",
						new Timestamp(System.currentTimeMillis()),
						"LOG MESSAGE", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						"MESSAGE DATA");

		List<Object> messageEventLongParamList2 = InsertParamsGenerator
				.setMessageEventlogParams(new Long(2), new Long(1),
						new Long(2), new Long(0), new Long(0), "FINISHED",
						new Timestamp(System.currentTimeMillis()),
						"LOG MESSAGE", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						"MESSAGE DATA");

		HibernateUtil.insertData(InsertQueries.insert_message_eventlog,
				messageEventLongParamList1);
		HibernateUtil.insertData(InsertQueries.insert_message_eventlog,
				messageEventLongParamList2);

		List<MessageEventlogEO> messageEventLogList = new ArrayList<MessageEventlogEO>();
		// call the method to test
		try {
			messageEventLogList = messageEventlogDAO.getErrorLogs();
		} catch (ProcessAdminServiceException e) {
			fail("failed while retrieving Error Logs ");
			e.printStackTrace();
		}

		Assert.assertSame(1, messageEventLogList.size());
	}

	public void testIdBaseGetErrorLogs() {
		System.out.println("TESTING Id based GetErrorLogs");
		// insert 3 records
		List<Object> messageEventLongParamList1 = InsertParamsGenerator
				.setMessageEventlogParams(new Long(1), new Long(1),
						new Long(1), new Long(0), new Long(0), "ERROR",
						new Timestamp(System.currentTimeMillis()),
						"LOG MESSAGE", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						"MESSAGE DATA");

		List<Object> messageEventLongParamList2 = InsertParamsGenerator
				.setMessageEventlogParams(new Long(2), new Long(2),
						new Long(2), new Long(0), new Long(0), "ERROR",
						new Timestamp(System.currentTimeMillis()),
						"LOG MESSAGE1", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						"MESSAGE DATA1");

		List<Object> messageEventLongParamList3 = InsertParamsGenerator
				.setMessageEventlogParams(new Long(3), new Long(2),
						new Long(2), new Long(0), new Long(0), "ERROR",
						new Timestamp(System.currentTimeMillis()),
						"LOG MESSAGE2", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						"MESSAGE DATA2");

		HibernateUtil.insertData(InsertQueries.insert_message_eventlog,
				messageEventLongParamList1);
		HibernateUtil.insertData(InsertQueries.insert_message_eventlog,
				messageEventLongParamList2);
		HibernateUtil.insertData(InsertQueries.insert_message_eventlog,
				messageEventLongParamList3);

		List<MessageEventlogEO> messageEventLogList = new ArrayList<MessageEventlogEO>();

		try {
			messageEventLogList = messageEventlogDAO.getErrorLogs(new Long(2));
		} catch (ProcessAdminServiceException e) {
			fail("failed while retrieving Error Logs based on process run id");
			e.printStackTrace();
		}

		Assert.assertSame(2, messageEventLogList.size());

	}

	public void testGetMessageData() {
		System.out.println("TESTING GetMessageData");
		// insert 2 records
		List<Object> messageEventLongParamList1 = InsertParamsGenerator
				.setMessageEventlogParams(new Long(1), new Long(1),
						new Long(1), new Long(0), new Long(0), "ERROR",
						new Timestamp(System.currentTimeMillis()),
						"LOG MESSAGE", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						"MESSAGE DATA1");

		HibernateUtil.insertData(InsertQueries.insert_message_eventlog,
				messageEventLongParamList1);
		MessageEventlogEO messageEventLog = new MessageEventlogEO();
		try {
			messageEventLog = messageEventlogDAO.getMessageData(new Long(1))
					.get(0);
		} catch (ProcessAdminServiceException e) {
			fail("Failed while retrieving message eventlog list for message data");
			e.printStackTrace();
		}

		Assert.assertEquals("MESSAGE DATA1", messageEventLog.getMessageData());

		List<Object> messageEventLongParamList2 = InsertParamsGenerator
				.setMessageEventlogParams(new Long(2), new Long(2),
						new Long(2), new Long(0), new Long(0), "ERROR",
						new Timestamp(System.currentTimeMillis()),
						"LOG MESSAGE1", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						"MESSAGE DATA2");
		HibernateUtil.insertData(InsertQueries.insert_message_eventlog,
				messageEventLongParamList2);
		try {
			messageEventLog = messageEventlogDAO.getMessageData(new Long(2))
					.get(0);
		} catch (ProcessAdminServiceException e) {
			fail("Failed while retrieving message eventlog list for message data");
			e.printStackTrace();
		}

		Assert.assertEquals("MESSAGE DATA2", messageEventLog.getMessageData());

	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_message_eventlog_Table);
		HibernateUtil.executeQuery(DropQueries.drop_process_runtime_Table);
		HibernateUtil.executeQuery(DropQueries.drop_process_Table);
		HibernateUtil.shutDown();
	}
}
