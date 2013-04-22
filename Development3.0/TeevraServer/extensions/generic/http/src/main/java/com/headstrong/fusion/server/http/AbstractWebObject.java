package com.headstrong.fusion.server.http;

import java.io.IOException;
import java.util.HashMap;

/**
 * @author mali
 *
 */
@SuppressWarnings("unchecked")
public abstract class AbstractWebObject {
	
	private HashMap initHash = null;

	void setInitParams(HashMap hash) {
		this.initHash = hash;
	}

	/**
	 * @param param
	 * @return
	 */
	protected String getInitParam(String param) {
		return (String)initHash.get(param);
	}


	/**
	 * @param httpRequest
	 * @param httpResponse
	 * @throws IOException
	 */
	public abstract void  handleRequest(HTTPRequestInterface httpRequest,
													HTTPResponseInterface httpResponse)	throws IOException;

	/**
	 * @throws Exception
	 */
	public abstract void init() throws Exception;
}
