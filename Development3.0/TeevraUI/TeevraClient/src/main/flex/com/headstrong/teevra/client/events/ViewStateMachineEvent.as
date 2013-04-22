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
 * $Id: ViewStateMachineEvent.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 10, 2009  
 */
 
package com.headstrong.teevra.client.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import mx.controls.Alert;
	
	public class ViewStateMachineEvent extends CairngormEvent
	{
		public static const VIEW_STATE_MACHINE_EVENT:String="View StateMachine";
		
		public function ViewStateMachineEvent()
		{
			super(VIEW_STATE_MACHINE_EVENT);
		}

	}
}