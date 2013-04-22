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
 * $Id: FileEndPoint.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 16, 2008 
 */

package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.FileEndpoint;
import org.apache.camel.component.file.GenericFileExist;
import org.apache.camel.converter.IOConverter;
import org.apache.camel.model.ProcessorDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.messaging.service.DataToFileProcessor;
import com.headstrong.fusion.messaging.service.FileToDataProcessor;

/**
 * This Endpoint represent a File connector.
 * 
 */
public class FileBindingEndPointModeler extends AbstractBindingEndPointModeler {

	private static final Logger logger = LoggerFactory
			.getLogger(FileBindingEndPointModeler.class);

	/**
	 * Configuration BindingProperty supported.
	 */

	private static long DEFAULT_DELAY = 0;
	private File directory;
	private Boolean delete;
	/**
	 * @see java.util.regex.Pattern Matches the input file names with the
	 *      regexPattern specified.
	 */
	private String regexPattern;

	/**
	 * Delay between current and next poll.
	 */
	private Long delay;
	/**
	 * Lock the file while reading.
	 */
	private Boolean lock;
	/**
	 * Expression to be used while writing the file.
	 * 
	 * @see http://activemq.apache.org/camel/file-language.html
	 */
	private Boolean binary = false;

	private String expression;
	private String moveNamePrefix;
	private String moveNamePostfix;

	// private String fileType = "string";
	private String fileType;

	// for getting unique file name
	private Boolean uniqueFileName;
	
	//set the componenet type
	private int componentType = 0;
	private final int componentFile = 1;
	private final int componentMch = 2;
	


	// private GenericFileEndpoint sourceEndPoint;

	public int getComponentType() {
		return componentType;
	}

	public void setComponentType(int componentType) {
		this.componentType = componentType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.fusion.messaging.model.endpoint.model.model.binding.
	 * AbstractBindingEndPointModeler
	 * #init(com.headstrong.fusion.config.ConnectorConfig)
	 */
	public void init(CamelProcessContext processContext, ConnectorConfig config)
			throws InitializationException {
		// initialize the super/
		super.init(config, FileBindingProperty.values());
		// set the Bean properties
		this.configure(config);
	}

	protected void validateConfiguration(BindingProperty[]... properties)
			throws InitializationException {
		Map<String, String> configProperties = this.getConfig().getProperties();
		if (this.getConfig() == null) {
			throw new InitializationException("No configuration provided.");
		}
		List<String> missingFields = new ArrayList<String>();
		for (BindingProperty[] bindingProperties : properties) {
			for (BindingProperty bindingProperty : bindingProperties) {
				if (bindingProperty.isMandatory()
						&& !this.getConfig().containsKey(
								bindingProperty.toString())) {
					missingFields.add(bindingProperty.toString());
				}
			}
		}
		if (!missingFields.isEmpty()) {
			throw new InitializationException(
					"Following mandatory fields are missing"
							+ missingFields.toString() + " for component id "
							+ this.getConfig().getId());
		}
		if (((configProperties.containsKey(FileBindingProperty.fileType
				.toString())) && ((Boolean.parseBoolean(configProperties
				.get(FileBindingProperty.delete.toString())) == true) && (configProperties
				.get(FileBindingProperty.fileType.toString())
				.equals("camel file path"))))) {
			throw new InitializationException(
					"File type cannot be chosen as 'camel file path' when Source File Delition is set to TRUE"
							+ missingFields.toString()
							+ " for component id "
							+ this.getConfig().getId());
		}
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
		if (properties.containsKey(FileBindingProperty.directory.toString())) {
			this.setDirectory(new File(properties
					.get(FileBindingProperty.directory.toString())));
		}
		if (properties.containsKey(FileBindingProperty.delete.toString())) {
			this.setDelete(Boolean.parseBoolean(properties
					.get(FileBindingProperty.delete.toString())));
		}
		if (properties.containsKey(FileBindingProperty.regexPattern.toString())) {
			this.setRegexPattern(properties
					.get(FileBindingProperty.regexPattern.toString()));
		}
		this.setDelay(DEFAULT_DELAY);
		if (properties.containsKey(FileBindingProperty.delay.toString())) {
			try {
				this.setDelay(Long.parseLong(properties
						.get(FileBindingProperty.delay.toString())));
			} catch (Exception e) {
				logger.error("Invalid delay specified, setting to default "
						+ DEFAULT_DELAY);
			}
		}
		/*
		 * if (properties.containsKey(FileBindingProperty.delay.toString())) {
		 * this.setDelay(Long.getLong(properties.get(FileBindingProperty.delay
		 * .toString()))); }
		 */
		// ///////////////

		if (properties.containsKey(FileBindingProperty.fileType.toString())) {
			this.setFileType(properties.get(FileBindingProperty.fileType
					.toString()));
		}
		if (properties.containsKey(FileBindingProperty.lock.toString())) {
			this.setLock(Boolean.parseBoolean(properties
					.get(FileBindingProperty.lock.toString())));
		}
		if (properties.containsKey(FileBindingProperty.moveNamePrefix
				.toString())) {
			this.setMoveNamePrefix(properties
					.get(FileBindingProperty.moveNamePrefix.toString()));
		}
		if (properties.containsKey(FileBindingProperty.moveNamePostfix
				.toString())) {
			this.setMoveNamePrefix(properties
					.get(FileBindingProperty.moveNamePostfix.toString()));
		}

		// this.setFileType("string");
		if (properties.containsKey(FileBindingProperty.fileType.toString())) {
			this.setFileType(properties.get(FileBindingProperty.fileType
					.toString()));
		}
		if (properties.containsKey(FileBindingProperty.expression.toString())) {
			this.setExpression(properties.get(FileBindingProperty.expression
					.toString()));
		}
		
		if (properties.containsKey(FileBindingProperty.uniqueFileName.toString())) {
			this.setUniqueFileName(Boolean.parseBoolean(properties
					.get(FileBindingProperty.uniqueFileName.toString())));
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.messaging.model.endpoint.model.BindingEndPoint#
	 * modelFrom(org.apache.camel.builder.RouteBuilder)
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition modelFrom(RouteBuilder routeBuilder) {

		// checking true or false for unique file name
		if (this.getUniqueFileName()) {
			this.setComponentType(this.componentMch);
			
			MCHFileEndPoint mchSourceEndPoint = new MCHFileEndPoint();

			mchSourceEndPoint.setCamelContext(routeBuilder.getContext());
			mchSourceEndPoint.setFile(this.getDirectory());
			mchSourceEndPoint.setDelay(getDelay());
			if (this.isDelete() != null) {
				mchSourceEndPoint.setDelete(this.isDelete());
			}

			// if (this.isLock() != null) {
			// sourceEndPoint.setLock(this.isLock());
			// }
			//
			// if (this.getMoveNamePrefix() != null) {
			// sourceEndPoint.setMoveNamePrefix(this.getMoveNamePrefix());
			// }
			//
			// if (this.getMoveNamePostfix() != null) {
			// sourceEndPoint.setMoveNamePostfix(this.getMoveNamePostfix());
			// }
			if (this.getFileType() != null) {
				mchSourceEndPoint.setFileType(this.getFileType());
			}
			Map<String, Object> consumerProperties = new HashMap<String, Object>();
			if (this.getRegexPattern() != null) {
				consumerProperties.put(FileBindingProperty.regexPattern
						.toString(), this.getRegexPattern());
			}
			mchSourceEndPoint.setConsumerProperties(consumerProperties);

			return routeBuilder.from(mchSourceEndPoint).process(
					new MCHFileToDataProcessor(this.getFileType()));

		} else {
			this.setComponentType(this.componentFile);
			FileEndpoint fileSourceEndPoint = new FileEndpoint();

			fileSourceEndPoint.setCamelContext(routeBuilder.getContext());
			fileSourceEndPoint.setFile(this.getDirectory());
			if (this.isDelete() != null) {
				fileSourceEndPoint.setDelete(this.isDelete());
			}
			fileSourceEndPoint.setMove(".camel");
			fileSourceEndPoint.setInclude(this.getRegexPattern());

			return routeBuilder.from(fileSourceEndPoint).process(
					new FileToDataProcessor(this.isBinary()));

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.messaging.model.endpoint.model.BindingEndPoint#
	 * modelTo(org.apache.camel.builder.RouteBuilder,
	 * org.apache.camel.model.ProcessorType)
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition modelTo(RouteBuilder routeBuilder,
			ProcessorDefinition processorType) {

		if (this.getComponentType() == this.componentMch) {
			MCHFileEndPoint destinationEndPoint = new MCHFileEndPoint();
			destinationEndPoint.setCamelContext(routeBuilder.getContext());
			destinationEndPoint.setFile(this.getDirectory());

			// if (this.getExpression() != null) {
			// destinationEndPoint.setExpression(this.getExpression());
			// }
			return processorType.process(new DataToFileProcessor()).to(
					destinationEndPoint).process(new Processor() {

				@Override
				public void process(Exchange exchange) throws Exception {
					Object data = exchange.getIn().getBody();
					if (data instanceof InputStream) {
						if (fileType == "binary") {
							exchange.getIn().setBody(
									IOConverter.toBytes((InputStream) data));
						} else {
							exchange.getIn().setBody(
									IOConverter.toString((InputStream) data));
						}
					}

				}
			});
		} else {

			FileEndpoint destinationEndPoint = new FileEndpoint();
			destinationEndPoint.setCamelContext(routeBuilder.getContext());
			destinationEndPoint.setFile(this.getDirectory());
			destinationEndPoint.setFileExist(GenericFileExist.Append);

			return processorType.process(new DataToFileProcessor()).to(
					destinationEndPoint).process(new Processor() {

				@Override
				public void process(Exchange exchange) throws Exception {
					Object data = exchange.getIn().getBody();
					if (data instanceof InputStream) {
						if (binary) {
							exchange.getIn().setBody(
									IOConverter.toBytes((InputStream) data));
						} else {
							exchange.getIn().setBody((InputStream) data);
						}
					}

				}
			});

		}

	}

	/**
	 * @return the directory
	 */
	public File getDirectory() {
		return directory;
	}

	/**
	 * @param directory
	 *            the directory to set
	 */
	public void setDirectory(File directory) {
		this.directory = directory;
	}

	/**
	 * @return the delete
	 */
	public Boolean isDelete() {
		return delete;
	}

	/**
	 * @param delete
	 *            the delete to set
	 */
	public void setDelete(Boolean delete) {
		this.delete = delete;
	}

	/**
	 * @return the regexPattern
	 */
	public String getRegexPattern() {
		return regexPattern;
	}

	/**
	 * @param regexPattern
	 *            the regexPattern to set
	 */
	public void setRegexPattern(String regexPattern) {
		this.regexPattern = regexPattern;
	}

	/**
	 * @return the delay
	 */
	public Long getDelay() {
		return delay;
	}

	/**
	 * @param delay
	 *            the delay to set
	 */
	public void setDelay(Long delay) {
		this.delay = delay;
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

	public Boolean getLock() {
		return lock;
	}

	public void setLock(Boolean lock) {
		this.lock = lock;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getMoveNamePrefix() {
		return moveNamePrefix;
	}

	public void setMoveNamePrefix(String moveNamePrefix) {
		this.moveNamePrefix = moveNamePrefix;
	}

	public String getMoveNamePostfix() {
		return moveNamePostfix;
	}

	public void setMoveNamePostfix(String moveNamePostfix) {
		this.moveNamePostfix = moveNamePostfix;
	}

	public Boolean getDelete() {
		return delete;
	}

	public String getFileType() {
		return fileType;
	}

	private void setFileType(String string) {
		this.fileType = string;

	}

	public Boolean getUniqueFileName() {
		return uniqueFileName;
	}

	public void setUniqueFileName(Boolean uniqueFileName) {
		this.uniqueFileName = uniqueFileName;
	}

	/**
	 * List of Binding Configuration Properties expected by FileBindingEndpoint.
	 */
	private static enum FileBindingProperty implements BindingProperty {

		directory {
			// Mandatory property.
			public boolean isMandatory() {
				return true;
			}
		},
		delete, regexPattern, delay, lock, expression, moveNamePrefix, moveNamePostfix, binary, fileType, uniqueFileName;

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * com.headstrong.fusion.messaging.model.endpoint.model.model.binding
		 * .BindingProperty#isMandatory()
		 */
		public boolean isMandatory() {
			return false;
		}

	}
}
