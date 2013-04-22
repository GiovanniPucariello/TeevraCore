#include <InqProdGrp.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdGrpRequestT getBscInqProdGrpRequestT(char* testCaseNum , const char *root) {
	bscInqProdGrpRequestT vbscInqProdGrpRequestT;
	int i;

	vbscInqProdGrpRequestT.prodGrpIdGrp = getProdGrpIdGrpT(testCaseNum, "bscInqProdGrpRequestT");
	char lnxtDayInd[1] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpRequestT.nxtDayInd", lnxtDayInd);
	vbscInqProdGrpRequestT.nxtDayInd = lnxtDayInd[0];

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqProdGrpRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqProdGrpRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqProdGrpRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdGrpRequestT getInqProdGrpRequestT(char* testCaseNum , const char *root) {
	inqProdGrpRequestT vinqProdGrpRequestT;
	int i;

	vinqProdGrpRequestT.header = getDataHeaderT(testCaseNum, "inqProdGrpRequestT");
	vinqProdGrpRequestT.basic = getBscInqProdGrpRequestT(testCaseNum, "inqProdGrpRequestT");	return vinqProdGrpRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdGrpRecT getBscInqProdGrpRecT(char* testCaseNum , const char *root) {
	bscInqProdGrpRecT vbscInqProdGrpRecT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqProdGrpRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpRecT.prodId", lprodId);
	memcpy(vbscInqProdGrpRecT.prodId, lprodId, PROD_ID_LEN);
	return vbscInqProdGrpRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdGrpResponseT getBscInqProdGrpResponseT(char* testCaseNum , const char *root) {
	bscInqProdGrpResponseT vbscInqProdGrpResponseT;
	int i;

	vbscInqProdGrpResponseT.prodGrpIdGrp = getProdGrpIdGrpT(testCaseNum, "bscInqProdGrpResponseT");
	for(i=0;i<PROD_GRP_LNG_NAM_LEN;i++) {
		vbscInqProdGrpResponseT.prodGrpLngNam[i]= ' ';
	}
	char lprodGrpLngNam[PROD_GRP_LNG_NAM_LEN] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpResponseT.prodGrpLngNam", lprodGrpLngNam);
	memcpy(vbscInqProdGrpResponseT.prodGrpLngNam, lprodGrpLngNam, PROD_GRP_LNG_NAM_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqProdGrpResponseT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpResponseT.currTypCod", lcurrTypCod);
	memcpy(vbscInqProdGrpResponseT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char lexchAff[1] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpResponseT.exchAff", lexchAff);
	vbscInqProdGrpResponseT.exchAff = lexchAff[0];

	char lexpTypCod[1] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpResponseT.expTypCod", lexpTypCod);
	vbscInqProdGrpResponseT.expTypCod = lexpTypCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqProdGrpResponseT.maxOrdrQty[i]= ' ';
	}
	char lmaxOrdrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpResponseT.maxOrdrQty", lmaxOrdrQty);
	memcpy(vbscInqProdGrpResponseT.maxOrdrQty, lmaxOrdrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqProdGrpResponseT.maxCalSprdQty[i]= ' ';
	}
	char lmaxCalSprdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpResponseT.maxCalSprdQty", lmaxCalSprdQty);
	memcpy(vbscInqProdGrpResponseT.maxCalSprdQty, lmaxCalSprdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqProdGrpResponseT.maxWhsQty[i]= ' ';
	}
	char lmaxWhsQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpResponseT.maxWhsQty", lmaxWhsQty);
	memcpy(vbscInqProdGrpResponseT.maxWhsQty, lmaxWhsQty, DRIV_VOLUME_LEN);

	for(i=0;i<RSRC_ACC_LVL_NO_LEN;i++) {
		vbscInqProdGrpResponseT.rsrcAccLvlNo[i]= ' ';
	}
	char lrsrcAccLvlNo[RSRC_ACC_LVL_NO_LEN] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpResponseT.rsrcAccLvlNo", lrsrcAccLvlNo);
	memcpy(vbscInqProdGrpResponseT.rsrcAccLvlNo, lrsrcAccLvlNo, RSRC_ACC_LVL_NO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqProdGrpResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqProdGrpResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqProdGrpResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqProdGrpResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqProdGrpResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqProdGrp.bscInqProdGrpResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqProdGrpResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqProdGrpResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdGrpResponseT getInqProdGrpResponseT(char* testCaseNum , const char *root) {
	inqProdGrpResponseT vinqProdGrpResponseT;
	int i;

	vinqProdGrpResponseT.header = getDataHeaderT(testCaseNum, "inqProdGrpResponseT");
	vinqProdGrpResponseT.basic = getBscInqProdGrpResponseT(testCaseNum, "inqProdGrpResponseT");	return vinqProdGrpResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdGrpRequestT(bscInqProdGrpRequestT actual, bscInqProdGrpRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareProdGrpIdGrpT (actual.prodGrpIdGrp,expected.prodGrpIdGrp, logMsg);
	if (actual.nxtDayInd!= expected.nxtDayInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpRequestT, nxtDayIndnot matching. Actual %d but Expected %d", actual.nxtDayInd, expected.nxtDayInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdGrpRequestT(inqProdGrpRequestT actual, inqProdGrpRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdGrpRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdGrpRecT(bscInqProdGrpRecT actual, bscInqProdGrpRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdGrpResponseT(bscInqProdGrpResponseT actual, bscInqProdGrpResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareProdGrpIdGrpT (actual.prodGrpIdGrp,expected.prodGrpIdGrp, logMsg);
	if ( memcmp(actual.prodGrpLngNam, expected.prodGrpLngNam, PROD_GRP_LNG_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpResponseT, prodGrpLngNam not matching. Actual %s but Expected %s", actual.prodGrpLngNam, expected.prodGrpLngNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpResponseT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exchAff!= expected.exchAff) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpResponseT, exchAffnot matching. Actual %d but Expected %d", actual.exchAff, expected.exchAff);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.expTypCod!= expected.expTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpResponseT, expTypCodnot matching. Actual %d but Expected %d", actual.expTypCod, expected.expTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxOrdrQty, expected.maxOrdrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpResponseT, maxOrdrQty not matching. Actual %s but Expected %s", actual.maxOrdrQty, expected.maxOrdrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxCalSprdQty, expected.maxCalSprdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpResponseT, maxCalSprdQty not matching. Actual %s but Expected %s", actual.maxCalSprdQty, expected.maxCalSprdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxWhsQty, expected.maxWhsQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpResponseT, maxWhsQty not matching. Actual %s but Expected %s", actual.maxWhsQty, expected.maxWhsQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.rsrcAccLvlNo, expected.rsrcAccLvlNo, RSRC_ACC_LVL_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpResponseT, rsrcAccLvlNo not matching. Actual %s but Expected %s", actual.rsrcAccLvlNo, expected.rsrcAccLvlNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_PROD_GRP_REC_MAX;i++) {
		compareBscInqProdGrpRecT (actual.bscInqProdGrpRec[i],expected.bscInqProdGrpRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdGrpResponseT(inqProdGrpResponseT actual, inqProdGrpResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdGrpResponseT (actual.basic,expected.basic, logMsg);
}

