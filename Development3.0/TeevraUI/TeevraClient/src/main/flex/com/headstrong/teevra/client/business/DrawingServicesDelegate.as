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
	import mx.rpc.IResponder;
	import com.adobe.cairngorm.business.ServiceLocator;	
	import com.headstrong.teevra.client.view.entity.ProcessVO;

	/**
	 * DrawingServicesDelegate calls component service on the server side
	 * which perform operation on components
	 * @author PAakash
	 * 
	 */
	public class DrawingServicesDelegate {
	
		private var responder:IResponder;
		private var service:Object;
		
		public function DrawingServicesDelegate( responder:IResponder ) {
			this.responder = responder;
			this.service = ServiceLocator.getInstance().getRemoteObject("componentService");
		}
		
		public function getComponents():void
		{
			var call:Object = service.getComponents();
			call.addResponder( responder );
		}
		
	}
}