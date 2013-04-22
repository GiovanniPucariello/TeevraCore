#include <InqNotif.hxx>
#define BUFFER_SIZE 1000

futInqNotifRequestT *vfutInqNotifRequestT;
futInqNotifResponseT *vfutInqNotifResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqNotifRequestT getFutBscInqNotifRequestT(char* testCaseNum , const char *root) {
	futBscInqNotifRequestT vfutBscInqNotifRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscInqNotifRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqNotif.futBscInqNotifRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscInqNotifRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscInqNotifRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqNotif.futBscInqNotifRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscInqNotifRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutBscInqNotifRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqNotifRequestT");
	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqNotifRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqNotif.futBscInqNotifRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqNotifRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqNotifRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqNotif.futBscInqNotifRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqNotifRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqNotifRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqNotifRecT getFutBscInqNotifRecT(char* testCaseNum , const char *root) {
	futBscInqNotifRecT vfutBscInqNotifRecT;
	int i;

	vfutBscInqNotifRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqNotifRecT");
	vfutBscInqNotifRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqNotifRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqNotifRecT.crtShtQty[i]= ' ';
	}
	char lcrtShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqNotif.futBscInqNotifRecT.crtShtQty", lcrtShtQty);
	memcpy(vfutBscInqNotifRecT.crtShtQty, lcrtShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqNotifRecT.notifQty[i]= ' ';
	}
	char lnotifQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqNotif.futBscInqNotifRecT.notifQty", lnotifQty);
	memcpy(vfutBscInqNotifRecT.notifQty, lnotifQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqNotifRecT.dsgnOpnSht[i]= ' ';
	}
	char ldsgnOpnSht[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqNotif.futBscInqNotifRecT.dsgnOpnSht", ldsgnOpnSht);
	memcpy(vfutBscInqNotifRecT.dsgnOpnSht, ldsgnOpnSht, DRIV_QUANTITY_LEN);
	return vfutBscInqNotifRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqNotifResponseT getFutBscInqNotifResponseT(char* testCaseNum , const char *root) {
	futBscInqNotifResponseT vfutBscInqNotifResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqNotifResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqNotif.futBscInqNotifResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqNotifResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqNotifResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqNotif.futBscInqNotifResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqNotifResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqNotifResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqNotifRequestT* getFutInqNotifRequestT(char* testCaseNum) {
	vfutInqNotifRequestT = (futInqNotifRequestT*)malloc(sizeof(futInqNotifRequestT));
	int i;

	vfutInqNotifRequestT->header = getDataHeaderT(testCaseNum, "futInqNotifRequestT");
	vfutInqNotifRequestT->basic = getFutBscInqNotifRequestT(testCaseNum, "futInqNotifRequestT");
	return vfutInqNotifRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqNotifResponseT* getFutInqNotifResponseT(char* testCaseNum) {
	vfutInqNotifResponseT = (futInqNotifResponseT*)malloc(sizeof(futInqNotifResponseT));
	int i;

	vfutInqNotifResponseT->header = getDataHeaderT(testCaseNum, "futInqNotifResponseT");
	vfutInqNotifResponseT->basic = getFutBscInqNotifResponseT(testCaseNum, "futInqNotifResponseT");
	return vfutInqNotifResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqNotifRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqNotifRequestT));
	futInqNotifRequestT *vfutInqNotifRequestT = getFutInqNotifRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqNotifRequestT), (jbyte*) vfutInqNotifRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqNotifResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqNotifResponseT));
	futInqNotifResponseT *vfutInqNotifResponseT = getFutInqNotifResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqNotifResponseT), (jbyte*) vfutInqNotifResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqNotifRequestT(futBscInqNotifRequestT actual, futBscInqNotifRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	for ( i = 0; i < FUT_BSC_INQ_NOTIF_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqNotifRecT(futBscInqNotifRecT actual, futBscInqNotifRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.crtShtQty, expected.crtShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifRecT, crtShtQty not matching. Actual %s but Expected %s", actual.crtShtQty, expected.crtShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.notifQty, expected.notifQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifRecT, notifQty not matching. Actual %s but Expected %s", actual.notifQty, expected.notifQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnSht, expected.dsgnOpnSht, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifRecT, dsgnOpnSht not matching. Actual %s but Expected %s", actual.dsgnOpnSht, expected.dsgnOpnSht);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqNotifResponseT(futBscInqNotifResponseT actual, futBscInqNotifResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_NOTIF_REC_MAX;i++) {
		compareFutBscInqNotifRecT (actual.futBscInqNotifRec[i],expected.futBscInqNotifRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqNotifRequestT(futInqNotifRequestT actual, futInqNotifRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqNotifRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqNotifResponseT(futInqNotifResponseT actual, futInqNotifResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqNotifResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqNotifRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqNotifRequestT *actualData = (futInqNotifRequestT *)msgStruct;
	futInqNotifRequestT* expectedData = getFutInqNotifRequestT(testCaseNum);
	compareFutInqNotifRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqNotifResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqNotifResponseT *actualData = (futInqNotifResponseT *)msgStruct;
	futInqNotifResponseT* expectedData = getFutInqNotifResponseT(testCaseNum);
	compareFutInqNotifResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
