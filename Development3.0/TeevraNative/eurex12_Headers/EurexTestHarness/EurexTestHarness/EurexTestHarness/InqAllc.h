#include <InqAllc.hxx>
#define BUFFER_SIZE 1000

futInqAllcRequestT *vfutInqAllcRequestT;
futInqAllcResponseT *vfutInqAllcResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqAllcRequestT getFutBscInqAllcRequestT(char* testCaseNum , const char *root) {
	futBscInqAllcRequestT vfutBscInqAllcRequestT;
	int i;

	vfutBscInqAllcRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqAllcRequestT");
	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscInqAllcRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqAllc.futBscInqAllcRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscInqAllcRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqAllcRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqAllc.futBscInqAllcRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqAllcRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqAllcRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllc.futBscInqAllcRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqAllcRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqAllcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqAllcRecT getFutBscInqAllcRecT(char* testCaseNum , const char *root) {
	futBscInqAllcRecT vfutBscInqAllcRecT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscInqAllcRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqAllc.futBscInqAllcRecT.currTypCod", lcurrTypCod);
	memcpy(vfutBscInqAllcRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vfutBscInqAllcRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqAllc.futBscInqAllcRecT.isinCod", lisinCod);
	memcpy(vfutBscInqAllcRecT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscInqAllcRecT.invcAmnt[i]= ' ';
	}
	char linvcAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqAllc.futBscInqAllcRecT.invcAmnt", linvcAmnt);
	memcpy(vfutBscInqAllcRecT.invcAmnt, linvcAmnt, DRIV_AMOUNT_LEN);

	vfutBscInqAllcRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqAllcRecT");
	vfutBscInqAllcRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqAllcRecT");	return vfutBscInqAllcRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqAllcResponseT getFutBscInqAllcResponseT(char* testCaseNum , const char *root) {
	futBscInqAllcResponseT vfutBscInqAllcResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqAllcResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllc.futBscInqAllcResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqAllcResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqAllcResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqAllc.futBscInqAllcResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqAllcResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqAllcResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqAllcRecT getFutExtInqAllcRecT(char* testCaseNum , const char *root) {
	futExtInqAllcRecT vfutExtInqAllcRecT;
	int i;

	for(i=0;i<DRIV_SECU_NAM_LEN;i++) {
		vfutExtInqAllcRecT.secuNam[i]= ' ';
	}
	char lsecuNam[DRIV_SECU_NAM_LEN] = {""};
	getStrProperty("InqAllc.futExtInqAllcRecT.secuNam", lsecuNam);
	memcpy(vfutExtInqAllcRecT.secuNam, lsecuNam, DRIV_SECU_NAM_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqAllcRecT.allcQty[i]= ' ';
	}
	char lallcQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqAllc.futExtInqAllcRecT.allcQty", lallcQty);
	memcpy(vfutExtInqAllcRecT.allcQty, lallcQty, DRIV_QUANTITY_LEN);
	return vfutExtInqAllcRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqAllcResponseT getFutExtInqAllcResponseT(char* testCaseNum , const char *root) {
	futExtInqAllcResponseT vfutExtInqAllcResponseT;
	int i;
	return vfutExtInqAllcResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqAllcRequestT* getFutInqAllcRequestT(char* testCaseNum) {
	vfutInqAllcRequestT = (futInqAllcRequestT*)malloc(sizeof(futInqAllcRequestT));
	int i;

	vfutInqAllcRequestT->header = getDataHeaderT(testCaseNum, "futInqAllcRequestT");
	vfutInqAllcRequestT->basic = getFutBscInqAllcRequestT(testCaseNum, "futInqAllcRequestT");
	return vfutInqAllcRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqAllcResponseT* getFutInqAllcResponseT(char* testCaseNum) {
	vfutInqAllcResponseT = (futInqAllcResponseT*)malloc(sizeof(futInqAllcResponseT));
	int i;

	vfutInqAllcResponseT->header = getDataHeaderT(testCaseNum, "futInqAllcResponseT");
	vfutInqAllcResponseT->basic = getFutBscInqAllcResponseT(testCaseNum, "futInqAllcResponseT");
	vfutInqAllcResponseT->extension = getFutExtInqAllcResponseT(testCaseNum, "futInqAllcResponseT");
	return vfutInqAllcResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqAllcRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqAllcRequestT));
	futInqAllcRequestT *vfutInqAllcRequestT = getFutInqAllcRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqAllcRequestT), (jbyte*) vfutInqAllcRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqAllcResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqAllcResponseT));
	futInqAllcResponseT *vfutInqAllcResponseT = getFutInqAllcResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqAllcResponseT), (jbyte*) vfutInqAllcResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqAllcRequestT(futBscInqAllcRequestT actual, futBscInqAllcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_ALLC_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllcRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllcRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllcRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqAllcRecT(futBscInqAllcRecT actual, futBscInqAllcRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllcRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllcRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.invcAmnt, expected.invcAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllcRecT, invcAmnt not matching. Actual %s but Expected %s", actual.invcAmnt, expected.invcAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqAllcResponseT(futBscInqAllcResponseT actual, futBscInqAllcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllcResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllcResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_ALLC_REC_MAX;i++) {
		compareFutBscInqAllcRecT (actual.futBscInqAllcRec[i],expected.futBscInqAllcRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqAllcRecT(futExtInqAllcRecT actual, futExtInqAllcRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.secuNam, expected.secuNam, DRIV_SECU_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqAllcRecT, secuNam not matching. Actual %s but Expected %s", actual.secuNam, expected.secuNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.allcQty, expected.allcQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqAllcRecT, allcQty not matching. Actual %s but Expected %s", actual.allcQty, expected.allcQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqAllcResponseT(futExtInqAllcResponseT actual, futExtInqAllcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_ALLC_REC_MAX;i++) {
		compareFutExtInqAllcRecT (actual.futExtInqAllcRec[i],expected.futExtInqAllcRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqAllcRequestT(futInqAllcRequestT actual, futInqAllcRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqAllcRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqAllcResponseT(futInqAllcResponseT actual, futInqAllcResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqAllcResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqAllcResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqAllcRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqAllcRequestT *actualData = (futInqAllcRequestT *)msgStruct;
	futInqAllcRequestT* expectedData = getFutInqAllcRequestT(testCaseNum);
	compareFutInqAllcRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqAllcResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqAllcResponseT *actualData = (futInqAllcResponseT *)msgStruct;
	futInqAllcResponseT* expectedData = getFutInqAllcResponseT(testCaseNum);
	compareFutInqAllcResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
