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
 * $Id:  Palette.as
 * $Revision:   
 * $Author: PAakash 
 * $DateTime: Feb 26, 2009   
 */
package com.headstrong.teevra.client.graph.common
{
	
	import flash.display.DisplayObject;
	import flash.events.MouseEvent;
	
	import mx.containers.Accordion;
	import mx.containers.Grid;
	import mx.containers.GridRow;
	import mx.containers.Panel;
	import mx.controls.Image;
	
	public class Palette extends Accordion 
	{
    	private var _designer:Designer;
    	private var xOff:Number;
    	private var yOff:Number;	  
		
		public function Palette()
		{
			super();
			this.height=40;
			this.horizontalScrollPolicy = "off";
			this.verticalScrollPolicy = "auto";
		}
		
		public function addItems():void
		{
		}

		public function createGrid():Grid {
			var grid:Grid = new Grid();
			grid.setStyle("backgroundColor","#FFFFFF");
			grid.horizontalScrollBar=null;
			grid.verticalScrollBar=null;
			
			return grid;
		}

		public function addItemToPalette(parentGrid:Grid, parentRow:GridRow, 
			paletteItem:DisplayObject):GridRow {
		
			return null;
		}
		public function addPalettePanel(paletterComp:DisplayObject):void {
			this.addChild(paletterComp);
		}

				
		public function createImage(id:String, source:String):Image {
			var compImage:Image = new Image();
			compImage.id = id;
			compImage.source = source;
			return compImage;
		}

		public function dragPicture(event:MouseEvent):void{
					
	    }      

		public function doDrawEnable(event:MouseEvent):void
		{
			//01-APR-09 AP - added as a part of Bug#4874 : Code Start
			if(designer.getBoxList().length>=2)
			{
				designer.isDrawEnable = true;
			}
			//01-APR-09 AP - added as a part of Bug#4874 : Code End
		}
		public function doCurveEnable(event:MouseEvent):void
		{
			//01-APR-09 AP - added as a part of Bug#4874 : Code Start
			if(designer.getBoxList().length>=1)
			{
				designer.isCurveEnable = true;
			}
			//01-APR-09 AP - added as a part of Bug#4874 : Code End			
		}			
		public function set designer(designer:Designer):void
		{
			this._designer = designer;
		}

		public function get designer():Designer
		{
			return _designer;
		}
	}
}