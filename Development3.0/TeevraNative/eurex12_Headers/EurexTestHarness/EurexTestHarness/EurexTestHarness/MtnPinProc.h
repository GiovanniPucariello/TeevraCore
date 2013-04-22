#include <MtnPinProc.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscMtnPinProcRequestT getBscMtnPinProcRequestT(char* testCaseNum , const char *root) {
	bscMtnPinProcRequestT vbscMtnPinProcRequestT;
	int i;

	char lactnCod[1] = {""};
	getStrProperty("MtnPinProc.bscMtnPinProcRequestT.actnCod", lactnCod);
	vbscMtnPinProcRequestT.actnCod = lactnCod[0];

	vbscMtnPinProcRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscMtnPinProcRequestT");
	vbscMtnPinProcRequestT.pinGrp = getPinGrpT(testCaseNum, "bscMtnPinProcRequestT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscMtnPinProcRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("MtnPinProc.bscMtnPinProcRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscMtnPinProcRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscMtnPinProcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
mtnPinProcRequestT getMtnPinProcRequestT(char* testCaseNum , const char *root) {
	mtnPinProcRequestT vmtnPinProcRequestT;
	int i;

	vmtnPinProcRequestT.header = getDataHeaderT(testCaseNum, "mtnPinProcRequestT");
	vmtnPinProcRequestT.basic = getBscMtnPinProcRequestT(testCaseNum, "mtnPinProcRequestT");	return vmtnPinProcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscMtnPinProcResponseT getBscMtnPinProcResponseT(char* testCaseNum , const char *root) {
	bscMtnPinProcResponseT vbscMtnPinProcResponseT;
	int i;

	vbscMtnPinProcResponseT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscMtnPinProcResponseT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscMtnPinProcResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("MtnPinProc.bscMtnPinProcResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscMtnPinProcResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscMtnPinProcResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
mtnPinProcResponseT getMtnPinProcResponseT(char* testCaseNum , const char *root) {
	mtnPinProcResponseT vmtnPinProcResponseT;
	int i;

	vmtnPinProcResponseT.header = getDataHeaderT(testCaseNum, "mtnPinProcResponseT");
	vmtnPinProcResponseT.basic = getBscMtnPinProcResponseT(testCaseNum, "mtnPinProcResponseT");	return vmtnPinProcResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscMtnPinProcRequestT(bscMtnPinProcRequestT actual, bscMtnPinProcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.actnCod!= expected.actnCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtnPinProcRequestT, actnCodnot matching. Actual %d but Expected %d", actual.actnCod, expected.actnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	comparePinGrpT (actual.pinGrp,expected.pinGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtnPinProcRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareMtnPinProcRequestT(mtnPinProcRequestT actual, mtnPinProcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscMtnPinProcRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscMtnPinProcResponseT(bscMtnPinProcResponseT actual, bscMtnPinProcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtnPinProcResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareMtnPinProcResponseT(mtnPinProcResponseT actual, mtnPinProcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscMtnPinProcResponseT (actual.basic,expected.basic, logMsg);
}

