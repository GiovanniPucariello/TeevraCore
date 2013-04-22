package com.headstrong.fusion.services.message.formatter.binary.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.config.ServiceConfigurationCache;
import com.headstrong.fusion.services.config.exception.ServiceConfigurationNotFoundException;
import com.headstrong.fusion.services.config.parse.ServiceConfigurationParserRegistry;
import com.headstrong.fusion.services.config.vo.ServiceConfiguration;
import com.headstrong.fusion.services.message.formatter.binary.BinaryFormatterService;
import com.headstrong.fusion.services.message.formatter.binary.BinaryServiceConfigParser;
import com.headstrong.fusion.services.message.formatter.binary.config.StructsConfigBean;

/**
 * Formatter service converting BusinessObject into C-Struct
 * 
 * @author akrishnamoorthy
 * 
 */
public class BinaryFormatterServiceImpl extends GenericMediationService
		implements BinaryFormatterService {
	private static Logger logger = LoggerFactory
			.getLogger(BinaryFormatterServiceImpl.class);

	/**
	 * Config key to be used to specify if thhe struct is big endian or little
	 * endian
	 */
	protected final String ENDIAN = "endian";

	/**
	 * Name of the structure to which the BO has to be parsed or formatted. The
	 * name specified for this configuration should match the name specified in
	 * the StructConfig.
	 */
	protected final String STRUCT_NAME = "structName";

	/**
	 * Config name for structure definition
	 */
	protected static String STRUCT_CONFIG_ID = "structConfig";

	/**
	 * Config name for mapping of field in object schema to field in structure
	 */
	protected static String FIELD_MAPPING_ID = "structFormatterConfig";

	/**
	 * {@link ServiceConfigurationCache} containing configuration for this
	 * service - structConfig & structFormatterConfig.
	 */
	private final ServiceConfigurationCache serviceConfigCache = ServiceConfigurationCache
			.getInstance();

	protected BinaryParserFormatter parserFormatter = BinaryParserFormatter
			.getInstance();

	@Override
	public void init() {
		super.init();
		registerConfigParsers(BinaryFormatterService.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MediationService#process(com.headstrong.fusion.commons.MessageExchange,
	 *      com.headstrong.fusion.commons.ServiceConfig)
	 */
	public void process(MessageExchange exchange, ServiceConfig config)
			throws FusionException, InvalidAttributeExpressionException {
		ErrorHandler errorHandler = config.getErrorHandler();
		Object message = exchange.getIn().getBody();

		BusinessObject bo = null;
		if (logger.isDebugEnabled()) {
			String xmlData = "";
			if (message instanceof BusinessObject) {
				bo = (BusinessObject) message;
				xmlData = bo.toXml();
			} else {
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config
						.getServiceType(), new Exception(
						"Invalid message passed to formatter service. "
								+ "Expected a BusinessObject."), config, null);
			}
			logger.debug("BinaryFormatterServiceImpl.process :" + xmlData);
		}

		// get config defn of both the config files - structure definition,
		// field mapping
		Object config1 = getServiceConfig(config, STRUCT_CONFIG_ID);
		Object config2 = getServiceConfig(config, FIELD_MAPPING_ID);
		String endianStr = (String) config.getProperty(ENDIAN);
		String structName = (String) config.getProperty(STRUCT_NAME);

		if ((config1 instanceof Map) && (config2 instanceof Map)
				&& (structName != null)) {
			try {
				byte[] structData = parserFormatter.format(bo,
						(Map<String, StructsConfigBean>) config1, structName,
						endianStr);
				exchange.getIn().setBody(structData);
			} catch (Exception e) {
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config
						.getServiceType(), e, bo, null);
			}
		} else {
			super
					.handleError(
							errorHandler,
							config.getProcessId(),
							config.getServiceId(),
							ERROR_TYPE_SYSTEM,
							config.getServiceType(),
							new Exception(
									"Invalid set of configuration files passed to this component."),
							config, null);
		}
	}

	/**
	 * Gets the Service Configuration for the given config key
	 * 
	 * @param config
	 * @return
	 * @throws FusionException
	 */
	protected Object getServiceConfig(ServiceConfig config, String configKey)
			throws FusionException {
		// Read the Mapping.
		String mappingId = (String) config.getProperty(configKey);
		if (mappingId == null) {
			String errorMsg = configKey
					+ " Configuration identifier not specified.";
			logger.error(errorMsg);
			throw new FusionException(errorMsg);
		}

		// Read the service configuration
		ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
		serviceConfiguration.setProcessId(config.getProcessId());
		serviceConfiguration.setServiceId(config.getServiceId());
		serviceConfiguration.setPropertyId(mappingId);

		try {
			// Get the configuration from the cache.
			return serviceConfigCache
					.getPropertyConfiguration(serviceConfiguration);
		} catch (ServiceConfigurationNotFoundException e) {
			String errorMsg = "No configuration found for the binary formatter "
					+ "service configuration id provided ";
			logger.error(errorMsg, e);
			throw new FusionException(errorMsg, e);
		}
	}

	/**
	 * Registers config parser for both the configurations against the given
	 * serviceClass name
	 * 
	 * @param serviceClass
	 */
	protected void registerConfigParsers(Class serviceClass) {
		// Register service configuration parsers.
		ServiceConfigurationParserRegistry configurationParserRegistry = ServiceConfigurationParserRegistry
				.getInstance();
		configurationParserRegistry.registerServiceConfigurationParser(
				serviceClass.getSimpleName(), STRUCT_CONFIG_ID,
				BinaryServiceConfigParser.class.getSimpleName());
		configurationParserRegistry.registerServiceConfigurationParser(
				serviceClass.getSimpleName(), FIELD_MAPPING_ID,
				BinaryServiceConfigParser.class.getSimpleName());
	}
}
