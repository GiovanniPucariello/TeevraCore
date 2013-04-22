#include <InqAllFlxCntrTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqAllFlxFutTrdRequestT getBscInqAllFlxFutTrdRequestT(char* testCaseNum , const char *root) {
	bscInqAllFlxFutTrdRequestT vbscInqAllFlxFutTrdRequestT;
	int i;

	vbscInqAllFlxFutTrdRequestT.flxFutCntrIdGrp = getFlxFutCntrIdGrpT(testCaseNum, "bscInqAllFlxFutTrdRequestT");
	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqAllFlxFutTrdRequestT.timMin[i]= ' ';
	}
	char ltimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRequestT.timMin", ltimMin);
	memcpy(vbscInqAllFlxFutTrdRequestT.timMin, ltimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqAllFlxFutTrdRequestT.timMax[i]= ' ';
	}
	char ltimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRequestT.timMax", ltimMax);
	memcpy(vbscInqAllFlxFutTrdRequestT.timMax, ltimMax, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqAllFlxFutTrdRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRequestT.trnDat", ltrnDat);
	memcpy(vbscInqAllFlxFutTrdRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRequestT.trdTyp", ltrdTyp);
	vbscInqAllFlxFutTrdRequestT.trdTyp = ltrdTyp[0];

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqAllFlxFutTrdRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqAllFlxFutTrdRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqAllFlxFutTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqAllFlxFutTrdRequestT getInqAllFlxFutTrdRequestT(char* testCaseNum , const char *root) {
	inqAllFlxFutTrdRequestT vinqAllFlxFutTrdRequestT;
	int i;

	vinqAllFlxFutTrdRequestT.header = getDataHeaderT(testCaseNum, "inqAllFlxFutTrdRequestT");
	vinqAllFlxFutTrdRequestT.basic = getBscInqAllFlxFutTrdRequestT(testCaseNum, "inqAllFlxFutTrdRequestT");	return vinqAllFlxFutTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqAllFlxFutTrdRecT getBscInqAllFlxFutTrdRecT(char* testCaseNum , const char *root) {
	bscInqAllFlxFutTrdRecT vbscInqAllFlxFutTrdRecT;
	int i;

	vbscInqAllFlxFutTrdRecT.flxFutCntrIdGrp = getFlxFutCntrIdGrpT(testCaseNum, "bscInqAllFlxFutTrdRecT");
	for(i=0;i<FLX_CNTR_TRN_ID_NO_LEN;i++) {
		vbscInqAllFlxFutTrdRecT.flxCntrTrnIdNo[i]= ' ';
	}
	char lflxCntrTrnIdNo[FLX_CNTR_TRN_ID_NO_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRecT.flxCntrTrnIdNo", lflxCntrTrnIdNo);
	memcpy(vbscInqAllFlxFutTrdRecT.flxCntrTrnIdNo, lflxCntrTrnIdNo, FLX_CNTR_TRN_ID_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqAllFlxFutTrdRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscInqAllFlxFutTrdRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqAllFlxFutTrdRecT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRecT.trdXQty", ltrdXQty);
	memcpy(vbscInqAllFlxFutTrdRecT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqAllFlxFutTrdRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRecT.trnDat", ltrnDat);
	memcpy(vbscInqAllFlxFutTrdRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqAllFlxFutTrdRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRecT.trnTim", ltrnTim);
	memcpy(vbscInqAllFlxFutTrdRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRecT.trdTyp", ltrdTyp);
	vbscInqAllFlxFutTrdRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqAllFlxFutTrdRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRecT.currTypCod", lcurrTypCod);
	memcpy(vbscInqAllFlxFutTrdRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqAllFlxFutTrdRecT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRecT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscInqAllFlxFutTrdRecT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqAllFlxFutTrdRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqAllFlxFutTrdRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqAllFlxFutTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqAllFlxFutTrdResponseT getBscInqAllFlxFutTrdResponseT(char* testCaseNum , const char *root) {
	bscInqAllFlxFutTrdResponseT vbscInqAllFlxFutTrdResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqAllFlxFutTrdResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqAllFlxFutTrdResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqAllFlxFutTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxFutTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqAllFlxFutTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqAllFlxFutTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqAllFlxFutTrdResponseT getInqAllFlxFutTrdResponseT(char* testCaseNum , const char *root) {
	inqAllFlxFutTrdResponseT vinqAllFlxFutTrdResponseT;
	int i;

	vinqAllFlxFutTrdResponseT.header = getDataHeaderT(testCaseNum, "inqAllFlxFutTrdResponseT");
	vinqAllFlxFutTrdResponseT.basic = getBscInqAllFlxFutTrdResponseT(testCaseNum, "inqAllFlxFutTrdResponseT");	return vinqAllFlxFutTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqAllFlxOptTrdRequestT getBscInqAllFlxOptTrdRequestT(char* testCaseNum , const char *root) {
	bscInqAllFlxOptTrdRequestT vbscInqAllFlxOptTrdRequestT;
	int i;

	vbscInqAllFlxOptTrdRequestT.flxOptCntrIdGrp = getFlxOptCntrIdGrpT(testCaseNum, "bscInqAllFlxOptTrdRequestT");
	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqAllFlxOptTrdRequestT.timMin[i]= ' ';
	}
	char ltimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRequestT.timMin", ltimMin);
	memcpy(vbscInqAllFlxOptTrdRequestT.timMin, ltimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqAllFlxOptTrdRequestT.timMax[i]= ' ';
	}
	char ltimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRequestT.timMax", ltimMax);
	memcpy(vbscInqAllFlxOptTrdRequestT.timMax, ltimMax, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqAllFlxOptTrdRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRequestT.trnDat", ltrnDat);
	memcpy(vbscInqAllFlxOptTrdRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRequestT.trdTyp", ltrdTyp);
	vbscInqAllFlxOptTrdRequestT.trdTyp = ltrdTyp[0];

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqAllFlxOptTrdRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqAllFlxOptTrdRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqAllFlxOptTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqAllFlxOptTrdRequestT getInqAllFlxOptTrdRequestT(char* testCaseNum , const char *root) {
	inqAllFlxOptTrdRequestT vinqAllFlxOptTrdRequestT;
	int i;

	vinqAllFlxOptTrdRequestT.header = getDataHeaderT(testCaseNum, "inqAllFlxOptTrdRequestT");
	vinqAllFlxOptTrdRequestT.basic = getBscInqAllFlxOptTrdRequestT(testCaseNum, "inqAllFlxOptTrdRequestT");	return vinqAllFlxOptTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqAllFlxOptTrdRecT getBscInqAllFlxOptTrdRecT(char* testCaseNum , const char *root) {
	bscInqAllFlxOptTrdRecT vbscInqAllFlxOptTrdRecT;
	int i;

	vbscInqAllFlxOptTrdRecT.flxOptCntrIdGrp = getFlxOptCntrIdGrpT(testCaseNum, "bscInqAllFlxOptTrdRecT");
	for(i=0;i<FLX_CNTR_TRN_ID_NO_LEN;i++) {
		vbscInqAllFlxOptTrdRecT.flxCntrTrnIdNo[i]= ' ';
	}
	char lflxCntrTrnIdNo[FLX_CNTR_TRN_ID_NO_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRecT.flxCntrTrnIdNo", lflxCntrTrnIdNo);
	memcpy(vbscInqAllFlxOptTrdRecT.flxCntrTrnIdNo, lflxCntrTrnIdNo, FLX_CNTR_TRN_ID_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqAllFlxOptTrdRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscInqAllFlxOptTrdRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqAllFlxOptTrdRecT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRecT.trdXQty", ltrdXQty);
	memcpy(vbscInqAllFlxOptTrdRecT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqAllFlxOptTrdRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRecT.trnDat", ltrnDat);
	memcpy(vbscInqAllFlxOptTrdRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqAllFlxOptTrdRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRecT.trnTim", ltrnTim);
	memcpy(vbscInqAllFlxOptTrdRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRecT.trdTyp", ltrdTyp);
	vbscInqAllFlxOptTrdRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqAllFlxOptTrdRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRecT.currTypCod", lcurrTypCod);
	memcpy(vbscInqAllFlxOptTrdRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqAllFlxOptTrdRecT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRecT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscInqAllFlxOptTrdRecT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqAllFlxOptTrdRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqAllFlxOptTrdRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqAllFlxOptTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqAllFlxOptTrdResponseT getBscInqAllFlxOptTrdResponseT(char* testCaseNum , const char *root) {
	bscInqAllFlxOptTrdResponseT vbscInqAllFlxOptTrdResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqAllFlxOptTrdResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqAllFlxOptTrdResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqAllFlxOptTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqAllFlxCntrTrd.bscInqAllFlxOptTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqAllFlxOptTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqAllFlxOptTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqAllFlxOptTrdResponseT getInqAllFlxOptTrdResponseT(char* testCaseNum , const char *root) {
	inqAllFlxOptTrdResponseT vinqAllFlxOptTrdResponseT;
	int i;

	vinqAllFlxOptTrdResponseT.header = getDataHeaderT(testCaseNum, "inqAllFlxOptTrdResponseT");
	vinqAllFlxOptTrdResponseT.basic = getBscInqAllFlxOptTrdResponseT(testCaseNum, "inqAllFlxOptTrdResponseT");	return vinqAllFlxOptTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqAllFlxFutTrdRequestT(bscInqAllFlxFutTrdRequestT actual, bscInqAllFlxFutTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFlxFutCntrIdGrpT (actual.flxFutCntrIdGrp,expected.flxFutCntrIdGrp, logMsg);
	if ( memcmp(actual.timMin, expected.timMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRequestT, timMin not matching. Actual %s but Expected %s", actual.timMin, expected.timMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMax, expected.timMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRequestT, timMax not matching. Actual %s but Expected %s", actual.timMax, expected.timMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqAllFlxFutTrdRequestT(inqAllFlxFutTrdRequestT actual, inqAllFlxFutTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqAllFlxFutTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqAllFlxFutTrdRecT(bscInqAllFlxFutTrdRecT actual, bscInqAllFlxFutTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFlxFutCntrIdGrpT (actual.flxFutCntrIdGrp,expected.flxFutCntrIdGrp, logMsg);
	if ( memcmp(actual.flxCntrTrnIdNo, expected.flxCntrTrnIdNo, FLX_CNTR_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRecT, flxCntrTrnIdNo not matching. Actual %s but Expected %s", actual.flxCntrTrnIdNo, expected.flxCntrTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRecT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRecT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqAllFlxFutTrdResponseT(bscInqAllFlxFutTrdResponseT actual, bscInqAllFlxFutTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxFutTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_ALL_FLX_FUT_TRD_REC_MAX;i++) {
		compareBscInqAllFlxFutTrdRecT (actual.bscInqAllFlxFutTrdRec[i],expected.bscInqAllFlxFutTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqAllFlxFutTrdResponseT(inqAllFlxFutTrdResponseT actual, inqAllFlxFutTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqAllFlxFutTrdResponseT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqAllFlxOptTrdRequestT(bscInqAllFlxOptTrdRequestT actual, bscInqAllFlxOptTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFlxOptCntrIdGrpT (actual.flxOptCntrIdGrp,expected.flxOptCntrIdGrp, logMsg);
	if ( memcmp(actual.timMin, expected.timMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRequestT, timMin not matching. Actual %s but Expected %s", actual.timMin, expected.timMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMax, expected.timMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRequestT, timMax not matching. Actual %s but Expected %s", actual.timMax, expected.timMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqAllFlxOptTrdRequestT(inqAllFlxOptTrdRequestT actual, inqAllFlxOptTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqAllFlxOptTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqAllFlxOptTrdRecT(bscInqAllFlxOptTrdRecT actual, bscInqAllFlxOptTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFlxOptCntrIdGrpT (actual.flxOptCntrIdGrp,expected.flxOptCntrIdGrp, logMsg);
	if ( memcmp(actual.flxCntrTrnIdNo, expected.flxCntrTrnIdNo, FLX_CNTR_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRecT, flxCntrTrnIdNo not matching. Actual %s but Expected %s", actual.flxCntrTrnIdNo, expected.flxCntrTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRecT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRecT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqAllFlxOptTrdResponseT(bscInqAllFlxOptTrdResponseT actual, bscInqAllFlxOptTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqAllFlxOptTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_ALL_FLX_OPT_TRD_REC_MAX;i++) {
		compareBscInqAllFlxOptTrdRecT (actual.bscInqAllFlxOptTrdRec[i],expected.bscInqAllFlxOptTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqAllFlxOptTrdResponseT(inqAllFlxOptTrdResponseT actual, inqAllFlxOptTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqAllFlxOptTrdResponseT (actual.basic,expected.basic, logMsg);
}

