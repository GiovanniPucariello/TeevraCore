/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright �?© 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: GraphCanvas.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Feb 26, 2009  
 */
package com.headstrong.teevra.client.graph.common
{
	import mx.containers.Canvas;
	import mx.events.DragEvent;
	import mx.managers.DragManager;
	
	public class GraphCanvas extends Canvas
	{
		private var _designer:Designer;
		
		public function GraphCanvas()
		{
			super();
			this.horizontalScrollPolicy="on";
			this.verticalScrollPolicy="on";
			this.setStyle("borderStyle","solid");
//			this.setStyle("backgroundColor","#F1F1F1");
//			this.setStyle("backgroundColor","#808080");
			this.setStyle("backgroundColor","#FFFFFF");
		}
		
		public function pictureDragEnter(event:DragEvent):void
		{
      		DragManager.acceptDragDrop(Canvas(event.target));         
    	}
    	public function pictureDragDrop(event:DragEvent):void
    	{
    	}
    	public function connectItems(startNodeId:String, endNodeId:String, startX:Number, startY:Number, endX:Number, endY:Number):void
		{
		}
		public function getId(type:String):String
		{
      		var idString:String  = type + Math.round(Math.random()*10000).toString();
      		return idString;
    	}    		
		public function get designer():Designer
	  	{
	  		return _designer;
	  	}
	  	public function set designer(value:Designer):void
	  	{
	  		this._designer = value;
	  	}
	}
}