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
 * $Id: ConditionalDBProducer.java
 * $Revision: 
 * $Author: 
 * $DateTime: 
 */

package com.headstrong.fusion.connector.conditionaldb;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.commons.component.FusionServiceSupport;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * 
 * 
 */
public class ConditionalDBProducer implements FusionProducer<MessageExchange> {
	private static Logger logger = LoggerFactory
			.getLogger(ConditionalDBProducer.class);

	// private ConditionalDBEndpoint condDBEndpoint;
	private ConditionalDBConfiguration condDBBinding;
	public static final String UPDATE_COUNT = "org.apache.camel.sql.update-count";
	public static final String DELIMITER = ":";
	public static final int BATCH_SIZE = 50000;
	private DataSource dataSource = null;
	private String insertQuery;
	private String deleteQuery;
	private String delPkStr;
	private String insertTempQuery;
	private String truncateTempQuery;

	private JdbcTemplate jdbcTemplate;

	FusionServiceSupport serviceSupport;

	public ConditionalDBProducer(ConditionalDBEndpoint condDBEndpoint)
			throws FusionException {
		this.condDBBinding = condDBEndpoint.getconditionalDBBinding();
		this.insertQuery = condDBBinding.getInsertQuery();
		this.deleteQuery = condDBBinding.getDelQuery();
		this.delPkStr = condDBBinding.getdelPkStr();
		this.insertTempQuery = condDBBinding.getInsertTempQuery();
		this.truncateTempQuery = condDBBinding.getTruncateTempQuery();

		DbPool dbPool = DatabaseManager.getInstance(condDBBinding
				.getDataSource());
		if (dbPool == null) {
			throw new FusionException(
					"Exception while trying to create a datasource with name "
							+ condDBBinding.getDataSource());
		}
		dataSource = dbPool.getDataSource();
		/*
		 * DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 * dataSource.setUrl( condDBBinding.getUrl());
		 * dataSource.setUsername(condDBBinding.getUserName());
		 * dataSource.setPassword(condDBBinding.getPassword());
		 */
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionProducer#process(com.headstrong.fusion.commons.MessageExchange)
	 */
	public void process(final MessageExchange exchange) throws Exception {

//		// extracting the list of Primary key index
//		final String delPkList[] = delPkStr.split(DELIMITER);

		// insert into temp table
		logger.debug("Insert into temporary table operation started @ "
				+ System.currentTimeMillis());
		insertData(insertTempQuery, exchange);
		logger.debug("Insert into temporary table operation ended @ "
				+ System.currentTimeMillis());
		// delete from the base table
		logger.debug("delete operation from main table started @ "
				+ System.currentTimeMillis());
		jdbcTemplate.execute(deleteQuery);

		logger.debug("delete operation from main table ended @ "
				+ System.currentTimeMillis());
		// insert into base table
		logger.debug("Insert into main table operation started @ "
				+ System.currentTimeMillis());
		insertData(insertQuery, exchange);

		logger.debug("Insert into main table operation ended @ "
				+ System.currentTimeMillis());

		// truncate temp table
		logger.debug("Truncate temporary table operation started @ "
				+ System.currentTimeMillis());
		jdbcTemplate.execute(truncateTempQuery);
		logger.debug("Truncate temporary table operation ended @ "
				+ System.currentTimeMillis());
	}

	private void insertData(String query, final MessageExchange exchange)
			throws FusionException {

		jdbcTemplate.execute(query, new PreparedStatementCallback() {

			public Object doInPreparedStatement(PreparedStatement ps)
					throws SQLException, DataAccessException {
				int argNumber = 1;
				int batchCount = 0;
				int totalCount = 0;
				int[] updateCounts;
				List<?> body = exchange.getIn().getBody(List.class);

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
							batchCount++;
							if (batchCount >= BATCH_SIZE) {

								updateCounts = ps.executeBatch();
								for (int updateCount : updateCounts) {
									totalCount = totalCount + updateCount;
								}
								logger
										.debug("Total number of records inserted : "
												+ totalCount
												+ " BatchCount : "
												+ batchCount);
								batchCount = 0;
							}
						}
					} else { // only single record
						for (Iterator<?> i = body.iterator(); i.hasNext();) {
							ps.setObject(argNumber++, i.next());
						}
						ps.addBatch();
					}
				}

				updateCounts = ps.executeBatch();
				// int totalCount = 0;
				for (int updateCount : updateCounts) {
					totalCount = totalCount + updateCount;
				}
				logger
						.debug("Total number of records inserted : "
								+ totalCount);
				exchange.getIn().setHeader(UPDATE_COUNT, totalCount);

				return null;
			}

		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#start()
	 */
	public void start() throws Exception {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#stop()
	 */
	public void stop() throws Exception {

	}

	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {
		this.serviceSupport = serviceSupport;

	}
}
