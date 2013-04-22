#include <InqAutExerParm.hxx>
#define BUFFER_SIZE 1000

optInqAutExerParmRequestT *voptInqAutExerParmRequestT;
optInqAutExerParmResponseT *voptInqAutExerParmResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAutExerParmGrpT getOptBscInqAutExerParmGrpT(char* testCaseNum , const char *root) {
	optBscInqAutExerParmGrpT voptBscInqAutExerParmGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscInqAutExerParmGrpT.genProdId[i]= ' ';
	}
	char lgenProdId[PROD_ID_LEN] = {""};
	getStrProperty("InqAutExerParm.optBscInqAutExerParmGrpT.genProdId", lgenProdId);
	memcpy(voptBscInqAutExerParmGrpT.genProdId, lgenProdId, PROD_ID_LEN);
	return voptBscInqAutExerParmGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAutExerParmRequestT getOptBscInqAutExerParmRequestT(char* testCaseNum , const char *root) {
	optBscInqAutExerParmRequestT voptBscInqAutExerParmRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscInqAutExerParmRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqAutExerParm.optBscInqAutExerParmRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscInqAutExerParmRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqAutExerParmRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqAutExerParm.optBscInqAutExerParmRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqAutExerParmRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqAutExerParmRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAutExerParm.optBscInqAutExerParmRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqAutExerParmRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqAutExerParmRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAutExerParmRecT getOptBscInqAutExerParmRecT(char* testCaseNum , const char *root) {
	optBscInqAutExerParmRecT voptBscInqAutExerParmRecT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscInqAutExerParmRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqAutExerParm.optBscInqAutExerParmRecT.prodId", lprodId);
	memcpy(voptBscInqAutExerParmRecT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscInqAutExerParmRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqAutExerParm.optBscInqAutExerParmRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscInqAutExerParmRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscInqAutExerParmRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAutExerParmResponseT getOptBscInqAutExerParmResponseT(char* testCaseNum , const char *root) {
	optBscInqAutExerParmResponseT voptBscInqAutExerParmResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqAutExerParmResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAutExerParm.optBscInqAutExerParmResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqAutExerParmResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqAutExerParmResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqAutExerParm.optBscInqAutExerParmResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqAutExerParmResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqAutExerParmResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqAutExerParmRecT getOptExtInqAutExerParmRecT(char* testCaseNum , const char *root) {
	optExtInqAutExerParmRecT voptExtInqAutExerParmRecT;
	int i;

	voptExtInqAutExerParmRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtInqAutExerParmRecT");
	for(i=0;i<DRIV_ITM_MIN_AMNT_LEN;i++) {
		voptExtInqAutExerParmRecT.itmMinAmnt[i]= ' ';
	}
	char litmMinAmnt[DRIV_ITM_MIN_AMNT_LEN] = {""};
	getStrProperty("InqAutExerParm.optExtInqAutExerParmRecT.itmMinAmnt", litmMinAmnt);
	memcpy(voptExtInqAutExerParmRecT.itmMinAmnt, litmMinAmnt, DRIV_ITM_MIN_AMNT_LEN);

	char litmMinAmntCod[1] = {""};
	getStrProperty("InqAutExerParm.optExtInqAutExerParmRecT.itmMinAmntCod", litmMinAmntCod);
	voptExtInqAutExerParmRecT.itmMinAmntCod = litmMinAmntCod[0];
	return voptExtInqAutExerParmRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqAutExerParmResponseT getOptExtInqAutExerParmResponseT(char* testCaseNum , const char *root) {
	optExtInqAutExerParmResponseT voptExtInqAutExerParmResponseT;
	int i;
	return voptExtInqAutExerParmResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqAutExerParmRequestT* getOptInqAutExerParmRequestT(char* testCaseNum) {
	voptInqAutExerParmRequestT = (optInqAutExerParmRequestT*)malloc(sizeof(optInqAutExerParmRequestT));
	int i;

	voptInqAutExerParmRequestT->header = getDataHeaderT(testCaseNum, "optInqAutExerParmRequestT");
	voptInqAutExerParmRequestT->basic = getOptBscInqAutExerParmRequestT(testCaseNum, "optInqAutExerParmRequestT");
	return voptInqAutExerParmRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqAutExerParmResponseT* getOptInqAutExerParmResponseT(char* testCaseNum) {
	voptInqAutExerParmResponseT = (optInqAutExerParmResponseT*)malloc(sizeof(optInqAutExerParmResponseT));
	int i;

	voptInqAutExerParmResponseT->header = getDataHeaderT(testCaseNum, "optInqAutExerParmResponseT");
	voptInqAutExerParmResponseT->basic = getOptBscInqAutExerParmResponseT(testCaseNum, "optInqAutExerParmResponseT");
	voptInqAutExerParmResponseT->extension = getOptExtInqAutExerParmResponseT(testCaseNum, "optInqAutExerParmResponseT");
	return voptInqAutExerParmResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqAutExerParmRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqAutExerParmRequestT));
	optInqAutExerParmRequestT *voptInqAutExerParmRequestT = getOptInqAutExerParmRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqAutExerParmRequestT), (jbyte*) voptInqAutExerParmRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqAutExerParmResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqAutExerParmResponseT));
	optInqAutExerParmResponseT *voptInqAutExerParmResponseT = getOptInqAutExerParmResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqAutExerParmResponseT), (jbyte*) voptInqAutExerParmResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAutExerParmGrpT(optBscInqAutExerParmGrpT actual, optBscInqAutExerParmGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.genProdId, expected.genProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAutExerParmGrpT, genProdId not matching. Actual %s but Expected %s", actual.genProdId, expected.genProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAutExerParmRequestT(optBscInqAutExerParmRequestT actual, optBscInqAutExerParmRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_BSC_INQ_AUT_EXER_PARM_GRP_MAX;i++) {
		compareOptBscInqAutExerParmGrpT (actual.optBscInqAutExerParmGrp[i],expected.optBscInqAutExerParmGrp[i], logMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAutExerParmRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAutExerParmRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAutExerParmRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAutExerParmRecT(optBscInqAutExerParmRecT actual, optBscInqAutExerParmRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAutExerParmRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAutExerParmRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAutExerParmResponseT(optBscInqAutExerParmResponseT actual, optBscInqAutExerParmResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAutExerParmResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAutExerParmResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_AUT_EXER_PARM_REC_MAX;i++) {
		compareOptBscInqAutExerParmRecT (actual.optBscInqAutExerParmRec[i],expected.optBscInqAutExerParmRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqAutExerParmRecT(optExtInqAutExerParmRecT actual, optExtInqAutExerParmRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.itmMinAmnt, expected.itmMinAmnt, DRIV_ITM_MIN_AMNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqAutExerParmRecT, itmMinAmnt not matching. Actual %s but Expected %s", actual.itmMinAmnt, expected.itmMinAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.itmMinAmntCod!= expected.itmMinAmntCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqAutExerParmRecT, itmMinAmntCodnot matching. Actual %d but Expected %d", actual.itmMinAmntCod, expected.itmMinAmntCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqAutExerParmResponseT(optExtInqAutExerParmResponseT actual, optExtInqAutExerParmResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_AUT_EXER_PARM_REC_MAX;i++) {
		compareOptExtInqAutExerParmRecT (actual.optExtInqAutExerParmRec[i],expected.optExtInqAutExerParmRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqAutExerParmRequestT(optInqAutExerParmRequestT actual, optInqAutExerParmRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqAutExerParmRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqAutExerParmResponseT(optInqAutExerParmResponseT actual, optInqAutExerParmResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqAutExerParmResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqAutExerParmResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqAutExerParmRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqAutExerParmRequestT *actualData = (optInqAutExerParmRequestT *)msgStruct;
	optInqAutExerParmRequestT* expectedData = getOptInqAutExerParmRequestT(testCaseNum);
	compareOptInqAutExerParmRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqAutExerParmResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqAutExerParmResponseT *actualData = (optInqAutExerParmResponseT *)msgStruct;
	optInqAutExerParmResponseT* expectedData = getOptInqAutExerParmResponseT(testCaseNum);
	compareOptInqAutExerParmResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
