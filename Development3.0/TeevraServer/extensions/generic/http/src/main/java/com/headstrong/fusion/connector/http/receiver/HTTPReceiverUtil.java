package com.headstrong.fusion.connector.http.receiver;

import java.util.HashMap;

import com.headstrong.fusion.server.http.WebObjectImpl;

/**
 * @author mali
 *
 */
public class HTTPReceiverUtil {

	private static HTTPReceiverUtil httpUtil = new HTTPReceiverUtil();
	private static boolean messageProcessed = false;
	private static boolean  httpServiceStarted = false;
	private static boolean portAvailable = true;
	private static HashMap<String,HttpConsumer> consumerPool = new HashMap<String, HttpConsumer>(); 
	public static void waitForProcessCompletion(long responseTime) {
		long endTimeMillis = System.currentTimeMillis() + responseTime;		
		while(messageProcessed != true){
			WebObjectImpl.setProcessingMessage(false);
			if (System.currentTimeMillis() > endTimeMillis) {
	           WebObjectImpl.setTimeout(true);	           
	           return;
	        }
		}
		 WebObjectImpl.setProcessingMessage(false);
		 messageProcessed = false;
	}

	/**
	 * 
	 */
	public static void waitForHTTPServiceToStart(){
		
		while(httpServiceStarted != true && portAvailable != false ){
			isHttpServiceStarted();
		}
	}
	
	
	
	public static boolean isMessageProcessed() {
		return messageProcessed;
	}

	/**
	 * @param messageProcessed
	 */
	public static void setMessageProcessed(boolean messageProcessed) {
		HTTPReceiverUtil.messageProcessed = messageProcessed;
	}

	public static boolean isHttpServiceStarted() {
		return httpServiceStarted;
	}

	public static void setHttpServiceStarted(boolean httpServiceStarted) {
		HTTPReceiverUtil.httpServiceStarted = httpServiceStarted;
	}

	public static boolean isPortAvailable() {
		return portAvailable;
	}

	public static void setPortAvailable(boolean portAvailable) {
		HTTPReceiverUtil.portAvailable = portAvailable;
	}

	public static HTTPReceiverUtil getHttpUtil() {
		return httpUtil;
	}

	public static void setHttpUtil(HTTPReceiverUtil httpUtil) {
		HTTPReceiverUtil.httpUtil = httpUtil;
	}

	public static HashMap<String, HttpConsumer> getConsumerPool() {
		return consumerPool;
	}

	public static void setConsumerPool(HashMap<String, HttpConsumer> consumerPool) {
		HTTPReceiverUtil.consumerPool = consumerPool;
	}
	
}
