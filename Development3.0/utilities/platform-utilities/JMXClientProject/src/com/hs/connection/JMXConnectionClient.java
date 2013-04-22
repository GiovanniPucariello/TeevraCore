package com.hs.connection;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import javax.management.AttributeNotFoundException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

/**
 * Encapsulating the connection Related information.
 * @author NBagchi
 */
public class JMXConnectionClient {
	private static final String KEY_LOGFILE = "logFile";
	
	private String url;
	private String user;
	private String password;

	private Method remoteMethod;
	private String remoteAttribute;

	private JMXConnector connector;

	public JMXConnectionClient(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}

	/**
	 * Establish connection
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public void connect() throws MalformedURLException, IOException {
		if (user == null || password == null) {
			connector = JMXConnectorFactory
					.connect(new JMXServiceURL(this.url));
		} else {
			Map<String, String[]> credentials = new HashMap<String, String[]>();
			credentials.put("jmx.remote.credentials", new String[] { user,
					password });
			connector = JMXConnectorFactory.connect(
					new JMXServiceURL(this.url), credentials);
		}
	}

	/**
	 * Check if the connection is alive or not
	 * @return
	 */
	public boolean isAlive() {
		try {
			connector.getConnectionId();
		} catch (NullPointerException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	/**
	 * Configure the client with method/attribute detail.
	 */
	public void configureConnection() {

		String remoteMethodName = CheckJMXConnection.properties
				.getProperty("remoteMethodName");
		String remoteMethodParams = CheckJMXConnection.properties
				.getProperty("remoteMethodParams");
		String remoteMethodSignature = CheckJMXConnection.properties
				.getProperty("remoteMethodSignature");

		String remoteAttribute = CheckJMXConnection.properties
				.getProperty("remoteAttribute");

		if (remoteMethodName != null && !remoteMethodName.trim().equals("")
				&& remoteMethodParams != null && !remoteMethodParams.trim().equals("")
				&& remoteMethodSignature != null && !remoteMethodSignature.trim().equals("")) {
			this.remoteMethod = new Method(remoteMethodName,
					toObjectArray(remoteMethodParams),
					toStringArray(remoteMethodSignature));
		} else {
			this.remoteAttribute = remoteAttribute;
		}
	}

	/**
	 * Execute Fusion API - Currently executing
	 * FusionRemoteAccessMBean.getProcesses
	 */
	public void pingRemoteMember() {

		try {
			MBeanServerConnection mbsc = connector.getMBeanServerConnection();

			ObjectName mbeanName = ObjectName
					.getInstance("fusion:type=ApplicationContext,index=Application Context");

			Object result = new Object();

			if (this.remoteMethod != null) {

				result = mbsc.invoke(mbeanName, this.remoteMethod
						.getRemoteAPIName(), this.remoteMethod.getParams(),
						this.remoteMethod.getSignature());

			} else {
				result = mbsc.getAttribute(mbeanName, this.remoteAttribute);
			}

			System.out.println(result);
			logConnectionStatus("Response: " + result);

		} catch (InstanceNotFoundException e) {
			e.printStackTrace();
		} catch (MBeanException e) {
			e.printStackTrace();
		} catch (ReflectionException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MalformedObjectNameException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (AttributeNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Log the connection status
	 * @param status
	 */
	public void logConnectionStatus(String status) {
		String logFileName = CheckJMXConnection.properties.getProperty(KEY_LOGFILE);
		
		if (logFileName == null) {
			return;
		}
		
		File file = new File(logFileName);
		try {
			BufferedWriter output = new BufferedWriter(new FileWriter(file,
					true));
			output.write(status);
			output.write("\n");
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Split String to Object array
	 * @param text
	 * @return
	 */
	private Object[] toObjectArray(String text) {

		Object[] returnVal = text.split(",");
		return returnVal;
	}

	/**
	 * Split String to String array
	 * @param text
	 * @return
	 */
	private String[] toStringArray(String text) {

		String[] returnVal = text.split(",");
		return returnVal;
	}
}
