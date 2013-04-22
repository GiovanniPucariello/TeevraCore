/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: ProcessDefinitionEnricher.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 20, 2009 
 */

package com.headstrong.fusion.config.manager;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.config.MediatorConfig;
import com.headstrong.fusion.config.OnErrorConfig;
import com.headstrong.fusion.config.ProcessConfigurationModel;

/**
 * Process definition enricher Enriches the process model.
 * 
 */
public class DefaultProcessDefinitionEnricher implements
		ProcessDefinitionEnricher {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.config.manager.ProcessDefinitionEnricher#enrich(com.headstrong.fusion.config.ProcessConfigurationModel)
	 */
	public void enrich(ProcessConfigurationModel model) {
		this.enrichErrorConfiguration(model);
	}

	/**
	 * Enriches the individual components error configurations.
	 * 
	 * @param process
	 *            Process Configuration Model.
	 */
	private void enrichErrorConfiguration(ProcessConfigurationModel model) {
		// FIXME Else loop unnecessarily iterates the error configuration list
		// ..
		// optimize the same.
		if (model.getProcess().getOnErrorConfigList() != null
				&& !model.getProcess().getOnErrorConfigList().isEmpty()) {
			Map<String, OnErrorConfig> errorConfigMap = new HashMap<String, OnErrorConfig>();
			for (OnErrorConfig onErrorConfig : model.getProcess()
					.getOnErrorConfigList()) {
				errorConfigMap.put(onErrorConfig.getExceptionType(),
						onErrorConfig);
			}
			
			for (MediatorConfig mediatorConfig : model.getMediators()) {
				/**
				 * If no Error Configuration is defined copy the 
				 * process level error configuration.
				 */
				if (mediatorConfig.getErrorConfigList() == null
						|| mediatorConfig.getErrorConfigList().isEmpty()) {
					mediatorConfig.setErrorConfigList(model.getProcess()
							.getOnErrorConfigList());
				} else {
					/**
					 * Check individual Exception type to copy the 
					 * configuration.
					 */
					for (Entry<String, OnErrorConfig> onErrorConfigEntry : errorConfigMap
							.entrySet()) {
						boolean present = false;
						for (OnErrorConfig onErrorConfig : mediatorConfig
								.getErrorConfigList()) {
							if (onErrorConfig.getExceptionType().equals(
									onErrorConfigEntry.getKey())) {
								present = true;
								// If present check if reporter is present if
								// not add.
								if (onErrorConfig.getErrorReporters() == null
										|| onErrorConfig.getErrorReporters()
												.isEmpty()) {
									onErrorConfig
											.setErrorReporters(onErrorConfigEntry
													.getValue()
													.getErrorReporters());
								}
							}
						}
						if (!present) {
							mediatorConfig.getErrorConfigList().add(
									onErrorConfigEntry.getValue());
						}
					}
				}
			}
			
			// Update the connector config.
			for ( ConnectorConfig connectorConfig : model.getConnectors()) {
				/**
				 * If no Error Configuration is defined copy the 
				 * process level error configuration.
				 */
				if (connectorConfig.getErrorConfigList() == null
						|| connectorConfig.getErrorConfigList().isEmpty()) {
					connectorConfig.setErrorConfigList(model.getProcess()
							.getOnErrorConfigList());
				} else {
					/**
					 * Check individual Exception type to copy the 
					 * configuration.
					 */
					for (Entry<String, OnErrorConfig> onErrorConfigEntry : errorConfigMap
							.entrySet()) {
						boolean present = false;
						for (OnErrorConfig onErrorConfig : connectorConfig
								.getErrorConfigList()) {
							if (onErrorConfig.getExceptionType().equals(
									onErrorConfigEntry.getKey())) {
								present = true;
								// If present check if reporter is present if
								// not add.
								if (onErrorConfig.getErrorReporters() == null
										|| onErrorConfig.getErrorReporters()
												.isEmpty()) {
									onErrorConfig
											.setErrorReporters(onErrorConfigEntry
													.getValue()
													.getErrorReporters());
								}
							}
						}
						if (!present) {
							connectorConfig.getErrorConfigList().add(
									onErrorConfigEntry.getValue());
						}
					}
				}
			}
		}
	}
}
