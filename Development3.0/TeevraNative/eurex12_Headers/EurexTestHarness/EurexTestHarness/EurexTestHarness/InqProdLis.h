#include <InqProdLis.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdLisRequestT getBscInqProdLisRequestT(char* testCaseNum , const char *root) {
	bscInqProdLisRequestT vbscInqProdLisRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqProdLisRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProdLis.bscInqProdLisRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqProdLisRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqProdLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdLisRequestT getInqProdLisRequestT(char* testCaseNum , const char *root) {
	inqProdLisRequestT vinqProdLisRequestT;
	int i;

	vinqProdLisRequestT.header = getDataHeaderT(testCaseNum, "inqProdLisRequestT");
	vinqProdLisRequestT.basic = getBscInqProdLisRequestT(testCaseNum, "inqProdLisRequestT");	return vinqProdLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdLisRecT getBscInqProdLisRecT(char* testCaseNum , const char *root) {
	bscInqProdLisRecT vbscInqProdLisRecT;
	int i;

	for(i=0;i<PROD_TYP_ID_LEN;i++) {
		vbscInqProdLisRecT.prodTypId[i]= ' ';
	}
	char lprodTypId[PROD_TYP_ID_LEN] = {""};
	getStrProperty("InqProdLis.bscInqProdLisRecT.prodTypId", lprodTypId);
	memcpy(vbscInqProdLisRecT.prodTypId, lprodTypId, PROD_TYP_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqProdLisRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqProdLis.bscInqProdLisRecT.prodId", lprodId);
	memcpy(vbscInqProdLisRecT.prodId, lprodId, PROD_ID_LEN);
	return vbscInqProdLisRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdLisResponseT getBscInqProdLisResponseT(char* testCaseNum , const char *root) {
	bscInqProdLisResponseT vbscInqProdLisResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqProdLisResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProdLis.bscInqProdLisResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqProdLisResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqProdLisResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqProdLis.bscInqProdLisResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqProdLisResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqProdLisResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdLisResponseT getInqProdLisResponseT(char* testCaseNum , const char *root) {
	inqProdLisResponseT vinqProdLisResponseT;
	int i;

	vinqProdLisResponseT.header = getDataHeaderT(testCaseNum, "inqProdLisResponseT");
	vinqProdLisResponseT.basic = getBscInqProdLisResponseT(testCaseNum, "inqProdLisResponseT");	return vinqProdLisResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdLisRequestT(bscInqProdLisRequestT actual, bscInqProdLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdLisRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdLisRequestT(inqProdLisRequestT actual, inqProdLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdLisRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdLisRecT(bscInqProdLisRecT actual, bscInqProdLisRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodTypId, expected.prodTypId, PROD_TYP_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdLisRecT, prodTypId not matching. Actual %s but Expected %s", actual.prodTypId, expected.prodTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdLisRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdLisResponseT(bscInqProdLisResponseT actual, bscInqProdLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdLisResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdLisResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_PROD_LIS_REC_MAX;i++) {
		compareBscInqProdLisRecT (actual.bscInqProdLisRec[i],expected.bscInqProdLisRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdLisResponseT(inqProdLisResponseT actual, inqProdLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdLisResponseT (actual.basic,expected.basic, logMsg);
}

