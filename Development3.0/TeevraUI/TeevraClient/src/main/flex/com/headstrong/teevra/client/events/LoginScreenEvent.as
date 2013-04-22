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
 * $Id: LoginScreenEvent.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: May 19, 2009  
 */
package com.headstrong.teevra.client.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	/**
	 * LoginScreenEvent for handling the event for loading login screen
	 * @author paakash
	 * 
	 */
	public class LoginScreenEvent extends CairngormEvent
	{
		public static const VIEW_LOGIN_EVENT:String = "Login Screen Event";
		 
		public function LoginScreenEvent()
		{
			super(VIEW_LOGIN_EVENT);			
		}
	}
}