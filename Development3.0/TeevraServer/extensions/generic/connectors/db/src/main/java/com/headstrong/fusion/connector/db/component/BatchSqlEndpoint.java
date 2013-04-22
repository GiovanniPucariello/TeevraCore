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
 * $Id: BatchSqlEndpoint.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Jan 20, 2009 
 */

package com.headstrong.fusion.connector.db.component;

import java.util.Map;

import javax.sql.DataSource;

import org.apache.camel.Component;
import org.apache.camel.Producer;
import org.apache.camel.component.sql.SqlEndpoint;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 
 */
public class BatchSqlEndpoint extends SqlEndpoint {
	
	 private JdbcTemplate jdbcTemplate;
	 private String query;
	    
	
	  public BatchSqlEndpoint(String uri, String query, Component component, DataSource dataSource, Map parameters) throws Exception {
		 super(uri, component, new JdbcTemplate(dataSource), query);
		 this.jdbcTemplate = new JdbcTemplate(dataSource);
		   this.query = query;
	  }
	  
	  //TODO remove
	 /* public BatchSqlEndpoint(String endpointUri, JdbcTemplate jdbcTemplate, String query) {
		  super(uri, component, jdbcTemplate, query);
		  this.jdbcTemplate=jdbcTemplate;
		   this.query = query;
	  }*/
	  
	  public Producer createProducer() throws Exception {
	        return new BatchSqlProducer(this, query, jdbcTemplate);
	    }
		  

}
