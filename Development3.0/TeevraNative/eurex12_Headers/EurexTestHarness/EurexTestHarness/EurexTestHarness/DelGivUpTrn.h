#include <DelGivUpTrn.hxx>
#define BUFFER_SIZE 1000

futDelGivUpTrnRequestT *vfutDelGivUpTrnRequestT;
futDelGivUpTrnResponseT *vfutDelGivUpTrnResponseT;
optDelGivUpTrnRequestT *voptDelGivUpTrnRequestT;
optDelGivUpTrnResponseT *voptDelGivUpTrnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelGivUpTrnRequestT getFutBscDelGivUpTrnRequestT(char* testCaseNum , const char *root) {
	futBscDelGivUpTrnRequestT vfutBscDelGivUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscDelGivUpTrnRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("DelGivUpTrn.futBscDelGivUpTrnRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscDelGivUpTrnRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscDelGivUpTrnRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("DelGivUpTrn.futBscDelGivUpTrnRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscDelGivUpTrnRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	vfutBscDelGivUpTrnRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscDelGivUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscDelGivUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelGivUpTrn.futBscDelGivUpTrnRequestT.trnDat", ltrnDat);
	memcpy(vfutBscDelGivUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscDelGivUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelGivUpTrn.futBscDelGivUpTrnRequestT.ordrNo", lordrNo);
	memcpy(vfutBscDelGivUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscDelGivUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DelGivUpTrn.futBscDelGivUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscDelGivUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscDelGivUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "futBscDelGivUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("DelGivUpTrn.futBscDelGivUpTrnRequestT.buyCod", lbuyCod);
	vfutBscDelGivUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscDelGivUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelGivUpTrn.futBscDelGivUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscDelGivUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscDelGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelGivUpTrnResponseT getFutBscDelGivUpTrnResponseT(char* testCaseNum , const char *root) {
	futBscDelGivUpTrnResponseT vfutBscDelGivUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("DelGivUpTrn.futBscDelGivUpTrnResponseT.gutSts", lgutSts);
	vfutBscDelGivUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscDelGivUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelGivUpTrn.futBscDelGivUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscDelGivUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscDelGivUpTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelGivUpTrnRequestT getOptBscDelGivUpTrnRequestT(char* testCaseNum , const char *root) {
	optBscDelGivUpTrnRequestT voptBscDelGivUpTrnRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscDelGivUpTrnRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("DelGivUpTrn.optBscDelGivUpTrnRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscDelGivUpTrnRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscDelGivUpTrnRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("DelGivUpTrn.optBscDelGivUpTrnRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscDelGivUpTrnRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	voptBscDelGivUpTrnRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscDelGivUpTrnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscDelGivUpTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelGivUpTrn.optBscDelGivUpTrnRequestT.trnDat", ltrnDat);
	memcpy(voptBscDelGivUpTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscDelGivUpTrnRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelGivUpTrn.optBscDelGivUpTrnRequestT.ordrNo", lordrNo);
	memcpy(voptBscDelGivUpTrnRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscDelGivUpTrnRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DelGivUpTrn.optBscDelGivUpTrnRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscDelGivUpTrnRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscDelGivUpTrnRequestT.trnIdSfxKeyGrp = getTrnIdSfxKeyGrpT(testCaseNum, "optBscDelGivUpTrnRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("DelGivUpTrn.optBscDelGivUpTrnRequestT.buyCod", lbuyCod);
	voptBscDelGivUpTrnRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscDelGivUpTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelGivUpTrn.optBscDelGivUpTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscDelGivUpTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscDelGivUpTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelGivUpTrnResponseT getOptBscDelGivUpTrnResponseT(char* testCaseNum , const char *root) {
	optBscDelGivUpTrnResponseT voptBscDelGivUpTrnResponseT;
	int i;

	char lgutSts[1] = {""};
	getStrProperty("DelGivUpTrn.optBscDelGivUpTrnResponseT.gutSts", lgutSts);
	voptBscDelGivUpTrnResponseT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscDelGivUpTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelGivUpTrn.optBscDelGivUpTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscDelGivUpTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscDelGivUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelGivUpTrnRequestT* getFutDelGivUpTrnRequestT(char* testCaseNum) {
	vfutDelGivUpTrnRequestT = (futDelGivUpTrnRequestT*)malloc(sizeof(futDelGivUpTrnRequestT));
	int i;

	vfutDelGivUpTrnRequestT->header = getDataHeaderT(testCaseNum, "futDelGivUpTrnRequestT");
	vfutDelGivUpTrnRequestT->basic = getFutBscDelGivUpTrnRequestT(testCaseNum, "futDelGivUpTrnRequestT");
	return vfutDelGivUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelGivUpTrnResponseT* getFutDelGivUpTrnResponseT(char* testCaseNum) {
	vfutDelGivUpTrnResponseT = (futDelGivUpTrnResponseT*)malloc(sizeof(futDelGivUpTrnResponseT));
	int i;

	vfutDelGivUpTrnResponseT->header = getDataHeaderT(testCaseNum, "futDelGivUpTrnResponseT");
	vfutDelGivUpTrnResponseT->basic = getFutBscDelGivUpTrnResponseT(testCaseNum, "futDelGivUpTrnResponseT");
	return vfutDelGivUpTrnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelGivUpTrnRequestT* getOptDelGivUpTrnRequestT(char* testCaseNum) {
	voptDelGivUpTrnRequestT = (optDelGivUpTrnRequestT*)malloc(sizeof(optDelGivUpTrnRequestT));
	int i;

	voptDelGivUpTrnRequestT->header = getDataHeaderT(testCaseNum, "optDelGivUpTrnRequestT");
	voptDelGivUpTrnRequestT->basic = getOptBscDelGivUpTrnRequestT(testCaseNum, "optDelGivUpTrnRequestT");
	return voptDelGivUpTrnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelGivUpTrnResponseT* getOptDelGivUpTrnResponseT(char* testCaseNum) {
	voptDelGivUpTrnResponseT = (optDelGivUpTrnResponseT*)malloc(sizeof(optDelGivUpTrnResponseT));
	int i;

	voptDelGivUpTrnResponseT->header = getDataHeaderT(testCaseNum, "optDelGivUpTrnResponseT");
	voptDelGivUpTrnResponseT->basic = getOptBscDelGivUpTrnResponseT(testCaseNum, "optDelGivUpTrnResponseT");
	return voptDelGivUpTrnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelGivUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelGivUpTrnRequestT));
	futDelGivUpTrnRequestT *vfutDelGivUpTrnRequestT = getFutDelGivUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelGivUpTrnRequestT), (jbyte*) vfutDelGivUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelGivUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelGivUpTrnResponseT));
	futDelGivUpTrnResponseT *vfutDelGivUpTrnResponseT = getFutDelGivUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelGivUpTrnResponseT), (jbyte*) vfutDelGivUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelGivUpTrnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelGivUpTrnRequestT));
	optDelGivUpTrnRequestT *voptDelGivUpTrnRequestT = getOptDelGivUpTrnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelGivUpTrnRequestT), (jbyte*) voptDelGivUpTrnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelGivUpTrnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelGivUpTrnResponseT));
	optDelGivUpTrnResponseT *voptDelGivUpTrnResponseT = getOptDelGivUpTrnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelGivUpTrnResponseT), (jbyte*) voptDelGivUpTrnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelGivUpTrnRequestT(futBscDelGivUpTrnRequestT actual, futBscDelGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpTrnRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpTrnRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelGivUpTrnResponseT(futBscDelGivUpTrnResponseT actual, futBscDelGivUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelGivUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelGivUpTrnRequestT(optBscDelGivUpTrnRequestT actual, optBscDelGivUpTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpTrnRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpTrnRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpTrnRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpTrnRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxKeyGrpT (actual.trnIdSfxKeyGrp,expected.trnIdSfxKeyGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpTrnRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelGivUpTrnResponseT(optBscDelGivUpTrnResponseT actual, optBscDelGivUpTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpTrnResponseT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelGivUpTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelGivUpTrnRequestT(futDelGivUpTrnRequestT actual, futDelGivUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelGivUpTrnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelGivUpTrnResponseT(futDelGivUpTrnResponseT actual, futDelGivUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelGivUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelGivUpTrnRequestT(optDelGivUpTrnRequestT actual, optDelGivUpTrnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelGivUpTrnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelGivUpTrnResponseT(optDelGivUpTrnResponseT actual, optDelGivUpTrnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelGivUpTrnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelGivUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelGivUpTrnRequestT *actualData = (futDelGivUpTrnRequestT *)msgStruct;
	futDelGivUpTrnRequestT* expectedData = getFutDelGivUpTrnRequestT(testCaseNum);
	compareFutDelGivUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelGivUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelGivUpTrnResponseT *actualData = (futDelGivUpTrnResponseT *)msgStruct;
	futDelGivUpTrnResponseT* expectedData = getFutDelGivUpTrnResponseT(testCaseNum);
	compareFutDelGivUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelGivUpTrnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelGivUpTrnRequestT *actualData = (optDelGivUpTrnRequestT *)msgStruct;
	optDelGivUpTrnRequestT* expectedData = getOptDelGivUpTrnRequestT(testCaseNum);
	compareOptDelGivUpTrnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelGivUpTrnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelGivUpTrnResponseT *actualData = (optDelGivUpTrnResponseT *)msgStruct;
	optDelGivUpTrnResponseT* expectedData = getOptDelGivUpTrnResponseT(testCaseNum);
	compareOptDelGivUpTrnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
