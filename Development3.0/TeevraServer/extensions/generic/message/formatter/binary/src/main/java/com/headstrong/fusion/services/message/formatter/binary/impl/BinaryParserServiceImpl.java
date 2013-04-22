package com.headstrong.fusion.services.message.formatter.binary.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectFactory;
import com.headstrong.fusion.bo.BusinessObjectFactory.Type;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptorCache;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.message.formatter.binary.BinaryParserService;
import com.headstrong.fusion.services.message.formatter.binary.config.StructsConfigBean;

/**
 * Parser service to convert a C-Struct into BusinessObject
 * 
 * @author akrishnamoorthy
 * 
 */
public class BinaryParserServiceImpl extends BinaryFormatterServiceImpl
		implements BinaryParserService {
	private static Logger logger = LoggerFactory
			.getLogger(BinaryParserServiceImpl.class);

	@Override
	public void init() {
		super.init();
		registerConfigParsers(BinaryParserService.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.MediationService#process(com.headstrong.fusion.commons.MessageExchange,
	 *      com.headstrong.fusion.commons.ServiceConfig)
	 */
	public void process(MessageExchange exchange, ServiceConfig config)
			throws FusionException {
		ErrorHandler errorHandler = config.getErrorHandler();
		Object message = exchange.getIn().getBody();

		byte[] binaryContents = null;

		if (logger.isDebugEnabled()) {
			if (message instanceof byte[]) {
				binaryContents = (byte[]) message;
			} else {
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config
						.getServiceType(), new Exception(
						"Invalid message passed to parser service. "
								+ "Expected a byte array."), config, null);
			}
			logger.debug("BinaryParserServiceImpl.process");
		}

		// get config defn of both the config files - structure definition,
		// field mapping
		Object config1 = getServiceConfig(config, STRUCT_CONFIG_ID);
		Object config2 = getServiceConfig(config, FIELD_MAPPING_ID);
		String endianStr = (String) config.getProperty(ENDIAN);
		String structName = (String) config.getProperty(STRUCT_NAME);
		
		if ((config1 instanceof Map) && (config2 instanceof HashMap)) {
			Map<String, StructsConfigBean> structConfig = (Map<String, StructsConfigBean>)config1;
			HashMap<String, String> fieldMapping = (HashMap<String, String>) config2;
			BusinessObject outBO = createBusinessObject(config, errorHandler);

			try {
				parserFormatter.parse(binaryContents, outBO, structConfig, structName, endianStr);
			} catch (Exception e) {
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config
						.getServiceType(), e, binaryContents, null);
			}
			exchange.getIn().setBody(outBO);
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
	 * Creates a businessObject that needs to be generated for output side
	 * 
	 * @param config
	 * @param errorHandler
	 * @return
	 * @throws FusionException
	 */
	private BusinessObject createBusinessObject(ServiceConfig config,
			ErrorHandler errorHandler) throws FusionException {
		ObjectDescriptor objectDescriptor = null;
		String objectDescriptorSchema = (String) config
				.getProperty(OBJECT_DESCRIPTOR_SCHEMA);

		// check for null
		if (objectDescriptorSchema == null) {
			String errorMsg = "Object Descriptor schema not  specified.";
			FusionException ex = new FusionException(errorMsg);
			super.handleError(errorHandler, config.getProcessId(), config
					.getServiceId(), ERROR_TYPE_BUSINESS, config
					.getServiceType(), ex, config, null);
		}

		objectDescriptor = ObjectDescriptorCache.getInstance().getDescriptor(
				objectDescriptorSchema);
		if (objectDescriptor == null) {
			String errorMsg = "Object Descriptor schema not found for  schema id "
					+ objectDescriptorSchema;
			logger.error(errorMsg);
			FusionException ex = new FusionException(errorMsg);
			super.handleError(errorHandler, config.getProcessId(), config
					.getServiceId(), ERROR_TYPE_BUSINESS, config
					.getServiceType(), ex, config, null);
		}

		BusinessObject outBO = BusinessObjectFactory
				.getBusinessObject(Type.Default);
		outBO.setObjectDescriptor(objectDescriptor);
		outBO.setAttributeValues(new HashMap<String, Object>());
		return outBO;
	}
}
