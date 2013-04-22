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
 * $Id: UserAdminServiceDelegate.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 27, 2008 
 */
package com.headstrong.teevra.client.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.headstrong.teevra.client.view.entity.RoleVO;
	import com.headstrong.teevra.client.view.entity.UserVO;
	
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	
	public class UserAdminServiceDelegate
	{

			private var responder:IResponder;
			private var service:Object;
			
			/**
			 * UserAdminServiceDelegate constructor 
			 * @param responder
			 * 
			 */
			public function UserAdminServiceDelegate( responder:IResponder )
			{
				this.responder = responder;
				this.service = ServiceLocator.getInstance().getRemoteObject("userAdminService");
			}
			
			/**
			 * getUsers gets all the users registered in the system 
			 * from the server side by calling the server side service 
			 * 
			 */
			public function getUsers():void
			{
				var call:Object = service.getUsers();
				call.addResponder( responder );
			}
			
			/**
			 * addUser persists the given user details by calling 
			 * server side service by passing user
			 * @param user
			 * 
			 */
			public function addUser(user:UserVO):void
			{
				var call:Object = service.saveUser(user);
				call.addResponder( responder );
			}
			
			/**
			 * deleteUser deletes the given user from the system 
			 * by passing userId
			 * @param userId
			 * 
			 */
			public function deleteUser(userId:Number):void
			{
				var call:Object = service.deleteUser(userId);
				call.addResponder( responder );
			}
			
			/**
			 * getRoles gets all the roles defined in the system 
			 * from the server side by calling the server side service 
			 * 
			 */
			public function getRoles():void
			{
				var call:Object = service.getRoles();
				call.addResponder( responder );
			}
			
			/**
			 * addRole persists the given role details by calling 
			 * server side service by passing role
			 * @param role
			 * 
			 */
			public function addRole(role:RoleVO):void
			{
				var call:Object = service.saveRole(role);
				call.addResponder( responder );
			}
			
			/**
			 * deleteRole deletes the given role from the system 
			 * by passing roleId
			 * @param roleId
			 * 
			 */
			public function deleteRole(roleId:Number):void
			{
				var call:Object = service.deleteRole(roleId);
				call.addResponder( responder );
			}
			
			/**
			 * getActivities gets all the activities defined in the system 
			 * from the server side by calling the server side service 
			 * 
			 */
			public function getActivities():void
			{
				var call:Object = service.getActivities();
				call.addResponder( responder );
			}

	}
}