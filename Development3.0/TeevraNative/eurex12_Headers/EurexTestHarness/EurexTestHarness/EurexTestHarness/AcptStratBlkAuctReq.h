#include <AcptStratBlkAuctReq.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscAcptStratBlkAuctReqRequestT getBscAcptStratBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	bscAcptStratBlkAuctReqRequestT vbscAcptStratBlkAuctReqRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("AcptStratBlkAuctReq.bscAcptStratBlkAuctReqRequestT.buyCod", lbuyCod);
	vbscAcptStratBlkAuctReqRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscAcptStratBlkAuctReqRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptStratBlkAuctReq.bscAcptStratBlkAuctReqRequestT.ordrNo", lordrNo);
	memcpy(vbscAcptStratBlkAuctReqRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	vbscAcptStratBlkAuctReqRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscAcptStratBlkAuctReqRequestT");
	vbscAcptStratBlkAuctReqRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscAcptStratBlkAuctReqRequestT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscAcptStratBlkAuctReqRequestT.acptExeQty[i]= ' ';
	}
	char lacptExeQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("AcptStratBlkAuctReq.bscAcptStratBlkAuctReqRequestT.acptExeQty", lacptExeQty);
	memcpy(vbscAcptStratBlkAuctReqRequestT.acptExeQty, lacptExeQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscAcptStratBlkAuctReqRequestT.blkAuctOrdrExeQty[i]= ' ';
	}
	char lblkAuctOrdrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("AcptStratBlkAuctReq.bscAcptStratBlkAuctReqRequestT.blkAuctOrdrExeQty", lblkAuctOrdrExeQty);
	memcpy(vbscAcptStratBlkAuctReqRequestT.blkAuctOrdrExeQty, lblkAuctOrdrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscAcptStratBlkAuctReqRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("AcptStratBlkAuctReq.bscAcptStratBlkAuctReqRequestT.ordrExePrc", lordrExePrc);
	memcpy(vbscAcptStratBlkAuctReqRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscAcptStratBlkAuctReqRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptStratBlkAuctReq.bscAcptStratBlkAuctReqRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscAcptStratBlkAuctReqRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscAcptStratBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
acptStratBlkAuctReqRequestT getAcptStratBlkAuctReqRequestT(char* testCaseNum , const char *root) {
	acptStratBlkAuctReqRequestT vacptStratBlkAuctReqRequestT;
	int i;

	vacptStratBlkAuctReqRequestT.header = getDataHeaderT(testCaseNum, "acptStratBlkAuctReqRequestT");
	vacptStratBlkAuctReqRequestT.basic = getBscAcptStratBlkAuctReqRequestT(testCaseNum, "acptStratBlkAuctReqRequestT");	return vacptStratBlkAuctReqRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscAcptStratBlkAuctReqResponseT getBscAcptStratBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	bscAcptStratBlkAuctReqResponseT vbscAcptStratBlkAuctReqResponseT;
	int i;

	vbscAcptStratBlkAuctReqResponseT.stratTrdNoGrp = getStratTrdNoGrpT(testCaseNum, "bscAcptStratBlkAuctReqResponseT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscAcptStratBlkAuctReqResponseT.blkAuctOrdrExeQty[i]= ' ';
	}
	char lblkAuctOrdrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("AcptStratBlkAuctReq.bscAcptStratBlkAuctReqResponseT.blkAuctOrdrExeQty", lblkAuctOrdrExeQty);
	memcpy(vbscAcptStratBlkAuctReqResponseT.blkAuctOrdrExeQty, lblkAuctOrdrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscAcptStratBlkAuctReqResponseT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("AcptStratBlkAuctReq.bscAcptStratBlkAuctReqResponseT.ordrExePrc", lordrExePrc);
	memcpy(vbscAcptStratBlkAuctReqResponseT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscAcptStratBlkAuctReqResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("AcptStratBlkAuctReq.bscAcptStratBlkAuctReqResponseT.ordrNo", lordrNo);
	memcpy(vbscAcptStratBlkAuctReqResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscAcptStratBlkAuctReqResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("AcptStratBlkAuctReq.bscAcptStratBlkAuctReqResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscAcptStratBlkAuctReqResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscAcptStratBlkAuctReqResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
acptStratBlkAuctReqResponseT getAcptStratBlkAuctReqResponseT(char* testCaseNum , const char *root) {
	acptStratBlkAuctReqResponseT vacptStratBlkAuctReqResponseT;
	int i;

	vacptStratBlkAuctReqResponseT.header = getDataHeaderT(testCaseNum, "acptStratBlkAuctReqResponseT");
	vacptStratBlkAuctReqResponseT.basic = getBscAcptStratBlkAuctReqResponseT(testCaseNum, "acptStratBlkAuctReqResponseT");	return vacptStratBlkAuctReqResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscAcptStratBlkAuctReqRequestT(bscAcptStratBlkAuctReqRequestT actual, bscAcptStratBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptStratBlkAuctReqRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptStratBlkAuctReqRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.acptExeQty, expected.acptExeQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptStratBlkAuctReqRequestT, acptExeQty not matching. Actual %s but Expected %s", actual.acptExeQty, expected.acptExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctOrdrExeQty, expected.blkAuctOrdrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptStratBlkAuctReqRequestT, blkAuctOrdrExeQty not matching. Actual %s but Expected %s", actual.blkAuctOrdrExeQty, expected.blkAuctOrdrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptStratBlkAuctReqRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptStratBlkAuctReqRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAcptStratBlkAuctReqRequestT(acptStratBlkAuctReqRequestT actual, acptStratBlkAuctReqRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscAcptStratBlkAuctReqRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscAcptStratBlkAuctReqResponseT(bscAcptStratBlkAuctReqResponseT actual, bscAcptStratBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratTrdNoGrpT (actual.stratTrdNoGrp,expected.stratTrdNoGrp, logMsg);
	if ( memcmp(actual.blkAuctOrdrExeQty, expected.blkAuctOrdrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptStratBlkAuctReqResponseT, blkAuctOrdrExeQty not matching. Actual %s but Expected %s", actual.blkAuctOrdrExeQty, expected.blkAuctOrdrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptStratBlkAuctReqResponseT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptStratBlkAuctReqResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscAcptStratBlkAuctReqResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareAcptStratBlkAuctReqResponseT(acptStratBlkAuctReqResponseT actual, acptStratBlkAuctReqResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscAcptStratBlkAuctReqResponseT (actual.basic,expected.basic, logMsg);
}

