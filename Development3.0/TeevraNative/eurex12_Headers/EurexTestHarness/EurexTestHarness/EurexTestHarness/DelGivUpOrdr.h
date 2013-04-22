#include <DelGivUpOrdr.hxx>
#define BUFFER_SIZE 1000

futDelGivUpOrdrRequestT *vfutDelGivUpOrdrRequestT;
futDelGivUpOrdrResponseT *vfutDelGivUpOrdrResponseT;
optDelGivUpOrdrRequestT *voptDelGivUpOrdrRequestT;
optDelGivUpOrdrResponseT *voptDelGivUpOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelGivUpOrdrRequestT getFutBscDelGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	futBscDelGivUpOrdrRequestT vfutBscDelGivUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscDelGivUpOrdrRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("DelGivUpOrdr.futBscDelGivUpOrdrRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscDelGivUpOrdrRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscDelGivUpOrdrRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("DelGivUpOrdr.futBscDelGivUpOrdrRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscDelGivUpOrdrRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	vfutBscDelGivUpOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscDelGivUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscDelGivUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelGivUpOrdr.futBscDelGivUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(vfutBscDelGivUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscDelGivUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelGivUpOrdr.futBscDelGivUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscDelGivUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);
	return vfutBscDelGivUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelGivUpOrdrRequestT getOptBscDelGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	optBscDelGivUpOrdrRequestT voptBscDelGivUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscDelGivUpOrdrRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("DelGivUpOrdr.optBscDelGivUpOrdrRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscDelGivUpOrdrRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscDelGivUpOrdrRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("DelGivUpOrdr.optBscDelGivUpOrdrRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscDelGivUpOrdrRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	voptBscDelGivUpOrdrRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscDelGivUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscDelGivUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelGivUpOrdr.optBscDelGivUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(voptBscDelGivUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscDelGivUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelGivUpOrdr.optBscDelGivUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(voptBscDelGivUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);
	return voptBscDelGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelGivUpOrdrRequestT* getFutDelGivUpOrdrRequestT(char* testCaseNum) {
	vfutDelGivUpOrdrRequestT = (futDelGivUpOrdrRequestT*)malloc(sizeof(futDelGivUpOrdrRequestT));
	int i;

	vfutDelGivUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "futDelGivUpOrdrRequestT");
	vfutDelGivUpOrdrRequestT->basic = getFutBscDelGivUpOrdrRequestT(testCaseNum, "futDelGivUpOrdrRequestT");
	return vfutDelGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelGivUpOrdrResponseT* getFutDelGivUpOrdrResponseT(char* testCaseNum) {
	vfutDelGivUpOrdrResponseT = (futDelGivUpOrdrResponseT*)malloc(sizeof(futDelGivUpOrdrResponseT));
	int i;

	vfutDelGivUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "futDelGivUpOrdrResponseT");
	return vfutDelGivUpOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelGivUpOrdrRequestT* getOptDelGivUpOrdrRequestT(char* testCaseNum) {
	voptDelGivUpOrdrRequestT = (optDelGivUpOrdrRequestT*)malloc(sizeof(optDelGivUpOrdrRequestT));
	int i;

	voptDelGivUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "optDelGivUpOrdrRequestT");
	voptDelGivUpOrdrRequestT->basic = getOptBscDelGivUpOrdrRequestT(testCaseNum, "optDelGivUpOrdrRequestT");
	return voptDelGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelGivUpOrdrResponseT* getOptDelGivUpOrdrResponseT(char* testCaseNum) {
	voptDelGivUpOrdrResponseT = (optDelGivUpOrdrResponseT*)malloc(sizeof(optDelGivUpOrdrResponseT));
	int i;

	voptDelGivUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "optDelGivUpOrdrResponseT");
	return voptDelGivUpOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelGivUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelGivUpOrdrRequestT));
	futDelGivUpOrdrRequestT *vfutDelGivUpOrdrRequestT = getFutDelGivUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelGivUpOrdrRequestT), (jbyte*) vfutDelGivUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelGivUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelGivUpOrdrResponseT));
	futDelGivUpOrdrResponseT *vfutDelGivUpOrdrResponseT = getFutDelGivUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelGivUpOrdrResponseT), (jbyte*) vfutDelGivUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelGivUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelGivUpOrdrRequestT));
	optDelGivUpOrdrRequestT *voptDelGivUpOrdrRequestT = getOptDelGivUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelGivUpOrdrRequestT), (jbyte*) voptDelGivUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelGivUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelGivUpOrdrResponseT));
	optDelGivUpOrdrResponseT *voptDelGivUpOrdrResponseT = getOptDelGivUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelGivUpOrdrResponseT), (jbyte*) voptDelGivUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelGivUpOrdrRequestT(futBscDelGivUpOrdrRequestT actual, futBscDelGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpOrdrRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpOrdrRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelGivUpOrdrRequestT(optBscDelGivUpOrdrRequestT actual, optBscDelGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpOrdrRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpOrdrRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelGivUpOrdrRequestT(futDelGivUpOrdrRequestT actual, futDelGivUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelGivUpOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelGivUpOrdrResponseT(futDelGivUpOrdrResponseT actual, futDelGivUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareOptDelGivUpOrdrRequestT(optDelGivUpOrdrRequestT actual, optDelGivUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelGivUpOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelGivUpOrdrResponseT(optDelGivUpOrdrResponseT actual, optDelGivUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutDelGivUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelGivUpOrdrRequestT *actualData = (futDelGivUpOrdrRequestT *)msgStruct;
	futDelGivUpOrdrRequestT* expectedData = getFutDelGivUpOrdrRequestT(testCaseNum);
	compareFutDelGivUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelGivUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelGivUpOrdrResponseT *actualData = (futDelGivUpOrdrResponseT *)msgStruct;
	futDelGivUpOrdrResponseT* expectedData = getFutDelGivUpOrdrResponseT(testCaseNum);
	compareFutDelGivUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelGivUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelGivUpOrdrRequestT *actualData = (optDelGivUpOrdrRequestT *)msgStruct;
	optDelGivUpOrdrRequestT* expectedData = getOptDelGivUpOrdrRequestT(testCaseNum);
	compareOptDelGivUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelGivUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelGivUpOrdrResponseT *actualData = (optDelGivUpOrdrResponseT *)msgStruct;
	optDelGivUpOrdrResponseT* expectedData = getOptDelGivUpOrdrResponseT(testCaseNum);
	compareOptDelGivUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
