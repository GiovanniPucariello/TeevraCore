#include <InqAsgn.hxx>
#define BUFFER_SIZE 1000

optInqAsgnRequestT *voptInqAsgnRequestT;
optInqAsgnResponseT *voptInqAsgnResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAsgnRequestT getOptBscInqAsgnRequestT(char* testCaseNum , const char *root) {
	optBscInqAsgnRequestT voptBscInqAsgnRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscInqAsgnRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqAsgn.optBscInqAsgnRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscInqAsgnRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscInqAsgnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqAsgn.optBscInqAsgnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscInqAsgnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqAsgnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAsgn.optBscInqAsgnRequestT.trnDat", ltrnDat);
	memcpy(voptBscInqAsgnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqAsgnRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqAsgn.optBscInqAsgnRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqAsgnRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqAsgnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAsgn.optBscInqAsgnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqAsgnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqAsgnRequestT getOptExtInqAsgnRequestT(char* testCaseNum , const char *root) {
	optExtInqAsgnRequestT voptExtInqAsgnRequestT;
	int i;

	voptExtInqAsgnRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtInqAsgnRequestT");	return voptExtInqAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAsgnRecT getOptBscInqAsgnRecT(char* testCaseNum , const char *root) {
	optBscInqAsgnRecT voptBscInqAsgnRecT;
	int i;

	voptBscInqAsgnRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqAsgnRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqAsgnRecT.asgnQty[i]= ' ';
	}
	char lasgnQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqAsgn.optBscInqAsgnRecT.asgnQty", lasgnQty);
	memcpy(voptBscInqAsgnRecT.asgnQty, lasgnQty, DRIV_QUANTITY_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		voptBscInqAsgnRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqAsgn.optBscInqAsgnRecT.isinCod", lisinCod);
	memcpy(voptBscInqAsgnRecT.isinCod, lisinCod, ISIN_COD_LEN);
	return voptBscInqAsgnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAsgnResponseT getOptBscInqAsgnResponseT(char* testCaseNum , const char *root) {
	optBscInqAsgnResponseT voptBscInqAsgnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqAsgnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAsgn.optBscInqAsgnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqAsgnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqAsgnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqAsgn.optBscInqAsgnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqAsgnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqAsgnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqAsgnRecT getOptExtInqAsgnRecT(char* testCaseNum , const char *root) {
	optExtInqAsgnRecT voptExtInqAsgnRecT;
	int i;

	voptExtInqAsgnRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtInqAsgnRecT");	return voptExtInqAsgnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqAsgnResponseT getOptExtInqAsgnResponseT(char* testCaseNum , const char *root) {
	optExtInqAsgnResponseT voptExtInqAsgnResponseT;
	int i;
	return voptExtInqAsgnResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqAsgnRequestT* getOptInqAsgnRequestT(char* testCaseNum) {
	voptInqAsgnRequestT = (optInqAsgnRequestT*)malloc(sizeof(optInqAsgnRequestT));
	int i;

	voptInqAsgnRequestT->header = getDataHeaderT(testCaseNum, "optInqAsgnRequestT");
	voptInqAsgnRequestT->basic = getOptBscInqAsgnRequestT(testCaseNum, "optInqAsgnRequestT");
	voptInqAsgnRequestT->extension = getOptExtInqAsgnRequestT(testCaseNum, "optInqAsgnRequestT");
	return voptInqAsgnRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqAsgnResponseT* getOptInqAsgnResponseT(char* testCaseNum) {
	voptInqAsgnResponseT = (optInqAsgnResponseT*)malloc(sizeof(optInqAsgnResponseT));
	int i;

	voptInqAsgnResponseT->header = getDataHeaderT(testCaseNum, "optInqAsgnResponseT");
	voptInqAsgnResponseT->basic = getOptBscInqAsgnResponseT(testCaseNum, "optInqAsgnResponseT");
	voptInqAsgnResponseT->extension = getOptExtInqAsgnResponseT(testCaseNum, "optInqAsgnResponseT");
	return voptInqAsgnResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqAsgnRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqAsgnRequestT));
	optInqAsgnRequestT *voptInqAsgnRequestT = getOptInqAsgnRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqAsgnRequestT), (jbyte*) voptInqAsgnRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqAsgnResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqAsgnResponseT));
	optInqAsgnResponseT *voptInqAsgnResponseT = getOptInqAsgnResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqAsgnResponseT), (jbyte*) voptInqAsgnResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAsgnRequestT(optBscInqAsgnRequestT actual, optBscInqAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_BSC_INQ_ASGN_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqAsgnRequestT(optExtInqAsgnRequestT actual, optExtInqAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAsgnRecT(optBscInqAsgnRecT actual, optBscInqAsgnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.asgnQty, expected.asgnQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnRecT, asgnQty not matching. Actual %s but Expected %s", actual.asgnQty, expected.asgnQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAsgnResponseT(optBscInqAsgnResponseT actual, optBscInqAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_ASGN_REC_MAX;i++) {
		compareOptBscInqAsgnRecT (actual.optBscInqAsgnRec[i],expected.optBscInqAsgnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqAsgnRecT(optExtInqAsgnRecT actual, optExtInqAsgnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqAsgnResponseT(optExtInqAsgnResponseT actual, optExtInqAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_ASGN_REC_MAX;i++) {
		compareOptExtInqAsgnRecT (actual.optExtInqAsgnRec[i],expected.optExtInqAsgnRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqAsgnRequestT(optInqAsgnRequestT actual, optInqAsgnRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqAsgnRequestT (actual.basic,expected.basic, logMsg);	compareOptExtInqAsgnRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqAsgnResponseT(optInqAsgnResponseT actual, optInqAsgnResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqAsgnResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqAsgnResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqAsgnRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqAsgnRequestT *actualData = (optInqAsgnRequestT *)msgStruct;
	optInqAsgnRequestT* expectedData = getOptInqAsgnRequestT(testCaseNum);
	compareOptInqAsgnRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqAsgnResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqAsgnResponseT *actualData = (optInqAsgnResponseT *)msgStruct;
	optInqAsgnResponseT* expectedData = getOptInqAsgnResponseT(testCaseNum);
	compareOptInqAsgnResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
