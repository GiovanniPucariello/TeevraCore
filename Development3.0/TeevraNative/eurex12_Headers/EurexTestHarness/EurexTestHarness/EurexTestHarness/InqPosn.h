#include <InqPosn.hxx>
#define BUFFER_SIZE 1000

futInqPosnRequestT *vfutInqPosnRequestT;
futInqPosnResponseT *vfutInqPosnResponseT;
optInqPosnRequestT *voptInqPosnRequestT;
optInqPosnResponseT *voptInqPosnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqPosnRequestT getFutBscInqPosnRequestT(char* testCaseNum , const char *root) {
	futBscInqPosnRequestT vfutBscInqPosnRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscInqPosnRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscInqPosnRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscInqPosnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscInqPosnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutBscInqPosnRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqPosnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqPosnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRequestT.trnDat", ltrnDat);
	memcpy(vfutBscInqPosnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqPosnRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqPosnRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqPosnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqPosnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqPosnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqPosnRecT getFutBscInqPosnRecT(char* testCaseNum , const char *root) {
	futBscInqPosnRecT vfutBscInqPosnRecT;
	int i;

	vfutBscInqPosnRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqPosnRecT");
	vfutBscInqPosnRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqPosnRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqPosnRecT.prvLngQty[i]= ' ';
	}
	char lprvLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRecT.prvLngQty", lprvLngQty);
	memcpy(vfutBscInqPosnRecT.prvLngQty, lprvLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqPosnRecT.prvShtQty[i]= ' ';
	}
	char lprvShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRecT.prvShtQty", lprvShtQty);
	memcpy(vfutBscInqPosnRecT.prvShtQty, lprvShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqPosnRecT.crtLngQty[i]= ' ';
	}
	char lcrtLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRecT.crtLngQty", lcrtLngQty);
	memcpy(vfutBscInqPosnRecT.crtLngQty, lcrtLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqPosnRecT.crtShtQty[i]= ' ';
	}
	char lcrtShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRecT.crtShtQty", lcrtShtQty);
	memcpy(vfutBscInqPosnRecT.crtShtQty, lcrtShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqPosnRecT.notifQty[i]= ' ';
	}
	char lnotifQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRecT.notifQty", lnotifQty);
	memcpy(vfutBscInqPosnRecT.notifQty, lnotifQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqPosnRecT.dsgnOpnLng[i]= ' ';
	}
	char ldsgnOpnLng[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRecT.dsgnOpnLng", ldsgnOpnLng);
	memcpy(vfutBscInqPosnRecT.dsgnOpnLng, ldsgnOpnLng, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqPosnRecT.dsgnOpnSht[i]= ' ';
	}
	char ldsgnOpnSht[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRecT.dsgnOpnSht", ldsgnOpnSht);
	memcpy(vfutBscInqPosnRecT.dsgnOpnSht, ldsgnOpnSht, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscInqPosnRecT.totVmarAmnt[i]= ' ';
	}
	char ltotVmarAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRecT.totVmarAmnt", ltotVmarAmnt);
	memcpy(vfutBscInqPosnRecT.totVmarAmnt, ltotVmarAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscInqPosnRecT.totFeeAmnt[i]= ' ';
	}
	char ltotFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnRecT.totFeeAmnt", ltotFeeAmnt);
	memcpy(vfutBscInqPosnRecT.totFeeAmnt, ltotFeeAmnt, DRIV_AMOUNT_LEN);
	return vfutBscInqPosnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqPosnResponseT getFutBscInqPosnResponseT(char* testCaseNum , const char *root) {
	futBscInqPosnResponseT vfutBscInqPosnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqPosnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqPosnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqPosnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqPosn.futBscInqPosnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqPosnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqPosnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqPosnRequestT getOptBscInqPosnRequestT(char* testCaseNum , const char *root) {
	optBscInqPosnRequestT voptBscInqPosnRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscInqPosnRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscInqPosnRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscInqPosnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscInqPosnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscInqPosnRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscInqPosnRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqPosnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRequestT.trnDat", ltrnDat);
	memcpy(voptBscInqPosnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqPosnRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqPosnRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqPosnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqPosnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqPosnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqPosnRecT getOptBscInqPosnRecT(char* testCaseNum , const char *root) {
	optBscInqPosnRecT voptBscInqPosnRecT;
	int i;

	voptBscInqPosnRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscInqPosnRecT");
	voptBscInqPosnRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqPosnRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqPosnRecT.prvLngQty[i]= ' ';
	}
	char lprvLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRecT.prvLngQty", lprvLngQty);
	memcpy(voptBscInqPosnRecT.prvLngQty, lprvLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqPosnRecT.prvShtQty[i]= ' ';
	}
	char lprvShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRecT.prvShtQty", lprvShtQty);
	memcpy(voptBscInqPosnRecT.prvShtQty, lprvShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqPosnRecT.crtLngQty[i]= ' ';
	}
	char lcrtLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRecT.crtLngQty", lcrtLngQty);
	memcpy(voptBscInqPosnRecT.crtLngQty, lcrtLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqPosnRecT.crtShtQty[i]= ' ';
	}
	char lcrtShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRecT.crtShtQty", lcrtShtQty);
	memcpy(voptBscInqPosnRecT.crtShtQty, lcrtShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqPosnRecT.exerQty[i]= ' ';
	}
	char lexerQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRecT.exerQty", lexerQty);
	memcpy(voptBscInqPosnRecT.exerQty, lexerQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqPosnRecT.dsgnOpnLng[i]= ' ';
	}
	char ldsgnOpnLng[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRecT.dsgnOpnLng", ldsgnOpnLng);
	memcpy(voptBscInqPosnRecT.dsgnOpnLng, ldsgnOpnLng, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqPosnRecT.dsgnOpnSht[i]= ' ';
	}
	char ldsgnOpnSht[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRecT.dsgnOpnSht", ldsgnOpnSht);
	memcpy(voptBscInqPosnRecT.dsgnOpnSht, ldsgnOpnSht, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscInqPosnRecT.totPrmAmnt[i]= ' ';
	}
	char ltotPrmAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRecT.totPrmAmnt", ltotPrmAmnt);
	memcpy(voptBscInqPosnRecT.totPrmAmnt, ltotPrmAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscInqPosnRecT.totFeeAmnt[i]= ' ';
	}
	char ltotFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnRecT.totFeeAmnt", ltotFeeAmnt);
	memcpy(voptBscInqPosnRecT.totFeeAmnt, ltotFeeAmnt, DRIV_AMOUNT_LEN);
	return voptBscInqPosnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqPosnResponseT getOptBscInqPosnResponseT(char* testCaseNum , const char *root) {
	optBscInqPosnResponseT voptBscInqPosnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqPosnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqPosnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqPosnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqPosn.optBscInqPosnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqPosnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqPosnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqPosnRecT getOptExtInqPosnRecT(char* testCaseNum , const char *root) {
	optExtInqPosnRecT voptExtInqPosnRecT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqPosnRecT.abdnQty[i]= ' ';
	}
	char labdnQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosn.optExtInqPosnRecT.abdnQty", labdnQty);
	memcpy(voptExtInqPosnRecT.abdnQty, labdnQty, DRIV_QUANTITY_LEN);
	return voptExtInqPosnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqPosnResponseT getOptExtInqPosnResponseT(char* testCaseNum , const char *root) {
	optExtInqPosnResponseT voptExtInqPosnResponseT;
	int i;
	return voptExtInqPosnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqPosnRequestT* getFutInqPosnRequestT(char* testCaseNum) {
	vfutInqPosnRequestT = (futInqPosnRequestT*)malloc(sizeof(futInqPosnRequestT));
	int i;

	vfutInqPosnRequestT->header = getDataHeaderT(testCaseNum, "futInqPosnRequestT");
	vfutInqPosnRequestT->basic = getFutBscInqPosnRequestT(testCaseNum, "futInqPosnRequestT");
	return vfutInqPosnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqPosnResponseT* getFutInqPosnResponseT(char* testCaseNum) {
	vfutInqPosnResponseT = (futInqPosnResponseT*)malloc(sizeof(futInqPosnResponseT));
	int i;

	vfutInqPosnResponseT->header = getDataHeaderT(testCaseNum, "futInqPosnResponseT");
	vfutInqPosnResponseT->basic = getFutBscInqPosnResponseT(testCaseNum, "futInqPosnResponseT");
	return vfutInqPosnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqPosnRequestT* getOptInqPosnRequestT(char* testCaseNum) {
	voptInqPosnRequestT = (optInqPosnRequestT*)malloc(sizeof(optInqPosnRequestT));
	int i;

	voptInqPosnRequestT->header = getDataHeaderT(testCaseNum, "optInqPosnRequestT");
	voptInqPosnRequestT->basic = getOptBscInqPosnRequestT(testCaseNum, "optInqPosnRequestT");
	return voptInqPosnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqPosnResponseT* getOptInqPosnResponseT(char* testCaseNum) {
	voptInqPosnResponseT = (optInqPosnResponseT*)malloc(sizeof(optInqPosnResponseT));
	int i;

	voptInqPosnResponseT->header = getDataHeaderT(testCaseNum, "optInqPosnResponseT");
	voptInqPosnResponseT->basic = getOptBscInqPosnResponseT(testCaseNum, "optInqPosnResponseT");
	voptInqPosnResponseT->extension = getOptExtInqPosnResponseT(testCaseNum, "optInqPosnResponseT");
	return voptInqPosnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqPosnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqPosnRequestT));
	futInqPosnRequestT *vfutInqPosnRequestT = getFutInqPosnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqPosnRequestT), (jbyte*) vfutInqPosnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqPosnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqPosnResponseT));
	futInqPosnResponseT *vfutInqPosnResponseT = getFutInqPosnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqPosnResponseT), (jbyte*) vfutInqPosnResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqPosnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqPosnRequestT));
	optInqPosnRequestT *voptInqPosnRequestT = getOptInqPosnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqPosnRequestT), (jbyte*) voptInqPosnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqPosnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqPosnResponseT));
	optInqPosnResponseT *voptInqPosnResponseT = getOptInqPosnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqPosnResponseT), (jbyte*) voptInqPosnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqPosnRequestT(futBscInqPosnRequestT actual, futBscInqPosnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	for ( i = 0; i < FUT_BSC_INQ_POSN_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqPosnRecT(futBscInqPosnRecT actual, futBscInqPosnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.prvLngQty, expected.prvLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRecT, prvLngQty not matching. Actual %s but Expected %s", actual.prvLngQty, expected.prvLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvShtQty, expected.prvShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRecT, prvShtQty not matching. Actual %s but Expected %s", actual.prvShtQty, expected.prvShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtLngQty, expected.crtLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRecT, crtLngQty not matching. Actual %s but Expected %s", actual.crtLngQty, expected.crtLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtShtQty, expected.crtShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRecT, crtShtQty not matching. Actual %s but Expected %s", actual.crtShtQty, expected.crtShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.notifQty, expected.notifQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRecT, notifQty not matching. Actual %s but Expected %s", actual.notifQty, expected.notifQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnLng, expected.dsgnOpnLng, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRecT, dsgnOpnLng not matching. Actual %s but Expected %s", actual.dsgnOpnLng, expected.dsgnOpnLng);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnSht, expected.dsgnOpnSht, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRecT, dsgnOpnSht not matching. Actual %s but Expected %s", actual.dsgnOpnSht, expected.dsgnOpnSht);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totVmarAmnt, expected.totVmarAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRecT, totVmarAmnt not matching. Actual %s but Expected %s", actual.totVmarAmnt, expected.totVmarAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totFeeAmnt, expected.totFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnRecT, totFeeAmnt not matching. Actual %s but Expected %s", actual.totFeeAmnt, expected.totFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqPosnResponseT(futBscInqPosnResponseT actual, futBscInqPosnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_POSN_REC_MAX;i++) {
		compareFutBscInqPosnRecT (actual.futBscInqPosnRec[i],expected.futBscInqPosnRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqPosnRequestT(optBscInqPosnRequestT actual, optBscInqPosnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	for ( i = 0; i < OPT_BSC_INQ_POSN_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqPosnRecT(optBscInqPosnRecT actual, optBscInqPosnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.prvLngQty, expected.prvLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRecT, prvLngQty not matching. Actual %s but Expected %s", actual.prvLngQty, expected.prvLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvShtQty, expected.prvShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRecT, prvShtQty not matching. Actual %s but Expected %s", actual.prvShtQty, expected.prvShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtLngQty, expected.crtLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRecT, crtLngQty not matching. Actual %s but Expected %s", actual.crtLngQty, expected.crtLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtShtQty, expected.crtShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRecT, crtShtQty not matching. Actual %s but Expected %s", actual.crtShtQty, expected.crtShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exerQty, expected.exerQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRecT, exerQty not matching. Actual %s but Expected %s", actual.exerQty, expected.exerQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnLng, expected.dsgnOpnLng, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRecT, dsgnOpnLng not matching. Actual %s but Expected %s", actual.dsgnOpnLng, expected.dsgnOpnLng);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnSht, expected.dsgnOpnSht, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRecT, dsgnOpnSht not matching. Actual %s but Expected %s", actual.dsgnOpnSht, expected.dsgnOpnSht);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totPrmAmnt, expected.totPrmAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRecT, totPrmAmnt not matching. Actual %s but Expected %s", actual.totPrmAmnt, expected.totPrmAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totFeeAmnt, expected.totFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnRecT, totFeeAmnt not matching. Actual %s but Expected %s", actual.totFeeAmnt, expected.totFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqPosnResponseT(optBscInqPosnResponseT actual, optBscInqPosnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_POSN_REC_MAX;i++) {
		compareOptBscInqPosnRecT (actual.optBscInqPosnRec[i],expected.optBscInqPosnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqPosnRecT(optExtInqPosnRecT actual, optExtInqPosnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.abdnQty, expected.abdnQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqPosnRecT, abdnQty not matching. Actual %s but Expected %s", actual.abdnQty, expected.abdnQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqPosnResponseT(optExtInqPosnResponseT actual, optExtInqPosnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_POSN_REC_MAX;i++) {
		compareOptExtInqPosnRecT (actual.optExtInqPosnRec[i],expected.optExtInqPosnRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqPosnRequestT(futInqPosnRequestT actual, futInqPosnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqPosnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqPosnResponseT(futInqPosnResponseT actual, futInqPosnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqPosnResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqPosnRequestT(optInqPosnRequestT actual, optInqPosnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqPosnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqPosnResponseT(optInqPosnResponseT actual, optInqPosnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqPosnResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqPosnResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqPosnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqPosnRequestT *actualData = (futInqPosnRequestT *)msgStruct;
	futInqPosnRequestT* expectedData = getFutInqPosnRequestT(testCaseNum);
	compareFutInqPosnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqPosnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqPosnResponseT *actualData = (futInqPosnResponseT *)msgStruct;
	futInqPosnResponseT* expectedData = getFutInqPosnResponseT(testCaseNum);
	compareFutInqPosnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqPosnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqPosnRequestT *actualData = (optInqPosnRequestT *)msgStruct;
	optInqPosnRequestT* expectedData = getOptInqPosnRequestT(testCaseNum);
	compareOptInqPosnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqPosnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqPosnResponseT *actualData = (optInqPosnResponseT *)msgStruct;
	optInqPosnResponseT* expectedData = getOptInqPosnResponseT(testCaseNum);
	compareOptInqPosnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
