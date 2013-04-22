#include <ModMembRela.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMembRelaRequestT getBscModMembRelaRequestT(char* testCaseNum , const char *root) {
	bscModMembRelaRequestT vbscModMembRelaRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscModMembRelaRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("ModMembRela.bscModMembRelaRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscModMembRelaRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModMembRelaRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModMembRela.bscModMembRelaRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModMembRelaRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModMembRelaRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extModMembRelaRequestT getExtModMembRelaRequestT(char* testCaseNum , const char *root) {
	extModMembRelaRequestT vextModMembRelaRequestT;
	int i;

	char lnxtGivUpAcptInd[1] = {""};
	getStrProperty("ModMembRela.extModMembRelaRequestT.nxtGivUpAcptInd", lnxtGivUpAcptInd);
	vextModMembRelaRequestT.nxtGivUpAcptInd = lnxtGivUpAcptInd[0];

	char lnxtTakUpAcptInd[1] = {""};
	getStrProperty("ModMembRela.extModMembRelaRequestT.nxtTakUpAcptInd", lnxtTakUpAcptInd);
	vextModMembRelaRequestT.nxtTakUpAcptInd = lnxtTakUpAcptInd[0];
	return vextModMembRelaRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modMembRelaRequestT getModMembRelaRequestT(char* testCaseNum , const char *root) {
	modMembRelaRequestT vmodMembRelaRequestT;
	int i;

	vmodMembRelaRequestT.header = getDataHeaderT(testCaseNum, "modMembRelaRequestT");
	vmodMembRelaRequestT.basic = getBscModMembRelaRequestT(testCaseNum, "modMembRelaRequestT");
	vmodMembRelaRequestT.extension = getExtModMembRelaRequestT(testCaseNum, "modMembRelaRequestT");	return vmodMembRelaRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMembRelaResponseT getBscModMembRelaResponseT(char* testCaseNum , const char *root) {
	bscModMembRelaResponseT vbscModMembRelaResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModMembRelaResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModMembRela.bscModMembRelaResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModMembRelaResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscModMembRelaResponseT.relaUpdDat[i]= ' ';
	}
	char lrelaUpdDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModMembRela.bscModMembRelaResponseT.relaUpdDat", lrelaUpdDat);
	memcpy(vbscModMembRelaResponseT.relaUpdDat, lrelaUpdDat, DRIV_DATE_LEN);
	return vbscModMembRelaResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modMembRelaResponseT getModMembRelaResponseT(char* testCaseNum , const char *root) {
	modMembRelaResponseT vmodMembRelaResponseT;
	int i;

	vmodMembRelaResponseT.header = getDataHeaderT(testCaseNum, "modMembRelaResponseT");
	vmodMembRelaResponseT.basic = getBscModMembRelaResponseT(testCaseNum, "modMembRelaResponseT");	return vmodMembRelaResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMembRelaRequestT(bscModMembRelaRequestT actual, bscModMembRelaRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembRelaRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembRelaRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtModMembRelaRequestT(extModMembRelaRequestT actual, extModMembRelaRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.nxtGivUpAcptInd!= expected.nxtGivUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extModMembRelaRequestT, nxtGivUpAcptIndnot matching. Actual %d but Expected %d", actual.nxtGivUpAcptInd, expected.nxtGivUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.nxtTakUpAcptInd!= expected.nxtTakUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extModMembRelaRequestT, nxtTakUpAcptIndnot matching. Actual %d but Expected %d", actual.nxtTakUpAcptInd, expected.nxtTakUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModMembRelaRequestT(modMembRelaRequestT actual, modMembRelaRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModMembRelaRequestT (actual.basic,expected.basic, logMsg);
	compareExtModMembRelaRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMembRelaResponseT(bscModMembRelaResponseT actual, bscModMembRelaResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembRelaResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.relaUpdDat, expected.relaUpdDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembRelaResponseT, relaUpdDat not matching. Actual %s but Expected %s", actual.relaUpdDat, expected.relaUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModMembRelaResponseT(modMembRelaResponseT actual, modMembRelaResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModMembRelaResponseT (actual.basic,expected.basic, logMsg);
}

