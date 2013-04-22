#include <InqExer.hxx>
#define BUFFER_SIZE 1000

optInqExerRequestT *voptInqExerRequestT;
optInqExerResponseT *voptInqExerResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqExerRequestT getOptBscInqExerRequestT(char* testCaseNum , const char *root) {
	optBscInqExerRequestT voptBscInqExerRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscInqExerRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscInqExerRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscInqExerRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscInqExerRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscInqExerRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscInqExerRequestT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqExerRequestT.undrPrc[i]= ' ';
	}
	char lundrPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerRequestT.undrPrc", lundrPrc);
	memcpy(voptBscInqExerRequestT.undrPrc, lundrPrc, DRIV_PRICE_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqExerRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqExerRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqExerRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqExerRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqExerRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqExerRequestT getOptExtInqExerRequestT(char* testCaseNum , const char *root) {
	optExtInqExerRequestT voptExtInqExerRequestT;
	int i;

	char lexerCntrInd[1] = {""};
	getStrProperty("InqExer.optExtInqExerRequestT.exerCntrInd", lexerCntrInd);
	voptExtInqExerRequestT.exerCntrInd = lexerCntrInd[0];
	return voptExtInqExerRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqExerRecT getOptBscInqExerRecT(char* testCaseNum , const char *root) {
	optBscInqExerRecT voptBscInqExerRecT;
	int i;

	voptBscInqExerRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscInqExerRecT");
	voptBscInqExerRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqExerRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqExerRecT.exerQty[i]= ' ';
	}
	char lexerQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerRecT.exerQty", lexerQty);
	memcpy(voptBscInqExerRecT.exerQty, lexerQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqExerRecT.crtLngQty[i]= ' ';
	}
	char lcrtLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerRecT.crtLngQty", lcrtLngQty);
	memcpy(voptBscInqExerRecT.crtLngQty, lcrtLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqExerRecT.dsgnOpnLng[i]= ' ';
	}
	char ldsgnOpnLng[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerRecT.dsgnOpnLng", ldsgnOpnLng);
	memcpy(voptBscInqExerRecT.dsgnOpnLng, ldsgnOpnLng, DRIV_QUANTITY_LEN);

	for(i=0;i<TRD_UNT_NO_LEN;i++) {
		voptBscInqExerRecT.trdUntNo[i]= ' ';
	}
	char ltrdUntNo[TRD_UNT_NO_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerRecT.trdUntNo", ltrdUntNo);
	memcpy(voptBscInqExerRecT.trdUntNo, ltrdUntNo, TRD_UNT_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqExerRecT.undrPrc[i]= ' ';
	}
	char lundrPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerRecT.undrPrc", lundrPrc);
	memcpy(voptBscInqExerRecT.undrPrc, lundrPrc, DRIV_PRICE_LEN);

	char lundrPrcInd[1] = {""};
	getStrProperty("InqExer.optBscInqExerRecT.undrPrcInd", lundrPrcInd);
	voptBscInqExerRecT.undrPrcInd = lundrPrcInd[0];

	for(i=0;i<UNDR_DISP_DCML_LEN;i++) {
		voptBscInqExerRecT.undrDispDcml[i]= ' ';
	}
	char lundrDispDcml[UNDR_DISP_DCML_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerRecT.undrDispDcml", lundrDispDcml);
	memcpy(voptBscInqExerRecT.undrDispDcml, lundrDispDcml, UNDR_DISP_DCML_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscInqExerRecT.itmPerUnt[i]= ' ';
	}
	char litmPerUnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerRecT.itmPerUnt", litmPerUnt);
	memcpy(voptBscInqExerRecT.itmPerUnt, litmPerUnt, DRIV_AMOUNT_LEN);
	return voptBscInqExerRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqExerResponseT getOptBscInqExerResponseT(char* testCaseNum , const char *root) {
	optBscInqExerResponseT voptBscInqExerResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqExerResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqExerResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqExerResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqExer.optBscInqExerResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqExerResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqExerResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqExerRecT getOptExtInqExerRecT(char* testCaseNum , const char *root) {
	optExtInqExerRecT voptExtInqExerRecT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqExerRecT.undrXetraPrc[i]= ' ';
	}
	char lundrXetraPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqExer.optExtInqExerRecT.undrXetraPrc", lundrXetraPrc);
	memcpy(voptExtInqExerRecT.undrXetraPrc, lundrXetraPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqExerRecT.abdnQty[i]= ' ';
	}
	char labdnQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqExer.optExtInqExerRecT.abdnQty", labdnQty);
	memcpy(voptExtInqExerRecT.abdnQty, labdnQty, DRIV_QUANTITY_LEN);

	char lautManExerTyp[1] = {""};
	getStrProperty("InqExer.optExtInqExerRecT.autManExerTyp", lautManExerTyp);
	voptExtInqExerRecT.autManExerTyp = lautManExerTyp[0];
	return voptExtInqExerRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqExerResponseT getOptExtInqExerResponseT(char* testCaseNum , const char *root) {
	optExtInqExerResponseT voptExtInqExerResponseT;
	int i;
	return voptExtInqExerResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqExerRequestT* getOptInqExerRequestT(char* testCaseNum) {
	voptInqExerRequestT = (optInqExerRequestT*)malloc(sizeof(optInqExerRequestT));
	int i;

	voptInqExerRequestT->header = getDataHeaderT(testCaseNum, "optInqExerRequestT");
	voptInqExerRequestT->basic = getOptBscInqExerRequestT(testCaseNum, "optInqExerRequestT");
	voptInqExerRequestT->extension = getOptExtInqExerRequestT(testCaseNum, "optInqExerRequestT");
	return voptInqExerRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqExerResponseT* getOptInqExerResponseT(char* testCaseNum) {
	voptInqExerResponseT = (optInqExerResponseT*)malloc(sizeof(optInqExerResponseT));
	int i;

	voptInqExerResponseT->header = getDataHeaderT(testCaseNum, "optInqExerResponseT");
	voptInqExerResponseT->basic = getOptBscInqExerResponseT(testCaseNum, "optInqExerResponseT");
	voptInqExerResponseT->extension = getOptExtInqExerResponseT(testCaseNum, "optInqExerResponseT");
	return voptInqExerResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqExerRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqExerRequestT));
	optInqExerRequestT *voptInqExerRequestT = getOptInqExerRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqExerRequestT), (jbyte*) voptInqExerRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqExerResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqExerResponseT));
	optInqExerResponseT *voptInqExerResponseT = getOptInqExerResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqExerResponseT), (jbyte*) voptInqExerResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqExerRequestT(optBscInqExerRequestT actual, optBscInqExerRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	for ( i = 0; i < OPT_BSC_INQ_EXER_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.undrPrc, expected.undrPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRequestT, undrPrc not matching. Actual %s but Expected %s", actual.undrPrc, expected.undrPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqExerRequestT(optExtInqExerRequestT actual, optExtInqExerRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.exerCntrInd!= expected.exerCntrInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqExerRequestT, exerCntrIndnot matching. Actual %d but Expected %d", actual.exerCntrInd, expected.exerCntrInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqExerRecT(optBscInqExerRecT actual, optBscInqExerRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.exerQty, expected.exerQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRecT, exerQty not matching. Actual %s but Expected %s", actual.exerQty, expected.exerQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtLngQty, expected.crtLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRecT, crtLngQty not matching. Actual %s but Expected %s", actual.crtLngQty, expected.crtLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnLng, expected.dsgnOpnLng, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRecT, dsgnOpnLng not matching. Actual %s but Expected %s", actual.dsgnOpnLng, expected.dsgnOpnLng);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdUntNo, expected.trdUntNo, TRD_UNT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRecT, trdUntNo not matching. Actual %s but Expected %s", actual.trdUntNo, expected.trdUntNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrPrc, expected.undrPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRecT, undrPrc not matching. Actual %s but Expected %s", actual.undrPrc, expected.undrPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.undrPrcInd!= expected.undrPrcInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRecT, undrPrcIndnot matching. Actual %d but Expected %d", actual.undrPrcInd, expected.undrPrcInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrDispDcml, expected.undrDispDcml, UNDR_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRecT, undrDispDcml not matching. Actual %s but Expected %s", actual.undrDispDcml, expected.undrDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.itmPerUnt, expected.itmPerUnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerRecT, itmPerUnt not matching. Actual %s but Expected %s", actual.itmPerUnt, expected.itmPerUnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqExerResponseT(optBscInqExerResponseT actual, optBscInqExerResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_EXER_REC_MAX;i++) {
		compareOptBscInqExerRecT (actual.optBscInqExerRec[i],expected.optBscInqExerRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqExerRecT(optExtInqExerRecT actual, optExtInqExerRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.undrXetraPrc, expected.undrXetraPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqExerRecT, undrXetraPrc not matching. Actual %s but Expected %s", actual.undrXetraPrc, expected.undrXetraPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.abdnQty, expected.abdnQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqExerRecT, abdnQty not matching. Actual %s but Expected %s", actual.abdnQty, expected.abdnQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.autManExerTyp!= expected.autManExerTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqExerRecT, autManExerTypnot matching. Actual %d but Expected %d", actual.autManExerTyp, expected.autManExerTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqExerResponseT(optExtInqExerResponseT actual, optExtInqExerResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_EXER_REC_MAX;i++) {
		compareOptExtInqExerRecT (actual.optExtInqExerRec[i],expected.optExtInqExerRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqExerRequestT(optInqExerRequestT actual, optInqExerRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqExerRequestT (actual.basic,expected.basic, logMsg);	compareOptExtInqExerRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqExerResponseT(optInqExerResponseT actual, optInqExerResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqExerResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqExerResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqExerRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqExerRequestT *actualData = (optInqExerRequestT *)msgStruct;
	optInqExerRequestT* expectedData = getOptInqExerRequestT(testCaseNum);
	compareOptInqExerRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqExerResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqExerResponseT *actualData = (optInqExerResponseT *)msgStruct;
	optInqExerResponseT* expectedData = getOptInqExerResponseT(testCaseNum);
	compareOptInqExerResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
