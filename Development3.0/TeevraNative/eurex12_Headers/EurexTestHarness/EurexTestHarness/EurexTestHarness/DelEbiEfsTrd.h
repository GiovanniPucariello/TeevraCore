#include <DelEbiEfsTrd.hxx>
#define BUFFER_SIZE 1000

futDelEbiEfsTrdRequestT *vfutDelEbiEfsTrdRequestT;
futDelEbiEfsTrdResponseT *vfutDelEbiEfsTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelEbiEfsTrdRequestT getFutBscDelEbiEfsTrdRequestT(char* testCaseNum , const char *root) {
	futBscDelEbiEfsTrdRequestT vfutBscDelEbiEfsTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscDelEbiEfsTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("DelEbiEfsTrd.futBscDelEbiEfsTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscDelEbiEfsTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscDelEbiEfsTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelEbiEfsTrd.futBscDelEbiEfsTrdRequestT.prodId", lprodId);
	memcpy(vfutBscDelEbiEfsTrdRequestT.prodId, lprodId, PROD_ID_LEN);
	return vfutBscDelEbiEfsTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEbiEfsTrdRequestT* getFutDelEbiEfsTrdRequestT(char* testCaseNum) {
	vfutDelEbiEfsTrdRequestT = (futDelEbiEfsTrdRequestT*)malloc(sizeof(futDelEbiEfsTrdRequestT));
	int i;

	vfutDelEbiEfsTrdRequestT->header = getDataHeaderT(testCaseNum, "futDelEbiEfsTrdRequestT");
	vfutDelEbiEfsTrdRequestT->basic = getFutBscDelEbiEfsTrdRequestT(testCaseNum, "futDelEbiEfsTrdRequestT");
	return vfutDelEbiEfsTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelEbiEfsTrdResponseT* getFutDelEbiEfsTrdResponseT(char* testCaseNum) {
	vfutDelEbiEfsTrdResponseT = (futDelEbiEfsTrdResponseT*)malloc(sizeof(futDelEbiEfsTrdResponseT));
	int i;

	vfutDelEbiEfsTrdResponseT->header = getDataHeaderT(testCaseNum, "futDelEbiEfsTrdResponseT");
	return vfutDelEbiEfsTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEbiEfsTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEbiEfsTrdRequestT));
	futDelEbiEfsTrdRequestT *vfutDelEbiEfsTrdRequestT = getFutDelEbiEfsTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEbiEfsTrdRequestT), (jbyte*) vfutDelEbiEfsTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelEbiEfsTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelEbiEfsTrdResponseT));
	futDelEbiEfsTrdResponseT *vfutDelEbiEfsTrdResponseT = getFutDelEbiEfsTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelEbiEfsTrdResponseT), (jbyte*) vfutDelEbiEfsTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelEbiEfsTrdRequestT(futBscDelEbiEfsTrdRequestT actual, futBscDelEbiEfsTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEbiEfsTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelEbiEfsTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEbiEfsTrdRequestT(futDelEbiEfsTrdRequestT actual, futDelEbiEfsTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelEbiEfsTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelEbiEfsTrdResponseT(futDelEbiEfsTrdResponseT actual, futDelEbiEfsTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutDelEbiEfsTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEbiEfsTrdRequestT *actualData = (futDelEbiEfsTrdRequestT *)msgStruct;
	futDelEbiEfsTrdRequestT* expectedData = getFutDelEbiEfsTrdRequestT(testCaseNum);
	compareFutDelEbiEfsTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelEbiEfsTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelEbiEfsTrdResponseT *actualData = (futDelEbiEfsTrdResponseT *)msgStruct;
	futDelEbiEfsTrdResponseT* expectedData = getFutDelEbiEfsTrdResponseT(testCaseNum);
	compareFutDelEbiEfsTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
