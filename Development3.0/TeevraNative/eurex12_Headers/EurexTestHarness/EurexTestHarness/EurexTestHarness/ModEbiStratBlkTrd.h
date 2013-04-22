#include <ModEbiStratBlkTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModEbiStratBlkTrdReqGrpT getBscModEbiStratBlkTrdReqGrpT(char* testCaseNum , const char *root) {
	bscModEbiStratBlkTrdReqGrpT vbscModEbiStratBlkTrdReqGrpT;
	int i;

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscModEbiStratBlkTrdReqGrpT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdReqGrpT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscModEbiStratBlkTrdReqGrpT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<CTPY_SUB_GRP_COD_LEN;i++) {
		vbscModEbiStratBlkTrdReqGrpT.ctpySubGrpCod[i]= ' ';
	}
	char lctpySubGrpCod[CTPY_SUB_GRP_COD_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdReqGrpT.ctpySubGrpCod", lctpySubGrpCod);
	memcpy(vbscModEbiStratBlkTrdReqGrpT.ctpySubGrpCod, lctpySubGrpCod, CTPY_SUB_GRP_COD_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdReqGrpT.buyCod", lbuyCod);
	vbscModEbiStratBlkTrdReqGrpT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModEbiStratBlkTrdReqGrpT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdReqGrpT.trdXQty", ltrdXQty);
	memcpy(vbscModEbiStratBlkTrdReqGrpT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscModEbiStratBlkTrdReqGrpT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdReqGrpT.trnIdNo", ltrnIdNo);
	memcpy(vbscModEbiStratBlkTrdReqGrpT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lebiTrdApprInd[1] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdReqGrpT.ebiTrdApprInd", lebiTrdApprInd);
	vbscModEbiStratBlkTrdReqGrpT.ebiTrdApprInd = lebiTrdApprInd[0];
	return vbscModEbiStratBlkTrdReqGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModEbiStratBlkTrdRequestT getBscModEbiStratBlkTrdRequestT(char* testCaseNum , const char *root) {
	bscModEbiStratBlkTrdRequestT vbscModEbiStratBlkTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vbscModEbiStratBlkTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vbscModEbiStratBlkTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	vbscModEbiStratBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscModEbiStratBlkTrdRequestT");
	for(i=0;i<EBI_BROK_ID_COD_LEN;i++) {
		vbscModEbiStratBlkTrdRequestT.ebiBrokIdCod[i]= ' ';
	}
	char lebiBrokIdCod[EBI_BROK_ID_COD_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdRequestT.ebiBrokIdCod", lebiBrokIdCod);
	memcpy(vbscModEbiStratBlkTrdRequestT.ebiBrokIdCod, lebiBrokIdCod, EBI_BROK_ID_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscModEbiStratBlkTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscModEbiStratBlkTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	vbscModEbiStratBlkTrdRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscModEbiStratBlkTrdRequestT");
	vbscModEbiStratBlkTrdRequestT.stratEquLegGrp = getStratEquLegGrpT(testCaseNum, "bscModEbiStratBlkTrdRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModEbiStratBlkTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModEbiStratBlkTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscModEbiStratBlkTrdRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscModEbiStratBlkTrdRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscModEbiStratBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modEbiStratBlkTrdRequestT getModEbiStratBlkTrdRequestT(char* testCaseNum , const char *root) {
	modEbiStratBlkTrdRequestT vmodEbiStratBlkTrdRequestT;
	int i;

	vmodEbiStratBlkTrdRequestT.header = getDataHeaderT(testCaseNum, "modEbiStratBlkTrdRequestT");
	vmodEbiStratBlkTrdRequestT.basic = getBscModEbiStratBlkTrdRequestT(testCaseNum, "modEbiStratBlkTrdRequestT");	return vmodEbiStratBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModEbiStratBlkTrdRespGrpT getBscModEbiStratBlkTrdRespGrpT(char* testCaseNum , const char *root) {
	bscModEbiStratBlkTrdRespGrpT vbscModEbiStratBlkTrdRespGrpT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		vbscModEbiStratBlkTrdRespGrpT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdRespGrpT.rtnCod", lrtnCod);
	memcpy(vbscModEbiStratBlkTrdRespGrpT.rtnCod, lrtnCod, RTN_COD_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscModEbiStratBlkTrdRespGrpT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdRespGrpT.trnIdNo", ltrnIdNo);
	memcpy(vbscModEbiStratBlkTrdRespGrpT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lebiTrdApprInd[1] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdRespGrpT.ebiTrdApprInd", lebiTrdApprInd);
	vbscModEbiStratBlkTrdRespGrpT.ebiTrdApprInd = lebiTrdApprInd[0];
	return vbscModEbiStratBlkTrdRespGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModEbiStratBlkTrdResponseT getBscModEbiStratBlkTrdResponseT(char* testCaseNum , const char *root) {
	bscModEbiStratBlkTrdResponseT vbscModEbiStratBlkTrdResponseT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vbscModEbiStratBlkTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vbscModEbiStratBlkTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModEbiStratBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModEbiStratBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscModEbiStratBlkTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModEbiStratBlkTrd.bscModEbiStratBlkTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscModEbiStratBlkTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscModEbiStratBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modEbiStratBlkTrdResponseT getModEbiStratBlkTrdResponseT(char* testCaseNum , const char *root) {
	modEbiStratBlkTrdResponseT vmodEbiStratBlkTrdResponseT;
	int i;

	vmodEbiStratBlkTrdResponseT.header = getDataHeaderT(testCaseNum, "modEbiStratBlkTrdResponseT");
	vmodEbiStratBlkTrdResponseT.basic = getBscModEbiStratBlkTrdResponseT(testCaseNum, "modEbiStratBlkTrdResponseT");	return vmodEbiStratBlkTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModEbiStratBlkTrdReqGrpT(bscModEbiStratBlkTrdReqGrpT actual, bscModEbiStratBlkTrdReqGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdReqGrpT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ctpySubGrpCod, expected.ctpySubGrpCod, CTPY_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdReqGrpT, ctpySubGrpCod not matching. Actual %s but Expected %s", actual.ctpySubGrpCod, expected.ctpySubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdReqGrpT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdReqGrpT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdReqGrpT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ebiTrdApprInd!= expected.ebiTrdApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdReqGrpT, ebiTrdApprIndnot matching. Actual %d but Expected %d", actual.ebiTrdApprInd, expected.ebiTrdApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModEbiStratBlkTrdRequestT(bscModEbiStratBlkTrdRequestT actual, bscModEbiStratBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ebiBrokIdCod, expected.ebiBrokIdCod, EBI_BROK_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdRequestT, ebiBrokIdCod not matching. Actual %s but Expected %s", actual.ebiBrokIdCod, expected.ebiBrokIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareStratEquLegGrpT (actual.stratEquLegGrp,expected.stratEquLegGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_EBI_STRAT_BLK_TRD_REQ_GRP_MAX;i++) {
		compareBscModEbiStratBlkTrdReqGrpT (actual.bscModEbiStratBlkTrdReqGrp[i],expected.bscModEbiStratBlkTrdReqGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModEbiStratBlkTrdRequestT(modEbiStratBlkTrdRequestT actual, modEbiStratBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModEbiStratBlkTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModEbiStratBlkTrdRespGrpT(bscModEbiStratBlkTrdRespGrpT actual, bscModEbiStratBlkTrdRespGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdRespGrpT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdRespGrpT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ebiTrdApprInd!= expected.ebiTrdApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdRespGrpT, ebiTrdApprIndnot matching. Actual %d but Expected %d", actual.ebiTrdApprInd, expected.ebiTrdApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModEbiStratBlkTrdResponseT(bscModEbiStratBlkTrdResponseT actual, bscModEbiStratBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModEbiStratBlkTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_EBI_STRAT_BLK_TRD_RESP_GRP_MAX;i++) {
		compareBscModEbiStratBlkTrdRespGrpT (actual.bscModEbiStratBlkTrdRespGrp[i],expected.bscModEbiStratBlkTrdRespGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModEbiStratBlkTrdResponseT(modEbiStratBlkTrdResponseT actual, modEbiStratBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModEbiStratBlkTrdResponseT (actual.basic,expected.basic, logMsg);
}

