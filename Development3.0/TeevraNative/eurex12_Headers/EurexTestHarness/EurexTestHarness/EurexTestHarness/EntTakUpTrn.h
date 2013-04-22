#include <EntTakUpTrn.hxx>
#define BUFFER_SIZE 1000

futEntTakUpTrnRequestT *vfutEntTakUpTrnRequestT;
futEntTakUpTrnResponseT *vfutEntTakUpTrnResponseT;
optEntTakUpTrnRequestT *voptEntTakUpTrnRequestT;
optEntTakUpTrnResponseT *voptEntTakUpTrnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTakUpTrnRequestT getFutBscEntTakUpTrnRequestT(char* testCaseNum , const char *root) {
	futBscEntTakUpTrnRequestT vfutBscEntTakUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		vfutBscEntTakUpTrnRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("EntTakUpTrn.futBscEntTakUpTrnRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(vfutBscEntTakUpTrnRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscEntTakUpTrnRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntTakUpTrn.futBscEntTakUpTrnRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscEntTakUpTrnRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	vfutBscEntTakUpTrnRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntTakUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntTakUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntTakUpTrn.futBscEntTakUpTrnRequestT.trnDat", ltrnDat);
	memcpy(vfutBscEntTakUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntTakUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntTakUpTrn.futBscEntTakUpTrnRequestT.ordrNo", lordrNo);
	memcpy(vfutBscEntTakUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntTakUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTakUpTrn.futBscEntTakUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntTakUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscEntTakUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "futBscEntTakUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntTakUpTrn.futBscEntTakUpTrnRequestT.buyCod", lbuyCod);
	vfutBscEntTakUpTrnRequestT.buyCod = lbuyCod[0];

	vfutBscEntTakUpTrnRequestT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "futBscEntTakUpTrnRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("EntTakUpTrn.futBscEntTakUpTrnRequestT.opnClsCod", lopnClsCod);
	vfutBscEntTakUpTrnRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntTakUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTakUpTrn.futBscEntTakUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntTakUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntTakUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntTakUpTrnRequestT getFutExtEntTakUpTrnRequestT(char* testCaseNum , const char *root) {
	futExtEntTakUpTrnRequestT vfutExtEntTakUpTrnRequestT;
	int i;

	vfutExtEntTakUpTrnRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "futExtEntTakUpTrnRequestT");	return vfutExtEntTakUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTakUpTrnResponseT getFutBscEntTakUpTrnResponseT(char* testCaseNum , const char *root) {
	futBscEntTakUpTrnResponseT vfutBscEntTakUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("EntTakUpTrn.futBscEntTakUpTrnResponseT.gutSts", lgutSts);
	vfutBscEntTakUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntTakUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTakUpTrn.futBscEntTakUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntTakUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntTakUpTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTakUpTrnRequestT getOptBscEntTakUpTrnRequestT(char* testCaseNum , const char *root) {
	optBscEntTakUpTrnRequestT voptBscEntTakUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		voptBscEntTakUpTrnRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("EntTakUpTrn.optBscEntTakUpTrnRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(voptBscEntTakUpTrnRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscEntTakUpTrnRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntTakUpTrn.optBscEntTakUpTrnRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscEntTakUpTrnRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	voptBscEntTakUpTrnRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntTakUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscEntTakUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntTakUpTrn.optBscEntTakUpTrnRequestT.trnDat", ltrnDat);
	memcpy(voptBscEntTakUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntTakUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntTakUpTrn.optBscEntTakUpTrnRequestT.ordrNo", lordrNo);
	memcpy(voptBscEntTakUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntTakUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTakUpTrn.optBscEntTakUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntTakUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscEntTakUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "optBscEntTakUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntTakUpTrn.optBscEntTakUpTrnRequestT.buyCod", lbuyCod);
	voptBscEntTakUpTrnRequestT.buyCod = lbuyCod[0];

	voptBscEntTakUpTrnRequestT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "optBscEntTakUpTrnRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("EntTakUpTrn.optBscEntTakUpTrnRequestT.opnClsCod", lopnClsCod);
	voptBscEntTakUpTrnRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscEntTakUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTakUpTrn.optBscEntTakUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscEntTakUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscEntTakUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntTakUpTrnRequestT getOptExtEntTakUpTrnRequestT(char* testCaseNum , const char *root) {
	optExtEntTakUpTrnRequestT voptExtEntTakUpTrnRequestT;
	int i;

	voptExtEntTakUpTrnRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "optExtEntTakUpTrnRequestT");	return voptExtEntTakUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTakUpTrnResponseT getOptBscEntTakUpTrnResponseT(char* testCaseNum , const char *root) {
	optBscEntTakUpTrnResponseT voptBscEntTakUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("EntTakUpTrn.optBscEntTakUpTrnResponseT.gutSts", lgutSts);
	voptBscEntTakUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscEntTakUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTakUpTrn.optBscEntTakUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscEntTakUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscEntTakUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntTakUpTrnRequestT* getFutEntTakUpTrnRequestT(char* testCaseNum) {
	vfutEntTakUpTrnRequestT = (futEntTakUpTrnRequestT*)malloc(sizeof(futEntTakUpTrnRequestT));
	int i;

	vfutEntTakUpTrnRequestT->header = getDataHeaderT(testCaseNum, "futEntTakUpTrnRequestT");
	vfutEntTakUpTrnRequestT->basic = getFutBscEntTakUpTrnRequestT(testCaseNum, "futEntTakUpTrnRequestT");
	vfutEntTakUpTrnRequestT->extension = getFutExtEntTakUpTrnRequestT(testCaseNum, "futEntTakUpTrnRequestT");
	return vfutEntTakUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntTakUpTrnResponseT* getFutEntTakUpTrnResponseT(char* testCaseNum) {
	vfutEntTakUpTrnResponseT = (futEntTakUpTrnResponseT*)malloc(sizeof(futEntTakUpTrnResponseT));
	int i;

	vfutEntTakUpTrnResponseT->header = getDataHeaderT(testCaseNum, "futEntTakUpTrnResponseT");
	vfutEntTakUpTrnResponseT->basic = getFutBscEntTakUpTrnResponseT(testCaseNum, "futEntTakUpTrnResponseT");
	return vfutEntTakUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntTakUpTrnRequestT* getOptEntTakUpTrnRequestT(char* testCaseNum) {
	voptEntTakUpTrnRequestT = (optEntTakUpTrnRequestT*)malloc(sizeof(optEntTakUpTrnRequestT));
	int i;

	voptEntTakUpTrnRequestT->header = getDataHeaderT(testCaseNum, "optEntTakUpTrnRequestT");
	voptEntTakUpTrnRequestT->basic = getOptBscEntTakUpTrnRequestT(testCaseNum, "optEntTakUpTrnRequestT");
	voptEntTakUpTrnRequestT->extension = getOptExtEntTakUpTrnRequestT(testCaseNum, "optEntTakUpTrnRequestT");
	return voptEntTakUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntTakUpTrnResponseT* getOptEntTakUpTrnResponseT(char* testCaseNum) {
	voptEntTakUpTrnResponseT = (optEntTakUpTrnResponseT*)malloc(sizeof(optEntTakUpTrnResponseT));
	int i;

	voptEntTakUpTrnResponseT->header = getDataHeaderT(testCaseNum, "optEntTakUpTrnResponseT");
	voptEntTakUpTrnResponseT->basic = getOptBscEntTakUpTrnResponseT(testCaseNum, "optEntTakUpTrnResponseT");
	return voptEntTakUpTrnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntTakUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntTakUpTrnRequestT));
	futEntTakUpTrnRequestT *vfutEntTakUpTrnRequestT = getFutEntTakUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntTakUpTrnRequestT), (jbyte*) vfutEntTakUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntTakUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntTakUpTrnResponseT));
	futEntTakUpTrnResponseT *vfutEntTakUpTrnResponseT = getFutEntTakUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntTakUpTrnResponseT), (jbyte*) vfutEntTakUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntTakUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntTakUpTrnRequestT));
	optEntTakUpTrnRequestT *voptEntTakUpTrnRequestT = getOptEntTakUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntTakUpTrnRequestT), (jbyte*) voptEntTakUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntTakUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntTakUpTrnResponseT));
	optEntTakUpTrnResponseT *voptEntTakUpTrnResponseT = getOptEntTakUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntTakUpTrnResponseT), (jbyte*) voptEntTakUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTakUpTrnRequestT(futBscEntTakUpTrnRequestT actual, futBscEntTakUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpTrnRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpTrnRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpTrnRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntTakUpTrnRequestT(futExtEntTakUpTrnRequestT actual, futExtEntTakUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTakUpTrnResponseT(futBscEntTakUpTrnResponseT actual, futBscEntTakUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTakUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTakUpTrnRequestT(optBscEntTakUpTrnRequestT actual, optBscEntTakUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpTrnRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpTrnRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpTrnRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntTakUpTrnRequestT(optExtEntTakUpTrnRequestT actual, optExtEntTakUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTakUpTrnResponseT(optBscEntTakUpTrnResponseT actual, optBscEntTakUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTakUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntTakUpTrnRequestT(futEntTakUpTrnRequestT actual, futEntTakUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntTakUpTrnRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntTakUpTrnRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntTakUpTrnResponseT(futEntTakUpTrnResponseT actual, futEntTakUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntTakUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntTakUpTrnRequestT(optEntTakUpTrnRequestT actual, optEntTakUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntTakUpTrnRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntTakUpTrnRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntTakUpTrnResponseT(optEntTakUpTrnResponseT actual, optEntTakUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntTakUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntTakUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntTakUpTrnRequestT *actualData = (futEntTakUpTrnRequestT *)msgStruct;
	futEntTakUpTrnRequestT* expectedData = getFutEntTakUpTrnRequestT(testCaseNum);
	compareFutEntTakUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntTakUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntTakUpTrnResponseT *actualData = (futEntTakUpTrnResponseT *)msgStruct;
	futEntTakUpTrnResponseT* expectedData = getFutEntTakUpTrnResponseT(testCaseNum);
	compareFutEntTakUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntTakUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntTakUpTrnRequestT *actualData = (optEntTakUpTrnRequestT *)msgStruct;
	optEntTakUpTrnRequestT* expectedData = getOptEntTakUpTrnRequestT(testCaseNum);
	compareOptEntTakUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntTakUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntTakUpTrnResponseT *actualData = (optEntTakUpTrnResponseT *)msgStruct;
	optEntTakUpTrnResponseT* expectedData = getOptEntTakUpTrnResponseT(testCaseNum);
	compareOptEntTakUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
