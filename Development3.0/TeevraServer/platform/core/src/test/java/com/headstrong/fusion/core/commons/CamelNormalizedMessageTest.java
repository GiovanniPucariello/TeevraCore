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
 * $Id: CamelNormalizedMessageTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 6, 2008 
 */

package com.headstrong.fusion.core.commons;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.apache.camel.Message;
import org.apache.camel.impl.DefaultMessage;

import com.headstrong.fusion.commons.NormalizedMessage;

/**
 * Unit test class to test {@link CamelNormalizedMessage}
 * 
 */
public class CamelNormalizedMessageTest extends TestCase {

	protected void setUp() {
	}

	public void testCopy() {
		// create a camel message
		Message message = new DefaultMessage();

		NormalizedMessage normalMessage1 = new CamelNormalizedMessage(message);
		// set parameters.
		normalMessage1.setHeader("processid", "processid");
		normalMessage1.setHeader("sessionid", "sessionid");
		normalMessage1.setMessageId("messageid");

		normalMessage1.setBody("Message Body");

		// set parameters in 
		NormalizedMessage normalMessage2 = normalMessage1.copy();

		assertEquals("processid", normalMessage2.getHeader("processid"));
		assertEquals("sessionid", normalMessage2.getHeader("sessionid"));
		assertEquals("messageid", normalMessage2.getMessageId());
		assertEquals("Message Body", normalMessage2.getBody());

		// check modification in one doesnt lead to modification in the other
		normalMessage2.setHeader("sessionid", "sessionid1");
		assertEquals("sessionid", normalMessage1.getHeader("sessionid"));
		assertEquals("sessionid1", normalMessage2.getHeader("sessionid"));
	}

	public void testGetBody() {
		Message message = new DefaultMessage();
		NormalizedMessage normalizedMessage = new CamelNormalizedMessage(
				message);
		Map<String, String> body = new HashMap<String, String>();
		body.put("1", "1");
		body.put("2", "2");
		normalizedMessage.setBody(body);

		Map<String, String> retBody = normalizedMessage.getBody(HashMap.class);
		assertEquals("1", retBody.get("1"));
		assertEquals("2", retBody.get("2"));
	}

	public void testGetHeader() {
		Message message = new DefaultMessage();
		NormalizedMessage normalizedMessage = new CamelNormalizedMessage(
				message);
		normalizedMessage.setHeader("1", "1");
		normalizedMessage.setHeader("2", "2");

		assertEquals("1", normalizedMessage.getHeader("1"));
		assertEquals("2", normalizedMessage.getHeader("2"));
	}
}
