package com.headstrong.fusion.services.message.encrypter.impl;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.commons.GenericMediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.services.message.encrypter.MessageEncrypterService;



public class MessageEncrypterServiceImpl extends GenericMediationService
		implements MessageEncrypterService {

	private static final Logger logger = LoggerFactory
			.getLogger(MessageEncrypterServiceImpl.class);
	private String cipherAlgorithm = "AES";
	private String cipherBlockMode = "CBC";
	private String cipherPadding = "PKCS5Padding";
	private String ivParams;
	private String key64;
	
	@Override
	public void init() {
		super.init();

	}

	@Override
	public void process(MessageExchange exchange, ServiceConfig config)
			throws FusionException, InvalidAttributeExpressionException {
		ErrorHandler errorHandler = config.getErrorHandler();
		String inputMessage = exchange.getIn().getBody().toString();
		if (logger.isDebugEnabled()) {
			logger.debug("Input message received for encrypting. " + inputMessage);
		}
		String outputMessage = null;
		if (inputMessage != null) {
			try {
				cipherAlgorithm = (String) config.getProperty(ALGORITHM);
				cipherBlockMode = (String) config.getProperty(BLOCKMODE);
				cipherPadding = (String) config.getProperty(PADDING);
				ivParams = (String)config.getProperty(IVPARAMS);
				key64 = (String)config.getProperty(KEY64);
				if(cipherAlgorithm.equalsIgnoreCase("AES")){
					outputMessage = AESEncrypter.encrypt(cipherBlockMode,cipherPadding,key64,ivParams,inputMessage);
				} else if(cipherAlgorithm.equalsIgnoreCase("ARCFOUR")){
					outputMessage = ARCFOUREncrypter.encrypt(cipherBlockMode,cipherPadding,key64,ivParams,inputMessage);
				} else if(cipherAlgorithm.equalsIgnoreCase("Blowfish")){
					outputMessage = BlowfishEncrypter.encrypt(cipherBlockMode,cipherPadding,key64,ivParams,inputMessage);
				} else if(cipherAlgorithm.equalsIgnoreCase("DES")){
					outputMessage = DESEncrypter.encrypt(cipherBlockMode,cipherPadding,key64,ivParams,inputMessage);
				} else if(cipherAlgorithm.equalsIgnoreCase("RC2")){
					outputMessage = RC2Encrypter.encrypt(cipherBlockMode,cipherPadding,key64,ivParams,inputMessage);
				} else if(cipherAlgorithm.equalsIgnoreCase("RSA")){
					outputMessage = RSAEncrypter.encrypt(cipherBlockMode,cipherPadding,key64,ivParams,inputMessage);
				} else if(cipherAlgorithm.startsWith("PBEWithMD5")||cipherAlgorithm.startsWith("PBEWithSHA")){
					outputMessage = PBEWithMD5Encrypter.encrypt(cipherAlgorithm,cipherBlockMode,cipherPadding,key64,ivParams,inputMessage);
				} else if(cipherAlgorithm.startsWith("DESede")){
					outputMessage = DESedeEncrypter.encrypt(cipherBlockMode,cipherPadding,key64,ivParams,inputMessage);
				}
				
				exchange.getIn().setBody(outputMessage);

			} catch (NoSuchAlgorithmException e) {
				logger.error("Error while encrypting the message: Invalid algorithm"
						+ config.getProcessId() + " service "
						+ config.getServiceId(), e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config.getServiceType(),
						e, inputMessage, null);
				
					
			} catch (NoSuchPaddingException e) {
				logger.error("Error while encrypting the message: Invalid padding"
						+ config.getProcessId() + " service "
						+ config.getServiceId(), e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config.getServiceType(),
						e, inputMessage, null);
			
			} catch (IllegalBlockSizeException e) {
				logger.error("Error while encrypting the message: Illegal block size "
						+ config.getProcessId() + " service "
						+ config.getServiceId(), e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config.getServiceType(),
						e, inputMessage, null);
				
			} catch (BadPaddingException e) {
				logger.error("Error while encrypting the message: Bad padding "
						+ config.getProcessId() + " service "
						+ config.getServiceId(), e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config.getServiceType(),
						e, inputMessage, null);
					
			} catch (InvalidAlgorithmParameterException e) {
				logger.error("Error while encrypting the message: Invalid Algorithm "
						+ config.getProcessId() + " service "
						+ config.getServiceId(), e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config.getServiceType(),
						e, inputMessage, null);
				
			}  catch (Exception e) {
				logger.error("Error while encrypting the message."
						+ config.getProcessId() + " service "
						+ config.getServiceId(), e);
				super.handleError(errorHandler, config.getProcessId(), config
						.getServiceId(), ERROR_TYPE_BUSINESS, config.getServiceType(),
						e, inputMessage, null);
			}

		} else {
			// Ignoring the Error.
			logger.error("Empty message payload for process "
					+ config.getProcessId() + " service "
					+ config.getServiceId());
		}

	}
	
}
