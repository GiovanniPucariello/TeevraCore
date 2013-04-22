package com.headstrong.fusion.server.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;

/**
 * @author mali
 *
 */
public class FileWebObject extends AbstractWebObject {

	private static Logger logger = LoggerFactory.getLogger(FileWebObject.class);
	
	@SuppressWarnings("unchecked")
	private HashMap virtualHash = null;
	private byte[] buf = new byte[2048];
	
	/* (non-Javadoc)
	 * @see com.headstrong.fusion.server.http.AbstractWebObject#handleRequest(com.headstrong.fusion.server.http.HTTPRequestInterface, com.headstrong.fusion.server.http.HTTPResponseInterface)
	 */
	@Override
	public void handleRequest(HTTPRequestInterface httpRequest,
			HTTPResponseInterface httpResponse) throws IOException {

		PrintStream printStream = httpResponse.getPrintStream();

		String fname = httpRequest.getURL();
		if (fname.charAt(0)=='/') {
			fname = fname.substring(1);
		}
		File target = null;
		File root = null;

		String virtualTest = "";
		String lastPart = "";
		int ndx = fname.indexOf("/");
		if (ndx > -1) {
			virtualTest = fname.substring(0, ndx);
			lastPart = fname.substring(ndx);
		}

		if ( virtualHash.containsKey(virtualTest) )  {
			root = new File(virtualHash.get(virtualTest).toString());
			target = new File(root, lastPart);
		}
		else {
			root = new File(virtualHash.get("/").toString());
			target = new File(root, fname);
		}
		if (target.isDirectory()) {
			target = null;
		}
		//security constraints added, BWY 1.29.03
		boolean securityPass=true;
		if (target!=null) {
			String wd = new File("").getCanonicalPath();
			String tg = target.getCanonicalPath();
			if (target.getName().equals("users.xml") ||
			         target.getName().equals("tediserverconf.xml") ||
			         target.getName().equals("tedilk.dat") ||
			         target.getName().equals("tedikeystore") ||
			         target.getName().equals("library.xml")) securityPass=false;
			if (!securityPass) {
				logger.info("Security alert! forbidden file requested: "+tg);
			}
		}
		if (target==null || !target.exists() || !securityPass) {
			httpResponse.setResponseCode(HTTPResponse.HTTP_NOT_FOUND);
			httpResponse.writeHeaders();
			printStream.println("404 Not Found: The requested resource was not found");
		}
		else {
			httpResponse.setResponseCode(HTTPResponse.HTTP_OK);
			httpResponse.setHeaderValue(FusionConstants.CONTENT_LENGTH, new Long(target.length()));
			httpResponse.setHeaderValue(FusionConstants.CONTENT_TYPE, getContentType(target.getName()));
			httpResponse.writeHeaders();
			sendFile(target, printStream);
		}
		printStream.flush();
		printStream.close();
	}

	@Override
	public void init() throws Exception {
		virtualHash = HTTPConfig.getVirtualHash();
	}
	
	/**
	 * @param targ
	 * @param ps
	 * @throws IOException
	 */
	private void sendFile(File targ, PrintStream ps) throws IOException {
		InputStream is = null;
		is = new FileInputStream(targ.getAbsolutePath());
		try {
			int n;
			while ((n = is.read(buf)) > 0) {
				ps.write(buf, 0, n);
			}
		}
		finally {
			is.close();
		}
	}


	/**
	 * improve listing later, or consider using a real web server
	 * @param filename
	 * @return
	 */
	private String getContentType(String filename) {
		String ext = filename.substring(filename.lastIndexOf('.')+1);
		if (ext.equalsIgnoreCase("htm"))       return "text/html";
		else if (ext.equalsIgnoreCase("html")) return "text/html";
		else if (ext.equalsIgnoreCase("gif"))  return "image/gif";
		else if (ext.equalsIgnoreCase("jpg"))  return "image/jpeg";
		else return "text/plain";

	}

}
