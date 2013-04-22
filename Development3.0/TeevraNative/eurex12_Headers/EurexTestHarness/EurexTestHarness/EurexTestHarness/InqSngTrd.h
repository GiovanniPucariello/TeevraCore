#include <InqSngTrd.hxx>
#define BUFFER_SIZE 1000

optInqSngTrdRequestT *voptInqSngTrdRequestT;
optInqSngTrdResponseT *voptInqSngTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqSngTrdRequestT getOptBscInqSngTrdRequestT(char* testCaseNum , const char *root) {
	optBscInqSngTrdRequestT voptBscInqSngTrdRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscInqSngTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqSngTrd.optBscInqSngTrdRequestT.prodId", lprodId);
	memcpy(voptBscInqSngTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscInqSngTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqSngTrd.optBscInqSngTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscInqSngTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscInqSngTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqSngTrdRequestT");	return voptBscInqSngTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqSngTrdRecT getOptBscInqSngTrdRecT(char* testCaseNum , const char *root) {
	optBscInqSngTrdRecT voptBscInqSngTrdRecT;
	int i;

	char lopnClsCod[1] = {""};
	getStrProperty("InqSngTrd.optBscInqSngTrdRecT.opnClsCod", lopnClsCod);
	voptBscInqSngTrdRecT.opnClsCod = lopnClsCod[0];

	voptBscInqSngTrdRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqSngTrdRecT");	return voptBscInqSngTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqSngTrdResponseT getOptBscInqSngTrdResponseT(char* testCaseNum , const char *root) {
	optBscInqSngTrdResponseT voptBscInqSngTrdResponseT;
	int i;

	voptBscInqSngTrdResponseT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqSngTrdResponseT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqSngTrdResponseT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqSngTrd.optBscInqSngTrdResponseT.trdXQty", ltrdXQty);
	memcpy(voptBscInqSngTrdResponseT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqSngTrdResponseT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSngTrd.optBscInqSngTrdResponseT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscInqSngTrdResponseT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqSngTrd.optBscInqSngTrdResponseT.trdTyp", ltrdTyp);
	voptBscInqSngTrdResponseT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscInqSngTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqSngTrd.optBscInqSngTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscInqSngTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscInqSngTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqSngTrdRecT getOptExtInqSngTrdRecT(char* testCaseNum , const char *root) {
	optExtInqSngTrdRecT voptExtInqSngTrdRecT;
	int i;

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		voptExtInqSngTrdRecT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("InqSngTrd.optExtInqSngTrdRecT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(voptExtInqSngTrdRecT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);
	return voptExtInqSngTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqSngTrdResponseT getOptExtInqSngTrdResponseT(char* testCaseNum , const char *root) {
	optExtInqSngTrdResponseT voptExtInqSngTrdResponseT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqSngTrdResponseT.dlyHghPrc[i]= ' ';
	}
	char ldlyHghPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSngTrd.optExtInqSngTrdResponseT.dlyHghPrc", ldlyHghPrc);
	memcpy(voptExtInqSngTrdResponseT.dlyHghPrc, ldlyHghPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqSngTrdResponseT.dlyLowPrc[i]= ' ';
	}
	char ldlyLowPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSngTrd.optExtInqSngTrdResponseT.dlyLowPrc", ldlyLowPrc);
	memcpy(voptExtInqSngTrdResponseT.dlyLowPrc, ldlyLowPrc, DRIV_PRICE_LEN);

	voptExtInqSngTrdResponseT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtInqSngTrdResponseT");
	voptExtInqSngTrdResponseT.txtGrp = getTxtGrpT(testCaseNum, "optExtInqSngTrdResponseT");
	for(i=0;i<DRIV_PROD_ID_CORR_FUT_LEN;i++) {
		voptExtInqSngTrdResponseT.prodIdCorrFut[i]= ' ';
	}
	char lprodIdCorrFut[DRIV_PROD_ID_CORR_FUT_LEN] = {""};
	getStrProperty("InqSngTrd.optExtInqSngTrdResponseT.prodIdCorrFut", lprodIdCorrFut);
	memcpy(voptExtInqSngTrdResponseT.prodIdCorrFut, lprodIdCorrFut, DRIV_PROD_ID_CORR_FUT_LEN);
	return voptExtInqSngTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqSngTrdRequestT* getOptInqSngTrdRequestT(char* testCaseNum) {
	voptInqSngTrdRequestT = (optInqSngTrdRequestT*)malloc(sizeof(optInqSngTrdRequestT));
	int i;

	voptInqSngTrdRequestT->header = getDataHeaderT(testCaseNum, "optInqSngTrdRequestT");
	voptInqSngTrdRequestT->basic = getOptBscInqSngTrdRequestT(testCaseNum, "optInqSngTrdRequestT");
	return voptInqSngTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqSngTrdResponseT* getOptInqSngTrdResponseT(char* testCaseNum) {
	voptInqSngTrdResponseT = (optInqSngTrdResponseT*)malloc(sizeof(optInqSngTrdResponseT));
	int i;

	voptInqSngTrdResponseT->header = getDataHeaderT(testCaseNum, "optInqSngTrdResponseT");
	voptInqSngTrdResponseT->basic = getOptBscInqSngTrdResponseT(testCaseNum, "optInqSngTrdResponseT");
	voptInqSngTrdResponseT->extension = getOptExtInqSngTrdResponseT(testCaseNum, "optInqSngTrdResponseT");
	return voptInqSngTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqSngTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqSngTrdRequestT));
	optInqSngTrdRequestT *voptInqSngTrdRequestT = getOptInqSngTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqSngTrdRequestT), (jbyte*) voptInqSngTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqSngTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqSngTrdResponseT));
	optInqSngTrdResponseT *voptInqSngTrdResponseT = getOptInqSngTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqSngTrdResponseT), (jbyte*) voptInqSngTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqSngTrdRequestT(optBscInqSngTrdRequestT actual, optBscInqSngTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSngTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSngTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqSngTrdRecT(optBscInqSngTrdRecT actual, optBscInqSngTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSngTrdRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqSngTrdResponseT(optBscInqSngTrdResponseT actual, optBscInqSngTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSngTrdResponseT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSngTrdResponseT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSngTrdResponseT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSngTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_SNG_TRD_REC_MAX;i++) {
		compareOptBscInqSngTrdRecT (actual.optBscInqSngTrdRec[i],expected.optBscInqSngTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqSngTrdRecT(optExtInqSngTrdRecT actual, optExtInqSngTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSngTrdRecT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqSngTrdResponseT(optExtInqSngTrdResponseT actual, optExtInqSngTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dlyHghPrc, expected.dlyHghPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSngTrdResponseT, dlyHghPrc not matching. Actual %s but Expected %s", actual.dlyHghPrc, expected.dlyHghPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyLowPrc, expected.dlyLowPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSngTrdResponseT, dlyLowPrc not matching. Actual %s but Expected %s", actual.dlyLowPrc, expected.dlyLowPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.prodIdCorrFut, expected.prodIdCorrFut, DRIV_PROD_ID_CORR_FUT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSngTrdResponseT, prodIdCorrFut not matching. Actual %s but Expected %s", actual.prodIdCorrFut, expected.prodIdCorrFut);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_EXT_INQ_SNG_TRD_REC_MAX;i++) {
		compareOptExtInqSngTrdRecT (actual.optExtInqSngTrdRec[i],expected.optExtInqSngTrdRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqSngTrdRequestT(optInqSngTrdRequestT actual, optInqSngTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqSngTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqSngTrdResponseT(optInqSngTrdResponseT actual, optInqSngTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqSngTrdResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqSngTrdResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqSngTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqSngTrdRequestT *actualData = (optInqSngTrdRequestT *)msgStruct;
	optInqSngTrdRequestT* expectedData = getOptInqSngTrdRequestT(testCaseNum);
	compareOptInqSngTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqSngTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqSngTrdResponseT *actualData = (optInqSngTrdResponseT *)msgStruct;
	optInqSngTrdResponseT* expectedData = getOptInqSngTrdResponseT(testCaseNum);
	compareOptInqSngTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
