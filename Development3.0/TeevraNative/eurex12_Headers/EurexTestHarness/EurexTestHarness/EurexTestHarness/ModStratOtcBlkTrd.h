#include <ModStratOtcBlkTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModStratOtcBlkTrdRequestT getBscModStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	bscModStratOtcBlkTrdRequestT vbscModStratOtcBlkTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModStratOtcBlkTrd.bscModStratOtcBlkTrdRequestT.buyCod", lbuyCod);
	vbscModStratOtcBlkTrdRequestT.buyCod = lbuyCod[0];

	vbscModStratOtcBlkTrdRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscModStratOtcBlkTrdRequestT");
	vbscModStratOtcBlkTrdRequestT.stratEquLegGrp = getStratEquLegGrpT(testCaseNum, "bscModStratOtcBlkTrdRequestT");
	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscModStratOtcBlkTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("ModStratOtcBlkTrd.bscModStratOtcBlkTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vbscModStratOtcBlkTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vbscModStratOtcBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscModStratOtcBlkTrdRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModStratOtcBlkTrdRequestT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModStratOtcBlkTrd.bscModStratOtcBlkTrdRequestT.trdXQty", ltrdXQty);
	memcpy(vbscModStratOtcBlkTrdRequestT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscModStratOtcBlkTrdRequestT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModStratOtcBlkTrd.bscModStratOtcBlkTrdRequestT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscModStratOtcBlkTrdRequestT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscModStratOtcBlkTrdRequestT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("ModStratOtcBlkTrd.bscModStratOtcBlkTrdRequestT.currTypCod", lcurrTypCod);
	memcpy(vbscModStratOtcBlkTrdRequestT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModStratOtcBlkTrd.bscModStratOtcBlkTrdRequestT.opnClsCod", lopnClsCod);
	vbscModStratOtcBlkTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscModStratOtcBlkTrdRequestT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("ModStratOtcBlkTrd.bscModStratOtcBlkTrdRequestT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscModStratOtcBlkTrdRequestT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModStratOtcBlkTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModStratOtcBlkTrd.bscModStratOtcBlkTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModStratOtcBlkTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extModStratOtcBlkTrdRequestT getExtModStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	extModStratOtcBlkTrdRequestT vextModStratOtcBlkTrdRequestT;
	int i;

	vextModStratOtcBlkTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extModStratOtcBlkTrdRequestT");
	vextModStratOtcBlkTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "extModStratOtcBlkTrdRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vextModStratOtcBlkTrdRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("ModStratOtcBlkTrd.extModStratOtcBlkTrdRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vextModStratOtcBlkTrdRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);
	return vextModStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modStratOtcBlkTrdRequestT getModStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	modStratOtcBlkTrdRequestT vmodStratOtcBlkTrdRequestT;
	int i;

	vmodStratOtcBlkTrdRequestT.header = getDataHeaderT(testCaseNum, "modStratOtcBlkTrdRequestT");
	vmodStratOtcBlkTrdRequestT.basic = getBscModStratOtcBlkTrdRequestT(testCaseNum, "modStratOtcBlkTrdRequestT");
	vmodStratOtcBlkTrdRequestT.extension = getExtModStratOtcBlkTrdRequestT(testCaseNum, "modStratOtcBlkTrdRequestT");	return vmodStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModStratOtcBlkTrdResponseT getBscModStratOtcBlkTrdResponseT(char* testCaseNum , const char *root) {
	bscModStratOtcBlkTrdResponseT vbscModStratOtcBlkTrdResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModStratOtcBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModStratOtcBlkTrd.bscModStratOtcBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModStratOtcBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModStratOtcBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modStratOtcBlkTrdResponseT getModStratOtcBlkTrdResponseT(char* testCaseNum , const char *root) {
	modStratOtcBlkTrdResponseT vmodStratOtcBlkTrdResponseT;
	int i;

	vmodStratOtcBlkTrdResponseT.header = getDataHeaderT(testCaseNum, "modStratOtcBlkTrdResponseT");
	vmodStratOtcBlkTrdResponseT.basic = getBscModStratOtcBlkTrdResponseT(testCaseNum, "modStratOtcBlkTrdResponseT");	return vmodStratOtcBlkTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModStratOtcBlkTrdRequestT(bscModStratOtcBlkTrdRequestT actual, bscModStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOtcBlkTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareStratEquLegGrpT (actual.stratEquLegGrp,expected.stratEquLegGrp, logMsg);
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOtcBlkTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOtcBlkTrdRequestT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOtcBlkTrdRequestT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOtcBlkTrdRequestT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOtcBlkTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOtcBlkTrdRequestT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOtcBlkTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtModStratOtcBlkTrdRequestT(extModStratOtcBlkTrdRequestT actual, extModStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extModStratOtcBlkTrdRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModStratOtcBlkTrdRequestT(modStratOtcBlkTrdRequestT actual, modStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModStratOtcBlkTrdRequestT (actual.basic,expected.basic, logMsg);
	compareExtModStratOtcBlkTrdRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModStratOtcBlkTrdResponseT(bscModStratOtcBlkTrdResponseT actual, bscModStratOtcBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOtcBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModStratOtcBlkTrdResponseT(modStratOtcBlkTrdResponseT actual, modStratOtcBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModStratOtcBlkTrdResponseT (actual.basic,expected.basic, logMsg);
}

