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
 * $Id: FileSplitterProcessorTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 6, 2010 
 */

package com.headstrong.fusion.connector.filesplitter.processor;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.connector.filesplitter.FileSplitterEndpoint;
import com.headstrong.fusion.connector.filesplitter.splitter.FileSplitter;
import com.headstrong.fusion.connector.filesplitter.splitter.RecordExtractor;
import com.headstrong.fusion.connector.filesplitter.splitter.RecordSplitter;

/**
 * 
 */
public class FileSplitterProcessorTest {

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void process() throws Exception {

		String message = "test message";
		String recordStartPattern = "PU0101";

		Map<String, String> properties = new HashMap<String, String>();
		FileSplitterEndpoint endpoint = new FileSplitterEndpoint(properties);

		DummyFusionProcessorImpl fusionProcessor = new DummyFusionProcessorImpl();
		FileSplitter splitter = new RecordExtractor(endpoint, fusionProcessor);

		FileSplitterProcessorImpl splitterProcesser = new FileSplitterProcessorImpl();
		splitterProcesser.process(splitter, message, recordStartPattern);

		MessageExchange messageExchange = fusionProcessor.getMessageExchange();

		Assert.assertNotNull(messageExchange.getIn().getBody());

		Assert.assertEquals("test message", messageExchange.getIn().getBody());

		Assert.assertEquals("PU0101", messageExchange.getIn().getHeader(
				"record_pattern"));

		splitter = new RecordSplitter(endpoint, fusionProcessor);

		message = "test message1";

		splitterProcesser = new FileSplitterProcessorImpl();
		splitterProcesser.process(splitter, message, null);

		messageExchange = fusionProcessor.getMessageExchange();

		Assert.assertNotNull(messageExchange.getIn().getBody());

		Assert.assertEquals("test message1", messageExchange.getIn().getBody());

		Assert.assertEquals(null, messageExchange.getIn().getHeader(
				"record_pattern"));

	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

}
