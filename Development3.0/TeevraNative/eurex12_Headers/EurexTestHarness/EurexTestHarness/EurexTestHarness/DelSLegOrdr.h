#include <DelSLegOrdr.hxx>
#define BUFFER_SIZE 1000

futDelSLegOrdrRequestT *vfutDelSLegOrdrRequestT;
futDelSLegOrdrResponseT *vfutDelSLegOrdrResponseT;
optDelSLegOrdrRequestT *voptDelSLegOrdrRequestT;
optDelSLegOrdrResponseT *voptDelSLegOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelSLegOrdrRequestT getFutBscDelSLegOrdrRequestT(char* testCaseNum , const char *root) {
	futBscDelSLegOrdrRequestT vfutBscDelSLegOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("DelSLegOrdr.futBscDelSLegOrdrRequestT.buyCod", lbuyCod);
	vfutBscDelSLegOrdrRequestT.buyCod = lbuyCod[0];

	vfutBscDelSLegOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscDelSLegOrdrRequestT");
	vfutBscDelSLegOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelSLegOrdrRequestT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscDelSLegOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelSLegOrdr.futBscDelSLegOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscDelSLegOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutBscDelSLegOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("DelSLegOrdr.futBscDelSLegOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(vfutBscDelSLegOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);
	return vfutBscDelSLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelSLegOrdrResponseT getFutBscDelSLegOrdrResponseT(char* testCaseNum , const char *root) {
	futBscDelSLegOrdrResponseT vfutBscDelSLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscDelSLegOrdrResponseT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DelSLegOrdr.futBscDelSLegOrdrResponseT.ordrQty", lordrQty);
	memcpy(vfutBscDelSLegOrdrResponseT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscDelSLegOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelSLegOrdr.futBscDelSLegOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(vfutBscDelSLegOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscDelSLegOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelSLegOrdr.futBscDelSLegOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(vfutBscDelSLegOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscDelSLegOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelSLegOrdr.futBscDelSLegOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutBscDelSLegOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vfutBscDelSLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelSLegOrdrRequestT getOptBscDelSLegOrdrRequestT(char* testCaseNum , const char *root) {
	optBscDelSLegOrdrRequestT voptBscDelSLegOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("DelSLegOrdr.optBscDelSLegOrdrRequestT.buyCod", lbuyCod);
	voptBscDelSLegOrdrRequestT.buyCod = lbuyCod[0];

	voptBscDelSLegOrdrRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscDelSLegOrdrRequestT");
	voptBscDelSLegOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscDelSLegOrdrRequestT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscDelSLegOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelSLegOrdr.optBscDelSLegOrdrRequestT.ordrNo", lordrNo);
	memcpy(voptBscDelSLegOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		voptBscDelSLegOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("DelSLegOrdr.optBscDelSLegOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(voptBscDelSLegOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);
	return voptBscDelSLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelSLegOrdrResponseT getOptBscDelSLegOrdrResponseT(char* testCaseNum , const char *root) {
	optBscDelSLegOrdrResponseT voptBscDelSLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscDelSLegOrdrResponseT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DelSLegOrdr.optBscDelSLegOrdrResponseT.ordrQty", lordrQty);
	memcpy(voptBscDelSLegOrdrResponseT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscDelSLegOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelSLegOrdr.optBscDelSLegOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(voptBscDelSLegOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscDelSLegOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelSLegOrdr.optBscDelSLegOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(voptBscDelSLegOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptBscDelSLegOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelSLegOrdr.optBscDelSLegOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(voptBscDelSLegOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return voptBscDelSLegOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelSLegOrdrRequestT* getFutDelSLegOrdrRequestT(char* testCaseNum) {
	vfutDelSLegOrdrRequestT = (futDelSLegOrdrRequestT*)malloc(sizeof(futDelSLegOrdrRequestT));
	int i;

	vfutDelSLegOrdrRequestT->header = getDataHeaderT(testCaseNum, "futDelSLegOrdrRequestT");
	vfutDelSLegOrdrRequestT->basic = getFutBscDelSLegOrdrRequestT(testCaseNum, "futDelSLegOrdrRequestT");
	return vfutDelSLegOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelSLegOrdrResponseT* getFutDelSLegOrdrResponseT(char* testCaseNum) {
	vfutDelSLegOrdrResponseT = (futDelSLegOrdrResponseT*)malloc(sizeof(futDelSLegOrdrResponseT));
	int i;

	vfutDelSLegOrdrResponseT->header = getDataHeaderT(testCaseNum, "futDelSLegOrdrResponseT");
	vfutDelSLegOrdrResponseT->basic = getFutBscDelSLegOrdrResponseT(testCaseNum, "futDelSLegOrdrResponseT");
	return vfutDelSLegOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelSLegOrdrRequestT* getOptDelSLegOrdrRequestT(char* testCaseNum) {
	voptDelSLegOrdrRequestT = (optDelSLegOrdrRequestT*)malloc(sizeof(optDelSLegOrdrRequestT));
	int i;

	voptDelSLegOrdrRequestT->header = getDataHeaderT(testCaseNum, "optDelSLegOrdrRequestT");
	voptDelSLegOrdrRequestT->basic = getOptBscDelSLegOrdrRequestT(testCaseNum, "optDelSLegOrdrRequestT");
	return voptDelSLegOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelSLegOrdrResponseT* getOptDelSLegOrdrResponseT(char* testCaseNum) {
	voptDelSLegOrdrResponseT = (optDelSLegOrdrResponseT*)malloc(sizeof(optDelSLegOrdrResponseT));
	int i;

	voptDelSLegOrdrResponseT->header = getDataHeaderT(testCaseNum, "optDelSLegOrdrResponseT");
	voptDelSLegOrdrResponseT->basic = getOptBscDelSLegOrdrResponseT(testCaseNum, "optDelSLegOrdrResponseT");
	return voptDelSLegOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelSLegOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelSLegOrdrRequestT));
	futDelSLegOrdrRequestT *vfutDelSLegOrdrRequestT = getFutDelSLegOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelSLegOrdrRequestT), (jbyte*) vfutDelSLegOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelSLegOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelSLegOrdrResponseT));
	futDelSLegOrdrResponseT *vfutDelSLegOrdrResponseT = getFutDelSLegOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelSLegOrdrResponseT), (jbyte*) vfutDelSLegOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelSLegOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelSLegOrdrRequestT));
	optDelSLegOrdrRequestT *voptDelSLegOrdrRequestT = getOptDelSLegOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelSLegOrdrRequestT), (jbyte*) voptDelSLegOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelSLegOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelSLegOrdrResponseT));
	optDelSLegOrdrResponseT *voptDelSLegOrdrResponseT = getOptDelSLegOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelSLegOrdrResponseT), (jbyte*) voptDelSLegOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelSLegOrdrRequestT(futBscDelSLegOrdrRequestT actual, futBscDelSLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelSLegOrdrResponseT(futBscDelSLegOrdrResponseT actual, futBscDelSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegOrdrResponseT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelSLegOrdrRequestT(optBscDelSLegOrdrRequestT actual, optBscDelSLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelSLegOrdrResponseT(optBscDelSLegOrdrResponseT actual, optBscDelSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegOrdrResponseT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelSLegOrdrRequestT(futDelSLegOrdrRequestT actual, futDelSLegOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelSLegOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelSLegOrdrResponseT(futDelSLegOrdrResponseT actual, futDelSLegOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelSLegOrdrResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelSLegOrdrRequestT(optDelSLegOrdrRequestT actual, optDelSLegOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelSLegOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelSLegOrdrResponseT(optDelSLegOrdrResponseT actual, optDelSLegOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelSLegOrdrResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelSLegOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelSLegOrdrRequestT *actualData = (futDelSLegOrdrRequestT *)msgStruct;
	futDelSLegOrdrRequestT* expectedData = getFutDelSLegOrdrRequestT(testCaseNum);
	compareFutDelSLegOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelSLegOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelSLegOrdrResponseT *actualData = (futDelSLegOrdrResponseT *)msgStruct;
	futDelSLegOrdrResponseT* expectedData = getFutDelSLegOrdrResponseT(testCaseNum);
	compareFutDelSLegOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelSLegOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelSLegOrdrRequestT *actualData = (optDelSLegOrdrRequestT *)msgStruct;
	optDelSLegOrdrRequestT* expectedData = getOptDelSLegOrdrRequestT(testCaseNum);
	compareOptDelSLegOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelSLegOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelSLegOrdrResponseT *actualData = (optDelSLegOrdrResponseT *)msgStruct;
	optDelSLegOrdrResponseT* expectedData = getOptDelSLegOrdrResponseT(testCaseNum);
	compareOptDelSLegOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
