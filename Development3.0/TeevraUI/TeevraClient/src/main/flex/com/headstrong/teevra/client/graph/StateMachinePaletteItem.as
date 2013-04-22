package com.headstrong.teevra.client.graph
{
	import com.headstrong.teevra.client.graph.common.PaletteItem;
	
	import mx.containers.HBox;
	import mx.containers.VBox;
	import mx.controls.Image;
	import mx.controls.Spacer;
	import mx.controls.TextArea;
	import mx.effects.Rotate;
	import mx.effects.easing.Elastic;

	public class StateMachinePaletteItem extends PaletteItem
	{
		private var componentIcon:Image;
		public var stateType:String;
		private var imageRef:String;
		private var toolTipString:String;
		public function StateMachinePaletteItem(stateType:String)
		{
			super();
			this.stateType = stateType;
			addItems();
		}
		override public function addItems():void
		{
			const INITIAL_STATE:String="INIT";
			const END_STATE:String="END";
			const INTER_STATE:String="NORMAL";
			switch(stateType)
			{
				case(INITIAL_STATE):
				{	
					imageRef=resourceManager.getString('TeevraUI', 'stateMachinePalette.initState.icon');
					toolTipString="Initial State";
					break;
				}
				case(END_STATE):
				{
					imageRef=resourceManager.getString('TeevraUI', 'stateMachinePalette.finalState.icon');
					toolTipString="End State";
					break;
				}
				default:
				{
					imageRef=resourceManager.getString('TeevraUI', 'stateMachinePalette.normalState.icon');
					toolTipString="Normal State";
				}
			}
			var imageVBox:VBox = new VBox();
			imageVBox.percentHeight=100;
			imageVBox.percentWidth=100;
			
			var imageHBox:HBox = new HBox();
			imageHBox.percentHeight=100;
			imageHBox.percentWidth=100;
			var spacer:Spacer = new Spacer();
			spacer.width=25;
			imageHBox.addChild(spacer);
			
			componentIcon = new Image();
			componentIcon.source = imageRef;
			componentIcon.setStyle("horizontalAlign", "center");
			componentIcon.setStyle("verticalAlign","center");
			componentIcon.width=25;
			componentIcon.toolTip = toolTipString;
			var effect:Rotate=new Rotate();
			effect.angleFrom=0;
			effect.angleTo=360;
			effect.easingFunction=Elastic.easeInOut;
            effect.duration=1000;
          	componentIcon.height=25;
			componentIcon.buttonMode=true;
			imageHBox.addChild(componentIcon);
			imageVBox.addChild(imageHBox);
			var lb:TextArea = new TextArea();
			lb.wordWrap=true;
			lb.editable=false;
			lb.setStyle("borderStyle","none");							
			lb.setStyle("textAlign","center");	
			lb.setStyle("fontSize","9");			
			lb.maxWidth=100;							
			lb.setStyle("backgroundAlpha","0");
			lb.text=stateType;				
			imageVBox.addChild(lb);
			this.addChild(imageVBox);
		}		
	}
}