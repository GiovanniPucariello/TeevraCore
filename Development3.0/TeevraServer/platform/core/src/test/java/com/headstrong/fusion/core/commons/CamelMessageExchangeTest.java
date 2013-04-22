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
 * $Id: CamelMessageExchangeTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 29, 2008 
 */

package com.headstrong.fusion.core.commons;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;

/**
 * This test class tests {@link CamelMessageExchange}.
 * 
 */
public class CamelMessageExchangeTest {
	
	private Exchange exchangeMock;
	private Message messageMock;
	@Before
	public void init() throws Exception {
		exchangeMock = createMock(Exchange.class);
		messageMock = createMock(Message.class);
	}
	
	/**
	 * To Test {@link CamelMessageExchange#copy()}.
	 * 
	 * @precondition
	 * @postcondition 	
	 */
	@Test
	public void copy() {
		Exchange copyExchange = createMock(Exchange.class);
		expect(exchangeMock.copy()).andReturn(copyExchange);
		expect(copyExchange.getExchangeId()).andReturn("copy");
		expect(copyExchange.getProperty("dummy")).andReturn("dummy");
		replay(exchangeMock);
		replay(copyExchange);
		MessageExchange exchange = new CamelMessageExchange(exchangeMock);
		MessageExchange copy = exchange.copy();
		
		// verify the data
		assertEquals(copy.getExchangeId(),"copy");
		assertEquals(copy.getProperty("dummy"),"dummy");
		
		// verify the behavior
		verify(copyExchange);
		verify(exchangeMock);
	} 
	
	@Test
	public void getExchangeId() {
		expect(exchangeMock.getExchangeId()).andReturn("exchange01");
		replay(exchangeMock);
		
		MessageExchange exchange = new CamelMessageExchange(exchangeMock);
		// assert
		assertEquals(exchange.getExchangeId(), "exchange01");
	}
	
	@Test
	public void getProperty() {
		expect(exchangeMock.getProperty("dummy01")).andReturn("dummy01");
		expect(exchangeMock.getProperty("dummy02")).andReturn("dummy02");
		expect(exchangeMock.getProperty("dummy03")).andReturn("dummy03");

		replay(exchangeMock);

		MessageExchange exchange = new CamelMessageExchange(exchangeMock);
		
		// verify the data
		assertEquals(exchange.getProperty("dummy01"),"dummy01");
		assertEquals(exchange.getProperty("dummy02"),"dummy02");
		assertEquals(exchange.getProperty("dummy03"),"dummy03");
		// verify the behavior
		verify(exchangeMock);
	}
	
	@Test
	public void getIn() {
		expect(exchangeMock.getIn()).andReturn(messageMock);
		expect(messageMock.getBody()).andReturn("message body");
		expect(messageMock.getHeader("header")).andReturn("header");
		
		// Replay
		replay(exchangeMock);
		replay(messageMock);
		
		// assertions
		MessageExchange messageExchange = new CamelMessageExchange(exchangeMock);
		NormalizedMessage message = messageExchange.getIn();
		assertEquals(message.getHeader("header"), "header");
		assertEquals(message.getBody(), "message body");
		
		// verification
		verify(exchangeMock);
		verify(messageMock);
		
	}

	@Test
	public void getOut() {
		expect(exchangeMock.getOut()).andReturn(messageMock);
		expect(messageMock.getBody()).andReturn("message body");
		expect(messageMock.getHeader("header")).andReturn("header");
		
		// Replay
		replay(exchangeMock);
		replay(messageMock);
		
		// assertions
		MessageExchange messageExchange = new CamelMessageExchange(exchangeMock);
		NormalizedMessage message = messageExchange.getOut();
		assertEquals(message.getHeader("header"), "header");
		assertEquals(message.getBody(), "message body");
		
		// verification
		verify(exchangeMock);
		verify(messageMock);
	}
/*
	@Test
	public void getFault() {
		expect(exchangeMock.getFault()).andReturn(messageMock);
		expect(messageMock.getBody()).andReturn("message body");
		expect(messageMock.getHeader("header")).andReturn("header");
		
		// Replay
		replay(exchangeMock);
		replay(messageMock);
		
		// assertions
		MessageExchange messageExchange = new CamelMessageExchange(exchangeMock);
		NormalizedMessage message = messageExchange.getFault();
		assertEquals(message.getHeader("header"), "header");
		assertEquals(message.getBody(), "message body");
		
		// verification
		verify(exchangeMock);
		verify(messageMock);
	}*/

}
