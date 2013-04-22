#include <ModStratBlkAuctReq.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModStratBlkAuctReqRequestT getBscModStratBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	bscModStratBlkAuctReqRequestT vbscModStratBlkAuctReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModStratBlkAuctReq.bscModStratBlkAuctReqRequestT.buyCod", lbuyCod);
	vbscModStratBlkAuctReqRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscModStratBlkAuctReqRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModStratBlkAuctReq.bscModStratBlkAuctReqRequestT.ordrNo", lordrNo);
	memcpy(vbscModStratBlkAuctReqRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	vbscModStratBlkAuctReqRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscModStratBlkAuctReqRequestT");
	vbscModStratBlkAuctReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscModStratBlkAuctReqRequestT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscModStratBlkAuctReqRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModStratBlkAuctReq.bscModStratBlkAuctReqRequestT.ordrExePrc", lordrExePrc);
	memcpy(vbscModStratBlkAuctReqRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModStratBlkAuctReq.bscModStratBlkAuctReqRequestT.opnClsCod", lopnClsCod);
	vbscModStratBlkAuctReqRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModStratBlkAuctReqRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModStratBlkAuctReq.bscModStratBlkAuctReqRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModStratBlkAuctReqRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModStratBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extModStratBlkAuctReqRequestT getExtModStratBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	extModStratBlkAuctReqRequestT vextModStratBlkAuctReqRequestT;
	int i;

	vextModStratBlkAuctReqRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extModStratBlkAuctReqRequestT");
	vextModStratBlkAuctReqRequestT.txtGrp = getTxtGrpT(testCaseNum, "extModStratBlkAuctReqRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextModStratBlkAuctReqRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("ModStratBlkAuctReq.extModStratBlkAuctReqRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextModStratBlkAuctReqRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vextModStratBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modStratBlkAuctReqRequestT getModStratBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	modStratBlkAuctReqRequestT vmodStratBlkAuctReqRequestT;
	int i;

	vmodStratBlkAuctReqRequestT.header = getDataHeaderT(testCaseNum, "modStratBlkAuctReqRequestT");
	vmodStratBlkAuctReqRequestT.basic = getBscModStratBlkAuctReqRequestT(testCaseNum, "modStratBlkAuctReqRequestT");
	vmodStratBlkAuctReqRequestT.extension = getExtModStratBlkAuctReqRequestT(testCaseNum, "modStratBlkAuctReqRequestT");	return vmodStratBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModStratBlkAuctReqResponseT getBscModStratBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	bscModStratBlkAuctReqResponseT vbscModStratBlkAuctReqResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscModStratBlkAuctReqResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModStratBlkAuctReq.bscModStratBlkAuctReqResponseT.ordrNo", lordrNo);
	memcpy(vbscModStratBlkAuctReqResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModStratBlkAuctReqResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModStratBlkAuctReq.bscModStratBlkAuctReqResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModStratBlkAuctReqResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModStratBlkAuctReqResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modStratBlkAuctReqResponseT getModStratBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	modStratBlkAuctReqResponseT vmodStratBlkAuctReqResponseT;
	int i;

	vmodStratBlkAuctReqResponseT.header = getDataHeaderT(testCaseNum, "modStratBlkAuctReqResponseT");
	vmodStratBlkAuctReqResponseT.basic = getBscModStratBlkAuctReqResponseT(testCaseNum, "modStratBlkAuctReqResponseT");	return vmodStratBlkAuctReqResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModStratBlkAuctReqRequestT(bscModStratBlkAuctReqRequestT actual, bscModStratBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratBlkAuctReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratBlkAuctReqRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratBlkAuctReqRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratBlkAuctReqRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratBlkAuctReqRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtModStratBlkAuctReqRequestT(extModStratBlkAuctReqRequestT actual, extModStratBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extModStratBlkAuctReqRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModStratBlkAuctReqRequestT(modStratBlkAuctReqRequestT actual, modStratBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModStratBlkAuctReqRequestT (actual.basic,expected.basic, logMsg);
	compareExtModStratBlkAuctReqRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModStratBlkAuctReqResponseT(bscModStratBlkAuctReqResponseT actual, bscModStratBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratBlkAuctReqResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratBlkAuctReqResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModStratBlkAuctReqResponseT(modStratBlkAuctReqResponseT actual, modStratBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModStratBlkAuctReqResponseT (actual.basic,expected.basic, logMsg);
}

