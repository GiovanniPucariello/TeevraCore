#include <EntStratBlkAuctReq.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratBlkAuctReqRequestT getBscEntStratBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	bscEntStratBlkAuctReqRequestT vbscEntStratBlkAuctReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntStratBlkAuctReq.bscEntStratBlkAuctReqRequestT.buyCod", lbuyCod);
	vbscEntStratBlkAuctReqRequestT.buyCod = lbuyCod[0];

	vbscEntStratBlkAuctReqRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscEntStratBlkAuctReqRequestT");
	vbscEntStratBlkAuctReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntStratBlkAuctReqRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscEntStratBlkAuctReqRequestT.blkAuctQty[i]= ' ';
	}
	char lblkAuctQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntStratBlkAuctReq.bscEntStratBlkAuctReqRequestT.blkAuctQty", lblkAuctQty);
	memcpy(vbscEntStratBlkAuctReqRequestT.blkAuctQty, lblkAuctQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscEntStratBlkAuctReqRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntStratBlkAuctReq.bscEntStratBlkAuctReqRequestT.ordrExePrc", lordrExePrc);
	memcpy(vbscEntStratBlkAuctReqRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntStratBlkAuctReq.bscEntStratBlkAuctReqRequestT.opnClsCod", lopnClsCod);
	vbscEntStratBlkAuctReqRequestT.opnClsCod = lopnClsCod[0];
	return vbscEntStratBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extEntStratBlkAuctReqRequestT getExtEntStratBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	extEntStratBlkAuctReqRequestT vextEntStratBlkAuctReqRequestT;
	int i;

	vextEntStratBlkAuctReqRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extEntStratBlkAuctReqRequestT");
	vextEntStratBlkAuctReqRequestT.txtGrp = getTxtGrpT(testCaseNum, "extEntStratBlkAuctReqRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextEntStratBlkAuctReqRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("EntStratBlkAuctReq.extEntStratBlkAuctReqRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextEntStratBlkAuctReqRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vextEntStratBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratBlkAuctReqRequestT getEntStratBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	entStratBlkAuctReqRequestT ventStratBlkAuctReqRequestT;
	int i;

	ventStratBlkAuctReqRequestT.header = getDataHeaderT(testCaseNum, "entStratBlkAuctReqRequestT");
	ventStratBlkAuctReqRequestT.basic = getBscEntStratBlkAuctReqRequestT(testCaseNum, "entStratBlkAuctReqRequestT");
	ventStratBlkAuctReqRequestT.extension = getExtEntStratBlkAuctReqRequestT(testCaseNum, "entStratBlkAuctReqRequestT");	return ventStratBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratBlkAuctReqResponseT getBscEntStratBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	bscEntStratBlkAuctReqResponseT vbscEntStratBlkAuctReqResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscEntStratBlkAuctReqResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntStratBlkAuctReq.bscEntStratBlkAuctReqResponseT.ordrNo", lordrNo);
	memcpy(vbscEntStratBlkAuctReqResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscEntStratBlkAuctReqResponseT.blkAuctStrtTim[i]= ' ';
	}
	char lblkAuctStrtTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntStratBlkAuctReq.bscEntStratBlkAuctReqResponseT.blkAuctStrtTim", lblkAuctStrtTim);
	memcpy(vbscEntStratBlkAuctReqResponseT.blkAuctStrtTim, lblkAuctStrtTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntStratBlkAuctReqResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntStratBlkAuctReq.bscEntStratBlkAuctReqResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntStratBlkAuctReqResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntStratBlkAuctReqResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratBlkAuctReqResponseT getEntStratBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	entStratBlkAuctReqResponseT ventStratBlkAuctReqResponseT;
	int i;

	ventStratBlkAuctReqResponseT.header = getDataHeaderT(testCaseNum, "entStratBlkAuctReqResponseT");
	ventStratBlkAuctReqResponseT.basic = getBscEntStratBlkAuctReqResponseT(testCaseNum, "entStratBlkAuctReqResponseT");	return ventStratBlkAuctReqResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratBlkAuctReqRequestT(bscEntStratBlkAuctReqRequestT actual, bscEntStratBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.blkAuctQty, expected.blkAuctQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctReqRequestT, blkAuctQty not matching. Actual %s but Expected %s", actual.blkAuctQty, expected.blkAuctQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctReqRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctReqRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtEntStratBlkAuctReqRequestT(extEntStratBlkAuctReqRequestT actual, extEntStratBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntStratBlkAuctReqRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratBlkAuctReqRequestT(entStratBlkAuctReqRequestT actual, entStratBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratBlkAuctReqRequestT (actual.basic,expected.basic, logMsg);
	compareExtEntStratBlkAuctReqRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratBlkAuctReqResponseT(bscEntStratBlkAuctReqResponseT actual, bscEntStratBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctReqResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctStrtTim, expected.blkAuctStrtTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctReqResponseT, blkAuctStrtTim not matching. Actual %s but Expected %s", actual.blkAuctStrtTim, expected.blkAuctStrtTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctReqResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratBlkAuctReqResponseT(entStratBlkAuctReqResponseT actual, entStratBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratBlkAuctReqResponseT (actual.basic,expected.basic, logMsg);
}

