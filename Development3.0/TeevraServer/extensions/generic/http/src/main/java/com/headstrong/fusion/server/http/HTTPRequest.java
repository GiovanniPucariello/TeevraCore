package com.headstrong.fusion.server.http;

import java.util.HashMap;

/**
 * @author mali
 *
 */
public class HTTPRequest implements HTTPRequestInterface {
	
	@SuppressWarnings("unchecked")
	private HashMap headerHash = null;
	private String requestType = null;
	private String url = null;
	private String body = null;
	
	/**
	 * @param reqType
	 * @param header
	 */
	@SuppressWarnings("unchecked")
	public HTTPRequest(String reqType, HashMap header) {
		this.headerHash = header;
		String temp = reqType.trim().toUpperCase();
		if (temp.startsWith("GET")) requestType = GET;
		else if (temp.startsWith("POST")) requestType = POST;
		else requestType = UNSUPPORTED;

		temp = reqType.trim();
		int ndx = reqType.indexOf(' ');
		if (ndx>-1) url = temp.substring(ndx, temp.indexOf(' ', ndx+1)).trim();
		else url = "";
	}
	
	@Override
	public String getBody() {
		return body;
	}

	@Override
	public String getHeaderValue(String key) {
		return (String)headerHash.get(key);
	}

	@SuppressWarnings("unchecked")
	@Override
	public HashMap getHeaders() {
		return headerHash;
	}

	@Override
	public String getRequestType() {
		return requestType;
	}

	@Override
	public String getURL() {
		return url;
	}
	
	public void setBody(String body) {
		this.body = body;
	}

}
