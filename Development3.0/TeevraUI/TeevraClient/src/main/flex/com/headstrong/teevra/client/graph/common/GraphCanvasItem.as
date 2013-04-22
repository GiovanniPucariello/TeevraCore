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
 * $Id: CanvasItem.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Feb 26, 2009  
 */
package com.headstrong.teevra.client.graph.common
{
	import flash.events.ContextMenuEvent;
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.containers.VBox;
	import mx.controls.Alert;
	import mx.events.ModuleEvent;
	
	public class GraphCanvasItem extends VBox
	{
		
		private var _fromLines:ArrayCollection = new ArrayCollection();
	    private var _toLines:ArrayCollection = new ArrayCollection();
	    private var _fromCurveLines:ArrayCollection = new ArrayCollection();
	    private var _toCurveLines:ArrayCollection = new ArrayCollection();
	    private var _designer:Designer;
		
		public function GraphCanvasItem()
		{
			super();
			this.setStyle("borderStyle", "none");
		}
		/*(Redmine Feature #589) x and y represents image coordinates in canvas window which will be concatenated with image ID property 
	so that each image can be uniquely identified by Ranorex*/
		public function addItems(x:int,y:int ):void
		{
		
		}
		public function rightClickEvent():void
		{
			
		}
				
		public function create(x:int,y:int,id:String):void
		{
			 this.x = x;
		     this.y = y;
		     this.id = id;
		     		     

		     this.addEventListener(MouseEvent.MOUSE_DOWN,mouseDown);
		     this.addEventListener(MouseEvent.MOUSE_MOVE,mouseMove);
		     this.addEventListener(MouseEvent.MOUSE_UP,mouseUp);
		     this.addEventListener(MouseEvent.CLICK,mouseClick);
		     this.addEventListener(MouseEvent.MOUSE_OVER,mouseOver);
		     this.addEventListener(MouseEvent.MOUSE_OUT,mouseOut);
		     
		}
		public function handleError(event:ModuleEvent):void
		{
			Alert.show(event.errorText,"Error");
			
		}
		public function mouseOut(event:MouseEvent):void
	    {
	   		//this.setStyle("borderStyle", "none");	   	
	    }
		public function mouseOver(event:MouseEvent):void
	    {
		  // 	this.setStyle("backgroundColor","#F1F1F1");
		   	//this.setStyle("borderStyle", "solid");
		   	//this.setStyle("borderThickness",2);
	    }
	    public function mouseClick(event:MouseEvent):void
	    {
		   	
	    }
	    public function mouseDoubleClick(event:ContextMenuEvent):void{

	    }
	    public function mouseDown(event:MouseEvent):void{
	    	
	    }
	    public function mouseMove(event:MouseEvent):void{
	    	
	    }
	    public function mouseUp(event:MouseEvent):void{
	    	
	    }
	    public function get fromLines():ArrayCollection
		{
			return _fromLines;
		}
		
		public function set fromLines(lines:ArrayCollection):void
		{
			this._fromLines = lines;
		}
		public function get fromCurveLines():ArrayCollection
		{
			return _fromCurveLines;
		}
		
		public function set fromCurveLines(lines:ArrayCollection):void
		{
			this._fromCurveLines = lines;
		}
		public function get toCurveLines():ArrayCollection
		{
			return _toCurveLines;
		}
		
		public function set toCurveLines(lines:ArrayCollection):void
		{
			this._toCurveLines = lines;
		}

		public function get toLines():ArrayCollection
		{
			return _toLines;
		}
		
		public function set toLines(lines:ArrayCollection):void
		{
			this._toLines = lines;
		}
		
		
		public function addFromLine(fromLine:Line):void{
	      this.fromLines.addItem(fromLine);
	    }
	    public function addToLine(toLine:Line):void{
	      this.toLines.addItem(toLine);
	    }
	    public function addFromCurve(fromLine:Line):void
	    {
	    	this._fromCurveLines.addItem(fromLine);
	    }
	    public function addToCurve(toLine:Line):void
	    {
	    	this._toCurveLines.addItem(toLine);
	    }
	    public function getFromLines():ArrayCollection{
	      return this.fromLines;
	    }
	    public function getToLines():ArrayCollection{
	      return this.toLines;
	    }
	    public function getWidth():int{
	      return this.width;
	    }
	    public function getHeight():int{
	      return this.height;
	    }
	     public function setWidth(value:int):void{
	     	this.width = value;
	    }
	    public function setHeight(value:int):void{
	      this.height = value;
	    }
	    
	    public function getX():int{
	      return this.x;
	    }
	    
	    public function getY():int{
	      return this.y;
	    }
	    
		public function set designer(value:Designer):void
	    {
	      this._designer = value;
	    }
	    public function get designer():Designer
		{
			return _designer;
		}
	}
}