#include <InqPinProc.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqPinProcRequestT getBscInqPinProcRequestT(char* testCaseNum , const char *root) {
	bscInqPinProcRequestT vbscInqPinProcRequestT;
	int i;

	vbscInqPinProcRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqPinProcRequestT");
	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqPinProcRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPinProc.bscInqPinProcRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqPinProcRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqPinProcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqPinProcRequestT getInqPinProcRequestT(char* testCaseNum , const char *root) {
	inqPinProcRequestT vinqPinProcRequestT;
	int i;

	vinqPinProcRequestT.header = getDataHeaderT(testCaseNum, "inqPinProcRequestT");
	vinqPinProcRequestT.basic = getBscInqPinProcRequestT(testCaseNum, "inqPinProcRequestT");	return vinqPinProcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqPinProcRecT getBscInqPinProcRecT(char* testCaseNum , const char *root) {
	bscInqPinProcRecT vbscInqPinProcRecT;
	int i;

	vbscInqPinProcRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqPinProcRecT");
	vbscInqPinProcRecT.pinGrp = getPinGrpT(testCaseNum, "bscInqPinProcRecT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqPinProcRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqPinProc.bscInqPinProcRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqPinProcRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqPinProcRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqPinProcResponseT getBscInqPinProcResponseT(char* testCaseNum , const char *root) {
	bscInqPinProcResponseT vbscInqPinProcResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqPinProcResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPinProc.bscInqPinProcResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqPinProcResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqPinProcResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqPinProc.bscInqPinProcResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqPinProcResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqPinProcResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqPinProcResponseT getInqPinProcResponseT(char* testCaseNum , const char *root) {
	inqPinProcResponseT vinqPinProcResponseT;
	int i;

	vinqPinProcResponseT.header = getDataHeaderT(testCaseNum, "inqPinProcResponseT");
	vinqPinProcResponseT.basic = getBscInqPinProcResponseT(testCaseNum, "inqPinProcResponseT");	return vinqPinProcResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqPinProcRequestT(bscInqPinProcRequestT actual, bscInqPinProcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPinProcRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqPinProcRequestT(inqPinProcRequestT actual, inqPinProcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqPinProcRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqPinProcRecT(bscInqPinProcRecT actual, bscInqPinProcRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	comparePinGrpT (actual.pinGrp,expected.pinGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPinProcRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqPinProcResponseT(bscInqPinProcResponseT actual, bscInqPinProcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPinProcResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPinProcResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_PIN_PROC_REC_MAX;i++) {
		compareBscInqPinProcRecT (actual.bscInqPinProcRec[i],expected.bscInqPinProcRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqPinProcResponseT(inqPinProcResponseT actual, inqPinProcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqPinProcResponseT (actual.basic,expected.basic, logMsg);
}

