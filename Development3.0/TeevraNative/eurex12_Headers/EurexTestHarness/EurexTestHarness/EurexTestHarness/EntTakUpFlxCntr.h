#include <EntTakUpFlxCntr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntTakUpFlxCntrRequestT getBscEntTakUpFlxCntrRequestT(char* testCaseNum , const char *root) {
	bscEntTakUpFlxCntrRequestT vbscEntTakUpFlxCntrRequestT;
	int i;

	vbscEntTakUpFlxCntrRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscEntTakUpFlxCntrRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("EntTakUpFlxCntr.bscEntTakUpFlxCntrRequestT.buyCod", lbuyCod);
	vbscEntTakUpFlxCntrRequestT.buyCod = lbuyCod[0];

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscEntTakUpFlxCntrRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntTakUpFlxCntr.bscEntTakUpFlxCntrRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscEntTakUpFlxCntrRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscEntTakUpFlxCntrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntTakUpFlxCntrRequestT");
	vbscEntTakUpFlxCntrRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "bscEntTakUpFlxCntrRequestT");
	vbscEntTakUpFlxCntrRequestT.txtGrp = getTxtGrpT(testCaseNum, "bscEntTakUpFlxCntrRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntTakUpFlxCntrRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTakUpFlxCntr.bscEntTakUpFlxCntrRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntTakUpFlxCntrRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntTakUpFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entTakUpFlxCntrRequestT getEntTakUpFlxCntrRequestT(char* testCaseNum , const char *root) {
	entTakUpFlxCntrRequestT ventTakUpFlxCntrRequestT;
	int i;

	ventTakUpFlxCntrRequestT.header = getDataHeaderT(testCaseNum, "entTakUpFlxCntrRequestT");
	ventTakUpFlxCntrRequestT.basic = getBscEntTakUpFlxCntrRequestT(testCaseNum, "entTakUpFlxCntrRequestT");	return ventTakUpFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntTakUpFlxCntrResponseT getBscEntTakUpFlxCntrResponseT(char* testCaseNum , const char *root) {
	bscEntTakUpFlxCntrResponseT vbscEntTakUpFlxCntrResponseT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscEntTakUpFlxCntrResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("EntTakUpFlxCntr.bscEntTakUpFlxCntrResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscEntTakUpFlxCntrResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntTakUpFlxCntrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntTakUpFlxCntr.bscEntTakUpFlxCntrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntTakUpFlxCntrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntTakUpFlxCntrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entTakUpFlxCntrResponseT getEntTakUpFlxCntrResponseT(char* testCaseNum , const char *root) {
	entTakUpFlxCntrResponseT ventTakUpFlxCntrResponseT;
	int i;

	ventTakUpFlxCntrResponseT.header = getDataHeaderT(testCaseNum, "entTakUpFlxCntrResponseT");
	ventTakUpFlxCntrResponseT.basic = getBscEntTakUpFlxCntrResponseT(testCaseNum, "entTakUpFlxCntrResponseT");	return ventTakUpFlxCntrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntTakUpFlxCntrRequestT(bscEntTakUpFlxCntrRequestT actual, bscEntTakUpFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntTakUpFlxCntrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntTakUpFlxCntrRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntTakUpFlxCntrRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntTakUpFlxCntrRequestT(entTakUpFlxCntrRequestT actual, entTakUpFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntTakUpFlxCntrRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntTakUpFlxCntrResponseT(bscEntTakUpFlxCntrResponseT actual, bscEntTakUpFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntTakUpFlxCntrResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntTakUpFlxCntrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntTakUpFlxCntrResponseT(entTakUpFlxCntrResponseT actual, entTakUpFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntTakUpFlxCntrResponseT (actual.basic,expected.basic, logMsg);
}

