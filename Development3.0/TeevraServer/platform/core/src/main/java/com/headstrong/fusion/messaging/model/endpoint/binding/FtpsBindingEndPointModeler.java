package com.headstrong.fusion.messaging.model.endpoint.binding;

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
 * $Id: FtpBindingEndPointModeler.java
 * $Revision: 
 * $Author: PBansal
 * $DateTime: May 2, 2012 
 */

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.remote.FtpsComponent;
import org.apache.camel.component.file.remote.FtpsConfiguration;
import org.apache.camel.component.file.remote.FtpsEndpoint;
import org.apache.camel.converter.IOConverter;
import org.apache.camel.model.ProcessorDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.DecryptionException;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.messaging.service.DataToFileProcessor;

/**
 * FTPS End Point.
 * 
 */
public class FtpsBindingEndPointModeler extends AbstractBindingEndPointModeler {

	private static final Logger logger = LoggerFactory
			.getLogger(FtpsBindingEndPointModeler.class);

	private static long DEFAULT_DELAY = 50000;
	/**
	 * FTPS server host name/id. This is generally the System IP address wherein
	 * the FTPS Server is running.
	 */
	private String host;
	/**
	 * Port number. By default this port will be 2222 for FTPS.
	 */
	private int port;
	/**
	 * User name of the account configured in the FTP Server
	 */
	private String user;
	/**
	 * Password for the account
	 */
	private String password;
	/**
	 * FTPS Directory. Any sub-directory name could be configured under the FTPS
	 * location.
	 */
	private String directory;
	/**
	 * Delay.
	 */
	private long delay;

	/**
	 * Delete file. This option when true deletes the files from the FTPS
	 * directory after consumption
	 */
	private boolean deleteFile;

	/**
	 * Passive mode. When False, directs the FTPS server to function in ACTIVE
	 * Mode.
	 */
	private boolean passiveMode;

	/**
	 * Security protocol which may be TLS (Transport Layer Security ) / SSL
	 * (Secure Sockets Layer)
	 */
	private String securityProtocol;

	/**
	 * Protocol is implicit / explicit
	 */
	private boolean isImplicit;

	/**
	 * ftpClient.keyStore.file. FTPS client looks up into the keystore file for
	 * the private certificate.
	 */
	private String keyStoreFile;

	/**
	 * ftpClient.keyStore.password. Sets the key store password.
	 */
	private String keyStorePassword;

	/**
	 * ftpClient.keyStore.keyPassword. Sets the private key password.
	 */
	private String keyPassword;

	/**
	 * ftpClient.trustStore.file. Sets the trust store file, so that the FTPS
	 * client can look up for trusted certificates.
	 */
	private String trustStoreFile;

	/**
	 * ftpClient.trustStore.password. Sets the trust store password.
	 */
	private String trustStorePassword;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.model.binding.AbstractBindingEndPointModeler#init(com.headstrong.fusion.config.ConnectorConfig)
	 */
	public void init(CamelProcessContext processContext, ConnectorConfig config)
			throws InitializationException {
		// call the init of the AbstractBindingEndpoint.
		super.init(config, FtpsBindingProperty.values());
		this.configure(config);
	}

	/**
	 * Reads the properties from the properties map and set the bean properties.
	 * 
	 * @precondition config != null
	 * @param properties
	 * @param bean
	 * @throws InitializationException
	 */
	private void configure(ConnectorConfig config)
			throws InitializationException {
		Map<String, String> properties = config.getProperties();

		if (properties.containsKey(FtpsBindingProperty.host.toString())) {
			this.setHost(properties.get(FtpsBindingProperty.host.toString()));
		}

		if (properties.containsKey(FtpsBindingProperty.port.toString())) {
			this.setPort(Integer.parseInt(properties
					.get(FtpsBindingProperty.port.toString())));
		}
		if (properties.containsKey(FtpsBindingProperty.user.toString())) {
			this.setUser(properties.get(FtpsBindingProperty.user.toString()));
		}
		if (properties.containsKey(FtpsBindingProperty.deleteFile.toString())
				&& properties.get(FtpsBindingProperty.deleteFile.toString())
						.equalsIgnoreCase("true")) {
			this.setDeleteFile(true);
		} else {
			this.setDeleteFile(false);
		}
		// Decrypting the encrypted password.
		if (properties.containsKey(FtpsBindingProperty.password.toString())) {
			try {
				String encryptedPassword = properties
						.get(FtpsBindingProperty.password.toString());
				if (!encryptedPassword.trim().equals("")) {
					this.setPassword(FusionUtil.decrypt(encryptedPassword));
				} else {
					this.setPassword(encryptedPassword);
				}
			} catch (DecryptionException e) {
				e.printStackTrace();
				logger.error("Error occured durion password decryption");
			}
		}
		if (properties.containsKey(FtpsBindingProperty.directory.toString())) {
			this.setDirectory(properties.get(FtpsBindingProperty.directory
					.toString()));
		}
		if (properties.containsKey(FtpsBindingProperty.keyStoreFile.toString())) {
			this.setKeyStoreFile(properties
					.get(FtpsBindingProperty.keyStoreFile.toString()));
		}
		// Decrypting the encrypted password.
		if (properties.containsKey(FtpsBindingProperty.keyStorePassword
				.toString())) {

			try {
				String encryptedPassword = properties
						.get(FtpsBindingProperty.keyStorePassword.toString());
				if (!encryptedPassword.trim().equals("")) {
					this.setKeyStorePassword(FusionUtil
							.decrypt(encryptedPassword));
				} else {
					this.setKeyStorePassword(encryptedPassword);
				}
			} catch (DecryptionException e) {
				e.printStackTrace();
				logger.error("Error occured durion password decryption");
			}
		}
		// Decrypting the encrypted password.
		if (properties.containsKey(FtpsBindingProperty.keyPassword.toString())) {
			 try {
			 String encryptedPassword = properties
			 .get(FtpsBindingProperty.keyPassword.toString());
			 if (!encryptedPassword.trim().equals("")) {
			 this.setKeyPassword(FusionUtil.decrypt(encryptedPassword));
			 } else {
			 this.setKeyPassword(encryptedPassword);
			 }
			 } catch (DecryptionException e) {
			 e.printStackTrace();
			 logger.error("Error occured durion password decryption");
			 }
		}
		// Decrypting the encrypted password.
		if (properties.containsKey(FtpsBindingProperty.trustStoreFile
				.toString())) {
			this.setTrustStoreFile(properties
					.get(FtpsBindingProperty.trustStoreFile.toString()));
		}

		if (properties.containsKey(FtpsBindingProperty.trustStorePassword
				.toString())) {
			try {
				String encryptedPassword = properties
						.get(FtpsBindingProperty.trustStorePassword.toString());
				if (!encryptedPassword.trim().equals("")) {
					this.setTrustStorePassword(FusionUtil
							.decrypt(encryptedPassword));
				} else {
					this.setTrustStorePassword(encryptedPassword);
				}
			} catch (DecryptionException e) {
				e.printStackTrace();
				logger.error("Error occured durion password decryption");
			}
		}

		if (properties.containsKey(FtpsBindingProperty.securityProtocol
				.toString())) {
			this.setSecurityProtocol(properties
					.get(FtpsBindingProperty.securityProtocol.toString()));
		}

		if (properties.containsKey(FtpsBindingProperty.passive.toString())) {
			this.setPassiveMode(Boolean.parseBoolean(properties
					.get(FtpsBindingProperty.passive.toString())));
		}
		this.setDelay(DEFAULT_DELAY);
		if (properties.containsKey(FtpsBindingProperty.delay.toString())) {
			try {
				this.setDelay(Long.parseLong(properties
						.get(FtpsBindingProperty.delay.toString())));
			} catch (Exception e) {
				logger.error("Invalid delay specified, setting to default "
						+ DEFAULT_DELAY);
			}
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

		FtpsComponent component = new FtpsComponent();
		component.setCamelContext(routeBuilder.getContext());
		registerComponent(routeBuilder.getContext(), "ftps", component);

		FtpsConfiguration config = new FtpsConfiguration();
		config.setHost(this.getHost());
		config.setPort(this.getPort());
		config.setUsername(this.getUser());
		config.setPassword(this.getPassword());
		config.setBinary(false);
		config.setDirectory(this.getDirectory());
		config.setProtocol("ftps");
		config.setPassiveMode(this.isPassiveMode());
		config.setSecurityProtocol(this.getSecurityProtocol());
		config.setIsImplicit(this.isImplicit());
		// Stepwise means that it will CD one directory at a time. If false,
		// this operation will be disabled.
		config.setStepwise(false);
		// component.setConfiguration(config);

		FtpsEndpoint endPoint = new FtpsEndpoint("ftps", component, config);
		endPoint.setIdempotent(true);
		Map<String, Object> keyStoreParam = new HashMap<String, Object>();
		Map<String, Object> trustStoreParam = new HashMap<String, Object>();
		keyStoreParam.put("file", this.keyStoreFile);
		keyStoreParam.put("password", this.getKeyStorePassword());
		keyStoreParam.put("keyPassword", this.getKeyPassword());
		trustStoreParam.put("file", this.getTrustStoreFile());
		trustStoreParam.put("password", this.getTrustStorePassword());
		endPoint.setFtpClientKeyStoreParameters(keyStoreParam);
		endPoint.setFtpClientTrustStoreParameters(trustStoreParam);
		endPoint.setDelete(isDeleteFile());

		Map<String, Object> temp = new HashMap<String, Object>();
		temp.put("delay", getDelay()); // nbi - check if to use consumer.delay
		endPoint.setConsumerProperties(temp);
		// endPoint.setDelete(false);

		/*
		 * processorType = routeBuilder .from( config.toString() + "?" +
		 * "password=" + this.getPassword() +
		 * "&binary=false&consumer.delay=50000&consumer.deleteFile=true")
		 * .convertBodyTo(String.class);
		 */

		processorType = routeBuilder.from(endPoint).convertBodyTo(String.class);

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
		FtpsComponent component = new FtpsComponent();
		component.setCamelContext(routeBuilder.getContext());

		FtpsConfiguration config = new FtpsConfiguration();

		config.setHost(this.getHost());
		config.setPort(this.getPort());
		config.setUsername(this.getUser());
		config.setPassword(this.getPassword());
		config.setBinary(false);
		config.setProtocol("ftps");
		config.setDirectory(this.getDirectory());
		config.setPassiveMode(this.isPassiveMode());
		config.setSecurityProtocol(this.getSecurityProtocol());
		config.setIsImplicit(this.isImplicit());
		config.setStepwise(false);
		// component.setConfiguration(config);

		FtpsEndpoint endPoint = new FtpsEndpoint("ftps", component, config);

		// endPoint.setIdempotent(true);
		Map<String, Object> keyStoreParam = new HashMap<String, Object>();
		Map<String, Object> trustStoreParam = new HashMap<String, Object>();
		keyStoreParam.put("file", this.keyStoreFile);
		keyStoreParam.put("password", this.getKeyStorePassword());
		keyStoreParam.put("keyPassword", this.getKeyPassword());
		trustStoreParam.put("file", this.getTrustStoreFile());
		trustStoreParam.put("password", this.getTrustStorePassword());
		endPoint.setFtpClientKeyStoreParameters(keyStoreParam);
		endPoint.setFtpClientTrustStoreParameters(trustStoreParam);
		if (component != null) {
			registerComponent(routeBuilder.getContext(), "ftps", component);
		}
		processorType = processorType.process(new DataToFileProcessor()).to(
				endPoint).process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {
				Object data = exchange.getIn().getBody();
				if (data instanceof InputStream) {
					exchange.getIn().setBody(
							IOConverter.toString((InputStream) data));
				}

			}
		});
		return processorType;
	}

	/**
	 * Properties Expected by DbBindingEndPointModeler.
	 * 
	 */
	private static enum FtpsBindingProperty implements BindingProperty {

		host, port, user, password, directory, deleteFile, passive, securityProtocol, isImplicit, keyStoreFile, keyStorePassword, keyPassword, trustStoreFile, trustStorePassword {
			public boolean isMandatory() {
				return true;
			}
		},

		delay;

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.headstrong.fusion.messaging.model.endpoint.model.model.binding.BindingProperty#isMandatory()
		 */
		public boolean isMandatory() {
			return false;
		}
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host
	 *            the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(String user) {
		this.user = user;
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
	 * @return the directory
	 */
	public String getDirectory() {
		return directory;
	}

	/**
	 * @param directory
	 *            the directory to set
	 */
	public void setDirectory(String directory) {
		this.directory = directory;
	}

	/**
	 * @return the delay
	 */
	public long getDelay() {
		return delay;
	}

	/**
	 * @param delay
	 *            the delay to set
	 */
	public void setDelay(long delay) {
		this.delay = delay;
	}

	/**
	 * @return deleteFile indicator to delete the file
	 */
	public boolean isDeleteFile() {
		return deleteFile;
	}

	/**
	 * @param deleteFile
	 *            indicator to delete the file
	 */
	public void setDeleteFile(boolean deleteFile) {
		this.deleteFile = deleteFile;
	}

	public boolean isPassiveMode() {
		return passiveMode;
	}

	public void setPassiveMode(boolean passiveMode) {
		this.passiveMode = passiveMode;
	}

	public String getSecurityProtocol() {
		return securityProtocol;
	}

	public void setSecurityProtocol(String securityProtocol) {
		this.securityProtocol = securityProtocol;
	}

	public boolean isImplicit() {
		return isImplicit;
	}

	public void setImplicit(boolean isImplicit) {
		this.isImplicit = isImplicit;
	}

	public String getKeyStoreFile() {
		return keyStoreFile;
	}

	public void setKeyStoreFile(String keyStoreFile) {
		this.keyStoreFile = keyStoreFile;
	}

	public String getKeyStorePassword() {
		return keyStorePassword;
	}

	public void setKeyStorePassword(String keyStorePassword) {
		this.keyStorePassword = keyStorePassword;
	}

	public String getKeyPassword() {
		return keyPassword;
	}

	public void setKeyPassword(String keyPassword) {
		this.keyPassword = keyPassword;
	}

	public String getTrustStoreFile() {
		return trustStoreFile;
	}

	public void setTrustStoreFile(String trustStoreFile) {
		this.trustStoreFile = trustStoreFile;
	}

	public String getTrustStorePassword() {
		return trustStorePassword;
	}

	public void setTrustStorePassword(String trustStorePassword) {
		this.trustStorePassword = trustStorePassword;
	}
}
