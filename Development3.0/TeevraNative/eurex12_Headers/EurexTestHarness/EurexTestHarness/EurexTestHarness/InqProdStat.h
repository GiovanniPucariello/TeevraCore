#include <InqProdStat.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdStatGrpT getBscInqProdStatGrpT(char* testCaseNum , const char *root) {
	bscInqProdStatGrpT vbscInqProdStatGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqProdStatGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqProdStat.bscInqProdStatGrpT.prodId", lprodId);
	memcpy(vbscInqProdStatGrpT.prodId, lprodId, PROD_ID_LEN);
	return vbscInqProdStatGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdStatRequestT getBscInqProdStatRequestT(char* testCaseNum , const char *root) {
	bscInqProdStatRequestT vbscInqProdStatRequestT;
	int i;
	return vbscInqProdStatRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdStatRequestT getInqProdStatRequestT(char* testCaseNum , const char *root) {
	inqProdStatRequestT vinqProdStatRequestT;
	int i;

	vinqProdStatRequestT.header = getDataHeaderT(testCaseNum, "inqProdStatRequestT");
	vinqProdStatRequestT.basic = getBscInqProdStatRequestT(testCaseNum, "inqProdStatRequestT");	return vinqProdStatRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdStatRecT getBscInqProdStatRecT(char* testCaseNum , const char *root) {
	bscInqProdStatRecT vbscInqProdStatRecT;
	int i;

	for(i=0;i<PRCS_STS_VAL_COD_LEN;i++) {
		vbscInqProdStatRecT.prcsStsValCod[i]= ' ';
	}
	char lprcsStsValCod[PRCS_STS_VAL_COD_LEN] = {""};
	getStrProperty("InqProdStat.bscInqProdStatRecT.prcsStsValCod", lprcsStsValCod);
	memcpy(vbscInqProdStatRecT.prcsStsValCod, lprcsStsValCod, PRCS_STS_VAL_COD_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqProdStatRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqProdStat.bscInqProdStatRecT.trnTim", ltrnTim);
	memcpy(vbscInqProdStatRecT.trnTim, ltrnTim, DRIV_TIME_LEN);
	return vbscInqProdStatRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdStatResponseT getBscInqProdStatResponseT(char* testCaseNum , const char *root) {
	bscInqProdStatResponseT vbscInqProdStatResponseT;
	int i;

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqProdStatResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqProdStat.bscInqProdStatResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqProdStatResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqProdStatResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdStatResponseT getInqProdStatResponseT(char* testCaseNum , const char *root) {
	inqProdStatResponseT vinqProdStatResponseT;
	int i;

	vinqProdStatResponseT.header = getDataHeaderT(testCaseNum, "inqProdStatResponseT");
	vinqProdStatResponseT.basic = getBscInqProdStatResponseT(testCaseNum, "inqProdStatResponseT");	return vinqProdStatResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdStatGrpT(bscInqProdStatGrpT actual, bscInqProdStatGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdStatGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdStatRequestT(bscInqProdStatRequestT actual, bscInqProdStatRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < BSC_INQ_PROD_STAT_GRP_MAX;i++) {
		compareBscInqProdStatGrpT (actual.bscInqProdStatGrp[i],expected.bscInqProdStatGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdStatRequestT(inqProdStatRequestT actual, inqProdStatRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdStatRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdStatRecT(bscInqProdStatRecT actual, bscInqProdStatRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prcsStsValCod, expected.prcsStsValCod, PRCS_STS_VAL_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdStatRecT, prcsStsValCod not matching. Actual %s but Expected %s", actual.prcsStsValCod, expected.prcsStsValCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdStatRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdStatResponseT(bscInqProdStatResponseT actual, bscInqProdStatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdStatResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_PROD_STAT_REC_MAX;i++) {
		compareBscInqProdStatRecT (actual.bscInqProdStatRec[i],expected.bscInqProdStatRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdStatResponseT(inqProdStatResponseT actual, inqProdStatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdStatResponseT (actual.basic,expected.basic, logMsg);
}

