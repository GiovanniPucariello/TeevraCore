#include <ModBlkTrd.hxx>
#define BUFFER_SIZE 1000

futModBlkTrdRequestT *vfutModBlkTrdRequestT;
futModBlkTrdResponseT *vfutModBlkTrdResponseT;
optModBlkTrdRequestT *voptModBlkTrdRequestT;
optModBlkTrdResponseT *voptModBlkTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModBlkTrdRequestT getFutBscModBlkTrdRequestT(char* testCaseNum , const char *root) {
	futBscModBlkTrdRequestT vfutBscModBlkTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModBlkTrd.futBscModBlkTrdRequestT.buyCod", lbuyCod);
	vfutBscModBlkTrdRequestT.buyCod = lbuyCod[0];

	vfutBscModBlkTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscModBlkTrdRequestT");
	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscModBlkTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModBlkTrd.futBscModBlkTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscModBlkTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscModBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscModBlkTrdRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscModBlkTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModBlkTrd.futBscModBlkTrdRequestT.trdXQty", ltrdXQty);
	memcpy(vfutBscModBlkTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscModBlkTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModBlkTrd.futBscModBlkTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscModBlkTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscModBlkTrdRequestT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("ModBlkTrd.futBscModBlkTrdRequestT.currTypCod", lcurrTypCod);
	memcpy(vfutBscModBlkTrdRequestT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModBlkTrd.futBscModBlkTrdRequestT.opnClsCod", lopnClsCod);
	vfutBscModBlkTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscModBlkTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("ModBlkTrd.futBscModBlkTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscModBlkTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModBlkTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModBlkTrd.futBscModBlkTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModBlkTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtModBlkTrdRequestT getFutExtModBlkTrdRequestT(char* testCaseNum , const char *root) {
	futExtModBlkTrdRequestT vfutExtModBlkTrdRequestT;
	int i;

	vfutExtModBlkTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtModBlkTrdRequestT");
	vfutExtModBlkTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtModBlkTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutExtModBlkTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModBlkTrd.futExtModBlkTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutExtModBlkTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutExtModBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModBlkTrdResponseT getFutBscModBlkTrdResponseT(char* testCaseNum , const char *root) {
	futBscModBlkTrdResponseT vfutBscModBlkTrdResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModBlkTrd.futBscModBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModBlkTrdRequestT getOptBscModBlkTrdRequestT(char* testCaseNum , const char *root) {
	optBscModBlkTrdRequestT voptBscModBlkTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModBlkTrd.optBscModBlkTrdRequestT.buyCod", lbuyCod);
	voptBscModBlkTrdRequestT.buyCod = lbuyCod[0];

	voptBscModBlkTrdRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscModBlkTrdRequestT");
	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscModBlkTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModBlkTrd.optBscModBlkTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscModBlkTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscModBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscModBlkTrdRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscModBlkTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModBlkTrd.optBscModBlkTrdRequestT.trdXQty", ltrdXQty);
	memcpy(voptBscModBlkTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscModBlkTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModBlkTrd.optBscModBlkTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscModBlkTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		voptBscModBlkTrdRequestT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("ModBlkTrd.optBscModBlkTrdRequestT.currTypCod", lcurrTypCod);
	memcpy(voptBscModBlkTrdRequestT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModBlkTrd.optBscModBlkTrdRequestT.opnClsCod", lopnClsCod);
	voptBscModBlkTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		voptBscModBlkTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("ModBlkTrd.optBscModBlkTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(voptBscModBlkTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscModBlkTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModBlkTrd.optBscModBlkTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscModBlkTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscModBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtModBlkTrdRequestT getOptExtModBlkTrdRequestT(char* testCaseNum , const char *root) {
	optExtModBlkTrdRequestT voptExtModBlkTrdRequestT;
	int i;

	voptExtModBlkTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtModBlkTrdRequestT");
	voptExtModBlkTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "optExtModBlkTrdRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptExtModBlkTrdRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModBlkTrd.optExtModBlkTrdRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptExtModBlkTrdRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return voptExtModBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModBlkTrdResponseT getOptBscModBlkTrdResponseT(char* testCaseNum , const char *root) {
	optBscModBlkTrdResponseT voptBscModBlkTrdResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscModBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModBlkTrd.optBscModBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscModBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscModBlkTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModBlkTrdRequestT* getFutModBlkTrdRequestT(char* testCaseNum) {
	vfutModBlkTrdRequestT = (futModBlkTrdRequestT*)malloc(sizeof(futModBlkTrdRequestT));
	int i;

	vfutModBlkTrdRequestT->header = getDataHeaderT(testCaseNum, "futModBlkTrdRequestT");
	vfutModBlkTrdRequestT->basic = getFutBscModBlkTrdRequestT(testCaseNum, "futModBlkTrdRequestT");
	vfutModBlkTrdRequestT->extension = getFutExtModBlkTrdRequestT(testCaseNum, "futModBlkTrdRequestT");
	return vfutModBlkTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModBlkTrdResponseT* getFutModBlkTrdResponseT(char* testCaseNum) {
	vfutModBlkTrdResponseT = (futModBlkTrdResponseT*)malloc(sizeof(futModBlkTrdResponseT));
	int i;

	vfutModBlkTrdResponseT->header = getDataHeaderT(testCaseNum, "futModBlkTrdResponseT");
	vfutModBlkTrdResponseT->basic = getFutBscModBlkTrdResponseT(testCaseNum, "futModBlkTrdResponseT");
	return vfutModBlkTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optModBlkTrdRequestT* getOptModBlkTrdRequestT(char* testCaseNum) {
	voptModBlkTrdRequestT = (optModBlkTrdRequestT*)malloc(sizeof(optModBlkTrdRequestT));
	int i;

	voptModBlkTrdRequestT->header = getDataHeaderT(testCaseNum, "optModBlkTrdRequestT");
	voptModBlkTrdRequestT->basic = getOptBscModBlkTrdRequestT(testCaseNum, "optModBlkTrdRequestT");
	voptModBlkTrdRequestT->extension = getOptExtModBlkTrdRequestT(testCaseNum, "optModBlkTrdRequestT");
	return voptModBlkTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optModBlkTrdResponseT* getOptModBlkTrdResponseT(char* testCaseNum) {
	voptModBlkTrdResponseT = (optModBlkTrdResponseT*)malloc(sizeof(optModBlkTrdResponseT));
	int i;

	voptModBlkTrdResponseT->header = getDataHeaderT(testCaseNum, "optModBlkTrdResponseT");
	voptModBlkTrdResponseT->basic = getOptBscModBlkTrdResponseT(testCaseNum, "optModBlkTrdResponseT");
	return voptModBlkTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModBlkTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModBlkTrdRequestT));
	futModBlkTrdRequestT *vfutModBlkTrdRequestT = getFutModBlkTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModBlkTrdRequestT), (jbyte*) vfutModBlkTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModBlkTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModBlkTrdResponseT));
	futModBlkTrdResponseT *vfutModBlkTrdResponseT = getFutModBlkTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModBlkTrdResponseT), (jbyte*) vfutModBlkTrdResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptModBlkTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optModBlkTrdRequestT));
	optModBlkTrdRequestT *voptModBlkTrdRequestT = getOptModBlkTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optModBlkTrdRequestT), (jbyte*) voptModBlkTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptModBlkTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optModBlkTrdResponseT));
	optModBlkTrdResponseT *voptModBlkTrdResponseT = getOptModBlkTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optModBlkTrdResponseT), (jbyte*) voptModBlkTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModBlkTrdRequestT(futBscModBlkTrdRequestT actual, futBscModBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkTrdRequestT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtModBlkTrdRequestT(futExtModBlkTrdRequestT actual, futExtModBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModBlkTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModBlkTrdResponseT(futBscModBlkTrdResponseT actual, futBscModBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModBlkTrdRequestT(optBscModBlkTrdRequestT actual, optBscModBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkTrdRequestT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtModBlkTrdRequestT(optExtModBlkTrdRequestT actual, optExtModBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtModBlkTrdRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModBlkTrdResponseT(optBscModBlkTrdResponseT actual, optBscModBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModBlkTrdRequestT(futModBlkTrdRequestT actual, futModBlkTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModBlkTrdRequestT (actual.basic,expected.basic, logMsg);	compareFutExtModBlkTrdRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModBlkTrdResponseT(futModBlkTrdResponseT actual, futModBlkTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModBlkTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptModBlkTrdRequestT(optModBlkTrdRequestT actual, optModBlkTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscModBlkTrdRequestT (actual.basic,expected.basic, logMsg);	compareOptExtModBlkTrdRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptModBlkTrdResponseT(optModBlkTrdResponseT actual, optModBlkTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscModBlkTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModBlkTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModBlkTrdRequestT *actualData = (futModBlkTrdRequestT *)msgStruct;
	futModBlkTrdRequestT* expectedData = getFutModBlkTrdRequestT(testCaseNum);
	compareFutModBlkTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModBlkTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModBlkTrdResponseT *actualData = (futModBlkTrdResponseT *)msgStruct;
	futModBlkTrdResponseT* expectedData = getFutModBlkTrdResponseT(testCaseNum);
	compareFutModBlkTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptModBlkTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optModBlkTrdRequestT *actualData = (optModBlkTrdRequestT *)msgStruct;
	optModBlkTrdRequestT* expectedData = getOptModBlkTrdRequestT(testCaseNum);
	compareOptModBlkTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptModBlkTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optModBlkTrdResponseT *actualData = (optModBlkTrdResponseT *)msgStruct;
	optModBlkTrdResponseT* expectedData = getOptModBlkTrdResponseT(testCaseNum);
	compareOptModBlkTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
