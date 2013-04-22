#include <InqUsrLis.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqUsrLisRequestT getBscInqUsrLisRequestT(char* testCaseNum , const char *root) {
	bscInqUsrLisRequestT vbscInqUsrLisRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqUsrLisRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqUsrLis.bscInqUsrLisRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqUsrLisRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqUsrLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqUsrLisRequestT getInqUsrLisRequestT(char* testCaseNum , const char *root) {
	inqUsrLisRequestT vinqUsrLisRequestT;
	int i;

	vinqUsrLisRequestT.header = getDataHeaderT(testCaseNum, "inqUsrLisRequestT");
	vinqUsrLisRequestT.basic = getBscInqUsrLisRequestT(testCaseNum, "inqUsrLisRequestT");	return vinqUsrLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqUsrLisRecT getBscInqUsrLisRecT(char* testCaseNum , const char *root) {
	bscInqUsrLisRecT vbscInqUsrLisRecT;
	int i;

	vbscInqUsrLisRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqUsrLisRecT");	return vbscInqUsrLisRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqUsrLisResponseT getBscInqUsrLisResponseT(char* testCaseNum , const char *root) {
	bscInqUsrLisResponseT vbscInqUsrLisResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqUsrLisResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqUsrLis.bscInqUsrLisResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqUsrLisResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqUsrLisResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqUsrLis.bscInqUsrLisResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqUsrLisResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqUsrLisResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqUsrLisResponseT getInqUsrLisResponseT(char* testCaseNum , const char *root) {
	inqUsrLisResponseT vinqUsrLisResponseT;
	int i;

	vinqUsrLisResponseT.header = getDataHeaderT(testCaseNum, "inqUsrLisResponseT");
	vinqUsrLisResponseT.basic = getBscInqUsrLisResponseT(testCaseNum, "inqUsrLisResponseT");	return vinqUsrLisResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqUsrLisRequestT(bscInqUsrLisRequestT actual, bscInqUsrLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqUsrLisRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqUsrLisRequestT(inqUsrLisRequestT actual, inqUsrLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqUsrLisRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqUsrLisRecT(bscInqUsrLisRecT actual, bscInqUsrLisRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqUsrLisResponseT(bscInqUsrLisResponseT actual, bscInqUsrLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqUsrLisResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqUsrLisResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_USR_LIS_REC_MAX;i++) {
		compareBscInqUsrLisRecT (actual.bscInqUsrLisRec[i],expected.bscInqUsrLisRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqUsrLisResponseT(inqUsrLisResponseT actual, inqUsrLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqUsrLisResponseT (actual.basic,expected.basic, logMsg);
}

