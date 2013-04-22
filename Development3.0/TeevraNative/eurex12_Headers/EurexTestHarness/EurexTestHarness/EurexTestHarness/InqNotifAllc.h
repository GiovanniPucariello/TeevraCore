#include <InqNotifAllc.hxx>
#define BUFFER_SIZE 1000

futInqNotifAllcRequestT *vfutInqNotifAllcRequestT;
futInqNotifAllcResponseT *vfutInqNotifAllcResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqNotifAllcRequestT getFutBscInqNotifAllcRequestT(char* testCaseNum , const char *root) {
	futBscInqNotifAllcRequestT vfutBscInqNotifAllcRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqNotifAllcRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqNotifAllc.futBscInqNotifAllcRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqNotifAllcRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqNotifAllcRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqNotifAllc.futBscInqNotifAllcRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqNotifAllcRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqNotifAllcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqNotifAllcRecT getFutBscInqNotifAllcRecT(char* testCaseNum , const char *root) {
	futBscInqNotifAllcRecT vfutBscInqNotifAllcRecT;
	int i;

	vfutBscInqNotifAllcRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqNotifAllcRecT");
	for(i=0;i<ISIN_COD_LEN;i++) {
		vfutBscInqNotifAllcRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqNotifAllc.futBscInqNotifAllcRecT.isinCod", lisinCod);
	memcpy(vfutBscInqNotifAllcRecT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqNotifAllcRecT.notifQty[i]= ' ';
	}
	char lnotifQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqNotifAllc.futBscInqNotifAllcRecT.notifQty", lnotifQty);
	memcpy(vfutBscInqNotifAllcRecT.notifQty, lnotifQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqNotifAllcRecT.allcQty[i]= ' ';
	}
	char lallcQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqNotifAllc.futBscInqNotifAllcRecT.allcQty", lallcQty);
	memcpy(vfutBscInqNotifAllcRecT.allcQty, lallcQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscInqNotifAllcRecT.faceAmnt[i]= ' ';
	}
	char lfaceAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqNotifAllc.futBscInqNotifAllcRecT.faceAmnt", lfaceAmnt);
	memcpy(vfutBscInqNotifAllcRecT.faceAmnt, lfaceAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscInqNotifAllcRecT.invcAmnt[i]= ' ';
	}
	char linvcAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqNotifAllc.futBscInqNotifAllcRecT.invcAmnt", linvcAmnt);
	memcpy(vfutBscInqNotifAllcRecT.invcAmnt, linvcAmnt, DRIV_AMOUNT_LEN);
	return vfutBscInqNotifAllcRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqNotifAllcResponseT getFutBscInqNotifAllcResponseT(char* testCaseNum , const char *root) {
	futBscInqNotifAllcResponseT vfutBscInqNotifAllcResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqNotifAllcResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqNotifAllc.futBscInqNotifAllcResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqNotifAllcResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqNotifAllcResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqNotifAllc.futBscInqNotifAllcResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqNotifAllcResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqNotifAllcResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqNotifAllcRecT getFutExtInqNotifAllcRecT(char* testCaseNum , const char *root) {
	futExtInqNotifAllcRecT vfutExtInqNotifAllcRecT;
	int i;

	for(i=0;i<PROD_SHT_NAM_LEN;i++) {
		vfutExtInqNotifAllcRecT.prodShtNam[i]= ' ';
	}
	char lprodShtNam[PROD_SHT_NAM_LEN] = {""};
	getStrProperty("InqNotifAllc.futExtInqNotifAllcRecT.prodShtNam", lprodShtNam);
	memcpy(vfutExtInqNotifAllcRecT.prodShtNam, lprodShtNam, PROD_SHT_NAM_LEN);
	return vfutExtInqNotifAllcRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqNotifAllcResponseT getFutExtInqNotifAllcResponseT(char* testCaseNum , const char *root) {
	futExtInqNotifAllcResponseT vfutExtInqNotifAllcResponseT;
	int i;
	return vfutExtInqNotifAllcResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqNotifAllcRequestT* getFutInqNotifAllcRequestT(char* testCaseNum) {
	vfutInqNotifAllcRequestT = (futInqNotifAllcRequestT*)malloc(sizeof(futInqNotifAllcRequestT));
	int i;

	vfutInqNotifAllcRequestT->header = getDataHeaderT(testCaseNum, "futInqNotifAllcRequestT");
	vfutInqNotifAllcRequestT->basic = getFutBscInqNotifAllcRequestT(testCaseNum, "futInqNotifAllcRequestT");
	return vfutInqNotifAllcRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqNotifAllcResponseT* getFutInqNotifAllcResponseT(char* testCaseNum) {
	vfutInqNotifAllcResponseT = (futInqNotifAllcResponseT*)malloc(sizeof(futInqNotifAllcResponseT));
	int i;

	vfutInqNotifAllcResponseT->header = getDataHeaderT(testCaseNum, "futInqNotifAllcResponseT");
	vfutInqNotifAllcResponseT->basic = getFutBscInqNotifAllcResponseT(testCaseNum, "futInqNotifAllcResponseT");
	vfutInqNotifAllcResponseT->extension = getFutExtInqNotifAllcResponseT(testCaseNum, "futInqNotifAllcResponseT");
	return vfutInqNotifAllcResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqNotifAllcRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqNotifAllcRequestT));
	futInqNotifAllcRequestT *vfutInqNotifAllcRequestT = getFutInqNotifAllcRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqNotifAllcRequestT), (jbyte*) vfutInqNotifAllcRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqNotifAllcResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqNotifAllcResponseT));
	futInqNotifAllcResponseT *vfutInqNotifAllcResponseT = getFutInqNotifAllcResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqNotifAllcResponseT), (jbyte*) vfutInqNotifAllcResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqNotifAllcRequestT(futBscInqNotifAllcRequestT actual, futBscInqNotifAllcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_NOTIF_ALLC_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifAllcRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifAllcRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqNotifAllcRecT(futBscInqNotifAllcRecT actual, futBscInqNotifAllcRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifAllcRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.notifQty, expected.notifQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifAllcRecT, notifQty not matching. Actual %s but Expected %s", actual.notifQty, expected.notifQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.allcQty, expected.allcQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifAllcRecT, allcQty not matching. Actual %s but Expected %s", actual.allcQty, expected.allcQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.faceAmnt, expected.faceAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifAllcRecT, faceAmnt not matching. Actual %s but Expected %s", actual.faceAmnt, expected.faceAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.invcAmnt, expected.invcAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifAllcRecT, invcAmnt not matching. Actual %s but Expected %s", actual.invcAmnt, expected.invcAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqNotifAllcResponseT(futBscInqNotifAllcResponseT actual, futBscInqNotifAllcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifAllcResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifAllcResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_NOTIF_ALLC_REC_MAX;i++) {
		compareFutBscInqNotifAllcRecT (actual.futBscInqNotifAllcRec[i],expected.futBscInqNotifAllcRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqNotifAllcRecT(futExtInqNotifAllcRecT actual, futExtInqNotifAllcRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodShtNam, expected.prodShtNam, PROD_SHT_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqNotifAllcRecT, prodShtNam not matching. Actual %s but Expected %s", actual.prodShtNam, expected.prodShtNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqNotifAllcResponseT(futExtInqNotifAllcResponseT actual, futExtInqNotifAllcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_NOTIF_ALLC_REC_MAX;i++) {
		compareFutExtInqNotifAllcRecT (actual.futExtInqNotifAllcRec[i],expected.futExtInqNotifAllcRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqNotifAllcRequestT(futInqNotifAllcRequestT actual, futInqNotifAllcRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqNotifAllcRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqNotifAllcResponseT(futInqNotifAllcResponseT actual, futInqNotifAllcResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqNotifAllcResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqNotifAllcResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqNotifAllcRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqNotifAllcRequestT *actualData = (futInqNotifAllcRequestT *)msgStruct;
	futInqNotifAllcRequestT* expectedData = getFutInqNotifAllcRequestT(testCaseNum);
	compareFutInqNotifAllcRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqNotifAllcResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqNotifAllcResponseT *actualData = (futInqNotifAllcResponseT *)msgStruct;
	futInqNotifAllcResponseT* expectedData = getFutInqNotifAllcResponseT(testCaseNum);
	compareFutInqNotifAllcResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
