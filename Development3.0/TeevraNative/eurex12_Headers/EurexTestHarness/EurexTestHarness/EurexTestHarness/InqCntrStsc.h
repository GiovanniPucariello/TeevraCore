#include <InqCntrStsc.hxx>
#define BUFFER_SIZE 1000

futInqCntrStscRequestT *vfutInqCntrStscRequestT;
futInqCntrStscResponseT *vfutInqCntrStscResponseT;
optInqCntrStscRequestT *voptInqCntrStscRequestT;
optInqCntrStscResponseT *voptInqCntrStscResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqCntrStscRequestT getFutBscInqCntrStscRequestT(char* testCaseNum , const char *root) {
	futBscInqCntrStscRequestT vfutBscInqCntrStscRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqCntrStscRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqCntrStsc.futBscInqCntrStscRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqCntrStscRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqCntrStscRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCntrStsc.futBscInqCntrStscRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqCntrStscRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqCntrStscRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqCntrStscRecT getFutBscInqCntrStscRecT(char* testCaseNum , const char *root) {
	futBscInqCntrStscRecT vfutBscInqCntrStscRecT;
	int i;

	vfutBscInqCntrStscRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqCntrStscRecT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqCntrStscRecT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqCntrStsc.futBscInqCntrStscRecT.lstTrdPrc", llstTrdPrc);
	memcpy(vfutBscInqCntrStscRecT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqCntrStscRecT.totTrdQty[i]= ' ';
	}
	char ltotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqCntrStsc.futBscInqCntrStscRecT.totTrdQty", ltotTrdQty);
	memcpy(vfutBscInqCntrStscRecT.totTrdQty, ltotTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqCntrStscRecT.dlyHghPrc[i]= ' ';
	}
	char ldlyHghPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqCntrStsc.futBscInqCntrStscRecT.dlyHghPrc", ldlyHghPrc);
	memcpy(vfutBscInqCntrStscRecT.dlyHghPrc, ldlyHghPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqCntrStscRecT.dlyLowPrc[i]= ' ';
	}
	char ldlyLowPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqCntrStsc.futBscInqCntrStscRecT.dlyLowPrc", ldlyLowPrc);
	memcpy(vfutBscInqCntrStscRecT.dlyLowPrc, ldlyLowPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqCntrStscRecT.opnInt[i]= ' ';
	}
	char lopnInt[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqCntrStsc.futBscInqCntrStscRecT.opnInt", lopnInt);
	memcpy(vfutBscInqCntrStscRecT.opnInt, lopnInt, DRIV_QUANTITY_LEN);
	return vfutBscInqCntrStscRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqCntrStscResponseT getFutBscInqCntrStscResponseT(char* testCaseNum , const char *root) {
	futBscInqCntrStscResponseT vfutBscInqCntrStscResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqCntrStscResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCntrStsc.futBscInqCntrStscResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqCntrStscResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqCntrStscResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqCntrStsc.futBscInqCntrStscResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqCntrStscResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqCntrStscResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqCntrStscRecT getFutExtInqCntrStscRecT(char* testCaseNum , const char *root) {
	futExtInqCntrStscRecT vfutExtInqCntrStscRecT;
	int i;

	for(i=0;i<DRIV_DAY_TO_SETL_LEN;i++) {
		vfutExtInqCntrStscRecT.dayToSetl[i]= ' ';
	}
	char ldayToSetl[DRIV_DAY_TO_SETL_LEN] = {""};
	getStrProperty("InqCntrStsc.futExtInqCntrStscRecT.dayToSetl", ldayToSetl);
	memcpy(vfutExtInqCntrStscRecT.dayToSetl, ldayToSetl, DRIV_DAY_TO_SETL_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqCntrStscRecT.ipsQty[i]= ' ';
	}
	char lipsQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqCntrStsc.futExtInqCntrStscRecT.ipsQty", lipsQty);
	memcpy(vfutExtInqCntrStscRecT.ipsQty, lipsQty, DRIV_QUANTITY_LEN);

	vfutExtInqCntrStscRecT.totTrdQtyHistGrp = getTotTrdQtyHistGrpT(testCaseNum, "futExtInqCntrStscRecT");	return vfutExtInqCntrStscRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqCntrStscResponseT getFutExtInqCntrStscResponseT(char* testCaseNum , const char *root) {
	futExtInqCntrStscResponseT vfutExtInqCntrStscResponseT;
	int i;
	return vfutExtInqCntrStscResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqCntrStscRequestT getOptBscInqCntrStscRequestT(char* testCaseNum , const char *root) {
	optBscInqCntrStscRequestT voptBscInqCntrStscRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqCntrStscRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqCntrStsc.optBscInqCntrStscRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqCntrStscRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqCntrStscRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCntrStsc.optBscInqCntrStscRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqCntrStscRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqCntrStscRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqCntrStscRecT getOptBscInqCntrStscRecT(char* testCaseNum , const char *root) {
	optBscInqCntrStscRecT voptBscInqCntrStscRecT;
	int i;

	voptBscInqCntrStscRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqCntrStscRecT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqCntrStscRecT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqCntrStsc.optBscInqCntrStscRecT.lstTrdPrc", llstTrdPrc);
	memcpy(voptBscInqCntrStscRecT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqCntrStscRecT.totTrdQty[i]= ' ';
	}
	char ltotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqCntrStsc.optBscInqCntrStscRecT.totTrdQty", ltotTrdQty);
	memcpy(voptBscInqCntrStscRecT.totTrdQty, ltotTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqCntrStscRecT.dlyHghPrc[i]= ' ';
	}
	char ldlyHghPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqCntrStsc.optBscInqCntrStscRecT.dlyHghPrc", ldlyHghPrc);
	memcpy(voptBscInqCntrStscRecT.dlyHghPrc, ldlyHghPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqCntrStscRecT.dlyLowPrc[i]= ' ';
	}
	char ldlyLowPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqCntrStsc.optBscInqCntrStscRecT.dlyLowPrc", ldlyLowPrc);
	memcpy(voptBscInqCntrStscRecT.dlyLowPrc, ldlyLowPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqCntrStscRecT.opnInt[i]= ' ';
	}
	char lopnInt[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqCntrStsc.optBscInqCntrStscRecT.opnInt", lopnInt);
	memcpy(voptBscInqCntrStscRecT.opnInt, lopnInt, DRIV_QUANTITY_LEN);
	return voptBscInqCntrStscRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqCntrStscResponseT getOptBscInqCntrStscResponseT(char* testCaseNum , const char *root) {
	optBscInqCntrStscResponseT voptBscInqCntrStscResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqCntrStscResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCntrStsc.optBscInqCntrStscResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqCntrStscResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqCntrStscResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqCntrStsc.optBscInqCntrStscResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqCntrStscResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqCntrStscResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqCntrStscRecT getOptExtInqCntrStscRecT(char* testCaseNum , const char *root) {
	optExtInqCntrStscRecT voptExtInqCntrStscRecT;
	int i;

	for(i=0;i<DRIV_DAY_TO_SETL_LEN;i++) {
		voptExtInqCntrStscRecT.dayToSetl[i]= ' ';
	}
	char ldayToSetl[DRIV_DAY_TO_SETL_LEN] = {""};
	getStrProperty("InqCntrStsc.optExtInqCntrStscRecT.dayToSetl", ldayToSetl);
	memcpy(voptExtInqCntrStscRecT.dayToSetl, ldayToSetl, DRIV_DAY_TO_SETL_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqCntrStscRecT.ipsQty[i]= ' ';
	}
	char lipsQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqCntrStsc.optExtInqCntrStscRecT.ipsQty", lipsQty);
	memcpy(voptExtInqCntrStscRecT.ipsQty, lipsQty, DRIV_QUANTITY_LEN);

	voptExtInqCntrStscRecT.totTrdQtyHistGrp = getTotTrdQtyHistGrpT(testCaseNum, "optExtInqCntrStscRecT");	return voptExtInqCntrStscRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqCntrStscResponseT getOptExtInqCntrStscResponseT(char* testCaseNum , const char *root) {
	optExtInqCntrStscResponseT voptExtInqCntrStscResponseT;
	int i;
	return voptExtInqCntrStscResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqCntrStscRequestT* getFutInqCntrStscRequestT(char* testCaseNum) {
	vfutInqCntrStscRequestT = (futInqCntrStscRequestT*)malloc(sizeof(futInqCntrStscRequestT));
	int i;

	vfutInqCntrStscRequestT->header = getDataHeaderT(testCaseNum, "futInqCntrStscRequestT");
	vfutInqCntrStscRequestT->basic = getFutBscInqCntrStscRequestT(testCaseNum, "futInqCntrStscRequestT");
	return vfutInqCntrStscRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqCntrStscResponseT* getFutInqCntrStscResponseT(char* testCaseNum) {
	vfutInqCntrStscResponseT = (futInqCntrStscResponseT*)malloc(sizeof(futInqCntrStscResponseT));
	int i;

	vfutInqCntrStscResponseT->header = getDataHeaderT(testCaseNum, "futInqCntrStscResponseT");
	vfutInqCntrStscResponseT->basic = getFutBscInqCntrStscResponseT(testCaseNum, "futInqCntrStscResponseT");
	vfutInqCntrStscResponseT->extension = getFutExtInqCntrStscResponseT(testCaseNum, "futInqCntrStscResponseT");
	return vfutInqCntrStscResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqCntrStscRequestT* getOptInqCntrStscRequestT(char* testCaseNum) {
	voptInqCntrStscRequestT = (optInqCntrStscRequestT*)malloc(sizeof(optInqCntrStscRequestT));
	int i;

	voptInqCntrStscRequestT->header = getDataHeaderT(testCaseNum, "optInqCntrStscRequestT");
	voptInqCntrStscRequestT->basic = getOptBscInqCntrStscRequestT(testCaseNum, "optInqCntrStscRequestT");
	return voptInqCntrStscRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqCntrStscResponseT* getOptInqCntrStscResponseT(char* testCaseNum) {
	voptInqCntrStscResponseT = (optInqCntrStscResponseT*)malloc(sizeof(optInqCntrStscResponseT));
	int i;

	voptInqCntrStscResponseT->header = getDataHeaderT(testCaseNum, "optInqCntrStscResponseT");
	voptInqCntrStscResponseT->basic = getOptBscInqCntrStscResponseT(testCaseNum, "optInqCntrStscResponseT");
	voptInqCntrStscResponseT->extension = getOptExtInqCntrStscResponseT(testCaseNum, "optInqCntrStscResponseT");
	return voptInqCntrStscResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqCntrStscRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqCntrStscRequestT));
	futInqCntrStscRequestT *vfutInqCntrStscRequestT = getFutInqCntrStscRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqCntrStscRequestT), (jbyte*) vfutInqCntrStscRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqCntrStscResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqCntrStscResponseT));
	futInqCntrStscResponseT *vfutInqCntrStscResponseT = getFutInqCntrStscResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqCntrStscResponseT), (jbyte*) vfutInqCntrStscResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqCntrStscRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqCntrStscRequestT));
	optInqCntrStscRequestT *voptInqCntrStscRequestT = getOptInqCntrStscRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqCntrStscRequestT), (jbyte*) voptInqCntrStscRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqCntrStscResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqCntrStscResponseT));
	optInqCntrStscResponseT *voptInqCntrStscResponseT = getOptInqCntrStscResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqCntrStscResponseT), (jbyte*) voptInqCntrStscResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqCntrStscRequestT(futBscInqCntrStscRequestT actual, futBscInqCntrStscRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_CNTR_STSC_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrStscRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrStscRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqCntrStscRecT(futBscInqCntrStscRecT actual, futBscInqCntrStscRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrStscRecT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totTrdQty, expected.totTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrStscRecT, totTrdQty not matching. Actual %s but Expected %s", actual.totTrdQty, expected.totTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyHghPrc, expected.dlyHghPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrStscRecT, dlyHghPrc not matching. Actual %s but Expected %s", actual.dlyHghPrc, expected.dlyHghPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyLowPrc, expected.dlyLowPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrStscRecT, dlyLowPrc not matching. Actual %s but Expected %s", actual.dlyLowPrc, expected.dlyLowPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.opnInt, expected.opnInt, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrStscRecT, opnInt not matching. Actual %s but Expected %s", actual.opnInt, expected.opnInt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqCntrStscResponseT(futBscInqCntrStscResponseT actual, futBscInqCntrStscResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrStscResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrStscResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_CNTR_STSC_REC_MAX;i++) {
		compareFutBscInqCntrStscRecT (actual.futBscInqCntrStscRec[i],expected.futBscInqCntrStscRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqCntrStscRecT(futExtInqCntrStscRecT actual, futExtInqCntrStscRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dayToSetl, expected.dayToSetl, DRIV_DAY_TO_SETL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqCntrStscRecT, dayToSetl not matching. Actual %s but Expected %s", actual.dayToSetl, expected.dayToSetl);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ipsQty, expected.ipsQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqCntrStscRecT, ipsQty not matching. Actual %s but Expected %s", actual.ipsQty, expected.ipsQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTotTrdQtyHistGrpT (actual.totTrdQtyHistGrp,expected.totTrdQtyHistGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqCntrStscResponseT(futExtInqCntrStscResponseT actual, futExtInqCntrStscResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_CNTR_STSC_REC_MAX;i++) {
		compareFutExtInqCntrStscRecT (actual.futExtInqCntrStscRec[i],expected.futExtInqCntrStscRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqCntrStscRequestT(optBscInqCntrStscRequestT actual, optBscInqCntrStscRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_BSC_INQ_CNTR_STSC_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrStscRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrStscRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqCntrStscRecT(optBscInqCntrStscRecT actual, optBscInqCntrStscRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrStscRecT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totTrdQty, expected.totTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrStscRecT, totTrdQty not matching. Actual %s but Expected %s", actual.totTrdQty, expected.totTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyHghPrc, expected.dlyHghPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrStscRecT, dlyHghPrc not matching. Actual %s but Expected %s", actual.dlyHghPrc, expected.dlyHghPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyLowPrc, expected.dlyLowPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrStscRecT, dlyLowPrc not matching. Actual %s but Expected %s", actual.dlyLowPrc, expected.dlyLowPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.opnInt, expected.opnInt, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrStscRecT, opnInt not matching. Actual %s but Expected %s", actual.opnInt, expected.opnInt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqCntrStscResponseT(optBscInqCntrStscResponseT actual, optBscInqCntrStscResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrStscResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrStscResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_CNTR_STSC_REC_MAX;i++) {
		compareOptBscInqCntrStscRecT (actual.optBscInqCntrStscRec[i],expected.optBscInqCntrStscRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqCntrStscRecT(optExtInqCntrStscRecT actual, optExtInqCntrStscRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dayToSetl, expected.dayToSetl, DRIV_DAY_TO_SETL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqCntrStscRecT, dayToSetl not matching. Actual %s but Expected %s", actual.dayToSetl, expected.dayToSetl);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ipsQty, expected.ipsQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqCntrStscRecT, ipsQty not matching. Actual %s but Expected %s", actual.ipsQty, expected.ipsQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTotTrdQtyHistGrpT (actual.totTrdQtyHistGrp,expected.totTrdQtyHistGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqCntrStscResponseT(optExtInqCntrStscResponseT actual, optExtInqCntrStscResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_CNTR_STSC_REC_MAX;i++) {
		compareOptExtInqCntrStscRecT (actual.optExtInqCntrStscRec[i],expected.optExtInqCntrStscRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqCntrStscRequestT(futInqCntrStscRequestT actual, futInqCntrStscRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqCntrStscRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqCntrStscResponseT(futInqCntrStscResponseT actual, futInqCntrStscResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqCntrStscResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqCntrStscResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqCntrStscRequestT(optInqCntrStscRequestT actual, optInqCntrStscRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqCntrStscRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqCntrStscResponseT(optInqCntrStscResponseT actual, optInqCntrStscResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqCntrStscResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqCntrStscResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqCntrStscRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqCntrStscRequestT *actualData = (futInqCntrStscRequestT *)msgStruct;
	futInqCntrStscRequestT* expectedData = getFutInqCntrStscRequestT(testCaseNum);
	compareFutInqCntrStscRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqCntrStscResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqCntrStscResponseT *actualData = (futInqCntrStscResponseT *)msgStruct;
	futInqCntrStscResponseT* expectedData = getFutInqCntrStscResponseT(testCaseNum);
	compareFutInqCntrStscResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqCntrStscRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqCntrStscRequestT *actualData = (optInqCntrStscRequestT *)msgStruct;
	optInqCntrStscRequestT* expectedData = getOptInqCntrStscRequestT(testCaseNum);
	compareOptInqCntrStscRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqCntrStscResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqCntrStscResponseT *actualData = (optInqCntrStscResponseT *)msgStruct;
	optInqCntrStscResponseT* expectedData = getOptInqCntrStscResponseT(testCaseNum);
	compareOptInqCntrStscResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
