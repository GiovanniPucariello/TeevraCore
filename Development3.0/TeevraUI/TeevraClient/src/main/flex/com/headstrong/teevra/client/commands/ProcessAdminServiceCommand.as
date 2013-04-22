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
 * $Id: ProcessAdminServiceCommand.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Apr 09, 2009  
 *
 * $Revision :1.0 
 * $Feature : Redmine#611 [ProcessMonitoringConsole]
 * $DateTime: Feb 2011 
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.ProcessAdminServiceDelegate;
	import com.headstrong.teevra.client.events.ProcessAdminServiceEvent;
	import com.headstrong.teevra.client.view.admin.ProcessSchedule;
	import com.headstrong.teevra.client.view.entity.ServerConfigVO;
	
	import flash.text.engine.BreakOpportunity;
	
	public class ProcessAdminServiceCommand implements ICommand
	{	
		public function ProcessAdminServiceCommand()
		{
		}
		public function execute( event : CairngormEvent ): void
		{
			var processAdminServiceEvent:ProcessAdminServiceEvent = ProcessAdminServiceEvent(event);
			var delegate : ProcessAdminServiceDelegate = new ProcessAdminServiceDelegate( processAdminServiceEvent.resultHandler );
			// getter of command is used instead of static currentComand as a part of fix to Bug#114
			switch (processAdminServiceEvent.command) 
			{	
				case ProcessAdminServiceEvent.START_PROCESS_COMMAND:
					delegate.startProcess(Number(processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.START_PROCESS_ID)),
					ServerConfigVO(processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.START_PROCESS_SERVER)));
					break;
					
				case ProcessAdminServiceEvent.STOP_PROCESS_COMMAND:
					delegate.stopProcess(Number(processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.STOP_PROCESS_ID)),
					ServerConfigVO(processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.STOP_PROCESS_SERVER)));
					break;
					
				 //new case added as a part of Feature#611 [ProcessMonitoringConsole]
				case ProcessAdminServiceEvent.VIEW_PROCESS_DTLS_COMMAND:
					delegate.viewProcessDetails(Number(processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_ID)),
					String(processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_NAME)),
					ServerConfigVO(processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.VIEW_PROCESS_SERVER)));
					break;
					
				case ProcessAdminServiceEvent.PROCESS_STATUS_COMMAND:
					delegate.getProcessStatus();
					break;
					
				case ProcessAdminServiceEvent.GET_RECURRENCE_COMMAND:
					delegate.getProcessSchedule(Number
					(processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.GET_RECURRENCE_ID)));
					break;
				
				case ProcessAdminServiceEvent.PROCESS_RUNTIME_RPT_COMMAND:
					delegate.getPrcsRunErrorReports(Number
					(processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.RUN_PROCESS_ID)));
					break;	
					
				case ProcessAdminServiceEvent.RECURRENCE_COMMAND:
					delegate.scheduleProcess(ProcessSchedule(processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.RECURRENCE_ID)),
					ServerConfigVO(processAdminServiceEvent.getArgument(ProcessAdminServiceEvent.RECURRENCE_CONFIG)));
					break;						
			}			
		}

	}
}