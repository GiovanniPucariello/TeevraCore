/*
 * Created by Ranorex
 * User: RSundaram
 * Date: 1/19/2011
 * Time: 4:29 PM
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */

using System;
using System.Drawing;
using System.Text.RegularExpressions;
using System.Threading;
using System.Windows.Forms;

using Finetuned;
using Ranorex;
using Ranorex.Core;
using System.Data;

namespace Finetuned
{
    class Program
    {
        [STAThread]
        public static int Main(string[] args)
        {
            Keyboard.AbortKey = System.Windows.Forms.Keys.Pause;
            int error = 0;

            string logFileName = "Test.rxlog";

            Report.Setup(ReportLevel.Info, logFileName, true);
            
            
          //  trans14.Start();

            try
            {
                //TODO: Code here - for example:
//                  Recording_one.Start();                
//		           Recording2.Start();                
//               		Recording3.Start();   
//              		login.Start();
//              		 Recording4.Start();
//                	login.Start();
//              		  Recording5.Start();
//               		 login.Start();
// //commented this one as this is for TCP end points.               		 
//             //  		 Recording6.Start();
//               //			login.Start();
//               	Recording7.Start();
//               	 login.Start();
//               	 Recording8.Start();
//	            login.Start();
//                Recording9.Start();
//                login.Start();
//                Recording10.Start();
//               login.Start();
//               clickonendpoints.Start();
//                 Recording11.Start();
//                login.Start();
//                Recording12.Start();
//                login.Start();
//                Recording13.Start();
//                login.Start();
//                clickonendpoints.Start();
////                Recording14.Start();
//             	login.Start();
//             	
//             	clickonendpoints.Start();
//                Recording15.Start();
//                login.Start();
//                 	  	

			
         
// Scripts to create Process for Enrichers total 14 process.
// this script will replace recording 22 to 36.
//
//				CSVConnector csvConnector_ENRICHER = new CSVConnector(@"..\..\Enricher.csv");
//			    
//			   
//            	foreach(DataRow row in csvConnector_ENRICHER.Rows)
//				{   
//            		login.Start();
//            		clickonendpoints.Start();             		
//					Pro_creation_Enrichers.param=row["param"].ToString();
//					Pro_creation_Enrichers.process_name=row["process_name"].ToString();
//					Pro_creation_Enrichers.Start();
//					Report.Success(Pro_creation_Enrichers.process_name + "created sucessfully");
//				}  

       	
// Scripts to create Process for validation Services total 7 process.
// this script will replace recording 16 to 21
//        CSVConnector csvConnector_Validation = new CSVConnector(@"..\..\VALIDATION.csv");
//			    
//			    
//            	foreach(DataRow row in csvConnector_Validation.Rows)
//				{   
//            		login.Start();
//            		clickonendpoints.Start();            		
//					pro_creation_Validation.param=row["param"].ToString();
//					pro_creation_Validation.process_name=row["process_name"].ToString();
//					pro_creation_Validation.Start();
//					Report.Success(pro_creation_Validation.param + "created sucessfully");
//            	}
					            		login.Start();
            		clickonendpoints.Start(); 
					Recording37.Start();
//project 38  Second Radio-process					
										            		login.Start();
            		clickonendpoints.Start(); 
					Recording38.Start();
//project 39  Third process.					
					login.Start();	
					clickonendpoints.Start();
					Recording39.Start();
//project 40  FourthRadio					
					login.Start();
					clickonendpoints.Start();
						Recording40.Start();
//project 41						
					login.Start(); 
					clickonendpoints.Start();
						//Recording41.Start();
            
            
            
            
            }
            catch (ImageNotFoundException e)
            {
                Report.Error(e.ToString());
                Report.LogData(ReportLevel.Error, "Image not found", e.Feature);
                Report.LogData(ReportLevel.Error, "Searched image", e.Image);
                error = -1;
            }
            catch (RanorexException e)
            {
                Report.Error(e.ToString());
                Report.Screenshot();
                error = -1;
            }
            catch (ThreadAbortException)
            {
                Report.Warn("AbortKey has been pressed");
                Thread.ResetAbort();
                error = -1;
            }
            catch (Exception e)
            {
                Report.Error("Unexpected exception occured: " + e.ToString());
                error = -1;
            }

            Report.End();
            return error;
           }
    }
}
