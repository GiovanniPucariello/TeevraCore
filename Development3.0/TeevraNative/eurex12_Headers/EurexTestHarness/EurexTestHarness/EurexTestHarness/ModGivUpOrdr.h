#include <ModGivUpOrdr.hxx>
#define BUFFER_SIZE 1000

futModGivUpOrdrRequestT *vfutModGivUpOrdrRequestT;
futModGivUpOrdrResponseT *vfutModGivUpOrdrResponseT;
optModGivUpOrdrRequestT *voptModGivUpOrdrRequestT;
optModGivUpOrdrResponseT *voptModGivUpOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModGivUpOrdrRequestT getFutBscModGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	futBscModGivUpOrdrRequestT vfutBscModGivUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscModGivUpOrdrRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("ModGivUpOrdr.futBscModGivUpOrdrRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscModGivUpOrdrRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscModGivUpOrdrRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("ModGivUpOrdr.futBscModGivUpOrdrRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscModGivUpOrdrRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	vfutBscModGivUpOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscModGivUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscModGivUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModGivUpOrdr.futBscModGivUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(vfutBscModGivUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscModGivUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModGivUpOrdr.futBscModGivUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscModGivUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscModGivUpOrdrRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModGivUpOrdr.futBscModGivUpOrdrRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscModGivUpOrdrRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModGivUpOrdr.futBscModGivUpOrdrRequestT.opnClsCod", lopnClsCod);
	vfutBscModGivUpOrdrRequestT.opnClsCod = lopnClsCod[0];
	return vfutBscModGivUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtModGivUpOrdrRequestT getFutExtModGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	futExtModGivUpOrdrRequestT vfutExtModGivUpOrdrRequestT;
	int i;

	vfutExtModGivUpOrdrRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "futExtModGivUpOrdrRequestT");	return vfutExtModGivUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModGivUpOrdrRequestT getOptBscModGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	optBscModGivUpOrdrRequestT voptBscModGivUpOrdrRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscModGivUpOrdrRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("ModGivUpOrdr.optBscModGivUpOrdrRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscModGivUpOrdrRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscModGivUpOrdrRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("ModGivUpOrdr.optBscModGivUpOrdrRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscModGivUpOrdrRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	voptBscModGivUpOrdrRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscModGivUpOrdrRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscModGivUpOrdrRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModGivUpOrdr.optBscModGivUpOrdrRequestT.trnDat", ltrnDat);
	memcpy(voptBscModGivUpOrdrRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscModGivUpOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModGivUpOrdr.optBscModGivUpOrdrRequestT.ordrNo", lordrNo);
	memcpy(voptBscModGivUpOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscModGivUpOrdrRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModGivUpOrdr.optBscModGivUpOrdrRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscModGivUpOrdrRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModGivUpOrdr.optBscModGivUpOrdrRequestT.opnClsCod", lopnClsCod);
	voptBscModGivUpOrdrRequestT.opnClsCod = lopnClsCod[0];
	return voptBscModGivUpOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtModGivUpOrdrRequestT getOptExtModGivUpOrdrRequestT(char* testCaseNum , const char *root) {
	optExtModGivUpOrdrRequestT voptExtModGivUpOrdrRequestT;
	int i;

	voptExtModGivUpOrdrRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "optExtModGivUpOrdrRequestT");	return voptExtModGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModGivUpOrdrRequestT* getFutModGivUpOrdrRequestT(char* testCaseNum) {
	vfutModGivUpOrdrRequestT = (futModGivUpOrdrRequestT*)malloc(sizeof(futModGivUpOrdrRequestT));
	int i;

	vfutModGivUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "futModGivUpOrdrRequestT");
	vfutModGivUpOrdrRequestT->basic = getFutBscModGivUpOrdrRequestT(testCaseNum, "futModGivUpOrdrRequestT");
	vfutModGivUpOrdrRequestT->extension = getFutExtModGivUpOrdrRequestT(testCaseNum, "futModGivUpOrdrRequestT");
	return vfutModGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModGivUpOrdrResponseT* getFutModGivUpOrdrResponseT(char* testCaseNum) {
	vfutModGivUpOrdrResponseT = (futModGivUpOrdrResponseT*)malloc(sizeof(futModGivUpOrdrResponseT));
	int i;

	vfutModGivUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "futModGivUpOrdrResponseT");
	return vfutModGivUpOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optModGivUpOrdrRequestT* getOptModGivUpOrdrRequestT(char* testCaseNum) {
	voptModGivUpOrdrRequestT = (optModGivUpOrdrRequestT*)malloc(sizeof(optModGivUpOrdrRequestT));
	int i;

	voptModGivUpOrdrRequestT->header = getDataHeaderT(testCaseNum, "optModGivUpOrdrRequestT");
	voptModGivUpOrdrRequestT->basic = getOptBscModGivUpOrdrRequestT(testCaseNum, "optModGivUpOrdrRequestT");
	voptModGivUpOrdrRequestT->extension = getOptExtModGivUpOrdrRequestT(testCaseNum, "optModGivUpOrdrRequestT");
	return voptModGivUpOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optModGivUpOrdrResponseT* getOptModGivUpOrdrResponseT(char* testCaseNum) {
	voptModGivUpOrdrResponseT = (optModGivUpOrdrResponseT*)malloc(sizeof(optModGivUpOrdrResponseT));
	int i;

	voptModGivUpOrdrResponseT->header = getDataHeaderT(testCaseNum, "optModGivUpOrdrResponseT");
	return voptModGivUpOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModGivUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModGivUpOrdrRequestT));
	futModGivUpOrdrRequestT *vfutModGivUpOrdrRequestT = getFutModGivUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModGivUpOrdrRequestT), (jbyte*) vfutModGivUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModGivUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModGivUpOrdrResponseT));
	futModGivUpOrdrResponseT *vfutModGivUpOrdrResponseT = getFutModGivUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModGivUpOrdrResponseT), (jbyte*) vfutModGivUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptModGivUpOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optModGivUpOrdrRequestT));
	optModGivUpOrdrRequestT *voptModGivUpOrdrRequestT = getOptModGivUpOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optModGivUpOrdrRequestT), (jbyte*) voptModGivUpOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptModGivUpOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optModGivUpOrdrResponseT));
	optModGivUpOrdrResponseT *voptModGivUpOrdrResponseT = getOptModGivUpOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optModGivUpOrdrResponseT), (jbyte*) voptModGivUpOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModGivUpOrdrRequestT(futBscModGivUpOrdrRequestT actual, futBscModGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpOrdrRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpOrdrRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpOrdrRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtModGivUpOrdrRequestT(futExtModGivUpOrdrRequestT actual, futExtModGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModGivUpOrdrRequestT(optBscModGivUpOrdrRequestT actual, optBscModGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpOrdrRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpOrdrRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpOrdrRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpOrdrRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtModGivUpOrdrRequestT(optExtModGivUpOrdrRequestT actual, optExtModGivUpOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModGivUpOrdrRequestT(futModGivUpOrdrRequestT actual, futModGivUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModGivUpOrdrRequestT (actual.basic,expected.basic, logMsg);	compareFutExtModGivUpOrdrRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModGivUpOrdrResponseT(futModGivUpOrdrResponseT actual, futModGivUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareOptModGivUpOrdrRequestT(optModGivUpOrdrRequestT actual, optModGivUpOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscModGivUpOrdrRequestT (actual.basic,expected.basic, logMsg);	compareOptExtModGivUpOrdrRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptModGivUpOrdrResponseT(optModGivUpOrdrResponseT actual, optModGivUpOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
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
void compareFutModGivUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModGivUpOrdrRequestT *actualData = (futModGivUpOrdrRequestT *)msgStruct;
	futModGivUpOrdrRequestT* expectedData = getFutModGivUpOrdrRequestT(testCaseNum);
	compareFutModGivUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModGivUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModGivUpOrdrResponseT *actualData = (futModGivUpOrdrResponseT *)msgStruct;
	futModGivUpOrdrResponseT* expectedData = getFutModGivUpOrdrResponseT(testCaseNum);
	compareFutModGivUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptModGivUpOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optModGivUpOrdrRequestT *actualData = (optModGivUpOrdrRequestT *)msgStruct;
	optModGivUpOrdrRequestT* expectedData = getOptModGivUpOrdrRequestT(testCaseNum);
	compareOptModGivUpOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptModGivUpOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optModGivUpOrdrResponseT *actualData = (optModGivUpOrdrResponseT *)msgStruct;
	optModGivUpOrdrResponseT* expectedData = getOptModGivUpOrdrResponseT(testCaseNum);
	compareOptModGivUpOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
