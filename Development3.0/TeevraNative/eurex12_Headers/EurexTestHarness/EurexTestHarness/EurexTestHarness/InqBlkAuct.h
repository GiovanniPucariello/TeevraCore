#include <InqBlkAuct.hxx>
#define BUFFER_SIZE 1000

futInqBlkAuctRequestT *vfutInqBlkAuctRequestT;
futInqBlkAuctResponseT *vfutInqBlkAuctResponseT;
optInqBlkAuctRequestT *voptInqBlkAuctRequestT;
optInqBlkAuctResponseT *voptInqBlkAuctResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqBlkAuctRequestT getFutBscInqBlkAuctRequestT(char* testCaseNum , const char *root) {
	futBscInqBlkAuctRequestT vfutBscInqBlkAuctRequestT;
	int i;

	vfutBscInqBlkAuctRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqBlkAuctRequestT");
	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqBlkAuctRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqBlkAuct.futBscInqBlkAuctRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqBlkAuctRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqBlkAuctRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqBlkAuct.futBscInqBlkAuctRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqBlkAuctRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqBlkAuctRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqBlkAuctRecT getFutBscInqBlkAuctRecT(char* testCaseNum , const char *root) {
	futBscInqBlkAuctRecT vfutBscInqBlkAuctRecT;
	int i;

	vfutBscInqBlkAuctRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqBlkAuctRecT");
	char lblkAuctStsCod[1] = {""};
	getStrProperty("InqBlkAuct.futBscInqBlkAuctRecT.blkAuctStsCod", lblkAuctStsCod);
	vfutBscInqBlkAuctRecT.blkAuctStsCod = lblkAuctStsCod[0];

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqBlkAuctRecT.blkAuctStrtTim[i]= ' ';
	}
	char lblkAuctStrtTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqBlkAuct.futBscInqBlkAuctRecT.blkAuctStrtTim", lblkAuctStrtTim);
	memcpy(vfutBscInqBlkAuctRecT.blkAuctStrtTim, lblkAuctStrtTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqBlkAuctRecT.blkAuctQty[i]= ' ';
	}
	char lblkAuctQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqBlkAuct.futBscInqBlkAuctRecT.blkAuctQty", lblkAuctQty);
	memcpy(vfutBscInqBlkAuctRecT.blkAuctQty, lblkAuctQty, DRIV_QUANTITY_LEN);

	vfutBscInqBlkAuctRecT.blkAuctPotPrcGrp = getBlkAuctPotPrcGrpT(testCaseNum, "futBscInqBlkAuctRecT");
	for(i=0;i<MBR_RTNG_LEN;i++) {
		vfutBscInqBlkAuctRecT.membRtng[i]= ' ';
	}
	char lmembRtng[MBR_RTNG_LEN] = {""};
	getStrProperty("InqBlkAuct.futBscInqBlkAuctRecT.membRtng", lmembRtng);
	memcpy(vfutBscInqBlkAuctRecT.membRtng, lmembRtng, MBR_RTNG_LEN);
	return vfutBscInqBlkAuctRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqBlkAuctResponseT getFutBscInqBlkAuctResponseT(char* testCaseNum , const char *root) {
	futBscInqBlkAuctResponseT vfutBscInqBlkAuctResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqBlkAuctResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqBlkAuct.futBscInqBlkAuctResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqBlkAuctResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqBlkAuctResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqBlkAuct.futBscInqBlkAuctResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqBlkAuctResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqBlkAuctResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqBlkAuctRequestT getOptBscInqBlkAuctRequestT(char* testCaseNum , const char *root) {
	optBscInqBlkAuctRequestT voptBscInqBlkAuctRequestT;
	int i;

	voptBscInqBlkAuctRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqBlkAuctRequestT");
	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqBlkAuctRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqBlkAuct.optBscInqBlkAuctRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqBlkAuctRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqBlkAuctRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqBlkAuct.optBscInqBlkAuctRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqBlkAuctRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqBlkAuctRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqBlkAuctRecT getOptBscInqBlkAuctRecT(char* testCaseNum , const char *root) {
	optBscInqBlkAuctRecT voptBscInqBlkAuctRecT;
	int i;

	voptBscInqBlkAuctRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqBlkAuctRecT");
	char lblkAuctStsCod[1] = {""};
	getStrProperty("InqBlkAuct.optBscInqBlkAuctRecT.blkAuctStsCod", lblkAuctStsCod);
	voptBscInqBlkAuctRecT.blkAuctStsCod = lblkAuctStsCod[0];

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqBlkAuctRecT.blkAuctStrtTim[i]= ' ';
	}
	char lblkAuctStrtTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqBlkAuct.optBscInqBlkAuctRecT.blkAuctStrtTim", lblkAuctStrtTim);
	memcpy(voptBscInqBlkAuctRecT.blkAuctStrtTim, lblkAuctStrtTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqBlkAuctRecT.blkAuctQty[i]= ' ';
	}
	char lblkAuctQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqBlkAuct.optBscInqBlkAuctRecT.blkAuctQty", lblkAuctQty);
	memcpy(voptBscInqBlkAuctRecT.blkAuctQty, lblkAuctQty, DRIV_QUANTITY_LEN);

	voptBscInqBlkAuctRecT.blkAuctPotPrcGrp = getBlkAuctPotPrcGrpT(testCaseNum, "optBscInqBlkAuctRecT");
	for(i=0;i<MBR_RTNG_LEN;i++) {
		voptBscInqBlkAuctRecT.membRtng[i]= ' ';
	}
	char lmembRtng[MBR_RTNG_LEN] = {""};
	getStrProperty("InqBlkAuct.optBscInqBlkAuctRecT.membRtng", lmembRtng);
	memcpy(voptBscInqBlkAuctRecT.membRtng, lmembRtng, MBR_RTNG_LEN);
	return voptBscInqBlkAuctRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqBlkAuctResponseT getOptBscInqBlkAuctResponseT(char* testCaseNum , const char *root) {
	optBscInqBlkAuctResponseT voptBscInqBlkAuctResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqBlkAuctResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqBlkAuct.optBscInqBlkAuctResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqBlkAuctResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqBlkAuctResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqBlkAuct.optBscInqBlkAuctResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqBlkAuctResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqBlkAuctResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqBlkAuctRequestT* getFutInqBlkAuctRequestT(char* testCaseNum) {
	vfutInqBlkAuctRequestT = (futInqBlkAuctRequestT*)malloc(sizeof(futInqBlkAuctRequestT));
	int i;

	vfutInqBlkAuctRequestT->header = getDataHeaderT(testCaseNum, "futInqBlkAuctRequestT");
	vfutInqBlkAuctRequestT->basic = getFutBscInqBlkAuctRequestT(testCaseNum, "futInqBlkAuctRequestT");
	return vfutInqBlkAuctRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqBlkAuctResponseT* getFutInqBlkAuctResponseT(char* testCaseNum) {
	vfutInqBlkAuctResponseT = (futInqBlkAuctResponseT*)malloc(sizeof(futInqBlkAuctResponseT));
	int i;

	vfutInqBlkAuctResponseT->header = getDataHeaderT(testCaseNum, "futInqBlkAuctResponseT");
	vfutInqBlkAuctResponseT->basic = getFutBscInqBlkAuctResponseT(testCaseNum, "futInqBlkAuctResponseT");
	return vfutInqBlkAuctResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqBlkAuctRequestT* getOptInqBlkAuctRequestT(char* testCaseNum) {
	voptInqBlkAuctRequestT = (optInqBlkAuctRequestT*)malloc(sizeof(optInqBlkAuctRequestT));
	int i;

	voptInqBlkAuctRequestT->header = getDataHeaderT(testCaseNum, "optInqBlkAuctRequestT");
	voptInqBlkAuctRequestT->basic = getOptBscInqBlkAuctRequestT(testCaseNum, "optInqBlkAuctRequestT");
	return voptInqBlkAuctRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqBlkAuctResponseT* getOptInqBlkAuctResponseT(char* testCaseNum) {
	voptInqBlkAuctResponseT = (optInqBlkAuctResponseT*)malloc(sizeof(optInqBlkAuctResponseT));
	int i;

	voptInqBlkAuctResponseT->header = getDataHeaderT(testCaseNum, "optInqBlkAuctResponseT");
	voptInqBlkAuctResponseT->basic = getOptBscInqBlkAuctResponseT(testCaseNum, "optInqBlkAuctResponseT");
	return voptInqBlkAuctResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqBlkAuctRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqBlkAuctRequestT));
	futInqBlkAuctRequestT *vfutInqBlkAuctRequestT = getFutInqBlkAuctRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqBlkAuctRequestT), (jbyte*) vfutInqBlkAuctRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqBlkAuctResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqBlkAuctResponseT));
	futInqBlkAuctResponseT *vfutInqBlkAuctResponseT = getFutInqBlkAuctResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqBlkAuctResponseT), (jbyte*) vfutInqBlkAuctResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqBlkAuctRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqBlkAuctRequestT));
	optInqBlkAuctRequestT *voptInqBlkAuctRequestT = getOptInqBlkAuctRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqBlkAuctRequestT), (jbyte*) voptInqBlkAuctRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqBlkAuctResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqBlkAuctResponseT));
	optInqBlkAuctResponseT *voptInqBlkAuctResponseT = getOptInqBlkAuctResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqBlkAuctResponseT), (jbyte*) voptInqBlkAuctResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqBlkAuctRequestT(futBscInqBlkAuctRequestT actual, futBscInqBlkAuctRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_BLK_AUCT_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkAuctRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkAuctRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqBlkAuctRecT(futBscInqBlkAuctRecT actual, futBscInqBlkAuctRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if (actual.blkAuctStsCod!= expected.blkAuctStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkAuctRecT, blkAuctStsCodnot matching. Actual %d but Expected %d", actual.blkAuctStsCod, expected.blkAuctStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctStrtTim, expected.blkAuctStrtTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkAuctRecT, blkAuctStrtTim not matching. Actual %s but Expected %s", actual.blkAuctStrtTim, expected.blkAuctStrtTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQty, expected.blkAuctQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkAuctRecT, blkAuctQty not matching. Actual %s but Expected %s", actual.blkAuctQty, expected.blkAuctQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareBlkAuctPotPrcGrpT (actual.blkAuctPotPrcGrp,expected.blkAuctPotPrcGrp, logMsg);
	if ( memcmp(actual.membRtng, expected.membRtng, MBR_RTNG_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkAuctRecT, membRtng not matching. Actual %s but Expected %s", actual.membRtng, expected.membRtng);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqBlkAuctResponseT(futBscInqBlkAuctResponseT actual, futBscInqBlkAuctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkAuctResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkAuctResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_INQ_BLK_AUCT_REC_MAX;i++) {
		compareFutBscInqBlkAuctRecT (actual.futBscInqBlkAuctRec[i],expected.futBscInqBlkAuctRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqBlkAuctRequestT(optBscInqBlkAuctRequestT actual, optBscInqBlkAuctRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_BSC_INQ_BLK_AUCT_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkAuctRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkAuctRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqBlkAuctRecT(optBscInqBlkAuctRecT actual, optBscInqBlkAuctRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if (actual.blkAuctStsCod!= expected.blkAuctStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkAuctRecT, blkAuctStsCodnot matching. Actual %d but Expected %d", actual.blkAuctStsCod, expected.blkAuctStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctStrtTim, expected.blkAuctStrtTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkAuctRecT, blkAuctStrtTim not matching. Actual %s but Expected %s", actual.blkAuctStrtTim, expected.blkAuctStrtTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQty, expected.blkAuctQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkAuctRecT, blkAuctQty not matching. Actual %s but Expected %s", actual.blkAuctQty, expected.blkAuctQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareBlkAuctPotPrcGrpT (actual.blkAuctPotPrcGrp,expected.blkAuctPotPrcGrp, logMsg);
	if ( memcmp(actual.membRtng, expected.membRtng, MBR_RTNG_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkAuctRecT, membRtng not matching. Actual %s but Expected %s", actual.membRtng, expected.membRtng);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqBlkAuctResponseT(optBscInqBlkAuctResponseT actual, optBscInqBlkAuctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkAuctResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkAuctResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_INQ_BLK_AUCT_REC_MAX;i++) {
		compareOptBscInqBlkAuctRecT (actual.optBscInqBlkAuctRec[i],expected.optBscInqBlkAuctRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqBlkAuctRequestT(futInqBlkAuctRequestT actual, futInqBlkAuctRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqBlkAuctRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqBlkAuctResponseT(futInqBlkAuctResponseT actual, futInqBlkAuctResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqBlkAuctResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqBlkAuctRequestT(optInqBlkAuctRequestT actual, optInqBlkAuctRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqBlkAuctRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqBlkAuctResponseT(optInqBlkAuctResponseT actual, optInqBlkAuctResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqBlkAuctResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqBlkAuctRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqBlkAuctRequestT *actualData = (futInqBlkAuctRequestT *)msgStruct;
	futInqBlkAuctRequestT* expectedData = getFutInqBlkAuctRequestT(testCaseNum);
	compareFutInqBlkAuctRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqBlkAuctResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqBlkAuctResponseT *actualData = (futInqBlkAuctResponseT *)msgStruct;
	futInqBlkAuctResponseT* expectedData = getFutInqBlkAuctResponseT(testCaseNum);
	compareFutInqBlkAuctResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqBlkAuctRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqBlkAuctRequestT *actualData = (optInqBlkAuctRequestT *)msgStruct;
	optInqBlkAuctRequestT* expectedData = getOptInqBlkAuctRequestT(testCaseNum);
	compareOptInqBlkAuctRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqBlkAuctResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqBlkAuctResponseT *actualData = (optInqBlkAuctResponseT *)msgStruct;
	optInqBlkAuctResponseT* expectedData = getOptInqBlkAuctResponseT(testCaseNum);
	compareOptInqBlkAuctResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
