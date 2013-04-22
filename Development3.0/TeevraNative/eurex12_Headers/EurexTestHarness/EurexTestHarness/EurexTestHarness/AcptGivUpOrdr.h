#include <AcptGivUpOrdr.hxx>
#define BUFFER_SIZE 1000

futAcptGivUpOrdrRequestT *vfutAcptGivUpOrdrRequestT;
futAcptGivUpOrdrResponseT *vfutAcptGivUpOrdrResponseT;
optAcptGivUpOrdrRequestT *voptAcptGivUpOrdrRequestT;
optAcptGivUpOrdrResponseT *voptAcptGivUpOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAcptGivUpOrdrRequestT getFutBscAcptGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	futBscAcptGivUpOrdrRequestT vfutBscAcptGivUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscAcptGivUpOrdrRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("AcptGivUpOrdr.futBscAcptGivUpOrdrRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscAcptGivUpOrdrRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscAcptGivUpOrdrRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("AcptGivUpOrdr.futBscAcptGivUpOrdrRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscAcptGivUpOrdrRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	vfutBscAcptGivUpOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscAcptGivUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscAcptGivUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("AcptGivUpOrdr.futBscAcptGivUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(vfutBscAcptGivUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscAcptGivUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptGivUpOrdr.futBscAcptGivUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscAcptGivUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);
	return vfutBscAcptGivUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscAcptGivUpOrdrRequestT getOptBscAcptGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	optBscAcptGivUpOrdrRequestT voptBscAcptGivUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscAcptGivUpOrdrRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("AcptGivUpOrdr.optBscAcptGivUpOrdrRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscAcptGivUpOrdrRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscAcptGivUpOrdrRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("AcptGivUpOrdr.optBscAcptGivUpOrdrRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscAcptGivUpOrdrRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	voptBscAcptGivUpOrdrRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscAcptGivUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscAcptGivUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("AcptGivUpOrdr.optBscAcptGivUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(voptBscAcptGivUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscAcptGivUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptGivUpOrdr.optBscAcptGivUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(voptBscAcptGivUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);
	return voptBscAcptGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAcptGivUpOrdrRequestT* getFutAcptGivUpOrdrRequestT(char* testCaseNum) {
	vfutAcptGivUpOrdrRequestT = (futAcptGivUpOrdrRequestT*)malloc(sizeof(futAcptGivUpOrdrRequestT));
	int i;

	vfutAcptGivUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "futAcptGivUpOrdrRequestT");
	vfutAcptGivUpOrdrRequestT->basic = getFutBscAcptGivUpOrdrRequestT(testCaseNum, "futAcptGivUpOrdrRequestT");
	return vfutAcptGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAcptGivUpOrdrResponseT* getFutAcptGivUpOrdrResponseT(char* testCaseNum) {
	vfutAcptGivUpOrdrResponseT = (futAcptGivUpOrdrResponseT*)malloc(sizeof(futAcptGivUpOrdrResponseT));
	int i;

	vfutAcptGivUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "futAcptGivUpOrdrResponseT");
	return vfutAcptGivUpOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optAcptGivUpOrdrRequestT* getOptAcptGivUpOrdrRequestT(char* testCaseNum) {
	voptAcptGivUpOrdrRequestT = (optAcptGivUpOrdrRequestT*)malloc(sizeof(optAcptGivUpOrdrRequestT));
	int i;

	voptAcptGivUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "optAcptGivUpOrdrRequestT");
	voptAcptGivUpOrdrRequestT->basic = getOptBscAcptGivUpOrdrRequestT(testCaseNum, "optAcptGivUpOrdrRequestT");
	return voptAcptGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optAcptGivUpOrdrResponseT* getOptAcptGivUpOrdrResponseT(char* testCaseNum) {
	voptAcptGivUpOrdrResponseT = (optAcptGivUpOrdrResponseT*)malloc(sizeof(optAcptGivUpOrdrResponseT));
	int i;

	voptAcptGivUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "optAcptGivUpOrdrResponseT");
	return voptAcptGivUpOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAcptGivUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAcptGivUpOrdrRequestT));
	futAcptGivUpOrdrRequestT *vfutAcptGivUpOrdrRequestT = getFutAcptGivUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAcptGivUpOrdrRequestT), (jbyte*) vfutAcptGivUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAcptGivUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAcptGivUpOrdrResponseT));
	futAcptGivUpOrdrResponseT *vfutAcptGivUpOrdrResponseT = getFutAcptGivUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAcptGivUpOrdrResponseT), (jbyte*) vfutAcptGivUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptAcptGivUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optAcptGivUpOrdrRequestT));
	optAcptGivUpOrdrRequestT *voptAcptGivUpOrdrRequestT = getOptAcptGivUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optAcptGivUpOrdrRequestT), (jbyte*) voptAcptGivUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptAcptGivUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optAcptGivUpOrdrResponseT));
	optAcptGivUpOrdrResponseT *voptAcptGivUpOrdrResponseT = getOptAcptGivUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optAcptGivUpOrdrResponseT), (jbyte*) voptAcptGivUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAcptGivUpOrdrRequestT(futBscAcptGivUpOrdrRequestT actual, futBscAcptGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpOrdrRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpOrdrRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscAcptGivUpOrdrRequestT(optBscAcptGivUpOrdrRequestT actual, optBscAcptGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpOrdrRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpOrdrRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAcptGivUpOrdrRequestT(futAcptGivUpOrdrRequestT actual, futAcptGivUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAcptGivUpOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAcptGivUpOrdrResponseT(futAcptGivUpOrdrResponseT actual, futAcptGivUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareOptAcptGivUpOrdrRequestT(optAcptGivUpOrdrRequestT actual, optAcptGivUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscAcptGivUpOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptAcptGivUpOrdrResponseT(optAcptGivUpOrdrResponseT actual, optAcptGivUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutAcptGivUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAcptGivUpOrdrRequestT *actualData = (futAcptGivUpOrdrRequestT *)msgStruct;
	futAcptGivUpOrdrRequestT* expectedData = getFutAcptGivUpOrdrRequestT(testCaseNum);
	compareFutAcptGivUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAcptGivUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAcptGivUpOrdrResponseT *actualData = (futAcptGivUpOrdrResponseT *)msgStruct;
	futAcptGivUpOrdrResponseT* expectedData = getFutAcptGivUpOrdrResponseT(testCaseNum);
	compareFutAcptGivUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptAcptGivUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optAcptGivUpOrdrRequestT *actualData = (optAcptGivUpOrdrRequestT *)msgStruct;
	optAcptGivUpOrdrRequestT* expectedData = getOptAcptGivUpOrdrRequestT(testCaseNum);
	compareOptAcptGivUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptAcptGivUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optAcptGivUpOrdrResponseT *actualData = (optAcptGivUpOrdrResponseT *)msgStruct;
	optAcptGivUpOrdrResponseT* expectedData = getOptAcptGivUpOrdrResponseT(testCaseNum);
	compareOptAcptGivUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
