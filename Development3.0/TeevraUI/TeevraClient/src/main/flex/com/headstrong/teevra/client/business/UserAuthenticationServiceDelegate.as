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
 * $Id: UserAuthenticationServiceDelegate.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 19, 2009 
 */
package com.headstrong.teevra.client.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	
	import mx.rpc.IResponder;
	
	
	/**
	 * UserAuthenticationServiceDelegate calls UserAuthentication service on the server side
	 * which authenticates the user
	 * @author PAakash
	 * 
	 */
	public class UserAuthenticationServiceDelegate
	{
		private var responder:IResponder;
		private var service:Object;
		/**
		 * UserAuthenticationServiceDelegate constructor 
		 * @param responder
		 * 
		 */
		public function UserAuthenticationServiceDelegate( responder:IResponder )
		{
			this.responder = responder;
			this.service = ServiceLocator.getInstance().getRemoteObject("userAuthenticationService");
		}
		
		/**
		 * authenticateUser authenticates user for the given user name and password
		 * by calling the server side service 
		 * 
		 */
		public function authenticateUser(userId:String,password:String):void
		{
			var call:Object = service.authenticateUser(userId,password);
			call.addResponder( responder );
		}
		public function logout():void
		{
			var call:Object = service.logoutUser();
			call.addResponder( responder );
		}
	}	
}