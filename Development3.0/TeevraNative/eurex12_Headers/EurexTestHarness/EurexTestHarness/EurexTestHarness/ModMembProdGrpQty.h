#include <ModMembProdGrpQty.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMembProdGrpQtyRequestT getBscModMembProdGrpQtyRequestT(char* testCaseNum , const char *root) {
	bscModMembProdGrpQtyRequestT vbscModMembProdGrpQtyRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscModMembProdGrpQtyRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("ModMembProdGrpQty.bscModMembProdGrpQtyRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscModMembProdGrpQtyRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscModMembProdGrpQtyRequestT.prodGrpIdGrp = getProdGrpIdGrpT(testCaseNum, "bscModMembProdGrpQtyRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModMembProdGrpQtyRequestT.maxOrdrQty[i]= ' ';
	}
	char lmaxOrdrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModMembProdGrpQty.bscModMembProdGrpQtyRequestT.maxOrdrQty", lmaxOrdrQty);
	memcpy(vbscModMembProdGrpQtyRequestT.maxOrdrQty, lmaxOrdrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModMembProdGrpQtyRequestT.maxCalSprdQty[i]= ' ';
	}
	char lmaxCalSprdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModMembProdGrpQty.bscModMembProdGrpQtyRequestT.maxCalSprdQty", lmaxCalSprdQty);
	memcpy(vbscModMembProdGrpQtyRequestT.maxCalSprdQty, lmaxCalSprdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscModMembProdGrpQtyRequestT.maxWhsQty[i]= ' ';
	}
	char lmaxWhsQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModMembProdGrpQty.bscModMembProdGrpQtyRequestT.maxWhsQty", lmaxWhsQty);
	memcpy(vbscModMembProdGrpQtyRequestT.maxWhsQty, lmaxWhsQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModMembProdGrpQtyRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModMembProdGrpQty.bscModMembProdGrpQtyRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModMembProdGrpQtyRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModMembProdGrpQtyRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modMembProdGrpQtyRequestT getModMembProdGrpQtyRequestT(char* testCaseNum , const char *root) {
	modMembProdGrpQtyRequestT vmodMembProdGrpQtyRequestT;
	int i;

	vmodMembProdGrpQtyRequestT.header = getDataHeaderT(testCaseNum, "modMembProdGrpQtyRequestT");
	vmodMembProdGrpQtyRequestT.basic = getBscModMembProdGrpQtyRequestT(testCaseNum, "modMembProdGrpQtyRequestT");	return vmodMembProdGrpQtyRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModMembProdGrpQtyResponseT getBscModMembProdGrpQtyResponseT(char* testCaseNum , const char *root) {
	bscModMembProdGrpQtyResponseT vbscModMembProdGrpQtyResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModMembProdGrpQtyResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModMembProdGrpQty.bscModMembProdGrpQtyResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModMembProdGrpQtyResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModMembProdGrpQtyResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modMembProdGrpQtyResponseT getModMembProdGrpQtyResponseT(char* testCaseNum , const char *root) {
	modMembProdGrpQtyResponseT vmodMembProdGrpQtyResponseT;
	int i;

	vmodMembProdGrpQtyResponseT.header = getDataHeaderT(testCaseNum, "modMembProdGrpQtyResponseT");
	vmodMembProdGrpQtyResponseT.basic = getBscModMembProdGrpQtyResponseT(testCaseNum, "modMembProdGrpQtyResponseT");	return vmodMembProdGrpQtyResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMembProdGrpQtyRequestT(bscModMembProdGrpQtyRequestT actual, bscModMembProdGrpQtyRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdGrpQtyRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareProdGrpIdGrpT (actual.prodGrpIdGrp,expected.prodGrpIdGrp, logMsg);
	if ( memcmp(actual.maxOrdrQty, expected.maxOrdrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdGrpQtyRequestT, maxOrdrQty not matching. Actual %s but Expected %s", actual.maxOrdrQty, expected.maxOrdrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxCalSprdQty, expected.maxCalSprdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdGrpQtyRequestT, maxCalSprdQty not matching. Actual %s but Expected %s", actual.maxCalSprdQty, expected.maxCalSprdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxWhsQty, expected.maxWhsQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdGrpQtyRequestT, maxWhsQty not matching. Actual %s but Expected %s", actual.maxWhsQty, expected.maxWhsQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdGrpQtyRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModMembProdGrpQtyRequestT(modMembProdGrpQtyRequestT actual, modMembProdGrpQtyRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModMembProdGrpQtyRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModMembProdGrpQtyResponseT(bscModMembProdGrpQtyResponseT actual, bscModMembProdGrpQtyResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModMembProdGrpQtyResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModMembProdGrpQtyResponseT(modMembProdGrpQtyResponseT actual, modMembProdGrpQtyResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModMembProdGrpQtyResponseT (actual.basic,expected.basic, logMsg);
}

