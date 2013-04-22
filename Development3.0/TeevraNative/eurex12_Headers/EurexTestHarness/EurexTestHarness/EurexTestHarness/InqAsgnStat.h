#include <InqAsgnStat.hxx>
#define BUFFER_SIZE 1000

optInqAsgnStatRequestT *voptInqAsgnStatRequestT;
optInqAsgnStatResponseT *voptInqAsgnStatResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAsgnStatRequestT getOptBscInqAsgnStatRequestT(char* testCaseNum , const char *root) {
	optBscInqAsgnStatRequestT voptBscInqAsgnStatRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscInqAsgnStatRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqAsgnStat.optBscInqAsgnStatRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscInqAsgnStatRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqAsgnStatRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAsgnStat.optBscInqAsgnStatRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqAsgnStatRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqAsgnStatRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAsgnStatRecT getOptBscInqAsgnStatRecT(char* testCaseNum , const char *root) {
	optBscInqAsgnStatRecT voptBscInqAsgnStatRecT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscInqAsgnStatRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqAsgnStat.optBscInqAsgnStatRecT.prodId", lprodId);
	memcpy(voptBscInqAsgnStatRecT.prodId, lprodId, PROD_ID_LEN);

	char lasgnStsInd[1] = {""};
	getStrProperty("InqAsgnStat.optBscInqAsgnStatRecT.asgnStsInd", lasgnStsInd);
	voptBscInqAsgnStatRecT.asgnStsInd = lasgnStsInd[0];

	for(i=0;i<DRIV_ASGN_MSG_CTR_LEN;i++) {
		voptBscInqAsgnStatRecT.asgnMsgCtr[i]= ' ';
	}
	char lasgnMsgCtr[DRIV_ASGN_MSG_CTR_LEN] = {""};
	getStrProperty("InqAsgnStat.optBscInqAsgnStatRecT.asgnMsgCtr", lasgnMsgCtr);
	memcpy(voptBscInqAsgnStatRecT.asgnMsgCtr, lasgnMsgCtr, DRIV_ASGN_MSG_CTR_LEN);
	return voptBscInqAsgnStatRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAsgnStatResponseT getOptBscInqAsgnStatResponseT(char* testCaseNum , const char *root) {
	optBscInqAsgnStatResponseT voptBscInqAsgnStatResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqAsgnStatResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAsgnStat.optBscInqAsgnStatResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqAsgnStatResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqAsgnStatResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqAsgnStat.optBscInqAsgnStatResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqAsgnStatResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscInqAsgnStatResponseT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqAsgnStat.optBscInqAsgnStatResponseT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscInqAsgnStatResponseT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);
	return voptBscInqAsgnStatResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqAsgnStatRequestT* getOptInqAsgnStatRequestT(char* testCaseNum) {
	voptInqAsgnStatRequestT = (optInqAsgnStatRequestT*)malloc(sizeof(optInqAsgnStatRequestT));
	int i;

	voptInqAsgnStatRequestT->header = getDataHeaderT(testCaseNum, "optInqAsgnStatRequestT");
	voptInqAsgnStatRequestT->basic = getOptBscInqAsgnStatRequestT(testCaseNum, "optInqAsgnStatRequestT");
	return voptInqAsgnStatRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqAsgnStatResponseT* getOptInqAsgnStatResponseT(char* testCaseNum) {
	voptInqAsgnStatResponseT = (optInqAsgnStatResponseT*)malloc(sizeof(optInqAsgnStatResponseT));
	int i;

	voptInqAsgnStatResponseT->header = getDataHeaderT(testCaseNum, "optInqAsgnStatResponseT");
	voptInqAsgnStatResponseT->basic = getOptBscInqAsgnStatResponseT(testCaseNum, "optInqAsgnStatResponseT");
	return voptInqAsgnStatResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqAsgnStatRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqAsgnStatRequestT));
	optInqAsgnStatRequestT *voptInqAsgnStatRequestT = getOptInqAsgnStatRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqAsgnStatRequestT), (jbyte*) voptInqAsgnStatRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqAsgnStatResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqAsgnStatResponseT));
	optInqAsgnStatResponseT *voptInqAsgnStatResponseT = getOptInqAsgnStatResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqAsgnStatResponseT), (jbyte*) voptInqAsgnStatResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAsgnStatRequestT(optBscInqAsgnStatRequestT actual, optBscInqAsgnStatRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnStatRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnStatRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAsgnStatRecT(optBscInqAsgnStatRecT actual, optBscInqAsgnStatRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnStatRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.asgnStsInd!= expected.asgnStsInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnStatRecT, asgnStsIndnot matching. Actual %d but Expected %d", actual.asgnStsInd, expected.asgnStsInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.asgnMsgCtr, expected.asgnMsgCtr, DRIV_ASGN_MSG_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnStatRecT, asgnMsgCtr not matching. Actual %s but Expected %s", actual.asgnMsgCtr, expected.asgnMsgCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAsgnStatResponseT(optBscInqAsgnStatResponseT actual, optBscInqAsgnStatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnStatResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnStatResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAsgnStatResponseT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_ASGN_STAT_REC_MAX;i++) {
		compareOptBscInqAsgnStatRecT (actual.optBscInqAsgnStatRec[i],expected.optBscInqAsgnStatRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqAsgnStatRequestT(optInqAsgnStatRequestT actual, optInqAsgnStatRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqAsgnStatRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqAsgnStatResponseT(optInqAsgnStatResponseT actual, optInqAsgnStatResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqAsgnStatResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqAsgnStatRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqAsgnStatRequestT *actualData = (optInqAsgnStatRequestT *)msgStruct;
	optInqAsgnStatRequestT* expectedData = getOptInqAsgnStatRequestT(testCaseNum);
	compareOptInqAsgnStatRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqAsgnStatResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqAsgnStatResponseT *actualData = (optInqAsgnStatResponseT *)msgStruct;
	optInqAsgnStatResponseT* expectedData = getOptInqAsgnStatResponseT(testCaseNum);
	compareOptInqAsgnStatResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
