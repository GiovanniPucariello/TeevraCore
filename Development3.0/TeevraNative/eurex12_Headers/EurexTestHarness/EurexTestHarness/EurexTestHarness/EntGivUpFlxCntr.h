#include <EntGivUpFlxCntr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntGivUpFlxCntrRequestT getBscEntGivUpFlxCntrRequestT(char* testCaseNum , const char *root) {
	bscEntGivUpFlxCntrRequestT vbscEntGivUpFlxCntrRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscEntGivUpFlxCntrRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("EntGivUpFlxCntr.bscEntGivUpFlxCntrRequestT.prodId", lprodId);
	memcpy(vbscEntGivUpFlxCntrRequestT.prodId, lprodId, PROD_ID_LEN);

	vbscEntGivUpFlxCntrRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscEntGivUpFlxCntrRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntGivUpFlxCntr.bscEntGivUpFlxCntrRequestT.buyCod", lbuyCod);
	vbscEntGivUpFlxCntrRequestT.buyCod = lbuyCod[0];

	vbscEntGivUpFlxCntrRequestT.txtGrp = getTxtGrpT(testCaseNum, "bscEntGivUpFlxCntrRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vbscEntGivUpFlxCntrRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntGivUpFlxCntr.bscEntGivUpFlxCntrRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vbscEntGivUpFlxCntrRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntGivUpFlxCntrRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntGivUpFlxCntr.bscEntGivUpFlxCntrRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntGivUpFlxCntrRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntGivUpFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entGivUpFlxCntrRequestT getEntGivUpFlxCntrRequestT(char* testCaseNum , const char *root) {
	entGivUpFlxCntrRequestT ventGivUpFlxCntrRequestT;
	int i;

	ventGivUpFlxCntrRequestT.header = getDataHeaderT(testCaseNum, "entGivUpFlxCntrRequestT");
	ventGivUpFlxCntrRequestT.basic = getBscEntGivUpFlxCntrRequestT(testCaseNum, "entGivUpFlxCntrRequestT");	return ventGivUpFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntGivUpFlxCntrResponseT getBscEntGivUpFlxCntrResponseT(char* testCaseNum , const char *root) {
	bscEntGivUpFlxCntrResponseT vbscEntGivUpFlxCntrResponseT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscEntGivUpFlxCntrResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("EntGivUpFlxCntr.bscEntGivUpFlxCntrResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscEntGivUpFlxCntrResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntGivUpFlxCntrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntGivUpFlxCntr.bscEntGivUpFlxCntrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntGivUpFlxCntrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntGivUpFlxCntrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entGivUpFlxCntrResponseT getEntGivUpFlxCntrResponseT(char* testCaseNum , const char *root) {
	entGivUpFlxCntrResponseT ventGivUpFlxCntrResponseT;
	int i;

	ventGivUpFlxCntrResponseT.header = getDataHeaderT(testCaseNum, "entGivUpFlxCntrResponseT");
	ventGivUpFlxCntrResponseT.basic = getBscEntGivUpFlxCntrResponseT(testCaseNum, "entGivUpFlxCntrResponseT");	return ventGivUpFlxCntrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntGivUpFlxCntrRequestT(bscEntGivUpFlxCntrRequestT actual, bscEntGivUpFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntGivUpFlxCntrRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntGivUpFlxCntrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntGivUpFlxCntrRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntGivUpFlxCntrRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntGivUpFlxCntrRequestT(entGivUpFlxCntrRequestT actual, entGivUpFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntGivUpFlxCntrRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntGivUpFlxCntrResponseT(bscEntGivUpFlxCntrResponseT actual, bscEntGivUpFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntGivUpFlxCntrResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntGivUpFlxCntrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntGivUpFlxCntrResponseT(entGivUpFlxCntrResponseT actual, entGivUpFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntGivUpFlxCntrResponseT (actual.basic,expected.basic, logMsg);
}

