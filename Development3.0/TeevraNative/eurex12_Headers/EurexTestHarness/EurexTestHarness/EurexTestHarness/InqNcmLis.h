#include <InqNcmLis.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqNcmLisRequestT getBscInqNcmLisRequestT(char* testCaseNum , const char *root) {
	bscInqNcmLisRequestT vbscInqNcmLisRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqNcmLisRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqNcmLis.bscInqNcmLisRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqNcmLisRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqNcmLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqNcmLisRequestT getInqNcmLisRequestT(char* testCaseNum , const char *root) {
	inqNcmLisRequestT vinqNcmLisRequestT;
	int i;

	vinqNcmLisRequestT.header = getDataHeaderT(testCaseNum, "inqNcmLisRequestT");
	vinqNcmLisRequestT.basic = getBscInqNcmLisRequestT(testCaseNum, "inqNcmLisRequestT");	return vinqNcmLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqNcmLisRecT getBscInqNcmLisRecT(char* testCaseNum , const char *root) {
	bscInqNcmLisRecT vbscInqNcmLisRecT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqNcmLisRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqNcmLis.bscInqNcmLisRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqNcmLisRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	char lrelaSts[1] = {""};
	getStrProperty("InqNcmLis.bscInqNcmLisRecT.relaSts", lrelaSts);
	vbscInqNcmLisRecT.relaSts = lrelaSts[0];
	return vbscInqNcmLisRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqNcmLisResponseT getBscInqNcmLisResponseT(char* testCaseNum , const char *root) {
	bscInqNcmLisResponseT vbscInqNcmLisResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqNcmLisResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqNcmLis.bscInqNcmLisResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqNcmLisResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqNcmLisResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqNcmLis.bscInqNcmLisResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqNcmLisResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqNcmLisResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqNcmLisResponseT getInqNcmLisResponseT(char* testCaseNum , const char *root) {
	inqNcmLisResponseT vinqNcmLisResponseT;
	int i;

	vinqNcmLisResponseT.header = getDataHeaderT(testCaseNum, "inqNcmLisResponseT");
	vinqNcmLisResponseT.basic = getBscInqNcmLisResponseT(testCaseNum, "inqNcmLisResponseT");	return vinqNcmLisResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqNcmLisRequestT(bscInqNcmLisRequestT actual, bscInqNcmLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqNcmLisRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqNcmLisRequestT(inqNcmLisRequestT actual, inqNcmLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqNcmLisRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqNcmLisRecT(bscInqNcmLisRecT actual, bscInqNcmLisRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqNcmLisRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.relaSts!= expected.relaSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqNcmLisRecT, relaStsnot matching. Actual %d but Expected %d", actual.relaSts, expected.relaSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqNcmLisResponseT(bscInqNcmLisResponseT actual, bscInqNcmLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqNcmLisResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqNcmLisResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_NCM_LIS_REC_MAX;i++) {
		compareBscInqNcmLisRecT (actual.bscInqNcmLisRec[i],expected.bscInqNcmLisRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqNcmLisResponseT(inqNcmLisResponseT actual, inqNcmLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqNcmLisResponseT (actual.basic,expected.basic, logMsg);
}

