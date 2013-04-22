// EurextTestHarness.cpp : Defines the entry point for the console application.
//
/*==========================================================================
 *
 *  !EuronextHarness.cpp   functions								   June 10, 2005
 *
 *  Source Code for Properties File Utililty Functions
 * 
 *  Utility functions to read properties from a properties file and load them
 *  into memory as a linked list. Once read, any property can be accessed at
 *  any point of time by calling the getProperty function.
 *
 *  Author: Manav Garg (manav_garg@hotmail.com)
 *==========================================================================*/

/* ------------------------------------------------------------------------ */
/* ---------------------------  HEADER FILES    --------------------------- */
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>
#include <windows.h>
#include <iostream>
#include <winsock.h>

#include "com_headstrong_fusion_connector_testeurex_TestEurexConsumer.h"
#include "com_headstrong_fusion_connector_testeurex_TestEurexConsumer_QueueReader.h"
#include "com_headstrong_fusion_connector_testeurex_TestEurexProducer.h"

#include "EurexMain.h"
#include "PropertyFileReader.h"

using namespace std;

void init() 
{
	loadPropertyFile(propertyFileName);			//open the pandora's box
	loadProperties();					//load the props from the file
	listProperties();					//list all the properties ya got
	initialized = 1;
}


/**
This method is normally invoked to simulate a response message sent by EUREX and send the corresponding byte array into Teevra*/
JNIEXPORT jbyteArray JNICALL Java_com_headstrong_fusion_connector_testeurex_TestEurexConsumer_getByteArray
(JNIEnv * env, jobject obj, jint jReqId, jchar jProdLine) {

	int reqId = -1;
	jchar prodLine = '\0';
	char testCaseName[10];

	if (initialized != 1) 
	{
		init();
	}
	
	reqId = jReqId;
	prodLine=jProdLine;

	/*env->GetCharArrayRegion((jcharArray)jProdLine, 0, 1, &prodLine);*/
	_itoa(reqId, testCaseName,10);
		if (prodLine == 'F') {
		strcat_s(testCaseName, 10, "F");
	} else {
		strcat_s(testCaseName, 10, "O");
	}

	switch(reqId) {
		case DRIV_SUBSCRIBE_TRADE_CONFIRMATION:
			if (prodLine == 'F') 
			{
				return getFutSubTrdConfPrivBcastTArray(env, testCaseName);
			} else {
				return getOptSubTrdConfPrivBcastTArray(env, testCaseName);
			}
			break;
		case DRIV_SUBSCRIBE_GIVE_UP_TAKE_UP:
			if (prodLine == 'F')
			{
				return getFutSubGivUpTakUpPrivBcastTArray(env, testCaseName);
			} else 
			{
				return getOptSubGivUpTakUpPrivBcastTArray(env, testCaseName);
			}
			break;
		case DRIV_ENTER_GIVE_UP_ORDER_RID:
			if (prodLine == 'F') 
			{
				return getFutEntGivUpOrdrResponseTArray(env, testCaseName);
			} else 
			{
				return getOptEntGivUpOrdrResponseTArray(env, testCaseName);
			}
			break;
		default:
			 printf("Error");
			 break;
	}
}

/**
This method is normally invoked to simulate a request message being sent to EUREX. So this method will check if the message coming out of 
Teevra is same as what is expected to go to EUREX*/
JNIEXPORT jstring JNICALL Java_com_headstrong_fusion_connector_testeurex_TestEurexProducer_compareByteArray
(JNIEnv * env, jobject obj, jint jReqId, jchar jProdLine, jbyteArray jMsg) {
    
	int reqId = -1;
	jchar prodLine = '\0';
	char statusMsg[100000];
	char testCaseName[10];

	if (initialized != 1) 
	{
		init();
	}
	statusMsg[0] = '\0';
	reqId = jReqId;
	prodLine=jProdLine;

	/*env->GetCharArrayRegion((jstring)jProdLine, 0, 1, &prodLine);*/
	printf("itoa \n");
	_itoa(reqId, testCaseName,10);


	if (prodLine == 'F') {

		strcat_s(testCaseName, 10, "F");
	} else {
		strcat_s(testCaseName, 10, "O");
	}
	switch (reqId)
	{
			case DRIV_SUBSCRIBE_TRADE_CONFIRMATION:
			if (prodLine == 'F') 
			{
				compareFutBscSubTrdConfSubjectTArray(jMsg, testCaseName, env, statusMsg);
			} else {
				compareOptBscSubTrdConfSubjectTArray(jMsg, testCaseName, env, statusMsg);
			}
			break;
		case DRIV_SUBSCRIBE_GIVE_UP_TAKE_UP:
			if (prodLine == 'F')
			{
				compareFutBscSubGivUpTakUpSubjectTArray(jMsg, testCaseName, env, statusMsg);
			} else 
			{
				compareOptBscSubGivUpTakUpSubjectTArray(jMsg, testCaseName, env, statusMsg);
			}
			break;
		case DRIV_ENTER_GIVE_UP_ORDER_RID:
			if (prodLine == 'F') 
			{
				compareFutEntGivUpOrdrRequestTArray(jMsg, testCaseName, env, statusMsg);
			} else 
			{
				compareOptEntGivUpOrdrRequestTArray(jMsg, testCaseName, env, statusMsg);
			}
			break;
		default:
			 printf("Error");
			 break;
	}
	
	if (statusMsg[0] == '\0') 
	{
		strcat_s(statusMsg, 1000, "true");
	}

	jstring msg = env->NewStringUTF(statusMsg); 

	return msg;
	//return (jstring)statusMsg;
}

int main(int argc, char* argv[])
{
	char searchValue[MAXVALUESIZE] = {""};
	init();
									//get me the property count
	printf("\n\nProperty Count        : %d\n", getPropertyCount());
									//get me a property value
	int i;
	getIntProperty("property1", &i);
	printf("\n\nProperty Value        : %d\n", i);

	char ch[MAXVALUESIZE] = {""};
	getStrProperty("property1", ch);
	char cx = ch[0];
	printf("\n\nProperty Value   char     : %c\n", cx);

	// converting string to 
	cleanup ();							//please return my resources
}
