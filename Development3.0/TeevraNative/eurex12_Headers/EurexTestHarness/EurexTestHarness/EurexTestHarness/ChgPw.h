#include <ChgPw.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscChgPwRequestT getBscChgPwRequestT(char* testCaseNum , const char *root) {
	bscChgPwRequestT vbscChgPwRequestT;
	int i;

	for(i=0;i<NEW_PW_LEN;i++) {
		vbscChgPwRequestT.newPw[i]= ' ';
	}
	char lnewPw[NEW_PW_LEN] = {""};
	getStrProperty("ChgPw.bscChgPwRequestT.newPw", lnewPw);
	memcpy(vbscChgPwRequestT.newPw, lnewPw, NEW_PW_LEN);

	for(i=0;i<OLD_PW_LEN;i++) {
		vbscChgPwRequestT.oldPw[i]= ' ';
	}
	char loldPw[OLD_PW_LEN] = {""};
	getStrProperty("ChgPw.bscChgPwRequestT.oldPw", loldPw);
	memcpy(vbscChgPwRequestT.oldPw, loldPw, OLD_PW_LEN);
	return vbscChgPwRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
chgPwRequestT getChgPwRequestT(char* testCaseNum , const char *root) {
	chgPwRequestT vchgPwRequestT;
	int i;

	vchgPwRequestT.header = getDataHeaderT(testCaseNum, "chgPwRequestT");
	vchgPwRequestT.basic = getBscChgPwRequestT(testCaseNum, "chgPwRequestT");	return vchgPwRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
chgPwResponseT getChgPwResponseT(char* testCaseNum , const char *root) {
	chgPwResponseT vchgPwResponseT;
	int i;

	vchgPwResponseT.header = getDataHeaderT(testCaseNum, "chgPwResponseT");	return vchgPwResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscChgPwRequestT(bscChgPwRequestT actual, bscChgPwRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.newPw, expected.newPw, NEW_PW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscChgPwRequestT, newPw not matching. Actual %s but Expected %s", actual.newPw, expected.newPw);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.oldPw, expected.oldPw, OLD_PW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscChgPwRequestT, oldPw not matching. Actual %s but Expected %s", actual.oldPw, expected.oldPw);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareChgPwRequestT(chgPwRequestT actual, chgPwRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscChgPwRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareChgPwResponseT(chgPwResponseT actual, chgPwResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

