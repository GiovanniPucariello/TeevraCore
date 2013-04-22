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
 * $Id: ClusteredConfigurationManagerTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 11, 2010 
 */

package com.headstrong.fusion.config.manager;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

import junit.framework.TestCase;

import org.junit.rules.TemporaryFolder;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.failover.request.data.ClusteredStateRequest;

/**
 * 
 */
public class ClusteredConfigurationManagerTest extends TestCase {
	/**
	 * temporary folder.
	 */
	public TemporaryFolder folder = new TemporaryFolder();

	public ClusteredConfigurationManagerTest() throws Exception {
	}

	public void testGetRequest() throws Exception {
		folder.create();
		BundleContext bundleContext = createMock(BundleContext.class);
		// create a temporary directory to store the configuration file.
		File confDir = folder.newFolder("conf");
		expect(bundleContext.getProperty("fusion.conf.dir")).andReturn(
				confDir.getAbsolutePath()).anyTimes();
		replay(bundleContext);
		ClusteredConfigurationManager manager = new ClusteredConfigurationManager(
				bundleContext);
		// create a configuration file and
		File configurationFile = new File(confDir, "Configuration.xml");
		String config = "<configuration></configuration>";
		BufferedWriter writer = new BufferedWriter(new FileWriter(
				configurationFile));
		writer.write(config);
		writer.flush();
		writer.close();

		// get the request
		ClusteredStateRequest request = manager.getRequest();
		// check the handle name
		assertEquals(ClusteredConfigurationManager.class.getName(), request
				.getHandlerName());
		String actualConf = new String(request.getBuffer());
		assertEquals(config, actualConf);
		folder.delete();
	}

	public void testExecute() throws Exception {
		folder.create();
		BundleContext bundleContext = createMock(BundleContext.class);
		// create a temporary directory to store the configuration file.
		File confDir = folder.newFolder("conf");
		expect(bundleContext.getProperty("fusion.conf.dir")).andReturn(
				confDir.getAbsolutePath()).anyTimes();
		replay(bundleContext);
		ClusteredConfigurationManager manager = new ClusteredConfigurationManager(
				bundleContext);

		// create a clustered request
		ClusteredStateRequest request = new ClusteredStateRequest();
		request.setHandlerName(ClusteredConfigurationManager.class.getName());
		String config = "<configuration></configuration>";
		request.setBuffer(config.getBytes());

		// create a configuration file and
		File configurationFile = new File(confDir, "Configuration.xml");

		// execute the request
		manager.execute(request);
		// check the file content.

		FileInputStream fis = new FileInputStream(configurationFile);
		// FIXME Handle byte array size.
		byte[] buffer = new byte[(int) configurationFile.length()];
		fis.read(buffer);

		// get the request
		// check the handle name
		String actualConf = new String(buffer);
		assertEquals(config, actualConf);
		folder.delete();
	}

}
