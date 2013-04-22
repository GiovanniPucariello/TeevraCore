#include <DelPosnMembTsf.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelPosnMembTsfRequestT getBscDelPosnMembTsfRequestT(char* testCaseNum , const char *root) {
	bscDelPosnMembTsfRequestT vbscDelPosnMembTsfRequestT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscDelPosnMembTsfRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DelPosnMembTsf.bscDelPosnMembTsfRequestT.trnIdNo", ltrnIdNo);
	memcpy(vbscDelPosnMembTsfRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		vbscDelPosnMembTsfRequestT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("DelPosnMembTsf.bscDelPosnMembTsfRequestT.posTrnTyp", lposTrnTyp);
	memcpy(vbscDelPosnMembTsfRequestT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscDelPosnMembTsfRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("DelPosnMembTsf.bscDelPosnMembTsfRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscDelPosnMembTsfRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscDelPosnMembTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delPosnMembTsfRequestT getDelPosnMembTsfRequestT(char* testCaseNum , const char *root) {
	delPosnMembTsfRequestT vdelPosnMembTsfRequestT;
	int i;

	vdelPosnMembTsfRequestT.header = getDataHeaderT(testCaseNum, "delPosnMembTsfRequestT");
	vdelPosnMembTsfRequestT.basic = getBscDelPosnMembTsfRequestT(testCaseNum, "delPosnMembTsfRequestT");	return vdelPosnMembTsfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelPosnMembTsfResponseT getBscDelPosnMembTsfResponseT(char* testCaseNum , const char *root) {
	bscDelPosnMembTsfResponseT vbscDelPosnMembTsfResponseT;
	int i;

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscDelPosnMembTsfResponseT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("DelPosnMembTsf.bscDelPosnMembTsfResponseT.trnIdNo", ltrnIdNo);
	memcpy(vbscDelPosnMembTsfResponseT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return vbscDelPosnMembTsfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delPosnMembTsfResponseT getDelPosnMembTsfResponseT(char* testCaseNum , const char *root) {
	delPosnMembTsfResponseT vdelPosnMembTsfResponseT;
	int i;

	vdelPosnMembTsfResponseT.header = getDataHeaderT(testCaseNum, "delPosnMembTsfResponseT");
	vdelPosnMembTsfResponseT.basic = getBscDelPosnMembTsfResponseT(testCaseNum, "delPosnMembTsfResponseT");	return vdelPosnMembTsfResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelPosnMembTsfRequestT(bscDelPosnMembTsfRequestT actual, bscDelPosnMembTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelPosnMembTsfRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelPosnMembTsfRequestT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelPosnMembTsfRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelPosnMembTsfRequestT(delPosnMembTsfRequestT actual, delPosnMembTsfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelPosnMembTsfRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelPosnMembTsfResponseT(bscDelPosnMembTsfResponseT actual, bscDelPosnMembTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelPosnMembTsfResponseT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelPosnMembTsfResponseT(delPosnMembTsfResponseT actual, delPosnMembTsfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelPosnMembTsfResponseT (actual.basic,expected.basic, logMsg);
}

