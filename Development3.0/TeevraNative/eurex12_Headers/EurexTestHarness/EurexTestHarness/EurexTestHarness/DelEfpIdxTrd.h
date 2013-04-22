#include <DelEfpIdxTrd.hxx>
#define BUFFER_SIZE 1000

futDelEfpIdxTrdRequestT *vfutDelEfpIdxTrdRequestT;
futDelEfpIdxTrdResponseT *vfutDelEfpIdxTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelEfpIdxTrdRequestT getFutBscDelEfpIdxTrdRequestT(char* testCaseNum , const char *root) {
	futBscDelEfpIdxTrdRequestT vfutBscDelEfpIdxTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscDelEfpIdxTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DelEfpIdxTrd.futBscDelEfpIdxTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscDelEfpIdxTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscDelEfpIdxTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelEfpIdxTrd.futBscDelEfpIdxTrdRequestT.prodId", lprodId);
	memcpy(vfutBscDelEfpIdxTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	vfutBscDelEfpIdxTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelEfpIdxTrdRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscDelEfpIdxTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelEfpIdxTrd.futBscDelEfpIdxTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscDelEfpIdxTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscDelEfpIdxTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEfpIdxTrdRequestT* getFutDelEfpIdxTrdRequestT(char* testCaseNum) {
	vfutDelEfpIdxTrdRequestT = (futDelEfpIdxTrdRequestT*)malloc(sizeof(futDelEfpIdxTrdRequestT));
	int i;

	vfutDelEfpIdxTrdRequestT->header = getDataHeaderT(testCaseNum, "futDelEfpIdxTrdRequestT");
	vfutDelEfpIdxTrdRequestT->basic = getFutBscDelEfpIdxTrdRequestT(testCaseNum, "futDelEfpIdxTrdRequestT");
	return vfutDelEfpIdxTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEfpIdxTrdResponseT* getFutDelEfpIdxTrdResponseT(char* testCaseNum) {
	vfutDelEfpIdxTrdResponseT = (futDelEfpIdxTrdResponseT*)malloc(sizeof(futDelEfpIdxTrdResponseT));
	int i;

	vfutDelEfpIdxTrdResponseT->header = getDataHeaderT(testCaseNum, "futDelEfpIdxTrdResponseT");
	return vfutDelEfpIdxTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEfpIdxTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEfpIdxTrdRequestT));
	futDelEfpIdxTrdRequestT *vfutDelEfpIdxTrdRequestT = getFutDelEfpIdxTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEfpIdxTrdRequestT), (jbyte*) vfutDelEfpIdxTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEfpIdxTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEfpIdxTrdResponseT));
	futDelEfpIdxTrdResponseT *vfutDelEfpIdxTrdResponseT = getFutDelEfpIdxTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEfpIdxTrdResponseT), (jbyte*) vfutDelEfpIdxTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelEfpIdxTrdRequestT(futBscDelEfpIdxTrdRequestT actual, futBscDelEfpIdxTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEfpIdxTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEfpIdxTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEfpIdxTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEfpIdxTrdRequestT(futDelEfpIdxTrdRequestT actual, futDelEfpIdxTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelEfpIdxTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEfpIdxTrdResponseT(futDelEfpIdxTrdResponseT actual, futDelEfpIdxTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutDelEfpIdxTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEfpIdxTrdRequestT *actualData = (futDelEfpIdxTrdRequestT *)msgStruct;
	futDelEfpIdxTrdRequestT* expectedData = getFutDelEfpIdxTrdRequestT(testCaseNum);
	compareFutDelEfpIdxTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelEfpIdxTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEfpIdxTrdResponseT *actualData = (futDelEfpIdxTrdResponseT *)msgStruct;
	futDelEfpIdxTrdResponseT* expectedData = getFutDelEfpIdxTrdResponseT(testCaseNum);
	compareFutDelEfpIdxTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
