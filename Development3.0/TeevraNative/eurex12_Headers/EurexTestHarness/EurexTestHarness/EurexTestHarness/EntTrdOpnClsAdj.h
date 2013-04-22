#include <EntTrdOpnClsAdj.hxx>
#define BUFFER_SIZE 1000

futEntTrdOpnClsAdjRequestT *vfutEntTrdOpnClsAdjRequestT;
futEntTrdOpnClsAdjResponseT *vfutEntTrdOpnClsAdjResponseT;
optEntTrdOpnClsAdjRequestT *voptEntTrdOpnClsAdjRequestT;
optEntTrdOpnClsAdjResponseT *voptEntTrdOpnClsAdjResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdOpnClsAdjRequestT getFutBscEntTrdOpnClsAdjRequestT(char* testCaseNum , const char *root) {
	futBscEntTrdOpnClsAdjRequestT vfutBscEntTrdOpnClsAdjRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscEntTrdOpnClsAdjRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.futBscEntTrdOpnClsAdjRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscEntTrdOpnClsAdjRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscEntTrdOpnClsAdjRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.futBscEntTrdOpnClsAdjRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscEntTrdOpnClsAdjRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutBscEntTrdOpnClsAdjRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscEntTrdOpnClsAdjRequestT");
	vfutBscEntTrdOpnClsAdjRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntTrdOpnClsAdjRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntTrdOpnClsAdjRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.futBscEntTrdOpnClsAdjRequestT.trnDat", ltrnDat);
	memcpy(vfutBscEntTrdOpnClsAdjRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntTrdOpnClsAdjRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.futBscEntTrdOpnClsAdjRequestT.ordrNo", lordrNo);
	memcpy(vfutBscEntTrdOpnClsAdjRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntTrdOpnClsAdjRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.futBscEntTrdOpnClsAdjRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntTrdOpnClsAdjRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscEntTrdOpnClsAdjRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "futBscEntTrdOpnClsAdjRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntTrdOpnClsAdj.futBscEntTrdOpnClsAdjRequestT.buyCod", lbuyCod);
	vfutBscEntTrdOpnClsAdjRequestT.buyCod = lbuyCod[0];

	char lopnClsCod[1] = {""};
	getStrProperty("EntTrdOpnClsAdj.futBscEntTrdOpnClsAdjRequestT.opnClsCod", lopnClsCod);
	vfutBscEntTrdOpnClsAdjRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntTrdOpnClsAdjRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.futBscEntTrdOpnClsAdjRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntTrdOpnClsAdjRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntTrdOpnClsAdjRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntTrdOpnClsAdjRequestT getFutExtEntTrdOpnClsAdjRequestT(char* testCaseNum , const char *root) {
	futExtEntTrdOpnClsAdjRequestT vfutExtEntTrdOpnClsAdjRequestT;
	int i;

	vfutExtEntTrdOpnClsAdjRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtEntTrdOpnClsAdjRequestT");	return vfutExtEntTrdOpnClsAdjRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdOpnClsAdjRecT getFutBscEntTrdOpnClsAdjRecT(char* testCaseNum , const char *root) {
	futBscEntTrdOpnClsAdjRecT vfutBscEntTrdOpnClsAdjRecT;
	int i;

	vfutBscEntTrdOpnClsAdjRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "futBscEntTrdOpnClsAdjRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscEntTrdOpnClsAdjRecT.trnVmarAmnt[i]= ' ';
	}
	char ltrnVmarAmnt[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.futBscEntTrdOpnClsAdjRecT.trnVmarAmnt", ltrnVmarAmnt);
	memcpy(vfutBscEntTrdOpnClsAdjRecT.trnVmarAmnt, ltrnVmarAmnt, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscEntTrdOpnClsAdjRecT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.futBscEntTrdOpnClsAdjRecT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(vfutBscEntTrdOpnClsAdjRecT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);
	return vfutBscEntTrdOpnClsAdjRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdOpnClsAdjResponseT getFutBscEntTrdOpnClsAdjResponseT(char* testCaseNum , const char *root) {
	futBscEntTrdOpnClsAdjResponseT vfutBscEntTrdOpnClsAdjResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntTrdOpnClsAdjResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.futBscEntTrdOpnClsAdjResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntTrdOpnClsAdjResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return vfutBscEntTrdOpnClsAdjResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdOpnClsAdjRequestT getOptBscEntTrdOpnClsAdjRequestT(char* testCaseNum , const char *root) {
	optBscEntTrdOpnClsAdjRequestT voptBscEntTrdOpnClsAdjRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscEntTrdOpnClsAdjRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.optBscEntTrdOpnClsAdjRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscEntTrdOpnClsAdjRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscEntTrdOpnClsAdjRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.optBscEntTrdOpnClsAdjRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscEntTrdOpnClsAdjRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscEntTrdOpnClsAdjRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscEntTrdOpnClsAdjRequestT");
	voptBscEntTrdOpnClsAdjRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntTrdOpnClsAdjRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscEntTrdOpnClsAdjRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.optBscEntTrdOpnClsAdjRequestT.trnDat", ltrnDat);
	memcpy(voptBscEntTrdOpnClsAdjRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntTrdOpnClsAdjRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.optBscEntTrdOpnClsAdjRequestT.ordrNo", lordrNo);
	memcpy(voptBscEntTrdOpnClsAdjRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntTrdOpnClsAdjRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.optBscEntTrdOpnClsAdjRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntTrdOpnClsAdjRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscEntTrdOpnClsAdjRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "optBscEntTrdOpnClsAdjRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntTrdOpnClsAdj.optBscEntTrdOpnClsAdjRequestT.buyCod", lbuyCod);
	voptBscEntTrdOpnClsAdjRequestT.buyCod = lbuyCod[0];

	char lopnClsCod[1] = {""};
	getStrProperty("EntTrdOpnClsAdj.optBscEntTrdOpnClsAdjRequestT.opnClsCod", lopnClsCod);
	voptBscEntTrdOpnClsAdjRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscEntTrdOpnClsAdjRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.optBscEntTrdOpnClsAdjRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscEntTrdOpnClsAdjRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscEntTrdOpnClsAdjRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntTrdOpnClsAdjRequestT getOptExtEntTrdOpnClsAdjRequestT(char* testCaseNum , const char *root) {
	optExtEntTrdOpnClsAdjRequestT voptExtEntTrdOpnClsAdjRequestT;
	int i;

	voptExtEntTrdOpnClsAdjRequestT.txtGrp = getTxtGrpT(testCaseNum, "optExtEntTrdOpnClsAdjRequestT");	return voptExtEntTrdOpnClsAdjRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdOpnClsAdjRecT getOptBscEntTrdOpnClsAdjRecT(char* testCaseNum , const char *root) {
	optBscEntTrdOpnClsAdjRecT voptBscEntTrdOpnClsAdjRecT;
	int i;

	voptBscEntTrdOpnClsAdjRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "optBscEntTrdOpnClsAdjRecT");
	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscEntTrdOpnClsAdjRecT.trnPrmAmnt[i]= ' ';
	}
	char ltrnPrmAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.optBscEntTrdOpnClsAdjRecT.trnPrmAmnt", ltrnPrmAmnt);
	memcpy(voptBscEntTrdOpnClsAdjRecT.trnPrmAmnt, ltrnPrmAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscEntTrdOpnClsAdjRecT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.optBscEntTrdOpnClsAdjRecT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(voptBscEntTrdOpnClsAdjRecT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);
	return voptBscEntTrdOpnClsAdjRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdOpnClsAdjResponseT getOptBscEntTrdOpnClsAdjResponseT(char* testCaseNum , const char *root) {
	optBscEntTrdOpnClsAdjResponseT voptBscEntTrdOpnClsAdjResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntTrdOpnClsAdjResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdOpnClsAdj.optBscEntTrdOpnClsAdjResponseT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntTrdOpnClsAdjResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return voptBscEntTrdOpnClsAdjResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntTrdOpnClsAdjRequestT* getFutEntTrdOpnClsAdjRequestT(char* testCaseNum) {
	vfutEntTrdOpnClsAdjRequestT = (futEntTrdOpnClsAdjRequestT*)malloc(sizeof(futEntTrdOpnClsAdjRequestT));
	int i;

	vfutEntTrdOpnClsAdjRequestT->header = getDataHeaderT(testCaseNum, "futEntTrdOpnClsAdjRequestT");
	vfutEntTrdOpnClsAdjRequestT->basic = getFutBscEntTrdOpnClsAdjRequestT(testCaseNum, "futEntTrdOpnClsAdjRequestT");
	vfutEntTrdOpnClsAdjRequestT->extension = getFutExtEntTrdOpnClsAdjRequestT(testCaseNum, "futEntTrdOpnClsAdjRequestT");
	return vfutEntTrdOpnClsAdjRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntTrdOpnClsAdjResponseT* getFutEntTrdOpnClsAdjResponseT(char* testCaseNum) {
	vfutEntTrdOpnClsAdjResponseT = (futEntTrdOpnClsAdjResponseT*)malloc(sizeof(futEntTrdOpnClsAdjResponseT));
	int i;

	vfutEntTrdOpnClsAdjResponseT->header = getDataHeaderT(testCaseNum, "futEntTrdOpnClsAdjResponseT");
	vfutEntTrdOpnClsAdjResponseT->basic = getFutBscEntTrdOpnClsAdjResponseT(testCaseNum, "futEntTrdOpnClsAdjResponseT");
	return vfutEntTrdOpnClsAdjResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntTrdOpnClsAdjRequestT* getOptEntTrdOpnClsAdjRequestT(char* testCaseNum) {
	voptEntTrdOpnClsAdjRequestT = (optEntTrdOpnClsAdjRequestT*)malloc(sizeof(optEntTrdOpnClsAdjRequestT));
	int i;

	voptEntTrdOpnClsAdjRequestT->header = getDataHeaderT(testCaseNum, "optEntTrdOpnClsAdjRequestT");
	voptEntTrdOpnClsAdjRequestT->basic = getOptBscEntTrdOpnClsAdjRequestT(testCaseNum, "optEntTrdOpnClsAdjRequestT");
	voptEntTrdOpnClsAdjRequestT->extension = getOptExtEntTrdOpnClsAdjRequestT(testCaseNum, "optEntTrdOpnClsAdjRequestT");
	return voptEntTrdOpnClsAdjRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntTrdOpnClsAdjResponseT* getOptEntTrdOpnClsAdjResponseT(char* testCaseNum) {
	voptEntTrdOpnClsAdjResponseT = (optEntTrdOpnClsAdjResponseT*)malloc(sizeof(optEntTrdOpnClsAdjResponseT));
	int i;

	voptEntTrdOpnClsAdjResponseT->header = getDataHeaderT(testCaseNum, "optEntTrdOpnClsAdjResponseT");
	voptEntTrdOpnClsAdjResponseT->basic = getOptBscEntTrdOpnClsAdjResponseT(testCaseNum, "optEntTrdOpnClsAdjResponseT");
	return voptEntTrdOpnClsAdjResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntTrdOpnClsAdjRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntTrdOpnClsAdjRequestT));
	futEntTrdOpnClsAdjRequestT *vfutEntTrdOpnClsAdjRequestT = getFutEntTrdOpnClsAdjRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntTrdOpnClsAdjRequestT), (jbyte*) vfutEntTrdOpnClsAdjRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntTrdOpnClsAdjResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntTrdOpnClsAdjResponseT));
	futEntTrdOpnClsAdjResponseT *vfutEntTrdOpnClsAdjResponseT = getFutEntTrdOpnClsAdjResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntTrdOpnClsAdjResponseT), (jbyte*) vfutEntTrdOpnClsAdjResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntTrdOpnClsAdjRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntTrdOpnClsAdjRequestT));
	optEntTrdOpnClsAdjRequestT *voptEntTrdOpnClsAdjRequestT = getOptEntTrdOpnClsAdjRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntTrdOpnClsAdjRequestT), (jbyte*) voptEntTrdOpnClsAdjRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntTrdOpnClsAdjResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntTrdOpnClsAdjResponseT));
	optEntTrdOpnClsAdjResponseT *voptEntTrdOpnClsAdjResponseT = getOptEntTrdOpnClsAdjResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntTrdOpnClsAdjResponseT), (jbyte*) voptEntTrdOpnClsAdjResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdOpnClsAdjRequestT(futBscEntTrdOpnClsAdjRequestT actual, futBscEntTrdOpnClsAdjRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdOpnClsAdjRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdOpnClsAdjRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdOpnClsAdjRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdOpnClsAdjRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdOpnClsAdjRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdOpnClsAdjRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdOpnClsAdjRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdOpnClsAdjRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntTrdOpnClsAdjRequestT(futExtEntTrdOpnClsAdjRequestT actual, futExtEntTrdOpnClsAdjRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdOpnClsAdjRecT(futBscEntTrdOpnClsAdjRecT actual, futBscEntTrdOpnClsAdjRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if ( memcmp(actual.trnVmarAmnt, expected.trnVmarAmnt, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdOpnClsAdjRecT, trnVmarAmnt not matching. Actual %s but Expected %s", actual.trnVmarAmnt, expected.trnVmarAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdOpnClsAdjRecT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdOpnClsAdjResponseT(futBscEntTrdOpnClsAdjResponseT actual, futBscEntTrdOpnClsAdjResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdOpnClsAdjResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_ENT_TRD_OPN_CLS_ADJ_REC_MAX;i++) {
		compareFutBscEntTrdOpnClsAdjRecT (actual.futBscEntTrdOpnClsAdjRec[i],expected.futBscEntTrdOpnClsAdjRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdOpnClsAdjRequestT(optBscEntTrdOpnClsAdjRequestT actual, optBscEntTrdOpnClsAdjRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdOpnClsAdjRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdOpnClsAdjRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdOpnClsAdjRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdOpnClsAdjRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdOpnClsAdjRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdOpnClsAdjRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdOpnClsAdjRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdOpnClsAdjRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntTrdOpnClsAdjRequestT(optExtEntTrdOpnClsAdjRequestT actual, optExtEntTrdOpnClsAdjRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdOpnClsAdjRecT(optBscEntTrdOpnClsAdjRecT actual, optBscEntTrdOpnClsAdjRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if ( memcmp(actual.trnPrmAmnt, expected.trnPrmAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdOpnClsAdjRecT, trnPrmAmnt not matching. Actual %s but Expected %s", actual.trnPrmAmnt, expected.trnPrmAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdOpnClsAdjRecT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdOpnClsAdjResponseT(optBscEntTrdOpnClsAdjResponseT actual, optBscEntTrdOpnClsAdjResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdOpnClsAdjResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_ENT_TRD_OPN_CLS_ADJ_REC_MAX;i++) {
		compareOptBscEntTrdOpnClsAdjRecT (actual.optBscEntTrdOpnClsAdjRec[i],expected.optBscEntTrdOpnClsAdjRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntTrdOpnClsAdjRequestT(futEntTrdOpnClsAdjRequestT actual, futEntTrdOpnClsAdjRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntTrdOpnClsAdjRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntTrdOpnClsAdjRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntTrdOpnClsAdjResponseT(futEntTrdOpnClsAdjResponseT actual, futEntTrdOpnClsAdjResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntTrdOpnClsAdjResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntTrdOpnClsAdjRequestT(optEntTrdOpnClsAdjRequestT actual, optEntTrdOpnClsAdjRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntTrdOpnClsAdjRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntTrdOpnClsAdjRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntTrdOpnClsAdjResponseT(optEntTrdOpnClsAdjResponseT actual, optEntTrdOpnClsAdjResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntTrdOpnClsAdjResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntTrdOpnClsAdjRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntTrdOpnClsAdjRequestT *actualData = (futEntTrdOpnClsAdjRequestT *)msgStruct;
	futEntTrdOpnClsAdjRequestT* expectedData = getFutEntTrdOpnClsAdjRequestT(testCaseNum);
	compareFutEntTrdOpnClsAdjRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntTrdOpnClsAdjResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntTrdOpnClsAdjResponseT *actualData = (futEntTrdOpnClsAdjResponseT *)msgStruct;
	futEntTrdOpnClsAdjResponseT* expectedData = getFutEntTrdOpnClsAdjResponseT(testCaseNum);
	compareFutEntTrdOpnClsAdjResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntTrdOpnClsAdjRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntTrdOpnClsAdjRequestT *actualData = (optEntTrdOpnClsAdjRequestT *)msgStruct;
	optEntTrdOpnClsAdjRequestT* expectedData = getOptEntTrdOpnClsAdjRequestT(testCaseNum);
	compareOptEntTrdOpnClsAdjRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntTrdOpnClsAdjResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntTrdOpnClsAdjResponseT *actualData = (optEntTrdOpnClsAdjResponseT *)msgStruct;
	optEntTrdOpnClsAdjResponseT* expectedData = getOptEntTrdOpnClsAdjResponseT(testCaseNum);
	compareOptEntTrdOpnClsAdjResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
