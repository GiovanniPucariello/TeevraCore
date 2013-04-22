#include <InqMktNews.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMktNewsRequestT getBscInqMktNewsRequestT(char* testCaseNum , const char *root) {
	bscInqMktNewsRequestT vbscInqMktNewsRequestT;
	int i;

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqMktNewsRequestT.newsDat[i]= ' ';
	}
	char lnewsDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqMktNews.bscInqMktNewsRequestT.newsDat", lnewsDat);
	memcpy(vbscInqMktNewsRequestT.newsDat, lnewsDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqMktNewsRequestT.newsTim[i]= ' ';
	}
	char lnewsTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqMktNews.bscInqMktNewsRequestT.newsTim", lnewsTim);
	memcpy(vbscInqMktNewsRequestT.newsTim, lnewsTim, DRIV_TIME_LEN);
	return vbscInqMktNewsRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMktNewsRequestT getInqMktNewsRequestT(char* testCaseNum , const char *root) {
	inqMktNewsRequestT vinqMktNewsRequestT;
	int i;

	vinqMktNewsRequestT.header = getDataHeaderT(testCaseNum, "inqMktNewsRequestT");
	vinqMktNewsRequestT.basic = getBscInqMktNewsRequestT(testCaseNum, "inqMktNewsRequestT");	return vinqMktNewsRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMktNewsResponseT getBscInqMktNewsResponseT(char* testCaseNum , const char *root) {
	bscInqMktNewsResponseT vbscInqMktNewsResponseT;
	int i;

	for(i=0;i<MSG_SHT_TEXT_LEN;i++) {
		vbscInqMktNewsResponseT.msgShtText[i]= ' ';
	}
	char lmsgShtText[MSG_SHT_TEXT_LEN] = {""};
	getStrProperty("InqMktNews.bscInqMktNewsResponseT.msgShtText", lmsgShtText);
	memcpy(vbscInqMktNewsResponseT.msgShtText, lmsgShtText, MSG_SHT_TEXT_LEN);

	for(i=0;i<DRIV_NEWS_DTL_LEN;i++) {
		vbscInqMktNewsResponseT.newsDtl[i]= ' ';
	}
	char lnewsDtl[DRIV_NEWS_DTL_LEN] = {""};
	getStrProperty("InqMktNews.bscInqMktNewsResponseT.newsDtl", lnewsDtl);
	memcpy(vbscInqMktNewsResponseT.newsDtl, lnewsDtl, DRIV_NEWS_DTL_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqMktNewsResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqMktNews.bscInqMktNewsResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqMktNewsResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqMktNewsResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMktNewsResponseT getInqMktNewsResponseT(char* testCaseNum , const char *root) {
	inqMktNewsResponseT vinqMktNewsResponseT;
	int i;

	vinqMktNewsResponseT.header = getDataHeaderT(testCaseNum, "inqMktNewsResponseT");
	vinqMktNewsResponseT.basic = getBscInqMktNewsResponseT(testCaseNum, "inqMktNewsResponseT");	return vinqMktNewsResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMktNewsRequestT(bscInqMktNewsRequestT actual, bscInqMktNewsRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.newsDat, expected.newsDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktNewsRequestT, newsDat not matching. Actual %s but Expected %s", actual.newsDat, expected.newsDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.newsTim, expected.newsTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktNewsRequestT, newsTim not matching. Actual %s but Expected %s", actual.newsTim, expected.newsTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMktNewsRequestT(inqMktNewsRequestT actual, inqMktNewsRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMktNewsRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMktNewsResponseT(bscInqMktNewsResponseT actual, bscInqMktNewsResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.msgShtText, expected.msgShtText, MSG_SHT_TEXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktNewsResponseT, msgShtText not matching. Actual %s but Expected %s", actual.msgShtText, expected.msgShtText);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.newsDtl, expected.newsDtl, DRIV_NEWS_DTL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktNewsResponseT, newsDtl not matching. Actual %s but Expected %s", actual.newsDtl, expected.newsDtl);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktNewsResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMktNewsResponseT(inqMktNewsResponseT actual, inqMktNewsResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMktNewsResponseT (actual.basic,expected.basic, logMsg);
}

