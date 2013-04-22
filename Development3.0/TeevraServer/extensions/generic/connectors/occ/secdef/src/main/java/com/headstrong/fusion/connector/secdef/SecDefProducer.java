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

package com.headstrong.fusion.connector.secdef;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.commons.component.FusionServiceSupport;
import com.headstrong.fusion.commons.exception.FusionException;

/**
 * SecDef Producer.
 */
public class SecDefProducer implements FusionProducer<MessageExchange> {
	private static Logger logger = LoggerFactory
			.getLogger(SecDefProducer.class);

	// private ConditionalDBEndpoint condDBEndpoint;
	private SecDefConfiguration condDBBinding;
	public static final String UPDATE_COUNT = "org.apache.camel.sql.update-count";
	public static final String DELIMITER = ":";
	public static final int BATCH_SIZE = 50000;
	private static final String INSERT_INTO_OCCSECDEFINSTRMT = "INSERT INTO OCCSecDefInstrmt(Sym,Description,CFI,Status,Ccy,StrkCcy,StrkMult,Mult,StrkValu,SettlOnOpenFlag,AsgnMeth,CapValu,PosLmt,NTPosLmt,PPInd,FirstTradingDate,LastTradingDate) "
			+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String DELETE_OCCSECDEFINSTRMT = "DELETE OCCSecDefInstrmt WHERE Sym=? AND Description=? AND CFI=?";
	private static final String INSERT_INTO_OCCSECDEFPTY = "INSERT INTO OCCSecDefPty(Sym,Description,CFI,ID,R,SubID,Typ) "
			+ "VALUES(?,?,?,?,?,?,?)";
	private static final String DELETE_OCCSECDEFPTY = "DELETE OCCSecDefPty WHERE Sym=? AND Description=? AND CFI=?";
	private static final String INSERT_INTO_OCCSECDEFUNDLY = "INSERT INTO OCCSecDefUndly(Sym,Description,CFI,UnderlyingSym,ID,Src,UnderlyingCFI,AllocPct,Qty,SettlTyp,SetMeth,SettlStat,CashAmt,CashTyp) "
			+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static final String DELETE_OCCSECDEFUNDLY = "DELETE OCCSecDefUndly WHERE Sym=? AND Description=? AND CFI=?";

	private JdbcTemplate jdbcTemplate;

	FusionServiceSupport serviceSupport;

	public SecDefProducer(SecDefEndpoint condDBEndpoint) {
		this.condDBBinding = condDBEndpoint.getconditionalDBBinding();
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(condDBBinding.getUrl());
		dataSource.setUsername(condDBBinding.getUserName());
		dataSource.setPassword(condDBBinding.getPassword());
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionProducer#process(com.headstrong.fusion.commons.MessageExchange)
	 */
	public void process(final MessageExchange exchange) throws Exception {
		deleteInstrument(exchange);
		insertInstrument(exchange);
		deletePty(exchange);
		insertPty(exchange);
		deleteUndly(exchange);
		insertUndly(exchange);
		
	}
	
	private void deleteInstrument(final MessageExchange exchange){
		// executing the delete query
		jdbcTemplate.execute(DELETE_OCCSECDEFINSTRMT,
				new PreparedStatementCallback() {
					public Object doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
						int batchCount = 0;
						int totalCount = 0;
						int[] updateCounts;
						Object body = exchange.getIn().getBody();
						// if the 1st data in body is list, then everything
						// is list
						if (body instanceof List) {
							for (Iterator<?> i = ((List) body).iterator(); i
									.hasNext();) {
								BusinessObject businessObject = (BusinessObject) i
										.next();
								// set all the rows..
								try {
									List<BusinessObject> secDefUpdateList = (List) businessObject
											.getValue("SecDefUpd");
									for (BusinessObject secDefUpdate : secDefUpdateList) {
										BusinessObject instrument = (BusinessObject) secDefUpdate
												.getValue("Instrmt");
										createDeletePreparedStatement(
												ps, instrument);
										ps.addBatch();
										batchCount++;
										if (batchCount >= BATCH_SIZE) {
											batchCount = 0;
											updateCounts = ps.executeBatch();
											for (int updateCount : updateCounts) {
												totalCount = totalCount
														+ updateCount;
											}
										}
									}
								} catch (AttributeNotFoundException e) {
									throw new SQLException(e);
								} catch (InvalidAttributeExpressionException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						} else { // only single record
							// set all the rows..
							try {
								List<BusinessObject> secDefUpdateList = (List) ((BusinessObject) body)
										.getValue("SecDefUpd");
								for (BusinessObject secDefUpdate : secDefUpdateList) {
									BusinessObject instrument = (BusinessObject) secDefUpdate
											.getValue("Instrmt");
									createDeletePreparedStatement(ps,instrument);
									ps.addBatch();
									batchCount++;
									if (batchCount >= BATCH_SIZE) {
										batchCount = 0;
										updateCounts = ps.executeBatch();
										for (int updateCount : updateCounts) {
											totalCount = totalCount
													+ updateCount;
										}
									}
								}
							} catch (AttributeNotFoundException e) {
								throw new SQLException(e);
							} catch (InvalidAttributeExpressionException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						updateCounts = ps.executeBatch();
						for (int updateCount : updateCounts) {
							totalCount = totalCount + updateCount;
						}
						logger.debug("Total number of records deleted : "
								+ totalCount);
						exchange.getIn().setHeader(UPDATE_COUNT, totalCount);
						return null;
					}
				});
	
	}
	
	private void insertInstrument(final MessageExchange exchange) {
		// executing the insert query
		jdbcTemplate.execute(INSERT_INTO_OCCSECDEFINSTRMT,
				new PreparedStatementCallback() {
					public Object doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
						int batchCount = 0;
						int totalCount = 0;
						int[] updateCounts;
						Object body = exchange.getIn().getBody();
						// if the 1st data in body is list, then everything
						// is list
						if (body instanceof List) {
							for (Iterator<?> i = ((List) body).iterator(); i
									.hasNext();) {
								BusinessObject businessObject = (BusinessObject) i
										.next();
								// set all the rows..
								try {
									List<BusinessObject> secDefUpdateList = (List) businessObject
											.getValue("SecDefUpd");
									for (BusinessObject secDefUpdate : secDefUpdateList) {
										BusinessObject instrument = (BusinessObject) secDefUpdate
												.getValue("Instrmt");
										createInstrumentPreparedStatement(ps,
												secDefUpdate, instrument);
										ps.addBatch();
										batchCount++;
										if (batchCount >= BATCH_SIZE) {
											batchCount = 0;
											updateCounts = ps.executeBatch();
											for (int updateCount : updateCounts) {
												totalCount = totalCount
														+ updateCount;
											}
										}
									}
								} catch (AttributeNotFoundException e) {
									throw new SQLException(e);
								} catch (InvalidAttributeExpressionException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						} else { // only single record
							// set all the rows..
							try {
								List<BusinessObject> secDefUpdateList = (List) ((BusinessObject) body)
										.getValue("SecDefUpd");
								for (BusinessObject secDefUpdate : secDefUpdateList) {
									BusinessObject instrument = (BusinessObject) secDefUpdate
											.getValue("Instrmt");
									createInstrumentPreparedStatement(ps,
											secDefUpdate, instrument);
									ps.addBatch();
									batchCount++;
									if (batchCount >= BATCH_SIZE) {
										batchCount = 0;
										updateCounts = ps.executeBatch();
										for (int updateCount : updateCounts) {
											totalCount = totalCount
													+ updateCount;
										}
									}
								}
							} catch (AttributeNotFoundException e) {
								throw new SQLException(e);
							} catch (InvalidAttributeExpressionException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						updateCounts = ps.executeBatch();
						for (int updateCount : updateCounts) {
							totalCount = totalCount + updateCount;
						}
						logger.debug("Total number of records inserted : "
								+ totalCount);
						exchange.getIn().setHeader(UPDATE_COUNT, totalCount);
						return null;
					}
				});
	}

	private void deletePty(final MessageExchange exchange){
		// executing the delete query
		jdbcTemplate.execute(DELETE_OCCSECDEFPTY,
				new PreparedStatementCallback() {
					public Object doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
						int batchCount = 0;
						int totalCount = 0;
						int[] updateCounts;
						Object body = exchange.getIn().getBody();
						// if the 1st data in body is list, then everything
						// is list
						if (body instanceof List) {
							for (Iterator<?> i = ((List) body).iterator(); i
									.hasNext();) {
								BusinessObject businessObject = (BusinessObject) i
										.next();
								// set all the rows..
								try {
									List<BusinessObject> secDefUpdateList = (List) businessObject
											.getValue("SecDefUpd");
									for (BusinessObject secDefUpdate : secDefUpdateList) {
										BusinessObject instrument = (BusinessObject) secDefUpdate
												.getValue("Instrmt");
										createDeletePreparedStatement(
												ps, instrument);
										ps.addBatch();
										batchCount++;
										if (batchCount >= BATCH_SIZE) {
											batchCount = 0;
											updateCounts = ps.executeBatch();
											for (int updateCount : updateCounts) {
												totalCount = totalCount
														+ updateCount;
											}
										}
									}
								} catch (AttributeNotFoundException e) {
									throw new SQLException(e);
								} catch (InvalidAttributeExpressionException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						} else { // only single record
							// set all the rows..
							try {
								List<BusinessObject> secDefUpdateList = (List) ((BusinessObject) body)
										.getValue("SecDefUpd");
								for (BusinessObject secDefUpdate : secDefUpdateList) {
									BusinessObject instrument = (BusinessObject) secDefUpdate
											.getValue("Instrmt");
									createDeletePreparedStatement(ps,instrument);
									ps.addBatch();
									batchCount++;
									if (batchCount >= BATCH_SIZE) {
										batchCount = 0;
										updateCounts = ps.executeBatch();
										for (int updateCount : updateCounts) {
											totalCount = totalCount
													+ updateCount;
										}
									}
								}
							} catch (AttributeNotFoundException e) {
								throw new SQLException(e);
							} catch (InvalidAttributeExpressionException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						updateCounts = ps.executeBatch();
						for (int updateCount : updateCounts) {
							totalCount = totalCount + updateCount;
						}
						logger.debug("Total number of records deleted : "
								+ totalCount);
						exchange.getIn().setHeader(UPDATE_COUNT, totalCount);
						return null;
					}
				});
	
	}
	private void insertPty(final MessageExchange exchange) {
		// executing the insert query
		jdbcTemplate.execute(INSERT_INTO_OCCSECDEFPTY,
				new PreparedStatementCallback() {
					public Object doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
						int batchCount = 0;
						int totalCount = 0;
						int[] updateCounts;
						Object body = exchange.getIn().getBody();
						// if the 1st data in body is list, then everything
						// is list
						if (body instanceof List) {
							for (Iterator<?> i = ((List) body).iterator(); i
									.hasNext();) {
								BusinessObject businessObject = (BusinessObject) i
										.next();
								// set all the rows..
								try {
									List<BusinessObject> secDefUpdateList = (List) businessObject
											.getValue("SecDefUpd");
									for (BusinessObject secDefUpdate : secDefUpdateList) {
										BusinessObject instrument = (BusinessObject) secDefUpdate
												.getValue("Instrmt");
										if (instrument.getValue("Pty") != null) {
											List<BusinessObject> ptyList = (List) instrument
													.getValue("Pty");
											for (BusinessObject pty : ptyList) {
												createPtyPreparedStatement(ps,
														instrument, pty);
												ps.addBatch();
												batchCount++;
												if (batchCount >= BATCH_SIZE) {
													updateCounts = ps
															.executeBatch();
													for (int updateCount : updateCounts) {
														totalCount = totalCount
																+ updateCount;
													}
													logger
															.info("Total number of records inserted : "
																	+ totalCount
																	+ " BatchCount : "
																	+ batchCount);
													batchCount = 0;
												}
											}
										}

									}
								} catch (AttributeNotFoundException e) {
									throw new SQLException(e);
								} catch (InvalidAttributeExpressionException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						} else { // only single record
							// set all the rows..
							try {
								List<BusinessObject> secDefUpdateList = (List) ((BusinessObject) body)
										.getValue("SecDefUpd");
								for (BusinessObject secDefUpdate : secDefUpdateList) {
									BusinessObject instrument = (BusinessObject) secDefUpdate
											.getValue("Instrmt");
									if (instrument.getValue("Pty") != null) {
										List<BusinessObject> ptyList = (List) instrument
												.getValue("Pty");
										for (BusinessObject pty : ptyList) {
											createPtyPreparedStatement(ps,
													instrument, pty);
											ps.addBatch();
											batchCount++;
											if (batchCount >= BATCH_SIZE) {
												updateCounts = ps
														.executeBatch();
												for (int updateCount : updateCounts) {
													totalCount = totalCount
															+ updateCount;
												}
												logger
														.info("Total number of records inserted : "
																+ totalCount
																+ " BatchCount : "
																+ batchCount);
												batchCount = 0;
											}
										}
									}

								}
							} catch (AttributeNotFoundException e) {
								throw new SQLException(e);
							} catch (InvalidAttributeExpressionException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						updateCounts = ps.executeBatch();
						// int totalCount = 0;
						for (int updateCount : updateCounts) {
							totalCount = totalCount + updateCount;
						}
						logger.debug("Total number of records inserted : "
								+ totalCount);
						exchange.getIn().setHeader(UPDATE_COUNT, totalCount);
						return null;
					}

				});
	}

	private void deleteUndly(final MessageExchange exchange){
		// executing the delete query
		jdbcTemplate.execute(DELETE_OCCSECDEFUNDLY,
				new PreparedStatementCallback() {
					public Object doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
						int batchCount = 0;
						int totalCount = 0;
						int[] updateCounts;
						Object body = exchange.getIn().getBody();
						// if the 1st data in body is list, then everything
						// is list
						if (body instanceof List) {
							for (Iterator<?> i = ((List) body).iterator(); i
									.hasNext();) {
								BusinessObject businessObject = (BusinessObject) i
										.next();
								// set all the rows..
								try {
									List<BusinessObject> secDefUpdateList = (List) businessObject
											.getValue("SecDefUpd");
									for (BusinessObject secDefUpdate : secDefUpdateList) {
										BusinessObject instrument = (BusinessObject) secDefUpdate
												.getValue("Instrmt");
										createDeletePreparedStatement(
												ps, instrument);
										ps.addBatch();
										batchCount++;
										if (batchCount >= BATCH_SIZE) {
											batchCount = 0;
											updateCounts = ps.executeBatch();
											for (int updateCount : updateCounts) {
												totalCount = totalCount
														+ updateCount;
											}
										}
									}
								} catch (AttributeNotFoundException e) {
									throw new SQLException(e);
								} catch (InvalidAttributeExpressionException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						} else { // only single record
							// set all the rows..
							try {
								List<BusinessObject> secDefUpdateList = (List) ((BusinessObject) body)
										.getValue("SecDefUpd");
								for (BusinessObject secDefUpdate : secDefUpdateList) {
									BusinessObject instrument = (BusinessObject) secDefUpdate
											.getValue("Instrmt");
									createDeletePreparedStatement(ps,instrument);
									ps.addBatch();
									batchCount++;
									if (batchCount >= BATCH_SIZE) {
										batchCount = 0;
										updateCounts = ps.executeBatch();
										for (int updateCount : updateCounts) {
											totalCount = totalCount
													+ updateCount;
										}
									}
								}
							} catch (AttributeNotFoundException e) {
								throw new SQLException(e);
							} catch (InvalidAttributeExpressionException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						updateCounts = ps.executeBatch();
						for (int updateCount : updateCounts) {
							totalCount = totalCount + updateCount;
						}
						logger.debug("Total number of records deleted : "
								+ totalCount);
						exchange.getIn().setHeader(UPDATE_COUNT, totalCount);
						return null;
					}
				});
	
	}
	
	private void insertUndly(final MessageExchange exchange) {
		// executing the insert query
		jdbcTemplate.execute(INSERT_INTO_OCCSECDEFUNDLY,
				new PreparedStatementCallback() {
					public Object doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
						int batchCount = 0;
						int totalCount = 0;
						int[] updateCounts;
						Object body = exchange.getIn().getBody();
						// if body contains data
						// if the 1st data in body is list, then everything
						// is list
						if (body instanceof List) {
							for (Iterator<?> i = ((List) body).iterator(); i
									.hasNext();) {
								BusinessObject businessObject = (BusinessObject) i
										.next();
								// set all the rows..
								try {
									List<BusinessObject> secDefUpdateList = (List) businessObject
											.getValue("SecDefUpd");
									for (BusinessObject secDefUpdate : secDefUpdateList) {
										BusinessObject instrument = (BusinessObject) secDefUpdate
												.getValue("Instrmt");
										if (secDefUpdate.getValue("Undly") != null) {
											List<BusinessObject> undlyList = (List) secDefUpdate
													.getValue("Undly");
											for (BusinessObject pty : undlyList) {
												createUndlyPreparedStatement(
														ps, instrument, pty);
												ps.addBatch();
												batchCount++;
												if (batchCount >= BATCH_SIZE) {
													updateCounts = ps
															.executeBatch();
													for (int updateCount : updateCounts) {
														totalCount = totalCount
																+ updateCount;
													}
													logger
															.debug("Total number of records inserted : "
																	+ totalCount
																	+ " BatchCount : "
																	+ batchCount);
													batchCount = 0;
												}
											}
										}
									}
								} catch (AttributeNotFoundException e) {
									throw new SQLException(e);
								} catch (InvalidAttributeExpressionException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						} else { // only single record
							// set all the rows..
							try {
								List<BusinessObject> secDefUpdateList = (List) ((BusinessObject) body)
										.getValue("SecDefUpd");
								for (BusinessObject secDefUpdate : secDefUpdateList) {
									BusinessObject instrument = (BusinessObject) secDefUpdate
											.getValue("Instrmt");
									if (secDefUpdate.getValue("Undly") != null) {
										List<BusinessObject> undlyList = (List) secDefUpdate
												.getValue("Undly");
										for (BusinessObject pty : undlyList) {
											createUndlyPreparedStatement(ps,
													instrument, pty);
											ps.addBatch();
											batchCount++;
											if (batchCount >= BATCH_SIZE) {
												
												updateCounts = ps
														.executeBatch();
												for (int updateCount : updateCounts) {
													totalCount = totalCount
															+ updateCount;
												}
												logger
														.debug("Total number of records inserted : "
																+ totalCount
																+ " BatchCount : "
																+ batchCount);
												batchCount = 0;
											}
										}
									}
								}
							} catch (AttributeNotFoundException e) {
								throw new SQLException(e);
							} catch (InvalidAttributeExpressionException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						updateCounts = ps.executeBatch();
						// int totalCount = 0;
						for (int updateCount : updateCounts) {
							totalCount = totalCount + updateCount;
						}
						logger.debug("Total number of records inserted : "
								+ totalCount);
						exchange.getIn().setHeader(UPDATE_COUNT, totalCount);
						return null;
					}
				});
	}

	private void createInstrumentPreparedStatement(PreparedStatement ps,
			BusinessObject secDefUpdate, BusinessObject instrument)
			throws AttributeNotFoundException, SQLException, InvalidAttributeExpressionException {
		ps.setObject(1, instrument.getValue("Sym"));
		ps.setObject(2, instrument.getValue("Desc"));
		ps.setObject(3, instrument.getValue("CFI"));
		ps.setObject(4, instrument.getValue("Status"));
		ps.setObject(5, secDefUpdate.getValue("Ccy"));
		ps.setObject(6, instrument.getValue("StrkCcy"));
		ps.setObject(7, instrument.getValue("StrkMult"));
		ps.setObject(8, instrument.getValue("Mult"));
		ps.setObject(9, instrument.getValue("StrkValu"));
		ps.setObject(10, instrument.getValue("SettlOnOpenFlag"));
		ps.setObject(11, instrument.getValue("AsgnMeth"));
		ps.setObject(12, instrument.getValue("CapValu")); // CapValu
		ps.setObject(13, instrument.getValue("PosLmt"));
		ps.setObject(14, instrument.getValue("NTPosLmt"));
		ps.setObject(15, instrument.getValue("PPInd"));// PPIND
		ps.setObject(16, instrument.getValue("firstTrdDt")); // FirstTradingDate
		ps.setObject(17, instrument.getValue("lastTrdDt")); // LastTradingDate
	}
	
	private void createDeletePreparedStatement(PreparedStatement ps,
			BusinessObject instrument) throws AttributeNotFoundException,
			SQLException, InvalidAttributeExpressionException {
		ps.setObject(1, instrument.getValue("Sym"));
		ps.setObject(2, instrument.getValue("Desc"));
		ps.setObject(3, instrument.getValue("CFI"));
	}
	private void createPtyPreparedStatement(PreparedStatement ps,
			BusinessObject instrument, BusinessObject pty)
			throws AttributeNotFoundException, SQLException, InvalidAttributeExpressionException {
		BusinessObject sub= (BusinessObject) pty.getValue("Sub");
		ps.setObject(1, instrument.getValue("Sym"));
		ps.setObject(2, instrument.getValue("Desc"));
		ps.setObject(3, instrument.getValue("CFI"));
		ps.setObject(4, pty.getValue("ID"));
		ps.setObject(5, pty.getValue("R"));
		ps.setObject(6, sub.getValue("ID"));
		ps.setObject(7, sub.getValue("Typ"));
	}
	

	private void createUndlyPreparedStatement(PreparedStatement ps,
			BusinessObject instrument, BusinessObject undly)
			throws AttributeNotFoundException, SQLException, InvalidAttributeExpressionException {
		ps.setObject(1, instrument.getValue("Sym"));
		ps.setObject(2, instrument.getValue("Desc"));
		ps.setObject(3, instrument.getValue("CFI"));
		ps.setObject(4, undly.getValue("Sym")); // UnderlyingSym
		ps.setObject(5, undly.getValue("ID"));
		ps.setObject(6, undly.getValue("Src"));
		ps.setObject(7, undly.getValue("CFI")); // UnderlyingCFI
		ps.setObject(8, undly.getValue("AllocPct"));
		ps.setObject(9, undly.getValue("Qty"));
		ps.setObject(10, undly.getValue("SettlTyp"));
		ps.setObject(11, undly.getValue("SetMeth"));
		ps.setObject(12, undly.getValue("SettlStat"));
		ps.setObject(13, undly.getValue("CashAmt")); // CashAmt
		ps.setObject(14, undly.getValue("CashTyp")); // CashTyp
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
