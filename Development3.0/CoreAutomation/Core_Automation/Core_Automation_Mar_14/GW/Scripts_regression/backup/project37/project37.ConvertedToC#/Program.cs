using Microsoft.VisualBasic;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics;
//
// Created by Ranorex
// User: shasrivastava
// Date: 1/27/2011
// Time: 11:24 AM
// 
// To change this template use Tools | Options | Coding | Edit Standard Headers.
//

using System;
using System.Threading;

using Ranorex;
using Ranorex.Core;

namespace project37.project37
{
	static class Program
	{

		[STAThread()]

		public static int Main()
		{
			Keyboard.AbortKey = System.Windows.Forms.Keys.Pause;
			Int16 errorNumber = 0;

			string logFileName = "Test.rxlog";

			Report.Setup(ReportLevel.Info, logFileName, true);

			try {
				// Code here - for example:
				Recording1.Start();

			} catch (ImageNotFoundException e) {
				Report.Error(e.ToString());
				Report.LogData(ReportLevel.Error, "Image not found", e.Feature);
				Report.LogData(ReportLevel.Error, "Searched image", e.Image);
				errorNumber = -1;
			} catch (RanorexException e) {
				Report.Error(e.ToString());
				Report.Screenshot();
				errorNumber = -1;
			} catch (ThreadAbortException e) {
				Report.Warn("AbortKey has been pressed");
				Thread.ResetAbort();
				errorNumber = -1;
			} catch (Exception e) {
				Report.Error("Unexpected exception occured: " + e.ToString());
				errorNumber = -1;
			}

			Report.End();
			return errorNumber;
		}
	}
}
