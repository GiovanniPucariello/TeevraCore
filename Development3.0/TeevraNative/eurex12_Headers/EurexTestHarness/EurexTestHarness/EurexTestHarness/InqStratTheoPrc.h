#include <InqStratTheoPrc.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratTheoPrcRequestT getBscInqStratTheoPrcRequestT(char* testCaseNum , const char *root) {
	bscInqStratTheoPrcRequestT vbscInqStratTheoPrcRequestT;
	int i;

	vbscInqStratTheoPrcRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscInqStratTheoPrcRequestT");
	vbscInqStratTheoPrcRequestT.stratEquLegGrp = getStratEquLegGrpT(testCaseNum, "bscInqStratTheoPrcRequestT");	return vbscInqStratTheoPrcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqStratTheoPrcRequestT getInqStratTheoPrcRequestT(char* testCaseNum , const char *root) {
	inqStratTheoPrcRequestT vinqStratTheoPrcRequestT;
	int i;

	vinqStratTheoPrcRequestT.header = getDataHeaderT(testCaseNum, "inqStratTheoPrcRequestT");
	vinqStratTheoPrcRequestT.basic = getBscInqStratTheoPrcRequestT(testCaseNum, "inqStratTheoPrcRequestT");	return vinqStratTheoPrcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratTheoPrcResponseT getBscInqStratTheoPrcResponseT(char* testCaseNum , const char *root) {
	bscInqStratTheoPrcResponseT vbscInqStratTheoPrcResponseT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqStratTheoPrcResponseT.theoPrc[i]= ' ';
	}
	char ltheoPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqStratTheoPrc.bscInqStratTheoPrcResponseT.theoPrc", ltheoPrc);
	memcpy(vbscInqStratTheoPrcResponseT.theoPrc, ltheoPrc, DRIV_PRICE_LEN);
	return vbscInqStratTheoPrcResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqStratTheoPrcResponseT getInqStratTheoPrcResponseT(char* testCaseNum , const char *root) {
	inqStratTheoPrcResponseT vinqStratTheoPrcResponseT;
	int i;

	vinqStratTheoPrcResponseT.header = getDataHeaderT(testCaseNum, "inqStratTheoPrcResponseT");
	vinqStratTheoPrcResponseT.basic = getBscInqStratTheoPrcResponseT(testCaseNum, "inqStratTheoPrcResponseT");	return vinqStratTheoPrcResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratTheoPrcRequestT(bscInqStratTheoPrcRequestT actual, bscInqStratTheoPrcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareStratEquLegGrpT (actual.stratEquLegGrp,expected.stratEquLegGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqStratTheoPrcRequestT(inqStratTheoPrcRequestT actual, inqStratTheoPrcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqStratTheoPrcRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratTheoPrcResponseT(bscInqStratTheoPrcResponseT actual, bscInqStratTheoPrcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.theoPrc, expected.theoPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratTheoPrcResponseT, theoPrc not matching. Actual %s but Expected %s", actual.theoPrc, expected.theoPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqStratTheoPrcResponseT(inqStratTheoPrcResponseT actual, inqStratTheoPrcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqStratTheoPrcResponseT (actual.basic,expected.basic, logMsg);
}

