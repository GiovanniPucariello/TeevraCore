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
 * $Id: DbUpdateProcessor.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Dec 1, 2008 
 */

package com.headstrong.fusion.messaging.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sql.DataSource;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 */
public class DbUpdateProcessor implements Processor {

	private static Logger logger = LoggerFactory
			.getLogger(DbUpdateProcessor.class);
	private String updateSQL;
	private List<String> parameterList;
	private DataSource dataSource;

	public DbUpdateProcessor(String updateSQL) {
		Pattern regEx = Pattern.compile("(#)([a-zA-Z0-9_ ]*)(#)");
		Matcher m = regEx.matcher(updateSQL);
		StringBuffer sb = new StringBuffer();
		this.parameterList = new ArrayList<String>();
		boolean result = m.find();
		// Loop through and create a new String
		// with the replacements 
		while (result) {
			m.appendReplacement(sb, "?");
			this.parameterList.add(m.group(2).substring(0));
			result = m.find();
		}

		m.appendTail(sb);
		this.updateSQL = sb.toString();
		if (logger.isDebugEnabled()) {
			logger.debug("Update DB String is :" + this.updateSQL);
			logger.debug("Parameters are :" + this.parameterList);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	@SuppressWarnings("unchecked")
	public void process(Exchange exchange) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("Using headers :" + exchange.getIn().getHeaders());
		}

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			List body = exchange.getIn().getBody(List.class);
			List<Map<String, Object>> listData = body;
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(updateSQL);
			exchange.getIn().setHeader("totalrecords", listData.size());

			if (listData.size() > 0) {
				for (Map<String, Object> data : listData) {
					for (int i = 0; i < parameterList.size(); i++) {
						ps.setObject(i + 1, data.get(parameterList.get(i)));
					}
					ps.addBatch();
				}
				ps.executeBatch();
			} 
		} catch (Exception e) {
			logger.error("Error while updating DB", e);
			throw e;
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (Exception e) {
				logger.error("Error while closing connection", e);
			}
		}

	}

	/**
	 * @return the updateSQL
	 */
	public String getUpdateSQL() {
		return updateSQL;
	}

	/**
	 * @return the parameterList
	 */
	public List<String> getParameterList() {
		return parameterList;
	}

	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource
	 *            the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
