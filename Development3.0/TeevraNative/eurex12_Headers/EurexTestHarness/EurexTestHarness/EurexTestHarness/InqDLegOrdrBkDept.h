#include <InqDLegOrdrBkDept.hxx>
#define BUFFER_SIZE 1000

futInqDLegOrdrBkDeptRequestT *vfutInqDLegOrdrBkDeptRequestT;
futInqDLegOrdrBkDeptResponseT *vfutInqDLegOrdrBkDeptResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqDLegOrdrBkDeptRequestT getFutBscInqDLegOrdrBkDeptRequestT(char* testCaseNum , const char *root) {
	futBscInqDLegOrdrBkDeptRequestT vfutBscInqDLegOrdrBkDeptRequestT;
	int i;

	vfutBscInqDLegOrdrBkDeptRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqDLegOrdrBkDeptRequestT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscInqDLegOrdrBkDeptRequestT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqDLegOrdrBkDept.futBscInqDLegOrdrBkDeptRequestT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscInqDLegOrdrBkDeptRequestT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscInqDLegOrdrBkDeptRequestT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscInqDLegOrdrBkDeptRequestT");	return vfutBscInqDLegOrdrBkDeptRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqDLegOrdrBkDeptRecT getFutBscInqDLegOrdrBkDeptRecT(char* testCaseNum , const char *root) {
	futBscInqDLegOrdrBkDeptRecT vfutBscInqDLegOrdrBkDeptRecT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqDLegOrdrBkDeptRecT.dblLegBstBidPrc[i]= ' ';
	}
	char ldblLegBstBidPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqDLegOrdrBkDept.futBscInqDLegOrdrBkDeptRecT.dblLegBstBidPrc", ldblLegBstBidPrc);
	memcpy(vfutBscInqDLegOrdrBkDeptRecT.dblLegBstBidPrc, ldblLegBstBidPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqDLegOrdrBkDeptRecT.dblLegBstBidQty[i]= ' ';
	}
	char ldblLegBstBidQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqDLegOrdrBkDept.futBscInqDLegOrdrBkDeptRecT.dblLegBstBidQty", ldblLegBstBidQty);
	memcpy(vfutBscInqDLegOrdrBkDeptRecT.dblLegBstBidQty, ldblLegBstBidQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqDLegOrdrBkDeptRecT.dblLegBstAskPrc[i]= ' ';
	}
	char ldblLegBstAskPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqDLegOrdrBkDept.futBscInqDLegOrdrBkDeptRecT.dblLegBstAskPrc", ldblLegBstAskPrc);
	memcpy(vfutBscInqDLegOrdrBkDeptRecT.dblLegBstAskPrc, ldblLegBstAskPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqDLegOrdrBkDeptRecT.dblLegBstAskQty[i]= ' ';
	}
	char ldblLegBstAskQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqDLegOrdrBkDept.futBscInqDLegOrdrBkDeptRecT.dblLegBstAskQty", ldblLegBstAskQty);
	memcpy(vfutBscInqDLegOrdrBkDeptRecT.dblLegBstAskQty, ldblLegBstAskQty, DRIV_QUANTITY_LEN);
	return vfutBscInqDLegOrdrBkDeptRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqDLegOrdrBkDeptResponseT getFutBscInqDLegOrdrBkDeptResponseT(char* testCaseNum , const char *root) {
	futBscInqDLegOrdrBkDeptResponseT vfutBscInqDLegOrdrBkDeptResponseT;
	int i;
	return vfutBscInqDLegOrdrBkDeptResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqDLegOrdrBkDeptRequestT* getFutInqDLegOrdrBkDeptRequestT(char* testCaseNum) {
	vfutInqDLegOrdrBkDeptRequestT = (futInqDLegOrdrBkDeptRequestT*)malloc(sizeof(futInqDLegOrdrBkDeptRequestT));
	int i;

	vfutInqDLegOrdrBkDeptRequestT->header = getDataHeaderT(testCaseNum, "futInqDLegOrdrBkDeptRequestT");
	vfutInqDLegOrdrBkDeptRequestT->basic = getFutBscInqDLegOrdrBkDeptRequestT(testCaseNum, "futInqDLegOrdrBkDeptRequestT");
	return vfutInqDLegOrdrBkDeptRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqDLegOrdrBkDeptResponseT* getFutInqDLegOrdrBkDeptResponseT(char* testCaseNum) {
	vfutInqDLegOrdrBkDeptResponseT = (futInqDLegOrdrBkDeptResponseT*)malloc(sizeof(futInqDLegOrdrBkDeptResponseT));
	int i;

	vfutInqDLegOrdrBkDeptResponseT->header = getDataHeaderT(testCaseNum, "futInqDLegOrdrBkDeptResponseT");
	vfutInqDLegOrdrBkDeptResponseT->basic = getFutBscInqDLegOrdrBkDeptResponseT(testCaseNum, "futInqDLegOrdrBkDeptResponseT");
	return vfutInqDLegOrdrBkDeptResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqDLegOrdrBkDeptRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqDLegOrdrBkDeptRequestT));
	futInqDLegOrdrBkDeptRequestT *vfutInqDLegOrdrBkDeptRequestT = getFutInqDLegOrdrBkDeptRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqDLegOrdrBkDeptRequestT), (jbyte*) vfutInqDLegOrdrBkDeptRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqDLegOrdrBkDeptResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqDLegOrdrBkDeptResponseT));
	futInqDLegOrdrBkDeptResponseT *vfutInqDLegOrdrBkDeptResponseT = getFutInqDLegOrdrBkDeptResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqDLegOrdrBkDeptResponseT), (jbyte*) vfutInqDLegOrdrBkDeptResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqDLegOrdrBkDeptRequestT(futBscInqDLegOrdrBkDeptRequestT actual, futBscInqDLegOrdrBkDeptRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegOrdrBkDeptRequestT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqDLegOrdrBkDeptRecT(futBscInqDLegOrdrBkDeptRecT actual, futBscInqDLegOrdrBkDeptRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dblLegBstBidPrc, expected.dblLegBstBidPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegOrdrBkDeptRecT, dblLegBstBidPrc not matching. Actual %s but Expected %s", actual.dblLegBstBidPrc, expected.dblLegBstBidPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dblLegBstBidQty, expected.dblLegBstBidQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegOrdrBkDeptRecT, dblLegBstBidQty not matching. Actual %s but Expected %s", actual.dblLegBstBidQty, expected.dblLegBstBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dblLegBstAskPrc, expected.dblLegBstAskPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegOrdrBkDeptRecT, dblLegBstAskPrc not matching. Actual %s but Expected %s", actual.dblLegBstAskPrc, expected.dblLegBstAskPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dblLegBstAskQty, expected.dblLegBstAskQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegOrdrBkDeptRecT, dblLegBstAskQty not matching. Actual %s but Expected %s", actual.dblLegBstAskQty, expected.dblLegBstAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqDLegOrdrBkDeptResponseT(futBscInqDLegOrdrBkDeptResponseT actual, futBscInqDLegOrdrBkDeptResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_D_LEG_ORDR_BK_DEPT_REC_MAX;i++) {
		compareFutBscInqDLegOrdrBkDeptRecT (actual.futBscInqDLegOrdrBkDeptRec[i],expected.futBscInqDLegOrdrBkDeptRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqDLegOrdrBkDeptRequestT(futInqDLegOrdrBkDeptRequestT actual, futInqDLegOrdrBkDeptRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqDLegOrdrBkDeptRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqDLegOrdrBkDeptResponseT(futInqDLegOrdrBkDeptResponseT actual, futInqDLegOrdrBkDeptResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqDLegOrdrBkDeptResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqDLegOrdrBkDeptRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqDLegOrdrBkDeptRequestT *actualData = (futInqDLegOrdrBkDeptRequestT *)msgStruct;
	futInqDLegOrdrBkDeptRequestT* expectedData = getFutInqDLegOrdrBkDeptRequestT(testCaseNum);
	compareFutInqDLegOrdrBkDeptRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqDLegOrdrBkDeptResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqDLegOrdrBkDeptResponseT *actualData = (futInqDLegOrdrBkDeptResponseT *)msgStruct;
	futInqDLegOrdrBkDeptResponseT* expectedData = getFutInqDLegOrdrBkDeptResponseT(testCaseNum);
	compareFutInqDLegOrdrBkDeptResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
