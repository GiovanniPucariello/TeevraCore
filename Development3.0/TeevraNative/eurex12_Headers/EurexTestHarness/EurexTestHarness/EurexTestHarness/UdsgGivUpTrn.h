#include <UdsgGivUpTrn.hxx>
#define BUFFER_SIZE 1000

futUdsgGivUpTrnRequestT *vfutUdsgGivUpTrnRequestT;
futUdsgGivUpTrnResponseT *vfutUdsgGivUpTrnResponseT;
optUdsgGivUpTrnRequestT *voptUdsgGivUpTrnRequestT;
optUdsgGivUpTrnResponseT *voptUdsgGivUpTrnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscUdsgGivUpTrnRequestT getFutBscUdsgGivUpTrnRequestT(char* testCaseNum , const char *root) {
	futBscUdsgGivUpTrnRequestT vfutBscUdsgGivUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscUdsgGivUpTrnRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.futBscUdsgGivUpTrnRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscUdsgGivUpTrnRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscUdsgGivUpTrnRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.futBscUdsgGivUpTrnRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscUdsgGivUpTrnRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	vfutBscUdsgGivUpTrnRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscUdsgGivUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscUdsgGivUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.futBscUdsgGivUpTrnRequestT.trnDat", ltrnDat);
	memcpy(vfutBscUdsgGivUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscUdsgGivUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.futBscUdsgGivUpTrnRequestT.ordrNo", lordrNo);
	memcpy(vfutBscUdsgGivUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscUdsgGivUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.futBscUdsgGivUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscUdsgGivUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscUdsgGivUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "futBscUdsgGivUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("UdsgGivUpTrn.futBscUdsgGivUpTrnRequestT.buyCod", lbuyCod);
	vfutBscUdsgGivUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscUdsgGivUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.futBscUdsgGivUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscUdsgGivUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscUdsgGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscUdsgGivUpTrnResponseT getFutBscUdsgGivUpTrnResponseT(char* testCaseNum , const char *root) {
	futBscUdsgGivUpTrnResponseT vfutBscUdsgGivUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("UdsgGivUpTrn.futBscUdsgGivUpTrnResponseT.gutSts", lgutSts);
	vfutBscUdsgGivUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscUdsgGivUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.futBscUdsgGivUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscUdsgGivUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscUdsgGivUpTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscUdsgGivUpTrnRequestT getOptBscUdsgGivUpTrnRequestT(char* testCaseNum , const char *root) {
	optBscUdsgGivUpTrnRequestT voptBscUdsgGivUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscUdsgGivUpTrnRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.optBscUdsgGivUpTrnRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscUdsgGivUpTrnRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscUdsgGivUpTrnRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.optBscUdsgGivUpTrnRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscUdsgGivUpTrnRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	voptBscUdsgGivUpTrnRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscUdsgGivUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscUdsgGivUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.optBscUdsgGivUpTrnRequestT.trnDat", ltrnDat);
	memcpy(voptBscUdsgGivUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscUdsgGivUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.optBscUdsgGivUpTrnRequestT.ordrNo", lordrNo);
	memcpy(voptBscUdsgGivUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscUdsgGivUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.optBscUdsgGivUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscUdsgGivUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscUdsgGivUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "optBscUdsgGivUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("UdsgGivUpTrn.optBscUdsgGivUpTrnRequestT.buyCod", lbuyCod);
	voptBscUdsgGivUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscUdsgGivUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.optBscUdsgGivUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscUdsgGivUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscUdsgGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscUdsgGivUpTrnResponseT getOptBscUdsgGivUpTrnResponseT(char* testCaseNum , const char *root) {
	optBscUdsgGivUpTrnResponseT voptBscUdsgGivUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("UdsgGivUpTrn.optBscUdsgGivUpTrnResponseT.gutSts", lgutSts);
	voptBscUdsgGivUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscUdsgGivUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("UdsgGivUpTrn.optBscUdsgGivUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscUdsgGivUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscUdsgGivUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futUdsgGivUpTrnRequestT* getFutUdsgGivUpTrnRequestT(char* testCaseNum) {
	vfutUdsgGivUpTrnRequestT = (futUdsgGivUpTrnRequestT*)malloc(sizeof(futUdsgGivUpTrnRequestT));
	int i;

	vfutUdsgGivUpTrnRequestT->header = getDataHeaderT(testCaseNum, "futUdsgGivUpTrnRequestT");
	vfutUdsgGivUpTrnRequestT->basic = getFutBscUdsgGivUpTrnRequestT(testCaseNum, "futUdsgGivUpTrnRequestT");
	return vfutUdsgGivUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futUdsgGivUpTrnResponseT* getFutUdsgGivUpTrnResponseT(char* testCaseNum) {
	vfutUdsgGivUpTrnResponseT = (futUdsgGivUpTrnResponseT*)malloc(sizeof(futUdsgGivUpTrnResponseT));
	int i;

	vfutUdsgGivUpTrnResponseT->header = getDataHeaderT(testCaseNum, "futUdsgGivUpTrnResponseT");
	vfutUdsgGivUpTrnResponseT->basic = getFutBscUdsgGivUpTrnResponseT(testCaseNum, "futUdsgGivUpTrnResponseT");
	return vfutUdsgGivUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optUdsgGivUpTrnRequestT* getOptUdsgGivUpTrnRequestT(char* testCaseNum) {
	voptUdsgGivUpTrnRequestT = (optUdsgGivUpTrnRequestT*)malloc(sizeof(optUdsgGivUpTrnRequestT));
	int i;

	voptUdsgGivUpTrnRequestT->header = getDataHeaderT(testCaseNum, "optUdsgGivUpTrnRequestT");
	voptUdsgGivUpTrnRequestT->basic = getOptBscUdsgGivUpTrnRequestT(testCaseNum, "optUdsgGivUpTrnRequestT");
	return voptUdsgGivUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optUdsgGivUpTrnResponseT* getOptUdsgGivUpTrnResponseT(char* testCaseNum) {
	voptUdsgGivUpTrnResponseT = (optUdsgGivUpTrnResponseT*)malloc(sizeof(optUdsgGivUpTrnResponseT));
	int i;

	voptUdsgGivUpTrnResponseT->header = getDataHeaderT(testCaseNum, "optUdsgGivUpTrnResponseT");
	voptUdsgGivUpTrnResponseT->basic = getOptBscUdsgGivUpTrnResponseT(testCaseNum, "optUdsgGivUpTrnResponseT");
	return voptUdsgGivUpTrnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutUdsgGivUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futUdsgGivUpTrnRequestT));
	futUdsgGivUpTrnRequestT *vfutUdsgGivUpTrnRequestT = getFutUdsgGivUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futUdsgGivUpTrnRequestT), (jbyte*) vfutUdsgGivUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutUdsgGivUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futUdsgGivUpTrnResponseT));
	futUdsgGivUpTrnResponseT *vfutUdsgGivUpTrnResponseT = getFutUdsgGivUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futUdsgGivUpTrnResponseT), (jbyte*) vfutUdsgGivUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptUdsgGivUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optUdsgGivUpTrnRequestT));
	optUdsgGivUpTrnRequestT *voptUdsgGivUpTrnRequestT = getOptUdsgGivUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optUdsgGivUpTrnRequestT), (jbyte*) voptUdsgGivUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptUdsgGivUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optUdsgGivUpTrnResponseT));
	optUdsgGivUpTrnResponseT *voptUdsgGivUpTrnResponseT = getOptUdsgGivUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optUdsgGivUpTrnResponseT), (jbyte*) voptUdsgGivUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscUdsgGivUpTrnRequestT(futBscUdsgGivUpTrnRequestT actual, futBscUdsgGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpTrnRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpTrnRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscUdsgGivUpTrnResponseT(futBscUdsgGivUpTrnResponseT actual, futBscUdsgGivUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscUdsgGivUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscUdsgGivUpTrnRequestT(optBscUdsgGivUpTrnRequestT actual, optBscUdsgGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpTrnRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpTrnRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscUdsgGivUpTrnResponseT(optBscUdsgGivUpTrnResponseT actual, optBscUdsgGivUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscUdsgGivUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutUdsgGivUpTrnRequestT(futUdsgGivUpTrnRequestT actual, futUdsgGivUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscUdsgGivUpTrnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutUdsgGivUpTrnResponseT(futUdsgGivUpTrnResponseT actual, futUdsgGivUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscUdsgGivUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptUdsgGivUpTrnRequestT(optUdsgGivUpTrnRequestT actual, optUdsgGivUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscUdsgGivUpTrnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptUdsgGivUpTrnResponseT(optUdsgGivUpTrnResponseT actual, optUdsgGivUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscUdsgGivUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutUdsgGivUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futUdsgGivUpTrnRequestT *actualData = (futUdsgGivUpTrnRequestT *)msgStruct;
	futUdsgGivUpTrnRequestT* expectedData = getFutUdsgGivUpTrnRequestT(testCaseNum);
	compareFutUdsgGivUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutUdsgGivUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futUdsgGivUpTrnResponseT *actualData = (futUdsgGivUpTrnResponseT *)msgStruct;
	futUdsgGivUpTrnResponseT* expectedData = getFutUdsgGivUpTrnResponseT(testCaseNum);
	compareFutUdsgGivUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptUdsgGivUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optUdsgGivUpTrnRequestT *actualData = (optUdsgGivUpTrnRequestT *)msgStruct;
	optUdsgGivUpTrnRequestT* expectedData = getOptUdsgGivUpTrnRequestT(testCaseNum);
	compareOptUdsgGivUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptUdsgGivUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optUdsgGivUpTrnResponseT *actualData = (optUdsgGivUpTrnResponseT *)msgStruct;
	optUdsgGivUpTrnResponseT* expectedData = getOptUdsgGivUpTrnResponseT(testCaseNum);
	compareOptUdsgGivUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
