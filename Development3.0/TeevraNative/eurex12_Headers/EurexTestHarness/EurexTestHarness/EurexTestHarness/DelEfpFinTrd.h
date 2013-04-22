#include <DelEfpFinTrd.hxx>
#define BUFFER_SIZE 1000

futDelEfpFinTrdRequestT *vfutDelEfpFinTrdRequestT;
futDelEfpFinTrdResponseT *vfutDelEfpFinTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelEfpFinTrdRequestT getFutBscDelEfpFinTrdRequestT(char* testCaseNum , const char *root) {
	futBscDelEfpFinTrdRequestT vfutBscDelEfpFinTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscDelEfpFinTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DelEfpFinTrd.futBscDelEfpFinTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscDelEfpFinTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscDelEfpFinTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelEfpFinTrd.futBscDelEfpFinTrdRequestT.prodId", lprodId);
	memcpy(vfutBscDelEfpFinTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	vfutBscDelEfpFinTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelEfpFinTrdRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscDelEfpFinTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelEfpFinTrd.futBscDelEfpFinTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscDelEfpFinTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscDelEfpFinTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEfpFinTrdRequestT* getFutDelEfpFinTrdRequestT(char* testCaseNum) {
	vfutDelEfpFinTrdRequestT = (futDelEfpFinTrdRequestT*)malloc(sizeof(futDelEfpFinTrdRequestT));
	int i;

	vfutDelEfpFinTrdRequestT->header = getDataHeaderT(testCaseNum, "futDelEfpFinTrdRequestT");
	vfutDelEfpFinTrdRequestT->basic = getFutBscDelEfpFinTrdRequestT(testCaseNum, "futDelEfpFinTrdRequestT");
	return vfutDelEfpFinTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEfpFinTrdResponseT* getFutDelEfpFinTrdResponseT(char* testCaseNum) {
	vfutDelEfpFinTrdResponseT = (futDelEfpFinTrdResponseT*)malloc(sizeof(futDelEfpFinTrdResponseT));
	int i;

	vfutDelEfpFinTrdResponseT->header = getDataHeaderT(testCaseNum, "futDelEfpFinTrdResponseT");
	return vfutDelEfpFinTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEfpFinTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEfpFinTrdRequestT));
	futDelEfpFinTrdRequestT *vfutDelEfpFinTrdRequestT = getFutDelEfpFinTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEfpFinTrdRequestT), (jbyte*) vfutDelEfpFinTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEfpFinTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEfpFinTrdResponseT));
	futDelEfpFinTrdResponseT *vfutDelEfpFinTrdResponseT = getFutDelEfpFinTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEfpFinTrdResponseT), (jbyte*) vfutDelEfpFinTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelEfpFinTrdRequestT(futBscDelEfpFinTrdRequestT actual, futBscDelEfpFinTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEfpFinTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEfpFinTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEfpFinTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEfpFinTrdRequestT(futDelEfpFinTrdRequestT actual, futDelEfpFinTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelEfpFinTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEfpFinTrdResponseT(futDelEfpFinTrdResponseT actual, futDelEfpFinTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutDelEfpFinTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEfpFinTrdRequestT *actualData = (futDelEfpFinTrdRequestT *)msgStruct;
	futDelEfpFinTrdRequestT* expectedData = getFutDelEfpFinTrdRequestT(testCaseNum);
	compareFutDelEfpFinTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelEfpFinTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEfpFinTrdResponseT *actualData = (futDelEfpFinTrdResponseT *)msgStruct;
	futDelEfpFinTrdResponseT* expectedData = getFutDelEfpFinTrdResponseT(testCaseNum);
	compareFutDelEfpFinTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
