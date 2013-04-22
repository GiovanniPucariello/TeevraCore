#include <InqEbiBlckTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEbiTrdRequestT getFutBscInqEbiTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqEbiTrdRequestT vfutBscInqEbiTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscInqEbiTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.futBscInqEbiTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscInqEbiTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);
	return vfutBscInqEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futInqEbiTrdRequestT getFutInqEbiTrdRequestT(char* testCaseNum , const char *root) {
	futInqEbiTrdRequestT vfutInqEbiTrdRequestT;
	int i;

	vfutInqEbiTrdRequestT.header = getDataHeaderT(testCaseNum, "futInqEbiTrdRequestT");
	vfutInqEbiTrdRequestT.basic = getFutBscInqEbiTrdRequestT(testCaseNum, "futInqEbiTrdRequestT");	return vfutInqEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqEbiTrdRecT getBscInqEbiTrdRecT(char* testCaseNum , const char *root) {
	bscInqEbiTrdRecT vbscInqEbiTrdRecT;
	int i;

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscInqEbiTrdRecT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.bscInqEbiTrdRecT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscInqEbiTrdRecT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<CTPY_SUB_GRP_COD_LEN;i++) {
		vbscInqEbiTrdRecT.ctpySubGrpCod[i]= ' ';
	}
	char lctpySubGrpCod[CTPY_SUB_GRP_COD_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.bscInqEbiTrdRecT.ctpySubGrpCod", lctpySubGrpCod);
	memcpy(vbscInqEbiTrdRecT.ctpySubGrpCod, lctpySubGrpCod, CTPY_SUB_GRP_COD_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("InqEbiBlckTrd.bscInqEbiTrdRecT.buyCod", lbuyCod);
	vbscInqEbiTrdRecT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqEbiTrdRecT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.bscInqEbiTrdRecT.trdXQty", ltrdXQty);
	memcpy(vbscInqEbiTrdRecT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscInqEbiTrdRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.bscInqEbiTrdRecT.trnIdNo", ltrnIdNo);
	memcpy(vbscInqEbiTrdRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lebiTrdApprInd[1] = {""};
	getStrProperty("InqEbiBlckTrd.bscInqEbiTrdRecT.ebiTrdApprInd", lebiTrdApprInd);
	vbscInqEbiTrdRecT.ebiTrdApprInd = lebiTrdApprInd[0];
	return vbscInqEbiTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqEbiTrdResponseT getFutBscInqEbiTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqEbiTrdResponseT vfutBscInqEbiTrdResponseT;
	int i;

	vfutBscInqEbiTrdResponseT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqEbiTrdResponseT");
	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscInqEbiTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.futBscInqEbiTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscInqEbiTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<EBI_BROK_ID_COD_LEN;i++) {
		vfutBscInqEbiTrdResponseT.ebiBrokIdCod[i]= ' ';
	}
	char lebiBrokIdCod[EBI_BROK_ID_COD_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.futBscInqEbiTrdResponseT.ebiBrokIdCod", lebiBrokIdCod);
	memcpy(vfutBscInqEbiTrdResponseT.ebiBrokIdCod, lebiBrokIdCod, EBI_BROK_ID_COD_LEN);

	vfutBscInqEbiTrdResponseT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqEbiTrdResponseT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqEbiTrdResponseT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.futBscInqEbiTrdResponseT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscInqEbiTrdResponseT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscInqEbiTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.futBscInqEbiTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vfutBscInqEbiTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqEbiTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.futBscInqEbiTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqEbiTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqEbiTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.futBscInqEbiTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqEbiTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqEbiTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futInqEbiTrdResponseT getFutInqEbiTrdResponseT(char* testCaseNum , const char *root) {
	futInqEbiTrdResponseT vfutInqEbiTrdResponseT;
	int i;

	vfutInqEbiTrdResponseT.header = getDataHeaderT(testCaseNum, "futInqEbiTrdResponseT");
	vfutInqEbiTrdResponseT.basic = getFutBscInqEbiTrdResponseT(testCaseNum, "futInqEbiTrdResponseT");	return vfutInqEbiTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqEbiTrdRequestT getOptBscInqEbiTrdRequestT(char* testCaseNum , const char *root) {
	optBscInqEbiTrdRequestT voptBscInqEbiTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		voptBscInqEbiTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.optBscInqEbiTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(voptBscInqEbiTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);
	return voptBscInqEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optInqEbiTrdRequestT getOptInqEbiTrdRequestT(char* testCaseNum , const char *root) {
	optInqEbiTrdRequestT voptInqEbiTrdRequestT;
	int i;

	voptInqEbiTrdRequestT.header = getDataHeaderT(testCaseNum, "optInqEbiTrdRequestT");
	voptInqEbiTrdRequestT.basic = getOptBscInqEbiTrdRequestT(testCaseNum, "optInqEbiTrdRequestT");	return voptInqEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqEbiTrdResponseT getOptBscInqEbiTrdResponseT(char* testCaseNum , const char *root) {
	optBscInqEbiTrdResponseT voptBscInqEbiTrdResponseT;
	int i;

	voptBscInqEbiTrdResponseT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqEbiTrdResponseT");
	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		voptBscInqEbiTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.optBscInqEbiTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(voptBscInqEbiTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<EBI_BROK_ID_COD_LEN;i++) {
		voptBscInqEbiTrdResponseT.ebiBrokIdCod[i]= ' ';
	}
	char lebiBrokIdCod[EBI_BROK_ID_COD_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.optBscInqEbiTrdResponseT.ebiBrokIdCod", lebiBrokIdCod);
	memcpy(voptBscInqEbiTrdResponseT.ebiBrokIdCod, lebiBrokIdCod, EBI_BROK_ID_COD_LEN);

	voptBscInqEbiTrdResponseT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqEbiTrdResponseT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqEbiTrdResponseT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.optBscInqEbiTrdResponseT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscInqEbiTrdResponseT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		voptBscInqEbiTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.optBscInqEbiTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(voptBscInqEbiTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscInqEbiTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.optBscInqEbiTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscInqEbiTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqEbiTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqEbiBlckTrd.optBscInqEbiTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqEbiTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqEbiTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optInqEbiTrdResponseT getOptInqEbiTrdResponseT(char* testCaseNum , const char *root) {
	optInqEbiTrdResponseT voptInqEbiTrdResponseT;
	int i;

	voptInqEbiTrdResponseT.header = getDataHeaderT(testCaseNum, "optInqEbiTrdResponseT");
	voptInqEbiTrdResponseT.basic = getOptBscInqEbiTrdResponseT(testCaseNum, "optInqEbiTrdResponseT");	return voptInqEbiTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEbiTrdRequestT(futBscInqEbiTrdRequestT actual, futBscInqEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutInqEbiTrdRequestT(futInqEbiTrdRequestT actual, futInqEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareFutBscInqEbiTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqEbiTrdRecT(bscInqEbiTrdRecT actual, bscInqEbiTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiTrdRecT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ctpySubGrpCod, expected.ctpySubGrpCod, CTPY_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiTrdRecT, ctpySubGrpCod not matching. Actual %s but Expected %s", actual.ctpySubGrpCod, expected.ctpySubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiTrdRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiTrdRecT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiTrdRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ebiTrdApprInd!= expected.ebiTrdApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiTrdRecT, ebiTrdApprIndnot matching. Actual %d but Expected %d", actual.ebiTrdApprInd, expected.ebiTrdApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqEbiTrdResponseT(futBscInqEbiTrdResponseT actual, futBscInqEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ebiBrokIdCod, expected.ebiBrokIdCod, EBI_BROK_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiTrdResponseT, ebiBrokIdCod not matching. Actual %s but Expected %s", actual.ebiBrokIdCod, expected.ebiBrokIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiTrdResponseT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqEbiTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_EBI_TRD_REC_MAX;i++) {
		compareBscInqEbiTrdRecT (actual.bscInqEbiTrdRec[i],expected.bscInqEbiTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutInqEbiTrdResponseT(futInqEbiTrdResponseT actual, futInqEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareFutBscInqEbiTrdResponseT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqEbiTrdRequestT(optBscInqEbiTrdRequestT actual, optBscInqEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqEbiTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptInqEbiTrdRequestT(optInqEbiTrdRequestT actual, optInqEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareOptBscInqEbiTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqEbiTrdResponseT(optBscInqEbiTrdResponseT actual, optBscInqEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqEbiTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ebiBrokIdCod, expected.ebiBrokIdCod, EBI_BROK_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqEbiTrdResponseT, ebiBrokIdCod not matching. Actual %s but Expected %s", actual.ebiBrokIdCod, expected.ebiBrokIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqEbiTrdResponseT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqEbiTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqEbiTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqEbiTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_EBI_TRD_REC_MAX;i++) {
		compareBscInqEbiTrdRecT (actual.bscInqEbiTrdRec[i],expected.bscInqEbiTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptInqEbiTrdResponseT(optInqEbiTrdResponseT actual, optInqEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareOptBscInqEbiTrdResponseT (actual.basic,expected.basic, logMsg);
}

