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
 * $Id: UserAuthenticationCommand.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: May 19, 2009  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.UserAuthenticationServiceDelegate;
	import com.headstrong.teevra.client.events.UserAuthenticationEvent;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.UserVO;
	
	import mx.controls.Alert;
	
	/**
	 * UserAuthenticationCommand calls the delegator UserAuthenticationServiceDelegate's authenticateUser
	 * for authenticating the user
	 * 
	 * @author ViswanathP
	 * 
	 */
	public class UserAuthenticationCommand implements ICommand
	{
		private var isViewComponentEvent:Boolean;
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		
		/**
		 * UserAuthenticationCommand constroctor
		 * 
		 */
		public function UserAuthenticationCommand()
		{
		}
		/**
		 * execute calls the delegator UserAuthenticationCommand's authenticateUser
		 * for authenticating the user
		 * 
		 * @param event
		 * 
		 */
		public function execute(event:CairngormEvent):void 
		{	
			var userAthenticationEvent:UserAuthenticationEvent = UserAuthenticationEvent(event);
			var delegate:UserAuthenticationServiceDelegate = new UserAuthenticationServiceDelegate(userAthenticationEvent.resultHandler);
			
			switch (UserAuthenticationEvent.currentCommand) 
			{	
				case UserAuthenticationEvent.GET_LOGIN_COMMAND:
					
					delegate.authenticateUser
					(String(userAthenticationEvent.getArgument(UserAuthenticationEvent.GET_USER_ID)),
					String(userAthenticationEvent.getArgument(UserAuthenticationEvent.GET_PASSWORD)));					
					break;
					
				case UserAuthenticationEvent.LOGOUT_COMMAND:
					delegate.logout();
					break;					
			}
		}
	}
}