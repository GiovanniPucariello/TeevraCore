#include <DelEfsTrd.hxx>
#define BUFFER_SIZE 1000

futDelEfsTrdRequestT *vfutDelEfsTrdRequestT;
futDelEfsTrdResponseT *vfutDelEfsTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelEfsTrdRequestT getFutBscDelEfsTrdRequestT(char* testCaseNum , const char *root) {
	futBscDelEfsTrdRequestT vfutBscDelEfsTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscDelEfsTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DelEfsTrd.futBscDelEfsTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscDelEfsTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscDelEfsTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelEfsTrd.futBscDelEfsTrdRequestT.prodId", lprodId);
	memcpy(vfutBscDelEfsTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	vfutBscDelEfsTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelEfsTrdRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscDelEfsTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelEfsTrd.futBscDelEfsTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscDelEfsTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscDelEfsTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEfsTrdRequestT* getFutDelEfsTrdRequestT(char* testCaseNum) {
	vfutDelEfsTrdRequestT = (futDelEfsTrdRequestT*)malloc(sizeof(futDelEfsTrdRequestT));
	int i;

	vfutDelEfsTrdRequestT->header = getDataHeaderT(testCaseNum, "futDelEfsTrdRequestT");
	vfutDelEfsTrdRequestT->basic = getFutBscDelEfsTrdRequestT(testCaseNum, "futDelEfsTrdRequestT");
	return vfutDelEfsTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEfsTrdResponseT* getFutDelEfsTrdResponseT(char* testCaseNum) {
	vfutDelEfsTrdResponseT = (futDelEfsTrdResponseT*)malloc(sizeof(futDelEfsTrdResponseT));
	int i;

	vfutDelEfsTrdResponseT->header = getDataHeaderT(testCaseNum, "futDelEfsTrdResponseT");
	return vfutDelEfsTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEfsTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEfsTrdRequestT));
	futDelEfsTrdRequestT *vfutDelEfsTrdRequestT = getFutDelEfsTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEfsTrdRequestT), (jbyte*) vfutDelEfsTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEfsTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEfsTrdResponseT));
	futDelEfsTrdResponseT *vfutDelEfsTrdResponseT = getFutDelEfsTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEfsTrdResponseT), (jbyte*) vfutDelEfsTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelEfsTrdRequestT(futBscDelEfsTrdRequestT actual, futBscDelEfsTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEfsTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEfsTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEfsTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEfsTrdRequestT(futDelEfsTrdRequestT actual, futDelEfsTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelEfsTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEfsTrdResponseT(futDelEfsTrdResponseT actual, futDelEfsTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutDelEfsTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEfsTrdRequestT *actualData = (futDelEfsTrdRequestT *)msgStruct;
	futDelEfsTrdRequestT* expectedData = getFutDelEfsTrdRequestT(testCaseNum);
	compareFutDelEfsTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelEfsTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEfsTrdResponseT *actualData = (futDelEfsTrdResponseT *)msgStruct;
	futDelEfsTrdResponseT* expectedData = getFutDelEfsTrdResponseT(testCaseNum);
	compareFutDelEfsTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
