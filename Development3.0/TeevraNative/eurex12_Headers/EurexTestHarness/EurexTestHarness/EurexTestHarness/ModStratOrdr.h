#include <ModStratOrdr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModStratOrdrRequestT getBscModStratOrdrRequestT(char* testCaseNum , const char *root) {
	bscModStratOrdrRequestT vbscModStratOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrRequestT.buyCod", lbuyCod);
	vbscModStratOrdrRequestT.buyCod = lbuyCod[0];

	vbscModStratOrdrRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscModStratOrdrRequestT");
	vbscModStratOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscModStratOrdrRequestT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscModStratOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrRequestT.ordrNo", lordrNo);
	memcpy(vbscModStratOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModStratOrdrRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrRequestT.ordrQty", lordrQty);
	memcpy(vbscModStratOrdrRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModStratOrdrRequestT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrRequestT.ordrTotQty", lordrTotQty);
	memcpy(vbscModStratOrdrRequestT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscModStratOrdrRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrRequestT.ordrExePrc", lordrExePrc);
	memcpy(vbscModStratOrdrRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrRequestT.ordrResCod", lordrResCod);
	vbscModStratOrdrRequestT.ordrResCod = lordrResCod[0];

	char lopnClsCod[1] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrRequestT.opnClsCod", lopnClsCod);
	vbscModStratOrdrRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModStratOrdrRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModStratOrdrRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModStratOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extModStratOrdrRequestT getExtModStratOrdrRequestT(char* testCaseNum , const char *root) {
	extModStratOrdrRequestT vextModStratOrdrRequestT;
	int i;

	vextModStratOrdrRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extModStratOrdrRequestT");
	vextModStratOrdrRequestT.txtGrp = getTxtGrpT(testCaseNum, "extModStratOrdrRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vextModStratOrdrRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("ModStratOrdr.extModStratOrdrRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vextModStratOrdrRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	char lprcRsblChkInd[1] = {""};
	getStrProperty("ModStratOrdr.extModStratOrdrRequestT.prcRsblChkInd", lprcRsblChkInd);
	vextModStratOrdrRequestT.prcRsblChkInd = lprcRsblChkInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vextModStratOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("ModStratOrdr.extModStratOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(vextModStratOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);
	return vextModStratOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modStratOrdrRequestT getModStratOrdrRequestT(char* testCaseNum , const char *root) {
	modStratOrdrRequestT vmodStratOrdrRequestT;
	int i;

	vmodStratOrdrRequestT.header = getDataHeaderT(testCaseNum, "modStratOrdrRequestT");
	vmodStratOrdrRequestT.basic = getBscModStratOrdrRequestT(testCaseNum, "modStratOrdrRequestT");
	vmodStratOrdrRequestT.extension = getExtModStratOrdrRequestT(testCaseNum, "modStratOrdrRequestT");	return vmodStratOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModStratOrdrResponseT getBscModStratOrdrResponseT(char* testCaseNum , const char *root) {
	bscModStratOrdrResponseT vbscModStratOrdrResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscModStratOrdrResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrResponseT.ordrNo", lordrNo);
	memcpy(vbscModStratOrdrResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModStratOrdrResponseT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrResponseT.ordrExeQty", lordrExeQty);
	memcpy(vbscModStratOrdrResponseT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModStratOrdrResponseT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrResponseT.ordrBkQty", lordrBkQty);
	memcpy(vbscModStratOrdrResponseT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModStratOrdrResponseT.ordrCnclQty[i]= ' ';
	}
	char lordrCnclQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrResponseT.ordrCnclQty", lordrCnclQty);
	memcpy(vbscModStratOrdrResponseT.ordrCnclQty, lordrCnclQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscModStratOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(vbscModStratOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscModStratOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(vbscModStratOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscModStratOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vbscModStratOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModStratOrdrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModStratOrdr.bscModStratOrdrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModStratOrdrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModStratOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modStratOrdrResponseT getModStratOrdrResponseT(char* testCaseNum , const char *root) {
	modStratOrdrResponseT vmodStratOrdrResponseT;
	int i;

	vmodStratOrdrResponseT.header = getDataHeaderT(testCaseNum, "modStratOrdrResponseT");
	vmodStratOrdrResponseT.basic = getBscModStratOrdrResponseT(testCaseNum, "modStratOrdrResponseT");	return vmodStratOrdrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModStratOrdrRequestT(bscModStratOrdrRequestT actual, bscModStratOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrRequestT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrRequestT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtModStratOrdrRequestT(extModStratOrdrRequestT actual, extModStratOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extModStratOrdrRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extModStratOrdrRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extModStratOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModStratOrdrRequestT(modStratOrdrRequestT actual, modStratOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModStratOrdrRequestT (actual.basic,expected.basic, logMsg);
	compareExtModStratOrdrRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModStratOrdrResponseT(bscModStratOrdrResponseT actual, bscModStratOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrResponseT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrResponseT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCnclQty, expected.ordrCnclQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrResponseT, ordrCnclQty not matching. Actual %s but Expected %s", actual.ordrCnclQty, expected.ordrCnclQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModStratOrdrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModStratOrdrResponseT(modStratOrdrResponseT actual, modStratOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModStratOrdrResponseT (actual.basic,expected.basic, logMsg);
}

