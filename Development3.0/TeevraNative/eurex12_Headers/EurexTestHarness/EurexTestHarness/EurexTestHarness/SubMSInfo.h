#include <SubMSInfo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubMSInfoPubBcastT getBscSubMSInfoPubBcastT(char* testCaseNum , const char *root) {
	bscSubMSInfoPubBcastT vbscSubMSInfoPubBcastT;
	int i;

	for(i=0;i<MSG_SHT_TEXT_LEN;i++) {
		vbscSubMSInfoPubBcastT.msgShtText[i]= ' ';
	}
	char lmsgShtText[MSG_SHT_TEXT_LEN] = {""};
	getStrProperty("SubMSInfo.bscSubMSInfoPubBcastT.msgShtText", lmsgShtText);
	memcpy(vbscSubMSInfoPubBcastT.msgShtText, lmsgShtText, MSG_SHT_TEXT_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubMSInfoPubBcastT.newsDat[i]= ' ';
	}
	char lnewsDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubMSInfo.bscSubMSInfoPubBcastT.newsDat", lnewsDat);
	memcpy(vbscSubMSInfoPubBcastT.newsDat, lnewsDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubMSInfoPubBcastT.newsTim[i]= ' ';
	}
	char lnewsTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubMSInfo.bscSubMSInfoPubBcastT.newsTim", lnewsTim);
	memcpy(vbscSubMSInfoPubBcastT.newsTim, lnewsTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscSubMSInfoPubBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubMSInfo.bscSubMSInfoPubBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscSubMSInfoPubBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	char lactnCod[1] = {""};
	getStrProperty("SubMSInfo.bscSubMSInfoPubBcastT.actnCod", lactnCod);
	vbscSubMSInfoPubBcastT.actnCod = lactnCod[0];
	return vbscSubMSInfoPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subMSInfoPubBcastT getSubMSInfoPubBcastT(char* testCaseNum , const char *root) {
	subMSInfoPubBcastT vsubMSInfoPubBcastT;
	int i;

	vsubMSInfoPubBcastT.header = getDataHeaderT(testCaseNum, "subMSInfoPubBcastT");
	vsubMSInfoPubBcastT.basic = getBscSubMSInfoPubBcastT(testCaseNum, "subMSInfoPubBcastT");	return vsubMSInfoPubBcastT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubMSInfoPubBcastT(bscSubMSInfoPubBcastT actual, bscSubMSInfoPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.msgShtText, expected.msgShtText, MSG_SHT_TEXT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMSInfoPubBcastT, msgShtText not matching. Actual %s but Expected %s", actual.msgShtText, expected.msgShtText);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.newsDat, expected.newsDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMSInfoPubBcastT, newsDat not matching. Actual %s but Expected %s", actual.newsDat, expected.newsDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.newsTim, expected.newsTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMSInfoPubBcastT, newsTim not matching. Actual %s but Expected %s", actual.newsTim, expected.newsTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMSInfoPubBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.actnCod!= expected.actnCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMSInfoPubBcastT, actnCodnot matching. Actual %d but Expected %d", actual.actnCod, expected.actnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubMSInfoPubBcastT(subMSInfoPubBcastT actual, subMSInfoPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubMSInfoPubBcastT (actual.basic,expected.basic, logMsg);
}

