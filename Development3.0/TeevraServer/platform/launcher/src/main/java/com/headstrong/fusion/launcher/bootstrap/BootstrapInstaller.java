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
 * $Id: BootstrapInstaller.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.launcher.bootstrap;

import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.felix.framework.Logger;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.startlevel.StartLevel;

import com.headstrong.fusion.launcher.resourceprovider.ResourceProvider;

/**
 * 
 * The <code>BootstrapInstaller</code> class is installed into the OSGi
 * framework as an activator to be called when the framework is starting up.
 * Upon startup all bundles from the {@link #PATH_CORE_BUNDLES} and the
 * {@link #PATH_BUNDLES} location are checked whether they are already installed
 * or not. If they are not installed, they are installed, their start level set
 * to 1 and started. Any bundle already installed is not installed again and
 * will also not be started here.
 */
public class BootstrapInstaller implements BundleActivator {
	/**
	 * The Bundle location scheme (protocol) used for bundles installed by this
	 * activator (value is "fusioninstall:"). The path part of the Bundle
	 * location of Bundles installed by this class is the name (without the
	 * path) of the resource from which the Bundle was installed.
	 */
	private static final String SCHEME = "fusioninstall:";

	/**
	 * property containing the fusion bundle's group id ( maven group id ).
	 */
	private final static String FUSION_SYMBOLICNAME_IDF = "fusion.symbolic.name";

	/**
	 * Default start level for fusion bundles.
	 */
	private final static String FUSION_STARTLEVEL_BUNDLE = "fusion.startlevel.bundle";

	/**
	 * The location the core Bundles (value is "resources/corebundles"). These
	 * bundles are installed first.
	 */
	private static final String PATH_CORE_BUNDLES = "resources/corebundles";

	/**
	 * The location the additional Bundles (value is "resources/bundles"). These
	 * Bundles are installed after the {@link #PATH_CORE_BUNDLES core Bundles}.
	 */
	private static final String PATH_BUNDLES = "resources/bundles";

	/**
	 * Uploaded bundles are copied into fusion.bundles.dir.
	 */
	private static final String UPLOADED_BUNDLES = "fusion.bundles.dir";

	/**
	 * Default Bundle start level.
	 */
	private static final int DEFAULT_BUNDLE_START_LEVEL = 1;

	/**
	 * The {@link Logger} use for logging messages during installation and
	 * startup.
	 */
	private final Logger logger;
	/**
	 * The {@link ResourceProvider} used to access the Bundle jar files to
	 * install.
	 */
	private final ResourceProvider resourceProvider;

	/**
	 * Library directory path.
	 */
	private final String rootPath;

	/**
	 * @param resourceProvider
	 *            resource provider.
	 * @param logger
	 *            logger.
	 */
	public BootstrapInstaller(final ResourceProvider resourceProvider,
			final Logger logger, final String rootPath) {
		this.resourceProvider = resourceProvider;
		this.logger = logger;
		this.rootPath = rootPath;
	}

	/**
	 * Installs any Bundles missing in the current framework instance. The
	 * Bundles are verified by the Bundle location string. All missing Bundles
	 * are first installed and then started in the order of installation.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext )
	 */
	public void start(BundleContext context) throws Exception {
		// A map of bundle location v/s Bundles.
		Map<String, Bundle> installedBundles = new HashMap<String, Bundle>();
		List<Bundle> baseBundles = new ArrayList<Bundle>();
		for (Bundle bundle : context.getBundles()) {
			installedBundles.put(bundle.getLocation(), bundle);
			baseBundles.add(bundle);
			logger.log(Logger.LOG_DEBUG, "bundles already installed :"
					+ bundle.getLocation());
		}

		// install bundles
		this.installBundles(context, installedBundles, PATH_CORE_BUNDLES);
		this.installBundles(context, installedBundles, PATH_BUNDLES);

		// install bundles in the resource folder
		File coreDirectory = new File(this.getRootPath() + "/"
				+ PATH_CORE_BUNDLES);
		this.installBundles(context, installedBundles, coreDirectory);
		File bundleDirectory = new File(this.getRootPath() + "/" + PATH_BUNDLES);
		this.installBundles(context, installedBundles, bundleDirectory);

		if (context.getProperty(UPLOADED_BUNDLES) != null) {
			File uploadedDirectory = new File(context
					.getProperty(UPLOADED_BUNDLES));
			this.installBundles(context, installedBundles, uploadedDirectory);
		}
		// remove the already installed bundles from the list.
		installedBundles.values().removeAll(baseBundles);
		// set start levels on the bundles and start them
		this.startBundles(context, installedBundles.values());
	}

	/**
	 * Install the Bundles from JAR files found in the given <code>parent</code>
	 * path.
	 * 
	 * @precondition context!=null fileName!=null installed!=null
	 * @postcondition
	 * 
	 * @param context
	 *            The <code>BundleContext</code> used to install the new
	 *            Bundles.
	 * @param installBundles
	 *            The currently installed Bundles indexed by their Bundle
	 *            location.
	 * @param fileName
	 *            The URL of the JAR which needs to be installed.
	 * @param installed
	 *            The list of Bundles installed by this method. Each Bundle
	 *            successfully installed is added to this list.
	 */

	private void installBundle(BundleContext context,
			Map<String, Bundle> installBundles, URL fileName) {
		String path = fileName.toString();
		String location = this.getLocation(path);
		// continue only if it is not already installed
		if (!installBundles.containsKey(location)) {
			// install the JAR file as a bundle
			Bundle bundle = null;
			try {
				// installing bundle
				bundle = context.installBundle(path);
				logger.log(Logger.LOG_INFO, "Bundle "
						+ bundle.getSymbolicName() + " installed from "
						+ location);
				// adding bundle to the list of current bundles
				installBundles.put(location, bundle);
			} catch (BundleException be) {
				logger.log(Logger.LOG_ERROR, "Bundle installation from "
						+ location + " failed", be);
			}
		} else {
			logger.log(Logger.LOG_INFO, "Bundle already installed " + location);
		}
	}

	/**
	 * Install the Bundles from JAR files found in the given <code>parent</code>
	 * path.
	 * 
	 * @precondition context!=null parent!=null installed!=null
	 * @postcondition
	 * @param context
	 *            The <code>BundleContext</code> used to install the new
	 *            Bundles.
	 * @param installBundles
	 *            The currently installed Bundles indexed by their Bundle
	 *            location.
	 * @param parent
	 *            The path to the location in which to look for JAR files to
	 *            install. Only resources whose name ends with <em>.jar</em>
	 *            are considered for installation.
	 * @param installed
	 *            The list of Bundles installed by this method. Each Bundle
	 *            successfully installed is added to this list.
	 */

	private void installBundles(BundleContext context,
			Map<String, Bundle> installBundles, String parent) {
		Iterator<String> res = resourceProvider.getChildren(parent);
		while (res.hasNext()) {
			String path = res.next();
			if (path.endsWith(".jar")) {
				// check for an already installed Bundle with the given location
				String location = this.getLocation(path);
				if (installBundles.containsKey(location)) {
					continue;
				}
				// try to access the JAR file, ignore if not possible
				InputStream ins = resourceProvider.getResourceAsStream(path);
				if (ins == null) {
					continue;
				}
				// install the JAR file as a bundle
				Bundle bundle = null;
				try {
					// installing bundle
					bundle = context.installBundle(location, ins);
					logger.log(Logger.LOG_INFO, "Bundle "
							+ bundle.getSymbolicName() + " installed from "
							+ location);
					// adding bundle to the list of current bundles
					installBundles.put(location, bundle);
				} catch (BundleException be) {
					logger.log(Logger.LOG_ERROR, "Bundle installation from "
							+ location + " failed", be);
					continue;
				}
			}
		}
	}

	/**
	 * returns the location.
	 * 
	 * @param path
	 *            bundle path.
	 * @return
	 */
	private String getLocation(String path) {
		return SCHEME + path.substring(path.lastIndexOf('/') + 1);
	}

	/**
	 * Installs bundle from the directory.
	 * 
	 * @param context
	 *            Bundle Context
	 * @param installBundles
	 *            Map of location of bundles v/s Bundles.
	 * @param directory
	 *            Root directory to install bundles.
	 * @param installed
	 *            list of installed bundles.
	 * @throws MalformedURLException
	 */
	private void installBundles(BundleContext context,
			Map<String, Bundle> installBundles, File directory)
			throws MalformedURLException {
		if (directory.isDirectory()) {
			File[] coreFiles = directory.listFiles();
			for (File f : coreFiles) {
				installBundle(context, installBundles, f.toURI().toURL());
			}
		}

	}

	/** Nothing to be done on stop */
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) {
		logger.log(Logger.LOG_INFO, "Stopping teevra server.");
	}

	/**
	 * Starts the Bundles in the <code>bundles</code> list. If the framework
	 * provides an active <code>StartLevel</code> service, the start levels of
	 * the Bundles is first set to <em>1</em>.
	 * 
	 * @precondition context!=null bundles!=null
	 * @postcondition
	 * @param context
	 *            {@link BundleContext}
	 * @param bundles
	 *            {@link List}
	 */

	@SuppressWarnings("unchecked")
	private void startBundles(BundleContext context, Collection<Bundle> bundles) {
		String fusionSymbName = context.getProperty(FUSION_SYMBOLICNAME_IDF);
		int defaultFusionBundleStartLevel = getDefaultBundleStartLevel(context);
		int maxStartLevel = defaultFusionBundleStartLevel;

		// the start level service to set the initial start level
		ServiceReference ref = context.getServiceReference(StartLevel.class
				.getName());
		StartLevel startLevel = (ref != null) ? (StartLevel) context
				.getService(ref) : null;
		if (startLevel == null) {
			logger
					.log(
							Logger.LOG_DEBUG,
							"Unable to locate start level serive. "
									+ "starting all the bundles with default start level.");
		}
		for (Bundle bundle : bundles) {
			if (startLevel != null) {
				int bundleStartLevel = getBundleStartLevel(fusionSymbName,
						defaultFusionBundleStartLevel, bundle);
				startLevel.setBundleStartLevel(bundle, bundleStartLevel);
				if (maxStartLevel < bundleStartLevel) {
					maxStartLevel = bundleStartLevel;
				}
				logger.log(Logger.LOG_DEBUG, "Starting bundle with startlevel:"
						+ bundleStartLevel + ":bundle:" + bundle);
			}
			try {
				bundle.start();
			} catch (BundleException be) {
				logger.log(Logger.LOG_ERROR, "Bundle "
						+ bundle.getSymbolicName() + " could not be started",
						be);
			}
		}
		if (startLevel != null) {
			startLevel.setStartLevel(maxStartLevel);
		}
		if (ref != null) {
			context.ungetService(ref);
		}
	}

	/**
	 * Checks if the bundle has defined start level in the manifest file.
	 * 
	 * @precondition
	 * @postcondition
	 * @param fusionSymbName
	 * @param fusionBundleStartLevel
	 * @param bundle
	 * @return
	 */
	private int getBundleStartLevel(String fusionSymbName,
			int fusionBundleStartLevel, Bundle bundle) {
		int bundleStartLevel = DEFAULT_BUNDLE_START_LEVEL;
		// check if the bundle is fusion bundle.
		if (fusionSymbName != null && bundle.getSymbolicName() != null
				&& bundle.getSymbolicName().startsWith(fusionSymbName)) {
			bundleStartLevel = fusionBundleStartLevel;
		}
		if (bundle.getHeaders() != null
				&& bundle.getHeaders().get("Start-Level") != null) {
			try {
				bundleStartLevel = Integer.parseInt(bundle.getHeaders().get(
						"Start-Level").toString());
			} catch (Exception e) {
				logger.log(Logger.LOG_WARNING, "Start level is not integer ");
				// Ignore.
			}
		}
		return bundleStartLevel;
	}

	/**
	 * checks the properties if fusion symbolic name is specified. or else
	 * default level is assumed.
	 * 
	 * @param context
	 *            Bundle Context.
	 * @return fusion start level.
	 */
	private int getDefaultBundleStartLevel(BundleContext context) {
		/**
		 * Default start level for Fusion bundle. will be set the default bundle
		 * start level unless specified in the fusion properties file.
		 */
		int fusionBundleStartLevel = DEFAULT_BUNDLE_START_LEVEL;
		if (context.getProperty(FUSION_STARTLEVEL_BUNDLE) != null) {
			try {
				fusionBundleStartLevel = Integer.parseInt((String) context
						.getProperty(FUSION_STARTLEVEL_BUNDLE));
			} catch (Throwable e) {
				// ignore.
			}
		}
		return fusionBundleStartLevel;
	}

	/**
	 * return app lib root path.
	 * 
	 * @return lib root path.
	 */
	protected String getRootPath() {
		return rootPath;
	}

}
