#include <InqProdGrpLis.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdGrpLisRequestT getBscInqProdGrpLisRequestT(char* testCaseNum , const char *root) {
	bscInqProdGrpLisRequestT vbscInqProdGrpLisRequestT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqProdGrpLisRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProdGrpLis.bscInqProdGrpLisRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqProdGrpLisRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	char lprodGrpUsgTyp[1] = {""};
	getStrProperty("InqProdGrpLis.bscInqProdGrpLisRequestT.prodGrpUsgTyp", lprodGrpUsgTyp);
	vbscInqProdGrpLisRequestT.prodGrpUsgTyp = lprodGrpUsgTyp[0];
	return vbscInqProdGrpLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdGrpLisRequestT getInqProdGrpLisRequestT(char* testCaseNum , const char *root) {
	inqProdGrpLisRequestT vinqProdGrpLisRequestT;
	int i;

	vinqProdGrpLisRequestT.header = getDataHeaderT(testCaseNum, "inqProdGrpLisRequestT");
	vinqProdGrpLisRequestT.basic = getBscInqProdGrpLisRequestT(testCaseNum, "inqProdGrpLisRequestT");	return vinqProdGrpLisRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdGrpLisRecT getBscInqProdGrpLisRecT(char* testCaseNum , const char *root) {
	bscInqProdGrpLisRecT vbscInqProdGrpLisRecT;
	int i;

	vbscInqProdGrpLisRecT.prodGrpIdGrp = getProdGrpIdGrpT(testCaseNum, "bscInqProdGrpLisRecT");
	for(i=0;i<PROD_GRP_LNG_NAM_LEN;i++) {
		vbscInqProdGrpLisRecT.prodGrpLngNam[i]= ' ';
	}
	char lprodGrpLngNam[PROD_GRP_LNG_NAM_LEN] = {""};
	getStrProperty("InqProdGrpLis.bscInqProdGrpLisRecT.prodGrpLngNam", lprodGrpLngNam);
	memcpy(vbscInqProdGrpLisRecT.prodGrpLngNam, lprodGrpLngNam, PROD_GRP_LNG_NAM_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqProdGrpLisRecT.maxOrdrQty[i]= ' ';
	}
	char lmaxOrdrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProdGrpLis.bscInqProdGrpLisRecT.maxOrdrQty", lmaxOrdrQty);
	memcpy(vbscInqProdGrpLisRecT.maxOrdrQty, lmaxOrdrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqProdGrpLisRecT.maxCalSprdQty[i]= ' ';
	}
	char lmaxCalSprdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProdGrpLis.bscInqProdGrpLisRecT.maxCalSprdQty", lmaxCalSprdQty);
	memcpy(vbscInqProdGrpLisRecT.maxCalSprdQty, lmaxCalSprdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqProdGrpLisRecT.maxWhsQty[i]= ' ';
	}
	char lmaxWhsQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqProdGrpLis.bscInqProdGrpLisRecT.maxWhsQty", lmaxWhsQty);
	memcpy(vbscInqProdGrpLisRecT.maxWhsQty, lmaxWhsQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqProdGrpLisRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqProdGrpLis.bscInqProdGrpLisRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqProdGrpLisRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);

	char lprodGrpComplCod[1] = {""};
	getStrProperty("InqProdGrpLis.bscInqProdGrpLisRecT.prodGrpComplCod", lprodGrpComplCod);
	vbscInqProdGrpLisRecT.prodGrpComplCod = lprodGrpComplCod[0];
	return vbscInqProdGrpLisRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqProdGrpLisResponseT getBscInqProdGrpLisResponseT(char* testCaseNum , const char *root) {
	bscInqProdGrpLisResponseT vbscInqProdGrpLisResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqProdGrpLisResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqProdGrpLis.bscInqProdGrpLisResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqProdGrpLisResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqProdGrpLisResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqProdGrpLis.bscInqProdGrpLisResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqProdGrpLisResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqProdGrpLisResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqProdGrpLisResponseT getInqProdGrpLisResponseT(char* testCaseNum , const char *root) {
	inqProdGrpLisResponseT vinqProdGrpLisResponseT;
	int i;

	vinqProdGrpLisResponseT.header = getDataHeaderT(testCaseNum, "inqProdGrpLisResponseT");
	vinqProdGrpLisResponseT.basic = getBscInqProdGrpLisResponseT(testCaseNum, "inqProdGrpLisResponseT");	return vinqProdGrpLisResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdGrpLisRequestT(bscInqProdGrpLisRequestT actual, bscInqProdGrpLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpLisRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodGrpUsgTyp!= expected.prodGrpUsgTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpLisRequestT, prodGrpUsgTypnot matching. Actual %d but Expected %d", actual.prodGrpUsgTyp, expected.prodGrpUsgTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdGrpLisRequestT(inqProdGrpLisRequestT actual, inqProdGrpLisRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdGrpLisRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdGrpLisRecT(bscInqProdGrpLisRecT actual, bscInqProdGrpLisRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareProdGrpIdGrpT (actual.prodGrpIdGrp,expected.prodGrpIdGrp, logMsg);
	if ( memcmp(actual.prodGrpLngNam, expected.prodGrpLngNam, PROD_GRP_LNG_NAM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpLisRecT, prodGrpLngNam not matching. Actual %s but Expected %s", actual.prodGrpLngNam, expected.prodGrpLngNam);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxOrdrQty, expected.maxOrdrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpLisRecT, maxOrdrQty not matching. Actual %s but Expected %s", actual.maxOrdrQty, expected.maxOrdrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxCalSprdQty, expected.maxCalSprdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpLisRecT, maxCalSprdQty not matching. Actual %s but Expected %s", actual.maxCalSprdQty, expected.maxCalSprdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.maxWhsQty, expected.maxWhsQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpLisRecT, maxWhsQty not matching. Actual %s but Expected %s", actual.maxWhsQty, expected.maxWhsQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpLisRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodGrpComplCod!= expected.prodGrpComplCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpLisRecT, prodGrpComplCodnot matching. Actual %d but Expected %d", actual.prodGrpComplCod, expected.prodGrpComplCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqProdGrpLisResponseT(bscInqProdGrpLisResponseT actual, bscInqProdGrpLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpLisResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqProdGrpLisResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_PROD_GRP_LIS_REC_MAX;i++) {
		compareBscInqProdGrpLisRecT (actual.bscInqProdGrpLisRec[i],expected.bscInqProdGrpLisRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqProdGrpLisResponseT(inqProdGrpLisResponseT actual, inqProdGrpLisResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqProdGrpLisResponseT (actual.basic,expected.basic, logMsg);
}

