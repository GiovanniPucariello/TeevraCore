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
 * $Id: ProcessStatusEvent.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Oct 21, 2008  
 */
package com.headstrong.teevra.client.events
/**
 * 
 */
{
	import flash.events.Event;
	import com.adobe.cairngorm.control.CairngormEvent;
	/**
	 * ProcessStatusEvent for handling the event for getting the process status
	 * @author PAakash
	 * 
	 */
	public class ProcessStatusEvent extends CairngormEvent
	{
		public static const PROCESSSTATUSEVENT:String = "Process Status";
		public function ProcessStatusEvent()
		{
				super(PROCESSSTATUSEVENT);
		}
	}
}