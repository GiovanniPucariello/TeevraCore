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
 * $Id: DefaultApplicationContextTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 3, 2008 
 */

package com.headstrong.fusion.core;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;

import org.junit.Test;
import org.osgi.framework.ServiceReference;

import com.headstrong.fusion.FusionTest;
import com.headstrong.fusion.commons.MediationService;
import com.headstrong.fusion.config.manager.ClusteredConfigurationManager;
import com.headstrong.fusion.config.manager.ClusteredProcessDefinitionManager;
import com.headstrong.fusion.config.manager.XmlProcessDefinitionParser;
import com.headstrong.fusion.core.recovery.RecoveryManager;
import com.headstrong.fusion.eventlogger.impl.DefaultEventLogger;
import com.headstrong.fusion.failover.AdminService;

/**
 * Test Cases for {@link DefaultApplicationContext}
 * 
 */
public class DefaultApplicationContextTest extends FusionTest {

	File fileMapping = new File("src/main/resources/ProcessSchema.xml");
	File fileFusionMapping = new File(
			"src/main/resources/ConfigurationSchema.xml");
	MediationService mediationServiceMock;
	ServiceReference sRefMock;
	// registerProcess would set the context. Which might
	ServiceReference recoveryManagerServiceRef;

	// be used for other edit/update tasks.
	ApplicationContext applicationContext;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mediationServiceMock = createMock(MediationService.class);
		sRefMock = createMock(ServiceReference.class);
		recoveryManagerServiceRef = createMock(ServiceReference.class);
	}

	@Test
	public void testRegisterProcess() throws Exception {
		
	}
	/**
	 * Tests {@link ApplicationContext#registerProcess(byte[])} method.
	 */
	@Test
	public void atestRegisterProcess() throws Exception {

		// set expectations.

		expect(bundleMock.getEntry("ProcessSchema.xml")).andReturn(
				fileMapping.toURL());
		expect(bundleMock.getEntry("ConfigurationSchema.xml")).andReturn(
				fileFusionMapping.toURL()).anyTimes();
		expect(
				bundleContextMock.getServiceReference(AdminService.class
						.getName())).andReturn(null).anyTimes();

		super.replayCommonBehavior();
		replay(mediationServiceMock);
		replay(sRefMock);
		// Test process file.

		applicationContext = DefaultApplicationContext.getInstance(
				this.bundleContextMock);
		applicationContext
				.setProcessDefinitionHandler(new XmlProcessDefinitionParser(
						bundleContextMock));
		applicationContext
				.setConfigurationManager(new ClusteredConfigurationManager(
						bundleContextMock));
		applicationContext
				.setProcessDefinitionManager(new ClusteredProcessDefinitionManager(
						bundleContextMock));
		// Process definition file.
		File file = new File("src/test/resources/processDefinition.xml");
		byte[] bytes = null;
		InputStream stream = new FileInputStream(file);
		bytes = new byte[(int) file.length()];
		// Read in the bytes
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length
				&& (numRead = stream.read(bytes, offset, bytes.length - offset)) >= 0) {
			offset += numRead;
		}
		// Ensure all the bytes have been read in
		if (offset < bytes.length) {
			fail();
		}
		stream.close();
		applicationContext.registerProcess(bytes);
		// verify if the file is created
		/*
		 * File processFile = new File("src/test/resources/1.xml");
		 * assertEquals(true, processFile.exists()); // Remove the fiel
		 * processFile.delete();
		 */
		// verify the behaviour
		verify(mediationServiceMock);
		verify(sRefMock);
	}

	/**
	 * 
	 * @precondition applicationContext.processMap.get("unittest") != null
	 */
	public void atestUpdateProcess() throws Exception {
		// Register a sample process

		// set the expectations for registering.
		expect(bundleContextMock.getProperty("fusion.savepoint.jms.queue"))
				.andReturn("recovery").anyTimes();
		expect(bundleContextMock.getProperty("fusion.savepoint.jms.url"))
				.andReturn("tcp://localhost:61616").anyTimes();
		expect(bundleContextMock.getProperty("fusion.savepoint.jms.channel"))
				.andReturn("recovery").anyTimes();
		expect(
				bundleContextMock
						.getProperty("fusion.savepoint.jms.delivery.mode"))
				.andReturn("1").anyTimes();
		expect(bundleContextMock.getProperty("fusion.savepoint.jms.port"))
				.andReturn("1417").anyTimes();
		expect(
				bundleContextMock
						.getProperty("fusion.savepoint.jms.queue.manager"))
				.andReturn("teevra").anyTimes();

		expect(
				bundleContextMock
						.getServiceReference("com.headstrong.fusion.services.transformer.Transformer"))
				.andReturn(sRefMock).anyTimes();
		expect(bundleContextMock.getService(sRefMock)).andReturn(
				mediationServiceMock).anyTimes();
		expect(bundleMock.getEntry("ProcessSchema.xml")).andReturn(
				fileMapping.toURL()).anyTimes();
		expect(bundleMock.getEntry("ConfigurationSchema.xml")).andReturn(
				fileFusionMapping.toURL()).anyTimes();
		expect(
				bundleContextMock.getServiceReference(AdminService.class
						.getName())).andReturn(null).anyTimes();

		super.replayCommonBehavior();
		replay(mediationServiceMock);
		replay(sRefMock);
		// Test process file.
		applicationContext = DefaultApplicationContext.getInstance(
				this.bundleContextMock);
		applicationContext
				.setProcessDefinitionHandler(new XmlProcessDefinitionParser(
						bundleContextMock));
		applicationContext
				.setConfigurationManager(new ClusteredConfigurationManager(
						bundleContextMock));
		applicationContext
				.setProcessDefinitionManager(new ClusteredProcessDefinitionManager(
						bundleContextMock));

		// Process definition file.
		File file = new File("src/test/resources/processDefinition.xml");
		byte[] bytes = null;
		InputStream stream = new FileInputStream(file);
		bytes = new byte[(int) file.length()];
		// Read in the bytes
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length
				&& (numRead = stream.read(bytes, offset, bytes.length - offset)) >= 0) {
			offset += numRead;
		}
		// Ensure all the bytes have been read in
		if (offset < bytes.length) {
			fail();
		}
		stream.close();
		applicationContext.registerProcess(bytes);
		// Process registered.
		// verify if the file is created
		File processFile = new File("src/test/resources/1.xml");
		// assertEquals(true, processFile.exists());

		processFile.delete();

		// Update the process ..

		// Process definition file.
		File updatedFile = new File(
				"src/test/resources/updatedProcessDefinition.xml");
		byte[] updatedBytes = null;
		InputStream updatedStream = new FileInputStream(updatedFile);
		updatedBytes = new byte[(int) updatedFile.length()];
		// Read in the bytes
		offset = 0;
		numRead = 0;
		while (offset < updatedBytes.length
				&& (numRead = updatedStream.read(updatedBytes, offset,
						updatedBytes.length - offset)) >= 0) {
			offset += numRead;
		}
		// Ensure all the bytes have been read in
		if (offset < updatedBytes.length) {
			fail();
		}
		updatedStream.close();
		// Before updating modify the Event Logger of the Process Context.
		/** HACK HACK HACK * */
		ProcessContext processContext = applicationContext
				.getProcessContext("1");
		Class processClass = processContext.getClass();
		Field field = processClass.getDeclaredField("eventLogger");
		field.setAccessible(true);
		field.set(processContext, new DefaultEventLogger());
		/**
		 * HACK HACK END
		 */

		applicationContext.registerProcess(updatedBytes);
		// verify if the file is created
		/*
		 * File updatedProcessFile = new File("src/test/resources/2.xml");
		 * assertEquals(true, updatedProcessFile.exists()); // Remove the fiel
		 * updatedProcessFile.delete();
		 */

		// verify the behaviour
		verify(mediationServiceMock);
		verify(sRefMock);
	}
}
