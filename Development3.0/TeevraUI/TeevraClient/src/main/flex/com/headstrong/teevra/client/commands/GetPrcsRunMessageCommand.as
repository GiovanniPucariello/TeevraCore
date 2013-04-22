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
	import com.headstrong.teevra.client.events.GetPrcsRunMessageEvent;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.util.AlertHelper;
	import com.headstrong.teevra.client.view.admin.MessageDataPopup;
	
	import flash.display.DisplayObject;
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	import mx.core.IFlexDisplayObject;
	import mx.managers.PopUpManager;
	import mx.rpc.IResponder;
	import mx.rpc.events.FaultEvent;
	
	/**
	 * GetPrcsRunMessageCommand calls the ProcessAdminServiceDelegate's getPrcsRunMessageData
	 * for getting the process run message data
	 * 
	 * @author PAakash
	 * 
	 */
	public class GetPrcsRunMessageCommand implements ICommand, IResponder
	{
	  	private var popup:IFlexDisplayObject;
		private var errorReporting:DisplayObject;
			  	
	  	public function GetPrcsRunMessageCommand()
		{	 
		}
		/**
		 * execute  calls the ProcessAdminServiceDelegate's getPrcsRunMessageData
		 * for getting the process run message data 
		 * 
		 * @param event
		 * 
		 */
		public function execute( event : CairngormEvent ): void
		{	
			var messageEventlogId:Number = (event as GetPrcsRunMessageEvent).messageEventlogId;
			errorReporting = (event as GetPrcsRunMessageEvent).errorReporting;
			
			var delegate : ProcessAdminServiceDelegate = new ProcessAdminServiceDelegate( this );
			delegate.getPrcsRunMessageData(messageEventlogId);
		}
		/**
		 * executed if delegator's  getPrcsRunMessageData successful in getting the process run message data
		 * 
		 * @param data
		 * 
		 */
		public function result( data : Object ) : void
		{
			//get the data and store it as  prcsRunMessageDatain ViewModellocator
			var prcsRunMessageData : ArrayCollection = ArrayCollection( data.result );
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			viewModel.prcsRunMessageData = prcsRunMessageData;
			
			//create popup to display the message data
			var messageDataPopup:MessageDataPopup = new MessageDataPopup();
			popup = PopUpManager.createPopUp(errorReporting, MessageDataPopup ,true);
			
			messageDataPopup = MessageDataPopup(popup);  
		    messageDataPopup.create(popupClose);
		    PopUpManager.centerPopUp(popup);
		}
		/**
		 * executed if delegator's  getPrcsRunMessageData failed in getting the process run message data 
		 * 
		 * @param info
		 * 
		 */
		public function fault( info : Object ) : void
		{
			AlertHelper.displayFault(info,"Message Data could not be retrieved");
		}
		
		 private function popupClose(event:MouseEvent):void
		 {
	    	PopUpManager.removePopUp(popup);
	 	 }
	}
}