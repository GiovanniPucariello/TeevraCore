package com.headstrong.fusion.connector.http.receiver;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.component.FusionComponentFactory;
import com.headstrong.fusion.server.http.HTTPConfig;
import com.headstrong.fusion.server.http.HTTPSecureListener;
import com.headstrong.fusion.server.http.HTTPServer;
import com.headstrong.fusion.server.http.HTTPStandardListener;
import com.headstrong.fusion.server.http.Worker;

/**
 * @author mali
 *
 */
public class HTTPReceiverActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		HttpReceiverComponent component = new HttpReceiverComponent(context);
		FusionComponentFactory.addComponent(HttpReceiverComponent.class.getSimpleName(), component);
				
		if(Boolean.parseBoolean(context.getProperty("fusion.server.http.enable"))== false){
			throw new Exception(HTTPConfig.standardPort + "HTTP service not enabled");
		}	
		HTTPConfig.standardPort = Integer.parseInt(context.getProperty("fusion.server.http.port"));
		HTTPConfig.securePort = Integer.parseInt(context.getProperty("fusion.server.https.port"));
		HTTPConfig.threadPoolSize = Integer.parseInt(context.getProperty("fusion.server.http.threadPoolSize"));
		new HTTPServer();
		HTTPReceiverUtil.waitForHTTPServiceToStart();
		if(HTTPReceiverUtil.isPortAvailable()== false){
			HTTPReceiverUtil.setHttpServiceStarted(false);
			HTTPReceiverUtil.setPortAvailable(true);
			throw new Exception(HTTPConfig.standardPort + " Port already in use.");
		}
	}

	@Override
	public void stop(BundleContext arg0) throws Exception {
		FusionComponentFactory.removeComponent(HttpReceiverComponent.class.getSimpleName());
		Worker.run=false;
		Worker.shutDownWorker();
		HTTPServer.threads.clear();
		HTTPStandardListener.run = false;
		HTTPStandardListener.ss.close();
		HTTPSecureListener.run = false;		
	}
	
}
