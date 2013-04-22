#include <DelStratBlkAuctQuo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelStratBlkAuctQuoRequestT getBscDelStratBlkAuctQuoRequestT(char* testCaseNum , const char *root) {
	bscDelStratBlkAuctQuoRequestT vbscDelStratBlkAuctQuoRequestT;
	int i;

	vbscDelStratBlkAuctQuoRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscDelStratBlkAuctQuoRequestT");
	vbscDelStratBlkAuctQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscDelStratBlkAuctQuoRequestT");	return vbscDelStratBlkAuctQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delStratBlkAuctQuoRequestT getDelStratBlkAuctQuoRequestT(char* testCaseNum , const char *root) {
	delStratBlkAuctQuoRequestT vdelStratBlkAuctQuoRequestT;
	int i;

	vdelStratBlkAuctQuoRequestT.header = getDataHeaderT(testCaseNum, "delStratBlkAuctQuoRequestT");
	vdelStratBlkAuctQuoRequestT.basic = getBscDelStratBlkAuctQuoRequestT(testCaseNum, "delStratBlkAuctQuoRequestT");	return vdelStratBlkAuctQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelStratBlkAuctQuoResponseT getBscDelStratBlkAuctQuoResponseT(char* testCaseNum , const char *root) {
	bscDelStratBlkAuctQuoResponseT vbscDelStratBlkAuctQuoResponseT;
	int i;

	char lbidSidDel[1] = {""};
	getStrProperty("DelStratBlkAuctQuo.bscDelStratBlkAuctQuoResponseT.bidSidDel", lbidSidDel);
	vbscDelStratBlkAuctQuoResponseT.bidSidDel = lbidSidDel[0];

	char laskSidDel[1] = {""};
	getStrProperty("DelStratBlkAuctQuo.bscDelStratBlkAuctQuoResponseT.askSidDel", laskSidDel);
	vbscDelStratBlkAuctQuoResponseT.askSidDel = laskSidDel[0];
	return vbscDelStratBlkAuctQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delStratBlkAuctQuoResponseT getDelStratBlkAuctQuoResponseT(char* testCaseNum , const char *root) {
	delStratBlkAuctQuoResponseT vdelStratBlkAuctQuoResponseT;
	int i;

	vdelStratBlkAuctQuoResponseT.header = getDataHeaderT(testCaseNum, "delStratBlkAuctQuoResponseT");
	vdelStratBlkAuctQuoResponseT.basic = getBscDelStratBlkAuctQuoResponseT(testCaseNum, "delStratBlkAuctQuoResponseT");	return vdelStratBlkAuctQuoResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelStratBlkAuctQuoRequestT(bscDelStratBlkAuctQuoRequestT actual, bscDelStratBlkAuctQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelStratBlkAuctQuoRequestT(delStratBlkAuctQuoRequestT actual, delStratBlkAuctQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelStratBlkAuctQuoRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelStratBlkAuctQuoResponseT(bscDelStratBlkAuctQuoResponseT actual, bscDelStratBlkAuctQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.bidSidDel!= expected.bidSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratBlkAuctQuoResponseT, bidSidDelnot matching. Actual %d but Expected %d", actual.bidSidDel, expected.bidSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.askSidDel!= expected.askSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratBlkAuctQuoResponseT, askSidDelnot matching. Actual %d but Expected %d", actual.askSidDel, expected.askSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelStratBlkAuctQuoResponseT(delStratBlkAuctQuoResponseT actual, delStratBlkAuctQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelStratBlkAuctQuoResponseT (actual.basic,expected.basic, logMsg);
}

