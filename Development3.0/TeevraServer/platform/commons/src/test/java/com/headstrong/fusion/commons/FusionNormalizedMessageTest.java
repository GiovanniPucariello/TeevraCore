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
 * $Id: FusionNormalizedMessageTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.commons;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

/**
 * 
 */
public class FusionNormalizedMessageTest extends TestCase {

	public void testGetHeaderIfPresent() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		message.setHeader("a", "a");
		assertEquals("a", message.getHeader("a"));
	}

	public void testGetHeaderIfNotPresent() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		assertNull(message.getHeader("a"));
	}

	public void testGetHeaderIfPresentWithClassCast() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		message.setHeader("a", "a");
		assertEquals("a", message.getHeader("a", String.class));
	}

	public void testGetHeaderIfNotPresentWithClassCast() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		assertNull(message.getHeader("a", String.class));
	}

	public void testSetHeader() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		message.setHeader("A", "A");
		message.setHeader("A", "X");
		assertEquals("X", message.getHeader("A"));
	}

	public void testRemoveHeaderIfPresent() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		message.setHeader("A", "A");
		Object value = message.removeHeader("A");
		assertEquals("A", value);
		assertNull(message.getHeader("A"));
	}

	public void testRemoveHeaderIfNotPresent() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		Object value = message.removeHeader("A");
		assertNull(value);
	}

	public void testSetBody() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		message.setBody("body");
		assertEquals("body", message.getBody());
	}

	public void testGetBody() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		assertNull(message.getBody());
	}

	public void testGetHeadersIfNotSet() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		assertNotNull(message.getHeaders());
		assertTrue(message.getHeaders().size() == 0);
	}

	public void testSetHeaders() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("A", "A");
		message.setHeaders(headers);
		assertEquals(headers, message.getHeaders());
	}

	public void testGetMessageIdIfNotSet() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		assertNull(message.getMessageId());
	}

	public void testGetMessageIdIfSet() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		message.setMessageId("messageId");
		assertEquals("messageId", message.getMessageId());

	}

	public void testSetBodyWithClassCast() throws Exception {
		FusionNormalizedMessage message = new FusionNormalizedMessage();
		message.setBody("Body", String.class);
		assertEquals("Body", message.getBody(String.class));
	}

}
