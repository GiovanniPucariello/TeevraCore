#include <ModFlxCntr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModFlxCntrRequestT getBscModFlxCntrRequestT(char* testCaseNum , const char *root) {
	bscModFlxCntrRequestT vbscModFlxCntrRequestT;
	int i;

	vbscModFlxCntrRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscModFlxCntrRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("ModFlxCntr.bscModFlxCntrRequestT.buyCod", lbuyCod);
	vbscModFlxCntrRequestT.buyCod = lbuyCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscModFlxCntrRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("ModFlxCntr.bscModFlxCntrRequestT.prodId", lprodId);
	memcpy(vbscModFlxCntrRequestT.prodId, lprodId, PROD_ID_LEN);

	vbscModFlxCntrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscModFlxCntrRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModFlxCntrRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModFlxCntr.bscModFlxCntrRequestT.trdXQty", ltrdXQty);
	memcpy(vbscModFlxCntrRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscModFlxCntrRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModFlxCntr.bscModFlxCntrRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscModFlxCntrRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModFlxCntrRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModFlxCntr.bscModFlxCntrRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModFlxCntrRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extModFlxCntrRequestT getExtModFlxCntrRequestT(char* testCaseNum , const char *root) {
	extModFlxCntrRequestT vextModFlxCntrRequestT;
	int i;

	vextModFlxCntrRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extModFlxCntrRequestT");
	vextModFlxCntrRequestT.txtGrp = getTxtGrpT(testCaseNum, "extModFlxCntrRequestT");	return vextModFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modFlxCntrRequestT getModFlxCntrRequestT(char* testCaseNum , const char *root) {
	modFlxCntrRequestT vmodFlxCntrRequestT;
	int i;

	vmodFlxCntrRequestT.header = getDataHeaderT(testCaseNum, "modFlxCntrRequestT");
	vmodFlxCntrRequestT.basic = getBscModFlxCntrRequestT(testCaseNum, "modFlxCntrRequestT");
	vmodFlxCntrRequestT.extension = getExtModFlxCntrRequestT(testCaseNum, "modFlxCntrRequestT");	return vmodFlxCntrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModFlxCntrResponseT getBscModFlxCntrResponseT(char* testCaseNum , const char *root) {
	bscModFlxCntrResponseT vbscModFlxCntrResponseT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscModFlxCntrResponseT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("ModFlxCntr.bscModFlxCntrResponseT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vbscModFlxCntrResponseT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModFlxCntrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModFlxCntr.bscModFlxCntrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModFlxCntrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModFlxCntrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modFlxCntrResponseT getModFlxCntrResponseT(char* testCaseNum , const char *root) {
	modFlxCntrResponseT vmodFlxCntrResponseT;
	int i;

	vmodFlxCntrResponseT.header = getDataHeaderT(testCaseNum, "modFlxCntrResponseT");
	vmodFlxCntrResponseT.basic = getBscModFlxCntrResponseT(testCaseNum, "modFlxCntrResponseT");	return vmodFlxCntrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModFlxCntrRequestT(bscModFlxCntrRequestT actual, bscModFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModFlxCntrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModFlxCntrRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModFlxCntrRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModFlxCntrRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModFlxCntrRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtModFlxCntrRequestT(extModFlxCntrRequestT actual, extModFlxCntrRequestT expected, char* logMsg) {
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
void compareModFlxCntrRequestT(modFlxCntrRequestT actual, modFlxCntrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModFlxCntrRequestT (actual.basic,expected.basic, logMsg);
	compareExtModFlxCntrRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModFlxCntrResponseT(bscModFlxCntrResponseT actual, bscModFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModFlxCntrResponseT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModFlxCntrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModFlxCntrResponseT(modFlxCntrResponseT actual, modFlxCntrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModFlxCntrResponseT (actual.basic,expected.basic, logMsg);
}

