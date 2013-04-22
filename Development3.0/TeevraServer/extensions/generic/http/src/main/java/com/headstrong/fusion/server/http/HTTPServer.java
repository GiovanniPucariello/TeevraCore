package com.headstrong.fusion.server.http;

import java.util.ArrayList;

/**
 * @author mali
 *
 */
@SuppressWarnings("unchecked")
public class HTTPServer extends Thread {

	public static ArrayList threads = new ArrayList();
	//timeout on client connections
	protected static int timeout = 5000;
	
	public HTTPServer(){
			this.setDaemon(true);
			this.setName("HTTP Server");
			this.start();
	}
	
	@Override
	/**
	*  This is the daemon process that waits for HTTP connections
	*/
	public void run() {
		// start worker threads
		for (int i = 0; i < HTTPConfig.threadPoolSize; ++i) {
			Worker w = new Worker();
			Thread t = new Thread(w, "worker #"+i);
//			t.setDaemon(true);
			t.start();
			threads.add(w);
		}

		if (HTTPConfig.standardPort!=-1){
			(new HTTPStandardListener()).start();
		}
		if (HTTPConfig.securePort!=-1){
			(new HTTPSecureListener()).start();
		}
	}//end run

}//end class

