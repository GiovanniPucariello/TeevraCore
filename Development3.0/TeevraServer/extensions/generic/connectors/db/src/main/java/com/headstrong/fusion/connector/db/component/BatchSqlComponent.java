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
 * $Id: BatchSqlComponent.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Jan 20, 2009 
 */

package com.headstrong.fusion.connector.db.component;

import java.util.Map;

import javax.sql.DataSource;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.impl.DefaultComponent;

/**
 * 
 */
public class BatchSqlComponent extends DefaultComponent {

    private DataSource dataSource;

    public BatchSqlComponent() {
    }

    public BatchSqlComponent(CamelContext context) {
    }

    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map parameters)
        throws Exception {
        return new BatchSqlEndpoint(uri, remaining.replaceAll("#", "?"), this, dataSource, parameters);
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

	
}
