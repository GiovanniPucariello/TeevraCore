#include <DelDLegOrdr.hxx>
#define BUFFER_SIZE 1000

futDelDLegOrdrRequestT *vfutDelDLegOrdrRequestT;
futDelDLegOrdrResponseT *vfutDelDLegOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelDLegOrdrRequestT getFutBscDelDLegOrdrRequestT(char* testCaseNum , const char *root) {
	futBscDelDLegOrdrRequestT vfutBscDelDLegOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("DelDLegOrdr.futBscDelDLegOrdrRequestT.buyCod", lbuyCod);
	vfutBscDelDLegOrdrRequestT.buyCod = lbuyCod[0];

	vfutBscDelDLegOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscDelDLegOrdrRequestT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscDelDLegOrdrRequestT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("DelDLegOrdr.futBscDelDLegOrdrRequestT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscDelDLegOrdrRequestT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscDelDLegOrdrRequestT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscDelDLegOrdrRequestT");
	vfutBscDelDLegOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelDLegOrdrRequestT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscDelDLegOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelDLegOrdr.futBscDelDLegOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscDelDLegOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutBscDelDLegOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("DelDLegOrdr.futBscDelDLegOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(vfutBscDelDLegOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);
	return vfutBscDelDLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelDLegOrdrResponseT getFutBscDelDLegOrdrResponseT(char* testCaseNum , const char *root) {
	futBscDelDLegOrdrResponseT vfutBscDelDLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscDelDLegOrdrResponseT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DelDLegOrdr.futBscDelDLegOrdrResponseT.ordrQty", lordrQty);
	memcpy(vfutBscDelDLegOrdrResponseT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscDelDLegOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelDLegOrdr.futBscDelDLegOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(vfutBscDelDLegOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscDelDLegOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelDLegOrdr.futBscDelDLegOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(vfutBscDelDLegOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscDelDLegOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelDLegOrdr.futBscDelDLegOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutBscDelDLegOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vfutBscDelDLegOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelDLegOrdrRequestT* getFutDelDLegOrdrRequestT(char* testCaseNum) {
	vfutDelDLegOrdrRequestT = (futDelDLegOrdrRequestT*)malloc(sizeof(futDelDLegOrdrRequestT));
	int i;

	vfutDelDLegOrdrRequestT->header = getDataHeaderT(testCaseNum, "futDelDLegOrdrRequestT");
	vfutDelDLegOrdrRequestT->basic = getFutBscDelDLegOrdrRequestT(testCaseNum, "futDelDLegOrdrRequestT");
	return vfutDelDLegOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelDLegOrdrResponseT* getFutDelDLegOrdrResponseT(char* testCaseNum) {
	vfutDelDLegOrdrResponseT = (futDelDLegOrdrResponseT*)malloc(sizeof(futDelDLegOrdrResponseT));
	int i;

	vfutDelDLegOrdrResponseT->header = getDataHeaderT(testCaseNum, "futDelDLegOrdrResponseT");
	vfutDelDLegOrdrResponseT->basic = getFutBscDelDLegOrdrResponseT(testCaseNum, "futDelDLegOrdrResponseT");
	return vfutDelDLegOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelDLegOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelDLegOrdrRequestT));
	futDelDLegOrdrRequestT *vfutDelDLegOrdrRequestT = getFutDelDLegOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelDLegOrdrRequestT), (jbyte*) vfutDelDLegOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelDLegOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelDLegOrdrResponseT));
	futDelDLegOrdrResponseT *vfutDelDLegOrdrResponseT = getFutDelDLegOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelDLegOrdrResponseT), (jbyte*) vfutDelDLegOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelDLegOrdrRequestT(futBscDelDLegOrdrRequestT actual, futBscDelDLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegOrdrRequestT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelDLegOrdrResponseT(futBscDelDLegOrdrResponseT actual, futBscDelDLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegOrdrResponseT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelDLegOrdrRequestT(futDelDLegOrdrRequestT actual, futDelDLegOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelDLegOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelDLegOrdrResponseT(futDelDLegOrdrResponseT actual, futDelDLegOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelDLegOrdrResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelDLegOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelDLegOrdrRequestT *actualData = (futDelDLegOrdrRequestT *)msgStruct;
	futDelDLegOrdrRequestT* expectedData = getFutDelDLegOrdrRequestT(testCaseNum);
	compareFutDelDLegOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelDLegOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelDLegOrdrResponseT *actualData = (futDelDLegOrdrResponseT *)msgStruct;
	futDelDLegOrdrResponseT* expectedData = getFutDelDLegOrdrResponseT(testCaseNum);
	compareFutDelDLegOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
