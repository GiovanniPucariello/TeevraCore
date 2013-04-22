/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright  2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: FtpBindingEndPointModeler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 4, 2009 
 */

package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.remote.FtpComponent;
import org.apache.camel.component.file.remote.FtpConfiguration;
import org.apache.camel.component.file.remote.FtpEndpoint;
import org.apache.camel.component.file.remote.RemoteFileComponent;
import org.apache.camel.component.file.remote.RemoteFileConfiguration;
import org.apache.camel.converter.IOConverter;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPFile;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.DecryptionException;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.BundleContextManager;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.messaging.service.DataToFileProcessor;
import com.headstrong.fusion.messaging.service.FtpFileToDataProcessor;

/**
 * FTP End Point.
 * 
 */
public class FtpBindingEndPointModeler extends AbstractBindingEndPointModeler {

	private static final Logger logger = LoggerFactory
			.getLogger(FtpBindingEndPointModeler.class);

	private static long DEFAULT_DELAY = 50000;
	private static final String KEY = "fusion.encryption.keyPath";
	/**
	 * FTP server host name/id.
	 */
	private String host;
	/**
	 * Port number.
	 */
	private int port;
	/**
	 * User name
	 */
	private String user;
	/**
	 * Password.
	 */
	private String password;
	/**
	 * FTP Directory.
	 */
	private String directory;
	/**
	 * Delay.
	 */
	private long delay;
	
	/**
	 * Delete file.
	 */
	private boolean deleteFile;
	
	/**
	 * File name regex pattern.
	 */
	private String regexPattern;
	
	/**
	 * Age of File to be read.
	 */
	private int fileAge = -1;

	/**
	 * Pass the file as binary/ASCII mode.
	 */
	private Boolean binary;


	/**
	 * Pass the file in active/passive mode.
	 */
	 private Boolean passiveMode;
	 
	private BundleContext context;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.model.model.binding.AbstractBindingEndPointModeler#init(com.headstrong.fusion.config.ConnectorConfig)
	 */
	public void init(CamelProcessContext processContext, ConnectorConfig config)
			throws InitializationException {
		// call the init of the AbstractBindingEndpoint.
		this.context = BundleContextManager.getInstance().getBundleContext();
		super.init(config, FtpBindingProperty.values());
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

		if (properties.containsKey(FtpBindingProperty.host.toString())) {
			this.setHost(properties.get(FtpBindingProperty.host.toString()));
		}

		if (properties.containsKey(FtpBindingProperty.port.toString())) {
			this.setPort(Integer.parseInt(properties
					.get(FtpBindingProperty.port.toString())));
		}
		if (properties.containsKey(FtpBindingProperty.user.toString())) {
			this.setUser(properties.get(FtpBindingProperty.user.toString()));
		}
		if (properties.containsKey(FtpBindingProperty.deleteFile.toString()) &&
				properties.get(FtpBindingProperty.deleteFile.toString()).equalsIgnoreCase("true")) {
			this.setDeleteFile(true);
		}
		else
		{
			this.setDeleteFile(false);
		}
		// Decrypting the encrypted password.
		if (properties.containsKey(FtpBindingProperty.passwordFileLocation.toString())) {
			try {

				String encryptedPassword = properties.get(IOUtils.toString(new FileReader(new File(FtpBindingProperty.passwordFileLocation.toString()))));
				if (!encryptedPassword.trim().equals("")) {
					this.setPassword(FusionUtil.decrypt(encryptedPassword,context.getProperty(KEY)));
				} else {
					this.setPassword(encryptedPassword);
				}
			} catch (DecryptionException e) {
				logger.error("Error occured durion password decryption"+e);
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
		if (properties.containsKey(FtpBindingProperty.directory.toString())) {
			this.setDirectory(properties.get(FtpBindingProperty.directory
					.toString()));
		}
		if (properties.containsKey(FtpBindingProperty.regexPattern.toString())
				&& properties.get(FtpBindingProperty.regexPattern.toString()) != null) {
			this.setRegexPattern(properties.get(FtpBindingProperty.regexPattern
					.toString()));
		}
		
		if(properties.containsKey(FtpBindingProperty.passive.toString())){
			this.setPassiveMode(Boolean.parseBoolean(properties.get(FtpBindingProperty.passive.toString())));
		}
		
		if(properties.containsKey(FtpBindingProperty.binary.toString())){
			this.setBinary(Boolean.parseBoolean(properties.get(FtpBindingProperty.binary.toString())));
		}	
		
		if (properties.containsKey(FtpBindingProperty.fileAge.toString())) {
			try
			{
			this.setFileAge(Integer.parseInt(properties.get(FtpBindingProperty.fileAge
					.toString())));
			}catch (Exception e) {
				logger.error("Invalid fileAge specified, setting to default " + -1);
			}
			
		}
		if(properties.containsKey(FtpBindingProperty.passive.toString())){
			this.setPassiveMode(Boolean.parseBoolean(properties.get(FtpBindingProperty.passive.toString())));
		}
		this.setDelay(DEFAULT_DELAY);
		if (properties.containsKey(FtpBindingProperty.delay.toString())) {
			try {
				this.setDelay(Long.parseLong(properties
						.get(FtpBindingProperty.delay.toString())));
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

		FtpComponent component = new FtpComponent();
		component.setCamelContext(routeBuilder.getContext());
		registerComponent(routeBuilder.getContext(), "ftp", component);

		FtpConfiguration config = new FtpConfiguration();
		config.setHost(this.getHost());
		config.setPort(this.getPort());
		config.setUsername(this.getUser());
		config.setPassword(this.getPassword());
		config.setBinary(false);
		config.setDirectory(this.getDirectory());
		config.setProtocol("ftp");
		config.setBinary(this.isBinary());
		config.setPassiveMode(this.isPassiveMode());
		// component.setConfiguration(config);

		FtpEndpoint<FTPFile> endPoint = new FtpEndpoint("ftp", component, config);
		endPoint.setDelete(isDeleteFile());
		endPoint.setInclude(this.getRegexPattern());
		
		// TODO : check bug  Bugchase issue# 307 for file age...
		// endPoint.setFileAge(this.getFileAge());
		
		Map<String, Object> temp = new HashMap<String, Object>();
		temp.put("delay", getDelay()); // nbi - check if to use consumer.delay
		endPoint.setConsumerProperties(temp);

		/*processorType = routeBuilder
		.from(
				config.toString()
						+ "?"
						+ "password="
						+ this.getPassword()
						+ "&binary=false&consumer.delay=50000&consumer.deleteFile=true")
		.convertBodyTo(String.class);*/
		if(this.isBinary()){
			processorType = routeBuilder.from(endPoint).process(new FtpFileToDataProcessor(this.isBinary()));
		}else{
		processorType = routeBuilder.from(endPoint).convertBodyTo(String.class);
		}

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
		FtpComponent component = new FtpComponent();
		component.setCamelContext(routeBuilder.getContext());

		FtpConfiguration config = new FtpConfiguration();
		config.setHost(this.getHost());
		config.setPort(this.getPort());
		config.setUsername(this.getUser());
		config.setPassword(this.getPassword());
		config.setBinary(false);
		config.setProtocol("ftp");
		config.setDirectory(this.getDirectory());
		// component.setConfiguration(config);

		FtpEndpoint<FTPFile> endPoint = new FtpEndpoint<FTPFile>("ftp", component,
				config);
		if (component != null) {
			registerComponent(routeBuilder.getContext(), "ftp", component);
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
	private static enum FtpBindingProperty implements BindingProperty {

		host, port, user, passwordFileLocation, directory, deleteFile , binary, passive  {
			public boolean isMandatory() {
				return true;
			}
		},
		//Issue#  File Name pattern and File Age pattern filters added - Bugchase Issue #307
		 delay, regexPattern, fileAge;

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
	 * @return deleteFile
	 *            indicator to delete the file
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

	/**
	 * @return regexPattern
	 *            File name regex pattern
	 */
	public String getRegexPattern() {
		return regexPattern;
	}

	/**
	 * @param regexPattern
	 *            File name regex pattern
	 */
	public void setRegexPattern(String regExPattern) {
		this.regexPattern = regExPattern;
	}

	/**
	 * @return fileAge
	 * Age of File to be read.
	 */
	public int getFileAge() {
		return fileAge;
	}

	/**
	 * @param fileAge
	 * Age of File to be read.
	 */
	public void setFileAge(int fileAge) {
		this.fileAge = fileAge;
	}
	/**
	 * @return the binary
	 */
	public boolean isBinary() {
		return binary;
	}
		/**
	 * @param binary
	 *            the binary to set
	 */
	public void setBinary(boolean binary) {
		this.binary = binary;
	}
	
		public Boolean isPassiveMode() {
		return passiveMode;
	}
	public void setPassiveMode(Boolean passiveMode) {
		this.passiveMode = passiveMode;
	}

}
