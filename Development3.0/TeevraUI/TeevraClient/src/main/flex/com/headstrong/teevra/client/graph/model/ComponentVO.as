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
	import flash.utils.ByteArray;
	
	import mx.collections.ArrayCollection;
	[RemoteClass(alias="com.headstrong.teevra.services.component.eo.ComponentEO")]
	[Bindable]
	/**
	 * ComponentVO's propertied
	 * @author PAakash
	 * 
	 */
	public class ComponentVO
	{
		/**
		 *Unique identifier for a component in the system. This id is independent
	 	 * of its instances that are placed in a process model 
		 */
		private var _compId :Number;
		/**
		 *Name of the component 
		 */
		private var _compName :String;
		/**
		 * Name as used by the component while registering with the server 
		 */
		private var _compServiceName :String;		
		/**
		 *Version of the component 
		 */
		private var _compVerId :String;
		/**
		 * Status of the component: ACTIVE / INACTIVE. Enums can be used 
		 */
		private var _compStatus :String;
		/**
		 *Type of component �?? FUNCTIONAL / CONNECTOR 
		 */
		private var _compType:String;
		/**
		 *: Desrcibes the component 
		 */
		private var _compDesc:String;
		/**
		 * time when the component is deployed 
		 */
		private var _compDeployDate :Date;
		/**
		 *time when the component is undeployed 
		 */
		private var _compUndeployDate :Date;
		/**
		 * Reference to the component�??s image. 
		 */
		private var _compImageRef :String;
		/**
		 * Name of the swf on the UI side 
		 */
		private var _compConfigUI :String;
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
		 *List of ComponentConfigEOs which are related with ComponentEO in
	 	 * oneToMany fashion 
		 */
		private var _compConfigList:ArrayCollection;
		/**
		 *file name 
		 */
		private var _fileName:String;
		/**
		 *byte data for the file contents 
		 */
		private var _byteData:ByteArray;
		
		/**
		 * 
		 * @return compId
		 * 
		 */
		public function get compId():Number
		{
			return this._compId;
		}
		/**
		 * 
		 * @param value set compId
		 * 
		 */
		public function set compId(value:Number):void
		{
			this._compId = value;
		}
		/**
		 * 
		 * @return compName
		 * 
		 */
		public function get compName():String
		{
			return this._compName;
		}
		/**
		 * 
		 * @param value set compName
		 * 
		 */
		public function set compName(value:String):void
		{
			this._compName = value;
		}
		/**
		 * 
		 * @return compServiceName
		 * 
		 */
		public function get compServiceName():String
		{
			return this._compServiceName;
		}
		/**
		 * 
		 * @param value set compServiceNam
		 * 
		 */
		public function set compServiceName(value:String):void
		{
			this._compServiceName = value;
		}
		/**
		 * 
		 * @return compVerId
		 * 
		 */
		public function get compVerId():String
		{
			return this._compVerId;
		}
		/**
		 * 
		 * @param value set compVerId
		 * 
		 */
		public function set compVerId(value:String):void
		{
			this._compVerId = value;
		}
		/**
		 * 
		 * @return compStatus
		 * 
		 */
		public function get compStatus():String
		{
			return this._compStatus;
		}
		/**
		 * 
		 * @param value set compStatus
		 * 
		 */
		public function set compStatus(value:String):void
		{
			this._compStatus = value;
		}
		/**
		 * 
		 * @return compType
		 * 
		 */
		public function get compType():String
		{
			return this._compType;
		}
		/**
		 * 
		 * @param value set compType
		 * 
		 */
		public function set compType(value:String):void
		{
			this._compType = value;
		}
		/**
		 * 
		 * @return compDesc
		 * 
		 */
		public function get compDesc():String
		{
			return this._compDesc;
		}
		/**
		 * 
		 * @param value set compDes
		 * 
		 */
		public function set compDesc(value:String):void
		{
			this._compDesc = value;
		}
		/**
		 * 
		 * @return compDeployDate
		 * 
		 */
		public function get compDeployDate():Date
		{
			return this._compDeployDate;
		}
		/**
		 * 
		 * @param value set compDeployDate
		 * 
		 */
		public function set compDeployDate(value:Date):void
		{
			this._compDeployDate = value;
		}
		/**
		 * 
		 * @return compImageRef
		 * 
		 */
		public function get compImageRef():String
		{
			return this._compImageRef;
		}
		/**
		 * 
		 * @param value set compImageRef
		 * 
		 */
		public function set compImageRef(value:String):void
		{
			this._compImageRef = value;
		}
		/**
		 * 
		 * @return compConfigUI
		 * 
		 */
		public function get compConfigUI():String
		{
			return this._compConfigUI;
		}
		/**
		 * 
		 * @param value set compConfigU
		 * 
		 */
		public function set compConfigUI(value:String):void
		{
			this._compConfigUI = value;
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
		/**
		 * 
		 * @return compConfigList
		 * 
		 */
		public function get compConfigList():ArrayCollection
		{
			return this._compConfigList;
		}
		/**
		 * 
		 * @param value set compConfigList
		 * 
		 */
		public function set compConfigList(value:ArrayCollection):void
		{
			this._compConfigList = value;
		}
		/**
		 * 
		 * @return fileName
		 * 
		 */
		public function get fileName():String
		{
			return this._fileName;
		}
		/**
		 * 
		 * @param value set fileName
		 * 
		 */
		public function set fileName(value:String):void
		{
			this._fileName = value;
		}
		/**
		 * 
		 * @return byteData
		 * 
		 */
		public function get byteData():ByteArray
		{
			return this._byteData;
		}
		/**
		 * 
		 * @param value set the byteDate
		 * 
		 */
		public function set byteData(value:ByteArray):void
		{
			this._byteData = value;
		}
				
		public static const ENDPOINT:String="ENDPOINT";
		public static const PARSER:String="PARSER";
		public static const FORMATTER:String="FORMATTER";
		public static const SERVICE:String="SERVICE";
		public static const ROUTER:String="ROUTER";
		public static const ERRREPORTER:String="ERRORREPORTER";
	}
}