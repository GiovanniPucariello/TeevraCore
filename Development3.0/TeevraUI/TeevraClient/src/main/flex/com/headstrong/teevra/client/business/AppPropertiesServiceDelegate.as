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
 * $Id: AppPropertiesServiceDelegate.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 03, 2009 
 */
package com.headstrong.teevra.client.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	
	import mx.rpc.IResponder;
	
	/**
	 * AppPropertiesServiceDelegate calls app properties service on the server side
	 * which perform operation on default operations of the application
	 * @author ViswanathP
	 * 
	 */
	public class AppPropertiesServiceDelegate
	{
		private var responder:IResponder;
		private var service:Object;
		
		/**
		 * AppPropertiesServiceDelegate constructor 
		 * @param responder
		 * 
		 */
		public function AppPropertiesServiceDelegate(responder:IResponder)
		{
			this.responder = responder;
			this.service = ServiceLocator.getInstance().getRemoteObject("appPropertiesService");
		}
		
		/**
		 * getPropertyValue gets the value for the given property from the server side
		 * by calling the server side service 
		 * 
		 */
		public function getPropertyValue(propertyName:String):void
		{
			var call:Object = service.getPropertyValue(propertyName);
			call.addResponder( responder );
		}
	}
}