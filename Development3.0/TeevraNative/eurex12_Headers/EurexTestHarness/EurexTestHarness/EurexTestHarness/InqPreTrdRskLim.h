#include <InqPreTrdRskLim.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqPreTrdRskLimRequestT getBscInqPreTrdRskLimRequestT(char* testCaseNum , const char *root) {
	bscInqPreTrdRskLimRequestT vbscInqPreTrdRskLimRequestT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqPreTrdRskLimRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimRequestT.prodId", lprodId);
	memcpy(vbscInqPreTrdRskLimRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqPreTrdRskLimRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqPreTrdRskLimRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqPreTrdRskLimRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqPreTrdRskLimRequestT");
	vbscInqPreTrdRskLimRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "bscInqPreTrdRskLimRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vbscInqPreTrdRskLimRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vbscInqPreTrdRskLimRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqPreTrdRskLimRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqPreTrdRskLimRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqPreTrdRskLimRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqPreTrdRskLimRequestT getInqPreTrdRskLimRequestT(char* testCaseNum , const char *root) {
	inqPreTrdRskLimRequestT vinqPreTrdRskLimRequestT;
	int i;

	vinqPreTrdRskLimRequestT.header = getDataHeaderT(testCaseNum, "inqPreTrdRskLimRequestT");
	vinqPreTrdRskLimRequestT.basic = getBscInqPreTrdRskLimRequestT(testCaseNum, "inqPreTrdRskLimRequestT");	return vinqPreTrdRskLimRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqPreTrdRskLimRecT getBscInqPreTrdRskLimRecT(char* testCaseNum , const char *root) {
	bscInqPreTrdRskLimRecT vbscInqPreTrdRskLimRecT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqPreTrdRskLimRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimRecT.prodId", lprodId);
	memcpy(vbscInqPreTrdRskLimRecT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqPreTrdRskLimRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqPreTrdRskLimRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqPreTrdRskLimRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqPreTrdRskLimRecT");
	vbscInqPreTrdRskLimRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "bscInqPreTrdRskLimRecT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vbscInqPreTrdRskLimRecT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimRecT.membClgIdCod", lmembClgIdCod);
	memcpy(vbscInqPreTrdRskLimRecT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<PRCS_STS_VAL_COD_LEN;i++) {
		vbscInqPreTrdRskLimRecT.prcsStsValCod[i]= ' ';
	}
	char lprcsStsValCod[PRCS_STS_VAL_COD_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimRecT.prcsStsValCod", lprcsStsValCod);
	memcpy(vbscInqPreTrdRskLimRecT.prcsStsValCod, lprcsStsValCod, PRCS_STS_VAL_COD_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqPreTrdRskLimRecT.preTrdRiskRndLot[i]= ' ';
	}
	char lpreTrdRiskRndLot[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimRecT.preTrdRiskRndLot", lpreTrdRiskRndLot);
	memcpy(vbscInqPreTrdRskLimRecT.preTrdRiskRndLot, lpreTrdRiskRndLot, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscInqPreTrdRskLimRecT.violCntrLim[i]= ' ';
	}
	char lviolCntrLim[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimRecT.violCntrLim", lviolCntrLim);
	memcpy(vbscInqPreTrdRskLimRecT.violCntrLim, lviolCntrLim, DRIV_QUANTITY_LEN);

	vbscInqPreTrdRskLimRecT.rskLimStsGrp = getRskLimStsGrpT(testCaseNum, "bscInqPreTrdRskLimRecT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqPreTrdRskLimRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqPreTrdRskLimRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqPreTrdRskLimRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqPreTrdRskLimResponseT getBscInqPreTrdRskLimResponseT(char* testCaseNum , const char *root) {
	bscInqPreTrdRskLimResponseT vbscInqPreTrdRskLimResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqPreTrdRskLimResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqPreTrdRskLimResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqPreTrdRskLimResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqPreTrdRskLim.bscInqPreTrdRskLimResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqPreTrdRskLimResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqPreTrdRskLimResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqPreTrdRskLimResponseT getInqPreTrdRskLimResponseT(char* testCaseNum , const char *root) {
	inqPreTrdRskLimResponseT vinqPreTrdRskLimResponseT;
	int i;

	vinqPreTrdRskLimResponseT.header = getDataHeaderT(testCaseNum, "inqPreTrdRskLimResponseT");
	vinqPreTrdRskLimResponseT.basic = getBscInqPreTrdRskLimResponseT(testCaseNum, "inqPreTrdRskLimResponseT");	return vinqPreTrdRskLimResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqPreTrdRskLimRequestT(bscInqPreTrdRskLimRequestT actual, bscInqPreTrdRskLimRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqPreTrdRskLimRequestT(inqPreTrdRskLimRequestT actual, inqPreTrdRskLimRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqPreTrdRskLimRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqPreTrdRskLimRecT(bscInqPreTrdRskLimRecT actual, bscInqPreTrdRskLimRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimRecT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prcsStsValCod, expected.prcsStsValCod, PRCS_STS_VAL_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimRecT, prcsStsValCod not matching. Actual %s but Expected %s", actual.prcsStsValCod, expected.prcsStsValCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.preTrdRiskRndLot, expected.preTrdRiskRndLot, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimRecT, preTrdRiskRndLot not matching. Actual %s but Expected %s", actual.preTrdRiskRndLot, expected.preTrdRiskRndLot);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.violCntrLim, expected.violCntrLim, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimRecT, violCntrLim not matching. Actual %s but Expected %s", actual.violCntrLim, expected.violCntrLim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < INQ_RSK_LIM_TIM_INTVL_GRP_MAX;i++) {
		compareRskLimTimIntvlGrpT (actual.rskLimTimIntvlGrp[i],expected.rskLimTimIntvlGrp[i], logMsg);
	}
	for ( i = 0; i < INQ_RSK_LIM_WRK_ORDR_GRP_MAX;i++) {
		compareRskLimWrkOrdrGrpT (actual.rskLimWrkOrdrGrp[i],expected.rskLimWrkOrdrGrp[i], logMsg);
	}
	compareRskLimStsGrpT (actual.rskLimStsGrp,expected.rskLimStsGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqPreTrdRskLimResponseT(bscInqPreTrdRskLimResponseT actual, bscInqPreTrdRskLimResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqPreTrdRskLimResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_PRE_TRD_RSK_LIM_REC_MAX;i++) {
		compareBscInqPreTrdRskLimRecT (actual.bscInqPreTrdRskLimRec[i],expected.bscInqPreTrdRskLimRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqPreTrdRskLimResponseT(inqPreTrdRskLimResponseT actual, inqPreTrdRskLimResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqPreTrdRskLimResponseT (actual.basic,expected.basic, logMsg);
}

