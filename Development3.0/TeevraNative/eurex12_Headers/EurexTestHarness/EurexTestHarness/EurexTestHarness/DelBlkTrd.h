#include <DelBlkTrd.hxx>
#define BUFFER_SIZE 1000

futDelBlkTrdRequestT *vfutDelBlkTrdRequestT;
futDelBlkTrdResponseT *vfutDelBlkTrdResponseT;
optDelBlkTrdRequestT *voptDelBlkTrdRequestT;
optDelBlkTrdResponseT *voptDelBlkTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelBlkTrdRequestT getFutBscDelBlkTrdRequestT(char* testCaseNum , const char *root) {
	futBscDelBlkTrdRequestT vfutBscDelBlkTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscDelBlkTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DelBlkTrd.futBscDelBlkTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscDelBlkTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscDelBlkTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelBlkTrd.futBscDelBlkTrdRequestT.prodId", lprodId);
	memcpy(vfutBscDelBlkTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	vfutBscDelBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelBlkTrdRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscDelBlkTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelBlkTrd.futBscDelBlkTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscDelBlkTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscDelBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelBlkTrdRequestT getOptBscDelBlkTrdRequestT(char* testCaseNum , const char *root) {
	optBscDelBlkTrdRequestT voptBscDelBlkTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscDelBlkTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DelBlkTrd.optBscDelBlkTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscDelBlkTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscDelBlkTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelBlkTrd.optBscDelBlkTrdRequestT.prodId", lprodId);
	memcpy(voptBscDelBlkTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	voptBscDelBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscDelBlkTrdRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscDelBlkTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelBlkTrd.optBscDelBlkTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscDelBlkTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscDelBlkTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelBlkTrdRequestT* getFutDelBlkTrdRequestT(char* testCaseNum) {
	vfutDelBlkTrdRequestT = (futDelBlkTrdRequestT*)malloc(sizeof(futDelBlkTrdRequestT));
	int i;

	vfutDelBlkTrdRequestT->header = getDataHeaderT(testCaseNum, "futDelBlkTrdRequestT");
	vfutDelBlkTrdRequestT->basic = getFutBscDelBlkTrdRequestT(testCaseNum, "futDelBlkTrdRequestT");
	return vfutDelBlkTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelBlkTrdResponseT* getFutDelBlkTrdResponseT(char* testCaseNum) {
	vfutDelBlkTrdResponseT = (futDelBlkTrdResponseT*)malloc(sizeof(futDelBlkTrdResponseT));
	int i;

	vfutDelBlkTrdResponseT->header = getDataHeaderT(testCaseNum, "futDelBlkTrdResponseT");
	return vfutDelBlkTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelBlkTrdRequestT* getOptDelBlkTrdRequestT(char* testCaseNum) {
	voptDelBlkTrdRequestT = (optDelBlkTrdRequestT*)malloc(sizeof(optDelBlkTrdRequestT));
	int i;

	voptDelBlkTrdRequestT->header = getDataHeaderT(testCaseNum, "optDelBlkTrdRequestT");
	voptDelBlkTrdRequestT->basic = getOptBscDelBlkTrdRequestT(testCaseNum, "optDelBlkTrdRequestT");
	return voptDelBlkTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelBlkTrdResponseT* getOptDelBlkTrdResponseT(char* testCaseNum) {
	voptDelBlkTrdResponseT = (optDelBlkTrdResponseT*)malloc(sizeof(optDelBlkTrdResponseT));
	int i;

	voptDelBlkTrdResponseT->header = getDataHeaderT(testCaseNum, "optDelBlkTrdResponseT");
	return voptDelBlkTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelBlkTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelBlkTrdRequestT));
	futDelBlkTrdRequestT *vfutDelBlkTrdRequestT = getFutDelBlkTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelBlkTrdRequestT), (jbyte*) vfutDelBlkTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelBlkTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelBlkTrdResponseT));
	futDelBlkTrdResponseT *vfutDelBlkTrdResponseT = getFutDelBlkTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelBlkTrdResponseT), (jbyte*) vfutDelBlkTrdResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelBlkTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelBlkTrdRequestT));
	optDelBlkTrdRequestT *voptDelBlkTrdRequestT = getOptDelBlkTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelBlkTrdRequestT), (jbyte*) voptDelBlkTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelBlkTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelBlkTrdResponseT));
	optDelBlkTrdResponseT *voptDelBlkTrdResponseT = getOptDelBlkTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelBlkTrdResponseT), (jbyte*) voptDelBlkTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelBlkTrdRequestT(futBscDelBlkTrdRequestT actual, futBscDelBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelBlkTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelBlkTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelBlkTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelBlkTrdRequestT(optBscDelBlkTrdRequestT actual, optBscDelBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelBlkTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelBlkTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelBlkTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelBlkTrdRequestT(futDelBlkTrdRequestT actual, futDelBlkTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelBlkTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelBlkTrdResponseT(futDelBlkTrdResponseT actual, futDelBlkTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareOptDelBlkTrdRequestT(optDelBlkTrdRequestT actual, optDelBlkTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelBlkTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelBlkTrdResponseT(optDelBlkTrdResponseT actual, optDelBlkTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutDelBlkTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelBlkTrdRequestT *actualData = (futDelBlkTrdRequestT *)msgStruct;
	futDelBlkTrdRequestT* expectedData = getFutDelBlkTrdRequestT(testCaseNum);
	compareFutDelBlkTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelBlkTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelBlkTrdResponseT *actualData = (futDelBlkTrdResponseT *)msgStruct;
	futDelBlkTrdResponseT* expectedData = getFutDelBlkTrdResponseT(testCaseNum);
	compareFutDelBlkTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelBlkTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelBlkTrdRequestT *actualData = (optDelBlkTrdRequestT *)msgStruct;
	optDelBlkTrdRequestT* expectedData = getOptDelBlkTrdRequestT(testCaseNum);
	compareOptDelBlkTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelBlkTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelBlkTrdResponseT *actualData = (optDelBlkTrdResponseT *)msgStruct;
	optDelBlkTrdResponseT* expectedData = getOptDelBlkTrdResponseT(testCaseNum);
	compareOptDelBlkTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
