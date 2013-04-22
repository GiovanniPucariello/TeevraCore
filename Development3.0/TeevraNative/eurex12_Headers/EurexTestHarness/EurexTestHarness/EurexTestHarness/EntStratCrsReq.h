#include <EntStratCrsReq.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratCrsReqRequestT getBscEntStratCrsReqRequestT(char* testCaseNum , const char *root) {
	bscEntStratCrsReqRequestT vbscEntStratCrsReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntStratCrsReq.bscEntStratCrsReqRequestT.buyCod", lbuyCod);
	vbscEntStratCrsReqRequestT.buyCod = lbuyCod[0];

	vbscEntStratCrsReqRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscEntStratCrsReqRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratCrsReqRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratCrsReq.bscEntStratCrsReqRequestT.ordrQty", lordrQty);
	memcpy(vbscEntStratCrsReqRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);
	return vbscEntStratCrsReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratCrsReqRequestT getEntStratCrsReqRequestT(char* testCaseNum , const char *root) {
	entStratCrsReqRequestT ventStratCrsReqRequestT;
	int i;

	ventStratCrsReqRequestT.header = getDataHeaderT(testCaseNum, "entStratCrsReqRequestT");
	ventStratCrsReqRequestT.basic = getBscEntStratCrsReqRequestT(testCaseNum, "entStratCrsReqRequestT");	return ventStratCrsReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratCrsReqResponseT getEntStratCrsReqResponseT(char* testCaseNum , const char *root) {
	entStratCrsReqResponseT ventStratCrsReqResponseT;
	int i;

	ventStratCrsReqResponseT.header = getDataHeaderT(testCaseNum, "entStratCrsReqResponseT");	return ventStratCrsReqResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratCrsReqRequestT(bscEntStratCrsReqRequestT actual, bscEntStratCrsReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratCrsReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratCrsReqRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratCrsReqRequestT(entStratCrsReqRequestT actual, entStratCrsReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratCrsReqRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratCrsReqResponseT(entStratCrsReqResponseT actual, entStratCrsReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

