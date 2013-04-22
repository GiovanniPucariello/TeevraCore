#include <InqTrtleLim.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
inqTrtleLimRequestT getInqTrtleLimRequestT(char* testCaseNum , const char *root) {
	inqTrtleLimRequestT vinqTrtleLimRequestT;
	int i;

	vinqTrtleLimRequestT.header = getDataHeaderT(testCaseNum, "inqTrtleLimRequestT");	return vinqTrtleLimRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqTrtleLimResponseT getBscInqTrtleLimResponseT(char* testCaseNum , const char *root) {
	bscInqTrtleLimResponseT vbscInqTrtleLimResponseT;
	int i;

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqTrtleLimResponseT.trtleLim[i]= ' ';
	}
	char ltrtleLim[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqTrtleLim.bscInqTrtleLimResponseT.trtleLim", ltrtleLim);
	memcpy(vbscInqTrtleLimResponseT.trtleLim, ltrtleLim, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqTrtleLimResponseT.trtleQueSiz[i]= ' ';
	}
	char ltrtleQueSiz[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqTrtleLim.bscInqTrtleLimResponseT.trtleQueSiz", ltrtleQueSiz);
	memcpy(vbscInqTrtleLimResponseT.trtleQueSiz, ltrtleQueSiz, DRIV_VOLUME_LEN);
	return vbscInqTrtleLimResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqTrtleLimResponseT getInqTrtleLimResponseT(char* testCaseNum , const char *root) {
	inqTrtleLimResponseT vinqTrtleLimResponseT;
	int i;

	vinqTrtleLimResponseT.header = getDataHeaderT(testCaseNum, "inqTrtleLimResponseT");
	vinqTrtleLimResponseT.basic = getBscInqTrtleLimResponseT(testCaseNum, "inqTrtleLimResponseT");	return vinqTrtleLimResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqTrtleLimRequestT(inqTrtleLimRequestT actual, inqTrtleLimRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqTrtleLimResponseT(bscInqTrtleLimResponseT actual, bscInqTrtleLimResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trtleLim, expected.trtleLim, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTrtleLimResponseT, trtleLim not matching. Actual %s but Expected %s", actual.trtleLim, expected.trtleLim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trtleQueSiz, expected.trtleQueSiz, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqTrtleLimResponseT, trtleQueSiz not matching. Actual %s but Expected %s", actual.trtleQueSiz, expected.trtleQueSiz);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqTrtleLimResponseT(inqTrtleLimResponseT actual, inqTrtleLimResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqTrtleLimResponseT (actual.basic,expected.basic, logMsg);
}

