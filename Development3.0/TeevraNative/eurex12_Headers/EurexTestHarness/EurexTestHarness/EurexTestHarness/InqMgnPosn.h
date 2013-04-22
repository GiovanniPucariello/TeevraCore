#include <InqMgnPosn.hxx>
#define BUFFER_SIZE 1000

futInqMgnPosnRequestT *vfutInqMgnPosnRequestT;
futInqMgnPosnResponseT *vfutInqMgnPosnResponseT;
optInqMgnPosnRequestT *voptInqMgnPosnRequestT;
optInqMgnPosnResponseT *voptInqMgnPosnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqMgnPosnRequestT getFutBscInqMgnPosnRequestT(char* testCaseNum , const char *root) {
	futBscInqMgnPosnRequestT vfutBscInqMgnPosnRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscInqMgnPosnRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqMgnPosn.futBscInqMgnPosnRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscInqMgnPosnRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscInqMgnPosnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqMgnPosn.futBscInqMgnPosnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscInqMgnPosnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqMgnPosnRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqMgnPosn.futBscInqMgnPosnRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqMgnPosnRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqMgnPosnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMgnPosn.futBscInqMgnPosnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqMgnPosnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqMgnPosnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqMgnPosnRequestT getFutExtInqMgnPosnRequestT(char* testCaseNum , const char *root) {
	futExtInqMgnPosnRequestT vfutExtInqMgnPosnRequestT;
	int i;

	vfutExtInqMgnPosnRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtInqMgnPosnRequestT");	return vfutExtInqMgnPosnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqMgnPosnRecT getFutBscInqMgnPosnRecT(char* testCaseNum , const char *root) {
	futBscInqMgnPosnRecT vfutBscInqMgnPosnRecT;
	int i;

	vfutBscInqMgnPosnRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqMgnPosnRecT");	return vfutBscInqMgnPosnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqMgnPosnResponseT getFutBscInqMgnPosnResponseT(char* testCaseNum , const char *root) {
	futBscInqMgnPosnResponseT vfutBscInqMgnPosnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqMgnPosnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMgnPosn.futBscInqMgnPosnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqMgnPosnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqMgnPosnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqMgnPosn.futBscInqMgnPosnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqMgnPosnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqMgnPosnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqMgnPosnRecT getFutExtInqMgnPosnRecT(char* testCaseNum , const char *root) {
	futExtInqMgnPosnRecT vfutExtInqMgnPosnRecT;
	int i;

	vfutExtInqMgnPosnRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtInqMgnPosnRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqMgnPosnRecT.opnLngQty[i]= ' ';
	}
	char lopnLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMgnPosn.futExtInqMgnPosnRecT.opnLngQty", lopnLngQty);
	memcpy(vfutExtInqMgnPosnRecT.opnLngQty, lopnLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqMgnPosnRecT.allcQty[i]= ' ';
	}
	char lallcQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMgnPosn.futExtInqMgnPosnRecT.allcQty", lallcQty);
	memcpy(vfutExtInqMgnPosnRecT.allcQty, lallcQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqMgnPosnRecT.opnShtQty[i]= ' ';
	}
	char lopnShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMgnPosn.futExtInqMgnPosnRecT.opnShtQty", lopnShtQty);
	memcpy(vfutExtInqMgnPosnRecT.opnShtQty, lopnShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqMgnPosnRecT.notifQty[i]= ' ';
	}
	char lnotifQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMgnPosn.futExtInqMgnPosnRecT.notifQty", lnotifQty);
	memcpy(vfutExtInqMgnPosnRecT.notifQty, lnotifQty, DRIV_QUANTITY_LEN);

	char lnetPosnTypCod[1] = {""};
	getStrProperty("InqMgnPosn.futExtInqMgnPosnRecT.netPosnTypCod", lnetPosnTypCod);
	vfutExtInqMgnPosnRecT.netPosnTypCod = lnetPosnTypCod[0];

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqMgnPosnRecT.netQty[i]= ' ';
	}
	char lnetQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMgnPosn.futExtInqMgnPosnRecT.netQty", lnetQty);
	memcpy(vfutExtInqMgnPosnRecT.netQty, lnetQty, DRIV_QUANTITY_LEN);
	return vfutExtInqMgnPosnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqMgnPosnResponseT getFutExtInqMgnPosnResponseT(char* testCaseNum , const char *root) {
	futExtInqMgnPosnResponseT vfutExtInqMgnPosnResponseT;
	int i;
	return vfutExtInqMgnPosnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqMgnPosnRequestT getOptBscInqMgnPosnRequestT(char* testCaseNum , const char *root) {
	optBscInqMgnPosnRequestT voptBscInqMgnPosnRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscInqMgnPosnRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqMgnPosn.optBscInqMgnPosnRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscInqMgnPosnRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscInqMgnPosnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqMgnPosn.optBscInqMgnPosnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscInqMgnPosnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqMgnPosnRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqMgnPosn.optBscInqMgnPosnRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqMgnPosnRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqMgnPosnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMgnPosn.optBscInqMgnPosnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqMgnPosnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqMgnPosnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqMgnPosnRequestT getOptExtInqMgnPosnRequestT(char* testCaseNum , const char *root) {
	optExtInqMgnPosnRequestT voptExtInqMgnPosnRequestT;
	int i;

	voptExtInqMgnPosnRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtInqMgnPosnRequestT");	return voptExtInqMgnPosnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqMgnPosnRecT getOptBscInqMgnPosnRecT(char* testCaseNum , const char *root) {
	optBscInqMgnPosnRecT voptBscInqMgnPosnRecT;
	int i;

	voptBscInqMgnPosnRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqMgnPosnRecT");	return voptBscInqMgnPosnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqMgnPosnResponseT getOptBscInqMgnPosnResponseT(char* testCaseNum , const char *root) {
	optBscInqMgnPosnResponseT voptBscInqMgnPosnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqMgnPosnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMgnPosn.optBscInqMgnPosnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqMgnPosnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqMgnPosnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqMgnPosn.optBscInqMgnPosnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqMgnPosnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqMgnPosnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqMgnPosnRecT getOptExtInqMgnPosnRecT(char* testCaseNum , const char *root) {
	optExtInqMgnPosnRecT voptExtInqMgnPosnRecT;
	int i;

	voptExtInqMgnPosnRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtInqMgnPosnRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqMgnPosnRecT.opnLngQty[i]= ' ';
	}
	char lopnLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMgnPosn.optExtInqMgnPosnRecT.opnLngQty", lopnLngQty);
	memcpy(voptExtInqMgnPosnRecT.opnLngQty, lopnLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqMgnPosnRecT.exerQty[i]= ' ';
	}
	char lexerQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMgnPosn.optExtInqMgnPosnRecT.exerQty", lexerQty);
	memcpy(voptExtInqMgnPosnRecT.exerQty, lexerQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqMgnPosnRecT.opnShtQty[i]= ' ';
	}
	char lopnShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMgnPosn.optExtInqMgnPosnRecT.opnShtQty", lopnShtQty);
	memcpy(voptExtInqMgnPosnRecT.opnShtQty, lopnShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqMgnPosnRecT.asgnQty[i]= ' ';
	}
	char lasgnQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMgnPosn.optExtInqMgnPosnRecT.asgnQty", lasgnQty);
	memcpy(voptExtInqMgnPosnRecT.asgnQty, lasgnQty, DRIV_QUANTITY_LEN);

	char lnetPosnTypCod[1] = {""};
	getStrProperty("InqMgnPosn.optExtInqMgnPosnRecT.netPosnTypCod", lnetPosnTypCod);
	voptExtInqMgnPosnRecT.netPosnTypCod = lnetPosnTypCod[0];

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqMgnPosnRecT.netQty[i]= ' ';
	}
	char lnetQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMgnPosn.optExtInqMgnPosnRecT.netQty", lnetQty);
	memcpy(voptExtInqMgnPosnRecT.netQty, lnetQty, DRIV_QUANTITY_LEN);
	return voptExtInqMgnPosnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqMgnPosnResponseT getOptExtInqMgnPosnResponseT(char* testCaseNum , const char *root) {
	optExtInqMgnPosnResponseT voptExtInqMgnPosnResponseT;
	int i;
	return voptExtInqMgnPosnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqMgnPosnRequestT* getFutInqMgnPosnRequestT(char* testCaseNum) {
	vfutInqMgnPosnRequestT = (futInqMgnPosnRequestT*)malloc(sizeof(futInqMgnPosnRequestT));
	int i;

	vfutInqMgnPosnRequestT->header = getDataHeaderT(testCaseNum, "futInqMgnPosnRequestT");
	vfutInqMgnPosnRequestT->basic = getFutBscInqMgnPosnRequestT(testCaseNum, "futInqMgnPosnRequestT");
	vfutInqMgnPosnRequestT->extension = getFutExtInqMgnPosnRequestT(testCaseNum, "futInqMgnPosnRequestT");
	return vfutInqMgnPosnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqMgnPosnResponseT* getFutInqMgnPosnResponseT(char* testCaseNum) {
	vfutInqMgnPosnResponseT = (futInqMgnPosnResponseT*)malloc(sizeof(futInqMgnPosnResponseT));
	int i;

	vfutInqMgnPosnResponseT->header = getDataHeaderT(testCaseNum, "futInqMgnPosnResponseT");
	vfutInqMgnPosnResponseT->basic = getFutBscInqMgnPosnResponseT(testCaseNum, "futInqMgnPosnResponseT");
	vfutInqMgnPosnResponseT->extension = getFutExtInqMgnPosnResponseT(testCaseNum, "futInqMgnPosnResponseT");
	return vfutInqMgnPosnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqMgnPosnRequestT* getOptInqMgnPosnRequestT(char* testCaseNum) {
	voptInqMgnPosnRequestT = (optInqMgnPosnRequestT*)malloc(sizeof(optInqMgnPosnRequestT));
	int i;

	voptInqMgnPosnRequestT->header = getDataHeaderT(testCaseNum, "optInqMgnPosnRequestT");
	voptInqMgnPosnRequestT->basic = getOptBscInqMgnPosnRequestT(testCaseNum, "optInqMgnPosnRequestT");
	voptInqMgnPosnRequestT->extension = getOptExtInqMgnPosnRequestT(testCaseNum, "optInqMgnPosnRequestT");
	return voptInqMgnPosnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqMgnPosnResponseT* getOptInqMgnPosnResponseT(char* testCaseNum) {
	voptInqMgnPosnResponseT = (optInqMgnPosnResponseT*)malloc(sizeof(optInqMgnPosnResponseT));
	int i;

	voptInqMgnPosnResponseT->header = getDataHeaderT(testCaseNum, "optInqMgnPosnResponseT");
	voptInqMgnPosnResponseT->basic = getOptBscInqMgnPosnResponseT(testCaseNum, "optInqMgnPosnResponseT");
	voptInqMgnPosnResponseT->extension = getOptExtInqMgnPosnResponseT(testCaseNum, "optInqMgnPosnResponseT");
	return voptInqMgnPosnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqMgnPosnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqMgnPosnRequestT));
	futInqMgnPosnRequestT *vfutInqMgnPosnRequestT = getFutInqMgnPosnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqMgnPosnRequestT), (jbyte*) vfutInqMgnPosnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqMgnPosnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqMgnPosnResponseT));
	futInqMgnPosnResponseT *vfutInqMgnPosnResponseT = getFutInqMgnPosnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqMgnPosnResponseT), (jbyte*) vfutInqMgnPosnResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqMgnPosnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqMgnPosnRequestT));
	optInqMgnPosnRequestT *voptInqMgnPosnRequestT = getOptInqMgnPosnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqMgnPosnRequestT), (jbyte*) voptInqMgnPosnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqMgnPosnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqMgnPosnResponseT));
	optInqMgnPosnResponseT *voptInqMgnPosnResponseT = getOptInqMgnPosnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqMgnPosnResponseT), (jbyte*) voptInqMgnPosnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqMgnPosnRequestT(futBscInqMgnPosnRequestT actual, futBscInqMgnPosnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_MGN_POSN_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqMgnPosnRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqMgnPosnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqMgnPosnRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqMgnPosnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqMgnPosnRequestT(futExtInqMgnPosnRequestT actual, futExtInqMgnPosnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqMgnPosnRecT(futBscInqMgnPosnRecT actual, futBscInqMgnPosnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqMgnPosnResponseT(futBscInqMgnPosnResponseT actual, futBscInqMgnPosnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqMgnPosnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqMgnPosnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_MGN_POSN_REC_MAX;i++) {
		compareFutBscInqMgnPosnRecT (actual.futBscInqMgnPosnRec[i],expected.futBscInqMgnPosnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqMgnPosnRecT(futExtInqMgnPosnRecT actual, futExtInqMgnPosnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.opnLngQty, expected.opnLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqMgnPosnRecT, opnLngQty not matching. Actual %s but Expected %s", actual.opnLngQty, expected.opnLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.allcQty, expected.allcQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqMgnPosnRecT, allcQty not matching. Actual %s but Expected %s", actual.allcQty, expected.allcQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.opnShtQty, expected.opnShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqMgnPosnRecT, opnShtQty not matching. Actual %s but Expected %s", actual.opnShtQty, expected.opnShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.notifQty, expected.notifQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqMgnPosnRecT, notifQty not matching. Actual %s but Expected %s", actual.notifQty, expected.notifQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.netPosnTypCod!= expected.netPosnTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqMgnPosnRecT, netPosnTypCodnot matching. Actual %d but Expected %d", actual.netPosnTypCod, expected.netPosnTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.netQty, expected.netQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqMgnPosnRecT, netQty not matching. Actual %s but Expected %s", actual.netQty, expected.netQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqMgnPosnResponseT(futExtInqMgnPosnResponseT actual, futExtInqMgnPosnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_MGN_POSN_REC_MAX;i++) {
		compareFutExtInqMgnPosnRecT (actual.futExtInqMgnPosnRec[i],expected.futExtInqMgnPosnRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqMgnPosnRequestT(optBscInqMgnPosnRequestT actual, optBscInqMgnPosnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_BSC_INQ_MGN_POSN_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqMgnPosnRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqMgnPosnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqMgnPosnRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqMgnPosnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqMgnPosnRequestT(optExtInqMgnPosnRequestT actual, optExtInqMgnPosnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqMgnPosnRecT(optBscInqMgnPosnRecT actual, optBscInqMgnPosnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqMgnPosnResponseT(optBscInqMgnPosnResponseT actual, optBscInqMgnPosnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqMgnPosnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqMgnPosnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_MGN_POSN_REC_MAX;i++) {
		compareOptBscInqMgnPosnRecT (actual.optBscInqMgnPosnRec[i],expected.optBscInqMgnPosnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqMgnPosnRecT(optExtInqMgnPosnRecT actual, optExtInqMgnPosnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.opnLngQty, expected.opnLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqMgnPosnRecT, opnLngQty not matching. Actual %s but Expected %s", actual.opnLngQty, expected.opnLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exerQty, expected.exerQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqMgnPosnRecT, exerQty not matching. Actual %s but Expected %s", actual.exerQty, expected.exerQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.opnShtQty, expected.opnShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqMgnPosnRecT, opnShtQty not matching. Actual %s but Expected %s", actual.opnShtQty, expected.opnShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.asgnQty, expected.asgnQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqMgnPosnRecT, asgnQty not matching. Actual %s but Expected %s", actual.asgnQty, expected.asgnQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.netPosnTypCod!= expected.netPosnTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqMgnPosnRecT, netPosnTypCodnot matching. Actual %d but Expected %d", actual.netPosnTypCod, expected.netPosnTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.netQty, expected.netQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqMgnPosnRecT, netQty not matching. Actual %s but Expected %s", actual.netQty, expected.netQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqMgnPosnResponseT(optExtInqMgnPosnResponseT actual, optExtInqMgnPosnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_MGN_POSN_REC_MAX;i++) {
		compareOptExtInqMgnPosnRecT (actual.optExtInqMgnPosnRec[i],expected.optExtInqMgnPosnRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqMgnPosnRequestT(futInqMgnPosnRequestT actual, futInqMgnPosnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqMgnPosnRequestT (actual.basic,expected.basic, logMsg);	compareFutExtInqMgnPosnRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqMgnPosnResponseT(futInqMgnPosnResponseT actual, futInqMgnPosnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqMgnPosnResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqMgnPosnResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqMgnPosnRequestT(optInqMgnPosnRequestT actual, optInqMgnPosnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqMgnPosnRequestT (actual.basic,expected.basic, logMsg);	compareOptExtInqMgnPosnRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqMgnPosnResponseT(optInqMgnPosnResponseT actual, optInqMgnPosnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqMgnPosnResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqMgnPosnResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqMgnPosnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqMgnPosnRequestT *actualData = (futInqMgnPosnRequestT *)msgStruct;
	futInqMgnPosnRequestT* expectedData = getFutInqMgnPosnRequestT(testCaseNum);
	compareFutInqMgnPosnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqMgnPosnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqMgnPosnResponseT *actualData = (futInqMgnPosnResponseT *)msgStruct;
	futInqMgnPosnResponseT* expectedData = getFutInqMgnPosnResponseT(testCaseNum);
	compareFutInqMgnPosnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqMgnPosnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqMgnPosnRequestT *actualData = (optInqMgnPosnRequestT *)msgStruct;
	optInqMgnPosnRequestT* expectedData = getOptInqMgnPosnRequestT(testCaseNum);
	compareOptInqMgnPosnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqMgnPosnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqMgnPosnResponseT *actualData = (optInqMgnPosnResponseT *)msgStruct;
	optInqMgnPosnResponseT* expectedData = getOptInqMgnPosnResponseT(testCaseNum);
	compareOptInqMgnPosnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
