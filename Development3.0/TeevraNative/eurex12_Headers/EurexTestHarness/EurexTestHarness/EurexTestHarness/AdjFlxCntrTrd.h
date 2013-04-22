#include <AdjFlxCntrTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscAdjFlxCntrTrdRequestT getBscAdjFlxCntrTrdRequestT(char* testCaseNum , const char *root) {
	bscAdjFlxCntrTrdRequestT vbscAdjFlxCntrTrdRequestT;
	int i;

	vbscAdjFlxCntrTrdRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscAdjFlxCntrTrdRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("AdjFlxCntrTrd.bscAdjFlxCntrTrdRequestT.buyCod", lbuyCod);
	vbscAdjFlxCntrTrdRequestT.buyCod = lbuyCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscAdjFlxCntrTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("AdjFlxCntrTrd.bscAdjFlxCntrTrdRequestT.prodId", lprodId);
	memcpy(vbscAdjFlxCntrTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	vbscAdjFlxCntrTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscAdjFlxCntrTrdRequestT");
	char labdnInd[1] = {""};
	getStrProperty("AdjFlxCntrTrd.bscAdjFlxCntrTrdRequestT.abdnInd", labdnInd);
	vbscAdjFlxCntrTrdRequestT.abdnInd = labdnInd[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscAdjFlxCntrTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AdjFlxCntrTrd.bscAdjFlxCntrTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscAdjFlxCntrTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscAdjFlxCntrTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extAdjFlxCntrTrdRequestT getExtAdjFlxCntrTrdRequestT(char* testCaseNum , const char *root) {
	extAdjFlxCntrTrdRequestT vextAdjFlxCntrTrdRequestT;
	int i;

	vextAdjFlxCntrTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extAdjFlxCntrTrdRequestT");
	vextAdjFlxCntrTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "extAdjFlxCntrTrdRequestT");	return vextAdjFlxCntrTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
adjFlxCntrTrdRequestT getAdjFlxCntrTrdRequestT(char* testCaseNum , const char *root) {
	adjFlxCntrTrdRequestT vadjFlxCntrTrdRequestT;
	int i;

	vadjFlxCntrTrdRequestT.header = getDataHeaderT(testCaseNum, "adjFlxCntrTrdRequestT");
	vadjFlxCntrTrdRequestT.basic = getBscAdjFlxCntrTrdRequestT(testCaseNum, "adjFlxCntrTrdRequestT");
	vadjFlxCntrTrdRequestT.extension = getExtAdjFlxCntrTrdRequestT(testCaseNum, "adjFlxCntrTrdRequestT");	return vadjFlxCntrTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscAdjFlxCntrTrdResponseT getBscAdjFlxCntrTrdResponseT(char* testCaseNum , const char *root) {
	bscAdjFlxCntrTrdResponseT vbscAdjFlxCntrTrdResponseT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscAdjFlxCntrTrdResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("AdjFlxCntrTrd.bscAdjFlxCntrTrdResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscAdjFlxCntrTrdResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscAdjFlxCntrTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AdjFlxCntrTrd.bscAdjFlxCntrTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscAdjFlxCntrTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscAdjFlxCntrTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
adjFlxCntrTrdResponseT getAdjFlxCntrTrdResponseT(char* testCaseNum , const char *root) {
	adjFlxCntrTrdResponseT vadjFlxCntrTrdResponseT;
	int i;

	vadjFlxCntrTrdResponseT.header = getDataHeaderT(testCaseNum, "adjFlxCntrTrdResponseT");
	vadjFlxCntrTrdResponseT.basic = getBscAdjFlxCntrTrdResponseT(testCaseNum, "adjFlxCntrTrdResponseT");	return vadjFlxCntrTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscAdjFlxCntrTrdRequestT(bscAdjFlxCntrTrdRequestT actual, bscAdjFlxCntrTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAdjFlxCntrTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAdjFlxCntrTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.abdnInd!= expected.abdnInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAdjFlxCntrTrdRequestT, abdnIndnot matching. Actual %d but Expected %d", actual.abdnInd, expected.abdnInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAdjFlxCntrTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtAdjFlxCntrTrdRequestT(extAdjFlxCntrTrdRequestT actual, extAdjFlxCntrTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAdjFlxCntrTrdRequestT(adjFlxCntrTrdRequestT actual, adjFlxCntrTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscAdjFlxCntrTrdRequestT (actual.basic,expected.basic, logMsg);
	compareExtAdjFlxCntrTrdRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscAdjFlxCntrTrdResponseT(bscAdjFlxCntrTrdResponseT actual, bscAdjFlxCntrTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAdjFlxCntrTrdResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAdjFlxCntrTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAdjFlxCntrTrdResponseT(adjFlxCntrTrdResponseT actual, adjFlxCntrTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscAdjFlxCntrTrdResponseT (actual.basic,expected.basic, logMsg);
}

