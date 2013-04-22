#include <EntHistRptReq.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntHistRptReqRequestT getBscEntHistRptReqRequestT(char* testCaseNum , const char *root) {
	bscEntHistRptReqRequestT vbscEntHistRptReqRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscEntHistRptReqRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("EntHistRptReq.bscEntHistRptReqRequestT.prodId", lprodId);
	memcpy(vbscEntHistRptReqRequestT.prodId, lprodId, PROD_ID_LEN);
	return vbscEntHistRptReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extEntHistRptReqRequestT getExtEntHistRptReqRequestT(char* testCaseNum , const char *root) {
	extEntHistRptReqRequestT vextEntHistRptReqRequestT;
	int i;

	for(i=0;i<DRIV_RPT_ID_COD_LEN;i++) {
		vextEntHistRptReqRequestT.rptIdCod[i]= ' ';
	}
	char lrptIdCod[DRIV_RPT_ID_COD_LEN] = {""};
	getStrProperty("EntHistRptReq.extEntHistRptReqRequestT.rptIdCod", lrptIdCod);
	memcpy(vextEntHistRptReqRequestT.rptIdCod, lrptIdCod, DRIV_RPT_ID_COD_LEN);

	char llocCod[1] = {""};
	getStrProperty("EntHistRptReq.extEntHistRptReqRequestT.locCod", llocCod);
	vextEntHistRptReqRequestT.locCod = llocCod[0];

	char lstdRptReqInd[1] = {""};
	getStrProperty("EntHistRptReq.extEntHistRptReqRequestT.stdRptReqInd", lstdRptReqInd);
	vextEntHistRptReqRequestT.stdRptReqInd = lstdRptReqInd[0];

	char lrawRptReqInd[1] = {""};
	getStrProperty("EntHistRptReq.extEntHistRptReqRequestT.rawRptReqInd", lrawRptReqInd);
	vextEntHistRptReqRequestT.rawRptReqInd = lrawRptReqInd[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextEntHistRptReqRequestT.histRptDat[i]= ' ';
	}
	char lhistRptDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntHistRptReq.extEntHistRptReqRequestT.histRptDat", lhistRptDat);
	memcpy(vextEntHistRptReqRequestT.histRptDat, lhistRptDat, DRIV_DATE_LEN);
	return vextEntHistRptReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entHistRptReqRequestT getEntHistRptReqRequestT(char* testCaseNum , const char *root) {
	entHistRptReqRequestT ventHistRptReqRequestT;
	int i;

	ventHistRptReqRequestT.header = getDataHeaderT(testCaseNum, "entHistRptReqRequestT");
	ventHistRptReqRequestT.basic = getBscEntHistRptReqRequestT(testCaseNum, "entHistRptReqRequestT");
	ventHistRptReqRequestT.extension = getExtEntHistRptReqRequestT(testCaseNum, "entHistRptReqRequestT");	return ventHistRptReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entHistRptReqResponseT getEntHistRptReqResponseT(char* testCaseNum , const char *root) {
	entHistRptReqResponseT ventHistRptReqResponseT;
	int i;

	ventHistRptReqResponseT.header = getDataHeaderT(testCaseNum, "entHistRptReqResponseT");	return ventHistRptReqResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntHistRptReqRequestT(bscEntHistRptReqRequestT actual, bscEntHistRptReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntHistRptReqRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtEntHistRptReqRequestT(extEntHistRptReqRequestT actual, extEntHistRptReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rptIdCod, expected.rptIdCod, DRIV_RPT_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntHistRptReqRequestT, rptIdCod not matching. Actual %s but Expected %s", actual.rptIdCod, expected.rptIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.locCod!= expected.locCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntHistRptReqRequestT, locCodnot matching. Actual %d but Expected %d", actual.locCod, expected.locCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.stdRptReqInd!= expected.stdRptReqInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntHistRptReqRequestT, stdRptReqIndnot matching. Actual %d but Expected %d", actual.stdRptReqInd, expected.stdRptReqInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.rawRptReqInd!= expected.rawRptReqInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntHistRptReqRequestT, rawRptReqIndnot matching. Actual %d but Expected %d", actual.rawRptReqInd, expected.rawRptReqInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.histRptDat, expected.histRptDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntHistRptReqRequestT, histRptDat not matching. Actual %s but Expected %s", actual.histRptDat, expected.histRptDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntHistRptReqRequestT(entHistRptReqRequestT actual, entHistRptReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntHistRptReqRequestT (actual.basic,expected.basic, logMsg);
	compareExtEntHistRptReqRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntHistRptReqResponseT(entHistRptReqResponseT actual, entHistRptReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

