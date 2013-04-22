#include <DelSLegQuo.hxx>
#define BUFFER_SIZE 1000

futDelSLegQuoRequestT *vfutDelSLegQuoRequestT;
futDelSLegQuoResponseT *vfutDelSLegQuoResponseT;
optDelSLegQuoRequestT *voptDelSLegQuoRequestT;
optDelSLegQuoResponseT *voptDelSLegQuoResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelSLegQuoRequestT getFutBscDelSLegQuoRequestT(char* testCaseNum , const char *root) {
	futBscDelSLegQuoRequestT vfutBscDelSLegQuoRequestT;
	int i;

	vfutBscDelSLegQuoRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscDelSLegQuoRequestT");
	vfutBscDelSLegQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelSLegQuoRequestT");	return vfutBscDelSLegQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelSLegQuoResponseT getFutBscDelSLegQuoResponseT(char* testCaseNum , const char *root) {
	futBscDelSLegQuoResponseT vfutBscDelSLegQuoResponseT;
	int i;

	char lbidSidDel[1] = {""};
	getStrProperty("DelSLegQuo.futBscDelSLegQuoResponseT.bidSidDel", lbidSidDel);
	vfutBscDelSLegQuoResponseT.bidSidDel = lbidSidDel[0];

	char laskSidDel[1] = {""};
	getStrProperty("DelSLegQuo.futBscDelSLegQuoResponseT.askSidDel", laskSidDel);
	vfutBscDelSLegQuoResponseT.askSidDel = laskSidDel[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscDelSLegQuoResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelSLegQuo.futBscDelSLegQuoResponseT.lstEvntDat", llstEvntDat);
	memcpy(vfutBscDelSLegQuoResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscDelSLegQuoResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelSLegQuo.futBscDelSLegQuoResponseT.lstEvntTim", llstEvntTim);
	memcpy(vfutBscDelSLegQuoResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscDelSLegQuoResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelSLegQuo.futBscDelSLegQuoResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutBscDelSLegQuoResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vfutBscDelSLegQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelSLegQuoRequestT getOptBscDelSLegQuoRequestT(char* testCaseNum , const char *root) {
	optBscDelSLegQuoRequestT voptBscDelSLegQuoRequestT;
	int i;

	voptBscDelSLegQuoRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscDelSLegQuoRequestT");
	voptBscDelSLegQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscDelSLegQuoRequestT");	return voptBscDelSLegQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscDelSLegQuoResponseT getOptBscDelSLegQuoResponseT(char* testCaseNum , const char *root) {
	optBscDelSLegQuoResponseT voptBscDelSLegQuoResponseT;
	int i;

	char lbidSidDel[1] = {""};
	getStrProperty("DelSLegQuo.optBscDelSLegQuoResponseT.bidSidDel", lbidSidDel);
	voptBscDelSLegQuoResponseT.bidSidDel = lbidSidDel[0];

	char laskSidDel[1] = {""};
	getStrProperty("DelSLegQuo.optBscDelSLegQuoResponseT.askSidDel", laskSidDel);
	voptBscDelSLegQuoResponseT.askSidDel = laskSidDel[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscDelSLegQuoResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelSLegQuo.optBscDelSLegQuoResponseT.lstEvntDat", llstEvntDat);
	memcpy(voptBscDelSLegQuoResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscDelSLegQuoResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelSLegQuo.optBscDelSLegQuoResponseT.lstEvntTim", llstEvntTim);
	memcpy(voptBscDelSLegQuoResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptBscDelSLegQuoResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelSLegQuo.optBscDelSLegQuoResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(voptBscDelSLegQuoResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return voptBscDelSLegQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelSLegQuoRequestT* getFutDelSLegQuoRequestT(char* testCaseNum) {
	vfutDelSLegQuoRequestT = (futDelSLegQuoRequestT*)malloc(sizeof(futDelSLegQuoRequestT));
	int i;

	vfutDelSLegQuoRequestT->header = getDataHeaderT(testCaseNum, "futDelSLegQuoRequestT");
	vfutDelSLegQuoRequestT->basic = getFutBscDelSLegQuoRequestT(testCaseNum, "futDelSLegQuoRequestT");
	return vfutDelSLegQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelSLegQuoResponseT* getFutDelSLegQuoResponseT(char* testCaseNum) {
	vfutDelSLegQuoResponseT = (futDelSLegQuoResponseT*)malloc(sizeof(futDelSLegQuoResponseT));
	int i;

	vfutDelSLegQuoResponseT->header = getDataHeaderT(testCaseNum, "futDelSLegQuoResponseT");
	vfutDelSLegQuoResponseT->basic = getFutBscDelSLegQuoResponseT(testCaseNum, "futDelSLegQuoResponseT");
	return vfutDelSLegQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelSLegQuoRequestT* getOptDelSLegQuoRequestT(char* testCaseNum) {
	voptDelSLegQuoRequestT = (optDelSLegQuoRequestT*)malloc(sizeof(optDelSLegQuoRequestT));
	int i;

	voptDelSLegQuoRequestT->header = getDataHeaderT(testCaseNum, "optDelSLegQuoRequestT");
	voptDelSLegQuoRequestT->basic = getOptBscDelSLegQuoRequestT(testCaseNum, "optDelSLegQuoRequestT");
	return voptDelSLegQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optDelSLegQuoResponseT* getOptDelSLegQuoResponseT(char* testCaseNum) {
	voptDelSLegQuoResponseT = (optDelSLegQuoResponseT*)malloc(sizeof(optDelSLegQuoResponseT));
	int i;

	voptDelSLegQuoResponseT->header = getDataHeaderT(testCaseNum, "optDelSLegQuoResponseT");
	voptDelSLegQuoResponseT->basic = getOptBscDelSLegQuoResponseT(testCaseNum, "optDelSLegQuoResponseT");
	return voptDelSLegQuoResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelSLegQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelSLegQuoRequestT));
	futDelSLegQuoRequestT *vfutDelSLegQuoRequestT = getFutDelSLegQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelSLegQuoRequestT), (jbyte*) vfutDelSLegQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelSLegQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelSLegQuoResponseT));
	futDelSLegQuoResponseT *vfutDelSLegQuoResponseT = getFutDelSLegQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelSLegQuoResponseT), (jbyte*) vfutDelSLegQuoResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelSLegQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelSLegQuoRequestT));
	optDelSLegQuoRequestT *voptDelSLegQuoRequestT = getOptDelSLegQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelSLegQuoRequestT), (jbyte*) voptDelSLegQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptDelSLegQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optDelSLegQuoResponseT));
	optDelSLegQuoResponseT *voptDelSLegQuoResponseT = getOptDelSLegQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optDelSLegQuoResponseT), (jbyte*) voptDelSLegQuoResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelSLegQuoRequestT(futBscDelSLegQuoRequestT actual, futBscDelSLegQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelSLegQuoResponseT(futBscDelSLegQuoResponseT actual, futBscDelSLegQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.bidSidDel!= expected.bidSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegQuoResponseT, bidSidDelnot matching. Actual %d but Expected %d", actual.bidSidDel, expected.bidSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.askSidDel!= expected.askSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegQuoResponseT, askSidDelnot matching. Actual %d but Expected %d", actual.askSidDel, expected.askSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegQuoResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegQuoResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelSLegQuoResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelSLegQuoRequestT(optBscDelSLegQuoRequestT actual, optBscDelSLegQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscDelSLegQuoResponseT(optBscDelSLegQuoResponseT actual, optBscDelSLegQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.bidSidDel!= expected.bidSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegQuoResponseT, bidSidDelnot matching. Actual %d but Expected %d", actual.bidSidDel, expected.bidSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.askSidDel!= expected.askSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegQuoResponseT, askSidDelnot matching. Actual %d but Expected %d", actual.askSidDel, expected.askSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegQuoResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegQuoResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscDelSLegQuoResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelSLegQuoRequestT(futDelSLegQuoRequestT actual, futDelSLegQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelSLegQuoRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelSLegQuoResponseT(futDelSLegQuoResponseT actual, futDelSLegQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelSLegQuoResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelSLegQuoRequestT(optDelSLegQuoRequestT actual, optDelSLegQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelSLegQuoRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptDelSLegQuoResponseT(optDelSLegQuoResponseT actual, optDelSLegQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscDelSLegQuoResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelSLegQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelSLegQuoRequestT *actualData = (futDelSLegQuoRequestT *)msgStruct;
	futDelSLegQuoRequestT* expectedData = getFutDelSLegQuoRequestT(testCaseNum);
	compareFutDelSLegQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelSLegQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelSLegQuoResponseT *actualData = (futDelSLegQuoResponseT *)msgStruct;
	futDelSLegQuoResponseT* expectedData = getFutDelSLegQuoResponseT(testCaseNum);
	compareFutDelSLegQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelSLegQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelSLegQuoRequestT *actualData = (optDelSLegQuoRequestT *)msgStruct;
	optDelSLegQuoRequestT* expectedData = getOptDelSLegQuoRequestT(testCaseNum);
	compareOptDelSLegQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptDelSLegQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optDelSLegQuoResponseT *actualData = (optDelSLegQuoResponseT *)msgStruct;
	optDelSLegQuoResponseT* expectedData = getOptDelSLegQuoResponseT(testCaseNum);
	compareOptDelSLegQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
