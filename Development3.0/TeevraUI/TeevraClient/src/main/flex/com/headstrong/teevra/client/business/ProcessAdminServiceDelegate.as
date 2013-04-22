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
 * $Id: ProcessAdminServiceDelegate.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Oct 21, 2008 
 * 
 * $Revision :1.0 
 * $Feature : Redmine#611 [ProcessMonitoringConsole]
 * $DateTime: Feb 2011 
 */

package com.headstrong.teevra.client.business 

/**
 * 
 */
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.headstrong.teevra.client.view.admin.ProcessSchedule;
	import com.headstrong.teevra.client.view.entity.ServerConfigVO;
	
	import flash.utils.ByteArray;
	
	import mx.rpc.IResponder;
	
	/**
	 * ProcessAdminServiceDelegate calls ProcessAdmin service on the server side
	 * which perform Admin operation
	 * @author PAakash
	 * 
	 */
	public class ProcessAdminServiceDelegate {
	
		private var responder:IResponder;
		private var service:Object;
			
		/**
		 * ProcessAdminServiceDelegate constructor
		 * @param responder
		 * 
		 */
		public function ProcessAdminServiceDelegate( responder:IResponder )
		 {
			this.responder = responder;
			this.service = ServiceLocator.getInstance().getRemoteObject("processAdminService");
		}
		/**
		 * startProcess calls the server side service for starting the process
		 * for processId
		 * @param processId
		 * 
		 */
		public function startProcess(processId:Number,server:ServerConfigVO):void
		{
			var call:Object = service.startProcess(processId,server);
			call.addResponder( responder );
		}
		/**
		 * stopProcess calls the server side service for stopping the process 
		 * for processId
		 * @param processId
		 * 
		 */
		public function stopProcess(processId:Number,server:ServerConfigVO):void
		{
			var call:Object = service.stopProcess(processId,server);
			call.addResponder( responder );
		}

		/**
		 * viewProcessDetails calls the server side service for getting 
		 * process monitoring details
		 * 
		 * @param processId:Number
		 * @param processName:String
		 * @param server:ServerConfigVO
		 */
		 // new method added as a part of Feature#611 [ProcessMonitoringConsole]
		public function viewProcessDetails(processId:Number,processName:String,server:ServerConfigVO):void
		{
			var call:Object = service.getProcessDetails(processId,processName,server);
			call.addResponder( responder );
		}

		/**
		 * getProcessStatus calls the server side service for getting 
		 * process status
		 * 
		 */
		public function getProcessStatus():void
		{
			var call:Object = service.getProcessStatus();
			call.addResponder( responder );
		}
		/**
		 * scheduleProcess calls the server side service for scheduling the process
		 * for processSchedule 
		 * @param processSchedule
		 * 
		 */
		public function scheduleProcess(processSchedule:ProcessSchedule,server:ServerConfigVO):void
		{
			var call:Object = service.scheduleProcess(processSchedule,server);
			call.addResponder( responder );
		}
		/**
		 * getErrorReports calls the server side service for getting 
		 * the error report
		 * 
		 */
		public function getErrorReports():void
		{
			var call:Object = service.getErrorLogs();
			call.addResponder( responder );
		}
		/**
		 * getPrcsRunErrorReports calls the server side services for getting 
		 * the process run time error for prcsRunId 
		 * @param prcsRunId
		 * 
		 */
		public function getPrcsRunErrorReports(prcsRunId:Number):void
		{
			var call:Object = service.getErrorLogs(prcsRunId);
			call.addResponder( responder );
		}
		/**
		 * installBundle calls the server side service to install the bundle
		 * by passing the fileName and bytData
		 * @param fileName
		 * @param byteData
		 * 
		 */
		public function installBundle(fileName:String,byteData:ByteArray):void
		{
			var call:Object = service.installBundle(fileName,byteData);
			call.addResponder(responder );
		}
		/**
		 * getPrcsRunMessageData calls the server side service to get process run time data
		 * for messageEventlogId
		 * @param messageEventlogId
		 * 
		 */
		public function getPrcsRunMessageData(messageEventlogId:Number):void
		{
			var call:Object = service.getMessageData(messageEventlogId);
			call.addResponder( responder );
		}
		public function getProcessSchedule(prcsId:Number):void
		{
			var call:Object = service.getProcessSchedule(prcsId);
			call.addResponder( responder );
		}
		public function saveProcessSchedule(processScheduleToSave:ProcessSchedule):void
		{
			var call:Object = service.saveProcessSchedule(processScheduleToSave);
			call.addResponder( responder );
		}

	}
}
