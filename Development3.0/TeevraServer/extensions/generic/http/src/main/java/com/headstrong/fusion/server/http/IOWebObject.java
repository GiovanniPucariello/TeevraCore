package com.headstrong.fusion.server.http;

import java.io.IOException;
import java.io.PrintStream;

import com.headstrong.fusion.commons.FusionConstants;

/**
 * @author mali
 * 
 */
public abstract class IOWebObject extends AbstractWebObject {

	public abstract void handleRequest(HTTPRequestInterface httpRequest,
			HTTPResponseInterface httpResponse) throws IOException;

	public abstract void init() throws Exception;

	/**
	 * Send the response back to the client
	 * 
	 * @param res
	 * @param contentType
	 * @param msg
	 */
	protected void writeResponse(HTTPResponseInterface res, String contentType,	String msg) {
		try {
			res.setHeaderValue(FusionConstants.CONTENT_LENGTH, "" + msg.length());
			res.setHeaderValue(FusionConstants.CONTENT_TYPE, contentType);
			res.writeHeaders();
			PrintStream ps = res.getPrintStream();
			if (contentType.equalsIgnoreCase("text/plain")) {
				Integer returnCode =  (Integer)((HTTPResponse)res).getHeaderHash().get("returnCode");
				String message =  (String)((HTTPResponse)res).getHeaderHash().get("message");
				if(returnCode != null && returnCode.intValue() == 1){
					ps.print(message);
				}else{
				ps.print("Message successfully processed");
				}
			} else {
				ps.print(msg);
			}
			ps.flush();
			ps.close();
		} catch (Exception e) {

		}
	}

}
