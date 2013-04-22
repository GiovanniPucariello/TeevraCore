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
 * $Id: FusionTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 7, 2010 
 */

package com.headstrong.fusion.launcher;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.felix.framework.Logger;
import org.junit.Test;

import com.headstrong.fusion.launcher.resourceprovider.ClassLoaderResourceProvider;
import com.headstrong.fusion.launcher.resourceprovider.ResourceProvider;

import static org.junit.Assert.assertEquals;

/**
 * 
 */
public class FusionTest {

	@Test
	public void initializeProperties() throws Exception {
		File file = new File(
				"src/main/resources/resourceprovider/classloaderresourceprovidertest.jar");
		URL url = file.toURI().toURL();
		URL[] urls = new URL[] { url };
		ClassLoader cl = new URLClassLoader(urls, this.getClass()
				.getClassLoader());
		ResourceProvider resourceProvider = new ClassLoaderResourceProvider(cl);
		Iterator<String> children = resourceProvider
				.getChildren("resources/bundles");

		Fusion fusion = new Fusion(new Logger(),
				new ClassLoaderResourceProvider(FusionTest.class
						.getClassLoader()));
		Map<String, String> props = new HashMap<String, String>();
		fusion.initializeProperties(props);

	}
}
