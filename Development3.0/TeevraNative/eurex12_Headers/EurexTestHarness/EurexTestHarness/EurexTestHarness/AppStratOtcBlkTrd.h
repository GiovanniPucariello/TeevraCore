#include <AppStratOtcBlkTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscAppStratOtcBlkTrdRequestT getBscAppStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	bscAppStratOtcBlkTrdRequestT vbscAppStratOtcBlkTrdRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("AppStratOtcBlkTrd.bscAppStratOtcBlkTrdRequestT.buyCod", lbuyCod);
	vbscAppStratOtcBlkTrdRequestT.buyCod = lbuyCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscAppStratOtcBlkTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("AppStratOtcBlkTrd.bscAppStratOtcBlkTrdRequestT.prodId", lprodId);
	memcpy(vbscAppStratOtcBlkTrdRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscAppStratOtcBlkTrdRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("AppStratOtcBlkTrd.bscAppStratOtcBlkTrdRequestT.trnIdNo", ltrnIdNo);
	memcpy(vbscAppStratOtcBlkTrdRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vbscAppStratOtcBlkTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscAppStratOtcBlkTrdRequestT");
	char lopnClsCod[1] = {""};
	getStrProperty("AppStratOtcBlkTrd.bscAppStratOtcBlkTrdRequestT.opnClsCod", lopnClsCod);
	vbscAppStratOtcBlkTrdRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscAppStratOtcBlkTrdRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppStratOtcBlkTrd.bscAppStratOtcBlkTrdRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscAppStratOtcBlkTrdRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscAppStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extAppStratOtcBlkTrdRequestT getExtAppStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	extAppStratOtcBlkTrdRequestT vextAppStratOtcBlkTrdRequestT;
	int i;

	vextAppStratOtcBlkTrdRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extAppStratOtcBlkTrdRequestT");
	vextAppStratOtcBlkTrdRequestT.txtGrp = getTxtGrpT(testCaseNum, "extAppStratOtcBlkTrdRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vextAppStratOtcBlkTrdRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("AppStratOtcBlkTrd.extAppStratOtcBlkTrdRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vextAppStratOtcBlkTrdRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);
	return vextAppStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
appStratOtcBlkTrdRequestT getAppStratOtcBlkTrdRequestT(char* testCaseNum , const char *root) {
	appStratOtcBlkTrdRequestT vappStratOtcBlkTrdRequestT;
	int i;

	vappStratOtcBlkTrdRequestT.header = getDataHeaderT(testCaseNum, "appStratOtcBlkTrdRequestT");
	vappStratOtcBlkTrdRequestT.basic = getBscAppStratOtcBlkTrdRequestT(testCaseNum, "appStratOtcBlkTrdRequestT");
	vappStratOtcBlkTrdRequestT.extension = getExtAppStratOtcBlkTrdRequestT(testCaseNum, "appStratOtcBlkTrdRequestT");	return vappStratOtcBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscAppStratOtcBlkTrdResponseT getBscAppStratOtcBlkTrdResponseT(char* testCaseNum , const char *root) {
	bscAppStratOtcBlkTrdResponseT vbscAppStratOtcBlkTrdResponseT;
	int i;

	vbscAppStratOtcBlkTrdResponseT.stratTrdNoGrp = getStratTrdNoGrpT(testCaseNum, "bscAppStratOtcBlkTrdResponseT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscAppStratOtcBlkTrdResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AppStratOtcBlkTrd.bscAppStratOtcBlkTrdResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscAppStratOtcBlkTrdResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscAppStratOtcBlkTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
appStratOtcBlkTrdResponseT getAppStratOtcBlkTrdResponseT(char* testCaseNum , const char *root) {
	appStratOtcBlkTrdResponseT vappStratOtcBlkTrdResponseT;
	int i;

	vappStratOtcBlkTrdResponseT.header = getDataHeaderT(testCaseNum, "appStratOtcBlkTrdResponseT");
	vappStratOtcBlkTrdResponseT.basic = getBscAppStratOtcBlkTrdResponseT(testCaseNum, "appStratOtcBlkTrdResponseT");	return vappStratOtcBlkTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscAppStratOtcBlkTrdRequestT(bscAppStratOtcBlkTrdRequestT actual, bscAppStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAppStratOtcBlkTrdRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAppStratOtcBlkTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAppStratOtcBlkTrdRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAppStratOtcBlkTrdRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAppStratOtcBlkTrdRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtAppStratOtcBlkTrdRequestT(extAppStratOtcBlkTrdRequestT actual, extAppStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extAppStratOtcBlkTrdRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAppStratOtcBlkTrdRequestT(appStratOtcBlkTrdRequestT actual, appStratOtcBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscAppStratOtcBlkTrdRequestT (actual.basic,expected.basic, logMsg);
	compareExtAppStratOtcBlkTrdRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscAppStratOtcBlkTrdResponseT(bscAppStratOtcBlkTrdResponseT actual, bscAppStratOtcBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratTrdNoGrpT (actual.stratTrdNoGrp,expected.stratTrdNoGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAppStratOtcBlkTrdResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAppStratOtcBlkTrdResponseT(appStratOtcBlkTrdResponseT actual, appStratOtcBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscAppStratOtcBlkTrdResponseT (actual.basic,expected.basic, logMsg);
}

