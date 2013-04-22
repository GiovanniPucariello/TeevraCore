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
 * $Id: ConfigurationBuilder.java
 * $Revision:
 * $Author: ssoni
 * $DateTime: Sep 5, 2008
 */

package com.headstrong.fusion.config.manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

import com.headstrong.fusion.commons.exception.ConfigurationException;
import com.headstrong.fusion.commons.exception.ConfigurationValidationException;
import com.headstrong.fusion.config.ProcessConfigurationModel;

/**
 * ConfigurationBuilder class unmarshalls the given process definition file to a
 * ProcessConfigurationModel object.
 * <p>
 * XML schema definition file mapping.xml should be in the classpath to
 * unmarshal the process definition.
 * 
 * 
 * @author ViswanathP
 * 
 */
public class XmlProcessDefinitionParser implements ProcessDefinitionParser {
	private static Logger logger = LoggerFactory
			.getLogger(XmlProcessDefinitionParser.class);
	private static final String MAPPING_FILE = "ProcessSchema.xml";

	private BundleContext bundleContext;

	private ProcessDefinitionEnricher processDefinitionEnricher;

	public XmlProcessDefinitionParser(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
		this.processDefinitionEnricher = new DefaultProcessDefinitionEnricher();
	}

	/**
	 * This method accepts a process definition file and parses it to generate a
	 * process configuration model.
	 * 
	 * @precondition processConfigurationFile != null
	 * @param processConfigurationFile
	 * @return {@link ProcessConfigurationModel}
	 * @throws Exception
	 */
	public ProcessConfigurationModel parseProcessDefinition(
			File processConfigurationFile) throws ConfigurationException {
		ProcessConfigurationModel processModel = null;
		Unmarshaller unMarshaller;
		try {
			URL mappingURL = bundleContext.getBundle().getEntry(MAPPING_FILE);
			if (mappingURL == null) {
				throw new FileNotFoundException(MAPPING_FILE);
			}

			Mapping mapping = new Mapping();
			mapping.loadMapping(mappingURL);

			unMarshaller = new Unmarshaller(mapping);
			unMarshaller.setIgnoreExtraAttributes(false);
			unMarshaller.setIgnoreExtraElements(false);

		} catch (MappingException e) {
			logger.error("Exception while passing mapping to unmarshaller.", e);
			throw new ConfigurationException(
					"Error while parsing the mapping definition.", e);
		} catch (IOException e) {
			logger.error("Mapping file not found.", e);
			throw new ConfigurationException("Mapping file not found.", e);
		}

		try {
			processModel = (ProcessConfigurationModel) unMarshaller
					.unmarshal(new InputSource(new FileReader(
							processConfigurationFile)));
		} catch (MarshalException e) {
			logger.error(
					"Exception while unmarshalling the process definition.", e);
			throw new ConfigurationException(
					"Exception while unmarshalling the process definition.", e);
		} catch (ValidationException e) {
			logger
					.error(
							"Validation Exception while unmarshalling the process definition. ",
							e);
			throw new ConfigurationValidationException(
					"Validation Exception while unmarshalling the process definition.",
					e);
		} catch (FileNotFoundException e) {
			logger.error("Process definition file not found.", e);
			throw new ConfigurationException(
					"Process definition file not found.", e);
		}
		this.getProcessDefinitionEnricher().enrich(processModel);
		return processModel;
	}

	/**
	 * @return the bundleContext
	 */
	public BundleContext getBundleContext() {
		return bundleContext;
	}

	/**
	 * @param bundleContext
	 *            the bundleContext to set
	 */
	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/**
	 * @return the processDefinitionEnricher
	 */
	public ProcessDefinitionEnricher getProcessDefinitionEnricher() {
		return processDefinitionEnricher;
	}

	/**
	 * @param processDefinitionEnricher
	 *            the processDefinitionEnricher to set
	 */
	public void setProcessDefinitionEnricher(
			ProcessDefinitionEnricher processDefinitionEnricher) {
		this.processDefinitionEnricher = processDefinitionEnricher;
	}

}
