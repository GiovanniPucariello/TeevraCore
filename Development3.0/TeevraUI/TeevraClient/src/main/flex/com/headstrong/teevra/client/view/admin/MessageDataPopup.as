package com.headstrong.teevra.client.view.admin
{
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.entity.MessageEventlogVO;
	
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.collections.ArrayCollection;
	import mx.containers.ControlBar;
	import mx.containers.HBox;
	import mx.containers.TitleWindow;
	import mx.containers.VBox;
	import mx.controls.Button;
	import mx.controls.Label;
	import mx.controls.Spacer;
	import mx.controls.TextArea;
	import mx.controls.TextInput;
	import mx.events.CloseEvent;
	import mx.managers.PopUpManager;
	
	
	public class MessageDataPopup extends TitleWindow 
	{				
		
		private var closeEventHandler:Function;
		private var modelLocator:ViewModelLocator = ViewModelLocator.getInstance();
		
		private var prcsNameText:TextInput;
		private var prcsRunIdText:TextInput;
		private var savepointTimeText:TextInput;
		private var logMessageText:TextArea;
		private var messageDataText:TextArea;
		
		public function MessageDataPopup()
		{
			super();
			this.layout = "vertical";
			this.showCloseButton=true;
			this.addEventListener(CloseEvent.CLOSE,popupClose);
			this.title="Message Data";
			//this.setStyle("borderAlpha", 1.0); // to make title bar slightly opaque
			init();
		}
			
		private function popupClose(event:Event):void{
	    	PopUpManager.removePopUp(this);
	    }
		
		public function init():void
		{
		}
		public function create(closeHandler:Function):void
		{	
			this.closeEventHandler = closeHandler;
			
			//VBox which contains Hboxes to handle labels and text fields
			var messageDataDisplay:VBox = new VBox();
			messageDataDisplay.percentWidth = 100;	
			
			//first Hbox to hold prcsRunId and savepoint time 								
			var messageDataH1:HBox = new HBox(); 
			messageDataH1.percentHeight = 20;
			messageDataH1.setStyle("horizontalGap","5");
			
			var prcsRunId:Label = new Label();
			prcsRunId.text=resourceManager.getString('TeevraUI', 'label.MessageDataPopup.prcsRunId');
			prcsRunId.setStyle("fontWeight","bold");
			prcsRunId.width=50;
			
			prcsRunIdText = new TextInput();;
			prcsRunIdText.width=150;
			prcsRunIdText.editable = false;
			
			
			
			var prcsName:Label = new Label();
			prcsName.text=resourceManager.getString('TeevraUI', 'label.MessageDataPopup.prcsName');
			prcsName.setStyle("fontWeight","bold");
			prcsName.width=45;
			
			
			
			prcsNameText = new TextInput();;
			prcsNameText.width=200;
			prcsNameText.editable = false;
							
			var savepointTime:Label = new Label();
			savepointTime.text=resourceManager.getString('TeevraUI', 'label.MessageDataPopup.savepointTime');
			savepointTime.setStyle("fontWeight","bold");
			savepointTime.width=95;
			
			savepointTimeText= new TextInput();;
			savepointTimeText.width=200;
			savepointTimeText.editable = false;
			
			messageDataH1.addChild(prcsRunId);
			messageDataH1.addChild(prcsRunIdText);	
			// messageDataH1.addChild(spacer1);
			messageDataH1.addChild(prcsName);
			messageDataH1.addChild(prcsNameText);
			//messageDataH1.addChild(spacer1);
			messageDataH1.addChild(savepointTime);
			messageDataH1.addChild(savepointTimeText);	
		    var spacer:Spacer=new Spacer();
		    spacer.height=15;
			//second HBox to hold prcsName n the logMessage
			var messageDataH2:HBox = new HBox(); 
			messageDataH2.percentHeight = 40;
			messageDataH2.percentWidth=100;
			
			
			var logMessage:Label = new Label();
			logMessage.text=resourceManager.getString('TeevraUI', 'label.MessageDataPopup.logMessage');
			logMessage.setStyle("fontWeight","bold");
			logMessage.width=100;
			
			logMessageText = new TextArea();
			logMessageText.width=665;
			logMessageText.height=160;
			logMessageText.editable = false;
			
			//messageDataH2.addChild(prcsName);
			//messageDataH2.addChild(prcsNameText);	
			messageDataH2.addChild(logMessage);
			messageDataH2.addChild(logMessageText);	
			
			var spacer1:Spacer=new Spacer();
		    spacer1.height=15;
			//third HBox to hold the message data
			var messageDataH3:HBox = new HBox(); 
			messageDataH3.percentHeight = 40;
			messageDataH3.percentWidth = 100;
			
			
			var message:Label = new Label();
			message.text=resourceManager.getString('TeevraUI', 'label.MessageDataPopup.messageText');
			message.setStyle("fontWeight","bold");
			message.width=100;
			
			messageDataText = new TextArea();
			messageDataText.height=180;
			messageDataText.width=665;
			messageDataText.editable = false;
			messageDataH3.addChild(message);
			messageDataH3.addChild(messageDataText);
			
			// add the three HBoxes to the main VBox and then add the VBox to the UI
			messageDataDisplay.addChild(messageDataH1);
			messageDataDisplay.addChild(spacer);
			messageDataDisplay.addChild(messageDataH2);
			messageDataDisplay.addChild(spacer1);
			messageDataDisplay.addChild(messageDataH3);
			
			this.addChild(messageDataDisplay);
						
			//create control bar
			createControlBar();
			
			//set the details obtained from the server and stored in the modellocator 
			// to the respective text inputs/areas
			setPrcsRunMessageDetails();

			
		}
		// mthid to close button in the controlBar 
		private function createControlBar():void
		{
			var controlBar:ControlBar = new ControlBar();
			controlBar.percentHeight = 10;
			controlBar.percentWidth = 90;
					
			var closeBtn:Button = new Button();
			closeBtn.label = "Close";
			closeBtn.addEventListener(MouseEvent.CLICK, closeEventHandler);
			controlBar.addChild(closeBtn);
			
			this.addChild(controlBar);
		}
		
		//method to set the details obtained from the server and stored in the modellocator 
		// to the respective text inputs/areas
		private function setPrcsRunMessageDetails():void
		{
			var messageDetails:ArrayCollection = modelLocator.prcsRunMessageData;	
			
			var messageEventlog:MessageEventlogVO = MessageEventlogVO(messageDetails.getItemAt(0));	
			prcsNameText.text = messageEventlog.prcsName.toString();
			prcsRunIdText.text = messageEventlog.prcsRunId.toString();
			savepointTimeText.text=messageEventlog.savepointTime.toLocaleDateString()
								   +" "+
								   messageEventlog.savepointTime.toLocaleTimeString();
			logMessageText.text = messageEventlog.logMessage;
			messageDataText.text = messageEventlog.messageData;
		}
	}
}