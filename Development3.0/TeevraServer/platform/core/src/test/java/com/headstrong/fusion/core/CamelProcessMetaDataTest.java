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
 * $Id: CamelProcessMetaDataTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 12, 2010 
 */

package com.headstrong.fusion.core;

import static org.easymock.EasyMock.createMock;
import junit.framework.TestCase;

import org.apache.camel.Endpoint;

/**
 * 
 */
public class CamelProcessMetaDataTest extends TestCase {

	public void testAddSourceSedaEndPoint() throws Exception {
		CamelProcessMetaData processMetaData = new CamelProcessMetaData();
		Endpoint mockEp = createMock(Endpoint.class);
		processMetaData.addSourceSedaEndpoint("1", "1", mockEp);
		assertEquals(mockEp, processMetaData.getSourceSedaEndpoint("1", "1"));
	}

	public void testAddEndpoint() throws Exception {
		CamelProcessMetaData processMetaData = new CamelProcessMetaData();
		Endpoint mockEp = createMock(Endpoint.class);
		processMetaData.addEndpoint("1", "1", mockEp);
		assertEquals(mockEp, processMetaData.getEndpoint("1", "1"));
		assertNull(processMetaData.getSourceSedaEndpoint("1", "1"));
	}
}
