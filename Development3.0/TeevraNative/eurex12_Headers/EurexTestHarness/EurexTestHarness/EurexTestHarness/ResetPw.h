#include <ResetPw.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscResetPwRequestT getBscResetPwRequestT(char* testCaseNum , const char *root) {
	bscResetPwRequestT vbscResetPwRequestT;
	int i;

	vbscResetPwRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscResetPwRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscResetPwRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ResetPw.bscResetPwRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscResetPwRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscResetPwRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
resetPwRequestT getResetPwRequestT(char* testCaseNum , const char *root) {
	resetPwRequestT vresetPwRequestT;
	int i;

	vresetPwRequestT.header = getDataHeaderT(testCaseNum, "resetPwRequestT");
	vresetPwRequestT.basic = getBscResetPwRequestT(testCaseNum, "resetPwRequestT");	return vresetPwRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscResetPwResponseT getBscResetPwResponseT(char* testCaseNum , const char *root) {
	bscResetPwResponseT vbscResetPwResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscResetPwResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ResetPw.bscResetPwResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscResetPwResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscResetPwResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
resetPwResponseT getResetPwResponseT(char* testCaseNum , const char *root) {
	resetPwResponseT vresetPwResponseT;
	int i;

	vresetPwResponseT.header = getDataHeaderT(testCaseNum, "resetPwResponseT");
	vresetPwResponseT.basic = getBscResetPwResponseT(testCaseNum, "resetPwResponseT");	return vresetPwResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscResetPwRequestT(bscResetPwRequestT actual, bscResetPwRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscResetPwRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareResetPwRequestT(resetPwRequestT actual, resetPwRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscResetPwRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscResetPwResponseT(bscResetPwResponseT actual, bscResetPwResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscResetPwResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareResetPwResponseT(resetPwResponseT actual, resetPwResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscResetPwResponseT (actual.basic,expected.basic, logMsg);
}

