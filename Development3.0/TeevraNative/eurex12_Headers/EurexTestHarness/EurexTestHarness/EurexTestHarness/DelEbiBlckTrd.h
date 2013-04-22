#include <DelEbiBlckTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelEbiTrdRequestT getBscDelEbiTrdRequestT(char* testCaseNum , const char *root) {
	bscDelEbiTrdRequestT vbscDelEbiTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vbscDelEbiTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("DelEbiBlckTrd.bscDelEbiTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vbscDelEbiTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscDelEbiTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelEbiBlckTrd.bscDelEbiTrdRequestT.prodId", lprodId);
	memcpy(vbscDelEbiTrdRequestT.prodId, lprodId, PROD_ID_LEN);
	return vbscDelEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delEbiTrdRequestT getDelEbiTrdRequestT(char* testCaseNum , const char *root) {
	delEbiTrdRequestT vdelEbiTrdRequestT;
	int i;

	vdelEbiTrdRequestT.header = getDataHeaderT(testCaseNum, "delEbiTrdRequestT");
	vdelEbiTrdRequestT.basic = getBscDelEbiTrdRequestT(testCaseNum, "delEbiTrdRequestT");	return vdelEbiTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delEbiTrdResponseT getDelEbiTrdResponseT(char* testCaseNum , const char *root) {
	delEbiTrdResponseT vdelEbiTrdResponseT;
	int i;

	vdelEbiTrdResponseT.header = getDataHeaderT(testCaseNum, "delEbiTrdResponseT");	return vdelEbiTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelEbiTrdRequestT(bscDelEbiTrdRequestT actual, bscDelEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelEbiTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelEbiTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelEbiTrdRequestT(delEbiTrdRequestT actual, delEbiTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelEbiTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelEbiTrdResponseT(delEbiTrdResponseT actual, delEbiTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

