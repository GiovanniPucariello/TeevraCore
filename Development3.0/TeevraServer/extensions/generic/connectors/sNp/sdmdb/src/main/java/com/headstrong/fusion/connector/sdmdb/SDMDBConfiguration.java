package com.headstrong.fusion.connector.sdmdb;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;


/**
 *
 *
 */
public class SDMDBConfiguration {

	private static Logger logger = LoggerFactory
			.getLogger(SDMDBConfiguration.class);
	private static Long DEFAULT_INTERVAL = Long.valueOf(30000);
	private static int DEFAULT_READSIZE = 20000;

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
	 * Other driver/database custom properties.
	 */
	private Map<String, String> customProperties;

	/**
	 * DRIVER NAMES.
	 */
	private static final String ORACLE_DRIVER = "";
	private static final String POSTGRE_DRIVER = "org.postgresql.Driver";
	private static final String MSSQL_DRIVER = "";

	public SDMDBConfiguration() {
	}

	public SDMDBConfiguration(Map<String, String> properties) {

		this.url=properties.get("url");
		this.driver=properties.get("driver");
		this.userName=properties.get("userName");
		this.password=properties.get("password");
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

}
