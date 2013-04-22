#include <ModGivUpTrn.hxx>
#define BUFFER_SIZE 1000

futModGivUpTrnRequestT *vfutModGivUpTrnRequestT;
futModGivUpTrnResponseT *vfutModGivUpTrnResponseT;
optModGivUpTrnRequestT *voptModGivUpTrnRequestT;
optModGivUpTrnResponseT *voptModGivUpTrnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModGivUpTrnRequestT getFutBscModGivUpTrnRequestT(char* testCaseNum , const char *root) {
	futBscModGivUpTrnRequestT vfutBscModGivUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscModGivUpTrnRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("ModGivUpTrn.futBscModGivUpTrnRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscModGivUpTrnRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscModGivUpTrnRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("ModGivUpTrn.futBscModGivUpTrnRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscModGivUpTrnRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	vfutBscModGivUpTrnRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscModGivUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscModGivUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModGivUpTrn.futBscModGivUpTrnRequestT.trnDat", ltrnDat);
	memcpy(vfutBscModGivUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscModGivUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModGivUpTrn.futBscModGivUpTrnRequestT.ordrNo", lordrNo);
	memcpy(vfutBscModGivUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscModGivUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModGivUpTrn.futBscModGivUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscModGivUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscModGivUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "futBscModGivUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("ModGivUpTrn.futBscModGivUpTrnRequestT.buyCod", lbuyCod);
	vfutBscModGivUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscModGivUpTrnRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModGivUpTrn.futBscModGivUpTrnRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscModGivUpTrnRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModGivUpTrn.futBscModGivUpTrnRequestT.opnClsCod", lopnClsCod);
	vfutBscModGivUpTrnRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModGivUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModGivUpTrn.futBscModGivUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModGivUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtModGivUpTrnRequestT getFutExtModGivUpTrnRequestT(char* testCaseNum , const char *root) {
	futExtModGivUpTrnRequestT vfutExtModGivUpTrnRequestT;
	int i;

	vfutExtModGivUpTrnRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "futExtModGivUpTrnRequestT");	return vfutExtModGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModGivUpTrnResponseT getFutBscModGivUpTrnResponseT(char* testCaseNum , const char *root) {
	futBscModGivUpTrnResponseT vfutBscModGivUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("ModGivUpTrn.futBscModGivUpTrnResponseT.gutSts", lgutSts);
	vfutBscModGivUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModGivUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModGivUpTrn.futBscModGivUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModGivUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModGivUpTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModGivUpTrnRequestT getOptBscModGivUpTrnRequestT(char* testCaseNum , const char *root) {
	optBscModGivUpTrnRequestT voptBscModGivUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscModGivUpTrnRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("ModGivUpTrn.optBscModGivUpTrnRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscModGivUpTrnRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscModGivUpTrnRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("ModGivUpTrn.optBscModGivUpTrnRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscModGivUpTrnRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	voptBscModGivUpTrnRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscModGivUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscModGivUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModGivUpTrn.optBscModGivUpTrnRequestT.trnDat", ltrnDat);
	memcpy(voptBscModGivUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscModGivUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModGivUpTrn.optBscModGivUpTrnRequestT.ordrNo", lordrNo);
	memcpy(voptBscModGivUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscModGivUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModGivUpTrn.optBscModGivUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscModGivUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscModGivUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "optBscModGivUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("ModGivUpTrn.optBscModGivUpTrnRequestT.buyCod", lbuyCod);
	voptBscModGivUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscModGivUpTrnRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModGivUpTrn.optBscModGivUpTrnRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscModGivUpTrnRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModGivUpTrn.optBscModGivUpTrnRequestT.opnClsCod", lopnClsCod);
	voptBscModGivUpTrnRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscModGivUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModGivUpTrn.optBscModGivUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscModGivUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscModGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtModGivUpTrnRequestT getOptExtModGivUpTrnRequestT(char* testCaseNum , const char *root) {
	optExtModGivUpTrnRequestT voptExtModGivUpTrnRequestT;
	int i;

	voptExtModGivUpTrnRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "optExtModGivUpTrnRequestT");	return voptExtModGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModGivUpTrnResponseT getOptBscModGivUpTrnResponseT(char* testCaseNum , const char *root) {
	optBscModGivUpTrnResponseT voptBscModGivUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("ModGivUpTrn.optBscModGivUpTrnResponseT.gutSts", lgutSts);
	voptBscModGivUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscModGivUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModGivUpTrn.optBscModGivUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscModGivUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscModGivUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModGivUpTrnRequestT* getFutModGivUpTrnRequestT(char* testCaseNum) {
	vfutModGivUpTrnRequestT = (futModGivUpTrnRequestT*)malloc(sizeof(futModGivUpTrnRequestT));
	int i;

	vfutModGivUpTrnRequestT->header = getDataHeaderT(testCaseNum, "futModGivUpTrnRequestT");
	vfutModGivUpTrnRequestT->basic = getFutBscModGivUpTrnRequestT(testCaseNum, "futModGivUpTrnRequestT");
	vfutModGivUpTrnRequestT->extension = getFutExtModGivUpTrnRequestT(testCaseNum, "futModGivUpTrnRequestT");
	return vfutModGivUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModGivUpTrnResponseT* getFutModGivUpTrnResponseT(char* testCaseNum) {
	vfutModGivUpTrnResponseT = (futModGivUpTrnResponseT*)malloc(sizeof(futModGivUpTrnResponseT));
	int i;

	vfutModGivUpTrnResponseT->header = getDataHeaderT(testCaseNum, "futModGivUpTrnResponseT");
	vfutModGivUpTrnResponseT->basic = getFutBscModGivUpTrnResponseT(testCaseNum, "futModGivUpTrnResponseT");
	return vfutModGivUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optModGivUpTrnRequestT* getOptModGivUpTrnRequestT(char* testCaseNum) {
	voptModGivUpTrnRequestT = (optModGivUpTrnRequestT*)malloc(sizeof(optModGivUpTrnRequestT));
	int i;

	voptModGivUpTrnRequestT->header = getDataHeaderT(testCaseNum, "optModGivUpTrnRequestT");
	voptModGivUpTrnRequestT->basic = getOptBscModGivUpTrnRequestT(testCaseNum, "optModGivUpTrnRequestT");
	voptModGivUpTrnRequestT->extension = getOptExtModGivUpTrnRequestT(testCaseNum, "optModGivUpTrnRequestT");
	return voptModGivUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optModGivUpTrnResponseT* getOptModGivUpTrnResponseT(char* testCaseNum) {
	voptModGivUpTrnResponseT = (optModGivUpTrnResponseT*)malloc(sizeof(optModGivUpTrnResponseT));
	int i;

	voptModGivUpTrnResponseT->header = getDataHeaderT(testCaseNum, "optModGivUpTrnResponseT");
	voptModGivUpTrnResponseT->basic = getOptBscModGivUpTrnResponseT(testCaseNum, "optModGivUpTrnResponseT");
	return voptModGivUpTrnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModGivUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModGivUpTrnRequestT));
	futModGivUpTrnRequestT *vfutModGivUpTrnRequestT = getFutModGivUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModGivUpTrnRequestT), (jbyte*) vfutModGivUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModGivUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModGivUpTrnResponseT));
	futModGivUpTrnResponseT *vfutModGivUpTrnResponseT = getFutModGivUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModGivUpTrnResponseT), (jbyte*) vfutModGivUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptModGivUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optModGivUpTrnRequestT));
	optModGivUpTrnRequestT *voptModGivUpTrnRequestT = getOptModGivUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optModGivUpTrnRequestT), (jbyte*) voptModGivUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptModGivUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optModGivUpTrnResponseT));
	optModGivUpTrnResponseT *voptModGivUpTrnResponseT = getOptModGivUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optModGivUpTrnResponseT), (jbyte*) voptModGivUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModGivUpTrnRequestT(futBscModGivUpTrnRequestT actual, futBscModGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpTrnRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpTrnRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpTrnRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpTrnRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtModGivUpTrnRequestT(futExtModGivUpTrnRequestT actual, futExtModGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModGivUpTrnResponseT(futBscModGivUpTrnResponseT actual, futBscModGivUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModGivUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModGivUpTrnRequestT(optBscModGivUpTrnRequestT actual, optBscModGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpTrnRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpTrnRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpTrnRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpTrnRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtModGivUpTrnRequestT(optExtModGivUpTrnRequestT actual, optExtModGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModGivUpTrnResponseT(optBscModGivUpTrnResponseT actual, optBscModGivUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModGivUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModGivUpTrnRequestT(futModGivUpTrnRequestT actual, futModGivUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModGivUpTrnRequestT (actual.basic,expected.basic, logMsg);	compareFutExtModGivUpTrnRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModGivUpTrnResponseT(futModGivUpTrnResponseT actual, futModGivUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModGivUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptModGivUpTrnRequestT(optModGivUpTrnRequestT actual, optModGivUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscModGivUpTrnRequestT (actual.basic,expected.basic, logMsg);	compareOptExtModGivUpTrnRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptModGivUpTrnResponseT(optModGivUpTrnResponseT actual, optModGivUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscModGivUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModGivUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModGivUpTrnRequestT *actualData = (futModGivUpTrnRequestT *)msgStruct;
	futModGivUpTrnRequestT* expectedData = getFutModGivUpTrnRequestT(testCaseNum);
	compareFutModGivUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModGivUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModGivUpTrnResponseT *actualData = (futModGivUpTrnResponseT *)msgStruct;
	futModGivUpTrnResponseT* expectedData = getFutModGivUpTrnResponseT(testCaseNum);
	compareFutModGivUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptModGivUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optModGivUpTrnRequestT *actualData = (optModGivUpTrnRequestT *)msgStruct;
	optModGivUpTrnRequestT* expectedData = getOptModGivUpTrnRequestT(testCaseNum);
	compareOptModGivUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptModGivUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optModGivUpTrnResponseT *actualData = (optModGivUpTrnResponseT *)msgStruct;
	optModGivUpTrnResponseT* expectedData = getOptModGivUpTrnResponseT(testCaseNum);
	compareOptModGivUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
