#include <EntSLegCrsReq.hxx>
#define BUFFER_SIZE 1000

futEntSLegCrsReqRequestT *vfutEntSLegCrsReqRequestT;
futEntSLegCrsReqResponseT *vfutEntSLegCrsReqResponseT;
optEntSLegCrsReqRequestT *voptEntSLegCrsReqRequestT;
optEntSLegCrsReqResponseT *voptEntSLegCrsReqResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntSLegCrsReqRequestT getFutBscEntSLegCrsReqRequestT(char* testCaseNum , const char *root) {
	futBscEntSLegCrsReqRequestT vfutBscEntSLegCrsReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntSLegCrsReq.futBscEntSLegCrsReqRequestT.buyCod", lbuyCod);
	vfutBscEntSLegCrsReqRequestT.buyCod = lbuyCod[0];

	vfutBscEntSLegCrsReqRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntSLegCrsReqRequestT");
	vfutBscEntSLegCrsReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntSLegCrsReqRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntSLegCrsReqRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegCrsReq.futBscEntSLegCrsReqRequestT.ordrQty", lordrQty);
	memcpy(vfutBscEntSLegCrsReqRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);
	return vfutBscEntSLegCrsReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntSLegCrsReqRequestT getOptBscEntSLegCrsReqRequestT(char* testCaseNum , const char *root) {
	optBscEntSLegCrsReqRequestT voptBscEntSLegCrsReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntSLegCrsReq.optBscEntSLegCrsReqRequestT.buyCod", lbuyCod);
	voptBscEntSLegCrsReqRequestT.buyCod = lbuyCod[0];

	voptBscEntSLegCrsReqRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntSLegCrsReqRequestT");
	voptBscEntSLegCrsReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscEntSLegCrsReqRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntSLegCrsReqRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegCrsReq.optBscEntSLegCrsReqRequestT.ordrQty", lordrQty);
	memcpy(voptBscEntSLegCrsReqRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);
	return voptBscEntSLegCrsReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntSLegCrsReqRequestT* getFutEntSLegCrsReqRequestT(char* testCaseNum) {
	vfutEntSLegCrsReqRequestT = (futEntSLegCrsReqRequestT*)malloc(sizeof(futEntSLegCrsReqRequestT));
	int i;

	vfutEntSLegCrsReqRequestT->header = getDataHeaderT(testCaseNum, "futEntSLegCrsReqRequestT");
	vfutEntSLegCrsReqRequestT->basic = getFutBscEntSLegCrsReqRequestT(testCaseNum, "futEntSLegCrsReqRequestT");
	return vfutEntSLegCrsReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntSLegCrsReqResponseT* getFutEntSLegCrsReqResponseT(char* testCaseNum) {
	vfutEntSLegCrsReqResponseT = (futEntSLegCrsReqResponseT*)malloc(sizeof(futEntSLegCrsReqResponseT));
	int i;

	vfutEntSLegCrsReqResponseT->header = getDataHeaderT(testCaseNum, "futEntSLegCrsReqResponseT");
	return vfutEntSLegCrsReqResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntSLegCrsReqRequestT* getOptEntSLegCrsReqRequestT(char* testCaseNum) {
	voptEntSLegCrsReqRequestT = (optEntSLegCrsReqRequestT*)malloc(sizeof(optEntSLegCrsReqRequestT));
	int i;

	voptEntSLegCrsReqRequestT->header = getDataHeaderT(testCaseNum, "optEntSLegCrsReqRequestT");
	voptEntSLegCrsReqRequestT->basic = getOptBscEntSLegCrsReqRequestT(testCaseNum, "optEntSLegCrsReqRequestT");
	return voptEntSLegCrsReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntSLegCrsReqResponseT* getOptEntSLegCrsReqResponseT(char* testCaseNum) {
	voptEntSLegCrsReqResponseT = (optEntSLegCrsReqResponseT*)malloc(sizeof(optEntSLegCrsReqResponseT));
	int i;

	voptEntSLegCrsReqResponseT->header = getDataHeaderT(testCaseNum, "optEntSLegCrsReqResponseT");
	return voptEntSLegCrsReqResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntSLegCrsReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntSLegCrsReqRequestT));
	futEntSLegCrsReqRequestT *vfutEntSLegCrsReqRequestT = getFutEntSLegCrsReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntSLegCrsReqRequestT), (jbyte*) vfutEntSLegCrsReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntSLegCrsReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntSLegCrsReqResponseT));
	futEntSLegCrsReqResponseT *vfutEntSLegCrsReqResponseT = getFutEntSLegCrsReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntSLegCrsReqResponseT), (jbyte*) vfutEntSLegCrsReqResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntSLegCrsReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntSLegCrsReqRequestT));
	optEntSLegCrsReqRequestT *voptEntSLegCrsReqRequestT = getOptEntSLegCrsReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntSLegCrsReqRequestT), (jbyte*) voptEntSLegCrsReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntSLegCrsReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntSLegCrsReqResponseT));
	optEntSLegCrsReqResponseT *voptEntSLegCrsReqResponseT = getOptEntSLegCrsReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntSLegCrsReqResponseT), (jbyte*) voptEntSLegCrsReqResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntSLegCrsReqRequestT(futBscEntSLegCrsReqRequestT actual, futBscEntSLegCrsReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegCrsReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegCrsReqRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntSLegCrsReqRequestT(optBscEntSLegCrsReqRequestT actual, optBscEntSLegCrsReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegCrsReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegCrsReqRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntSLegCrsReqRequestT(futEntSLegCrsReqRequestT actual, futEntSLegCrsReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntSLegCrsReqRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntSLegCrsReqResponseT(futEntSLegCrsReqResponseT actual, futEntSLegCrsReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntSLegCrsReqRequestT(optEntSLegCrsReqRequestT actual, optEntSLegCrsReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntSLegCrsReqRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntSLegCrsReqResponseT(optEntSLegCrsReqResponseT actual, optEntSLegCrsReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntSLegCrsReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntSLegCrsReqRequestT *actualData = (futEntSLegCrsReqRequestT *)msgStruct;
	futEntSLegCrsReqRequestT* expectedData = getFutEntSLegCrsReqRequestT(testCaseNum);
	compareFutEntSLegCrsReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntSLegCrsReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntSLegCrsReqResponseT *actualData = (futEntSLegCrsReqResponseT *)msgStruct;
	futEntSLegCrsReqResponseT* expectedData = getFutEntSLegCrsReqResponseT(testCaseNum);
	compareFutEntSLegCrsReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntSLegCrsReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntSLegCrsReqRequestT *actualData = (optEntSLegCrsReqRequestT *)msgStruct;
	optEntSLegCrsReqRequestT* expectedData = getOptEntSLegCrsReqRequestT(testCaseNum);
	compareOptEntSLegCrsReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntSLegCrsReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntSLegCrsReqResponseT *actualData = (optEntSLegCrsReqResponseT *)msgStruct;
	optEntSLegCrsReqResponseT* expectedData = getOptEntSLegCrsReqResponseT(testCaseNum);
	compareOptEntSLegCrsReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
