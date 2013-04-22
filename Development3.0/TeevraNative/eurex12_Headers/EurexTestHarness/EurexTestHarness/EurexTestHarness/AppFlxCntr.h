#include <AppFlxCntr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscAppFlxCntrRequestT getBscAppFlxCntrRequestT(char* testCaseNum , const char *root) {
	bscAppFlxCntrRequestT vbscAppFlxCntrRequestT;
	int i;

	vbscAppFlxCntrRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscAppFlxCntrRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("AppFlxCntr.bscAppFlxCntrRequestT.buyCod", lbuyCod);
	vbscAppFlxCntrRequestT.buyCod = lbuyCod[0];

	vbscAppFlxCntrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscAppFlxCntrRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("AppFlxCntr.bscAppFlxCntrRequestT.opnClsCod", lopnClsCod);
	vbscAppFlxCntrRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscAppFlxCntrRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppFlxCntr.bscAppFlxCntrRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscAppFlxCntrRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscAppFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extAppFlxCntrRequestT getExtAppFlxCntrRequestT(char* testCaseNum , const char *root) {
	extAppFlxCntrRequestT vextAppFlxCntrRequestT;
	int i;

	vextAppFlxCntrRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extAppFlxCntrRequestT");
	vextAppFlxCntrRequestT.txtGrp = getTxtGrpT(testCaseNum, "extAppFlxCntrRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextAppFlxCntrRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("AppFlxCntr.extAppFlxCntrRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextAppFlxCntrRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vextAppFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
appFlxCntrRequestT getAppFlxCntrRequestT(char* testCaseNum , const char *root) {
	appFlxCntrRequestT vappFlxCntrRequestT;
	int i;

	vappFlxCntrRequestT.header = getDataHeaderT(testCaseNum, "appFlxCntrRequestT");
	vappFlxCntrRequestT.basic = getBscAppFlxCntrRequestT(testCaseNum, "appFlxCntrRequestT");
	vappFlxCntrRequestT.extension = getExtAppFlxCntrRequestT(testCaseNum, "appFlxCntrRequestT");	return vappFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscAppFlxCntrResponseT getBscAppFlxCntrResponseT(char* testCaseNum , const char *root) {
	bscAppFlxCntrResponseT vbscAppFlxCntrResponseT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscAppFlxCntrResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("AppFlxCntr.bscAppFlxCntrResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscAppFlxCntrResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscAppFlxCntrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppFlxCntr.bscAppFlxCntrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscAppFlxCntrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscAppFlxCntrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
appFlxCntrResponseT getAppFlxCntrResponseT(char* testCaseNum , const char *root) {
	appFlxCntrResponseT vappFlxCntrResponseT;
	int i;

	vappFlxCntrResponseT.header = getDataHeaderT(testCaseNum, "appFlxCntrResponseT");
	vappFlxCntrResponseT.basic = getBscAppFlxCntrResponseT(testCaseNum, "appFlxCntrResponseT");	return vappFlxCntrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscAppFlxCntrRequestT(bscAppFlxCntrRequestT actual, bscAppFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAppFlxCntrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAppFlxCntrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAppFlxCntrRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtAppFlxCntrRequestT(extAppFlxCntrRequestT actual, extAppFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extAppFlxCntrRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAppFlxCntrRequestT(appFlxCntrRequestT actual, appFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscAppFlxCntrRequestT (actual.basic,expected.basic, logMsg);
	compareExtAppFlxCntrRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscAppFlxCntrResponseT(bscAppFlxCntrResponseT actual, bscAppFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAppFlxCntrResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAppFlxCntrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAppFlxCntrResponseT(appFlxCntrResponseT actual, appFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscAppFlxCntrResponseT (actual.basic,expected.basic, logMsg);
}

