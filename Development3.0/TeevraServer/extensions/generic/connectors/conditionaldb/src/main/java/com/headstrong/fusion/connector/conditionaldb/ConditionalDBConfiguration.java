package com.headstrong.fusion.connector.conditionaldb;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 
 */
public class ConditionalDBConfiguration {

	private static Logger logger = LoggerFactory
			.getLogger(ConditionalDBConfiguration.class);
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
	 * insert Query to be executed.
	 */
	private String insertQuery;
	/**
	 * delete Query to be executed.
	 */
	private String deleteQuery;

	/**
	 * dataSource.
	 */
	private String dataSource;

	/**
	 * PrimaryKeys index .
	 */
	private String delPkStr;
	/**
	 * Other driver/database custom properties.
	 */
	private Map<String, String> customProperties;

	/**
	 * Query to insert into the temporary table
	 */
	private String insertTempQuery;
	/**
	 * Query to truncate the temporary table
	 */
	private String truncateTempQuery;

	/**
	 * Table Name where records need to be inserted
	 */
	private String tableToInsert;
	/**
	 * DRIVER NAMES.
	 */
	private static final String ORACLE_DRIVER = "";
	private static final String POSTGRE_DRIVER = "org.postgresql.Driver";
	private static final String MSSQL_DRIVER = "";

	public ConditionalDBConfiguration() {
	}

	public ConditionalDBConfiguration(Map<String, String> properties) {

		this.url = properties.get("url");
		this.driver = properties.get("driver");
		this.userName = properties.get("userName");
		this.password = properties.get("password");
		this.insertQuery = properties.get("insertQuery");
		this.deleteQuery = properties.get("deleteQuery");
		this.delPkStr = properties.get("delPkStr");
		this.dataSource = properties.get("dataSource");
		this.insertTempQuery = properties.get("insertTempQuery");
		this.truncateTempQuery = properties.get("truncateTempQuery");
		this.tableToInsert = properties.get("tableToInsert");
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
	 * @param dataSource;
	 */
	public void setDatasource(String datasource) {
		this.dataSource = datasource;
	}

	/**
	 * @return the insertQuery;
	 */
	public String getInsertQuery() {
		return insertQuery;
	}

	/**
	 * @return the delQuery;
	 */
	public String getDelQuery() {
		return deleteQuery;
	}

	/**
	 * @return the delPkStr;
	 */
	public String getdelPkStr() {
		return delPkStr;
	}

	/**
	 * @return the dataSource
	 */
	public String getDataSource() {
		return dataSource;
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
	 * @return the deleteQuery
	 */
	public String getDeleteQuery() {
		return deleteQuery;
	}

	/**
	 * @param deleteQuery
	 *            the deleteQuery to set
	 */
	public void setDeleteQuery(String deleteQuery) {
		this.deleteQuery = deleteQuery;
	}

	/**
	 * @return the delPkStr
	 */
	public String getDelPkStr() {
		return delPkStr;
	}

	/**
	 * @param delPkStr
	 *            the delPkStr to set
	 */
	public void setDelPkStr(String delPkStr) {
		this.delPkStr = delPkStr;
	}

	/**
	 * @return the insertTempQuery
	 */
	public String getInsertTempQuery() {
		return insertTempQuery;
	}

	/**
	 * @param insertTempQuery
	 *            the insertTempQuery to set
	 */
	public void setInsertTempQuery(String insertTempQuery) {
		this.insertTempQuery = insertTempQuery;
	}

	/**
	 * @return the truncateTempQuery
	 */
	public String getTruncateTempQuery() {
		return truncateTempQuery;
	}

	/**
	 * @param truncateTempQuery
	 *            the truncateTempQuery to set
	 */
	public void setTruncateTempQuery(String truncateTempQuery) {
		this.truncateTempQuery = truncateTempQuery;
	}

	/**
	 * @param insertQuery
	 *            the insertQuery to set
	 */
	public void setInsertQuery(String insertQuery) {
		this.insertQuery = insertQuery;
	}

	/**
	 * @param dataSource
	 *            the dataSource to set
	 */
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * @return the tableToInsert
	 */
	public String getTableToInsert() {
		return tableToInsert;
	}

	/**
	 * @param tableToInsert
	 *            the tableToInsert to set
	 */
	public void setTableToInsert(String tableToInsert) {
		this.tableToInsert = tableToInsert;
	}

}
