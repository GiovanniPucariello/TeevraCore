#include <RejTakUpOrdr.hxx>
#define BUFFER_SIZE 1000

futRejTakUpOrdrRequestT *vfutRejTakUpOrdrRequestT;
futRejTakUpOrdrResponseT *vfutRejTakUpOrdrResponseT;
optRejTakUpOrdrRequestT *voptRejTakUpOrdrRequestT;
optRejTakUpOrdrResponseT *voptRejTakUpOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscRejTakUpOrdrRequestT getFutBscRejTakUpOrdrRequestT(char* testCaseNum , const char *root) {
	futBscRejTakUpOrdrRequestT vfutBscRejTakUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		vfutBscRejTakUpOrdrRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("RejTakUpOrdr.futBscRejTakUpOrdrRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(vfutBscRejTakUpOrdrRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscRejTakUpOrdrRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("RejTakUpOrdr.futBscRejTakUpOrdrRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscRejTakUpOrdrRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	vfutBscRejTakUpOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscRejTakUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscRejTakUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("RejTakUpOrdr.futBscRejTakUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(vfutBscRejTakUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscRejTakUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("RejTakUpOrdr.futBscRejTakUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscRejTakUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);
	return vfutBscRejTakUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscRejTakUpOrdrRequestT getOptBscRejTakUpOrdrRequestT(char* testCaseNum , const char *root) {
	optBscRejTakUpOrdrRequestT voptBscRejTakUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		voptBscRejTakUpOrdrRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("RejTakUpOrdr.optBscRejTakUpOrdrRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(voptBscRejTakUpOrdrRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscRejTakUpOrdrRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("RejTakUpOrdr.optBscRejTakUpOrdrRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscRejTakUpOrdrRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	voptBscRejTakUpOrdrRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscRejTakUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscRejTakUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("RejTakUpOrdr.optBscRejTakUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(voptBscRejTakUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscRejTakUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("RejTakUpOrdr.optBscRejTakUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(voptBscRejTakUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);
	return voptBscRejTakUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futRejTakUpOrdrRequestT* getFutRejTakUpOrdrRequestT(char* testCaseNum) {
	vfutRejTakUpOrdrRequestT = (futRejTakUpOrdrRequestT*)malloc(sizeof(futRejTakUpOrdrRequestT));
	int i;

	vfutRejTakUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "futRejTakUpOrdrRequestT");
	vfutRejTakUpOrdrRequestT->basic = getFutBscRejTakUpOrdrRequestT(testCaseNum, "futRejTakUpOrdrRequestT");
	return vfutRejTakUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futRejTakUpOrdrResponseT* getFutRejTakUpOrdrResponseT(char* testCaseNum) {
	vfutRejTakUpOrdrResponseT = (futRejTakUpOrdrResponseT*)malloc(sizeof(futRejTakUpOrdrResponseT));
	int i;

	vfutRejTakUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "futRejTakUpOrdrResponseT");
	return vfutRejTakUpOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optRejTakUpOrdrRequestT* getOptRejTakUpOrdrRequestT(char* testCaseNum) {
	voptRejTakUpOrdrRequestT = (optRejTakUpOrdrRequestT*)malloc(sizeof(optRejTakUpOrdrRequestT));
	int i;

	voptRejTakUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "optRejTakUpOrdrRequestT");
	voptRejTakUpOrdrRequestT->basic = getOptBscRejTakUpOrdrRequestT(testCaseNum, "optRejTakUpOrdrRequestT");
	return voptRejTakUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optRejTakUpOrdrResponseT* getOptRejTakUpOrdrResponseT(char* testCaseNum) {
	voptRejTakUpOrdrResponseT = (optRejTakUpOrdrResponseT*)malloc(sizeof(optRejTakUpOrdrResponseT));
	int i;

	voptRejTakUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "optRejTakUpOrdrResponseT");
	return voptRejTakUpOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutRejTakUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futRejTakUpOrdrRequestT));
	futRejTakUpOrdrRequestT *vfutRejTakUpOrdrRequestT = getFutRejTakUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futRejTakUpOrdrRequestT), (jbyte*) vfutRejTakUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutRejTakUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futRejTakUpOrdrResponseT));
	futRejTakUpOrdrResponseT *vfutRejTakUpOrdrResponseT = getFutRejTakUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futRejTakUpOrdrResponseT), (jbyte*) vfutRejTakUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptRejTakUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optRejTakUpOrdrRequestT));
	optRejTakUpOrdrRequestT *voptRejTakUpOrdrRequestT = getOptRejTakUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optRejTakUpOrdrRequestT), (jbyte*) voptRejTakUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptRejTakUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optRejTakUpOrdrResponseT));
	optRejTakUpOrdrResponseT *voptRejTakUpOrdrResponseT = getOptRejTakUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optRejTakUpOrdrResponseT), (jbyte*) voptRejTakUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscRejTakUpOrdrRequestT(futBscRejTakUpOrdrRequestT actual, futBscRejTakUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpOrdrRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpOrdrRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscRejTakUpOrdrRequestT(optBscRejTakUpOrdrRequestT actual, optBscRejTakUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpOrdrRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpOrdrRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutRejTakUpOrdrRequestT(futRejTakUpOrdrRequestT actual, futRejTakUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscRejTakUpOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutRejTakUpOrdrResponseT(futRejTakUpOrdrResponseT actual, futRejTakUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareOptRejTakUpOrdrRequestT(optRejTakUpOrdrRequestT actual, optRejTakUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscRejTakUpOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptRejTakUpOrdrResponseT(optRejTakUpOrdrResponseT actual, optRejTakUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutRejTakUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futRejTakUpOrdrRequestT *actualData = (futRejTakUpOrdrRequestT *)msgStruct;
	futRejTakUpOrdrRequestT* expectedData = getFutRejTakUpOrdrRequestT(testCaseNum);
	compareFutRejTakUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutRejTakUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futRejTakUpOrdrResponseT *actualData = (futRejTakUpOrdrResponseT *)msgStruct;
	futRejTakUpOrdrResponseT* expectedData = getFutRejTakUpOrdrResponseT(testCaseNum);
	compareFutRejTakUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptRejTakUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optRejTakUpOrdrRequestT *actualData = (optRejTakUpOrdrRequestT *)msgStruct;
	optRejTakUpOrdrRequestT* expectedData = getOptRejTakUpOrdrRequestT(testCaseNum);
	compareOptRejTakUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptRejTakUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optRejTakUpOrdrResponseT *actualData = (optRejTakUpOrdrResponseT *)msgStruct;
	optRejTakUpOrdrResponseT* expectedData = getOptRejTakUpOrdrResponseT(testCaseNum);
	compareOptRejTakUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
