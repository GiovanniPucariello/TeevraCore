#include <InqProdStsc.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdStscRequestT getBscInqProdStscRequestT(char* testCaseNum , const char *root) {
	bscInqProdStscRequestT vbscInqProdStscRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqProdStscRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProdStsc.bscInqProdStscRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqProdStscRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqProdStscRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdStscRequestT getInqProdStscRequestT(char* testCaseNum , const char *root) {
	inqProdStscRequestT vinqProdStscRequestT;
	int i;

	vinqProdStscRequestT.header = getDataHeaderT(testCaseNum, "inqProdStscRequestT");
	vinqProdStscRequestT.basic = getBscInqProdStscRequestT(testCaseNum, "inqProdStscRequestT");	return vinqProdStscRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdStscRecT getBscInqProdStscRecT(char* testCaseNum , const char *root) {
	bscInqProdStscRecT vbscInqProdStscRecT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqProdStscRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqProdStsc.bscInqProdStscRecT.prodId", lprodId);
	memcpy(vbscInqProdStscRecT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqProdStscRecT.undrPrc[i]= ' ';
	}
	char lundrPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqProdStsc.bscInqProdStscRecT.undrPrc", lundrPrc);
	memcpy(vbscInqProdStscRecT.undrPrc, lundrPrc, DRIV_PRICE_LEN);
	return vbscInqProdStscRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdStscResponseT getBscInqProdStscResponseT(char* testCaseNum , const char *root) {
	bscInqProdStscResponseT vbscInqProdStscResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqProdStscResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProdStsc.bscInqProdStscResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqProdStscResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqProdStscResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqProdStsc.bscInqProdStscResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqProdStscResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqProdStscResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqProdStscRecT getExtInqProdStscRecT(char* testCaseNum , const char *root) {
	extInqProdStscRecT vextInqProdStscRecT;
	int i;

	char lundrPrcRcvCod[1] = {""};
	getStrProperty("InqProdStsc.extInqProdStscRecT.undrPrcRcvCod", lundrPrcRcvCod);
	vextInqProdStscRecT.undrPrcRcvCod = lundrPrcRcvCod[0];

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vextInqProdStscRecT.futTotTrdQty[i]= ' ';
	}
	char lfutTotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqProdStsc.extInqProdStscRecT.futTotTrdQty", lfutTotTrdQty);
	memcpy(vextInqProdStscRecT.futTotTrdQty, lfutTotTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vextInqProdStscRecT.callTotTrdQty[i]= ' ';
	}
	char lcallTotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqProdStsc.extInqProdStscRecT.callTotTrdQty", lcallTotTrdQty);
	memcpy(vextInqProdStscRecT.callTotTrdQty, lcallTotTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vextInqProdStscRecT.putTotTrdQty[i]= ' ';
	}
	char lputTotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqProdStsc.extInqProdStscRecT.putTotTrdQty", lputTotTrdQty);
	memcpy(vextInqProdStscRecT.putTotTrdQty, lputTotTrdQty, DRIV_QUANTITY_LEN);
	return vextInqProdStscRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqProdStscResponseT getExtInqProdStscResponseT(char* testCaseNum , const char *root) {
	extInqProdStscResponseT vextInqProdStscResponseT;
	int i;
	return vextInqProdStscResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdStscResponseT getInqProdStscResponseT(char* testCaseNum , const char *root) {
	inqProdStscResponseT vinqProdStscResponseT;
	int i;

	vinqProdStscResponseT.header = getDataHeaderT(testCaseNum, "inqProdStscResponseT");
	vinqProdStscResponseT.basic = getBscInqProdStscResponseT(testCaseNum, "inqProdStscResponseT");
	vinqProdStscResponseT.extension = getExtInqProdStscResponseT(testCaseNum, "inqProdStscResponseT");	return vinqProdStscResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdStscRequestT(bscInqProdStscRequestT actual, bscInqProdStscRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdStscRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdStscRequestT(inqProdStscRequestT actual, inqProdStscRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdStscRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdStscRecT(bscInqProdStscRecT actual, bscInqProdStscRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdStscRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrPrc, expected.undrPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdStscRecT, undrPrc not matching. Actual %s but Expected %s", actual.undrPrc, expected.undrPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdStscResponseT(bscInqProdStscResponseT actual, bscInqProdStscResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdStscResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdStscResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_PROD_STSC_REC_MAX;i++) {
		compareBscInqProdStscRecT (actual.bscInqProdStscRec[i],expected.bscInqProdStscRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqProdStscRecT(extInqProdStscRecT actual, extInqProdStscRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.undrPrcRcvCod!= expected.undrPrcRcvCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqProdStscRecT, undrPrcRcvCodnot matching. Actual %d but Expected %d", actual.undrPrcRcvCod, expected.undrPrcRcvCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.futTotTrdQty, expected.futTotTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqProdStscRecT, futTotTrdQty not matching. Actual %s but Expected %s", actual.futTotTrdQty, expected.futTotTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.callTotTrdQty, expected.callTotTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqProdStscRecT, callTotTrdQty not matching. Actual %s but Expected %s", actual.callTotTrdQty, expected.callTotTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.putTotTrdQty, expected.putTotTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqProdStscRecT, putTotTrdQty not matching. Actual %s but Expected %s", actual.putTotTrdQty, expected.putTotTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqProdStscResponseT(extInqProdStscResponseT actual, extInqProdStscResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_PROD_STSC_REC_MAX;i++) {
		compareExtInqProdStscRecT (actual.extInqProdStscRec[i],expected.extInqProdStscRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdStscResponseT(inqProdStscResponseT actual, inqProdStscResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdStscResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqProdStscResponseT (actual.extension,expected.extension, logMsg);
}

