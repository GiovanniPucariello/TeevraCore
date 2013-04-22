/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright �?© 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: ServerConfigurationCommand.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 10, 2009  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.StateMachineServiceDelegate;
	import com.headstrong.teevra.client.model.StateMachineCache;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.AlertHelper;
	
	import mx.collections.ICollectionView;
	import mx.collections.Sort;
	import mx.collections.SortField;
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	
	/**
	 * ViewStateMachineCommand calls the StateMachineServiceDelegate's getStateMachineList
	 * to retrieve all the state machines deployed in the system
	 * 
	 * @author ViswanathP
	 * 
	 */
	public class ViewStateMachineCommand implements ICommand, IResponder
	{
		public function ViewStateMachineCommand()
		{
		}
		
		/**
		 * calls the StateMachineServiceDelegate's getStateMachineList
		 * 
		 * @param event
		 * 
		 */
		public function execute(event:CairngormEvent):void 
		{
			var delegate:StateMachineServiceDelegate = new StateMachineServiceDelegate( this );
			delegate.getStateMachineList();
		}
		/**
		 * executed if StateMachineServiceDelegate's getStateMachineList executed successfully
		 * 
		 * @param data
		 * 
		 */
		public function result( data : Object ) : void
		{
			var stateMachines : ICollectionView = ICollectionView( data.result );
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			//load the state machine cache
			StateMachineCache.getInstance().loadStateMachines(stateMachines);

				var sortByName:SortField;
				var sortStateMachines:Sort;
				
				viewModel.loadModule(ViewModelLocator.VIEW_STATE_MACHINE_SWF);
				viewModel.screenName = "Process Modeling > View StateMachine";
				viewModel.stateMachines=stateMachines;
	
				sortStateMachines = new Sort();
				sortByName = new SortField("stateMachineName",true,false);
				sortStateMachines.fields = [sortByName];
				stateMachines.sort = sortStateMachines;
				stateMachines.refresh();

		}
		/**
		 * executed if StateMachineServiceDelegate's getStateMachineList is failed to execute
		 * 
		 * @param info
		 * 
		 */
		public function fault( info : Object ) : void
		{
			AlertHelper.displayFault(info,"State Machines could not be retrieved");
		}
	}
}