#include <EntStratOrdr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratOrdrRequestT getBscEntStratOrdrRequestT(char* testCaseNum , const char *root) {
	bscEntStratOrdrRequestT vbscEntStratOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrRequestT.buyCod", lbuyCod);
	vbscEntStratOrdrRequestT.buyCod = lbuyCod[0];

	vbscEntStratOrdrRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscEntStratOrdrRequestT");
	vbscEntStratOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntStratOrdrRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratOrdrRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrRequestT.ordrQty", lordrQty);
	memcpy(vbscEntStratOrdrRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscEntStratOrdrRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrRequestT.ordrExePrc", lordrExePrc);
	memcpy(vbscEntStratOrdrRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrRequestT.ordrResCod", lordrResCod);
	vbscEntStratOrdrRequestT.ordrResCod = lordrResCod[0];

	char lopnClsCod[1] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrRequestT.opnClsCod", lopnClsCod);
	vbscEntStratOrdrRequestT.opnClsCod = lopnClsCod[0];
	return vbscEntStratOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extEntStratOrdrRequestT getExtEntStratOrdrRequestT(char* testCaseNum , const char *root) {
	extEntStratOrdrRequestT vextEntStratOrdrRequestT;
	int i;

	vextEntStratOrdrRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extEntStratOrdrRequestT");
	vextEntStratOrdrRequestT.txtGrp = getTxtGrpT(testCaseNum, "extEntStratOrdrRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vextEntStratOrdrRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntStratOrdr.extEntStratOrdrRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vextEntStratOrdrRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	char lprcRsblChkInd[1] = {""};
	getStrProperty("EntStratOrdr.extEntStratOrdrRequestT.prcRsblChkInd", lprcRsblChkInd);
	vextEntStratOrdrRequestT.prcRsblChkInd = lprcRsblChkInd[0];

	char lordrPersInd[1] = {""};
	getStrProperty("EntStratOrdr.extEntStratOrdrRequestT.ordrPersInd", lordrPersInd);
	vextEntStratOrdrRequestT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vextEntStratOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("EntStratOrdr.extEntStratOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(vextEntStratOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<ETS_SES_ID_LEN;i++) {
		vextEntStratOrdrRequestT.etsSesId[i]= ' ';
	}
	char letsSesId[ETS_SES_ID_LEN] = {""};
	getStrProperty("EntStratOrdr.extEntStratOrdrRequestT.etsSesId", letsSesId);
	memcpy(vextEntStratOrdrRequestT.etsSesId, letsSesId, ETS_SES_ID_LEN);
	return vextEntStratOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratOrdrRequestT getEntStratOrdrRequestT(char* testCaseNum , const char *root) {
	entStratOrdrRequestT ventStratOrdrRequestT;
	int i;

	ventStratOrdrRequestT.header = getDataHeaderT(testCaseNum, "entStratOrdrRequestT");
	ventStratOrdrRequestT.basic = getBscEntStratOrdrRequestT(testCaseNum, "entStratOrdrRequestT");
	ventStratOrdrRequestT.extension = getExtEntStratOrdrRequestT(testCaseNum, "entStratOrdrRequestT");	return ventStratOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntStratOrdrResponseT getBscEntStratOrdrResponseT(char* testCaseNum , const char *root) {
	bscEntStratOrdrResponseT vbscEntStratOrdrResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscEntStratOrdrResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrResponseT.ordrNo", lordrNo);
	memcpy(vbscEntStratOrdrResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratOrdrResponseT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrResponseT.ordrExeQty", lordrExeQty);
	memcpy(vbscEntStratOrdrResponseT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratOrdrResponseT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrResponseT.ordrBkQty", lordrBkQty);
	memcpy(vbscEntStratOrdrResponseT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscEntStratOrdrResponseT.ordrCnclQty[i]= ' ';
	}
	char lordrCnclQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrResponseT.ordrCnclQty", lordrCnclQty);
	memcpy(vbscEntStratOrdrResponseT.ordrCnclQty, lordrCnclQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntStratOrdrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntStratOrdrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscEntStratOrdrResponseT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrResponseT.ordrCreDat", lordrCreDat);
	memcpy(vbscEntStratOrdrResponseT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscEntStratOrdrResponseT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrResponseT.ordrCreTim", lordrCreTim);
	memcpy(vbscEntStratOrdrResponseT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscEntStratOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(vbscEntStratOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscEntStratOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(vbscEntStratOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscEntStratOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("EntStratOrdr.bscEntStratOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vbscEntStratOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vbscEntStratOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entStratOrdrResponseT getEntStratOrdrResponseT(char* testCaseNum , const char *root) {
	entStratOrdrResponseT ventStratOrdrResponseT;
	int i;

	ventStratOrdrResponseT.header = getDataHeaderT(testCaseNum, "entStratOrdrResponseT");
	ventStratOrdrResponseT.basic = getBscEntStratOrdrResponseT(testCaseNum, "entStratOrdrResponseT");	return ventStratOrdrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratOrdrRequestT(bscEntStratOrdrRequestT actual, bscEntStratOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrRequestT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtEntStratOrdrRequestT(extEntStratOrdrRequestT actual, extEntStratOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntStratOrdrRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntStratOrdrRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntStratOrdrRequestT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntStratOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.etsSesId, expected.etsSesId, ETS_SES_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extEntStratOrdrRequestT, etsSesId not matching. Actual %s but Expected %s", actual.etsSesId, expected.etsSesId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratOrdrRequestT(entStratOrdrRequestT actual, entStratOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratOrdrRequestT (actual.basic,expected.basic, logMsg);
	compareExtEntStratOrdrRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntStratOrdrResponseT(bscEntStratOrdrResponseT actual, bscEntStratOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrResponseT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrResponseT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCnclQty, expected.ordrCnclQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrResponseT, ordrCnclQty not matching. Actual %s but Expected %s", actual.ordrCnclQty, expected.ordrCnclQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrResponseT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrResponseT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntStratOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntStratOrdrResponseT(entStratOrdrResponseT actual, entStratOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntStratOrdrResponseT (actual.basic,expected.basic, logMsg);
}

