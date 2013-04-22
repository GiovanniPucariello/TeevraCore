#include <InqVolTrd.hxx>
#define BUFFER_SIZE 1000

futInqVolTrdRequestT *vfutInqVolTrdRequestT;
futInqVolTrdResponseT *vfutInqVolTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqVolTrdRequestT getFutBscInqVolTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqVolTrdRequestT vfutBscInqVolTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqVolTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqVolTrd.futBscInqVolTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqVolTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscInqVolTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqVolTrdRequestT");	return vfutBscInqVolTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqVolTrdRecT getFutBscInqVolTrdRecT(char* testCaseNum , const char *root) {
	futBscInqVolTrdRecT vfutBscInqVolTrdRecT;
	int i;

	char lopnClsCod[1] = {""};
	getStrProperty("InqVolTrd.futBscInqVolTrdRecT.opnClsCod", lopnClsCod);
	vfutBscInqVolTrdRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vfutBscInqVolTrdRecT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("InqVolTrd.futBscInqVolTrdRecT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vfutBscInqVolTrdRecT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	vfutBscInqVolTrdRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqVolTrdRecT");	return vfutBscInqVolTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optCntrIdVolaGrpT getOptCntrIdVolaGrpT(char* testCaseNum , const char *root) {
	optCntrIdVolaGrpT voptCntrIdVolaGrpT;
	int i;

	for(i=0;i<DRIV_PROD_ID2_LEN;i++) {
		voptCntrIdVolaGrpT.prodId2[i]= ' ';
	}
	char lprodId2[DRIV_PROD_ID2_LEN] = {""};
	getStrProperty("InqVolTrd.optCntrIdVolaGrpT.prodId2", lprodId2);
	memcpy(voptCntrIdVolaGrpT.prodId2, lprodId2, DRIV_PROD_ID2_LEN);

	char lcntrClasCod2[1] = {""};
	getStrProperty("InqVolTrd.optCntrIdVolaGrpT.cntrClasCod2", lcntrClasCod2);
	voptCntrIdVolaGrpT.cntrClasCod2 = lcntrClasCod2[0];

	for(i=0;i<CNTR_EXP_MTH_DAT2_LEN;i++) {
		voptCntrIdVolaGrpT.cntrExpMthDat2[i]= ' ';
	}
	char lcntrExpMthDat2[CNTR_EXP_MTH_DAT2_LEN] = {""};
	getStrProperty("InqVolTrd.optCntrIdVolaGrpT.cntrExpMthDat2", lcntrExpMthDat2);
	memcpy(voptCntrIdVolaGrpT.cntrExpMthDat2, lcntrExpMthDat2, CNTR_EXP_MTH_DAT2_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT2_LEN;i++) {
		voptCntrIdVolaGrpT.cntrExpYrDat2[i]= ' ';
	}
	char lcntrExpYrDat2[CNTR_EXP_YR_DAT2_LEN] = {""};
	getStrProperty("InqVolTrd.optCntrIdVolaGrpT.cntrExpYrDat2", lcntrExpYrDat2);
	memcpy(voptCntrIdVolaGrpT.cntrExpYrDat2, lcntrExpYrDat2, CNTR_EXP_YR_DAT2_LEN);

	for(i=0;i<CNTR_EXER_PRC2_LEN;i++) {
		voptCntrIdVolaGrpT.cntrExerPrc2[i]= ' ';
	}
	char lcntrExerPrc2[CNTR_EXER_PRC2_LEN] = {""};
	getStrProperty("InqVolTrd.optCntrIdVolaGrpT.cntrExerPrc2", lcntrExerPrc2);
	memcpy(voptCntrIdVolaGrpT.cntrExerPrc2, lcntrExerPrc2, CNTR_EXER_PRC2_LEN);

	char lcntrVersNo2[1] = {""};
	getStrProperty("InqVolTrd.optCntrIdVolaGrpT.cntrVersNo2", lcntrVersNo2);
	voptCntrIdVolaGrpT.cntrVersNo2 = lcntrVersNo2[0];
	return voptCntrIdVolaGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqVolTrdResponseT getFutBscInqVolTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqVolTrdResponseT vfutBscInqVolTrdResponseT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqVolTrd.futBscInqVolTrdResponseT.buyCod", lbuyCod);
	vfutBscInqVolTrdResponseT.buyCod = lbuyCod[0];

	vfutBscInqVolTrdResponseT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqVolTrdResponseT");
	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscInqVolTrdResponseT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("InqVolTrd.futBscInqVolTrdResponseT.trdNo", ltrdNo);
	memcpy(vfutBscInqVolTrdResponseT.trdNo, ltrdNo, TRD_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqVolTrdResponseT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqVolTrd.futBscInqVolTrdResponseT.trdXQty", ltrdXQty);
	memcpy(vfutBscInqVolTrdResponseT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqVolTrdResponseT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqVolTrd.futBscInqVolTrdResponseT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscInqVolTrdResponseT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqVolTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqVolTrd.futBscInqVolTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqVolTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	vfutBscInqVolTrdResponseT.optCntrIdVolaGrp = getOptCntrIdVolaGrpT(testCaseNum, "futBscInqVolTrdResponseT");	return vfutBscInqVolTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqVolTrdRecT getFutExtInqVolTrdRecT(char* testCaseNum , const char *root) {
	futExtInqVolTrdRecT vfutExtInqVolTrdRecT;
	int i;

	vfutExtInqVolTrdRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtInqVolTrdRecT");
	vfutExtInqVolTrdRecT.txtGrp = getTxtGrpT(testCaseNum, "futExtInqVolTrdRecT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtInqVolTrdRecT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqVolTrd.futExtInqVolTrdRecT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtInqVolTrdRecT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);
	return vfutExtInqVolTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqVolTrdResponseT getFutExtInqVolTrdResponseT(char* testCaseNum , const char *root) {
	futExtInqVolTrdResponseT vfutExtInqVolTrdResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutExtInqVolTrdResponseT.trnIdNoOpt[i]= ' ';
	}
	char ltrnIdNoOpt[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqVolTrd.futExtInqVolTrdResponseT.trnIdNoOpt", ltrnIdNoOpt);
	memcpy(vfutExtInqVolTrdResponseT.trnIdNoOpt, ltrnIdNoOpt, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtInqVolTrdResponseT.trdQtyOpt[i]= ' ';
	}
	char ltrdQtyOpt[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqVolTrd.futExtInqVolTrdResponseT.trdQtyOpt", ltrdQtyOpt);
	memcpy(vfutExtInqVolTrdResponseT.trdQtyOpt, ltrdQtyOpt, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtInqVolTrdResponseT.trdMtchPrcOpt[i]= ' ';
	}
	char ltrdMtchPrcOpt[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqVolTrd.futExtInqVolTrdResponseT.trdMtchPrcOpt", ltrdMtchPrcOpt);
	memcpy(vfutExtInqVolTrdResponseT.trdMtchPrcOpt, ltrdMtchPrcOpt, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtInqVolTrdResponseT.usedQtyOpt[i]= ' ';
	}
	char lusedQtyOpt[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqVolTrd.futExtInqVolTrdResponseT.usedQtyOpt", lusedQtyOpt);
	memcpy(vfutExtInqVolTrdResponseT.usedQtyOpt, lusedQtyOpt, DRIV_VOLUME_LEN);
	return vfutExtInqVolTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqVolTrdRequestT* getFutInqVolTrdRequestT(char* testCaseNum) {
	vfutInqVolTrdRequestT = (futInqVolTrdRequestT*)malloc(sizeof(futInqVolTrdRequestT));
	int i;

	vfutInqVolTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqVolTrdRequestT");
	vfutInqVolTrdRequestT->basic = getFutBscInqVolTrdRequestT(testCaseNum, "futInqVolTrdRequestT");
	return vfutInqVolTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqVolTrdResponseT* getFutInqVolTrdResponseT(char* testCaseNum) {
	vfutInqVolTrdResponseT = (futInqVolTrdResponseT*)malloc(sizeof(futInqVolTrdResponseT));
	int i;

	vfutInqVolTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqVolTrdResponseT");
	vfutInqVolTrdResponseT->basic = getFutBscInqVolTrdResponseT(testCaseNum, "futInqVolTrdResponseT");
	vfutInqVolTrdResponseT->extension = getFutExtInqVolTrdResponseT(testCaseNum, "futInqVolTrdResponseT");
	return vfutInqVolTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqVolTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqVolTrdRequestT));
	futInqVolTrdRequestT *vfutInqVolTrdRequestT = getFutInqVolTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqVolTrdRequestT), (jbyte*) vfutInqVolTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqVolTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqVolTrdResponseT));
	futInqVolTrdResponseT *vfutInqVolTrdResponseT = getFutInqVolTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqVolTrdResponseT), (jbyte*) vfutInqVolTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqVolTrdRequestT(futBscInqVolTrdRequestT actual, futBscInqVolTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqVolTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqVolTrdRecT(futBscInqVolTrdRecT actual, futBscInqVolTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqVolTrdRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqVolTrdRecT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptCntrIdVolaGrpT(optCntrIdVolaGrpT actual, optCntrIdVolaGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId2, expected.prodId2, DRIV_PROD_ID2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrIdVolaGrpT, prodId2 not matching. Actual %s but Expected %s", actual.prodId2, expected.prodId2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod2!= expected.cntrClasCod2) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrIdVolaGrpT, cntrClasCod2not matching. Actual %d but Expected %d", actual.cntrClasCod2, expected.cntrClasCod2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat2, expected.cntrExpMthDat2, CNTR_EXP_MTH_DAT2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrIdVolaGrpT, cntrExpMthDat2 not matching. Actual %s but Expected %s", actual.cntrExpMthDat2, expected.cntrExpMthDat2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat2, expected.cntrExpYrDat2, CNTR_EXP_YR_DAT2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrIdVolaGrpT, cntrExpYrDat2 not matching. Actual %s but Expected %s", actual.cntrExpYrDat2, expected.cntrExpYrDat2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExerPrc2, expected.cntrExerPrc2, CNTR_EXER_PRC2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrIdVolaGrpT, cntrExerPrc2 not matching. Actual %s but Expected %s", actual.cntrExerPrc2, expected.cntrExerPrc2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo2!= expected.cntrVersNo2) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optCntrIdVolaGrpT, cntrVersNo2not matching. Actual %d but Expected %d", actual.cntrVersNo2, expected.cntrVersNo2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqVolTrdResponseT(futBscInqVolTrdResponseT actual, futBscInqVolTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqVolTrdResponseT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqVolTrdResponseT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqVolTrdResponseT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqVolTrdResponseT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqVolTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_VOL_TRD_REC_MAX;i++) {
		compareFutBscInqVolTrdRecT (actual.futBscInqVolTrdRec[i],expected.futBscInqVolTrdRec[i], logMsg);
	}
	compareOptCntrIdVolaGrpT (actual.optCntrIdVolaGrp,expected.optCntrIdVolaGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqVolTrdRecT(futExtInqVolTrdRecT actual, futExtInqVolTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqVolTrdRecT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqVolTrdResponseT(futExtInqVolTrdResponseT actual, futExtInqVolTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_VOL_TRD_REC_MAX;i++) {
		compareFutExtInqVolTrdRecT (actual.futExtInqVolTrdRec[i],expected.futExtInqVolTrdRec[i], logMsg);
	}
	if ( memcmp(actual.trnIdNoOpt, expected.trnIdNoOpt, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqVolTrdResponseT, trnIdNoOpt not matching. Actual %s but Expected %s", actual.trnIdNoOpt, expected.trnIdNoOpt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdQtyOpt, expected.trdQtyOpt, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqVolTrdResponseT, trdQtyOpt not matching. Actual %s but Expected %s", actual.trdQtyOpt, expected.trdQtyOpt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrcOpt, expected.trdMtchPrcOpt, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqVolTrdResponseT, trdMtchPrcOpt not matching. Actual %s but Expected %s", actual.trdMtchPrcOpt, expected.trdMtchPrcOpt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.usedQtyOpt, expected.usedQtyOpt, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqVolTrdResponseT, usedQtyOpt not matching. Actual %s but Expected %s", actual.usedQtyOpt, expected.usedQtyOpt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqVolTrdRequestT(futInqVolTrdRequestT actual, futInqVolTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqVolTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqVolTrdResponseT(futInqVolTrdResponseT actual, futInqVolTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqVolTrdResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqVolTrdResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqVolTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqVolTrdRequestT *actualData = (futInqVolTrdRequestT *)msgStruct;
	futInqVolTrdRequestT* expectedData = getFutInqVolTrdRequestT(testCaseNum);
	compareFutInqVolTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqVolTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqVolTrdResponseT *actualData = (futInqVolTrdResponseT *)msgStruct;
	futInqVolTrdResponseT* expectedData = getFutInqVolTrdResponseT(testCaseNum);
	compareFutInqVolTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
