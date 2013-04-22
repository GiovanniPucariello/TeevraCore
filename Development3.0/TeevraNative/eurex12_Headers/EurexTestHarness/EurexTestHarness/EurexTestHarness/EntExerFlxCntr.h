#include <EntExerFlxCntr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntExerFlxCntrRequestT getBscEntExerFlxCntrRequestT(char* testCaseNum , const char *root) {
	bscEntExerFlxCntrRequestT vbscEntExerFlxCntrRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscEntExerFlxCntrRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("EntExerFlxCntr.bscEntExerFlxCntrRequestT.prodId", lprodId);
	memcpy(vbscEntExerFlxCntrRequestT.prodId, lprodId, PROD_ID_LEN);

	vbscEntExerFlxCntrRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscEntExerFlxCntrRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscEntExerFlxCntrRequestT.exerQty[i]= ' ';
	}
	char lexerQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntExerFlxCntr.bscEntExerFlxCntrRequestT.exerQty", lexerQty);
	memcpy(vbscEntExerFlxCntrRequestT.exerQty, lexerQty, DRIV_QUANTITY_LEN);

	char lexerOtmWrnInd[1] = {""};
	getStrProperty("EntExerFlxCntr.bscEntExerFlxCntrRequestT.exerOtmWrnInd", lexerOtmWrnInd);
	vbscEntExerFlxCntrRequestT.exerOtmWrnInd = lexerOtmWrnInd[0];

	vbscEntExerFlxCntrRequestT.txtGrp = getTxtGrpT(testCaseNum, "bscEntExerFlxCntrRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntExerFlxCntrRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntExerFlxCntr.bscEntExerFlxCntrRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntExerFlxCntrRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntExerFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entExerFlxCntrRequestT getEntExerFlxCntrRequestT(char* testCaseNum , const char *root) {
	entExerFlxCntrRequestT ventExerFlxCntrRequestT;
	int i;

	ventExerFlxCntrRequestT.header = getDataHeaderT(testCaseNum, "entExerFlxCntrRequestT");
	ventExerFlxCntrRequestT.basic = getBscEntExerFlxCntrRequestT(testCaseNum, "entExerFlxCntrRequestT");	return ventExerFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntExerFlxCntrResponseT getBscEntExerFlxCntrResponseT(char* testCaseNum , const char *root) {
	bscEntExerFlxCntrResponseT vbscEntExerFlxCntrResponseT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscEntExerFlxCntrResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("EntExerFlxCntr.bscEntExerFlxCntrResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscEntExerFlxCntrResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntExerFlxCntrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntExerFlxCntr.bscEntExerFlxCntrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntExerFlxCntrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntExerFlxCntrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entExerFlxCntrResponseT getEntExerFlxCntrResponseT(char* testCaseNum , const char *root) {
	entExerFlxCntrResponseT ventExerFlxCntrResponseT;
	int i;

	ventExerFlxCntrResponseT.header = getDataHeaderT(testCaseNum, "entExerFlxCntrResponseT");
	ventExerFlxCntrResponseT.basic = getBscEntExerFlxCntrResponseT(testCaseNum, "entExerFlxCntrResponseT");	return ventExerFlxCntrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntExerFlxCntrRequestT(bscEntExerFlxCntrRequestT actual, bscEntExerFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntExerFlxCntrRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if ( memcmp(actual.exerQty, expected.exerQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntExerFlxCntrRequestT, exerQty not matching. Actual %s but Expected %s", actual.exerQty, expected.exerQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerOtmWrnInd!= expected.exerOtmWrnInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntExerFlxCntrRequestT, exerOtmWrnIndnot matching. Actual %d but Expected %d", actual.exerOtmWrnInd, expected.exerOtmWrnInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntExerFlxCntrRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntExerFlxCntrRequestT(entExerFlxCntrRequestT actual, entExerFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntExerFlxCntrRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntExerFlxCntrResponseT(bscEntExerFlxCntrResponseT actual, bscEntExerFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntExerFlxCntrResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntExerFlxCntrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntExerFlxCntrResponseT(entExerFlxCntrResponseT actual, entExerFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntExerFlxCntrResponseT (actual.basic,expected.basic, logMsg);
}

