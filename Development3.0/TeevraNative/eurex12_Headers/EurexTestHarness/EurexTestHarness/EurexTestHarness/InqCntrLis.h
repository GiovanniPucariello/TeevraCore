#include <InqCntrLis.hxx>
#define BUFFER_SIZE 1000

futInqCntrLisRequestT *vfutInqCntrLisRequestT;
futInqCntrLisResponseT *vfutInqCntrLisResponseT;
optInqCntrLisRequestT *voptInqCntrLisRequestT;
optInqCntrLisResponseT *voptInqCntrLisResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqCntrLisRequestT getFutBscInqCntrLisRequestT(char* testCaseNum , const char *root) {
	futBscInqCntrLisRequestT vfutBscInqCntrLisRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscInqCntrLisRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqCntrLis.futBscInqCntrLisRequestT.prodId", lprodId);
	memcpy(vfutBscInqCntrLisRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqCntrLisRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCntrLis.futBscInqCntrLisRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqCntrLisRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqCntrLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqCntrLisRecT getFutBscInqCntrLisRecT(char* testCaseNum , const char *root) {
	futBscInqCntrLisRecT vfutBscInqCntrLisRecT;
	int i;

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutBscInqCntrLisRecT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("InqCntrLis.futBscInqCntrLisRecT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vfutBscInqCntrLisRecT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutBscInqCntrLisRecT.cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("InqCntrLis.futBscInqCntrLisRecT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vfutBscInqCntrLisRecT.cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	char lcntrStsCod[1] = {""};
	getStrProperty("InqCntrLis.futBscInqCntrLisRecT.cntrStsCod", lcntrStsCod);
	vfutBscInqCntrLisRecT.cntrStsCod = lcntrStsCod[0];
	return vfutBscInqCntrLisRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqCntrLisResponseT getFutBscInqCntrLisResponseT(char* testCaseNum , const char *root) {
	futBscInqCntrLisResponseT vfutBscInqCntrLisResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqCntrLisResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCntrLis.futBscInqCntrLisResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqCntrLisResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqCntrLisResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqCntrLis.futBscInqCntrLisResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqCntrLisResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqCntrLisResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqCntrLisRequestT getOptBscInqCntrLisRequestT(char* testCaseNum , const char *root) {
	optBscInqCntrLisRequestT voptBscInqCntrLisRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscInqCntrLisRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqCntrLis.optBscInqCntrLisRequestT.prodId", lprodId);
	memcpy(voptBscInqCntrLisRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqCntrLisRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCntrLis.optBscInqCntrLisRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqCntrLisRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqCntrLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqCntrLisRecT getOptBscInqCntrLisRecT(char* testCaseNum , const char *root) {
	optBscInqCntrLisRecT voptBscInqCntrLisRecT;
	int i;

	char lcntrClasCod[1] = {""};
	getStrProperty("InqCntrLis.optBscInqCntrLisRecT.cntrClasCod", lcntrClasCod);
	voptBscInqCntrLisRecT.cntrClasCod = lcntrClasCod[0];

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		voptBscInqCntrLisRecT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("InqCntrLis.optBscInqCntrLisRecT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(voptBscInqCntrLisRecT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		voptBscInqCntrLisRecT.cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("InqCntrLis.optBscInqCntrLisRecT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(voptBscInqCntrLisRecT.cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXER_PRC_LEN;i++) {
		voptBscInqCntrLisRecT.cntrExerPrc[i]= ' ';
	}
	char lcntrExerPrc[CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("InqCntrLis.optBscInqCntrLisRecT.cntrExerPrc", lcntrExerPrc);
	memcpy(voptBscInqCntrLisRecT.cntrExerPrc, lcntrExerPrc, CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("InqCntrLis.optBscInqCntrLisRecT.cntrVersNo", lcntrVersNo);
	voptBscInqCntrLisRecT.cntrVersNo = lcntrVersNo[0];

	char lcntrStsCod[1] = {""};
	getStrProperty("InqCntrLis.optBscInqCntrLisRecT.cntrStsCod", lcntrStsCod);
	voptBscInqCntrLisRecT.cntrStsCod = lcntrStsCod[0];

	char llepoInd[1] = {""};
	getStrProperty("InqCntrLis.optBscInqCntrLisRecT.lepoInd", llepoInd);
	voptBscInqCntrLisRecT.lepoInd = llepoInd[0];
	return voptBscInqCntrLisRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqCntrLisResponseT getOptBscInqCntrLisResponseT(char* testCaseNum , const char *root) {
	optBscInqCntrLisResponseT voptBscInqCntrLisResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqCntrLisResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCntrLis.optBscInqCntrLisResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqCntrLisResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqCntrLisResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqCntrLis.optBscInqCntrLisResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqCntrLisResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqCntrLisResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqCntrLisRequestT* getFutInqCntrLisRequestT(char* testCaseNum) {
	vfutInqCntrLisRequestT = (futInqCntrLisRequestT*)malloc(sizeof(futInqCntrLisRequestT));
	int i;

	vfutInqCntrLisRequestT->header = getDataHeaderT(testCaseNum, "futInqCntrLisRequestT");
	vfutInqCntrLisRequestT->basic = getFutBscInqCntrLisRequestT(testCaseNum, "futInqCntrLisRequestT");
	return vfutInqCntrLisRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqCntrLisResponseT* getFutInqCntrLisResponseT(char* testCaseNum) {
	vfutInqCntrLisResponseT = (futInqCntrLisResponseT*)malloc(sizeof(futInqCntrLisResponseT));
	int i;

	vfutInqCntrLisResponseT->header = getDataHeaderT(testCaseNum, "futInqCntrLisResponseT");
	vfutInqCntrLisResponseT->basic = getFutBscInqCntrLisResponseT(testCaseNum, "futInqCntrLisResponseT");
	return vfutInqCntrLisResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqCntrLisRequestT* getOptInqCntrLisRequestT(char* testCaseNum) {
	voptInqCntrLisRequestT = (optInqCntrLisRequestT*)malloc(sizeof(optInqCntrLisRequestT));
	int i;

	voptInqCntrLisRequestT->header = getDataHeaderT(testCaseNum, "optInqCntrLisRequestT");
	voptInqCntrLisRequestT->basic = getOptBscInqCntrLisRequestT(testCaseNum, "optInqCntrLisRequestT");
	return voptInqCntrLisRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqCntrLisResponseT* getOptInqCntrLisResponseT(char* testCaseNum) {
	voptInqCntrLisResponseT = (optInqCntrLisResponseT*)malloc(sizeof(optInqCntrLisResponseT));
	int i;

	voptInqCntrLisResponseT->header = getDataHeaderT(testCaseNum, "optInqCntrLisResponseT");
	voptInqCntrLisResponseT->basic = getOptBscInqCntrLisResponseT(testCaseNum, "optInqCntrLisResponseT");
	return voptInqCntrLisResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqCntrLisRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqCntrLisRequestT));
	futInqCntrLisRequestT *vfutInqCntrLisRequestT = getFutInqCntrLisRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqCntrLisRequestT), (jbyte*) vfutInqCntrLisRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqCntrLisResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqCntrLisResponseT));
	futInqCntrLisResponseT *vfutInqCntrLisResponseT = getFutInqCntrLisResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqCntrLisResponseT), (jbyte*) vfutInqCntrLisResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqCntrLisRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqCntrLisRequestT));
	optInqCntrLisRequestT *voptInqCntrLisRequestT = getOptInqCntrLisRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqCntrLisRequestT), (jbyte*) voptInqCntrLisRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqCntrLisResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqCntrLisResponseT));
	optInqCntrLisResponseT *voptInqCntrLisResponseT = getOptInqCntrLisResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqCntrLisResponseT), (jbyte*) voptInqCntrLisResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqCntrLisRequestT(futBscInqCntrLisRequestT actual, futBscInqCntrLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrLisRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrLisRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqCntrLisRecT(futBscInqCntrLisRecT actual, futBscInqCntrLisRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrLisRecT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat, expected.cntrExpYrDat, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrLisRecT, cntrExpYrDat not matching. Actual %s but Expected %s", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrStsCod!= expected.cntrStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrLisRecT, cntrStsCodnot matching. Actual %d but Expected %d", actual.cntrStsCod, expected.cntrStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqCntrLisResponseT(futBscInqCntrLisResponseT actual, futBscInqCntrLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrLisResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrLisResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_CNTR_LIS_REC_MAX;i++) {
		compareFutBscInqCntrLisRecT (actual.futBscInqCntrLisRec[i],expected.futBscInqCntrLisRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqCntrLisRequestT(optBscInqCntrLisRequestT actual, optBscInqCntrLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrLisRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrLisRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqCntrLisRecT(optBscInqCntrLisRecT actual, optBscInqCntrLisRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrLisRecT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrLisRecT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat, expected.cntrExpYrDat, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrLisRecT, cntrExpYrDat not matching. Actual %s but Expected %s", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExerPrc, expected.cntrExerPrc, CNTR_EXER_PRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrLisRecT, cntrExerPrc not matching. Actual %s but Expected %s", actual.cntrExerPrc, expected.cntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrLisRecT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrStsCod!= expected.cntrStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrLisRecT, cntrStsCodnot matching. Actual %d but Expected %d", actual.cntrStsCod, expected.cntrStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.lepoInd!= expected.lepoInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrLisRecT, lepoIndnot matching. Actual %d but Expected %d", actual.lepoInd, expected.lepoInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqCntrLisResponseT(optBscInqCntrLisResponseT actual, optBscInqCntrLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrLisResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrLisResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_CNTR_LIS_REC_MAX;i++) {
		compareOptBscInqCntrLisRecT (actual.optBscInqCntrLisRec[i],expected.optBscInqCntrLisRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqCntrLisRequestT(futInqCntrLisRequestT actual, futInqCntrLisRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqCntrLisRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqCntrLisResponseT(futInqCntrLisResponseT actual, futInqCntrLisResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqCntrLisResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqCntrLisRequestT(optInqCntrLisRequestT actual, optInqCntrLisRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqCntrLisRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqCntrLisResponseT(optInqCntrLisResponseT actual, optInqCntrLisResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqCntrLisResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqCntrLisRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqCntrLisRequestT *actualData = (futInqCntrLisRequestT *)msgStruct;
	futInqCntrLisRequestT* expectedData = getFutInqCntrLisRequestT(testCaseNum);
	compareFutInqCntrLisRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqCntrLisResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqCntrLisResponseT *actualData = (futInqCntrLisResponseT *)msgStruct;
	futInqCntrLisResponseT* expectedData = getFutInqCntrLisResponseT(testCaseNum);
	compareFutInqCntrLisResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqCntrLisRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqCntrLisRequestT *actualData = (optInqCntrLisRequestT *)msgStruct;
	optInqCntrLisRequestT* expectedData = getOptInqCntrLisRequestT(testCaseNum);
	compareOptInqCntrLisRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqCntrLisResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqCntrLisResponseT *actualData = (optInqCntrLisResponseT *)msgStruct;
	optInqCntrLisResponseT* expectedData = getOptInqCntrLisResponseT(testCaseNum);
	compareOptInqCntrLisResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
