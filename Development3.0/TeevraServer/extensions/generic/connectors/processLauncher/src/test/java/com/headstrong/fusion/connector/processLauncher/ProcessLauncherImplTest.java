package com.headstrong.fusion.connector.processLauncher;

import junit.framework.Assert;

import org.junit.Test;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;


/**
 * Test case for verifying the Process Launcher Functionality that launches an
 * external executable (.exe) file at the reception of a message from the Camel
 * Message Exchange.
 * 
 * @author PBansal
 * 
 */
public class ProcessLauncherImplTest {

	private String inputMessage = null;
	/**
	 * Exit Value will be asserted against the exit value returned by the test
	 * case in order to verify the test case validity.
	 */
	private static final String EXIT_VALUE = "ExitValue";

	@Test
	public void testProcessLauncher() throws Exception {
		// Dummy input message
		inputMessage = "abc,def,1234656n,formating445";
		MessageExchange exchange = getMockMessageExchange();
		// setting a dummy input message to the mock exchange
		exchange.getIn().setBody(inputMessage);
		// assigning a mock configuration to the Process Launcher Endpoint
		ProcessLauncherConfiguration config = new ProcessLauncherConfiguration();
		config.setWaitFor(true);
		String appPath = System.getProperty("user.dir")
				+ "\\src\\test\\resources\\Application\\testApplication.exe";
		config.setApplicationPath(appPath);
		ProcessLauncherEndpoint endpoint = new ProcessLauncherEndpoint(config);
		ProcessLauncherProducer launcher = new ProcessLauncherProducer(endpoint);
		// Invoking the process method of the Process Launcher with a valid
		// mock configuration
		launcher.process(exchange);
		// Asserting the return value of the process to validate the Test
		// case
		Assert.assertEquals(exchange.getIn().getHeader(EXIT_VALUE), 0);
	}

	/**
	 * @return Creating a mock exchange
	 */
	private MessageExchange getMockMessageExchange() {
		/**
		 * Creating a Normalized message for dumping into the Mock Exchange
		 */
		NormalizedMessage normalizedMessage = new ServiceNormalizedMessage();
		normalizedMessage.setBody(inputMessage);
		/**
		 * Creating and Returning an instance of the Mock Message Exchange with
		 * a dummy Input message fed in
		 */
		MessageExchange messageExchange = new ServiceMessageExchange();
		messageExchange.setIn(normalizedMessage);

		return messageExchange;
	}
}
