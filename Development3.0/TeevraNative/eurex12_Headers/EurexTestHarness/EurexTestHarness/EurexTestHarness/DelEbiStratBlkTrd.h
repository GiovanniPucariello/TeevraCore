#include <DelEbiStratBlkTrd.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscDelEbiStratBlkTrdRequestT getBscDelEbiStratBlkTrdRequestT(char* testCaseNum , const char *root) {
	bscDelEbiStratBlkTrdRequestT vbscDelEbiStratBlkTrdRequestT;
	int i;

	for(i=0;i<EBI_TRD_REF_NO_LEN;i++) {
		vbscDelEbiStratBlkTrdRequestT.ebiTrdRefNo[i]= ' ';
	}
	char lebiTrdRefNo[EBI_TRD_REF_NO_LEN] = {""};
	getStrProperty("DelEbiStratBlkTrd.bscDelEbiStratBlkTrdRequestT.ebiTrdRefNo", lebiTrdRefNo);
	memcpy(vbscDelEbiStratBlkTrdRequestT.ebiTrdRefNo, lebiTrdRefNo, EBI_TRD_REF_NO_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscDelEbiStratBlkTrdRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("DelEbiStratBlkTrd.bscDelEbiStratBlkTrdRequestT.prodId", lprodId);
	memcpy(vbscDelEbiStratBlkTrdRequestT.prodId, lprodId, PROD_ID_LEN);
	return vbscDelEbiStratBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delEbiStratBlkTrdRequestT getDelEbiStratBlkTrdRequestT(char* testCaseNum , const char *root) {
	delEbiStratBlkTrdRequestT vdelEbiStratBlkTrdRequestT;
	int i;

	vdelEbiStratBlkTrdRequestT.header = getDataHeaderT(testCaseNum, "delEbiStratBlkTrdRequestT");
	vdelEbiStratBlkTrdRequestT.basic = getBscDelEbiStratBlkTrdRequestT(testCaseNum, "delEbiStratBlkTrdRequestT");	return vdelEbiStratBlkTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
delEbiStratBlkTrdResponseT getDelEbiStratBlkTrdResponseT(char* testCaseNum , const char *root) {
	delEbiStratBlkTrdResponseT vdelEbiStratBlkTrdResponseT;
	int i;

	vdelEbiStratBlkTrdResponseT.header = getDataHeaderT(testCaseNum, "delEbiStratBlkTrdResponseT");	return vdelEbiStratBlkTrdResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscDelEbiStratBlkTrdRequestT(bscDelEbiStratBlkTrdRequestT actual, bscDelEbiStratBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ebiTrdRefNo, expected.ebiTrdRefNo, EBI_TRD_REF_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelEbiStratBlkTrdRequestT, ebiTrdRefNo not matching. Actual %s but Expected %s", actual.ebiTrdRefNo, expected.ebiTrdRefNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscDelEbiStratBlkTrdRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelEbiStratBlkTrdRequestT(delEbiStratBlkTrdRequestT actual, delEbiStratBlkTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscDelEbiStratBlkTrdRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareDelEbiStratBlkTrdResponseT(delEbiStratBlkTrdResponseT actual, delEbiStratBlkTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
}

