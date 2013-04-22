#include <DelSLegMasOrdr.hxx>
#define BUFFER_SIZE 1000

futDelSLegMasOrdrRequestT *vfutDelSLegMasOrdrRequestT;
futDelSLegMasOrdrResponseT *vfutDelSLegMasOrdrResponseT;
optDelSLegMasOrdrRequestT *voptDelSLegMasOrdrRequestT;
optDelSLegMasOrdrResponseT *voptDelSLegMasOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelSLegMasOrdrGrpT getFutBscDelSLegMasOrdrGrpT(char* testCaseNum , const char *root) {
	futBscDelSLegMasOrdrGrpT vfutBscDelSLegMasOrdrGrpT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("DelSLegMasOrdr.futBscDelSLegMasOrdrGrpT.buyCod", lbuyCod);
	vfutBscDelSLegMasOrdrGrpT.buyCod = lbuyCod[0];

	vfutBscDelSLegMasOrdrGrpT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscDelSLegMasOrdrGrpT");
	vfutBscDelSLegMasOrdrGrpT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelSLegMasOrdrGrpT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscDelSLegMasOrdrGrpT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.futBscDelSLegMasOrdrGrpT.ordrNo", lordrNo);
	memcpy(vfutBscDelSLegMasOrdrGrpT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("DelSLegMasOrdr.futBscDelSLegMasOrdrGrpT.ordrTypCod", lordrTypCod);
	vfutBscDelSLegMasOrdrGrpT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutBscDelSLegMasOrdrGrpT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.futBscDelSLegMasOrdrGrpT.userOrdrRef", luserOrdrRef);
	memcpy(vfutBscDelSLegMasOrdrGrpT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);
	return vfutBscDelSLegMasOrdrGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelSLegMasOrdrRequestT getFutBscDelSLegMasOrdrRequestT(char* testCaseNum , const char *root) {
	futBscDelSLegMasOrdrRequestT vfutBscDelSLegMasOrdrRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscDelSLegMasOrdrRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.futBscDelSLegMasOrdrRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscDelSLegMasOrdrRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);
	return vfutBscDelSLegMasOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelSLegMasOrdrRecT getFutBscDelSLegMasOrdrRecT(char* testCaseNum , const char *root) {
	futBscDelSLegMasOrdrRecT vfutBscDelSLegMasOrdrRecT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		vfutBscDelSLegMasOrdrRecT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.futBscDelSLegMasOrdrRecT.rtnCod", lrtnCod);
	memcpy(vfutBscDelSLegMasOrdrRecT.rtnCod, lrtnCod, RTN_COD_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscDelSLegMasOrdrRecT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.futBscDelSLegMasOrdrRecT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutBscDelSLegMasOrdrRecT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vfutBscDelSLegMasOrdrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelSLegMasOrdrResponseT getFutBscDelSLegMasOrdrResponseT(char* testCaseNum , const char *root) {
	futBscDelSLegMasOrdrResponseT vfutBscDelSLegMasOrdrResponseT;
	int i;

	char lordrResCod[1] = {""};
	getStrProperty("DelSLegMasOrdr.futBscDelSLegMasOrdrResponseT.ordrResCod", lordrResCod);
	vfutBscDelSLegMasOrdrResponseT.ordrResCod = lordrResCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscDelSLegMasOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.futBscDelSLegMasOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(vfutBscDelSLegMasOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscDelSLegMasOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.futBscDelSLegMasOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(vfutBscDelSLegMasOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscDelSLegMasOrdrResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.futBscDelSLegMasOrdrResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscDelSLegMasOrdrResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscDelSLegMasOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelSLegMasOrdrGrpT getOptBscDelSLegMasOrdrGrpT(char* testCaseNum , const char *root) {
	optBscDelSLegMasOrdrGrpT voptBscDelSLegMasOrdrGrpT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("DelSLegMasOrdr.optBscDelSLegMasOrdrGrpT.buyCod", lbuyCod);
	voptBscDelSLegMasOrdrGrpT.buyCod = lbuyCod[0];

	voptBscDelSLegMasOrdrGrpT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscDelSLegMasOrdrGrpT");
	voptBscDelSLegMasOrdrGrpT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscDelSLegMasOrdrGrpT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscDelSLegMasOrdrGrpT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.optBscDelSLegMasOrdrGrpT.ordrNo", lordrNo);
	memcpy(voptBscDelSLegMasOrdrGrpT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("DelSLegMasOrdr.optBscDelSLegMasOrdrGrpT.ordrTypCod", lordrTypCod);
	voptBscDelSLegMasOrdrGrpT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		voptBscDelSLegMasOrdrGrpT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.optBscDelSLegMasOrdrGrpT.userOrdrRef", luserOrdrRef);
	memcpy(voptBscDelSLegMasOrdrGrpT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);
	return voptBscDelSLegMasOrdrGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelSLegMasOrdrRequestT getOptBscDelSLegMasOrdrRequestT(char* testCaseNum , const char *root) {
	optBscDelSLegMasOrdrRequestT voptBscDelSLegMasOrdrRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscDelSLegMasOrdrRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.optBscDelSLegMasOrdrRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscDelSLegMasOrdrRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);
	return voptBscDelSLegMasOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelSLegMasOrdrRecT getOptBscDelSLegMasOrdrRecT(char* testCaseNum , const char *root) {
	optBscDelSLegMasOrdrRecT voptBscDelSLegMasOrdrRecT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		voptBscDelSLegMasOrdrRecT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.optBscDelSLegMasOrdrRecT.rtnCod", lrtnCod);
	memcpy(voptBscDelSLegMasOrdrRecT.rtnCod, lrtnCod, RTN_COD_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptBscDelSLegMasOrdrRecT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.optBscDelSLegMasOrdrRecT.lstEvntTrnId", llstEvntTrnId);
	memcpy(voptBscDelSLegMasOrdrRecT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return voptBscDelSLegMasOrdrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelSLegMasOrdrResponseT getOptBscDelSLegMasOrdrResponseT(char* testCaseNum , const char *root) {
	optBscDelSLegMasOrdrResponseT voptBscDelSLegMasOrdrResponseT;
	int i;

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscDelSLegMasOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.optBscDelSLegMasOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(voptBscDelSLegMasOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscDelSLegMasOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.optBscDelSLegMasOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(voptBscDelSLegMasOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscDelSLegMasOrdrResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("DelSLegMasOrdr.optBscDelSLegMasOrdrResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscDelSLegMasOrdrResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscDelSLegMasOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelSLegMasOrdrRequestT* getFutDelSLegMasOrdrRequestT(char* testCaseNum) {
	vfutDelSLegMasOrdrRequestT = (futDelSLegMasOrdrRequestT*)malloc(sizeof(futDelSLegMasOrdrRequestT));
	int i;

	vfutDelSLegMasOrdrRequestT->header = getDataHeaderT(testCaseNum, "futDelSLegMasOrdrRequestT");
	vfutDelSLegMasOrdrRequestT->basic = getFutBscDelSLegMasOrdrRequestT(testCaseNum, "futDelSLegMasOrdrRequestT");
	return vfutDelSLegMasOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelSLegMasOrdrResponseT* getFutDelSLegMasOrdrResponseT(char* testCaseNum) {
	vfutDelSLegMasOrdrResponseT = (futDelSLegMasOrdrResponseT*)malloc(sizeof(futDelSLegMasOrdrResponseT));
	int i;

	vfutDelSLegMasOrdrResponseT->header = getDataHeaderT(testCaseNum, "futDelSLegMasOrdrResponseT");
	vfutDelSLegMasOrdrResponseT->basic = getFutBscDelSLegMasOrdrResponseT(testCaseNum, "futDelSLegMasOrdrResponseT");
	return vfutDelSLegMasOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelSLegMasOrdrRequestT* getOptDelSLegMasOrdrRequestT(char* testCaseNum) {
	voptDelSLegMasOrdrRequestT = (optDelSLegMasOrdrRequestT*)malloc(sizeof(optDelSLegMasOrdrRequestT));
	int i;

	voptDelSLegMasOrdrRequestT->header = getDataHeaderT(testCaseNum, "optDelSLegMasOrdrRequestT");
	voptDelSLegMasOrdrRequestT->basic = getOptBscDelSLegMasOrdrRequestT(testCaseNum, "optDelSLegMasOrdrRequestT");
	return voptDelSLegMasOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelSLegMasOrdrResponseT* getOptDelSLegMasOrdrResponseT(char* testCaseNum) {
	voptDelSLegMasOrdrResponseT = (optDelSLegMasOrdrResponseT*)malloc(sizeof(optDelSLegMasOrdrResponseT));
	int i;

	voptDelSLegMasOrdrResponseT->header = getDataHeaderT(testCaseNum, "optDelSLegMasOrdrResponseT");
	voptDelSLegMasOrdrResponseT->basic = getOptBscDelSLegMasOrdrResponseT(testCaseNum, "optDelSLegMasOrdrResponseT");
	return voptDelSLegMasOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelSLegMasOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelSLegMasOrdrRequestT));
	futDelSLegMasOrdrRequestT *vfutDelSLegMasOrdrRequestT = getFutDelSLegMasOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelSLegMasOrdrRequestT), (jbyte*) vfutDelSLegMasOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelSLegMasOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelSLegMasOrdrResponseT));
	futDelSLegMasOrdrResponseT *vfutDelSLegMasOrdrResponseT = getFutDelSLegMasOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelSLegMasOrdrResponseT), (jbyte*) vfutDelSLegMasOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelSLegMasOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelSLegMasOrdrRequestT));
	optDelSLegMasOrdrRequestT *voptDelSLegMasOrdrRequestT = getOptDelSLegMasOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelSLegMasOrdrRequestT), (jbyte*) voptDelSLegMasOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelSLegMasOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelSLegMasOrdrResponseT));
	optDelSLegMasOrdrResponseT *voptDelSLegMasOrdrResponseT = getOptDelSLegMasOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelSLegMasOrdrResponseT), (jbyte*) voptDelSLegMasOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelSLegMasOrdrGrpT(futBscDelSLegMasOrdrGrpT actual, futBscDelSLegMasOrdrGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegMasOrdrGrpT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegMasOrdrGrpT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegMasOrdrGrpT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegMasOrdrGrpT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelSLegMasOrdrRequestT(futBscDelSLegMasOrdrRequestT actual, futBscDelSLegMasOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegMasOrdrRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_DEL_S_LEG_MAS_ORDR_GRP_MAX;i++) {
		compareFutBscDelSLegMasOrdrGrpT (actual.futBscDelSLegMasOrdrGrp[i],expected.futBscDelSLegMasOrdrGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelSLegMasOrdrRecT(futBscDelSLegMasOrdrRecT actual, futBscDelSLegMasOrdrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegMasOrdrRecT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegMasOrdrRecT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelSLegMasOrdrResponseT(futBscDelSLegMasOrdrResponseT actual, futBscDelSLegMasOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegMasOrdrResponseT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegMasOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegMasOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegMasOrdrResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_DEL_S_LEG_MAS_ORDR_REC_MAX;i++) {
		compareFutBscDelSLegMasOrdrRecT (actual.futBscDelSLegMasOrdrRec[i],expected.futBscDelSLegMasOrdrRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelSLegMasOrdrGrpT(optBscDelSLegMasOrdrGrpT actual, optBscDelSLegMasOrdrGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegMasOrdrGrpT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegMasOrdrGrpT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegMasOrdrGrpT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegMasOrdrGrpT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelSLegMasOrdrRequestT(optBscDelSLegMasOrdrRequestT actual, optBscDelSLegMasOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegMasOrdrRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_DEL_S_LEG_MAS_ORDR_GRP_MAX;i++) {
		compareOptBscDelSLegMasOrdrGrpT (actual.optBscDelSLegMasOrdrGrp[i],expected.optBscDelSLegMasOrdrGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelSLegMasOrdrRecT(optBscDelSLegMasOrdrRecT actual, optBscDelSLegMasOrdrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegMasOrdrRecT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegMasOrdrRecT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelSLegMasOrdrResponseT(optBscDelSLegMasOrdrResponseT actual, optBscDelSLegMasOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegMasOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegMasOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegMasOrdrResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_DEL_S_LEG_MAS_ORDR_REC_MAX;i++) {
		compareOptBscDelSLegMasOrdrRecT (actual.optBscDelSLegMasOrdrRec[i],expected.optBscDelSLegMasOrdrRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelSLegMasOrdrRequestT(futDelSLegMasOrdrRequestT actual, futDelSLegMasOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelSLegMasOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelSLegMasOrdrResponseT(futDelSLegMasOrdrResponseT actual, futDelSLegMasOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelSLegMasOrdrResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelSLegMasOrdrRequestT(optDelSLegMasOrdrRequestT actual, optDelSLegMasOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelSLegMasOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelSLegMasOrdrResponseT(optDelSLegMasOrdrResponseT actual, optDelSLegMasOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelSLegMasOrdrResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelSLegMasOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelSLegMasOrdrRequestT *actualData = (futDelSLegMasOrdrRequestT *)msgStruct;
	futDelSLegMasOrdrRequestT* expectedData = getFutDelSLegMasOrdrRequestT(testCaseNum);
	compareFutDelSLegMasOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelSLegMasOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelSLegMasOrdrResponseT *actualData = (futDelSLegMasOrdrResponseT *)msgStruct;
	futDelSLegMasOrdrResponseT* expectedData = getFutDelSLegMasOrdrResponseT(testCaseNum);
	compareFutDelSLegMasOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelSLegMasOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelSLegMasOrdrRequestT *actualData = (optDelSLegMasOrdrRequestT *)msgStruct;
	optDelSLegMasOrdrRequestT* expectedData = getOptDelSLegMasOrdrRequestT(testCaseNum);
	compareOptDelSLegMasOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelSLegMasOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelSLegMasOrdrResponseT *actualData = (optDelSLegMasOrdrResponseT *)msgStruct;
	optDelSLegMasOrdrResponseT* expectedData = getOptDelSLegMasOrdrResponseT(testCaseNum);
	compareOptDelSLegMasOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
