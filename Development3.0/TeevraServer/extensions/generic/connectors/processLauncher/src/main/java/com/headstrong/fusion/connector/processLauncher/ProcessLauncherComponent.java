package com.headstrong.fusion.connector.processLauncher;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionComponent;
import com.headstrong.fusion.commons.component.FusionEndpoint;

/**
 * ProcessLauncherComponent Component. Creates and returns an instance of the
 * ProcessLauncherEndpoint that performs post-processing. Launches an External
 * Executable Application )
 * 
 * @author PBansal
 */
public class ProcessLauncherComponent implements FusionComponent {

	public FusionEndpoint<MessageExchange> createEndpoint(
			BindingConfig bindingConfig) throws Exception {
		ProcessLauncherEndpoint processLauncherEndpoint = new ProcessLauncherEndpoint(
				bindingConfig.getProperties());
		return processLauncherEndpoint;
	}

}
