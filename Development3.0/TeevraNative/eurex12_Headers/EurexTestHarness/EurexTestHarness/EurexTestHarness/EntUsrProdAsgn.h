#include <EntUsrProdAsgn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntUsrProdAsgnRequestT getBscEntUsrProdAsgnRequestT(char* testCaseNum , const char *root) {
	bscEntUsrProdAsgnRequestT vbscEntUsrProdAsgnRequestT;
	int i;

	vbscEntUsrProdAsgnRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscEntUsrProdAsgnRequestT");
	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscEntUsrProdAsgnRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("EntUsrProdAsgn.bscEntUsrProdAsgnRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscEntUsrProdAsgnRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscEntUsrProdAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entUsrProdAsgnRequestT getEntUsrProdAsgnRequestT(char* testCaseNum , const char *root) {
	entUsrProdAsgnRequestT ventUsrProdAsgnRequestT;
	int i;

	ventUsrProdAsgnRequestT.header = getDataHeaderT(testCaseNum, "entUsrProdAsgnRequestT");
	ventUsrProdAsgnRequestT.basic = getBscEntUsrProdAsgnRequestT(testCaseNum, "entUsrProdAsgnRequestT");	return ventUsrProdAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entUsrProdAsgnResponseT getEntUsrProdAsgnResponseT(char* testCaseNum , const char *root) {
	entUsrProdAsgnResponseT ventUsrProdAsgnResponseT;
	int i;

	ventUsrProdAsgnResponseT.header = getDataHeaderT(testCaseNum, "entUsrProdAsgnResponseT");	return ventUsrProdAsgnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntUsrProdAsgnRequestT(bscEntUsrProdAsgnRequestT actual, bscEntUsrProdAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < BSC_ENT_USR_PROD_ASGN_GRP_MAX;i++) {
		compareProdAsgnGrpT (actual.prodAsgnGrp[i],expected.prodAsgnGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntUsrProdAsgnRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntUsrProdAsgnRequestT(entUsrProdAsgnRequestT actual, entUsrProdAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntUsrProdAsgnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntUsrProdAsgnResponseT(entUsrProdAsgnResponseT actual, entUsrProdAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

