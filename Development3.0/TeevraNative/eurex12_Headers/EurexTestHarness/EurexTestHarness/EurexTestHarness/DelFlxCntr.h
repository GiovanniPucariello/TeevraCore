#include <DelFlxCntr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelFlxCntrRequestT getBscDelFlxCntrRequestT(char* testCaseNum , const char *root) {
	bscDelFlxCntrRequestT vbscDelFlxCntrRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscDelFlxCntrRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelFlxCntr.bscDelFlxCntrRequestT.prodId", lprodId);
	memcpy(vbscDelFlxCntrRequestT.prodId, lprodId, PROD_ID_LEN);

	vbscDelFlxCntrRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscDelFlxCntrRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("DelFlxCntr.bscDelFlxCntrRequestT.buyCod", lbuyCod);
	vbscDelFlxCntrRequestT.buyCod = lbuyCod[0];

	vbscDelFlxCntrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscDelFlxCntrRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscDelFlxCntrRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelFlxCntr.bscDelFlxCntrRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscDelFlxCntrRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscDelFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delFlxCntrRequestT getDelFlxCntrRequestT(char* testCaseNum , const char *root) {
	delFlxCntrRequestT vdelFlxCntrRequestT;
	int i;

	vdelFlxCntrRequestT.header = getDataHeaderT(testCaseNum, "delFlxCntrRequestT");
	vdelFlxCntrRequestT.basic = getBscDelFlxCntrRequestT(testCaseNum, "delFlxCntrRequestT");	return vdelFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelFlxCntrResponseT getBscDelFlxCntrResponseT(char* testCaseNum , const char *root) {
	bscDelFlxCntrResponseT vbscDelFlxCntrResponseT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscDelFlxCntrResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("DelFlxCntr.bscDelFlxCntrResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscDelFlxCntrResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);
	return vbscDelFlxCntrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delFlxCntrResponseT getDelFlxCntrResponseT(char* testCaseNum , const char *root) {
	delFlxCntrResponseT vdelFlxCntrResponseT;
	int i;

	vdelFlxCntrResponseT.header = getDataHeaderT(testCaseNum, "delFlxCntrResponseT");
	vdelFlxCntrResponseT.basic = getBscDelFlxCntrResponseT(testCaseNum, "delFlxCntrResponseT");	return vdelFlxCntrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelFlxCntrRequestT(bscDelFlxCntrRequestT actual, bscDelFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelFlxCntrRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelFlxCntrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelFlxCntrRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelFlxCntrRequestT(delFlxCntrRequestT actual, delFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelFlxCntrRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelFlxCntrResponseT(bscDelFlxCntrResponseT actual, bscDelFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelFlxCntrResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelFlxCntrResponseT(delFlxCntrResponseT actual, delFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelFlxCntrResponseT (actual.basic,expected.basic, logMsg);
}

