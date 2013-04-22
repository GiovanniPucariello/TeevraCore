#include <ModPreTrdRskLim.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscModPreTrdRskLimRequestT getBscModPreTrdRskLimRequestT(char* testCaseNum , const char *root) {
	bscModPreTrdRskLimRequestT vbscModPreTrdRskLimRequestT;
	int i;

	char lactnCod[1] = {""};
	getStrProperty("ModPreTrdRskLim.bscModPreTrdRskLimRequestT.actnCod", lactnCod);
	vbscModPreTrdRskLimRequestT.actnCod = lactnCod[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscModPreTrdRskLimRequestT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("ModPreTrdRskLim.bscModPreTrdRskLimRequestT.prodId", lprodId);
	memcpy(vbscModPreTrdRskLimRequestT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscModPreTrdRskLimRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("ModPreTrdRskLim.bscModPreTrdRskLimRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscModPreTrdRskLimRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscModPreTrdRskLimRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscModPreTrdRskLimRequestT");
	vbscModPreTrdRskLimRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "bscModPreTrdRskLimRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vbscModPreTrdRskLimRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("ModPreTrdRskLim.bscModPreTrdRskLimRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vbscModPreTrdRskLimRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscModPreTrdRskLimRequestT.violCntrLim[i]= ' ';
	}
	char lviolCntrLim[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("ModPreTrdRskLim.bscModPreTrdRskLimRequestT.violCntrLim", lviolCntrLim);
	memcpy(vbscModPreTrdRskLimRequestT.violCntrLim, lviolCntrLim, DRIV_QUANTITY_LEN);

	char lrskLimRlseInd[1] = {""};
	getStrProperty("ModPreTrdRskLim.bscModPreTrdRskLimRequestT.rskLimRlseInd", lrskLimRlseInd);
	vbscModPreTrdRskLimRequestT.rskLimRlseInd = lrskLimRlseInd[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModPreTrdRskLimRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModPreTrdRskLim.bscModPreTrdRskLimRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModPreTrdRskLimRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModPreTrdRskLimRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modPreTrdRskLimRequestT getModPreTrdRskLimRequestT(char* testCaseNum , const char *root) {
	modPreTrdRskLimRequestT vmodPreTrdRskLimRequestT;
	int i;

	vmodPreTrdRskLimRequestT.header = getDataHeaderT(testCaseNum, "modPreTrdRskLimRequestT");
	vmodPreTrdRskLimRequestT.basic = getBscModPreTrdRskLimRequestT(testCaseNum, "modPreTrdRskLimRequestT");	return vmodPreTrdRskLimRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscModPreTrdRskLimResponseT getBscModPreTrdRskLimResponseT(char* testCaseNum , const char *root) {
	bscModPreTrdRskLimResponseT vbscModPreTrdRskLimResponseT;
	int i;

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscModPreTrdRskLimResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModPreTrdRskLim.bscModPreTrdRskLimResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscModPreTrdRskLimResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscModPreTrdRskLimResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
modPreTrdRskLimResponseT getModPreTrdRskLimResponseT(char* testCaseNum , const char *root) {
	modPreTrdRskLimResponseT vmodPreTrdRskLimResponseT;
	int i;

	vmodPreTrdRskLimResponseT.header = getDataHeaderT(testCaseNum, "modPreTrdRskLimResponseT");
	vmodPreTrdRskLimResponseT.basic = getBscModPreTrdRskLimResponseT(testCaseNum, "modPreTrdRskLimResponseT");	return vmodPreTrdRskLimResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModPreTrdRskLimRequestT(bscModPreTrdRskLimRequestT actual, bscModPreTrdRskLimRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.actnCod!= expected.actnCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModPreTrdRskLimRequestT, actnCodnot matching. Actual %d but Expected %d", actual.actnCod, expected.actnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModPreTrdRskLimRequestT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModPreTrdRskLimRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModPreTrdRskLimRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.violCntrLim, expected.violCntrLim, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModPreTrdRskLimRequestT, violCntrLim not matching. Actual %s but Expected %s", actual.violCntrLim, expected.violCntrLim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.rskLimRlseInd!= expected.rskLimRlseInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModPreTrdRskLimRequestT, rskLimRlseIndnot matching. Actual %d but Expected %d", actual.rskLimRlseInd, expected.rskLimRlseInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < MOD_RSK_LIM_TIM_INTVL_GRP_MAX;i++) {
		compareRskLimTimIntvlGrpT (actual.rskLimTimIntvlGrp[i],expected.rskLimTimIntvlGrp[i], logMsg);
	}
	for ( i = 0; i < MOD_RSK_LIM_WRK_ORDR_GRP_MAX;i++) {
		compareRskLimWrkOrdrGrpT (actual.rskLimWrkOrdrGrp[i],expected.rskLimWrkOrdrGrp[i], logMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModPreTrdRskLimRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModPreTrdRskLimRequestT(modPreTrdRskLimRequestT actual, modPreTrdRskLimRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModPreTrdRskLimRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscModPreTrdRskLimResponseT(bscModPreTrdRskLimResponseT actual, bscModPreTrdRskLimResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscModPreTrdRskLimResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareModPreTrdRskLimResponseT(modPreTrdRskLimResponseT actual, modPreTrdRskLimResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscModPreTrdRskLimResponseT (actual.basic,expected.basic, logMsg);
}

