#include <EntPosnClsAdj.hxx>
#define BUFFER_SIZE 1000

futEntPosnClsAdjRequestT *vfutEntPosnClsAdjRequestT;
futEntPosnClsAdjResponseT *vfutEntPosnClsAdjResponseT;
optEntPosnClsAdjRequestT *voptEntPosnClsAdjRequestT;
optEntPosnClsAdjResponseT *voptEntPosnClsAdjResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntPosnClsAdjRequestT getFutBscEntPosnClsAdjRequestT(char* testCaseNum , const char *root) {
	futBscEntPosnClsAdjRequestT vfutBscEntPosnClsAdjRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscEntPosnClsAdjRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntPosnClsAdj.futBscEntPosnClsAdjRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscEntPosnClsAdjRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscEntPosnClsAdjRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntPosnClsAdj.futBscEntPosnClsAdjRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscEntPosnClsAdjRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutBscEntPosnClsAdjRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscEntPosnClsAdjRequestT");
	vfutBscEntPosnClsAdjRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntPosnClsAdjRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntPosnClsAdjRequestT.trnLngQty[i]= ' ';
	}
	char ltrnLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnClsAdj.futBscEntPosnClsAdjRequestT.trnLngQty", ltrnLngQty);
	memcpy(vfutBscEntPosnClsAdjRequestT.trnLngQty, ltrnLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntPosnClsAdjRequestT.trnShtQty[i]= ' ';
	}
	char ltrnShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnClsAdj.futBscEntPosnClsAdjRequestT.trnShtQty", ltrnShtQty);
	memcpy(vfutBscEntPosnClsAdjRequestT.trnShtQty, ltrnShtQty, DRIV_QUANTITY_LEN);
	return vfutBscEntPosnClsAdjRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntPosnClsAdjRequestT getFutExtEntPosnClsAdjRequestT(char* testCaseNum , const char *root) {
	futExtEntPosnClsAdjRequestT vfutExtEntPosnClsAdjRequestT;
	int i;

	vfutExtEntPosnClsAdjRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtEntPosnClsAdjRequestT");	return vfutExtEntPosnClsAdjRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntPosnClsAdjResponseT getFutBscEntPosnClsAdjResponseT(char* testCaseNum , const char *root) {
	futBscEntPosnClsAdjResponseT vfutBscEntPosnClsAdjResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntPosnClsAdjResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntPosnClsAdj.futBscEntPosnClsAdjResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntPosnClsAdjResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntPosnClsAdjResponseT.crtLngQty[i]= ' ';
	}
	char lcrtLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnClsAdj.futBscEntPosnClsAdjResponseT.crtLngQty", lcrtLngQty);
	memcpy(vfutBscEntPosnClsAdjResponseT.crtLngQty, lcrtLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntPosnClsAdjResponseT.crtShtQty[i]= ' ';
	}
	char lcrtShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnClsAdj.futBscEntPosnClsAdjResponseT.crtShtQty", lcrtShtQty);
	memcpy(vfutBscEntPosnClsAdjResponseT.crtShtQty, lcrtShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscEntPosnClsAdjResponseT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntPosnClsAdj.futBscEntPosnClsAdjResponseT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(vfutBscEntPosnClsAdjResponseT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);
	return vfutBscEntPosnClsAdjResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntPosnClsAdjResponseT getFutExtEntPosnClsAdjResponseT(char* testCaseNum , const char *root) {
	futExtEntPosnClsAdjResponseT vfutExtEntPosnClsAdjResponseT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtEntPosnClsAdjResponseT.crtZerCostQty[i]= ' ';
	}
	char lcrtZerCostQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnClsAdj.futExtEntPosnClsAdjResponseT.crtZerCostQty", lcrtZerCostQty);
	memcpy(vfutExtEntPosnClsAdjResponseT.crtZerCostQty, lcrtZerCostQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtEntPosnClsAdjResponseT.prvZerCostQty[i]= ' ';
	}
	char lprvZerCostQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnClsAdj.futExtEntPosnClsAdjResponseT.prvZerCostQty", lprvZerCostQty);
	memcpy(vfutExtEntPosnClsAdjResponseT.prvZerCostQty, lprvZerCostQty, DRIV_QUANTITY_LEN);
	return vfutExtEntPosnClsAdjResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntPosnClsAdjRequestT getOptBscEntPosnClsAdjRequestT(char* testCaseNum , const char *root) {
	optBscEntPosnClsAdjRequestT voptBscEntPosnClsAdjRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscEntPosnClsAdjRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntPosnClsAdj.optBscEntPosnClsAdjRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscEntPosnClsAdjRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscEntPosnClsAdjRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntPosnClsAdj.optBscEntPosnClsAdjRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscEntPosnClsAdjRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscEntPosnClsAdjRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscEntPosnClsAdjRequestT");
	voptBscEntPosnClsAdjRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntPosnClsAdjRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntPosnClsAdjRequestT.trnLngQty[i]= ' ';
	}
	char ltrnLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnClsAdj.optBscEntPosnClsAdjRequestT.trnLngQty", ltrnLngQty);
	memcpy(voptBscEntPosnClsAdjRequestT.trnLngQty, ltrnLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntPosnClsAdjRequestT.trnShtQty[i]= ' ';
	}
	char ltrnShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnClsAdj.optBscEntPosnClsAdjRequestT.trnShtQty", ltrnShtQty);
	memcpy(voptBscEntPosnClsAdjRequestT.trnShtQty, ltrnShtQty, DRIV_QUANTITY_LEN);
	return voptBscEntPosnClsAdjRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntPosnClsAdjRequestT getOptExtEntPosnClsAdjRequestT(char* testCaseNum , const char *root) {
	optExtEntPosnClsAdjRequestT voptExtEntPosnClsAdjRequestT;
	int i;

	voptExtEntPosnClsAdjRequestT.txtGrp = getTxtGrpT(testCaseNum, "optExtEntPosnClsAdjRequestT");	return voptExtEntPosnClsAdjRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntPosnClsAdjResponseT getOptBscEntPosnClsAdjResponseT(char* testCaseNum , const char *root) {
	optBscEntPosnClsAdjResponseT voptBscEntPosnClsAdjResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntPosnClsAdjResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntPosnClsAdj.optBscEntPosnClsAdjResponseT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntPosnClsAdjResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntPosnClsAdjResponseT.crtLngQty[i]= ' ';
	}
	char lcrtLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnClsAdj.optBscEntPosnClsAdjResponseT.crtLngQty", lcrtLngQty);
	memcpy(voptBscEntPosnClsAdjResponseT.crtLngQty, lcrtLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscEntPosnClsAdjResponseT.crtShtQty[i]= ' ';
	}
	char lcrtShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnClsAdj.optBscEntPosnClsAdjResponseT.crtShtQty", lcrtShtQty);
	memcpy(voptBscEntPosnClsAdjResponseT.crtShtQty, lcrtShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscEntPosnClsAdjResponseT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntPosnClsAdj.optBscEntPosnClsAdjResponseT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(voptBscEntPosnClsAdjResponseT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);
	return voptBscEntPosnClsAdjResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntPosnClsAdjResponseT getOptExtEntPosnClsAdjResponseT(char* testCaseNum , const char *root) {
	optExtEntPosnClsAdjResponseT voptExtEntPosnClsAdjResponseT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtEntPosnClsAdjResponseT.crtZerCostQty[i]= ' ';
	}
	char lcrtZerCostQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnClsAdj.optExtEntPosnClsAdjResponseT.crtZerCostQty", lcrtZerCostQty);
	memcpy(voptExtEntPosnClsAdjResponseT.crtZerCostQty, lcrtZerCostQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtEntPosnClsAdjResponseT.prvZerCostQty[i]= ' ';
	}
	char lprvZerCostQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntPosnClsAdj.optExtEntPosnClsAdjResponseT.prvZerCostQty", lprvZerCostQty);
	memcpy(voptExtEntPosnClsAdjResponseT.prvZerCostQty, lprvZerCostQty, DRIV_QUANTITY_LEN);
	return voptExtEntPosnClsAdjResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntPosnClsAdjRequestT* getFutEntPosnClsAdjRequestT(char* testCaseNum) {
	vfutEntPosnClsAdjRequestT = (futEntPosnClsAdjRequestT*)malloc(sizeof(futEntPosnClsAdjRequestT));
	int i;

	vfutEntPosnClsAdjRequestT->header = getDataHeaderT(testCaseNum, "futEntPosnClsAdjRequestT");
	vfutEntPosnClsAdjRequestT->basic = getFutBscEntPosnClsAdjRequestT(testCaseNum, "futEntPosnClsAdjRequestT");
	vfutEntPosnClsAdjRequestT->extension = getFutExtEntPosnClsAdjRequestT(testCaseNum, "futEntPosnClsAdjRequestT");
	return vfutEntPosnClsAdjRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntPosnClsAdjResponseT* getFutEntPosnClsAdjResponseT(char* testCaseNum) {
	vfutEntPosnClsAdjResponseT = (futEntPosnClsAdjResponseT*)malloc(sizeof(futEntPosnClsAdjResponseT));
	int i;

	vfutEntPosnClsAdjResponseT->header = getDataHeaderT(testCaseNum, "futEntPosnClsAdjResponseT");
	vfutEntPosnClsAdjResponseT->basic = getFutBscEntPosnClsAdjResponseT(testCaseNum, "futEntPosnClsAdjResponseT");
	vfutEntPosnClsAdjResponseT->extension = getFutExtEntPosnClsAdjResponseT(testCaseNum, "futEntPosnClsAdjResponseT");
	return vfutEntPosnClsAdjResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntPosnClsAdjRequestT* getOptEntPosnClsAdjRequestT(char* testCaseNum) {
	voptEntPosnClsAdjRequestT = (optEntPosnClsAdjRequestT*)malloc(sizeof(optEntPosnClsAdjRequestT));
	int i;

	voptEntPosnClsAdjRequestT->header = getDataHeaderT(testCaseNum, "optEntPosnClsAdjRequestT");
	voptEntPosnClsAdjRequestT->basic = getOptBscEntPosnClsAdjRequestT(testCaseNum, "optEntPosnClsAdjRequestT");
	voptEntPosnClsAdjRequestT->extension = getOptExtEntPosnClsAdjRequestT(testCaseNum, "optEntPosnClsAdjRequestT");
	return voptEntPosnClsAdjRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntPosnClsAdjResponseT* getOptEntPosnClsAdjResponseT(char* testCaseNum) {
	voptEntPosnClsAdjResponseT = (optEntPosnClsAdjResponseT*)malloc(sizeof(optEntPosnClsAdjResponseT));
	int i;

	voptEntPosnClsAdjResponseT->header = getDataHeaderT(testCaseNum, "optEntPosnClsAdjResponseT");
	voptEntPosnClsAdjResponseT->basic = getOptBscEntPosnClsAdjResponseT(testCaseNum, "optEntPosnClsAdjResponseT");
	voptEntPosnClsAdjResponseT->extension = getOptExtEntPosnClsAdjResponseT(testCaseNum, "optEntPosnClsAdjResponseT");
	return voptEntPosnClsAdjResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntPosnClsAdjRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntPosnClsAdjRequestT));
	futEntPosnClsAdjRequestT *vfutEntPosnClsAdjRequestT = getFutEntPosnClsAdjRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntPosnClsAdjRequestT), (jbyte*) vfutEntPosnClsAdjRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntPosnClsAdjResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntPosnClsAdjResponseT));
	futEntPosnClsAdjResponseT *vfutEntPosnClsAdjResponseT = getFutEntPosnClsAdjResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntPosnClsAdjResponseT), (jbyte*) vfutEntPosnClsAdjResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntPosnClsAdjRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntPosnClsAdjRequestT));
	optEntPosnClsAdjRequestT *voptEntPosnClsAdjRequestT = getOptEntPosnClsAdjRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntPosnClsAdjRequestT), (jbyte*) voptEntPosnClsAdjRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntPosnClsAdjResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntPosnClsAdjResponseT));
	optEntPosnClsAdjResponseT *voptEntPosnClsAdjResponseT = getOptEntPosnClsAdjResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntPosnClsAdjResponseT), (jbyte*) voptEntPosnClsAdjResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntPosnClsAdjRequestT(futBscEntPosnClsAdjRequestT actual, futBscEntPosnClsAdjRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnClsAdjRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnClsAdjRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnLngQty, expected.trnLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnClsAdjRequestT, trnLngQty not matching. Actual %s but Expected %s", actual.trnLngQty, expected.trnLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnShtQty, expected.trnShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnClsAdjRequestT, trnShtQty not matching. Actual %s but Expected %s", actual.trnShtQty, expected.trnShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntPosnClsAdjRequestT(futExtEntPosnClsAdjRequestT actual, futExtEntPosnClsAdjRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntPosnClsAdjResponseT(futBscEntPosnClsAdjResponseT actual, futBscEntPosnClsAdjResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnClsAdjResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtLngQty, expected.crtLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnClsAdjResponseT, crtLngQty not matching. Actual %s but Expected %s", actual.crtLngQty, expected.crtLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtShtQty, expected.crtShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnClsAdjResponseT, crtShtQty not matching. Actual %s but Expected %s", actual.crtShtQty, expected.crtShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntPosnClsAdjResponseT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntPosnClsAdjResponseT(futExtEntPosnClsAdjResponseT actual, futExtEntPosnClsAdjResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.crtZerCostQty, expected.crtZerCostQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntPosnClsAdjResponseT, crtZerCostQty not matching. Actual %s but Expected %s", actual.crtZerCostQty, expected.crtZerCostQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvZerCostQty, expected.prvZerCostQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntPosnClsAdjResponseT, prvZerCostQty not matching. Actual %s but Expected %s", actual.prvZerCostQty, expected.prvZerCostQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntPosnClsAdjRequestT(optBscEntPosnClsAdjRequestT actual, optBscEntPosnClsAdjRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnClsAdjRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnClsAdjRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnLngQty, expected.trnLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnClsAdjRequestT, trnLngQty not matching. Actual %s but Expected %s", actual.trnLngQty, expected.trnLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnShtQty, expected.trnShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnClsAdjRequestT, trnShtQty not matching. Actual %s but Expected %s", actual.trnShtQty, expected.trnShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntPosnClsAdjRequestT(optExtEntPosnClsAdjRequestT actual, optExtEntPosnClsAdjRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntPosnClsAdjResponseT(optBscEntPosnClsAdjResponseT actual, optBscEntPosnClsAdjResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnClsAdjResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtLngQty, expected.crtLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnClsAdjResponseT, crtLngQty not matching. Actual %s but Expected %s", actual.crtLngQty, expected.crtLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtShtQty, expected.crtShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnClsAdjResponseT, crtShtQty not matching. Actual %s but Expected %s", actual.crtShtQty, expected.crtShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntPosnClsAdjResponseT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntPosnClsAdjResponseT(optExtEntPosnClsAdjResponseT actual, optExtEntPosnClsAdjResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.crtZerCostQty, expected.crtZerCostQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntPosnClsAdjResponseT, crtZerCostQty not matching. Actual %s but Expected %s", actual.crtZerCostQty, expected.crtZerCostQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvZerCostQty, expected.prvZerCostQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntPosnClsAdjResponseT, prvZerCostQty not matching. Actual %s but Expected %s", actual.prvZerCostQty, expected.prvZerCostQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntPosnClsAdjRequestT(futEntPosnClsAdjRequestT actual, futEntPosnClsAdjRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntPosnClsAdjRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntPosnClsAdjRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntPosnClsAdjResponseT(futEntPosnClsAdjResponseT actual, futEntPosnClsAdjResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntPosnClsAdjResponseT (actual.basic,expected.basic, logMsg);	compareFutExtEntPosnClsAdjResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntPosnClsAdjRequestT(optEntPosnClsAdjRequestT actual, optEntPosnClsAdjRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntPosnClsAdjRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntPosnClsAdjRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntPosnClsAdjResponseT(optEntPosnClsAdjResponseT actual, optEntPosnClsAdjResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntPosnClsAdjResponseT (actual.basic,expected.basic, logMsg);	compareOptExtEntPosnClsAdjResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntPosnClsAdjRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntPosnClsAdjRequestT *actualData = (futEntPosnClsAdjRequestT *)msgStruct;
	futEntPosnClsAdjRequestT* expectedData = getFutEntPosnClsAdjRequestT(testCaseNum);
	compareFutEntPosnClsAdjRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntPosnClsAdjResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntPosnClsAdjResponseT *actualData = (futEntPosnClsAdjResponseT *)msgStruct;
	futEntPosnClsAdjResponseT* expectedData = getFutEntPosnClsAdjResponseT(testCaseNum);
	compareFutEntPosnClsAdjResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntPosnClsAdjRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntPosnClsAdjRequestT *actualData = (optEntPosnClsAdjRequestT *)msgStruct;
	optEntPosnClsAdjRequestT* expectedData = getOptEntPosnClsAdjRequestT(testCaseNum);
	compareOptEntPosnClsAdjRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntPosnClsAdjResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntPosnClsAdjResponseT *actualData = (optEntPosnClsAdjResponseT *)msgStruct;
	optEntPosnClsAdjResponseT* expectedData = getOptEntPosnClsAdjResponseT(testCaseNum);
	compareOptEntPosnClsAdjResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
