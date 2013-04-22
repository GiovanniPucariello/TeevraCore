#include <InqDelvPosn.hxx>
#define BUFFER_SIZE 1000

futInqDelvPosnRequestT *vfutInqDelvPosnRequestT;
futInqDelvPosnResponseT *vfutInqDelvPosnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqDelvPosnRequestT getFutBscInqDelvPosnRequestT(char* testCaseNum , const char *root) {
	futBscInqDelvPosnRequestT vfutBscInqDelvPosnRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqDelvPosnRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqDelvPosn.futBscInqDelvPosnRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqDelvPosnRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqDelvPosnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqDelvPosn.futBscInqDelvPosnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqDelvPosnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqDelvPosnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqDelvPosnResponseT getFutBscInqDelvPosnResponseT(char* testCaseNum , const char *root) {
	futBscInqDelvPosnResponseT vfutBscInqDelvPosnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqDelvPosnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqDelvPosn.futBscInqDelvPosnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqDelvPosnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqDelvPosnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqDelvPosn.futBscInqDelvPosnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqDelvPosnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqDelvPosnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqDelvPosnRecT getFutExtInqDelvPosnRecT(char* testCaseNum , const char *root) {
	futExtInqDelvPosnRecT vfutExtInqDelvPosnRecT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtInqDelvPosnRecT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqDelvPosn.futExtInqDelvPosnRecT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtInqDelvPosnRecT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutExtInqDelvPosnRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqDelvPosn.futExtInqDelvPosnRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutExtInqDelvPosnRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutExtInqDelvPosnRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtInqDelvPosnRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqDelvPosnRecT.opnLngQty[i]= ' ';
	}
	char lopnLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqDelvPosn.futExtInqDelvPosnRecT.opnLngQty", lopnLngQty);
	memcpy(vfutExtInqDelvPosnRecT.opnLngQty, lopnLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqDelvPosnRecT.opnShtQty[i]= ' ';
	}
	char lopnShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqDelvPosn.futExtInqDelvPosnRecT.opnShtQty", lopnShtQty);
	memcpy(vfutExtInqDelvPosnRecT.opnShtQty, lopnShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqDelvPosnRecT.notifQty[i]= ' ';
	}
	char lnotifQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqDelvPosn.futExtInqDelvPosnRecT.notifQty", lnotifQty);
	memcpy(vfutExtInqDelvPosnRecT.notifQty, lnotifQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqDelvPosnRecT.dsgnOpnLng[i]= ' ';
	}
	char ldsgnOpnLng[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqDelvPosn.futExtInqDelvPosnRecT.dsgnOpnLng", ldsgnOpnLng);
	memcpy(vfutExtInqDelvPosnRecT.dsgnOpnLng, ldsgnOpnLng, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqDelvPosnRecT.dsgnOpnSht[i]= ' ';
	}
	char ldsgnOpnSht[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqDelvPosn.futExtInqDelvPosnRecT.dsgnOpnSht", ldsgnOpnSht);
	memcpy(vfutExtInqDelvPosnRecT.dsgnOpnSht, ldsgnOpnSht, DRIV_QUANTITY_LEN);
	return vfutExtInqDelvPosnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqDelvPosnResponseT getFutExtInqDelvPosnResponseT(char* testCaseNum , const char *root) {
	futExtInqDelvPosnResponseT vfutExtInqDelvPosnResponseT;
	int i;
	return vfutExtInqDelvPosnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqDelvPosnRequestT* getFutInqDelvPosnRequestT(char* testCaseNum) {
	vfutInqDelvPosnRequestT = (futInqDelvPosnRequestT*)malloc(sizeof(futInqDelvPosnRequestT));
	int i;

	vfutInqDelvPosnRequestT->header = getDataHeaderT(testCaseNum, "futInqDelvPosnRequestT");
	vfutInqDelvPosnRequestT->basic = getFutBscInqDelvPosnRequestT(testCaseNum, "futInqDelvPosnRequestT");
	return vfutInqDelvPosnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqDelvPosnResponseT* getFutInqDelvPosnResponseT(char* testCaseNum) {
	vfutInqDelvPosnResponseT = (futInqDelvPosnResponseT*)malloc(sizeof(futInqDelvPosnResponseT));
	int i;

	vfutInqDelvPosnResponseT->header = getDataHeaderT(testCaseNum, "futInqDelvPosnResponseT");
	vfutInqDelvPosnResponseT->basic = getFutBscInqDelvPosnResponseT(testCaseNum, "futInqDelvPosnResponseT");
	vfutInqDelvPosnResponseT->extension = getFutExtInqDelvPosnResponseT(testCaseNum, "futInqDelvPosnResponseT");
	return vfutInqDelvPosnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqDelvPosnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqDelvPosnRequestT));
	futInqDelvPosnRequestT *vfutInqDelvPosnRequestT = getFutInqDelvPosnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqDelvPosnRequestT), (jbyte*) vfutInqDelvPosnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqDelvPosnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqDelvPosnResponseT));
	futInqDelvPosnResponseT *vfutInqDelvPosnResponseT = getFutInqDelvPosnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqDelvPosnResponseT), (jbyte*) vfutInqDelvPosnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqDelvPosnRequestT(futBscInqDelvPosnRequestT actual, futBscInqDelvPosnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_DELV_POSN_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDelvPosnRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDelvPosnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqDelvPosnResponseT(futBscInqDelvPosnResponseT actual, futBscInqDelvPosnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDelvPosnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDelvPosnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_DELV_POSN_REC_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqDelvPosnRecT(futExtInqDelvPosnRecT actual, futExtInqDelvPosnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvPosnRecT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvPosnRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.opnLngQty, expected.opnLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvPosnRecT, opnLngQty not matching. Actual %s but Expected %s", actual.opnLngQty, expected.opnLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.opnShtQty, expected.opnShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvPosnRecT, opnShtQty not matching. Actual %s but Expected %s", actual.opnShtQty, expected.opnShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.notifQty, expected.notifQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvPosnRecT, notifQty not matching. Actual %s but Expected %s", actual.notifQty, expected.notifQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnLng, expected.dsgnOpnLng, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvPosnRecT, dsgnOpnLng not matching. Actual %s but Expected %s", actual.dsgnOpnLng, expected.dsgnOpnLng);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnSht, expected.dsgnOpnSht, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqDelvPosnRecT, dsgnOpnSht not matching. Actual %s but Expected %s", actual.dsgnOpnSht, expected.dsgnOpnSht);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqDelvPosnResponseT(futExtInqDelvPosnResponseT actual, futExtInqDelvPosnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_DELV_POSN_REC_MAX;i++) {
		compareFutExtInqDelvPosnRecT (actual.futExtInqDelvPosnRec[i],expected.futExtInqDelvPosnRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqDelvPosnRequestT(futInqDelvPosnRequestT actual, futInqDelvPosnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqDelvPosnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqDelvPosnResponseT(futInqDelvPosnResponseT actual, futInqDelvPosnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqDelvPosnResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqDelvPosnResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqDelvPosnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqDelvPosnRequestT *actualData = (futInqDelvPosnRequestT *)msgStruct;
	futInqDelvPosnRequestT* expectedData = getFutInqDelvPosnRequestT(testCaseNum);
	compareFutInqDelvPosnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqDelvPosnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqDelvPosnResponseT *actualData = (futInqDelvPosnResponseT *)msgStruct;
	futInqDelvPosnResponseT* expectedData = getFutInqDelvPosnResponseT(testCaseNum);
	compareFutInqDelvPosnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
