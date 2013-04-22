// TestEurexConnector.cpp : Defines the entry point for the DLL application.
//

#include "jni.h"
#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#include <iostream>
#include <winsock.h>
#include "com_headstrong_fusion_connector_testeurex_TestEurexConsumer.h"
#include "com_headstrong_fusion_connector_testeurex_TestEurexConsumer_QueueReader.h"
#include "com_headstrong_fusion_connector_testeurex_TestEurexProducer.h"

//header files having getter and comparator for individual messages
#include "TestBroadcastSubscription.h"
#include "TestEnterExercise.h"

using namespace std;

#include "Values.h"            // This file declares all types and functions of the VCI (VALUES Call Interface).
#include "DRIV_app_rid.h"
#include "DRIV_streamtypes.hxx"
#include "DRIV_

JNIEXPORT jbyteArray JNICALL Java_com_headstrong_fusion_connector_testeurex_TestEurexConsumer_getByteArray
(JNIEnv * env, jobject obj, jint jReqId, jstring jProdLine) {

	int reqId = -1;
	jchar prodLine = '\0';
	
	reqId = jReqId;
	env->GetCharArrayRegion((jcharArray)jProdLine, 0, 1, &prodLine);
	
	switch(reqId) {
		case DRIV_SUBSCRIBE_TRADE_CONFIRMATION:
			if (prodLine == 
			return getTradeConfirmationBrodcast(env, prodLine);
			break;
		case DRIV_SUBSCRIBE_GIVE_UP_TAKE_UP:
			return getGivUpTakUpBrodcast(env, prodLine);
			break;
		case DRIV_ENTER_EXERCISE_RID:
			return getEntExercise(env, prodLine);
			break;
		default:
			 printf("Error");
			 break;
	}
}

JNIEXPORT jstring JNICALL Java_com_headstrong_fusion_connector_testeurex_TestEurexProducer_compareByteArray
(JNIEnv * env, jobject obj, jint jReqId, jstring jProdLine, jbyteArray jMsg) {

	int reqId = -1;
	jchar prodLine = '\0';
	char* statusMsg;

	reqId = jReqId;
	jbyte* MsgBodystr = (jbyte*) env->GetByteArrayElements(jMsg, 0);

	env->GetCharArrayRegion((jcharArray)jProdLine, 0, 1, &prodLine);

	switch(reqId) {
		case DRIV_SUBSCRIBE_TRADE_CONFIRMATION:
			statusMsg = compareTradeConfirmationSubscription(prodLine, MsgBodystr);
			break;
		case DRIV_SUBSCRIBE_GIVE_UP_TAKE_UP:
			statusMsg = compareGiveupTakeupSubscription(prodLine, MsgBodystr);
			break;
		case DRIV_ENTER_EXERCISE_RID:
			statusMsg = compareEntExercise(prodLine, MsgBodystr);
			break;
		default:
			 statusMsg = "Error";
			 break;
	}
	return (jstring)statusMsg;
}
