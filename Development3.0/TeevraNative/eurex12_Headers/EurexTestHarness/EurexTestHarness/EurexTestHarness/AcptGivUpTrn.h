#include <AcptGivUpTrn.hxx>
#define BUFFER_SIZE 1000

futAcptGivUpTrnRequestT *vfutAcptGivUpTrnRequestT;
futAcptGivUpTrnResponseT *vfutAcptGivUpTrnResponseT;
optAcptGivUpTrnRequestT *voptAcptGivUpTrnRequestT;
optAcptGivUpTrnResponseT *voptAcptGivUpTrnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAcptGivUpTrnRequestT getFutBscAcptGivUpTrnRequestT(char* testCaseNum , const char *root) {
	futBscAcptGivUpTrnRequestT vfutBscAcptGivUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscAcptGivUpTrnRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("AcptGivUpTrn.futBscAcptGivUpTrnRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscAcptGivUpTrnRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscAcptGivUpTrnRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("AcptGivUpTrn.futBscAcptGivUpTrnRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscAcptGivUpTrnRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	vfutBscAcptGivUpTrnRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscAcptGivUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscAcptGivUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("AcptGivUpTrn.futBscAcptGivUpTrnRequestT.trnDat", ltrnDat);
	memcpy(vfutBscAcptGivUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscAcptGivUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptGivUpTrn.futBscAcptGivUpTrnRequestT.ordrNo", lordrNo);
	memcpy(vfutBscAcptGivUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscAcptGivUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AcptGivUpTrn.futBscAcptGivUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscAcptGivUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscAcptGivUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "futBscAcptGivUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("AcptGivUpTrn.futBscAcptGivUpTrnRequestT.buyCod", lbuyCod);
	vfutBscAcptGivUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAcptGivUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptGivUpTrn.futBscAcptGivUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAcptGivUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAcptGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAcptGivUpTrnResponseT getFutBscAcptGivUpTrnResponseT(char* testCaseNum , const char *root) {
	futBscAcptGivUpTrnResponseT vfutBscAcptGivUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("AcptGivUpTrn.futBscAcptGivUpTrnResponseT.gutSts", lgutSts);
	vfutBscAcptGivUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAcptGivUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptGivUpTrn.futBscAcptGivUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAcptGivUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAcptGivUpTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscAcptGivUpTrnRequestT getOptBscAcptGivUpTrnRequestT(char* testCaseNum , const char *root) {
	optBscAcptGivUpTrnRequestT voptBscAcptGivUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscAcptGivUpTrnRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("AcptGivUpTrn.optBscAcptGivUpTrnRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscAcptGivUpTrnRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscAcptGivUpTrnRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("AcptGivUpTrn.optBscAcptGivUpTrnRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscAcptGivUpTrnRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	voptBscAcptGivUpTrnRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscAcptGivUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscAcptGivUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("AcptGivUpTrn.optBscAcptGivUpTrnRequestT.trnDat", ltrnDat);
	memcpy(voptBscAcptGivUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscAcptGivUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptGivUpTrn.optBscAcptGivUpTrnRequestT.ordrNo", lordrNo);
	memcpy(voptBscAcptGivUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscAcptGivUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AcptGivUpTrn.optBscAcptGivUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscAcptGivUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscAcptGivUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "optBscAcptGivUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("AcptGivUpTrn.optBscAcptGivUpTrnRequestT.buyCod", lbuyCod);
	voptBscAcptGivUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscAcptGivUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptGivUpTrn.optBscAcptGivUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscAcptGivUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscAcptGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscAcptGivUpTrnResponseT getOptBscAcptGivUpTrnResponseT(char* testCaseNum , const char *root) {
	optBscAcptGivUpTrnResponseT voptBscAcptGivUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("AcptGivUpTrn.optBscAcptGivUpTrnResponseT.gutSts", lgutSts);
	voptBscAcptGivUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscAcptGivUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptGivUpTrn.optBscAcptGivUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscAcptGivUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscAcptGivUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAcptGivUpTrnRequestT* getFutAcptGivUpTrnRequestT(char* testCaseNum) {
	vfutAcptGivUpTrnRequestT = (futAcptGivUpTrnRequestT*)malloc(sizeof(futAcptGivUpTrnRequestT));
	int i;

	vfutAcptGivUpTrnRequestT->header = getDataHeaderT(testCaseNum, "futAcptGivUpTrnRequestT");
	vfutAcptGivUpTrnRequestT->basic = getFutBscAcptGivUpTrnRequestT(testCaseNum, "futAcptGivUpTrnRequestT");
	return vfutAcptGivUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAcptGivUpTrnResponseT* getFutAcptGivUpTrnResponseT(char* testCaseNum) {
	vfutAcptGivUpTrnResponseT = (futAcptGivUpTrnResponseT*)malloc(sizeof(futAcptGivUpTrnResponseT));
	int i;

	vfutAcptGivUpTrnResponseT->header = getDataHeaderT(testCaseNum, "futAcptGivUpTrnResponseT");
	vfutAcptGivUpTrnResponseT->basic = getFutBscAcptGivUpTrnResponseT(testCaseNum, "futAcptGivUpTrnResponseT");
	return vfutAcptGivUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optAcptGivUpTrnRequestT* getOptAcptGivUpTrnRequestT(char* testCaseNum) {
	voptAcptGivUpTrnRequestT = (optAcptGivUpTrnRequestT*)malloc(sizeof(optAcptGivUpTrnRequestT));
	int i;

	voptAcptGivUpTrnRequestT->header = getDataHeaderT(testCaseNum, "optAcptGivUpTrnRequestT");
	voptAcptGivUpTrnRequestT->basic = getOptBscAcptGivUpTrnRequestT(testCaseNum, "optAcptGivUpTrnRequestT");
	return voptAcptGivUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optAcptGivUpTrnResponseT* getOptAcptGivUpTrnResponseT(char* testCaseNum) {
	voptAcptGivUpTrnResponseT = (optAcptGivUpTrnResponseT*)malloc(sizeof(optAcptGivUpTrnResponseT));
	int i;

	voptAcptGivUpTrnResponseT->header = getDataHeaderT(testCaseNum, "optAcptGivUpTrnResponseT");
	voptAcptGivUpTrnResponseT->basic = getOptBscAcptGivUpTrnResponseT(testCaseNum, "optAcptGivUpTrnResponseT");
	return voptAcptGivUpTrnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAcptGivUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAcptGivUpTrnRequestT));
	futAcptGivUpTrnRequestT *vfutAcptGivUpTrnRequestT = getFutAcptGivUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAcptGivUpTrnRequestT), (jbyte*) vfutAcptGivUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAcptGivUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAcptGivUpTrnResponseT));
	futAcptGivUpTrnResponseT *vfutAcptGivUpTrnResponseT = getFutAcptGivUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAcptGivUpTrnResponseT), (jbyte*) vfutAcptGivUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptAcptGivUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optAcptGivUpTrnRequestT));
	optAcptGivUpTrnRequestT *voptAcptGivUpTrnRequestT = getOptAcptGivUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optAcptGivUpTrnRequestT), (jbyte*) voptAcptGivUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptAcptGivUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optAcptGivUpTrnResponseT));
	optAcptGivUpTrnResponseT *voptAcptGivUpTrnResponseT = getOptAcptGivUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optAcptGivUpTrnResponseT), (jbyte*) voptAcptGivUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAcptGivUpTrnRequestT(futBscAcptGivUpTrnRequestT actual, futBscAcptGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpTrnRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpTrnRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAcptGivUpTrnResponseT(futBscAcptGivUpTrnResponseT actual, futBscAcptGivUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptGivUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscAcptGivUpTrnRequestT(optBscAcptGivUpTrnRequestT actual, optBscAcptGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpTrnRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpTrnRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscAcptGivUpTrnResponseT(optBscAcptGivUpTrnResponseT actual, optBscAcptGivUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptGivUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAcptGivUpTrnRequestT(futAcptGivUpTrnRequestT actual, futAcptGivUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAcptGivUpTrnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAcptGivUpTrnResponseT(futAcptGivUpTrnResponseT actual, futAcptGivUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAcptGivUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptAcptGivUpTrnRequestT(optAcptGivUpTrnRequestT actual, optAcptGivUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscAcptGivUpTrnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptAcptGivUpTrnResponseT(optAcptGivUpTrnResponseT actual, optAcptGivUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscAcptGivUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAcptGivUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAcptGivUpTrnRequestT *actualData = (futAcptGivUpTrnRequestT *)msgStruct;
	futAcptGivUpTrnRequestT* expectedData = getFutAcptGivUpTrnRequestT(testCaseNum);
	compareFutAcptGivUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAcptGivUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAcptGivUpTrnResponseT *actualData = (futAcptGivUpTrnResponseT *)msgStruct;
	futAcptGivUpTrnResponseT* expectedData = getFutAcptGivUpTrnResponseT(testCaseNum);
	compareFutAcptGivUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptAcptGivUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optAcptGivUpTrnRequestT *actualData = (optAcptGivUpTrnRequestT *)msgStruct;
	optAcptGivUpTrnRequestT* expectedData = getOptAcptGivUpTrnRequestT(testCaseNum);
	compareOptAcptGivUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptAcptGivUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optAcptGivUpTrnResponseT *actualData = (optAcptGivUpTrnResponseT *)msgStruct;
	optAcptGivUpTrnResponseT* expectedData = getOptAcptGivUpTrnResponseT(testCaseNum);
	compareOptAcptGivUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
