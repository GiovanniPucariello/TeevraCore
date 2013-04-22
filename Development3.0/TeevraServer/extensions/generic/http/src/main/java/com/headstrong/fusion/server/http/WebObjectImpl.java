package com.headstrong.fusion.server.http;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.connector.http.receiver.HTTPReceiverUtil;
import com.headstrong.fusion.connector.http.receiver.HttpConsumer;
import com.headstrong.fusion.connector.http.receiver.HttpReceiverConfiguration;

/**
 * WebObjectImpl class handles the client specific POST request.
 * 
 * @author mali
 * 
 */
@SuppressWarnings("unchecked")
public class WebObjectImpl extends IOWebObject {

	private static Logger logger = LoggerFactory.getLogger(WebObjectImpl.class);
	private HttpConsumer httpConsumer;
	private HttpReceiverConfiguration config;
	private String payloadXPath = "";
	private String transmitType = "synchronous";
	private boolean isWrapped;
	private String xmlWrapper;
	private String contentType;
	private boolean isPostEncoded = false;
	private ArrayList allowedUsersV;
	private ArrayList allowedGroupsV;
	private static boolean messagesProcessing;
	private static boolean timeout = false;
	private String transactionBody;
	private String transactionContent;
	private boolean authenticationRequired;
	private String urlHandler;
	private String responseType = "application/xml";
	private boolean isPayloadXML;
	private String handlerRequested;

	public void setEndpointConfig() {

		this.config = httpConsumer.getConfig();
		this.transmitType = config.getTransmitType();
		// xml or text
		this.transactionBody = config.getTransactionBody();
		this.isWrapped = config.isWrapped();
		this.xmlWrapper = config.getXmlWrapper();
		// payload or body
		this.transactionContent = config.getTransactionContent();
		this.isPostEncoded = config.isPostEncoded();
		this.authenticationRequired = config.isUserAuthentication();
		this.urlHandler = config.getUrlHandler();
		this.responseType = config.getResponseType();
		this.payloadXPath = config.getPayloadXPath();
		this.isPayloadXML = config.isPayloadXML();

	}

	@Override
	public void handleRequest(HTTPRequestInterface httpRequest,
			HTTPResponseInterface httpResponse) throws IOException {
		try {
			this.handlerRequested = new URI(httpRequest.getURL()).getPath();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.httpConsumer = (HttpConsumer) HTTPReceiverUtil.getConsumerPool()
				.get(handlerRequested);
		if (httpConsumer == null) {
			returnError(ExecutionResults.E_WEB_BAD_REQ, "invalid handler",
					httpResponse);
			return;
		}
		setEndpointConfig();
		String handler = this.urlHandler;
		String body = httpRequest.getBody();
		if (isPostEncoded) {
			body = new String(Base64.decode(body));
		}
		if (handler == null || "".equals(handler)) {
			returnError(ExecutionResults.E_WEB_BAD_REQ, "Bad request. ",
					httpResponse);
			return;
		}
		try {
			handlerRequested = new URI(httpRequest.getURL()).getPath();
		} catch (URISyntaxException e) {
			returnError(ExecutionResults.E_WEB_SYS_ERR,
					"A system error occured.", httpResponse);
			return;
		}
		if (!handler.equalsIgnoreCase(handlerRequested)) {
			returnError(ExecutionResults.E_WEB_BAD_REQ, "invalid handler",
					httpResponse);
			return;
		}
		if (transactionBody.equalsIgnoreCase("XML")) {
			SAXReader sax = new SAXReader();
			Document doc = null;
			try {
				doc = sax.read(new StringReader(body));
			} catch (DocumentException e) {
				returnError(ExecutionResults.E_WEB_BAD_REQ, "Bad request: "
						+ e.getMessage(), httpResponse);
				return;
			}
			if (isWrapped) {

				if (xmlWrapper.equals(FusionConstants.MISMOWRAPPER)) {
					String userID = doc.valueOf("//REQUEST/LoginAccountId");
					String password = doc
							.valueOf("//REQUEST/LoginAccountPassword");
					String data = null;
					Properties directives = new Properties();
					// loop through directives
					directives.setProperty("userID", userID);
					for (Iterator i = doc.selectNodes("//REQUEST/KEY")
							.iterator(); i.hasNext();) {
						Element directive = (Element) i.next();
						directives.setProperty(directive
								.attributeValue("_Name"), directive
								.attributeValue("_Value"));
					}
					// user authentication required?
					if (allowedUsersV != null || allowedGroupsV != null) {
						// TODO
					}

					if (transactionContent.equalsIgnoreCase("payload")) {
						if (isPayloadXML) {
							Element elemPayload = (Element) doc
									.selectSingleNode("//REQUEST_DATA");
							Element elemDataRoot = (Element) elemPayload
									.elements().get(0);

							try {
								Document encodedAsciiDoc = DocumentHelper
										.parseText(elemDataRoot.asXML());
								StringWriter sw = new StringWriter();
								XMLWriter xmlWriter = new XMLWriter(sw,
										OutputFormat.createCompactFormat());
								xmlWriter.setMaximumAllowedCharacter(127);
								xmlWriter.write(encodedAsciiDoc);
								xmlWriter.flush();
								xmlWriter.close();
								sw.close();
								encodedAsciiDoc = null;
								data = sw.toString();
							} catch (Exception e) {
								returnError(ExecutionResults.E_WEB_BAD_REQ,
										"Bad request: " + e.getMessage(),
										httpResponse);
								logger
										.error("FAILURE - XML write exception has occured in MISMORequestMapWebObject.handleRequest(): "
												+ e);
								return;
							}
						} else {
							data = doc.valueOf("//REQUEST_DATA");
						}
					} else {
						data = doc.valueOf("//REQUEST_DATA");
					}
					processRequestBody(data, httpRequest, httpResponse);

				} else

				if (xmlWrapper.equals(FusionConstants.TEEVRAWRAPPER)) {
					String userID = doc.valueOf("//Header/userID");
					String password = doc.valueOf("//Header/password");
					String routeID = doc.valueOf("//Header/routeID");
					String data = null;
					Properties directives = new Properties();

					// loop through directives
					for (Iterator i = doc.selectNodes("//Directive").iterator(); i
							.hasNext();) {
						Element directive = (Element) i.next();
						directives.setProperty(directive.valueOf("name"),
								directive.valueOf("value"));
						directives.setProperty("userID", userID);
						directives.setProperty("routeID", routeID);
					}
					// TODO Commented out the authentication logic
					// try {
					// TediUser tediUser =
					// TediServerMain.security.authenticateUser(userID,
					// password);
					//	
					// ArrayList groupV = tediUser.getGroups();
					// directives.setProperty("primaryGroup", (String) groupV
					// .get(0));
					// directives.put("allGroups", groupV);
					// } catch (TediSecurityException e) {
					// returnError(ExecutionResults.E_WEB_UNAUTHORIZED,"Unauthorized use- bad user/pass.",
					// httpResponse);
					// //
					// TediServerMain.serverLog.log("Web user authorization failure: "+userID);
					// return;
					// } catch (Exception e) {
					// returnError(ExecutionResults.E_WEB_SYS_ERR,
					// "A system error occured.", httpResponse);
					// //
					// TediServerMain.serverLog.log("Error looking up parameters for web route "
					// // + routeID + ": "+userID);
					// return;
					// }

					// isPayloadXML = new
					// Boolean(elemPayload.attributeValue("isXML")).booleanValue();
					// isPostEncoded = new
					// Boolean(elemPayload.attributeValue("isEncoded")).booleanValue();

					if (transactionContent.equalsIgnoreCase("payload")) {
						Element elemPayload = (Element) doc
								.selectSingleNode("//payload");
						if (isPayloadXML) {
							Element elemDataRoot = (Element) elemPayload
									.elements().get(0);

							try {
								Document encodedAsciiDoc = DocumentHelper
										.parseText(elemDataRoot.asXML());
								StringWriter sw = new StringWriter();
								XMLWriter xmlWriter = new XMLWriter(sw,
										OutputFormat.createCompactFormat());
								xmlWriter.setMaximumAllowedCharacter(127);
								xmlWriter.write(encodedAsciiDoc);

								xmlWriter.flush();
								xmlWriter.close();
								sw.close();
								encodedAsciiDoc = null;
								data = sw.toString();
							} catch (Exception e) {
								returnError(ExecutionResults.E_WEB_BAD_REQ,
										"Bad request: " + e.getMessage(),
										httpResponse);
								logger
										.error("FAILURE - XML write exception has occured in StandardizedWebObject.handleRequest(): "
												+ e);
								return;
							}
						} else {
							data = elemPayload.getText();
						}
					} else {
						data = body;
					}
					httpResponse.setHeaderValue(FusionConstants.CONTENT_TYPE,
							contentType);
					processRequestBody(data, httpRequest, httpResponse);

				} else if (xmlWrapper.equals(FusionConstants.CUSTOMWRAPPER)) {
					try {
						String data = null;
						Element elemPayload = (Element) doc
								.selectSingleNode(payloadXPath);
						if (transactionContent.equalsIgnoreCase("payload")) {
							if (isPayloadXML) {

								// Start : Added for PayloadXml = True and Wrapper : Custom Wrapper

								Element elemDataRoot = (Element) elemPayload
										.elements().get(0);
								try {
									Document encodedAsciiDoc = DocumentHelper
											.parseText(elemDataRoot.asXML());
									StringWriter sw = new StringWriter();
									XMLWriter xmlWriter = new XMLWriter(sw,
											OutputFormat.createCompactFormat());
									xmlWriter.setMaximumAllowedCharacter(127);
									xmlWriter.write(encodedAsciiDoc);

									xmlWriter.flush();
									xmlWriter.close();
									sw.close();
									encodedAsciiDoc = null;
									data = sw.toString();
								} catch (Exception e) {
									returnError(ExecutionResults.E_WEB_BAD_REQ,
											"Bad request: " + e.getMessage(),
											httpResponse);
									logger
											.error("FAILURE - XML write exception has occured in StandardizedWebObject.handleRequest(): "
													+ e);
									return;
								}
								
								// End : Added for PayloadXml = True and Wrapper : Custom Wrapper
								
							} else {
								// Start : Modifying for PayloadXml = False and Wrapper : Custom Wrapper
						
								Document d = new SAXReader()
										.read(new StringReader(body));
								data = d.valueOf(payloadXPath);
								
								// End : Modifying for PayloadXml = False and Wrapper : Custom Wrapper

							}
						} else
							data = body;
						processRequestBody(data, httpRequest, httpResponse);
					} catch (Exception e) {
						returnError(ExecutionResults.E_WEB_SYS_ERR,
								"A system error occured.", httpResponse);
						return;
					}
				}
			} else {
				try {
					
					
					String data = null;
					Element elemPayload = (Element) doc
							.selectSingleNode(payloadXPath);
					if (transactionContent.equalsIgnoreCase("payload")) {

						// Start : wrapped = False and PayloadXML = True
						if (isPayloadXML) {

							Element elemDataRoot = (Element) elemPayload
									.elements().get(0);
							try {
								Document encodedAsciiDoc = DocumentHelper
										.parseText(elemDataRoot.asXML());
								StringWriter sw = new StringWriter();
								XMLWriter xmlWriter = new XMLWriter(sw,
										OutputFormat.createCompactFormat());
								xmlWriter.setMaximumAllowedCharacter(127);
								xmlWriter.write(encodedAsciiDoc);

								xmlWriter.flush();
								xmlWriter.close();
								sw.close();
								encodedAsciiDoc = null;
								data = sw.toString();
							} catch (Exception e) {
								returnError(ExecutionResults.E_WEB_BAD_REQ,
										"Bad request: " + e.getMessage(),
										httpResponse);
								logger
										.error("FAILURE - XML write exception has occured in StandardizedWebObject.handleRequest(): "
												+ e);
								return;
							}
						} else {
							// Modified the code for is PayloadXml = False and Wrapped = False
							//data = body;
							Document d = new SAXReader().read(new StringReader(
									body));
							data = d.valueOf(payloadXPath);							
						}
						// End : wrapped = False and PayloadXML = True
					} else
						data = body;
					processRequestBody(data, httpRequest, httpResponse);
				} catch (Exception e) {
					returnError(ExecutionResults.E_WEB_SYS_ERR,
							"A system error occured.", httpResponse);
					return;
				}
			}
		} else {
			processRequestBody(body, httpRequest, httpResponse);
		}
	}

	private void processRequestBody(String body,
			HTTPRequestInterface httpRequest, HTTPResponseInterface httpResponse) {
		if (body == null || body.equals("")) {
			returnError(ExecutionResults.E_WEB_NO_RESPONSE,
					"Bad Request: body is null ", httpResponse);
			return;
		}
		ExecutionResults results = new ExecutionResults();
		results.setReturnCode(ExecutionResults.RESULT_SUCCESS);
		httpConsumer.setBody(body);
		if (transmitType.equalsIgnoreCase("synchronous")) {
			messagesProcessing = true;
			long endTimeMillis = System.currentTimeMillis()
					+ config.getResponseTimeout();
			while (messagesProcessing) {
				if (System.currentTimeMillis() > endTimeMillis) {
					WebObjectImpl.setTimeout(true);
					WebObjectImpl.setProcessingMessage(false);
					break;
				}

			}
		}
		if (timeout) {
			returnError(ExecutionResults.E_WEB_BAD_REQ,
					"No response from consumer: ", httpResponse);
			timeout = false;
			return;
		}
		if (transmitType.equals("asynchronous")) {
			// file output, but still need to return something to
			// user
			ExecutionResults res = new ExecutionResults();
			res.setReturnCode(ExecutionResults.RESULT_SUCCESS);
			writeResponse(httpResponse, this.responseType, res.asString());
		}
		writeResponse(httpResponse, this.responseType, results.asString());

	}

	@Override
	public void init() throws Exception {

	}

	/**
	 * 
	 * 
	 * @param cde
	 * @param msg
	 * @param httpResponse
	 */
	protected void returnError(int code, String msg,
			HTTPResponseInterface httpResponse) {
		ExecutionResults res = new ExecutionResults();
		res.setReturnCode(ExecutionResults.RESULT_ERROR);
		res.addMessage(ExecutionResults.M_ERROR, code, msg);
		httpResponse.setHeaderValue("message", msg);
		httpResponse
				.setHeaderValue("returnCode", ExecutionResults.RESULT_ERROR);
		writeResponse(httpResponse, this.responseType, res.asString());
	}

	public void setConsumer(HttpConsumer consumer) {
		httpConsumer = consumer;
	}

	public static boolean isProcessingMessage() {
		return messagesProcessing;
	}

	public static void setProcessingMessage(boolean processingMessage) {
		WebObjectImpl.messagesProcessing = processingMessage;
	}

	public static boolean isTimeout() {
		return timeout;
	}

	public static void setTimeout(boolean timeout) {
		WebObjectImpl.timeout = timeout;
	}

	public HttpReceiverConfiguration getConfig() {
		return config;
	}

	public void setConfig(HttpReceiverConfiguration config) {
		this.config = config;
	}

}
