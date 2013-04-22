package com.hs.connection;

/**
 * Thread to Check connection periodically for some finite time.
 * 
 * @author NBagchi
 */
class KeepAlive implements Runnable {
	// private static final long RUN_MILLISEC =
	// Long.parseLong(CheckJMXConnection.properties.getProperty("runTime"));
	private static final long SLEEP_MILLISEC = Long
			.parseLong(CheckJMXConnection.properties
					.getProperty("pingInterval"));
	private static final int MAX_RETRY = Integer
			.parseInt(CheckJMXConnection.properties.getProperty("maxTry"));

	private JMXConnectionClient connection;

	public KeepAlive(String url, String user, String password) {
		this.connection = new JMXConnectionClient(url, user, password);
		this.connection.configureConnection();
	}

	@Override
	public void run() {
		// long startTime = System.currentTimeMillis();

		while (true) {

			try {

				// If connection is not alive, try to establish connection
				// for a max number of time and keep logging the status.
				if (!connection.isAlive()) {

					int count = 0;
					while (count <= MAX_RETRY) {

						try {
							connection.connect();
							connection
									.logConnectionStatus("Connection Successful\n");
							break; // connected successfully
						} catch (Exception e) {
							connection
									.logConnectionStatus("Connection Failure\n");
							count++;
						}
					}
				}

				if (connection.isAlive()) {
					
					System.out.println("===========Information from Server=========");
					connection.pingRemoteMember();
					Thread.sleep(SLEEP_MILLISEC);
				}

			} catch (InterruptedException e) {
				// Exception at sleep so not a problem with connection
				// establishment. No need to log.
				e.printStackTrace();
			}

			/*
			 * long endTime = System.currentTimeMillis(); if (endTime -
			 * startTime >= RUN_MILLISEC) break;
			 */
		}
	}

}
