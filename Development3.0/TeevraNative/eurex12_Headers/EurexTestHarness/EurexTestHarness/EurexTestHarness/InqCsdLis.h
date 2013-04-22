#include <InqCsdLis.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCsdLisRequestT getBscInqCsdLisRequestT(char* testCaseNum , const char *root) {
	bscInqCsdLisRequestT vbscInqCsdLisRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqCsdLisRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCsdLis.bscInqCsdLisRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqCsdLisRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqCsdLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCsdLisRequestT getInqCsdLisRequestT(char* testCaseNum , const char *root) {
	inqCsdLisRequestT vinqCsdLisRequestT;
	int i;

	vinqCsdLisRequestT.header = getDataHeaderT(testCaseNum, "inqCsdLisRequestT");
	vinqCsdLisRequestT.basic = getBscInqCsdLisRequestT(testCaseNum, "inqCsdLisRequestT");	return vinqCsdLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCsdLisResponseT getBscInqCsdLisResponseT(char* testCaseNum , const char *root) {
	bscInqCsdLisResponseT vbscInqCsdLisResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqCsdLisResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqCsdLis.bscInqCsdLisResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqCsdLisResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqCsdLisResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqCsdLis.bscInqCsdLisResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqCsdLisResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqCsdLisResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqCsdLisRecT getExtInqCsdLisRecT(char* testCaseNum , const char *root) {
	extInqCsdLisRecT vextInqCsdLisRecT;
	int i;

	for(i=0;i<DRIV_CSD_ID_LEN;i++) {
		vextInqCsdLisRecT.csdId[i]= ' ';
	}
	char lcsdId[DRIV_CSD_ID_LEN] = {""};
	getStrProperty("InqCsdLis.extInqCsdLisRecT.csdId", lcsdId);
	memcpy(vextInqCsdLisRecT.csdId, lcsdId, DRIV_CSD_ID_LEN);

	for(i=0;i<DRIV_CSD_LNG_NAM_LEN;i++) {
		vextInqCsdLisRecT.csdLngNam[i]= ' ';
	}
	char lcsdLngNam[DRIV_CSD_LNG_NAM_LEN] = {""};
	getStrProperty("InqCsdLis.extInqCsdLisRecT.csdLngNam", lcsdLngNam);
	memcpy(vextInqCsdLisRecT.csdLngNam, lcsdLngNam, DRIV_CSD_LNG_NAM_LEN);
	return vextInqCsdLisRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqCsdLisResponseT getExtInqCsdLisResponseT(char* testCaseNum , const char *root) {
	extInqCsdLisResponseT vextInqCsdLisResponseT;
	int i;
	return vextInqCsdLisResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCsdLisResponseT getInqCsdLisResponseT(char* testCaseNum , const char *root) {
	inqCsdLisResponseT vinqCsdLisResponseT;
	int i;

	vinqCsdLisResponseT.header = getDataHeaderT(testCaseNum, "inqCsdLisResponseT");
	vinqCsdLisResponseT.basic = getBscInqCsdLisResponseT(testCaseNum, "inqCsdLisResponseT");
	vinqCsdLisResponseT.extension = getExtInqCsdLisResponseT(testCaseNum, "inqCsdLisResponseT");	return vinqCsdLisResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCsdLisRequestT(bscInqCsdLisRequestT actual, bscInqCsdLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdLisRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCsdLisRequestT(inqCsdLisRequestT actual, inqCsdLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCsdLisRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCsdLisResponseT(bscInqCsdLisResponseT actual, bscInqCsdLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdLisResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdLisResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqCsdLisRecT(extInqCsdLisRecT actual, extInqCsdLisRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.csdId, expected.csdId, DRIV_CSD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqCsdLisRecT, csdId not matching. Actual %s but Expected %s", actual.csdId, expected.csdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdLngNam, expected.csdLngNam, DRIV_CSD_LNG_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqCsdLisRecT, csdLngNam not matching. Actual %s but Expected %s", actual.csdLngNam, expected.csdLngNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqCsdLisResponseT(extInqCsdLisResponseT actual, extInqCsdLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_CSD_LIS_REC_MAX;i++) {
		compareExtInqCsdLisRecT (actual.extInqCsdLisRec[i],expected.extInqCsdLisRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCsdLisResponseT(inqCsdLisResponseT actual, inqCsdLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCsdLisResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqCsdLisResponseT (actual.extension,expected.extension, logMsg);
}

