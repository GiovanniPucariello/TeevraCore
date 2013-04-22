package com.headstrong.fusion.services.validator.impl;

import java.util.ArrayList;
import java.util.List;

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
import com.headstrong.fusion.services.validator.ValidatorService;
import com.headstrong.fusion.services.validator.exception.ValidationException;
import com.headstrong.fusion.services.validator.rulemanager.RuleManager;
import com.headstrong.fusion.services.validator.serviceconfig.ValidatorServiceConfig;
import com.headstrong.fusion.services.validator.serviceconfig.ValidatorServiceConfigParser;

/**
 * <code>ValidatorServiceImpl</code> is the {@link GenericMediationService}.
 * This service transforms the business object by applying the set of rules
 * specified.
 */
public class ValidatorServiceImpl extends GenericMediationService implements
		ValidatorService {

	/**
	 * logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(ValidatorService.class);

	/**
	 * {@link ServiceConfigurationCache} containing how configuration for
	 * validator. It contains information about the rules has to be operated.
	 */
	private static final ServiceConfigurationCache serviceConfigCache = ServiceConfigurationCache
			.getInstance();

	/**
	 * Validator instance
	 */
	private Validator validator;

	@Override
	public void init() {
		super.init();
		// Register service configuration parsers.
		ServiceConfigurationParserRegistry configurationParserRegistry = ServiceConfigurationParserRegistry
				.getInstance();
		configurationParserRegistry.registerServiceConfigurationParser(
				ValidatorService.class.getSimpleName(), OBJECT_MAPPING_ID,
				ValidatorServiceConfigParser.class.getSimpleName());
	}

	/**
	 * Only constructor. Need to pass the rule manager which has complete logic
	 * as how the rule has to be executed.
	 * 
	 * @param ruleManager
	 *            {@link RuleManager}
	 */
	public ValidatorServiceImpl(Validator validator) {
		super();
		this.setValidator(validator);
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
		Object inputMessage = exchange.getIn().getBody();
		// Bugchase 234 ErrorMonitoring # Used for logging
		String errorString = " For Process '" + config.getProcessId()
				+ "', Service '" + config.getServiceId() + "', Message= ";

		if (logger.isDebugEnabled()) {
			logger.debug("processing message: " + exchange.getIn().getBody());
		}

		/*
		 * Read the Mapping.
		 */
		String mappingId = (String) config.getProperty(OBJECT_MAPPING_ID);
		if (mappingId == null) {
			String errorMsg = "Validation definition identifier not specified."
					+ errorString
					+ ((inputMessage instanceof BusinessObject) ? ((BusinessObject) inputMessage)
							.toXml()
							: inputMessage);
			logger.error(errorMsg);
			super.handleError(errorHandler, config.getProcessId(), config
					.getServiceId(), ERROR_TYPE_SYSTEM,
					config.getServiceType(), new FusionException(
							"Validation definition identifier not specified."),
					config, null);
		}

		/*
		 * Read the service configuration
		 */
		ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
		serviceConfiguration.setProcessId(config.getProcessId());
		serviceConfiguration.setServiceId(config.getServiceId());
		serviceConfiguration.setPropertyId(mappingId);

		ValidatorServiceConfig validatorServiceconfig = null;
		try {
			/*
			 * Get the configuration from the cache.
			 */
			validatorServiceconfig = (ValidatorServiceConfig) serviceConfigCache
					.getPropertyConfiguration(serviceConfiguration);
		} catch (ServiceConfigurationNotFoundException e) {
			String errorMsg = "No configuration found for the service configuration id provided."
					+ errorString
					+ ((inputMessage instanceof BusinessObject) ? ((BusinessObject) inputMessage)
							.toXml()
							: inputMessage);
			logger.error(errorMsg, e);
			super.handleError(errorHandler, config.getProcessId(), config
					.getServiceId(), ERROR_TYPE_SYSTEM,
					config.getServiceType(), e, serviceConfiguration, null);
		}

		Object inMessageBody = exchange.getIn().getBody();

		/*
		 * if body is only single business object
		 */
		if (inMessageBody instanceof BusinessObject) {
			BusinessObject inBusinessObject = (BusinessObject) inMessageBody;
			// set the data in the context.
			try {
				this.getValidator().validate(exchange.getIn().getHeaders(),
						inBusinessObject, validatorServiceconfig);
			} catch (ValidationException e) {
				// Bugchase 234 ErrorMonitoring # Validation Error
				String errorMsg = "Validation Error! " + errorString
						+ inBusinessObject.toXml();
				logger.error(errorMsg, e);
				super
						.handleError(errorHandler, config.getProcessId(),
								config.getServiceId(), ERROR_TYPE_BUSINESS,
								config.getServiceType(), e, inMessageBody,
								"Validation Error");
				// remove the message from the exchange as invalid.
				// this is required in case the error handling is set
				// as ReportAndContinue. the in message is invalid and
				// should not be processed further.
				exchange.setIn(null);
			}
		}

		/*
		 * if body is list of business objects
		 */
		if (inMessageBody instanceof List) {
			List<BusinessObject> inBoList = (List<BusinessObject>) inMessageBody;
			List<BusinessObject> outBoList = new ArrayList<BusinessObject>();
			boolean invalid = false;
			for (BusinessObject bo : inBoList) {
				invalid = false;
				// set the data in the context.
				try {
					this.getValidator().validate(exchange.getIn().getHeaders(),
							bo, validatorServiceconfig);
				} catch (ValidationException e) {
					invalid = true;
					// Bugchase 234 ErrorMonitoring #Validation Error
					String errorMsg = "Validation Error! " + errorString
							+ bo.toXml();
					logger.error(errorMsg, e);
					super.handleError(errorHandler, config.getProcessId(),
							config.getServiceId(), ERROR_TYPE_BUSINESS, config
									.getServiceType(), e, bo,
							"Validation Error");
				}
				if (!invalid) {
					outBoList.add(bo);
				}
			}
			// FIXME :: optimize.
			exchange.getIn().setBody(outBoList);
		}
	}

	/**
	 * @return the validator
	 */
	public Validator getValidator() {
		return validator;
	}

	/**
	 * @param validator
	 *            the validator to set
	 */
	public void setValidator(Validator validator) {
		this.validator = validator;
	}

}
