#include <DelAllOrdr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelAllOrdrRequestT getBscDelAllOrdrRequestT(char* testCaseNum , const char *root) {
	bscDelAllOrdrRequestT vbscDelAllOrdrRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscDelAllOrdrRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelAllOrdr.bscDelAllOrdrRequestT.prodId", lprodId);
	memcpy(vbscDelAllOrdrRequestT.prodId, lprodId, PROD_ID_LEN);

	vbscDelAllOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscDelAllOrdrRequestT");
	char lordrPersInd[1] = {""};
	getStrProperty("DelAllOrdr.bscDelAllOrdrRequestT.ordrPersInd", lordrPersInd);
	vbscDelAllOrdrRequestT.ordrPersInd = lordrPersInd[0];
	return vbscDelAllOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delAllOrdrRequestT getDelAllOrdrRequestT(char* testCaseNum , const char *root) {
	delAllOrdrRequestT vdelAllOrdrRequestT;
	int i;

	vdelAllOrdrRequestT.header = getDataHeaderT(testCaseNum, "delAllOrdrRequestT");
	vdelAllOrdrRequestT.basic = getBscDelAllOrdrRequestT(testCaseNum, "delAllOrdrRequestT");	return vdelAllOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelAllOrdrResponseT getBscDelAllOrdrResponseT(char* testCaseNum , const char *root) {
	bscDelAllOrdrResponseT vbscDelAllOrdrResponseT;
	int i;

	for(i=0;i<DEL_ORDR_CTR_LEN;i++) {
		vbscDelAllOrdrResponseT.delOrdrCtr[i]= ' ';
	}
	char ldelOrdrCtr[DEL_ORDR_CTR_LEN] = {""};
	getStrProperty("DelAllOrdr.bscDelAllOrdrResponseT.delOrdrCtr", ldelOrdrCtr);
	memcpy(vbscDelAllOrdrResponseT.delOrdrCtr, ldelOrdrCtr, DEL_ORDR_CTR_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscDelAllOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("DelAllOrdr.bscDelAllOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(vbscDelAllOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscDelAllOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("DelAllOrdr.bscDelAllOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(vbscDelAllOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscDelAllOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("DelAllOrdr.bscDelAllOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vbscDelAllOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vbscDelAllOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delAllOrdrResponseT getDelAllOrdrResponseT(char* testCaseNum , const char *root) {
	delAllOrdrResponseT vdelAllOrdrResponseT;
	int i;

	vdelAllOrdrResponseT.header = getDataHeaderT(testCaseNum, "delAllOrdrResponseT");
	vdelAllOrdrResponseT.basic = getBscDelAllOrdrResponseT(testCaseNum, "delAllOrdrResponseT");	return vdelAllOrdrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelAllOrdrRequestT(bscDelAllOrdrRequestT actual, bscDelAllOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelAllOrdrRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelAllOrdrRequestT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelAllOrdrRequestT(delAllOrdrRequestT actual, delAllOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelAllOrdrRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelAllOrdrResponseT(bscDelAllOrdrResponseT actual, bscDelAllOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.delOrdrCtr, expected.delOrdrCtr, DEL_ORDR_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelAllOrdrResponseT, delOrdrCtr not matching. Actual %s but Expected %s", actual.delOrdrCtr, expected.delOrdrCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelAllOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelAllOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelAllOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelAllOrdrResponseT(delAllOrdrResponseT actual, delAllOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelAllOrdrResponseT (actual.basic,expected.basic, logMsg);
}

