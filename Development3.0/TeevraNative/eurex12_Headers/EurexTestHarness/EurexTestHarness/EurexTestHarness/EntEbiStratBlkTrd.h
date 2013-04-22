#include <EntEbiStratBlkTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntEbiStratBlkTrdReqGrpT getBscEntEbiStratBlkTrdReqGrpT(char* testCaseNum , const char *root) {
	bscEntEbiStratBlkTrdReqGrpT vbscEntEbiStratBlkTrdReqGrpT;
	int i;

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscEntEbiStratBlkTrdReqGrpT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("EntEbiStratBlkTrd.bscEntEbiStratBlkTrdReqGrpT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscEntEbiStratBlkTrdReqGrpT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<CTPY_SUB_GRP_COD_LEN;i++) {
		vbscEntEbiStratBlkTrdReqGrpT.ctpySubGrpCod[i]= ' ';
	}
	char lctpySubGrpCod[CTPY_SUB_GRP_COD_LEN] = {""};
	getStrProperty("EntEbiStratBlkTrd.bscEntEbiStratBlkTrdReqGrpT.ctpySubGrpCod", lctpySubGrpCod);
	memcpy(vbscEntEbiStratBlkTrdReqGrpT.ctpySubGrpCod, lctpySubGrpCod, CTPY_SUB_GRP_COD_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("EntEbiStratBlkTrd.bscEntEbiStratBlkTrdReqGrpT.buyCod", lbuyCod);
	vbscEntEbiStratBlkTrdReqGrpT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntEbiStratBlkTrdReqGrpT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntEbiStratBlkTrd.bscEntEbiStratBlkTrdReqGrpT.trdXQty", ltrdXQty);
	memcpy(vbscEntEbiStratBlkTrdReqGrpT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);
	return vbscEntEbiStratBlkTrdReqGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntEbiStratBlkTrdRequestT getBscEntEbiStratBlkTrdRequestT(char* testCaseNum , const char *root) {
	bscEntEbiStratBlkTrdRequestT vbscEntEbiStratBlkTrdRequestT;
	int i;

	vbscEntEbiStratBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntEbiStratBlkTrdRequestT");
	for(i=0;i<EBI_BROK_ID_COD_LEN;i++) {
		vbscEntEbiStratBlkTrdRequestT.ebiBrokIdCod[i]= ' ';
	}
	char lebiBrokIdCod[EBI_BROK_ID_COD_LEN] = {""};
	getStrProperty("EntEbiStratBlkTrd.bscEntEbiStratBlkTrdRequestT.ebiBrokIdCod", lebiBrokIdCod);
	memcpy(vbscEntEbiStratBlkTrdRequestT.ebiBrokIdCod, lebiBrokIdCod, EBI_BROK_ID_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscEntEbiStratBlkTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntEbiStratBlkTrd.bscEntEbiStratBlkTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscEntEbiStratBlkTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	vbscEntEbiStratBlkTrdRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscEntEbiStratBlkTrdRequestT");
	vbscEntEbiStratBlkTrdRequestT.stratEquLegGrp = getStratEquLegGrpT(testCaseNum, "bscEntEbiStratBlkTrdRequestT");
	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscEntEbiStratBlkTrdRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntEbiStratBlkTrd.bscEntEbiStratBlkTrdRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscEntEbiStratBlkTrdRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscEntEbiStratBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entEbiStratBlkTrdRequestT getEntEbiStratBlkTrdRequestT(char* testCaseNum , const char *root) {
	entEbiStratBlkTrdRequestT ventEbiStratBlkTrdRequestT;
	int i;

	ventEbiStratBlkTrdRequestT.header = getDataHeaderT(testCaseNum, "entEbiStratBlkTrdRequestT");
	ventEbiStratBlkTrdRequestT.basic = getBscEntEbiStratBlkTrdRequestT(testCaseNum, "entEbiStratBlkTrdRequestT");	return ventEbiStratBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntEbiStratBlkTrdRespGrpT getBscEntEbiStratBlkTrdRespGrpT(char* testCaseNum , const char *root) {
	bscEntEbiStratBlkTrdRespGrpT vbscEntEbiStratBlkTrdRespGrpT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		vbscEntEbiStratBlkTrdRespGrpT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("EntEbiStratBlkTrd.bscEntEbiStratBlkTrdRespGrpT.rtnCod", lrtnCod);
	memcpy(vbscEntEbiStratBlkTrdRespGrpT.rtnCod, lrtnCod, RTN_COD_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscEntEbiStratBlkTrdRespGrpT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntEbiStratBlkTrd.bscEntEbiStratBlkTrdRespGrpT.trnIdNo", ltrnIdNo);
	memcpy(vbscEntEbiStratBlkTrdRespGrpT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return vbscEntEbiStratBlkTrdRespGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntEbiStratBlkTrdResponseT getBscEntEbiStratBlkTrdResponseT(char* testCaseNum , const char *root) {
	bscEntEbiStratBlkTrdResponseT vbscEntEbiStratBlkTrdResponseT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vbscEntEbiStratBlkTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("EntEbiStratBlkTrd.bscEntEbiStratBlkTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vbscEntEbiStratBlkTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntEbiStratBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntEbiStratBlkTrd.bscEntEbiStratBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntEbiStratBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscEntEbiStratBlkTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntEbiStratBlkTrd.bscEntEbiStratBlkTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscEntEbiStratBlkTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscEntEbiStratBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entEbiStratBlkTrdResponseT getEntEbiStratBlkTrdResponseT(char* testCaseNum , const char *root) {
	entEbiStratBlkTrdResponseT ventEbiStratBlkTrdResponseT;
	int i;

	ventEbiStratBlkTrdResponseT.header = getDataHeaderT(testCaseNum, "entEbiStratBlkTrdResponseT");
	ventEbiStratBlkTrdResponseT.basic = getBscEntEbiStratBlkTrdResponseT(testCaseNum, "entEbiStratBlkTrdResponseT");	return ventEbiStratBlkTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntEbiStratBlkTrdReqGrpT(bscEntEbiStratBlkTrdReqGrpT actual, bscEntEbiStratBlkTrdReqGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiStratBlkTrdReqGrpT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ctpySubGrpCod, expected.ctpySubGrpCod, CTPY_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiStratBlkTrdReqGrpT, ctpySubGrpCod not matching. Actual %s but Expected %s", actual.ctpySubGrpCod, expected.ctpySubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiStratBlkTrdReqGrpT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiStratBlkTrdReqGrpT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntEbiStratBlkTrdRequestT(bscEntEbiStratBlkTrdRequestT actual, bscEntEbiStratBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ebiBrokIdCod, expected.ebiBrokIdCod, EBI_BROK_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiStratBlkTrdRequestT, ebiBrokIdCod not matching. Actual %s but Expected %s", actual.ebiBrokIdCod, expected.ebiBrokIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiStratBlkTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareStratEquLegGrpT (actual.stratEquLegGrp,expected.stratEquLegGrp, logMsg);
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiStratBlkTrdRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_EBI_STRAT_BLK_TRD_REQ_GRP_MAX;i++) {
		compareBscEntEbiStratBlkTrdReqGrpT (actual.bscEntEbiStratBlkTrdReqGrp[i],expected.bscEntEbiStratBlkTrdReqGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntEbiStratBlkTrdRequestT(entEbiStratBlkTrdRequestT actual, entEbiStratBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntEbiStratBlkTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntEbiStratBlkTrdRespGrpT(bscEntEbiStratBlkTrdRespGrpT actual, bscEntEbiStratBlkTrdRespGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiStratBlkTrdRespGrpT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiStratBlkTrdRespGrpT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntEbiStratBlkTrdResponseT(bscEntEbiStratBlkTrdResponseT actual, bscEntEbiStratBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiStratBlkTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiStratBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntEbiStratBlkTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_ENT_EBI_STRAT_BLK_TRD_RESP_GRP_MAX;i++) {
		compareBscEntEbiStratBlkTrdRespGrpT (actual.bscEntEbiStratBlkTrdRespGrp[i],expected.bscEntEbiStratBlkTrdRespGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntEbiStratBlkTrdResponseT(entEbiStratBlkTrdResponseT actual, entEbiStratBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntEbiStratBlkTrdResponseT (actual.basic,expected.basic, logMsg);
}

