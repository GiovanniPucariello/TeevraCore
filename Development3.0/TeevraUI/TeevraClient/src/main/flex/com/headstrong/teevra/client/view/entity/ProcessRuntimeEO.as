package com.headstrong.teevra.client.view.entity
{
	[RemoteClass(alias="com.headstrong.teevra.services.process.vo.ProcessStatusVO")]
	[Bindable]
	public class ProcessRuntimeEO
	{
		/**
		 *unique Prcs Id 
		 */
		private var _prcsId:Number;
		/**
		 *identify the process name 
		 */
		private var _prcsName:String;
		/**
		 *identify the process status 
		 */
		private var _prcsStatus:String ;
		/**
		 *process run sequence  
		 */
		private var _prcsRunSequence :int;
		/**
		 *process run  status
		 */
		private var _prcsRunStatus :String;
		/**
		 *prorcess run start time 
		 */
		private var _prcsRunStartTime :Date;
		/**
		 *process run stop time 
		 */
		private var _prcsRunStopTime :Date;
		/**
		 *process message received 
		 */
		private var _prcsMsgsRecd :Number;
		/**
		 *number of error process message 
		 */
		private var _prcsMsgsError :Number;
		/**
		 *number of processed message 
		 */
		private var _prcsMsgsProcessed:Number;
		/**
		 *Id of the server the process is registered to
		 */
		private var _serverId:Number;
		/**
		 *Name of the server the process is registered to 
		 */
		private var _serverName:String;
	
		/**
		 * 
		 * @return prcsId
		 * 
		 */
		public function get prcsId():Number
		{
			return this._prcsId;
		}
		/**
		 * 
		 * @param value set prcsId
		 * 
		 */
		public function set prcsId(value:Number):void
		{
			this._prcsId = value;
		}
		/**
		 * 
		 * @return prcsName
		 * 
		 */
		public function get prcsName():String
		{
			return this._prcsName;
		}
		/**
		 * 
		 * @param value set prcsName
		 * 
		 */
		public function set prcsName(value:String):void
		{
			this._prcsName = value;
		}
		/**
		 * 
		 * @return prcsStatus
		 * 
		 */
		public function get prcsStatus():String
		{
			return this._prcsStatus;
		}
		/**
		 * 
		 * @param value set prcsStatus
		 * 
		 */
		public function set prcsStatus(value:String):void
		{
			this._prcsStatus = value;
		}
		/**
		 * 
		 * @return prcsRunSequence
		 * 
		 */
		public function get prcsRunSequence():int
		{
			return this._prcsRunSequence;
		}
		/**
		 * 
		 * @param value set prcsRunSequence
		 * 
		 */
		public function set prcsRunSequence(value:int):void
		{
			this._prcsRunSequence = value;
		}
		/**
		 * 
		 * @return prcsRunStatus
		 * 
		 */
		public function get prcsRunStatus():String
		{
			return this._prcsRunStatus;
		}
		/**
		 * 
		 * @param value set prcsRunStatus
		 * 
		 */
		public function set prcsRunStatus(value:String):void
		{
			this._prcsRunStatus = value;
		}
		/**
		 * 
		 * @return prcsRunStartTime
		 * 
		 */
		public function get prcsRunStartTime():Date
		{
			return this._prcsRunStartTime;
		}
		/**
		 * 
		 * @param value set prcsRunStartTime
		 * 
		 */
		public function set prcsRunStartTime(value:Date):void
		{
			this._prcsRunStartTime = value;
		}
		/**
		 * 
		 * @return prcsRunStopTime
		 * 
		 */
		public function get prcsRunStopTime():Date
		{
			return this._prcsRunStopTime;
		}
		/**
		 * 
		 * @param value set prcsRunStopTime
		 * 
		 */
		public function set prcsRunStopTime(value:Date):void
		{
			this._prcsRunStopTime = value;
		}
		/**
		 * 
		 * @return prcsMsgsRecd
		 * 
		 */
		public function get prcsMsgsRecd():Number
		{
			return this._prcsMsgsRecd;
		}
		/**
		 * 
		 * @param value set prcsMsgsRecd
		 * 
		 */
		public function set prcsMsgsRecd(value:Number):void
		{
			this._prcsMsgsRecd = value;
		}
		/**
		 * 
		 * @return prcsMsgsError
		 * 
		 */
		public function get prcsMsgsError():Number
		{
			return this._prcsMsgsError;
		}
		/**
		 * 
		 * @param value set prcsMsgsError
		 * 
		 */
		public function set prcsMsgsError(value:Number):void
		{
			this._prcsMsgsError = value;
		}
		/**
		 * 
		 * @return prcsMsgsProcessed
		 * 
		 */
		public function get prcsMsgsProcessed():Number
		{
			return this._prcsMsgsProcessed;
		}
		/**
		 * 
		 * @param value set prcsMsgsProcessed
		 * 
		 */
		public function set prcsMsgsProcessed(value:Number):void
		{
			this._prcsMsgsProcessed = value;
		}
	
			/**
		 * 
		 * @return serverId
		 * 
		 */
		public function get serverId():Number
		{
			return this._serverId;
		}
		/**
		 * 
		 * @param value set serverId
		 * 
		 */
		public function set serverId(value:Number):void
		{
			this._serverId = value;
		}
		/**
		 * 
		 * @return serverName
		 * 
		 */
		public function get serverName():String
		{
			return this._serverName;
		}
		/**
		 * 
		 * @param value set serverName
		 * 
		 */
		public function set serverName(value:String):void
		{
			this._serverName = value;
		}
		
		
	}
}