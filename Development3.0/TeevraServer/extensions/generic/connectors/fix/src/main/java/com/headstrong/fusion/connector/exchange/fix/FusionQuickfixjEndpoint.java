package com.headstrong.fusion.connector.exchange.fix;

import org.apache.camel.Component;
import org.apache.camel.component.quickfixj.QuickfixjEndpoint;
import org.apache.camel.component.quickfixj.QuickfixjEngine;

public class FusionQuickfixjEndpoint extends QuickfixjEndpoint {

	public FusionQuickfixjEndpoint(QuickfixjEngine engine, String uri,
			Component component) {
		super(engine, uri, component);
	}

	private final Object engineInstancesLock = new Object();

	@Override
	protected void doStart() throws Exception {
		super.doStart();
		synchronized (engineInstancesLock) {
			if (!getEngine().isStarted()) {
				getEngine().start();
			}

		}
	}
	
	@Override
	protected void doStop() throws Exception {
		super.doStop();
		synchronized (engineInstancesLock) {
			if (getEngine().isStarted()) {
				getEngine().stop();
			}

		}
	}
}
