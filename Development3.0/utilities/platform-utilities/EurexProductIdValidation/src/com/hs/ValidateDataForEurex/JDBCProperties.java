package com.hs.ValidateDataForEurex;

/**
 * encapsulating properties related to JDBC connection
 * @author NBagchi
 *
 */
public class JDBCProperties {

	private String driverClassName;
	private String userName;
	private String password;
	private String url;

	JDBCProperties(String driverClassName, String userName, String password, String url) {
		this.driverClassName = driverClassName;
		this.userName = userName;
		this.password = password;
		this.url = url;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
