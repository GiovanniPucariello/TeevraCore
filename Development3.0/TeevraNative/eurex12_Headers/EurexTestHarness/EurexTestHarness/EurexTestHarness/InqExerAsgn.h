#include <InqExerAsgn.hxx>
#define BUFFER_SIZE 1000

optInqExerAsgnRequestT *voptInqExerAsgnRequestT;
optInqExerAsgnResponseT *voptInqExerAsgnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqExerAsgnRequestT getOptBscInqExerAsgnRequestT(char* testCaseNum , const char *root) {
	optBscInqExerAsgnRequestT voptBscInqExerAsgnRequestT;
	int i;

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqExerAsgnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqExerAsgn.optBscInqExerAsgnRequestT.trnDat", ltrnDat);
	memcpy(voptBscInqExerAsgnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqExerAsgnRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqExerAsgn.optBscInqExerAsgnRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqExerAsgnRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqExerAsgnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqExerAsgn.optBscInqExerAsgnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqExerAsgnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqExerAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqExerAsgnRecT getOptBscInqExerAsgnRecT(char* testCaseNum , const char *root) {
	optBscInqExerAsgnRecT voptBscInqExerAsgnRecT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscInqExerAsgnRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqExerAsgn.optBscInqExerAsgnRecT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscInqExerAsgnRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscInqExerAsgnRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscInqExerAsgnRecT");
	voptBscInqExerAsgnRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqExerAsgnRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqExerAsgnRecT.exerQty[i]= ' ';
	}
	char lexerQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqExerAsgn.optBscInqExerAsgnRecT.exerQty", lexerQty);
	memcpy(voptBscInqExerAsgnRecT.exerQty, lexerQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqExerAsgnRecT.asgnQty[i]= ' ';
	}
	char lasgnQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqExerAsgn.optBscInqExerAsgnRecT.asgnQty", lasgnQty);
	memcpy(voptBscInqExerAsgnRecT.asgnQty, lasgnQty, DRIV_QUANTITY_LEN);
	return voptBscInqExerAsgnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqExerAsgnResponseT getOptBscInqExerAsgnResponseT(char* testCaseNum , const char *root) {
	optBscInqExerAsgnResponseT voptBscInqExerAsgnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqExerAsgnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqExerAsgn.optBscInqExerAsgnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqExerAsgnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqExerAsgnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqExerAsgn.optBscInqExerAsgnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqExerAsgnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqExerAsgnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqExerAsgnRecT getOptExtInqExerAsgnRecT(char* testCaseNum , const char *root) {
	optExtInqExerAsgnRecT voptExtInqExerAsgnRecT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqExerAsgnRecT.dlvShrQty[i]= ' ';
	}
	char ldlvShrQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqExerAsgn.optExtInqExerAsgnRecT.dlvShrQty", ldlvShrQty);
	memcpy(voptExtInqExerAsgnRecT.dlvShrQty, ldlvShrQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptExtInqExerAsgnRecT.invcAmnt[i]= ' ';
	}
	char linvcAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqExerAsgn.optExtInqExerAsgnRecT.invcAmnt", linvcAmnt);
	memcpy(voptExtInqExerAsgnRecT.invcAmnt, linvcAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptExtInqExerAsgnRecT.cshSetlAmnt[i]= ' ';
	}
	char lcshSetlAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqExerAsgn.optExtInqExerAsgnRecT.cshSetlAmnt", lcshSetlAmnt);
	memcpy(voptExtInqExerAsgnRecT.cshSetlAmnt, lcshSetlAmnt, DRIV_AMOUNT_LEN);
	return voptExtInqExerAsgnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqExerAsgnResponseT getOptExtInqExerAsgnResponseT(char* testCaseNum , const char *root) {
	optExtInqExerAsgnResponseT voptExtInqExerAsgnResponseT;
	int i;
	return voptExtInqExerAsgnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqExerAsgnRequestT* getOptInqExerAsgnRequestT(char* testCaseNum) {
	voptInqExerAsgnRequestT = (optInqExerAsgnRequestT*)malloc(sizeof(optInqExerAsgnRequestT));
	int i;

	voptInqExerAsgnRequestT->header = getDataHeaderT(testCaseNum, "optInqExerAsgnRequestT");
	voptInqExerAsgnRequestT->basic = getOptBscInqExerAsgnRequestT(testCaseNum, "optInqExerAsgnRequestT");
	return voptInqExerAsgnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqExerAsgnResponseT* getOptInqExerAsgnResponseT(char* testCaseNum) {
	voptInqExerAsgnResponseT = (optInqExerAsgnResponseT*)malloc(sizeof(optInqExerAsgnResponseT));
	int i;

	voptInqExerAsgnResponseT->header = getDataHeaderT(testCaseNum, "optInqExerAsgnResponseT");
	voptInqExerAsgnResponseT->basic = getOptBscInqExerAsgnResponseT(testCaseNum, "optInqExerAsgnResponseT");
	voptInqExerAsgnResponseT->extension = getOptExtInqExerAsgnResponseT(testCaseNum, "optInqExerAsgnResponseT");
	return voptInqExerAsgnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqExerAsgnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqExerAsgnRequestT));
	optInqExerAsgnRequestT *voptInqExerAsgnRequestT = getOptInqExerAsgnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqExerAsgnRequestT), (jbyte*) voptInqExerAsgnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqExerAsgnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqExerAsgnResponseT));
	optInqExerAsgnResponseT *voptInqExerAsgnResponseT = getOptInqExerAsgnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqExerAsgnResponseT), (jbyte*) voptInqExerAsgnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqExerAsgnRequestT(optBscInqExerAsgnRequestT actual, optBscInqExerAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerAsgnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_EXER_ASGN_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerAsgnRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerAsgnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqExerAsgnRecT(optBscInqExerAsgnRecT actual, optBscInqExerAsgnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerAsgnRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.exerQty, expected.exerQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerAsgnRecT, exerQty not matching. Actual %s but Expected %s", actual.exerQty, expected.exerQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.asgnQty, expected.asgnQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerAsgnRecT, asgnQty not matching. Actual %s but Expected %s", actual.asgnQty, expected.asgnQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqExerAsgnResponseT(optBscInqExerAsgnResponseT actual, optBscInqExerAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerAsgnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExerAsgnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_EXER_ASGN_REC_MAX;i++) {
		compareOptBscInqExerAsgnRecT (actual.optBscInqExerAsgnRec[i],expected.optBscInqExerAsgnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqExerAsgnRecT(optExtInqExerAsgnRecT actual, optExtInqExerAsgnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dlvShrQty, expected.dlvShrQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqExerAsgnRecT, dlvShrQty not matching. Actual %s but Expected %s", actual.dlvShrQty, expected.dlvShrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.invcAmnt, expected.invcAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqExerAsgnRecT, invcAmnt not matching. Actual %s but Expected %s", actual.invcAmnt, expected.invcAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshSetlAmnt, expected.cshSetlAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqExerAsgnRecT, cshSetlAmnt not matching. Actual %s but Expected %s", actual.cshSetlAmnt, expected.cshSetlAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqExerAsgnResponseT(optExtInqExerAsgnResponseT actual, optExtInqExerAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_EXER_ASGN_REC_MAX;i++) {
		compareOptExtInqExerAsgnRecT (actual.optExtInqExerAsgnRec[i],expected.optExtInqExerAsgnRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqExerAsgnRequestT(optInqExerAsgnRequestT actual, optInqExerAsgnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqExerAsgnRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqExerAsgnResponseT(optInqExerAsgnResponseT actual, optInqExerAsgnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqExerAsgnResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqExerAsgnResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqExerAsgnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqExerAsgnRequestT *actualData = (optInqExerAsgnRequestT *)msgStruct;
	optInqExerAsgnRequestT* expectedData = getOptInqExerAsgnRequestT(testCaseNum);
	compareOptInqExerAsgnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqExerAsgnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqExerAsgnResponseT *actualData = (optInqExerAsgnResponseT *)msgStruct;
	optInqExerAsgnResponseT* expectedData = getOptInqExerAsgnResponseT(testCaseNum);
	compareOptInqExerAsgnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
