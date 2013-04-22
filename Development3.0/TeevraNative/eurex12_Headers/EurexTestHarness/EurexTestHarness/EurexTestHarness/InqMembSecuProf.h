#include <InqMembSecuProf.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembSecuProfRequestT getBscInqMembSecuProfRequestT(char* testCaseNum , const char *root) {
	bscInqMembSecuProfRequestT vbscInqMembSecuProfRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqMembSecuProfRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqMembSecuProf.bscInqMembSecuProfRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqMembSecuProfRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);
	return vbscInqMembSecuProfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMembSecuProfRequestT getInqMembSecuProfRequestT(char* testCaseNum , const char *root) {
	inqMembSecuProfRequestT vinqMembSecuProfRequestT;
	int i;

	vinqMembSecuProfRequestT.header = getDataHeaderT(testCaseNum, "inqMembSecuProfRequestT");
	vinqMembSecuProfRequestT.basic = getBscInqMembSecuProfRequestT(testCaseNum, "inqMembSecuProfRequestT");	return vinqMembSecuProfRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMembSecuProfResponseT getBscInqMembSecuProfResponseT(char* testCaseNum , const char *root) {
	bscInqMembSecuProfResponseT vbscInqMembSecuProfResponseT;
	int i;

	for(i=0;i<MSTR_SECU_PROF_LEN;i++) {
		vbscInqMembSecuProfResponseT.mstrSecuProf[i]= ' ';
	}
	char lmstrSecuProf[MSTR_SECU_PROF_LEN] = {""};
	getStrProperty("InqMembSecuProf.bscInqMembSecuProfResponseT.mstrSecuProf", lmstrSecuProf);
	memcpy(vbscInqMembSecuProfResponseT.mstrSecuProf, lmstrSecuProf, MSTR_SECU_PROF_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqMembSecuProfResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqMembSecuProf.bscInqMembSecuProfResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqMembSecuProfResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqMembSecuProfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqMembSecuProfResponseT getExtInqMembSecuProfResponseT(char* testCaseNum , const char *root) {
	extInqMembSecuProfResponseT vextInqMembSecuProfResponseT;
	int i;

	for(i=0;i<RSRC_ACC_LVL_NO_LEN;i++) {
		vextInqMembSecuProfResponseT.rsrcAccLvlNo[i]= ' ';
	}
	char lrsrcAccLvlNo[RSRC_ACC_LVL_NO_LEN] = {""};
	getStrProperty("InqMembSecuProf.extInqMembSecuProfResponseT.rsrcAccLvlNo", lrsrcAccLvlNo);
	memcpy(vextInqMembSecuProfResponseT.rsrcAccLvlNo, lrsrcAccLvlNo, RSRC_ACC_LVL_NO_LEN);
	return vextInqMembSecuProfResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMembSecuProfResponseT getInqMembSecuProfResponseT(char* testCaseNum , const char *root) {
	inqMembSecuProfResponseT vinqMembSecuProfResponseT;
	int i;

	vinqMembSecuProfResponseT.header = getDataHeaderT(testCaseNum, "inqMembSecuProfResponseT");
	vinqMembSecuProfResponseT.basic = getBscInqMembSecuProfResponseT(testCaseNum, "inqMembSecuProfResponseT");
	vinqMembSecuProfResponseT.extension = getExtInqMembSecuProfResponseT(testCaseNum, "inqMembSecuProfResponseT");	return vinqMembSecuProfResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembSecuProfRequestT(bscInqMembSecuProfRequestT actual, bscInqMembSecuProfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembSecuProfRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMembSecuProfRequestT(inqMembSecuProfRequestT actual, inqMembSecuProfRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMembSecuProfRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMembSecuProfResponseT(bscInqMembSecuProfResponseT actual, bscInqMembSecuProfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mstrSecuProf, expected.mstrSecuProf, MSTR_SECU_PROF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembSecuProfResponseT, mstrSecuProf not matching. Actual %s but Expected %s", actual.mstrSecuProf, expected.mstrSecuProf);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMembSecuProfResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqMembSecuProfResponseT(extInqMembSecuProfResponseT actual, extInqMembSecuProfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rsrcAccLvlNo, expected.rsrcAccLvlNo, RSRC_ACC_LVL_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqMembSecuProfResponseT, rsrcAccLvlNo not matching. Actual %s but Expected %s", actual.rsrcAccLvlNo, expected.rsrcAccLvlNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMembSecuProfResponseT(inqMembSecuProfResponseT actual, inqMembSecuProfResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMembSecuProfResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqMembSecuProfResponseT (actual.extension,expected.extension, logMsg);
}

