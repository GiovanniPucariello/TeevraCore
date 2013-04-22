#include <InqMgnReqrInfo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMgnReqrInfoRequestT getBscInqMgnReqrInfoRequestT(char* testCaseNum , const char *root) {
	bscInqMgnReqrInfoRequestT vbscInqMgnReqrInfoRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vbscInqMgnReqrInfoRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqMgnReqrInfo.bscInqMgnReqrInfoRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vbscInqMgnReqrInfoRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqMgnReqrInfoRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqMgnReqrInfo.bscInqMgnReqrInfoRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqMgnReqrInfoRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);
	return vbscInqMgnReqrInfoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMgnReqrInfoRequestT getInqMgnReqrInfoRequestT(char* testCaseNum , const char *root) {
	inqMgnReqrInfoRequestT vinqMgnReqrInfoRequestT;
	int i;

	vinqMgnReqrInfoRequestT.header = getDataHeaderT(testCaseNum, "inqMgnReqrInfoRequestT");
	vinqMgnReqrInfoRequestT.basic = getBscInqMgnReqrInfoRequestT(testCaseNum, "inqMgnReqrInfoRequestT");	return vinqMgnReqrInfoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMgnReqrInfoRecT getBscInqMgnReqrInfoRecT(char* testCaseNum , const char *root) {
	bscInqMgnReqrInfoRecT vbscInqMgnReqrInfoRecT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqMgnReqrInfoRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqMgnReqrInfo.bscInqMgnReqrInfoRecT.currTypCod", lcurrTypCod);
	memcpy(vbscInqMgnReqrInfoRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	vbscInqMgnReqrInfoRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "bscInqMgnReqrInfoRecT");
	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqMgnReqrInfoRecT.mgnReqrAmnt[i]= ' ';
	}
	char lmgnReqrAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqMgnReqrInfo.bscInqMgnReqrInfoRecT.mgnReqrAmnt", lmgnReqrAmnt);
	memcpy(vbscInqMgnReqrInfoRecT.mgnReqrAmnt, lmgnReqrAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqMgnReqrInfoRecT.varPrmPrednAmnt[i]= ' ';
	}
	char lvarPrmPrednAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqMgnReqrInfo.bscInqMgnReqrInfoRecT.varPrmPrednAmnt", lvarPrmPrednAmnt);
	memcpy(vbscInqMgnReqrInfoRecT.varPrmPrednAmnt, lvarPrmPrednAmnt, DRIV_AMOUNT_LEN);
	return vbscInqMgnReqrInfoRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqMgnReqrInfoResponseT getBscInqMgnReqrInfoResponseT(char* testCaseNum , const char *root) {
	bscInqMgnReqrInfoResponseT vbscInqMgnReqrInfoResponseT;
	int i;

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqMgnReqrInfoResponseT.mgnReqrDat[i]= ' ';
	}
	char lmgnReqrDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqMgnReqrInfo.bscInqMgnReqrInfoResponseT.mgnReqrDat", lmgnReqrDat);
	memcpy(vbscInqMgnReqrInfoResponseT.mgnReqrDat, lmgnReqrDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqMgnReqrInfoResponseT.mgnReqrTim[i]= ' ';
	}
	char lmgnReqrTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqMgnReqrInfo.bscInqMgnReqrInfoResponseT.mgnReqrTim", lmgnReqrTim);
	memcpy(vbscInqMgnReqrInfoResponseT.mgnReqrTim, lmgnReqrTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqMgnReqrInfoResponseT.clgMembMgnReqr[i]= ' ';
	}
	char lclgMembMgnReqr[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqMgnReqrInfo.bscInqMgnReqrInfoResponseT.clgMembMgnReqr", lclgMembMgnReqr);
	memcpy(vbscInqMgnReqrInfoResponseT.clgMembMgnReqr, lclgMembMgnReqr, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_CLG_MEMB_CURR_TYP_COD_LEN;i++) {
		vbscInqMgnReqrInfoResponseT.clgMembCurrTypCod[i]= ' ';
	}
	char lclgMembCurrTypCod[DRIV_CLG_MEMB_CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqMgnReqrInfo.bscInqMgnReqrInfoResponseT.clgMembCurrTypCod", lclgMembCurrTypCod);
	memcpy(vbscInqMgnReqrInfoResponseT.clgMembCurrTypCod, lclgMembCurrTypCod, DRIV_CLG_MEMB_CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqMgnReqrInfoResponseT.shtfallSrplAmnt[i]= ' ';
	}
	char lshtfallSrplAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqMgnReqrInfo.bscInqMgnReqrInfoResponseT.shtfallSrplAmnt", lshtfallSrplAmnt);
	memcpy(vbscInqMgnReqrInfoResponseT.shtfallSrplAmnt, lshtfallSrplAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqMgnReqrInfoResponseT.currVarPrmPrednAmnt[i]= ' ';
	}
	char lcurrVarPrmPrednAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqMgnReqrInfo.bscInqMgnReqrInfoResponseT.currVarPrmPrednAmnt", lcurrVarPrmPrednAmnt);
	memcpy(vbscInqMgnReqrInfoResponseT.currVarPrmPrednAmnt, lcurrVarPrmPrednAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqMgnReqrInfoResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqMgnReqrInfo.bscInqMgnReqrInfoResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqMgnReqrInfoResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqMgnReqrInfoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqMgnReqrInfoResponseT getInqMgnReqrInfoResponseT(char* testCaseNum , const char *root) {
	inqMgnReqrInfoResponseT vinqMgnReqrInfoResponseT;
	int i;

	vinqMgnReqrInfoResponseT.header = getDataHeaderT(testCaseNum, "inqMgnReqrInfoResponseT");
	vinqMgnReqrInfoResponseT.basic = getBscInqMgnReqrInfoResponseT(testCaseNum, "inqMgnReqrInfoResponseT");	return vinqMgnReqrInfoResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMgnReqrInfoRequestT(bscInqMgnReqrInfoRequestT actual, bscInqMgnReqrInfoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMgnReqrInfoRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMgnReqrInfoRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMgnReqrInfoRequestT(inqMgnReqrInfoRequestT actual, inqMgnReqrInfoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMgnReqrInfoRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMgnReqrInfoRecT(bscInqMgnReqrInfoRecT actual, bscInqMgnReqrInfoRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMgnReqrInfoRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.mgnReqrAmnt, expected.mgnReqrAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMgnReqrInfoRecT, mgnReqrAmnt not matching. Actual %s but Expected %s", actual.mgnReqrAmnt, expected.mgnReqrAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.varPrmPrednAmnt, expected.varPrmPrednAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMgnReqrInfoRecT, varPrmPrednAmnt not matching. Actual %s but Expected %s", actual.varPrmPrednAmnt, expected.varPrmPrednAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqMgnReqrInfoResponseT(bscInqMgnReqrInfoResponseT actual, bscInqMgnReqrInfoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mgnReqrDat, expected.mgnReqrDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMgnReqrInfoResponseT, mgnReqrDat not matching. Actual %s but Expected %s", actual.mgnReqrDat, expected.mgnReqrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mgnReqrTim, expected.mgnReqrTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMgnReqrInfoResponseT, mgnReqrTim not matching. Actual %s but Expected %s", actual.mgnReqrTim, expected.mgnReqrTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.clgMembMgnReqr, expected.clgMembMgnReqr, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMgnReqrInfoResponseT, clgMembMgnReqr not matching. Actual %s but Expected %s", actual.clgMembMgnReqr, expected.clgMembMgnReqr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.clgMembCurrTypCod, expected.clgMembCurrTypCod, DRIV_CLG_MEMB_CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMgnReqrInfoResponseT, clgMembCurrTypCod not matching. Actual %s but Expected %s", actual.clgMembCurrTypCod, expected.clgMembCurrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtfallSrplAmnt, expected.shtfallSrplAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMgnReqrInfoResponseT, shtfallSrplAmnt not matching. Actual %s but Expected %s", actual.shtfallSrplAmnt, expected.shtfallSrplAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currVarPrmPrednAmnt, expected.currVarPrmPrednAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMgnReqrInfoResponseT, currVarPrmPrednAmnt not matching. Actual %s but Expected %s", actual.currVarPrmPrednAmnt, expected.currVarPrmPrednAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqMgnReqrInfoResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_MGN_REQR_INFO_REC_MAX;i++) {
		compareBscInqMgnReqrInfoRecT (actual.bscInqMgnReqrInfoRec[i],expected.bscInqMgnReqrInfoRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqMgnReqrInfoResponseT(inqMgnReqrInfoResponseT actual, inqMgnReqrInfoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqMgnReqrInfoResponseT (actual.basic,expected.basic, logMsg);
}

