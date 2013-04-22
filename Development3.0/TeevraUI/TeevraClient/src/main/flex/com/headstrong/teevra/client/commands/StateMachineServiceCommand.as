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
 * $DateTime: Apr 08, 2009  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.StateMachineServiceDelegate;
	import com.headstrong.teevra.client.events.ComponentServiceEvent;
	import com.headstrong.teevra.client.events.StateMachineServiceEvent;
	import com.headstrong.teevra.client.model.ComponentCache;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.AlertHelper;
	import com.headstrong.teevra.client.view.entity.StateMachineVO;
	
	import mx.collections.ICollectionView;
	import mx.collections.Sort;
	import mx.collections.SortField;
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	
	public class StateMachineServiceCommand implements ICommand,IResponder
	{
		private var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
		private var isViewComponentEvent:Boolean;
		public function StateMachineServiceCommand()
		{
		}
		public function execute( event : CairngormEvent ): void
		{
			var stateMachineServiceEvent:StateMachineServiceEvent= StateMachineServiceEvent(event);
			var delegate : StateMachineServiceDelegate = new StateMachineServiceDelegate( stateMachineServiceEvent.resultHandler );
			switch (StateMachineServiceEvent.currentCommand) 
			{
				case StateMachineServiceEvent.VIEW_STATEMACHINE_COMMAND:
					delegate.getStateMachineList();
					break;
				case StateMachineServiceEvent.NEW_STATEMACHINE_COMMAND:
					viewModel.loadModule(ViewModelLocator.STATE_MACHINE_DRAWING_SWF);	
					isViewComponentEvent=false;
					var args:Object = new Object();
					args[ComponentServiceEvent.VIEW_COMPONENT_ID] = isViewComponentEvent;
					var componentServiceEvent:ComponentServiceEvent = new ComponentServiceEvent(ComponentServiceEvent.VIEW_COMPONENT_COMMAND, args, this);
					componentServiceEvent.dispatch();
					isViewComponentEvent=componentServiceEvent.getArgument(ComponentServiceEvent.VIEW_COMPONENT_ID);				
					break;
					
				case StateMachineServiceEvent.DELETE_STATEMACHINE_COMMAND:
					delegate.deleteStateMachine(String(stateMachineServiceEvent.getArgument(StateMachineServiceEvent.DELETE_STATEMACHINE_ID)));
					break;
				
				case StateMachineServiceEvent.SAVE_STATEMACHINE_COMMAND:
					delegate.saveStateMachine(StateMachineVO(stateMachineServiceEvent.getArgument(StateMachineServiceEvent.SAVE_STATEMACHINE_ID)));
					break;
					
				case StateMachineServiceEvent.PUBLISH_STATEMACHINE_COMMAND:
					delegate.publishStateMachine(StateMachineVO(stateMachineServiceEvent.getArgument(StateMachineServiceEvent.PUBLISH_STATEMACHINE_ID)));
					break;
			}			
		}
		/**
		 * executed if ComponentServiceEvent's  getComponents successful in getting the components
		 * 
		 * @param data
		 * 
		 */
		public function result( data:Object ):void 
		{
				var sortByComponentType:SortField;
				var sortComponentType:Sort;
									
				var coll : ICollectionView = ICollectionView( data.result );
				if(isViewComponentEvent)
				{
					sortComponentType = new Sort();
					sortByComponentType = new SortField("compType",true,false);
					sortComponentType.fields = [sortByComponentType];
					coll.sort = sortComponentType;
					coll.refresh();
					
					viewModel.components=coll;
					viewModel.loadModule(ViewModelLocator.VIEW_COMPONENT_SWF);
					viewModel.screenName = "Administration > List of Component";
				}
				else
				{	
					ComponentCache.getInstance().loadComponents(coll);
				}
		}
		/**
		 * executed if ComponentServiceEvent's  getComponents failed in getting the components 
		 * 
		 * @param info
		 * 
		 */
		public function fault( info:Object ):void 
		{
			AlertHelper.displayFault(info,"Components could not be retrieved");			
		}

	}
}