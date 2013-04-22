#include <DelMasQuo.hxx>
#define BUFFER_SIZE 1000

optDelMasQuoRequestT *voptDelMasQuoRequestT;
optDelMasQuoResponseT *voptDelMasQuoResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelMasQuoRequestT getOptBscDelMasQuoRequestT(char* testCaseNum , const char *root) {
	optBscDelMasQuoRequestT voptBscDelMasQuoRequestT;
	int i;

	voptBscDelMasQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscDelMasQuoRequestT");
	char lsuppQuoConfInd[1] = {""};
	getStrProperty("DelMasQuo.optBscDelMasQuoRequestT.suppQuoConfInd", lsuppQuoConfInd);
	voptBscDelMasQuoRequestT.suppQuoConfInd = lsuppQuoConfInd[0];

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscDelMasQuoRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("DelMasQuo.optBscDelMasQuoRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscDelMasQuoRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);
	return voptBscDelMasQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelMasQuoRecT getOptBscDelMasQuoRecT(char* testCaseNum , const char *root) {
	optBscDelMasQuoRecT voptBscDelMasQuoRecT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		voptBscDelMasQuoRecT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("DelMasQuo.optBscDelMasQuoRecT.rtnCod", lrtnCod);
	memcpy(voptBscDelMasQuoRecT.rtnCod, lrtnCod, RTN_COD_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptBscDelMasQuoRecT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelMasQuo.optBscDelMasQuoRecT.lstEvntTrnId", llstEvntTrnId);
	memcpy(voptBscDelMasQuoRecT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return voptBscDelMasQuoRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelMasQuoResponseT getOptBscDelMasQuoResponseT(char* testCaseNum , const char *root) {
	optBscDelMasQuoResponseT voptBscDelMasQuoResponseT;
	int i;

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscDelMasQuoResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelMasQuo.optBscDelMasQuoResponseT.lstEvntDat", llstEvntDat);
	memcpy(voptBscDelMasQuoResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscDelMasQuoResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelMasQuo.optBscDelMasQuoResponseT.lstEvntTim", llstEvntTim);
	memcpy(voptBscDelMasQuoResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscDelMasQuoResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("DelMasQuo.optBscDelMasQuoResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscDelMasQuoResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscDelMasQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelMasQuoRequestT* getOptDelMasQuoRequestT(char* testCaseNum) {
	voptDelMasQuoRequestT = (optDelMasQuoRequestT*)malloc(sizeof(optDelMasQuoRequestT));
	int i;

	voptDelMasQuoRequestT->header = getDataHeaderT(testCaseNum, "optDelMasQuoRequestT");
	voptDelMasQuoRequestT->basic = getOptBscDelMasQuoRequestT(testCaseNum, "optDelMasQuoRequestT");
	return voptDelMasQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelMasQuoResponseT* getOptDelMasQuoResponseT(char* testCaseNum) {
	voptDelMasQuoResponseT = (optDelMasQuoResponseT*)malloc(sizeof(optDelMasQuoResponseT));
	int i;

	voptDelMasQuoResponseT->header = getDataHeaderT(testCaseNum, "optDelMasQuoResponseT");
	voptDelMasQuoResponseT->basic = getOptBscDelMasQuoResponseT(testCaseNum, "optDelMasQuoResponseT");
	return voptDelMasQuoResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelMasQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelMasQuoRequestT));
	optDelMasQuoRequestT *voptDelMasQuoRequestT = getOptDelMasQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelMasQuoRequestT), (jbyte*) voptDelMasQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelMasQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelMasQuoResponseT));
	optDelMasQuoResponseT *voptDelMasQuoResponseT = getOptDelMasQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelMasQuoResponseT), (jbyte*) voptDelMasQuoResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelMasQuoRequestT(optBscDelMasQuoRequestT actual, optBscDelMasQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.suppQuoConfInd!= expected.suppQuoConfInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelMasQuoRequestT, suppQuoConfIndnot matching. Actual %d but Expected %d", actual.suppQuoConfInd, expected.suppQuoConfInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelMasQuoRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_DEL_MAS_QUO_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelMasQuoRecT(optBscDelMasQuoRecT actual, optBscDelMasQuoRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelMasQuoRecT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelMasQuoRecT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelMasQuoResponseT(optBscDelMasQuoResponseT actual, optBscDelMasQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelMasQuoResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelMasQuoResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelMasQuoResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_DEL_MAS_QUO_REC_MAX;i++) {
		compareOptBscDelMasQuoRecT (actual.optBscDelMasQuoRec[i],expected.optBscDelMasQuoRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelMasQuoRequestT(optDelMasQuoRequestT actual, optDelMasQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelMasQuoRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelMasQuoResponseT(optDelMasQuoResponseT actual, optDelMasQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelMasQuoResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelMasQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelMasQuoRequestT *actualData = (optDelMasQuoRequestT *)msgStruct;
	optDelMasQuoRequestT* expectedData = getOptDelMasQuoRequestT(testCaseNum);
	compareOptDelMasQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelMasQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelMasQuoResponseT *actualData = (optDelMasQuoResponseT *)msgStruct;
	optDelMasQuoResponseT* expectedData = getOptDelMasQuoResponseT(testCaseNum);
	compareOptDelMasQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
