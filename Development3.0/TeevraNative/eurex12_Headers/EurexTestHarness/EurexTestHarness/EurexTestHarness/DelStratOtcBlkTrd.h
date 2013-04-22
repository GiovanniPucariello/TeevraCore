#include <DelStratOtcBlkTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelStratOtcBlkTrdRequestT getBscDelStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	bscDelStratOtcBlkTrdRequestT vbscDelStratOtcBlkTrdRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscDelStratOtcBlkTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelStratOtcBlkTrd.bscDelStratOtcBlkTrdRequestT.prodId", lprodId);
	memcpy(vbscDelStratOtcBlkTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscDelStratOtcBlkTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DelStratOtcBlkTrd.bscDelStratOtcBlkTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vbscDelStratOtcBlkTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vbscDelStratOtcBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscDelStratOtcBlkTrdRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscDelStratOtcBlkTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelStratOtcBlkTrd.bscDelStratOtcBlkTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscDelStratOtcBlkTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscDelStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delStratOtcBlkTrdRequestT getDelStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	delStratOtcBlkTrdRequestT vdelStratOtcBlkTrdRequestT;
	int i;

	vdelStratOtcBlkTrdRequestT.header = getDataHeaderT(testCaseNum, "delStratOtcBlkTrdRequestT");
	vdelStratOtcBlkTrdRequestT.basic = getBscDelStratOtcBlkTrdRequestT(testCaseNum, "delStratOtcBlkTrdRequestT");	return vdelStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delStratOtcBlkTrdResponseT getDelStratOtcBlkTrdResponseT(char* testCaseNum , const char *root) {
	delStratOtcBlkTrdResponseT vdelStratOtcBlkTrdResponseT;
	int i;

	vdelStratOtcBlkTrdResponseT.header = getDataHeaderT(testCaseNum, "delStratOtcBlkTrdResponseT");	return vdelStratOtcBlkTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelStratOtcBlkTrdRequestT(bscDelStratOtcBlkTrdRequestT actual, bscDelStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratOtcBlkTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratOtcBlkTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratOtcBlkTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelStratOtcBlkTrdRequestT(delStratOtcBlkTrdRequestT actual, delStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelStratOtcBlkTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelStratOtcBlkTrdResponseT(delStratOtcBlkTrdResponseT actual, delStratOtcBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

