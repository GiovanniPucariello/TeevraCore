#include <InqScdLegCntrLis.hxx>
#define BUFFER_SIZE 1000

futInqScdLegCntrLisRequestT *vfutInqScdLegCntrLisRequestT;
futInqScdLegCntrLisResponseT *vfutInqScdLegCntrLisResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqScdLegCntrLisRequestT getFutBscInqScdLegCntrLisRequestT(char* testCaseNum , const char *root) {
	futBscInqScdLegCntrLisRequestT vfutBscInqScdLegCntrLisRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscInqScdLegCntrLisRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqScdLegCntrLis.futBscInqScdLegCntrLisRequestT.prodId", lprodId);
	memcpy(vfutBscInqScdLegCntrLisRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutBscInqScdLegCntrLisRequestT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("InqScdLegCntrLis.futBscInqScdLegCntrLisRequestT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vfutBscInqScdLegCntrLisRequestT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutBscInqScdLegCntrLisRequestT.cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("InqScdLegCntrLis.futBscInqScdLegCntrLisRequestT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vfutBscInqScdLegCntrLisRequestT.cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscInqScdLegCntrLisRequestT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqScdLegCntrLis.futBscInqScdLegCntrLisRequestT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscInqScdLegCntrLisRequestT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);
	return vfutBscInqScdLegCntrLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqScdLegCntrLisRecT getFutBscInqScdLegCntrLisRecT(char* testCaseNum , const char *root) {
	futBscInqScdLegCntrLisRecT vfutBscInqScdLegCntrLisRecT;
	int i;

	vfutBscInqScdLegCntrLisRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqScdLegCntrLisRecT");
	vfutBscInqScdLegCntrLisRecT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscInqScdLegCntrLisRecT");	return vfutBscInqScdLegCntrLisRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqScdLegCntrLisResponseT getFutBscInqScdLegCntrLisResponseT(char* testCaseNum , const char *root) {
	futBscInqScdLegCntrLisResponseT vfutBscInqScdLegCntrLisResponseT;
	int i;

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqScdLegCntrLisResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqScdLegCntrLis.futBscInqScdLegCntrLisResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqScdLegCntrLisResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqScdLegCntrLisResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqScdLegCntrLisRequestT* getFutInqScdLegCntrLisRequestT(char* testCaseNum) {
	vfutInqScdLegCntrLisRequestT = (futInqScdLegCntrLisRequestT*)malloc(sizeof(futInqScdLegCntrLisRequestT));
	int i;

	vfutInqScdLegCntrLisRequestT->header = getDataHeaderT(testCaseNum, "futInqScdLegCntrLisRequestT");
	vfutInqScdLegCntrLisRequestT->basic = getFutBscInqScdLegCntrLisRequestT(testCaseNum, "futInqScdLegCntrLisRequestT");
	return vfutInqScdLegCntrLisRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqScdLegCntrLisResponseT* getFutInqScdLegCntrLisResponseT(char* testCaseNum) {
	vfutInqScdLegCntrLisResponseT = (futInqScdLegCntrLisResponseT*)malloc(sizeof(futInqScdLegCntrLisResponseT));
	int i;

	vfutInqScdLegCntrLisResponseT->header = getDataHeaderT(testCaseNum, "futInqScdLegCntrLisResponseT");
	vfutInqScdLegCntrLisResponseT->basic = getFutBscInqScdLegCntrLisResponseT(testCaseNum, "futInqScdLegCntrLisResponseT");
	return vfutInqScdLegCntrLisResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqScdLegCntrLisRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqScdLegCntrLisRequestT));
	futInqScdLegCntrLisRequestT *vfutInqScdLegCntrLisRequestT = getFutInqScdLegCntrLisRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqScdLegCntrLisRequestT), (jbyte*) vfutInqScdLegCntrLisRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqScdLegCntrLisResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqScdLegCntrLisResponseT));
	futInqScdLegCntrLisResponseT *vfutInqScdLegCntrLisResponseT = getFutInqScdLegCntrLisResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqScdLegCntrLisResponseT), (jbyte*) vfutInqScdLegCntrLisResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqScdLegCntrLisRequestT(futBscInqScdLegCntrLisRequestT actual, futBscInqScdLegCntrLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqScdLegCntrLisRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqScdLegCntrLisRequestT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat, expected.cntrExpYrDat, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqScdLegCntrLisRequestT, cntrExpYrDat not matching. Actual %s but Expected %s", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqScdLegCntrLisRequestT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqScdLegCntrLisRecT(futBscInqScdLegCntrLisRecT actual, futBscInqScdLegCntrLisRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqScdLegCntrLisResponseT(futBscInqScdLegCntrLisResponseT actual, futBscInqScdLegCntrLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqScdLegCntrLisResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_SCD_LEG_CNTR_LIS_REC_MAX;i++) {
		compareFutBscInqScdLegCntrLisRecT (actual.futBscInqScdLegCntrLisRec[i],expected.futBscInqScdLegCntrLisRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqScdLegCntrLisRequestT(futInqScdLegCntrLisRequestT actual, futInqScdLegCntrLisRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqScdLegCntrLisRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqScdLegCntrLisResponseT(futInqScdLegCntrLisResponseT actual, futInqScdLegCntrLisResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqScdLegCntrLisResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqScdLegCntrLisRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqScdLegCntrLisRequestT *actualData = (futInqScdLegCntrLisRequestT *)msgStruct;
	futInqScdLegCntrLisRequestT* expectedData = getFutInqScdLegCntrLisRequestT(testCaseNum);
	compareFutInqScdLegCntrLisRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqScdLegCntrLisResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqScdLegCntrLisResponseT *actualData = (futInqScdLegCntrLisResponseT *)msgStruct;
	futInqScdLegCntrLisResponseT* expectedData = getFutInqScdLegCntrLisResponseT(testCaseNum);
	compareFutInqScdLegCntrLisResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
