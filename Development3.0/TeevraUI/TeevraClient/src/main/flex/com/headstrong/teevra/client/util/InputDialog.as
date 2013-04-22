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
 * $Id: InputDialog.as
 * $Revision: 
 * $Author: akrishnamoorthy
 * $DateTime: Mar 30, 2009  
 */
package com.headstrong.teevra.client.util
{
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	import mx.containers.ControlBar;
	import mx.containers.TitleWindow;
	import mx.controls.Button;
	import mx.core.Container;
	import mx.events.CloseEvent;
	import mx.events.FlexEvent;
	import mx.managers.PopUpManager;

	/**
	 * Generic popup window for any type of input dialog.
	 */
	public class InputDialog extends TitleWindow
	{
		/** Handler for ok button, to be passed by invoking component */
		private var okHandler:Function;
		/** Handler for cancel button, to be passed by invoking component */
		private var cancelHandler:Function;
		/** ok button text, set to Ok by default */
		private var okLabel:String = "Ok";
		/** Cancel button text, set to Cancel by default */
		private var cancelLabel:String = "Cancel";
		
		/**
		 * Centers the popup after creation / update. Enables the close button and set the layout to vertical
		 */
		public function InputDialog()
		{
			super();
			this.layout="vertical";
			this.percentHeight=100;
			this.percentWidth=100;
			this.addEventListener(FlexEvent.CREATION_COMPLETE, centerPopup);
			this.addEventListener(FlexEvent.UPDATE_COMPLETE, centerPopup);
			this.showCloseButton=true;
			this.addEventListener(CloseEvent.CLOSE, popupClose);
		}

		/**
		 * Releases the resources on close of popup
		 */
		private function popupClose(event:Event):void
		{
			PopUpManager.removePopUp(this);
		}

		/**
		 * Centers the popup.
		 */
		public function centerPopup(event:Event):void
		{
			PopUpManager.centerPopUp(this);
		}

		/**
		 * Invoked after instantiation. 
		 */
		public function create(title:String, content:Container, okHandler:Function, 
			cancelHandler:Function, okText:String, cancelText:String):void
		{
			this.title=title;
			this.okHandler = okHandler;
			this.cancelHandler = cancelHandler;
			
			if (okText != null)
				okLabel = okText;
			if (cancelText != null)
				cancelLabel = cancelText;

			this.addChild(content);
			createControlBar();
		}

		/**
		 * Adds Ok and Cancel buttons to the control bar. Attaches the passed in handlers to them
		 */
		private function createControlBar():void
		{
			var controlBar:ControlBar=new ControlBar();
			controlBar.percentHeight=10;
			controlBar.percentWidth=90;

			var okBtn:Button = new Button();
			okBtn.label = okLabel;
			okBtn.addEventListener(MouseEvent.CLICK, okHandler);
			controlBar.addChild(okBtn);

			var cancelBtn:Button = new Button();
			cancelBtn.label = cancelLabel;
			cancelBtn.addEventListener(MouseEvent.CLICK, cancelHandler);
			controlBar.addChild(cancelBtn);

			this.addChild(controlBar);
		}
	}
}