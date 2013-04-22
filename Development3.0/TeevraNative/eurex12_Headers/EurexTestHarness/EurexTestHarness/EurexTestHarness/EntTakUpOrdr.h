#include <EntTakUpOrdr.hxx>
#define BUFFER_SIZE 1000

futEntTakUpOrdrRequestT *vfutEntTakUpOrdrRequestT;
futEntTakUpOrdrResponseT *vfutEntTakUpOrdrResponseT;
optEntTakUpOrdrRequestT *voptEntTakUpOrdrRequestT;
optEntTakUpOrdrResponseT *voptEntTakUpOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTakUpOrdrRequestT getFutBscEntTakUpOrdrRequestT(char* testCaseNum , const char *root) {
	futBscEntTakUpOrdrRequestT vfutBscEntTakUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		vfutBscEntTakUpOrdrRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("EntTakUpOrdr.futBscEntTakUpOrdrRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(vfutBscEntTakUpOrdrRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscEntTakUpOrdrRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntTakUpOrdr.futBscEntTakUpOrdrRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscEntTakUpOrdrRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	vfutBscEntTakUpOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntTakUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntTakUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntTakUpOrdr.futBscEntTakUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(vfutBscEntTakUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntTakUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntTakUpOrdr.futBscEntTakUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscEntTakUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	vfutBscEntTakUpOrdrRequestT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "futBscEntTakUpOrdrRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("EntTakUpOrdr.futBscEntTakUpOrdrRequestT.opnClsCod", lopnClsCod);
	vfutBscEntTakUpOrdrRequestT.opnClsCod = lopnClsCod[0];
	return vfutBscEntTakUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntTakUpOrdrRequestT getFutExtEntTakUpOrdrRequestT(char* testCaseNum , const char *root) {
	futExtEntTakUpOrdrRequestT vfutExtEntTakUpOrdrRequestT;
	int i;

	vfutExtEntTakUpOrdrRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "futExtEntTakUpOrdrRequestT");	return vfutExtEntTakUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTakUpOrdrRequestT getOptBscEntTakUpOrdrRequestT(char* testCaseNum , const char *root) {
	optBscEntTakUpOrdrRequestT voptBscEntTakUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		voptBscEntTakUpOrdrRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("EntTakUpOrdr.optBscEntTakUpOrdrRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(voptBscEntTakUpOrdrRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscEntTakUpOrdrRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntTakUpOrdr.optBscEntTakUpOrdrRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscEntTakUpOrdrRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	voptBscEntTakUpOrdrRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntTakUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscEntTakUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntTakUpOrdr.optBscEntTakUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(voptBscEntTakUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntTakUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntTakUpOrdr.optBscEntTakUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(voptBscEntTakUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	voptBscEntTakUpOrdrRequestT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "optBscEntTakUpOrdrRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("EntTakUpOrdr.optBscEntTakUpOrdrRequestT.opnClsCod", lopnClsCod);
	voptBscEntTakUpOrdrRequestT.opnClsCod = lopnClsCod[0];
	return voptBscEntTakUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntTakUpOrdrRequestT getOptExtEntTakUpOrdrRequestT(char* testCaseNum , const char *root) {
	optExtEntTakUpOrdrRequestT voptExtEntTakUpOrdrRequestT;
	int i;

	voptExtEntTakUpOrdrRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "optExtEntTakUpOrdrRequestT");	return voptExtEntTakUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntTakUpOrdrRequestT* getFutEntTakUpOrdrRequestT(char* testCaseNum) {
	vfutEntTakUpOrdrRequestT = (futEntTakUpOrdrRequestT*)malloc(sizeof(futEntTakUpOrdrRequestT));
	int i;

	vfutEntTakUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "futEntTakUpOrdrRequestT");
	vfutEntTakUpOrdrRequestT->basic = getFutBscEntTakUpOrdrRequestT(testCaseNum, "futEntTakUpOrdrRequestT");
	vfutEntTakUpOrdrRequestT->extension = getFutExtEntTakUpOrdrRequestT(testCaseNum, "futEntTakUpOrdrRequestT");
	return vfutEntTakUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntTakUpOrdrResponseT* getFutEntTakUpOrdrResponseT(char* testCaseNum) {
	vfutEntTakUpOrdrResponseT = (futEntTakUpOrdrResponseT*)malloc(sizeof(futEntTakUpOrdrResponseT));
	int i;

	vfutEntTakUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "futEntTakUpOrdrResponseT");
	return vfutEntTakUpOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntTakUpOrdrRequestT* getOptEntTakUpOrdrRequestT(char* testCaseNum) {
	voptEntTakUpOrdrRequestT = (optEntTakUpOrdrRequestT*)malloc(sizeof(optEntTakUpOrdrRequestT));
	int i;

	voptEntTakUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "optEntTakUpOrdrRequestT");
	voptEntTakUpOrdrRequestT->basic = getOptBscEntTakUpOrdrRequestT(testCaseNum, "optEntTakUpOrdrRequestT");
	voptEntTakUpOrdrRequestT->extension = getOptExtEntTakUpOrdrRequestT(testCaseNum, "optEntTakUpOrdrRequestT");
	return voptEntTakUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntTakUpOrdrResponseT* getOptEntTakUpOrdrResponseT(char* testCaseNum) {
	voptEntTakUpOrdrResponseT = (optEntTakUpOrdrResponseT*)malloc(sizeof(optEntTakUpOrdrResponseT));
	int i;

	voptEntTakUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "optEntTakUpOrdrResponseT");
	return voptEntTakUpOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntTakUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntTakUpOrdrRequestT));
	futEntTakUpOrdrRequestT *vfutEntTakUpOrdrRequestT = getFutEntTakUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntTakUpOrdrRequestT), (jbyte*) vfutEntTakUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntTakUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntTakUpOrdrResponseT));
	futEntTakUpOrdrResponseT *vfutEntTakUpOrdrResponseT = getFutEntTakUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntTakUpOrdrResponseT), (jbyte*) vfutEntTakUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntTakUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntTakUpOrdrRequestT));
	optEntTakUpOrdrRequestT *voptEntTakUpOrdrRequestT = getOptEntTakUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntTakUpOrdrRequestT), (jbyte*) voptEntTakUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntTakUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntTakUpOrdrResponseT));
	optEntTakUpOrdrResponseT *voptEntTakUpOrdrResponseT = getOptEntTakUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntTakUpOrdrResponseT), (jbyte*) voptEntTakUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTakUpOrdrRequestT(futBscEntTakUpOrdrRequestT actual, futBscEntTakUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpOrdrRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpOrdrRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntTakUpOrdrRequestT(futExtEntTakUpOrdrRequestT actual, futExtEntTakUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTakUpOrdrRequestT(optBscEntTakUpOrdrRequestT actual, optBscEntTakUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpOrdrRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpOrdrRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntTakUpOrdrRequestT(optExtEntTakUpOrdrRequestT actual, optExtEntTakUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntTakUpOrdrRequestT(futEntTakUpOrdrRequestT actual, futEntTakUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntTakUpOrdrRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntTakUpOrdrRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntTakUpOrdrResponseT(futEntTakUpOrdrResponseT actual, futEntTakUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareOptEntTakUpOrdrRequestT(optEntTakUpOrdrRequestT actual, optEntTakUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntTakUpOrdrRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntTakUpOrdrRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntTakUpOrdrResponseT(optEntTakUpOrdrResponseT actual, optEntTakUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutEntTakUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntTakUpOrdrRequestT *actualData = (futEntTakUpOrdrRequestT *)msgStruct;
	futEntTakUpOrdrRequestT* expectedData = getFutEntTakUpOrdrRequestT(testCaseNum);
	compareFutEntTakUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntTakUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntTakUpOrdrResponseT *actualData = (futEntTakUpOrdrResponseT *)msgStruct;
	futEntTakUpOrdrResponseT* expectedData = getFutEntTakUpOrdrResponseT(testCaseNum);
	compareFutEntTakUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntTakUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntTakUpOrdrRequestT *actualData = (optEntTakUpOrdrRequestT *)msgStruct;
	optEntTakUpOrdrRequestT* expectedData = getOptEntTakUpOrdrRequestT(testCaseNum);
	compareOptEntTakUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntTakUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntTakUpOrdrResponseT *actualData = (optEntTakUpOrdrResponseT *)msgStruct;
	optEntTakUpOrdrResponseT* expectedData = getOptEntTakUpOrdrResponseT(testCaseNum);
	compareOptEntTakUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
