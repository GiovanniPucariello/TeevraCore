package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.common.Palette;
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	
	import flash.display.DisplayObject;
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.containers.Accordion;
	import mx.containers.Grid;
	import mx.containers.GridItem;
	import mx.containers.GridRow;
	import mx.controls.Image;
	import mx.controls.VRule;
	import mx.core.DragSource;
	import mx.managers.DragManager;
	
	public class ComponentsPalette extends Palette
	{
		private static const NUM_COMPS_IN_ROW:int = 2;
		
    	private var xOff:Number;
    	private var yOff:Number;  

		
		public function ComponentsPalette()
		{
			super();
			
			addItems();
		}
		
		override public function addItems():void
		{
			var viewModel : ViewModelLocator = ViewModelLocator.getInstance();
			var components:ArrayCollection = ArrayCollection(viewModel.components);
			
			var endPoint:Grid = createGrid();
			var errReporter:Grid = createGrid();
			var router:Grid = createGrid();
			var parser:Grid = createGrid();
			var formatter:Grid = createGrid();
			var service:Grid = createGrid();
			
			var endPointRow:GridRow = null;
			var parserRow:GridRow = null;
			var formatterRow:GridRow = null;
			var serviceRow:GridRow = null;
			var routerRow:GridRow = null;
			var errorReporterRow:GridRow = null;
			
			
			var paletteItem:ComponentPaletteItem; 
			for(var i:int = 0;i<components.length;i++) {
				var compVO:ComponentVO = ComponentVO(components.getItemAt(i));
				paletteItem = new ComponentPaletteItem(compVO);
				paletteItem.addEventListener(MouseEvent.MOUSE_MOVE, dragPicture);
				
				if(compVO.compType == ComponentVO.ENDPOINT)
				{
					endPointRow = addItemToPalette(endPoint, endPointRow, paletteItem);
				}
				 else if(compVO.compType==ComponentVO.PARSER)
				{
					parserRow = addItemToPalette(parser, parserRow, paletteItem);
				}
				else if(compVO.compType==ComponentVO.FORMATTER)
				{
					formatterRow = addItemToPalette(formatter, formatterRow, paletteItem);
				}
				else if(compVO.compType==ComponentVO.SERVICE)
				{
					serviceRow = addItemToPalette(service, serviceRow, paletteItem);
				}
				else if(compVO.compType==ComponentVO.ROUTER)
				{
					routerRow = addItemToPalette(router, routerRow, paletteItem);
				} 
				else if(compVO.compType==ComponentVO.ERRREPORTER)
				{
					errorReporterRow = addItemToPalette(errReporter, errorReporterRow, paletteItem);
				}
				
			}
				
			var connector:Image = new Image();
			connector.id = "line";
			connector.source = resourceManager.getString('TeevraUI', 'componentsPalette.p2p.icon');
			connector.width = 25;
			connector.height = 25;
			connector.addEventListener(MouseEvent.CLICK, doDrawEnable);
			connector.buttonMode=true;
			connector.toolTip="Connector";
			routerRow = addItemToPalette(router, routerRow, connector);
		
			endPoint.label="Endpoints";
			parser.label="Parsers";
			formatter.label="Formatters";
			service.label="Services";
			router.label="Routers";
			errReporter.label="Error Reporting"
			
			addPalettePanel(endPoint);	
			addPalettePanel(parser);			
			addPalettePanel(formatter);			
			addPalettePanel(service);
			addPalettePanel(router);
			addPalettePanel(errReporter);
		}

		override public function addItemToPalette(parentGrid:Grid, parentRow:GridRow, 
			paletteItem:DisplayObject):GridRow {
			
			if (parentRow == null) {
				parentRow = new GridRow();
				parentGrid.addChild(parentRow);
			} else if (parentRow.getChildren().length % NUM_COMPS_IN_ROW == 0) {
				parentRow = new GridRow();
				parentGrid.addChild(parentRow);
			}
			parentRow.setStyle("paddingTop","5");
			var endPointItem:GridItem = new GridItem();
			endPointItem.addChild(paletteItem);
			parentRow.addChild(endPointItem);
			return parentRow;
		}	

		override public function dragPicture(event:MouseEvent):void{
			var format:String = "paletteItem";
			
			var dragInitiator:ComponentPaletteItem = ComponentPaletteItem(event.currentTarget);
			var ds:DragSource = new DragSource();
			ds.addData(dragInitiator,format);
			DragManager.doDrag(dragInitiator, ds, event,null, 0, 0, 1.00);
	    }      
		
	}
}