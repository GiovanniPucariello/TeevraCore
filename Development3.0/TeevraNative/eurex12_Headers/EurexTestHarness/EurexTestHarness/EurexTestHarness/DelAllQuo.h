#include <DelAllQuo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelAllQuoRequestT getBscDelAllQuoRequestT(char* testCaseNum , const char *root) {
	bscDelAllQuoRequestT vbscDelAllQuoRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscDelAllQuoRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelAllQuo.bscDelAllQuoRequestT.prodId", lprodId);
	memcpy(vbscDelAllQuoRequestT.prodId, lprodId, PROD_ID_LEN);

	vbscDelAllQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscDelAllQuoRequestT");	return vbscDelAllQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delAllQuoRequestT getDelAllQuoRequestT(char* testCaseNum , const char *root) {
	delAllQuoRequestT vdelAllQuoRequestT;
	int i;

	vdelAllQuoRequestT.header = getDataHeaderT(testCaseNum, "delAllQuoRequestT");
	vdelAllQuoRequestT.basic = getBscDelAllQuoRequestT(testCaseNum, "delAllQuoRequestT");	return vdelAllQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelAllQuoResponseT getBscDelAllQuoResponseT(char* testCaseNum , const char *root) {
	bscDelAllQuoResponseT vbscDelAllQuoResponseT;
	int i;

	for(i=0;i<DEL_QUO_SID_CTR_LEN;i++) {
		vbscDelAllQuoResponseT.delQuoSidCtr[i]= ' ';
	}
	char ldelQuoSidCtr[DEL_QUO_SID_CTR_LEN] = {""};
	getStrProperty("DelAllQuo.bscDelAllQuoResponseT.delQuoSidCtr", ldelQuoSidCtr);
	memcpy(vbscDelAllQuoResponseT.delQuoSidCtr, ldelQuoSidCtr, DEL_QUO_SID_CTR_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscDelAllQuoResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelAllQuo.bscDelAllQuoResponseT.lstEvntDat", llstEvntDat);
	memcpy(vbscDelAllQuoResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscDelAllQuoResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelAllQuo.bscDelAllQuoResponseT.lstEvntTim", llstEvntTim);
	memcpy(vbscDelAllQuoResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscDelAllQuoResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelAllQuo.bscDelAllQuoResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vbscDelAllQuoResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vbscDelAllQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delAllQuoResponseT getDelAllQuoResponseT(char* testCaseNum , const char *root) {
	delAllQuoResponseT vdelAllQuoResponseT;
	int i;

	vdelAllQuoResponseT.header = getDataHeaderT(testCaseNum, "delAllQuoResponseT");
	vdelAllQuoResponseT.basic = getBscDelAllQuoResponseT(testCaseNum, "delAllQuoResponseT");	return vdelAllQuoResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelAllQuoRequestT(bscDelAllQuoRequestT actual, bscDelAllQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelAllQuoRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelAllQuoRequestT(delAllQuoRequestT actual, delAllQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelAllQuoRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelAllQuoResponseT(bscDelAllQuoResponseT actual, bscDelAllQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.delQuoSidCtr, expected.delQuoSidCtr, DEL_QUO_SID_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelAllQuoResponseT, delQuoSidCtr not matching. Actual %s but Expected %s", actual.delQuoSidCtr, expected.delQuoSidCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelAllQuoResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelAllQuoResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelAllQuoResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelAllQuoResponseT(delAllQuoResponseT actual, delAllQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelAllQuoResponseT (actual.basic,expected.basic, logMsg);
}

