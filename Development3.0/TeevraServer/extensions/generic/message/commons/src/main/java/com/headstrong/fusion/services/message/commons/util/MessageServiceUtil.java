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
 * $Id: MessageServiceUtil.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 2, 2009 
 */

package com.headstrong.fusion.services.message.commons.util;

import static com.headstrong.fusion.commons.MediationService.OBJECT_DESCRIPTOR_SCHEMA;
import static com.headstrong.fusion.commons.MediationService.OBJECT_MAPPING_ID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptorCache;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.config.ServiceConfigurationCache;
import com.headstrong.fusion.services.config.exception.ServiceConfigurationNotFoundException;
import com.headstrong.fusion.services.config.vo.ServiceConfiguration;
import com.headstrong.fusion.services.message.commons.config.exception.InvalidConfigurationException;
import com.headstrong.fusion.services.message.commons.config.parser.Binding;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;

;

/**
 * Message service util.
 * 
 */
public class MessageServiceUtil {
	private static final Logger logger = LoggerFactory
			.getLogger(MessageServiceUtil.class);

	/**
	 * Reads the service configuration and returns the corresponding object
	 * schema descriptor.
	 * 
	 * @param config
	 * @return Object schema descriptor.
	 */
	public static ObjectDescriptor getObjectDescriptor(ServiceConfig config)
			throws InvalidConfigurationException {
		String objectDescriptorSchema = (String) config
				.getProperty(OBJECT_DESCRIPTOR_SCHEMA);
		if (objectDescriptorSchema == null) {
			//BugChase 234 ErrorMonitoring # objectSchemaDescriptor error
			logger.error("objectSchemaDescriptor not specified ");
			throw new InvalidConfigurationException(
					"objectSchemaDescriptor not specified for process "
							+ config.getProcessId() + " service "
							+ config.getServiceId());
		}
		// Information required to generate the DefaultBusinessObject
		ObjectDescriptor objectDescriptor = ObjectDescriptorCache.getInstance()
				.getDescriptor(objectDescriptorSchema);
		if (objectDescriptor == null) {
			//BugChase 234 ErrorMonitoring # objectSchemaDescriptor error
			logger.error("objectSchemaDescriptor not specified");

			throw new InvalidConfigurationException(
					"objectSchemaDescriptor details not found for process "
							+ config.getProcessId() + " service "
							+ config.getServiceId()
							+ " objectSchemaDescriptor id "
							+ objectDescriptorSchema);
		}
		return objectDescriptor;
	}

	/**
	 * Private utility method that reads the returns the
	 * {@link SchemaDescriptor<? extends Binding>} object based on the
	 * <code>schemaMapping</code> details provided.
	 * 
	 * @param config
	 * @return Schema Descriptor.
	 * @throws InvalidConfigurationException
	 * @throws FusionException
	 */
	@SuppressWarnings("unchecked")
	public static SchemaDescriptor<? extends Binding> getSchemaDescriptor(
			ServiceConfig config) throws InvalidConfigurationException {
		// Read the Mapping.
		String mappingId = (String) config.getProperty(OBJECT_MAPPING_ID);
		if (mappingId == null) {
			//BugChase 234 ErrorMonitoring # SchemaDescriptor error
			logger.error("SchemaDescriptor not specified");
			throw new InvalidConfigurationException(
					"SchemaDescriptor not specified for process "
							+ config.getProcessId() + " service "
							+ config.getServiceId());
		}
		// Read the service configuration
		ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
		serviceConfiguration.setProcessId(config.getProcessId());
		serviceConfiguration.setServiceId(config.getServiceId());
		serviceConfiguration.setPropertyId(mappingId);

		SchemaDescriptor<? extends Binding> schemaDescriptor = null;
		try {
			schemaDescriptor = (SchemaDescriptor<? extends Binding>) ServiceConfigurationCache
					.getInstance().getPropertyConfiguration(
							serviceConfiguration);
		} catch (ServiceConfigurationNotFoundException e) {
			//BugChase 234 ErrorMonitoring # SchemaDescriptor error
			logger.error("SchemaDescriptor not specified");
			throw new InvalidConfigurationException(
					"SchemaDescriptor details not found for process "
							+ config.getProcessId() + " service "
							+ config.getServiceId() + " SchemaDescriptor "
							+ mappingId);
		}

		if (schemaDescriptor == null) {
			//BugChase 234 ErrorMonitoring # SchemaDescriptor error
			logger.error("SchemaDescriptor not specified");
			throw new InvalidConfigurationException(
					"SchemaDescriptor details not found for process "
							+ config.getProcessId() + " service "
							+ config.getServiceId() + " SchemaDescriptor "
							+ mappingId);
		}
		return schemaDescriptor;
	}

}
