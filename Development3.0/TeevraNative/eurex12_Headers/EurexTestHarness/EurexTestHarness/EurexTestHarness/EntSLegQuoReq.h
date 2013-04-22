#include <EntSLegQuoReq.hxx>
#define BUFFER_SIZE 1000

futEntSLegQuoReqRequestT *vfutEntSLegQuoReqRequestT;
futEntSLegQuoReqResponseT *vfutEntSLegQuoReqResponseT;
optEntSLegQuoReqRequestT *voptEntSLegQuoReqRequestT;
optEntSLegQuoReqResponseT *voptEntSLegQuoReqResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntSLegQuoReqRequestT getFutBscEntSLegQuoReqRequestT(char* testCaseNum , const char *root) {
	futBscEntSLegQuoReqRequestT vfutBscEntSLegQuoReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntSLegQuoReq.futBscEntSLegQuoReqRequestT.buyCod", lbuyCod);
	vfutBscEntSLegQuoReqRequestT.buyCod = lbuyCod[0];

	vfutBscEntSLegQuoReqRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntSLegQuoReqRequestT");
	vfutBscEntSLegQuoReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntSLegQuoReqRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntSLegQuoReqRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuoReq.futBscEntSLegQuoReqRequestT.ordrQty", lordrQty);
	memcpy(vfutBscEntSLegQuoReqRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);
	return vfutBscEntSLegQuoReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntSLegQuoReqRequestT getOptBscEntSLegQuoReqRequestT(char* testCaseNum , const char *root) {
	optBscEntSLegQuoReqRequestT voptBscEntSLegQuoReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntSLegQuoReq.optBscEntSLegQuoReqRequestT.buyCod", lbuyCod);
	voptBscEntSLegQuoReqRequestT.buyCod = lbuyCod[0];

	voptBscEntSLegQuoReqRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntSLegQuoReqRequestT");
	voptBscEntSLegQuoReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscEntSLegQuoReqRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntSLegQuoReqRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegQuoReq.optBscEntSLegQuoReqRequestT.ordrQty", lordrQty);
	memcpy(voptBscEntSLegQuoReqRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);
	return voptBscEntSLegQuoReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntSLegQuoReqRequestT* getFutEntSLegQuoReqRequestT(char* testCaseNum) {
	vfutEntSLegQuoReqRequestT = (futEntSLegQuoReqRequestT*)malloc(sizeof(futEntSLegQuoReqRequestT));
	int i;

	vfutEntSLegQuoReqRequestT->header = getDataHeaderT(testCaseNum, "futEntSLegQuoReqRequestT");
	vfutEntSLegQuoReqRequestT->basic = getFutBscEntSLegQuoReqRequestT(testCaseNum, "futEntSLegQuoReqRequestT");
	return vfutEntSLegQuoReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntSLegQuoReqResponseT* getFutEntSLegQuoReqResponseT(char* testCaseNum) {
	vfutEntSLegQuoReqResponseT = (futEntSLegQuoReqResponseT*)malloc(sizeof(futEntSLegQuoReqResponseT));
	int i;

	vfutEntSLegQuoReqResponseT->header = getDataHeaderT(testCaseNum, "futEntSLegQuoReqResponseT");
	return vfutEntSLegQuoReqResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntSLegQuoReqRequestT* getOptEntSLegQuoReqRequestT(char* testCaseNum) {
	voptEntSLegQuoReqRequestT = (optEntSLegQuoReqRequestT*)malloc(sizeof(optEntSLegQuoReqRequestT));
	int i;

	voptEntSLegQuoReqRequestT->header = getDataHeaderT(testCaseNum, "optEntSLegQuoReqRequestT");
	voptEntSLegQuoReqRequestT->basic = getOptBscEntSLegQuoReqRequestT(testCaseNum, "optEntSLegQuoReqRequestT");
	return voptEntSLegQuoReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntSLegQuoReqResponseT* getOptEntSLegQuoReqResponseT(char* testCaseNum) {
	voptEntSLegQuoReqResponseT = (optEntSLegQuoReqResponseT*)malloc(sizeof(optEntSLegQuoReqResponseT));
	int i;

	voptEntSLegQuoReqResponseT->header = getDataHeaderT(testCaseNum, "optEntSLegQuoReqResponseT");
	return voptEntSLegQuoReqResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntSLegQuoReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntSLegQuoReqRequestT));
	futEntSLegQuoReqRequestT *vfutEntSLegQuoReqRequestT = getFutEntSLegQuoReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntSLegQuoReqRequestT), (jbyte*) vfutEntSLegQuoReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntSLegQuoReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntSLegQuoReqResponseT));
	futEntSLegQuoReqResponseT *vfutEntSLegQuoReqResponseT = getFutEntSLegQuoReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntSLegQuoReqResponseT), (jbyte*) vfutEntSLegQuoReqResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntSLegQuoReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntSLegQuoReqRequestT));
	optEntSLegQuoReqRequestT *voptEntSLegQuoReqRequestT = getOptEntSLegQuoReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntSLegQuoReqRequestT), (jbyte*) voptEntSLegQuoReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntSLegQuoReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntSLegQuoReqResponseT));
	optEntSLegQuoReqResponseT *voptEntSLegQuoReqResponseT = getOptEntSLegQuoReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntSLegQuoReqResponseT), (jbyte*) voptEntSLegQuoReqResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntSLegQuoReqRequestT(futBscEntSLegQuoReqRequestT actual, futBscEntSLegQuoReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegQuoReqRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntSLegQuoReqRequestT(optBscEntSLegQuoReqRequestT actual, optBscEntSLegQuoReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegQuoReqRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntSLegQuoReqRequestT(futEntSLegQuoReqRequestT actual, futEntSLegQuoReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntSLegQuoReqRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntSLegQuoReqResponseT(futEntSLegQuoReqResponseT actual, futEntSLegQuoReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareOptEntSLegQuoReqRequestT(optEntSLegQuoReqRequestT actual, optEntSLegQuoReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntSLegQuoReqRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntSLegQuoReqResponseT(optEntSLegQuoReqResponseT actual, optEntSLegQuoReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutEntSLegQuoReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntSLegQuoReqRequestT *actualData = (futEntSLegQuoReqRequestT *)msgStruct;
	futEntSLegQuoReqRequestT* expectedData = getFutEntSLegQuoReqRequestT(testCaseNum);
	compareFutEntSLegQuoReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntSLegQuoReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntSLegQuoReqResponseT *actualData = (futEntSLegQuoReqResponseT *)msgStruct;
	futEntSLegQuoReqResponseT* expectedData = getFutEntSLegQuoReqResponseT(testCaseNum);
	compareFutEntSLegQuoReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntSLegQuoReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntSLegQuoReqRequestT *actualData = (optEntSLegQuoReqRequestT *)msgStruct;
	optEntSLegQuoReqRequestT* expectedData = getOptEntSLegQuoReqRequestT(testCaseNum);
	compareOptEntSLegQuoReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntSLegQuoReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntSLegQuoReqResponseT *actualData = (optEntSLegQuoReqResponseT *)msgStruct;
	optEntSLegQuoReqResponseT* expectedData = getOptEntSLegQuoReqResponseT(testCaseNum);
	compareOptEntSLegQuoReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
