#include <StopHrtBeat.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscStopHrtBeatRequestT getBscStopHrtBeatRequestT(char* testCaseNum , const char *root) {
	bscStopHrtBeatRequestT vbscStopHrtBeatRequestT;
	int i;

	char lquoDelInd[1] = {""};
	getStrProperty("StopHrtBeat.bscStopHrtBeatRequestT.quoDelInd", lquoDelInd);
	vbscStopHrtBeatRequestT.quoDelInd = lquoDelInd[0];
	return vbscStopHrtBeatRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
stopHrtBeatRequestT getStopHrtBeatRequestT(char* testCaseNum , const char *root) {
	stopHrtBeatRequestT vstopHrtBeatRequestT;
	int i;

	vstopHrtBeatRequestT.header = getDataHeaderT(testCaseNum, "stopHrtBeatRequestT");
	vstopHrtBeatRequestT.basic = getBscStopHrtBeatRequestT(testCaseNum, "stopHrtBeatRequestT");	return vstopHrtBeatRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
stopHrtBeatResponseT getStopHrtBeatResponseT(char* testCaseNum , const char *root) {
	stopHrtBeatResponseT vstopHrtBeatResponseT;
	int i;

	vstopHrtBeatResponseT.header = getDataHeaderT(testCaseNum, "stopHrtBeatResponseT");	return vstopHrtBeatResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscStopHrtBeatRequestT(bscStopHrtBeatRequestT actual, bscStopHrtBeatRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.quoDelInd!= expected.quoDelInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscStopHrtBeatRequestT, quoDelIndnot matching. Actual %d but Expected %d", actual.quoDelInd, expected.quoDelInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareStopHrtBeatRequestT(stopHrtBeatRequestT actual, stopHrtBeatRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscStopHrtBeatRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareStopHrtBeatResponseT(stopHrtBeatResponseT actual, stopHrtBeatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

