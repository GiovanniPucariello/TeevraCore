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
 * $Id: DBEndPoint.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.io.File;
import java.io.FileReader;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jdbc.JdbcComponent;
import org.apache.camel.impl.JndiRegistry;
import org.apache.camel.impl.PropertyPlaceholderDelegateRegistry;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.camel.spi.Registry;
import org.apache.commons.io.IOUtils;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.DecryptionException;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.connector.db.component.BatchSqlComponent;
import com.headstrong.fusion.core.BundleContextManager;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.messaging.service.DbUpdateProcessor;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * Implementation of DBEndpoint. It uses camel-jdbc for reading data from
 * database. It uses batchsql for writing data into database.
 */
public class DbBindingEndPointModeler extends AbstractBindingEndPointModeler {

	private static Logger logger = LoggerFactory
			.getLogger(DbBindingEndPointModeler.class);
	private static Long DEFAULT_INTERVAL = Long.valueOf(30000);
	private static int DEFAULT_READSIZE = 20000;
	private static final String KEY = "fusion.encryption.keyPath";

	/**
	 * Database connection URL string.
	 */
	private String url;

	/**
	 * Database connection driver class name.
	 */
	private String driver;
	/**
	 * Database user name.
	 */
	private String userName;
	/**
	 * Database password ( un-encrypted)
	 */
	private String password;
	/**
	 * Query to be executed.
	 */
	private String query;
	/**
	 * Wait interval.
	 */
	private Long interval;
	/**
	 * Update query to be run if the endpoint is source.
	 */
	private String updateQuery;
	/**
	 * No. of record to be read.
	 */
	private int readSize;
	/**
	 * Other driver/database custom properties.
	 */
	private Map<String, String> customProperties;
	private BundleContext context;

	/**
	 * DRIVER NAMES.
	 */
	private static final String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	private static final String POSTGRE_DRIVER = "org.postgresql.Driver";
	private static final String MSSQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String SYBASE_DRIVER = "com.sybase.jdbc3.jdbc.SybDriver";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.model.binding.AbstractBindingEndPointModeler#init(com.headstrong.fusion.config.ConnectorConfig)
	 */
	public void init(CamelProcessContext processContext, ConnectorConfig config)
			throws InitializationException {
		// call the init of the AbstractBindingEndpoint.
		this.context = BundleContextManager.getInstance().getBundleContext();
		super.init(config, DbBindingProperty.values());
		this.configure(config);
	}

	/**
	 * Private utility method returns the database connection pool based on the
	 * configuration provided.
	 * 
	 * @return Database connection pool.
	 * @throws ProcessModellingException
	 */
	private DbPool getDbPool() throws ProcessModellingException {
		Map<String, String> dbProps = new HashMap<String, String>();
		dbProps.put(FusionConstants.DATABASE_CLASSNAME, this.getDriver());
		dbProps.put(FusionConstants.DATABASE_USERNAME, this.getUserName());
		dbProps.put(FusionConstants.DATABASE_PASSWORD, this.getPassword());
		dbProps.put(FusionConstants.DATABASE_URL, this.getUrl());
		if (this.getCustomProperties() != null
				&& !this.customProperties.isEmpty()) {
			dbProps.putAll(this.getCustomProperties());
		}
		DbPool dbPool = null;
		try {
			dbPool = DatabaseManager.setupDBPool(dbProps);
		} catch (FusionException e1) {
			logger.error("Error while setting up db pool with properties :"
					+ dbProps);
			throw new ProcessModellingException(
					"Error while setting up db pool with properties :"
							+ dbProps, e1);
		}
		return dbPool;
	}

	/**
	 * Reads the properties from the properties map and set the bean properties.
	 * 
	 * @precondition config != null
	 * @param properties
	 * @param bean
	 * @throws FusionException
	 */
	private void configure(ConnectorConfig connectorConfig)
			throws InitializationException {
		Map<String, String> properties = connectorConfig.getProperties();
		if (properties.containsKey(DbBindingProperty.serverType.toString())) {
			String serverType = properties.get(DbBindingProperty.serverType
					.toString());
			if (serverType.equalsIgnoreCase("PostGre SQL")) {
				this.setDriver(POSTGRE_DRIVER);
			} else if (serverType.equalsIgnoreCase("Oracle")) {
				this.setDriver(ORACLE_DRIVER);
			} else if (serverType.equalsIgnoreCase("MS SQL Server")) {
				this.setDriver(MSSQL_DRIVER);
			}else if (serverType.equalsIgnoreCase("Sybase")) {
				this.setDriver(SYBASE_DRIVER); 
			}else {
				throw new InitializationException("Database " + serverType
						+ "not supported");
			}
		}
		if (properties.containsKey(DbBindingProperty.userName.toString())) {
			this.setUserName(properties.get(DbBindingProperty.userName
					.toString()));
		}
		// Decrypting the encrypted password.
		if (properties.containsKey(DbBindingProperty.passwordFileLocation.toString())) {
			try {
				String encryptedPassword = properties.get(IOUtils.toString(new FileReader(new File(DbBindingProperty.passwordFileLocation.toString()))));
				if (!encryptedPassword.trim().equals("")) {
					this.setPassword(FusionUtil.decrypt(encryptedPassword,context.getProperty(KEY)));
				} else {
					this.setPassword(encryptedPassword);
				}
			} catch (DecryptionException e) {
				e.printStackTrace();
				logger.error("Error occured durion password decryption");
			} catch (NoSuchAlgorithmException e) {
				logger.error("Error while decrypting the message: Invalid algorithm" +e);						
			} catch (NoSuchPaddingException e) {
				logger.error("Error while decrypting the message: Invalid padding"+e);
			} catch (IllegalBlockSizeException e) {
				logger.error("Error while decrypting the message: Illegal block size "+e);
			} catch (BadPaddingException e) {
				logger.error("Error while decrypting the message: Bad padding "+e);
			} catch (Exception e) {
				logger.error("Error while decrypting the message."+e);						
			}
		}
		if (properties.containsKey(DbBindingProperty.url.toString())) {
			this.setUrl(properties.get(DbBindingProperty.url.toString()));
		}
		if (properties.containsKey(DbBindingProperty.query.toString())) {
			this.setQuery(properties.get(DbBindingProperty.query.toString()));
		}

		if (properties.containsKey(DbBindingProperty.updateQuery.toString())) {
			this.setUpdateQuery(properties.get(DbBindingProperty.updateQuery
					.toString()));
		}

		this.setReadSize(DEFAULT_READSIZE);
		if (properties.containsKey(DbBindingProperty.readSize.toString())) {
			try {
				this.setReadSize(Integer.parseInt(properties
						.get(DbBindingProperty.readSize.toString())));
			} catch (Exception e) {
				logger.error("Invalid readsize. setting to default");
			}
		}

		this.setInterval(DEFAULT_INTERVAL);
		if (properties.containsKey(DbBindingProperty.interval.toString())) {
			try {
				this.setInterval(Long.parseLong(properties
						.get(DbBindingProperty.interval.toString())));
			} catch (NumberFormatException e) {
				// Ignore.
				logger
						.info("Invalid interval specified, setting default interval.");
			}
		}
		// get custom properties
		// format -- name1=value1;name2=value2
		if (properties.containsKey(DbBindingProperty.customProperties
				.toString())) {
			Map<String, String> customPropMap = new HashMap<String, String>();
			String[] customProps = properties.get(
					DbBindingProperty.customProperties.toString()).split(";");
			for (String customPropPair : customProps) {
				int i = customPropPair.indexOf("=");
				if (i > -1) {
					String key = customPropPair.substring(0, i);
					String value = customPropPair.substring(i + 1);
					customPropMap.put(key, value);
				} else {
					throw new InitializationException(
							"Invalid custom property definition"
									+ customPropPair);
				}
			}
			this.setCustomProperties(customPropMap);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.BindingEndPoint#modelFrom(org.apache.camel.builder.RouteBuilder)
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition modelFrom(RouteBuilder routeBuilder)
			throws ProcessModellingException {
		ProcessorDefinition processorType = null;
		DbPool dbPool = this.getDbPool();
		Registry camelRegistry = ((PropertyPlaceholderDelegateRegistry)routeBuilder.getContext().getRegistry()).getRegistry();
		if (camelRegistry instanceof JndiRegistry) {
			((JndiRegistry) camelRegistry).bind(
					"ds" + this.getConfig().getId(), dbPool.getDataSource());
		} else {
			logger
					.error("Error while getting the camel registry to register data source");
			throw new ProcessModellingException(
					"Error while getting the camel registry to register data source");
		}

		JdbcComponent jdbcComponent = new JdbcComponent();

		if (jdbcComponent != null) {
			registerComponent(routeBuilder.getContext(), "jdbc"
					+ this.getConfig().getId(), jdbcComponent);
		}

		processorType = routeBuilder.from("timer:" + this.getConfig().getId()
				+ "?period=" + this.getInterval());
		processorType = processorType.setBody(
				routeBuilder.constant(this.getQuery())).to(
				"jdbc" + this.getConfig().getId() + ":" + "ds"
						+ this.getConfig().getId() + "?readSize="
						+ this.getReadSize());

		/*
		 * If update query is present, then add that as a processor
		 */
		if (this.getUpdateQuery() != null) {
			DbUpdateProcessor dbUpdateProcessor = new DbUpdateProcessor(this
					.getUpdateQuery());
			dbUpdateProcessor.setDataSource(dbPool.getDataSource());
			processorType = processorType.process(dbUpdateProcessor);
		}

		processorType = processorType.choice().when(
				routeBuilder.header("totalrecords").isEqualTo(0)).otherwise();

		return processorType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.BindingEndPoint#modelTo(org.apache.camel.builder.RouteBuilder,
	 *      org.apache.camel.model.ProcessorType)
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition modelTo(RouteBuilder routeBuilder,
			ProcessorDefinition processorType) throws ProcessModellingException {
		DbPool dbPool = this.getDbPool();
		BatchSqlComponent component = new BatchSqlComponent();
		if (component != null) {
			registerComponent(routeBuilder.getContext(), "sql"
					+ this.getConfig().getId(), component);
		}
		routeBuilder.getContext().getComponent(
				"sql" + this.getConfig().getId(), BatchSqlComponent.class)
				.setDataSource(dbPool.getDataSource());
		return processorType.to("sql" + this.getConfig().getId() + ":"
				+ this.getQuery());
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the driver
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * @param driver
	 *            the driver to set
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query
	 *            the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * @return the interval
	 */
	public Long getInterval() {
		return interval;
	}

	/**
	 * @param interval
	 *            the interval to set
	 */
	public void setInterval(Long interval) {
		this.interval = interval;
	}

	/**
	 * @return the customProperties
	 */
	public Map<String, String> getCustomProperties() {
		return customProperties;
	}

	/**
	 * @param customProperties
	 *            the customProperties to set
	 */
	public void setCustomProperties(Map<String, String> customProperties) {
		this.customProperties = customProperties;
	}

	/**
	 * @return the updateQuery
	 */
	public String getUpdateQuery() {
		return updateQuery;
	}

	/**
	 * @param updateQuery
	 *            the updateQuery to set
	 */
	public void setUpdateQuery(String updateQuery) {
		this.updateQuery = updateQuery;
	}

	/**
	 * @return the readSize
	 */
	public int getReadSize() {
		return readSize;
	}

	/**
	 * @param readSize
	 *            the readSize to set
	 */
	public void setReadSize(int readSize) {
		this.readSize = readSize;
	}

	/**
	 * Properties Expected by DbBindingEndPointModeler.
	 * 
	 */
	private static enum DbBindingProperty implements BindingProperty {
		url {
			public boolean isMandatory() {
				return true;
			}
		},
		serverType {
			public boolean isMandatory() {
				return true;
			}
		},
		userName {
			public boolean isMandatory() {
				return true;
			}
		},
		passwordFileLocation {
			public boolean isMandatory() {
				return true;
			}
		},
		query {
			public boolean isMandatory() {
				return true;
			}
		},
		updateQuery {
			public boolean isMandatory() {
				return false;
			}
		},
		interval, customProperties, readSize;

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.headstrong.fusion.messaging.model.endpoint.model.model.binding.BindingProperty#isMandatory()
		 */
		public boolean isMandatory() {
			return false;
		}
	}
}
