#include <DelBlkAuctReq.hxx>
#define BUFFER_SIZE 1000

futDelBlkAuctReqRequestT *vfutDelBlkAuctReqRequestT;
futDelBlkAuctReqResponseT *vfutDelBlkAuctReqResponseT;
optDelBlkAuctReqRequestT *voptDelBlkAuctReqRequestT;
optDelBlkAuctReqResponseT *voptDelBlkAuctReqResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelBlkAuctReqRequestT getFutBscDelBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	futBscDelBlkAuctReqRequestT vfutBscDelBlkAuctReqRequestT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscDelBlkAuctReqRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelBlkAuctReq.futBscDelBlkAuctReqRequestT.ordrNo", lordrNo);
	memcpy(vfutBscDelBlkAuctReqRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	vfutBscDelBlkAuctReqRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscDelBlkAuctReqRequestT");
	vfutBscDelBlkAuctReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelBlkAuctReqRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscDelBlkAuctReqRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelBlkAuctReq.futBscDelBlkAuctReqRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscDelBlkAuctReqRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscDelBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelBlkAuctReqRequestT getOptBscDelBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	optBscDelBlkAuctReqRequestT voptBscDelBlkAuctReqRequestT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscDelBlkAuctReqRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelBlkAuctReq.optBscDelBlkAuctReqRequestT.ordrNo", lordrNo);
	memcpy(voptBscDelBlkAuctReqRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	voptBscDelBlkAuctReqRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscDelBlkAuctReqRequestT");
	voptBscDelBlkAuctReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscDelBlkAuctReqRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscDelBlkAuctReqRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelBlkAuctReq.optBscDelBlkAuctReqRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscDelBlkAuctReqRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscDelBlkAuctReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelBlkAuctReqRequestT* getFutDelBlkAuctReqRequestT(char* testCaseNum) {
	vfutDelBlkAuctReqRequestT = (futDelBlkAuctReqRequestT*)malloc(sizeof(futDelBlkAuctReqRequestT));
	int i;

	vfutDelBlkAuctReqRequestT->header = getDataHeaderT(testCaseNum, "futDelBlkAuctReqRequestT");
	vfutDelBlkAuctReqRequestT->basic = getFutBscDelBlkAuctReqRequestT(testCaseNum, "futDelBlkAuctReqRequestT");
	return vfutDelBlkAuctReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelBlkAuctReqResponseT* getFutDelBlkAuctReqResponseT(char* testCaseNum) {
	vfutDelBlkAuctReqResponseT = (futDelBlkAuctReqResponseT*)malloc(sizeof(futDelBlkAuctReqResponseT));
	int i;

	vfutDelBlkAuctReqResponseT->header = getDataHeaderT(testCaseNum, "futDelBlkAuctReqResponseT");
	return vfutDelBlkAuctReqResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelBlkAuctReqRequestT* getOptDelBlkAuctReqRequestT(char* testCaseNum) {
	voptDelBlkAuctReqRequestT = (optDelBlkAuctReqRequestT*)malloc(sizeof(optDelBlkAuctReqRequestT));
	int i;

	voptDelBlkAuctReqRequestT->header = getDataHeaderT(testCaseNum, "optDelBlkAuctReqRequestT");
	voptDelBlkAuctReqRequestT->basic = getOptBscDelBlkAuctReqRequestT(testCaseNum, "optDelBlkAuctReqRequestT");
	return voptDelBlkAuctReqRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelBlkAuctReqResponseT* getOptDelBlkAuctReqResponseT(char* testCaseNum) {
	voptDelBlkAuctReqResponseT = (optDelBlkAuctReqResponseT*)malloc(sizeof(optDelBlkAuctReqResponseT));
	int i;

	voptDelBlkAuctReqResponseT->header = getDataHeaderT(testCaseNum, "optDelBlkAuctReqResponseT");
	return voptDelBlkAuctReqResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelBlkAuctReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelBlkAuctReqRequestT));
	futDelBlkAuctReqRequestT *vfutDelBlkAuctReqRequestT = getFutDelBlkAuctReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelBlkAuctReqRequestT), (jbyte*) vfutDelBlkAuctReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelBlkAuctReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelBlkAuctReqResponseT));
	futDelBlkAuctReqResponseT *vfutDelBlkAuctReqResponseT = getFutDelBlkAuctReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelBlkAuctReqResponseT), (jbyte*) vfutDelBlkAuctReqResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelBlkAuctReqRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelBlkAuctReqRequestT));
	optDelBlkAuctReqRequestT *voptDelBlkAuctReqRequestT = getOptDelBlkAuctReqRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelBlkAuctReqRequestT), (jbyte*) voptDelBlkAuctReqRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelBlkAuctReqResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelBlkAuctReqResponseT));
	optDelBlkAuctReqResponseT *voptDelBlkAuctReqResponseT = getOptDelBlkAuctReqResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelBlkAuctReqResponseT), (jbyte*) voptDelBlkAuctReqResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelBlkAuctReqRequestT(futBscDelBlkAuctReqRequestT actual, futBscDelBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelBlkAuctReqRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelBlkAuctReqRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelBlkAuctReqRequestT(optBscDelBlkAuctReqRequestT actual, optBscDelBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelBlkAuctReqRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelBlkAuctReqRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelBlkAuctReqRequestT(futDelBlkAuctReqRequestT actual, futDelBlkAuctReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelBlkAuctReqRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelBlkAuctReqResponseT(futDelBlkAuctReqResponseT actual, futDelBlkAuctReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareOptDelBlkAuctReqRequestT(optDelBlkAuctReqRequestT actual, optDelBlkAuctReqRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelBlkAuctReqRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelBlkAuctReqResponseT(optDelBlkAuctReqResponseT actual, optDelBlkAuctReqResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutDelBlkAuctReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelBlkAuctReqRequestT *actualData = (futDelBlkAuctReqRequestT *)msgStruct;
	futDelBlkAuctReqRequestT* expectedData = getFutDelBlkAuctReqRequestT(testCaseNum);
	compareFutDelBlkAuctReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelBlkAuctReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelBlkAuctReqResponseT *actualData = (futDelBlkAuctReqResponseT *)msgStruct;
	futDelBlkAuctReqResponseT* expectedData = getFutDelBlkAuctReqResponseT(testCaseNum);
	compareFutDelBlkAuctReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelBlkAuctReqRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelBlkAuctReqRequestT *actualData = (optDelBlkAuctReqRequestT *)msgStruct;
	optDelBlkAuctReqRequestT* expectedData = getOptDelBlkAuctReqRequestT(testCaseNum);
	compareOptDelBlkAuctReqRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelBlkAuctReqResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelBlkAuctReqResponseT *actualData = (optDelBlkAuctReqResponseT *)msgStruct;
	optDelBlkAuctReqResponseT* expectedData = getOptDelBlkAuctReqResponseT(testCaseNum);
	compareOptDelBlkAuctReqResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
