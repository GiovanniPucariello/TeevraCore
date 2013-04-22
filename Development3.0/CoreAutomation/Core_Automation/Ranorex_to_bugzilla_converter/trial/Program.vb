'
' Created by Ranorex
' User: mbothra
' Date: 4/17/2012
' Time: 7:28 PM
' 
' To change this template use Tools | Options | Coding | Edit Standard Headers.
'

Imports Microsoft.VisualBasic
Imports System
Imports System.Threading
Imports System.Drawing
Imports System.Collections.Generic
Imports System.Text.RegularExpressions
Imports System.Windows.Forms

Imports Ranorex
Imports Ranorex.Core
Imports Ranorex.Core.Reporting
Imports Ranorex.Core.Testing

Namespace trial
    Module Program

        <STAThread()> _
        Function Main() As Integer
            Keyboard.AbortKey = System.Windows.Forms.Keys.Pause
            Dim errorNumber As Integer = 0

            Try
                errorNumber = TestSuiteRunner.Run(GetType(Program), Environment.CommandLine)
            Catch e As Exception
                Report.Error("Unexpected exception occured: " + e.ToString())
                errorNumber = -1
            End Try

            Return errorNumber

            End Function
    End Module
End Namespace
