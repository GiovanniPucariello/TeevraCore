#include <DelUsrProdAsgn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelUsrProdAsgnGrpT getBscDelUsrProdAsgnGrpT(char* testCaseNum , const char *root) {
	bscDelUsrProdAsgnGrpT vbscDelUsrProdAsgnGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscDelUsrProdAsgnGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelUsrProdAsgn.bscDelUsrProdAsgnGrpT.prodId", lprodId);
	memcpy(vbscDelUsrProdAsgnGrpT.prodId, lprodId, PROD_ID_LEN);
	return vbscDelUsrProdAsgnGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelUsrProdAsgnRequestT getBscDelUsrProdAsgnRequestT(char* testCaseNum , const char *root) {
	bscDelUsrProdAsgnRequestT vbscDelUsrProdAsgnRequestT;
	int i;

	vbscDelUsrProdAsgnRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscDelUsrProdAsgnRequestT");
	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscDelUsrProdAsgnRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("DelUsrProdAsgn.bscDelUsrProdAsgnRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscDelUsrProdAsgnRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscDelUsrProdAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delUsrProdAsgnRequestT getDelUsrProdAsgnRequestT(char* testCaseNum , const char *root) {
	delUsrProdAsgnRequestT vdelUsrProdAsgnRequestT;
	int i;

	vdelUsrProdAsgnRequestT.header = getDataHeaderT(testCaseNum, "delUsrProdAsgnRequestT");
	vdelUsrProdAsgnRequestT.basic = getBscDelUsrProdAsgnRequestT(testCaseNum, "delUsrProdAsgnRequestT");	return vdelUsrProdAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delUsrProdAsgnResponseT getDelUsrProdAsgnResponseT(char* testCaseNum , const char *root) {
	delUsrProdAsgnResponseT vdelUsrProdAsgnResponseT;
	int i;

	vdelUsrProdAsgnResponseT.header = getDataHeaderT(testCaseNum, "delUsrProdAsgnResponseT");	return vdelUsrProdAsgnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelUsrProdAsgnGrpT(bscDelUsrProdAsgnGrpT actual, bscDelUsrProdAsgnGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelUsrProdAsgnGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelUsrProdAsgnRequestT(bscDelUsrProdAsgnRequestT actual, bscDelUsrProdAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	for ( i = 0; i < BSC_DEL_USR_PROD_ASGN_GRP_MAX;i++) {
		compareBscDelUsrProdAsgnGrpT (actual.bscDelUsrProdAsgnGrp[i],expected.bscDelUsrProdAsgnGrp[i], logMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelUsrProdAsgnRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelUsrProdAsgnRequestT(delUsrProdAsgnRequestT actual, delUsrProdAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelUsrProdAsgnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelUsrProdAsgnResponseT(delUsrProdAsgnResponseT actual, delUsrProdAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

