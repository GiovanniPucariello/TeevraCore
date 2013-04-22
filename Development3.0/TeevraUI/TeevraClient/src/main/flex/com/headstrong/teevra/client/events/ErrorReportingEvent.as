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
 * $Id: ErrorReportingEvent.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 18, 2008  
 */
package com.headstrong.teevra.client.events
/**
 * 
 */
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import flash.events.Event;	
	
	/**
	 * ErrorReportingEvent handles the events for error reporting
	 * @author PAakash
	 * 
	 */
	public class ErrorReportingEvent extends CairngormEvent
	{
		public static const ERROR_REPORTING_EVENT:String = "Error Reporting Event";
		public function ErrorReportingEvent()
		{
			super(ERROR_REPORTING_EVENT);
		}
	}
}