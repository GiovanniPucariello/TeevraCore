#include <EntStratQuo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratQuoRequestT getBscEntStratQuoRequestT(char* testCaseNum , const char *root) {
	bscEntStratQuoRequestT vbscEntStratQuoRequestT;
	int i;

	vbscEntStratQuoRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscEntStratQuoRequestT");
	vbscEntStratQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntStratQuoRequestT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscEntStratQuoRequestT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoRequestT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(vbscEntStratQuoRequestT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscEntStratQuoRequestT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoRequestT.quoExePrcSel", lquoExePrcSel);
	memcpy(vbscEntStratQuoRequestT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratQuoRequestT.quoQtyBuy[i]= ' ';
	}
	char lquoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoRequestT.quoQtyBuy", lquoQtyBuy);
	memcpy(vbscEntStratQuoRequestT.quoQtyBuy, lquoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratQuoRequestT.quoQtySel[i]= ' ';
	}
	char lquoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoRequestT.quoQtySel", lquoQtySel);
	memcpy(vbscEntStratQuoRequestT.quoQtySel, lquoQtySel, DRIV_VOLUME_LEN);
	return vbscEntStratQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extEntStratQuoRequestT getExtEntStratQuoRequestT(char* testCaseNum , const char *root) {
	extEntStratQuoRequestT vextEntStratQuoRequestT;
	int i;

	vextEntStratQuoRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extEntStratQuoRequestT");
	char lprcRsblChkInd[1] = {""};
	getStrProperty("EntStratQuo.extEntStratQuoRequestT.prcRsblChkInd", lprcRsblChkInd);
	vextEntStratQuoRequestT.prcRsblChkInd = lprcRsblChkInd[0];
	return vextEntStratQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratQuoRequestT getEntStratQuoRequestT(char* testCaseNum , const char *root) {
	entStratQuoRequestT ventStratQuoRequestT;
	int i;

	ventStratQuoRequestT.header = getDataHeaderT(testCaseNum, "entStratQuoRequestT");
	ventStratQuoRequestT.basic = getBscEntStratQuoRequestT(testCaseNum, "entStratQuoRequestT");
	ventStratQuoRequestT.extension = getExtEntStratQuoRequestT(testCaseNum, "entStratQuoRequestT");	return ventStratQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratQuoResponseT getBscEntStratQuoResponseT(char* testCaseNum , const char *root) {
	bscEntStratQuoResponseT vbscEntStratQuoResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscEntStratQuoResponseT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoResponseT.ordrNoBuy", lordrNoBuy);
	memcpy(vbscEntStratQuoResponseT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscEntStratQuoResponseT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoResponseT.ordrNoSel", lordrNoSel);
	memcpy(vbscEntStratQuoResponseT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratQuoResponseT.quoBkQtyBuy[i]= ' ';
	}
	char lquoBkQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoResponseT.quoBkQtyBuy", lquoBkQtyBuy);
	memcpy(vbscEntStratQuoResponseT.quoBkQtyBuy, lquoBkQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratQuoResponseT.quoBkQtySel[i]= ' ';
	}
	char lquoBkQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoResponseT.quoBkQtySel", lquoBkQtySel);
	memcpy(vbscEntStratQuoResponseT.quoBkQtySel, lquoBkQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratQuoResponseT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoResponseT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(vbscEntStratQuoResponseT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratQuoResponseT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoResponseT.quoExeQtySel", lquoExeQtySel);
	memcpy(vbscEntStratQuoResponseT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscEntStratQuoResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoResponseT.lstEvntDat", llstEvntDat);
	memcpy(vbscEntStratQuoResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscEntStratQuoResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoResponseT.lstEvntTim", llstEvntTim);
	memcpy(vbscEntStratQuoResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscEntStratQuoResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("EntStratQuo.bscEntStratQuoResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vbscEntStratQuoResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vbscEntStratQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratQuoResponseT getEntStratQuoResponseT(char* testCaseNum , const char *root) {
	entStratQuoResponseT ventStratQuoResponseT;
	int i;

	ventStratQuoResponseT.header = getDataHeaderT(testCaseNum, "entStratQuoResponseT");
	ventStratQuoResponseT.basic = getBscEntStratQuoResponseT(testCaseNum, "entStratQuoResponseT");	return ventStratQuoResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratQuoRequestT(bscEntStratQuoRequestT actual, bscEntStratQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoRequestT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoRequestT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoQtyBuy, expected.quoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoRequestT, quoQtyBuy not matching. Actual %s but Expected %s", actual.quoQtyBuy, expected.quoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoQtySel, expected.quoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoRequestT, quoQtySel not matching. Actual %s but Expected %s", actual.quoQtySel, expected.quoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtEntStratQuoRequestT(extEntStratQuoRequestT actual, extEntStratQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntStratQuoRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratQuoRequestT(entStratQuoRequestT actual, entStratQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratQuoRequestT (actual.basic,expected.basic, logMsg);
	compareExtEntStratQuoRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratQuoResponseT(bscEntStratQuoResponseT actual, bscEntStratQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoResponseT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoResponseT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtyBuy, expected.quoBkQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoResponseT, quoBkQtyBuy not matching. Actual %s but Expected %s", actual.quoBkQtyBuy, expected.quoBkQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtySel, expected.quoBkQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoResponseT, quoBkQtySel not matching. Actual %s but Expected %s", actual.quoBkQtySel, expected.quoBkQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoResponseT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoResponseT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratQuoResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratQuoResponseT(entStratQuoResponseT actual, entStratQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratQuoResponseT (actual.basic,expected.basic, logMsg);
}

