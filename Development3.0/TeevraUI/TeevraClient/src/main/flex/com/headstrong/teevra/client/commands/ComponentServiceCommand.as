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
 * $Id: ComponentServiceCommand.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Apr 08, 2009  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.ComponentServiceDelegate;
	import com.headstrong.teevra.client.events.ComponentServiceEvent;
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	
	public class ComponentServiceCommand implements ICommand
	{
		private var viewModel : ViewModelLocator;
		public function ComponentServiceCommand()
		{
		}
		public function execute( event : CairngormEvent ): void
		{
			var componentServiceEvent:ComponentServiceEvent = ComponentServiceEvent(event);
			var delegate : ComponentServiceDelegate = new ComponentServiceDelegate( componentServiceEvent.resultHandler);
			switch (ComponentServiceEvent.currentCommand) 
			{	
				case ComponentServiceEvent.NEW_PROCESS_COMMAND:
					delegate.getComponents();
					break;
					
				case ComponentServiceEvent.DRAWING_PROCESS_COMMAND:
					delegate.getComponents();
					break;
					
				case ComponentServiceEvent.SAVE_COMPONENT_COMMAND:
					delegate.saveComponent(ComponentVO(componentServiceEvent.getArgument(ComponentServiceEvent.SAVE_COMPONENT_ID)));
					break;	
					
				case ComponentServiceEvent.VIEW_COMPONENT_COMMAND:
					delegate.getComponents();
					break;
				
			}			
		}

	}
}