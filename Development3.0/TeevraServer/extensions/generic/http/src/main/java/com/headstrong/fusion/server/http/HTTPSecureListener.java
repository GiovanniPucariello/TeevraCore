package com.headstrong.fusion.server.http;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.channels.IllegalBlockingModeException;
import java.security.KeyStore;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




/**
 * Secured listener for https requests
 *
 * @author mali
 *
 */
public class HTTPSecureListener extends Thread {

	public static boolean run = true;
	private static Logger logger = LoggerFactory.getLogger(HTTPSecureListener.class);
	private static final String LIB_DIR = "lib.dir";
	private String KEYSTORE = "teevrakeystore";
	private char[] KEYSTOREPW = "windows".toCharArray();
	private char[] KEYPW = "windows".toCharArray();

	public HTTPSecureListener() {
/*		logger = new Logger();
		logger.setLogLevel(Logger.LOG_INFO);*/
		this.setDaemon(true);
		run=true;
		this.setName("HTTPS listener");
	}

	/**
	 * This is the daemon process that waits for HTTPS connections
	 */
	public void run() {
		
		SSLServerSocket ss = null;
		String bind = ""; 
		try{
			if(System.getProperty(LIB_DIR)!= null && !System.getProperty(LIB_DIR).equals("")){
				KEYSTORE  = System.getProperty(LIB_DIR)+"/"+KEYSTORE;
			}
			if( (new File(KEYSTORE)).exists() ){
				System.getProperty("user.dir");
				KeyStore keystore = KeyStore.getInstance("JKS");
				keystore.load(new FileInputStream(KEYSTORE), KEYSTOREPW);
				KeyManagerFactory keyManager = KeyManagerFactory.getInstance("SunX509");
				keyManager.init(keystore, KEYPW);
				SSLContext sslContext = SSLContext.getInstance("SSLv3");
				sslContext.init(keyManager.getKeyManagers(), null, null);
				
				SSLServerSocketFactory ssf = sslContext.getServerSocketFactory();
				
				if(bind.length()>0){
					ss = (SSLServerSocket)ssf.createServerSocket(HTTPConfig.securePort, 0,InetAddress.getByName(bind));
					logger.info("HTTPS service started on port " + HTTPConfig.securePort);
				}
				else{
					ss = (SSLServerSocket)ssf.createServerSocket(HTTPConfig.securePort);
					logger.info("HTTPS service started on port " + HTTPConfig.securePort);
				}
			}
			else{
				logger.info("Keystore file is missing: SSL support disabled.");
				run = false;
			}
		}catch (java.net.BindException be) {
			logger.info("HTTPS service failed to start, port is already in use.");
			run = false;
		}
		catch (Exception e) {
			logger.info("HTTPS service failed to start: " );
			run = false;
		}
		
		while (run) {
			SSLSocket s = null;
			try {
				s = (SSLSocket)ss.accept();
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
				if(HTTPServer.threads.isEmpty()){
					Worker ws = new Worker();					
					new Thread(ws, "Additional worker").start();
					ws.setSocket(s);
				}
				else{
					w = (Worker)HTTPServer.threads.get(0);
					HTTPServer.threads.remove(0);
					w.setSocket(s);
				}
			}
		}
		logger.debug("Stopping the HTTPS Standard listener ");
	}
}
