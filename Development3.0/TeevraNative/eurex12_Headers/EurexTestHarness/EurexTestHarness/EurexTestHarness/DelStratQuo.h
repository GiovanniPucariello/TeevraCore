#include <DelStratQuo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelStratQuoRequestT getBscDelStratQuoRequestT(char* testCaseNum , const char *root) {
	bscDelStratQuoRequestT vbscDelStratQuoRequestT;
	int i;

	vbscDelStratQuoRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscDelStratQuoRequestT");
	vbscDelStratQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscDelStratQuoRequestT");	return vbscDelStratQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delStratQuoRequestT getDelStratQuoRequestT(char* testCaseNum , const char *root) {
	delStratQuoRequestT vdelStratQuoRequestT;
	int i;

	vdelStratQuoRequestT.header = getDataHeaderT(testCaseNum, "delStratQuoRequestT");
	vdelStratQuoRequestT.basic = getBscDelStratQuoRequestT(testCaseNum, "delStratQuoRequestT");	return vdelStratQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelStratQuoResponseT getBscDelStratQuoResponseT(char* testCaseNum , const char *root) {
	bscDelStratQuoResponseT vbscDelStratQuoResponseT;
	int i;

	char lbidSidDel[1] = {""};
	getStrProperty("DelStratQuo.bscDelStratQuoResponseT.bidSidDel", lbidSidDel);
	vbscDelStratQuoResponseT.bidSidDel = lbidSidDel[0];

	char laskSidDel[1] = {""};
	getStrProperty("DelStratQuo.bscDelStratQuoResponseT.askSidDel", laskSidDel);
	vbscDelStratQuoResponseT.askSidDel = laskSidDel[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscDelStratQuoResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelStratQuo.bscDelStratQuoResponseT.lstEvntDat", llstEvntDat);
	memcpy(vbscDelStratQuoResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscDelStratQuoResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelStratQuo.bscDelStratQuoResponseT.lstEvntTim", llstEvntTim);
	memcpy(vbscDelStratQuoResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscDelStratQuoResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelStratQuo.bscDelStratQuoResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vbscDelStratQuoResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vbscDelStratQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delStratQuoResponseT getDelStratQuoResponseT(char* testCaseNum , const char *root) {
	delStratQuoResponseT vdelStratQuoResponseT;
	int i;

	vdelStratQuoResponseT.header = getDataHeaderT(testCaseNum, "delStratQuoResponseT");
	vdelStratQuoResponseT.basic = getBscDelStratQuoResponseT(testCaseNum, "delStratQuoResponseT");	return vdelStratQuoResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelStratQuoRequestT(bscDelStratQuoRequestT actual, bscDelStratQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelStratQuoRequestT(delStratQuoRequestT actual, delStratQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelStratQuoRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelStratQuoResponseT(bscDelStratQuoResponseT actual, bscDelStratQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.bidSidDel!= expected.bidSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratQuoResponseT, bidSidDelnot matching. Actual %d but Expected %d", actual.bidSidDel, expected.bidSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.askSidDel!= expected.askSidDel) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratQuoResponseT, askSidDelnot matching. Actual %d but Expected %d", actual.askSidDel, expected.askSidDel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratQuoResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratQuoResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratQuoResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelStratQuoResponseT(delStratQuoResponseT actual, delStratQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelStratQuoResponseT (actual.basic,expected.basic, logMsg);
}

