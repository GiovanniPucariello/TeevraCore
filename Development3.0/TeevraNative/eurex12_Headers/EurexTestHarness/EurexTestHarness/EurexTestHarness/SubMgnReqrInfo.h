#include <SubMgnReqrInfo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubMgnReqrInfoRecT getBscSubMgnReqrInfoRecT(char* testCaseNum , const char *root) {
	bscSubMgnReqrInfoRecT vbscSubMgnReqrInfoRecT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscSubMgnReqrInfoRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("SubMgnReqrInfo.bscSubMgnReqrInfoRecT.currTypCod", lcurrTypCod);
	memcpy(vbscSubMgnReqrInfoRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	vbscSubMgnReqrInfoRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "bscSubMgnReqrInfoRecT");
	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscSubMgnReqrInfoRecT.mgnReqrAmnt[i]= ' ';
	}
	char lmgnReqrAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("SubMgnReqrInfo.bscSubMgnReqrInfoRecT.mgnReqrAmnt", lmgnReqrAmnt);
	memcpy(vbscSubMgnReqrInfoRecT.mgnReqrAmnt, lmgnReqrAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscSubMgnReqrInfoRecT.varPrmPrednAmnt[i]= ' ';
	}
	char lvarPrmPrednAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("SubMgnReqrInfo.bscSubMgnReqrInfoRecT.varPrmPrednAmnt", lvarPrmPrednAmnt);
	memcpy(vbscSubMgnReqrInfoRecT.varPrmPrednAmnt, lvarPrmPrednAmnt, DRIV_AMOUNT_LEN);
	return vbscSubMgnReqrInfoRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubMgnReqrInfoBcastT getBscSubMgnReqrInfoBcastT(char* testCaseNum , const char *root) {
	bscSubMgnReqrInfoBcastT vbscSubMgnReqrInfoBcastT;
	int i;

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubMgnReqrInfoBcastT.mgnReqrDat[i]= ' ';
	}
	char lmgnReqrDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubMgnReqrInfo.bscSubMgnReqrInfoBcastT.mgnReqrDat", lmgnReqrDat);
	memcpy(vbscSubMgnReqrInfoBcastT.mgnReqrDat, lmgnReqrDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubMgnReqrInfoBcastT.mgnReqrTim[i]= ' ';
	}
	char lmgnReqrTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubMgnReqrInfo.bscSubMgnReqrInfoBcastT.mgnReqrTim", lmgnReqrTim);
	memcpy(vbscSubMgnReqrInfoBcastT.mgnReqrTim, lmgnReqrTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscSubMgnReqrInfoBcastT.clgMembMgnReqr[i]= ' ';
	}
	char lclgMembMgnReqr[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("SubMgnReqrInfo.bscSubMgnReqrInfoBcastT.clgMembMgnReqr", lclgMembMgnReqr);
	memcpy(vbscSubMgnReqrInfoBcastT.clgMembMgnReqr, lclgMembMgnReqr, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_CLG_MEMB_CURR_TYP_COD_LEN;i++) {
		vbscSubMgnReqrInfoBcastT.clgMembCurrTypCod[i]= ' ';
	}
	char lclgMembCurrTypCod[DRIV_CLG_MEMB_CURR_TYP_COD_LEN] = {""};
	getStrProperty("SubMgnReqrInfo.bscSubMgnReqrInfoBcastT.clgMembCurrTypCod", lclgMembCurrTypCod);
	memcpy(vbscSubMgnReqrInfoBcastT.clgMembCurrTypCod, lclgMembCurrTypCod, DRIV_CLG_MEMB_CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscSubMgnReqrInfoBcastT.shtfallSrplAmnt[i]= ' ';
	}
	char lshtfallSrplAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("SubMgnReqrInfo.bscSubMgnReqrInfoBcastT.shtfallSrplAmnt", lshtfallSrplAmnt);
	memcpy(vbscSubMgnReqrInfoBcastT.shtfallSrplAmnt, lshtfallSrplAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscSubMgnReqrInfoBcastT.currVarPrmPrednAmnt[i]= ' ';
	}
	char lcurrVarPrmPrednAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("SubMgnReqrInfo.bscSubMgnReqrInfoBcastT.currVarPrmPrednAmnt", lcurrVarPrmPrednAmnt);
	memcpy(vbscSubMgnReqrInfoBcastT.currVarPrmPrednAmnt, lcurrVarPrmPrednAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscSubMgnReqrInfoBcastT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubMgnReqrInfo.bscSubMgnReqrInfoBcastT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscSubMgnReqrInfoBcastT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscSubMgnReqrInfoBcastT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("SubMgnReqrInfo.bscSubMgnReqrInfoBcastT.mliRecCtr", lmliRecCtr);
	memcpy(vbscSubMgnReqrInfoBcastT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscSubMgnReqrInfoBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subMgnReqrInfoBcastT getSubMgnReqrInfoBcastT(char* testCaseNum , const char *root) {
	subMgnReqrInfoBcastT vsubMgnReqrInfoBcastT;
	int i;

	vsubMgnReqrInfoBcastT.header = getDataHeaderT(testCaseNum, "subMgnReqrInfoBcastT");
	vsubMgnReqrInfoBcastT.basic = getBscSubMgnReqrInfoBcastT(testCaseNum, "subMgnReqrInfoBcastT");	return vsubMgnReqrInfoBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subMgnReqrInfoSubjectT getSubMgnReqrInfoSubjectT(char* testCaseNum , const char *root) {
	subMgnReqrInfoSubjectT vsubMgnReqrInfoSubjectT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vsubMgnReqrInfoSubjectT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("SubMgnReqrInfo.subMgnReqrInfoSubjectT.membClgIdCod", lmembClgIdCod);
	memcpy(vsubMgnReqrInfoSubjectT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);
	return vsubMgnReqrInfoSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubMgnReqrInfoRecT(bscSubMgnReqrInfoRecT actual, bscSubMgnReqrInfoRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMgnReqrInfoRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.mgnReqrAmnt, expected.mgnReqrAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMgnReqrInfoRecT, mgnReqrAmnt not matching. Actual %s but Expected %s", actual.mgnReqrAmnt, expected.mgnReqrAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.varPrmPrednAmnt, expected.varPrmPrednAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMgnReqrInfoRecT, varPrmPrednAmnt not matching. Actual %s but Expected %s", actual.varPrmPrednAmnt, expected.varPrmPrednAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubMgnReqrInfoBcastT(bscSubMgnReqrInfoBcastT actual, bscSubMgnReqrInfoBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.mgnReqrDat, expected.mgnReqrDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMgnReqrInfoBcastT, mgnReqrDat not matching. Actual %s but Expected %s", actual.mgnReqrDat, expected.mgnReqrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mgnReqrTim, expected.mgnReqrTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMgnReqrInfoBcastT, mgnReqrTim not matching. Actual %s but Expected %s", actual.mgnReqrTim, expected.mgnReqrTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.clgMembMgnReqr, expected.clgMembMgnReqr, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMgnReqrInfoBcastT, clgMembMgnReqr not matching. Actual %s but Expected %s", actual.clgMembMgnReqr, expected.clgMembMgnReqr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.clgMembCurrTypCod, expected.clgMembCurrTypCod, DRIV_CLG_MEMB_CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMgnReqrInfoBcastT, clgMembCurrTypCod not matching. Actual %s but Expected %s", actual.clgMembCurrTypCod, expected.clgMembCurrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtfallSrplAmnt, expected.shtfallSrplAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMgnReqrInfoBcastT, shtfallSrplAmnt not matching. Actual %s but Expected %s", actual.shtfallSrplAmnt, expected.shtfallSrplAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currVarPrmPrednAmnt, expected.currVarPrmPrednAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMgnReqrInfoBcastT, currVarPrmPrednAmnt not matching. Actual %s but Expected %s", actual.currVarPrmPrednAmnt, expected.currVarPrmPrednAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMgnReqrInfoBcastT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubMgnReqrInfoBcastT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_SUB_MGN_REQR_INFO_REC_MAX;i++) {
		compareBscSubMgnReqrInfoRecT (actual.bscSubMgnReqrInfoRec[i],expected.bscSubMgnReqrInfoRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubMgnReqrInfoBcastT(subMgnReqrInfoBcastT actual, subMgnReqrInfoBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubMgnReqrInfoBcastT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubMgnReqrInfoSubjectT(subMgnReqrInfoSubjectT actual, subMgnReqrInfoSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In subMgnReqrInfoSubjectT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

