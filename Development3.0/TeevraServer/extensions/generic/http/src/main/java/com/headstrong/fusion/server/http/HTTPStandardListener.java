package com.headstrong.fusion.server.http;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.IllegalBlockingModeException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.connector.http.receiver.HTTPReceiverUtil;

/**
 * @author mali
 *
 */
public class HTTPStandardListener extends Thread {

	private static Logger logger = LoggerFactory.getLogger(HTTPStandardListener.class);
	public static boolean run = true;
	public static ServerSocket ss = null;

	public HTTPStandardListener() {
//		logger = new Logger();
//		logger.setLogLevel(Logger.LOG_INFO);
//		this.setDaemon(true);
		run= true;
		this.setName("HTTP Listener");
	}

	/**
	 * This is the daemon process that waits for HTTP connections
	 */
	public void run() {		
		ss = null;
		String bind = ""; 
		if (run) {
			try{
			if (bind.length() > 0) {
				ss = new ServerSocket(HTTPConfig.standardPort, 0, InetAddress.getByName(bind));
				logger.info("HTTP service started on port " + bind + ":" + HTTPConfig.standardPort);
				HTTPReceiverUtil.setHttpServiceStarted(true);
			} else {			
				ss = new ServerSocket(HTTPConfig.standardPort);
				logger.info("HTTP service started on port " + HTTPConfig.standardPort);
				HTTPReceiverUtil.setHttpServiceStarted(true);
			}
			}
			catch (java.net.BindException be) {
				run = false;
				HTTPReceiverUtil.setPortAvailable(false);
				logger.info("HTTP service failed to start, port is already in use.", be);				
			}
			catch (Exception e) {
				run = false;
				HTTPReceiverUtil.setPortAvailable(false);
				logger.info("HTTP service failed to start: " + e.getMessage());
			}		
		}
		while (run) {
			Socket s;
			try {
				s = ss.accept();
		
			} catch (IOException e) {
				logger.debug(e.toString());
				continue;
			}catch (SecurityException  e) {
				logger.debug(e.toString());
				continue;
			}catch (IllegalBlockingModeException   e) {
				logger.debug(e.toString());
				continue;
			}

			Worker w = null;
			synchronized (HTTPServer.threads) {
				if (HTTPServer.threads.isEmpty()) {
					Worker ws = new Worker();
					new Thread(ws, "additional worker").start();
					ws.setSocket(s);
					
				} else {
					w = (Worker) HTTPServer.threads.get(0);
					HTTPServer.threads.remove(0);
					w.setSocket(s);
				}
			}
		}
	}
}
