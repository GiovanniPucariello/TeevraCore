package com.headstrong.teevra.components.common
{
	import flash.events.MouseEvent;
	
	import mx.containers.Panel;
	import mx.controls.Alert;
	import mx.controls.Button;
	import mx.controls.Image;
	import mx.effects.Resize;    
	public class MinMaxPanel extends Panel     {
		private var arrowImage:Image = new Image();   
		private var minMaxBtn:Button = new Button();  
		private var effResize:Resize = new Resize();   
		private var previousHeight:int = 30;      
	
		
		public function MinMaxPanel(maximise:Boolean,noOfRows:int)         {         
			super(); 
			this.percentWidth=100;							
			this.setStyle("headerHeight","20");
			
			if(maximise)
			{				  				       
				arrowImage.source="images/upArrow.PNG";
				arrowImage.addEventListener(MouseEvent.CLICK, minimisePanel);
			}    
			else
			{
				arrowImage.source="images/downArrow.PNG";
				arrowImage.addEventListener(MouseEvent.CLICK, maxmisePanel);
				initialMinimize(noOfRows);
			}
		}      
		override protected function createChildren():void{      
			super.createChildren();   
			super.titleBar.addChild(arrowImage);        
		}  
		private function initialMinimize(noOfRows:int):void
		{			
			effResize.stop(); 
			arrowImage.source="images/downArrow.PNG";
			effResize.heightFrom = height;        
			effResize.heightTo = previousHeight;
			height=30;    
			previousHeight = height+(noOfRows*33); 			     
			effResize.play([this]);
		}  
		private function test(e:MouseEvent):void{
			Alert.show("test");
		}    
		private function minimisePanel(e:MouseEvent):void{     
			
			effResize.stop(); 
			arrowImage.source="images/downArrow.PNG"; 
			arrowImage.removeEventListener(MouseEvent.CLICK, minimisePanel);  
			arrowImage.addEventListener(MouseEvent.CLICK, maxmisePanel);			
			effResize.heightFrom = height;            
			effResize.heightTo = previousHeight;       
			previousHeight = height;         
			effResize.play([this]);       
     
		}        
		private function maxmisePanel(e:MouseEvent):void{  
			
			effResize.stop();
			arrowImage.source="images/upArrow.PNG";
			arrowImage.removeEventListener(MouseEvent.CLICK, maxmisePanel);             
			arrowImage.addEventListener(MouseEvent.CLICK, minimisePanel);
			effResize.heightFrom = height;        
			effResize.heightTo = previousHeight;    
			previousHeight = height;          
			effResize.play([this]);     	  
			   
		}         
		override protected function updateDisplayList(w:Number, h:Number):void{             		

			super.updateDisplayList(w,h); 
			arrowImage.x = super.titleBar.width - 30;     
			arrowImage.y = 5;           
			arrowImage.width = 15;    
			arrowImage.height = 15;			    
		}    
	} 
}