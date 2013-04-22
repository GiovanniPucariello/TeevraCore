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
 * $Id: FileUploaderCommand.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec 18, 2008  
 */
package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.ProcessAdminServiceDelegate;
	import com.headstrong.teevra.client.events.FileUploaderEvent;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	
	/**
	 * FileUploaderCommand calls the ProcessAdminServiceDelegate for the installing the bundle
	 * 
	 * @author PAakash
	 * 
	 */
	public class FileUploaderCommand implements ICommand, IResponder
	{
		public var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		 
		/**
		 * FileUploaderCommand constructor
		 * 
		 */
		public function FileUploaderCommand()
		{
		}
		/**
		 * execute calls the ProcessAdminServiceDelegate's installBundle method
		 * 
		 * @param event
		 * 
		 */
		public function execute(event:CairngormEvent):void 
		{
		  	var fileUploaderEvent:FileUploaderEvent = event as FileUploaderEvent;
		  	var delegate : ProcessAdminServiceDelegate = new ProcessAdminServiceDelegate( this );
			delegate.installBundle(fileUploaderEvent.fileName,fileUploaderEvent.byteData);
		  
		}
		/**
		 * result is executed if delegator returns true
		 * 
		 * @param data
		 * 
		 */
		public function result( data : Object ) : void
		{		
			modelLocator.fileUploaderFlag=true;
		}
		/**
		 * fault is executed if delegator return false 
		 * 
		 * @param info
		 * 
		 */
		public function fault( info : Object ) : void
		{
			modelLocator.fileUploaderFlag=false;
		}

	}
}