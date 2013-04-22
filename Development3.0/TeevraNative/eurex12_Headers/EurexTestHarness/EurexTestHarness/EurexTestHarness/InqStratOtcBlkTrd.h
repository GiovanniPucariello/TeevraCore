#include <InqStratOtcBlkTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratOtcBlkTrdRequestT getBscInqStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	bscInqStratOtcBlkTrdRequestT vbscInqStratOtcBlkTrdRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscInqStratOtcBlkTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqStratOtcBlkTrd.bscInqStratOtcBlkTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vbscInqStratOtcBlkTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vbscInqStratOtcBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqStratOtcBlkTrdRequestT");	return vbscInqStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqStratOtcBlkTrdRequestT getInqStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	inqStratOtcBlkTrdRequestT vinqStratOtcBlkTrdRequestT;
	int i;

	vinqStratOtcBlkTrdRequestT.header = getDataHeaderT(testCaseNum, "inqStratOtcBlkTrdRequestT");
	vinqStratOtcBlkTrdRequestT.basic = getBscInqStratOtcBlkTrdRequestT(testCaseNum, "inqStratOtcBlkTrdRequestT");	return vinqStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratOtcBlkTrdRecT getBscInqStratOtcBlkTrdRecT(char* testCaseNum , const char *root) {
	bscInqStratOtcBlkTrdRecT vbscInqStratOtcBlkTrdRecT;
	int i;

	char lopnClsCod[1] = {""};
	getStrProperty("InqStratOtcBlkTrd.bscInqStratOtcBlkTrdRecT.opnClsCod", lopnClsCod);
	vbscInqStratOtcBlkTrdRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<MEMB_CTPY_ID_COD_LEN;i++) {
		vbscInqStratOtcBlkTrdRecT.membCtpyIdCod[i]= ' ';
	}
	char lmembCtpyIdCod[MEMB_CTPY_ID_COD_LEN] = {""};
	getStrProperty("InqStratOtcBlkTrd.bscInqStratOtcBlkTrdRecT.membCtpyIdCod", lmembCtpyIdCod);
	memcpy(vbscInqStratOtcBlkTrdRecT.membCtpyIdCod, lmembCtpyIdCod, MEMB_CTPY_ID_COD_LEN);

	vbscInqStratOtcBlkTrdRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqStratOtcBlkTrdRecT");
	char lblkTrdStsCod[1] = {""};
	getStrProperty("InqStratOtcBlkTrd.bscInqStratOtcBlkTrdRecT.blkTrdStsCod", lblkTrdStsCod);
	vbscInqStratOtcBlkTrdRecT.blkTrdStsCod = lblkTrdStsCod[0];
	return vbscInqStratOtcBlkTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratOtcBlkTrdResponseT getBscInqStratOtcBlkTrdResponseT(char* testCaseNum , const char *root) {
	bscInqStratOtcBlkTrdResponseT vbscInqStratOtcBlkTrdResponseT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqStratOtcBlkTrd.bscInqStratOtcBlkTrdResponseT.buyCod", lbuyCod);
	vbscInqStratOtcBlkTrdResponseT.buyCod = lbuyCod[0];

	vbscInqStratOtcBlkTrdResponseT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscInqStratOtcBlkTrdResponseT");
	vbscInqStratOtcBlkTrdResponseT.stratEquLegGrp = getStratEquLegGrpT(testCaseNum, "bscInqStratOtcBlkTrdResponseT");
	vbscInqStratOtcBlkTrdResponseT.stratTrdNoGrp = getStratTrdNoGrpT(testCaseNum, "bscInqStratOtcBlkTrdResponseT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqStratOtcBlkTrdResponseT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqStratOtcBlkTrd.bscInqStratOtcBlkTrdResponseT.trdXQty", ltrdXQty);
	memcpy(vbscInqStratOtcBlkTrdResponseT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqStratOtcBlkTrdResponseT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqStratOtcBlkTrd.bscInqStratOtcBlkTrdResponseT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscInqStratOtcBlkTrdResponseT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqStratOtcBlkTrdResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqStratOtcBlkTrd.bscInqStratOtcBlkTrdResponseT.currTypCod", lcurrTypCod);
	memcpy(vbscInqStratOtcBlkTrdResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqStratOtcBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqStratOtcBlkTrd.bscInqStratOtcBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqStratOtcBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqStratOtcBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqStratOtcBlkTrdRecT getExtInqStratOtcBlkTrdRecT(char* testCaseNum , const char *root) {
	extInqStratOtcBlkTrdRecT vextInqStratOtcBlkTrdRecT;
	int i;

	vextInqStratOtcBlkTrdRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqStratOtcBlkTrdRecT");
	vextInqStratOtcBlkTrdRecT.txtGrp = getTxtGrpT(testCaseNum, "extInqStratOtcBlkTrdRecT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vextInqStratOtcBlkTrdRecT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqStratOtcBlkTrd.extInqStratOtcBlkTrdRecT.membClgIdCod", lmembClgIdCod);
	memcpy(vextInqStratOtcBlkTrdRecT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);
	return vextInqStratOtcBlkTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqStratOtcBlkTrdResponseT getExtInqStratOtcBlkTrdResponseT(char* testCaseNum , const char *root) {
	extInqStratOtcBlkTrdResponseT vextInqStratOtcBlkTrdResponseT;
	int i;
	return vextInqStratOtcBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqStratOtcBlkTrdResponseT getInqStratOtcBlkTrdResponseT(char* testCaseNum , const char *root) {
	inqStratOtcBlkTrdResponseT vinqStratOtcBlkTrdResponseT;
	int i;

	vinqStratOtcBlkTrdResponseT.header = getDataHeaderT(testCaseNum, "inqStratOtcBlkTrdResponseT");
	vinqStratOtcBlkTrdResponseT.basic = getBscInqStratOtcBlkTrdResponseT(testCaseNum, "inqStratOtcBlkTrdResponseT");
	vinqStratOtcBlkTrdResponseT.extension = getExtInqStratOtcBlkTrdResponseT(testCaseNum, "inqStratOtcBlkTrdResponseT");	return vinqStratOtcBlkTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratOtcBlkTrdRequestT(bscInqStratOtcBlkTrdRequestT actual, bscInqStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratOtcBlkTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqStratOtcBlkTrdRequestT(inqStratOtcBlkTrdRequestT actual, inqStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqStratOtcBlkTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratOtcBlkTrdRecT(bscInqStratOtcBlkTrdRecT actual, bscInqStratOtcBlkTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratOtcBlkTrdRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membCtpyIdCod, expected.membCtpyIdCod, MEMB_CTPY_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratOtcBlkTrdRecT, membCtpyIdCod not matching. Actual %s but Expected %s", actual.membCtpyIdCod, expected.membCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.blkTrdStsCod!= expected.blkTrdStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratOtcBlkTrdRecT, blkTrdStsCodnot matching. Actual %d but Expected %d", actual.blkTrdStsCod, expected.blkTrdStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratOtcBlkTrdResponseT(bscInqStratOtcBlkTrdResponseT actual, bscInqStratOtcBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratOtcBlkTrdResponseT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareStratEquLegGrpT (actual.stratEquLegGrp,expected.stratEquLegGrp, logMsg);
	compareStratTrdNoGrpT (actual.stratTrdNoGrp,expected.stratTrdNoGrp, logMsg);
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratOtcBlkTrdResponseT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratOtcBlkTrdResponseT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratOtcBlkTrdResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratOtcBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_STRAT_OTC_BLK_TRD_REC_MAX;i++) {
		compareBscInqStratOtcBlkTrdRecT (actual.bscInqStratOtcBlkTrdRec[i],expected.bscInqStratOtcBlkTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqStratOtcBlkTrdRecT(extInqStratOtcBlkTrdRecT actual, extInqStratOtcBlkTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqStratOtcBlkTrdRecT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqStratOtcBlkTrdResponseT(extInqStratOtcBlkTrdResponseT actual, extInqStratOtcBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_STRAT_OTC_BLK_TRD_REC_MAX;i++) {
		compareExtInqStratOtcBlkTrdRecT (actual.extInqStratOtcBlkTrdRec[i],expected.extInqStratOtcBlkTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqStratOtcBlkTrdResponseT(inqStratOtcBlkTrdResponseT actual, inqStratOtcBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqStratOtcBlkTrdResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqStratOtcBlkTrdResponseT (actual.extension,expected.extension, logMsg);
}

