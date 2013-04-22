#include <DelDLegMasOrdr.hxx>
#define BUFFER_SIZE 1000

futDelDLegMasOrdrRequestT *vfutDelDLegMasOrdrRequestT;
futDelDLegMasOrdrResponseT *vfutDelDLegMasOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelDLegMasOrdrGrpT getFutBscDelDLegMasOrdrGrpT(char* testCaseNum , const char *root) {
	futBscDelDLegMasOrdrGrpT vfutBscDelDLegMasOrdrGrpT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("DelDLegMasOrdr.futBscDelDLegMasOrdrGrpT.buyCod", lbuyCod);
	vfutBscDelDLegMasOrdrGrpT.buyCod = lbuyCod[0];

	vfutBscDelDLegMasOrdrGrpT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscDelDLegMasOrdrGrpT");
	vfutBscDelDLegMasOrdrGrpT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscDelDLegMasOrdrGrpT");
	vfutBscDelDLegMasOrdrGrpT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelDLegMasOrdrGrpT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscDelDLegMasOrdrGrpT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelDLegMasOrdr.futBscDelDLegMasOrdrGrpT.ordrNo", lordrNo);
	memcpy(vfutBscDelDLegMasOrdrGrpT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("DelDLegMasOrdr.futBscDelDLegMasOrdrGrpT.ordrTypCod", lordrTypCod);
	vfutBscDelDLegMasOrdrGrpT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutBscDelDLegMasOrdrGrpT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("DelDLegMasOrdr.futBscDelDLegMasOrdrGrpT.userOrdrRef", luserOrdrRef);
	memcpy(vfutBscDelDLegMasOrdrGrpT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);
	return vfutBscDelDLegMasOrdrGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelDLegMasOrdrRequestT getFutBscDelDLegMasOrdrRequestT(char* testCaseNum , const char *root) {
	futBscDelDLegMasOrdrRequestT vfutBscDelDLegMasOrdrRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscDelDLegMasOrdrRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("DelDLegMasOrdr.futBscDelDLegMasOrdrRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscDelDLegMasOrdrRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);
	return vfutBscDelDLegMasOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelDLegMasOrdrRecT getFutBscDelDLegMasOrdrRecT(char* testCaseNum , const char *root) {
	futBscDelDLegMasOrdrRecT vfutBscDelDLegMasOrdrRecT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		vfutBscDelDLegMasOrdrRecT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("DelDLegMasOrdr.futBscDelDLegMasOrdrRecT.rtnCod", lrtnCod);
	memcpy(vfutBscDelDLegMasOrdrRecT.rtnCod, lrtnCod, RTN_COD_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscDelDLegMasOrdrRecT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelDLegMasOrdr.futBscDelDLegMasOrdrRecT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutBscDelDLegMasOrdrRecT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vfutBscDelDLegMasOrdrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelDLegMasOrdrResponseT getFutBscDelDLegMasOrdrResponseT(char* testCaseNum , const char *root) {
	futBscDelDLegMasOrdrResponseT vfutBscDelDLegMasOrdrResponseT;
	int i;

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscDelDLegMasOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelDLegMasOrdr.futBscDelDLegMasOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(vfutBscDelDLegMasOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscDelDLegMasOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelDLegMasOrdr.futBscDelDLegMasOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(vfutBscDelDLegMasOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscDelDLegMasOrdrResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("DelDLegMasOrdr.futBscDelDLegMasOrdrResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscDelDLegMasOrdrResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscDelDLegMasOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelDLegMasOrdrRequestT* getFutDelDLegMasOrdrRequestT(char* testCaseNum) {
	vfutDelDLegMasOrdrRequestT = (futDelDLegMasOrdrRequestT*)malloc(sizeof(futDelDLegMasOrdrRequestT));
	int i;

	vfutDelDLegMasOrdrRequestT->header = getDataHeaderT(testCaseNum, "futDelDLegMasOrdrRequestT");
	vfutDelDLegMasOrdrRequestT->basic = getFutBscDelDLegMasOrdrRequestT(testCaseNum, "futDelDLegMasOrdrRequestT");
	return vfutDelDLegMasOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelDLegMasOrdrResponseT* getFutDelDLegMasOrdrResponseT(char* testCaseNum) {
	vfutDelDLegMasOrdrResponseT = (futDelDLegMasOrdrResponseT*)malloc(sizeof(futDelDLegMasOrdrResponseT));
	int i;

	vfutDelDLegMasOrdrResponseT->header = getDataHeaderT(testCaseNum, "futDelDLegMasOrdrResponseT");
	vfutDelDLegMasOrdrResponseT->basic = getFutBscDelDLegMasOrdrResponseT(testCaseNum, "futDelDLegMasOrdrResponseT");
	return vfutDelDLegMasOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelDLegMasOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelDLegMasOrdrRequestT));
	futDelDLegMasOrdrRequestT *vfutDelDLegMasOrdrRequestT = getFutDelDLegMasOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelDLegMasOrdrRequestT), (jbyte*) vfutDelDLegMasOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelDLegMasOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelDLegMasOrdrResponseT));
	futDelDLegMasOrdrResponseT *vfutDelDLegMasOrdrResponseT = getFutDelDLegMasOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelDLegMasOrdrResponseT), (jbyte*) vfutDelDLegMasOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelDLegMasOrdrGrpT(futBscDelDLegMasOrdrGrpT actual, futBscDelDLegMasOrdrGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegMasOrdrGrpT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegMasOrdrGrpT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegMasOrdrGrpT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegMasOrdrGrpT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelDLegMasOrdrRequestT(futBscDelDLegMasOrdrRequestT actual, futBscDelDLegMasOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegMasOrdrRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_DEL_D_LEG_MAS_ORDR_GRP_MAX;i++) {
		compareFutBscDelDLegMasOrdrGrpT (actual.futBscDelDLegMasOrdrGrp[i],expected.futBscDelDLegMasOrdrGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelDLegMasOrdrRecT(futBscDelDLegMasOrdrRecT actual, futBscDelDLegMasOrdrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegMasOrdrRecT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegMasOrdrRecT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelDLegMasOrdrResponseT(futBscDelDLegMasOrdrResponseT actual, futBscDelDLegMasOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegMasOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegMasOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegMasOrdrResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_DEL_D_LEG_MAS_ORDR_REC_MAX;i++) {
		compareFutBscDelDLegMasOrdrRecT (actual.futBscDelDLegMasOrdrRec[i],expected.futBscDelDLegMasOrdrRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelDLegMasOrdrRequestT(futDelDLegMasOrdrRequestT actual, futDelDLegMasOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelDLegMasOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelDLegMasOrdrResponseT(futDelDLegMasOrdrResponseT actual, futDelDLegMasOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelDLegMasOrdrResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelDLegMasOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelDLegMasOrdrRequestT *actualData = (futDelDLegMasOrdrRequestT *)msgStruct;
	futDelDLegMasOrdrRequestT* expectedData = getFutDelDLegMasOrdrRequestT(testCaseNum);
	compareFutDelDLegMasOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelDLegMasOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelDLegMasOrdrResponseT *actualData = (futDelDLegMasOrdrResponseT *)msgStruct;
	futDelDLegMasOrdrResponseT* expectedData = getFutDelDLegMasOrdrResponseT(testCaseNum);
	compareFutDelDLegMasOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
