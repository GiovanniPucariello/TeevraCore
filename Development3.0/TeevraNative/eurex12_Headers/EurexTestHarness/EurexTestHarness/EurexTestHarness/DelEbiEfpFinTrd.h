#include <DelEbiEfpFinTrd.hxx>
#define BUFFER_SIZE 1000

futDelEbiEfpFinTrdRequestT *vfutDelEbiEfpFinTrdRequestT;
futDelEbiEfpFinTrdResponseT *vfutDelEbiEfpFinTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelEbiEfpFinTrdRequestT getFutBscDelEbiEfpFinTrdRequestT(char* testCaseNum , const char *root) {
	futBscDelEbiEfpFinTrdRequestT vfutBscDelEbiEfpFinTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscDelEbiEfpFinTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("DelEbiEfpFinTrd.futBscDelEbiEfpFinTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscDelEbiEfpFinTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscDelEbiEfpFinTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelEbiEfpFinTrd.futBscDelEbiEfpFinTrdRequestT.prodId", lprodId);
	memcpy(vfutBscDelEbiEfpFinTrdRequestT.prodId, lprodId, PROD_ID_LEN);
	return vfutBscDelEbiEfpFinTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEbiEfpFinTrdRequestT* getFutDelEbiEfpFinTrdRequestT(char* testCaseNum) {
	vfutDelEbiEfpFinTrdRequestT = (futDelEbiEfpFinTrdRequestT*)malloc(sizeof(futDelEbiEfpFinTrdRequestT));
	int i;

	vfutDelEbiEfpFinTrdRequestT->header = getDataHeaderT(testCaseNum, "futDelEbiEfpFinTrdRequestT");
	vfutDelEbiEfpFinTrdRequestT->basic = getFutBscDelEbiEfpFinTrdRequestT(testCaseNum, "futDelEbiEfpFinTrdRequestT");
	return vfutDelEbiEfpFinTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEbiEfpFinTrdResponseT* getFutDelEbiEfpFinTrdResponseT(char* testCaseNum) {
	vfutDelEbiEfpFinTrdResponseT = (futDelEbiEfpFinTrdResponseT*)malloc(sizeof(futDelEbiEfpFinTrdResponseT));
	int i;

	vfutDelEbiEfpFinTrdResponseT->header = getDataHeaderT(testCaseNum, "futDelEbiEfpFinTrdResponseT");
	return vfutDelEbiEfpFinTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEbiEfpFinTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEbiEfpFinTrdRequestT));
	futDelEbiEfpFinTrdRequestT *vfutDelEbiEfpFinTrdRequestT = getFutDelEbiEfpFinTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEbiEfpFinTrdRequestT), (jbyte*) vfutDelEbiEfpFinTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEbiEfpFinTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEbiEfpFinTrdResponseT));
	futDelEbiEfpFinTrdResponseT *vfutDelEbiEfpFinTrdResponseT = getFutDelEbiEfpFinTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEbiEfpFinTrdResponseT), (jbyte*) vfutDelEbiEfpFinTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelEbiEfpFinTrdRequestT(futBscDelEbiEfpFinTrdRequestT actual, futBscDelEbiEfpFinTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEbiEfpFinTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEbiEfpFinTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEbiEfpFinTrdRequestT(futDelEbiEfpFinTrdRequestT actual, futDelEbiEfpFinTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelEbiEfpFinTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEbiEfpFinTrdResponseT(futDelEbiEfpFinTrdResponseT actual, futDelEbiEfpFinTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutDelEbiEfpFinTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEbiEfpFinTrdRequestT *actualData = (futDelEbiEfpFinTrdRequestT *)msgStruct;
	futDelEbiEfpFinTrdRequestT* expectedData = getFutDelEbiEfpFinTrdRequestT(testCaseNum);
	compareFutDelEbiEfpFinTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelEbiEfpFinTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEbiEfpFinTrdResponseT *actualData = (futDelEbiEfpFinTrdResponseT *)msgStruct;
	futDelEbiEfpFinTrdResponseT* expectedData = getFutDelEbiEfpFinTrdResponseT(testCaseNum);
	compareFutDelEbiEfpFinTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
