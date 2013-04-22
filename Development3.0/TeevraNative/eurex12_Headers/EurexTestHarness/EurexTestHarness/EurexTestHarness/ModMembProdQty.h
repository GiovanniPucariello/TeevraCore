#include <ModMembProdQty.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMembProdQtyGrpT getBscModMembProdQtyGrpT(char* testCaseNum , const char *root) {
	bscModMembProdQtyGrpT vbscModMembProdQtyGrpT;
	int i;

	vbscModMembProdQtyGrpT.prodGrpIdGrp = getProdGrpIdGrpT(testCaseNum, "bscModMembProdQtyGrpT");
	for(i=0;i<PROD_ID_LEN;i++) {
		vbscModMembProdQtyGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("ModMembProdQty.bscModMembProdQtyGrpT.prodId", lprodId);
	memcpy(vbscModMembProdQtyGrpT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModMembProdQtyGrpT.maxOrdrQty[i]= ' ';
	}
	char lmaxOrdrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModMembProdQty.bscModMembProdQtyGrpT.maxOrdrQty", lmaxOrdrQty);
	memcpy(vbscModMembProdQtyGrpT.maxOrdrQty, lmaxOrdrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModMembProdQtyGrpT.maxCalSprdQty[i]= ' ';
	}
	char lmaxCalSprdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModMembProdQty.bscModMembProdQtyGrpT.maxCalSprdQty", lmaxCalSprdQty);
	memcpy(vbscModMembProdQtyGrpT.maxCalSprdQty, lmaxCalSprdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModMembProdQtyGrpT.maxWhsQty[i]= ' ';
	}
	char lmaxWhsQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModMembProdQty.bscModMembProdQtyGrpT.maxWhsQty", lmaxWhsQty);
	memcpy(vbscModMembProdQtyGrpT.maxWhsQty, lmaxWhsQty, DRIV_VOLUME_LEN);
	return vbscModMembProdQtyGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMembProdQtyRequestT getBscModMembProdQtyRequestT(char* testCaseNum , const char *root) {
	bscModMembProdQtyRequestT vbscModMembProdQtyRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscModMembProdQtyRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("ModMembProdQty.bscModMembProdQtyRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscModMembProdQtyRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscModMembProdQtyRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModMembProdQty.bscModMembProdQtyRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscModMembProdQtyRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscModMembProdQtyRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modMembProdQtyRequestT getModMembProdQtyRequestT(char* testCaseNum , const char *root) {
	modMembProdQtyRequestT vmodMembProdQtyRequestT;
	int i;

	vmodMembProdQtyRequestT.header = getDataHeaderT(testCaseNum, "modMembProdQtyRequestT");
	vmodMembProdQtyRequestT.basic = getBscModMembProdQtyRequestT(testCaseNum, "modMembProdQtyRequestT");	return vmodMembProdQtyRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMembProdQtyRecT getBscModMembProdQtyRecT(char* testCaseNum , const char *root) {
	bscModMembProdQtyRecT vbscModMembProdQtyRecT;
	int i;

	for(i=0;i<RTN_COD_LEN;i++) {
		vbscModMembProdQtyRecT.rtnCod[i]= ' ';
	}
	char lrtnCod[RTN_COD_LEN] = {""};
	getStrProperty("ModMembProdQty.bscModMembProdQtyRecT.rtnCod", lrtnCod);
	memcpy(vbscModMembProdQtyRecT.rtnCod, lrtnCod, RTN_COD_LEN);
	return vbscModMembProdQtyRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMembProdQtyResponseT getBscModMembProdQtyResponseT(char* testCaseNum , const char *root) {
	bscModMembProdQtyResponseT vbscModMembProdQtyResponseT;
	int i;

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscModMembProdQtyResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("ModMembProdQty.bscModMembProdQtyResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscModMembProdQtyResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscModMembProdQtyResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modMembProdQtyResponseT getModMembProdQtyResponseT(char* testCaseNum , const char *root) {
	modMembProdQtyResponseT vmodMembProdQtyResponseT;
	int i;

	vmodMembProdQtyResponseT.header = getDataHeaderT(testCaseNum, "modMembProdQtyResponseT");
	vmodMembProdQtyResponseT.basic = getBscModMembProdQtyResponseT(testCaseNum, "modMembProdQtyResponseT");	return vmodMembProdQtyResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMembProdQtyGrpT(bscModMembProdQtyGrpT actual, bscModMembProdQtyGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareProdGrpIdGrpT (actual.prodGrpIdGrp,expected.prodGrpIdGrp, logMsg);
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdQtyGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxOrdrQty, expected.maxOrdrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdQtyGrpT, maxOrdrQty not matching. Actual %s but Expected %s", actual.maxOrdrQty, expected.maxOrdrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxCalSprdQty, expected.maxCalSprdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdQtyGrpT, maxCalSprdQty not matching. Actual %s but Expected %s", actual.maxCalSprdQty, expected.maxCalSprdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxWhsQty, expected.maxWhsQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdQtyGrpT, maxWhsQty not matching. Actual %s but Expected %s", actual.maxWhsQty, expected.maxWhsQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMembProdQtyRequestT(bscModMembProdQtyRequestT actual, bscModMembProdQtyRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdQtyRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdQtyRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MOD_MEMB_PROD_QTY_GRP_MAX;i++) {
		compareBscModMembProdQtyGrpT (actual.bscModMembProdQtyGrp[i],expected.bscModMembProdQtyGrp[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModMembProdQtyRequestT(modMembProdQtyRequestT actual, modMembProdQtyRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModMembProdQtyRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMembProdQtyRecT(bscModMembProdQtyRecT actual, bscModMembProdQtyRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.rtnCod, expected.rtnCod, RTN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdQtyRecT, rtnCod not matching. Actual %s but Expected %s", actual.rtnCod, expected.rtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMembProdQtyResponseT(bscModMembProdQtyResponseT actual, bscModMembProdQtyResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdQtyResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_MTN_MEMB_PROD_QTY_REC_MAX;i++) {
		compareBscModMembProdQtyRecT (actual.bscModMembProdQtyRec[i],expected.bscModMembProdQtyRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModMembProdQtyResponseT(modMembProdQtyResponseT actual, modMembProdQtyResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModMembProdQtyResponseT (actual.basic,expected.basic, logMsg);
}

