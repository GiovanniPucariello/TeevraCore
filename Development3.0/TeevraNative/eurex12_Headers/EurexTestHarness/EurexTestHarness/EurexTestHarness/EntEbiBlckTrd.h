#include <EntEbiBlckTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntEbiTrdGrpT getBscEntEbiTrdGrpT(char* testCaseNum , const char *root) {
	bscEntEbiTrdGrpT vbscEntEbiTrdGrpT;
	int i;

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscEntEbiTrdGrpT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.bscEntEbiTrdGrpT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscEntEbiTrdGrpT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<CTPY_SUB_GRP_COD_LEN;i++) {
		vbscEntEbiTrdGrpT.ctpySubGrpCod[i]= ' ';
	}
	char lctpySubGrpCod[CTPY_SUB_GRP_COD_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.bscEntEbiTrdGrpT.ctpySubGrpCod", lctpySubGrpCod);
	memcpy(vbscEntEbiTrdGrpT.ctpySubGrpCod, lctpySubGrpCod, CTPY_SUB_GRP_COD_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("EntEbiBlckTrd.bscEntEbiTrdGrpT.buyCod", lbuyCod);
	vbscEntEbiTrdGrpT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntEbiTrdGrpT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.bscEntEbiTrdGrpT.trdXQty", ltrdXQty);
	memcpy(vbscEntEbiTrdGrpT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);
	return vbscEntEbiTrdGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEbiTrdRequestT getFutBscEntEbiTrdRequestT(char* testCaseNum , const char *root) {
	futBscEntEbiTrdRequestT vfutBscEntEbiTrdRequestT;
	int i;

	vfutBscEntEbiTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntEbiTrdRequestT");
	vfutBscEntEbiTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntEbiTrdRequestT");
	for(i=0;i<EBI_BROK_ID_COD_LEN;i++) {
		vfutBscEntEbiTrdRequestT.ebiBrokIdCod[i]= ' ';
	}
	char lebiBrokIdCod[EBI_BROK_ID_COD_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.futBscEntEbiTrdRequestT.ebiBrokIdCod", lebiBrokIdCod);
	memcpy(vfutBscEntEbiTrdRequestT.ebiBrokIdCod, lebiBrokIdCod, EBI_BROK_ID_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntEbiTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.futBscEntEbiTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscEntEbiTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscEntEbiTrdRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.futBscEntEbiTrdRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscEntEbiTrdRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscEntEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futEntEbiTrdRequestT getFutEntEbiTrdRequestT(char* testCaseNum , const char *root) {
	futEntEbiTrdRequestT vfutEntEbiTrdRequestT;
	int i;

	vfutEntEbiTrdRequestT.header = getDataHeaderT(testCaseNum, "futEntEbiTrdRequestT");
	vfutEntEbiTrdRequestT.basic = getFutBscEntEbiTrdRequestT(testCaseNum, "futEntEbiTrdRequestT");	return vfutEntEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntEbiTrdRecT getBscEntEbiTrdRecT(char* testCaseNum , const char *root) {
	bscEntEbiTrdRecT vbscEntEbiTrdRecT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		vbscEntEbiTrdRecT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.bscEntEbiTrdRecT.rtnCod", lrtnCod);
	memcpy(vbscEntEbiTrdRecT.rtnCod, lrtnCod, RTN_COD_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscEntEbiTrdRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.bscEntEbiTrdRecT.trnIdNo", ltrnIdNo);
	memcpy(vbscEntEbiTrdRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return vbscEntEbiTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntEbiTrdResponseT getFutBscEntEbiTrdResponseT(char* testCaseNum , const char *root) {
	futBscEntEbiTrdResponseT vfutBscEntEbiTrdResponseT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscEntEbiTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.futBscEntEbiTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscEntEbiTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscEntEbiTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.futBscEntEbiTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vfutBscEntEbiTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntEbiTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.futBscEntEbiTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntEbiTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscEntEbiTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.futBscEntEbiTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscEntEbiTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscEntEbiTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futEntEbiTrdResponseT getFutEntEbiTrdResponseT(char* testCaseNum , const char *root) {
	futEntEbiTrdResponseT vfutEntEbiTrdResponseT;
	int i;

	vfutEntEbiTrdResponseT.header = getDataHeaderT(testCaseNum, "futEntEbiTrdResponseT");
	vfutEntEbiTrdResponseT.basic = getFutBscEntEbiTrdResponseT(testCaseNum, "futEntEbiTrdResponseT");	return vfutEntEbiTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntEbiTrdRequestT getOptBscEntEbiTrdRequestT(char* testCaseNum , const char *root) {
	optBscEntEbiTrdRequestT voptBscEntEbiTrdRequestT;
	int i;

	voptBscEntEbiTrdRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntEbiTrdRequestT");
	voptBscEntEbiTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscEntEbiTrdRequestT");
	for(i=0;i<EBI_BROK_ID_COD_LEN;i++) {
		voptBscEntEbiTrdRequestT.ebiBrokIdCod[i]= ' ';
	}
	char lebiBrokIdCod[EBI_BROK_ID_COD_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.optBscEntEbiTrdRequestT.ebiBrokIdCod", lebiBrokIdCod);
	memcpy(voptBscEntEbiTrdRequestT.ebiBrokIdCod, lebiBrokIdCod, EBI_BROK_ID_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscEntEbiTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.optBscEntEbiTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscEntEbiTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscEntEbiTrdRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.optBscEntEbiTrdRequestT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscEntEbiTrdRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscEntEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optEntEbiTrdRequestT getOptEntEbiTrdRequestT(char* testCaseNum , const char *root) {
	optEntEbiTrdRequestT voptEntEbiTrdRequestT;
	int i;

	voptEntEbiTrdRequestT.header = getDataHeaderT(testCaseNum, "optEntEbiTrdRequestT");
	voptEntEbiTrdRequestT.basic = getOptBscEntEbiTrdRequestT(testCaseNum, "optEntEbiTrdRequestT");	return voptEntEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntEbiTrdResponseT getOptBscEntEbiTrdResponseT(char* testCaseNum , const char *root) {
	optBscEntEbiTrdResponseT voptBscEntEbiTrdResponseT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		voptBscEntEbiTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.optBscEntEbiTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(voptBscEntEbiTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		voptBscEntEbiTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.optBscEntEbiTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(voptBscEntEbiTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscEntEbiTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.optBscEntEbiTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscEntEbiTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscEntEbiTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntEbiBlckTrd.optBscEntEbiTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscEntEbiTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscEntEbiTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optEntEbiTrdResponseT getOptEntEbiTrdResponseT(char* testCaseNum , const char *root) {
	optEntEbiTrdResponseT voptEntEbiTrdResponseT;
	int i;

	voptEntEbiTrdResponseT.header = getDataHeaderT(testCaseNum, "optEntEbiTrdResponseT");
	voptEntEbiTrdResponseT.basic = getOptBscEntEbiTrdResponseT(testCaseNum, "optEntEbiTrdResponseT");	return voptEntEbiTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntEbiTrdGrpT(bscEntEbiTrdGrpT actual, bscEntEbiTrdGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiTrdGrpT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ctpySubGrpCod, expected.ctpySubGrpCod, CTPY_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiTrdGrpT, ctpySubGrpCod not matching. Actual %s but Expected %s", actual.ctpySubGrpCod, expected.ctpySubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiTrdGrpT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiTrdGrpT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEbiTrdRequestT(futBscEntEbiTrdRequestT actual, futBscEntEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ebiBrokIdCod, expected.ebiBrokIdCod, EBI_BROK_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiTrdRequestT, ebiBrokIdCod not matching. Actual %s but Expected %s", actual.ebiBrokIdCod, expected.ebiBrokIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiTrdRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_EBI_TRD_GRP_MAX;i++) {
		compareBscEntEbiTrdGrpT (actual.bscEntEbiTrdGrp[i],expected.bscEntEbiTrdGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutEntEbiTrdRequestT(futEntEbiTrdRequestT actual, futEntEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareFutBscEntEbiTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntEbiTrdRecT(bscEntEbiTrdRecT actual, bscEntEbiTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiTrdRecT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiTrdRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntEbiTrdResponseT(futBscEntEbiTrdResponseT actual, futBscEntEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntEbiTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_EBI_TRD_REC_MAX;i++) {
		compareBscEntEbiTrdRecT (actual.bscEntEbiTrdRec[i],expected.bscEntEbiTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutEntEbiTrdResponseT(futEntEbiTrdResponseT actual, futEntEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareFutBscEntEbiTrdResponseT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntEbiTrdRequestT(optBscEntEbiTrdRequestT actual, optBscEntEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ebiBrokIdCod, expected.ebiBrokIdCod, EBI_BROK_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntEbiTrdRequestT, ebiBrokIdCod not matching. Actual %s but Expected %s", actual.ebiBrokIdCod, expected.ebiBrokIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntEbiTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntEbiTrdRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_EBI_TRD_GRP_MAX;i++) {
		compareBscEntEbiTrdGrpT (actual.bscEntEbiTrdGrp[i],expected.bscEntEbiTrdGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptEntEbiTrdRequestT(optEntEbiTrdRequestT actual, optEntEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareOptBscEntEbiTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntEbiTrdResponseT(optBscEntEbiTrdResponseT actual, optBscEntEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntEbiTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntEbiTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntEbiTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntEbiTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_EBI_TRD_REC_MAX;i++) {
		compareBscEntEbiTrdRecT (actual.bscEntEbiTrdRec[i],expected.bscEntEbiTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptEntEbiTrdResponseT(optEntEbiTrdResponseT actual, optEntEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareOptBscEntEbiTrdResponseT (actual.basic,expected.basic, logMsg);
}

