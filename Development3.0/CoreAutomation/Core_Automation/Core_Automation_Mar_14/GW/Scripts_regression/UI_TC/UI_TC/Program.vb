'
' Created by Ranorex
' User: Lbatchu
' Date: 2/17/2011
' Time: 6:26 PM
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
'mports System.Threading
Imports System.Windows.Forms

'Imports Ranorex
'Imports Ranorex.Core


Namespace UI_TC
    Module Program

        <STAThread()> _
         Function Main() As Integer

            Keyboard.AbortKey = System.Windows.Forms.Keys.Pause
            Dim errorNumber As Int16 = 0

            Dim logFileName As String = "Test.rxlog"

            Report.Setup(ReportLevel.Info, logFileName, True)
            
            
            
'            	Dim csvConnector As New CSVConnector("..\..\data.csv")
'				For Each row As DataRow In csvConnector.Rows
'				scenario1.user_id= row("user_id").ToString
'				scenario1.pwd_id = row("pwd").ToString
'				scenario1.start()
'				Next
'            logout.Start()
'            Recording2.Start()
'            logout.Start()			
'            Recording3.Start()
'            logout.Start()
'        
'            Recording4.Start()
'            
'	        logout.Start()
'            Recording5.Start()
'            logout.Start()
'            Recording7.Start()
'            logout.Start()
'            Recording8.Start()
'            logout.Start()
'            Recording9.Start()
'            logout.Start()
          '  Recording10.Start()
 'recording 11 needs to be checked later
         '   logout.Start()
        '    Recording11.Start()
'            logout.Start()
'            Recording13.Start()
'            logout.Start()
'             login_1.Start()
'
'            createtestprocess.Start()
'            
'
'           scenario13.Start()
'             login.Start()
'               scenario14.Start()          
'    login.Start()




		'	report.info("starting delete validation")
' need to check later

'                scenario15.Start()
''              login.Start()
'                scenario16.Start()
'              login.Start()
'                scenario21.Start()
'              login.Start()
'                scenario22.Start()
'              login.Start()
'                scenario25_CreDelUp_role.Start()
'              login.Start()
'                scenario54.Start()
'              login.Start()
'                scenario56.Start()
'              login.Start()
                scenario57.Start()
              login.Start()
'                Scenario66_GenericFormater.Start()
'              login.Start()

            
            
  			          

            
       

'        
'				Dim csvConnector As New CSVConnector("..\..\data.csv")
'				For Each row As DataRow In csvConnector.Rows
'				scenario1.user_id= row("user_id").ToString
'				scenario1.pwd_id = row("pwd").ToString
'				scenario1.start()
'				Next
		
         	
		
			
			
	
			
			
'			try
'			Recording2.start()
'           	Catch e As Exception
'           	report.Failure("test Recording2 failed")
'           	End Try              	
'			logout.Start()
'			
'			
'			try
'			Recording3.start()
'           	Catch e As Exception
'           	report.Failure("test Recording3 failed")
'           	End Try              	
'			logout.Start()
'			
'			
'			try
'			Recording4.start()
'           	Catch e As Exception
'           	report.Failure("test Recording4 failed")
'           	End Try              	
'			logout.Start()
'			
'			
'			try
'			Recording5.start()
'           	Catch e As Exception
'           	report.Failure("test Recording5 failed")
'           	End Try              	
'			logout.Start()
'			
'			
'			
'			try
'			Recording7.start()
'           	Catch e As Exception
'           	report.Failure("test Recording7 failed")
'           	End Try              	
'			logout.Start()
'			
'			
'			
'			try
'			Recording8.start()
'           	Catch e As Exception
'           	report.Failure("test Recording8 failed")
'           	End Try              	
'			logout.Start()
'			
'			
'			
'			try
'			Recording9.start()
'           	Catch e As Exception
'           	report.Failure("test Recording9 failed")
'           	End Try              	
'			logout.Start()
'			
'			
'			
'						 try
'			Recording10.start()
'           	Catch e As Exception
'           	report.Failure("test Recording10 failed")
'           	End Try              	
'			logout.Start()
'			
'			
'			
'			try
'			Recording11.start()
'           	Catch e As Exception
'           	report.Failure("test Recording11 failed")
'           	End Try              	
'			logout.Start()
'			
'			
''			
''			try
''			Recording12.start()
''           	Catch e As Exception
''           	report.Failure("test Recording12 failed")
''           	End Try              	
''			logout.Start()
'			
'			
'			
'			try
'			Recording13.start()
'           	Catch e As Exception
'           	report.Failure("test Recording13 failed")
'           	End Try              	
'			logout.Start()
'			
'			
'			
'						 try
'			Recording14.start()
'           	Catch e As Exception
'           	report.Failure("test Recording14 failed")
'           	End Try              	
'			logout.Start()
'			
'			
'
'			
'			
'			try
'			scenario13.start()
'           	Catch e As Exception
'           	report.Failure("test scenario13 failed")
'           	End Try           	
'			login.Start()			
'			
'			try
'			scenario14.start()
'           	Catch e As Exception
'           	report.Failure("test scenario14 failed")
'           	End Try           	
'			login.Start()	
'						try
'			scenario15.start()
'           	Catch e As Exception
'           	report.Failure("test scenario15 failed")
'           	End Try           	
'			login.Start()	
'			
'						try
'			scenario16.start()
'           	Catch e As Exception
'           	report.Failure("test scenario16 failed")
'           	End Try           	
'			login.Start()	
'			
'						try
'			scenario21.start()
'           	Catch e As Exception
'           	report.Failure("test scenario21 failed")
'           	End Try           	
'			login.Start()	
'			
'			
'			
'						try
'			scenario22.start()
'           	Catch e As Exception
'           	report.Failure("test scenario22 failed")
'           	End Try           	
'			login.Start()	
'			
'			
'			
'			try
'			scenario25.start()
'           	Catch e As Exception
'           	report.Failure("test scenario25 failed")
'           	End Try           	
'			login.Start()	
'			
'			
'			
'			try
'			scenario25_CreDelUp_role.start()
'           	Catch e As Exception
'           	report.Failure("test scenario25_CreDelUp_role failed")
'           	End Try           	
'			login.Start()	
'			
'			
'			try
'			scenario54.start()
'           	Catch e As Exception
'           	report.Failure("test scenario54 failed")
'           	End Try           	
'			login.Start()	
'			
'			
'			
'						try
'			scenario56.start()
'           	Catch e As Exception
'           	report.Failure("test scenario56 failed")
'           	End Try           	
'			login.Start()	
'			
'			
'			
'						try
'			scenario57.start()
'           	Catch e As Exception
'           	report.Failure("test scenario57 failed")
'           	End Try           	
'			login.Start()	
'			
'			
'			
'						try
'			Scenario66_GenericFormater.start()
'           	Catch e As Exception
'           	report.Failure("test Scenario66_GenericFormater failed")
'           	End Try           	
'			login.Start()	
'			
'			
'			
'						try
'			scenario9.start()
'           	Catch e As Exception
'           	report.Failure("test scenario9 failed")
'           	End Try           	
'			login.Start()	
'			
'			
'			
'			
'           
'            Report.End()
'            Return errorNumber
        End Function
    End Module
End Namespace
