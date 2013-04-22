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
 * $Id: Fusion.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.launcher;

import static org.apache.felix.framework.cache.BundleCache.CACHE_DIR_PROP;
import static org.apache.felix.framework.cache.BundleCache.CACHE_PROFILE_PROP;
import static org.apache.felix.framework.util.FelixConstants.EMBEDDED_EXECUTION_PROP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.commons.io.IOUtils;
import org.apache.felix.framework.Felix;
import org.apache.felix.framework.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleException;

import com.headstrong.fusion.launcher.bootstrap.BootstrapInstaller;
import com.headstrong.fusion.launcher.exception.DecryptionException;
import com.headstrong.fusion.launcher.exception.FusionStartupException;
import com.headstrong.fusion.launcher.resourceprovider.ResourceProvider;
import com.headstrong.fusion.launcher.utils.FusionLauncherUtils;
import com.headstrong.fusion.logger.LogManager;

/**
 * The <code>Fusion</code> serves as the starting point for Fusion.
 * <ul>
 * <li>The {@link #Fusion(Logger, ResourceProvider, Map)} method launches
 * Apache <code>Felix</code> as the OSGi framework implementation we use.
 * </ul>
 * <p>
 * <b>Launch Configuration</b>
 * <p>
 * The Apache <code>Felix</code> framework requires configuration parameters
 * to be specified for startup. This class builds the list of parameters from
 * these locations:
 * <ol>
 * <li>The <code>fusion.properties</code> is read from the jar class path.
 * This properties file contains default settings.</li>
 * <li>Extensions to this are loaded from fusion.properties which is present
 * outside the jar file. </li>
 * </ol>
 * <p>
 * After loading all properties, variable substitution takes place on the
 * property values. A variable is indicated as <code>${&lt;prop-name&gt;}</code>
 * where <code>&lt;prop-name&gt;</code> is the name of a system or
 * configuration property (configuration properties override system properties).
 * Variables may be nested and are resolved from inner-most to outer-most. For
 * example, the property value <code>${outer-${inner}}</code> is resolved by
 * first resolving <code>${inner}</code> and then resolving the property whose
 * name is the catenation of <code>outer-</code> and the result of resolving
 * <code>${inner}</code>.
 * <p>
 */
public class Fusion implements Server {

	/**
	 * The <code>Felix</code> instance loaded on {@link #init()} and stopped
	 * on {@link #destroy()}.
	 */
	private Felix felix;

	/**
	 * ResourceProvider to access resources from the environment depending on
	 * how fusion is launched
	 */
	private final ResourceProvider resourceProvider;

	/**
	 * The simple logger to log messages during startup and shutdown
	 */
	private final Logger logger;

	/**
	 * Initializes fusion by loading the configuration properties, starting the
	 * OSGi Framework (Apache Felix)
	 * 
	 * @param logger
	 *            Logger to log messages
	 * @param resourceProvider
	 *            ResourceProvider for the JAR which is loaded
	 * @param props
	 *            Initial default properties
	 * @throws FusionStartupException
	 *             if the framework could not configured and started
	 */

	public Fusion(Logger logger, ResourceProvider resourceProvider)
			throws FusionStartupException {
		this.resourceProvider = resourceProvider;
		this.logger = logger;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.launcher.Server#start(java.util.Map)
	 */
	@Override
	public void start(Map<String, String> props) throws FusionStartupException {
		logger.log(Logger.LOG_INFO, "Starting fusion");
		props = this.initializeProperties(props);
		decryptPassword(props);
		// change logger level of felix based on the properties.
		logger.setLogLevel(Fusion.toLogLevel(props.get(LogManager.LOG_LEVEL)));
		Felix tmpFelix = this.startServer(resourceProvider, props);
		logger.log(Logger.LOG_INFO, "Fusion started");
		// only assign field if start succeeds
		this.felix = tmpFelix;
	}

	/**
	 * starts the OSGi container.
	 * 
	 * @param resourceProvider
	 *            Resource provider.
	 * @param props
	 *            initialization properties.
	 * @return Initialized Felix instance
	 * @throws FusionStartupException
	 */
	private Felix startServer(ResourceProvider resourceProvider,
			Map<String, String> props) throws FusionStartupException {
		logger.log(Logger.LOG_DEBUG, "Starting felix with " + props);

		File cache = new File(props.get(CACHE_DIR_PROP), props
				.get(CACHE_PROFILE_PROP));
		logger.log(Logger.LOG_DEBUG, "Cache location is :"
				+ cache.getAbsolutePath());
		// Cleanup
		if (cache.exists()) {
			logger.log(Logger.LOG_DEBUG, "Deleting cache :"
					+ cache.getAbsolutePath());
			if (!FusionLauncherUtils.deleteDir(cache)) {
				logger.log(Logger.LOG_ERROR, "Error deleting the cache folder");
				throw new FusionStartupException(
						"Error deleting the cache folder");
			}
		}
		List<BundleActivator> activators = new ArrayList<BundleActivator>(1);
		activators.add(new BootstrapInstaller(resourceProvider, logger,
				Environment.LIB_DIR));
		// create the framework and start it
		Felix tmpFelix = new Felix(this.logger, props, activators);
		try {
			tmpFelix.start();
		} catch (BundleException e) {
			logger.log(Logger.LOG_ERROR,
					"Error starting felix in embedded mode", e);
			throw new FusionStartupException(
					"Error starting felix in embedded mode", e);
		}
		return tmpFelix;
	}

	/**
	 * Initializes the properties to start the OSGi container.
	 * 
	 * @param props
	 *            Map of already initialized properties.
	 * @return Updated properties map.
	 */
	protected Map<String, String> initializeProperties(Map<String, String> props) {
		if (props == null) {
			props = new HashMap<String, String>();
		}
		this.setDefaultValues(props);
		// load the properties file from inside the jar file.
		this.load(props, Environment.DEFAULT_PROPERTIES_FILE);
		// load the properties file from the conf directory.
		this.load(props, new File(Environment.CONF_DIR + "/"
				+ Environment.PROPERTIES_FILE));
		// Perform variable substitution for system properties.
		for (Entry<String, String> entry : props.entrySet()) {
			entry.setValue(FusionLauncherUtils.substVars(entry.getValue(),
					entry.getKey(), null, props));
		}
		return props;
	}

	/**
	 * Destroys this instance by shutting down the OSGi framework
	 * 
	 */
	public final void destroy() {
		// shutdown the Felix container
		if (felix != null) {
			logger.log(Logger.LOG_DEBUG, "Shutting down Fusion");
			felix.stopAndWait();
			logger.log(Logger.LOG_DEBUG, "Fusion stopped");
			felix = null;
		}
	}

	/**
	 * Converts the loglevel String to a loglevel integer
	 * 
	 * @precondition
	 * @postcondition
	 * @param level
	 *            String Log level. Possible values ERROR, WARN, INFO, DEBUG
	 * @return Corresponding integer value
	 */
	private static int toLogLevel(String level) {
		for (int i = 1; i < FusionLauncherUtils.logLevels.length; i++) {
			if (FusionLauncherUtils.logLevels[i].equals(level)) {
				return i;
			}
		}
		return Logger.LOG_INFO;
	}

	/**
	 * Sets the default values for the required properties
	 * 
	 * @precondition props!=null
	 * @postcondition props!=null
	 * @param props
	 *            The <code>Properties</code> into which the loaded properties
	 *            are loaded
	 */
	private void setDefaultValues(Map<String, String> props) {
		Map<String, String> tempProps = new HashMap<String, String>();
		// make sure Felix does not exit the VM when terminating ...
		tempProps.put(EMBEDDED_EXECUTION_PROP,
				FusionLauncherUtils.DEFAULT_EMBEDDED_EXEC);

		tempProps.put(CACHE_PROFILE_PROP,
				FusionLauncherUtils.DEFAULT_CACHE_PROFILE);
		tempProps.put(CACHE_DIR_PROP, FusionLauncherUtils.DEFAULT_CACHE_DIR);
		props.put(LogManager.LOG_FILE, FusionLauncherUtils.DEFAULT_LOG_FILE);
		props.put(LogManager.LOG_LEVEL, FusionLauncherUtils.logLevels[4]);

		// check if the properties are there in the base properties map.
		// if present don;t add it
		for (Map.Entry<String, String> entry : tempProps.entrySet()) {
			if (!props.containsKey(entry)) {
				props.put(entry.getKey(), entry.getValue());
			}
		}

	}

	/**
	 * Load properties from the given resource file, which is accessed through
	 * the {@link #resourceProvider}. If the resource does not exist, nothing
	 * is loaded.
	 * 
	 * @param props
	 *            The <code>Properties</code> into which the loaded properties
	 *            are loaded
	 * @param resource
	 *            The resource from which to load the resources
	 */
	private void load(Map<String, String> props, String resource) {
		InputStream is = this.resourceProvider.getResourceAsStream(resource);
		if (is != null) {
			try {
				this.load(props, is);
			} catch (IOException ioe) {
				logger.log(Logger.LOG_ERROR, "Error loading resource" + ioe);
			}
		}
	}

	/**
	 * Load properties from the given file. If the resource cannot be read from
	 * (e.g. because it does not exist), nothing is loaded.
	 * 
	 * @param props
	 *            The <code>Properties</code> into which the loaded properties
	 *            are loaded
	 * @param file
	 *            The <code>File</code> to load the properties from
	 */
	private void load(Map<String, String> props, File file) {
		if (file != null && file.canRead()) {
			try {
				this.load(props, new FileInputStream(file));
			} catch (IOException ioe) {
				logger.log(Logger.LOG_ERROR, "Error loading resource" + ioe);
			}
		}
	}

	/**
	 * Load properties from the given input stream.
	 * 
	 * @precondition props!=null ins!=null
	 * @postcondition props!=null
	 * @param props
	 *            The <code>Properties</code> into which the loaded properties
	 *            are loaded
	 * @param ins
	 *            The <code>InputStream</code> from where the properties are
	 *            to be loaded
	 */

	private void load(Map<String, String> props, InputStream ins)
			throws IOException {
		try {
			Properties tmp = new Properties();
			tmp.load(ins);

			for (Map.Entry<Object, Object> entry : tmp.entrySet()) {
				props.put((String) entry.getKey(), (String) entry.getValue());
			}
		} finally {
			try {
				ins.close();
			} catch (IOException ioe2) {
				logger.log(Logger.LOG_ERROR, "Error closing resource" + ioe2);
			}
		}
	}
	
	private void decryptPassword(Map<String, String> props) {
		
		String corePassword = (String)props.get("database.password");
		String jmxPwdLocation = (String)props.get("fusion.jmx.passwordLocation");
		String jmxPassword = null;
				
		String encryptionKeyPath = (String)props.get("fusion.encryption.keyPath");		
		String key = null;
			try {	
			if(encryptionKeyPath != null){
				key =  IOUtils.toString(new FileReader(new File(encryptionKeyPath)));
				props.put("fusion.encryption.keyPath", key);
				corePassword = IOUtils.toString(new FileReader(new File((String)props.get("database.passwordLocation"))));
				
			}else{
				throw new Exception();
			}
			if(corePassword != "" && null!=corePassword ){
					props.put("database.password", FusionLauncherUtils.decrypt(corePassword,key));
		}
		if(jmxPwdLocation != null && !jmxPwdLocation.equals("")){
				jmxPassword = IOUtils.toString(new FileReader(new File((String)props.get("fusion.jmx.passwordLocation"))));
		}
			props.put("fusion.jmx.password", FusionLauncherUtils.decrypt(jmxPassword,key));
		} catch (FileNotFoundException e) {
			logger.log(Logger.LOG_ERROR,"Error while reading the encryption key file",e);
		} catch (IOException e) {
			logger.log(Logger.LOG_ERROR,"Error while reading the encryption key",e);
		}  catch (NoSuchAlgorithmException e) {
			logger.log(Logger.LOG_ERROR,"Error while decrypting the message: Invalid algorithm" +e);						
		} catch (NoSuchPaddingException e) {
			logger.log(Logger.LOG_ERROR,"Error while decrypting the message: Invalid padding"+e);						
		} catch (IllegalBlockSizeException e) {
			logger.log(Logger.LOG_ERROR,"Error while decrypting the message: Illegal block size "+e);						
		} catch (BadPaddingException e) {
			logger.log(Logger.LOG_ERROR,"Error while decrypting the message: Bad padding "+e);						
		} catch (Exception e) {
			logger.log(Logger.LOG_ERROR,"Error while decrypting the message."+e);						
			}
		}
	}

