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
 * $Id: ViewProcessCommand.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Oct 21, 2008  
 */
package com.headstrong.teevra.client.commands
/**
 * 
 */
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.ProcessServicesDelegate;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.AlertHelper;
	
	import mx.collections.ICollectionView;
	import mx.collections.Sort;
	import mx.collections.SortField;
	import mx.controls.Alert;
	import mx.core.Application;
	import mx.messaging.messages.ErrorMessage;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
    
	/**
	 * ViewProcessCommand calls the ProcessServicesDelegate's getProcesses
	 * for getting the process and displaying on UI after sorting the values on process name
	 * 
	 * @author PAakash
	 * 
	 */
	public class ViewProcessCommand implements ICommand, IResponder
	{
	  	/**
	  	 * ViewProcessCommand constructor
	  	 * 
	  	 */
	  	public function ViewProcessCommand()
		{	 
		}
		/**
		 * execute calls the delegator's getProcesses for getting the information for the process 
		 * 
		 * @param event
		 * 
		 */
		public function execute( event : CairngormEvent ): void
		{
			var delegate : ProcessServicesDelegate = new ProcessServicesDelegate( this );
			delegate.getProcesses();
		}
		/**
		 * executed if delegator's  getProcesses successful in getting the process information
		 * 
		 * @param data
		 * 
		 */
		public function result( data : Object ) : void
		{				
			var sortByProcessName:SortField;
            var sortProcess:Sort;
			var processes : ICollectionView = ICollectionView( data.result );
			
			
			sortProcess = new Sort();
			sortByProcessName = new SortField("prcsName",true,false,null);
			sortProcess.fields=[sortByProcessName];
			processes.sort=sortProcess;
			processes.refresh();
			
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			viewModel.viewProcesses = processes;
			viewModel.loadModule(ViewModelLocator.VIEW_PROCESS_SWF);
			viewModel.screenName = "Process Modeling > View Process";
		}
		/**
		 * executed if delegator's  getProcesses failed in getting the process information 
		 * 
		 * @param info
		 * 
		 */
		public function fault( info : Object ) : void
		{
			AlertHelper.displayFault(info,"Processes could not be retrieved");
		}
	}
}