#include <InqTick.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
undrIdGrpT getUndrIdGrpT(char* testCaseNum , const char *root) {
	undrIdGrpT vundrIdGrpT;
	int i;

	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vundrIdGrpT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("InqTick.undrIdGrpT.undrIsinCod", lundrIsinCod);
	memcpy(vundrIdGrpT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		vundrIdGrpT.exchIdCod[i]= ' ';
	}
	char lexchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqTick.undrIdGrpT.exchIdCod", lexchIdCod);
	memcpy(vundrIdGrpT.exchIdCod, lexchIdCod, DRIV_EXCH_ID_COD_LEN);
	return vundrIdGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqTickRequestT getBscInqTickRequestT(char* testCaseNum , const char *root) {
	bscInqTickRequestT vbscInqTickRequestT;
	int i;

	for(i=0;i<MLI_UNDR_DATA_CTR_LEN;i++) {
		vbscInqTickRequestT.mliUndrDataCtr[i]= ' ';
	}
	char lmliUndrDataCtr[MLI_UNDR_DATA_CTR_LEN] = {""};
	getStrProperty("InqTick.bscInqTickRequestT.mliUndrDataCtr", lmliUndrDataCtr);
	memcpy(vbscInqTickRequestT.mliUndrDataCtr, lmliUndrDataCtr, MLI_UNDR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqTickRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqTick.bscInqTickRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqTickRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqTickRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqTickRequestT getInqTickRequestT(char* testCaseNum , const char *root) {
	inqTickRequestT vinqTickRequestT;
	int i;

	vinqTickRequestT.header = getDataHeaderT(testCaseNum, "inqTickRequestT");
	vinqTickRequestT.basic = getBscInqTickRequestT(testCaseNum, "inqTickRequestT");	return vinqTickRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqTickRecT getBscInqTickRecT(char* testCaseNum , const char *root) {
	bscInqTickRecT vbscInqTickRecT;
	int i;

	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vbscInqTickRecT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("InqTick.bscInqTickRecT.undrIsinCod", lundrIsinCod);
	memcpy(vbscInqTickRecT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqTickRecT.bstBidPrc[i]= ' ';
	}
	char lbstBidPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqTick.bscInqTickRecT.bstBidPrc", lbstBidPrc);
	memcpy(vbscInqTickRecT.bstBidPrc, lbstBidPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqTickRecT.bstAskPrc[i]= ' ';
	}
	char lbstAskPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqTick.bscInqTickRecT.bstAskPrc", lbstAskPrc);
	memcpy(vbscInqTickRecT.bstAskPrc, lbstAskPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqTickRecT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqTick.bscInqTickRecT.lstTrdPrc", llstTrdPrc);
	memcpy(vbscInqTickRecT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqTickRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqTick.bscInqTickRecT.trnDat", ltrnDat);
	memcpy(vbscInqTickRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqTickRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqTick.bscInqTickRecT.trnTim", ltrnTim);
	memcpy(vbscInqTickRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqTickRecT.opnPrc[i]= ' ';
	}
	char lopnPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqTick.bscInqTickRecT.opnPrc", lopnPrc);
	memcpy(vbscInqTickRecT.opnPrc, lopnPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqTickRecT.clsPrc[i]= ' ';
	}
	char lclsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqTick.bscInqTickRecT.clsPrc", lclsPrc);
	memcpy(vbscInqTickRecT.clsPrc, lclsPrc, DRIV_PRICE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqTickRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqTick.bscInqTickRecT.currTypCod", lcurrTypCod);
	memcpy(vbscInqTickRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);
	return vbscInqTickRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqTickResponseT getBscInqTickResponseT(char* testCaseNum , const char *root) {
	bscInqTickResponseT vbscInqTickResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqTickResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqTick.bscInqTickResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqTickResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqTickResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqTickRecT getExtInqTickRecT(char* testCaseNum , const char *root) {
	extInqTickRecT vextInqTickRecT;
	int i;

	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		vextInqTickRecT.exchIdCod[i]= ' ';
	}
	char lexchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqTick.extInqTickRecT.exchIdCod", lexchIdCod);
	memcpy(vextInqTickRecT.exchIdCod, lexchIdCod, DRIV_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextInqTickRecT.dlyHghPrc[i]= ' ';
	}
	char ldlyHghPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqTick.extInqTickRecT.dlyHghPrc", ldlyHghPrc);
	memcpy(vextInqTickRecT.dlyHghPrc, ldlyHghPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextInqTickRecT.dlyLowPrc[i]= ' ';
	}
	char ldlyLowPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqTick.extInqTickRecT.dlyLowPrc", ldlyLowPrc);
	memcpy(vextInqTickRecT.dlyLowPrc, ldlyLowPrc, DRIV_PRICE_LEN);
	return vextInqTickRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqTickResponseT getExtInqTickResponseT(char* testCaseNum , const char *root) {
	extInqTickResponseT vextInqTickResponseT;
	int i;
	return vextInqTickResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqTickResponseT getInqTickResponseT(char* testCaseNum , const char *root) {
	inqTickResponseT vinqTickResponseT;
	int i;

	vinqTickResponseT.header = getDataHeaderT(testCaseNum, "inqTickResponseT");
	vinqTickResponseT.basic = getBscInqTickResponseT(testCaseNum, "inqTickResponseT");
	vinqTickResponseT.extension = getExtInqTickResponseT(testCaseNum, "inqTickResponseT");	return vinqTickResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareUndrIdGrpT(undrIdGrpT actual, undrIdGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In undrIdGrpT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchIdCod, expected.exchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In undrIdGrpT, exchIdCod not matching. Actual %s but Expected %s", actual.exchIdCod, expected.exchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqTickRequestT(bscInqTickRequestT actual, bscInqTickRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < UNDR_ID_GRP_MAX;i++) {
		compareUndrIdGrpT (actual.undrIdGrp[i],expected.undrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.mliUndrDataCtr, expected.mliUndrDataCtr, MLI_UNDR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTickRequestT, mliUndrDataCtr not matching. Actual %s but Expected %s", actual.mliUndrDataCtr, expected.mliUndrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTickRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqTickRequestT(inqTickRequestT actual, inqTickRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqTickRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqTickRecT(bscInqTickRecT actual, bscInqTickRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTickRecT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstBidPrc, expected.bstBidPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTickRecT, bstBidPrc not matching. Actual %s but Expected %s", actual.bstBidPrc, expected.bstBidPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstAskPrc, expected.bstAskPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTickRecT, bstAskPrc not matching. Actual %s but Expected %s", actual.bstAskPrc, expected.bstAskPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTickRecT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTickRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTickRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.opnPrc, expected.opnPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTickRecT, opnPrc not matching. Actual %s but Expected %s", actual.opnPrc, expected.opnPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.clsPrc, expected.clsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTickRecT, clsPrc not matching. Actual %s but Expected %s", actual.clsPrc, expected.clsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTickRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqTickResponseT(bscInqTickResponseT actual, bscInqTickResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTickResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_TICK_REC_MAX;i++) {
		compareBscInqTickRecT (actual.bscInqTickRec[i],expected.bscInqTickRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqTickRecT(extInqTickRecT actual, extInqTickRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.exchIdCod, expected.exchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqTickRecT, exchIdCod not matching. Actual %s but Expected %s", actual.exchIdCod, expected.exchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyHghPrc, expected.dlyHghPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqTickRecT, dlyHghPrc not matching. Actual %s but Expected %s", actual.dlyHghPrc, expected.dlyHghPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyLowPrc, expected.dlyLowPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqTickRecT, dlyLowPrc not matching. Actual %s but Expected %s", actual.dlyLowPrc, expected.dlyLowPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqTickResponseT(extInqTickResponseT actual, extInqTickResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_TICK_REC_MAX;i++) {
		compareExtInqTickRecT (actual.extInqTickRec[i],expected.extInqTickRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqTickResponseT(inqTickResponseT actual, inqTickResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqTickResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqTickResponseT (actual.extension,expected.extension, logMsg);
}

