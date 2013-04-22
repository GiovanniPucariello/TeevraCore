#include <DelEbiEfpIdxTrd.hxx>
#define BUFFER_SIZE 1000

futDelEbiEfpIdxTrdRequestT *vfutDelEbiEfpIdxTrdRequestT;
futDelEbiEfpIdxTrdResponseT *vfutDelEbiEfpIdxTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelEbiEfpIdxTrdRequestT getFutBscDelEbiEfpIdxTrdRequestT(char* testCaseNum , const char *root) {
	futBscDelEbiEfpIdxTrdRequestT vfutBscDelEbiEfpIdxTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscDelEbiEfpIdxTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("DelEbiEfpIdxTrd.futBscDelEbiEfpIdxTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscDelEbiEfpIdxTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscDelEbiEfpIdxTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelEbiEfpIdxTrd.futBscDelEbiEfpIdxTrdRequestT.prodId", lprodId);
	memcpy(vfutBscDelEbiEfpIdxTrdRequestT.prodId, lprodId, PROD_ID_LEN);
	return vfutBscDelEbiEfpIdxTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEbiEfpIdxTrdRequestT* getFutDelEbiEfpIdxTrdRequestT(char* testCaseNum) {
	vfutDelEbiEfpIdxTrdRequestT = (futDelEbiEfpIdxTrdRequestT*)malloc(sizeof(futDelEbiEfpIdxTrdRequestT));
	int i;

	vfutDelEbiEfpIdxTrdRequestT->header = getDataHeaderT(testCaseNum, "futDelEbiEfpIdxTrdRequestT");
	vfutDelEbiEfpIdxTrdRequestT->basic = getFutBscDelEbiEfpIdxTrdRequestT(testCaseNum, "futDelEbiEfpIdxTrdRequestT");
	return vfutDelEbiEfpIdxTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEbiEfpIdxTrdResponseT* getFutDelEbiEfpIdxTrdResponseT(char* testCaseNum) {
	vfutDelEbiEfpIdxTrdResponseT = (futDelEbiEfpIdxTrdResponseT*)malloc(sizeof(futDelEbiEfpIdxTrdResponseT));
	int i;

	vfutDelEbiEfpIdxTrdResponseT->header = getDataHeaderT(testCaseNum, "futDelEbiEfpIdxTrdResponseT");
	return vfutDelEbiEfpIdxTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEbiEfpIdxTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEbiEfpIdxTrdRequestT));
	futDelEbiEfpIdxTrdRequestT *vfutDelEbiEfpIdxTrdRequestT = getFutDelEbiEfpIdxTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEbiEfpIdxTrdRequestT), (jbyte*) vfutDelEbiEfpIdxTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEbiEfpIdxTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEbiEfpIdxTrdResponseT));
	futDelEbiEfpIdxTrdResponseT *vfutDelEbiEfpIdxTrdResponseT = getFutDelEbiEfpIdxTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEbiEfpIdxTrdResponseT), (jbyte*) vfutDelEbiEfpIdxTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelEbiEfpIdxTrdRequestT(futBscDelEbiEfpIdxTrdRequestT actual, futBscDelEbiEfpIdxTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEbiEfpIdxTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEbiEfpIdxTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEbiEfpIdxTrdRequestT(futDelEbiEfpIdxTrdRequestT actual, futDelEbiEfpIdxTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelEbiEfpIdxTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEbiEfpIdxTrdResponseT(futDelEbiEfpIdxTrdResponseT actual, futDelEbiEfpIdxTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutDelEbiEfpIdxTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEbiEfpIdxTrdRequestT *actualData = (futDelEbiEfpIdxTrdRequestT *)msgStruct;
	futDelEbiEfpIdxTrdRequestT* expectedData = getFutDelEbiEfpIdxTrdRequestT(testCaseNum);
	compareFutDelEbiEfpIdxTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelEbiEfpIdxTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEbiEfpIdxTrdResponseT *actualData = (futDelEbiEfpIdxTrdResponseT *)msgStruct;
	futDelEbiEfpIdxTrdResponseT* expectedData = getFutDelEbiEfpIdxTrdResponseT(testCaseNum);
	compareFutDelEbiEfpIdxTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
