package com.headstrong.teevra.client.util
{
	import mx.controls.Alert;
	import mx.core.Application;
	import mx.messaging.messages.ErrorMessage;
	import mx.rpc.events.FaultEvent;
	
	public class AlertHelper
	{
		public function AlertHelper()
		{
		}
		public static function SimpleAlert(message:String,title:String):void
		{
			Alert.show(message,title);
		}
		public static function PromtAlert(message:String,title:String):Boolean
		{
			return false;
		}
		
		/**
		 * Displays error label/alert based on the info
		 * 
		 * @param info
		 * 			  information of the fault
		 * @param alertTitle
		 * 					title of the alert to be displayed if the exception is
		 * 					neither SessionTimeOutException nor UserAuthorizationException
		 * 
		 */
		public static function displayFault(info:Object,alertTitle:String):void
		{
			var faultEvent : FaultEvent = FaultEvent( info );
			var errorMessage:ErrorMessage = faultEvent.message as ErrorMessage;
			var exceptionName:String = errorMessage.rootCause.name;
			if((exceptionName!=null) && (exceptionName == 'SessionTimeOutException')){
				Application.application.reloadPage();
//				Application.application.mainArea.removeAllChildren();
//				Application.application.loginScreen("*Your session has been expired. Please Relogin");		
			}
			else if((exceptionName!=null) && (exceptionName == 'UserAuthorizationException')){
				Alert.show(errorMessage.rootCause.message);
			}
			else{
				//Alert.show( faultEvent.fault.faultString,alertTitle)
				if((info !=null)&&(info.fault !=null)){
					Alert.show( info.fault.faultString,alertTitle)	
				}
				else{
					var faultString:String = "Operation Failed. Please check if any mandatory fields are missing and try again";
					Alert.show(faultString,alertTitle)
				}
			}
		}

	}
}