#include <InqBlkTrd.hxx>
#define BUFFER_SIZE 1000

futInqBlkTrdRequestT *vfutInqBlkTrdRequestT;
futInqBlkTrdResponseT *vfutInqBlkTrdResponseT;
optInqBlkTrdRequestT *voptInqBlkTrdRequestT;
optInqBlkTrdResponseT *voptInqBlkTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqBlkTrdRequestT getFutBscInqBlkTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqBlkTrdRequestT vfutBscInqBlkTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqBlkTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqBlkTrd.futBscInqBlkTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqBlkTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscInqBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqBlkTrdRequestT");	return vfutBscInqBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqBlkTrdRecT getFutBscInqBlkTrdRecT(char* testCaseNum , const char *root) {
	futBscInqBlkTrdRecT vfutBscInqBlkTrdRecT;
	int i;

	char lopnClsCod[1] = {""};
	getStrProperty("InqBlkTrd.futBscInqBlkTrdRecT.opnClsCod", lopnClsCod);
	vfutBscInqBlkTrdRecT.opnClsCod = lopnClsCod[0];

	char lblkTrdStsCod[1] = {""};
	getStrProperty("InqBlkTrd.futBscInqBlkTrdRecT.blkTrdStsCod", lblkTrdStsCod);
	vfutBscInqBlkTrdRecT.blkTrdStsCod = lblkTrdStsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscInqBlkTrdRecT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("InqBlkTrd.futBscInqBlkTrdRecT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscInqBlkTrdRecT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	vfutBscInqBlkTrdRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqBlkTrdRecT");	return vfutBscInqBlkTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqBlkTrdResponseT getFutBscInqBlkTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqBlkTrdResponseT vfutBscInqBlkTrdResponseT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqBlkTrd.futBscInqBlkTrdResponseT.buyCod", lbuyCod);
	vfutBscInqBlkTrdResponseT.buyCod = lbuyCod[0];

	vfutBscInqBlkTrdResponseT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqBlkTrdResponseT");
	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscInqBlkTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("InqBlkTrd.futBscInqBlkTrdResponseT.trdNo", ltrdNo);
	memcpy(vfutBscInqBlkTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqBlkTrdResponseT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqBlkTrd.futBscInqBlkTrdResponseT.trdXQty", ltrdXQty);
	memcpy(vfutBscInqBlkTrdResponseT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqBlkTrdResponseT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqBlkTrd.futBscInqBlkTrdResponseT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscInqBlkTrdResponseT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscInqBlkTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqBlkTrd.futBscInqBlkTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vfutBscInqBlkTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqBlkTrd.futBscInqBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqBlkTrdRecT getFutExtInqBlkTrdRecT(char* testCaseNum , const char *root) {
	futExtInqBlkTrdRecT vfutExtInqBlkTrdRecT;
	int i;

	vfutExtInqBlkTrdRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtInqBlkTrdRecT");
	vfutExtInqBlkTrdRecT.txtGrp = getTxtGrpT(testCaseNum, "futExtInqBlkTrdRecT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutExtInqBlkTrdRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqBlkTrd.futExtInqBlkTrdRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutExtInqBlkTrdRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vfutExtInqBlkTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqBlkTrdResponseT getFutExtInqBlkTrdResponseT(char* testCaseNum , const char *root) {
	futExtInqBlkTrdResponseT vfutExtInqBlkTrdResponseT;
	int i;
	return vfutExtInqBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqBlkTrdRequestT getOptBscInqBlkTrdRequestT(char* testCaseNum , const char *root) {
	optBscInqBlkTrdRequestT voptBscInqBlkTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscInqBlkTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqBlkTrd.optBscInqBlkTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscInqBlkTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscInqBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqBlkTrdRequestT");	return voptBscInqBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqBlkTrdRecT getOptBscInqBlkTrdRecT(char* testCaseNum , const char *root) {
	optBscInqBlkTrdRecT voptBscInqBlkTrdRecT;
	int i;

	char lopnClsCod[1] = {""};
	getStrProperty("InqBlkTrd.optBscInqBlkTrdRecT.opnClsCod", lopnClsCod);
	voptBscInqBlkTrdRecT.opnClsCod = lopnClsCod[0];

	char lblkTrdStsCod[1] = {""};
	getStrProperty("InqBlkTrd.optBscInqBlkTrdRecT.blkTrdStsCod", lblkTrdStsCod);
	voptBscInqBlkTrdRecT.blkTrdStsCod = lblkTrdStsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		voptBscInqBlkTrdRecT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("InqBlkTrd.optBscInqBlkTrdRecT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(voptBscInqBlkTrdRecT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	voptBscInqBlkTrdRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqBlkTrdRecT");	return voptBscInqBlkTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqBlkTrdResponseT getOptBscInqBlkTrdResponseT(char* testCaseNum , const char *root) {
	optBscInqBlkTrdResponseT voptBscInqBlkTrdResponseT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqBlkTrd.optBscInqBlkTrdResponseT.buyCod", lbuyCod);
	voptBscInqBlkTrdResponseT.buyCod = lbuyCod[0];

	voptBscInqBlkTrdResponseT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqBlkTrdResponseT");
	for(i=0;i<TRD_NO_LEN;i++) {
		voptBscInqBlkTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("InqBlkTrd.optBscInqBlkTrdResponseT.trdNo", ltrdNo);
	memcpy(voptBscInqBlkTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqBlkTrdResponseT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqBlkTrd.optBscInqBlkTrdResponseT.trdXQty", ltrdXQty);
	memcpy(voptBscInqBlkTrdResponseT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqBlkTrdResponseT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqBlkTrd.optBscInqBlkTrdResponseT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscInqBlkTrdResponseT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		voptBscInqBlkTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqBlkTrd.optBscInqBlkTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(voptBscInqBlkTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<UNDR_ID_LEN;i++) {
		voptBscInqBlkTrdResponseT.undrId[i]= ' ';
	}
	char lundrId[UNDR_ID_LEN] = {""};
	getStrProperty("InqBlkTrd.optBscInqBlkTrdResponseT.undrId", lundrId);
	memcpy(voptBscInqBlkTrdResponseT.undrId, lundrId, UNDR_ID_LEN);

	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		voptBscInqBlkTrdResponseT.exchIdCod[i]= ' ';
	}
	char lexchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqBlkTrd.optBscInqBlkTrdResponseT.exchIdCod", lexchIdCod);
	memcpy(voptBscInqBlkTrdResponseT.exchIdCod, lexchIdCod, DRIV_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscInqBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqBlkTrd.optBscInqBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscInqBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscInqBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqBlkTrdRecT getOptExtInqBlkTrdRecT(char* testCaseNum , const char *root) {
	optExtInqBlkTrdRecT voptExtInqBlkTrdRecT;
	int i;

	voptExtInqBlkTrdRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtInqBlkTrdRecT");
	voptExtInqBlkTrdRecT.txtGrp = getTxtGrpT(testCaseNum, "optExtInqBlkTrdRecT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptExtInqBlkTrdRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqBlkTrd.optExtInqBlkTrdRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptExtInqBlkTrdRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return voptExtInqBlkTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqBlkTrdResponseT getOptExtInqBlkTrdResponseT(char* testCaseNum , const char *root) {
	optExtInqBlkTrdResponseT voptExtInqBlkTrdResponseT;
	int i;
	return voptExtInqBlkTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqBlkTrdRequestT* getFutInqBlkTrdRequestT(char* testCaseNum) {
	vfutInqBlkTrdRequestT = (futInqBlkTrdRequestT*)malloc(sizeof(futInqBlkTrdRequestT));
	int i;

	vfutInqBlkTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqBlkTrdRequestT");
	vfutInqBlkTrdRequestT->basic = getFutBscInqBlkTrdRequestT(testCaseNum, "futInqBlkTrdRequestT");
	return vfutInqBlkTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqBlkTrdResponseT* getFutInqBlkTrdResponseT(char* testCaseNum) {
	vfutInqBlkTrdResponseT = (futInqBlkTrdResponseT*)malloc(sizeof(futInqBlkTrdResponseT));
	int i;

	vfutInqBlkTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqBlkTrdResponseT");
	vfutInqBlkTrdResponseT->basic = getFutBscInqBlkTrdResponseT(testCaseNum, "futInqBlkTrdResponseT");
	vfutInqBlkTrdResponseT->extension = getFutExtInqBlkTrdResponseT(testCaseNum, "futInqBlkTrdResponseT");
	return vfutInqBlkTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqBlkTrdRequestT* getOptInqBlkTrdRequestT(char* testCaseNum) {
	voptInqBlkTrdRequestT = (optInqBlkTrdRequestT*)malloc(sizeof(optInqBlkTrdRequestT));
	int i;

	voptInqBlkTrdRequestT->header = getDataHeaderT(testCaseNum, "optInqBlkTrdRequestT");
	voptInqBlkTrdRequestT->basic = getOptBscInqBlkTrdRequestT(testCaseNum, "optInqBlkTrdRequestT");
	return voptInqBlkTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqBlkTrdResponseT* getOptInqBlkTrdResponseT(char* testCaseNum) {
	voptInqBlkTrdResponseT = (optInqBlkTrdResponseT*)malloc(sizeof(optInqBlkTrdResponseT));
	int i;

	voptInqBlkTrdResponseT->header = getDataHeaderT(testCaseNum, "optInqBlkTrdResponseT");
	voptInqBlkTrdResponseT->basic = getOptBscInqBlkTrdResponseT(testCaseNum, "optInqBlkTrdResponseT");
	voptInqBlkTrdResponseT->extension = getOptExtInqBlkTrdResponseT(testCaseNum, "optInqBlkTrdResponseT");
	return voptInqBlkTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqBlkTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqBlkTrdRequestT));
	futInqBlkTrdRequestT *vfutInqBlkTrdRequestT = getFutInqBlkTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqBlkTrdRequestT), (jbyte*) vfutInqBlkTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqBlkTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqBlkTrdResponseT));
	futInqBlkTrdResponseT *vfutInqBlkTrdResponseT = getFutInqBlkTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqBlkTrdResponseT), (jbyte*) vfutInqBlkTrdResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqBlkTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqBlkTrdRequestT));
	optInqBlkTrdRequestT *voptInqBlkTrdRequestT = getOptInqBlkTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqBlkTrdRequestT), (jbyte*) voptInqBlkTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqBlkTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqBlkTrdResponseT));
	optInqBlkTrdResponseT *voptInqBlkTrdResponseT = getOptInqBlkTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqBlkTrdResponseT), (jbyte*) voptInqBlkTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqBlkTrdRequestT(futBscInqBlkTrdRequestT actual, futBscInqBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqBlkTrdRecT(futBscInqBlkTrdRecT actual, futBscInqBlkTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkTrdRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.blkTrdStsCod!= expected.blkTrdStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkTrdRecT, blkTrdStsCodnot matching. Actual %d but Expected %d", actual.blkTrdStsCod, expected.blkTrdStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkTrdRecT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqBlkTrdResponseT(futBscInqBlkTrdResponseT actual, futBscInqBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkTrdResponseT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkTrdResponseT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkTrdResponseT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_BLK_TRD_REC_MAX;i++) {
		compareFutBscInqBlkTrdRecT (actual.futBscInqBlkTrdRec[i],expected.futBscInqBlkTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqBlkTrdRecT(futExtInqBlkTrdRecT actual, futExtInqBlkTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqBlkTrdRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqBlkTrdResponseT(futExtInqBlkTrdResponseT actual, futExtInqBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_BLK_TRD_REC_MAX;i++) {
		compareFutExtInqBlkTrdRecT (actual.futExtInqBlkTrdRec[i],expected.futExtInqBlkTrdRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqBlkTrdRequestT(optBscInqBlkTrdRequestT actual, optBscInqBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqBlkTrdRecT(optBscInqBlkTrdRecT actual, optBscInqBlkTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkTrdRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.blkTrdStsCod!= expected.blkTrdStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkTrdRecT, blkTrdStsCodnot matching. Actual %d but Expected %d", actual.blkTrdStsCod, expected.blkTrdStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkTrdRecT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqBlkTrdResponseT(optBscInqBlkTrdResponseT actual, optBscInqBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkTrdResponseT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkTrdResponseT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkTrdResponseT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrId, expected.undrId, UNDR_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkTrdResponseT, undrId not matching. Actual %s but Expected %s", actual.undrId, expected.undrId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchIdCod, expected.exchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkTrdResponseT, exchIdCod not matching. Actual %s but Expected %s", actual.exchIdCod, expected.exchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_BLK_TRD_REC_MAX;i++) {
		compareOptBscInqBlkTrdRecT (actual.optBscInqBlkTrdRec[i],expected.optBscInqBlkTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqBlkTrdRecT(optExtInqBlkTrdRecT actual, optExtInqBlkTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqBlkTrdRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqBlkTrdResponseT(optExtInqBlkTrdResponseT actual, optExtInqBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_BLK_TRD_REC_MAX;i++) {
		compareOptExtInqBlkTrdRecT (actual.optExtInqBlkTrdRec[i],expected.optExtInqBlkTrdRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqBlkTrdRequestT(futInqBlkTrdRequestT actual, futInqBlkTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqBlkTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqBlkTrdResponseT(futInqBlkTrdResponseT actual, futInqBlkTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqBlkTrdResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqBlkTrdResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqBlkTrdRequestT(optInqBlkTrdRequestT actual, optInqBlkTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqBlkTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqBlkTrdResponseT(optInqBlkTrdResponseT actual, optInqBlkTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqBlkTrdResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqBlkTrdResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqBlkTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqBlkTrdRequestT *actualData = (futInqBlkTrdRequestT *)msgStruct;
	futInqBlkTrdRequestT* expectedData = getFutInqBlkTrdRequestT(testCaseNum);
	compareFutInqBlkTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqBlkTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqBlkTrdResponseT *actualData = (futInqBlkTrdResponseT *)msgStruct;
	futInqBlkTrdResponseT* expectedData = getFutInqBlkTrdResponseT(testCaseNum);
	compareFutInqBlkTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqBlkTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqBlkTrdRequestT *actualData = (optInqBlkTrdRequestT *)msgStruct;
	optInqBlkTrdRequestT* expectedData = getOptInqBlkTrdRequestT(testCaseNum);
	compareOptInqBlkTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqBlkTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqBlkTrdResponseT *actualData = (optInqBlkTrdResponseT *)msgStruct;
	optInqBlkTrdResponseT* expectedData = getOptInqBlkTrdResponseT(testCaseNum);
	compareOptInqBlkTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
