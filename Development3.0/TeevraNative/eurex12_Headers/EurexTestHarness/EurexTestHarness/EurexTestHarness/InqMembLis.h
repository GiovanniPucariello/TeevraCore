#include <InqMembLis.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembLisRequestT getBscInqMembLisRequestT(char* testCaseNum , const char *root) {
	bscInqMembLisRequestT vbscInqMembLisRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqMembLisRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMembLis.bscInqMembLisRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqMembLisRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqMembLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMembLisRequestT getInqMembLisRequestT(char* testCaseNum , const char *root) {
	inqMembLisRequestT vinqMembLisRequestT;
	int i;

	vinqMembLisRequestT.header = getDataHeaderT(testCaseNum, "inqMembLisRequestT");
	vinqMembLisRequestT.basic = getBscInqMembLisRequestT(testCaseNum, "inqMembLisRequestT");	return vinqMembLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembLisRecT getBscInqMembLisRecT(char* testCaseNum , const char *root) {
	bscInqMembLisRecT vbscInqMembLisRecT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqMembLisRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqMembLis.bscInqMembLisRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqMembLisRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	char lclgMembTypCod[1] = {""};
	getStrProperty("InqMembLis.bscInqMembLisRecT.clgMembTypCod", lclgMembTypCod);
	vbscInqMembLisRecT.clgMembTypCod = lclgMembTypCod[0];

	for(i=0;i<DRIV_MEMB_EXCH_LNG_NAM_LEN;i++) {
		vbscInqMembLisRecT.membExchLngNam[i]= ' ';
	}
	char lmembExchLngNam[DRIV_MEMB_EXCH_LNG_NAM_LEN] = {""};
	getStrProperty("InqMembLis.bscInqMembLisRecT.membExchLngNam", lmembExchLngNam);
	memcpy(vbscInqMembLisRecT.membExchLngNam, lmembExchLngNam, DRIV_MEMB_EXCH_LNG_NAM_LEN);

	char lmembStsCod[1] = {""};
	getStrProperty("InqMembLis.bscInqMembLisRecT.membStsCod", lmembStsCod);
	vbscInqMembLisRecT.membStsCod = lmembStsCod[0];

	char lmembHltByMsInd[1] = {""};
	getStrProperty("InqMembLis.bscInqMembLisRecT.membHltByMsInd", lmembHltByMsInd);
	vbscInqMembLisRecT.membHltByMsInd = lmembHltByMsInd[0];
	return vbscInqMembLisRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembLisResponseT getBscInqMembLisResponseT(char* testCaseNum , const char *root) {
	bscInqMembLisResponseT vbscInqMembLisResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqMembLisResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMembLis.bscInqMembLisResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqMembLisResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqMembLisResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqMembLis.bscInqMembLisResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqMembLisResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqMembLisResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMembLisResponseT getInqMembLisResponseT(char* testCaseNum , const char *root) {
	inqMembLisResponseT vinqMembLisResponseT;
	int i;

	vinqMembLisResponseT.header = getDataHeaderT(testCaseNum, "inqMembLisResponseT");
	vinqMembLisResponseT.basic = getBscInqMembLisResponseT(testCaseNum, "inqMembLisResponseT");	return vinqMembLisResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembLisRequestT(bscInqMembLisRequestT actual, bscInqMembLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembLisRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMembLisRequestT(inqMembLisRequestT actual, inqMembLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMembLisRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembLisRecT(bscInqMembLisRecT actual, bscInqMembLisRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembLisRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.clgMembTypCod!= expected.clgMembTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembLisRecT, clgMembTypCodnot matching. Actual %d but Expected %d", actual.clgMembTypCod, expected.clgMembTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchLngNam, expected.membExchLngNam, DRIV_MEMB_EXCH_LNG_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembLisRecT, membExchLngNam not matching. Actual %s but Expected %s", actual.membExchLngNam, expected.membExchLngNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.membStsCod!= expected.membStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembLisRecT, membStsCodnot matching. Actual %d but Expected %d", actual.membStsCod, expected.membStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.membHltByMsInd!= expected.membHltByMsInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembLisRecT, membHltByMsIndnot matching. Actual %d but Expected %d", actual.membHltByMsInd, expected.membHltByMsInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembLisResponseT(bscInqMembLisResponseT actual, bscInqMembLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembLisResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembLisResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_MEMB_LIS_REC_MAX;i++) {
		compareBscInqMembLisRecT (actual.bscInqMembLisRec[i],expected.bscInqMembLisRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMembLisResponseT(inqMembLisResponseT actual, inqMembLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMembLisResponseT (actual.basic,expected.basic, logMsg);
}

