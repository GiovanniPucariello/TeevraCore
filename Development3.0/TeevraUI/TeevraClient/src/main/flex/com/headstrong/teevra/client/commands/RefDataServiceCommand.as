package com.headstrong.teevra.client.commands
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	import com.headstrong.teevra.client.business.RefDataServiceDelegate;
	import com.headstrong.teevra.client.events.RefDataServiceEvent;
	import com.headstrong.teevra.client.model.ViewModelLocator;
	import com.headstrong.teevra.client.view.admin.CacheReloadSchedule;
	import com.headstrong.teevra.client.view.entity.DataSourceConfigVO;
	import com.headstrong.teevra.client.view.entity.RefDataConfigVO;
	import com.headstrong.teevra.client.view.entity.ServerConfigVO;
	
	import mx.controls.Alert;
	
	public class RefDataServiceCommand implements ICommand
	{ 
		private var viewModel : ViewModelLocator;
		public function RefDataServiceCommand()
		{			
		}
		public function execute( event : CairngormEvent ): void
		{
			var refDataServiceEvent:RefDataServiceEvent = RefDataServiceEvent(event);
			var delegate : RefDataServiceDelegate = new RefDataServiceDelegate( refDataServiceEvent.resultHandler );
			switch(RefDataServiceEvent.currentCommand)
			{
				case RefDataServiceEvent.REFRESH_DATASOURCE_COMMAND:
					delegate.getDataSourceConfigs();
					break;
				
				case RefDataServiceEvent.DELETE_DATASOURCE_COMMAND:
					delegate.deleteDataSourceConfig(String
					(refDataServiceEvent.getArgument(RefDataServiceEvent.DELETE_DATASOURCE_ID)));
					break;
					
				case RefDataServiceEvent.ADD_DATASOURCE_COMMAND:
					delegate.saveDataSourceConfig(DataSourceConfigVO
					(refDataServiceEvent.getArgument(RefDataServiceEvent.ADD_DATASOURCE_ID)))
					break;
					
				case RefDataServiceEvent.REFRESH_REFDATA_COMMAND:
					delegate.getRefDataConfigs();
					break;
				
				case RefDataServiceEvent.DELETE_REFDATA_COMMAND:
					delegate.deleteRefDataConfig(String
					(refDataServiceEvent.getArgument(RefDataServiceEvent.DELETE_REFDATA_ID)));
					break;
				
				case RefDataServiceEvent.ADD_REFDATASOURCE_COMMAND:
					delegate.saveRefDataConfig(RefDataConfigVO
					(refDataServiceEvent.getArgument(RefDataServiceEvent.ADD_REFDATA_ID)));
					break;
					
				case RefDataServiceEvent.GET_SCHEDULE_COMMAND:
					delegate.getCacheReloadSchedule(String(refDataServiceEvent.getArgument(RefDataServiceEvent.GET_SCHEDULE_ID)));
				break;
				
				case RefDataServiceEvent.RELOAD_CACHE_COMMAND:
					delegate.reloadCache(refDataServiceEvent.getArgument(RefDataServiceEvent.RELOAD_CACHE_ID) as String
					,refDataServiceEvent.getArgument(RefDataServiceEvent.RELOAD_CACHE_SERVER) as ServerConfigVO);
					break;
					
				case RefDataServiceEvent.SET_SCHEDULE_COMMAND:
					delegate.scheduleCacheReload(CacheReloadSchedule(refDataServiceEvent.getArgument(RefDataServiceEvent.SET_SCHEDULE_ID)),
					ServerConfigVO(refDataServiceEvent.getArgument(RefDataServiceEvent.SERVER_CONFIG)));
					break;		
					
		
			}
		}

	}
}