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
 * $Id: ExchangeConverterTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 17, 2010 
 */

package com.headstrong.fusion.core.recovery;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import junit.framework.TestCase;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.impl.DefaultMessage;

/**
 * 
 */
public class ExchangeConverterTest extends TestCase {

	public void testWrite() throws Exception {
		CamelContext camelContext = null;
		Exchange exchange = new DefaultExchange(camelContext);
		Message in = new DefaultMessage();
		in.setBody("message body");
		in.setHeader("header1", "value1");
		in.setHeader("header2", "value2");
		exchange.setIn(in);

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ExchangeConverter.write(exchange, bos);

		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		Exchange actual = new DefaultExchange(camelContext);
		Message actualIn = new DefaultMessage();
		actual.setIn(actualIn);
		ExchangeConverter.read(actual, bis);

		// compare the data
		assertEquals("message body", actual.getIn().getBody());
		assertEquals("value1", actual.getIn().getHeader("header1"));
		assertEquals("value2", actual.getIn().getHeader("header2"));
	}

}
