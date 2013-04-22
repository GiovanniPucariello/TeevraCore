'
' Created by Ranorex
' User: ShaSrivastava
' Date: 1/29/2011
' Time: 9:08 PM
'
' To change this template use Tools | Options | Coding | Edit Standard Headers.
'

Imports Microsoft.VisualBasic
Imports System
Imports System.Threading

Imports Ranorex
Imports Ranorex.Core
Imports System.Data

Imports System.Collections.Generic
Imports System.Text
Imports System.Text.RegularExpressions
Imports System.Drawing
'Imports System.Threading
Imports System.Windows.Forms



Namespace Validation_Creation_templates
    Module Program

        <STAThread()> _
         Function Main() As Integer

            Keyboard.AbortKey = System.Windows.Forms.Keys.Pause
            Dim errorNumber As Int16 = 0

            Dim logFileName As String = "Test.rxlog"

            Report.Setup(ReportLevel.Info, logFileName, True)
            
'            
'                 Report.Success("------------------------------Formater validation Started--------------------")
'                 
           ' Try
            	
'********************************************************************************************************         
'    Config.csv - This csv file contains the configuration details for File,FTP and JMS Endpoints.

				Dim csvConnector As New CSVConnector("..\..\Config.csv")'
  				For Each row As DataRow In csvConnector.Rows
    					
'********************************************************************************************************    					
 ' ' Template Creation for File Endpoint ' '
 
 					report.Success("File Template creation started")
                 	file_source.SourceFile = row("SourceFile").ToString()
                  	file_source.DestFile = row("DestFile").ToString()
                	file_source.Nxtpoll= row("Nxtpoll_file").ToString()
                 	file_source.Sourcepattern=row("Sourcepattern").ToString()
                  	file_source.Destpattern= row("Destpattern").ToString()
                  	file_source.Sourcetemp=row("SourcefileTempname").ToString()
                  	file_source.filedesttemp=row("DestfileTempname").ToString()
                 	file_source.Start()
					report.Success("File Template creation Ends")

'********************************************************************************************************
''''FTP Source Config
				report.Success("=======FTP src Template creation started==========")
'*******************************************************************************************************
                  FtpSrcEndPoints.FTP_polltime=row("FTPSrc_polltime").ToString()
                  FtpSrcEndPoints.ftpport=row("ftpsrc_port").ToString()
                  FtpSrcEndPoints.FTP_UI=row("FTPSrc_Userid").ToString()
                  FtpSrcEndPoints.Ftp_srcpwd=row("FtpSrc_password").ToString()
                  FtpSrcEndPoints.FTP_srctempnm=row("FTP_sourcetemplate_name").ToString()
                  FtpSrcEndPoints.FTPURL=row("FTPsrc_URL").ToString()
                  FtpSrcEndPoints.FTP_srcdir=row("FTP_Sourcedir").ToString()
                  FtpSrcEndPoints.Start()
				  report.Success("=======FTP src Template creation ENDS==========")
'*******************************************************************************************************
''''FTP Dest Config
				report.Success("=======FTP dest Template creation started==========")
                  FtpDest.FTP_polltime=row("FTPDest_polltime").ToString()
                  FtpDest.ftpport=row("ftpdest_port").ToString()
                  FtpDest.FTP_UI=row("FTPdest_Userid").ToString()
                  FtpDest.Ftp_srcpwd=row("Ftpdest_password").ToString()
                  FtpDest.FTP_srctempnm=row("FTP_destemplate_name").ToString()
                  FtpDest.FTPURL=row("FTPdest_URL").ToString()
                  FtpDest.FTP_srcdir=row("FTPdest_Sourcedir").ToString()
                  FtpDest.Start()        	 
               	 report.Success("=======FTP Dest Template creation ENDS==========")

'********'********************************************************************************************
                	''Active MQ
                	                	
' ' Template Creation for JMS Endpoint ' '              	
'******************************************************************************************************                	
					Activemq_Source.destque_ActiveMQ=row("destque_ActiveMQ").ToString()
 					Activemq_Source.Temp_ActiveMQ=row("Temp_ActiveMQ").ToString()
 					Activemq_Source.Queue_ActiveMQ=row("SrcQueue_ActiveMQ").ToString()
 					Activemq_Source.TempDest_Activemq=row("TempnameDest_Activemq").ToString()
 					Activemq_Source.URL_ActiveMQ=row("URL_ActiveMQ").ToString()
                    Activemq_Source.Start()

'''****************************************************************************************************
							''''IBM MQ

' ' Template Creation for IBM MQ in JMS Endpoint ' '
'****************************************************************************************************
					JMS_IBM.Delmode_IBM=row("Delmode_IBM").ToString()
					JMS_IBM.Destqueue_IBM=row("destque_ActiveMQ").ToString()
					JMS_IBM.port_IBM=row("port_IBM").ToString()
					JMS_IBM.Pwd_IBM=row("Pwd_IBM").ToString()
					JMS_IBM.QueueChannel_ibm=row("QueueChannel_ibm").ToString()
					JMS_IBM.QueueMGR_IBM=row("QueueMGR_IBM").ToString()
					JMS_IBM.Srcqueue_IBM=row("Srcqueue_IBM").ToString()
					JMS_IBM.srctemp_IBM=row("srctemp_IBM").ToString()
					JMS_IBM.URL_IBM=row("URL_IBM").ToString()
					JMS_IBM.Userid_IBM=row("Userid_IBM").ToString()
					JMS_IBM.DestTemp_IBM=row("DestTemp_IBM").ToString()
					JMS_IBM.Start()
					NEXT

'******************************************************************************************************************

'******************************************************************************************************************
 '    EndpointsConfig.csv - This csv file contains the configuration details DB Endpoint.
 
    			Dim csvConnector312 As New CSVConnector("..\..\EndpointsConfig.csv")'
    			For Each row As DataRow In csvConnector312.Rows
'''*********************************DB Source*********************************************************************************
                DBEndpoints.Pwd_DB=row("Pwd_DB").tostring()
                DBEndpoints.Query_DB =row("Query_DB").tostring()
                DBEndpoints.TempName_DB =row("TempName_DB_SOURCE").tostring()
                DBEndpoints.Updatequery_DB =row("Updatequery_DB").tostring()
                DBEndpoints.URL_DB=row("URL_DB").tostring()
                DBEndpoints.USerid_DB=row("USerid_DB").tostring()
                DBEndpoints.Start()

''**********************************DB Dest*****************************************************
                DBDest.Pwd_DB=row("Dest_Pwd_DB").tostring()
                DBDest.Query_DB =row("Dest_Query_DB").tostring()
                DBDest.TempName_DB =row("Dest_TempName_DB").tostring()
                DBDest.Updatequery_DB =row("Dest_Updatequery_DB").tostring()
                DBDest.URL_DB=row("Dest_URL_DB").tostring()
                DBDest.USerid_DB=row("Dest_USerid_DB").tostring()
                DBDest.Start()
        		Next

''******************************************************************************************************'

''******************************************************************************************************'
'	Formatterconfig.csv - This csv file contains the configuration details of all formatters.
				
				Dim csvConnector1 As New CSVConnector("..\..\Formatterconfig.csv")
				For Each row As DataRow In csvConnector1.Rows
''************************************Tag Delimiter Formatter******************************************************************'					
             	TagDelimiter.Delimiter_Tagdel = row("Delimiter_Tagdel").ToString()
				TagDelimiter.TempName_TagDel = row("TempName_TagDel").ToString()
				TagDelimiter.Start()

'**************************************Fixed Length Formatter****************************************************************'				
				FixLenFormatter.TempName_FixlenForm = row("TempName_FixlenForm").ToString()
				FixLenFormatter.Start()
'**************************************DB Formatter****************************************************************'					
			    DBFormatter.TempName_DB = row("TempName_DB").ToString()
			    DBFormatter.Root_DB= row("Root_DB").ToString()
			    DBFormatter.Start()

''*************************************FIXML Formatter*****************************************************************'
			    Fixmlformatter.Temp_Fixmlformatter=row("TempName_Fixmlformatter").ToString()
			    Fixmlformatter.Start()
'******************************************************************************************************'
 			Next

   	  Report.Success("------------------------------Formater validation Ends--------------------")

'******************************************************************************************************'
'			'login.Start()
'            Report.Success("------------------------------Parsers validation Started--------------------")

'*****************************************************************************************************************
'	Config_parser.csv - This csv file contains the configuration details of all parsers.

             Dim  csvConnector2 As New CSVConnector("..\..\Config_parser.csv")
             For Each row As DataRow In csvConnector2.Rows
'***********************************Fixed Length Parser******************************************************************************
		  	Fixlenparser.Tempname_fixlen = row("temp_Name_Fixlenparser").ToString()
		  	Fixlenparser.Start()	  			  		
'***********************************Tag Delimited Parser*******************************************************************************		  		
		    tagdelparser.Tempname_tagdel= row("temp_Name_tagdelformater").ToString()
		    tagdelparser.Start()
'************************************XML Parser******************************************************************************		  				      

		       XMLParser.Attr_1 = row("Attr_1").ToString
			   XMLParser.Attr_2= row("Attr_2").ToString
			   XMLParser.Attr_3= row("Attr_3").ToString
			   XMLParser.Attr_4= row("Attr_4").ToString
			   XMLParser.Attr_5= row("Attr_5").ToString
		  	   XMLParser.Xpath_1= row("Xpath_1").ToString
			   XMLParser.Xpath_2= row("Xpath_2").ToString
		 	   XMLParser.Xpath_3= row("Xpath_3").ToString
		  	   XMLParser.Xpath_4= row("Xpath_4").ToString
			   XMLParser.Xpath_5= row("Xpath_5").ToString
			   XMLParser.Schemaname= row("Schemaname_XML").ToString
		 	   XMLParser.TempName_XMLFormater= row("TempName_XMLparser").ToString
			   XMLParser.Start()

'''***********************************FIXML Parser******************************************************************************
			 	FixmlParser.Tempname_Fixml=row("Tempname_Fixml").ToString
		  	 	FixmlParser.Start()
'''************************************DB Parser*****************************************************************************
		  	 	DBParser.Start()
	Next
          Report.Success("------------------------------Parsers validation End--------------------")

'''******************************************************************************************************
'service validation :
'--------------------	
	
'	try
Report.Success("------------------------------Validation service validation Started--------------------")
		 Validation_Service.Start()
Report.Success("------------------------------Validation service validation Ends--------------------")
'
'            Catch e As Exception
'            	report.Failure(e.Message)
'					   End Try

'''******************************************************************************************************
'Save point  validation
'-----------------------


 Report.Success("------------------------------Save point  validation Started--------------------")
''
'Try
'	
'validating the functionality 0f the component.

			Savepoint.Start()
			
'	            Catch e As Exception
'            	report.Failure(e.Message)
'					   End Try
'	Report.Success("------------------------------Save point  validation Ends--------------------")
'''******************************************************************************************************''
'ErrorExtractor  :
'-----------------

'ETE
'Try
'	
''End Try
	ErrorExtractor.Start()
'	
'            Catch e As Exception
'            	report.Failure(e.Message)
'					   End Try
'''******************************************************************************************************'					   
'CBR  validation :
'-------------------


'					   
'					   Try
'					   	
'					   
'Report.Success("-----------------------------CBR  validation Started--------------------")
'' Dim csvConnector As New CSVConnector("..\..\Config.csv")'
''  				For Each row As DataRow In csvConnector.Rows
    ''	CBR.Expression_1 = row("Expression_1").ToString()
'			    DBFormatter.Root_DB= row("Root_DB").ToString()
'			    DBFormatter.Start()
    	
    	
  '  Next
	CBR.Start()
'Report.Success("-----------------------------CBR  validation Ends--------------------")
''NEXT


'''******************************************************************************************************
'IBm MQ  validation :
'--------------------

'Report.Success("-----------------------------IBm MQ  validation Started--------------------")
'            Catch e As Exception
'            	report.Failure(e.Message)
'					   End Try
'			
'			try
'			IbmMQ.Start()

'Report.Success("-----------------------------IBm MQ  validation Ends--------------------")
'            Catch e As Exception
'            	report.Failure(e.Message)
'					   End Try

'''******************************************************************************************************
'Agrregator validation :
'------------------------
'ETE


'try
'Report.Success("-----------------------------agrregator validation started--------------------")
'
			agrregator.Start()
'Report.Success("-----------------------------agrregator validation ends--------------------")
'            Catch e As Exception
'            	report.Failure(e.Message)
'					   End Try
'''******************************************************************************************************
' Error_templates :
'------------------


'          Try
'          	
'                    error_templates.Start()
'            
'            
'            Catch e As Exception
'            	report.Failure(e.Message)
'			 End Try
'			 
'''******************************************************************************************************'	
		 
'Transformer validation :
'-----------------------		 
 'reviewed by shailesh 
		 
'	try
'              Report.Success("------------------------------Transformer validation Started--------------------")
'
			 Transformer_validation.Start()
			 Report.Success("------------------------------Transformer validation Ends--------------------")
'
'Catch e As Exception
'	report.Info("Transformer_validation failed")
''
'	End Try
''
'____________________________________________________________________________________________________________

'Enricher validation :
'--------------------
''
'try
'    Report.Success("------------------------------enricher validation Started--------------------")
'
		 Enrchment.Start()
'            Catch e As Exception
'            	report.Failure(e.Message)
'					   End Try
'''******************************************************************************************************'           
		'		login.Start()
''
'            Dim  csvConnector_trans As New CSVConnector("..\..\trans_param.csv")
'     	 For Each row As DataRow In csvConnector_trans.Rows
'     	 	precondition_process.Start()
'      		Trans_processcreation.paramname= row("param").ToString
'      		Trans_processcreation.process_name=row("trans_process_name").ToString
'      		Trans_processcreation.Start()
'      		login.Start()
'      	Next
'''******************************************************************************************************'           
'Template creation Phase 2
'*****************************

   Dim  csvConnector_trans2 As New CSVConnector("..\..\Phase1_IBM_QPID.csv")
    	 For Each row As DataRow In csvConnector_trans2.Rows
     	 	Templatecreation_IBM_QPID.IBMService_Id1 = row("IBMService_Id").ToString()
                  	Templatecreation_IBM_QPID.IBM_Broker_Url1 = row("IBM_Broker_Url").ToString()
                	Templatecreation_IBM_QPID.IBM_Port1= row("IBM_Port").ToString()
                 	Templatecreation_IBM_QPID.IBM_QueueManger1=row("IBM_QueueManger").ToString()
                  	Templatecreation_IBM_QPID.IBM_Channel1= row("IBM_Channel").ToString()
                  	Templatecreation_IBM_QPID.IBM_DekliveryMode1=row("IBM_DekliveryMode").ToString()
                  	Templatecreation_IBM_QPID.IBM_UserName1=row("IBM_UserName").ToString()
                  	Templatecreation_IBM_QPID.IBM_Password1=row("IBM_Password").ToString()
                  	Templatecreation_IBM_QPID.IBM_Src_Destination1= row("IBM_Src_Destination").ToString()
                  	Templatecreation_IBM_QPID.Tempname_IBM_Src1=row("Tempname_IBM_Src").ToString()
                  	Templatecreation_IBM_QPID.IBM_Dest_Destination1=row("IBM_Dest_Destination").ToString()
                  	Templatecreation_IBM_QPID.Tempname_IBM_Dest1=row("Tempname_IBM_Dest").ToString()
                  	
                  	Templatecreation_IBM_QPID.QPID_Serviceid1=row("QPID_Serviceid").ToString()
                  	Templatecreation_IBM_QPID.Qpid_Queuename1=row("Qpid_Queuename").ToString()
                  	Templatecreation_IBM_QPID.Qpid_QueueUrl1=row("Qpid_QueueUrl").ToString()
                  	Templatecreation_IBM_QPID.Tempname_Qpid1=row("Tempname_Qpid").ToString()
                  	Templatecreation_IBM_QPID.Start()
        Next
        
'''******************************************************************************************************'           
  Dim  csvConnector_trans23 As New CSVConnector("..\..\Tmp_cretion_ROTERS.csv")
   	 For Each row As DataRow In csvConnector_trans23.Rows
   	 	Template_Creation_Routers.Splitter_Serviceid1_Router = row("Splitter_Serviceid").ToString()
                 	Template_Creation_Routers.Schemaname1_Router = row("Schemaname").ToString()
                	Template_Creation_Routers.SplittingStrategy1_Router= row("SplittingStrategy").ToString()
                	Template_Creation_Routers.X_path11_Router=row("X_path1").ToString()
                  	Template_Creation_Routers.X_path21_Router= row("X_path2").ToString()
                  	Template_Creation_Routers.X_path31_Router=row("X_path3").ToString()
                  	Template_Creation_Routers.Tempname_Splitter1_Router=row("Tempname_Splitter").ToString()
                  	Template_Creation_Routers.Multicast_Serviceid1_Router=row("Multicast_Serviceid").ToString()
                  	Template_Creation_Routers.Destination_11_Router= row("Destination_1").ToString()
                  	Template_Creation_Routers.Destination_21_Router=row("Destination_2").ToString()
                  	Template_Creation_Routers.Tempname_Multicast1_Router=row("Tempname_Multicast").ToString()
                  	Template_Creation_Routers.TEDI_Serviceid1_Router=row("TEDI_Serviceid").ToString()
                  	
                  	Template_Creation_Routers.Map_File_Name1_Router=row("Map_File_Name").ToString()
                  	Template_Creation_Routers.Tempname_TEDI1_Router=row("Tempname_TEDI").ToString()
                  
                  	Template_Creation_Routers.Start()
        NEXT          	
'''******************************************************************************************************'           
  Dim  csvConnector_trans231 As New CSVConnector("..\..\TEMPCreat_TFP.csv")
   	 For Each row As DataRow In csvConnector_trans231.Rows
   	 	            Templat_Creation_TFP.TFP_Serviceid_TFP = row("TFP_Serviceid").ToString()
   	 	            Templat_Creation_TFP.InputDirectory_TFP = row("InputDirectory").ToString()
                 	Templat_Creation_TFP.Delay_TFP = row("Delay").ToString()
                	Templat_Creation_TFP.SourceFileName_TFP = row("SourceFileName").ToString()
                	Templat_Creation_TFP.Tempname_TFP_TFP = row("Tempname_TFP").ToString()
                	
                	Templat_Creation_TFP.Generic_Serviceid_TFP = row("Generic_Serviceid").ToString()
                    Templat_Creation_TFP.Schemaname_TFP = row("Schemaname").ToString()
                    Templat_Creation_TFP.Content_Generic_TFP = row("Content_Generic").ToString()
                    Templat_Creation_TFP.Tempname_Generic_TFP = row("Tempname_Generic").ToString()
                    
                  	Templat_Creation_TFP.Start()
       NEXT          	

'''******************************************************************************************************'           
 Dim  csvConnector_transjmserr As New CSVConnector("..\..\FileErr_99.csv")
   	 For Each row As DataRow In csvConnector_transjmserr.Rows
  	 	            Temp_Creat_File_and_Jms_Err.File_Err_Serviceid_Err = row("File_Err_Serviceid").ToString()
   	 	            Temp_Creat_File_and_Jms_Err.Source_Directory_Err = row("Source_Directory").ToString()
                	Temp_Creat_File_and_Jms_Err.Next_Poll_Err = row("Next_Poll").ToString()
                	Temp_Creat_File_and_Jms_Err.Tempname_FileErr_Err = row("Tempname_FileErr").ToString()
                	
                	Temp_Creat_File_and_Jms_Err.JMS_Err_Serviceid_Err = row("JMS_Err_Serviceid").ToString()
                	Temp_Creat_File_and_Jms_Err.JMS_Broker_Url_Err = row("JMS_Broker_Url").ToString()
                    Temp_Creat_File_and_Jms_Err.JMS_Destination_Queue_Err = row("JMS_Destination_Queue").ToString()
                    Temp_Creat_File_and_Jms_Err.Tempname_JMSErr_Err = row("Tempname_JMSErr").ToString()
                   	Temp_Creat_File_and_Jms_Err.Start()
       NEXT          	

'''******************************************************************************************************'           

            Report.End()
            Return errorNumber
        End Function
    End Module
End Namespace
