#include <DelGivUpFlxCntr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelGivUpFlxCntrRequestT getBscDelGivUpFlxCntrRequestT(char* testCaseNum , const char *root) {
	bscDelGivUpFlxCntrRequestT vbscDelGivUpFlxCntrRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscDelGivUpFlxCntrRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelGivUpFlxCntr.bscDelGivUpFlxCntrRequestT.prodId", lprodId);
	memcpy(vbscDelGivUpFlxCntrRequestT.prodId, lprodId, PROD_ID_LEN);

	vbscDelGivUpFlxCntrRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscDelGivUpFlxCntrRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("DelGivUpFlxCntr.bscDelGivUpFlxCntrRequestT.buyCod", lbuyCod);
	vbscDelGivUpFlxCntrRequestT.buyCod = lbuyCod[0];

	vbscDelGivUpFlxCntrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscDelGivUpFlxCntrRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscDelGivUpFlxCntrRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelGivUpFlxCntr.bscDelGivUpFlxCntrRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscDelGivUpFlxCntrRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscDelGivUpFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delGivUpFlxCntrRequestT getDelGivUpFlxCntrRequestT(char* testCaseNum , const char *root) {
	delGivUpFlxCntrRequestT vdelGivUpFlxCntrRequestT;
	int i;

	vdelGivUpFlxCntrRequestT.header = getDataHeaderT(testCaseNum, "delGivUpFlxCntrRequestT");
	vdelGivUpFlxCntrRequestT.basic = getBscDelGivUpFlxCntrRequestT(testCaseNum, "delGivUpFlxCntrRequestT");	return vdelGivUpFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelGivUpFlxCntrResponseT getBscDelGivUpFlxCntrResponseT(char* testCaseNum , const char *root) {
	bscDelGivUpFlxCntrResponseT vbscDelGivUpFlxCntrResponseT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscDelGivUpFlxCntrResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("DelGivUpFlxCntr.bscDelGivUpFlxCntrResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscDelGivUpFlxCntrResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscDelGivUpFlxCntrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelGivUpFlxCntr.bscDelGivUpFlxCntrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscDelGivUpFlxCntrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscDelGivUpFlxCntrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delGivUpFlxCntrResponseT getDelGivUpFlxCntrResponseT(char* testCaseNum , const char *root) {
	delGivUpFlxCntrResponseT vdelGivUpFlxCntrResponseT;
	int i;

	vdelGivUpFlxCntrResponseT.header = getDataHeaderT(testCaseNum, "delGivUpFlxCntrResponseT");
	vdelGivUpFlxCntrResponseT.basic = getBscDelGivUpFlxCntrResponseT(testCaseNum, "delGivUpFlxCntrResponseT");	return vdelGivUpFlxCntrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelGivUpFlxCntrRequestT(bscDelGivUpFlxCntrRequestT actual, bscDelGivUpFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelGivUpFlxCntrRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelGivUpFlxCntrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelGivUpFlxCntrRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelGivUpFlxCntrRequestT(delGivUpFlxCntrRequestT actual, delGivUpFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelGivUpFlxCntrRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelGivUpFlxCntrResponseT(bscDelGivUpFlxCntrResponseT actual, bscDelGivUpFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelGivUpFlxCntrResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelGivUpFlxCntrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelGivUpFlxCntrResponseT(delGivUpFlxCntrResponseT actual, delGivUpFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelGivUpFlxCntrResponseT (actual.basic,expected.basic, logMsg);
}

