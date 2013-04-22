/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright @ 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: EndPointModelerFactory.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 18, 2008 
 */

package com.headstrong.fusion.messaging.model.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.component.FusionComponentFactory;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.config.CBREndPointConfig;
import com.headstrong.fusion.config.MultiCastRouterConfig;
import com.headstrong.fusion.config.SavepointConfig;
import com.headstrong.fusion.config.SplitterConfig;
import com.headstrong.fusion.messaging.model.endpoint.binding.DbBindingEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.binding.FileBindingEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.binding.FtpBindingEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.binding.FtpsBindingEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.binding.FusionBindingEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.binding.HttpBindingEndpointModeler;
import com.headstrong.fusion.messaging.model.endpoint.binding.HttpsBindingEndpointModeler;
import com.headstrong.fusion.messaging.model.endpoint.binding.JmsBindingEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.binding.MockEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.binding.SedaEndPointModeler;
//<<<<<<< .mine
import com.headstrong.fusion.messaging.model.endpoint.binding.MailBindingEndPointModeler;
//=======
import com.headstrong.fusion.messaging.model.endpoint.binding.SftpBindingEndpointModeler;
//>>>>>>> .r17058
import com.headstrong.fusion.messaging.model.endpoint.binding.SocketBindingEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.error.ErrorRouteModeler;
import com.headstrong.fusion.messaging.model.endpoint.processor.MediationEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.routing.CBREndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.routing.MultiCastEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.routing.SavePointEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.routing.SplitterEndPointModeler;

/**
 * EndPointModelerFactory creates a new EndPointModeler based on the type
 * provided.
 */
public class EndPointModelerFactory {
	private static Logger logger = LoggerFactory
			.getLogger(EndPointModelerFactory.class);

	private static Map<String, String> endPointMap = new HashMap<String, String>();
	private static Map<String, EndPointModeler> endPointModelerMap = new HashMap<String, EndPointModeler>();



	public static enum ENDPOINT {
		MEDIATION {
			@Override
			public String toString() {
				return "MEDIATOR";
			}
		},
		JMS {
			@Override
			public String toString() {
				return "JMS";
			}
		},
		MOCK {
			@Override
			public String toString() {
				return "MOCK";
			}
		},
		FILE {
			@Override
			public String toString() {
				return "FILE";
			}
		},
		DATABASE {
			@Override
			public String toString() {
				return "DATABASE";
			}
		},
		SOCKET {
			@Override
			public String toString() {
				return "SOCKET";
			}
		},
		CBR {
			@Override
			public String toString() {
				return CBREndPointConfig.class.getName();
			}
		},
		MULTICAST{
			@Override
			public String toString() {
				return MultiCastRouterConfig.class.getName();
			}
		},
		SAVEPOINT {
			@Override
			public String toString() {
				return SavepointConfig.class.getName();
			}
		},
		SPLITTER {
			@Override
			public String toString() {
				return SplitterConfig.class.getName();
			}
		},
		FTP {
			@Override
			public String toString() {
				return "FTP";
			}
		},
		MAIL{
			@Override
			public String toString(){
				return "MAIL";
			}
		},
//		EURONEXT {
//			@Override
//			public String toString() {
//				return "EURONEXT";
//			}
//		},
//		LIFFE {
//			@Override
//			public String toString() {
//				return "LIFFE";
//			}
//		},
/*		EUREX {
			@Override
			public String toString() {
				return "EUREX";
			}
		},*/
		FUSION {
			@Override
			public String toString() {
				return "FUSION";
			}
		},
		ERROR {
			@Override
			public String toString() {
				return "ERROR";
			}
		},
		SEDA {
			@Override
			public String toString() {
				return "SEDA";
			}
		},
		SFTP {
			@Override
			public String toString() {
				return "SFTP";
			}
		},
		FTPS {
			@Override
			public String toString() {
				return "FTPS";
			}
		},
		HTTP {
			@Override
			public String toString() {
				return "HTTP";
			}
		},
		HTTPS {
			@Override
			public String toString() {
				return "HTTPS";
			}
		}

	}

	static {
		EndPointModelerFactory.init();
	}

	/**
	 * Initialize the endpoint factory.
	 * 
	 */
	private static void init() {
		endPointMap.put(ENDPOINT.MEDIATION.toString(),
				MediationEndPointModeler.class.getName());
		endPointMap.put(ENDPOINT.FILE.toString(),
				FileBindingEndPointModeler.class.getName());
		endPointMap.put(ENDPOINT.JMS.toString(),
				JmsBindingEndPointModeler.class.getName());
		endPointMap.put(ENDPOINT.DATABASE.toString(),
				DbBindingEndPointModeler.class.getName());
		endPointMap.put(ENDPOINT.CBR.toString(), CBREndPointModeler.class
				.getName());
		endPointMap.put(ENDPOINT.SAVEPOINT.toString(),
				SavePointEndPointModeler.class.getName());
		endPointMap.put(ENDPOINT.SPLITTER.toString(),
				SplitterEndPointModeler.class.getName());
		endPointMap.put(ENDPOINT.FTP.toString(),
				FtpBindingEndPointModeler.class.getName());
//		endPointMap.put(ENDPOINT.EURONEXT.toString(),
//				EuronextBindingEndPointModeler.class.getName());
/*		endPointMap.put(ENDPOINT.EUREX.toString(),
				EurexBindingEndPointModeler.class.getName());
*/		endPointMap.put(ENDPOINT.SOCKET.toString(),
				SocketBindingEndPointModeler.class.getName());
		endPointMap.put(ENDPOINT.FUSION.toString(),
				FusionBindingEndPointModeler.class.getName());
		endPointMap.put(ENDPOINT.ERROR.toString(), ErrorRouteModeler.class
				.getName());
		endPointMap.put(ENDPOINT.MOCK.toString(), MockEndPointModeler.class
				.getName());
		endPointMap.put(ENDPOINT.SEDA.toString(), SedaEndPointModeler.class
				.getName());
		endPointMap.put(ENDPOINT.MULTICAST.toString(), MultiCastEndPointModeler.class
				.getName());
//<<<<<<< .mine
		endPointMap.put(ENDPOINT.MAIL.toString(), MailBindingEndPointModeler.class
				.getName());
//=======
		endPointMap.put(ENDPOINT.FTPS.toString(),
				FtpsBindingEndPointModeler.class.getName());
		endPointMap.put(ENDPOINT.SFTP.toString(),
				SftpBindingEndpointModeler.class.getName());
		endPointMap.put(ENDPOINT.HTTPS.toString(),
				HttpsBindingEndpointModeler.class.getName());
		endPointMap.put(ENDPOINT.HTTP.toString(),
				HttpBindingEndpointModeler.class.getName());
//>>>>>>> .r17058
	}

	/**
	 * Creates a New {@link EndPointModeler} based on type provided. throws
	 * {@link InitializationException} in case the type is not registered with
	 * the factory.
	 * 
	 * @param type
	 * @return {@link EndPointModeler}
	 * @throws InitializationException
	 */
	public static EndPointModeler getEndPoint(String type)
			throws InitializationException {
		EndPointModeler endPointModeler = null;
		logger.debug("Getting endpoint :" + type);
		logger.debug("Endpoint is :" + endPointMap.get(type));

		if (endPointModelerMap.containsKey(type)) {

			return endPointModelerMap.get(type);

			}

		
		if (!endPointMap.containsKey(type)
				&& FusionComponentFactory.getComponent(type) != null) {
			type = ENDPOINT.FUSION.toString();
		}

		try {
			endPointModeler = (EndPointModeler) Class.forName(
					endPointMap.get(type)).newInstance();
		} catch (Exception e) {
			logger.error("No endpoint configured for given type , "
					+ e.getMessage());
			throw new InitializationException(
					"No endpoint configured for given type", e);
		}

		return endPointModeler;
	}
	public static void addEndPointModeler (String key, EndPointModeler value) {

		endPointModelerMap.put(key, value);

		}

	
}
