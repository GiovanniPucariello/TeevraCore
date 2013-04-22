package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.DrawingClasses.StateMachineConnector;
	import com.headstrong.teevra.client.graph.DrawingClasses.StateMachineDesigner;
	import com.headstrong.teevra.client.graph.common.GraphCanvas;
	import com.headstrong.teevra.client.graph.model.StateMachineGraphLinkVO;
	import com.headstrong.teevra.client.graph.model.StateVO;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	
	import mx.collections.ArrayCollection;
	import mx.controls.TextInput;
	import mx.events.DragEvent;

	
	public class StateMachineGraphCanvas extends GraphCanvas
	{
		private var _fromBoxWidth:Number;
		private var _fromBoxHeight:Number;
		private var _toBoxWidht:Number;
		private var _toBoxHeight:Number;
		
		private var _designer:StateMachineDesigner;
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		public function StateMachineGraphCanvas()
		{
			super();
			this.addEventListener(DragEvent.DRAG_ENTER, pictureDragEnter);
			this.addEventListener(DragEvent.DRAG_DROP, pictureDragDrop);
		}
		override public function pictureDragDrop(event:DragEvent):void
		{	    	
				var x:int = event.currentTarget.mouseX - designer.xOff;
				var y:int = event.currentTarget.mouseY - designer.yOff;
				var initiator:StateMachinePaletteItem = StateMachinePaletteItem(event.dragInitiator);
				addState(initiator.stateType,x, y,new StateVO());
		}
		public function addState(stateType:String,x:Number, y:Number,stateVO:StateVO):void
		{
			var item:StateMachineGraphCanvasItem = new StateMachineGraphCanvasItem(stateType,stateVO);
			var x:Number = x;
			var y:Number = y;
			var id:String = getId("stateBox");
			item.create(x,y,id);
			item.rightClickEvent();				  
			item.designer= designer;	
	      	designer.addBoxItem(item);   
			this.addChild(item);
			var lb:TextInput = new TextInput();
			lb.editable=false;
			lb.setStyle("borderStyle","none");							
			lb.setStyle("textAlign","center");	
			lb.setStyle("fontSize","10");	
			lb.id=id;
			lb.maxWidth=150;	
			lb.setStyle("backgroundAlpha","0");
			lb.text=stateType;
			lb.x=x-50;
			lb.y=y+55;
			this.addChild(lb);
			item.labelBag[id]=lb;
		}

		override public function connectItems(startNodeId:String, endNodeId:String, startX:Number, startY:Number, endX:Number, endY:Number):void
		{
			var canvasItems:ArrayCollection = designer.getBoxList();
			var startBox:StateMachineGraphCanvasItem;
			var endBox:StateMachineGraphCanvasItem;
			for(var i:int=0;i<canvasItems.length;i++)
			{
				var currentBox:StateMachineGraphCanvasItem = StateMachineGraphCanvasItem(canvasItems.getItemAt(i));
				var nodeId:String = currentBox.stateVO.stateName;
				
				if (nodeId == startNodeId)
				{
					startBox = currentBox;
					startBox.setWidth(fromBoxWidth);
					startBox.setHeight(fromBoxHeight);
				}
				if (nodeId == endNodeId)
				{
					endBox = currentBox;
					endBox.setWidth(fromBoxWidth);
					endBox.setHeight(fromBoxHeight);
				}
			}
			if (startBox == null || endBox == null)
			{
				return;
			}
			//load either load line or load curve
			if(startBox.getX()==endBox.getX())
			{
				designer.loadCurve(startBox, endBox, startX, startY, endX, endY);
			}
			else
			{
				designer.color = 0x000000;
				designer.loadLine(startBox, endBox, startX, startY, endX, endY);
			}
			
					
		}
		public function loadLinkDetails(link:StateMachineGraphLinkVO):void
		{
			//18-Mar-09 AP - load the configuration details of transition - Code Start
			var links:ArrayCollection = designer.getLineList();
			for(var j:int=0;j<links.length;j++)
			{
				var line:StateMachineConnector = StateMachineConnector(links.getItemAt(j));
				
				var fromNode:StateMachineGraphCanvasItem =StateMachineGraphCanvasItem(line.fromBox);
				var fromNodeId:String = fromNode.stateVO.stateName;
				
				var toNode:StateMachineGraphCanvasItem = StateMachineGraphCanvasItem(line.toBox);
				var toNodeId:String = toNode.stateVO.stateName;
				
				if(link.startNodeId == fromNodeId && link.endNodeId == toNodeId)
				{
					line.stateMachineLinkVO = link.linkDetails;
				}
			}			
			//18-Mar-09 AP - load the configuration details of transition - Code End
		}
		public function get fromBoxWidth():int
		{
			return _fromBoxWidth;
		}
		public function set fromBoxWidth(value:int):void
		{
			this._fromBoxWidth = value;
		}
		public function get fromBoxHeight():int
		{
			return _fromBoxHeight;
		}
		public function set fromBoxHeight(value:int):void
		{
			this._fromBoxHeight = value;
		}
		public function get toBoxWidht():int
		{
			return _toBoxWidht;
		}
		public function set toBoxWidht(value:int):void
		{
			this._toBoxWidht = value;
		}
		public function get toBoxHeight():int
		{
			return _toBoxHeight;
		}
		public function set toBoxHeight(value:int):void
		{
			this._toBoxHeight = value;
		}
	}
}