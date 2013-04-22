package com.headstrong.fusion.server.http;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;

/**
 * HTTP/S request handler
 * 
 * @author mali
 *
 */
public class Worker extends Thread {

	private static Logger logger = LoggerFactory.getLogger(Worker.class);
	public static boolean run = true;
	private Socket socket;

	Worker() {
		socket = null;
		run = true;
	}
	
	@SuppressWarnings("unchecked")
	public static void shutDownWorker(){
		ArrayList w = HTTPServer.threads;
		for(int i=0;i<w.size();i++){
			Worker worker = (Worker)w.get(i);
			worker.setSocket(null);
		}
	}
	
	public void setSocket(Socket s) {
		this.socket = s;
		synchronized (this) {
			notify();
		}
	}

	@Override
	public void run() {

		while (run) {
			if (socket == null) {
				synchronized (this) {
					try {
						wait();
					} catch (InterruptedException e) {
						continue;
					}
				}
			}
			try {
				if (run) {
					handleClient();
				}

			} catch (IOException e) {
				logger.error("error while handling the client request");
			}
			socket = null;
		}
		logger.debug("Stopping the HTTP Standard listener ");
	}

	/**
	 * @throws IOException
	 */
	void handleClient() throws IOException {
		HTTPInputStream inputStream = new HTTPInputStream(socket
				.getInputStream(), socket.getInetAddress());
		HTTPRequest request = inputStream.getRequest();
		HTTPResponse response = new HTTPResponse();
		PrintStream ps = new PrintStream(socket.getOutputStream());
		response.setPrintStream(ps);
		socket.setSoTimeout(HTTPServer.timeout);
		socket.setTcpNoDelay(true);

		String url = "*";
		try {
			if (!request.getRequestType().equals(HTTPRequest.UNSUPPORTED)) {
				if (request.getRequestType().equals(HTTPRequest.POST))
					url = request.getURL();
				// log incoming request
				if (logger.isDebugEnabled()) {
					logger
							.debug("HTTP request from "
									+ request.getHeaderValue("hostname") + ": "
									+ request.getRequestType() + " "
									+ request.getURL());
				}
				AbstractWebObject awo = HTTPConfig.getWebObjectClass(url);
				awo.handleRequest(request, response);
				awo = null;
			}
			// guess what, you're unsupported
			else {
				logger.debug("Unsupported HTTP request type: "
						+ request.getRequestType());
			}
		}// end try
		catch (Exception e) {
			logger.error("An error occured while processing " + url + ": "
					+ e.getMessage(), e);
			if (!response.isHeadersWritten()) {
				String s = "A server error has occured";
				response.setResponseCode(HTTPResponse.HTTP_SERVER_ERROR);
				response.setHeaderValue(FusionConstants.CONTENT_LENGTH, ""
						+ s.length());
				response.writeHeaders();
				ps.print(s);
			}
			ps.flush();
			ps.close();
		} finally {
			socket.close();
			inputStream.close();
			inputStream = null;
			socket = null;
			request = null;
			response = null;
			ps = null;
		}

	}
}

/**
 * Convenience class for reading client requests
 * 
 */
class HTTPInputStream extends FilterInputStream {
	InputStream inStream = null;
	int byteCount = 0;
	int readLen = -1;
	String hostname = "";

	public HTTPInputStream(InputStream in, InetAddress inetAddy) {
		super(in);
		inStream = in;
		hostname = inetAddy.getHostName();
	}

	// Get a line
	public String readLine() throws IOException {
		StringBuffer result = new StringBuffer();
		boolean finished = false;
		do {
			int ch = -1;
			ch = read();
			byteCount++;
			if (ch == -1)
				return result.toString();
			else if (ch == 13)
				continue;
			else if (ch == 10)
				return result.toString();
			else
				result.append((char) ch);
			if (readLen != -1 && byteCount == readLen)
				return result.toString();

		} while (!finished);
		return result.toString();
	}

	/**
	 * Get the whole request
	 * 
	 * @return
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public HTTPRequest getRequest() throws IOException {
		String line = null;
		StringBuffer body = new StringBuffer("");
		boolean first = true;
		String reqType = readLine();
		HashMap headerHash = new HashMap(20);
		headerHash.put("hostname", hostname);

		while ((line = readLine()) != null) {
			if (line.length() == 0)
				break;
			int ndx = line.indexOf(':');
			if (ndx == -1)
				continue;
			String name = line.substring(0, ndx).trim().toLowerCase();
			String value = line.substring(ndx + 1).trim().toLowerCase();
			headerHash.put(name, value);
		}

		HTTPRequest request = new HTTPRequest(reqType, headerHash);

		String mode = request.getRequestType();
		if (mode.equals(HTTPRequest.POST)) {
			String contentType = (String) headerHash
					.get(FusionConstants.CONTENT_TYPE);
			if (null == contentType) {
				throw new IOException("content-type must be set on request!");
			}
			if (contentType.indexOf("multipart") > -1) {
				String boundary = contentType.substring(contentType
						.indexOf("boundary=") + 9);
				while ((line = readLine()) != null) {
					if (line.length() == 0)
						break;
					int ndx = line.indexOf(':');
					if (ndx == -1)
						continue;
					String name = line.substring(0, ndx).trim().toLowerCase();
					String value = line.substring(ndx + 1).trim().toLowerCase();
					headerHash.put(name, value);
				}

				while ((line = readLine()) != null) {
					if (line.indexOf(boundary) > -1)
						break;
					if (first)
						first = false;
					else
						body.append("\r\n");
					body.append(line);
				}
			} else {
				byteCount = 0;
				String length = (String) request
						.getHeaderValue(FusionConstants.CONTENT_LENGTH);
				if (length == null)
					throw new IOException(
							"content-length must be set on request!");
				readLen = Integer.parseInt(length);
				 while (byteCount<readLen) {
				 line = readLine();
				 if (first) first=false;
				 else body.append("\r\n");
				 body.append(line);
				 }
			}
		}
		request.setBody(body.toString());
		return request;
	}
}
