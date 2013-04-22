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
 * $Id: StateMachinePalette.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Feb 26, 2009  
 */
package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.common.Palette;
	
	import flash.display.DisplayObject;
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.containers.Grid;
	import mx.containers.GridItem;
	import mx.containers.GridRow;
	import mx.controls.Image;
	import mx.core.DragSource;
	import mx.managers.DragManager;

	public class StateMachinePalette extends Palette
	{
		private static const NUM_COMPS_IN_ROW:int = 3;
		
		private var stateMachineComponentGrid:Grid = createGrid();
		private var stateMachineRow:GridRow = null;
		private var paletteItem:StateMachinePaletteItem;
			
		public function StateMachinePalette()
		{
			super();
			addItems();
		}
		
		override public  function addItems():void
		{
					
			var stateType:ArrayCollection = new ArrayCollection();
			stateType.addItem("INIT");
			stateType.addItem("END");
			stateType.addItem("NORMAL");
			
			for(var i:int=0;i<3;i++)
			{
				paletteItem = new StateMachinePaletteItem(String(stateType.getItemAt(i)));
				addImage(String(stateType.getItemAt(i)));
				paletteItem.addEventListener(MouseEvent.MOUSE_MOVE, dragPicture);
			}	
			var normalConnector:Image = new Image();
			normalConnector.id = "line";
			normalConnector.source = resourceManager.getString('TeevraUI', 'stateMachinePalette.normalConnector.icon');
			normalConnector.width = 25;
			normalConnector.height = 25;
			stateMachineRow = addItemToPalette(stateMachineComponentGrid, stateMachineRow, normalConnector);
			normalConnector.addEventListener(MouseEvent.CLICK, doDrawEnable);
			normalConnector.buttonMode=true;
			normalConnector.toolTip="Connector";
			
			var selfConnector:Image = new Image();
			selfConnector.id = "selfConnector";
			selfConnector.source = resourceManager.getString('TeevraUI', 'stateMachinePalette.selfConnector.icon');
			stateMachineRow = addItemToPalette(stateMachineComponentGrid, stateMachineRow, selfConnector);
			selfConnector.addEventListener(MouseEvent.CLICK, doCurveEnable);
			selfConnector.buttonMode=true;
			selfConnector.toolTip="Connector";
			
			stateMachineComponentGrid.label="State Machine";
			addPalettePanel(stateMachineComponentGrid);
			
		}
		private function addImage(stateType:String):void
		{
			const INITIAL_STATE:String="INIT";
			const END_STATE:String="END";
			const INTER_STATE:String="NORMAL";
			var imageRef:String;
			var stateMachineImage:Image;
			switch(stateType)
			{
				case(INITIAL_STATE):
				{	
					stateMachineImage=new Image();
					imageRef=resourceManager.getString('TeevraUI', 'stateMachinePalette.initState.icon');
					break;
				}
				case(END_STATE):
				{
					stateMachineImage=new Image();
					imageRef=resourceManager.getString('TeevraUI', 'stateMachinePalette.finalState.icon');
					break;
				}
				default:
				{
					stateMachineImage=new Image();
					imageRef=resourceManager.getString('TeevraUI', 'stateMachinePalette.normalState.icon');
				}
			}
			stateMachineImage.source = imageRef;
			stateMachineImage.setStyle("horizontalAlign", "center");
			stateMachineImage.setStyle("verticalAlign","center");
			stateMachineImage.width=25;
			stateMachineImage.height=25;
			stateMachineImage.buttonMode=true;
			stateMachineRow = addItemToPalette(stateMachineComponentGrid, stateMachineRow, paletteItem);
		}
		override public function addItemToPalette(parentGrid:Grid, parentRow:GridRow, 	
			paletteItem:DisplayObject):GridRow 
		{			
			parentRow = new GridRow();
			parentGrid.addChild(parentRow);
			var endPointItem:GridItem = new GridItem();
			endPointItem.addChild(paletteItem);
			parentRow.addChild(endPointItem);
			return parentRow;
		}	

		override public function dragPicture(event:MouseEvent):void
		{
			var format:String = "stateMachine";
			var dragInitiator:StateMachinePaletteItem = StateMachinePaletteItem(event.currentTarget);
			var ds:DragSource = new DragSource();
			ds.addData(dragInitiator,format);
			DragManager.doDrag(dragInitiator, ds, event,null, 0, 0, 1.00);
    	}   
	}
}