#include <DelUsrSecuProf.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelUsrSecuProfRequestT getBscDelUsrSecuProfRequestT(char* testCaseNum , const char *root) {
	bscDelUsrSecuProfRequestT vbscDelUsrSecuProfRequestT;
	int i;

	vbscDelUsrSecuProfRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscDelUsrSecuProfRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscDelUsrSecuProfRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelUsrSecuProf.bscDelUsrSecuProfRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscDelUsrSecuProfRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscDelUsrSecuProfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delUsrSecuProfRequestT getDelUsrSecuProfRequestT(char* testCaseNum , const char *root) {
	delUsrSecuProfRequestT vdelUsrSecuProfRequestT;
	int i;

	vdelUsrSecuProfRequestT.header = getDataHeaderT(testCaseNum, "delUsrSecuProfRequestT");
	vdelUsrSecuProfRequestT.basic = getBscDelUsrSecuProfRequestT(testCaseNum, "delUsrSecuProfRequestT");	return vdelUsrSecuProfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delUsrSecuProfResponseT getDelUsrSecuProfResponseT(char* testCaseNum , const char *root) {
	delUsrSecuProfResponseT vdelUsrSecuProfResponseT;
	int i;

	vdelUsrSecuProfResponseT.header = getDataHeaderT(testCaseNum, "delUsrSecuProfResponseT");	return vdelUsrSecuProfResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelUsrSecuProfRequestT(bscDelUsrSecuProfRequestT actual, bscDelUsrSecuProfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelUsrSecuProfRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelUsrSecuProfRequestT(delUsrSecuProfRequestT actual, delUsrSecuProfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelUsrSecuProfRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelUsrSecuProfResponseT(delUsrSecuProfResponseT actual, delUsrSecuProfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

