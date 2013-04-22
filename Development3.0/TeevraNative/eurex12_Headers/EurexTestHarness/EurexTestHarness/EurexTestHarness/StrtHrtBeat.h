#include <StrtHrtBeat.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
strtHrtBeatRequestT getStrtHrtBeatRequestT(char* testCaseNum , const char *root) {
	strtHrtBeatRequestT vstrtHrtBeatRequestT;
	int i;

	vstrtHrtBeatRequestT.header = getDataHeaderT(testCaseNum, "strtHrtBeatRequestT");	return vstrtHrtBeatRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscStrtHrtBeatResponseT getBscStrtHrtBeatResponseT(char* testCaseNum , const char *root) {
	bscStrtHrtBeatResponseT vbscStrtHrtBeatResponseT;
	int i;

	for(i=0;i<HRT_BT_INTVL_SEC_LEN;i++) {
		vbscStrtHrtBeatResponseT.hrtBeatIntvlSec[i]= ' ';
	}
	char lhrtBeatIntvlSec[HRT_BT_INTVL_SEC_LEN] = {""};
	getStrProperty("StrtHrtBeat.bscStrtHrtBeatResponseT.hrtBeatIntvlSec", lhrtBeatIntvlSec);
	memcpy(vbscStrtHrtBeatResponseT.hrtBeatIntvlSec, lhrtBeatIntvlSec, HRT_BT_INTVL_SEC_LEN);
	return vbscStrtHrtBeatResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
strtHrtBeatResponseT getStrtHrtBeatResponseT(char* testCaseNum , const char *root) {
	strtHrtBeatResponseT vstrtHrtBeatResponseT;
	int i;

	vstrtHrtBeatResponseT.header = getDataHeaderT(testCaseNum, "strtHrtBeatResponseT");
	vstrtHrtBeatResponseT.basic = getBscStrtHrtBeatResponseT(testCaseNum, "strtHrtBeatResponseT");	return vstrtHrtBeatResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareStrtHrtBeatRequestT(strtHrtBeatRequestT actual, strtHrtBeatRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscStrtHrtBeatResponseT(bscStrtHrtBeatResponseT actual, bscStrtHrtBeatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.hrtBeatIntvlSec, expected.hrtBeatIntvlSec, HRT_BT_INTVL_SEC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscStrtHrtBeatResponseT, hrtBeatIntvlSec not matching. Actual %s but Expected %s", actual.hrtBeatIntvlSec, expected.hrtBeatIntvlSec);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareStrtHrtBeatResponseT(strtHrtBeatResponseT actual, strtHrtBeatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscStrtHrtBeatResponseT (actual.basic,expected.basic, logMsg);
}

