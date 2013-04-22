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
 * $Id: BatchSqlProducer.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Jan 20, 2009 
 */

package com.headstrong.fusion.connector.db.component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

/**
 * 
 */
public class BatchSqlProducer extends DefaultProducer {

	public static final String UPDATE_COUNT = "org.apache.camel.sql.update-count";

	private String query;

	private JdbcTemplate jdbcTemplate;

	@SuppressWarnings("unchecked")
	public BatchSqlProducer(BatchSqlEndpoint endpoint, String query,
			JdbcTemplate jdbcTemplate) {
		super(endpoint);
		this.jdbcTemplate = jdbcTemplate;
		this.query = query;
	}

	public void process(final Exchange exchange) throws Exception {

		jdbcTemplate.execute(query, new PreparedStatementCallback() {

			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				int argNumber = 1;
				/*
				 * @bug 12-04-2012 #2029,2032. Not using getBody(List.class)
				 * method as it returns null when used with QPID & IBM as
				 * Source.
				 */
				Object inputMessage = exchange.getIn().getBody();

				if (inputMessage == null) {
					throw new NullPointerException(
							"input message received is null");
				}
				List<?> body = (List) inputMessage;
				// if body contains data
				if (body.size() > 0) {

					// if the 1st data in body is list, then everything is list
					if (body.get(0) instanceof List) {
						for (Iterator<?> i = body.iterator(); i.hasNext();) {
							Object data = i.next();
							argNumber = 1;
							for (Iterator<?> j = ((List<?>) data).iterator(); j
									.hasNext();) {
								ps.setObject(argNumber++, j.next());
							}
							ps.addBatch();
						}
					} else { // only single record
						for (Iterator<?> i = body.iterator(); i.hasNext();) {
							ps.setObject(argNumber++, i.next());
						}
						ps.addBatch();
					}
				}

				int[] updateCounts = ps.executeBatch();
				int totalCount = 0;
				for (int updateCount : updateCounts) {
					totalCount = totalCount + updateCount;
				}

				exchange.getIn().setHeader(UPDATE_COUNT, totalCount);

				return null;
			}

		});
	}

}
