'
' Created by Ranorex
' User: shasrivastava
' Date: 1/27/2011
' Time: 11:24 AM
' 
' To change this template use Tools | Options | Coding | Edit Standard Headers.
'

Imports Microsoft.VisualBasic
Imports System
Imports System.Threading

Imports Ranorex
Imports Ranorex.Core

Namespace project37
    Module Program

        <STAThread()> _
         Function Main() As Integer

            Keyboard.AbortKey = System.Windows.Forms.Keys.Pause
            Dim errorNumber As Int16 = 0

            Dim logFileName As String = "Test.rxlog"

            Report.Setup(ReportLevel.Info, logFileName, True)

            Try
                ' Code here - for example:
                Recording1.Start()

            Catch e As ImageNotFoundException
                Report.Error(e.ToString())
                Report.LogData(ReportLevel.Error, "Image not found", e.Feature)
                Report.LogData(ReportLevel.Error, "Searched image", e.Image)
                errorNumber = -1
            Catch e As RanorexException
                Report.Error(e.ToString())
                Report.Screenshot()
                errorNumber = -1
            Catch e As ThreadAbortException
                Report.Warn("AbortKey has been pressed")
                Thread.ResetAbort()
                errorNumber = -1
            Catch e As Exception
                Report.Error("Unexpected exception occured: " + e.ToString())
                errorNumber = -1
            End Try

            Report.End()
            Return errorNumber
        End Function
    End Module
End Namespace
