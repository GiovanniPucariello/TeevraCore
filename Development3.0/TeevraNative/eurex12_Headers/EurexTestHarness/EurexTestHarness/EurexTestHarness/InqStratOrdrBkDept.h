#include <InqStratOrdrBkDept.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratOrdrBkDeptRequestT getBscInqStratOrdrBkDeptRequestT(char* testCaseNum , const char *root) {
	bscInqStratOrdrBkDeptRequestT vbscInqStratOrdrBkDeptRequestT;
	int i;

	vbscInqStratOrdrBkDeptRequestT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscInqStratOrdrBkDeptRequestT");	return vbscInqStratOrdrBkDeptRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqStratOrdrBkDeptRequestT getInqStratOrdrBkDeptRequestT(char* testCaseNum , const char *root) {
	inqStratOrdrBkDeptRequestT vinqStratOrdrBkDeptRequestT;
	int i;

	vinqStratOrdrBkDeptRequestT.header = getDataHeaderT(testCaseNum, "inqStratOrdrBkDeptRequestT");
	vinqStratOrdrBkDeptRequestT.basic = getBscInqStratOrdrBkDeptRequestT(testCaseNum, "inqStratOrdrBkDeptRequestT");	return vinqStratOrdrBkDeptRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratOrdrBkDeptRecT getBscInqStratOrdrBkDeptRecT(char* testCaseNum , const char *root) {
	bscInqStratOrdrBkDeptRecT vbscInqStratOrdrBkDeptRecT;
	int i;

	vbscInqStratOrdrBkDeptRecT.bstOrdrGrp = getBstOrdrGrpT(testCaseNum, "bscInqStratOrdrBkDeptRecT");	return vbscInqStratOrdrBkDeptRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratOrdrBkDeptResponseT getBscInqStratOrdrBkDeptResponseT(char* testCaseNum , const char *root) {
	bscInqStratOrdrBkDeptResponseT vbscInqStratOrdrBkDeptResponseT;
	int i;

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqStratOrdrBkDeptResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqStratOrdrBkDept.bscInqStratOrdrBkDeptResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqStratOrdrBkDeptResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqStratOrdrBkDeptResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqStratOrdrBkDeptResponseT getInqStratOrdrBkDeptResponseT(char* testCaseNum , const char *root) {
	inqStratOrdrBkDeptResponseT vinqStratOrdrBkDeptResponseT;
	int i;

	vinqStratOrdrBkDeptResponseT.header = getDataHeaderT(testCaseNum, "inqStratOrdrBkDeptResponseT");
	vinqStratOrdrBkDeptResponseT.basic = getBscInqStratOrdrBkDeptResponseT(testCaseNum, "inqStratOrdrBkDeptResponseT");	return vinqStratOrdrBkDeptResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratOrdrBkDeptRequestT(bscInqStratOrdrBkDeptRequestT actual, bscInqStratOrdrBkDeptRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqStratOrdrBkDeptRequestT(inqStratOrdrBkDeptRequestT actual, inqStratOrdrBkDeptRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqStratOrdrBkDeptRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratOrdrBkDeptRecT(bscInqStratOrdrBkDeptRecT actual, bscInqStratOrdrBkDeptRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareBstOrdrGrpT (actual.bstOrdrGrp,expected.bstOrdrGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratOrdrBkDeptResponseT(bscInqStratOrdrBkDeptResponseT actual, bscInqStratOrdrBkDeptResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratOrdrBkDeptResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_STRAT_ORDR_BK_DEPT_MAX;i++) {
		compareBscInqStratOrdrBkDeptRecT (actual.bscInqStratOrdrBkDeptRec[i],expected.bscInqStratOrdrBkDeptRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqStratOrdrBkDeptResponseT(inqStratOrdrBkDeptResponseT actual, inqStratOrdrBkDeptResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqStratOrdrBkDeptResponseT (actual.basic,expected.basic, logMsg);
}

