#include <DelVolTrd.hxx>
#define BUFFER_SIZE 1000

futDelVolTrdRequestT *vfutDelVolTrdRequestT;
futDelVolTrdResponseT *vfutDelVolTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelVolTrdRequestT getFutBscDelVolTrdRequestT(char* testCaseNum , const char *root) {
	futBscDelVolTrdRequestT vfutBscDelVolTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscDelVolTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DelVolTrd.futBscDelVolTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscDelVolTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscDelVolTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelVolTrd.futBscDelVolTrdRequestT.prodId", lprodId);
	memcpy(vfutBscDelVolTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	vfutBscDelVolTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelVolTrdRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscDelVolTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelVolTrd.futBscDelVolTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscDelVolTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscDelVolTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelVolTrdRequestT* getFutDelVolTrdRequestT(char* testCaseNum) {
	vfutDelVolTrdRequestT = (futDelVolTrdRequestT*)malloc(sizeof(futDelVolTrdRequestT));
	int i;

	vfutDelVolTrdRequestT->header = getDataHeaderT(testCaseNum, "futDelVolTrdRequestT");
	vfutDelVolTrdRequestT->basic = getFutBscDelVolTrdRequestT(testCaseNum, "futDelVolTrdRequestT");
	return vfutDelVolTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelVolTrdResponseT* getFutDelVolTrdResponseT(char* testCaseNum) {
	vfutDelVolTrdResponseT = (futDelVolTrdResponseT*)malloc(sizeof(futDelVolTrdResponseT));
	int i;

	vfutDelVolTrdResponseT->header = getDataHeaderT(testCaseNum, "futDelVolTrdResponseT");
	return vfutDelVolTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelVolTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelVolTrdRequestT));
	futDelVolTrdRequestT *vfutDelVolTrdRequestT = getFutDelVolTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelVolTrdRequestT), (jbyte*) vfutDelVolTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelVolTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelVolTrdResponseT));
	futDelVolTrdResponseT *vfutDelVolTrdResponseT = getFutDelVolTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelVolTrdResponseT), (jbyte*) vfutDelVolTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelVolTrdRequestT(futBscDelVolTrdRequestT actual, futBscDelVolTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelVolTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelVolTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelVolTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelVolTrdRequestT(futDelVolTrdRequestT actual, futDelVolTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelVolTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelVolTrdResponseT(futDelVolTrdResponseT actual, futDelVolTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutDelVolTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelVolTrdRequestT *actualData = (futDelVolTrdRequestT *)msgStruct;
	futDelVolTrdRequestT* expectedData = getFutDelVolTrdRequestT(testCaseNum);
	compareFutDelVolTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelVolTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelVolTrdResponseT *actualData = (futDelVolTrdResponseT *)msgStruct;
	futDelVolTrdResponseT* expectedData = getFutDelVolTrdResponseT(testCaseNum);
	compareFutDelVolTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
