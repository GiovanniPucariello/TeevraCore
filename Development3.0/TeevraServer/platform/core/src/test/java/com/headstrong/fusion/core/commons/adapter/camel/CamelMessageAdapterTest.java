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
 * $Id: CamelMessageAdapterTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 13, 2010 
 */

package com.headstrong.fusion.core.commons.adapter.camel;

import java.util.HashSet;
import java.util.Set;

import javax.activation.DataHandler;
import javax.activation.DataSource;

import org.apache.camel.Exchange;

import com.headstrong.fusion.commons.NormalizedMessage;

import junit.framework.TestCase;
import static org.easymock.EasyMock.*;

/**
 * 
 */
public class CamelMessageAdapterTest extends TestCase {

	public void testAddAttachment() throws Exception {
		NormalizedMessage message = createMock(NormalizedMessage.class);
		DataSource ds = null;
		DataHandler dataHandler = new DataHandler(ds);
		replay(message);
		CamelMessageAdapter adapter = new CamelMessageAdapter(message);
		adapter.addAttachment("test", dataHandler);
		assertEquals(adapter.getAttachment("test"), dataHandler);
	}

	public void testGetAttachmentNames() throws Exception {
		NormalizedMessage message = createMock(NormalizedMessage.class);
		DataSource ds = null;
		DataHandler dataHandler = new DataHandler(ds);
		replay(message);
		CamelMessageAdapter adapter = new CamelMessageAdapter(message);
		adapter.addAttachment("test", dataHandler);
		adapter.addAttachment("test1", dataHandler);
		Set<String> keySet = new HashSet<String>();
		keySet.add("test");
		keySet.add("test1");
		assertTrue(adapter.getAttachmentNames().containsAll(keySet));
	}

	public void testGetBody() throws Exception {
		NormalizedMessage message = createMock(NormalizedMessage.class);
		expect(message.getBody()).andReturn("test");
		replay(message);
		CamelMessageAdapter adapter = new CamelMessageAdapter(message);
		assertEquals("test", adapter.getBody());
		verify(message);
	}

	public void testGetExchange() throws Exception {
		NormalizedMessage message = createMock(NormalizedMessage.class);
		Exchange exchange = createMock(Exchange.class);
		replay(message);
		replay(exchange);
		CamelMessageAdapter adapter = new CamelMessageAdapter(message);
		adapter.setExchange(exchange);
		assertEquals(exchange, adapter.getExchange());
		verify(message);
		verify(exchange);
	}

	public void testGetHeader() throws Exception {
		NormalizedMessage message = createMock(NormalizedMessage.class);
		expect(message.getHeader("key")).andReturn("value");
		replay(message);
		CamelMessageAdapter adapter = new CamelMessageAdapter(message);
		assertEquals("value", adapter.getHeader("key"));
		verify(message);
	}
}
