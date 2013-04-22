#include <InqEbiStratBlkTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqEbiStratBlkTrdRequestT getBscInqEbiStratBlkTrdRequestT(char* testCaseNum , const char *root) {
	bscInqEbiStratBlkTrdRequestT vbscInqEbiStratBlkTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vbscInqEbiStratBlkTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("InqEbiStratBlkTrd.bscInqEbiStratBlkTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vbscInqEbiStratBlkTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);
	return vbscInqEbiStratBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqEbiStratBlkTrdRequestT getInqEbiStratBlkTrdRequestT(char* testCaseNum , const char *root) {
	inqEbiStratBlkTrdRequestT vinqEbiStratBlkTrdRequestT;
	int i;

	vinqEbiStratBlkTrdRequestT.header = getDataHeaderT(testCaseNum, "inqEbiStratBlkTrdRequestT");
	vinqEbiStratBlkTrdRequestT.basic = getBscInqEbiStratBlkTrdRequestT(testCaseNum, "inqEbiStratBlkTrdRequestT");	return vinqEbiStratBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqEbiStratBlkTrdRespGrpT getBscInqEbiStratBlkTrdRespGrpT(char* testCaseNum , const char *root) {
	bscInqEbiStratBlkTrdRespGrpT vbscInqEbiStratBlkTrdRespGrpT;
	int i;

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscInqEbiStratBlkTrdRespGrpT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("InqEbiStratBlkTrd.bscInqEbiStratBlkTrdRespGrpT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscInqEbiStratBlkTrdRespGrpT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<CTPY_SUB_GRP_COD_LEN;i++) {
		vbscInqEbiStratBlkTrdRespGrpT.ctpySubGrpCod[i]= ' ';
	}
	char lctpySubGrpCod[CTPY_SUB_GRP_COD_LEN] = {""};
	getStrProperty("InqEbiStratBlkTrd.bscInqEbiStratBlkTrdRespGrpT.ctpySubGrpCod", lctpySubGrpCod);
	memcpy(vbscInqEbiStratBlkTrdRespGrpT.ctpySubGrpCod, lctpySubGrpCod, CTPY_SUB_GRP_COD_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("InqEbiStratBlkTrd.bscInqEbiStratBlkTrdRespGrpT.buyCod", lbuyCod);
	vbscInqEbiStratBlkTrdRespGrpT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqEbiStratBlkTrdRespGrpT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqEbiStratBlkTrd.bscInqEbiStratBlkTrdRespGrpT.trdXQty", ltrdXQty);
	memcpy(vbscInqEbiStratBlkTrdRespGrpT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscInqEbiStratBlkTrdRespGrpT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqEbiStratBlkTrd.bscInqEbiStratBlkTrdRespGrpT.trnIdNo", ltrnIdNo);
	memcpy(vbscInqEbiStratBlkTrdRespGrpT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lebiTrdApprInd[1] = {""};
	getStrProperty("InqEbiStratBlkTrd.bscInqEbiStratBlkTrdRespGrpT.ebiTrdApprInd", lebiTrdApprInd);
	vbscInqEbiStratBlkTrdRespGrpT.ebiTrdApprInd = lebiTrdApprInd[0];
	return vbscInqEbiStratBlkTrdRespGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqEbiStratBlkTrdResponseT getBscInqEbiStratBlkTrdResponseT(char* testCaseNum , const char *root) {
	bscInqEbiStratBlkTrdResponseT vbscInqEbiStratBlkTrdResponseT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vbscInqEbiStratBlkTrdResponseT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("InqEbiStratBlkTrd.bscInqEbiStratBlkTrdResponseT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vbscInqEbiStratBlkTrdResponseT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	vbscInqEbiStratBlkTrdResponseT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqEbiStratBlkTrdResponseT");
	for(i=0;i<EBI_BROK_ID_COD_LEN;i++) {
		vbscInqEbiStratBlkTrdResponseT.ebiBrokIdCod[i]= ' ';
	}
	char lebiBrokIdCod[EBI_BROK_ID_COD_LEN] = {""};
	getStrProperty("InqEbiStratBlkTrd.bscInqEbiStratBlkTrdResponseT.ebiBrokIdCod", lebiBrokIdCod);
	memcpy(vbscInqEbiStratBlkTrdResponseT.ebiBrokIdCod, lebiBrokIdCod, EBI_BROK_ID_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqEbiStratBlkTrdResponseT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqEbiStratBlkTrd.bscInqEbiStratBlkTrdResponseT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscInqEbiStratBlkTrdResponseT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	vbscInqEbiStratBlkTrdResponseT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscInqEbiStratBlkTrdResponseT");
	vbscInqEbiStratBlkTrdResponseT.stratEquLegGrp = getStratEquLegGrpT(testCaseNum, "bscInqEbiStratBlkTrdResponseT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqEbiStratBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqEbiStratBlkTrd.bscInqEbiStratBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqEbiStratBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqEbiStratBlkTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqEbiStratBlkTrd.bscInqEbiStratBlkTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqEbiStratBlkTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqEbiStratBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqEbiStratBlkTrdResponseT getInqEbiStratBlkTrdResponseT(char* testCaseNum , const char *root) {
	inqEbiStratBlkTrdResponseT vinqEbiStratBlkTrdResponseT;
	int i;

	vinqEbiStratBlkTrdResponseT.header = getDataHeaderT(testCaseNum, "inqEbiStratBlkTrdResponseT");
	vinqEbiStratBlkTrdResponseT.basic = getBscInqEbiStratBlkTrdResponseT(testCaseNum, "inqEbiStratBlkTrdResponseT");	return vinqEbiStratBlkTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqEbiStratBlkTrdRequestT(bscInqEbiStratBlkTrdRequestT actual, bscInqEbiStratBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiStratBlkTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqEbiStratBlkTrdRequestT(inqEbiStratBlkTrdRequestT actual, inqEbiStratBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqEbiStratBlkTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqEbiStratBlkTrdRespGrpT(bscInqEbiStratBlkTrdRespGrpT actual, bscInqEbiStratBlkTrdRespGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiStratBlkTrdRespGrpT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ctpySubGrpCod, expected.ctpySubGrpCod, CTPY_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiStratBlkTrdRespGrpT, ctpySubGrpCod not matching. Actual %s but Expected %s", actual.ctpySubGrpCod, expected.ctpySubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiStratBlkTrdRespGrpT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiStratBlkTrdRespGrpT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiStratBlkTrdRespGrpT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ebiTrdApprInd!= expected.ebiTrdApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiStratBlkTrdRespGrpT, ebiTrdApprIndnot matching. Actual %d but Expected %d", actual.ebiTrdApprInd, expected.ebiTrdApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqEbiStratBlkTrdResponseT(bscInqEbiStratBlkTrdResponseT actual, bscInqEbiStratBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiStratBlkTrdResponseT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ebiBrokIdCod, expected.ebiBrokIdCod, EBI_BROK_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiStratBlkTrdResponseT, ebiBrokIdCod not matching. Actual %s but Expected %s", actual.ebiBrokIdCod, expected.ebiBrokIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiStratBlkTrdResponseT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareStratEquLegGrpT (actual.stratEquLegGrp,expected.stratEquLegGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiStratBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqEbiStratBlkTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_EBI_STRAT_BLK_TRD_RESP_GRP_MAX;i++) {
		compareBscInqEbiStratBlkTrdRespGrpT (actual.bscInqEbiStratBlkTrdRespGrp[i],expected.bscInqEbiStratBlkTrdRespGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqEbiStratBlkTrdResponseT(inqEbiStratBlkTrdResponseT actual, inqEbiStratBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqEbiStratBlkTrdResponseT (actual.basic,expected.basic, logMsg);
}

