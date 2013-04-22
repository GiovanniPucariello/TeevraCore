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
 * $Id: ResourceProvider.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.launcher.resourceprovider;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;

/**
 * The <code>ResourceProvider</code> defines a simple API to access resources
 * from the environment depending on how fusion is launched.
 */
public abstract class ResourceProvider {

	/**
	 * Returns an iterator of paths strings of the children of the given folder
	 * defined by its path.
	 */
	public abstract Iterator<String> getChildren(String path);

	/**
	 * Returns an URL to the resource with the given path or <code>null</code>
	 * if no such resource exists.
	 */
	public abstract URL getResource(String path);

	/**
	 * Returns an <code>InputStream</code> to the resource given by the path
	 * or <code>null</code> if no such resource exists.
	 * @param path
	 * 			The path of the resource
	 * @return
	 * 			returns {@link InputStream} if the resource exists or null
	 */
	
	public InputStream getResourceAsStream(String path) {
		URL res = this.getResource(path);
		if (res != null) {
			try {
				return res.openStream();
			} catch (IOException ioe) {
				// ignore this one
			}
		}

		// no resource
		return null;
	}
}
