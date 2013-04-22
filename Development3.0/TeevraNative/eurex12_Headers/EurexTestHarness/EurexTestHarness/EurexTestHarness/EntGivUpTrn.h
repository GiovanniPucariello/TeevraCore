#include <EntGivUpTrn.hxx>
#define BUFFER_SIZE 1000

futEntGivUpTrnRequestT *vfutEntGivUpTrnRequestT;
futEntGivUpTrnResponseT *vfutEntGivUpTrnResponseT;
optEntGivUpTrnRequestT *voptEntGivUpTrnRequestT;
optEntGivUpTrnResponseT *voptEntGivUpTrnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntGivUpTrnRequestT getFutBscEntGivUpTrnRequestT(char* testCaseNum , const char *root) {
	futBscEntGivUpTrnRequestT vfutBscEntGivUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscEntGivUpTrnRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("EntGivUpTrn.futBscEntGivUpTrnRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscEntGivUpTrnRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscEntGivUpTrnRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("EntGivUpTrn.futBscEntGivUpTrnRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscEntGivUpTrnRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	vfutBscEntGivUpTrnRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntGivUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntGivUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntGivUpTrn.futBscEntGivUpTrnRequestT.trnDat", ltrnDat);
	memcpy(vfutBscEntGivUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntGivUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntGivUpTrn.futBscEntGivUpTrnRequestT.ordrNo", lordrNo);
	memcpy(vfutBscEntGivUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntGivUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntGivUpTrn.futBscEntGivUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntGivUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscEntGivUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "futBscEntGivUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntGivUpTrn.futBscEntGivUpTrnRequestT.buyCod", lbuyCod);
	vfutBscEntGivUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscEntGivUpTrnRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntGivUpTrn.futBscEntGivUpTrnRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscEntGivUpTrnRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntGivUpTrn.futBscEntGivUpTrnRequestT.opnClsCod", lopnClsCod);
	vfutBscEntGivUpTrnRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntGivUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntGivUpTrn.futBscEntGivUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntGivUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntGivUpTrnRequestT getFutExtEntGivUpTrnRequestT(char* testCaseNum , const char *root) {
	futExtEntGivUpTrnRequestT vfutExtEntGivUpTrnRequestT;
	int i;

	vfutExtEntGivUpTrnRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "futExtEntGivUpTrnRequestT");	return vfutExtEntGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntGivUpTrnResponseT getFutBscEntGivUpTrnResponseT(char* testCaseNum , const char *root) {
	futBscEntGivUpTrnResponseT vfutBscEntGivUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("EntGivUpTrn.futBscEntGivUpTrnResponseT.gutSts", lgutSts);
	vfutBscEntGivUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntGivUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntGivUpTrn.futBscEntGivUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntGivUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntGivUpTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntGivUpTrnRequestT getOptBscEntGivUpTrnRequestT(char* testCaseNum , const char *root) {
	optBscEntGivUpTrnRequestT voptBscEntGivUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscEntGivUpTrnRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("EntGivUpTrn.optBscEntGivUpTrnRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscEntGivUpTrnRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscEntGivUpTrnRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("EntGivUpTrn.optBscEntGivUpTrnRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscEntGivUpTrnRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	voptBscEntGivUpTrnRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntGivUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscEntGivUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntGivUpTrn.optBscEntGivUpTrnRequestT.trnDat", ltrnDat);
	memcpy(voptBscEntGivUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntGivUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntGivUpTrn.optBscEntGivUpTrnRequestT.ordrNo", lordrNo);
	memcpy(voptBscEntGivUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntGivUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntGivUpTrn.optBscEntGivUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntGivUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscEntGivUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "optBscEntGivUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntGivUpTrn.optBscEntGivUpTrnRequestT.buyCod", lbuyCod);
	voptBscEntGivUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscEntGivUpTrnRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntGivUpTrn.optBscEntGivUpTrnRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscEntGivUpTrnRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntGivUpTrn.optBscEntGivUpTrnRequestT.opnClsCod", lopnClsCod);
	voptBscEntGivUpTrnRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscEntGivUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntGivUpTrn.optBscEntGivUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscEntGivUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscEntGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntGivUpTrnRequestT getOptExtEntGivUpTrnRequestT(char* testCaseNum , const char *root) {
	optExtEntGivUpTrnRequestT voptExtEntGivUpTrnRequestT;
	int i;

	voptExtEntGivUpTrnRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "optExtEntGivUpTrnRequestT");	return voptExtEntGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntGivUpTrnResponseT getOptBscEntGivUpTrnResponseT(char* testCaseNum , const char *root) {
	optBscEntGivUpTrnResponseT voptBscEntGivUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("EntGivUpTrn.optBscEntGivUpTrnResponseT.gutSts", lgutSts);
	voptBscEntGivUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscEntGivUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntGivUpTrn.optBscEntGivUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscEntGivUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscEntGivUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntGivUpTrnRequestT* getFutEntGivUpTrnRequestT(char* testCaseNum) {
	vfutEntGivUpTrnRequestT = (futEntGivUpTrnRequestT*)malloc(sizeof(futEntGivUpTrnRequestT));
	int i;

	vfutEntGivUpTrnRequestT->header = getDataHeaderT(testCaseNum, "futEntGivUpTrnRequestT");
	vfutEntGivUpTrnRequestT->basic = getFutBscEntGivUpTrnRequestT(testCaseNum, "futEntGivUpTrnRequestT");
	vfutEntGivUpTrnRequestT->extension = getFutExtEntGivUpTrnRequestT(testCaseNum, "futEntGivUpTrnRequestT");
	return vfutEntGivUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntGivUpTrnResponseT* getFutEntGivUpTrnResponseT(char* testCaseNum) {
	vfutEntGivUpTrnResponseT = (futEntGivUpTrnResponseT*)malloc(sizeof(futEntGivUpTrnResponseT));
	int i;

	vfutEntGivUpTrnResponseT->header = getDataHeaderT(testCaseNum, "futEntGivUpTrnResponseT");
	vfutEntGivUpTrnResponseT->basic = getFutBscEntGivUpTrnResponseT(testCaseNum, "futEntGivUpTrnResponseT");
	return vfutEntGivUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntGivUpTrnRequestT* getOptEntGivUpTrnRequestT(char* testCaseNum) {
	voptEntGivUpTrnRequestT = (optEntGivUpTrnRequestT*)malloc(sizeof(optEntGivUpTrnRequestT));
	int i;

	voptEntGivUpTrnRequestT->header = getDataHeaderT(testCaseNum, "optEntGivUpTrnRequestT");
	voptEntGivUpTrnRequestT->basic = getOptBscEntGivUpTrnRequestT(testCaseNum, "optEntGivUpTrnRequestT");
	voptEntGivUpTrnRequestT->extension = getOptExtEntGivUpTrnRequestT(testCaseNum, "optEntGivUpTrnRequestT");
	return voptEntGivUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntGivUpTrnResponseT* getOptEntGivUpTrnResponseT(char* testCaseNum) {
	voptEntGivUpTrnResponseT = (optEntGivUpTrnResponseT*)malloc(sizeof(optEntGivUpTrnResponseT));
	int i;

	voptEntGivUpTrnResponseT->header = getDataHeaderT(testCaseNum, "optEntGivUpTrnResponseT");
	voptEntGivUpTrnResponseT->basic = getOptBscEntGivUpTrnResponseT(testCaseNum, "optEntGivUpTrnResponseT");
	return voptEntGivUpTrnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntGivUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntGivUpTrnRequestT));
	futEntGivUpTrnRequestT *vfutEntGivUpTrnRequestT = getFutEntGivUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntGivUpTrnRequestT), (jbyte*) vfutEntGivUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntGivUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntGivUpTrnResponseT));
	futEntGivUpTrnResponseT *vfutEntGivUpTrnResponseT = getFutEntGivUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntGivUpTrnResponseT), (jbyte*) vfutEntGivUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntGivUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntGivUpTrnRequestT));
	optEntGivUpTrnRequestT *voptEntGivUpTrnRequestT = getOptEntGivUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntGivUpTrnRequestT), (jbyte*) voptEntGivUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntGivUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntGivUpTrnResponseT));
	optEntGivUpTrnResponseT *voptEntGivUpTrnResponseT = getOptEntGivUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntGivUpTrnResponseT), (jbyte*) voptEntGivUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntGivUpTrnRequestT(futBscEntGivUpTrnRequestT actual, futBscEntGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpTrnRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpTrnRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpTrnRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpTrnRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntGivUpTrnRequestT(futExtEntGivUpTrnRequestT actual, futExtEntGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntGivUpTrnResponseT(futBscEntGivUpTrnResponseT actual, futBscEntGivUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntGivUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntGivUpTrnRequestT(optBscEntGivUpTrnRequestT actual, optBscEntGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpTrnRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpTrnRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpTrnRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpTrnRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntGivUpTrnRequestT(optExtEntGivUpTrnRequestT actual, optExtEntGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntGivUpTrnResponseT(optBscEntGivUpTrnResponseT actual, optBscEntGivUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntGivUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntGivUpTrnRequestT(futEntGivUpTrnRequestT actual, futEntGivUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntGivUpTrnRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntGivUpTrnRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntGivUpTrnResponseT(futEntGivUpTrnResponseT actual, futEntGivUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntGivUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntGivUpTrnRequestT(optEntGivUpTrnRequestT actual, optEntGivUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntGivUpTrnRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntGivUpTrnRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntGivUpTrnResponseT(optEntGivUpTrnResponseT actual, optEntGivUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntGivUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntGivUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntGivUpTrnRequestT *actualData = (futEntGivUpTrnRequestT *)msgStruct;
	futEntGivUpTrnRequestT* expectedData = getFutEntGivUpTrnRequestT(testCaseNum);
	compareFutEntGivUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntGivUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntGivUpTrnResponseT *actualData = (futEntGivUpTrnResponseT *)msgStruct;
	futEntGivUpTrnResponseT* expectedData = getFutEntGivUpTrnResponseT(testCaseNum);
	compareFutEntGivUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntGivUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntGivUpTrnRequestT *actualData = (optEntGivUpTrnRequestT *)msgStruct;
	optEntGivUpTrnRequestT* expectedData = getOptEntGivUpTrnRequestT(testCaseNum);
	compareOptEntGivUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntGivUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntGivUpTrnResponseT *actualData = (optEntGivUpTrnResponseT *)msgStruct;
	optEntGivUpTrnResponseT* expectedData = getOptEntGivUpTrnResponseT(testCaseNum);
	compareOptEntGivUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
