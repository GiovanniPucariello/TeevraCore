package com.headstrong.teevra.components.common
{
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.containers.HBox;
	import mx.controls.Button;
	import mx.controls.Image;
	import mx.controls.TextArea;
	
	public class ComplexField extends HBox
	{
		private var lookupHandler:Function;
	
		private var textArea:TextArea = new TextArea();		
		private var lookupImage:Image = new Image();

		public function ComplexField(handler:Function)
		{
			lookupHandler = handler;
			textArea.editable = false;
			lookupImage.source=resourceManager.getString('TeevraUI', 'ruleParameters.lookup.icon');
			lookupImage.addEventListener(MouseEvent.CLICK, handleLookup);
			lookupImage.width = 20;
			this.addChild(textArea);
			this.addChild(lookupImage);
		}
		
		private function handleLookup(e:Event):void {
			var argArray:Array = new Array(1);
			argArray[0] = this;
			lookupHandler.apply(this, argArray);			
		}
		
		public function getTextAreaValue():String
		{
			return textArea.text;
		}
		public function setTextAreaValue(value:String):void
		{
			this.textArea.text = value;
		}

		public function getTextArea():TextArea
		{
			return textArea;
		}

		public function setTextArea(value:TextArea):void
		{
			this.textArea = value;
		}
		
		public function getLookupImage():Image
		{
			return lookupImage;
		}

		public function setLookupImage(value:Image):void
		{
			this.lookupImage = value;
		}
	}
}