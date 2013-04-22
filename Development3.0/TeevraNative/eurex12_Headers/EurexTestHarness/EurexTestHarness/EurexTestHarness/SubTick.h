#include <SubTick.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubTickPubBcastT getBscSubTickPubBcastT(char* testCaseNum , const char *root) {
	bscSubTickPubBcastT vbscSubTickPubBcastT;
	int i;

	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vbscSubTickPubBcastT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("SubTick.bscSubTickPubBcastT.undrIsinCod", lundrIsinCod);
	memcpy(vbscSubTickPubBcastT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscSubTickPubBcastT.bstBidPrc[i]= ' ';
	}
	char lbstBidPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubTick.bscSubTickPubBcastT.bstBidPrc", lbstBidPrc);
	memcpy(vbscSubTickPubBcastT.bstBidPrc, lbstBidPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscSubTickPubBcastT.bstAskPrc[i]= ' ';
	}
	char lbstAskPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubTick.bscSubTickPubBcastT.bstAskPrc", lbstAskPrc);
	memcpy(vbscSubTickPubBcastT.bstAskPrc, lbstAskPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscSubTickPubBcastT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubTick.bscSubTickPubBcastT.lstTrdPrc", llstTrdPrc);
	memcpy(vbscSubTickPubBcastT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscSubTickPubBcastT.lstTrdQty[i]= ' ';
	}
	char llstTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubTick.bscSubTickPubBcastT.lstTrdQty", llstTrdQty);
	memcpy(vbscSubTickPubBcastT.lstTrdQty, llstTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubTickPubBcastT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubTick.bscSubTickPubBcastT.trnTim", ltrnTim);
	memcpy(vbscSubTickPubBcastT.trnTim, ltrnTim, DRIV_TIME_LEN);

	char lprcTypInd[1] = {""};
	getStrProperty("SubTick.bscSubTickPubBcastT.prcTypInd", lprcTypInd);
	vbscSubTickPubBcastT.prcTypInd = lprcTypInd[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscSubTickPubBcastT.difLstClsPrc[i]= ' ';
	}
	char ldifLstClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubTick.bscSubTickPubBcastT.difLstClsPrc", ldifLstClsPrc);
	memcpy(vbscSubTickPubBcastT.difLstClsPrc, ldifLstClsPrc, DRIV_PRICE_LEN);
	return vbscSubTickPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extSubTickPubBcastT getExtSubTickPubBcastT(char* testCaseNum , const char *root) {
	extSubTickPubBcastT vextSubTickPubBcastT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextSubTickPubBcastT.dlyHghPrc[i]= ' ';
	}
	char ldlyHghPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubTick.extSubTickPubBcastT.dlyHghPrc", ldlyHghPrc);
	memcpy(vextSubTickPubBcastT.dlyHghPrc, ldlyHghPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextSubTickPubBcastT.dlyLowPrc[i]= ' ';
	}
	char ldlyLowPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubTick.extSubTickPubBcastT.dlyLowPrc", ldlyLowPrc);
	memcpy(vextSubTickPubBcastT.dlyLowPrc, ldlyLowPrc, DRIV_PRICE_LEN);
	return vextSubTickPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subTickPubBcastT getSubTickPubBcastT(char* testCaseNum , const char *root) {
	subTickPubBcastT vsubTickPubBcastT;
	int i;

	vsubTickPubBcastT.header = getDataHeaderT(testCaseNum, "subTickPubBcastT");
	vsubTickPubBcastT.basic = getBscSubTickPubBcastT(testCaseNum, "subTickPubBcastT");
	vsubTickPubBcastT.extension = getExtSubTickPubBcastT(testCaseNum, "subTickPubBcastT");	return vsubTickPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubTickSubjectT getBscSubTickSubjectT(char* testCaseNum , const char *root) {
	bscSubTickSubjectT vbscSubTickSubjectT;
	int i;

	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		vbscSubTickSubjectT.exchIdCod[i]= ' ';
	}
	char lexchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubTick.bscSubTickSubjectT.exchIdCod", lexchIdCod);
	memcpy(vbscSubTickSubjectT.exchIdCod, lexchIdCod, DRIV_EXCH_ID_COD_LEN);

	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vbscSubTickSubjectT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("SubTick.bscSubTickSubjectT.undrIsinCod", lundrIsinCod);
	memcpy(vbscSubTickSubjectT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);
	return vbscSubTickSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubTickPubBcastT(bscSubTickPubBcastT actual, bscSubTickPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubTickPubBcastT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstBidPrc, expected.bstBidPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubTickPubBcastT, bstBidPrc not matching. Actual %s but Expected %s", actual.bstBidPrc, expected.bstBidPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bstAskPrc, expected.bstAskPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubTickPubBcastT, bstAskPrc not matching. Actual %s but Expected %s", actual.bstAskPrc, expected.bstAskPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubTickPubBcastT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdQty, expected.lstTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubTickPubBcastT, lstTrdQty not matching. Actual %s but Expected %s", actual.lstTrdQty, expected.lstTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubTickPubBcastT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prcTypInd!= expected.prcTypInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubTickPubBcastT, prcTypIndnot matching. Actual %d but Expected %d", actual.prcTypInd, expected.prcTypInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.difLstClsPrc, expected.difLstClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubTickPubBcastT, difLstClsPrc not matching. Actual %s but Expected %s", actual.difLstClsPrc, expected.difLstClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtSubTickPubBcastT(extSubTickPubBcastT actual, extSubTickPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dlyHghPrc, expected.dlyHghPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubTickPubBcastT, dlyHghPrc not matching. Actual %s but Expected %s", actual.dlyHghPrc, expected.dlyHghPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyLowPrc, expected.dlyLowPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubTickPubBcastT, dlyLowPrc not matching. Actual %s but Expected %s", actual.dlyLowPrc, expected.dlyLowPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubTickPubBcastT(subTickPubBcastT actual, subTickPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubTickPubBcastT (actual.basic,expected.basic, logMsg);
	compareExtSubTickPubBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubTickSubjectT(bscSubTickSubjectT actual, bscSubTickSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.exchIdCod, expected.exchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubTickSubjectT, exchIdCod not matching. Actual %s but Expected %s", actual.exchIdCod, expected.exchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubTickSubjectT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

