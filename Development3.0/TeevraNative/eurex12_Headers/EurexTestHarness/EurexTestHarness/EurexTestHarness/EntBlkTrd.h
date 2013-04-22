#include <EntBlkTrd.hxx>
#define BUFFER_SIZE 1000

futEntBlkTrdRequestT *vfutEntBlkTrdRequestT;
futEntBlkTrdResponseT *vfutEntBlkTrdResponseT;
optEntBlkTrdRequestT *voptEntBlkTrdRequestT;
optEntBlkTrdResponseT *voptEntBlkTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntBlkTrdRequestT getFutBscEntBlkTrdRequestT(char* testCaseNum , const char *root) {
	futBscEntBlkTrdRequestT vfutBscEntBlkTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntBlkTrd.futBscEntBlkTrdRequestT.buyCod", lbuyCod);
	vfutBscEntBlkTrdRequestT.buyCod = lbuyCod[0];

	vfutBscEntBlkTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntBlkTrdRequestT");
	vfutBscEntBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntBlkTrdRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntBlkTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntBlkTrd.futBscEntBlkTrdRequestT.trdXQty", ltrdXQty);
	memcpy(vfutBscEntBlkTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntBlkTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntBlkTrd.futBscEntBlkTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscEntBlkTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntBlkTrd.futBscEntBlkTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscEntBlkTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscEntBlkTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("EntBlkTrd.futBscEntBlkTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscEntBlkTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);
	return vfutBscEntBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntBlkTrdRequestT getFutExtEntBlkTrdRequestT(char* testCaseNum , const char *root) {
	futExtEntBlkTrdRequestT vfutExtEntBlkTrdRequestT;
	int i;

	vfutExtEntBlkTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtEntBlkTrdRequestT");
	vfutExtEntBlkTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtEntBlkTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutExtEntBlkTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntBlkTrd.futExtEntBlkTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutExtEntBlkTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutExtEntBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntBlkTrdResponseT getFutBscEntBlkTrdResponseT(char* testCaseNum , const char *root) {
	futBscEntBlkTrdResponseT vfutBscEntBlkTrdResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntBlkTrdResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntBlkTrd.futBscEntBlkTrdResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntBlkTrdResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscEntBlkTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("EntBlkTrd.futBscEntBlkTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vfutBscEntBlkTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntBlkTrd.futBscEntBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntBlkTrdRequestT getOptBscEntBlkTrdRequestT(char* testCaseNum , const char *root) {
	optBscEntBlkTrdRequestT voptBscEntBlkTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntBlkTrd.optBscEntBlkTrdRequestT.buyCod", lbuyCod);
	voptBscEntBlkTrdRequestT.buyCod = lbuyCod[0];

	voptBscEntBlkTrdRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntBlkTrdRequestT");
	voptBscEntBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscEntBlkTrdRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntBlkTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntBlkTrd.optBscEntBlkTrdRequestT.trdXQty", ltrdXQty);
	memcpy(voptBscEntBlkTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscEntBlkTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntBlkTrd.optBscEntBlkTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscEntBlkTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntBlkTrd.optBscEntBlkTrdRequestT.opnClsCod", lopnClsCod);
	voptBscEntBlkTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		voptBscEntBlkTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("EntBlkTrd.optBscEntBlkTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(voptBscEntBlkTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);
	return voptBscEntBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntBlkTrdRequestT getOptExtEntBlkTrdRequestT(char* testCaseNum , const char *root) {
	optExtEntBlkTrdRequestT voptExtEntBlkTrdRequestT;
	int i;

	voptExtEntBlkTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtEntBlkTrdRequestT");
	voptExtEntBlkTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "optExtEntBlkTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptExtEntBlkTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntBlkTrd.optExtEntBlkTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptExtEntBlkTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return voptExtEntBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntBlkTrdResponseT getOptBscEntBlkTrdResponseT(char* testCaseNum , const char *root) {
	optBscEntBlkTrdResponseT voptBscEntBlkTrdResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntBlkTrdResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntBlkTrd.optBscEntBlkTrdResponseT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntBlkTrdResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		voptBscEntBlkTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("EntBlkTrd.optBscEntBlkTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(voptBscEntBlkTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<UNDR_ID_LEN;i++) {
		voptBscEntBlkTrdResponseT.undrId[i]= ' ';
	}
	char lundrId[UNDR_ID_LEN] = {""};
	getStrProperty("EntBlkTrd.optBscEntBlkTrdResponseT.undrId", lundrId);
	memcpy(voptBscEntBlkTrdResponseT.undrId, lundrId, UNDR_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscEntBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntBlkTrd.optBscEntBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscEntBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscEntBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntBlkTrdResponseT getOptExtEntBlkTrdResponseT(char* testCaseNum , const char *root) {
	optExtEntBlkTrdResponseT voptExtEntBlkTrdResponseT;
	int i;

	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		voptExtEntBlkTrdResponseT.exchIdCod[i]= ' ';
	}
	char lexchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntBlkTrd.optExtEntBlkTrdResponseT.exchIdCod", lexchIdCod);
	memcpy(voptExtEntBlkTrdResponseT.exchIdCod, lexchIdCod, DRIV_EXCH_ID_COD_LEN);
	return voptExtEntBlkTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntBlkTrdRequestT* getFutEntBlkTrdRequestT(char* testCaseNum) {
	vfutEntBlkTrdRequestT = (futEntBlkTrdRequestT*)malloc(sizeof(futEntBlkTrdRequestT));
	int i;

	vfutEntBlkTrdRequestT->header = getDataHeaderT(testCaseNum, "futEntBlkTrdRequestT");
	vfutEntBlkTrdRequestT->basic = getFutBscEntBlkTrdRequestT(testCaseNum, "futEntBlkTrdRequestT");
	vfutEntBlkTrdRequestT->extension = getFutExtEntBlkTrdRequestT(testCaseNum, "futEntBlkTrdRequestT");
	return vfutEntBlkTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntBlkTrdResponseT* getFutEntBlkTrdResponseT(char* testCaseNum) {
	vfutEntBlkTrdResponseT = (futEntBlkTrdResponseT*)malloc(sizeof(futEntBlkTrdResponseT));
	int i;

	vfutEntBlkTrdResponseT->header = getDataHeaderT(testCaseNum, "futEntBlkTrdResponseT");
	vfutEntBlkTrdResponseT->basic = getFutBscEntBlkTrdResponseT(testCaseNum, "futEntBlkTrdResponseT");
	return vfutEntBlkTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntBlkTrdRequestT* getOptEntBlkTrdRequestT(char* testCaseNum) {
	voptEntBlkTrdRequestT = (optEntBlkTrdRequestT*)malloc(sizeof(optEntBlkTrdRequestT));
	int i;

	voptEntBlkTrdRequestT->header = getDataHeaderT(testCaseNum, "optEntBlkTrdRequestT");
	voptEntBlkTrdRequestT->basic = getOptBscEntBlkTrdRequestT(testCaseNum, "optEntBlkTrdRequestT");
	voptEntBlkTrdRequestT->extension = getOptExtEntBlkTrdRequestT(testCaseNum, "optEntBlkTrdRequestT");
	return voptEntBlkTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntBlkTrdResponseT* getOptEntBlkTrdResponseT(char* testCaseNum) {
	voptEntBlkTrdResponseT = (optEntBlkTrdResponseT*)malloc(sizeof(optEntBlkTrdResponseT));
	int i;

	voptEntBlkTrdResponseT->header = getDataHeaderT(testCaseNum, "optEntBlkTrdResponseT");
	voptEntBlkTrdResponseT->basic = getOptBscEntBlkTrdResponseT(testCaseNum, "optEntBlkTrdResponseT");
	voptEntBlkTrdResponseT->extension = getOptExtEntBlkTrdResponseT(testCaseNum, "optEntBlkTrdResponseT");
	return voptEntBlkTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntBlkTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntBlkTrdRequestT));
	futEntBlkTrdRequestT *vfutEntBlkTrdRequestT = getFutEntBlkTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntBlkTrdRequestT), (jbyte*) vfutEntBlkTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntBlkTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntBlkTrdResponseT));
	futEntBlkTrdResponseT *vfutEntBlkTrdResponseT = getFutEntBlkTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntBlkTrdResponseT), (jbyte*) vfutEntBlkTrdResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntBlkTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntBlkTrdRequestT));
	optEntBlkTrdRequestT *voptEntBlkTrdRequestT = getOptEntBlkTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntBlkTrdRequestT), (jbyte*) voptEntBlkTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntBlkTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntBlkTrdResponseT));
	optEntBlkTrdResponseT *voptEntBlkTrdResponseT = getOptEntBlkTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntBlkTrdResponseT), (jbyte*) voptEntBlkTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntBlkTrdRequestT(futBscEntBlkTrdRequestT actual, futBscEntBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntBlkTrdRequestT(futExtEntBlkTrdRequestT actual, futExtEntBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntBlkTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntBlkTrdResponseT(futBscEntBlkTrdResponseT actual, futBscEntBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkTrdResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntBlkTrdRequestT(optBscEntBlkTrdRequestT actual, optBscEntBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntBlkTrdRequestT(optExtEntBlkTrdRequestT actual, optExtEntBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntBlkTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntBlkTrdResponseT(optBscEntBlkTrdResponseT actual, optBscEntBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkTrdResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrId, expected.undrId, UNDR_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkTrdResponseT, undrId not matching. Actual %s but Expected %s", actual.undrId, expected.undrId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntBlkTrdResponseT(optExtEntBlkTrdResponseT actual, optExtEntBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.exchIdCod, expected.exchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntBlkTrdResponseT, exchIdCod not matching. Actual %s but Expected %s", actual.exchIdCod, expected.exchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntBlkTrdRequestT(futEntBlkTrdRequestT actual, futEntBlkTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntBlkTrdRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntBlkTrdRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntBlkTrdResponseT(futEntBlkTrdResponseT actual, futEntBlkTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntBlkTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntBlkTrdRequestT(optEntBlkTrdRequestT actual, optEntBlkTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntBlkTrdRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntBlkTrdRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntBlkTrdResponseT(optEntBlkTrdResponseT actual, optEntBlkTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntBlkTrdResponseT (actual.basic,expected.basic, logMsg);	compareOptExtEntBlkTrdResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntBlkTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntBlkTrdRequestT *actualData = (futEntBlkTrdRequestT *)msgStruct;
	futEntBlkTrdRequestT* expectedData = getFutEntBlkTrdRequestT(testCaseNum);
	compareFutEntBlkTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntBlkTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntBlkTrdResponseT *actualData = (futEntBlkTrdResponseT *)msgStruct;
	futEntBlkTrdResponseT* expectedData = getFutEntBlkTrdResponseT(testCaseNum);
	compareFutEntBlkTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntBlkTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntBlkTrdRequestT *actualData = (optEntBlkTrdRequestT *)msgStruct;
	optEntBlkTrdRequestT* expectedData = getOptEntBlkTrdRequestT(testCaseNum);
	compareOptEntBlkTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntBlkTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntBlkTrdResponseT *actualData = (optEntBlkTrdResponseT *)msgStruct;
	optEntBlkTrdResponseT* expectedData = getOptEntBlkTrdResponseT(testCaseNum);
	compareOptEntBlkTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
