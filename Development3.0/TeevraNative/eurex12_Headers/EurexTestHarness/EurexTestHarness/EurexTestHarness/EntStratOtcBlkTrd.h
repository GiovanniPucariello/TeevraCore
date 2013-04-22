#include <EntStratOtcBlkTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratOtcBlkTrdRequestT getBscEntStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	bscEntStratOtcBlkTrdRequestT vbscEntStratOtcBlkTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntStratOtcBlkTrd.bscEntStratOtcBlkTrdRequestT.buyCod", lbuyCod);
	vbscEntStratOtcBlkTrdRequestT.buyCod = lbuyCod[0];

	vbscEntStratOtcBlkTrdRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscEntStratOtcBlkTrdRequestT");
	vbscEntStratOtcBlkTrdRequestT.stratEquLegGrp = getStratEquLegGrpT(testCaseNum, "bscEntStratOtcBlkTrdRequestT");
	vbscEntStratOtcBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntStratOtcBlkTrdRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratOtcBlkTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratOtcBlkTrd.bscEntStratOtcBlkTrdRequestT.trdXQty", ltrdXQty);
	memcpy(vbscEntStratOtcBlkTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscEntStratOtcBlkTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntStratOtcBlkTrd.bscEntStratOtcBlkTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscEntStratOtcBlkTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntStratOtcBlkTrd.bscEntStratOtcBlkTrdRequestT.opnClsCod", lopnClsCod);
	vbscEntStratOtcBlkTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscEntStratOtcBlkTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("EntStratOtcBlkTrd.bscEntStratOtcBlkTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscEntStratOtcBlkTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);
	return vbscEntStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extEntStratOtcBlkTrdRequestT getExtEntStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	extEntStratOtcBlkTrdRequestT vextEntStratOtcBlkTrdRequestT;
	int i;

	vextEntStratOtcBlkTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extEntStratOtcBlkTrdRequestT");
	vextEntStratOtcBlkTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "extEntStratOtcBlkTrdRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vextEntStratOtcBlkTrdRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntStratOtcBlkTrd.extEntStratOtcBlkTrdRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vextEntStratOtcBlkTrdRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);
	return vextEntStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratOtcBlkTrdRequestT getEntStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	entStratOtcBlkTrdRequestT ventStratOtcBlkTrdRequestT;
	int i;

	ventStratOtcBlkTrdRequestT.header = getDataHeaderT(testCaseNum, "entStratOtcBlkTrdRequestT");
	ventStratOtcBlkTrdRequestT.basic = getBscEntStratOtcBlkTrdRequestT(testCaseNum, "entStratOtcBlkTrdRequestT");
	ventStratOtcBlkTrdRequestT.extension = getExtEntStratOtcBlkTrdRequestT(testCaseNum, "entStratOtcBlkTrdRequestT");	return ventStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratOtcBlkTrdResponseT getBscEntStratOtcBlkTrdResponseT(char* testCaseNum , const char *root) {
	bscEntStratOtcBlkTrdResponseT vbscEntStratOtcBlkTrdResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscEntStratOtcBlkTrdResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("EntStratOtcBlkTrd.bscEntStratOtcBlkTrdResponseT.trnIdNo", ltrnIdNo);
	memcpy(vbscEntStratOtcBlkTrdResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscEntStratOtcBlkTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("EntStratOtcBlkTrd.bscEntStratOtcBlkTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vbscEntStratOtcBlkTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntStratOtcBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntStratOtcBlkTrd.bscEntStratOtcBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntStratOtcBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntStratOtcBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratOtcBlkTrdResponseT getEntStratOtcBlkTrdResponseT(char* testCaseNum , const char *root) {
	entStratOtcBlkTrdResponseT ventStratOtcBlkTrdResponseT;
	int i;

	ventStratOtcBlkTrdResponseT.header = getDataHeaderT(testCaseNum, "entStratOtcBlkTrdResponseT");
	ventStratOtcBlkTrdResponseT.basic = getBscEntStratOtcBlkTrdResponseT(testCaseNum, "entStratOtcBlkTrdResponseT");	return ventStratOtcBlkTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratOtcBlkTrdRequestT(bscEntStratOtcBlkTrdRequestT actual, bscEntStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOtcBlkTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareStratEquLegGrpT (actual.stratEquLegGrp,expected.stratEquLegGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOtcBlkTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOtcBlkTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOtcBlkTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOtcBlkTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtEntStratOtcBlkTrdRequestT(extEntStratOtcBlkTrdRequestT actual, extEntStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntStratOtcBlkTrdRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratOtcBlkTrdRequestT(entStratOtcBlkTrdRequestT actual, entStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratOtcBlkTrdRequestT (actual.basic,expected.basic, logMsg);
	compareExtEntStratOtcBlkTrdRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratOtcBlkTrdResponseT(bscEntStratOtcBlkTrdResponseT actual, bscEntStratOtcBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOtcBlkTrdResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOtcBlkTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOtcBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratOtcBlkTrdResponseT(entStratOtcBlkTrdResponseT actual, entStratOtcBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratOtcBlkTrdResponseT (actual.basic,expected.basic, logMsg);
}

