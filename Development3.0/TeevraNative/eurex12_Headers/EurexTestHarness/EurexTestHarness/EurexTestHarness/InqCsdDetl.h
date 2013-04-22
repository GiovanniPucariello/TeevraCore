#include <InqCsdDetl.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
extInqCsdDetlRequestT getExtInqCsdDetlRequestT(char* testCaseNum , const char *root) {
	extInqCsdDetlRequestT vextInqCsdDetlRequestT;
	int i;

	for(i=0;i<DRIV_CSD_ID_LEN;i++) {
		vextInqCsdDetlRequestT.csdId[i]= ' ';
	}
	char lcsdId[DRIV_CSD_ID_LEN] = {""};
	getStrProperty("InqCsdDetl.extInqCsdDetlRequestT.csdId", lcsdId);
	memcpy(vextInqCsdDetlRequestT.csdId, lcsdId, DRIV_CSD_ID_LEN);
	return vextInqCsdDetlRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCsdDetlRequestT getInqCsdDetlRequestT(char* testCaseNum , const char *root) {
	inqCsdDetlRequestT vinqCsdDetlRequestT;
	int i;

	vinqCsdDetlRequestT.header = getDataHeaderT(testCaseNum, "inqCsdDetlRequestT");
	vinqCsdDetlRequestT.extension = getExtInqCsdDetlRequestT(testCaseNum, "inqCsdDetlRequestT");	return vinqCsdDetlRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqCsdDetlResponseT getBscInqCsdDetlResponseT(char* testCaseNum , const char *root) {
	bscInqCsdDetlResponseT vbscInqCsdDetlResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqCsdDetlResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqCsdDetl.bscInqCsdDetlResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqCsdDetlResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqCsdDetlResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqCsdDetlResponseT getExtInqCsdDetlResponseT(char* testCaseNum , const char *root) {
	extInqCsdDetlResponseT vextInqCsdDetlResponseT;
	int i;

	for(i=0;i<DRIV_CSD_LNG_NAM_LEN;i++) {
		vextInqCsdDetlResponseT.csdLngNam[i]= ' ';
	}
	char lcsdLngNam[DRIV_CSD_LNG_NAM_LEN] = {""};
	getStrProperty("InqCsdDetl.extInqCsdDetlResponseT.csdLngNam", lcsdLngNam);
	memcpy(vextInqCsdDetlResponseT.csdLngNam, lcsdLngNam, DRIV_CSD_LNG_NAM_LEN);

	vextInqCsdDetlResponseT.pstAddGrp = getPstAddGrpT(testCaseNum, "extInqCsdDetlResponseT");
	for(i=0;i<DRIV_CSD_SWIFT_ADD_LEN;i++) {
		vextInqCsdDetlResponseT.csdSwiftAdd[i]= ' ';
	}
	char lcsdSwiftAdd[DRIV_CSD_SWIFT_ADD_LEN] = {""};
	getStrProperty("InqCsdDetl.extInqCsdDetlResponseT.csdSwiftAdd", lcsdSwiftAdd);
	memcpy(vextInqCsdDetlResponseT.csdSwiftAdd, lcsdSwiftAdd, DRIV_CSD_SWIFT_ADD_LEN);

	for(i=0;i<CSD_CLDR_COD_LEN;i++) {
		vextInqCsdDetlResponseT.csdCldrCod[i]= ' ';
	}
	char lcsdCldrCod[CSD_CLDR_COD_LEN] = {""};
	getStrProperty("InqCsdDetl.extInqCsdDetlResponseT.csdCldrCod", lcsdCldrCod);
	memcpy(vextInqCsdDetlResponseT.csdCldrCod, lcsdCldrCod, CSD_CLDR_COD_LEN);

	for(i=0;i<CSD_CLDR_COD_NEW_LEN;i++) {
		vextInqCsdDetlResponseT.csdCldrCodNew[i]= ' ';
	}
	char lcsdCldrCodNew[CSD_CLDR_COD_NEW_LEN] = {""};
	getStrProperty("InqCsdDetl.extInqCsdDetlResponseT.csdCldrCodNew", lcsdCldrCodNew);
	memcpy(vextInqCsdDetlResponseT.csdCldrCodNew, lcsdCldrCodNew, CSD_CLDR_COD_NEW_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vextInqCsdDetlResponseT.csdDeadlTim[i]= ' ';
	}
	char lcsdDeadlTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqCsdDetl.extInqCsdDetlResponseT.csdDeadlTim", lcsdDeadlTim);
	memcpy(vextInqCsdDetlResponseT.csdDeadlTim, lcsdDeadlTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vextInqCsdDetlResponseT.csdDeadlTimNew[i]= ' ';
	}
	char lcsdDeadlTimNew[DRIV_TIME_LEN] = {""};
	getStrProperty("InqCsdDetl.extInqCsdDetlResponseT.csdDeadlTimNew", lcsdDeadlTimNew);
	memcpy(vextInqCsdDetlResponseT.csdDeadlTimNew, lcsdDeadlTimNew, DRIV_TIME_LEN);
	return vextInqCsdDetlResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqCsdDetlResponseT getInqCsdDetlResponseT(char* testCaseNum , const char *root) {
	inqCsdDetlResponseT vinqCsdDetlResponseT;
	int i;

	vinqCsdDetlResponseT.header = getDataHeaderT(testCaseNum, "inqCsdDetlResponseT");
	vinqCsdDetlResponseT.basic = getBscInqCsdDetlResponseT(testCaseNum, "inqCsdDetlResponseT");
	vinqCsdDetlResponseT.extension = getExtInqCsdDetlResponseT(testCaseNum, "inqCsdDetlResponseT");	return vinqCsdDetlResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqCsdDetlRequestT(extInqCsdDetlRequestT actual, extInqCsdDetlRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.csdId, expected.csdId, DRIV_CSD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqCsdDetlRequestT, csdId not matching. Actual %s but Expected %s", actual.csdId, expected.csdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCsdDetlRequestT(inqCsdDetlRequestT actual, inqCsdDetlRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtInqCsdDetlRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqCsdDetlResponseT(bscInqCsdDetlResponseT actual, bscInqCsdDetlResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqCsdDetlResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqCsdDetlResponseT(extInqCsdDetlResponseT actual, extInqCsdDetlResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.csdLngNam, expected.csdLngNam, DRIV_CSD_LNG_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqCsdDetlResponseT, csdLngNam not matching. Actual %s but Expected %s", actual.csdLngNam, expected.csdLngNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	comparePstAddGrpT (actual.pstAddGrp,expected.pstAddGrp, logMsg);
	if ( memcmp(actual.csdSwiftAdd, expected.csdSwiftAdd, DRIV_CSD_SWIFT_ADD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqCsdDetlResponseT, csdSwiftAdd not matching. Actual %s but Expected %s", actual.csdSwiftAdd, expected.csdSwiftAdd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdCldrCod, expected.csdCldrCod, CSD_CLDR_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqCsdDetlResponseT, csdCldrCod not matching. Actual %s but Expected %s", actual.csdCldrCod, expected.csdCldrCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdCldrCodNew, expected.csdCldrCodNew, CSD_CLDR_COD_NEW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqCsdDetlResponseT, csdCldrCodNew not matching. Actual %s but Expected %s", actual.csdCldrCodNew, expected.csdCldrCodNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdDeadlTim, expected.csdDeadlTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqCsdDetlResponseT, csdDeadlTim not matching. Actual %s but Expected %s", actual.csdDeadlTim, expected.csdDeadlTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdDeadlTimNew, expected.csdDeadlTimNew, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqCsdDetlResponseT, csdDeadlTimNew not matching. Actual %s but Expected %s", actual.csdDeadlTimNew, expected.csdDeadlTimNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < EXT_INQ_CSD_DETL_REC_MAX;i++) {
		compareCtctTextGrpT (actual.ctctTextGrp[i],expected.ctctTextGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqCsdDetlResponseT(inqCsdDetlResponseT actual, inqCsdDetlResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqCsdDetlResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqCsdDetlResponseT (actual.extension,expected.extension, logMsg);
}

