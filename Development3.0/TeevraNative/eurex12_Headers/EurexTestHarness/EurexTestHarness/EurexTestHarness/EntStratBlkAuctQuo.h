#include <EntStratBlkAuctQuo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratBlkAuctQuoRequestT getBscEntStratBlkAuctQuoRequestT(char* testCaseNum , const char *root) {
	bscEntStratBlkAuctQuoRequestT vbscEntStratBlkAuctQuoRequestT;
	int i;

	vbscEntStratBlkAuctQuoRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscEntStratBlkAuctQuoRequestT");
	vbscEntStratBlkAuctQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntStratBlkAuctQuoRequestT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscEntStratBlkAuctQuoRequestT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntStratBlkAuctQuo.bscEntStratBlkAuctQuoRequestT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(vbscEntStratBlkAuctQuoRequestT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscEntStratBlkAuctQuoRequestT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntStratBlkAuctQuo.bscEntStratBlkAuctQuoRequestT.quoExePrcSel", lquoExePrcSel);
	memcpy(vbscEntStratBlkAuctQuoRequestT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratBlkAuctQuoRequestT.blkAuctQuoQtyBuy[i]= ' ';
	}
	char lblkAuctQuoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratBlkAuctQuo.bscEntStratBlkAuctQuoRequestT.blkAuctQuoQtyBuy", lblkAuctQuoQtyBuy);
	memcpy(vbscEntStratBlkAuctQuoRequestT.blkAuctQuoQtyBuy, lblkAuctQuoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratBlkAuctQuoRequestT.blkAuctQuoQtySel[i]= ' ';
	}
	char lblkAuctQuoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratBlkAuctQuo.bscEntStratBlkAuctQuoRequestT.blkAuctQuoQtySel", lblkAuctQuoQtySel);
	memcpy(vbscEntStratBlkAuctQuoRequestT.blkAuctQuoQtySel, lblkAuctQuoQtySel, DRIV_VOLUME_LEN);
	return vbscEntStratBlkAuctQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extEntStratBlkAuctQuoRequestT getExtEntStratBlkAuctQuoRequestT(char* testCaseNum , const char *root) {
	extEntStratBlkAuctQuoRequestT vextEntStratBlkAuctQuoRequestT;
	int i;

	vextEntStratBlkAuctQuoRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extEntStratBlkAuctQuoRequestT");	return vextEntStratBlkAuctQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratBlkAuctQuoRequestT getEntStratBlkAuctQuoRequestT(char* testCaseNum , const char *root) {
	entStratBlkAuctQuoRequestT ventStratBlkAuctQuoRequestT;
	int i;

	ventStratBlkAuctQuoRequestT.header = getDataHeaderT(testCaseNum, "entStratBlkAuctQuoRequestT");
	ventStratBlkAuctQuoRequestT.basic = getBscEntStratBlkAuctQuoRequestT(testCaseNum, "entStratBlkAuctQuoRequestT");
	ventStratBlkAuctQuoRequestT.extension = getExtEntStratBlkAuctQuoRequestT(testCaseNum, "entStratBlkAuctQuoRequestT");	return ventStratBlkAuctQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratBlkAuctQuoResponseT getBscEntStratBlkAuctQuoResponseT(char* testCaseNum , const char *root) {
	bscEntStratBlkAuctQuoResponseT vbscEntStratBlkAuctQuoResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscEntStratBlkAuctQuoResponseT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntStratBlkAuctQuo.bscEntStratBlkAuctQuoResponseT.ordrNoBuy", lordrNoBuy);
	memcpy(vbscEntStratBlkAuctQuoResponseT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscEntStratBlkAuctQuoResponseT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntStratBlkAuctQuo.bscEntStratBlkAuctQuoResponseT.ordrNoSel", lordrNoSel);
	memcpy(vbscEntStratBlkAuctQuoResponseT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);
	return vbscEntStratBlkAuctQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratBlkAuctQuoResponseT getEntStratBlkAuctQuoResponseT(char* testCaseNum , const char *root) {
	entStratBlkAuctQuoResponseT ventStratBlkAuctQuoResponseT;
	int i;

	ventStratBlkAuctQuoResponseT.header = getDataHeaderT(testCaseNum, "entStratBlkAuctQuoResponseT");
	ventStratBlkAuctQuoResponseT.basic = getBscEntStratBlkAuctQuoResponseT(testCaseNum, "entStratBlkAuctQuoResponseT");	return ventStratBlkAuctQuoResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratBlkAuctQuoRequestT(bscEntStratBlkAuctQuoRequestT actual, bscEntStratBlkAuctQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctQuoRequestT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctQuoRequestT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctQuoRequestT, blkAuctQuoQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctQuoRequestT, blkAuctQuoQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtEntStratBlkAuctQuoRequestT(extEntStratBlkAuctQuoRequestT actual, extEntStratBlkAuctQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratBlkAuctQuoRequestT(entStratBlkAuctQuoRequestT actual, entStratBlkAuctQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratBlkAuctQuoRequestT (actual.basic,expected.basic, logMsg);
	compareExtEntStratBlkAuctQuoRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratBlkAuctQuoResponseT(bscEntStratBlkAuctQuoResponseT actual, bscEntStratBlkAuctQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctQuoResponseT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratBlkAuctQuoResponseT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratBlkAuctQuoResponseT(entStratBlkAuctQuoResponseT actual, entStratBlkAuctQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratBlkAuctQuoResponseT (actual.basic,expected.basic, logMsg);
}

