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
 * $Id: ComponentConfigurationVO.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Oct 21, 2008  
 */
package com.headstrong.teevra.client.graph.model
{
	[RemoteClass(alias="com.headstrong.teevra.services.component.eo.ComponentConfigEO")]
	[Bindable]
	/**
	 * ComponentConfigurationVO's properties
	 * @author PAakash
	 * 
	 */
	public class ComponentConfigurationVO
	{
		/**
		 *Uniquely identifies a component�??s configuration 
		 */
		private var _compConfigId :Number;
		/**
		 *Associates the configuration to the component 
		 */
		private var _compId :Number;
		/**
		 *Sequence number of the configuration of the component 
		 */
		private var _configSequenceNumber :Number;
		/**
		 *Key that uniquely identifies this configuration within the component 
		 */
		private var _configKey :String;
		/**
		 *Type of configuration. This also identifies the type of value that can be
	 	 * set to this configuration.	 
		 */
		private var _configType :String;
		/**
		 * This can be used by the system while building the UI. For example, if a
	 	 * particular configuration can take values from a list, the same can be
	     * specified here. 
		 */
		private var _configReferences :String;
		/**
		 *Configuration path 
		 */
		private var _cofigLabel :String;
		/**
		 *User name who created the Configuration 
		 */
		private var _createdBy :String;
		/**
		 *Time when created the Configuration 
		 */
		private var _createdDate :Date;
		/**
		 *User name who modified the Configuration 
		 */
		private var _modifiedBy :String;
		/**
		 *Time when modified the Configuration 
		 */
		private var _modifiedDate:Date;
		
		/**
		 *getting the component config id 
		 * @return 
		 * 
		 */
		public function get compConfigId():Number
		{
			return this.compConfigId;
		}
		/**
		 * setting the component config id 
		 * @param value
		 * 
		 */
		public function set compConfigId(value:Number):void
		{
			this._compConfigId = value;
		}
		/**
		 *getting the compId 
		 * @return 
		 * 
		 */
		public function get compId():Number
		{
			return this._compId;
		}
		/**
		 *setting the compId 
		 * @param value
		 * 
		 */
		public function set compId(value:Number):void
		{
			this._compId = value;
		}
		/**
		 *getting the  configSequenceNumber
		 * @return 
		 * 
		 */
		public function get configSequenceNumber():Number
		{
			return this._configSequenceNumber;
		}
		/**
		 *setting the configSequenceNumber 
		 * @param value
		 * 
		 */
		public function set configSequenceNumber(value:Number):void
		{
			this._configSequenceNumber = value;
		}
		/**
		 *getting the  configKey
		 * @return 
		 * 
		 */
		public function get configKey():String
		{
			return this._configKey;
		}
		/**
		 *setting the configKey 
		 * @param value
		 * 
		 */
		public function set configKey(value:String):void
		{
			this._configKey = value;
		}
		/**
		 *getting the configType 
		 * @return 
		 * 
		 */
		public function get configType():String
		{
			return this._configType;
		}
		/**
		 *setting the configTyp 
		 * @param value
		 * 
		 */
		public function set configType(value:String):void
		{
			this._configType = value;
		}
		/**
		 *getting the  configReferences
		 * @return 
		 * 
		 */
		public function get configReferences():String
		{
			return this._configReferences;
		}
		/**
		 *setting the configReferences 
		 * @param value
		 * 
		 */
		public function set configReferences(value:String):void
		{
			this._configReferences = value;
		}
		/**
		 *getting the  cofigLabel
		 * @return 
		 * 
		 */
		public function get cofigLabel():String
		{
			return this._cofigLabel;
		}
		/**
		 *setting the cofigLabel 
		 * @param value
		 * 
		 */
		public function set cofigLabel(value:String):void
		{
			this._cofigLabel = value;
		}
		/**
		 *getting the  createdBy
		 * @return 
		 * 
		 */
		public function get createdBy():String
		{
			return this._createdBy;
		}
		/**
		 *setting the createdBy 
		 * @param value
		 * 
		 */
		public function set createdBy(value:String):void
		{
			this._createdBy = value;
		}
		/**
		 *getting the createdDate 
		 * @return 
		 * 
		 */
		public function get createdDate():Date
		{
			return this._createdDate;
		}
		/**
		 *setting the createdDate 
		 * @param value
		 * 
		 */
		public function set createdDate(value:Date):void
		{
			this._createdDate = value;
		}
		/**
		 *getting the modifiedBy 
		 * @return 
		 * 
		 */
		public function get modifiedBy():String
		{
			return this._modifiedBy;
		}
		/**
		 *setting the modifiedBy 
		 * @param value
		 * 
		 */
		public function set modifiedBy(value:String):void
		{
			this._modifiedBy = value;
		}
		/**
		 *getting the modifiedDate 
		 * @return 
		 * 
		 */
		public function get modifiedDate():Date
		{
			return this._modifiedDate;
		}
		/**
		 *setting the modifiedBy 
		 * @param value
		 * 
		 */
		public function set modifiedDate(value:Date):void
		{
			this._modifiedDate = value;
		}
		
	}
}