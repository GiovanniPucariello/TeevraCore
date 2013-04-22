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
 * $Id: UserAdminServiceCommand.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 28, 2009  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.UserAdminServiceDelegate;
	import com.headstrong.teevra.client.events.UserAdminServiceEvent;
	import com.headstrong.teevra.client.view.entity.RoleVO;
	import com.headstrong.teevra.client.view.entity.UserVO;

	public class UserAdminServiceCommand implements ICommand
	{
		public function UserAdminServiceCommand()
		{
		}

		public function execute(event:CairngormEvent):void
		{
			var userAdminServiceEvent:UserAdminServiceEvent= UserAdminServiceEvent(event);
			var delegate : UserAdminServiceDelegate = new UserAdminServiceDelegate( userAdminServiceEvent.resultHandler );
			
			switch (UserAdminServiceEvent.currentCommand)
			{
				
				case UserAdminServiceEvent.GET_USERS_COMMAND:
					delegate.getUsers();
					break;
					
				case UserAdminServiceEvent.ADD_USER_COMMAND:
					delegate.addUser(UserVO(userAdminServiceEvent.getArgument(UserAdminServiceEvent.ADD_USER_ID)));
					break;
					
				case UserAdminServiceEvent.DELETE_USER_COMMAND:
					delegate.deleteUser(Number(userAdminServiceEvent.getArgument(UserAdminServiceEvent.DELETE_USER_ID)));
					break;

				case UserAdminServiceEvent.GET_ROLES_COMMAND:
					delegate.getRoles();
					break;
					
				case UserAdminServiceEvent.ADD_ROLE_COMMAND:
					delegate.addRole(RoleVO(userAdminServiceEvent.getArgument(UserAdminServiceEvent.ADD_ROLE_ID)));
					break;
					
				case UserAdminServiceEvent.DELETE_ROLE_COMMAND:
					delegate.deleteRole(Number(userAdminServiceEvent.getArgument(UserAdminServiceEvent.DELETE_ROLE_ID)));
					break;
				
				case UserAdminServiceEvent.GET_ACTIVITIES_COMMAND:
					delegate.getActivities();
					break;

				
				}
		}
		
	}
}