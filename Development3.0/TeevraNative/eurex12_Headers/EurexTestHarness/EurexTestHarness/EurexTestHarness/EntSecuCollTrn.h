#include <EntSecuCollTrn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntSecuCollTrnRequestT getBscEntSecuCollTrnRequestT(char* testCaseNum , const char *root) {
	bscEntSecuCollTrnRequestT vbscEntSecuCollTrnRequestT;
	int i;

	for(i=0;i<ISIN_COD_LEN;i++) {
		vbscEntSecuCollTrnRequestT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("EntSecuCollTrn.bscEntSecuCollTrnRequestT.isinCod", lisinCod);
	memcpy(vbscEntSecuCollTrnRequestT.isinCod, lisinCod, ISIN_COD_LEN);

	char lasstPurpCod[1] = {""};
	getStrProperty("EntSecuCollTrn.bscEntSecuCollTrnRequestT.asstPurpCod", lasstPurpCod);
	vbscEntSecuCollTrnRequestT.asstPurpCod = lasstPurpCod[0];

	for(i=0;i<DRIV_CSD_ID_LEN;i++) {
		vbscEntSecuCollTrnRequestT.csdId[i]= ' ';
	}
	char lcsdId[DRIV_CSD_ID_LEN] = {""};
	getStrProperty("EntSecuCollTrn.bscEntSecuCollTrnRequestT.csdId", lcsdId);
	memcpy(vbscEntSecuCollTrnRequestT.csdId, lcsdId, DRIV_CSD_ID_LEN);

	for(i=0;i<CSD_ACCT_NO_LEN;i++) {
		vbscEntSecuCollTrnRequestT.csdPldgAcctNo[i]= ' ';
	}
	char lcsdPldgAcctNo[CSD_ACCT_NO_LEN] = {""};
	getStrProperty("EntSecuCollTrn.bscEntSecuCollTrnRequestT.csdPldgAcctNo", lcsdPldgAcctNo);
	memcpy(vbscEntSecuCollTrnRequestT.csdPldgAcctNo, lcsdPldgAcctNo, CSD_ACCT_NO_LEN);

	for(i=0;i<DRIV_MAIN_ACCT_NO_LEN;i++) {
		vbscEntSecuCollTrnRequestT.mainAcctNo[i]= ' ';
	}
	char lmainAcctNo[DRIV_MAIN_ACCT_NO_LEN] = {""};
	getStrProperty("EntSecuCollTrn.bscEntSecuCollTrnRequestT.mainAcctNo", lmainAcctNo);
	memcpy(vbscEntSecuCollTrnRequestT.mainAcctNo, lmainAcctNo, DRIV_MAIN_ACCT_NO_LEN);

	char ldepWdlInd[1] = {""};
	getStrProperty("EntSecuCollTrn.bscEntSecuCollTrnRequestT.depWdlInd", ldepWdlInd);
	vbscEntSecuCollTrnRequestT.depWdlInd = ldepWdlInd[0];

	for(i=0;i<COLL_TRN_AMNT_LEN;i++) {
		vbscEntSecuCollTrnRequestT.collTrnAmnt[i]= ' ';
	}
	char lcollTrnAmnt[COLL_TRN_AMNT_LEN] = {""};
	getStrProperty("EntSecuCollTrn.bscEntSecuCollTrnRequestT.collTrnAmnt", lcollTrnAmnt);
	memcpy(vbscEntSecuCollTrnRequestT.collTrnAmnt, lcollTrnAmnt, COLL_TRN_AMNT_LEN);

	for(i=0;i<TEXT_LEN;i++) {
		vbscEntSecuCollTrnRequestT.text[i]= ' ';
	}
	char ltext[TEXT_LEN] = {""};
	getStrProperty("EntSecuCollTrn.bscEntSecuCollTrnRequestT.text", ltext);
	memcpy(vbscEntSecuCollTrnRequestT.text, ltext, TEXT_LEN);

	char lcollCovChkInd[1] = {""};
	getStrProperty("EntSecuCollTrn.bscEntSecuCollTrnRequestT.collCovChkInd", lcollCovChkInd);
	vbscEntSecuCollTrnRequestT.collCovChkInd = lcollCovChkInd[0];

	char lcollQtyChkInd[1] = {""};
	getStrProperty("EntSecuCollTrn.bscEntSecuCollTrnRequestT.collQtyChkInd", lcollQtyChkInd);
	vbscEntSecuCollTrnRequestT.collQtyChkInd = lcollQtyChkInd[0];

	char lredBalOnlyInd[1] = {""};
	getStrProperty("EntSecuCollTrn.bscEntSecuCollTrnRequestT.redBalOnlyInd", lredBalOnlyInd);
	vbscEntSecuCollTrnRequestT.redBalOnlyInd = lredBalOnlyInd[0];
	return vbscEntSecuCollTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entSecuCollTrnRequestT getEntSecuCollTrnRequestT(char* testCaseNum , const char *root) {
	entSecuCollTrnRequestT ventSecuCollTrnRequestT;
	int i;

	ventSecuCollTrnRequestT.header = getDataHeaderT(testCaseNum, "entSecuCollTrnRequestT");
	ventSecuCollTrnRequestT.basic = getBscEntSecuCollTrnRequestT(testCaseNum, "entSecuCollTrnRequestT");	return ventSecuCollTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntSecuCollTrnResponseT getBscEntSecuCollTrnResponseT(char* testCaseNum , const char *root) {
	bscEntSecuCollTrnResponseT vbscEntSecuCollTrnResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntSecuCollTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntSecuCollTrn.bscEntSecuCollTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntSecuCollTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntSecuCollTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entSecuCollTrnResponseT getEntSecuCollTrnResponseT(char* testCaseNum , const char *root) {
	entSecuCollTrnResponseT ventSecuCollTrnResponseT;
	int i;

	ventSecuCollTrnResponseT.header = getDataHeaderT(testCaseNum, "entSecuCollTrnResponseT");
	ventSecuCollTrnResponseT.basic = getBscEntSecuCollTrnResponseT(testCaseNum, "entSecuCollTrnResponseT");	return ventSecuCollTrnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntSecuCollTrnRequestT(bscEntSecuCollTrnRequestT actual, bscEntSecuCollTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSecuCollTrnRequestT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.asstPurpCod!= expected.asstPurpCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSecuCollTrnRequestT, asstPurpCodnot matching. Actual %d but Expected %d", actual.asstPurpCod, expected.asstPurpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdId, expected.csdId, DRIV_CSD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSecuCollTrnRequestT, csdId not matching. Actual %s but Expected %s", actual.csdId, expected.csdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdPldgAcctNo, expected.csdPldgAcctNo, CSD_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSecuCollTrnRequestT, csdPldgAcctNo not matching. Actual %s but Expected %s", actual.csdPldgAcctNo, expected.csdPldgAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mainAcctNo, expected.mainAcctNo, DRIV_MAIN_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSecuCollTrnRequestT, mainAcctNo not matching. Actual %s but Expected %s", actual.mainAcctNo, expected.mainAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.depWdlInd!= expected.depWdlInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSecuCollTrnRequestT, depWdlIndnot matching. Actual %d but Expected %d", actual.depWdlInd, expected.depWdlInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collTrnAmnt, expected.collTrnAmnt, COLL_TRN_AMNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSecuCollTrnRequestT, collTrnAmnt not matching. Actual %s but Expected %s", actual.collTrnAmnt, expected.collTrnAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.text, expected.text, TEXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSecuCollTrnRequestT, text not matching. Actual %s but Expected %s", actual.text, expected.text);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.collCovChkInd!= expected.collCovChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSecuCollTrnRequestT, collCovChkIndnot matching. Actual %d but Expected %d", actual.collCovChkInd, expected.collCovChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.collQtyChkInd!= expected.collQtyChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSecuCollTrnRequestT, collQtyChkIndnot matching. Actual %d but Expected %d", actual.collQtyChkInd, expected.collQtyChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.redBalOnlyInd!= expected.redBalOnlyInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSecuCollTrnRequestT, redBalOnlyIndnot matching. Actual %d but Expected %d", actual.redBalOnlyInd, expected.redBalOnlyInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntSecuCollTrnRequestT(entSecuCollTrnRequestT actual, entSecuCollTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntSecuCollTrnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntSecuCollTrnResponseT(bscEntSecuCollTrnResponseT actual, bscEntSecuCollTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSecuCollTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntSecuCollTrnResponseT(entSecuCollTrnResponseT actual, entSecuCollTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntSecuCollTrnResponseT (actual.basic,expected.basic, logMsg);
}

