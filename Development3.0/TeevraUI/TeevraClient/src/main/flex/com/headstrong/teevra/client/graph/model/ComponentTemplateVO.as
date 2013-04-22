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
 * $Id: ComponentTemplateVO.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Mar 27, 2008  
 */
package com.headstrong.teevra.client.graph.model
{
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="com.headstrong.teevra.services.component.eo.ComponentTemplateEO")]
	[Bindable]
	public class ComponentTemplateVO
	{
		/**
		 * Unique Identifier for the component template
		 */
		 private var _compTemplateId :Number;

		/**
		 * Identifier for the component to which the template belongs to
		 */
		private var _compId :Number;

		/**
		 * Name of the component template(Unique for a compId)
		 */
		private var _templateName :String;

		/**
		 * Configuration details of the component in the template
		 */
		private var _configurations :ArrayCollection;
		/**
		 *User name who created the Component 
		 */
		private var _createdBy :String;
		/**
		 *Time when created the Component 
		 */
		private var _createdDate:Date;
		/**
		 * User name who modified the Component 
		 */
		private var _modifiedBy :String;
		/**
		 *Time when modified the Component 
		 */
		private var _modifiedDate :Date;
		
		/**
		 * ComponentTemplateVO constructor
		 * 
		 */
		public function ComponentTemplateVO()
		{
		}
		/**
		 * 
		 * @return compTemplateId
		 * 
		 */
		public function get compTemplateId():Number
		{
			return _compTemplateId;
		}
		/**
		 * 
		 * @param value compTemplateId
		 * 
		 */
		public function set compTemplateId(value:Number):void
		{
			this._compTemplateId = value;
		}
		/**
		 * 
		 * @return compId
		 * 
		 */
		public function get compId():Number
		{
			return _compId;
		}
		/**
		 * 
		 * @param value compId
		 * 
		 */
		public function set compId(value:Number):void
		{
			this._compId = value;
		}
		/**
		 * 
		 * @return templateName
		 * 
		 */
		public function get templateName():String
		{
			return _templateName;	
		}
		/**
		 * 
		 * @param value templateName
		 * 
		 */
		public function set templateName(value:String):void
		{
			this._templateName = value;
		}
		/**
		 * 
		 * @return list of configurations specified in the template
		 * 
		 */
		public function get configurations():ArrayCollection
		{
			return _configurations;
		}
		public function set configurations(value:ArrayCollection):void
		{
			this._configurations = value;
		}
		/**
		 * 
		 * @return createdBy
		 * 
		 */
		public function get createdBy():String
		{
			return this._createdBy;
		}
		/**
		 * 
		 * @param value set createdBy
		 * 
		 */
		public function set createdBy(value:String):void
		{
			this._createdBy = value;
		}
		/**
		 * 
		 * @return createdDate
		 * 
		 */
		public function get createdDate():Date
		{
			return this._createdDate;
		}
		/**
		 * 
		 * @param value set createdDate
		 * 
		 */
		public function set createdDate(value:Date):void
		{
			this._createdDate = value;
		}
		/**
		 * 
		 * @return modifiedBy
		 * 
		 */
		public function get modifiedBy():String
		{
			return this._modifiedBy;
		}
		/**
		 * 
		 * @param value set modifiedBy
		 * 
		 */
		public function set modifiedBy(value:String):void
		{
			this._modifiedBy = value;
		}
		/**
		 * 
		 * @return modifiedDate
		 * 
		 */
		public function get modifiedDate():Date
		{
			return this._modifiedDate;
		}
		/**
		 * 
		 * @param value set modifiedDate
		 * 
		 */
		public function set modifiedDate(value:Date):void
		{
			this._modifiedDate = value;
		}

	}
}