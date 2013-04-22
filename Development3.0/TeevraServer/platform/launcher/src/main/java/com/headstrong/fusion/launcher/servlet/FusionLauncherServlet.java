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
 * $Id: FusionLauncherServlet.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.launcher.servlet;

import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.felix.framework.Logger;

import com.headstrong.fusion.launcher.Fusion;
import com.headstrong.fusion.launcher.exception.FusionStartupException;
import com.headstrong.fusion.launcher.resourceprovider.ClassLoaderResourceProvider;
import com.headstrong.fusion.launcher.resourceprovider.ResourceProvider;

/**
 * The <code>FusionLauncherServlet</code> serves as a basic servlet for
 * Project Fusion. The tasks of this servlet are as follows:
 * <ul>
 * <li>The {@link #init()} method launches Apache <code>Felix</code> as the
 * OSGi framework implementation we use.
 * 
 */

public class FusionLauncherServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4815768066198845823L;

	private Fusion fusion;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.GenericServlet#init()
	 */
	@Override
	public void init() throws ServletException {
		// TODO Need to add proper logic once the UI application is ready
		super.init();
		ResourceProvider resourceProvider = new ClassLoaderResourceProvider(
				Thread.currentThread().getContextClassLoader());
		try {
			fusion = new Fusion(new Logger(), resourceProvider);
			fusion.start(new HashMap<String, String>());
		} catch (FusionStartupException fe) {
			throw new ServletException("Error starting fusion", fe);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.GenericServlet#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		fusion.destroy();
	}
}
