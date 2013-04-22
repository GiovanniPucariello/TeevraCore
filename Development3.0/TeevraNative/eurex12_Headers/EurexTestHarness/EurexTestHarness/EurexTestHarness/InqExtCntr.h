#include <InqExtCntr.hxx>
#define BUFFER_SIZE 1000

optInqExtCntrRequestT *voptInqExtCntrRequestT;
optInqExtCntrResponseT *voptInqExtCntrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqExtCntrRequestT getOptBscInqExtCntrRequestT(char* testCaseNum , const char *root) {
	optBscInqExtCntrRequestT voptBscInqExtCntrRequestT;
	int i;

	for(i=0;i<PRIM_EXCH_ID_COD_LEN;i++) {
		voptBscInqExtCntrRequestT.primExchIdCod[i]= ' ';
	}
	char lprimExchIdCod[PRIM_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrRequestT.primExchIdCod", lprimExchIdCod);
	memcpy(voptBscInqExtCntrRequestT.primExchIdCod, lprimExchIdCod, PRIM_EXCH_ID_COD_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqExtCntrRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqExtCntrRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqExtCntrRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqExtCntrRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqExtCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqExtCntrRecT getOptBscInqExtCntrRecT(char* testCaseNum , const char *root) {
	optBscInqExtCntrRecT voptBscInqExtCntrRecT;
	int i;

	voptBscInqExtCntrRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqExtCntrRecT");
	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		voptBscInqExtCntrRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrRecT.currTypCod", lcurrTypCod);
	memcpy(voptBscInqExtCntrRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<TRD_UNT_NO_LEN;i++) {
		voptBscInqExtCntrRecT.trdUntNo[i]= ' ';
	}
	char ltrdUntNo[TRD_UNT_NO_LEN] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrRecT.trdUntNo", ltrdUntNo);
	memcpy(voptBscInqExtCntrRecT.trdUntNo, ltrdUntNo, TRD_UNT_NO_LEN);

	for(i=0;i<STRK_PRC_MULT_LEN;i++) {
		voptBscInqExtCntrRecT.strkPrcMult[i]= ' ';
	}
	char lstrkPrcMult[STRK_PRC_MULT_LEN] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrRecT.strkPrcMult", lstrkPrcMult);
	memcpy(voptBscInqExtCntrRecT.strkPrcMult, lstrkPrcMult, STRK_PRC_MULT_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqExtCntrRecT.cntrExpDat[i]= ' ';
	}
	char lcntrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrRecT.cntrExpDat", lcntrExpDat);
	memcpy(voptBscInqExtCntrRecT.cntrExpDat, lcntrExpDat, DRIV_DATE_LEN);

	char lcntrStsCod[1] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrRecT.cntrStsCod", lcntrStsCod);
	voptBscInqExtCntrRecT.cntrStsCod = lcntrStsCod[0];

	char lcntrAsynInd[1] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrRecT.cntrAsynInd", lcntrAsynInd);
	voptBscInqExtCntrRecT.cntrAsynInd = lcntrAsynInd[0];

	char llepoInd[1] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrRecT.lepoInd", llepoInd);
	voptBscInqExtCntrRecT.lepoInd = llepoInd[0];

	voptBscInqExtCntrRecT.occCntrIdGrp = getOccCntrIdGrpT(testCaseNum, "optBscInqExtCntrRecT");	return voptBscInqExtCntrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqExtCntrResponseT getOptBscInqExtCntrResponseT(char* testCaseNum , const char *root) {
	optBscInqExtCntrResponseT voptBscInqExtCntrResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqExtCntrResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqExtCntrResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqExtCntrResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqExtCntrResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);

	for(i=0;i<PRIM_EXCH_ID_COD_LEN;i++) {
		voptBscInqExtCntrResponseT.primExchIdCod[i]= ' ';
	}
	char lprimExchIdCod[PRIM_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqExtCntr.optBscInqExtCntrResponseT.primExchIdCod", lprimExchIdCod);
	memcpy(voptBscInqExtCntrResponseT.primExchIdCod, lprimExchIdCod, PRIM_EXCH_ID_COD_LEN);
	return voptBscInqExtCntrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqExtCntrRequestT* getOptInqExtCntrRequestT(char* testCaseNum) {
	voptInqExtCntrRequestT = (optInqExtCntrRequestT*)malloc(sizeof(optInqExtCntrRequestT));
	int i;

	voptInqExtCntrRequestT->header = getDataHeaderT(testCaseNum, "optInqExtCntrRequestT");
	voptInqExtCntrRequestT->basic = getOptBscInqExtCntrRequestT(testCaseNum, "optInqExtCntrRequestT");
	return voptInqExtCntrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqExtCntrResponseT* getOptInqExtCntrResponseT(char* testCaseNum) {
	voptInqExtCntrResponseT = (optInqExtCntrResponseT*)malloc(sizeof(optInqExtCntrResponseT));
	int i;

	voptInqExtCntrResponseT->header = getDataHeaderT(testCaseNum, "optInqExtCntrResponseT");
	voptInqExtCntrResponseT->basic = getOptBscInqExtCntrResponseT(testCaseNum, "optInqExtCntrResponseT");
	return voptInqExtCntrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqExtCntrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqExtCntrRequestT));
	optInqExtCntrRequestT *voptInqExtCntrRequestT = getOptInqExtCntrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqExtCntrRequestT), (jbyte*) voptInqExtCntrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqExtCntrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqExtCntrResponseT));
	optInqExtCntrResponseT *voptInqExtCntrResponseT = getOptInqExtCntrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqExtCntrResponseT), (jbyte*) voptInqExtCntrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqExtCntrRequestT(optBscInqExtCntrRequestT actual, optBscInqExtCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.primExchIdCod, expected.primExchIdCod, PRIM_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrRequestT, primExchIdCod not matching. Actual %s but Expected %s", actual.primExchIdCod, expected.primExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_EXT_CNTR_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqExtCntrRecT(optBscInqExtCntrRecT actual, optBscInqExtCntrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdUntNo, expected.trdUntNo, TRD_UNT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrRecT, trdUntNo not matching. Actual %s but Expected %s", actual.trdUntNo, expected.trdUntNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.strkPrcMult, expected.strkPrcMult, STRK_PRC_MULT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrRecT, strkPrcMult not matching. Actual %s but Expected %s", actual.strkPrcMult, expected.strkPrcMult);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpDat, expected.cntrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrRecT, cntrExpDat not matching. Actual %s but Expected %s", actual.cntrExpDat, expected.cntrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrStsCod!= expected.cntrStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrRecT, cntrStsCodnot matching. Actual %d but Expected %d", actual.cntrStsCod, expected.cntrStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrAsynInd!= expected.cntrAsynInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrRecT, cntrAsynIndnot matching. Actual %d but Expected %d", actual.cntrAsynInd, expected.cntrAsynInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.lepoInd!= expected.lepoInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrRecT, lepoIndnot matching. Actual %d but Expected %d", actual.lepoInd, expected.lepoInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOccCntrIdGrpT (actual.occCntrIdGrp,expected.occCntrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqExtCntrResponseT(optBscInqExtCntrResponseT actual, optBscInqExtCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.primExchIdCod, expected.primExchIdCod, PRIM_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqExtCntrResponseT, primExchIdCod not matching. Actual %s but Expected %s", actual.primExchIdCod, expected.primExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_EXT_CNTR_REC_MAX;i++) {
		compareOptBscInqExtCntrRecT (actual.optBscInqExtCntrRec[i],expected.optBscInqExtCntrRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqExtCntrRequestT(optInqExtCntrRequestT actual, optInqExtCntrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqExtCntrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqExtCntrResponseT(optInqExtCntrResponseT actual, optInqExtCntrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqExtCntrResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqExtCntrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqExtCntrRequestT *actualData = (optInqExtCntrRequestT *)msgStruct;
	optInqExtCntrRequestT* expectedData = getOptInqExtCntrRequestT(testCaseNum);
	compareOptInqExtCntrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqExtCntrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqExtCntrResponseT *actualData = (optInqExtCntrResponseT *)msgStruct;
	optInqExtCntrResponseT* expectedData = getOptInqExtCntrResponseT(testCaseNum);
	compareOptInqExtCntrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
