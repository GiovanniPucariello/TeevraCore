// BinaryParserFormatterTest.cpp : Defines the entry point for the DLL application.
//

#define BUFFER_SIZE 500
#include "stdafx.h"
#include "com_headstrong_fusion_services_message_formatter_binary_BinaryParserFormatterTest.h"
#include "TestData1.h"
#include "TestData2.h"
#include "TestStructCnctRespDataT.h"

#ifdef _MANAGED
#pragma managed(push, off)
#endif


BOOL APIENTRY DllMain( HMODULE hModule,
                       DWORD  ul_reason_for_call,
                       LPVOID lpReserved
					 )
{
    return TRUE;
}

#ifdef _MANAGED
#pragma managed(pop)
#endif

jbyteArray getByteArray (JNIEnv *env, jobject obj, jint testCaseNum);
jstring compareByteArray (JNIEnv *env, jobject obj, jint testCaseNum, jbyteArray msg);

JNIEXPORT jbyteArray JNICALL Java_com_headstrong_fusion_services_message_formatter_binary_BinaryParserFormatterTest_getByteArray
(JNIEnv *env, jobject obj, jint testCaseNum) {
	return getByteArray(env, obj, testCaseNum);
}

/*
 * Class:     com_headstrong_fusion_services_message_formatter_binary_BinaryParserFormatterTest
 * Method:    compareByteArray
 * Signature: (I[B)Z
 */
JNIEXPORT jstring JNICALL Java_com_headstrong_fusion_services_message_formatter_binary_BinaryParserFormatterTest_compareByteArray
(JNIEnv *env, jobject obj, jint testCaseNum, jbyteArray msg) {
	return compareByteArray(env, obj, testCaseNum, msg);
}

jbyteArray getByteArray (JNIEnv *env, jobject obj, jint testCaseNum) {
	switch(testCaseNum) {
		case 1:
			return getByteArray1(env);
		case 2:
			return getByteArray2(env);
		case 3:
			return getByteArray3(env);
		default:
			return getByteArray1(env);
	}
}

jstring compareByteArray (JNIEnv *env, jobject obj, jint testCaseNum, jbyteArray msg) {
	char *logMsg;
	switch(testCaseNum) {
		case 1:
			logMsg = compareByteArray1(msg, env);
		case 2:
			logMsg = compareByteArray2(msg, env);
		default:
			logMsg = compareByteArray1(msg, env);
	}
	return env->NewStringUTF(logMsg);
}
