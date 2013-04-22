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
 * $Id: ProcessServicesDelegate.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Oct 21, 2008 
 */

package com.headstrong.teevra.client.business

/**
 * 
 */
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.headstrong.teevra.client.view.entity.ProcessVO;
	import com.headstrong.teevra.client.view.entity.ServerConfigVO;
	
	import mx.rpc.IResponder;

	/**
	 * ProcessServicesDelegate calls Process service on the server side
	 * which perform operation on Processes
	 * @author PAakash
	 * 
	 */
	public class ProcessServicesDelegate {
	
		private var responder:IResponder;
		private var service:Object;
		
		/**
		 * ProcessServicesDelegate constructor
		 * @param responder
		 * 
		 */
		public function ProcessServicesDelegate( responder:IResponder ) {
			this.responder = responder;
			this.service = ServiceLocator.getInstance().getRemoteObject("processService");
			
		}
		
		/**
		 * Save calls the server side service for saving the process 
		 * by passing the processVO
		 * @param processVO
		 * 
		 */
		public function saveProcess(processVO:ProcessVO):void
		{
			var call:Object = service.saveProcess(processVO);
			call.addResponder( responder );
		}

		/**
		 * getProcesses calls the server side service for 
		 * getting the processes
		 * 
		 */
		public function getProcesses():void
		{
			var call:Object = service.getProcesses();
			call.addResponder( responder );
		}
		
		/**
		 * findProcesses calls the server side service 
		 * for finding the process based on passed processVO
		 * @param processVO
		 * 
		 */
		public function findProcesses(processVO:ProcessVO):void
		{
			var call:Object = service.getProcesses(processVO);
			call.addResponder(responder);
		}

		/**
		 * publishProcess calls the server side service for 
		 * publishing the process for the passed processVO
		 * @param processVO
		 * 
		 */
		public function publishProcess(processVO:ProcessVO):void
		{
			var call:Object = service.publishProcess(processVO);
			call.addResponder( responder );
		}
		
		/**
		 * deleteProcess calls the server side service
		 * for deleting the process for the given prcsId
		 * @param prcsId
		 * 
		 */
		public function deleteProcess(prcsId:Number):void
		{
			var call:Object = service.deleteProcess(prcsId);
			call.addResponder( responder );
		}
	}
}