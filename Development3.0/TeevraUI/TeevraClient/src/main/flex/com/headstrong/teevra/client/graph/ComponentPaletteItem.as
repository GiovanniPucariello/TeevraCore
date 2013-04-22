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
 * $Id: ComponentPaletteItem.as
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Feb 26, 2009  
 */
package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.common.PaletteItem;
	import com.headstrong.teevra.client.graph.model.ComponentVO;
	
	import flash.events.MouseEvent;
	
	import mx.containers.HBox;
	import mx.containers.VBox;
	import mx.controls.Image;
	import mx.controls.Label;
	import mx.controls.Spacer;
	import mx.controls.TextArea;
	import mx.controls.TextInput;
	import mx.effects.Rotate;
	import mx.effects.easing.*;
	
	public class ComponentPaletteItem extends PaletteItem
	{
		private var componentIcon:Image;
		private static var i:int=1;
		
		public var parentComponent:ComponentVO;
		public var componentLabel:Label;
		
		public function ComponentPaletteItem(parentComponent:ComponentVO)
		{
			super();
			this.parentComponent = parentComponent;
			addItems();
		}
		
		override public function addItems():void
		{
			var imageVBox:VBox=new VBox();
			imageVBox.percentHeight=100;
			imageVBox.percentWidth=100;
			//imageVBox.setStyle("paddingLeft","2");
			var imageHBox:HBox=new HBox();
			imageHBox.percentHeight=100;
			imageHBox.percentWidth=100;
			var spacer:Spacer=new Spacer();
			spacer.width=25;
			imageHBox.addChild(spacer);
			componentIcon = new Image();
			componentIcon.id = "icon_" + parentComponent.compId.toString();
			componentIcon.source = "images/components/"+ parentComponent.compImageRef;
			componentIcon.setStyle("horizontalAlign", "center");
			componentIcon.setStyle("verticalAlign","center");
			componentIcon.width=25;
			var effect:Rotate=new Rotate();
			effect.angleFrom=0;
			effect.angleTo=360;
			effect.easingFunction=Elastic.easeInOut;
            effect.duration=1000;
          // componentIcon.setStyle("rollOverEffect",effect);
  	
			
			componentIcon.height=25;
			componentIcon.toolTip = parentComponent.compDesc;
			
		//	componentIcon.addEventListener(MouseEvent.ROLL_OVER,imgRollOver );

			componentIcon.buttonMode=true;
			imageHBox.addChild(componentIcon);
			imageVBox.addChild(imageHBox);
			var lb:TextArea =new TextArea();
			lb.wordWrap=true;
			lb.editable=false;
			lb.setStyle("borderStyle","none");							
			lb.setStyle("textAlign","center");	
			lb.setStyle("fontSize","9");			
			lb.maxWidth=80;							
			lb.setStyle("backgroundAlpha","0");
			lb.text=parentComponent.compName;				
			imageVBox.addChild(lb);
			this.addChild(imageVBox);
		}
		private function imgRollOver( event:MouseEvent ):void {
			var componentOver:Image =new Image();
		//	Alert("images/components/"+ parentComponent.compImageRef);
			componentOver.source="images/components/"+ parentComponent.compImageRef;
            event.target.source = "images/components/"+ parentComponent.compImageRef;
            event.target.width=50;
        }

	}
}