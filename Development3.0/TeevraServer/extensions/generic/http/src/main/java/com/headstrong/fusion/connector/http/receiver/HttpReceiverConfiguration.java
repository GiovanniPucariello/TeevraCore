package com.headstrong.fusion.connector.http.receiver;

import java.util.Map;

/**
 * HTTP Receiver binding configuration.
 * 
 * @author mali
 *
 */
public class HttpReceiverConfiguration {
	private String httpService = "standard";	
	private String urlHandler;
	private boolean isPayloadXML = false;
	private boolean isWritePayloadOnly = false;
	private String payloadXPath = "";
	private String transmitType;
	private boolean isWrapped;
	private String xmlWrapper;
	protected boolean isPostEncoded = false;
	private int responseTimeout = 5000;
	private boolean userAuthentication;
	private String userNameXPath;
	private String passwordXPath;
	//xml or text
	private String transactionBody;
	// body or payload
	private String transactionContent;
	private String responseType;
//	private boolean isPayloadXML;
	
	public HttpReceiverConfiguration() {
	}

	public HttpReceiverConfiguration(Map<String, String> properties) {
		// host name
		this.httpService = properties.get("httpService");
		this.transmitType =  properties.get("transmitType");
		if(transmitType.equalsIgnoreCase("synchronous")){			
			if(properties.get("responseTimeout")== null || properties.get("responseTimeout").trim().equals("")){
			this.responseTimeout = Integer.parseInt(properties.get("responseTimeout"));
			}
		} 
		// xml or text
		this.transactionBody = properties.get("transactionBody");
		if(transactionBody.equalsIgnoreCase("XML")){
			//body or payload
			this.transactionContent = properties.get("transactionContent");
			if(transactionContent.equalsIgnoreCase("payload")){
				this.isPayloadXML = Boolean.parseBoolean(properties.get("payloadType"));
				// Setting the payloadXPath 
				this.payloadXPath = properties.get("payloadXPath");
				
			}
			this.isWrapped =  Boolean.parseBoolean(properties.get("isWrapped"));
			if(isWrapped){
				this.xmlWrapper =  properties.get("xmlWrapper");
				if(xmlWrapper.equalsIgnoreCase("Custom wrapper")){
					this.payloadXPath = properties.get("payloadXPath");
				}		
			}
			
			
			this.userAuthentication = Boolean.parseBoolean(properties.get("userAuthentication"));
			if(userAuthentication && (xmlWrapper.equalsIgnoreCase("Custom wrapper") || isWrapped == true)){
				this.userNameXPath = properties.get("userNameXPath");
				this.passwordXPath = properties.get("passwordXPath");
			}
			
			
		}
//		this.isPayloadXML =  Boolean.parseBoolean(properties.get("isPayloadXML"));
		this.isPostEncoded =  Boolean.parseBoolean(properties.get("isPostEncoded"));			
		this.urlHandler = properties.get("urlHandler");
		this.responseType = properties.get("responseType");
		
	}

	public boolean isPayloadXML() {
		return isPayloadXML;
	}

	public void setPayloadXML(boolean isPayloadXML) {
		this.isPayloadXML = isPayloadXML;
	}

	public boolean isWritePayloadOnly() {
		return isWritePayloadOnly;
	}

	public void setWritePayloadOnly(boolean isWritePayloadOnly) {
		this.isWritePayloadOnly = isWritePayloadOnly;
	}

	public String getPayloadXPath() {
		return payloadXPath;
	}

	public void setPayloadXPath(String payloadXPath) {
		this.payloadXPath = payloadXPath;
	}

	public String getTransmitType() {
		return transmitType;
	}

	public void setTransmitType(String transmitType) {
		this.transmitType = transmitType;
	}

	public boolean isWrapped() {
		return isWrapped;
	}

	public void setWrapped(boolean isWrapped) {
		this.isWrapped = isWrapped;
	}

	public String getXmlWrapper() {
		return xmlWrapper;
	}

	public void setXmlWrapper(String xmlWrapper) {
		this.xmlWrapper = xmlWrapper;
	}

	public boolean isPostEncoded() {
		return isPostEncoded;
	}

	public void setPostEncoded(boolean isPostEncoded) {
		this.isPostEncoded = isPostEncoded;
	}
	
	public String getUrlHandler() {
		return urlHandler;
	}

	public void setUrlHandler(String urlHandler) {
		this.urlHandler = urlHandler;
	}

	public int getResponseTimeout() {
		return responseTimeout;
	}

	public void setResponseTimeout(int responseTimeout) {
		this.responseTimeout = responseTimeout;
	}

	public boolean isUserAuthentication() {
		return userAuthentication;
	}

	public void setUserAuthentication(boolean userAuthentication) {
		this.userAuthentication = userAuthentication;
	}

	public String getUserNameXPath() {
		return userNameXPath;
	}

	public void setUserNameXPath(String userNameXPath) {
		this.userNameXPath = userNameXPath;
	}

	public String getPasswordXPath() {
		return passwordXPath;
	}

	public void setPasswordXPath(String passwordXPath) {
		this.passwordXPath = passwordXPath;
	}

	public String getTransactionBody() {
		return transactionBody;
	}

	public void setTransactionBody(String transactionBody) {
		this.transactionBody = transactionBody;
	}

	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}

	public String getTransactionContent() {
		return transactionContent;
	}

	public void setTransactionContent(String transactionContent) {
		this.transactionContent = transactionContent;
	}

	public String getHttpService() {
		return httpService;
	}

	public void setHttpService(String httpService) {
		this.httpService = httpService;
	}

}
