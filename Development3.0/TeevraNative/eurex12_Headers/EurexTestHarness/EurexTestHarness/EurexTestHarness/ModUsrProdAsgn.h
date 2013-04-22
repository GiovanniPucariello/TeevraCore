#include <ModUsrProdAsgn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModUsrProdAsgnRequestT getBscModUsrProdAsgnRequestT(char* testCaseNum , const char *root) {
	bscModUsrProdAsgnRequestT vbscModUsrProdAsgnRequestT;
	int i;

	vbscModUsrProdAsgnRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscModUsrProdAsgnRequestT");
	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscModUsrProdAsgnRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModUsrProdAsgn.bscModUsrProdAsgnRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscModUsrProdAsgnRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscModUsrProdAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modUsrProdAsgnRequestT getModUsrProdAsgnRequestT(char* testCaseNum , const char *root) {
	modUsrProdAsgnRequestT vmodUsrProdAsgnRequestT;
	int i;

	vmodUsrProdAsgnRequestT.header = getDataHeaderT(testCaseNum, "modUsrProdAsgnRequestT");
	vmodUsrProdAsgnRequestT.basic = getBscModUsrProdAsgnRequestT(testCaseNum, "modUsrProdAsgnRequestT");	return vmodUsrProdAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modUsrProdAsgnResponseT getModUsrProdAsgnResponseT(char* testCaseNum , const char *root) {
	modUsrProdAsgnResponseT vmodUsrProdAsgnResponseT;
	int i;

	vmodUsrProdAsgnResponseT.header = getDataHeaderT(testCaseNum, "modUsrProdAsgnResponseT");	return vmodUsrProdAsgnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModUsrProdAsgnRequestT(bscModUsrProdAsgnRequestT actual, bscModUsrProdAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < BSC_MOD_USR_PROD_ASGN_GRP_MAX;i++) {
		compareProdAsgnGrpT (actual.prodAsgnGrp[i],expected.prodAsgnGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModUsrProdAsgnRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModUsrProdAsgnRequestT(modUsrProdAsgnRequestT actual, modUsrProdAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModUsrProdAsgnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModUsrProdAsgnResponseT(modUsrProdAsgnResponseT actual, modUsrProdAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

