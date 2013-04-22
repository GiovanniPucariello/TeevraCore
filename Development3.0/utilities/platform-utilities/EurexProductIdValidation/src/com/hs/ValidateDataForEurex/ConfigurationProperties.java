package com.hs.ValidateDataForEurex;

import java.util.Properties;

import com.hs.ValidateDataForEurex.JDBCProperties;

/**
 * Configuration properties
 * 
 * @author NBagchi
 * 
 */
public class ConfigurationProperties {

	private JDBCProperties jdbcProperties;
	private String updateStmt;
	private String selectQuery;

	static final String dbClassName = "database.driver.classname";
	static final String dbUser = "database.username";
	static final String dbPassword = "database.password";
	static final String dbUrl = "database.url";
	static final String dbPasswordLocation = "database.passwordLocation";

	ConfigurationProperties(Properties properties) {
		loadProperties(properties);
	}

	/**
	 * Load properties
	 * 
	 * @param properties
	 */
	private void loadProperties(Properties properties) {
		jdbcProperties = new JDBCProperties(
				properties.getProperty(dbClassName), properties
						.getProperty(dbUser), properties
						.getProperty(dbPassword), properties.getProperty(dbUrl));
		
		updateStmt = properties.getProperty("updateStmt");
		selectQuery = properties.getProperty("selectQuery");
	}

	/**
	 * Fetch JDBC properties
	 * 
	 * @return
	 */
	public JDBCProperties getJDBCProperties() {
		return jdbcProperties;
	}

	public String getUpdateStmt() {
		return updateStmt;
	}

	public void setUpdateStmt(String updateStmt) {
		this.updateStmt = updateStmt;
	}

	public String getSelectQuery() {
		return selectQuery;
	}

	public void setSelectQuery(String selectQuery) {
		this.selectQuery = selectQuery;
	}
}
