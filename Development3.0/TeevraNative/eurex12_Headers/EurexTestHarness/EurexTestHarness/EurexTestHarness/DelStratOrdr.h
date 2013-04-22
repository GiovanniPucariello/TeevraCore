#include <DelStratOrdr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelStratOrdrRequestT getBscDelStratOrdrRequestT(char* testCaseNum , const char *root) {
	bscDelStratOrdrRequestT vbscDelStratOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("DelStratOrdr.bscDelStratOrdrRequestT.buyCod", lbuyCod);
	vbscDelStratOrdrRequestT.buyCod = lbuyCod[0];

	vbscDelStratOrdrRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscDelStratOrdrRequestT");
	vbscDelStratOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscDelStratOrdrRequestT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscDelStratOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("DelStratOrdr.bscDelStratOrdrRequestT.ordrNo", lordrNo);
	memcpy(vbscDelStratOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vbscDelStratOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("DelStratOrdr.bscDelStratOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(vbscDelStratOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);
	return vbscDelStratOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delStratOrdrRequestT getDelStratOrdrRequestT(char* testCaseNum , const char *root) {
	delStratOrdrRequestT vdelStratOrdrRequestT;
	int i;

	vdelStratOrdrRequestT.header = getDataHeaderT(testCaseNum, "delStratOrdrRequestT");
	vdelStratOrdrRequestT.basic = getBscDelStratOrdrRequestT(testCaseNum, "delStratOrdrRequestT");	return vdelStratOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelStratOrdrResponseT getBscDelStratOrdrResponseT(char* testCaseNum , const char *root) {
	bscDelStratOrdrResponseT vbscDelStratOrdrResponseT;
	int i;

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscDelStratOrdrResponseT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("DelStratOrdr.bscDelStratOrdrResponseT.ordrQty", lordrQty);
	memcpy(vbscDelStratOrdrResponseT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscDelStratOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelStratOrdr.bscDelStratOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(vbscDelStratOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscDelStratOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelStratOrdr.bscDelStratOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(vbscDelStratOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscDelStratOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelStratOrdr.bscDelStratOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vbscDelStratOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vbscDelStratOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delStratOrdrResponseT getDelStratOrdrResponseT(char* testCaseNum , const char *root) {
	delStratOrdrResponseT vdelStratOrdrResponseT;
	int i;

	vdelStratOrdrResponseT.header = getDataHeaderT(testCaseNum, "delStratOrdrResponseT");
	vdelStratOrdrResponseT.basic = getBscDelStratOrdrResponseT(testCaseNum, "delStratOrdrResponseT");	return vdelStratOrdrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelStratOrdrRequestT(bscDelStratOrdrRequestT actual, bscDelStratOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelStratOrdrRequestT(delStratOrdrRequestT actual, delStratOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelStratOrdrRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelStratOrdrResponseT(bscDelStratOrdrResponseT actual, bscDelStratOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratOrdrResponseT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelStratOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelStratOrdrResponseT(delStratOrdrResponseT actual, delStratOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelStratOrdrResponseT (actual.basic,expected.basic, logMsg);
}

