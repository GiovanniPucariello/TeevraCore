#include <EntPosnAcctTsf.hxx>
#define BUFFER_SIZE 1000

futEntPosnAcctTsfRequestT *vfutEntPosnAcctTsfRequestT;
futEntPosnAcctTsfResponseT *vfutEntPosnAcctTsfResponseT;
optEntPosnAcctTsfRequestT *voptEntPosnAcctTsfRequestT;
optEntPosnAcctTsfResponseT *voptEntPosnAcctTsfResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntPosnAcctTsfRequestT getFutBscEntPosnAcctTsfRequestT(char* testCaseNum , const char *root) {
	futBscEntPosnAcctTsfRequestT vfutBscEntPosnAcctTsfRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscEntPosnAcctTsfRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.futBscEntPosnAcctTsfRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscEntPosnAcctTsfRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscEntPosnAcctTsfRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.futBscEntPosnAcctTsfRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscEntPosnAcctTsfRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutBscEntPosnAcctTsfRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntPosnAcctTsfRequestT");
	vfutBscEntPosnAcctTsfRequestT.acctTypCodFromGrp = getAcctTypCodFromGrpT(testCaseNum, "futBscEntPosnAcctTsfRequestT");
	vfutBscEntPosnAcctTsfRequestT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "futBscEntPosnAcctTsfRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntPosnAcctTsfRequestT.trnLngQty[i]= ' ';
	}
	char ltrnLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.futBscEntPosnAcctTsfRequestT.trnLngQty", ltrnLngQty);
	memcpy(vfutBscEntPosnAcctTsfRequestT.trnLngQty, ltrnLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntPosnAcctTsfRequestT.trnShtQty[i]= ' ';
	}
	char ltrnShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.futBscEntPosnAcctTsfRequestT.trnShtQty", ltrnShtQty);
	memcpy(vfutBscEntPosnAcctTsfRequestT.trnShtQty, ltrnShtQty, DRIV_QUANTITY_LEN);
	return vfutBscEntPosnAcctTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntPosnAcctTsfRequestT getFutExtEntPosnAcctTsfRequestT(char* testCaseNum , const char *root) {
	futExtEntPosnAcctTsfRequestT vfutExtEntPosnAcctTsfRequestT;
	int i;

	vfutExtEntPosnAcctTsfRequestT.txtGrpFrom = getTxtGrpFromT(testCaseNum, "futExtEntPosnAcctTsfRequestT");
	vfutExtEntPosnAcctTsfRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "futExtEntPosnAcctTsfRequestT");	return vfutExtEntPosnAcctTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntPosnAcctTsfResponseT getFutBscEntPosnAcctTsfResponseT(char* testCaseNum , const char *root) {
	futBscEntPosnAcctTsfResponseT vfutBscEntPosnAcctTsfResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntPosnAcctTsfResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.futBscEntPosnAcctTsfResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntPosnAcctTsfResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntPosnAcctTsfResponseT.crtLngQty[i]= ' ';
	}
	char lcrtLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.futBscEntPosnAcctTsfResponseT.crtLngQty", lcrtLngQty);
	memcpy(vfutBscEntPosnAcctTsfResponseT.crtLngQty, lcrtLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntPosnAcctTsfResponseT.crtShtQty[i]= ' ';
	}
	char lcrtShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.futBscEntPosnAcctTsfResponseT.crtShtQty", lcrtShtQty);
	memcpy(vfutBscEntPosnAcctTsfResponseT.crtShtQty, lcrtShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscEntPosnAcctTsfResponseT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.futBscEntPosnAcctTsfResponseT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(vfutBscEntPosnAcctTsfResponseT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);
	return vfutBscEntPosnAcctTsfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntPosnAcctTsfRequestT getOptBscEntPosnAcctTsfRequestT(char* testCaseNum , const char *root) {
	optBscEntPosnAcctTsfRequestT voptBscEntPosnAcctTsfRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscEntPosnAcctTsfRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.optBscEntPosnAcctTsfRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscEntPosnAcctTsfRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscEntPosnAcctTsfRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.optBscEntPosnAcctTsfRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscEntPosnAcctTsfRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscEntPosnAcctTsfRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntPosnAcctTsfRequestT");
	voptBscEntPosnAcctTsfRequestT.acctTypCodFromGrp = getAcctTypCodFromGrpT(testCaseNum, "optBscEntPosnAcctTsfRequestT");
	voptBscEntPosnAcctTsfRequestT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "optBscEntPosnAcctTsfRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntPosnAcctTsfRequestT.trnLngQty[i]= ' ';
	}
	char ltrnLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.optBscEntPosnAcctTsfRequestT.trnLngQty", ltrnLngQty);
	memcpy(voptBscEntPosnAcctTsfRequestT.trnLngQty, ltrnLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntPosnAcctTsfRequestT.trnShtQty[i]= ' ';
	}
	char ltrnShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.optBscEntPosnAcctTsfRequestT.trnShtQty", ltrnShtQty);
	memcpy(voptBscEntPosnAcctTsfRequestT.trnShtQty, ltrnShtQty, DRIV_QUANTITY_LEN);
	return voptBscEntPosnAcctTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntPosnAcctTsfRequestT getOptExtEntPosnAcctTsfRequestT(char* testCaseNum , const char *root) {
	optExtEntPosnAcctTsfRequestT voptExtEntPosnAcctTsfRequestT;
	int i;

	voptExtEntPosnAcctTsfRequestT.txtGrpFrom = getTxtGrpFromT(testCaseNum, "optExtEntPosnAcctTsfRequestT");
	voptExtEntPosnAcctTsfRequestT.txtGrpTo = getTxtGrpToT(testCaseNum, "optExtEntPosnAcctTsfRequestT");	return voptExtEntPosnAcctTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntPosnAcctTsfResponseT getOptBscEntPosnAcctTsfResponseT(char* testCaseNum , const char *root) {
	optBscEntPosnAcctTsfResponseT voptBscEntPosnAcctTsfResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntPosnAcctTsfResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.optBscEntPosnAcctTsfResponseT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntPosnAcctTsfResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntPosnAcctTsfResponseT.crtLngQty[i]= ' ';
	}
	char lcrtLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.optBscEntPosnAcctTsfResponseT.crtLngQty", lcrtLngQty);
	memcpy(voptBscEntPosnAcctTsfResponseT.crtLngQty, lcrtLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntPosnAcctTsfResponseT.crtShtQty[i]= ' ';
	}
	char lcrtShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.optBscEntPosnAcctTsfResponseT.crtShtQty", lcrtShtQty);
	memcpy(voptBscEntPosnAcctTsfResponseT.crtShtQty, lcrtShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscEntPosnAcctTsfResponseT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntPosnAcctTsf.optBscEntPosnAcctTsfResponseT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(voptBscEntPosnAcctTsfResponseT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);
	return voptBscEntPosnAcctTsfResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntPosnAcctTsfRequestT* getFutEntPosnAcctTsfRequestT(char* testCaseNum) {
	vfutEntPosnAcctTsfRequestT = (futEntPosnAcctTsfRequestT*)malloc(sizeof(futEntPosnAcctTsfRequestT));
	int i;

	vfutEntPosnAcctTsfRequestT->header = getDataHeaderT(testCaseNum, "futEntPosnAcctTsfRequestT");
	vfutEntPosnAcctTsfRequestT->basic = getFutBscEntPosnAcctTsfRequestT(testCaseNum, "futEntPosnAcctTsfRequestT");
	vfutEntPosnAcctTsfRequestT->extension = getFutExtEntPosnAcctTsfRequestT(testCaseNum, "futEntPosnAcctTsfRequestT");
	return vfutEntPosnAcctTsfRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntPosnAcctTsfResponseT* getFutEntPosnAcctTsfResponseT(char* testCaseNum) {
	vfutEntPosnAcctTsfResponseT = (futEntPosnAcctTsfResponseT*)malloc(sizeof(futEntPosnAcctTsfResponseT));
	int i;

	vfutEntPosnAcctTsfResponseT->header = getDataHeaderT(testCaseNum, "futEntPosnAcctTsfResponseT");
	vfutEntPosnAcctTsfResponseT->basic = getFutBscEntPosnAcctTsfResponseT(testCaseNum, "futEntPosnAcctTsfResponseT");
	return vfutEntPosnAcctTsfResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntPosnAcctTsfRequestT* getOptEntPosnAcctTsfRequestT(char* testCaseNum) {
	voptEntPosnAcctTsfRequestT = (optEntPosnAcctTsfRequestT*)malloc(sizeof(optEntPosnAcctTsfRequestT));
	int i;

	voptEntPosnAcctTsfRequestT->header = getDataHeaderT(testCaseNum, "optEntPosnAcctTsfRequestT");
	voptEntPosnAcctTsfRequestT->basic = getOptBscEntPosnAcctTsfRequestT(testCaseNum, "optEntPosnAcctTsfRequestT");
	voptEntPosnAcctTsfRequestT->extension = getOptExtEntPosnAcctTsfRequestT(testCaseNum, "optEntPosnAcctTsfRequestT");
	return voptEntPosnAcctTsfRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntPosnAcctTsfResponseT* getOptEntPosnAcctTsfResponseT(char* testCaseNum) {
	voptEntPosnAcctTsfResponseT = (optEntPosnAcctTsfResponseT*)malloc(sizeof(optEntPosnAcctTsfResponseT));
	int i;

	voptEntPosnAcctTsfResponseT->header = getDataHeaderT(testCaseNum, "optEntPosnAcctTsfResponseT");
	voptEntPosnAcctTsfResponseT->basic = getOptBscEntPosnAcctTsfResponseT(testCaseNum, "optEntPosnAcctTsfResponseT");
	return voptEntPosnAcctTsfResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntPosnAcctTsfRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntPosnAcctTsfRequestT));
	futEntPosnAcctTsfRequestT *vfutEntPosnAcctTsfRequestT = getFutEntPosnAcctTsfRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntPosnAcctTsfRequestT), (jbyte*) vfutEntPosnAcctTsfRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntPosnAcctTsfResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntPosnAcctTsfResponseT));
	futEntPosnAcctTsfResponseT *vfutEntPosnAcctTsfResponseT = getFutEntPosnAcctTsfResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntPosnAcctTsfResponseT), (jbyte*) vfutEntPosnAcctTsfResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntPosnAcctTsfRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntPosnAcctTsfRequestT));
	optEntPosnAcctTsfRequestT *voptEntPosnAcctTsfRequestT = getOptEntPosnAcctTsfRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntPosnAcctTsfRequestT), (jbyte*) voptEntPosnAcctTsfRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntPosnAcctTsfResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntPosnAcctTsfResponseT));
	optEntPosnAcctTsfResponseT *voptEntPosnAcctTsfResponseT = getOptEntPosnAcctTsfResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntPosnAcctTsfResponseT), (jbyte*) voptEntPosnAcctTsfResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntPosnAcctTsfRequestT(futBscEntPosnAcctTsfRequestT actual, futBscEntPosnAcctTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnAcctTsfRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnAcctTsfRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareAcctTypCodFromGrpT (actual.acctTypCodFromGrp,expected.acctTypCodFromGrp, logMsg);
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	if ( memcmp(actual.trnLngQty, expected.trnLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnAcctTsfRequestT, trnLngQty not matching. Actual %s but Expected %s", actual.trnLngQty, expected.trnLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnShtQty, expected.trnShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnAcctTsfRequestT, trnShtQty not matching. Actual %s but Expected %s", actual.trnShtQty, expected.trnShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntPosnAcctTsfRequestT(futExtEntPosnAcctTsfRequestT actual, futExtEntPosnAcctTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpFromT (actual.txtGrpFrom,expected.txtGrpFrom, logMsg);
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntPosnAcctTsfResponseT(futBscEntPosnAcctTsfResponseT actual, futBscEntPosnAcctTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnAcctTsfResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtLngQty, expected.crtLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnAcctTsfResponseT, crtLngQty not matching. Actual %s but Expected %s", actual.crtLngQty, expected.crtLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtShtQty, expected.crtShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnAcctTsfResponseT, crtShtQty not matching. Actual %s but Expected %s", actual.crtShtQty, expected.crtShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnAcctTsfResponseT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntPosnAcctTsfRequestT(optBscEntPosnAcctTsfRequestT actual, optBscEntPosnAcctTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnAcctTsfRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnAcctTsfRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareAcctTypCodFromGrpT (actual.acctTypCodFromGrp,expected.acctTypCodFromGrp, logMsg);
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	if ( memcmp(actual.trnLngQty, expected.trnLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnAcctTsfRequestT, trnLngQty not matching. Actual %s but Expected %s", actual.trnLngQty, expected.trnLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnShtQty, expected.trnShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnAcctTsfRequestT, trnShtQty not matching. Actual %s but Expected %s", actual.trnShtQty, expected.trnShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntPosnAcctTsfRequestT(optExtEntPosnAcctTsfRequestT actual, optExtEntPosnAcctTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpFromT (actual.txtGrpFrom,expected.txtGrpFrom, logMsg);
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntPosnAcctTsfResponseT(optBscEntPosnAcctTsfResponseT actual, optBscEntPosnAcctTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnAcctTsfResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtLngQty, expected.crtLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnAcctTsfResponseT, crtLngQty not matching. Actual %s but Expected %s", actual.crtLngQty, expected.crtLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtShtQty, expected.crtShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnAcctTsfResponseT, crtShtQty not matching. Actual %s but Expected %s", actual.crtShtQty, expected.crtShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnAcctTsfResponseT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntPosnAcctTsfRequestT(futEntPosnAcctTsfRequestT actual, futEntPosnAcctTsfRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntPosnAcctTsfRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntPosnAcctTsfRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntPosnAcctTsfResponseT(futEntPosnAcctTsfResponseT actual, futEntPosnAcctTsfResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntPosnAcctTsfResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntPosnAcctTsfRequestT(optEntPosnAcctTsfRequestT actual, optEntPosnAcctTsfRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntPosnAcctTsfRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntPosnAcctTsfRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntPosnAcctTsfResponseT(optEntPosnAcctTsfResponseT actual, optEntPosnAcctTsfResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntPosnAcctTsfResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntPosnAcctTsfRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntPosnAcctTsfRequestT *actualData = (futEntPosnAcctTsfRequestT *)msgStruct;
	futEntPosnAcctTsfRequestT* expectedData = getFutEntPosnAcctTsfRequestT(testCaseNum);
	compareFutEntPosnAcctTsfRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntPosnAcctTsfResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntPosnAcctTsfResponseT *actualData = (futEntPosnAcctTsfResponseT *)msgStruct;
	futEntPosnAcctTsfResponseT* expectedData = getFutEntPosnAcctTsfResponseT(testCaseNum);
	compareFutEntPosnAcctTsfResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntPosnAcctTsfRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntPosnAcctTsfRequestT *actualData = (optEntPosnAcctTsfRequestT *)msgStruct;
	optEntPosnAcctTsfRequestT* expectedData = getOptEntPosnAcctTsfRequestT(testCaseNum);
	compareOptEntPosnAcctTsfRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntPosnAcctTsfResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntPosnAcctTsfResponseT *actualData = (optEntPosnAcctTsfResponseT *)msgStruct;
	optEntPosnAcctTsfResponseT* expectedData = getOptEntPosnAcctTsfResponseT(testCaseNum);
	compareOptEntPosnAcctTsfResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
