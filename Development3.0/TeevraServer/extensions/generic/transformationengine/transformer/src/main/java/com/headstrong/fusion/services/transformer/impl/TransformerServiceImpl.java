package com.headstrong.fusion.services.transformer.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectFactory;
import com.headstrong.fusion.bo.BusinessObjectFactory.Type;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.ObjectDescriptorCache;
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
import com.headstrong.fusion.services.transformer.TransformerService;
import com.headstrong.fusion.services.transformer.exception.TransformationException;
import com.headstrong.fusion.services.transformer.rulemanager.RuleManager;
import com.headstrong.fusion.services.transformer.serviceconfig.TransformerServiceConfig;
import com.headstrong.fusion.services.transformer.serviceconfig.TransformerServiceConfigParser;

/**
 * <code>TransformerServiceImpl</code> is the {@link GenericMediationService}.
 * This service transforms the business object by applying the set of rules
 * specified.
 */
public class TransformerServiceImpl extends GenericMediationService implements
		TransformerService {

	private static final Logger logger = LoggerFactory
			.getLogger(TransformerService.class);

	/**
	 * {@link ServiceConfigurationCache} containing how configuration for
	 * transfomer. It contains information about the rules has to be operated.
	 */
	private final ServiceConfigurationCache serviceConfigCache = ServiceConfigurationCache
			.getInstance();

	/**
	 * Transformer instance
	 */
	private Transformer transfomer;

	/**
	 * Only constructor. Need to pass the rule manager which has complete logic
	 * as how the rule has to be executed.
	 * 
	 * @param ruleManager
	 *            {@link RuleManager}
	 */
	public TransformerServiceImpl(RuleManager ruleManager) {
		super();
		transfomer = new DefaultTransformer(ruleManager);
	}

	@Override
	public void init() {
		super.init();
		// Register service configuration parsers.
		ServiceConfigurationParserRegistry configurationParserRegistry = ServiceConfigurationParserRegistry
				.getInstance();
		configurationParserRegistry.registerServiceConfigurationParser(
				TransformerService.class.getSimpleName(), OBJECT_MAPPING_ID,
				TransformerServiceConfigParser.class.getSimpleName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.commons.MediationService#process(com.headstrong
	 * .fusion.commons.MessageExchange,
	 * com.headstrong.fusion.commons.ServiceConfig)
	 */
	@SuppressWarnings("unchecked")
	public void process(MessageExchange exchange, ServiceConfig config)
			throws FusionException, InvalidAttributeExpressionException {
		ErrorHandler errorHandler = config.getErrorHandler();
		// Incoming Message
		Object inBody = exchange.getIn().getBody();
		if (logger.isDebugEnabled()) {
			logger
					.debug("Transforming message: "
							+ ((inBody instanceof BusinessObject) ? ((BusinessObject) inBody)
									.toXml()
									: inBody));
		}
		// Bugchase 234 ErrorMonitoring # Used For ErrorLogging
		String errorString = " For Process '" + config.getProcessId()
				+ "', Service '" + config.getServiceId() + "', Message= ";

		// Read the transformation service configuration.
		TransformerServiceConfig transServiceconfig = null;
		try {
			transServiceconfig = this.getTransformerServiceConfig(config);
		} catch (FusionException e1) {
			// Bugchase 234 ErrorMonitoring # Transformation definition
			// identifier not specified.
			logger
					.error(
							"Transformation definition identifier not specified."
									+ errorString
									+ ((inBody instanceof BusinessObject) ? ((BusinessObject) inBody)
											.toXml()
											: inBody), e1);
			super.handleError(errorHandler, config.getProcessId(), config
					.getServiceId(), ERROR_TYPE_SYSTEM,
					config.getServiceType(), e1, config, null);
		}
		/* Is Transformation only enrich or transformation of one BO to another */
		String enrichTransform = (String) config.getProperty(ENRICH);

		BusinessObject outBO = null;
		boolean isEnrich = false;
		if (enrichTransform != null) {
			try {
				isEnrich = Boolean.parseBoolean(enrichTransform);
			} catch (Exception e) {
				logger.info("Enrich value not proper. defaulting to false");
				isEnrich = false;
			}
		}

		/*
		 * If not enrich, the need to get more information about the schema of
		 * the output business object
		 */
		ObjectDescriptor objectDescriptor = null;
		if (!isEnrich) {
			String objectDescriptorSchema = (String) config
					.getProperty(OBJECT_DESCRIPTOR_SCHEMA);

			if (objectDescriptorSchema != null) {
				// super.handleError(errorHandler, config.getProcessId(), config
				// .getServiceId(), ERROR_TYPE_BUSINESS, config
				// .getServiceType(), new FusionException(
				// "Object Descriptor schema not specified."), config,
				// null);
				objectDescriptor = ObjectDescriptorCache.getInstance()
						.getDescriptor(objectDescriptorSchema);
			}
			// if (objectDescriptor == null) {
			// String errorMsg = "Object Descriptor schema not found for schema
			// id "
			// + objectDescriptorSchema;
			// logger.error(errorMsg);
			// FusionException ex = new FusionException(errorMsg);
			// super.handleError(errorHandler, config.getProcessId(), config
			// .getServiceId(), ERROR_TYPE_BUSINESS, config
			// .getServiceType(), ex, config, null);
			// }
		}

		/*
		 * if body is only single business object
		 */
		// Object inBody = exchange.getIn().getBody();
		if (inBody instanceof BusinessObject) {
			BusinessObject bo = (BusinessObject) inBody;
			boolean isValid = true;
			try {
				if (isEnrich) {
					outBO = bo;
				} else if (objectDescriptor != null) {
					outBO = BusinessObjectFactory
							.getBusinessObject(Type.Default);
					outBO.setObjectDescriptor(objectDescriptor);
					outBO.setAttributeValues(new HashMap<String, Object>());
				} else {
					outBO = BusinessObjectFactory
							.getBusinessObject(Type.Dynamic);
				}
				this.transfomer.transform(exchange.getIn().getHeaders(), bo,
						outBO, transServiceconfig);
				logger.debug("After transformation " + outBO.toXml());
			} catch (TransformationException e) {
				isValid = false;
				// Bugchase 234 ErrorMonitoring # Transformation Error
				logger.error(
						"Transformation Error." + errorString + bo.toXml(), e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config
						.getServiceType(), e, bo, null);
			}
			if (isValid) {
				exchange.getIn().setBody(outBO);
			} else {
				// since the message is invalid remove the same from the
				// exchange
				exchange.setIn(null);
			}
			return;
		} else if (inBody instanceof List) {
			/*
			 * if body is list of business objects
			 */
			List<BusinessObject> outList = new ArrayList<BusinessObject>();
			List<BusinessObject> boList = (List<BusinessObject>) inBody;
			boolean isError = false;
			for (BusinessObject bo : boList) {
				isError = false;
				try {
					if (isEnrich) {
						outBO = bo;
					} else {
						outBO = BusinessObjectFactory
								.getBusinessObject(Type.Default);
						outBO.setObjectDescriptor(objectDescriptor);
						outBO.setAttributeValues(new HashMap<String, Object>());
					}
					transfomer.transform(exchange.getIn().getHeaders(), bo,
							outBO, transServiceconfig);
				} catch (TransformationException e) {
					isError = true;
					// Bugchase 234 ErrorMonitoring # Transformation Error
					logger.error("Transformation Error." + errorString
							+ bo.toXml(), e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_BUSINESS, config
									.getServiceType(), e, bo, null);
				}
				if (!isError) {
					outList.add(outBO);
				}
			}
			exchange.getIn().setBody(outList);
		}
	}

	/**
	 * Gets the Transformation Service Configuration.
	 * 
	 * @param config
	 * @return
	 * @throws FusionException
	 */
	private TransformerServiceConfig getTransformerServiceConfig(
			ServiceConfig config) throws FusionException {
		/*
		 * Read the Mapping.
		 */
		String mappingId = (String) config.getProperty(OBJECT_MAPPING_ID);
		if (mappingId == null) {
			String errorMsg = "Transformation definition identifier not specified.";
			throw new FusionException(errorMsg);
		}

		/*
		 * Read the service configuration
		 */
		ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
		serviceConfiguration.setProcessId(config.getProcessId());
		serviceConfiguration.setServiceId(config.getServiceId());
		serviceConfiguration.setPropertyId(mappingId);

		TransformerServiceConfig transServiceconfig = null;
		try {
			/*
			 * Get the configuration from the cache.
			 */
			transServiceconfig = (TransformerServiceConfig) serviceConfigCache
					.getPropertyConfiguration(serviceConfiguration);
		} catch (ServiceConfigurationNotFoundException e) {
			String errorMsg = "No configuration found for the service configuration id provided ";
			logger.error(errorMsg, e);
			throw new FusionException(errorMsg, e);
		}
		return transServiceconfig;
	}

}
