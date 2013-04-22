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
 * $Id: SpringFactory.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.teevra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import flex.messaging.FactoryInstance;
import flex.messaging.FlexContext;
import flex.messaging.FlexFactory;
import flex.messaging.config.ConfigMap;
import flex.messaging.services.ServiceException;

public class SpringFactory implements FlexFactory {
	/**
	 * Logger for SpringFactory
	 */
	private static Logger logger = LoggerFactory.getLogger(SpringFactory.class);
	private static final String SOURCE = "source";

	public void initialize(String id, ConfigMap configMap) {
	}

	public FactoryInstance createFactoryInstance(String id, ConfigMap properties) {
		SpringFactoryInstance instance = new SpringFactoryInstance(this, id,
				properties);
		instance.setSource(properties.getPropertyAsString(SOURCE, instance
				.getId()));
		return instance;
	} // end method createFactoryInstance()

	public Object lookup(FactoryInstance inst) {
		SpringFactoryInstance factoryInstance = (SpringFactoryInstance) inst;
		return factoryInstance.lookup();
	}

	static class SpringFactoryInstance extends FactoryInstance {
		SpringFactoryInstance(SpringFactory factory, String id,
				ConfigMap properties) {
			super(factory, id, properties);
		}

		public String toString() {
			return "SpringFactory instance for id=" + getId() + " source="
					+ getSource() + " scope=" + getScope();
		}

		public Object lookup() {
			ApplicationContext appContext = WebApplicationContextUtils
					.getWebApplicationContext(FlexContext.getServletConfig()
							.getServletContext());

			String beanName = getSource();
			try {
				return appContext.getBean(beanName);
			} catch (NoSuchBeanDefinitionException nexc) {
				logger.error("Spring service named '" + beanName
						+ "' does not exist.", nexc);
				ServiceException e = new ServiceException();
				String msg = "Spring service named '" + beanName
						+ "' does not exist.";
				e.setMessage(msg);
				e.setRootCause(nexc);
				e.setDetails(msg);
				e.setCode("Server.Processing");
				throw e;
			} catch (BeansException bexc) {
				logger.error("Unable to create Spring service named '"
						+ beanName + "' ", bexc);
				ServiceException e = new ServiceException();
				String msg = "Unable to create Spring service named '"
						+ beanName + "' ";
				e.setMessage(msg);
				e.setRootCause(bexc);
				e.setDetails(msg);
				e.setCode("Server.Processing");
				throw e;
			}
		}
	}
}