#include <EntTrdAcctTsf.hxx>
#define BUFFER_SIZE 1000

futEntTrdAcctTsfRequestT *vfutEntTrdAcctTsfRequestT;
futEntTrdAcctTsfResponseT *vfutEntTrdAcctTsfResponseT;
optEntTrdAcctTsfRequestT *voptEntTrdAcctTsfRequestT;
optEntTrdAcctTsfResponseT *voptEntTrdAcctTsfResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdAcctTsfRequestT getFutBscEntTrdAcctTsfRequestT(char* testCaseNum , const char *root) {
	futBscEntTrdAcctTsfRequestT vfutBscEntTrdAcctTsfRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscEntTrdAcctTsfRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.futBscEntTrdAcctTsfRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscEntTrdAcctTsfRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscEntTrdAcctTsfRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.futBscEntTrdAcctTsfRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscEntTrdAcctTsfRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutBscEntTrdAcctTsfRequestT.acctTypCodFromGrp = getAcctTypCodFromGrpT(testCaseNum, "futBscEntTrdAcctTsfRequestT");
	vfutBscEntTrdAcctTsfRequestT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "futBscEntTrdAcctTsfRequestT");
	vfutBscEntTrdAcctTsfRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntTrdAcctTsfRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntTrdAcctTsfRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.futBscEntTrdAcctTsfRequestT.trnDat", ltrnDat);
	memcpy(vfutBscEntTrdAcctTsfRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntTrdAcctTsfRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.futBscEntTrdAcctTsfRequestT.ordrNo", lordrNo);
	memcpy(vfutBscEntTrdAcctTsfRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntTrdAcctTsfRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.futBscEntTrdAcctTsfRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntTrdAcctTsfRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscEntTrdAcctTsfRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "futBscEntTrdAcctTsfRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntTrdAcctTsf.futBscEntTrdAcctTsfRequestT.buyCod", lbuyCod);
	vfutBscEntTrdAcctTsfRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntTrdAcctTsfRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.futBscEntTrdAcctTsfRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntTrdAcctTsfRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntTrdAcctTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntTrdAcctTsfRequestT getFutExtEntTrdAcctTsfRequestT(char* testCaseNum , const char *root) {
	futExtEntTrdAcctTsfRequestT vfutExtEntTrdAcctTsfRequestT;
	int i;

	vfutExtEntTrdAcctTsfRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtEntTrdAcctTsfRequestT");	return vfutExtEntTrdAcctTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdAcctTsfRecT getFutBscEntTrdAcctTsfRecT(char* testCaseNum , const char *root) {
	futBscEntTrdAcctTsfRecT vfutBscEntTrdAcctTsfRecT;
	int i;

	vfutBscEntTrdAcctTsfRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "futBscEntTrdAcctTsfRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntTrdAcctTsfRecT.trnVmarAmnt[i]= ' ';
	}
	char ltrnVmarAmnt[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.futBscEntTrdAcctTsfRecT.trnVmarAmnt", ltrnVmarAmnt);
	memcpy(vfutBscEntTrdAcctTsfRecT.trnVmarAmnt, ltrnVmarAmnt, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscEntTrdAcctTsfRecT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.futBscEntTrdAcctTsfRecT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(vfutBscEntTrdAcctTsfRecT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);
	return vfutBscEntTrdAcctTsfRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdAcctTsfResponseT getFutBscEntTrdAcctTsfResponseT(char* testCaseNum , const char *root) {
	futBscEntTrdAcctTsfResponseT vfutBscEntTrdAcctTsfResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntTrdAcctTsfResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.futBscEntTrdAcctTsfResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntTrdAcctTsfResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return vfutBscEntTrdAcctTsfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdAcctTsfRequestT getOptBscEntTrdAcctTsfRequestT(char* testCaseNum , const char *root) {
	optBscEntTrdAcctTsfRequestT voptBscEntTrdAcctTsfRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscEntTrdAcctTsfRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.optBscEntTrdAcctTsfRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscEntTrdAcctTsfRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscEntTrdAcctTsfRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.optBscEntTrdAcctTsfRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscEntTrdAcctTsfRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscEntTrdAcctTsfRequestT.acctTypCodFromGrp = getAcctTypCodFromGrpT(testCaseNum, "optBscEntTrdAcctTsfRequestT");
	voptBscEntTrdAcctTsfRequestT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "optBscEntTrdAcctTsfRequestT");
	voptBscEntTrdAcctTsfRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntTrdAcctTsfRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscEntTrdAcctTsfRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.optBscEntTrdAcctTsfRequestT.trnDat", ltrnDat);
	memcpy(voptBscEntTrdAcctTsfRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntTrdAcctTsfRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.optBscEntTrdAcctTsfRequestT.ordrNo", lordrNo);
	memcpy(voptBscEntTrdAcctTsfRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntTrdAcctTsfRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.optBscEntTrdAcctTsfRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntTrdAcctTsfRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscEntTrdAcctTsfRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "optBscEntTrdAcctTsfRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntTrdAcctTsf.optBscEntTrdAcctTsfRequestT.buyCod", lbuyCod);
	voptBscEntTrdAcctTsfRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscEntTrdAcctTsfRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.optBscEntTrdAcctTsfRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscEntTrdAcctTsfRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscEntTrdAcctTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntTrdAcctTsfRequestT getOptExtEntTrdAcctTsfRequestT(char* testCaseNum , const char *root) {
	optExtEntTrdAcctTsfRequestT voptExtEntTrdAcctTsfRequestT;
	int i;

	voptExtEntTrdAcctTsfRequestT.txtGrp = getTxtGrpT(testCaseNum, "optExtEntTrdAcctTsfRequestT");	return voptExtEntTrdAcctTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdAcctTsfRecT getOptBscEntTrdAcctTsfRecT(char* testCaseNum , const char *root) {
	optBscEntTrdAcctTsfRecT voptBscEntTrdAcctTsfRecT;
	int i;

	voptBscEntTrdAcctTsfRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "optBscEntTrdAcctTsfRecT");
	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscEntTrdAcctTsfRecT.trnPrmAmnt[i]= ' ';
	}
	char ltrnPrmAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.optBscEntTrdAcctTsfRecT.trnPrmAmnt", ltrnPrmAmnt);
	memcpy(voptBscEntTrdAcctTsfRecT.trnPrmAmnt, ltrnPrmAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscEntTrdAcctTsfRecT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.optBscEntTrdAcctTsfRecT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(voptBscEntTrdAcctTsfRecT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);
	return voptBscEntTrdAcctTsfRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdAcctTsfResponseT getOptBscEntTrdAcctTsfResponseT(char* testCaseNum , const char *root) {
	optBscEntTrdAcctTsfResponseT voptBscEntTrdAcctTsfResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntTrdAcctTsfResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdAcctTsf.optBscEntTrdAcctTsfResponseT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntTrdAcctTsfResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return voptBscEntTrdAcctTsfResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntTrdAcctTsfRequestT* getFutEntTrdAcctTsfRequestT(char* testCaseNum) {
	vfutEntTrdAcctTsfRequestT = (futEntTrdAcctTsfRequestT*)malloc(sizeof(futEntTrdAcctTsfRequestT));
	int i;

	vfutEntTrdAcctTsfRequestT->header = getDataHeaderT(testCaseNum, "futEntTrdAcctTsfRequestT");
	vfutEntTrdAcctTsfRequestT->basic = getFutBscEntTrdAcctTsfRequestT(testCaseNum, "futEntTrdAcctTsfRequestT");
	vfutEntTrdAcctTsfRequestT->extension = getFutExtEntTrdAcctTsfRequestT(testCaseNum, "futEntTrdAcctTsfRequestT");
	return vfutEntTrdAcctTsfRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntTrdAcctTsfResponseT* getFutEntTrdAcctTsfResponseT(char* testCaseNum) {
	vfutEntTrdAcctTsfResponseT = (futEntTrdAcctTsfResponseT*)malloc(sizeof(futEntTrdAcctTsfResponseT));
	int i;

	vfutEntTrdAcctTsfResponseT->header = getDataHeaderT(testCaseNum, "futEntTrdAcctTsfResponseT");
	vfutEntTrdAcctTsfResponseT->basic = getFutBscEntTrdAcctTsfResponseT(testCaseNum, "futEntTrdAcctTsfResponseT");
	return vfutEntTrdAcctTsfResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntTrdAcctTsfRequestT* getOptEntTrdAcctTsfRequestT(char* testCaseNum) {
	voptEntTrdAcctTsfRequestT = (optEntTrdAcctTsfRequestT*)malloc(sizeof(optEntTrdAcctTsfRequestT));
	int i;

	voptEntTrdAcctTsfRequestT->header = getDataHeaderT(testCaseNum, "optEntTrdAcctTsfRequestT");
	voptEntTrdAcctTsfRequestT->basic = getOptBscEntTrdAcctTsfRequestT(testCaseNum, "optEntTrdAcctTsfRequestT");
	voptEntTrdAcctTsfRequestT->extension = getOptExtEntTrdAcctTsfRequestT(testCaseNum, "optEntTrdAcctTsfRequestT");
	return voptEntTrdAcctTsfRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntTrdAcctTsfResponseT* getOptEntTrdAcctTsfResponseT(char* testCaseNum) {
	voptEntTrdAcctTsfResponseT = (optEntTrdAcctTsfResponseT*)malloc(sizeof(optEntTrdAcctTsfResponseT));
	int i;

	voptEntTrdAcctTsfResponseT->header = getDataHeaderT(testCaseNum, "optEntTrdAcctTsfResponseT");
	voptEntTrdAcctTsfResponseT->basic = getOptBscEntTrdAcctTsfResponseT(testCaseNum, "optEntTrdAcctTsfResponseT");
	return voptEntTrdAcctTsfResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntTrdAcctTsfRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntTrdAcctTsfRequestT));
	futEntTrdAcctTsfRequestT *vfutEntTrdAcctTsfRequestT = getFutEntTrdAcctTsfRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntTrdAcctTsfRequestT), (jbyte*) vfutEntTrdAcctTsfRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntTrdAcctTsfResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntTrdAcctTsfResponseT));
	futEntTrdAcctTsfResponseT *vfutEntTrdAcctTsfResponseT = getFutEntTrdAcctTsfResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntTrdAcctTsfResponseT), (jbyte*) vfutEntTrdAcctTsfResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntTrdAcctTsfRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntTrdAcctTsfRequestT));
	optEntTrdAcctTsfRequestT *voptEntTrdAcctTsfRequestT = getOptEntTrdAcctTsfRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntTrdAcctTsfRequestT), (jbyte*) voptEntTrdAcctTsfRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntTrdAcctTsfResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntTrdAcctTsfResponseT));
	optEntTrdAcctTsfResponseT *voptEntTrdAcctTsfResponseT = getOptEntTrdAcctTsfResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntTrdAcctTsfResponseT), (jbyte*) voptEntTrdAcctTsfResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdAcctTsfRequestT(futBscEntTrdAcctTsfRequestT actual, futBscEntTrdAcctTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdAcctTsfRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdAcctTsfRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodFromGrpT (actual.acctTypCodFromGrp,expected.acctTypCodFromGrp, logMsg);
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdAcctTsfRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdAcctTsfRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdAcctTsfRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdAcctTsfRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdAcctTsfRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntTrdAcctTsfRequestT(futExtEntTrdAcctTsfRequestT actual, futExtEntTrdAcctTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdAcctTsfRecT(futBscEntTrdAcctTsfRecT actual, futBscEntTrdAcctTsfRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if ( memcmp(actual.trnVmarAmnt, expected.trnVmarAmnt, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdAcctTsfRecT, trnVmarAmnt not matching. Actual %s but Expected %s", actual.trnVmarAmnt, expected.trnVmarAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdAcctTsfRecT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdAcctTsfResponseT(futBscEntTrdAcctTsfResponseT actual, futBscEntTrdAcctTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdAcctTsfResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_ENT_TRD_ACCT_TSF_REC_MAX;i++) {
		compareFutBscEntTrdAcctTsfRecT (actual.futBscEntTrdAcctTsfRec[i],expected.futBscEntTrdAcctTsfRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdAcctTsfRequestT(optBscEntTrdAcctTsfRequestT actual, optBscEntTrdAcctTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdAcctTsfRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdAcctTsfRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodFromGrpT (actual.acctTypCodFromGrp,expected.acctTypCodFromGrp, logMsg);
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdAcctTsfRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdAcctTsfRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdAcctTsfRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdAcctTsfRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdAcctTsfRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntTrdAcctTsfRequestT(optExtEntTrdAcctTsfRequestT actual, optExtEntTrdAcctTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdAcctTsfRecT(optBscEntTrdAcctTsfRecT actual, optBscEntTrdAcctTsfRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if ( memcmp(actual.trnPrmAmnt, expected.trnPrmAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdAcctTsfRecT, trnPrmAmnt not matching. Actual %s but Expected %s", actual.trnPrmAmnt, expected.trnPrmAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdAcctTsfRecT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdAcctTsfResponseT(optBscEntTrdAcctTsfResponseT actual, optBscEntTrdAcctTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdAcctTsfResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_ENT_TRD_ACCT_TSF_REC_MAX;i++) {
		compareOptBscEntTrdAcctTsfRecT (actual.optBscEntTrdAcctTsfRec[i],expected.optBscEntTrdAcctTsfRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntTrdAcctTsfRequestT(futEntTrdAcctTsfRequestT actual, futEntTrdAcctTsfRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntTrdAcctTsfRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntTrdAcctTsfRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntTrdAcctTsfResponseT(futEntTrdAcctTsfResponseT actual, futEntTrdAcctTsfResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntTrdAcctTsfResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntTrdAcctTsfRequestT(optEntTrdAcctTsfRequestT actual, optEntTrdAcctTsfRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntTrdAcctTsfRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntTrdAcctTsfRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntTrdAcctTsfResponseT(optEntTrdAcctTsfResponseT actual, optEntTrdAcctTsfResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntTrdAcctTsfResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntTrdAcctTsfRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntTrdAcctTsfRequestT *actualData = (futEntTrdAcctTsfRequestT *)msgStruct;
	futEntTrdAcctTsfRequestT* expectedData = getFutEntTrdAcctTsfRequestT(testCaseNum);
	compareFutEntTrdAcctTsfRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntTrdAcctTsfResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntTrdAcctTsfResponseT *actualData = (futEntTrdAcctTsfResponseT *)msgStruct;
	futEntTrdAcctTsfResponseT* expectedData = getFutEntTrdAcctTsfResponseT(testCaseNum);
	compareFutEntTrdAcctTsfResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntTrdAcctTsfRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntTrdAcctTsfRequestT *actualData = (optEntTrdAcctTsfRequestT *)msgStruct;
	optEntTrdAcctTsfRequestT* expectedData = getOptEntTrdAcctTsfRequestT(testCaseNum);
	compareOptEntTrdAcctTsfRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntTrdAcctTsfResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntTrdAcctTsfResponseT *actualData = (optEntTrdAcctTsfResponseT *)msgStruct;
	optEntTrdAcctTsfResponseT* expectedData = getOptEntTrdAcctTsfResponseT(testCaseNum);
	compareOptEntTrdAcctTsfResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
