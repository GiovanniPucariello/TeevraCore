#include <EntHrtBeat.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
entHrtBeatRequestT getEntHrtBeatRequestT(char* testCaseNum , const char *root) {
	entHrtBeatRequestT ventHrtBeatRequestT;
	int i;

	ventHrtBeatRequestT.header = getDataHeaderT(testCaseNum, "entHrtBeatRequestT");	return ventHrtBeatRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entHrtBeatResponseT getEntHrtBeatResponseT(char* testCaseNum , const char *root) {
	entHrtBeatResponseT ventHrtBeatResponseT;
	int i;

	ventHrtBeatResponseT.header = getDataHeaderT(testCaseNum, "entHrtBeatResponseT");	return ventHrtBeatResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntHrtBeatRequestT(entHrtBeatRequestT actual, entHrtBeatRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntHrtBeatResponseT(entHrtBeatResponseT actual, entHrtBeatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

