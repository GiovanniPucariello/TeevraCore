package com.headstrong.fusion.connector.processLauncher;

import java.io.IOException;
import java.io.*;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.commons.component.FusionServiceSupport;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.exception.InitializationException;

/**
 * ProcessLauncher producer sends in messages to the component
 * 
 * @author PBansal
 * 
 */

public class ProcessLauncherProducer implements FusionProducer<MessageExchange> {
	private static Logger logger = LoggerFactory
			.getLogger(ProcessLauncherProducer.class);
	private static final String EXIT_VALUE = "ExitValue";

	// Keeping an instance for any future enhancements to be made on the Endpoint
	private ProcessLauncherEndpoint processLauncherEndpoint;

	private ProcessLauncherConfiguration config;

	/**
	 * Process Launcher Producer Configuration
	 */
	private boolean waitFor;

	private String appPath;

	private FusionServiceSupport serviceSupport;

	public ProcessLauncherProducer(
			ProcessLauncherEndpoint processLauncherEndpoint) {
		this.processLauncherEndpoint = processLauncherEndpoint;
		this.config = processLauncherEndpoint.getProcessBinding();
		this.waitFor = config.isWaitFor();
		this.appPath = config.getApplicationPath();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionProducer#process(com.headstrong.fusion.commons.MessageExchange)
	 */
	public void process(MessageExchange messageExchange) throws Exception {
		/**
		 * Getting the input message from the exchange
		 */
		String inputMessage = messageExchange.getIn().getBody().toString();

		if (logger.isDebugEnabled()) {
			logger.debug("Input message received for post-processing. "
					+ inputMessage);
		}

		// Ensuring that the Application path ends with an extension

		if (!(StringUtils.countMatches(this.getAppPath(), ".") > 0)) {
			throw new InitializationException(
					"Application extension (.exe / .bat) not specified.");
		}
		
		// Replacing all the file separators in the appPath to the system-dependent separator
		this.setAppPath((appPath.replace('/', File.separatorChar)));
		
		// setting the exitValue to a default value
		int exitValue = -1;

		if (inputMessage != null) {
			try {

				// Launching the executable application file

				Process p = Runtime.getRuntime().exec(this.getAppPath());

				// Provides a configurable option for the control to wait for or
				// return from the Application Execution

				if (this.isWaitFor()) {

					// Does not return the control until that particular running
					// instance of the application has been terminated (which is
					// mostly an automatic process)

					exitValue = p.waitFor();

				}
				// setting the exit value on the message header for test
				// case validation

				messageExchange.getIn().setHeader(EXIT_VALUE, exitValue);
			} catch (IOException e) {
				String errStr = "Error while launching the process. Invalid Application Path";
				logger.error(errStr, e);
				throw new FusionException(errStr);
			}
		}
	}

	public void start() throws Exception {
	}

	public void stop() throws Exception {
	}

	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {
		this.serviceSupport = serviceSupport;

	}

	public boolean isWaitFor() {
		return waitFor;
	}

	public void setWaitFor(boolean waitFor) {
		this.waitFor = waitFor;
	}

	public String getAppPath() {
		return appPath;
	}

	public void setAppPath(String appPath) {
		this.appPath = appPath;
	}
}
