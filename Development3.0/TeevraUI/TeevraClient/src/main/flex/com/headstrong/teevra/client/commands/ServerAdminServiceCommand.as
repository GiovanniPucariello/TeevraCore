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
 * $Id: ServerAdminServiceCommand.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Apr 09, 2009  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.ServerAdminServiceDelegate;
	import com.headstrong.teevra.client.events.ServerAdminServiceEvent;
	import com.headstrong.teevra.client.view.entity.ServerConfigVO;
	
	public class ServerAdminServiceCommand implements ICommand
	{
		public function ServerAdminServiceCommand()
		{
		}
		public function execute( event : CairngormEvent ): void
		{
			var serverAdminServiceEvent:ServerAdminServiceEvent = ServerAdminServiceEvent(event);
			var delegate : ServerAdminServiceDelegate = new ServerAdminServiceDelegate( serverAdminServiceEvent.resultHandler );
			
			switch (ServerAdminServiceEvent.currentCommand) 
			{
				case ServerAdminServiceEvent.ASSIGN_SERVER_COMMAND:
					delegate.assignServer(Number
					(serverAdminServiceEvent.getArgument(ServerAdminServiceEvent.ASSIGN_SERVER_ID)),
					ServerConfigVO(serverAdminServiceEvent.getArgument
					(ServerAdminServiceEvent.ASSIGN_SERVER_NAME)));
					break;
						
				case ServerAdminServiceEvent.UNASSIGN_SERVER_COMMAND:
					delegate.unassignServer(Number
					(serverAdminServiceEvent.getArgument(ServerAdminServiceEvent.UNASSIGN_SERVER_ID)));
					break;
				
				case ServerAdminServiceEvent.REGISTER_SERVER_COMMAND:
					delegate.registerServer(ServerConfigVO
					(serverAdminServiceEvent.getArgument(ServerAdminServiceEvent.REGISTER_SERVER_ID)))
					break;
					
				case ServerAdminServiceEvent.VIEW_SERVER_CONFIG_COMMAND:
					delegate.getServerConfigs();
					break;
					
				case ServerAdminServiceEvent.UNREGISTER_SERVER_COMMAND:
					delegate.unregisterServer(String
					(serverAdminServiceEvent.getArgument(ServerAdminServiceEvent.UNREGISTER_SERVER_ID)));
					break;				
			}			
		}
	}
}