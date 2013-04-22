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
 * $Id: ComponentGraphCanvas.as
 * $Revision: 
 * $Author: PAakash
 * $DateTime: Feb 26, 2009  
 */
package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.common.GraphCanvas;
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	import com.headstrong.teevra.client.graph.model.ProcessServiceVO;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.ProcessVO;
	
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	import mx.controls.TextInput;
	import mx.events.DragEvent;

	
	
	public class ComponentGraphCanvas extends GraphCanvas
	{
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		public function ComponentGraphCanvas()
		{
			super();
			this.addEventListener(DragEvent.DRAG_ENTER, pictureDragEnter);
			this.addEventListener(DragEvent.DRAG_DROP, pictureDragDrop);
		}
		override public function pictureDragDrop(event:DragEvent):void
		{	    	
			var loadedProcess:ProcessVO = modelLocator.loadedProcess;
			// added not to modify the process while it is running
			if(loadedProcess!=null && loadedProcess.prcsStatus == 'LOCKED')
			{
				Alert.show("Process is running. Cannot be modified");
			}
			else
			{
				var x:int = event.currentTarget.mouseX - designer.xOff;
				var y:int = event.currentTarget.mouseY - designer.yOff;
				var initiator:ComponentPaletteItem = ComponentPaletteItem(event.dragInitiator);
				addComponent(initiator.parentComponent, null, x, y);
			}

		}
		public function addComponent(comp:ComponentVO, svcDetails:ProcessServiceVO, x:Number, y:Number):void
		{
	        /*(Redmine Feature #589) x and y represents image coordinates in canvas window which will be concatenated with image ID property 
	         so that each image can be uniquely identified by Ranorex*/
			var item:ComponentGraphCanvasItem = new ComponentGraphCanvasItem(comp, svcDetails, x , y);
			var x:Number = x;
			var y:Number = y;
			var id:String = getId("Box");
			item.create(x,y,id);	
			item.rightClickEvent();			  
			item.designer = designer;		
	      	designer.addBoxItem(item);   
			this.addChild(item);						   
			//var lb:Label=new Label();
			var lb:TextInput =new TextInput();
			lb.editable=false;
			lb.setStyle("borderStyle","none");							
			lb.setStyle("textAlign","center");	
			lb.setStyle("fontSize","10");	
			lb.id=id;
			lb.maxWidth=150;	
			lb.setStyle("backgroundAlpha","0");
			if(item.serviceDetails!=null && item.serviceDetails.serviceId!=null)
			{
				lb.text=item.serviceDetails.serviceId;
			}
			else
			{		
				lb.text=comp.compName;
			}								
			lb.x=x-50;
			lb.y=y+55;
			this.addChild(lb);
			item.labelBag[id]=lb;
			
			
		}
		override public function connectItems(startNodeId:String, endNodeId:String, startX:Number, startY:Number, endX:Number, endY:Number):void
		{
			var canvasItems:ArrayCollection = designer.getBoxList();
			var startBox:ComponentGraphCanvasItem;
			var endBox:ComponentGraphCanvasItem;
			for(var i:int=0;i<canvasItems.length;i++)
			{
				var currentBox:ComponentGraphCanvasItem = ComponentGraphCanvasItem(canvasItems.getItemAt(i));
				var nodeId:String = currentBox.serviceDetails.serviceId;
				
				if (nodeId == startNodeId)
				{
					startBox = currentBox;
				}
				if (nodeId == endNodeId)
				{
					endBox = currentBox;
				}
			}
			if (startBox == null || endBox == null)
			{
				return;
			}
			if(ComponentGraphCanvasItem(endBox).parentComponent.compType==ComponentVO.ERRREPORTER)
        	{
        		designer.color = 0xF77474;
        	}
        	else
        	{
        		designer.color = 0x000000;
        	}
			designer.loadLine(startBox, endBox, startX, startY, endX, endY);
		}
	}
}