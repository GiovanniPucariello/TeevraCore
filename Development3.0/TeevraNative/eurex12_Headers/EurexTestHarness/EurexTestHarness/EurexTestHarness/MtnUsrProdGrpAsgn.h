#include <MtnUsrProdGrpAsgn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscMtnUsrProdGrpAsgnRequestT getBscMtnUsrProdGrpAsgnRequestT(char* testCaseNum , const char *root) {
	bscMtnUsrProdGrpAsgnRequestT vbscMtnUsrProdGrpAsgnRequestT;
	int i;

	char lactnCod[1] = {""};
	getStrProperty("MtnUsrProdGrpAsgn.bscMtnUsrProdGrpAsgnRequestT.actnCod", lactnCod);
	vbscMtnUsrProdGrpAsgnRequestT.actnCod = lactnCod[0];

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscMtnUsrProdGrpAsgnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("MtnUsrProdGrpAsgn.bscMtnUsrProdGrpAsgnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscMtnUsrProdGrpAsgnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscMtnUsrProdGrpAsgnRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscMtnUsrProdGrpAsgnRequestT");
	vbscMtnUsrProdGrpAsgnRequestT.prodGrpIdGrp = getProdGrpIdGrpT(testCaseNum, "bscMtnUsrProdGrpAsgnRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscMtnUsrProdGrpAsgnRequestT.maxOrdrQty[i]= ' ';
	}
	char lmaxOrdrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("MtnUsrProdGrpAsgn.bscMtnUsrProdGrpAsgnRequestT.maxOrdrQty", lmaxOrdrQty);
	memcpy(vbscMtnUsrProdGrpAsgnRequestT.maxOrdrQty, lmaxOrdrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscMtnUsrProdGrpAsgnRequestT.maxCalSprdQty[i]= ' ';
	}
	char lmaxCalSprdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("MtnUsrProdGrpAsgn.bscMtnUsrProdGrpAsgnRequestT.maxCalSprdQty", lmaxCalSprdQty);
	memcpy(vbscMtnUsrProdGrpAsgnRequestT.maxCalSprdQty, lmaxCalSprdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscMtnUsrProdGrpAsgnRequestT.maxWhsQty[i]= ' ';
	}
	char lmaxWhsQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("MtnUsrProdGrpAsgn.bscMtnUsrProdGrpAsgnRequestT.maxWhsQty", lmaxWhsQty);
	memcpy(vbscMtnUsrProdGrpAsgnRequestT.maxWhsQty, lmaxWhsQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscMtnUsrProdGrpAsgnRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("MtnUsrProdGrpAsgn.bscMtnUsrProdGrpAsgnRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscMtnUsrProdGrpAsgnRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscMtnUsrProdGrpAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
mtnUsrProdGrpAsgnRequestT getMtnUsrProdGrpAsgnRequestT(char* testCaseNum , const char *root) {
	mtnUsrProdGrpAsgnRequestT vmtnUsrProdGrpAsgnRequestT;
	int i;

	vmtnUsrProdGrpAsgnRequestT.header = getDataHeaderT(testCaseNum, "mtnUsrProdGrpAsgnRequestT");
	vmtnUsrProdGrpAsgnRequestT.basic = getBscMtnUsrProdGrpAsgnRequestT(testCaseNum, "mtnUsrProdGrpAsgnRequestT");	return vmtnUsrProdGrpAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscMtnUsrProdGrpAsgnResponseT getBscMtnUsrProdGrpAsgnResponseT(char* testCaseNum , const char *root) {
	bscMtnUsrProdGrpAsgnResponseT vbscMtnUsrProdGrpAsgnResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscMtnUsrProdGrpAsgnResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("MtnUsrProdGrpAsgn.bscMtnUsrProdGrpAsgnResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscMtnUsrProdGrpAsgnResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscMtnUsrProdGrpAsgnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
mtnUsrProdGrpAsgnResponseT getMtnUsrProdGrpAsgnResponseT(char* testCaseNum , const char *root) {
	mtnUsrProdGrpAsgnResponseT vmtnUsrProdGrpAsgnResponseT;
	int i;

	vmtnUsrProdGrpAsgnResponseT.header = getDataHeaderT(testCaseNum, "mtnUsrProdGrpAsgnResponseT");
	vmtnUsrProdGrpAsgnResponseT.basic = getBscMtnUsrProdGrpAsgnResponseT(testCaseNum, "mtnUsrProdGrpAsgnResponseT");	return vmtnUsrProdGrpAsgnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscMtnUsrProdGrpAsgnRequestT(bscMtnUsrProdGrpAsgnRequestT actual, bscMtnUsrProdGrpAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.actnCod!= expected.actnCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtnUsrProdGrpAsgnRequestT, actnCodnot matching. Actual %d but Expected %d", actual.actnCod, expected.actnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtnUsrProdGrpAsgnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareProdGrpIdGrpT (actual.prodGrpIdGrp,expected.prodGrpIdGrp, logMsg);
	if ( memcmp(actual.maxOrdrQty, expected.maxOrdrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtnUsrProdGrpAsgnRequestT, maxOrdrQty not matching. Actual %s but Expected %s", actual.maxOrdrQty, expected.maxOrdrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxCalSprdQty, expected.maxCalSprdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtnUsrProdGrpAsgnRequestT, maxCalSprdQty not matching. Actual %s but Expected %s", actual.maxCalSprdQty, expected.maxCalSprdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxWhsQty, expected.maxWhsQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtnUsrProdGrpAsgnRequestT, maxWhsQty not matching. Actual %s but Expected %s", actual.maxWhsQty, expected.maxWhsQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtnUsrProdGrpAsgnRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareMtnUsrProdGrpAsgnRequestT(mtnUsrProdGrpAsgnRequestT actual, mtnUsrProdGrpAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscMtnUsrProdGrpAsgnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscMtnUsrProdGrpAsgnResponseT(bscMtnUsrProdGrpAsgnResponseT actual, bscMtnUsrProdGrpAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtnUsrProdGrpAsgnResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareMtnUsrProdGrpAsgnResponseT(mtnUsrProdGrpAsgnResponseT actual, mtnUsrProdGrpAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscMtnUsrProdGrpAsgnResponseT (actual.basic,expected.basic, logMsg);
}

