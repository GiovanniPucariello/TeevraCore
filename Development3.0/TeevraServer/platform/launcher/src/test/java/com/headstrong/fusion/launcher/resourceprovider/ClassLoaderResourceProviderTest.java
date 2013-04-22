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
 * $Id: ClassLoaderResourceProviderTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 7, 2010 
 */

package com.headstrong.fusion.launcher.resourceprovider;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**
 * ClassLoaderResourceProvider unit test class.
 */
public class ClassLoaderResourceProviderTest {

	@Test
	public void getChildrenWithIncorrectPath() throws Exception {
		ResourceProvider resourceProvider = new ClassLoaderResourceProvider(
				this.getClass().getClassLoader());
		Iterator<String> children = resourceProvider.getChildren("dummy");
		assertFalse(children.hasNext());
	}

	@Test
	public void getChildren() throws Exception {
		File file = new File(
				"src/test/resources/resourceprovider/classloaderresourceprovidertest.jar");
		URL url = file.toURI().toURL();
		URL[] urls = new URL[] { url };
		ClassLoader cl = new URLClassLoader(urls, this.getClass()
				.getClassLoader());
		ResourceProvider resourceProvider = new ClassLoaderResourceProvider(cl);
		Iterator<String> children = resourceProvider
				.getChildren("resources/bundles");
		// 
		List<String> bundles = new ArrayList<String>();
		while (children.hasNext()) {
			bundles.add(children.next());
		}
		// Compare the files.
		Collections.sort(bundles);
		assertEquals(
				"resources/bundles/com.springsource.com.ibm.netrexx-2.0.5.jar",
				bundles.get(0));
		assertEquals(
				"resources/bundles/com.springsource.com.jcraft.jsch-0.1.25.jar",
				bundles.get(1));

		Iterator<String> corechildren = resourceProvider
				.getChildren("resources/corebundles");

		List<String> corebundles = new ArrayList<String>();
		while (corechildren.hasNext()) {
			corebundles.add(corechildren.next());
		}
		// Compare the files.
		Collections.sort(corebundles);
		assertEquals("resources/corebundles/fusion-logger-2.0.0.jar",
				corebundles.get(0));
		assertEquals("resources/corebundles/fusion-remote-2.0.0.jar",
				corebundles.get(1));
	}
}
