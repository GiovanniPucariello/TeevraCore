package com.headstrong.teevra.components.common
{
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.ProcessVO;
	
	import flash.events.MouseEvent;
	
	import mx.containers.Panel;
	import mx.controls.Button;
	import mx.controls.Image;
	import mx.controls.Label;
	import mx.effects.Resize;    
	public class CollapsiblePanel extends Panel{   
		
		private var arrowImage:Image = new Image();
		private var effResize:Resize = new Resize();   
		private var previousHeight:int = 30; 
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();   
		private var loadedProcess:ProcessVO;    
		private var idText:Label=new Label();
		private var processStatus:Label=new Label();
		private var idLabel:Label = new Label();
		private var statusLabel:Label = new Label();
		
		
		public function CollapsiblePanel(){         
			super(); 
			arrowImage.source="images/upArrow.PNG";           
		    arrowImage.addEventListener(MouseEvent.CLICK,minimisePanel);  
		}        
		override protected function createChildren():void{      
			super.createChildren();
			super.titleBar.addChild(arrowImage);
			
			idLabel.text="ID";
			idLabel.setStyle("fontWeight","bold");
			idLabel.visible=false;
			idLabel.width=90;
			idLabel.height=30;
			idLabel.x=0;
			
			statusLabel.text="Status";
			statusLabel.setStyle("fontWeight","bold");
			statusLabel.visible=false;
			statusLabel.width=90;
			statusLabel.height=30;
			statusLabel.x=230;
			
			idText.visible=false;
			idText.width=90;
			idText.height=30;
			idText.x=30;
			
			processStatus.visible=false;
			processStatus.width=90;
			processStatus.height=30;
			processStatus.x=290;			
			
			loadedProcess = modelLocator.loadedProcess;
			if (loadedProcess != null)
 			{
 				idText.text=loadedProcess.prcsId.toString();
 				processStatus.text=loadedProcess.prcsStatus;
 				titleBar.addChild(idLabel);
 				titleBar.addChild(idText);
 				
 			} else {
 				
 				idText.text="";
 				processStatus.text="NEW";
 			
 			}
			
			titleBar.addChild(statusLabel);
			titleBar.addChild(processStatus);
			
			  
			  
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