#include <EntStratReq.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratReqRequestT getBscEntStratReqRequestT(char* testCaseNum , const char *root) {
	bscEntStratReqRequestT vbscEntStratReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntStratReq.bscEntStratReqRequestT.buyCod", lbuyCod);
	vbscEntStratReqRequestT.buyCod = lbuyCod[0];

	vbscEntStratReqRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscEntStratReqRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratReqRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratReq.bscEntStratReqRequestT.ordrQty", lordrQty);
	memcpy(vbscEntStratReqRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);
	return vbscEntStratReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratReqRequestT getEntStratReqRequestT(char* testCaseNum , const char *root) {
	entStratReqRequestT ventStratReqRequestT;
	int i;

	ventStratReqRequestT.header = getDataHeaderT(testCaseNum, "entStratReqRequestT");
	ventStratReqRequestT.basic = getBscEntStratReqRequestT(testCaseNum, "entStratReqRequestT");	return ventStratReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratReqResponseT getBscEntStratReqResponseT(char* testCaseNum , const char *root) {
	bscEntStratReqResponseT vbscEntStratReqResponseT;
	int i;

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscEntStratReqResponseT.stratReqTim[i]= ' ';
	}
	char lstratReqTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntStratReq.bscEntStratReqResponseT.stratReqTim", lstratReqTim);
	memcpy(vbscEntStratReqResponseT.stratReqTim, lstratReqTim, DRIV_TIME_LEN);
	return vbscEntStratReqResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratReqResponseT getEntStratReqResponseT(char* testCaseNum , const char *root) {
	entStratReqResponseT ventStratReqResponseT;
	int i;

	ventStratReqResponseT.header = getDataHeaderT(testCaseNum, "entStratReqResponseT");
	ventStratReqResponseT.basic = getBscEntStratReqResponseT(testCaseNum, "entStratReqResponseT");	return ventStratReqResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratReqRequestT(bscEntStratReqRequestT actual, bscEntStratReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratReqRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratReqRequestT(entStratReqRequestT actual, entStratReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratReqRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratReqResponseT(bscEntStratReqResponseT actual, bscEntStratReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.stratReqTim, expected.stratReqTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratReqResponseT, stratReqTim not matching. Actual %s but Expected %s", actual.stratReqTim, expected.stratReqTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratReqResponseT(entStratReqResponseT actual, entStratReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratReqResponseT (actual.basic,expected.basic, logMsg);
}

