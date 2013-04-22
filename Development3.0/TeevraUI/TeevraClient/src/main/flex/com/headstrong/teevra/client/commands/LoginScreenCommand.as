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
 * $Id: LoginScreenCommand.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: May 19, 2009  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	
	import mx.rpc.IResponder;
	
	/**
	 *  LoginScreenCommand load the Login screen
	 *  
	 * @author paakash
	 * 
	 */
	public class LoginScreenCommand implements ICommand
	{
		public function LoginScreenCommand()
		{
			//TODO: implement function
		}
		public function execute(event:CairngormEvent):void
		{
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			viewModel.loadModule(ViewModelLocator.VIEW_LOGIN_SWF);
		}
	}
}