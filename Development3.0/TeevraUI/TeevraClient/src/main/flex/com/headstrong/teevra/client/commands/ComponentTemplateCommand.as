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
 * $Id: ComponentTemplateCommand.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Mar 27, 2009  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.ComponentServiceDelegate;
	import com.headstrong.teevra.client.events.ComponentTemplateEvent;
	import com.headstrong.teevra.client.graph.model.ComponentTemplateVO;
	
	public class ComponentTemplateCommand implements ICommand
	{
		
		public function ComponentTemplateCommand()
		{
		}
		/**
		 * calls the delegator's getComponentTemplateNames method for loading the component Name to the component Drop down
		 * 
		 * @param event
		 * 
		 */
		public function execute( event : CairngormEvent ): void
		{
			var compTemplateEvent:ComponentTemplateEvent = ComponentTemplateEvent(event);
			var delegate : ComponentServiceDelegate = new ComponentServiceDelegate( compTemplateEvent.resultHandler );
			
			switch (ComponentTemplateEvent.currentCommand) {
				case ComponentTemplateEvent.GET_NAMES_COMMAND:
					delegate.getTemplateNames(Number(compTemplateEvent.getArgument(ComponentTemplateEvent.ARG_COMP_ID)));
					break;
				case ComponentTemplateEvent.SAVE_CONFIG_COMMAND:
					delegate.saveComponentTemplate(ComponentTemplateVO(compTemplateEvent.getArgument(ComponentTemplateEvent.ARG_COMP_TEMPLATE)));
					break;
				case ComponentTemplateEvent.GET_CONFIG_COMMAND:
					var compId:Number = Number(compTemplateEvent.getArgument(ComponentTemplateEvent.ARG_COMP_ID));
					var templateName:String = String(compTemplateEvent.getArgument(ComponentTemplateEvent.ARG_TEMPLATE_NAME));
					delegate.getComponentTemplateEO(compId, templateName);
					break;
			}
		}
	}
}