#include <CpyUsrProdAsgn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscCpyUsrProdAsgnRequestT getBscCpyUsrProdAsgnRequestT(char* testCaseNum , const char *root) {
	bscCpyUsrProdAsgnRequestT vbscCpyUsrProdAsgnRequestT;
	int i;

	vbscCpyUsrProdAsgnRequestT.trdrIdGrpFrom = getTrdrIdGrpFromT(testCaseNum, "bscCpyUsrProdAsgnRequestT");
	vbscCpyUsrProdAsgnRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscCpyUsrProdAsgnRequestT");	return vbscCpyUsrProdAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
cpyUsrProdAsgnRequestT getCpyUsrProdAsgnRequestT(char* testCaseNum , const char *root) {
	cpyUsrProdAsgnRequestT vcpyUsrProdAsgnRequestT;
	int i;

	vcpyUsrProdAsgnRequestT.header = getDataHeaderT(testCaseNum, "cpyUsrProdAsgnRequestT");
	vcpyUsrProdAsgnRequestT.basic = getBscCpyUsrProdAsgnRequestT(testCaseNum, "cpyUsrProdAsgnRequestT");	return vcpyUsrProdAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
cpyUsrProdAsgnResponseT getCpyUsrProdAsgnResponseT(char* testCaseNum , const char *root) {
	cpyUsrProdAsgnResponseT vcpyUsrProdAsgnResponseT;
	int i;

	vcpyUsrProdAsgnResponseT.header = getDataHeaderT(testCaseNum, "cpyUsrProdAsgnResponseT");	return vcpyUsrProdAsgnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscCpyUsrProdAsgnRequestT(bscCpyUsrProdAsgnRequestT actual, bscCpyUsrProdAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpFromT (actual.trdrIdGrpFrom,expected.trdrIdGrpFrom, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareCpyUsrProdAsgnRequestT(cpyUsrProdAsgnRequestT actual, cpyUsrProdAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscCpyUsrProdAsgnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareCpyUsrProdAsgnResponseT(cpyUsrProdAsgnResponseT actual, cpyUsrProdAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

