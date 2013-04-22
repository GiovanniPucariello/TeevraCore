#include <InqMktNewsLis.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMktNewsLisRequestT getBscInqMktNewsLisRequestT(char* testCaseNum , const char *root) {
	bscInqMktNewsLisRequestT vbscInqMktNewsLisRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqMktNewsLisRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMktNewsLis.bscInqMktNewsLisRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqMktNewsLisRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqMktNewsLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMktNewsLisRequestT getInqMktNewsLisRequestT(char* testCaseNum , const char *root) {
	inqMktNewsLisRequestT vinqMktNewsLisRequestT;
	int i;

	vinqMktNewsLisRequestT.header = getDataHeaderT(testCaseNum, "inqMktNewsLisRequestT");
	vinqMktNewsLisRequestT.basic = getBscInqMktNewsLisRequestT(testCaseNum, "inqMktNewsLisRequestT");	return vinqMktNewsLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMktNewsLisRecT getBscInqMktNewsLisRecT(char* testCaseNum , const char *root) {
	bscInqMktNewsLisRecT vbscInqMktNewsLisRecT;
	int i;

	for(i=0;i<MSG_SHT_TEXT_LEN;i++) {
		vbscInqMktNewsLisRecT.msgShtText[i]= ' ';
	}
	char lmsgShtText[MSG_SHT_TEXT_LEN] = {""};
	getStrProperty("InqMktNewsLis.bscInqMktNewsLisRecT.msgShtText", lmsgShtText);
	memcpy(vbscInqMktNewsLisRecT.msgShtText, lmsgShtText, MSG_SHT_TEXT_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqMktNewsLisRecT.newsDat[i]= ' ';
	}
	char lnewsDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqMktNewsLis.bscInqMktNewsLisRecT.newsDat", lnewsDat);
	memcpy(vbscInqMktNewsLisRecT.newsDat, lnewsDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqMktNewsLisRecT.newsTim[i]= ' ';
	}
	char lnewsTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqMktNewsLis.bscInqMktNewsLisRecT.newsTim", lnewsTim);
	memcpy(vbscInqMktNewsLisRecT.newsTim, lnewsTim, DRIV_TIME_LEN);
	return vbscInqMktNewsLisRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMktNewsLisResponseT getBscInqMktNewsLisResponseT(char* testCaseNum , const char *root) {
	bscInqMktNewsLisResponseT vbscInqMktNewsLisResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqMktNewsLisResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMktNewsLis.bscInqMktNewsLisResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqMktNewsLisResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqMktNewsLisResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMktNewsLisResponseT getInqMktNewsLisResponseT(char* testCaseNum , const char *root) {
	inqMktNewsLisResponseT vinqMktNewsLisResponseT;
	int i;

	vinqMktNewsLisResponseT.header = getDataHeaderT(testCaseNum, "inqMktNewsLisResponseT");
	vinqMktNewsLisResponseT.basic = getBscInqMktNewsLisResponseT(testCaseNum, "inqMktNewsLisResponseT");	return vinqMktNewsLisResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMktNewsLisRequestT(bscInqMktNewsLisRequestT actual, bscInqMktNewsLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktNewsLisRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMktNewsLisRequestT(inqMktNewsLisRequestT actual, inqMktNewsLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMktNewsLisRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMktNewsLisRecT(bscInqMktNewsLisRecT actual, bscInqMktNewsLisRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.msgShtText, expected.msgShtText, MSG_SHT_TEXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktNewsLisRecT, msgShtText not matching. Actual %s but Expected %s", actual.msgShtText, expected.msgShtText);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.newsDat, expected.newsDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktNewsLisRecT, newsDat not matching. Actual %s but Expected %s", actual.newsDat, expected.newsDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.newsTim, expected.newsTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktNewsLisRecT, newsTim not matching. Actual %s but Expected %s", actual.newsTim, expected.newsTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMktNewsLisResponseT(bscInqMktNewsLisResponseT actual, bscInqMktNewsLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktNewsLisResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_MKT_NEWS_LIS_REC_MAX;i++) {
		compareBscInqMktNewsLisRecT (actual.bscInqMktNewsLisRec[i],expected.bscInqMktNewsLisRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMktNewsLisResponseT(inqMktNewsLisResponseT actual, inqMktNewsLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMktNewsLisResponseT (actual.basic,expected.basic, logMsg);
}

