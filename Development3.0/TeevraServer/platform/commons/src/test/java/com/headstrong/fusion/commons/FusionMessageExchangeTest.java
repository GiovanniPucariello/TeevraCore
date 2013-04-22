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
 * $Id: FusionMessageExchangeTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.commons;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;
import static org.easymock.EasyMock.createMock;

/**
 * {@link FusionMessageExchange} test class.
 */
public class FusionMessageExchangeTest extends TestCase {

	public void testGetProperty() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange();
		e.setProperty("A", "A");
		e.setProperty("B", "B");
		assertEquals("A", e.getProperty("A"));
		assertEquals("B", e.getProperty("B"));
	}

	public void testSetProperties() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange();
		Map<String, Object> properties = new HashMap<String, Object>();

		properties.put("A", "A");
		properties.put("B", "B");
		e.setProperties(properties);
		assertEquals("A", e.getProperty("A"));
		assertEquals("B", e.getProperty("B"));
	}

	public void testRemoveProperty() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange();
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put("A", "A");
		properties.put("B", "B");
		e.setProperties(properties);
		assertEquals("A", e.getProperty("A"));
		assertEquals("B", e.getProperty("B"));
		Object removedProp = e.removeProperty("A");
		assertEquals("A", removedProp);
		assertNull(e.getProperty("A"));
		assertEquals("B", e.getProperty("B"));
		removedProp = e.removeProperty("X");
		assertNull(removedProp);
	}

	public void testGetProperties() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange();
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put("A", "A");
		properties.put("B", "B");
		e.setProperties(properties);
		Map<String, Object> props = e.getProperties();
		assertEquals("A", props.get("A"));
		assertEquals("B", props.get("B"));
	}

	public void testGetIn() throws Exception {
		NormalizedMessage message = createMock(NormalizedMessage.class);
		FusionMessageExchange e = new FusionMessageExchange();
		e.setIn(message);
		assertNotNull(e.getIn());
		assertEquals(message, e.getIn());
	}

	public void testGetOut() throws Exception {
		NormalizedMessage message = createMock(NormalizedMessage.class);
		FusionMessageExchange e = new FusionMessageExchange();
		e.setOut(message);
		assertNotNull(e.getOut());
		assertEquals(message, e.getOut());
	}

	public void testGetExchangeId() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange();
		assertNull(e.getExchangeId());
	}

	public void testSetExchangeId() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange();
		e.setExchangeId("exchange");
		assertEquals("exchange", e.getExchangeId());
	}

	public void testGetException() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange();
		assertNull(e.getException());
	}

	public void testIsFalied() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange();
		assertFalse(e.isFailed());
	}

	public void testSetPattern() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange();
		e.setPattern(MessageExchangePattern.InOnly);
		assertEquals(MessageExchangePattern.InOnly, e.getPattern());
	}

	public void testConstructorWithExchangePattern() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange(
				MessageExchangePattern.OutIn);
		assertEquals(MessageExchangePattern.OutIn, e.getPattern());
	}

	public void testGetPropretyWithNull() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange(
				MessageExchangePattern.OutIn);
		assertNull(e.getProperty("test"));
	}

	public void testGetPropretyWithClassCast() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange();
		e.setProperty("A", "A");
		e.setProperty("B", "B");
		assertNull(e.getProperty("test", String.class));
	}

	public void testSetPropertyIfValueNull() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange();
		e.setProperty("A", "A");
		assertEquals("A", e.getProperty("A"));
		e.setProperty("A", null);
		assertFalse(e.getProperties().containsKey("A"));
	}
	
	public void testCopy() throws Exception {
		FusionMessageExchange e = new FusionMessageExchange();
		e.setProperty("A","A");
		e.setProperty("B","B");
		FusionMessageExchange e1 = e.copy();
		assertFalse(e.equals(e1));
		assertEquals("A", e1.getProperty("A"));
		assertEquals("B", e1.getProperty("B"));
	}
}
