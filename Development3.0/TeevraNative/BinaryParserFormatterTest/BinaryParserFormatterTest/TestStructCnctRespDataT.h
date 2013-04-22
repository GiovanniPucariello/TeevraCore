#define BUFFER_SIZE 1000
CnctRespDataT *cnctRespData;
/** Getting Inner struct member*/
InnerStructT getInner(char *testCaseNum, const char *cnctRespData) {
	InnerStructT innerStruct;
	innerStruct.num = 1;;
	innerStruct.opt = 'c';
	return innerStruct;
}

CnctRespDataT* getCnctRespData(char* testCaseNum) {
	cnctRespData = (CnctRespDataT *)malloc(sizeof(CnctRespData));
	int i;//standard index varaible to be used for all array initialization
	cnctData->connectionID = -56;//value to be obtained from prop file reader
	cnctData->connectionID1 = 156;//value to be obtained from prop file reader
	for(i=0;i<20;i++) {//instead of 20 it will actually be replaced by the constant name specified in the file
		cnctData->VMQName[i] = ' ';//all char array initialized with spaces and all int with zeros
	}
	strcpy_s(cnctData->VMQName, "TESTING VMQ");//value to be obtaind from prop. Either strcpy or it can be copied char by char in a loop
	cnctRespData->prodMode = 'R';
//	cnctRespData->inner = getInner(testCaseNum, "cnctRespData");
	return cnctRespData;
}

/**
* Standard method. No change except for replacing the StructName every where. Only for root level struct */
jbyteArray getCnctRespDataArray(JNIEnv *env, int testCaseNum) {
	jbyteArray jdatareq;

	jdatareq = env->NewByteArray(sizeof(CnctRespData));
	getCnctRespData();
	env->SetByteArrayRegion(jdatareq, 0, sizeof(CnctRespData), (jbyte*) cnctRespData);
	return jdatareq;
}

void compareInner(InnerStructT actual, InnerStructT expected, char* logMsg) {
	char tempLogMsg[100];
	tempLogMsg[0] = '\0';

	if (actual.num != expected.num) {
		sprintf_s(tempLogMsg, 100, "In InnerStruct, num not matching. Actual %d but Expected %d", actual.num, expected.num);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}

	if (actual.opt != expected.opt) {
		sprintf_s(tempLogMsg, 100, "In InnerStruct, opt not matching. Actual %d but Expected %d", actual.opt, expected.opt);
		strcat_s(logMsg, BUFFER_SIZE,tempLogMsg);
	}
}

void compareCnctRespData(CnctRespDataT actual, CnctRespDataT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[100];
	tempLogMsg[0] = '\0';

	if (actual.connectionID != expected.connectionID) {
		sprintf_s(logMsg, 100, "connectionID not matching. Actual %d but Expected %d", actual.connectionID, expected.connectionID);
		strcat_s(logMsg, BUFFER_SIZE,tempLogMsg);
	}

	if (actual.connectionID1 != expected.connectionID1) {
		sprintf_s(logMsg, 100, "connectionID1 not matching. Actual %d but Expected %d", actual.connectionID1, expected.connectionID1);
		strcat_s(logMsg, BUFFER_SIZE,tempLogMsg);
	}

	if (actual.prodMode != expected.prodMode) {
		sprintf_s(logMsg, 100, "prodMode not matching. Actual %d but Expected %d", actual.prodMode, expected.prodMode);
		strcat_s(logMsg, BUFFER_SIZE,tempLogMsg);
	}
	//compareInner(actual.inner, expected.inner, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
	return;
}

/**
* Standard method. Struct name alone has to be replaced. Only for root struct Name */
char* compareCnctRespDataArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	CnctRespDataT *actualData = (CnctRespDataT *)msgStruct;
	CnctRespDataT* expectedData = getCnctRespData(testCaseNum);

	compareCnctRespData(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}