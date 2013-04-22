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
 * $Id: ClassLoaderResourceProvider.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.launcher.resourceprovider;

import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;

/**
 * ClassLoaderResourceProvider loads the resources present inside the loaded JAR
 * file
 */

public class ClassLoaderResourceProvider extends ResourceProvider {

	private final ClassLoader classLoader;

	/**
	 * ClassLoaderProvideer's constructor which needs the classloader of loaded jar file
	 * @param classLoader
	 * 				classLoader of the jar file
	 */
	public ClassLoaderResourceProvider(ClassLoader classLoader) {
		this.classLoader = (classLoader != null) ? classLoader : Thread
				.currentThread().getContextClassLoader();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.launcher.resourceprovider.ResourceProvider#getChildren(java.lang.String)
	 */
	@Override
	public Iterator<String> getChildren(String path) {
		List<String> children;

		URL url = this.classLoader.getResource(path);

		if (url != null) {

			Pattern pathPattern = Pattern.compile("^" + path + "/[^/]+$");

			children = new ArrayList<String>();
			try {
				URLConnection conn = url.openConnection();
				if (conn instanceof JarURLConnection) {
					JarFile jar = ((JarURLConnection) conn).getJarFile();
					Enumeration<JarEntry> entries = jar.entries();
					while (entries.hasMoreElements()) {
						String entry = entries.nextElement().getName();
						if (pathPattern.matcher(entry).matches()) {
							children.add(entry);
						}
					}
				}
			} catch (IOException ioe) {
				// ignore for now
			}
		} else {
			children = Collections.emptyList();
		}
		return children.iterator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.launcher.resourceprovider.ResourceProvider#getResource(java.lang.String)
	 */
	public URL getResource(String path) {
		// ensure path
		if (path == null || path.length() == 0) {
			return null;
		}

		// remove leading slash
		if (path.charAt(0) == '/') {
			path = path.substring(1);
		}

		return (this.classLoader != null) ? this.classLoader.getResource(path)
				: null;
	}

}
