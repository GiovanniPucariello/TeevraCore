#include <EntMembStopRlse.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntMembStopRlseRequestT getBscEntMembStopRlseRequestT(char* testCaseNum , const char *root) {
	bscEntMembStopRlseRequestT vbscEntMembStopRlseRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscEntMembStopRlseRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntMembStopRlse.bscEntMembStopRlseRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscEntMembStopRlseRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	char lmembStopRlseInd[1] = {""};
	getStrProperty("EntMembStopRlse.bscEntMembStopRlseRequestT.membStopRlseInd", lmembStopRlseInd);
	vbscEntMembStopRlseRequestT.membStopRlseInd = lmembStopRlseInd[0];

	vbscEntMembStopRlseRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntMembStopRlseRequestT");
	for(i=0;i<DRIV_LOGIN_MAX_PWDID;i++) {
		vbscEntMembStopRlseRequestT.password[i]= ' ';
	}
	char lpassword[DRIV_LOGIN_MAX_PWDID] = {""};
	getStrProperty("EntMembStopRlse.bscEntMembStopRlseRequestT.password", lpassword);
	memcpy(vbscEntMembStopRlseRequestT.password, lpassword, DRIV_LOGIN_MAX_PWDID);

	vbscEntMembStopRlseRequestT.trdrIdGrpAppr = getTrdrIdGrpApprT(testCaseNum, "bscEntMembStopRlseRequestT");	return vbscEntMembStopRlseRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entMembStopRlseRequestT getEntMembStopRlseRequestT(char* testCaseNum , const char *root) {
	entMembStopRlseRequestT ventMembStopRlseRequestT;
	int i;

	ventMembStopRlseRequestT.header = getDataHeaderT(testCaseNum, "entMembStopRlseRequestT");
	ventMembStopRlseRequestT.basic = getBscEntMembStopRlseRequestT(testCaseNum, "entMembStopRlseRequestT");	return ventMembStopRlseRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntMembStopRlseResponseT getBscEntMembStopRlseResponseT(char* testCaseNum , const char *root) {
	bscEntMembStopRlseResponseT vbscEntMembStopRlseResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntMembStopRlseResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntMembStopRlse.bscEntMembStopRlseResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntMembStopRlseResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntMembStopRlseResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entMembStopRlseResponseT getEntMembStopRlseResponseT(char* testCaseNum , const char *root) {
	entMembStopRlseResponseT ventMembStopRlseResponseT;
	int i;

	ventMembStopRlseResponseT.header = getDataHeaderT(testCaseNum, "entMembStopRlseResponseT");
	ventMembStopRlseResponseT.basic = getBscEntMembStopRlseResponseT(testCaseNum, "entMembStopRlseResponseT");	return ventMembStopRlseResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntMembStopRlseRequestT(bscEntMembStopRlseRequestT actual, bscEntMembStopRlseRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntMembStopRlseRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.membStopRlseInd!= expected.membStopRlseInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntMembStopRlseRequestT, membStopRlseIndnot matching. Actual %d but Expected %d", actual.membStopRlseInd, expected.membStopRlseInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.password, expected.password, DRIV_LOGIN_MAX_PWDID)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntMembStopRlseRequestT, password not matching. Actual %s but Expected %s", actual.password, expected.password);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpApprT (actual.trdrIdGrpAppr,expected.trdrIdGrpAppr, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntMembStopRlseRequestT(entMembStopRlseRequestT actual, entMembStopRlseRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntMembStopRlseRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntMembStopRlseResponseT(bscEntMembStopRlseResponseT actual, bscEntMembStopRlseResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntMembStopRlseResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntMembStopRlseResponseT(entMembStopRlseResponseT actual, entMembStopRlseResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntMembStopRlseResponseT (actual.basic,expected.basic, logMsg);
}

