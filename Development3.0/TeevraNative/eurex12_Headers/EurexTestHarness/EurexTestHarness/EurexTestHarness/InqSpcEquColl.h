#include <InqSpcEquColl.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqSpcEquCollRequestT getBscInqSpcEquCollRequestT(char* testCaseNum , const char *root) {
	bscInqSpcEquCollRequestT vbscInqSpcEquCollRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqSpcEquCollRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqSpcEquCollRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqSpcEquCollRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "bscInqSpcEquCollRequestT");
	for(i=0;i<ISIN_COD_LEN;i++) {
		vbscInqSpcEquCollRequestT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRequestT.isinCod", lisinCod);
	memcpy(vbscInqSpcEquCollRequestT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<DRIV_CSD_ID_LEN;i++) {
		vbscInqSpcEquCollRequestT.csdId[i]= ' ';
	}
	char lcsdId[DRIV_CSD_ID_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRequestT.csdId", lcsdId);
	memcpy(vbscInqSpcEquCollRequestT.csdId, lcsdId, DRIV_CSD_ID_LEN);

	for(i=0;i<CSD_ACCT_NO_LEN;i++) {
		vbscInqSpcEquCollRequestT.csdPldgAcctNo[i]= ' ';
	}
	char lcsdPldgAcctNo[CSD_ACCT_NO_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRequestT.csdPldgAcctNo", lcsdPldgAcctNo);
	memcpy(vbscInqSpcEquCollRequestT.csdPldgAcctNo, lcsdPldgAcctNo, CSD_ACCT_NO_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqSpcEquCollRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqSpcEquCollRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqSpcEquCollRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqSpcEquCollRequestT getInqSpcEquCollRequestT(char* testCaseNum , const char *root) {
	inqSpcEquCollRequestT vinqSpcEquCollRequestT;
	int i;

	vinqSpcEquCollRequestT.header = getDataHeaderT(testCaseNum, "inqSpcEquCollRequestT");
	vinqSpcEquCollRequestT.basic = getBscInqSpcEquCollRequestT(testCaseNum, "inqSpcEquCollRequestT");	return vinqSpcEquCollRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqSpcEquCollRecT getBscInqSpcEquCollRecT(char* testCaseNum , const char *root) {
	bscInqSpcEquCollRecT vbscInqSpcEquCollRecT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqSpcEquCollRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqSpcEquCollRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqSpcEquCollRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "bscInqSpcEquCollRecT");
	for(i=0;i<ISIN_COD_LEN;i++) {
		vbscInqSpcEquCollRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRecT.isinCod", lisinCod);
	memcpy(vbscInqSpcEquCollRecT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqSpcEquCollRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRecT.currTypCod", lcurrTypCod);
	memcpy(vbscInqSpcEquCollRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscInqSpcEquCollRecT.spcEquCollQty[i]= ' ';
	}
	char lspcEquCollQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRecT.spcEquCollQty", lspcEquCollQty);
	memcpy(vbscInqSpcEquCollRecT.spcEquCollQty, lspcEquCollQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscInqSpcEquCollRecT.avlBulkCollQty[i]= ' ';
	}
	char lavlBulkCollQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRecT.avlBulkCollQty", lavlBulkCollQty);
	memcpy(vbscInqSpcEquCollRecT.avlBulkCollQty, lavlBulkCollQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscInqSpcEquCollRecT.usedSecQty[i]= ' ';
	}
	char lusedSecQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRecT.usedSecQty", lusedSecQty);
	memcpy(vbscInqSpcEquCollRecT.usedSecQty, lusedSecQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqSpcEquCollRecT.secEvalPrc[i]= ' ';
	}
	char lsecEvalPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRecT.secEvalPrc", lsecEvalPrc);
	memcpy(vbscInqSpcEquCollRecT.secEvalPrc, lsecEvalPrc, DRIV_PRICE_LEN);

	for(i=0;i<EVAL_PRC_DISP_DCML_LEN;i++) {
		vbscInqSpcEquCollRecT.evalPrcDispDcml[i]= ' ';
	}
	char levalPrcDispDcml[EVAL_PRC_DISP_DCML_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRecT.evalPrcDispDcml", levalPrcDispDcml);
	memcpy(vbscInqSpcEquCollRecT.evalPrcDispDcml, levalPrcDispDcml, EVAL_PRC_DISP_DCML_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqSpcEquCollRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqSpcEquCollRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<DRIV_CSD_ID_LEN;i++) {
		vbscInqSpcEquCollRecT.csdId[i]= ' ';
	}
	char lcsdId[DRIV_CSD_ID_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRecT.csdId", lcsdId);
	memcpy(vbscInqSpcEquCollRecT.csdId, lcsdId, DRIV_CSD_ID_LEN);

	for(i=0;i<CSD_ACCT_NO_LEN;i++) {
		vbscInqSpcEquCollRecT.csdPldgAcctNo[i]= ' ';
	}
	char lcsdPldgAcctNo[CSD_ACCT_NO_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollRecT.csdPldgAcctNo", lcsdPldgAcctNo);
	memcpy(vbscInqSpcEquCollRecT.csdPldgAcctNo, lcsdPldgAcctNo, CSD_ACCT_NO_LEN);
	return vbscInqSpcEquCollRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqSpcEquCollResponseT getBscInqSpcEquCollResponseT(char* testCaseNum , const char *root) {
	bscInqSpcEquCollResponseT vbscInqSpcEquCollResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqSpcEquCollResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqSpcEquCollResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqSpcEquCollResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqSpcEquColl.bscInqSpcEquCollResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqSpcEquCollResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqSpcEquCollResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqSpcEquCollResponseT getInqSpcEquCollResponseT(char* testCaseNum , const char *root) {
	inqSpcEquCollResponseT vinqSpcEquCollResponseT;
	int i;

	vinqSpcEquCollResponseT.header = getDataHeaderT(testCaseNum, "inqSpcEquCollResponseT");
	vinqSpcEquCollResponseT.basic = getBscInqSpcEquCollResponseT(testCaseNum, "inqSpcEquCollResponseT");	return vinqSpcEquCollResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqSpcEquCollRequestT(bscInqSpcEquCollRequestT actual, bscInqSpcEquCollRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRequestT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdId, expected.csdId, DRIV_CSD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRequestT, csdId not matching. Actual %s but Expected %s", actual.csdId, expected.csdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdPldgAcctNo, expected.csdPldgAcctNo, CSD_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRequestT, csdPldgAcctNo not matching. Actual %s but Expected %s", actual.csdPldgAcctNo, expected.csdPldgAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqSpcEquCollRequestT(inqSpcEquCollRequestT actual, inqSpcEquCollRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqSpcEquCollRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqSpcEquCollRecT(bscInqSpcEquCollRecT actual, bscInqSpcEquCollRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.spcEquCollQty, expected.spcEquCollQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRecT, spcEquCollQty not matching. Actual %s but Expected %s", actual.spcEquCollQty, expected.spcEquCollQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.avlBulkCollQty, expected.avlBulkCollQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRecT, avlBulkCollQty not matching. Actual %s but Expected %s", actual.avlBulkCollQty, expected.avlBulkCollQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.usedSecQty, expected.usedSecQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRecT, usedSecQty not matching. Actual %s but Expected %s", actual.usedSecQty, expected.usedSecQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secEvalPrc, expected.secEvalPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRecT, secEvalPrc not matching. Actual %s but Expected %s", actual.secEvalPrc, expected.secEvalPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.evalPrcDispDcml, expected.evalPrcDispDcml, EVAL_PRC_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRecT, evalPrcDispDcml not matching. Actual %s but Expected %s", actual.evalPrcDispDcml, expected.evalPrcDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdId, expected.csdId, DRIV_CSD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRecT, csdId not matching. Actual %s but Expected %s", actual.csdId, expected.csdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdPldgAcctNo, expected.csdPldgAcctNo, CSD_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollRecT, csdPldgAcctNo not matching. Actual %s but Expected %s", actual.csdPldgAcctNo, expected.csdPldgAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqSpcEquCollResponseT(bscInqSpcEquCollResponseT actual, bscInqSpcEquCollResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSpcEquCollResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_SPC_EQU_COLL_REC_MAX;i++) {
		compareBscInqSpcEquCollRecT (actual.bscInqSpcEquCollRec[i],expected.bscInqSpcEquCollRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqSpcEquCollResponseT(inqSpcEquCollResponseT actual, inqSpcEquCollResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqSpcEquCollResponseT (actual.basic,expected.basic, logMsg);
}

