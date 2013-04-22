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
 * $Id: FusionLauncherUtilsTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 7, 2010 
 */

package com.headstrong.fusion.launcher.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * 
 */
public class FusionLauncherUtilsTest {

	@Test
	public void substVarsSimple() throws Exception {
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("key1", "value1");
		properties.put("key2", "${key1}");

		for (Entry<String, String> entry : properties.entrySet()) {
			entry.setValue(FusionLauncherUtils.substVars(entry.getValue(),
					entry.getKey(), null, properties));
		}
		assertEquals("value1", properties.get("key1"));
		assertEquals("value1", properties.get("key2"));
	}

	@Test
	public void substVarsMultiLevel() throws Exception {
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("key1", "value1");
		properties.put("key2", "${key1}");
		properties.put("key3", "${key2}");

		for (Entry<String, String> entry : properties.entrySet()) {
			entry.setValue(FusionLauncherUtils.substVars(entry.getValue(),
					entry.getKey(), null, properties));
		}
		assertEquals("value1", properties.get("key1"));
		assertEquals("value1", properties.get("key2"));
		assertEquals("value1", properties.get("key3"));
	}

	@Test
	public void substVarsCycle() throws Exception {
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("key1", "${key3}");
		properties.put("key2", "${key1}");
		properties.put("key3", "${key2}");

		try {
			for (Entry<String, String> entry : properties.entrySet()) {
				entry.setValue(FusionLauncherUtils.substVars(entry.getValue(),
						entry.getKey(), null, properties));
			}
		} catch (Exception ex) {
			return;
		}
		fail();
	}

	@Test
	public void substVarsAdditional() throws Exception {
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("key1", "value1");
		properties.put("key2", "${key1}/key2");
		properties.put("key3", "${key2}/key3");

		for (Entry<String, String> entry : properties.entrySet()) {
			entry.setValue(FusionLauncherUtils.substVars(entry.getValue(),
					entry.getKey(), null, properties));
		}
		assertEquals("value1", properties.get("key1"));
		assertEquals("value1/key2", properties.get("key2"));
		assertEquals("value1/key2/key3", properties.get("key3"));
	}

}
