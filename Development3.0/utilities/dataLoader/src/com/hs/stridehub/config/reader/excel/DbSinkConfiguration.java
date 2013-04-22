/**
 * 
 */
package com.hs.stridehub.config.reader.excel;

import com.hs.stridehub.config.reader.SinkConfiguration;

/**
 * @author Ssoni
 *
 */
public class DbSinkConfiguration implements SinkConfiguration {

	private String url;
	private String userName;
	private String password;
	private String driver;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
}
