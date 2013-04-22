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
                
                
// Test Cases File Name - TeevraGateways-Core-Regression-TestCases                
                
// The below scripts are used for Process Creations

//_____________________________________________________________________________________________

//This Scripts covers the testcases "<Teevra Gateways><IT6><832" to "<Teevra Gateways><IT6><837"

//Process- File Endpoint; Tag Delimited Parser; Tag Delimited Formatter; File Endpoint

//Recording_one.Start();

//_____________________________________________________________________________________________    

//_____________________________________________________________________________________________

//This Scripts covers the testcases "<Teevra Gateways><IT6><" to "<Teevra Gateways><IT6><"

//Process- DB Endpoint; DB Parser; Tag Delimited Formatter; JMS Endpoint

//Recording2.Start();     

//_____________________________________________________________________________________________	          

//_____________________________________________________________________________________________	          

//This Scripts covers the testcases "<Teevra Gateways><IT6><" to "<Teevra Gateways><IT6><"

//Process- File Endpoint; XML Parser; Tag Delimited Formatter; File Endpoint

//Recording3.Start();

//_____________________________________________________________________________________________	          

//_____________________________________________________________________________________________  

//This Scripts covers the testcases "<Teevra Gateways><IT6><" to "<Teevra Gateways><IT6><"

//Process- File Endpoint; Fixed Length Parser; Fixed Length Formatter; FTP Endpoint

//login.Start();
//Recording4.Start();
//_____________________________________________________________________________________________

//_____________________________________________________________________________________________  

//This Scripts covers the testcases "<Teevra Gateways><IT6><" to "<Teevra Gateways><IT6><"

//Process- File Endpoint; Fixed Length Parser; Fixed Length Formatter; FTP Endpoint

//                	login.Start();
//              		  Recording5.Start();
//_____________________________________________________________________________________________	          

//_____________________________________________________________________________________________  

//This Scripts covers the testcases "<Teevra Gateways><IT6><" to "<Teevra Gateways><IT6><"

//Process- File Endpoint; Fixed Length Parser; Fixed Length Formatter; FTP Endpoint

//               		 login.Start();
// //commented this one as this is for TCP end points.               		 
//             //  		 Recording6.Start();
//_____________________________________________________________________________________________	          

//_____________________________________________________________________________________________  

//This Scripts covers the testcases "<Teevra Gateways><IT6><" to "<Teevra Gateways><IT6><"

//Process- File Endpoint; Fixed Length Parser; Fixed Length Formatter; FTP Endpoint

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
//                Recording14.Start();
//             	login.Start();
//             	
//             	clickonendpoints.Start();
//                Recording15.Start();
//                login.Start();
                 	  	

// EXECUTED			
         
// Scripts to create Process for Enrichers total 14 process.
// this script will replace recording 22 to 36.
//
//			CSVConnector csvConnector_ENRICHER = new CSVConnector(@"..\..\Enricher.csv");
////			    
////			   
//            	foreach(DataRow row in csvConnector_ENRICHER.Rows)
//				{   
//            	//	login.Start();
//            	//	clickonendpoints.Start();             		
//					Pro_creation_Enrichers.param=row["param"].ToString();
//					Pro_creation_Enrichers.process_name=row["process_name"].ToString();
//					clickonendpoints.Start();
//				
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
//            		 login.Start();
//            		clickonendpoints.Start();            		
//					pro_creation_Validation.param=row["param"].ToString();
//					pro_creation_Validation.process_name=row["process_name"].ToString();
//					pro_creation_Validation.Start();
//					Report.Success(pro_creation_Validation.param + "created sucessfully");
//            	}
//					login.Start();
//            		clickonendpoints.Start(); 
//					Recording37.Start();
////project 38  Second Radio-process					
//					login.Start();
//            		clickonendpoints.Start(); 
//					Recording38.Start();
////project 39  Third process.					
//					login.Start();	
//					clickonendpoints.Start();
//					Recording39.Start();
////project 40  FourthRadio					
//					login.Start();
//					clickonendpoints.Start();
//						Recording40.Start();
////project 41						
//					login.Start(); 
//					clickonendpoints.Start();
//						//Recording41.Start();
//            

//--------------------------------------------------------------------------------------------------------
//IBM MQ Endpoint	Tag Delimited Parser		Tag Delimited Formatter	File Endpoint	File Error Reporter		
            
//           Process_Crt_IBM_Endpoint_1.Start();
           
//--------------------------------------------------------------------------------------------------------
//IBM MQ Endpoint	Tag Delimited Parser		DB Formatter	DB Endpoint	File Error Reporter		

//           Process_IBM_DB_ForEndpoint_2.Start();
//--------------------------------------------------------------------------------------------------------	
//IBM MQ Endpoint	Fixedlength Parser		Fixedlength Formatter	FTP Endpoint	File Error Reporter		

//            Process_IBM_FixlenparserandFTP_3.Start();
//--------------------------------------------------------------------------------------------------------	
//IBM MQ Endpoint	Tag Delimited Parser		Tag Delimited Formatter	JMS Endpoint	File Error Reporter		

//              process_IBMMQ_DEL_JmsEndpoint_4.Start();
//--------------------------------------------------------------------------------------------------------	
//File Endpoint	Fixedlength Parser		Fixedlength Formatter	IBM MQ Endpoint	File Error Reporter		
//				login.Start();
//                Process_File_to_IBM_Endpoint_5.Start();

//--------------------------------------------------------------------------------------------------------	
// DB Endpoint	DB Parser		Tag Delimited Formatter	IBM MQ Endpoint	File Error Reporter		
//				 login.Start();
//                 Process_DBEndpoint_IBMMQEndpoint_6.Start();
//                 
//--------------------------------------------------------------------------------------------------------	                 
// FTP Endpoint	Tag Delimited Parser		Tag Delimited Formatter	IBM MQ Endpoint	File Error Reporter		
//					  login.Start();
//                      Process_FTP_Ibmmqendpoint_7.Start();
//--------------------------------------------------------------------------------------------------------	                 
//JMS Endpoint	Fixedlength Parser		Fixedlength Formatter	IBM MQ Endpoint	JMS Error Reporter		
//					   login.Start();
//                       Process_Jms_IBMMQEndpoint_8.Start();

//--------------------------------------------------------------------------------------------------------	                 
//QPID Endpoint	Tag Delimited Parser		Tag Delimited Formatter	File Endpoint	JMS Error Reporter		
//						 login.Start();
//                         Process_QPID_JMSErr_9.Start();
//                      	
//--------------------------------------------------------------------------------------------------------	                                       	
//QPID Endpoint	Tag Delimited Parser		DB Formatter	DB Endpoint	JMS Error Reporter		

//						login.Start();
//                        Process_QPID_DBEndpoint_10.Start();

//--------------------------------------------------------------------------------------------------------	                                       	

//QPID Endpoint	Fixedlength Parser		Fixedlength Formatter	FTP Endpoint	JMS Error Reporter		

//							login.Start();
//                            Process_QPID_FTPEndpoint_11.Start();

//--------------------------------------------------------------------------------------------------------	                                       	
//QPID Endpoint	Tag Delimited Parser		Tag Delimited Formatter	JMS Endpoint	JMS Error Reporter		
//	 login.Start();
//     process_QPID_JMSEND_12.Start();

//--------------------------------------------------------------------------------------------------------	                                       	
//File Endpoint	Fixedlength Parser		Fixedlength Formatter	QPID Endpoint	JMS Error Reporter		
//	  login.Start();
//      Process_File_QPID_Endp_13.Start();
//            
//--------------------------------------------------------------------------------------------------------	                                       	            
//DB Endpoint	DB Parser		Tag Delimited Formatter	QPID Endpoint	JMS Error Reporter		
//		   login.Start();
//           process_DBEPOint_QPIDEpoint_14.Start();

//--------------------------------------------------------------------------------------------------------	                                       	            
//FTP Endpoint	Tag Delimited Parser		Tag Delimited Formatter	QPID Endpoint	JMS Error Reporter		
//			  login.Start();
//              Procss_FTP_TAG_QPID_15.Start();

//--------------------------------------------------------------------------------------------------------	                                       	            
//JMS Endpoint	Fixedlength Parser		Fixedlength Formatter	QPID Endpoint	JMS Error Reporter		
//			  login.Start();
//              process_JMSFIXQPID_16.Start();

//--------------------------------------------------------------------------------------------------------	                                       	            
//File Endpoint	FIXML Parser		Generic Formatter	File Endpoint	File Error Reporter		
//				login.Start();
//                Process_FileFile_17.Start();

//--------------------------------------------------------------------------------------------------------	                                       	            
//File Endpoint	Tag Delimited Parser	Savepoint	Tag Delimited Formatter	File Endpoint	File Error Reporter		
//				login.Start();
//                Process_Filetofile_18.Start();
//--------------------------------------------------------------------------------------------------------	                                       	            
//File Endpoint	Tag Delimited Parser	Aggregator	Tag Delimited Formatter	File Endpoint	File Error Reporter		
//			   login.Start();
//               process_FileEndpoint_Aggre_FileEnd_19.Start();

//--------------------------------------------------------------------------------------------------------	                                       	            

//File Endpoint	FIXML Parser	Error Extractor		File Endpoint	File Error Reporter		
//				login.Start();
//				process_File_ErrorEx_fileEnd_20.Start();

//--------------------------------------------------------------------------------------------------------	                                       	            

//File Endpoint	FIXML Parser	FIXML Validator	FIXML Formatter	File Endpoint	File Error Reporter		
//				login.Start();
//				Process_File_FIXMLValidator_File_21.Start();

//--------------------------------------------------------------------------------------------------------	                                       	            
    
//File Endpoint	Tag Delimited Parser	Splitter	Tag Delimited Formatter	File Endpoint	JMS Error Reporter		
//				login.Start();
//				Process_File_Splitter_File_22.Start();

//--------------------------------------------------------------------------------------------------------	                                       	            
 
//TFP Endpoint		TEDI		File Endpoint	JMS Error Reporter		
//		  login.Start();
//          Process_TFP_TEDI_file_23.Start();

//--------------------------------------------------------------------------------------------------------	                                       	            
//File Endpoint	Tag Delimited Parser	MultiCast	"Tag Delimited Formatter1; Tag Delimited Formatter2"	"File Endpoint1;File Endpoint2"	JMS Error Reporter		

//			login.Start();
//			Procss_File_Multicast_Endpoint_24.Start();
//			login.Start();
//--------------------------------------------------------------------------------------------------------	                                       	            

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
