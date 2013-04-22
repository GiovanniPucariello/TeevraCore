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
 * $Id: ProcessServiceCommand.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Apr 07, 2009  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.ProcessServicesDelegate;
	import com.headstrong.teevra.client.events.ProcessServiceEvent;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.ProcessVO;
	
	public class ProcessServiceCommand implements ICommand
	{
		private var viewModel : ViewModelLocator;
		public function ProcessServiceCommand()
		{
		}
		public function execute( event : CairngormEvent ): void
		{
			var processServiceEvent:ProcessServiceEvent = ProcessServiceEvent(event);
			var delegate : ProcessServicesDelegate = new ProcessServicesDelegate( processServiceEvent.resultHandler );
			switch (ProcessServiceEvent.currentCommand) 
			{	
				case ProcessServiceEvent.GET_PROCESS_COMMAND:
					var processVO:ProcessVO = new ProcessVO();
					processVO.prcsId = Number(processServiceEvent.getArgument(ProcessServiceEvent.GET_PROCESS_ID));
					delegate.findProcesses(processVO);
					break;
				
				case ProcessServiceEvent.DELETE_PROCESS_COMMAND:
					delegate.deleteProcess(Number(processServiceEvent.getArgument(ProcessServiceEvent.DELETE_PROCESS_ID)));
					break;
					
				case ProcessServiceEvent.SAVE_PROCESS_COMMAND:
					delegate.saveProcess(ProcessVO(processServiceEvent.getArgument(ProcessServiceEvent.SAVE_PROCESS_ID)));
					break;
					
				case ProcessServiceEvent.PUBLISH_PROCESS_COMMAND:
					delegate.publishProcess(ProcessVO(processServiceEvent.getArgument(ProcessServiceEvent.PUBLISH_PROCESS_ID)));
					break;
			}
			
		}		

	}
}