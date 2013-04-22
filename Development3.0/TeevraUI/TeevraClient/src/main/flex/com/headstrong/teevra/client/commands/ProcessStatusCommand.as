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
 * $Id: ProcessStatusCommand.as
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
	import com.headstrong.teevra.client.business.ProcessAdminServiceDelegate;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.AlertHelper;
	
	import mx.collections.ICollectionView;
	import mx.collections.Sort;
	import mx.collections.SortField;
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	
	/**
	 * ProcessStatusCommand calls the ProcessAdminServiceDelegate's getProcessStatus
	 * method for getting the process status and displaying on screen after sorting by process name
	 * 
	 * @author PAakash
	 * 
	 */
	public class ProcessStatusCommand implements ICommand, IResponder
	{
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		
		/**
		 * ProcessStatusCommand constructor
		 * 
		 */
		public function ProcessStatusCommand()
		{
		}
	
		/**
		 * execute calls the delegator getProcessStatus method
		 * 
		 * @param event
		 * 
		 */
		public function execute(event:CairngormEvent):void 
		{	
			var delegate:ProcessAdminServiceDelegate = new ProcessAdminServiceDelegate( this );
			delegate.getProcessStatus();
		}
		/**
		 * executed if delegator's method getProcessStatus return true
		 * 
		 * @param data
		 * 
		 */
		public function result( data : Object ) : void
		{				
            var sortProcessStatus:Sort;
            var sortByServerName:SortField;
            var sortByPrcsName:SortField;
            var processesStatus : ICollectionView = ICollectionView( data.result );
			
			sortProcessStatus = new Sort();
			sortByServerName = new SortField("serverName",true,false);
			sortByPrcsName = new SortField("prcsName",true,false);
			//sort by server name first and then by process name 
			sortProcessStatus.fields=[sortByServerName,sortByPrcsName];
			processesStatus.sort=sortProcessStatus;
			processesStatus.refresh();
		
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			viewModel.processStatus = processesStatus;
			viewModel.loadModule(ViewModelLocator.PROCESS_STATUS_SWF);
			viewModel.screenName = "Process Management > Process Status";
		}
	
		/**
		 * executed if delegator's method getProcessStatus return false 
		 * 
		 * @param info
		 * 
		 */
		public function fault( info : Object ) : void
		{
			AlertHelper.displayFault(info,"Processes with their run status could not be retrieved");
		}
	}
}