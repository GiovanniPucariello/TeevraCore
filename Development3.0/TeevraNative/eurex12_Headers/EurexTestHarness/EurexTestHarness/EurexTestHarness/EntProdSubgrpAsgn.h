#include <EntProdSubgrpAsgn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntProdSubgrpAsgnRequestT getBscEntProdSubgrpAsgnRequestT(char* testCaseNum , const char *root) {
	bscEntProdSubgrpAsgnRequestT vbscEntProdSubgrpAsgnRequestT;
	int i;

	for(i=0;i<PART_SUB_GRP_COD_LEN;i++) {
		vbscEntProdSubgrpAsgnRequestT.partSubGrpCod[i]= ' ';
	}
	char lpartSubGrpCod[PART_SUB_GRP_COD_LEN] = {""};
	getStrProperty("EntProdSubgrpAsgn.bscEntProdSubgrpAsgnRequestT.partSubGrpCod", lpartSubGrpCod);
	memcpy(vbscEntProdSubgrpAsgnRequestT.partSubGrpCod, lpartSubGrpCod, PART_SUB_GRP_COD_LEN);

	vbscEntProdSubgrpAsgnRequestT.prodAsgnGrp = getProdAsgnGrpT(testCaseNum, "bscEntProdSubgrpAsgnRequestT");	return vbscEntProdSubgrpAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entProdSubgrpAsgnRequestT getEntProdSubgrpAsgnRequestT(char* testCaseNum , const char *root) {
	entProdSubgrpAsgnRequestT ventProdSubgrpAsgnRequestT;
	int i;

	ventProdSubgrpAsgnRequestT.header = getDataHeaderT(testCaseNum, "entProdSubgrpAsgnRequestT");
	ventProdSubgrpAsgnRequestT.basic = getBscEntProdSubgrpAsgnRequestT(testCaseNum, "entProdSubgrpAsgnRequestT");	return ventProdSubgrpAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entProdSubgrpAsgnResponseT getEntProdSubgrpAsgnResponseT(char* testCaseNum , const char *root) {
	entProdSubgrpAsgnResponseT ventProdSubgrpAsgnResponseT;
	int i;

	ventProdSubgrpAsgnResponseT.header = getDataHeaderT(testCaseNum, "entProdSubgrpAsgnResponseT");	return ventProdSubgrpAsgnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntProdSubgrpAsgnRequestT(bscEntProdSubgrpAsgnRequestT actual, bscEntProdSubgrpAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.partSubGrpCod, expected.partSubGrpCod, PART_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntProdSubgrpAsgnRequestT, partSubGrpCod not matching. Actual %s but Expected %s", actual.partSubGrpCod, expected.partSubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareProdAsgnGrpT (actual.prodAsgnGrp,expected.prodAsgnGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntProdSubgrpAsgnRequestT(entProdSubgrpAsgnRequestT actual, entProdSubgrpAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntProdSubgrpAsgnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntProdSubgrpAsgnResponseT(entProdSubgrpAsgnResponseT actual, entProdSubgrpAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

