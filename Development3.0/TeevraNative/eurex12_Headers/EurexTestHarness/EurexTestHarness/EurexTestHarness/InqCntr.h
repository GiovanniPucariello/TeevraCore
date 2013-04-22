#include <InqCntr.hxx>
#define BUFFER_SIZE 1000

futInqCntrRequestT *vfutInqCntrRequestT;
futInqCntrResponseT *vfutInqCntrResponseT;
optInqCntrRequestT *voptInqCntrRequestT;
optInqCntrResponseT *voptInqCntrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqCntrRequestT getFutBscInqCntrRequestT(char* testCaseNum , const char *root) {
	futBscInqCntrRequestT vfutBscInqCntrRequestT;
	int i;

	vfutBscInqCntrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqCntrRequestT");
	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqCntrRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCntr.futBscInqCntrRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqCntrRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqCntrRecT getFutBscInqCntrRecT(char* testCaseNum , const char *root) {
	futBscInqCntrRecT vfutBscInqCntrRecT;
	int i;

	vfutBscInqCntrRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqCntrRecT");
	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscInqCntrRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqCntr.futBscInqCntrRecT.currTypCod", lcurrTypCod);
	memcpy(vfutBscInqCntrRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char ldcmlShft[1] = {""};
	getStrProperty("InqCntr.futBscInqCntrRecT.dcmlShft", ldcmlShft);
	vfutBscInqCntrRecT.dcmlShft = ldcmlShft[0];

	for(i=0;i<TRD_UNT_NO_LEN;i++) {
		vfutBscInqCntrRecT.trdUntNo[i]= ' ';
	}
	char ltrdUntNo[TRD_UNT_NO_LEN] = {""};
	getStrProperty("InqCntr.futBscInqCntrRecT.trdUntNo", ltrdUntNo);
	memcpy(vfutBscInqCntrRecT.trdUntNo, ltrdUntNo, TRD_UNT_NO_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqCntrRecT.cntrExpDat[i]= ' ';
	}
	char lcntrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqCntr.futBscInqCntrRecT.cntrExpDat", lcntrExpDat);
	memcpy(vfutBscInqCntrRecT.cntrExpDat, lcntrExpDat, DRIV_DATE_LEN);

	for(i=0;i<PRIM_EXCH_ID_COD_LEN;i++) {
		vfutBscInqCntrRecT.primExchIdCod[i]= ' ';
	}
	char lprimExchIdCod[PRIM_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqCntr.futBscInqCntrRecT.primExchIdCod", lprimExchIdCod);
	memcpy(vfutBscInqCntrRecT.primExchIdCod, lprimExchIdCod, PRIM_EXCH_ID_COD_LEN);

	char lcntrStsCod[1] = {""};
	getStrProperty("InqCntr.futBscInqCntrRecT.cntrStsCod", lcntrStsCod);
	vfutBscInqCntrRecT.cntrStsCod = lcntrStsCod[0];

	char lcntrAsynInd[1] = {""};
	getStrProperty("InqCntr.futBscInqCntrRecT.cntrAsynInd", lcntrAsynInd);
	vfutBscInqCntrRecT.cntrAsynInd = lcntrAsynInd[0];
	return vfutBscInqCntrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqCntrResponseT getFutBscInqCntrResponseT(char* testCaseNum , const char *root) {
	futBscInqCntrResponseT vfutBscInqCntrResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqCntrResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCntr.futBscInqCntrResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqCntrResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqCntrResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqCntr.futBscInqCntrResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqCntrResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqCntrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqCntrRequestT getOptBscInqCntrRequestT(char* testCaseNum , const char *root) {
	optBscInqCntrRequestT voptBscInqCntrRequestT;
	int i;

	voptBscInqCntrRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqCntrRequestT");
	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqCntrRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCntr.optBscInqCntrRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqCntrRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqCntrRecT getOptBscInqCntrRecT(char* testCaseNum , const char *root) {
	optBscInqCntrRecT voptBscInqCntrRecT;
	int i;

	voptBscInqCntrRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqCntrRecT");
	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		voptBscInqCntrRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqCntr.optBscInqCntrRecT.currTypCod", lcurrTypCod);
	memcpy(voptBscInqCntrRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char ldcmlShft[1] = {""};
	getStrProperty("InqCntr.optBscInqCntrRecT.dcmlShft", ldcmlShft);
	voptBscInqCntrRecT.dcmlShft = ldcmlShft[0];

	for(i=0;i<TRD_UNT_NO_LEN;i++) {
		voptBscInqCntrRecT.trdUntNo[i]= ' ';
	}
	char ltrdUntNo[TRD_UNT_NO_LEN] = {""};
	getStrProperty("InqCntr.optBscInqCntrRecT.trdUntNo", ltrdUntNo);
	memcpy(voptBscInqCntrRecT.trdUntNo, ltrdUntNo, TRD_UNT_NO_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqCntrRecT.cntrExpDat[i]= ' ';
	}
	char lcntrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqCntr.optBscInqCntrRecT.cntrExpDat", lcntrExpDat);
	memcpy(voptBscInqCntrRecT.cntrExpDat, lcntrExpDat, DRIV_DATE_LEN);

	char lcntrGenNo[1] = {""};
	getStrProperty("InqCntr.optBscInqCntrRecT.cntrGenNo", lcntrGenNo);
	voptBscInqCntrRecT.cntrGenNo = lcntrGenNo[0];

	for(i=0;i<PRIM_EXCH_ID_COD_LEN;i++) {
		voptBscInqCntrRecT.primExchIdCod[i]= ' ';
	}
	char lprimExchIdCod[PRIM_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqCntr.optBscInqCntrRecT.primExchIdCod", lprimExchIdCod);
	memcpy(voptBscInqCntrRecT.primExchIdCod, lprimExchIdCod, PRIM_EXCH_ID_COD_LEN);

	char lcntrStsCod[1] = {""};
	getStrProperty("InqCntr.optBscInqCntrRecT.cntrStsCod", lcntrStsCod);
	voptBscInqCntrRecT.cntrStsCod = lcntrStsCod[0];

	char lcntrAsynInd[1] = {""};
	getStrProperty("InqCntr.optBscInqCntrRecT.cntrAsynInd", lcntrAsynInd);
	voptBscInqCntrRecT.cntrAsynInd = lcntrAsynInd[0];

	char llepoInd[1] = {""};
	getStrProperty("InqCntr.optBscInqCntrRecT.lepoInd", llepoInd);
	voptBscInqCntrRecT.lepoInd = llepoInd[0];
	return voptBscInqCntrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqCntrResponseT getOptBscInqCntrResponseT(char* testCaseNum , const char *root) {
	optBscInqCntrResponseT voptBscInqCntrResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqCntrResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCntr.optBscInqCntrResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqCntrResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqCntrResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqCntr.optBscInqCntrResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqCntrResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqCntrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqCntrRequestT* getFutInqCntrRequestT(char* testCaseNum) {
	vfutInqCntrRequestT = (futInqCntrRequestT*)malloc(sizeof(futInqCntrRequestT));
	int i;

	vfutInqCntrRequestT->header = getDataHeaderT(testCaseNum, "futInqCntrRequestT");
	vfutInqCntrRequestT->basic = getFutBscInqCntrRequestT(testCaseNum, "futInqCntrRequestT");
	return vfutInqCntrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqCntrResponseT* getFutInqCntrResponseT(char* testCaseNum) {
	vfutInqCntrResponseT = (futInqCntrResponseT*)malloc(sizeof(futInqCntrResponseT));
	int i;

	vfutInqCntrResponseT->header = getDataHeaderT(testCaseNum, "futInqCntrResponseT");
	vfutInqCntrResponseT->basic = getFutBscInqCntrResponseT(testCaseNum, "futInqCntrResponseT");
	return vfutInqCntrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqCntrRequestT* getOptInqCntrRequestT(char* testCaseNum) {
	voptInqCntrRequestT = (optInqCntrRequestT*)malloc(sizeof(optInqCntrRequestT));
	int i;

	voptInqCntrRequestT->header = getDataHeaderT(testCaseNum, "optInqCntrRequestT");
	voptInqCntrRequestT->basic = getOptBscInqCntrRequestT(testCaseNum, "optInqCntrRequestT");
	return voptInqCntrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqCntrResponseT* getOptInqCntrResponseT(char* testCaseNum) {
	voptInqCntrResponseT = (optInqCntrResponseT*)malloc(sizeof(optInqCntrResponseT));
	int i;

	voptInqCntrResponseT->header = getDataHeaderT(testCaseNum, "optInqCntrResponseT");
	voptInqCntrResponseT->basic = getOptBscInqCntrResponseT(testCaseNum, "optInqCntrResponseT");
	return voptInqCntrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqCntrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqCntrRequestT));
	futInqCntrRequestT *vfutInqCntrRequestT = getFutInqCntrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqCntrRequestT), (jbyte*) vfutInqCntrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqCntrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqCntrResponseT));
	futInqCntrResponseT *vfutInqCntrResponseT = getFutInqCntrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqCntrResponseT), (jbyte*) vfutInqCntrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqCntrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqCntrRequestT));
	optInqCntrRequestT *voptInqCntrRequestT = getOptInqCntrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqCntrRequestT), (jbyte*) voptInqCntrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqCntrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqCntrResponseT));
	optInqCntrResponseT *voptInqCntrResponseT = getOptInqCntrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqCntrResponseT), (jbyte*) voptInqCntrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqCntrRequestT(futBscInqCntrRequestT actual, futBscInqCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqCntrRecT(futBscInqCntrRecT actual, futBscInqCntrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.dcmlShft!= expected.dcmlShft) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrRecT, dcmlShftnot matching. Actual %d but Expected %d", actual.dcmlShft, expected.dcmlShft);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdUntNo, expected.trdUntNo, TRD_UNT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrRecT, trdUntNo not matching. Actual %s but Expected %s", actual.trdUntNo, expected.trdUntNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpDat, expected.cntrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrRecT, cntrExpDat not matching. Actual %s but Expected %s", actual.cntrExpDat, expected.cntrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.primExchIdCod, expected.primExchIdCod, PRIM_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrRecT, primExchIdCod not matching. Actual %s but Expected %s", actual.primExchIdCod, expected.primExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrStsCod!= expected.cntrStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrRecT, cntrStsCodnot matching. Actual %d but Expected %d", actual.cntrStsCod, expected.cntrStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrAsynInd!= expected.cntrAsynInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrRecT, cntrAsynIndnot matching. Actual %d but Expected %d", actual.cntrAsynInd, expected.cntrAsynInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqCntrResponseT(futBscInqCntrResponseT actual, futBscInqCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqCntrResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_CNTR_REC_MAX;i++) {
		compareFutBscInqCntrRecT (actual.futBscInqCntrRec[i],expected.futBscInqCntrRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqCntrRequestT(optBscInqCntrRequestT actual, optBscInqCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqCntrRecT(optBscInqCntrRecT actual, optBscInqCntrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.dcmlShft!= expected.dcmlShft) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrRecT, dcmlShftnot matching. Actual %d but Expected %d", actual.dcmlShft, expected.dcmlShft);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdUntNo, expected.trdUntNo, TRD_UNT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrRecT, trdUntNo not matching. Actual %s but Expected %s", actual.trdUntNo, expected.trdUntNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpDat, expected.cntrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrRecT, cntrExpDat not matching. Actual %s but Expected %s", actual.cntrExpDat, expected.cntrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrGenNo!= expected.cntrGenNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrRecT, cntrGenNonot matching. Actual %d but Expected %d", actual.cntrGenNo, expected.cntrGenNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.primExchIdCod, expected.primExchIdCod, PRIM_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrRecT, primExchIdCod not matching. Actual %s but Expected %s", actual.primExchIdCod, expected.primExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrStsCod!= expected.cntrStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrRecT, cntrStsCodnot matching. Actual %d but Expected %d", actual.cntrStsCod, expected.cntrStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrAsynInd!= expected.cntrAsynInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrRecT, cntrAsynIndnot matching. Actual %d but Expected %d", actual.cntrAsynInd, expected.cntrAsynInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.lepoInd!= expected.lepoInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrRecT, lepoIndnot matching. Actual %d but Expected %d", actual.lepoInd, expected.lepoInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqCntrResponseT(optBscInqCntrResponseT actual, optBscInqCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqCntrResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_CNTR_REC_MAX;i++) {
		compareOptBscInqCntrRecT (actual.optBscInqCntrRec[i],expected.optBscInqCntrRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqCntrRequestT(futInqCntrRequestT actual, futInqCntrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqCntrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqCntrResponseT(futInqCntrResponseT actual, futInqCntrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqCntrResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqCntrRequestT(optInqCntrRequestT actual, optInqCntrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqCntrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqCntrResponseT(optInqCntrResponseT actual, optInqCntrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqCntrResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqCntrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqCntrRequestT *actualData = (futInqCntrRequestT *)msgStruct;
	futInqCntrRequestT* expectedData = getFutInqCntrRequestT(testCaseNum);
	compareFutInqCntrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqCntrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqCntrResponseT *actualData = (futInqCntrResponseT *)msgStruct;
	futInqCntrResponseT* expectedData = getFutInqCntrResponseT(testCaseNum);
	compareFutInqCntrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqCntrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqCntrRequestT *actualData = (optInqCntrRequestT *)msgStruct;
	optInqCntrRequestT* expectedData = getOptInqCntrRequestT(testCaseNum);
	compareOptInqCntrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqCntrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqCntrResponseT *actualData = (optInqCntrResponseT *)msgStruct;
	optInqCntrResponseT* expectedData = getOptInqCntrResponseT(testCaseNum);
	compareOptInqCntrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
