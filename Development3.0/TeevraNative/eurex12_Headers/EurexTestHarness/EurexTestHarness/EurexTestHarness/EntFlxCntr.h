#include <EntFlxCntr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntFlxFutRequestT getBscEntFlxFutRequestT(char* testCaseNum , const char *root) {
	bscEntFlxFutRequestT vbscEntFlxFutRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxFutRequestT.buyCod", lbuyCod);
	vbscEntFlxFutRequestT.buyCod = lbuyCod[0];

	vbscEntFlxFutRequestT.flxFutCntrIdGrp = getFlxFutCntrIdGrpT(testCaseNum, "bscEntFlxFutRequestT");
	vbscEntFlxFutRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntFlxFutRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntFlxFutRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxFutRequestT.trdXQty", ltrdXQty);
	memcpy(vbscEntFlxFutRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscEntFlxFutRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxFutRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscEntFlxFutRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxFutRequestT.opnClsCod", lopnClsCod);
	vbscEntFlxFutRequestT.opnClsCod = lopnClsCod[0];

	vbscEntFlxFutRequestT.flxCntrTrnIdClsGrp = getFlxCntrTrnIdClsGrpT(testCaseNum, "bscEntFlxFutRequestT");
	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscEntFlxFutRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxFutRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscEntFlxFutRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);
	return vbscEntFlxFutRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extEntFlxFutRequestT getExtEntFlxFutRequestT(char* testCaseNum , const char *root) {
	extEntFlxFutRequestT vextEntFlxFutRequestT;
	int i;

	vextEntFlxFutRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extEntFlxFutRequestT");
	vextEntFlxFutRequestT.txtGrp = getTxtGrpT(testCaseNum, "extEntFlxFutRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextEntFlxFutRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntFlxCntr.extEntFlxFutRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextEntFlxFutRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vextEntFlxFutRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entFlxFutRequestT getEntFlxFutRequestT(char* testCaseNum , const char *root) {
	entFlxFutRequestT ventFlxFutRequestT;
	int i;

	ventFlxFutRequestT.header = getDataHeaderT(testCaseNum, "entFlxFutRequestT");
	ventFlxFutRequestT.basic = getBscEntFlxFutRequestT(testCaseNum, "entFlxFutRequestT");
	ventFlxFutRequestT.extension = getExtEntFlxFutRequestT(testCaseNum, "entFlxFutRequestT");	return ventFlxFutRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntFlxFutResponseT getBscEntFlxFutResponseT(char* testCaseNum , const char *root) {
	bscEntFlxFutResponseT vbscEntFlxFutResponseT;
	int i;

	vbscEntFlxFutResponseT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscEntFlxFutResponseT");
	for(i=0;i<PROD_ID_LEN;i++) {
		vbscEntFlxFutResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxFutResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscEntFlxFutResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntFlxFutResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxFutResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntFlxFutResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntFlxFutResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entFlxFutResponseT getEntFlxFutResponseT(char* testCaseNum , const char *root) {
	entFlxFutResponseT ventFlxFutResponseT;
	int i;

	ventFlxFutResponseT.header = getDataHeaderT(testCaseNum, "entFlxFutResponseT");
	ventFlxFutResponseT.basic = getBscEntFlxFutResponseT(testCaseNum, "entFlxFutResponseT");	return ventFlxFutResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntFlxOptRequestT getBscEntFlxOptRequestT(char* testCaseNum , const char *root) {
	bscEntFlxOptRequestT vbscEntFlxOptRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxOptRequestT.buyCod", lbuyCod);
	vbscEntFlxOptRequestT.buyCod = lbuyCod[0];

	vbscEntFlxOptRequestT.flxOptCntrIdGrp = getFlxOptCntrIdGrpT(testCaseNum, "bscEntFlxOptRequestT");
	vbscEntFlxOptRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntFlxOptRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntFlxOptRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxOptRequestT.trdXQty", ltrdXQty);
	memcpy(vbscEntFlxOptRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscEntFlxOptRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxOptRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscEntFlxOptRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxOptRequestT.opnClsCod", lopnClsCod);
	vbscEntFlxOptRequestT.opnClsCod = lopnClsCod[0];

	vbscEntFlxOptRequestT.flxCntrTrnIdClsGrp = getFlxCntrTrnIdClsGrpT(testCaseNum, "bscEntFlxOptRequestT");
	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscEntFlxOptRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxOptRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscEntFlxOptRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);
	return vbscEntFlxOptRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extEntFlxOptRequestT getExtEntFlxOptRequestT(char* testCaseNum , const char *root) {
	extEntFlxOptRequestT vextEntFlxOptRequestT;
	int i;

	vextEntFlxOptRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extEntFlxOptRequestT");
	vextEntFlxOptRequestT.txtGrp = getTxtGrpT(testCaseNum, "extEntFlxOptRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextEntFlxOptRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntFlxCntr.extEntFlxOptRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextEntFlxOptRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vextEntFlxOptRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entFlxOptRequestT getEntFlxOptRequestT(char* testCaseNum , const char *root) {
	entFlxOptRequestT ventFlxOptRequestT;
	int i;

	ventFlxOptRequestT.header = getDataHeaderT(testCaseNum, "entFlxOptRequestT");
	ventFlxOptRequestT.basic = getBscEntFlxOptRequestT(testCaseNum, "entFlxOptRequestT");
	ventFlxOptRequestT.extension = getExtEntFlxOptRequestT(testCaseNum, "entFlxOptRequestT");	return ventFlxOptRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntFlxOptResponseT getBscEntFlxOptResponseT(char* testCaseNum , const char *root) {
	bscEntFlxOptResponseT vbscEntFlxOptResponseT;
	int i;

	vbscEntFlxOptResponseT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscEntFlxOptResponseT");
	for(i=0;i<PROD_ID_LEN;i++) {
		vbscEntFlxOptResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxOptResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscEntFlxOptResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntFlxOptResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntFlxCntr.bscEntFlxOptResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntFlxOptResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntFlxOptResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entFlxOptResponseT getEntFlxOptResponseT(char* testCaseNum , const char *root) {
	entFlxOptResponseT ventFlxOptResponseT;
	int i;

	ventFlxOptResponseT.header = getDataHeaderT(testCaseNum, "entFlxOptResponseT");
	ventFlxOptResponseT.basic = getBscEntFlxOptResponseT(testCaseNum, "entFlxOptResponseT");	return ventFlxOptResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntFlxFutRequestT(bscEntFlxFutRequestT actual, bscEntFlxFutRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxFutRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxFutCntrIdGrpT (actual.flxFutCntrIdGrp,expected.flxFutCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxFutRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxFutRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxFutRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxCntrTrnIdClsGrpT (actual.flxCntrTrnIdClsGrp,expected.flxCntrTrnIdClsGrp, logMsg);
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxFutRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtEntFlxFutRequestT(extEntFlxFutRequestT actual, extEntFlxFutRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntFlxFutRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntFlxFutRequestT(entFlxFutRequestT actual, entFlxFutRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntFlxFutRequestT (actual.basic,expected.basic, logMsg);
	compareExtEntFlxFutRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntFlxFutResponseT(bscEntFlxFutResponseT actual, bscEntFlxFutResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxFutResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxFutResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntFlxFutResponseT(entFlxFutResponseT actual, entFlxFutResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntFlxFutResponseT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntFlxOptRequestT(bscEntFlxOptRequestT actual, bscEntFlxOptRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxOptRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxOptCntrIdGrpT (actual.flxOptCntrIdGrp,expected.flxOptCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxOptRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxOptRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxOptRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxCntrTrnIdClsGrpT (actual.flxCntrTrnIdClsGrp,expected.flxCntrTrnIdClsGrp, logMsg);
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxOptRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtEntFlxOptRequestT(extEntFlxOptRequestT actual, extEntFlxOptRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntFlxOptRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntFlxOptRequestT(entFlxOptRequestT actual, entFlxOptRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntFlxOptRequestT (actual.basic,expected.basic, logMsg);
	compareExtEntFlxOptRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntFlxOptResponseT(bscEntFlxOptResponseT actual, bscEntFlxOptResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxOptResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntFlxOptResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntFlxOptResponseT(entFlxOptResponseT actual, entFlxOptResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntFlxOptResponseT (actual.basic,expected.basic, logMsg);
}

