#include <UdsgGivUpOrdr.hxx>
#define BUFFER_SIZE 1000

futUdsgGivUpOrdrRequestT *vfutUdsgGivUpOrdrRequestT;
futUdsgGivUpOrdrResponseT *vfutUdsgGivUpOrdrResponseT;
optUdsgGivUpOrdrRequestT *voptUdsgGivUpOrdrRequestT;
optUdsgGivUpOrdrResponseT *voptUdsgGivUpOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscUdsgGivUpOrdrRequestT getFutBscUdsgGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	futBscUdsgGivUpOrdrRequestT vfutBscUdsgGivUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscUdsgGivUpOrdrRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("UdsgGivUpOrdr.futBscUdsgGivUpOrdrRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscUdsgGivUpOrdrRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscUdsgGivUpOrdrRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("UdsgGivUpOrdr.futBscUdsgGivUpOrdrRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscUdsgGivUpOrdrRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	vfutBscUdsgGivUpOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscUdsgGivUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscUdsgGivUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("UdsgGivUpOrdr.futBscUdsgGivUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(vfutBscUdsgGivUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscUdsgGivUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("UdsgGivUpOrdr.futBscUdsgGivUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscUdsgGivUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);
	return vfutBscUdsgGivUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscUdsgGivUpOrdrRequestT getOptBscUdsgGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	optBscUdsgGivUpOrdrRequestT voptBscUdsgGivUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscUdsgGivUpOrdrRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("UdsgGivUpOrdr.optBscUdsgGivUpOrdrRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscUdsgGivUpOrdrRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscUdsgGivUpOrdrRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("UdsgGivUpOrdr.optBscUdsgGivUpOrdrRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscUdsgGivUpOrdrRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	voptBscUdsgGivUpOrdrRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscUdsgGivUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscUdsgGivUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("UdsgGivUpOrdr.optBscUdsgGivUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(voptBscUdsgGivUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscUdsgGivUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("UdsgGivUpOrdr.optBscUdsgGivUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(voptBscUdsgGivUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);
	return voptBscUdsgGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futUdsgGivUpOrdrRequestT* getFutUdsgGivUpOrdrRequestT(char* testCaseNum) {
	vfutUdsgGivUpOrdrRequestT = (futUdsgGivUpOrdrRequestT*)malloc(sizeof(futUdsgGivUpOrdrRequestT));
	int i;

	vfutUdsgGivUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "futUdsgGivUpOrdrRequestT");
	vfutUdsgGivUpOrdrRequestT->basic = getFutBscUdsgGivUpOrdrRequestT(testCaseNum, "futUdsgGivUpOrdrRequestT");
	return vfutUdsgGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futUdsgGivUpOrdrResponseT* getFutUdsgGivUpOrdrResponseT(char* testCaseNum) {
	vfutUdsgGivUpOrdrResponseT = (futUdsgGivUpOrdrResponseT*)malloc(sizeof(futUdsgGivUpOrdrResponseT));
	int i;

	vfutUdsgGivUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "futUdsgGivUpOrdrResponseT");
	return vfutUdsgGivUpOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optUdsgGivUpOrdrRequestT* getOptUdsgGivUpOrdrRequestT(char* testCaseNum) {
	voptUdsgGivUpOrdrRequestT = (optUdsgGivUpOrdrRequestT*)malloc(sizeof(optUdsgGivUpOrdrRequestT));
	int i;

	voptUdsgGivUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "optUdsgGivUpOrdrRequestT");
	voptUdsgGivUpOrdrRequestT->basic = getOptBscUdsgGivUpOrdrRequestT(testCaseNum, "optUdsgGivUpOrdrRequestT");
	return voptUdsgGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optUdsgGivUpOrdrResponseT* getOptUdsgGivUpOrdrResponseT(char* testCaseNum) {
	voptUdsgGivUpOrdrResponseT = (optUdsgGivUpOrdrResponseT*)malloc(sizeof(optUdsgGivUpOrdrResponseT));
	int i;

	voptUdsgGivUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "optUdsgGivUpOrdrResponseT");
	return voptUdsgGivUpOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutUdsgGivUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futUdsgGivUpOrdrRequestT));
	futUdsgGivUpOrdrRequestT *vfutUdsgGivUpOrdrRequestT = getFutUdsgGivUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futUdsgGivUpOrdrRequestT), (jbyte*) vfutUdsgGivUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutUdsgGivUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futUdsgGivUpOrdrResponseT));
	futUdsgGivUpOrdrResponseT *vfutUdsgGivUpOrdrResponseT = getFutUdsgGivUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futUdsgGivUpOrdrResponseT), (jbyte*) vfutUdsgGivUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptUdsgGivUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optUdsgGivUpOrdrRequestT));
	optUdsgGivUpOrdrRequestT *voptUdsgGivUpOrdrRequestT = getOptUdsgGivUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optUdsgGivUpOrdrRequestT), (jbyte*) voptUdsgGivUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptUdsgGivUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optUdsgGivUpOrdrResponseT));
	optUdsgGivUpOrdrResponseT *voptUdsgGivUpOrdrResponseT = getOptUdsgGivUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optUdsgGivUpOrdrResponseT), (jbyte*) voptUdsgGivUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscUdsgGivUpOrdrRequestT(futBscUdsgGivUpOrdrRequestT actual, futBscUdsgGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpOrdrRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpOrdrRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscUdsgGivUpOrdrRequestT(optBscUdsgGivUpOrdrRequestT actual, optBscUdsgGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpOrdrRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpOrdrRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutUdsgGivUpOrdrRequestT(futUdsgGivUpOrdrRequestT actual, futUdsgGivUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscUdsgGivUpOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutUdsgGivUpOrdrResponseT(futUdsgGivUpOrdrResponseT actual, futUdsgGivUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareOptUdsgGivUpOrdrRequestT(optUdsgGivUpOrdrRequestT actual, optUdsgGivUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscUdsgGivUpOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptUdsgGivUpOrdrResponseT(optUdsgGivUpOrdrResponseT actual, optUdsgGivUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutUdsgGivUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futUdsgGivUpOrdrRequestT *actualData = (futUdsgGivUpOrdrRequestT *)msgStruct;
	futUdsgGivUpOrdrRequestT* expectedData = getFutUdsgGivUpOrdrRequestT(testCaseNum);
	compareFutUdsgGivUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutUdsgGivUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futUdsgGivUpOrdrResponseT *actualData = (futUdsgGivUpOrdrResponseT *)msgStruct;
	futUdsgGivUpOrdrResponseT* expectedData = getFutUdsgGivUpOrdrResponseT(testCaseNum);
	compareFutUdsgGivUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptUdsgGivUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optUdsgGivUpOrdrRequestT *actualData = (optUdsgGivUpOrdrRequestT *)msgStruct;
	optUdsgGivUpOrdrRequestT* expectedData = getOptUdsgGivUpOrdrRequestT(testCaseNum);
	compareOptUdsgGivUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptUdsgGivUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optUdsgGivUpOrdrResponseT *actualData = (optUdsgGivUpOrdrResponseT *)msgStruct;
	optUdsgGivUpOrdrResponseT* expectedData = getOptUdsgGivUpOrdrResponseT(testCaseNum);
	compareOptUdsgGivUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
