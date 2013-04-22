package com.headstrong.fusion.connector.processLauncher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.headstrong.fusion.commons.component.FusionComponentFactory;

/**
 * Process Launcher Component Activator. Takes care of Starting the Process
 * launcher bundle and also adds an instance of the ProcessLauncherComponent to
 * the Fusion Components Map.
 * 
 * @author PBansal
 */

public class ProcessLauncherActivator implements BundleActivator {
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(ProcessLauncherActivator.class);

	/**
	 * Method to launch the Processlauncher bundle at Fusion Server Startup
	 */

	public void start(BundleContext arg0) throws Exception {
		logger.info("Starting Bundle processlauncher...");
		ProcessLauncherComponent plComponent = new ProcessLauncherComponent();
		FusionComponentFactory.addComponent(ProcessLauncherComponent.class
				.getSimpleName(), plComponent);
		logger.info("Added the Process Launcher component.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */

	/**
	 * Terminates / De-activates the Processlauncher bundle at the Shutdown of
	 * the Fusion Server
	 */

	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		logger
				.info("ProcessActivator.stop(). Removing Process Launcher Component.");
		FusionComponentFactory.removeComponent(ProcessLauncherComponent.class
				.getSimpleName());
	}

}
