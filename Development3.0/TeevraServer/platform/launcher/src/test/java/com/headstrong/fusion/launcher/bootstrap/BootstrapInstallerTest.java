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
 * $Id: BootstrapInstallerTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 4, 2010 
 */

package com.headstrong.fusion.launcher.bootstrap;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.expectLastCall;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Dictionary;
import java.util.Hashtable;

import org.apache.felix.framework.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.service.startlevel.StartLevel;

import com.headstrong.fusion.launcher.resourceprovider.ClassLoaderResourceProvider;

/**
 * Bootstrap installer test case.
 */
public class BootstrapInstallerTest {
	public TemporaryFolder folder = new TemporaryFolder();

	@Before
	public void setUp() throws Exception {
		folder.create();
	}

	/**
	 * Tests the {@link BootstrapInstaller}{@link #start()} method. Test case
	 * provides two dummy jars as bundles and 1 dummy jar as core bundle.
	 * 
	 * Apache Felix calls to install/start/start-level setting of bundles is not
	 * tested.
	 * 
	 * @throws Exception
	 */
	@Test
	public void start() throws Exception {
		BundleContext bundleContextMock = createMock(BundleContext.class);
		Bundle bundleMock = createMock(Bundle.class);

		// create the root folder.
		// create the directories.
		File resources = folder.newFolder("resources");
		// create bundles and core bundles.
		File bundles = new File(resources, "bundles");
		File coreBundles = new File(resources, "corebundles");
		File uploadedBundles = new File(resources, "uploadedbundles");
		// create all the directories
		bundles.mkdir();
		coreBundles.mkdir();
		uploadedBundles.mkdir();
		// copy the bundles and corebundles.
		File sourceBundle1 = new File("src/test/resources/bundles/bundle1.jar");
		File destinationBundle1 = new File(coreBundles, "bundle1.jar");
		this.copy(sourceBundle1, destinationBundle1);

		File sourceBundle2 = new File("src/test/resources/bundles/bundle2.jar");
		File destinationBundle2 = new File(coreBundles, "bundle2.jar");
		this.copy(sourceBundle2, destinationBundle2);

		File sourceCoreBundle1 = new File(
				"src/test/resources/bundles/corebundle1.jar");
		File destinationCoreBundle1 = new File(coreBundles, "bundle2.jar");
		this.copy(sourceCoreBundle1, destinationCoreBundle1);

		// set the expectation on bundle context mock
		Bundle[] existingBundles = new Bundle[0];
		expect(bundleContextMock.getBundles()).andReturn(existingBundles)
				.anyTimes();
		expect(bundleContextMock.getProperty("fusion.bundles.dir")).andReturn(
				uploadedBundles.getAbsolutePath()).anyTimes();
		expect(bundleContextMock.getProperty("fusion.symbolic.name"))
				.andReturn("com.hs.fusion").anyTimes();
		expect(bundleContextMock.getProperty("fusion.startlevel.bundle"))
				.andReturn("5").anyTimes();
		expect(
				bundleContextMock.getServiceReference(StartLevel.class
						.getName())).andReturn(null).anyTimes();
		expect(
				bundleContextMock.installBundle(destinationBundle1.toURI()
						.toURL().toString())).andReturn(bundleMock).anyTimes();
		expect(
				bundleContextMock.installBundle(destinationBundle2.toURI()
						.toURL().toString())).andReturn(bundleMock).anyTimes();
		expect(
				bundleContextMock.installBundle(destinationCoreBundle1.toURI()
						.toURL().toString())).andReturn(bundleMock).anyTimes();
		expect(bundleMock.getSymbolicName()).andReturn("test").anyTimes();
		Dictionary<String, String> headers = new Hashtable<String, String>();
		expect(bundleMock.getHeaders()).andReturn(headers).anyTimes();
		bundleMock.start();
		expectLastCall().anyTimes();

		// create bootstrap installer.
		String rootPath = folder.getRoot().getAbsolutePath();
		BootstrapInstaller bootStrapInstaller = new BootstrapInstaller(
				new ClassLoaderResourceProvider(BootstrapInstaller.class
						.getClassLoader()), new Logger(), rootPath);
		// replay the expectation
		replay(bundleContextMock);
		replay(bundleMock);
		bootStrapInstaller.start(bundleContextMock);
	}

	/**
	 * Tests the {@link BootstrapInstaller}{@link #start()} method. Test case
	 * provides two dummy jars as bundles and 1 dummy jar as core bundle.
	 * 
	 * Apache Felix calls to install/start/start-level setting of bundles is not
	 * tested.
	 * 
	 * @throws Exception
	 */
	@Test
	public void startIfBundleSymbolicNameMissing() throws Exception {
		BundleContext bundleContextMock = createMock(BundleContext.class);
		Bundle bundleMock = createMock(Bundle.class);

		// create the root folder.
		// create the directories.
		File resources = folder.newFolder("resources");
		// create bundles and core bundles.
		File bundles = new File(resources, "bundles");
		File coreBundles = new File(resources, "corebundles");
		File uploadedBundles = new File(resources, "uploadedbundles");
		// create all the directories
		bundles.mkdir();
		coreBundles.mkdir();
		uploadedBundles.mkdir();
		// copy the bundles and corebundles.
		File sourceBundle1 = new File("src/test/resources/bundles/bundle1.jar");
		File destinationBundle1 = new File(coreBundles, "bundle1.jar");
		this.copy(sourceBundle1, destinationBundle1);

		File sourceBundle2 = new File("src/test/resources/bundles/bundle2.jar");
		File destinationBundle2 = new File(coreBundles, "bundle2.jar");
		this.copy(sourceBundle2, destinationBundle2);

		File sourceCoreBundle1 = new File(
				"src/test/resources/bundles/corebundle1.jar");
		File destinationCoreBundle1 = new File(coreBundles, "bundle2.jar");
		this.copy(sourceCoreBundle1, destinationCoreBundle1);

		// set the expectation on bundle context mock
		Bundle[] existingBundles = new Bundle[0];
		expect(bundleContextMock.getBundles()).andReturn(existingBundles)
				.anyTimes();
		expect(bundleContextMock.getProperty("fusion.bundles.dir")).andReturn(
				uploadedBundles.getAbsolutePath()).anyTimes();
		expect(bundleContextMock.getProperty("fusion.symbolic.name"))
				.andReturn(null).anyTimes();
		expect(bundleContextMock.getProperty("fusion.startlevel.bundle"))
				.andReturn("5").anyTimes();
		expect(
				bundleContextMock.getServiceReference(StartLevel.class
						.getName())).andReturn(null).anyTimes();
		expect(
				bundleContextMock.installBundle(destinationBundle1.toURI()
						.toURL().toString())).andReturn(bundleMock).anyTimes();
		expect(
				bundleContextMock.installBundle(destinationBundle2.toURI()
						.toURL().toString())).andReturn(bundleMock).anyTimes();
		expect(
				bundleContextMock.installBundle(destinationCoreBundle1.toURI()
						.toURL().toString())).andReturn(bundleMock).anyTimes();
		expect(bundleMock.getSymbolicName()).andReturn("test").anyTimes();
		Dictionary<String, String> headers = new Hashtable<String, String>();
		expect(bundleMock.getHeaders()).andReturn(headers).anyTimes();
		bundleMock.start();
		expectLastCall().anyTimes();

		// create bootstrap installer.
		String rootPath = folder.getRoot().getAbsolutePath();
		BootstrapInstaller bootStrapInstaller = new BootstrapInstaller(
				new ClassLoaderResourceProvider(BootstrapInstaller.class
						.getClassLoader()), new Logger(), rootPath);
		// replay the expectation
		replay(bundleContextMock);
		replay(bundleMock);
		bootStrapInstaller.start(bundleContextMock);
	}

	/**
	 * Tests the {@link BootstrapInstaller}{@link #start()} method. Test case
	 * provides two dummy jars as bundles.
	 * 
	 * Apache Felix calls to install/start/start-level setting of bundles is not
	 * tested.
	 * 
	 * @throws Exception
	 */
	@Test
	public void startWithNoCoreBundles() throws Exception {
		BundleContext bundleContextMock = createMock(BundleContext.class);
		Bundle bundleMock = createMock(Bundle.class);

		// create the root folder.
		// create the directories.
		File resources = folder.newFolder("resources");
		// create bundles and core bundles.
		File bundles = new File(resources, "bundles");
		File coreBundles = new File(resources, "corebundles");
		File uploadedBundles = new File(resources, "uploadedbundles");
		// create all the directories
		bundles.mkdir();
		coreBundles.mkdir();
		uploadedBundles.mkdir();
		// copy the bundles and corebundles.
		File sourceBundle1 = new File("src/test/resources/bundles/bundle1.jar");
		File destinationBundle1 = new File(coreBundles, "bundle1.jar");
		this.copy(sourceBundle1, destinationBundle1);

		File sourceBundle2 = new File("src/test/resources/bundles/bundle2.jar");
		File destinationBundle2 = new File(coreBundles, "bundle2.jar");
		this.copy(sourceBundle2, destinationBundle2);

		// set the expectation on bundle context mock
		Bundle[] existingBundles = new Bundle[0];
		expect(bundleContextMock.getBundles()).andReturn(existingBundles)
				.anyTimes();
		expect(bundleContextMock.getProperty("fusion.bundles.dir")).andReturn(
				uploadedBundles.getAbsolutePath()).anyTimes();
		expect(bundleContextMock.getProperty("fusion.symbolic.name"))
				.andReturn("com.hs.fusion").anyTimes();
		expect(bundleContextMock.getProperty("fusion.startlevel.bundle"))
				.andReturn("5").anyTimes();
		expect(
				bundleContextMock.getServiceReference(StartLevel.class
						.getName())).andReturn(null).anyTimes();
		expect(
				bundleContextMock.installBundle(destinationBundle1.toURI()
						.toURL().toString())).andReturn(bundleMock).anyTimes();
		expect(
				bundleContextMock.installBundle(destinationBundle2.toURI()
						.toURL().toString())).andReturn(bundleMock).anyTimes();
		expect(bundleMock.getSymbolicName()).andReturn("test").anyTimes();
		Dictionary<String, String> headers = new Hashtable<String, String>();
		expect(bundleMock.getHeaders()).andReturn(headers).anyTimes();
		bundleMock.start();
		expectLastCall().anyTimes();

		// create bootstrap installer.
		String rootPath = folder.getRoot().getAbsolutePath();
		BootstrapInstaller bootStrapInstaller = new BootstrapInstaller(
				new ClassLoaderResourceProvider(BootstrapInstaller.class
						.getClassLoader()), new Logger(), rootPath);
		// replay the expectation
		replay(bundleContextMock);
		replay(bundleMock);
		bootStrapInstaller.start(bundleContextMock);
	}

	/**
	 * Tests the {@link BootstrapInstaller}{@link #start()} method. Test case
	 * doesn't provide any bundles.
	 * 
	 * @throws Exception
	 */
	@Test
	public void startWithNoBundles() throws Exception {
		BundleContext bundleContextMock = createMock(BundleContext.class);
		Bundle bundleMock = createMock(Bundle.class);

		// create the root folder.
		// create the directories.
		File resources = folder.newFolder("resources");
		// create bundles and core bundles.
		File bundles = new File(resources, "bundles");
		File coreBundles = new File(resources, "corebundles");
		File uploadedBundles = new File(resources, "uploadedbundles");
		// create all the directories
		bundles.mkdir();
		coreBundles.mkdir();
		uploadedBundles.mkdir();

		// set the expectation on bundle context mock
		Bundle[] existingBundles = new Bundle[0];
		expect(bundleContextMock.getBundles()).andReturn(existingBundles)
				.anyTimes();
		expect(bundleContextMock.getProperty("fusion.bundles.dir")).andReturn(
				uploadedBundles.getAbsolutePath()).anyTimes();
		expect(bundleContextMock.getProperty("fusion.symbolic.name"))
				.andReturn("com.hs.fusion").anyTimes();
		expect(bundleContextMock.getProperty("fusion.startlevel.bundle"))
				.andReturn("5").anyTimes();
		expect(
				bundleContextMock.getServiceReference(StartLevel.class
						.getName())).andReturn(null).anyTimes();
		expect(bundleMock.getSymbolicName()).andReturn("test").anyTimes();
		Dictionary<String, String> headers = new Hashtable<String, String>();
		expect(bundleMock.getHeaders()).andReturn(headers).anyTimes();
		bundleMock.start();
		expectLastCall().anyTimes();

		// create bootstrap installer.
		String rootPath = folder.getRoot().getAbsolutePath();
		BootstrapInstaller bootStrapInstaller = new BootstrapInstaller(
				new ClassLoaderResourceProvider(BootstrapInstaller.class
						.getClassLoader()), new Logger(), rootPath);
		// replay the expectation
		replay(bundleContextMock);
		replay(bundleMock);
		bootStrapInstaller.start(bundleContextMock);
	}

	/**
	 * Tests the {@link BootstrapInstaller}{@link #start()} method. Test case
	 * provides two dummy jars as bundles and 1 dummy jar as core bundle.
	 * 
	 * Apache Felix calls to install/start/start-level setting of bundles is not
	 * tested.
	 * 
	 * @throws Exception
	 */
	@Test
	public void startWithBundlesDirPropMissing() throws Exception {
		BundleContext bundleContextMock = createMock(BundleContext.class);
		Bundle bundleMock = createMock(Bundle.class);

		// create the root folder.
		// create the directories.
		File resources = folder.newFolder("resources");
		// create bundles and core bundles.
		File bundles = new File(resources, "bundles");
		File coreBundles = new File(resources, "corebundles");
		File uploadedBundles = new File(resources, "uploadedbundles");
		// create all the directories
		bundles.mkdir();
		coreBundles.mkdir();
		uploadedBundles.mkdir();
		// copy the bundles and corebundles.
		File sourceBundle1 = new File("src/test/resources/bundles/bundle1.jar");
		File destinationBundle1 = new File(coreBundles, "bundle1.jar");
		this.copy(sourceBundle1, destinationBundle1);

		File sourceBundle2 = new File("src/test/resources/bundles/bundle2.jar");
		File destinationBundle2 = new File(coreBundles, "bundle2.jar");
		this.copy(sourceBundle2, destinationBundle2);

		File sourceCoreBundle1 = new File(
				"src/test/resources/bundles/corebundle1.jar");
		File destinationCoreBundle1 = new File(coreBundles, "bundle2.jar");
		this.copy(sourceCoreBundle1, destinationCoreBundle1);

		// set the expectation on bundle context mock
		Bundle[] existingBundles = new Bundle[0];
		expect(bundleContextMock.getBundles()).andReturn(existingBundles)
				.anyTimes();
		expect(bundleContextMock.getProperty("fusion.bundles.dir")).andReturn(
				null).anyTimes();
		expect(bundleContextMock.getProperty("fusion.symbolic.name"))
				.andReturn("com.hs.fusion").anyTimes();
		expect(bundleContextMock.getProperty("fusion.startlevel.bundle"))
				.andReturn("5").anyTimes();
		expect(
				bundleContextMock.getServiceReference(StartLevel.class
						.getName())).andReturn(null).anyTimes();
		expect(
				bundleContextMock.installBundle(destinationBundle1.toURI()
						.toURL().toString())).andReturn(bundleMock).anyTimes();
		expect(
				bundleContextMock.installBundle(destinationBundle2.toURI()
						.toURL().toString())).andReturn(bundleMock).anyTimes();
		expect(
				bundleContextMock.installBundle(destinationCoreBundle1.toURI()
						.toURL().toString())).andReturn(bundleMock).anyTimes();
		expect(bundleMock.getSymbolicName()).andReturn("test").anyTimes();
		Dictionary<String, String> headers = new Hashtable<String, String>();
		expect(bundleMock.getHeaders()).andReturn(headers).anyTimes();
		bundleMock.start();
		expectLastCall().anyTimes();

		// create bootstrap installer.
		String rootPath = folder.getRoot().getAbsolutePath();
		BootstrapInstaller bootStrapInstaller = new BootstrapInstaller(
				new ClassLoaderResourceProvider(BootstrapInstaller.class
						.getClassLoader()), new Logger(), rootPath);
		// replay the expectation
		replay(bundleContextMock);
		replay(bundleMock);
		bootStrapInstaller.start(bundleContextMock);
	}

	/**
	 * Tests the {@link BootstrapInstaller}{@link #start()} method. Test case
	 * provides two dummy jars as bundles and 1 dummy jar as core bundle.
	 * 
	 * Apache Felix calls to install/start/start-level setting of bundles is not
	 * tested.
	 * 
	 * @throws Exception
	 */
	@Test
	public void startWithBundlesDirMissing() throws Exception {
		BundleContext bundleContextMock = createMock(BundleContext.class);
		Bundle bundleMock = createMock(Bundle.class);

		// create the root folder.
		// create the directories.
		File resources = folder.newFolder("resources");
		// create bundles and core bundles.
		File coreBundles = new File(resources, "corebundles");
		File uploadedBundles = new File(resources, "uploadedbundles");
		// create all the directories
		coreBundles.mkdir();
		uploadedBundles.mkdir();

		File sourceCoreBundle1 = new File(
				"src/test/resources/bundles/corebundle1.jar");
		File destinationCoreBundle1 = new File(coreBundles, "bundle2.jar");
		this.copy(sourceCoreBundle1, destinationCoreBundle1);

		// set the expectation on bundle context mock
		Bundle[] existingBundles = new Bundle[0];
		expect(bundleContextMock.getBundles()).andReturn(existingBundles)
				.anyTimes();
		expect(bundleContextMock.getProperty("fusion.bundles.dir")).andReturn(
				null).anyTimes();
		expect(bundleContextMock.getProperty("fusion.symbolic.name"))
				.andReturn("com.hs.fusion").anyTimes();
		expect(bundleContextMock.getProperty("fusion.startlevel.bundle"))
				.andReturn("5").anyTimes();
		expect(
				bundleContextMock.getServiceReference(StartLevel.class
						.getName())).andReturn(null).anyTimes();
		expect(
				bundleContextMock.installBundle(destinationCoreBundle1.toURI()
						.toURL().toString())).andReturn(bundleMock).anyTimes();
		expect(bundleMock.getSymbolicName()).andReturn("test").anyTimes();
		Dictionary<String, String> headers = new Hashtable<String, String>();
		expect(bundleMock.getHeaders()).andReturn(headers).anyTimes();
		bundleMock.start();
		expectLastCall().anyTimes();

		// create bootstrap installer.
		String rootPath = folder.getRoot().getAbsolutePath();
		BootstrapInstaller bootStrapInstaller = new BootstrapInstaller(
				new ClassLoaderResourceProvider(BootstrapInstaller.class
						.getClassLoader()), new Logger(), rootPath);
		// replay the expectation
		replay(bundleContextMock);
		replay(bundleMock);
		bootStrapInstaller.start(bundleContextMock);
	}

	/**
	 * Tests the {@link BootstrapInstaller}{@link #start()} method. Test case
	 * provides two dummy jars as bundles and 1 dummy jar as core bundle.
	 * 
	 * Apache Felix calls to install/start/start-level setting of bundles is not
	 * tested.
	 * 
	 * @throws Exception
	 */
	@Test
	public void startWithAllBundleDirsMissing() throws Exception {
		BundleContext bundleContextMock = createMock(BundleContext.class);
		Bundle bundleMock = createMock(Bundle.class);

		// create the root folder.
		// set the expectation on bundle context mock
		Bundle[] existingBundles = new Bundle[0];
		expect(bundleContextMock.getBundles()).andReturn(existingBundles)
				.anyTimes();
		expect(bundleContextMock.getProperty("fusion.bundles.dir")).andReturn(
				null).anyTimes();
		expect(bundleContextMock.getProperty("fusion.symbolic.name"))
				.andReturn("com.hs.fusion").anyTimes();
		expect(bundleContextMock.getProperty("fusion.startlevel.bundle"))
				.andReturn("5").anyTimes();
		expect(
				bundleContextMock.getServiceReference(StartLevel.class
						.getName())).andReturn(null).anyTimes();
		expect(bundleMock.getSymbolicName()).andReturn("test").anyTimes();
		Dictionary<String, String> headers = new Hashtable<String, String>();
		expect(bundleMock.getHeaders()).andReturn(headers).anyTimes();
		bundleMock.start();
		expectLastCall().anyTimes();

		// create bootstrap installer.
		String rootPath = folder.getRoot().getAbsolutePath();
		BootstrapInstaller bootStrapInstaller = new BootstrapInstaller(
				new ClassLoaderResourceProvider(BootstrapInstaller.class
						.getClassLoader()), new Logger(), rootPath);
		// replay the expectation
		replay(bundleContextMock);
		replay(bundleMock);
		bootStrapInstaller.start(bundleContextMock);
	}

	private void copy(File src, File dst) throws IOException {
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dst);
		// Transfer bytes from in to out
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}

	@After
	public void tearDown() throws Exception {
		folder.delete();
	}

}
