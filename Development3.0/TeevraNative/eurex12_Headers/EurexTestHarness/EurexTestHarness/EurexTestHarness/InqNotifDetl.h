#include <InqNotifDetl.hxx>
#define BUFFER_SIZE 1000

futInqNotifDetlRequestT *vfutInqNotifDetlRequestT;
futInqNotifDetlResponseT *vfutInqNotifDetlResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqNotifDetlRequestT getFutBscInqNotifDetlRequestT(char* testCaseNum , const char *root) {
	futBscInqNotifDetlRequestT vfutBscInqNotifDetlRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscInqNotifDetlRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqNotifDetl.futBscInqNotifDetlRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscInqNotifDetlRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscInqNotifDetlRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqNotifDetl.futBscInqNotifDetlRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscInqNotifDetlRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutBscInqNotifDetlRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqNotifDetlRequestT");
	vfutBscInqNotifDetlRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqNotifDetlRequestT");
	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqNotifDetlRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqNotifDetl.futBscInqNotifDetlRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqNotifDetlRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqNotifDetlRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqNotifDetlRecT getFutBscInqNotifDetlRecT(char* testCaseNum , const char *root) {
	futBscInqNotifDetlRecT vfutBscInqNotifDetlRecT;
	int i;

	for(i=0;i<ISIN_COD_LEN;i++) {
		vfutBscInqNotifDetlRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqNotifDetl.futBscInqNotifDetlRecT.isinCod", lisinCod);
	memcpy(vfutBscInqNotifDetlRecT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqNotifDetlRecT.notifQtyPerIsin[i]= ' ';
	}
	char lnotifQtyPerIsin[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqNotifDetl.futBscInqNotifDetlRecT.notifQtyPerIsin", lnotifQtyPerIsin);
	memcpy(vfutBscInqNotifDetlRecT.notifQtyPerIsin, lnotifQtyPerIsin, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqNotifDetlRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqNotifDetl.futBscInqNotifDetlRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqNotifDetlRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqNotifDetlRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqNotifDetlResponseT getFutBscInqNotifDetlResponseT(char* testCaseNum , const char *root) {
	futBscInqNotifDetlResponseT vfutBscInqNotifDetlResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqNotifDetlResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqNotifDetl.futBscInqNotifDetlResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqNotifDetlResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqNotifDetlResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqNotifDetl.futBscInqNotifDetlResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqNotifDetlResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqNotifDetlResponseT.crtShtQty[i]= ' ';
	}
	char lcrtShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqNotifDetl.futBscInqNotifDetlResponseT.crtShtQty", lcrtShtQty);
	memcpy(vfutBscInqNotifDetlResponseT.crtShtQty, lcrtShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqNotifDetlResponseT.notifQty[i]= ' ';
	}
	char lnotifQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqNotifDetl.futBscInqNotifDetlResponseT.notifQty", lnotifQty);
	memcpy(vfutBscInqNotifDetlResponseT.notifQty, lnotifQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqNotifDetlResponseT.dsgnOpnSht[i]= ' ';
	}
	char ldsgnOpnSht[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqNotifDetl.futBscInqNotifDetlResponseT.dsgnOpnSht", ldsgnOpnSht);
	memcpy(vfutBscInqNotifDetlResponseT.dsgnOpnSht, ldsgnOpnSht, DRIV_QUANTITY_LEN);
	return vfutBscInqNotifDetlResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqNotifDetlRecT getFutExtInqNotifDetlRecT(char* testCaseNum , const char *root) {
	futExtInqNotifDetlRecT vfutExtInqNotifDetlRecT;
	int i;

	for(i=0;i<PROD_SHT_NAM_LEN;i++) {
		vfutExtInqNotifDetlRecT.prodShtNam[i]= ' ';
	}
	char lprodShtNam[PROD_SHT_NAM_LEN] = {""};
	getStrProperty("InqNotifDetl.futExtInqNotifDetlRecT.prodShtNam", lprodShtNam);
	memcpy(vfutExtInqNotifDetlRecT.prodShtNam, lprodShtNam, PROD_SHT_NAM_LEN);

	char lprodCtdInd[1] = {""};
	getStrProperty("InqNotifDetl.futExtInqNotifDetlRecT.prodCtdInd", lprodCtdInd);
	vfutExtInqNotifDetlRecT.prodCtdInd = lprodCtdInd[0];
	return vfutExtInqNotifDetlRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqNotifDetlResponseT getFutExtInqNotifDetlResponseT(char* testCaseNum , const char *root) {
	futExtInqNotifDetlResponseT vfutExtInqNotifDetlResponseT;
	int i;
	return vfutExtInqNotifDetlResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqNotifDetlRequestT* getFutInqNotifDetlRequestT(char* testCaseNum) {
	vfutInqNotifDetlRequestT = (futInqNotifDetlRequestT*)malloc(sizeof(futInqNotifDetlRequestT));
	int i;

	vfutInqNotifDetlRequestT->header = getDataHeaderT(testCaseNum, "futInqNotifDetlRequestT");
	vfutInqNotifDetlRequestT->basic = getFutBscInqNotifDetlRequestT(testCaseNum, "futInqNotifDetlRequestT");
	return vfutInqNotifDetlRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqNotifDetlResponseT* getFutInqNotifDetlResponseT(char* testCaseNum) {
	vfutInqNotifDetlResponseT = (futInqNotifDetlResponseT*)malloc(sizeof(futInqNotifDetlResponseT));
	int i;

	vfutInqNotifDetlResponseT->header = getDataHeaderT(testCaseNum, "futInqNotifDetlResponseT");
	vfutInqNotifDetlResponseT->basic = getFutBscInqNotifDetlResponseT(testCaseNum, "futInqNotifDetlResponseT");
	vfutInqNotifDetlResponseT->extension = getFutExtInqNotifDetlResponseT(testCaseNum, "futInqNotifDetlResponseT");
	return vfutInqNotifDetlResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqNotifDetlRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqNotifDetlRequestT));
	futInqNotifDetlRequestT *vfutInqNotifDetlRequestT = getFutInqNotifDetlRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqNotifDetlRequestT), (jbyte*) vfutInqNotifDetlRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqNotifDetlResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqNotifDetlResponseT));
	futInqNotifDetlResponseT *vfutInqNotifDetlResponseT = getFutInqNotifDetlResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqNotifDetlResponseT), (jbyte*) vfutInqNotifDetlResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqNotifDetlRequestT(futBscInqNotifDetlRequestT actual, futBscInqNotifDetlRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifDetlRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifDetlRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifDetlRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqNotifDetlRecT(futBscInqNotifDetlRecT actual, futBscInqNotifDetlRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifDetlRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.notifQtyPerIsin, expected.notifQtyPerIsin, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifDetlRecT, notifQtyPerIsin not matching. Actual %s but Expected %s", actual.notifQtyPerIsin, expected.notifQtyPerIsin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifDetlRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqNotifDetlResponseT(futBscInqNotifDetlResponseT actual, futBscInqNotifDetlResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifDetlResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifDetlResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtShtQty, expected.crtShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifDetlResponseT, crtShtQty not matching. Actual %s but Expected %s", actual.crtShtQty, expected.crtShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.notifQty, expected.notifQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifDetlResponseT, notifQty not matching. Actual %s but Expected %s", actual.notifQty, expected.notifQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnSht, expected.dsgnOpnSht, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqNotifDetlResponseT, dsgnOpnSht not matching. Actual %s but Expected %s", actual.dsgnOpnSht, expected.dsgnOpnSht);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_NOTIF_DETL_REC_MAX;i++) {
		compareFutBscInqNotifDetlRecT (actual.futBscInqNotifDetlRec[i],expected.futBscInqNotifDetlRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqNotifDetlRecT(futExtInqNotifDetlRecT actual, futExtInqNotifDetlRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodShtNam, expected.prodShtNam, PROD_SHT_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqNotifDetlRecT, prodShtNam not matching. Actual %s but Expected %s", actual.prodShtNam, expected.prodShtNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodCtdInd!= expected.prodCtdInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqNotifDetlRecT, prodCtdIndnot matching. Actual %d but Expected %d", actual.prodCtdInd, expected.prodCtdInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqNotifDetlResponseT(futExtInqNotifDetlResponseT actual, futExtInqNotifDetlResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_NOTIF_DETL_REC_MAX;i++) {
		compareFutExtInqNotifDetlRecT (actual.futExtInqNotifDetlRec[i],expected.futExtInqNotifDetlRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqNotifDetlRequestT(futInqNotifDetlRequestT actual, futInqNotifDetlRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqNotifDetlRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqNotifDetlResponseT(futInqNotifDetlResponseT actual, futInqNotifDetlResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqNotifDetlResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqNotifDetlResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqNotifDetlRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqNotifDetlRequestT *actualData = (futInqNotifDetlRequestT *)msgStruct;
	futInqNotifDetlRequestT* expectedData = getFutInqNotifDetlRequestT(testCaseNum);
	compareFutInqNotifDetlRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqNotifDetlResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqNotifDetlResponseT *actualData = (futInqNotifDetlResponseT *)msgStruct;
	futInqNotifDetlResponseT* expectedData = getFutInqNotifDetlResponseT(testCaseNum);
	compareFutInqNotifDetlResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
