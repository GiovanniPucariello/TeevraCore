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
 * $Id: ClusteredConfigurationManager.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Feb 1, 2009
 */

package com.headstrong.fusion.config.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

import com.headstrong.fusion.commons.exception.ConfigurationException;
import com.headstrong.fusion.commons.exception.ConfigurationValidationException;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.config.Configuration;
import com.headstrong.fusion.config.ProcessConfiguration;
import com.headstrong.fusion.failover.AdminService;
import com.headstrong.fusion.failover.request.data.ClusteredStateHandler;
import com.headstrong.fusion.failover.request.data.ClusteredStateManager;
import com.headstrong.fusion.failover.request.data.ClusteredStateRequest;
import com.headstrong.fusion.config.CacheReloadScheduleConfiguration;

/**
 * Manages fusion configuration. It also extends Managed State Handler required
 * in case of clustered mode.
 * 
 */
public class ClusteredConfigurationManager extends ClusteredStateHandler
		implements ConfigurationManager {

	private static Logger logger = LoggerFactory
			.getLogger(ClusteredConfigurationManager.class);
	/**
	 * OSGi bundle context.
	 */
	private BundleContext bundleContext;
	/**
	 * Fusion configuration file.
	 */
	private static final String FUSION_FILE = "Configuration.xml";
	/**
	 * Fusion configuration castor mapping file.
	 */
	private static final String MAPPING_FILE = "ConfigurationSchema.xml";

	private Configuration configuration;

	public ClusteredConfigurationManager(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
		try {
			this.refresh();
		} catch (ConfigurationException e) {
			logger.error("Error reading the configuration file");
			// ignore
		}
		if (this.getConfiguration() == null) {
			this.setConfiguration(new Configuration());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.failover.request.data.ClusteredStateHandler#execute(com.headstrong.fusion.failover.request.data.ClusteredStateRequest)
	 */
	@Override
	/**
	 * when a data request is received from master instance it does the required
	 * persistence.
	 */
	public void execute(ClusteredStateRequest clusteredStateRequest)
			throws Exception {
		// Received Managed State Request.
		byte[] fusionConfiguration = clusteredStateRequest.getBuffer();
		// persist the configuration in the file system.
		File configuraionFile = ClusteredConfigurationManager
				.getConfigurationFile(this.bundleContext);
		FileOutputStream fos = new FileOutputStream(configuraionFile);
		fos.write(fusionConfiguration);
		fos.flush();
		fos.close();
	}

	/**
	 * helper method returns the file handler for configuration file.
	 * 
	 * @param bundleContext
	 * @return Configuration File.
	 * @throws InitializationException
	 * @throws IOException
	 */
	private static File getConfigurationFile(BundleContext bundleContext)
			throws InitializationException, IOException {
		String fusionConf = bundleContext.getProperty("fusion.conf.dir");

		if (fusionConf == null) {
			logger.error("fusion.conf.dir property not defined.");
			throw new InitializationException(
					"fusion.conf property not specified.");
		}
		File configDirectory = new File(fusionConf);
		if (!configDirectory.exists()) {
			configDirectory.mkdirs();
		}
		// File name is Fusion_${System.currentTimeMillis()}
		File fusionConfigurationFile = new File(fusionConf + "/" + FUSION_FILE);
		return fusionConfigurationFile;
	}

	/**
	 * Creates a {@link ClusteredStateRequest}.
	 * 
	 * @return {@link ClusteredStateRequest}
	 * @throws Exception
	 */
	public ClusteredStateRequest getRequest() throws Exception {
		ClusteredStateRequest request = new ClusteredStateRequest();
		request.setHandlerName(ClusteredConfigurationManager.class.getName());
		// Get the configuration byte array
		File confFile = getConfigurationFile(bundleContext);
		FileInputStream fis = new FileInputStream(confFile);
		// FIXME Handle byte array size.
		byte[] buffer = new byte[(int) confFile.length()];
		fis.read(buffer);
		request.setBuffer(buffer);
		return request;
	}

	/**
	 * Initializes the Fusion Configuration.
	 * 
	 * @throws ConfigurationException
	 */
	public void refresh() throws ConfigurationException {
		// File name is Fusion_${System.currentTimeMillis()}
		File fusionConfigurationFile = null;
		try {
			fusionConfigurationFile = getConfigurationFile(this
					.getBundleContext());
		} catch (InitializationException e1) {
			logger.error("Error reading fusion configuration file.", e1);
			throw new ConfigurationException(
					"Error reading fusion configuration", e1);
		} catch (IOException e1) {
			logger.error("Error reading fusion configuration file.", e1);
			throw new ConfigurationException(
					"Error reading fusion configuration", e1);
		}
		if (fusionConfigurationFile.exists()) {
			// parse the configuraion.
			Unmarshaller unMarshaller;
			try {
				URL mappingURL = this.getBundleContext().getBundle().getEntry(
						MAPPING_FILE);
				if (mappingURL == null) {
					throw new FileNotFoundException(MAPPING_FILE);
				}
				Mapping mapping = new Mapping();
				mapping.loadMapping(mappingURL);
				unMarshaller = new Unmarshaller(mapping);
				unMarshaller.setIgnoreExtraAttributes(false);
				unMarshaller.setIgnoreExtraElements(false);
			} catch (MappingException e) {
				logger.error(
						"Exception while passing mapping to unmarshaller.", e);
				throw new ConfigurationException(
						"Error while parsing the mapping definition.", e);
			} catch (IOException e) {
				logger.error("Mapping file not found.", e);
				throw new ConfigurationException("Mapping file not found.", e);
			}
			try {
				this.configuration = (Configuration) unMarshaller
						.unmarshal(new InputSource(new FileReader(
								fusionConfigurationFile)));
			} catch (MarshalException e) {
				logger
						.error(
								"Exception while unmarshalling the fusion configuration.",
								e);
				throw new ConfigurationException(
						"Exception while unmarshalling the fusion "
								+ "configuration.", e);
			} catch (ValidationException e) {
				logger
						.error(
								"Validation Exception while unmarshalling the fusion configuration. ",
								e);
				throw new ConfigurationValidationException(
						"Validation Exception while unmarshalling "
								+ "the fusion configuration.", e);
			} catch (FileNotFoundException e) {
				logger.error("fusion configuration file not found.", e);
				throw new ConfigurationException(
						"fusion configuration file not found.", e);
			}

		}
	}

	/**
	 * Marshals the Fusion Configuration
	 * 
	 * @param pcm
	 *            an instance of ProcessConfigurationModel
	 * @param marshalled
	 *            file to store the marshalled data
	 * @return the file with marshalled data.
	 * @throws IOException
	 * @throws MarshalException
	 * @throws ValidationException
	 * @throws MappingException
	 * @throws ConfigurationException
	 * @throws IOException
	 * @throws InitializationException
	 * @throws MappingException
	 */
	public void persist() throws ConfigurationException {
		URL mappingURL = bundleContext.getBundle().getEntry(MAPPING_FILE);
		if (mappingURL == null) {
			throw new ConfigurationException(MAPPING_FILE + "not found");
		}

		Mapping mapping = new Mapping();

		File fusionConfigurationFile;
		try {
			fusionConfigurationFile = getConfigurationFile(bundleContext);
			if (!fusionConfigurationFile.exists()) {
				fusionConfigurationFile.createNewFile();
			}
		} catch (InitializationException e1) {
			logger.error("Error reading the configuration file.", e1);
			throw new ConfigurationException(
					"Error reading configuration file.");
		} catch (IOException e1) {
			logger.error("Error reading the configuration file.", e1);
			throw new ConfigurationException(
					"Error reading configuration file.");
		}

		try {
			mapping.loadMapping(mappingURL);
		} catch (FileNotFoundException e) {
			logger.error("mapping file not found:", e);
			throw new ConfigurationException(
					"Fusion configuration definition file not found.", e);
		} catch (IOException e) {
			logger.error("mapping file not found:", e);
			throw new ConfigurationException(
					"Fusion configuration definition file not found.", e);
		} catch (MappingException e) {
			logger.error("Error while generating the Mapping.", e);
			throw new ConfigurationException(
					"Error while generating the Mapping.", e);
		}

		FileWriter writer = null;
		try {
			writer = new FileWriter(fusionConfigurationFile);
		} catch (IOException e) {
			logger.error("Unable to create configuration file.", e);
			throw new ConfigurationException(
					"Unable to create configuration file.", e);
		}

		Marshaller marshaller;
		try {
			marshaller = new Marshaller(writer);
			marshaller.setMapping(mapping);
			marshaller.marshal(this.configuration);

			ClusteredStateManager clusteredStateManager = this
					.getClusteredStateManager();
			if (clusteredStateManager != null) {
				try {
					ClusteredStateRequest req = this.getRequest();
					clusteredStateManager.multicast(req);
				} catch (Exception e) {
					logger.error("Error multicasting the configuration.", e);
					// FIXME Handle.
				}
			}
		} catch (MarshalException e) {
			logger.error("Exception while marshalling: ", e);
			throw new ConfigurationException(
					"Error while marshalling Fusion Configuration.", e);
		} catch (ValidationException e) {
			logger.error("Validation Exception while marshalling: ", e);
			throw new ConfigurationValidationException(
					"Invalid Fusion Configuration.", e);
		} catch (IOException e) {
			logger
					.error("IO Exception while passing writer to marshaller: ",
							e);
			throw new ConfigurationException(
					"Error while generating Fusion Configuration", e);

		} catch (MappingException e) {
			logger
					.error("Exception while passing mapping to unmarshaller: ",
							e);
			throw new ConfigurationException(
					"Error while generating Fusion Configuration.", e);
		} finally {
			if (writer != null) {
				try {
					writer.flush();
					writer.close();
				} catch (IOException e) {
					logger
							.error(
									"IO Exception while flushing and closing writer : ",
									e);
				}

			}
		}
	}

	/**
	 * @return the bundleContext
	 */
	public BundleContext getBundleContext() {
		return bundleContext;
	}

	/**
	 * @param bundleContext
	 *            the bundleContext to set
	 */
	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/**
	 * Returns the ClusteredStateManager.
	 * 
	 * @return
	 */
	private ClusteredStateManager getClusteredStateManager() {
		ClusteredStateManager stateManager = null;
		// publish the same to other instances also.
		ServiceReference adminServiceRef = this.getBundleContext()
				.getServiceReference(AdminService.class.getName());
		AdminService adminService = null;
		if (adminServiceRef != null) {
			adminService = (AdminService) this.getBundleContext().getService(
					adminServiceRef);
			if (adminService != null
					&& adminService.getMemberInfo().isClustered()) {
				stateManager = adminService.getClusteredStateManager();
			}
		}
		return stateManager;
	}

	/**
	 * @return the configuration
	 */
	public Configuration getConfiguration() {
		return this.configuration;
	}

	/**
	 * @param configuration
	 *            the configuration to set
	 */
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	/**
	 * 
	 * Utility method returns the local process configuration.
	 * 
	 * @param processId
	 * @return {@link ProcessConfiguration}
	 */
	public ProcessConfiguration getProcessConfiguration(String processId) {
		Configuration configuration = this.getConfiguration();
		ProcessConfiguration processConfiguration = null;
		if (configuration != null) {
			List<ProcessConfiguration> processes = configuration.getProcesses();
			if (configuration != null && processes != null) {
				for (ProcessConfiguration config : processes) {
					if (config.getId().equals(processId)) {
						processConfiguration = config;
						break;
					}
				}
			}
		}
		return processConfiguration;
	}

	@Override
	public List<ClusteredStateRequest> synchronize() throws Exception {
		logger.info("Generating synchronize request.");
		List<ClusteredStateRequest> requests = new ArrayList<ClusteredStateRequest>();
		ClusteredStateManager clusteredStateManager = this
				.getClusteredStateManager();
		if (clusteredStateManager != null) {
			try {
				ClusteredStateRequest req = this.getRequest();
				requests.add(req);
			} catch (Exception e) {
				logger.error("Error multicasting the configuration.", e);
				// FIXME Handle.
				// Currently ignoring the exception.
			}
		}
		return requests;
	}

	@Override
	public CacheReloadScheduleConfiguration getCacheReloadScheduleConfiguration(
			String cacheName) {

		Configuration configuration = getConfiguration();
		CacheReloadScheduleConfiguration cacheReloadScheduleConfiguration = null;
		if (configuration != null) {
			List<CacheReloadScheduleConfiguration> cacheReloadSchedules = configuration
					.getCacheReloadConfigurations();
			if (configuration != null && cacheReloadSchedules != null) {
				for (CacheReloadScheduleConfiguration config : cacheReloadSchedules) {
					if (config.getCacheName().trim().equals(cacheName.trim())) {
						cacheReloadScheduleConfiguration = config;
						break;
					}
				}
			}
		}
		return cacheReloadScheduleConfiguration;
	}

}
