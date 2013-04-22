package com.headstrong.teevra.client.view.entity
{
	import mx.collections.ArrayCollection;
	
	[RemoteClass(alias="com.headstrong.teevra.services.processadmin.eo.MessageEventlogEO")]
	[Bindable]
	public class MessageEventlogVO
	{

		/**
		 *Unique identifier for the message event log 
		 */
		private var _messageEventlogId:Number;
		/**
		 *Identifies the process instance that has raised this message event log 
		 */
		private var _prcsRunId:Number;	
		/**
		 *Identifier of the Message for the process run 
		 */
		private var _messageId:Number;
		/**
		 *Sequence Identifier of the message 
		 */
		private var _sequenceId:Number;	
		/**
		 *Total sequence number 
		 */
		private var _totalSequence:Number;
		/**
		 *Savepoint status of the message
		*/
		private var _savepointName:String;	
		/**
		 * The time when the message saves
		 */
		private var _savepointTime:Date;
		/**
		 *Log message on save 
		 */
		private var _logMessage:String;	
		/**
		 * Message Data 
		 */
		private var _messageData:String;	
		/**
		 *User name who created the process version 
		 */
		private var _createdBy:String;	
		/**
		 *Time when created the process version 
		 */
		private var _createdDate:Date;	
		/**
		 *User name who modified the process version 
		 */
		private var _modifiedBy:String;
		/**
		 *Time when modified the process version 
		 */
		private var _modifiedDate:Date;
		/**
		 * Unique identifier for the process 
		 */
		private var _prcsId:Number;
		/**
		 *Name of the process 
		 */
		private var _prcsName:String;

	
		/**
		 * 
		 * @return messageEventlogId
		 * 
		 */
		public function get messageEventlogId():Number
		{
			return _messageEventlogId;
		}

		/**
		 * 
		 * @param value set messageEventlogId
		 * 
		 */
		public function set messageEventlogId(value:Number):void
		{
			_messageEventlogId = value;
		}
		
		/**
		 * 
		 * @return prcsRunId
		 * 
		 */
		public function get prcsRunId():Number
		{
			return _prcsRunId;
		}

		/**
		 * 
		 * @param value set prcsRunId
		 * 
		 */
		public function set prcsRunId(value:Number):void
		{
			_prcsRunId= value;
		}
		
		/**
		 * 
		 * @return messageId
		 * 
		 */
		public function get messageId():Number
		{
			return _messageId;
		}

		/**
		 * 
		 * @param value set messageId
		 * 
		 */
		public function set messageId(value:Number):void
		{
			_messageId = value;
		}
		
		/**
		 * 
		 * @return sequenceId
		 * 
		 */
		public function get sequenceId():Number
		{
			return _sequenceId;
		}

		/**
		 * 
		 * @param value set sequenceId
		 * 
		 */
		public function set sequenceId(value:Number):void
		{
			_sequenceId = value;
		}
	
		/**
		 * 
		 * @return totalSequence
		 * 
		 */
		public function get totalSequence():Number
		{
			return _totalSequence;
		}

		/**
		 * 
		 * @param value set totalSequence
		 * 
		 */
		public function set totalSequence(value:Number):void
		{
			_totalSequence = value;
		}
		
		/**
		 * 
		 * @return savepointName
		 * 
		 */
		public function get savepointName():String
		{
			return _savepointName;
		}

		/**
		 * 
		 * @param value set savepointName
		 * 
		 */
		public function set savepointName(value:String):void
		{
			_savepointName = value;
		}

		/**
		 * 
		 * @return savepointTime
		 * 
		 */
		public function get savepointTime():Date
		{
			return _savepointTime;
		}

		/**
		 * 
		 * @param value set savepointTime
		 * 
		 */
		public function set savepointTime(value:Date):void
		{
			_savepointTime = value;
		}
		
		/**
		 * 
		 * @return logMessage
		 * 
		 */
		public function get logMessage():String
		{
			return _logMessage;
		}

		/**
		 * 
		 * @param value set logMessage
		 * 
		 */
		public function set logMessage(value:String):void
		{
			_logMessage = value;
		}
		
		/**
		 * 
		 * @return messageData
		 * 
		 */
		public function get messageData():String
		{
			return _messageData;
		}

		/**
		 * 
		 * @param value set messageData
		 * 
		 */
		public function set messageData(value:String):void
		{
			_messageData = value;
		}
		/**
		 * 
		 * @return createdBy
		 * 
		 */
		public function get createdBy():String
		{
			return _createdBy;
		}

		/**
		 * 
		 * @param value set createdBy
		 * 
		 */
		public function set createdBy(value:String):void
		{
			_createdBy = value;
		}

		/**
		 * 
		 * @return get createdDate
		 * 
		 */
		public function get createdDate():Date
		{
			return _createdDate;
		}

		/**
		 * 
		 * @param value set createdDate
		 * 
		 */
		public function set createdDate(value:Date):void
		{
			_createdDate = value;
		}
		
		/**
		 * 
		 * @return modifiedBy
		 * 
		 */
		public function get modifiedBy():String
		{
			return _modifiedBy;
		}

		/**
		 * 
		 * @param value set modifiedBy
		 * 
		 */
		public function set modifiedBy(value:String):void
		{
			_modifiedBy = value;
		}

		/**
		 * 
		 * @return modifiedDate
		 * 
		 */
		public function get modifiedDate():Date
		{
			return _modifiedDate;
		}

		/**
		 * 
		 * @param value set modifiedDate
		 * 
		 */
		public function set modifiedDate(value:Date):void
		{
			_modifiedDate = value;
		}
		
		/**
		 * 
		 * @return prcsId
		 * 
		 */
		public function get prcsId():Number
		{
			return _prcsId;
		}

		/**
		 * 
		 * @param value set prcsId
		 * 
		 */
		public function set prcsId(value:Number):void
		{
			_prcsId = value;
		}
		
		/**
		 * 
		 * @return prcsName
		 * 
		 */
		public function get prcsName():String
		{
			return _prcsName;
		}

		/**
		 * 
		 * @param value set prcsName
		 * 
		 */
		public function set prcsName(value:String):void
		{
			_prcsName = value;
		}

	}
}
