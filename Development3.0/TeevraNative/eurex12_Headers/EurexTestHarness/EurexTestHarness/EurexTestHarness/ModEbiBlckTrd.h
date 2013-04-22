#include <ModEbiBlckTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModEbiTrdGrpT getBscModEbiTrdGrpT(char* testCaseNum , const char *root) {
	bscModEbiTrdGrpT vbscModEbiTrdGrpT;
	int i;

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscModEbiTrdGrpT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.bscModEbiTrdGrpT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscModEbiTrdGrpT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<CTPY_SUB_GRP_COD_LEN;i++) {
		vbscModEbiTrdGrpT.ctpySubGrpCod[i]= ' ';
	}
	char lctpySubGrpCod[CTPY_SUB_GRP_COD_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.bscModEbiTrdGrpT.ctpySubGrpCod", lctpySubGrpCod);
	memcpy(vbscModEbiTrdGrpT.ctpySubGrpCod, lctpySubGrpCod, CTPY_SUB_GRP_COD_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("ModEbiBlckTrd.bscModEbiTrdGrpT.buyCod", lbuyCod);
	vbscModEbiTrdGrpT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModEbiTrdGrpT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.bscModEbiTrdGrpT.trdXQty", ltrdXQty);
	memcpy(vbscModEbiTrdGrpT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscModEbiTrdGrpT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.bscModEbiTrdGrpT.trnIdNo", ltrnIdNo);
	memcpy(vbscModEbiTrdGrpT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lebiTrdApprInd[1] = {""};
	getStrProperty("ModEbiBlckTrd.bscModEbiTrdGrpT.ebiTrdApprInd", lebiTrdApprInd);
	vbscModEbiTrdGrpT.ebiTrdApprInd = lebiTrdApprInd[0];
	return vbscModEbiTrdGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEbiTrdRequestT getFutBscModEbiTrdRequestT(char* testCaseNum , const char *root) {
	futBscModEbiTrdRequestT vfutBscModEbiTrdRequestT;
	int i;

	vfutBscModEbiTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscModEbiTrdRequestT");
	vfutBscModEbiTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscModEbiTrdRequestT");
	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vfutBscModEbiTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.futBscModEbiTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vfutBscModEbiTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<EBI_BROK_ID_COD_LEN;i++) {
		vfutBscModEbiTrdRequestT.ebiBrokIdCod[i]= ' ';
	}
	char lebiBrokIdCod[EBI_BROK_ID_COD_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.futBscModEbiTrdRequestT.ebiBrokIdCod", lebiBrokIdCod);
	memcpy(vfutBscModEbiTrdRequestT.ebiBrokIdCod, lebiBrokIdCod, EBI_BROK_ID_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscModEbiTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.futBscModEbiTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscModEbiTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEbiTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.futBscModEbiTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEbiTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscModEbiTrdRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.futBscModEbiTrdRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscModEbiTrdRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscModEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futModEbiTrdRequestT getFutModEbiTrdRequestT(char* testCaseNum , const char *root) {
	futModEbiTrdRequestT vfutModEbiTrdRequestT;
	int i;

	vfutModEbiTrdRequestT.header = getDataHeaderT(testCaseNum, "futModEbiTrdRequestT");
	vfutModEbiTrdRequestT.basic = getFutBscModEbiTrdRequestT(testCaseNum, "futModEbiTrdRequestT");	return vfutModEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModEbiTrdRecT getBscModEbiTrdRecT(char* testCaseNum , const char *root) {
	bscModEbiTrdRecT vbscModEbiTrdRecT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		vbscModEbiTrdRecT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.bscModEbiTrdRecT.rtnCod", lrtnCod);
	memcpy(vbscModEbiTrdRecT.rtnCod, lrtnCod, RTN_COD_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscModEbiTrdRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.bscModEbiTrdRecT.trnIdNo", ltrnIdNo);
	memcpy(vbscModEbiTrdRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lebiTrdApprInd[1] = {""};
	getStrProperty("ModEbiBlckTrd.bscModEbiTrdRecT.ebiTrdApprInd", lebiTrdApprInd);
	vbscModEbiTrdRecT.ebiTrdApprInd = lebiTrdApprInd[0];
	return vbscModEbiTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModEbiTrdResponseT getFutBscModEbiTrdResponseT(char* testCaseNum , const char *root) {
	futBscModEbiTrdResponseT vfutBscModEbiTrdResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModEbiTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.futBscModEbiTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModEbiTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscModEbiTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.futBscModEbiTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscModEbiTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscModEbiTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futModEbiTrdResponseT getFutModEbiTrdResponseT(char* testCaseNum , const char *root) {
	futModEbiTrdResponseT vfutModEbiTrdResponseT;
	int i;

	vfutModEbiTrdResponseT.header = getDataHeaderT(testCaseNum, "futModEbiTrdResponseT");
	vfutModEbiTrdResponseT.basic = getFutBscModEbiTrdResponseT(testCaseNum, "futModEbiTrdResponseT");	return vfutModEbiTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModEbiTrdRequestT getOptBscModEbiTrdRequestT(char* testCaseNum , const char *root) {
	optBscModEbiTrdRequestT voptBscModEbiTrdRequestT;
	int i;

	voptBscModEbiTrdRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscModEbiTrdRequestT");
	voptBscModEbiTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscModEbiTrdRequestT");
	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		voptBscModEbiTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.optBscModEbiTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(voptBscModEbiTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<EBI_BROK_ID_COD_LEN;i++) {
		voptBscModEbiTrdRequestT.ebiBrokIdCod[i]= ' ';
	}
	char lebiBrokIdCod[EBI_BROK_ID_COD_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.optBscModEbiTrdRequestT.ebiBrokIdCod", lebiBrokIdCod);
	memcpy(voptBscModEbiTrdRequestT.ebiBrokIdCod, lebiBrokIdCod, EBI_BROK_ID_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscModEbiTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.optBscModEbiTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscModEbiTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscModEbiTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.optBscModEbiTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscModEbiTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscModEbiTrdRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.optBscModEbiTrdRequestT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscModEbiTrdRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscModEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optModEbiTrdRequestT getOptModEbiTrdRequestT(char* testCaseNum , const char *root) {
	optModEbiTrdRequestT voptModEbiTrdRequestT;
	int i;

	voptModEbiTrdRequestT.header = getDataHeaderT(testCaseNum, "optModEbiTrdRequestT");
	voptModEbiTrdRequestT.basic = getOptBscModEbiTrdRequestT(testCaseNum, "optModEbiTrdRequestT");	return voptModEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModEbiTrdResponseT getOptBscModEbiTrdResponseT(char* testCaseNum , const char *root) {
	optBscModEbiTrdResponseT voptBscModEbiTrdResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscModEbiTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.optBscModEbiTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscModEbiTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscModEbiTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModEbiBlckTrd.optBscModEbiTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscModEbiTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscModEbiTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optModEbiTrdResponseT getOptModEbiTrdResponseT(char* testCaseNum , const char *root) {
	optModEbiTrdResponseT voptModEbiTrdResponseT;
	int i;

	voptModEbiTrdResponseT.header = getDataHeaderT(testCaseNum, "optModEbiTrdResponseT");
	voptModEbiTrdResponseT.basic = getOptBscModEbiTrdResponseT(testCaseNum, "optModEbiTrdResponseT");	return voptModEbiTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModEbiTrdGrpT(bscModEbiTrdGrpT actual, bscModEbiTrdGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdGrpT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ctpySubGrpCod, expected.ctpySubGrpCod, CTPY_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdGrpT, ctpySubGrpCod not matching. Actual %s but Expected %s", actual.ctpySubGrpCod, expected.ctpySubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdGrpT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdGrpT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdGrpT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ebiTrdApprInd!= expected.ebiTrdApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdGrpT, ebiTrdApprIndnot matching. Actual %d but Expected %d", actual.ebiTrdApprInd, expected.ebiTrdApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEbiTrdRequestT(futBscModEbiTrdRequestT actual, futBscModEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ebiBrokIdCod, expected.ebiBrokIdCod, EBI_BROK_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiTrdRequestT, ebiBrokIdCod not matching. Actual %s but Expected %s", actual.ebiBrokIdCod, expected.ebiBrokIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiTrdRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_EBI_TRD_GRP_MAX;i++) {
		compareBscModEbiTrdGrpT (actual.bscModEbiTrdGrp[i],expected.bscModEbiTrdGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutModEbiTrdRequestT(futModEbiTrdRequestT actual, futModEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareFutBscModEbiTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModEbiTrdRecT(bscModEbiTrdRecT actual, bscModEbiTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdRecT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ebiTrdApprInd!= expected.ebiTrdApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiTrdRecT, ebiTrdApprIndnot matching. Actual %d but Expected %d", actual.ebiTrdApprInd, expected.ebiTrdApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModEbiTrdResponseT(futBscModEbiTrdResponseT actual, futBscModEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModEbiTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_EBI_TRD_REC_MAX;i++) {
		compareBscModEbiTrdRecT (actual.bscModEbiTrdRec[i],expected.bscModEbiTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutModEbiTrdResponseT(futModEbiTrdResponseT actual, futModEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareFutBscModEbiTrdResponseT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModEbiTrdRequestT(optBscModEbiTrdRequestT actual, optBscModEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModEbiTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ebiBrokIdCod, expected.ebiBrokIdCod, EBI_BROK_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModEbiTrdRequestT, ebiBrokIdCod not matching. Actual %s but Expected %s", actual.ebiBrokIdCod, expected.ebiBrokIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModEbiTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModEbiTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModEbiTrdRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_EBI_TRD_GRP_MAX;i++) {
		compareBscModEbiTrdGrpT (actual.bscModEbiTrdGrp[i],expected.bscModEbiTrdGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptModEbiTrdRequestT(optModEbiTrdRequestT actual, optModEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareOptBscModEbiTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModEbiTrdResponseT(optBscModEbiTrdResponseT actual, optBscModEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModEbiTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModEbiTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_EBI_TRD_REC_MAX;i++) {
		compareBscModEbiTrdRecT (actual.bscModEbiTrdRec[i],expected.bscModEbiTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptModEbiTrdResponseT(optModEbiTrdResponseT actual, optModEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareOptBscModEbiTrdResponseT (actual.basic,expected.basic, logMsg);
}

