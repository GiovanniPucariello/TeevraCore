#include <ModCollTrn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModCollTrnRequestT getBscModCollTrnRequestT(char* testCaseNum , const char *root) {
	bscModCollTrnRequestT vbscModCollTrnRequestT;
	int i;

	for(i=0;i<COLL_TRN_ID_NO_LEN;i++) {
		vbscModCollTrnRequestT.collTrnIdNo[i]= ' ';
	}
	char lcollTrnIdNo[COLL_TRN_ID_NO_LEN] = {""};
	getStrProperty("ModCollTrn.bscModCollTrnRequestT.collTrnIdNo", lcollTrnIdNo);
	memcpy(vbscModCollTrnRequestT.collTrnIdNo, lcollTrnIdNo, COLL_TRN_ID_NO_LEN);

	char lcollActnCod[1] = {""};
	getStrProperty("ModCollTrn.bscModCollTrnRequestT.collActnCod", lcollActnCod);
	vbscModCollTrnRequestT.collActnCod = lcollActnCod[0];

	for(i=0;i<COLL_ERR_TXT_LEN;i++) {
		vbscModCollTrnRequestT.collTxt[i]= ' ';
	}
	char lcollTxt[COLL_ERR_TXT_LEN] = {""};
	getStrProperty("ModCollTrn.bscModCollTrnRequestT.collTxt", lcollTxt);
	memcpy(vbscModCollTrnRequestT.collTxt, lcollTxt, COLL_ERR_TXT_LEN);

	char lcollTxtChgInd[1] = {""};
	getStrProperty("ModCollTrn.bscModCollTrnRequestT.collTxtChgInd", lcollTxtChgInd);
	vbscModCollTrnRequestT.collTxtChgInd = lcollTxtChgInd[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModCollTrnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModCollTrn.bscModCollTrnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModCollTrnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModCollTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modCollTrnRequestT getModCollTrnRequestT(char* testCaseNum , const char *root) {
	modCollTrnRequestT vmodCollTrnRequestT;
	int i;

	vmodCollTrnRequestT.header = getDataHeaderT(testCaseNum, "modCollTrnRequestT");
	vmodCollTrnRequestT.basic = getBscModCollTrnRequestT(testCaseNum, "modCollTrnRequestT");	return vmodCollTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModCollTrnResponseT getBscModCollTrnResponseT(char* testCaseNum , const char *root) {
	bscModCollTrnResponseT vbscModCollTrnResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModCollTrnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModCollTrn.bscModCollTrnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModCollTrnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModCollTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modCollTrnResponseT getModCollTrnResponseT(char* testCaseNum , const char *root) {
	modCollTrnResponseT vmodCollTrnResponseT;
	int i;

	vmodCollTrnResponseT.header = getDataHeaderT(testCaseNum, "modCollTrnResponseT");
	vmodCollTrnResponseT.basic = getBscModCollTrnResponseT(testCaseNum, "modCollTrnResponseT");	return vmodCollTrnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModCollTrnRequestT(bscModCollTrnRequestT actual, bscModCollTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.collTrnIdNo, expected.collTrnIdNo, COLL_TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModCollTrnRequestT, collTrnIdNo not matching. Actual %s but Expected %s", actual.collTrnIdNo, expected.collTrnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.collActnCod!= expected.collActnCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModCollTrnRequestT, collActnCodnot matching. Actual %d but Expected %d", actual.collActnCod, expected.collActnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collTxt, expected.collTxt, COLL_ERR_TXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModCollTrnRequestT, collTxt not matching. Actual %s but Expected %s", actual.collTxt, expected.collTxt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.collTxtChgInd!= expected.collTxtChgInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModCollTrnRequestT, collTxtChgIndnot matching. Actual %d but Expected %d", actual.collTxtChgInd, expected.collTxtChgInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModCollTrnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModCollTrnRequestT(modCollTrnRequestT actual, modCollTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModCollTrnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModCollTrnResponseT(bscModCollTrnResponseT actual, bscModCollTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModCollTrnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModCollTrnResponseT(modCollTrnResponseT actual, modCollTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModCollTrnResponseT (actual.basic,expected.basic, logMsg);
}

