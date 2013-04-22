#include <InqUsrSecuProf.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqUsrSecuProfRequestT getBscInqUsrSecuProfRequestT(char* testCaseNum , const char *root) {
	bscInqUsrSecuProfRequestT vbscInqUsrSecuProfRequestT;
	int i;

	vbscInqUsrSecuProfRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqUsrSecuProfRequestT");	return vbscInqUsrSecuProfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqUsrSecuProfRequestT getInqUsrSecuProfRequestT(char* testCaseNum , const char *root) {
	inqUsrSecuProfRequestT vinqUsrSecuProfRequestT;
	int i;

	vinqUsrSecuProfRequestT.header = getDataHeaderT(testCaseNum, "inqUsrSecuProfRequestT");
	vinqUsrSecuProfRequestT.basic = getBscInqUsrSecuProfRequestT(testCaseNum, "inqUsrSecuProfRequestT");	return vinqUsrSecuProfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqUsrSecuProfResponseT getBscInqUsrSecuProfResponseT(char* testCaseNum , const char *root) {
	bscInqUsrSecuProfResponseT vbscInqUsrSecuProfResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqUsrSecuProfResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqUsrSecuProf.bscInqUsrSecuProfResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqUsrSecuProfResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqUsrSecuProfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqUsrSecuProfResponseT getExtInqUsrSecuProfResponseT(char* testCaseNum , const char *root) {
	extInqUsrSecuProfResponseT vextInqUsrSecuProfResponseT;
	int i;

	for(i=0;i<RSRC_ACC_LVL_NO_LEN;i++) {
		vextInqUsrSecuProfResponseT.rsrcAccLvlNo[i]= ' ';
	}
	char lrsrcAccLvlNo[RSRC_ACC_LVL_NO_LEN] = {""};
	getStrProperty("InqUsrSecuProf.extInqUsrSecuProfResponseT.rsrcAccLvlNo", lrsrcAccLvlNo);
	memcpy(vextInqUsrSecuProfResponseT.rsrcAccLvlNo, lrsrcAccLvlNo, RSRC_ACC_LVL_NO_LEN);
	return vextInqUsrSecuProfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqUsrSecuProfResponseT getInqUsrSecuProfResponseT(char* testCaseNum , const char *root) {
	inqUsrSecuProfResponseT vinqUsrSecuProfResponseT;
	int i;

	vinqUsrSecuProfResponseT.header = getDataHeaderT(testCaseNum, "inqUsrSecuProfResponseT");
	vinqUsrSecuProfResponseT.basic = getBscInqUsrSecuProfResponseT(testCaseNum, "inqUsrSecuProfResponseT");
	vinqUsrSecuProfResponseT.extension = getExtInqUsrSecuProfResponseT(testCaseNum, "inqUsrSecuProfResponseT");	return vinqUsrSecuProfResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqUsrSecuProfRequestT(bscInqUsrSecuProfRequestT actual, bscInqUsrSecuProfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqUsrSecuProfRequestT(inqUsrSecuProfRequestT actual, inqUsrSecuProfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqUsrSecuProfRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqUsrSecuProfResponseT(bscInqUsrSecuProfResponseT actual, bscInqUsrSecuProfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqUsrSecuProfResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqUsrSecuProfResponseT(extInqUsrSecuProfResponseT actual, extInqUsrSecuProfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rsrcAccLvlNo, expected.rsrcAccLvlNo, RSRC_ACC_LVL_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqUsrSecuProfResponseT, rsrcAccLvlNo not matching. Actual %s but Expected %s", actual.rsrcAccLvlNo, expected.rsrcAccLvlNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqUsrSecuProfResponseT(inqUsrSecuProfResponseT actual, inqUsrSecuProfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqUsrSecuProfResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqUsrSecuProfResponseT (actual.extension,expected.extension, logMsg);
}

