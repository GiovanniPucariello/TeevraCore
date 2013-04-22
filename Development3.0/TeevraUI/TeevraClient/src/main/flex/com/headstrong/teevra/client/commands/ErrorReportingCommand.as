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
 * $Id: ErrorReportingCommand.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Dec 18, 2008  
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
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	
	/**
	 * ErrorReportingCommand calls the ProcessAdminServiceDelegate's getErrorReports
	 * for getting all the errored reports.
	 * 
	 * @author PAakash
	 * 
	 */
	public class ErrorReportingCommand implements ICommand, IResponder
	{
	  	public function ErrorReportingCommand()
		{	 
		}
		/**
		 * execute calls the ProcessAdminServiceDelegate's getErrorReports
	 	 * for getting all the errored reports. 
		 * 
		 * @param event
		 * 
		 */
		public function execute( event : CairngormEvent ): void
		{	
			var delegate : ProcessAdminServiceDelegate = new ProcessAdminServiceDelegate( this );
			delegate.getErrorReports();
		}
		/**
		 * executed if delegator's  getErrorReports successful in getting the error report
		 * 
		 * @param data
		 * 
		 */
		public function result( data : Object ) : void
		{
			var errorReports : ICollectionView = ICollectionView( data.result );
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			viewModel.errorReports = errorReports;
			
			viewModel.loadModule(ViewModelLocator.ERROR_REPORTING_EVENT);
			viewModel.screenName = "Exception Handling > Error Reporting";
		}
		/**
		 * executed if delegator's  getErrorReports failed in getting the error report 
		 *
		 * @param info
		 * 
		 */
		public function fault( info : Object ) : void
		{
			AlertHelper.displayFault(info,"Error Reports could not be retrieved");
		}
	}
}