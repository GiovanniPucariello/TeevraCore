#include <DelEfpTrd.hxx>
#define BUFFER_SIZE 1000

futDelEfpTrdRequestT *vfutDelEfpTrdRequestT;
futDelEfpTrdResponseT *vfutDelEfpTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelEfpTrdRequestT getFutBscDelEfpTrdRequestT(char* testCaseNum , const char *root) {
	futBscDelEfpTrdRequestT vfutBscDelEfpTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscDelEfpTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DelEfpTrd.futBscDelEfpTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscDelEfpTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscDelEfpTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelEfpTrd.futBscDelEfpTrdRequestT.prodId", lprodId);
	memcpy(vfutBscDelEfpTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	vfutBscDelEfpTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelEfpTrdRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscDelEfpTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelEfpTrd.futBscDelEfpTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscDelEfpTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscDelEfpTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEfpTrdRequestT* getFutDelEfpTrdRequestT(char* testCaseNum) {
	vfutDelEfpTrdRequestT = (futDelEfpTrdRequestT*)malloc(sizeof(futDelEfpTrdRequestT));
	int i;

	vfutDelEfpTrdRequestT->header = getDataHeaderT(testCaseNum, "futDelEfpTrdRequestT");
	vfutDelEfpTrdRequestT->basic = getFutBscDelEfpTrdRequestT(testCaseNum, "futDelEfpTrdRequestT");
	return vfutDelEfpTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEfpTrdResponseT* getFutDelEfpTrdResponseT(char* testCaseNum) {
	vfutDelEfpTrdResponseT = (futDelEfpTrdResponseT*)malloc(sizeof(futDelEfpTrdResponseT));
	int i;

	vfutDelEfpTrdResponseT->header = getDataHeaderT(testCaseNum, "futDelEfpTrdResponseT");
	return vfutDelEfpTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEfpTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEfpTrdRequestT));
	futDelEfpTrdRequestT *vfutDelEfpTrdRequestT = getFutDelEfpTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEfpTrdRequestT), (jbyte*) vfutDelEfpTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEfpTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEfpTrdResponseT));
	futDelEfpTrdResponseT *vfutDelEfpTrdResponseT = getFutDelEfpTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEfpTrdResponseT), (jbyte*) vfutDelEfpTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelEfpTrdRequestT(futBscDelEfpTrdRequestT actual, futBscDelEfpTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEfpTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEfpTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEfpTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEfpTrdRequestT(futDelEfpTrdRequestT actual, futDelEfpTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelEfpTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEfpTrdResponseT(futDelEfpTrdResponseT actual, futDelEfpTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutDelEfpTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEfpTrdRequestT *actualData = (futDelEfpTrdRequestT *)msgStruct;
	futDelEfpTrdRequestT* expectedData = getFutDelEfpTrdRequestT(testCaseNum);
	compareFutDelEfpTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelEfpTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEfpTrdResponseT *actualData = (futDelEfpTrdResponseT *)msgStruct;
	futDelEfpTrdResponseT* expectedData = getFutDelEfpTrdResponseT(testCaseNum);
	compareFutDelEfpTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
