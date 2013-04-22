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
 * $Id: FileUploaderEvent.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Dec , 2008  
 */
package com.headstrong.teevra.client.events
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import flash.events.Event;
	import flash.utils.ByteArray;
	
	/**
	 * FileUploaderEvent for handling the fild upload event
	 * @author PAakash
	 * 
	 */
	public class FileUploaderEvent extends CairngormEvent
	{
		public static const FILEUPLOADEREVENT:String = "File Uploader Event";
		private var _fileName:String;
		private var _byteData:ByteArray;
		/**
		 * FileUploaderEvent constructor 
		 * setting both the file name and byte data of the file 
		 * @param name
		 * @param byteData
		 * 
		 */
		public function FileUploaderEvent(name:String,byteData:ByteArray)
		{
			this._fileName =name;// "services.message.formatter.xml-0.0.1-A";
			this._byteData = byteData;
			super(FILEUPLOADEREVENT);
		}
		
		/**
		 * getting the fileName
		 * @return filename
		 * 
		 */
		public function get fileName():String
		{
			return this._fileName;
		}
		/**
		 *setting the fileName 
		 * @param value set fileName
		 * 
		 */
		public function set fileName(value:String):void
		{
			this._fileName = value;
		}
		/**
		 *getting the byteData 
		 * @return byteData
		 * 
		 */
		public function get byteData():ByteArray
		{
			return this._byteData;
		}
		/**
		 * setting the byteData 
		 * @param value set byteData
		 * 
		 */
		public function set byteData(value:ByteArray):void
		{
			this._byteData = value;
		}

	}
}