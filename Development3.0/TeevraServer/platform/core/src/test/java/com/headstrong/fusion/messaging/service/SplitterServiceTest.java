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
 * $Id: SplitterServiceTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 29, 2009 
 */

package com.headstrong.fusion.messaging.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.impl.DefaultMessage;

import com.headstrong.fusion.config.PartitionKeyStrategy;
import com.headstrong.fusion.config.SplitterConfig;

import junit.framework.TestCase;

/**
 * 
 */
public class SplitterServiceTest extends TestCase {

	public void testProcessWithEmptyPayLoad() throws Exception {
		SplitterConfig config = new SplitterConfig();
		config.setId("splitter");

		PartitionKeyStrategy strategy = new PartitionKeyStrategy();
		List<String> partitionKeys = new ArrayList<String>();
		partitionKeys.add("attribute1");
		partitionKeys.add("parent.node2");
		strategy.setPartitionKeys(partitionKeys);

		config.setSplitterStrategy(strategy);

		SplitterService service = new SplitterService(config);

		CamelContext context = null;
		Exchange exchange = new DefaultExchange(context);
		Message input = new DefaultMessage();
		exchange.setIn(input);
		service.process(exchange);
	}
	
	public void testProcessWithEmptyStrategy() throws Exception {
		SplitterConfig config = new SplitterConfig();
		config.setId("splitter");

		SplitterService service = new SplitterService(config);

		CamelContext context = null;
		Exchange exchange = new DefaultExchange(context);
		Message input = new DefaultMessage();
		exchange.setIn(input);
		service.process(exchange);
	}

}
