package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.AppPropertiesServiceDelegate;
	import com.headstrong.teevra.client.events.AppPropertiesServiceEvent;

	public class AppPropertiesServiceCommand implements ICommand
	{
		public function AppPropertiesServiceCommand()
		{
		}

		public function execute(event:CairngormEvent):void
		{
			var appPropertiesServiceEvent:AppPropertiesServiceEvent = AppPropertiesServiceEvent(event);
			var delegate : AppPropertiesServiceDelegate = new AppPropertiesServiceDelegate( appPropertiesServiceEvent.resultHandler);
			switch (AppPropertiesServiceEvent.currentCommand) 
			{	
				case AppPropertiesServiceEvent.GET_PROPERTY_VALUE_COMMAND:
					delegate.getPropertyValue(String(appPropertiesServiceEvent.getArgument(AppPropertiesServiceEvent.GET_PROPERTY_VALUE_ID)));
					break;	

			}	
		}
		
	}
}