#include <DelStratBlkAuctReq.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelStratBlkAuctReqRequestT getBscDelStratBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	bscDelStratBlkAuctReqRequestT vbscDelStratBlkAuctReqRequestT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscDelStratBlkAuctReqRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelStratBlkAuctReq.bscDelStratBlkAuctReqRequestT.ordrNo", lordrNo);
	memcpy(vbscDelStratBlkAuctReqRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	vbscDelStratBlkAuctReqRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscDelStratBlkAuctReqRequestT");
	vbscDelStratBlkAuctReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscDelStratBlkAuctReqRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscDelStratBlkAuctReqRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelStratBlkAuctReq.bscDelStratBlkAuctReqRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscDelStratBlkAuctReqRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscDelStratBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delStratBlkAuctReqRequestT getDelStratBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	delStratBlkAuctReqRequestT vdelStratBlkAuctReqRequestT;
	int i;

	vdelStratBlkAuctReqRequestT.header = getDataHeaderT(testCaseNum, "delStratBlkAuctReqRequestT");
	vdelStratBlkAuctReqRequestT.basic = getBscDelStratBlkAuctReqRequestT(testCaseNum, "delStratBlkAuctReqRequestT");	return vdelStratBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delStratBlkAuctReqResponseT getDelStratBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	delStratBlkAuctReqResponseT vdelStratBlkAuctReqResponseT;
	int i;

	vdelStratBlkAuctReqResponseT.header = getDataHeaderT(testCaseNum, "delStratBlkAuctReqResponseT");	return vdelStratBlkAuctReqResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelStratBlkAuctReqRequestT(bscDelStratBlkAuctReqRequestT actual, bscDelStratBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratBlkAuctReqRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratBlkAuctReqRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelStratBlkAuctReqRequestT(delStratBlkAuctReqRequestT actual, delStratBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelStratBlkAuctReqRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelStratBlkAuctReqResponseT(delStratBlkAuctReqResponseT actual, delStratBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

