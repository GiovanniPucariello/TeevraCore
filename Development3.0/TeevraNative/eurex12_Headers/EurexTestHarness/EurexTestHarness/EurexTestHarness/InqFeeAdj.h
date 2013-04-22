#include <InqFeeAdj.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFeeAdjGrpT getBscInqFeeAdjGrpT(char* testCaseNum , const char *root) {
	bscInqFeeAdjGrpT vbscInqFeeAdjGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqFeeAdjGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqFeeAdj.bscInqFeeAdjGrpT.prodId", lprodId);
	memcpy(vbscInqFeeAdjGrpT.prodId, lprodId, PROD_ID_LEN);
	return vbscInqFeeAdjGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFeeAdjRequestT getBscInqFeeAdjRequestT(char* testCaseNum , const char *root) {
	bscInqFeeAdjRequestT vbscInqFeeAdjRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vbscInqFeeAdjRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqFeeAdj.bscInqFeeAdjRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vbscInqFeeAdjRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqFeeAdjRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqFeeAdj.bscInqFeeAdjRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqFeeAdjRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqFeeAdjRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqFeeAdj.bscInqFeeAdjRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqFeeAdjRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqFeeAdjRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqFeeAdj.bscInqFeeAdjRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqFeeAdjRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqFeeAdjRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqFeeAdjRequestT getExtInqFeeAdjRequestT(char* testCaseNum , const char *root) {
	extInqFeeAdjRequestT vextInqFeeAdjRequestT;
	int i;

	for(i=0;i<DRIV_FEE_TYP_COD_LEN;i++) {
		vextInqFeeAdjRequestT.feeTypCod[i]= ' ';
	}
	char lfeeTypCod[DRIV_FEE_TYP_COD_LEN] = {""};
	getStrProperty("InqFeeAdj.extInqFeeAdjRequestT.feeTypCod", lfeeTypCod);
	memcpy(vextInqFeeAdjRequestT.feeTypCod, lfeeTypCod, DRIV_FEE_TYP_COD_LEN);

	vextInqFeeAdjRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqFeeAdjRequestT");	return vextInqFeeAdjRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqFeeAdjRequestT getInqFeeAdjRequestT(char* testCaseNum , const char *root) {
	inqFeeAdjRequestT vinqFeeAdjRequestT;
	int i;

	vinqFeeAdjRequestT.header = getDataHeaderT(testCaseNum, "inqFeeAdjRequestT");
	vinqFeeAdjRequestT.basic = getBscInqFeeAdjRequestT(testCaseNum, "inqFeeAdjRequestT");
	vinqFeeAdjRequestT.extension = getExtInqFeeAdjRequestT(testCaseNum, "inqFeeAdjRequestT");	return vinqFeeAdjRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFeeAdjRecT getBscInqFeeAdjRecT(char* testCaseNum , const char *root) {
	bscInqFeeAdjRecT vbscInqFeeAdjRecT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqFeeAdjRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqFeeAdj.bscInqFeeAdjRecT.prodId", lprodId);
	memcpy(vbscInqFeeAdjRecT.prodId, lprodId, PROD_ID_LEN);

	vbscInqFeeAdjRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "bscInqFeeAdjRecT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqFeeAdjRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqFeeAdj.bscInqFeeAdjRecT.trnDat", ltrnDat);
	memcpy(vbscInqFeeAdjRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqFeeAdjRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqFeeAdj.bscInqFeeAdjRecT.currTypCod", lcurrTypCod);
	memcpy(vbscInqFeeAdjRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);
	return vbscInqFeeAdjRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFeeAdjResponseT getBscInqFeeAdjResponseT(char* testCaseNum , const char *root) {
	bscInqFeeAdjResponseT vbscInqFeeAdjResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqFeeAdjResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqFeeAdj.bscInqFeeAdjResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqFeeAdjResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqFeeAdjResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqFeeAdj.bscInqFeeAdjResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqFeeAdjResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqFeeAdjResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqFeeAdjRecT getExtInqFeeAdjRecT(char* testCaseNum , const char *root) {
	extInqFeeAdjRecT vextInqFeeAdjRecT;
	int i;

	for(i=0;i<DRIV_FEE_TYP_COD_LEN;i++) {
		vextInqFeeAdjRecT.feeTypCod[i]= ' ';
	}
	char lfeeTypCod[DRIV_FEE_TYP_COD_LEN] = {""};
	getStrProperty("InqFeeAdj.extInqFeeAdjRecT.feeTypCod", lfeeTypCod);
	memcpy(vextInqFeeAdjRecT.feeTypCod, lfeeTypCod, DRIV_FEE_TYP_COD_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vextInqFeeAdjRecT.feeAdjAmnt[i]= ' ';
	}
	char lfeeAdjAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqFeeAdj.extInqFeeAdjRecT.feeAdjAmnt", lfeeAdjAmnt);
	memcpy(vextInqFeeAdjRecT.feeAdjAmnt, lfeeAdjAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_ADJ_MEMO_LEN;i++) {
		vextInqFeeAdjRecT.adjMemo[i]= ' ';
	}
	char ladjMemo[DRIV_ADJ_MEMO_LEN] = {""};
	getStrProperty("InqFeeAdj.extInqFeeAdjRecT.adjMemo", ladjMemo);
	memcpy(vextInqFeeAdjRecT.adjMemo, ladjMemo, DRIV_ADJ_MEMO_LEN);

	for(i=0;i<DRIV_FEE_ADJ_TRN_ID_LEN;i++) {
		vextInqFeeAdjRecT.feeAdjTrnId[i]= ' ';
	}
	char lfeeAdjTrnId[DRIV_FEE_ADJ_TRN_ID_LEN] = {""};
	getStrProperty("InqFeeAdj.extInqFeeAdjRecT.feeAdjTrnId", lfeeAdjTrnId);
	memcpy(vextInqFeeAdjRecT.feeAdjTrnId, lfeeAdjTrnId, DRIV_FEE_ADJ_TRN_ID_LEN);
	return vextInqFeeAdjRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqFeeAdjResponseT getExtInqFeeAdjResponseT(char* testCaseNum , const char *root) {
	extInqFeeAdjResponseT vextInqFeeAdjResponseT;
	int i;
	return vextInqFeeAdjResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqFeeAdjResponseT getInqFeeAdjResponseT(char* testCaseNum , const char *root) {
	inqFeeAdjResponseT vinqFeeAdjResponseT;
	int i;

	vinqFeeAdjResponseT.header = getDataHeaderT(testCaseNum, "inqFeeAdjResponseT");
	vinqFeeAdjResponseT.basic = getBscInqFeeAdjResponseT(testCaseNum, "inqFeeAdjResponseT");
	vinqFeeAdjResponseT.extension = getExtInqFeeAdjResponseT(testCaseNum, "inqFeeAdjResponseT");	return vinqFeeAdjResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFeeAdjGrpT(bscInqFeeAdjGrpT actual, bscInqFeeAdjGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFeeAdjGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFeeAdjRequestT(bscInqFeeAdjRequestT actual, bscInqFeeAdjRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < BSC_INQ_FEE_ADJ_GRP_MAX;i++) {
		compareBscInqFeeAdjGrpT (actual.bscInqFeeAdjGrp[i],expected.bscInqFeeAdjGrp[i], logMsg);
	}
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFeeAdjRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFeeAdjRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFeeAdjRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFeeAdjRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqFeeAdjRequestT(extInqFeeAdjRequestT actual, extInqFeeAdjRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.feeTypCod, expected.feeTypCod, DRIV_FEE_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFeeAdjRequestT, feeTypCod not matching. Actual %s but Expected %s", actual.feeTypCod, expected.feeTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqFeeAdjRequestT(inqFeeAdjRequestT actual, inqFeeAdjRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqFeeAdjRequestT (actual.basic,expected.basic, logMsg);
	compareExtInqFeeAdjRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFeeAdjRecT(bscInqFeeAdjRecT actual, bscInqFeeAdjRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFeeAdjRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFeeAdjRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFeeAdjRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFeeAdjResponseT(bscInqFeeAdjResponseT actual, bscInqFeeAdjResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFeeAdjResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFeeAdjResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_FEE_ADJ_REC_MAX;i++) {
		compareBscInqFeeAdjRecT (actual.bscInqFeeAdjRec[i],expected.bscInqFeeAdjRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqFeeAdjRecT(extInqFeeAdjRecT actual, extInqFeeAdjRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.feeTypCod, expected.feeTypCod, DRIV_FEE_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFeeAdjRecT, feeTypCod not matching. Actual %s but Expected %s", actual.feeTypCod, expected.feeTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.feeAdjAmnt, expected.feeAdjAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFeeAdjRecT, feeAdjAmnt not matching. Actual %s but Expected %s", actual.feeAdjAmnt, expected.feeAdjAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.adjMemo, expected.adjMemo, DRIV_ADJ_MEMO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFeeAdjRecT, adjMemo not matching. Actual %s but Expected %s", actual.adjMemo, expected.adjMemo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.feeAdjTrnId, expected.feeAdjTrnId, DRIV_FEE_ADJ_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFeeAdjRecT, feeAdjTrnId not matching. Actual %s but Expected %s", actual.feeAdjTrnId, expected.feeAdjTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqFeeAdjResponseT(extInqFeeAdjResponseT actual, extInqFeeAdjResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_FEE_ADJ_REC_MAX;i++) {
		compareExtInqFeeAdjRecT (actual.extInqFeeAdjRec[i],expected.extInqFeeAdjRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqFeeAdjResponseT(inqFeeAdjResponseT actual, inqFeeAdjResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqFeeAdjResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqFeeAdjResponseT (actual.extension,expected.extension, logMsg);
}

