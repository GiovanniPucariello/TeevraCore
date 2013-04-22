#include <EntSpcEquColl.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntSpcEquCollRequestT getBscEntSpcEquCollRequestT(char* testCaseNum , const char *root) {
	bscEntSpcEquCollRequestT vbscEntSpcEquCollRequestT;
	int i;

	char lactnCod[1] = {""};
	getStrProperty("EntSpcEquColl.bscEntSpcEquCollRequestT.actnCod", lactnCod);
	vbscEntSpcEquCollRequestT.actnCod = lactnCod[0];

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscEntSpcEquCollRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("EntSpcEquColl.bscEntSpcEquCollRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscEntSpcEquCollRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscEntSpcEquCollRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "bscEntSpcEquCollRequestT");
	for(i=0;i<ISIN_COD_LEN;i++) {
		vbscEntSpcEquCollRequestT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("EntSpcEquColl.bscEntSpcEquCollRequestT.isinCod", lisinCod);
	memcpy(vbscEntSpcEquCollRequestT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscEntSpcEquCollRequestT.spcEquCollQty[i]= ' ';
	}
	char lspcEquCollQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntSpcEquColl.bscEntSpcEquCollRequestT.spcEquCollQty", lspcEquCollQty);
	memcpy(vbscEntSpcEquCollRequestT.spcEquCollQty, lspcEquCollQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntSpcEquCollRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntSpcEquColl.bscEntSpcEquCollRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntSpcEquCollRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_CSD_ID_LEN;i++) {
		vbscEntSpcEquCollRequestT.csdId[i]= ' ';
	}
	char lcsdId[DRIV_CSD_ID_LEN] = {""};
	getStrProperty("EntSpcEquColl.bscEntSpcEquCollRequestT.csdId", lcsdId);
	memcpy(vbscEntSpcEquCollRequestT.csdId, lcsdId, DRIV_CSD_ID_LEN);

	for(i=0;i<CSD_ACCT_NO_LEN;i++) {
		vbscEntSpcEquCollRequestT.csdPldgAcctNo[i]= ' ';
	}
	char lcsdPldgAcctNo[CSD_ACCT_NO_LEN] = {""};
	getStrProperty("EntSpcEquColl.bscEntSpcEquCollRequestT.csdPldgAcctNo", lcsdPldgAcctNo);
	memcpy(vbscEntSpcEquCollRequestT.csdPldgAcctNo, lcsdPldgAcctNo, CSD_ACCT_NO_LEN);
	return vbscEntSpcEquCollRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entSpcEquCollRequestT getEntSpcEquCollRequestT(char* testCaseNum , const char *root) {
	entSpcEquCollRequestT ventSpcEquCollRequestT;
	int i;

	ventSpcEquCollRequestT.header = getDataHeaderT(testCaseNum, "entSpcEquCollRequestT");
	ventSpcEquCollRequestT.basic = getBscEntSpcEquCollRequestT(testCaseNum, "entSpcEquCollRequestT");	return ventSpcEquCollRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscEntSpcEquCollResponseT getBscEntSpcEquCollResponseT(char* testCaseNum , const char *root) {
	bscEntSpcEquCollResponseT vbscEntSpcEquCollResponseT;
	int i;

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscEntSpcEquCollResponseT.avlBulkCollQty[i]= ' ';
	}
	char lavlBulkCollQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntSpcEquColl.bscEntSpcEquCollResponseT.avlBulkCollQty", lavlBulkCollQty);
	memcpy(vbscEntSpcEquCollResponseT.avlBulkCollQty, lavlBulkCollQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscEntSpcEquCollResponseT.usedSecQty[i]= ' ';
	}
	char lusedSecQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("EntSpcEquColl.bscEntSpcEquCollResponseT.usedSecQty", lusedSecQty);
	memcpy(vbscEntSpcEquCollResponseT.usedSecQty, lusedSecQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscEntSpcEquCollResponseT.secEvalPrc[i]= ' ';
	}
	char lsecEvalPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntSpcEquColl.bscEntSpcEquCollResponseT.secEvalPrc", lsecEvalPrc);
	memcpy(vbscEntSpcEquCollResponseT.secEvalPrc, lsecEvalPrc, DRIV_PRICE_LEN);

	for(i=0;i<EVAL_PRC_DISP_DCML_LEN;i++) {
		vbscEntSpcEquCollResponseT.evalPrcDispDcml[i]= ' ';
	}
	char levalPrcDispDcml[EVAL_PRC_DISP_DCML_LEN] = {""};
	getStrProperty("EntSpcEquColl.bscEntSpcEquCollResponseT.evalPrcDispDcml", levalPrcDispDcml);
	memcpy(vbscEntSpcEquCollResponseT.evalPrcDispDcml, levalPrcDispDcml, EVAL_PRC_DISP_DCML_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscEntSpcEquCollResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntSpcEquColl.bscEntSpcEquCollResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscEntSpcEquCollResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscEntSpcEquCollResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
entSpcEquCollResponseT getEntSpcEquCollResponseT(char* testCaseNum , const char *root) {
	entSpcEquCollResponseT ventSpcEquCollResponseT;
	int i;

	ventSpcEquCollResponseT.header = getDataHeaderT(testCaseNum, "entSpcEquCollResponseT");
	ventSpcEquCollResponseT.basic = getBscEntSpcEquCollResponseT(testCaseNum, "entSpcEquCollResponseT");	return ventSpcEquCollResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntSpcEquCollRequestT(bscEntSpcEquCollRequestT actual, bscEntSpcEquCollRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.actnCod!= expected.actnCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSpcEquCollRequestT, actnCodnot matching. Actual %d but Expected %d", actual.actnCod, expected.actnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSpcEquCollRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSpcEquCollRequestT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.spcEquCollQty, expected.spcEquCollQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSpcEquCollRequestT, spcEquCollQty not matching. Actual %s but Expected %s", actual.spcEquCollQty, expected.spcEquCollQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSpcEquCollRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdId, expected.csdId, DRIV_CSD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSpcEquCollRequestT, csdId not matching. Actual %s but Expected %s", actual.csdId, expected.csdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdPldgAcctNo, expected.csdPldgAcctNo, CSD_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSpcEquCollRequestT, csdPldgAcctNo not matching. Actual %s but Expected %s", actual.csdPldgAcctNo, expected.csdPldgAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntSpcEquCollRequestT(entSpcEquCollRequestT actual, entSpcEquCollRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntSpcEquCollRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscEntSpcEquCollResponseT(bscEntSpcEquCollResponseT actual, bscEntSpcEquCollResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.avlBulkCollQty, expected.avlBulkCollQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSpcEquCollResponseT, avlBulkCollQty not matching. Actual %s but Expected %s", actual.avlBulkCollQty, expected.avlBulkCollQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.usedSecQty, expected.usedSecQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSpcEquCollResponseT, usedSecQty not matching. Actual %s but Expected %s", actual.usedSecQty, expected.usedSecQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secEvalPrc, expected.secEvalPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSpcEquCollResponseT, secEvalPrc not matching. Actual %s but Expected %s", actual.secEvalPrc, expected.secEvalPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.evalPrcDispDcml, expected.evalPrcDispDcml, EVAL_PRC_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSpcEquCollResponseT, evalPrcDispDcml not matching. Actual %s but Expected %s", actual.evalPrcDispDcml, expected.evalPrcDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscEntSpcEquCollResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareEntSpcEquCollResponseT(entSpcEquCollResponseT actual, entSpcEquCollResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscEntSpcEquCollResponseT (actual.basic,expected.basic, logMsg);
}

