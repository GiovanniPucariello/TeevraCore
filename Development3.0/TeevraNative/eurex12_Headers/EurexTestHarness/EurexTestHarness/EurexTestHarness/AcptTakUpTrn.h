#include <AcptTakUpTrn.hxx>
#define BUFFER_SIZE 1000

futAcptTakUpTrnRequestT *vfutAcptTakUpTrnRequestT;
futAcptTakUpTrnResponseT *vfutAcptTakUpTrnResponseT;
optAcptTakUpTrnRequestT *voptAcptTakUpTrnRequestT;
optAcptTakUpTrnResponseT *voptAcptTakUpTrnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAcptTakUpTrnRequestT getFutBscAcptTakUpTrnRequestT(char* testCaseNum , const char *root) {
	futBscAcptTakUpTrnRequestT vfutBscAcptTakUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		vfutBscAcptTakUpTrnRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("AcptTakUpTrn.futBscAcptTakUpTrnRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(vfutBscAcptTakUpTrnRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscAcptTakUpTrnRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("AcptTakUpTrn.futBscAcptTakUpTrnRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscAcptTakUpTrnRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	vfutBscAcptTakUpTrnRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscAcptTakUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscAcptTakUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("AcptTakUpTrn.futBscAcptTakUpTrnRequestT.trnDat", ltrnDat);
	memcpy(vfutBscAcptTakUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscAcptTakUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptTakUpTrn.futBscAcptTakUpTrnRequestT.ordrNo", lordrNo);
	memcpy(vfutBscAcptTakUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscAcptTakUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AcptTakUpTrn.futBscAcptTakUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscAcptTakUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscAcptTakUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "futBscAcptTakUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("AcptTakUpTrn.futBscAcptTakUpTrnRequestT.buyCod", lbuyCod);
	vfutBscAcptTakUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAcptTakUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptTakUpTrn.futBscAcptTakUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAcptTakUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAcptTakUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscAcptTakUpTrnResponseT getFutBscAcptTakUpTrnResponseT(char* testCaseNum , const char *root) {
	futBscAcptTakUpTrnResponseT vfutBscAcptTakUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("AcptTakUpTrn.futBscAcptTakUpTrnResponseT.gutSts", lgutSts);
	vfutBscAcptTakUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscAcptTakUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptTakUpTrn.futBscAcptTakUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscAcptTakUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscAcptTakUpTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscAcptTakUpTrnRequestT getOptBscAcptTakUpTrnRequestT(char* testCaseNum , const char *root) {
	optBscAcptTakUpTrnRequestT voptBscAcptTakUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		voptBscAcptTakUpTrnRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("AcptTakUpTrn.optBscAcptTakUpTrnRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(voptBscAcptTakUpTrnRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscAcptTakUpTrnRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("AcptTakUpTrn.optBscAcptTakUpTrnRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscAcptTakUpTrnRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	voptBscAcptTakUpTrnRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscAcptTakUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscAcptTakUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("AcptTakUpTrn.optBscAcptTakUpTrnRequestT.trnDat", ltrnDat);
	memcpy(voptBscAcptTakUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscAcptTakUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptTakUpTrn.optBscAcptTakUpTrnRequestT.ordrNo", lordrNo);
	memcpy(voptBscAcptTakUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscAcptTakUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AcptTakUpTrn.optBscAcptTakUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscAcptTakUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscAcptTakUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "optBscAcptTakUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("AcptTakUpTrn.optBscAcptTakUpTrnRequestT.buyCod", lbuyCod);
	voptBscAcptTakUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscAcptTakUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptTakUpTrn.optBscAcptTakUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscAcptTakUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscAcptTakUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscAcptTakUpTrnResponseT getOptBscAcptTakUpTrnResponseT(char* testCaseNum , const char *root) {
	optBscAcptTakUpTrnResponseT voptBscAcptTakUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("AcptTakUpTrn.optBscAcptTakUpTrnResponseT.gutSts", lgutSts);
	voptBscAcptTakUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscAcptTakUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptTakUpTrn.optBscAcptTakUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscAcptTakUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscAcptTakUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAcptTakUpTrnRequestT* getFutAcptTakUpTrnRequestT(char* testCaseNum) {
	vfutAcptTakUpTrnRequestT = (futAcptTakUpTrnRequestT*)malloc(sizeof(futAcptTakUpTrnRequestT));
	int i;

	vfutAcptTakUpTrnRequestT->header = getDataHeaderT(testCaseNum, "futAcptTakUpTrnRequestT");
	vfutAcptTakUpTrnRequestT->basic = getFutBscAcptTakUpTrnRequestT(testCaseNum, "futAcptTakUpTrnRequestT");
	return vfutAcptTakUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futAcptTakUpTrnResponseT* getFutAcptTakUpTrnResponseT(char* testCaseNum) {
	vfutAcptTakUpTrnResponseT = (futAcptTakUpTrnResponseT*)malloc(sizeof(futAcptTakUpTrnResponseT));
	int i;

	vfutAcptTakUpTrnResponseT->header = getDataHeaderT(testCaseNum, "futAcptTakUpTrnResponseT");
	vfutAcptTakUpTrnResponseT->basic = getFutBscAcptTakUpTrnResponseT(testCaseNum, "futAcptTakUpTrnResponseT");
	return vfutAcptTakUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optAcptTakUpTrnRequestT* getOptAcptTakUpTrnRequestT(char* testCaseNum) {
	voptAcptTakUpTrnRequestT = (optAcptTakUpTrnRequestT*)malloc(sizeof(optAcptTakUpTrnRequestT));
	int i;

	voptAcptTakUpTrnRequestT->header = getDataHeaderT(testCaseNum, "optAcptTakUpTrnRequestT");
	voptAcptTakUpTrnRequestT->basic = getOptBscAcptTakUpTrnRequestT(testCaseNum, "optAcptTakUpTrnRequestT");
	return voptAcptTakUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optAcptTakUpTrnResponseT* getOptAcptTakUpTrnResponseT(char* testCaseNum) {
	voptAcptTakUpTrnResponseT = (optAcptTakUpTrnResponseT*)malloc(sizeof(optAcptTakUpTrnResponseT));
	int i;

	voptAcptTakUpTrnResponseT->header = getDataHeaderT(testCaseNum, "optAcptTakUpTrnResponseT");
	voptAcptTakUpTrnResponseT->basic = getOptBscAcptTakUpTrnResponseT(testCaseNum, "optAcptTakUpTrnResponseT");
	return voptAcptTakUpTrnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAcptTakUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAcptTakUpTrnRequestT));
	futAcptTakUpTrnRequestT *vfutAcptTakUpTrnRequestT = getFutAcptTakUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAcptTakUpTrnRequestT), (jbyte*) vfutAcptTakUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutAcptTakUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futAcptTakUpTrnResponseT));
	futAcptTakUpTrnResponseT *vfutAcptTakUpTrnResponseT = getFutAcptTakUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futAcptTakUpTrnResponseT), (jbyte*) vfutAcptTakUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptAcptTakUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optAcptTakUpTrnRequestT));
	optAcptTakUpTrnRequestT *voptAcptTakUpTrnRequestT = getOptAcptTakUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optAcptTakUpTrnRequestT), (jbyte*) voptAcptTakUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptAcptTakUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optAcptTakUpTrnResponseT));
	optAcptTakUpTrnResponseT *voptAcptTakUpTrnResponseT = getOptAcptTakUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optAcptTakUpTrnResponseT), (jbyte*) voptAcptTakUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAcptTakUpTrnRequestT(futBscAcptTakUpTrnRequestT actual, futBscAcptTakUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpTrnRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpTrnRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscAcptTakUpTrnResponseT(futBscAcptTakUpTrnResponseT actual, futBscAcptTakUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscAcptTakUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscAcptTakUpTrnRequestT(optBscAcptTakUpTrnRequestT actual, optBscAcptTakUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpTrnRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpTrnRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscAcptTakUpTrnResponseT(optBscAcptTakUpTrnResponseT actual, optBscAcptTakUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscAcptTakUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAcptTakUpTrnRequestT(futAcptTakUpTrnRequestT actual, futAcptTakUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAcptTakUpTrnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutAcptTakUpTrnResponseT(futAcptTakUpTrnResponseT actual, futAcptTakUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscAcptTakUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptAcptTakUpTrnRequestT(optAcptTakUpTrnRequestT actual, optAcptTakUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscAcptTakUpTrnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptAcptTakUpTrnResponseT(optAcptTakUpTrnResponseT actual, optAcptTakUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscAcptTakUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAcptTakUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAcptTakUpTrnRequestT *actualData = (futAcptTakUpTrnRequestT *)msgStruct;
	futAcptTakUpTrnRequestT* expectedData = getFutAcptTakUpTrnRequestT(testCaseNum);
	compareFutAcptTakUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutAcptTakUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futAcptTakUpTrnResponseT *actualData = (futAcptTakUpTrnResponseT *)msgStruct;
	futAcptTakUpTrnResponseT* expectedData = getFutAcptTakUpTrnResponseT(testCaseNum);
	compareFutAcptTakUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptAcptTakUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optAcptTakUpTrnRequestT *actualData = (optAcptTakUpTrnRequestT *)msgStruct;
	optAcptTakUpTrnRequestT* expectedData = getOptAcptTakUpTrnRequestT(testCaseNum);
	compareOptAcptTakUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptAcptTakUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optAcptTakUpTrnResponseT *actualData = (optAcptTakUpTrnResponseT *)msgStruct;
	optAcptTakUpTrnResponseT* expectedData = getOptAcptTakUpTrnResponseT(testCaseNum);
	compareOptAcptTakUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
