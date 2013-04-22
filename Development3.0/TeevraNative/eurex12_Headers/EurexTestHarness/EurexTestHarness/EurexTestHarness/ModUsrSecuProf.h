#include <ModUsrSecuProf.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModUsrSecuProfRequestT getBscModUsrSecuProfRequestT(char* testCaseNum , const char *root) {
	bscModUsrSecuProfRequestT vbscModUsrSecuProfRequestT;
	int i;

	vbscModUsrSecuProfRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscModUsrSecuProfRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModUsrSecuProfRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModUsrSecuProf.bscModUsrSecuProfRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModUsrSecuProfRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModUsrSecuProfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extModUsrSecuProfRequestT getExtModUsrSecuProfRequestT(char* testCaseNum , const char *root) {
	extModUsrSecuProfRequestT vextModUsrSecuProfRequestT;
	int i;

	for(i=0;i<RSRC_ACC_LVL_NO_LEN;i++) {
		vextModUsrSecuProfRequestT.rsrcAccLvlNo[i]= ' ';
	}
	char lrsrcAccLvlNo[RSRC_ACC_LVL_NO_LEN] = {""};
	getStrProperty("ModUsrSecuProf.extModUsrSecuProfRequestT.rsrcAccLvlNo", lrsrcAccLvlNo);
	memcpy(vextModUsrSecuProfRequestT.rsrcAccLvlNo, lrsrcAccLvlNo, RSRC_ACC_LVL_NO_LEN);
	return vextModUsrSecuProfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modUsrSecuProfRequestT getModUsrSecuProfRequestT(char* testCaseNum , const char *root) {
	modUsrSecuProfRequestT vmodUsrSecuProfRequestT;
	int i;

	vmodUsrSecuProfRequestT.header = getDataHeaderT(testCaseNum, "modUsrSecuProfRequestT");
	vmodUsrSecuProfRequestT.basic = getBscModUsrSecuProfRequestT(testCaseNum, "modUsrSecuProfRequestT");
	vmodUsrSecuProfRequestT.extension = getExtModUsrSecuProfRequestT(testCaseNum, "modUsrSecuProfRequestT");	return vmodUsrSecuProfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModUsrSecuProfRecT getBscModUsrSecuProfRecT(char* testCaseNum , const char *root) {
	bscModUsrSecuProfRecT vbscModUsrSecuProfRecT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		vbscModUsrSecuProfRecT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("ModUsrSecuProf.bscModUsrSecuProfRecT.rtnCod", lrtnCod);
	memcpy(vbscModUsrSecuProfRecT.rtnCod, lrtnCod, RTN_COD_LEN);
	return vbscModUsrSecuProfRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModUsrSecuProfResponseT getBscModUsrSecuProfResponseT(char* testCaseNum , const char *root) {
	bscModUsrSecuProfResponseT vbscModUsrSecuProfResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModUsrSecuProfResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModUsrSecuProf.bscModUsrSecuProfResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModUsrSecuProfResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModUsrSecuProfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modUsrSecuProfResponseT getModUsrSecuProfResponseT(char* testCaseNum , const char *root) {
	modUsrSecuProfResponseT vmodUsrSecuProfResponseT;
	int i;

	vmodUsrSecuProfResponseT.header = getDataHeaderT(testCaseNum, "modUsrSecuProfResponseT");
	vmodUsrSecuProfResponseT.basic = getBscModUsrSecuProfResponseT(testCaseNum, "modUsrSecuProfResponseT");	return vmodUsrSecuProfResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModUsrSecuProfRequestT(bscModUsrSecuProfRequestT actual, bscModUsrSecuProfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModUsrSecuProfRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtModUsrSecuProfRequestT(extModUsrSecuProfRequestT actual, extModUsrSecuProfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rsrcAccLvlNo, expected.rsrcAccLvlNo, RSRC_ACC_LVL_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extModUsrSecuProfRequestT, rsrcAccLvlNo not matching. Actual %s but Expected %s", actual.rsrcAccLvlNo, expected.rsrcAccLvlNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModUsrSecuProfRequestT(modUsrSecuProfRequestT actual, modUsrSecuProfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModUsrSecuProfRequestT (actual.basic,expected.basic, logMsg);
	compareExtModUsrSecuProfRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModUsrSecuProfRecT(bscModUsrSecuProfRecT actual, bscModUsrSecuProfRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModUsrSecuProfRecT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModUsrSecuProfResponseT(bscModUsrSecuProfResponseT actual, bscModUsrSecuProfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < BSC_MOD_USR_SECU_PROF_REC_MAX;i++) {
		compareBscModUsrSecuProfRecT (actual.bscModUsrSecuProfRec[i],expected.bscModUsrSecuProfRec[i], logMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModUsrSecuProfResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModUsrSecuProfResponseT(modUsrSecuProfResponseT actual, modUsrSecuProfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModUsrSecuProfResponseT (actual.basic,expected.basic, logMsg);
}

