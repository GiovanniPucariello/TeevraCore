package com.headstrong.fusion.server.http;

import java.util.HashMap;

/**
 * @author mali
 *
 */
@SuppressWarnings("unchecked")
public interface HTTPRequestInterface {

	public static final String POST = "POST";
	public static final String GET  = "GET";
	public static final String UNSUPPORTED  = "UNSUPPORTED";

	public String getHeaderValue(String key);
	public String getRequestType();
	public String getBody();
	public String getURL();
	public HashMap getHeaders();
}
