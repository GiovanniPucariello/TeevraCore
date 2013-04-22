package com.hs.ValidateDataForEurex;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Read the configuration from properties file
 * 
 * @author NBagchi
 * 
 */
public class ConfigReader {

	private Properties localConfProperties;

	private static final String confFile = "configuration.properties";
	private static final String fusionProp = "fusion.properties";
	private static final String fusionUrlKey = "fusionPropertyURL";

	ConfigReader() {
		localConfProperties = new Properties();
		read();
	}

	/**
	 * Read the properties from configuration file and fusion.properties
	 */
	private void read() {
		try {
			localConfProperties.load(new FileInputStream(confFile));

			Properties fusionProperties = new Properties();
			fusionProperties.load(new FileInputStream(localConfProperties
					.getProperty(fusionUrlKey)
					+ "/" + fusionProp));

			copyJDBCProperties(fusionProperties, localConfProperties);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Load JDBC properties from fusion properties
	 * 
	 * @return
	 */
	private static void copyJDBCProperties(Properties srcProperties,
			Properties destProperties) {

		String driverClassName = srcProperties
				.getProperty(ConfigurationProperties.dbClassName);
		String userName = srcProperties
				.getProperty(ConfigurationProperties.dbUser);
		String url = srcProperties.getProperty(ConfigurationProperties.dbUrl);

		if (driverClassName != null && !driverClassName.trim().equals("")
				&& userName != null && !userName.trim().equals("")
				&& url != null && !url.trim().equals("")) {

			String password = srcProperties
					.getProperty(ConfigurationProperties.dbPassword);

			if (password == null || password.trim().equals("")) {
				String passwordLocation = srcProperties
						.getProperty(ConfigurationProperties.dbPasswordLocation);
				FileInputStream fStream = null;
				try {
					fStream = new FileInputStream(passwordLocation);
					DataInputStream input = new DataInputStream(fStream);
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(input));
					password = reader.readLine();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			destProperties.put(ConfigurationProperties.dbClassName,
					driverClassName);
			destProperties.put(ConfigurationProperties.dbUser, userName);
			destProperties.put(ConfigurationProperties.dbPassword, password);
			destProperties.put(ConfigurationProperties.dbUrl, url);

		}
	}

	/**
	 * Return the Configuration
	 * 
	 * @return
	 */
	public Properties getConfiguration() {
		return localConfProperties;

	}
}
