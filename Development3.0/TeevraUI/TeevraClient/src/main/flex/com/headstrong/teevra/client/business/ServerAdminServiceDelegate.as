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
 * $Id: ServerAdminSericeDelegate.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Feb 10, 2009 
 */
package com.headstrong.teevra.client.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.headstrong.teevra.client.view.entity.ServerConfigVO;
	
	import mx.rpc.IResponder;
	
	
	/**
	 * ServerAdminServiceDelegate calls ServerAdminService  on the server side
	 * which perform operation on Server
	 * @author PAakash
	 * 
	 */
	public class ServerAdminServiceDelegate
	{
		private var responder:IResponder;
		private var service:Object;
		/**
		 * ServerAdminServiceDelegate constructor 
		 * @param responder
		 * 
		 */
		public function ServerAdminServiceDelegate( responder:IResponder )
		{
			this.responder = responder;
			this.service = ServiceLocator.getInstance().getRemoteObject("serverAdminService");
		}
		
		/**
		 * getServerConfigs gets all the service name from the server side
		 * by calling the server side service 
		 * 
		 */
		public function getServerConfigs():void
		{
			var call:Object = service.getServerConfigs();
			call.addResponder( responder );
		}
		
		public function registerServer(serverConfigVO:ServerConfigVO):void
		{
			var call:Object = service.registerServer(serverConfigVO);
			call.addResponder( responder );
		}
		public function unregisterServer(serverName:String):void
		{
			var call:Object = service.unregisterServer(serverName);
			call.addResponder( responder );
		}
		public function assignServer(processId:Number,serverToAssign:ServerConfigVO):void
		{
			var call:Object = service.assignServer(processId,serverToAssign);
			call.addResponder( responder );
		}
		public function unassignServer(processId:Number):void
		{
			var call:Object = service.unassignServer(processId);
			call.addResponder( responder );
		}

	}
}