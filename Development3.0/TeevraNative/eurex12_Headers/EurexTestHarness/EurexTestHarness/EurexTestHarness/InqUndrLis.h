#include <InqUndrLis.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqUndrLisRequestT getBscInqUndrLisRequestT(char* testCaseNum , const char *root) {
	bscInqUndrLisRequestT vbscInqUndrLisRequestT;
	int i;

	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		vbscInqUndrLisRequestT.exchIdCod[i]= ' ';
	}
	char lexchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqUndrLis.bscInqUndrLisRequestT.exchIdCod", lexchIdCod);
	memcpy(vbscInqUndrLisRequestT.exchIdCod, lexchIdCod, DRIV_EXCH_ID_COD_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqUndrLisRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqUndrLis.bscInqUndrLisRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqUndrLisRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqUndrLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqUndrLisRequestT getInqUndrLisRequestT(char* testCaseNum , const char *root) {
	inqUndrLisRequestT vinqUndrLisRequestT;
	int i;

	vinqUndrLisRequestT.header = getDataHeaderT(testCaseNum, "inqUndrLisRequestT");
	vinqUndrLisRequestT.basic = getBscInqUndrLisRequestT(testCaseNum, "inqUndrLisRequestT");	return vinqUndrLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqUndrLisRecT getBscInqUndrLisRecT(char* testCaseNum , const char *root) {
	bscInqUndrLisRecT vbscInqUndrLisRecT;
	int i;

	for(i=0;i<UNDR_ID_LEN;i++) {
		vbscInqUndrLisRecT.undrId[i]= ' ';
	}
	char lundrId[UNDR_ID_LEN] = {""};
	getStrProperty("InqUndrLis.bscInqUndrLisRecT.undrId", lundrId);
	memcpy(vbscInqUndrLisRecT.undrId, lundrId, UNDR_ID_LEN);

	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		vbscInqUndrLisRecT.exchIdCod[i]= ' ';
	}
	char lexchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqUndrLis.bscInqUndrLisRecT.exchIdCod", lexchIdCod);
	memcpy(vbscInqUndrLisRecT.exchIdCod, lexchIdCod, DRIV_EXCH_ID_COD_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vbscInqUndrLisRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqUndrLis.bscInqUndrLisRecT.isinCod", lisinCod);
	memcpy(vbscInqUndrLisRecT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<UNDR_DISP_DCML_LEN;i++) {
		vbscInqUndrLisRecT.undrDispDcml[i]= ' ';
	}
	char lundrDispDcml[UNDR_DISP_DCML_LEN] = {""};
	getStrProperty("InqUndrLis.bscInqUndrLisRecT.undrDispDcml", lundrDispDcml);
	memcpy(vbscInqUndrLisRecT.undrDispDcml, lundrDispDcml, UNDR_DISP_DCML_LEN);

	for(i=0;i<UNDR_CURR_COD_LEN;i++) {
		vbscInqUndrLisRecT.undrCurrCod[i]= ' ';
	}
	char lundrCurrCod[UNDR_CURR_COD_LEN] = {""};
	getStrProperty("InqUndrLis.bscInqUndrLisRecT.undrCurrCod", lundrCurrCod);
	memcpy(vbscInqUndrLisRecT.undrCurrCod, lundrCurrCod, UNDR_CURR_COD_LEN);
	return vbscInqUndrLisRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqUndrLisResponseT getBscInqUndrLisResponseT(char* testCaseNum , const char *root) {
	bscInqUndrLisResponseT vbscInqUndrLisResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqUndrLisResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqUndrLis.bscInqUndrLisResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqUndrLisResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqUndrLisResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqUndrLisResponseT getInqUndrLisResponseT(char* testCaseNum , const char *root) {
	inqUndrLisResponseT vinqUndrLisResponseT;
	int i;

	vinqUndrLisResponseT.header = getDataHeaderT(testCaseNum, "inqUndrLisResponseT");
	vinqUndrLisResponseT.basic = getBscInqUndrLisResponseT(testCaseNum, "inqUndrLisResponseT");	return vinqUndrLisResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqUndrLisRequestT(bscInqUndrLisRequestT actual, bscInqUndrLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.exchIdCod, expected.exchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqUndrLisRequestT, exchIdCod not matching. Actual %s but Expected %s", actual.exchIdCod, expected.exchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqUndrLisRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqUndrLisRequestT(inqUndrLisRequestT actual, inqUndrLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqUndrLisRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqUndrLisRecT(bscInqUndrLisRecT actual, bscInqUndrLisRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.undrId, expected.undrId, UNDR_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqUndrLisRecT, undrId not matching. Actual %s but Expected %s", actual.undrId, expected.undrId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchIdCod, expected.exchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqUndrLisRecT, exchIdCod not matching. Actual %s but Expected %s", actual.exchIdCod, expected.exchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqUndrLisRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrDispDcml, expected.undrDispDcml, UNDR_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqUndrLisRecT, undrDispDcml not matching. Actual %s but Expected %s", actual.undrDispDcml, expected.undrDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrCurrCod, expected.undrCurrCod, UNDR_CURR_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqUndrLisRecT, undrCurrCod not matching. Actual %s but Expected %s", actual.undrCurrCod, expected.undrCurrCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqUndrLisResponseT(bscInqUndrLisResponseT actual, bscInqUndrLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqUndrLisResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_UNDR_LIS_REC_MAX;i++) {
		compareBscInqUndrLisRecT (actual.bscInqUndrLisRec[i],expected.bscInqUndrLisRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqUndrLisResponseT(inqUndrLisResponseT actual, inqUndrLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqUndrLisResponseT (actual.basic,expected.basic, logMsg);
}

