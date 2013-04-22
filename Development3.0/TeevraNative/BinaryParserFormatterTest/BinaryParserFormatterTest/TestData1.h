#include "Datatypes.h"
#include <string.h>
#include <stdio.h>
#include <malloc.h>

char logMsg[100];
CnctRespDataT *cnctData;

CnctRespDataT* getCnctRespData() {
	cnctData = (CnctRespDataT *)malloc(sizeof(CnctRespData));
	int i;

	cnctData->connectionID = -56;
	cnctData->connectionID1 = 156;
	for(i=0;i<20;i++) {
		cnctData->VMQName[i] = ' ';
	}
	strcpy_s(cnctData->VMQName, "TESTING VMQ");
	cnctData->prodMode = 'R';
	return cnctData;
}

char* compareCnctRespData1(CnctRespDataT actual, CnctRespDataT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env) {
	sprintf_s(logMsg, 100, "true");
	printf("Actual \n");
	printf("actual.connectionID %d \n", actual.connectionID);
	printf("expected.connectionID %d \n" , expected.connectionID);

	if (actual.connectionID != expected.connectionID) {
		sprintf_s(logMsg, 100, "connectionID not matching. Actual %d but Expected %d", actual.connectionID, expected.connectionID);
	}

	if (actual.connectionID1 != expected.connectionID1) {
		sprintf_s(logMsg, 100, "connectionID1 not matching. Actual %d but Expected %d", actual.connectionID1, expected.connectionID1);
	}

	if (actual.prodMode != expected.prodMode) {
		sprintf_s(logMsg, 100, "prodMode not matching. Actual %d but Expected %d", actual.prodMode, expected.prodMode);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
	return logMsg;
}

jbyteArray getByteArray1(JNIEnv *env) {
	getCnctRespData();
	jbyteArray jdatareq;

	jdatareq = env->NewByteArray(sizeof(CnctRespData));;
	env->SetByteArrayRegion(jdatareq, 0, sizeof(CnctRespData), (jbyte*) cnctData);
	return jdatareq;
}

char* compareByteArray1(jbyteArray msg, JNIEnv *env) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	CnctRespDataT *cnctData = (CnctRespDataT *)msgStruct;
	CnctRespDataT* testData = getCnctRespData();

	return compareCnctRespData1(*cnctData, *testData, msg, msgStruct, env);
}