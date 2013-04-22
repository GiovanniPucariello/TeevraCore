#include <InqDLegInsMkt.hxx>
#define BUFFER_SIZE 1000

futInqDLegInsMktRequestT *vfutInqDLegInsMktRequestT;
futInqDLegInsMktResponseT *vfutInqDLegInsMktResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqDLegInsMktGrpT getFutBscInqDLegInsMktGrpT(char* testCaseNum , const char *root) {
	futBscInqDLegInsMktGrpT vfutBscInqDLegInsMktGrpT;
	int i;

	vfutBscInqDLegInsMktGrpT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqDLegInsMktGrpT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscInqDLegInsMktGrpT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktGrpT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscInqDLegInsMktGrpT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscInqDLegInsMktGrpT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscInqDLegInsMktGrpT");	return vfutBscInqDLegInsMktGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqDLegInsMktRequestT getFutBscInqDLegInsMktRequestT(char* testCaseNum , const char *root) {
	futBscInqDLegInsMktRequestT vfutBscInqDLegInsMktRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqDLegInsMktRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqDLegInsMktRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqDLegInsMktRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqDLegInsMktRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqDLegInsMktRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqDLegInsMktRecT getFutBscInqDLegInsMktRecT(char* testCaseNum , const char *root) {
	futBscInqDLegInsMktRecT vfutBscInqDLegInsMktRecT;
	int i;

	vfutBscInqDLegInsMktRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqDLegInsMktRecT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscInqDLegInsMktRecT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRecT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscInqDLegInsMktRecT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscInqDLegInsMktRecT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscInqDLegInsMktRecT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqDLegInsMktRecT.dblLegBstBidPrc[i]= ' ';
	}
	char ldblLegBstBidPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRecT.dblLegBstBidPrc", ldblLegBstBidPrc);
	memcpy(vfutBscInqDLegInsMktRecT.dblLegBstBidPrc, ldblLegBstBidPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqDLegInsMktRecT.dblLegBstBidQty[i]= ' ';
	}
	char ldblLegBstBidQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRecT.dblLegBstBidQty", ldblLegBstBidQty);
	memcpy(vfutBscInqDLegInsMktRecT.dblLegBstBidQty, ldblLegBstBidQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqDLegInsMktRecT.dblLegBstAskPrc[i]= ' ';
	}
	char ldblLegBstAskPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRecT.dblLegBstAskPrc", ldblLegBstAskPrc);
	memcpy(vfutBscInqDLegInsMktRecT.dblLegBstAskPrc, ldblLegBstAskPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqDLegInsMktRecT.dblLegBstAskQty[i]= ' ';
	}
	char ldblLegBstAskQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRecT.dblLegBstAskQty", ldblLegBstAskQty);
	memcpy(vfutBscInqDLegInsMktRecT.dblLegBstAskQty, ldblLegBstAskQty, DRIV_QUANTITY_LEN);

	for(i=0;i<PRCS_STS_VAL_COD_LEN;i++) {
		vfutBscInqDLegInsMktRecT.prcsStsValCod[i]= ' ';
	}
	char lprcsStsValCod[PRCS_STS_VAL_COD_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRecT.prcsStsValCod", lprcsStsValCod);
	memcpy(vfutBscInqDLegInsMktRecT.prcsStsValCod, lprcsStsValCod, PRCS_STS_VAL_COD_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqDLegInsMktRecT.totTrdQty[i]= ' ';
	}
	char ltotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRecT.totTrdQty", ltotTrdQty);
	memcpy(vfutBscInqDLegInsMktRecT.totTrdQty, ltotTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqDLegInsMktRecT.dlyHghPrc[i]= ' ';
	}
	char ldlyHghPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRecT.dlyHghPrc", ldlyHghPrc);
	memcpy(vfutBscInqDLegInsMktRecT.dlyHghPrc, ldlyHghPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqDLegInsMktRecT.dlyLowPrc[i]= ' ';
	}
	char ldlyLowPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRecT.dlyLowPrc", ldlyLowPrc);
	memcpy(vfutBscInqDLegInsMktRecT.dlyLowPrc, ldlyLowPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqDLegInsMktRecT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRecT.lstTrdPrc", llstTrdPrc);
	memcpy(vfutBscInqDLegInsMktRecT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqDLegInsMktRecT.lstTrdQty[i]= ' ';
	}
	char llstTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRecT.lstTrdQty", llstTrdQty);
	memcpy(vfutBscInqDLegInsMktRecT.lstTrdQty, llstTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqDLegInsMktRecT.trdTim[i]= ' ';
	}
	char ltrdTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktRecT.trdTim", ltrdTim);
	memcpy(vfutBscInqDLegInsMktRecT.trdTim, ltrdTim, DRIV_TIME_LEN);
	return vfutBscInqDLegInsMktRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqDLegInsMktResponseT getFutBscInqDLegInsMktResponseT(char* testCaseNum , const char *root) {
	futBscInqDLegInsMktResponseT vfutBscInqDLegInsMktResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqDLegInsMktResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqDLegInsMktResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqDLegInsMktResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqDLegInsMkt.futBscInqDLegInsMktResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqDLegInsMktResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqDLegInsMktResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqDLegInsMktRequestT* getFutInqDLegInsMktRequestT(char* testCaseNum) {
	vfutInqDLegInsMktRequestT = (futInqDLegInsMktRequestT*)malloc(sizeof(futInqDLegInsMktRequestT));
	int i;

	vfutInqDLegInsMktRequestT->header = getDataHeaderT(testCaseNum, "futInqDLegInsMktRequestT");
	vfutInqDLegInsMktRequestT->basic = getFutBscInqDLegInsMktRequestT(testCaseNum, "futInqDLegInsMktRequestT");
	return vfutInqDLegInsMktRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqDLegInsMktResponseT* getFutInqDLegInsMktResponseT(char* testCaseNum) {
	vfutInqDLegInsMktResponseT = (futInqDLegInsMktResponseT*)malloc(sizeof(futInqDLegInsMktResponseT));
	int i;

	vfutInqDLegInsMktResponseT->header = getDataHeaderT(testCaseNum, "futInqDLegInsMktResponseT");
	vfutInqDLegInsMktResponseT->basic = getFutBscInqDLegInsMktResponseT(testCaseNum, "futInqDLegInsMktResponseT");
	return vfutInqDLegInsMktResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqDLegInsMktRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqDLegInsMktRequestT));
	futInqDLegInsMktRequestT *vfutInqDLegInsMktRequestT = getFutInqDLegInsMktRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqDLegInsMktRequestT), (jbyte*) vfutInqDLegInsMktRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqDLegInsMktResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqDLegInsMktResponseT));
	futInqDLegInsMktResponseT *vfutInqDLegInsMktResponseT = getFutInqDLegInsMktResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqDLegInsMktResponseT), (jbyte*) vfutInqDLegInsMktResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqDLegInsMktGrpT(futBscInqDLegInsMktGrpT actual, futBscInqDLegInsMktGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktGrpT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqDLegInsMktRequestT(futBscInqDLegInsMktRequestT actual, futBscInqDLegInsMktRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_D_LEG_INS_MKT_GRP_MAX;i++) {
		compareFutBscInqDLegInsMktGrpT (actual.futBscInqDLegInsMktGrp[i],expected.futBscInqDLegInsMktGrp[i], logMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqDLegInsMktRecT(futBscInqDLegInsMktRecT actual, futBscInqDLegInsMktRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRecT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	if ( memcmp(actual.dblLegBstBidPrc, expected.dblLegBstBidPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRecT, dblLegBstBidPrc not matching. Actual %s but Expected %s", actual.dblLegBstBidPrc, expected.dblLegBstBidPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dblLegBstBidQty, expected.dblLegBstBidQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRecT, dblLegBstBidQty not matching. Actual %s but Expected %s", actual.dblLegBstBidQty, expected.dblLegBstBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dblLegBstAskPrc, expected.dblLegBstAskPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRecT, dblLegBstAskPrc not matching. Actual %s but Expected %s", actual.dblLegBstAskPrc, expected.dblLegBstAskPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dblLegBstAskQty, expected.dblLegBstAskQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRecT, dblLegBstAskQty not matching. Actual %s but Expected %s", actual.dblLegBstAskQty, expected.dblLegBstAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prcsStsValCod, expected.prcsStsValCod, PRCS_STS_VAL_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRecT, prcsStsValCod not matching. Actual %s but Expected %s", actual.prcsStsValCod, expected.prcsStsValCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totTrdQty, expected.totTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRecT, totTrdQty not matching. Actual %s but Expected %s", actual.totTrdQty, expected.totTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyHghPrc, expected.dlyHghPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRecT, dlyHghPrc not matching. Actual %s but Expected %s", actual.dlyHghPrc, expected.dlyHghPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyLowPrc, expected.dlyLowPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRecT, dlyLowPrc not matching. Actual %s but Expected %s", actual.dlyLowPrc, expected.dlyLowPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRecT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdQty, expected.lstTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRecT, lstTrdQty not matching. Actual %s but Expected %s", actual.lstTrdQty, expected.lstTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdTim, expected.trdTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktRecT, trdTim not matching. Actual %s but Expected %s", actual.trdTim, expected.trdTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqDLegInsMktResponseT(futBscInqDLegInsMktResponseT actual, futBscInqDLegInsMktResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqDLegInsMktResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_D_LEG_INS_MKT_REC_MAX;i++) {
		compareFutBscInqDLegInsMktRecT (actual.futBscInqDLegInsMktRec[i],expected.futBscInqDLegInsMktRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqDLegInsMktRequestT(futInqDLegInsMktRequestT actual, futInqDLegInsMktRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqDLegInsMktRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqDLegInsMktResponseT(futInqDLegInsMktResponseT actual, futInqDLegInsMktResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqDLegInsMktResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqDLegInsMktRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqDLegInsMktRequestT *actualData = (futInqDLegInsMktRequestT *)msgStruct;
	futInqDLegInsMktRequestT* expectedData = getFutInqDLegInsMktRequestT(testCaseNum);
	compareFutInqDLegInsMktRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqDLegInsMktResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqDLegInsMktResponseT *actualData = (futInqDLegInsMktResponseT *)msgStruct;
	futInqDLegInsMktResponseT* expectedData = getFutInqDLegInsMktResponseT(testCaseNum);
	compareFutInqDLegInsMktResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
