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
 * $Id: DateUtilScript.as
 * $Revision: 
 * $Author: Viswanath P
 * $DateTime: Jul 28, 2009  
 */

	//formats date into the required format
	public function formatDate(item:Object, column:DataGridColumn): String 
	{
	 	var dateFormatter:DateFormatter = new DateFormatter();
	 	dateFormatter.formatString =resourceManager.getString('TeevraUI', 'column.common.dateformat');
	 	var time:String = item[column.dataField];	
	 	var date:Date = new Date(time);
	 	return dateFormatter.format(date);
	}