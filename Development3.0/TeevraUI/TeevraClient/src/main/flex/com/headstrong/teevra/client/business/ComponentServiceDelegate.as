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
 * $Id: ComponentServiceDelegate.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec 17, 2008 
 */
package com.headstrong.teevra.client.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	import com.headstrong.teevra.client.graph.model.ComponentTemplateVO;
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	
	import mx.rpc.IResponder;
	
	
	/**
	 * ComponentServiceDelegate calls component service on the server side
	 * which perform operation on components
	 * @author PAakash
	 * 
	 */
	public class ComponentServiceDelegate
	{
		private var responder:IResponder;
		private var service:Object;
		/**
		 * ComponentServiceDelegate constructor 
		 * @param responder
		 * 
		 */
		public function ComponentServiceDelegate( responder:IResponder )
		{
			this.responder = responder;
			this.service = ServiceLocator.getInstance().getRemoteObject("componentService");
		}
		
		/**
		 * getComponent gets all the components from the server side
		 * by calling the server side service 
		 * 
		 */
		public function getComponents():void
		{
			var call:Object = service.getComponents();
			call.addResponder( responder );
		}
		/**
		 * saveComponent save the component by calling 
		 * server side service by passing the componentVO
		 * @param componentVO
		 * 
		 */
		public function saveComponent(componentVO:ComponentVO):void
		{
			var call:Object = service.saveComponent(componentVO);
			call.addResponder( responder );
		}
		/**
		 * deleteComponent delete the component by passing the compId
		 * @param compId
		 * 
		 */
		public function deleteComponent(compId:Number):void
		{
			var call:Object = service.deleteComponent(compId);
			call.addResponder( responder );
		}
		public function saveComponentTemplate(componentTemplateVO:ComponentTemplateVO):void
		{
			var call:Object = service.saveComponentTemplate(componentTemplateVO);
			call.addResponder( responder );
		}
		public function getComponentTemplateEO(compId:Number,compTemplateName:String):void
		{
			var call:Object = service.getComponentTemplateEO(compId,compTemplateName);
			call.addResponder( responder );
		}
		public function getComponentTemplateNames():void
		{
			var call:Object = service.getComponentTemplateNames();
			call.addResponder( responder );
		}

		public function getTemplateNames(compId:Number):void
		{
			var call:Object = service.getTemplateNames(compId);
			call.addResponder( responder );
		}

	}
}