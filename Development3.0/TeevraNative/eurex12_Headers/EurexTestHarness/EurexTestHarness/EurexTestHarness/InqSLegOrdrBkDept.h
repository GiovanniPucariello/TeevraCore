#include <InqSLegOrdrBkDept.hxx>
#define BUFFER_SIZE 1000

futInqSLegOrdrBkDeptRequestT *vfutInqSLegOrdrBkDeptRequestT;
futInqSLegOrdrBkDeptResponseT *vfutInqSLegOrdrBkDeptResponseT;
optInqSLegOrdrBkDeptRequestT *voptInqSLegOrdrBkDeptRequestT;
optInqSLegOrdrBkDeptResponseT *voptInqSLegOrdrBkDeptResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqSLegOrdrBkDeptRequestT getFutBscInqSLegOrdrBkDeptRequestT(char* testCaseNum , const char *root) {
	futBscInqSLegOrdrBkDeptRequestT vfutBscInqSLegOrdrBkDeptRequestT;
	int i;

	vfutBscInqSLegOrdrBkDeptRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqSLegOrdrBkDeptRequestT");	return vfutBscInqSLegOrdrBkDeptRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqSLegOrdrBkDeptRecT getFutBscInqSLegOrdrBkDeptRecT(char* testCaseNum , const char *root) {
	futBscInqSLegOrdrBkDeptRecT vfutBscInqSLegOrdrBkDeptRecT;
	int i;

	vfutBscInqSLegOrdrBkDeptRecT.bstOrdrGrp = getBstOrdrGrpT(testCaseNum, "futBscInqSLegOrdrBkDeptRecT");	return vfutBscInqSLegOrdrBkDeptRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqSLegOrdrBkDeptResponseT getFutBscInqSLegOrdrBkDeptResponseT(char* testCaseNum , const char *root) {
	futBscInqSLegOrdrBkDeptResponseT vfutBscInqSLegOrdrBkDeptResponseT;
	int i;
	return vfutBscInqSLegOrdrBkDeptResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqSLegOrdrBkDeptRequestT getOptBscInqSLegOrdrBkDeptRequestT(char* testCaseNum , const char *root) {
	optBscInqSLegOrdrBkDeptRequestT voptBscInqSLegOrdrBkDeptRequestT;
	int i;

	voptBscInqSLegOrdrBkDeptRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqSLegOrdrBkDeptRequestT");	return voptBscInqSLegOrdrBkDeptRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqSLegOrdrBkDeptRecT getOptBscInqSLegOrdrBkDeptRecT(char* testCaseNum , const char *root) {
	optBscInqSLegOrdrBkDeptRecT voptBscInqSLegOrdrBkDeptRecT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqSLegOrdrBkDeptRecT.bstBidPrc[i]= ' ';
	}
	char lbstBidPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegOrdrBkDept.optBscInqSLegOrdrBkDeptRecT.bstBidPrc", lbstBidPrc);
	memcpy(voptBscInqSLegOrdrBkDeptRecT.bstBidPrc, lbstBidPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqSLegOrdrBkDeptRecT.bstBidQty[i]= ' ';
	}
	char lbstBidQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSLegOrdrBkDept.optBscInqSLegOrdrBkDeptRecT.bstBidQty", lbstBidQty);
	memcpy(voptBscInqSLegOrdrBkDeptRecT.bstBidQty, lbstBidQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqSLegOrdrBkDeptRecT.bstAskPrc[i]= ' ';
	}
	char lbstAskPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegOrdrBkDept.optBscInqSLegOrdrBkDeptRecT.bstAskPrc", lbstAskPrc);
	memcpy(voptBscInqSLegOrdrBkDeptRecT.bstAskPrc, lbstAskPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqSLegOrdrBkDeptRecT.bstAskQty[i]= ' ';
	}
	char lbstAskQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSLegOrdrBkDept.optBscInqSLegOrdrBkDeptRecT.bstAskQty", lbstAskQty);
	memcpy(voptBscInqSLegOrdrBkDeptRecT.bstAskQty, lbstAskQty, DRIV_QUANTITY_LEN);
	return voptBscInqSLegOrdrBkDeptRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqSLegOrdrBkDeptResponseT getOptBscInqSLegOrdrBkDeptResponseT(char* testCaseNum , const char *root) {
	optBscInqSLegOrdrBkDeptResponseT voptBscInqSLegOrdrBkDeptResponseT;
	int i;

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqSLegOrdrBkDeptResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqSLegOrdrBkDept.optBscInqSLegOrdrBkDeptResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqSLegOrdrBkDeptResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqSLegOrdrBkDeptResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqSLegOrdrBkDeptRequestT* getFutInqSLegOrdrBkDeptRequestT(char* testCaseNum) {
	vfutInqSLegOrdrBkDeptRequestT = (futInqSLegOrdrBkDeptRequestT*)malloc(sizeof(futInqSLegOrdrBkDeptRequestT));
	int i;

	vfutInqSLegOrdrBkDeptRequestT->header = getDataHeaderT(testCaseNum, "futInqSLegOrdrBkDeptRequestT");
	vfutInqSLegOrdrBkDeptRequestT->basic = getFutBscInqSLegOrdrBkDeptRequestT(testCaseNum, "futInqSLegOrdrBkDeptRequestT");
	return vfutInqSLegOrdrBkDeptRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqSLegOrdrBkDeptResponseT* getFutInqSLegOrdrBkDeptResponseT(char* testCaseNum) {
	vfutInqSLegOrdrBkDeptResponseT = (futInqSLegOrdrBkDeptResponseT*)malloc(sizeof(futInqSLegOrdrBkDeptResponseT));
	int i;

	vfutInqSLegOrdrBkDeptResponseT->header = getDataHeaderT(testCaseNum, "futInqSLegOrdrBkDeptResponseT");
	vfutInqSLegOrdrBkDeptResponseT->basic = getFutBscInqSLegOrdrBkDeptResponseT(testCaseNum, "futInqSLegOrdrBkDeptResponseT");
	return vfutInqSLegOrdrBkDeptResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqSLegOrdrBkDeptRequestT* getOptInqSLegOrdrBkDeptRequestT(char* testCaseNum) {
	voptInqSLegOrdrBkDeptRequestT = (optInqSLegOrdrBkDeptRequestT*)malloc(sizeof(optInqSLegOrdrBkDeptRequestT));
	int i;

	voptInqSLegOrdrBkDeptRequestT->header = getDataHeaderT(testCaseNum, "optInqSLegOrdrBkDeptRequestT");
	voptInqSLegOrdrBkDeptRequestT->basic = getOptBscInqSLegOrdrBkDeptRequestT(testCaseNum, "optInqSLegOrdrBkDeptRequestT");
	return voptInqSLegOrdrBkDeptRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqSLegOrdrBkDeptResponseT* getOptInqSLegOrdrBkDeptResponseT(char* testCaseNum) {
	voptInqSLegOrdrBkDeptResponseT = (optInqSLegOrdrBkDeptResponseT*)malloc(sizeof(optInqSLegOrdrBkDeptResponseT));
	int i;

	voptInqSLegOrdrBkDeptResponseT->header = getDataHeaderT(testCaseNum, "optInqSLegOrdrBkDeptResponseT");
	voptInqSLegOrdrBkDeptResponseT->basic = getOptBscInqSLegOrdrBkDeptResponseT(testCaseNum, "optInqSLegOrdrBkDeptResponseT");
	return voptInqSLegOrdrBkDeptResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqSLegOrdrBkDeptRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqSLegOrdrBkDeptRequestT));
	futInqSLegOrdrBkDeptRequestT *vfutInqSLegOrdrBkDeptRequestT = getFutInqSLegOrdrBkDeptRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqSLegOrdrBkDeptRequestT), (jbyte*) vfutInqSLegOrdrBkDeptRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqSLegOrdrBkDeptResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqSLegOrdrBkDeptResponseT));
	futInqSLegOrdrBkDeptResponseT *vfutInqSLegOrdrBkDeptResponseT = getFutInqSLegOrdrBkDeptResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqSLegOrdrBkDeptResponseT), (jbyte*) vfutInqSLegOrdrBkDeptResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqSLegOrdrBkDeptRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqSLegOrdrBkDeptRequestT));
	optInqSLegOrdrBkDeptRequestT *voptInqSLegOrdrBkDeptRequestT = getOptInqSLegOrdrBkDeptRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqSLegOrdrBkDeptRequestT), (jbyte*) voptInqSLegOrdrBkDeptRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqSLegOrdrBkDeptResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqSLegOrdrBkDeptResponseT));
	optInqSLegOrdrBkDeptResponseT *voptInqSLegOrdrBkDeptResponseT = getOptInqSLegOrdrBkDeptResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqSLegOrdrBkDeptResponseT), (jbyte*) voptInqSLegOrdrBkDeptResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqSLegOrdrBkDeptRequestT(futBscInqSLegOrdrBkDeptRequestT actual, futBscInqSLegOrdrBkDeptRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqSLegOrdrBkDeptRecT(futBscInqSLegOrdrBkDeptRecT actual, futBscInqSLegOrdrBkDeptRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareBstOrdrGrpT (actual.bstOrdrGrp,expected.bstOrdrGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqSLegOrdrBkDeptResponseT(futBscInqSLegOrdrBkDeptResponseT actual, futBscInqSLegOrdrBkDeptResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REC_MAX;i++) {
		compareFutBscInqSLegOrdrBkDeptRecT (actual.futBscInqSLegOrdrBkDeptRec[i],expected.futBscInqSLegOrdrBkDeptRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqSLegOrdrBkDeptRequestT(optBscInqSLegOrdrBkDeptRequestT actual, optBscInqSLegOrdrBkDeptRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqSLegOrdrBkDeptRecT(optBscInqSLegOrdrBkDeptRecT actual, optBscInqSLegOrdrBkDeptRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.bstBidPrc, expected.bstBidPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegOrdrBkDeptRecT, bstBidPrc not matching. Actual %s but Expected %s", actual.bstBidPrc, expected.bstBidPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstBidQty, expected.bstBidQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegOrdrBkDeptRecT, bstBidQty not matching. Actual %s but Expected %s", actual.bstBidQty, expected.bstBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstAskPrc, expected.bstAskPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegOrdrBkDeptRecT, bstAskPrc not matching. Actual %s but Expected %s", actual.bstAskPrc, expected.bstAskPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstAskQty, expected.bstAskQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegOrdrBkDeptRecT, bstAskQty not matching. Actual %s but Expected %s", actual.bstAskQty, expected.bstAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqSLegOrdrBkDeptResponseT(optBscInqSLegOrdrBkDeptResponseT actual, optBscInqSLegOrdrBkDeptResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegOrdrBkDeptResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_S_LEG_ORDR_BK_DEPT_REC_MAX;i++) {
		compareOptBscInqSLegOrdrBkDeptRecT (actual.optBscInqSLegOrdrBkDeptRec[i],expected.optBscInqSLegOrdrBkDeptRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqSLegOrdrBkDeptRequestT(futInqSLegOrdrBkDeptRequestT actual, futInqSLegOrdrBkDeptRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqSLegOrdrBkDeptRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqSLegOrdrBkDeptResponseT(futInqSLegOrdrBkDeptResponseT actual, futInqSLegOrdrBkDeptResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqSLegOrdrBkDeptResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqSLegOrdrBkDeptRequestT(optInqSLegOrdrBkDeptRequestT actual, optInqSLegOrdrBkDeptRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqSLegOrdrBkDeptRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqSLegOrdrBkDeptResponseT(optInqSLegOrdrBkDeptResponseT actual, optInqSLegOrdrBkDeptResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqSLegOrdrBkDeptResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqSLegOrdrBkDeptRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqSLegOrdrBkDeptRequestT *actualData = (futInqSLegOrdrBkDeptRequestT *)msgStruct;
	futInqSLegOrdrBkDeptRequestT* expectedData = getFutInqSLegOrdrBkDeptRequestT(testCaseNum);
	compareFutInqSLegOrdrBkDeptRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqSLegOrdrBkDeptResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqSLegOrdrBkDeptResponseT *actualData = (futInqSLegOrdrBkDeptResponseT *)msgStruct;
	futInqSLegOrdrBkDeptResponseT* expectedData = getFutInqSLegOrdrBkDeptResponseT(testCaseNum);
	compareFutInqSLegOrdrBkDeptResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqSLegOrdrBkDeptRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqSLegOrdrBkDeptRequestT *actualData = (optInqSLegOrdrBkDeptRequestT *)msgStruct;
	optInqSLegOrdrBkDeptRequestT* expectedData = getOptInqSLegOrdrBkDeptRequestT(testCaseNum);
	compareOptInqSLegOrdrBkDeptRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqSLegOrdrBkDeptResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqSLegOrdrBkDeptResponseT *actualData = (optInqSLegOrdrBkDeptResponseT *)msgStruct;
	optInqSLegOrdrBkDeptResponseT* expectedData = getOptInqSLegOrdrBkDeptResponseT(testCaseNum);
	compareOptInqSLegOrdrBkDeptResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
