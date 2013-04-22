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
 * $Id: CamelExchangeAdapterTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 13, 2010 
 */

package com.headstrong.fusion.core.commons.adapter.camel;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.apache.camel.CamelContext;
import org.apache.camel.Message;

import com.headstrong.fusion.commons.FusionMessageExchange;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.MessageExchangePattern;

public class CamelExchangeAdapterTest extends TestCase {

	private CamelExchangeAdapter camelExchangeAdapter = null;

	public void testGetContext() throws Exception {
		MessageExchange messageExchange = createMock(MessageExchange.class);
		CamelContext camelContext = createMock(CamelContext.class);
		replay(messageExchange);
		replay(camelContext);
		camelExchangeAdapter = new CamelExchangeAdapter(messageExchange,
				camelContext);
		assertEquals(camelContext, camelExchangeAdapter.getContext());
	}

	public void testSetProperties() throws Exception {
		MessageExchange messageExchange = createMock(MessageExchange.class);
		CamelContext camelContext = createMock(CamelContext.class);
		Map<String, Object> properties = new HashMap<String, Object>();
		expect(messageExchange.getProperties()).andReturn(properties);
		replay(messageExchange);
		replay(camelContext);
		camelExchangeAdapter = new CamelExchangeAdapter(messageExchange,
				camelContext);
		assertEquals(properties, camelExchangeAdapter.getProperties());
	}

	public void testGetException() throws Exception {
		MessageExchange messageExchange = createMock(MessageExchange.class);
		CamelContext camelContext = createMock(CamelContext.class);
		Exception ex = new Exception("test");
		expect(messageExchange.getException()).andReturn(ex);
		replay(messageExchange);
		replay(camelContext);
		camelExchangeAdapter = new CamelExchangeAdapter(messageExchange,
				camelContext);
		assertEquals(ex, camelExchangeAdapter.getException());
	}

	public void testGetExchangeId() throws Exception {
		MessageExchange messageExchange = createMock(MessageExchange.class);
		CamelContext camelContext = createMock(CamelContext.class);
		String exchangeId = "id";
		expect(messageExchange.getExchangeId()).andReturn(exchangeId);
		replay(messageExchange);
		replay(camelContext);
		camelExchangeAdapter = new CamelExchangeAdapter(messageExchange,
				camelContext);
		assertEquals(exchangeId, camelExchangeAdapter.getExchangeId());
	}

/*	public void testGetFault() throws Exception {
		MessageExchange messageExchange = createMock(MessageExchange.class);
		Message message = createMock(Message.class);
		CamelContext camelContext = createMock(CamelContext.class);
		replay(messageExchange);
		replay(message);
		replay(camelContext);
		camelExchangeAdapter = new CamelExchangeAdapter(messageExchange,
				camelContext);
		camelExchangeAdapter.setFault(message);
		assertEquals(message, camelExchangeAdapter.getFault());
	}
*/
/*	public void testGetIn() throws Exception {
		MessageExchange messageExchange = new FusionMessageExchange();
		Message message = createMock(Message.class);
		CamelContext camelContext = createMock(CamelContext.class);
		replay(message);
		replay(camelContext);
		camelExchangeAdapter = new CamelExchangeAdapter(messageExchange,
				camelContext);
		camelExchangeAdapter.setIn(message);
		assertEquals(message, camelExchangeAdapter.getIn());
	}

	public void testGetOut() throws Exception {
		MessageExchange messageExchange = new FusionMessageExchange();
		Message message = createMock(Message.class);
		CamelContext camelContext = createMock(CamelContext.class);
		replay(message);
		replay(camelContext);
		camelExchangeAdapter = new CamelExchangeAdapter(messageExchange,
				camelContext);
		camelExchangeAdapter.setOut(message);
		assertEquals(message, camelExchangeAdapter.getOut());
	}*/

	public void testGetPattern() throws Exception {
		MessageExchange messageExchange = new FusionMessageExchange(
				MessageExchangePattern.InOnly);
		CamelContext camelContext = createMock(CamelContext.class);
		replay(camelContext);
		camelExchangeAdapter = new CamelExchangeAdapter(messageExchange,
				camelContext);
		assertEquals(PatternMap
				.getExchangePattern(MessageExchangePattern.InOnly),
				camelExchangeAdapter.getPattern());
	}
}