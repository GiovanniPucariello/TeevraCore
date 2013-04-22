#include <InqMktMkrQuoLim.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMktMkrQuoLimRequestT getBscInqMktMkrQuoLimRequestT(char* testCaseNum , const char *root) {
	bscInqMktMkrQuoLimRequestT vbscInqMktMkrQuoLimRequestT;
	int i;

	vbscInqMktMkrQuoLimRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqMktMkrQuoLimRequestT");
	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqMktMkrQuoLimRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqMktMkrQuoLim.bscInqMktMkrQuoLimRequestT.prodId", lprodId);
	memcpy(vbscInqMktMkrQuoLimRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqMktMkrQuoLimRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMktMkrQuoLim.bscInqMktMkrQuoLimRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqMktMkrQuoLimRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqMktMkrQuoLimRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMktMkrQuoLimRequestT getInqMktMkrQuoLimRequestT(char* testCaseNum , const char *root) {
	inqMktMkrQuoLimRequestT vinqMktMkrQuoLimRequestT;
	int i;

	vinqMktMkrQuoLimRequestT.header = getDataHeaderT(testCaseNum, "inqMktMkrQuoLimRequestT");
	vinqMktMkrQuoLimRequestT.basic = getBscInqMktMkrQuoLimRequestT(testCaseNum, "inqMktMkrQuoLimRequestT");	return vinqMktMkrQuoLimRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMktMkrQuoLimRecT getBscInqMktMkrQuoLimRecT(char* testCaseNum , const char *root) {
	bscInqMktMkrQuoLimRecT vbscInqMktMkrQuoLimRecT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqMktMkrQuoLimRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqMktMkrQuoLim.bscInqMktMkrQuoLimRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqMktMkrQuoLimRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqMktMkrQuoLimRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqMktMkrQuoLimRecT");
	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqMktMkrQuoLimRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqMktMkrQuoLim.bscInqMktMkrQuoLimRecT.prodId", lprodId);
	memcpy(vbscInqMktMkrQuoLimRecT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscInqMktMkrQuoLimRecT.volLimQty[i]= ' ';
	}
	char lvolLimQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMktMkrQuoLim.bscInqMktMkrQuoLimRecT.volLimQty", lvolLimQty);
	memcpy(vbscInqMktMkrQuoLimRecT.volLimQty, lvolLimQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscInqMktMkrQuoLimRecT.deltaLimQty[i]= ' ';
	}
	char ldeltaLimQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMktMkrQuoLim.bscInqMktMkrQuoLimRecT.deltaLimQty", ldeltaLimQty);
	memcpy(vbscInqMktMkrQuoLimRecT.deltaLimQty, ldeltaLimQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscInqMktMkrQuoLimRecT.vegaLimQty[i]= ' ';
	}
	char lvegaLimQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqMktMkrQuoLim.bscInqMktMkrQuoLimRecT.vegaLimQty", lvegaLimQty);
	memcpy(vbscInqMktMkrQuoLimRecT.vegaLimQty, lvegaLimQty, DRIV_QUANTITY_LEN);

	for(i=0;i<TIM_INTVL_SEC_LEN;i++) {
		vbscInqMktMkrQuoLimRecT.timIntvlSec[i]= ' ';
	}
	char ltimIntvlSec[TIM_INTVL_SEC_LEN] = {""};
	getStrProperty("InqMktMkrQuoLim.bscInqMktMkrQuoLimRecT.timIntvlSec", ltimIntvlSec);
	memcpy(vbscInqMktMkrQuoLimRecT.timIntvlSec, ltimIntvlSec, TIM_INTVL_SEC_LEN);
	return vbscInqMktMkrQuoLimRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMktMkrQuoLimResponseT getBscInqMktMkrQuoLimResponseT(char* testCaseNum , const char *root) {
	bscInqMktMkrQuoLimResponseT vbscInqMktMkrQuoLimResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqMktMkrQuoLimResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqMktMkrQuoLim.bscInqMktMkrQuoLimResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqMktMkrQuoLimResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqMktMkrQuoLimResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqMktMkrQuoLim.bscInqMktMkrQuoLimResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqMktMkrQuoLimResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqMktMkrQuoLimResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMktMkrQuoLimResponseT getInqMktMkrQuoLimResponseT(char* testCaseNum , const char *root) {
	inqMktMkrQuoLimResponseT vinqMktMkrQuoLimResponseT;
	int i;

	vinqMktMkrQuoLimResponseT.header = getDataHeaderT(testCaseNum, "inqMktMkrQuoLimResponseT");
	vinqMktMkrQuoLimResponseT.basic = getBscInqMktMkrQuoLimResponseT(testCaseNum, "inqMktMkrQuoLimResponseT");	return vinqMktMkrQuoLimResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMktMkrQuoLimRequestT(bscInqMktMkrQuoLimRequestT actual, bscInqMktMkrQuoLimRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktMkrQuoLimRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktMkrQuoLimRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMktMkrQuoLimRequestT(inqMktMkrQuoLimRequestT actual, inqMktMkrQuoLimRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMktMkrQuoLimRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMktMkrQuoLimRecT(bscInqMktMkrQuoLimRecT actual, bscInqMktMkrQuoLimRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktMkrQuoLimRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktMkrQuoLimRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.volLimQty, expected.volLimQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktMkrQuoLimRecT, volLimQty not matching. Actual %s but Expected %s", actual.volLimQty, expected.volLimQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.deltaLimQty, expected.deltaLimQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktMkrQuoLimRecT, deltaLimQty not matching. Actual %s but Expected %s", actual.deltaLimQty, expected.deltaLimQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.vegaLimQty, expected.vegaLimQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktMkrQuoLimRecT, vegaLimQty not matching. Actual %s but Expected %s", actual.vegaLimQty, expected.vegaLimQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timIntvlSec, expected.timIntvlSec, TIM_INTVL_SEC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktMkrQuoLimRecT, timIntvlSec not matching. Actual %s but Expected %s", actual.timIntvlSec, expected.timIntvlSec);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMktMkrQuoLimResponseT(bscInqMktMkrQuoLimResponseT actual, bscInqMktMkrQuoLimResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktMkrQuoLimResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMktMkrQuoLimResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_MKT_MKR_QUO_LIM_REC_MAX;i++) {
		compareBscInqMktMkrQuoLimRecT (actual.bscInqMktMkrQuoLimRec[i],expected.bscInqMktMkrQuoLimRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMktMkrQuoLimResponseT(inqMktMkrQuoLimResponseT actual, inqMktMkrQuoLimResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMktMkrQuoLimResponseT (actual.basic,expected.basic, logMsg);
}

