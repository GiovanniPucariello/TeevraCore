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
 * $Id: CommonsConfigParserActivator.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Nov 1, 2008
 */

package com.headstrong.fusion.services.message.commons.config.parser;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.resolver.ServiceAliasManager;
import com.headstrong.fusion.services.message.commons.config.parser.db.DbFieldBindConfigParser;
import com.headstrong.fusion.services.message.commons.config.parser.db.DbFieldBindConfigParserImpl;
import com.headstrong.fusion.services.message.commons.config.parser.db.DbFieldIndexBindConfigParser;
import com.headstrong.fusion.services.message.commons.config.parser.db.DbFieldIndexBindConfigParserImpl;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlConfigParser;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlConfigParserImpl;
import com.headstrong.fusion.services.message.commons.config.parser.td.TdBindConfigParser;
import com.headstrong.fusion.services.message.commons.config.parser.td.TdBindConfigParserImpl;
import com.headstrong.fusion.services.message.commons.config.parser.xml.XmlBindConfigParser;
import com.headstrong.fusion.services.message.commons.config.parser.xml.XmlBindConfigParserImpl;

/**
 * 
 */
public class CommonsConfigParserActivator implements BundleActivator {

	private static final Logger logger = LoggerFactory
			.getLogger(CommonsConfigParserActivator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {

		ServiceAliasManager serviceAliasManager = ServiceAliasManager
				.getInstance();

		logger.info("registering common binding configuration parsers.");

		//*************************************************************************//
		/**
		 * XML Parser/Formatter service configuration Parser.
		 */
		XmlBindConfigParser xmlBindingConfigParser = new XmlBindConfigParserImpl();
		Dictionary<String, String> xmlConfigProps = new Hashtable<String, String>();
		xmlConfigProps.put(Constants.SERVICE_PID,
				XmlBindConfigParser.class.getName());
		xmlConfigProps.put(Constants.SERVICE_DESCRIPTION,
				"XML Binding Configuration Parser");
		xmlConfigProps.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ XmlBindConfigParser.class.getName());

		// register the service
		context.registerService(XmlBindConfigParser.class.getName(),
				xmlBindingConfigParser, xmlConfigProps);
		// register service alias
		serviceAliasManager.registerServiceAlias(
				XmlBindConfigParser.class.getSimpleName(),
				XmlBindConfigParser.class.getName());

		//*************************************************************************//

		//********************************************************************//
		/**
		 * Tag-Delimited parser/formatter service configuration Parser.
		 */
		TdBindConfigParser tdConfigParser = new TdBindConfigParserImpl();

		Dictionary<String, String> tdConfigParserProps = new Hashtable<String, String>();

		tdConfigParserProps.put(Constants.SERVICE_PID,
				TdBindConfigParser.class.getName());
		tdConfigParserProps.put(Constants.SERVICE_DESCRIPTION,
				"Tag-Delimited Binding Configuration Parser");
		tdConfigParserProps.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ TdBindConfigParser.class.getName());

		// Register service
		context.registerService(TdBindConfigParser.class.getName(),
				tdConfigParser, tdConfigParserProps);
		// Register service alias.
		serviceAliasManager.registerServiceAlias(
				TdBindConfigParser.class.getSimpleName(),
				TdBindConfigParser.class.getName());

		//*************************************************************************//

		//************************************************************************//
		/**
		 * Database parser service configuration Parser.
		 */
		DbFieldBindConfigParser dbParserConfigReader = new DbFieldBindConfigParserImpl();

		Dictionary<String, String> dbParserConfigParserProps = new Hashtable<String, String>();

		dbParserConfigParserProps.put(Constants.SERVICE_PID,
				DbFieldBindConfigParser.class.getName());
		dbParserConfigParserProps.put(Constants.SERVICE_DESCRIPTION,
				"DB Field Binding Configuration Parser");
		dbParserConfigParserProps.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ DbFieldBindConfigParser.class.getName());

		// Register service
		context.registerService(DbFieldBindConfigParser.class
				.getName(), dbParserConfigReader, dbParserConfigParserProps);
		// Register service alias.
		serviceAliasManager.registerServiceAlias(
				DbFieldBindConfigParser.class.getSimpleName(),
				DbFieldBindConfigParser.class.getName());

		// ****************************************************************//

		// **************************************************************//
		/**
		 * Database Formatter service configuration parser.
		 * 
		 */
		DbFieldIndexBindConfigParser dbBindingConfigParser = new DbFieldIndexBindConfigParserImpl();

		Dictionary<String, String> dbFormatterConfigParserProps = new Hashtable<String, String>();

		dbFormatterConfigParserProps.put(Constants.SERVICE_PID,
				DbFieldIndexBindConfigParser.class.getName());
		dbFormatterConfigParserProps.put(Constants.SERVICE_DESCRIPTION,
				"DB Field Index Binding Configuration Parser");
		dbFormatterConfigParserProps
				.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ DbFieldIndexBindConfigParser.class.getName());

		// Register service
		context
				.registerService(DbFieldIndexBindConfigParser.class
						.getName(), dbBindingConfigParser,
						dbFormatterConfigParserProps);
		// Register service alias.
		serviceAliasManager.registerServiceAlias(
				DbFieldIndexBindConfigParser.class.getSimpleName(),
				DbFieldIndexBindConfigParser.class.getName());

		// *************************************************************//

		// **************************************************************//
		/**
		 * Fixed Length Parser/Formatter service configuration parser.
		 * 
		 */
		FlConfigParser flConfigParser = new FlConfigParserImpl();

		Dictionary<String, String> flConfigParserProps = new Hashtable<String, String>();

		flConfigParserProps.put(Constants.SERVICE_PID,
				DbFieldIndexBindConfigParser.class.getName());
		flConfigParserProps.put(Constants.SERVICE_DESCRIPTION,
				"Fixed Length Parser/Formatter service configuration parser");
		flConfigParserProps.put(Constants.SERVICE_VENDOR, "Headstrong");
		logger.info("Registering service :"
				+ FlConfigParser.class.getName());

		// Register service
		context.registerService(FlConfigParser.class.getName(),
				flConfigParser, flConfigParserProps);
		// Register service alias.
		serviceAliasManager.registerServiceAlias(
				FlConfigParser.class.getSimpleName(),
				FlConfigParser.class.getName());

		// *************************************************************//

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		logger.info("stopping common binding configuration parsers.");
	}

}
