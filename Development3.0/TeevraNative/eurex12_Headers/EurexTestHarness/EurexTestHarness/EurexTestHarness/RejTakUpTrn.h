#include <RejTakUpTrn.hxx>
#define BUFFER_SIZE 1000

futRejTakUpTrnRequestT *vfutRejTakUpTrnRequestT;
futRejTakUpTrnResponseT *vfutRejTakUpTrnResponseT;
optRejTakUpTrnRequestT *voptRejTakUpTrnRequestT;
optRejTakUpTrnResponseT *voptRejTakUpTrnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscRejTakUpTrnRequestT getFutBscRejTakUpTrnRequestT(char* testCaseNum , const char *root) {
	futBscRejTakUpTrnRequestT vfutBscRejTakUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		vfutBscRejTakUpTrnRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("RejTakUpTrn.futBscRejTakUpTrnRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(vfutBscRejTakUpTrnRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscRejTakUpTrnRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("RejTakUpTrn.futBscRejTakUpTrnRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscRejTakUpTrnRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	vfutBscRejTakUpTrnRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscRejTakUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscRejTakUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("RejTakUpTrn.futBscRejTakUpTrnRequestT.trnDat", ltrnDat);
	memcpy(vfutBscRejTakUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscRejTakUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("RejTakUpTrn.futBscRejTakUpTrnRequestT.ordrNo", lordrNo);
	memcpy(vfutBscRejTakUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscRejTakUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("RejTakUpTrn.futBscRejTakUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscRejTakUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscRejTakUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "futBscRejTakUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("RejTakUpTrn.futBscRejTakUpTrnRequestT.buyCod", lbuyCod);
	vfutBscRejTakUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscRejTakUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("RejTakUpTrn.futBscRejTakUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscRejTakUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscRejTakUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscRejTakUpTrnResponseT getFutBscRejTakUpTrnResponseT(char* testCaseNum , const char *root) {
	futBscRejTakUpTrnResponseT vfutBscRejTakUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("RejTakUpTrn.futBscRejTakUpTrnResponseT.gutSts", lgutSts);
	vfutBscRejTakUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscRejTakUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("RejTakUpTrn.futBscRejTakUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscRejTakUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscRejTakUpTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscRejTakUpTrnRequestT getOptBscRejTakUpTrnRequestT(char* testCaseNum , const char *root) {
	optBscRejTakUpTrnRequestT voptBscRejTakUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		voptBscRejTakUpTrnRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("RejTakUpTrn.optBscRejTakUpTrnRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(voptBscRejTakUpTrnRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscRejTakUpTrnRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("RejTakUpTrn.optBscRejTakUpTrnRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscRejTakUpTrnRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	voptBscRejTakUpTrnRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscRejTakUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscRejTakUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("RejTakUpTrn.optBscRejTakUpTrnRequestT.trnDat", ltrnDat);
	memcpy(voptBscRejTakUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscRejTakUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("RejTakUpTrn.optBscRejTakUpTrnRequestT.ordrNo", lordrNo);
	memcpy(voptBscRejTakUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscRejTakUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("RejTakUpTrn.optBscRejTakUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscRejTakUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscRejTakUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "optBscRejTakUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("RejTakUpTrn.optBscRejTakUpTrnRequestT.buyCod", lbuyCod);
	voptBscRejTakUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscRejTakUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("RejTakUpTrn.optBscRejTakUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscRejTakUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscRejTakUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscRejTakUpTrnResponseT getOptBscRejTakUpTrnResponseT(char* testCaseNum , const char *root) {
	optBscRejTakUpTrnResponseT voptBscRejTakUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("RejTakUpTrn.optBscRejTakUpTrnResponseT.gutSts", lgutSts);
	voptBscRejTakUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscRejTakUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("RejTakUpTrn.optBscRejTakUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscRejTakUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscRejTakUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futRejTakUpTrnRequestT* getFutRejTakUpTrnRequestT(char* testCaseNum) {
	vfutRejTakUpTrnRequestT = (futRejTakUpTrnRequestT*)malloc(sizeof(futRejTakUpTrnRequestT));
	int i;

	vfutRejTakUpTrnRequestT->header = getDataHeaderT(testCaseNum, "futRejTakUpTrnRequestT");
	vfutRejTakUpTrnRequestT->basic = getFutBscRejTakUpTrnRequestT(testCaseNum, "futRejTakUpTrnRequestT");
	return vfutRejTakUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futRejTakUpTrnResponseT* getFutRejTakUpTrnResponseT(char* testCaseNum) {
	vfutRejTakUpTrnResponseT = (futRejTakUpTrnResponseT*)malloc(sizeof(futRejTakUpTrnResponseT));
	int i;

	vfutRejTakUpTrnResponseT->header = getDataHeaderT(testCaseNum, "futRejTakUpTrnResponseT");
	vfutRejTakUpTrnResponseT->basic = getFutBscRejTakUpTrnResponseT(testCaseNum, "futRejTakUpTrnResponseT");
	return vfutRejTakUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optRejTakUpTrnRequestT* getOptRejTakUpTrnRequestT(char* testCaseNum) {
	voptRejTakUpTrnRequestT = (optRejTakUpTrnRequestT*)malloc(sizeof(optRejTakUpTrnRequestT));
	int i;

	voptRejTakUpTrnRequestT->header = getDataHeaderT(testCaseNum, "optRejTakUpTrnRequestT");
	voptRejTakUpTrnRequestT->basic = getOptBscRejTakUpTrnRequestT(testCaseNum, "optRejTakUpTrnRequestT");
	return voptRejTakUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optRejTakUpTrnResponseT* getOptRejTakUpTrnResponseT(char* testCaseNum) {
	voptRejTakUpTrnResponseT = (optRejTakUpTrnResponseT*)malloc(sizeof(optRejTakUpTrnResponseT));
	int i;

	voptRejTakUpTrnResponseT->header = getDataHeaderT(testCaseNum, "optRejTakUpTrnResponseT");
	voptRejTakUpTrnResponseT->basic = getOptBscRejTakUpTrnResponseT(testCaseNum, "optRejTakUpTrnResponseT");
	return voptRejTakUpTrnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutRejTakUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futRejTakUpTrnRequestT));
	futRejTakUpTrnRequestT *vfutRejTakUpTrnRequestT = getFutRejTakUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futRejTakUpTrnRequestT), (jbyte*) vfutRejTakUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutRejTakUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futRejTakUpTrnResponseT));
	futRejTakUpTrnResponseT *vfutRejTakUpTrnResponseT = getFutRejTakUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futRejTakUpTrnResponseT), (jbyte*) vfutRejTakUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptRejTakUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optRejTakUpTrnRequestT));
	optRejTakUpTrnRequestT *voptRejTakUpTrnRequestT = getOptRejTakUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optRejTakUpTrnRequestT), (jbyte*) voptRejTakUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptRejTakUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optRejTakUpTrnResponseT));
	optRejTakUpTrnResponseT *voptRejTakUpTrnResponseT = getOptRejTakUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optRejTakUpTrnResponseT), (jbyte*) voptRejTakUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscRejTakUpTrnRequestT(futBscRejTakUpTrnRequestT actual, futBscRejTakUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpTrnRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpTrnRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscRejTakUpTrnResponseT(futBscRejTakUpTrnResponseT actual, futBscRejTakUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscRejTakUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscRejTakUpTrnRequestT(optBscRejTakUpTrnRequestT actual, optBscRejTakUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpTrnRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpTrnRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscRejTakUpTrnResponseT(optBscRejTakUpTrnResponseT actual, optBscRejTakUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscRejTakUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutRejTakUpTrnRequestT(futRejTakUpTrnRequestT actual, futRejTakUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscRejTakUpTrnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutRejTakUpTrnResponseT(futRejTakUpTrnResponseT actual, futRejTakUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscRejTakUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptRejTakUpTrnRequestT(optRejTakUpTrnRequestT actual, optRejTakUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscRejTakUpTrnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptRejTakUpTrnResponseT(optRejTakUpTrnResponseT actual, optRejTakUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscRejTakUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutRejTakUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futRejTakUpTrnRequestT *actualData = (futRejTakUpTrnRequestT *)msgStruct;
	futRejTakUpTrnRequestT* expectedData = getFutRejTakUpTrnRequestT(testCaseNum);
	compareFutRejTakUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutRejTakUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futRejTakUpTrnResponseT *actualData = (futRejTakUpTrnResponseT *)msgStruct;
	futRejTakUpTrnResponseT* expectedData = getFutRejTakUpTrnResponseT(testCaseNum);
	compareFutRejTakUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptRejTakUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optRejTakUpTrnRequestT *actualData = (optRejTakUpTrnRequestT *)msgStruct;
	optRejTakUpTrnRequestT* expectedData = getOptRejTakUpTrnRequestT(testCaseNum);
	compareOptRejTakUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptRejTakUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optRejTakUpTrnResponseT *actualData = (optRejTakUpTrnResponseT *)msgStruct;
	optRejTakUpTrnResponseT* expectedData = getOptRejTakUpTrnResponseT(testCaseNum);
	compareOptRejTakUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
