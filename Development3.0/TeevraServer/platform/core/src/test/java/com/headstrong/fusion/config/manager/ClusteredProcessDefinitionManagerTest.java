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
 * $Id: ClusteredProcessDefinitionManagerTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 11, 2010 
 */

package com.headstrong.fusion.config.manager;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;

import junit.framework.TestCase;

import org.junit.rules.TemporaryFolder;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.failover.request.data.ClusteredStateRequest;

/**
 * {@link ClusteredProcessDefinitionManager} unit test class.
 */
public class ClusteredProcessDefinitionManagerTest extends TestCase {
	TemporaryFolder folder = new TemporaryFolder();

	public void testExecutePersist() throws Exception {
		// create temporary folder
		folder.create();
		BundleContext context = createMock(BundleContext.class);
		// create the process home directory
		File processHome = folder.newFolder("processes");
		// set the expectation for process home directory
		expect(context.getProperty(Properties.PROCESS_HOME)).andReturn(
				processHome.getAbsolutePath()).anyTimes();
		replay(context);
		// create ClusteredProcessDefinitionManager
		ClusteredProcessDefinitionManager manager = new ClusteredProcessDefinitionManager(
				context);
		// create ClusteredStateRequest -
		ClusteredStateRequest request = new ClusteredStateRequest();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream daos = new DataOutputStream(baos);
		daos.writeInt(1);
		daos.writeUTF("1");
		String def = "<process></process>";
		daos.writeInt(def.getBytes().length);
		daos.write(def.getBytes());
		request.setHandlerName(ClusteredProcessDefinitionManager.class
				.getName());
		request.setBuffer(baos.toByteArray());
		daos.close();
		baos.close();
		manager.execute(request);
		// process file would be
		File processFile = new File(processHome, "1.xml");
		assertTrue(processFile.exists());
		// read the content of the file
		DataInputStream is = new DataInputStream(new FileInputStream(
				processFile));
		assertEquals("<process></process>", is.readLine());
		folder.delete();
	}

	public void testExecuteDelete() throws Exception {
		// create temporary folder
		folder.create();
		BundleContext context = createMock(BundleContext.class);
		// create the process home directory
		File processHome = folder.newFolder("processes");
		// set the expectation for process home directory
		expect(context.getProperty(Properties.PROCESS_HOME)).andReturn(
				processHome.getAbsolutePath()).anyTimes();
		replay(context);
		// create ClusteredProcessDefinitionManager
		ClusteredProcessDefinitionManager manager = new ClusteredProcessDefinitionManager(
				context);
		// create ClusteredStateRequest -
		ClusteredStateRequest request = new ClusteredStateRequest();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream daos = new DataOutputStream(baos);
		daos.writeInt(2);
		daos.writeUTF("1");
		request.setHandlerName(ClusteredProcessDefinitionManager.class
				.getName());
		request.setBuffer(baos.toByteArray());
		daos.close();
		baos.close();
		// process file would be
		File processFile = new File(processHome, "1.xml");
		processFile.createNewFile();
		assertTrue(processFile.exists());
		// execute the delete request
		manager.execute(request);
		// file should be deleted
		assertFalse(processFile.exists());
		folder.delete();
	}

}
