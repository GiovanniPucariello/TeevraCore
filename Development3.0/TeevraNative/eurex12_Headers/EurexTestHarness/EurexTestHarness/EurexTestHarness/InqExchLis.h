#include <InqExchLis.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqExchLisRequestT getBscInqExchLisRequestT(char* testCaseNum , const char *root) {
	bscInqExchLisRequestT vbscInqExchLisRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqExchLisRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqExchLis.bscInqExchLisRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqExchLisRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqExchLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqExchLisRequestT getInqExchLisRequestT(char* testCaseNum , const char *root) {
	inqExchLisRequestT vinqExchLisRequestT;
	int i;

	vinqExchLisRequestT.header = getDataHeaderT(testCaseNum, "inqExchLisRequestT");
	vinqExchLisRequestT.basic = getBscInqExchLisRequestT(testCaseNum, "inqExchLisRequestT");	return vinqExchLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqExchLisRecT getBscInqExchLisRecT(char* testCaseNum , const char *root) {
	bscInqExchLisRecT vbscInqExchLisRecT;
	int i;

	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		vbscInqExchLisRecT.exchIdCod[i]= ' ';
	}
	char lexchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqExchLis.bscInqExchLisRecT.exchIdCod", lexchIdCod);
	memcpy(vbscInqExchLisRecT.exchIdCod, lexchIdCod, DRIV_EXCH_ID_COD_LEN);
	return vbscInqExchLisRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqExchLisResponseT getBscInqExchLisResponseT(char* testCaseNum , const char *root) {
	bscInqExchLisResponseT vbscInqExchLisResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqExchLisResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqExchLis.bscInqExchLisResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqExchLisResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqExchLisResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqExchLis.bscInqExchLisResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqExchLisResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqExchLisResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqExchLisResponseT getInqExchLisResponseT(char* testCaseNum , const char *root) {
	inqExchLisResponseT vinqExchLisResponseT;
	int i;

	vinqExchLisResponseT.header = getDataHeaderT(testCaseNum, "inqExchLisResponseT");
	vinqExchLisResponseT.basic = getBscInqExchLisResponseT(testCaseNum, "inqExchLisResponseT");	return vinqExchLisResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqExchLisRequestT(bscInqExchLisRequestT actual, bscInqExchLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqExchLisRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqExchLisRequestT(inqExchLisRequestT actual, inqExchLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqExchLisRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqExchLisRecT(bscInqExchLisRecT actual, bscInqExchLisRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.exchIdCod, expected.exchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqExchLisRecT, exchIdCod not matching. Actual %s but Expected %s", actual.exchIdCod, expected.exchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqExchLisResponseT(bscInqExchLisResponseT actual, bscInqExchLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqExchLisResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqExchLisResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_EXCH_LIS_REC_MAX;i++) {
		compareBscInqExchLisRecT (actual.bscInqExchLisRec[i],expected.bscInqExchLisRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqExchLisResponseT(inqExchLisResponseT actual, inqExchLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqExchLisResponseT (actual.basic,expected.basic, logMsg);
}

