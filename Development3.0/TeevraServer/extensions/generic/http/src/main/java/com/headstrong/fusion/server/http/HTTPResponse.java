package com.headstrong.fusion.server.http;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.HashMap;

import com.headstrong.fusion.commons.FusionConstants;

/**
 * @author mali
 *
 */
public class HTTPResponse implements HTTPResponseInterface {

	private PrintStream ps = null;
	private int responseCode = HTTP_OK;
	@SuppressWarnings("unchecked")
	private HashMap headerHash = new HashMap();
	private boolean headersWritten = false;
	
	@SuppressWarnings("unchecked")
	public HTTPResponse(){
		headerHash.put("content-type", "text/plain");
	}
	
	@Override
	public PrintStream getPrintStream() {
		return ps;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setHeaderValue(String param, Object value) {
		headerHash.put(param, value);

	}

	@Override
	public void setResponseCode(int respCode) {
		this.responseCode = respCode;
	}

	@Override
	public void writeHeaders() throws IOException {
		headersWritten = true;
		ps.write(new String("HTTP/1.1 " + responseCode + " ").getBytes("Cp1252"));  //not current appending desc to this
		ps.write(EOL);
		ps.write(new String("Server: TEDI HTTP").getBytes("Cp1252"));
		ps.write(EOL);
		ps.write(new String("Date: " + (new Date())).getBytes("Cp1252"));
		ps.write(EOL);
		//implement later if a client needs length set
		ps.write(new String("Content-length: " + headerHash.get(FusionConstants.CONTENT_LENGTH)).getBytes("Cp1252"));
		ps.write(EOL);
		ps.write(new String("Last-Modified: " + new Date()).getBytes("Cp1252"));
		ps.write(EOL);
		ps.write(new String("Content-type: " + headerHash.get(FusionConstants.CONTENT_TYPE)).getBytes("Cp1252"));
		ps.write(EOL);
		ps.write(EOL);
	}
	public void setPrintStream(PrintStream ps) {
		this.ps = ps;
	}

	@SuppressWarnings("unchecked")
	public HashMap getHeaderHash() {
		return headerHash;
	}

	@SuppressWarnings("unchecked")
	public void setHeaderHash(HashMap headerHash) {
		this.headerHash = headerHash;
	}

	public boolean isHeadersWritten() {
		return headersWritten;
	}

	public void setHeadersWritten(boolean headersWritten) {
		this.headersWritten = headersWritten;
	}

	public int getResponseCode() {
		return responseCode;
	}

}
