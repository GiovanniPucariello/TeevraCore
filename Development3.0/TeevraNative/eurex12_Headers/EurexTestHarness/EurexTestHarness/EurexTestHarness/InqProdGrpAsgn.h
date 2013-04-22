#include <InqProdGrpAsgn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdGrpAsgnRequestT getBscInqProdGrpAsgnRequestT(char* testCaseNum , const char *root) {
	bscInqProdGrpAsgnRequestT vbscInqProdGrpAsgnRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqProdGrpAsgnRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqProdGrpAsgnRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqProdGrpAsgnRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqProdGrpAsgnRequestT");
	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqProdGrpAsgnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqProdGrpAsgnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqProdGrpAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdGrpAsgnRequestT getInqProdGrpAsgnRequestT(char* testCaseNum , const char *root) {
	inqProdGrpAsgnRequestT vinqProdGrpAsgnRequestT;
	int i;

	vinqProdGrpAsgnRequestT.header = getDataHeaderT(testCaseNum, "inqProdGrpAsgnRequestT");
	vinqProdGrpAsgnRequestT.basic = getBscInqProdGrpAsgnRequestT(testCaseNum, "inqProdGrpAsgnRequestT");	return vinqProdGrpAsgnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdGrpAsgnRecT getBscInqProdGrpAsgnRecT(char* testCaseNum , const char *root) {
	bscInqProdGrpAsgnRecT vbscInqProdGrpAsgnRecT;
	int i;

	vbscInqProdGrpAsgnRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqProdGrpAsgnRecT");
	vbscInqProdGrpAsgnRecT.prodGrpIdGrp = getProdGrpIdGrpT(testCaseNum, "bscInqProdGrpAsgnRecT");
	char lprodGrpStsCod[1] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnRecT.prodGrpStsCod", lprodGrpStsCod);
	vbscInqProdGrpAsgnRecT.prodGrpStsCod = lprodGrpStsCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqProdGrpAsgnRecT.maxOrdrQty[i]= ' ';
	}
	char lmaxOrdrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnRecT.maxOrdrQty", lmaxOrdrQty);
	memcpy(vbscInqProdGrpAsgnRecT.maxOrdrQty, lmaxOrdrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqProdGrpAsgnRecT.maxCalSprdQty[i]= ' ';
	}
	char lmaxCalSprdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnRecT.maxCalSprdQty", lmaxCalSprdQty);
	memcpy(vbscInqProdGrpAsgnRecT.maxCalSprdQty, lmaxCalSprdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqProdGrpAsgnRecT.maxWhsQty[i]= ' ';
	}
	char lmaxWhsQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnRecT.maxWhsQty", lmaxWhsQty);
	memcpy(vbscInqProdGrpAsgnRecT.maxWhsQty, lmaxWhsQty, DRIV_VOLUME_LEN);

	char lmaxQtyChgAlwdInd[1] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnRecT.maxQtyChgAlwdInd", lmaxQtyChgAlwdInd);
	vbscInqProdGrpAsgnRecT.maxQtyChgAlwdInd = lmaxQtyChgAlwdInd[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqProdGrpAsgnRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqProdGrpAsgnRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqProdGrpAsgnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdGrpAsgnResponseT getBscInqProdGrpAsgnResponseT(char* testCaseNum , const char *root) {
	bscInqProdGrpAsgnResponseT vbscInqProdGrpAsgnResponseT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqProdGrpAsgnResponseT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnResponseT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqProdGrpAsgnResponseT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vbscInqProdGrpAsgnResponseT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnResponseT.membClgIdCod", lmembClgIdCod);
	memcpy(vbscInqProdGrpAsgnResponseT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vbscInqProdGrpAsgnResponseT.membClgIdCodNxt[i]= ' ';
	}
	char lmembClgIdCodNxt[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnResponseT.membClgIdCodNxt", lmembClgIdCodNxt);
	memcpy(vbscInqProdGrpAsgnResponseT.membClgIdCodNxt, lmembClgIdCodNxt, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqProdGrpAsgnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqProdGrpAsgnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqProdGrpAsgnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqProdGrpAsgn.bscInqProdGrpAsgnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqProdGrpAsgnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqProdGrpAsgnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdGrpAsgnResponseT getInqProdGrpAsgnResponseT(char* testCaseNum , const char *root) {
	inqProdGrpAsgnResponseT vinqProdGrpAsgnResponseT;
	int i;

	vinqProdGrpAsgnResponseT.header = getDataHeaderT(testCaseNum, "inqProdGrpAsgnResponseT");
	vinqProdGrpAsgnResponseT.basic = getBscInqProdGrpAsgnResponseT(testCaseNum, "inqProdGrpAsgnResponseT");	return vinqProdGrpAsgnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdGrpAsgnRequestT(bscInqProdGrpAsgnRequestT actual, bscInqProdGrpAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdGrpAsgnRequestT(inqProdGrpAsgnRequestT actual, inqProdGrpAsgnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdGrpAsgnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdGrpAsgnRecT(bscInqProdGrpAsgnRecT actual, bscInqProdGrpAsgnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareProdGrpIdGrpT (actual.prodGrpIdGrp,expected.prodGrpIdGrp, logMsg);
	if (actual.prodGrpStsCod!= expected.prodGrpStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnRecT, prodGrpStsCodnot matching. Actual %d but Expected %d", actual.prodGrpStsCod, expected.prodGrpStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxOrdrQty, expected.maxOrdrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnRecT, maxOrdrQty not matching. Actual %s but Expected %s", actual.maxOrdrQty, expected.maxOrdrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxCalSprdQty, expected.maxCalSprdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnRecT, maxCalSprdQty not matching. Actual %s but Expected %s", actual.maxCalSprdQty, expected.maxCalSprdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxWhsQty, expected.maxWhsQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnRecT, maxWhsQty not matching. Actual %s but Expected %s", actual.maxWhsQty, expected.maxWhsQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.maxQtyChgAlwdInd!= expected.maxQtyChgAlwdInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnRecT, maxQtyChgAlwdIndnot matching. Actual %d but Expected %d", actual.maxQtyChgAlwdInd, expected.maxQtyChgAlwdInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdGrpAsgnResponseT(bscInqProdGrpAsgnResponseT actual, bscInqProdGrpAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnResponseT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnResponseT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodNxt, expected.membClgIdCodNxt, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnResponseT, membClgIdCodNxt not matching. Actual %s but Expected %s", actual.membClgIdCodNxt, expected.membClgIdCodNxt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpAsgnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_PROD_GRP_ASGN_REC_MAX;i++) {
		compareBscInqProdGrpAsgnRecT (actual.bscInqProdGrpAsgnRec[i],expected.bscInqProdGrpAsgnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdGrpAsgnResponseT(inqProdGrpAsgnResponseT actual, inqProdGrpAsgnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdGrpAsgnResponseT (actual.basic,expected.basic, logMsg);
}

