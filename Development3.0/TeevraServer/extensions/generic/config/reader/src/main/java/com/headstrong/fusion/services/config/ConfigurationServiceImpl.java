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
 * $Id: SchemaReader.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 15, 2008 
 */

package com.headstrong.fusion.services.config;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.ServiceNotFoundException;


import org.apache.commons.io.IOUtils;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.ConfigurationService;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.commons.resolver.exception.ServiceUnavailableException;
import com.headstrong.fusion.services.config.exception.ServiceConfigurationParseException;
import com.headstrong.fusion.services.config.exception.ServiceConfigurationParserNotFoundException;
import com.headstrong.fusion.services.config.parse.ServiceConfigParser;
import com.headstrong.fusion.services.config.parse.ServiceConfigurationParserRegistry;
import com.headstrong.fusion.services.config.vo.ServiceConfiguration;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;

/**
 * Schema Reader reads the schema definition from STRIDEHub database. and caches
 * the schema locally.
 * <p>
 * It also provides API for service configuration parser
 * {@link ServiceConfigParser}. Any service which requires the configuration to
 * be parsed before being cached can register the corresponding service
 * configuration parser.
 * <p>
 * All service configuration parsers should be registered before the
 * configuration is cached. so the start level of the bundle which provides
 * service configuration parser be less than service configuration reader
 * bundle.
 * 
 */
public class ConfigurationServiceImpl implements ConfigurationService {

	private static final Logger logger = LoggerFactory
			.getLogger(ConfigurationServiceImpl.class);
	ServiceConfigurationParserRegistry serviceConfigurationParserRegistry = ServiceConfigurationParserRegistry
			.getInstance();
	private static final String serviceConfigurationQuery = "SELECT prcs_id, property_id, property_config, "
			+ "service_id, service_type FROM process_service_configuration";
	private static final String serviceConfigurationQueryProcessIdCheck = "SELECT prcs_id, property_id, property_config, "
			+ "service_id, service_type FROM process_service_configuration where prcs_id = ?";

	/**
	 * Constructor requires OSGI {@link BundleContext} to resolve service
	 * configuration parser services.
	 * 
	 * @param bundleContext
	 */
	public ConfigurationServiceImpl() {
	}

	/**
	 * Reloads the schema definition from STRIDEHub Database.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws SQLException
	 * @throws ServiceConfigurationParseException
	 * @throws ServiceUnavailableException
	 * @throws ServiceNotFoundException
	 */

	public synchronized void reloadConfiguration() throws SQLException,
			ServiceConfigurationParseException, ServiceUnavailableException {
		ServiceConfigurationCache cache = ServiceConfigurationCache
				.getInstance();
		Connection connection = null;
		try {
			connection = DatabaseManager.getInstance(FusionConstants.FUSIONDB)
					.getConnection();
		} catch (SQLException e1) {
			logger.error("Error getting the Fusion database connection", e1);
			throw e1;
		}

		if (connection != null) {

			/**
			 * Schema table statement and result set
			 */
			Statement serviceConfigStmt = null;
			ResultSet serviceConfigRs = null;

			try {

				serviceConfigStmt = connection.createStatement();
				serviceConfigRs = serviceConfigStmt
						.executeQuery(serviceConfigurationQuery);

				while (serviceConfigRs.next()) {
					ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
					serviceConfiguration.setProcessId(serviceConfigRs
							.getString("prcs_id"));
					serviceConfiguration.setServiceId(serviceConfigRs
							.getString("service_id"));
					serviceConfiguration.setPropertyId(serviceConfigRs
							.getString("property_id"));

					Clob clob = serviceConfigRs.getClob("property_config");
					InputStream inputStream = clob.getAsciiStream();
					StringWriter writer = new StringWriter();
					IOUtils.copy(inputStream, writer, "UTF-8");
					Object propertyConfig = null;

					// TODO - Data type of property_config changed to CLOB to 
					// handle issue with data type size.
					/*Object propertyConfig = serviceConfigRs
							.getObject("property_config");*/
					String serviceType = serviceConfigRs
							.getString("service_type");
					// If config type is present search for the corresponding
					// parser.
					if (serviceType != null) {
						try {
							String parserType = serviceConfigurationParserRegistry
									.getServiceConfigurationParser(serviceType,
											serviceConfiguration
													.getPropertyId());
							ServiceConfigParser configurationParser = (ServiceConfigParser) ServiceAliasManager
									.getInstance().getServiceByAlias(
											parserType, 0);

							if (configurationParser != null) {
								propertyConfig = configurationParser
										.parseConfiguration(writer.toString());
							}

						} catch (ServiceConfigurationParserNotFoundException e) {
							// Currently being ignored. Need relook.
							logger.error(
									"No configuration parser found for service type "
											+ serviceType
											+ " and property type "
											+ serviceConfiguration
													.getPropertyId(), e);
						}

					}
					cache.addPropertyConfiguration(serviceConfiguration,
							propertyConfig);
				}
			} catch (SQLException e) {
				logger.error("Error reading the service configuration.", e);
				throw e;
			} catch (IOException e) {
				logger.error("Error parsing the service configuration.", e);
				throw new ServiceConfigurationParseException(
						"Error parsing the service configuration.", e);
			} catch (ServiceConfigurationParseException e) {
				logger.error("Error parsing the service configuration.", e);
				throw e;
			} catch (ServiceUnavailableException e) {
				logger
						.error(
								"Error parsing the service configuration. "
										+ "No configuration parser service found for the config type.",
								e);
				throw e;
			} finally {
				DatabaseManager.releaseResources(connection, serviceConfigStmt,
						serviceConfigRs);
			}
		}
	}

	/**
	 * Reloads the schema definition from STRIDEHub Database.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws SQLException
	 * @throws ServiceConfigurationParseException
	 * @throws ServiceUnavailableException
	 * @throws ServiceNotFoundException
	 */

	public synchronized void reloadConfiguration(String processId)
			throws SQLException, ServiceConfigurationParseException,
			ServiceUnavailableException {
		ServiceConfigurationCache cache = ServiceConfigurationCache
				.getInstance();
		Connection connection = null;
		try {
			connection = DatabaseManager.getInstance(FusionConstants.FUSIONDB)
					.getConnection();
		} catch (SQLException e1) {
			logger.error("Error getting the Fusion database connection", e1);
			throw e1;
		}

		if (connection != null) {

			/**
			 * Schema table statement and result set
			 */
			PreparedStatement serviceConfigStmt = null;
			ResultSet serviceConfigRs = null;

			try {

				serviceConfigStmt = connection
						.prepareStatement(serviceConfigurationQueryProcessIdCheck);
				serviceConfigStmt.setInt(1, Integer.parseInt(processId));
				serviceConfigRs = serviceConfigStmt.executeQuery();

				while (serviceConfigRs.next()) {
					ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
					serviceConfiguration.setProcessId(serviceConfigRs
							.getString("prcs_id"));
					serviceConfiguration.setServiceId(serviceConfigRs
							.getString("service_id"));
					serviceConfiguration.setPropertyId(serviceConfigRs
							.getString("property_id"));

					Clob clob = serviceConfigRs.getClob("property_config");
					InputStream inputStream = clob.getAsciiStream();
					StringWriter writer = new StringWriter();
					IOUtils.copy(inputStream, writer, "UTF-8");
					
					Object propertyConfig = null;

					/*Object propertyConfig = serviceConfigRs
							.getObject("property_config");*/
					String serviceType = serviceConfigRs
							.getString("service_type");
					// If config type is present search for the corresponding
					// parser.
					if (serviceType != null) {
						try {
							String parserType = serviceConfigurationParserRegistry
									.getServiceConfigurationParser(serviceType,
											serviceConfiguration
													.getPropertyId());
							ServiceConfigParser configurationParser = (ServiceConfigParser) ServiceAliasManager
									.getInstance().getServiceByAlias(
											parserType, 0);
							if (configurationParser != null) {
								propertyConfig = configurationParser
										.parseConfiguration(writer.toString());
							}
						} catch (ServiceConfigurationParserNotFoundException e) {
							// Currently being ignored. Need relook.
							logger.error(
									"No configuration parser found for service type "
											+ serviceType
											+ " and property type "
											+ serviceConfiguration
													.getPropertyId(), e);
						}

					}
					cache.addPropertyConfiguration(serviceConfiguration,
							propertyConfig);
				}
			} catch (SQLException e) {
				logger.error("Error reading the service configuration.", e);
				throw e;
			} catch (ServiceConfigurationParseException e) {
				logger.error("Error parsing the service configuration.", e);
				throw e;
			} catch (IOException e) {
				logger.error("Error parsing the service configuration.", e);
				throw new ServiceConfigurationParseException(
						"Error parsing the service configuration.", e);
			} catch (ServiceUnavailableException e) {
				logger
						.error(
								"Error parsing the service configuration. "
										+ "No configuration parser service found for the config type.",
								e);
				throw e;
			} finally {
				DatabaseManager.releaseResources(connection, serviceConfigStmt,
						serviceConfigRs);
			}
		}
	}
}
