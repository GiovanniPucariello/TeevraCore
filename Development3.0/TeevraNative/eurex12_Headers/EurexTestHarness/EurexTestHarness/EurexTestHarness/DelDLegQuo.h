#include <DelDLegQuo.hxx>
#define BUFFER_SIZE 1000

futDelDLegQuoRequestT *vfutDelDLegQuoRequestT;
futDelDLegQuoResponseT *vfutDelDLegQuoResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelDLegQuoRequestT getFutBscDelDLegQuoRequestT(char* testCaseNum , const char *root) {
	futBscDelDLegQuoRequestT vfutBscDelDLegQuoRequestT;
	int i;

	vfutBscDelDLegQuoRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscDelDLegQuoRequestT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscDelDLegQuoRequestT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("DelDLegQuo.futBscDelDLegQuoRequestT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscDelDLegQuoRequestT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscDelDLegQuoRequestT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscDelDLegQuoRequestT");
	vfutBscDelDLegQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscDelDLegQuoRequestT");	return vfutBscDelDLegQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscDelDLegQuoResponseT getFutBscDelDLegQuoResponseT(char* testCaseNum , const char *root) {
	futBscDelDLegQuoResponseT vfutBscDelDLegQuoResponseT;
	int i;

	char lbidSidDel[1] = {""};
	getStrProperty("DelDLegQuo.futBscDelDLegQuoResponseT.bidSidDel", lbidSidDel);
	vfutBscDelDLegQuoResponseT.bidSidDel = lbidSidDel[0];

	char laskSidDel[1] = {""};
	getStrProperty("DelDLegQuo.futBscDelDLegQuoResponseT.askSidDel", laskSidDel);
	vfutBscDelDLegQuoResponseT.askSidDel = laskSidDel[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscDelDLegQuoResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelDLegQuo.futBscDelDLegQuoResponseT.lstEvntDat", llstEvntDat);
	memcpy(vfutBscDelDLegQuoResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscDelDLegQuoResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelDLegQuo.futBscDelDLegQuoResponseT.lstEvntTim", llstEvntTim);
	memcpy(vfutBscDelDLegQuoResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscDelDLegQuoResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelDLegQuo.futBscDelDLegQuoResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutBscDelDLegQuoResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vfutBscDelDLegQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelDLegQuoRequestT* getFutDelDLegQuoRequestT(char* testCaseNum) {
	vfutDelDLegQuoRequestT = (futDelDLegQuoRequestT*)malloc(sizeof(futDelDLegQuoRequestT));
	int i;

	vfutDelDLegQuoRequestT->header = getDataHeaderT(testCaseNum, "futDelDLegQuoRequestT");
	vfutDelDLegQuoRequestT->basic = getFutBscDelDLegQuoRequestT(testCaseNum, "futDelDLegQuoRequestT");
	return vfutDelDLegQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futDelDLegQuoResponseT* getFutDelDLegQuoResponseT(char* testCaseNum) {
	vfutDelDLegQuoResponseT = (futDelDLegQuoResponseT*)malloc(sizeof(futDelDLegQuoResponseT));
	int i;

	vfutDelDLegQuoResponseT->header = getDataHeaderT(testCaseNum, "futDelDLegQuoResponseT");
	vfutDelDLegQuoResponseT->basic = getFutBscDelDLegQuoResponseT(testCaseNum, "futDelDLegQuoResponseT");
	return vfutDelDLegQuoResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelDLegQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelDLegQuoRequestT));
	futDelDLegQuoRequestT *vfutDelDLegQuoRequestT = getFutDelDLegQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelDLegQuoRequestT), (jbyte*) vfutDelDLegQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutDelDLegQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futDelDLegQuoResponseT));
	futDelDLegQuoResponseT *vfutDelDLegQuoResponseT = getFutDelDLegQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futDelDLegQuoResponseT), (jbyte*) vfutDelDLegQuoResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelDLegQuoRequestT(futBscDelDLegQuoRequestT actual, futBscDelDLegQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegQuoRequestT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscDelDLegQuoResponseT(futBscDelDLegQuoResponseT actual, futBscDelDLegQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.bidSidDel!= expected.bidSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegQuoResponseT, bidSidDelnot matching. Actual %d but Expected %d", actual.bidSidDel, expected.bidSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.askSidDel!= expected.askSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegQuoResponseT, askSidDelnot matching. Actual %d but Expected %d", actual.askSidDel, expected.askSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegQuoResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegQuoResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscDelDLegQuoResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelDLegQuoRequestT(futDelDLegQuoRequestT actual, futDelDLegQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelDLegQuoRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutDelDLegQuoResponseT(futDelDLegQuoResponseT actual, futDelDLegQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscDelDLegQuoResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelDLegQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelDLegQuoRequestT *actualData = (futDelDLegQuoRequestT *)msgStruct;
	futDelDLegQuoRequestT* expectedData = getFutDelDLegQuoRequestT(testCaseNum);
	compareFutDelDLegQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutDelDLegQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futDelDLegQuoResponseT *actualData = (futDelDLegQuoResponseT *)msgStruct;
	futDelDLegQuoResponseT* expectedData = getFutDelDLegQuoResponseT(testCaseNum);
	compareFutDelDLegQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
