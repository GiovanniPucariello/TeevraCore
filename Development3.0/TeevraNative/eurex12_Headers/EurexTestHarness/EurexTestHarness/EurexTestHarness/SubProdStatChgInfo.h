#include <SubProdStatChgInfo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubProdStatChgInfoPubBcastT getBscSubProdStatChgInfoPubBcastT(char* testCaseNum , const char *root) {
	bscSubProdStatChgInfoPubBcastT vbscSubProdStatChgInfoPubBcastT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscSubProdStatChgInfoPubBcastT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubProdStatChgInfo.bscSubProdStatChgInfoPubBcastT.prodId", lprodId);
	memcpy(vbscSubProdStatChgInfoPubBcastT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<PRCS_STS_VAL_COD_LEN;i++) {
		vbscSubProdStatChgInfoPubBcastT.prcsStsValCod[i]= ' ';
	}
	char lprcsStsValCod[PRCS_STS_VAL_COD_LEN] = {""};
	getStrProperty("SubProdStatChgInfo.bscSubProdStatChgInfoPubBcastT.prcsStsValCod", lprcsStsValCod);
	memcpy(vbscSubProdStatChgInfoPubBcastT.prcsStsValCod, lprcsStsValCod, PRCS_STS_VAL_COD_LEN);
	return vbscSubProdStatChgInfoPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subProdStatChgInfoPubBcastT getSubProdStatChgInfoPubBcastT(char* testCaseNum , const char *root) {
	subProdStatChgInfoPubBcastT vsubProdStatChgInfoPubBcastT;
	int i;

	vsubProdStatChgInfoPubBcastT.header = getDataHeaderT(testCaseNum, "subProdStatChgInfoPubBcastT");
	vsubProdStatChgInfoPubBcastT.basic = getBscSubProdStatChgInfoPubBcastT(testCaseNum, "subProdStatChgInfoPubBcastT");	return vsubProdStatChgInfoPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubProdStatChgInfoSubjectT getBscSubProdStatChgInfoSubjectT(char* testCaseNum , const char *root) {
	bscSubProdStatChgInfoSubjectT vbscSubProdStatChgInfoSubjectT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscSubProdStatChgInfoSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubProdStatChgInfo.bscSubProdStatChgInfoSubjectT.prodId", lprodId);
	memcpy(vbscSubProdStatChgInfoSubjectT.prodId, lprodId, PROD_ID_LEN);
	return vbscSubProdStatChgInfoSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubProdStatChgInfoPubBcastT(bscSubProdStatChgInfoPubBcastT actual, bscSubProdStatChgInfoPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubProdStatChgInfoPubBcastT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prcsStsValCod, expected.prcsStsValCod, PRCS_STS_VAL_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubProdStatChgInfoPubBcastT, prcsStsValCod not matching. Actual %s but Expected %s", actual.prcsStsValCod, expected.prcsStsValCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubProdStatChgInfoPubBcastT(subProdStatChgInfoPubBcastT actual, subProdStatChgInfoPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubProdStatChgInfoPubBcastT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubProdStatChgInfoSubjectT(bscSubProdStatChgInfoSubjectT actual, bscSubProdStatChgInfoSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubProdStatChgInfoSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

