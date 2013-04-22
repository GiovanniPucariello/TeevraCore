package com.headstrong.teevra.client.view.entity
{
	import com.headstrong.teevra.client.graph.model.ProcessGraphVO;
	
	[RemoteClass(alias="com.headstrong.teevra.services.process.eo.ProcessEO")]
	[Bindable]
	public class ProcessVO
	{
		public static const STATIC_STATUS_NEW:String = "NEW";
		public static const STATIC_STATUS_PUBLISHED:String = "PUBLISHED";
		public static const STATIC_STATUS_UNPUBLISHED:String = "UNPUBLISHED";
		public static const STATIC_STATUS_PUBLISHED_MODIFIED:String = "PUBLISHED_MODIFIED";
		public static const STATIC_STATUS_LOCKED:String = "LOCKED";
		public static const RUNTIME_STATUS_STARTING:String = "STARTING";
		public static const RUNTIME_STATUS_RUNNING:String = "RUNNING";
		public static const RUNTIME_STATUS_STOPPED:String = "STOPPED";
		public static const RUNTIME_STATUS_ERROR:String = "ERROR";
		
		/**
		 * Unique identifier for a process 
		 */
		private var _prcsId:Number;
		/**
		 *Unique name for the process 
		 */
		private var _prcsName:String;
		/**
		 * Details on the process like rationale / objective 
		 */
		private var _prcsDesc:String ;
		/**
		 *Status of the process â�?��?? NEW, UNPUBLISHED, PUBLISHED, PUBLISHED_MODIFIED,LOCKED 
		 */
		private var _prcsStatus:String="UNPUBLISHED";
		
		/**
		 * Runtime status of the process RUNNING, STOPPED, ERROR, STARTING. 
		 * Null implies the process is not yet running
		 */
		private var _prcsRunStatus:String=null;
		/**
		 *If true the process is a template, else not 
		 */
		private var _prcsIsTemplate:Boolean;
		/**
		 * Group id of the process 
		 */
		private var _prcsGrpId:Number;
		/**
		 *Latest or current version of the process 
		 */
		private var _prcsLatestVersionId:Number;
		/**
		 *User name who created the Process 
		 */
		private var _createdBy:String;
		/**
		 *Time when created the Process 
		 */
		private var _createdDate:Date;
		/**
		 * User name who modified the Process 
		 */
		private var _modifiedBy:String;
		/**
		 *Time when modified the Process 
		 */
		private var _modifiedDate:Date;
		/**
		 * Boolean flag to identify if recovery 
		 * should be enabled or not. 
		 */
		private var _prcsRecoveryEnabled:Boolean=true;
		/**
		 * Boolean flag to identify if process level event logs are required for the process
		 */
		private var _prcsEventLogReqd:Boolean=true;
		/**
		 * Boolean flag to identify if message level event logs are required for the process 
		 */
		private var _msgEventLogReqd:Boolean=true;
		/**
		 * Boolean flag to identify if component level event logs are required for the process 
		 */
		private var _compEventLogReqd:Boolean=false;
		/**
		 * Process model graph 
		 */
		private var _graph : ProcessGraphVO;
		/**
		 * Throttle time in milliseconds
		 */
		private var _throttleTime : Number;
		/**
		 * Number of messages to throttle
		 */
		private var _throttleMsgCount : Number;
		
		public function get prcsId():Number
		{
			return this._prcsId
		}
		public function set prcsId(value:Number):void
		{
			this._prcsId = value;
		}
		public function get prcsName():String
		{
			return this._prcsName
		}
		public function set prcsName(value:String):void
		{
			this._prcsName = value;
		}
		public function get prcsDesc():String
		{
			return this._prcsDesc
		}
		public function set prcsDesc(value:String):void
		{
			this._prcsDesc = value;
		}
		public function get prcsStatus():String
		{
			return this._prcsStatus
		}
		public function set prcsStatus(value:String):void
		{
			this._prcsStatus = value;
		} 
		public function get prcsRunStatus():String
		{
			return this._prcsRunStatus
		}
		public function set prcsRunStatus(value:String):void
		{
			this._prcsRunStatus = value;
		} 
		public function get prcsIsTemplate():Boolean
		{
			return this._prcsIsTemplate
		}
		public function set prcsIsTemplate(value:Boolean):void
		{
			this._prcsIsTemplate = value;
		} 
		public function get prcsGrpId():Number
		{
			return this._prcsGrpId
		}
		public function set prcsGrpId(value:Number):void
		{
			this._prcsGrpId = value;
		} 
		public function get prcsLatestVersionId():Number
		{
			return this._prcsLatestVersionId
		}
		public function set prcsLatestVersionId(value:Number):void
		{
			this._prcsLatestVersionId = value;
		} 
		public function get createdDate():Date
		{
			return this._createdDate
		}
		public function set createdDate(value:Date):void
		{
			this._createdDate = value;
		} 
		public function get createdBy():String
		{
			return this._createdBy
		}
		public function set createdBy(value:String):void
		{
			this._createdBy = value;
		} 
		public function get modifiedDate():Date
		{
			return this._modifiedDate
		}
		public function set modifiedDate(value:Date):void
		{
			this._modifiedDate = value;
		} 
		public function get modifiedBy():String
		{
			return this._modifiedBy
		}
		public function set modifiedBy(value:String):void
		{
			this._modifiedBy = value;
		} 		
		public function get graph():ProcessGraphVO
		{
			return this._graph
		}
		public function set graph(value:ProcessGraphVO):void
		{
			this._graph = value;
		}
		
		public function get prcsRecoveryEnabled():Boolean
		{
			return this._prcsRecoveryEnabled;
		}
		public function set prcsRecoveryEnabled(value:Boolean):void
		{
			this._prcsRecoveryEnabled = value;
		} 
		public function get prcsEventLogReqd():Boolean
		{
			return this._prcsEventLogReqd;
		}
		public function set prcsEventLogReqd(value:Boolean):void
		{
			this._prcsEventLogReqd = value;
		} 
		public function get msgEventLogReqd():Boolean
		{
			return this._msgEventLogReqd;
		}
		public function set msgEventLogReqd(value:Boolean):void
		{
			this._msgEventLogReqd = value;
		} 
		public function get compEventLogReqd():Boolean
		{
			return this._compEventLogReqd;
		}
		public function set compEventLogReqd(value:Boolean):void
		{
			this._compEventLogReqd = value;
		} 
		 	
		/**
		 * Determine if the user can edit the process or not
		 */
		public function isProcessEditable():Boolean {
			if (prcsStatus == STATIC_STATUS_LOCKED)
			{
				return false;	
			}
//			if ((prcsRunStatus == RUNTIME_STATUS_RUNNING) || (prcsRunStatus == RUNTIME_STATUS_STARTING))
//				return false;
			return true;
		}
		
		public function get throttleTime():Number
		{
			return this._throttleTime;
		}
		public function set throttleTime(value:Number):void
		{
			this._throttleTime = value;
		}
		
		public function get throttleMsgCount():Number
		{
			return this._throttleMsgCount;
		}
		public function set throttleMsgCount(value:Number):void
		{
			this._throttleMsgCount = value;
		}

	}
}