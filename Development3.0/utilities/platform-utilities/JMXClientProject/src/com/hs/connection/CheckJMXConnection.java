package com.hs.connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Check JMX connection with the Fusion server.
 * 
 * @author NBagchi
 */
public class CheckJMXConnection {

	public static Properties properties = new Properties();

	static {
		try {
			properties.load(new FileInputStream("configuration.properties"));
		} catch (FileNotFoundException e) {
			try {
				System.out
						.println("Configuration.properties file not there in current directory. "
								+ "Using classpath to load");
				properties.load(ClassLoader
						.getSystemResourceAsStream("configuration.properties"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String url = properties.getProperty("JMXUrl");
		String userName = properties.getProperty("userName");
		String password = properties.getProperty("password");

		if (url != null && !url.trim().equals("")) {
			Thread aliveThread = null;

			if (userName != null && !userName.trim().equals("")
					&& password != null && !password.trim().equals("")) {

				aliveThread = new Thread(new KeepAlive(url, null, null));
			} else {
				aliveThread = new Thread(new KeepAlive(url, userName, userName));
			}

			aliveThread.run();

		}
	}
}
