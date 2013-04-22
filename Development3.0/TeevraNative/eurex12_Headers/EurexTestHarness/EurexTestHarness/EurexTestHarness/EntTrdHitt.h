#include <EntTrdHitt.hxx>
#define BUFFER_SIZE 1000

futEntTrdHittRequestT *vfutEntTrdHittRequestT;
futEntTrdHittResponseT *vfutEntTrdHittResponseT;
optEntTrdHittRequestT *voptEntTrdHittRequestT;
optEntTrdHittResponseT *voptEntTrdHittResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdHittRequestT getFutBscEntTrdHittRequestT(char* testCaseNum , const char *root) {
	futBscEntTrdHittRequestT vfutBscEntTrdHittRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscEntTrdHittRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntTrdHitt.futBscEntTrdHittRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscEntTrdHittRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscEntTrdHittRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntTrdHitt.futBscEntTrdHittRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscEntTrdHittRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutBscEntTrdHittRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscEntTrdHittRequestT");
	vfutBscEntTrdHittRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntTrdHittRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntTrdHittRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntTrdHitt.futBscEntTrdHittRequestT.trnDat", ltrnDat);
	memcpy(vfutBscEntTrdHittRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntTrdHittRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntTrdHitt.futBscEntTrdHittRequestT.ordrNo", lordrNo);
	memcpy(vfutBscEntTrdHittRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntTrdHittRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdHitt.futBscEntTrdHittRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntTrdHittRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscEntTrdHittRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "futBscEntTrdHittRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntTrdHitt.futBscEntTrdHittRequestT.buyCod", lbuyCod);
	vfutBscEntTrdHittRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntTrdHittRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTrdHitt.futBscEntTrdHittRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntTrdHittRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntTrdHittRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdHittRecT getFutBscEntTrdHittRecT(char* testCaseNum , const char *root) {
	futBscEntTrdHittRecT vfutBscEntTrdHittRecT;
	int i;

	vfutBscEntTrdHittRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "futBscEntTrdHittRecT");	return vfutBscEntTrdHittRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntTrdHittResponseT getFutBscEntTrdHittResponseT(char* testCaseNum , const char *root) {
	futBscEntTrdHittResponseT vfutBscEntTrdHittResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscEntTrdHittResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdHitt.futBscEntTrdHittResponseT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscEntTrdHittResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return vfutBscEntTrdHittResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdHittRequestT getOptBscEntTrdHittRequestT(char* testCaseNum , const char *root) {
	optBscEntTrdHittRequestT voptBscEntTrdHittRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscEntTrdHittRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntTrdHitt.optBscEntTrdHittRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscEntTrdHittRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscEntTrdHittRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntTrdHitt.optBscEntTrdHittRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscEntTrdHittRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscEntTrdHittRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscEntTrdHittRequestT");
	voptBscEntTrdHittRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntTrdHittRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscEntTrdHittRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntTrdHitt.optBscEntTrdHittRequestT.trnDat", ltrnDat);
	memcpy(voptBscEntTrdHittRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntTrdHittRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntTrdHitt.optBscEntTrdHittRequestT.ordrNo", lordrNo);
	memcpy(voptBscEntTrdHittRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntTrdHittRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdHitt.optBscEntTrdHittRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntTrdHittRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscEntTrdHittRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "optBscEntTrdHittRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntTrdHitt.optBscEntTrdHittRequestT.buyCod", lbuyCod);
	voptBscEntTrdHittRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscEntTrdHittRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTrdHitt.optBscEntTrdHittRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscEntTrdHittRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscEntTrdHittRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdHittRecT getOptBscEntTrdHittRecT(char* testCaseNum , const char *root) {
	optBscEntTrdHittRecT voptBscEntTrdHittRecT;
	int i;

	voptBscEntTrdHittRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "optBscEntTrdHittRecT");	return voptBscEntTrdHittRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntTrdHittResponseT getOptBscEntTrdHittResponseT(char* testCaseNum , const char *root) {
	optBscEntTrdHittResponseT voptBscEntTrdHittResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscEntTrdHittResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntTrdHitt.optBscEntTrdHittResponseT.trnIdNo", ltrnIdNo);
	memcpy(voptBscEntTrdHittResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return voptBscEntTrdHittResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntTrdHittRequestT* getFutEntTrdHittRequestT(char* testCaseNum) {
	vfutEntTrdHittRequestT = (futEntTrdHittRequestT*)malloc(sizeof(futEntTrdHittRequestT));
	int i;

	vfutEntTrdHittRequestT->header = getDataHeaderT(testCaseNum, "futEntTrdHittRequestT");
	vfutEntTrdHittRequestT->basic = getFutBscEntTrdHittRequestT(testCaseNum, "futEntTrdHittRequestT");
	return vfutEntTrdHittRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntTrdHittResponseT* getFutEntTrdHittResponseT(char* testCaseNum) {
	vfutEntTrdHittResponseT = (futEntTrdHittResponseT*)malloc(sizeof(futEntTrdHittResponseT));
	int i;

	vfutEntTrdHittResponseT->header = getDataHeaderT(testCaseNum, "futEntTrdHittResponseT");
	vfutEntTrdHittResponseT->basic = getFutBscEntTrdHittResponseT(testCaseNum, "futEntTrdHittResponseT");
	return vfutEntTrdHittResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntTrdHittRequestT* getOptEntTrdHittRequestT(char* testCaseNum) {
	voptEntTrdHittRequestT = (optEntTrdHittRequestT*)malloc(sizeof(optEntTrdHittRequestT));
	int i;

	voptEntTrdHittRequestT->header = getDataHeaderT(testCaseNum, "optEntTrdHittRequestT");
	voptEntTrdHittRequestT->basic = getOptBscEntTrdHittRequestT(testCaseNum, "optEntTrdHittRequestT");
	return voptEntTrdHittRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntTrdHittResponseT* getOptEntTrdHittResponseT(char* testCaseNum) {
	voptEntTrdHittResponseT = (optEntTrdHittResponseT*)malloc(sizeof(optEntTrdHittResponseT));
	int i;

	voptEntTrdHittResponseT->header = getDataHeaderT(testCaseNum, "optEntTrdHittResponseT");
	voptEntTrdHittResponseT->basic = getOptBscEntTrdHittResponseT(testCaseNum, "optEntTrdHittResponseT");
	return voptEntTrdHittResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntTrdHittRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntTrdHittRequestT));
	futEntTrdHittRequestT *vfutEntTrdHittRequestT = getFutEntTrdHittRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntTrdHittRequestT), (jbyte*) vfutEntTrdHittRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntTrdHittResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntTrdHittResponseT));
	futEntTrdHittResponseT *vfutEntTrdHittResponseT = getFutEntTrdHittResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntTrdHittResponseT), (jbyte*) vfutEntTrdHittResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntTrdHittRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntTrdHittRequestT));
	optEntTrdHittRequestT *voptEntTrdHittRequestT = getOptEntTrdHittRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntTrdHittRequestT), (jbyte*) voptEntTrdHittRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntTrdHittResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntTrdHittResponseT));
	optEntTrdHittResponseT *voptEntTrdHittResponseT = getOptEntTrdHittResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntTrdHittResponseT), (jbyte*) voptEntTrdHittResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdHittRequestT(futBscEntTrdHittRequestT actual, futBscEntTrdHittRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdHittRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdHittRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdHittRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdHittRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdHittRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdHittRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdHittRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdHittRecT(futBscEntTrdHittRecT actual, futBscEntTrdHittRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntTrdHittResponseT(futBscEntTrdHittResponseT actual, futBscEntTrdHittResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntTrdHittResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_ENT_TRD_HITT_REC_MAX;i++) {
		compareFutBscEntTrdHittRecT (actual.futBscEntTrdHittRec[i],expected.futBscEntTrdHittRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdHittRequestT(optBscEntTrdHittRequestT actual, optBscEntTrdHittRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdHittRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdHittRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdHittRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdHittRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdHittRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdHittRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdHittRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdHittRecT(optBscEntTrdHittRecT actual, optBscEntTrdHittRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntTrdHittResponseT(optBscEntTrdHittResponseT actual, optBscEntTrdHittResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntTrdHittResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_ENT_TRD_HITT_REC_MAX;i++) {
		compareOptBscEntTrdHittRecT (actual.optBscEntTrdHittRec[i],expected.optBscEntTrdHittRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntTrdHittRequestT(futEntTrdHittRequestT actual, futEntTrdHittRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntTrdHittRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntTrdHittResponseT(futEntTrdHittResponseT actual, futEntTrdHittResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntTrdHittResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntTrdHittRequestT(optEntTrdHittRequestT actual, optEntTrdHittRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntTrdHittRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntTrdHittResponseT(optEntTrdHittResponseT actual, optEntTrdHittResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntTrdHittResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntTrdHittRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntTrdHittRequestT *actualData = (futEntTrdHittRequestT *)msgStruct;
	futEntTrdHittRequestT* expectedData = getFutEntTrdHittRequestT(testCaseNum);
	compareFutEntTrdHittRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntTrdHittResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntTrdHittResponseT *actualData = (futEntTrdHittResponseT *)msgStruct;
	futEntTrdHittResponseT* expectedData = getFutEntTrdHittResponseT(testCaseNum);
	compareFutEntTrdHittResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntTrdHittRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntTrdHittRequestT *actualData = (optEntTrdHittRequestT *)msgStruct;
	optEntTrdHittRequestT* expectedData = getOptEntTrdHittRequestT(testCaseNum);
	compareOptEntTrdHittRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntTrdHittResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntTrdHittResponseT *actualData = (optEntTrdHittResponseT *)msgStruct;
	optEntTrdHittResponseT* expectedData = getOptEntTrdHittResponseT(testCaseNum);
	compareOptEntTrdHittResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
