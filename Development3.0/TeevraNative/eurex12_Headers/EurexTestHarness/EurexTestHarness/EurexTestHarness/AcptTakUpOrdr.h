#include <AcptTakUpOrdr.hxx>
#define BUFFER_SIZE 1000

futAcptTakUpOrdrRequestT *vfutAcptTakUpOrdrRequestT;
futAcptTakUpOrdrResponseT *vfutAcptTakUpOrdrResponseT;
optAcptTakUpOrdrRequestT *voptAcptTakUpOrdrRequestT;
optAcptTakUpOrdrResponseT *voptAcptTakUpOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAcptTakUpOrdrRequestT getFutBscAcptTakUpOrdrRequestT(char* testCaseNum , const char *root) {
	futBscAcptTakUpOrdrRequestT vfutBscAcptTakUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		vfutBscAcptTakUpOrdrRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("AcptTakUpOrdr.futBscAcptTakUpOrdrRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(vfutBscAcptTakUpOrdrRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscAcptTakUpOrdrRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("AcptTakUpOrdr.futBscAcptTakUpOrdrRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscAcptTakUpOrdrRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	vfutBscAcptTakUpOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscAcptTakUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscAcptTakUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("AcptTakUpOrdr.futBscAcptTakUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(vfutBscAcptTakUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscAcptTakUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptTakUpOrdr.futBscAcptTakUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscAcptTakUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);
	return vfutBscAcptTakUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscAcptTakUpOrdrRequestT getOptBscAcptTakUpOrdrRequestT(char* testCaseNum , const char *root) {
	optBscAcptTakUpOrdrRequestT voptBscAcptTakUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		voptBscAcptTakUpOrdrRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("AcptTakUpOrdr.optBscAcptTakUpOrdrRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(voptBscAcptTakUpOrdrRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscAcptTakUpOrdrRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("AcptTakUpOrdr.optBscAcptTakUpOrdrRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscAcptTakUpOrdrRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	voptBscAcptTakUpOrdrRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscAcptTakUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscAcptTakUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("AcptTakUpOrdr.optBscAcptTakUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(voptBscAcptTakUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscAcptTakUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptTakUpOrdr.optBscAcptTakUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(voptBscAcptTakUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);
	return voptBscAcptTakUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAcptTakUpOrdrRequestT* getFutAcptTakUpOrdrRequestT(char* testCaseNum) {
	vfutAcptTakUpOrdrRequestT = (futAcptTakUpOrdrRequestT*)malloc(sizeof(futAcptTakUpOrdrRequestT));
	int i;

	vfutAcptTakUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "futAcptTakUpOrdrRequestT");
	vfutAcptTakUpOrdrRequestT->basic = getFutBscAcptTakUpOrdrRequestT(testCaseNum, "futAcptTakUpOrdrRequestT");
	return vfutAcptTakUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAcptTakUpOrdrResponseT* getFutAcptTakUpOrdrResponseT(char* testCaseNum) {
	vfutAcptTakUpOrdrResponseT = (futAcptTakUpOrdrResponseT*)malloc(sizeof(futAcptTakUpOrdrResponseT));
	int i;

	vfutAcptTakUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "futAcptTakUpOrdrResponseT");
	return vfutAcptTakUpOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optAcptTakUpOrdrRequestT* getOptAcptTakUpOrdrRequestT(char* testCaseNum) {
	voptAcptTakUpOrdrRequestT = (optAcptTakUpOrdrRequestT*)malloc(sizeof(optAcptTakUpOrdrRequestT));
	int i;

	voptAcptTakUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "optAcptTakUpOrdrRequestT");
	voptAcptTakUpOrdrRequestT->basic = getOptBscAcptTakUpOrdrRequestT(testCaseNum, "optAcptTakUpOrdrRequestT");
	return voptAcptTakUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optAcptTakUpOrdrResponseT* getOptAcptTakUpOrdrResponseT(char* testCaseNum) {
	voptAcptTakUpOrdrResponseT = (optAcptTakUpOrdrResponseT*)malloc(sizeof(optAcptTakUpOrdrResponseT));
	int i;

	voptAcptTakUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "optAcptTakUpOrdrResponseT");
	return voptAcptTakUpOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAcptTakUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAcptTakUpOrdrRequestT));
	futAcptTakUpOrdrRequestT *vfutAcptTakUpOrdrRequestT = getFutAcptTakUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAcptTakUpOrdrRequestT), (jbyte*) vfutAcptTakUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAcptTakUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAcptTakUpOrdrResponseT));
	futAcptTakUpOrdrResponseT *vfutAcptTakUpOrdrResponseT = getFutAcptTakUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAcptTakUpOrdrResponseT), (jbyte*) vfutAcptTakUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptAcptTakUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optAcptTakUpOrdrRequestT));
	optAcptTakUpOrdrRequestT *voptAcptTakUpOrdrRequestT = getOptAcptTakUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optAcptTakUpOrdrRequestT), (jbyte*) voptAcptTakUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptAcptTakUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optAcptTakUpOrdrResponseT));
	optAcptTakUpOrdrResponseT *voptAcptTakUpOrdrResponseT = getOptAcptTakUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optAcptTakUpOrdrResponseT), (jbyte*) voptAcptTakUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAcptTakUpOrdrRequestT(futBscAcptTakUpOrdrRequestT actual, futBscAcptTakUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpOrdrRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpOrdrRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscAcptTakUpOrdrRequestT(optBscAcptTakUpOrdrRequestT actual, optBscAcptTakUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpOrdrRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpOrdrRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAcptTakUpOrdrRequestT(futAcptTakUpOrdrRequestT actual, futAcptTakUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAcptTakUpOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAcptTakUpOrdrResponseT(futAcptTakUpOrdrResponseT actual, futAcptTakUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareOptAcptTakUpOrdrRequestT(optAcptTakUpOrdrRequestT actual, optAcptTakUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscAcptTakUpOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptAcptTakUpOrdrResponseT(optAcptTakUpOrdrResponseT actual, optAcptTakUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutAcptTakUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAcptTakUpOrdrRequestT *actualData = (futAcptTakUpOrdrRequestT *)msgStruct;
	futAcptTakUpOrdrRequestT* expectedData = getFutAcptTakUpOrdrRequestT(testCaseNum);
	compareFutAcptTakUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAcptTakUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAcptTakUpOrdrResponseT *actualData = (futAcptTakUpOrdrResponseT *)msgStruct;
	futAcptTakUpOrdrResponseT* expectedData = getFutAcptTakUpOrdrResponseT(testCaseNum);
	compareFutAcptTakUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptAcptTakUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optAcptTakUpOrdrRequestT *actualData = (optAcptTakUpOrdrRequestT *)msgStruct;
	optAcptTakUpOrdrRequestT* expectedData = getOptAcptTakUpOrdrRequestT(testCaseNum);
	compareOptAcptTakUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptAcptTakUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optAcptTakUpOrdrResponseT *actualData = (optAcptTakUpOrdrResponseT *)msgStruct;
	optAcptTakUpOrdrResponseT* expectedData = getOptAcptTakUpOrdrResponseT(testCaseNum);
	compareOptAcptTakUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
