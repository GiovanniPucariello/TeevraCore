#include <ModRptSel.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModRptSelRequestT getBscModRptSelRequestT(char* testCaseNum , const char *root) {
	bscModRptSelRequestT vbscModRptSelRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscModRptSelRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("ModRptSel.bscModRptSelRequestT.prodId", lprodId);
	memcpy(vbscModRptSelRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModRptSelRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModRptSel.bscModRptSelRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModRptSelRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModRptSelRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extModRptSelRequestT getExtModRptSelRequestT(char* testCaseNum , const char *root) {
	extModRptSelRequestT vextModRptSelRequestT;
	int i;

	for(i=0;i<DRIV_RPT_ID_COD_LEN;i++) {
		vextModRptSelRequestT.rptIdCod[i]= ' ';
	}
	char lrptIdCod[DRIV_RPT_ID_COD_LEN] = {""};
	getStrProperty("ModRptSel.extModRptSelRequestT.rptIdCod", lrptIdCod);
	memcpy(vextModRptSelRequestT.rptIdCod, lrptIdCod, DRIV_RPT_ID_COD_LEN);

	char llocCod[1] = {""};
	getStrProperty("ModRptSel.extModRptSelRequestT.locCod", llocCod);
	vextModRptSelRequestT.locCod = llocCod[0];

	char lstdRptReqInd[1] = {""};
	getStrProperty("ModRptSel.extModRptSelRequestT.stdRptReqInd", lstdRptReqInd);
	vextModRptSelRequestT.stdRptReqInd = lstdRptReqInd[0];

	char lrawRptReqInd[1] = {""};
	getStrProperty("ModRptSel.extModRptSelRequestT.rawRptReqInd", lrawRptReqInd);
	vextModRptSelRequestT.rawRptReqInd = lrawRptReqInd[0];
	return vextModRptSelRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modRptSelRequestT getModRptSelRequestT(char* testCaseNum , const char *root) {
	modRptSelRequestT vmodRptSelRequestT;
	int i;

	vmodRptSelRequestT.header = getDataHeaderT(testCaseNum, "modRptSelRequestT");
	vmodRptSelRequestT.basic = getBscModRptSelRequestT(testCaseNum, "modRptSelRequestT");
	vmodRptSelRequestT.extension = getExtModRptSelRequestT(testCaseNum, "modRptSelRequestT");	return vmodRptSelRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModRptSelResponseT getBscModRptSelResponseT(char* testCaseNum , const char *root) {
	bscModRptSelResponseT vbscModRptSelResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModRptSelResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModRptSel.bscModRptSelResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModRptSelResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModRptSelResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modRptSelResponseT getModRptSelResponseT(char* testCaseNum , const char *root) {
	modRptSelResponseT vmodRptSelResponseT;
	int i;

	vmodRptSelResponseT.header = getDataHeaderT(testCaseNum, "modRptSelResponseT");
	vmodRptSelResponseT.basic = getBscModRptSelResponseT(testCaseNum, "modRptSelResponseT");	return vmodRptSelResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModRptSelRequestT(bscModRptSelRequestT actual, bscModRptSelRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModRptSelRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModRptSelRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtModRptSelRequestT(extModRptSelRequestT actual, extModRptSelRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rptIdCod, expected.rptIdCod, DRIV_RPT_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extModRptSelRequestT, rptIdCod not matching. Actual %s but Expected %s", actual.rptIdCod, expected.rptIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.locCod!= expected.locCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extModRptSelRequestT, locCodnot matching. Actual %d but Expected %d", actual.locCod, expected.locCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.stdRptReqInd!= expected.stdRptReqInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extModRptSelRequestT, stdRptReqIndnot matching. Actual %d but Expected %d", actual.stdRptReqInd, expected.stdRptReqInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.rawRptReqInd!= expected.rawRptReqInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extModRptSelRequestT, rawRptReqIndnot matching. Actual %d but Expected %d", actual.rawRptReqInd, expected.rawRptReqInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModRptSelRequestT(modRptSelRequestT actual, modRptSelRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModRptSelRequestT (actual.basic,expected.basic, logMsg);
	compareExtModRptSelRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModRptSelResponseT(bscModRptSelResponseT actual, bscModRptSelResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModRptSelResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModRptSelResponseT(modRptSelResponseT actual, modRptSelResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModRptSelResponseT (actual.basic,expected.basic, logMsg);
}

