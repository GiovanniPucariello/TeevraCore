#include <EntGivUpOrdr.hxx>
#define BUFFER_SIZE 1000

futEntGivUpOrdrRequestT *vfutEntGivUpOrdrRequestT;
futEntGivUpOrdrResponseT *vfutEntGivUpOrdrResponseT;
optEntGivUpOrdrRequestT *voptEntGivUpOrdrRequestT;
optEntGivUpOrdrResponseT *voptEntGivUpOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntGivUpOrdrRequestT getFutBscEntGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	futBscEntGivUpOrdrRequestT vfutBscEntGivUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscEntGivUpOrdrRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("EntGivUpOrdr.futBscEntGivUpOrdrRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscEntGivUpOrdrRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscEntGivUpOrdrRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("EntGivUpOrdr.futBscEntGivUpOrdrRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscEntGivUpOrdrRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	vfutBscEntGivUpOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntGivUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntGivUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntGivUpOrdr.futBscEntGivUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(vfutBscEntGivUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntGivUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntGivUpOrdr.futBscEntGivUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscEntGivUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscEntGivUpOrdrRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntGivUpOrdr.futBscEntGivUpOrdrRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscEntGivUpOrdrRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntGivUpOrdr.futBscEntGivUpOrdrRequestT.opnClsCod", lopnClsCod);
	vfutBscEntGivUpOrdrRequestT.opnClsCod = lopnClsCod[0];
	return vfutBscEntGivUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntGivUpOrdrRequestT getFutExtEntGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	futExtEntGivUpOrdrRequestT vfutExtEntGivUpOrdrRequestT;
	int i;

	vfutExtEntGivUpOrdrRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "futExtEntGivUpOrdrRequestT");	return vfutExtEntGivUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntGivUpOrdrRequestT getOptBscEntGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	optBscEntGivUpOrdrRequestT voptBscEntGivUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscEntGivUpOrdrRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("EntGivUpOrdr.optBscEntGivUpOrdrRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscEntGivUpOrdrRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscEntGivUpOrdrRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("EntGivUpOrdr.optBscEntGivUpOrdrRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscEntGivUpOrdrRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	voptBscEntGivUpOrdrRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntGivUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscEntGivUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntGivUpOrdr.optBscEntGivUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(voptBscEntGivUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntGivUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntGivUpOrdr.optBscEntGivUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(voptBscEntGivUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscEntGivUpOrdrRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntGivUpOrdr.optBscEntGivUpOrdrRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscEntGivUpOrdrRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntGivUpOrdr.optBscEntGivUpOrdrRequestT.opnClsCod", lopnClsCod);
	voptBscEntGivUpOrdrRequestT.opnClsCod = lopnClsCod[0];
	return voptBscEntGivUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntGivUpOrdrRequestT getOptExtEntGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	optExtEntGivUpOrdrRequestT voptExtEntGivUpOrdrRequestT;
	int i;

	voptExtEntGivUpOrdrRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "optExtEntGivUpOrdrRequestT");	return voptExtEntGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntGivUpOrdrRequestT* getFutEntGivUpOrdrRequestT(char* testCaseNum) {
	vfutEntGivUpOrdrRequestT = (futEntGivUpOrdrRequestT*)malloc(sizeof(futEntGivUpOrdrRequestT));
	int i;

	vfutEntGivUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "futEntGivUpOrdrRequestT");
	vfutEntGivUpOrdrRequestT->basic = getFutBscEntGivUpOrdrRequestT(testCaseNum, "futEntGivUpOrdrRequestT");
	vfutEntGivUpOrdrRequestT->extension = getFutExtEntGivUpOrdrRequestT(testCaseNum, "futEntGivUpOrdrRequestT");
	return vfutEntGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntGivUpOrdrResponseT* getFutEntGivUpOrdrResponseT(char* testCaseNum) {
	vfutEntGivUpOrdrResponseT = (futEntGivUpOrdrResponseT*)malloc(sizeof(futEntGivUpOrdrResponseT));
	int i;

	vfutEntGivUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "futEntGivUpOrdrResponseT");
	return vfutEntGivUpOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntGivUpOrdrRequestT* getOptEntGivUpOrdrRequestT(char* testCaseNum) {
	voptEntGivUpOrdrRequestT = (optEntGivUpOrdrRequestT*)malloc(sizeof(optEntGivUpOrdrRequestT));
	int i;

	voptEntGivUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "optEntGivUpOrdrRequestT");
	voptEntGivUpOrdrRequestT->basic = getOptBscEntGivUpOrdrRequestT(testCaseNum, "optEntGivUpOrdrRequestT");
	voptEntGivUpOrdrRequestT->extension = getOptExtEntGivUpOrdrRequestT(testCaseNum, "optEntGivUpOrdrRequestT");
	return voptEntGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntGivUpOrdrResponseT* getOptEntGivUpOrdrResponseT(char* testCaseNum) {
	voptEntGivUpOrdrResponseT = (optEntGivUpOrdrResponseT*)malloc(sizeof(optEntGivUpOrdrResponseT));
	int i;

	voptEntGivUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "optEntGivUpOrdrResponseT");
	return voptEntGivUpOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntGivUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntGivUpOrdrRequestT));
	futEntGivUpOrdrRequestT *vfutEntGivUpOrdrRequestT = getFutEntGivUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntGivUpOrdrRequestT), (jbyte*) vfutEntGivUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntGivUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntGivUpOrdrResponseT));
	futEntGivUpOrdrResponseT *vfutEntGivUpOrdrResponseT = getFutEntGivUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntGivUpOrdrResponseT), (jbyte*) vfutEntGivUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntGivUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntGivUpOrdrRequestT));
	optEntGivUpOrdrRequestT *voptEntGivUpOrdrRequestT = getOptEntGivUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntGivUpOrdrRequestT), (jbyte*) voptEntGivUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntGivUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntGivUpOrdrResponseT));
	optEntGivUpOrdrResponseT *voptEntGivUpOrdrResponseT = getOptEntGivUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntGivUpOrdrResponseT), (jbyte*) voptEntGivUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntGivUpOrdrRequestT(futBscEntGivUpOrdrRequestT actual, futBscEntGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpOrdrRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpOrdrRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpOrdrRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntGivUpOrdrRequestT(futExtEntGivUpOrdrRequestT actual, futExtEntGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntGivUpOrdrRequestT(optBscEntGivUpOrdrRequestT actual, optBscEntGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpOrdrRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpOrdrRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpOrdrRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntGivUpOrdrRequestT(optExtEntGivUpOrdrRequestT actual, optExtEntGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntGivUpOrdrRequestT(futEntGivUpOrdrRequestT actual, futEntGivUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntGivUpOrdrRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntGivUpOrdrRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntGivUpOrdrResponseT(futEntGivUpOrdrResponseT actual, futEntGivUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareOptEntGivUpOrdrRequestT(optEntGivUpOrdrRequestT actual, optEntGivUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntGivUpOrdrRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntGivUpOrdrRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntGivUpOrdrResponseT(optEntGivUpOrdrResponseT actual, optEntGivUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutEntGivUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntGivUpOrdrRequestT *actualData = (futEntGivUpOrdrRequestT *)msgStruct;
	futEntGivUpOrdrRequestT* expectedData = getFutEntGivUpOrdrRequestT(testCaseNum);
	compareFutEntGivUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntGivUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntGivUpOrdrResponseT *actualData = (futEntGivUpOrdrResponseT *)msgStruct;
	futEntGivUpOrdrResponseT* expectedData = getFutEntGivUpOrdrResponseT(testCaseNum);
	compareFutEntGivUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntGivUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntGivUpOrdrRequestT *actualData = (optEntGivUpOrdrRequestT *)msgStruct;
	optEntGivUpOrdrRequestT* expectedData = getOptEntGivUpOrdrRequestT(testCaseNum);
	compareOptEntGivUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntGivUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntGivUpOrdrResponseT *actualData = (optEntGivUpOrdrResponseT *)msgStruct;
	optEntGivUpOrdrResponseT* expectedData = getOptEntGivUpOrdrResponseT(testCaseNum);
	compareOptEntGivUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
