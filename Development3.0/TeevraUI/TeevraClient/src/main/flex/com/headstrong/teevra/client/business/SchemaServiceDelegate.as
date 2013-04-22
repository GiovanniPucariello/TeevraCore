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
	import com.headstrong.teevra.client.view.entity.SchemaVO;
	
	import mx.rpc.IResponder;

	/**
	 * SchemaServiceDelegate calls Schema service on the server side
	 * which perform operation on Schema
	 * @author PAakash
	 * 
	 */
	public class SchemaServiceDelegate {
	
		private var responder:IResponder;
		private var service:Object;
		
		/**
		 * SchemaServiceDelegate constructor
		 * @param responder
		 * 
		 */
		public function SchemaServiceDelegate( responder:IResponder ) {
			this.responder = responder;
			this.service = ServiceLocator.getInstance().getRemoteObject("schemaService");
			
		}
		/**
		 * getSchemas calls the server side service 
		 * for getting the schema 
		 * 
		 */
		public function getSchemas():void
		{
			var call:Object = service.getSchemas();
			call.addResponder( responder );
		}
		
		/**
		 *  saveXMLSchema calls the server side service
		 * for the saving the XMLSchema by passing the schemaVO and schemaText
		 * @param schemaVO
		 * @param schemaText
		 * 
		 */
		public function saveXMLSchema(schemaVO:SchemaVO,schemaText:String):void
		{
			var call:Object = service.saveXMLSchema(schemaVO,schemaText);
			call.addResponder( responder );
		}
		
		//get the schemas for schemaName to editSchema
		/**
		 *  findSchemas calls the server side service
		 * by finding the schema by passing the SchemaVO
		 * @param schemaVO
		 * 
		 */
		public function findSchemas(schemaVO:SchemaVO):void
		{
			var call:Object = service.getSchemas(schemaVO);
			call.addResponder( responder );
		}
		
		/**
		 * deleteSchema call the server side service
		 * for deleting the schema for the given schemaId
		 * @param schemaId
		 * 
		 */
		public function deleteSchema(schemaId:Number):void
		{
			var call:Object = service.deleteSchemaTree(schemaId);
			call.addResponder(responder);
		}
		/**
		 * getPublicSchemas calls the server side services 
		 * for getting the inmormation for the published schema 
		 * 
		 */
		public function getPublicSchemas():void
		{
			var call:Object = service.getPublicSchemas();
			call.addResponder( responder );
		}
	}
}