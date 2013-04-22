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
            
            
                 Report.Success("------------------------------Formater validation Started--------------------")     
                 
                                 
'    				Dim csvConnector As New CSVConnector("..\..\Config.csv")'    				
'    				For Each row As DataRow In csvConnector.Rows
'    				report.Success("File Template creation started")
'                 	file_source.SourceFile = row("SourceFile").ToString()
'                  	file_source.DestFile = row("DestFile").ToString()
'                	file_source.Nxtpoll= row("Nxtpoll_file").ToString()
'                 	file_source.Sourcepattern=row("Sourcepattern").ToString()
'                  	file_source.Destpattern= row("Destpattern").ToString()
'                  	file_source.Sourcetemp=row("SourcefileTempname").ToString()
'                  	file_source.filedesttemp=row("DestfileTempname").ToString()
'                 	file_source.Start()
'					report.Success("File Template creation Ends")
'''          		  '   FTP Source Config
'				report.Success("=======FTP src Template creation started==========")
'                  FtpSrcEndPoints.FTP_polltime=row("FTPSrc_polltime").ToString()
'                  FtpSrcEndPoints.ftpport=row("ftpsrc_port").ToString()
'                  FtpSrcEndPoints.FTP_UI=row("FTPSrc_Userid").ToString()
'                  FtpSrcEndPoints.Ftp_srcpwd=row("FtpSrc_password").ToString()
'                  FtpSrcEndPoints.FTP_srctempnm=row("FTP_sourcetemplate_name").ToString()
'                  FtpSrcEndPoints.FTPURL=row("FTPsrc_URL").ToString()
'                  FtpSrcEndPoints.FTP_srcdir=row("FTP_Sourcedir").ToString()
'                	 FtpSrcEndPoints.Start()
'				report.Success("=======FTP src Template creation ENDS==========")
'''''                  'FTP Dest Config
'				report.Success("=======FTP dest Template creation started==========")
'                  FtpDest.FTP_polltime=row("FTPDest_polltime").ToString()
'                  FtpDest.ftpport=row("ftpdest_port").ToString()
'                  FtpDest.FTP_UI=row("FTPdest_Userid").ToString()
'                  FtpDest.Ftp_srcpwd=row("Ftpdest_password").ToString()
'                  FtpDest.FTP_srctempnm=row("FTP_destemplate_name").ToString()
'                  FtpDest.FTPURL=row("FTPdest_URL").ToString()
'                  FtpDest.FTP_srcdir=row("FTPdest_Sourcedir").ToString()
'               	 FtpDest.Start()
'next
				Dim csvConnector1 As New CSVConnector("..\..\Formatterconfig.csv")
              	 For Each row As DataRow In csvConnector1.Rows
             	TagDelimiter.Delimiter_Tagdel = row("Delimiter_Tagdel").ToString()
				TagDelimiter.TempName_TagDel = row("TempName_TagDel").ToString()
				TagDelimiter.Start()
				FixLenFormatter.TempName_FixlenForm = row("TempName_FixlenForm").ToString()
				FixLenFormatter.Start()
			    DBFormatter.TempName_DB = row("TempName_DB").ToString()
			    DBFormatter.Root_DB= row("Root_DB").ToString()
			    DBFormatter.Start()
			    Fixmlformatter.Temp_Fixmlformatter=row("TempName_Fixmlformatter").ToString()
			    Fixmlformatter.Start()
			   	XMLFormatter.Attr_1 = row("Attr_1").ToString
			    XMLFormatter.Attr_2= row("Attr_2").ToString
			   XMLFormatter.Attr_3= row("Attr_3").ToString
		   		XMLFormatter.Attr_4= row("Attr_4").ToString
			  XMLFormatter.Attr_5= row("Attr_5").ToString			  '  XMLFormatter.Xpath_1= row("Xpath_1").ToString
			    XMLFormatter.Xpath_2= row("Xpath_2").ToString
			  XMLFormatter.Xpath_3= row("Xpath_3").ToString
			   XMLFormatter.Xpath_4= row("Xpath_4").ToString
			    XMLFormatter.Xpath_5= row("Xpath_5").ToString
			   XMLFormatter.Schemaname= row("Schemaname_XML").ToString
			    XMLFormatter.TempName_XMLFormater= row("TempName_XMLFormater").ToString
			    XMLFormatter.Start()
                Next
'     Report.Success("------------------------------Formater validation Ends--------------------")     
'
''                 	
'			login.Start()
'            Report.Success("------------------------------Parsers validation Started--------------------")
'              Dim  csvConnector2 As New CSVConnector("..\..\Config_parser.csv")
'		      For Each row As DataRow In csvConnector2.Rows
'		      ' Fix len parser
'		  		Fixlenparser.Tempname_fixlen = row("temp_Name_Fixlenparser").ToString()
'		  		Fixlenparser.Start()
'		       'Tag Parser
'		      tagdelparser.Tempname_tagdel= row("temp_Name_tagdelformater").ToString()
'		      tagdelparser.Start()
''		       'XML Parser
'		       XMLParser.Attr_1 = row("Attr_1").ToString
'			   XMLParser.Attr_2= row("Attr_2").ToString
'			   XMLParser.Attr_3= row("Attr_3").ToString
'			   XMLParser.Attr_4= row("Attr_4").ToString
'			   XMLParser.Attr_5= row("Attr_5").ToString
'		  	 	XMLParser.Xpath_1= row("Xpath_1").ToString
'				 XMLParser.Xpath_2= row("Xpath_2").ToString
'		 	 		XMLParser.Xpath_3= row("Xpath_3").ToString
'		  	 	XMLParser.Xpath_4= row("Xpath_4").ToString
'			 	XMLParser.Xpath_5= row("Xpath_5").ToString
'			 	XMLParser.Schemaname= row("Schemaname_XML").ToString
'		 		 XMLParser.TempName_XMLFormater= row("TempName_XMLparser").ToString
'				 XMLParser.Start()
''				 'fixmlparser
'			 	FixmlParser.Tempname_Fixml=row("Tempname_Fixml").ToString
'		  	 	FixmlParser.Start()
'		  	 	'dbparser
'		  	 	DBParser.Start()
'		  	 	next
'		  	 	          Report.Success("------------------------------Parsers validation End--------------------")
''		  	 	
'		  	 	
		  	 	
'		  	 Next
'              Catch e As Exception
'              	report.Failure("parsers are failed")
'              	test1.Start()
'              	end try
'
''small issue while selecting integer
''try
'              Report.Success("------------------------------Transformer validation Started--------------------")     
'
'			 Transformer_validation.Start()     
'			 Report.Success("------------------------------Transformer validation Ends--------------------")

''Catch e As Exception
''	report.Info("Transformer_validation failed")
'	
''	End Try
'	
'	
'	
'''	try
'    Report.Success("------------------------------enricher validation Started--------------------")     
'
'			 Enrchment.Start()
'			 
'    Report.Success("------------------------------enricher validation Ends--------------------")   
'''Catch e As Exception
''	report.Info("Enrchment failed")
''	End Try
'	
	
'	'	try
'    Report.Success("------------------------------Validation service validation Started--------------------")   
'			 Validation_Service.Start()
' Report.Success("------------------------------Validation service validation Ends--------------------")   
'
''Catch e As Exception
''	report.Info("Validation_Service failed")
''	End Try
' Report.Success("------------------------------Save point  validation Started--------------------")   
'
'			Savepoint.Start()
'	Report.Success("------------------------------Save point  validation Ends--------------------")   
'
'		'	ErrorExtractor.Start()
'Report.Success("-----------------------------CBR  validation Started--------------------")   
'
'			CBR.Start()
'Report.Success("-----------------------------CBR  validation Ends--------------------")   
'Report.Success("-----------------------------IBm MQ  validation Started--------------------")   
'			IbmMQ.Start()
'Report.Success("-----------------------------IBm MQ  validation Ends--------------------")   
'Report.Success("-----------------------------agrregator validation started--------------------")   
'			agrregator.Start()
'Report.Success("-----------------------------agrregator validation ends--------------------") 

            
         '   error_templates.Start()
            
           
'            		dim trans_param_name as String ="add"
'		Dim buttonLoad_template___ As Ranorex.Button
'		buttonLoad_template___ = "/dom[@domain~'^.*']/body/flexobject/form/element[@type='ControlBar']/button[@text='Load template...']"
'		buttonLoad_template___.Click()
'		Dim formChoose_Template As ranorex.Form
'		formChoose_Template = "/dom[@domain~'^.*']/body/flexobject/form[@title='Choose Template']"
'		formChoose_Template.Click()		
'		Dim buttonButton As ranorex.Button
'		buttonButton = "/dom[@domain~'^.*']/body/flexobject/form[@title='Choose Template']/form/container/combobox/button[@type='Button']"
'			buttonButton.Click()
'			formChoose_Template.Click()
'		
'		Dim listList As List
'		listList = "/dom[@domain~'^.*']/body/flexobject/list[@type='List']"
'					
'           Dim count As Integer=listList.Items.Count
'          ' messagebox.Show(count)
'           dim i as Integer=1
'
'			Dim buttonLoad As Ranorex.Button
'			buttonLoad = "/dom[@domain~'^.*']/body/flexobject/form[@title='Choose Template']/element[@type='ControlBar']/button[@text='Load']"
'			
'			For Each item As Ranorex.ListItem In listList.Items
'			Keyboard.Press(Keys.Down, 80, Keyboard.DefaultKeyPressTime, 1, False)
'			report.Info(item.Text)
'			i=i+1
'			If StrComp( item.Text,trans_param_name)=0 Then	
'				if i<count then
'			Keyboard.Press(Keys.Up, 80, Keyboard.DefaultKeyPressTime, 1, False)	
'			  end if
'			buttonLoad.Click		
'			exit For
'			Else
'			report.Info(item.Text+" doesnt matched with " + trans_param_name)
'			End If				
'			Next
'        Dim buttonLoad_template___ As Ranorex.Button
'		buttonLoad_template___ = "/dom[@domain~'^.*']/body/flexobject/form/element[@type='ControlBar']/button[@text='Load template...']"
'		buttonLoad_template___.Click()
'		Dim formChoose_Template As ranorex.Form
'		formChoose_Template = "/dom[@domain~'^.*']/body/flexobject/form[@title='Choose Template']"
'		formChoose_Template.Click()
'		Dim buttonButton As ranorex.Button
'		buttonButton = "/dom[@domain~'^.*']/body/flexobject/form[@title='Choose Template']/form/container/combobox/button[@type='Button']"
'		buttonButton.Click()
'		
'			Dim buttonLoad As Ranorex.Button
'			buttonLoad = "/dom[@domain~'^.*']/body/flexobject/form[@title='Choose Template']/element[@type='ControlBar']/button[@text='Load']"
'			formChoose_Template.Click()
'			Dim listList As List
'			listList = "/dom[@domain~'^.*']/body/flexobject/list[@type='List']"
'		    Dim count As Integer=listList.Items.Count
'          ' messagebox.Show(count)
'          	 dim i as Integer=1
'			For Each item As Ranorex.ListItem In listList.Items
'			Keyboard.Press(Keys.Down, 80, Keyboard.DefaultKeyPressTime, 1, False)
'			report.Info(item.Text)
'			i=i+1
'			If StrComp( item.Text,"add")=0 Then
'				if i<count then
'				Keyboard.Press(Keys.Up, 80, Keyboard.DefaultKeyPressTime, 1, False)					
'		 	 	end if
'				buttonLoad.Click
'			exit For
'			Else
'			report.Info(item.Text+" doesnt matched with " + "add")
'			End If
'			
'			next
'            
				login.Start()

'             Dim  csvConnector_trans As New CSVConnector("..\..\trans_param.csv")
'	     	 For Each row As DataRow In csvConnector_trans.Rows
'	     	 	precondition_process.Start()
'	      		Trans_processcreation.paramname= row("param").ToString
'	      		Trans_processcreation.process_name=row("trans_process_name").ToString
'	      		Trans_processcreation.Start()
'	      		login.Start()
'	      	Next
'





			
			


'             Dim  csvConnector_trans As New CSVConnector("..\..\trans_param.csv")
'	     	 For Each row As DataRow In csvConnector_trans.Rows
'	     	 	precondition_process.Start()
'	      		Trans_processcreation.paramname= row("param").ToString
'	      		Trans_processcreation.process_name=row("trans_process_name").ToString
'	      		Trans_processcreation.Start()
'	      		login.Start()
'	      	Next

		
		
'		dim trans_param_name as String ="add"
'		Dim buttonLoad_template___ As Ranorex.Button
'		buttonLoad_template___ = "/dom[@domain~'^.*']/body/flexobject/form/element[@type='ControlBar']/button[@text='Load template...']"
'		buttonLoad_template___.Click()
'		Dim formChoose_Template As ranorex.Form
'		formChoose_Template = "/dom[@domain~'^.*']/body/flexobject/form[@title='Choose Template']"
'		formChoose_Template.Click()		
'		Dim buttonButton As ranorex.Button
'		buttonButton = "/dom[@domain~'^.*']/body/flexobject/form[@title='Choose Template']/form/container/combobox/button[@type='Button']"
'			buttonButton.Click()
'			formChoose_Template.Click()
'
'		Dim listList As List
'		listList = "/dom[@domain~'^.*']/body/flexobject/list[@type='List']"
'					
'           Dim count As Integer=listList.Items.Count
'          ' messagebox.Show(count)
'           dim i as Integer=1
'
'			Dim buttonLoad As Ranorex.Button
'			buttonLoad = "/dom[@domain~'^.*']/body/flexobject/form[@title='Choose Template']/element[@type='ControlBar']/button[@text='Load']"
'			
'			For Each item As Ranorex.ListItem In listList.Items
'			Keyboard.Press(Keys.Down, 80, Keyboard.DefaultKeyPressTime, 1, False)
'			report.Info(item.Text)
'			i=i+1
'			If StrComp( item.Text,trans_param_name)=0 Then	
'				if i<count then
'			Keyboard.Press(Keys.Up, 80, Keyboard.DefaultKeyPressTime, 1, False)	
'			  end if
'			buttonLoad.Click		
'			exit For
'			Else
'			report.Info(item.Text+" doesnt matched with " + trans_param_name)
'			End If				
'			Next
            Report.End()
            Return errorNumber
        End Function
    End Module
End Namespace
