#include <InqSecuMvt.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqSecuMvtRequestT getBscInqSecuMvtRequestT(char* testCaseNum , const char *root) {
	bscInqSecuMvtRequestT vbscInqSecuMvtRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqSecuMvtRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqSecuMvtRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vbscInqSecuMvtRequestT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRequestT.isinCod", lisinCod);
	memcpy(vbscInqSecuMvtRequestT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<DRIV_CSD_ID_LEN;i++) {
		vbscInqSecuMvtRequestT.csdId[i]= ' ';
	}
	char lcsdId[DRIV_CSD_ID_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRequestT.csdId", lcsdId);
	memcpy(vbscInqSecuMvtRequestT.csdId, lcsdId, DRIV_CSD_ID_LEN);

	for(i=0;i<CSD_ACCT_NO_LEN;i++) {
		vbscInqSecuMvtRequestT.csdPldgAcctNo[i]= ' ';
	}
	char lcsdPldgAcctNo[CSD_ACCT_NO_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRequestT.csdPldgAcctNo", lcsdPldgAcctNo);
	memcpy(vbscInqSecuMvtRequestT.csdPldgAcctNo, lcsdPldgAcctNo, CSD_ACCT_NO_LEN);

	char lasstPurpCod[1] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRequestT.asstPurpCod", lasstPurpCod);
	vbscInqSecuMvtRequestT.asstPurpCod = lasstPurpCod[0];

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqSecuMvtRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqSecuMvtRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqSecuMvtRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqSecuMvtRequestT getInqSecuMvtRequestT(char* testCaseNum , const char *root) {
	inqSecuMvtRequestT vinqSecuMvtRequestT;
	int i;

	vinqSecuMvtRequestT.header = getDataHeaderT(testCaseNum, "inqSecuMvtRequestT");
	vinqSecuMvtRequestT.basic = getBscInqSecuMvtRequestT(testCaseNum, "inqSecuMvtRequestT");	return vinqSecuMvtRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqSecuMvtRecT getBscInqSecuMvtRecT(char* testCaseNum , const char *root) {
	bscInqSecuMvtRecT vbscInqSecuMvtRecT;
	int i;

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqSecuMvtRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.currTypCod", lcurrTypCod);
	memcpy(vbscInqSecuMvtRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vbscInqSecuMvtRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.isinCod", lisinCod);
	memcpy(vbscInqSecuMvtRecT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqSecuMvtRecT.clsPrc[i]= ' ';
	}
	char lclsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.clsPrc", lclsPrc);
	memcpy(vbscInqSecuMvtRecT.clsPrc, lclsPrc, DRIV_PRICE_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqSecuMvtRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqSecuMvtRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqSecuMvtRecT.strtBulk[i]= ' ';
	}
	char lstrtBulk[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.strtBulk", lstrtBulk);
	memcpy(vbscInqSecuMvtRecT.strtBulk, lstrtBulk, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqSecuMvtRecT.withBulk[i]= ' ';
	}
	char lwithBulk[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.withBulk", lwithBulk);
	memcpy(vbscInqSecuMvtRecT.withBulk, lwithBulk, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqSecuMvtRecT.depBulk[i]= ' ';
	}
	char ldepBulk[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.depBulk", ldepBulk);
	memcpy(vbscInqSecuMvtRecT.depBulk, ldepBulk, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqSecuMvtRecT.pendWithBulk[i]= ' ';
	}
	char lpendWithBulk[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.pendWithBulk", lpendWithBulk);
	memcpy(vbscInqSecuMvtRecT.pendWithBulk, lpendWithBulk, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqSecuMvtRecT.crtBulk[i]= ' ';
	}
	char lcrtBulk[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.crtBulk", lcrtBulk);
	memcpy(vbscInqSecuMvtRecT.crtBulk, lcrtBulk, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscInqSecuMvtRecT.spcEquCollQty[i]= ' ';
	}
	char lspcEquCollQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.spcEquCollQty", lspcEquCollQty);
	memcpy(vbscInqSecuMvtRecT.spcEquCollQty, lspcEquCollQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vbscInqSecuMvtRecT.usedSecQty[i]= ' ';
	}
	char lusedSecQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.usedSecQty", lusedSecQty);
	memcpy(vbscInqSecuMvtRecT.usedSecQty, lusedSecQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_MKT_VAL_FCTR_LEN;i++) {
		vbscInqSecuMvtRecT.mktValFctr[i]= ' ';
	}
	char lmktValFctr[DRIV_MKT_VAL_FCTR_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.mktValFctr", lmktValFctr);
	memcpy(vbscInqSecuMvtRecT.mktValFctr, lmktValFctr, DRIV_MKT_VAL_FCTR_LEN);

	char lasstPurpCod[1] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.asstPurpCod", lasstPurpCod);
	vbscInqSecuMvtRecT.asstPurpCod = lasstPurpCod[0];

	for(i=0;i<DRIV_COLL_DISP_DCML_LEN;i++) {
		vbscInqSecuMvtRecT.collDispDcml[i]= ' ';
	}
	char lcollDispDcml[DRIV_COLL_DISP_DCML_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.collDispDcml", lcollDispDcml);
	memcpy(vbscInqSecuMvtRecT.collDispDcml, lcollDispDcml, DRIV_COLL_DISP_DCML_LEN);

	for(i=0;i<DRIV_SECU_TYP_LEN;i++) {
		vbscInqSecuMvtRecT.secuTyp[i]= ' ';
	}
	char lsecuTyp[DRIV_SECU_TYP_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.secuTyp", lsecuTyp);
	memcpy(vbscInqSecuMvtRecT.secuTyp, lsecuTyp, DRIV_SECU_TYP_LEN);

	for(i=0;i<DRIV_CSD_ID_LEN;i++) {
		vbscInqSecuMvtRecT.csdId[i]= ' ';
	}
	char lcsdId[DRIV_CSD_ID_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.csdId", lcsdId);
	memcpy(vbscInqSecuMvtRecT.csdId, lcsdId, DRIV_CSD_ID_LEN);

	for(i=0;i<CSD_ACCT_NO_LEN;i++) {
		vbscInqSecuMvtRecT.csdPldgAcctNo[i]= ' ';
	}
	char lcsdPldgAcctNo[CSD_ACCT_NO_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.csdPldgAcctNo", lcsdPldgAcctNo);
	memcpy(vbscInqSecuMvtRecT.csdPldgAcctNo, lcsdPldgAcctNo, CSD_ACCT_NO_LEN);

	for(i=0;i<NON_EVAL_RSN_LEN;i++) {
		vbscInqSecuMvtRecT.nonEvalRsn[i]= ' ';
	}
	char lnonEvalRsn[NON_EVAL_RSN_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtRecT.nonEvalRsn", lnonEvalRsn);
	memcpy(vbscInqSecuMvtRecT.nonEvalRsn, lnonEvalRsn, NON_EVAL_RSN_LEN);
	return vbscInqSecuMvtRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqSecuMvtResponseT getBscInqSecuMvtResponseT(char* testCaseNum , const char *root) {
	bscInqSecuMvtResponseT vbscInqSecuMvtResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqSecuMvtResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqSecuMvtResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqSecuMvtResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqSecuMvt.bscInqSecuMvtResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqSecuMvtResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqSecuMvtResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqSecuMvtResponseT getInqSecuMvtResponseT(char* testCaseNum , const char *root) {
	inqSecuMvtResponseT vinqSecuMvtResponseT;
	int i;

	vinqSecuMvtResponseT.header = getDataHeaderT(testCaseNum, "inqSecuMvtResponseT");
	vinqSecuMvtResponseT.basic = getBscInqSecuMvtResponseT(testCaseNum, "inqSecuMvtResponseT");	return vinqSecuMvtResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqSecuMvtRequestT(bscInqSecuMvtRequestT actual, bscInqSecuMvtRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRequestT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdId, expected.csdId, DRIV_CSD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRequestT, csdId not matching. Actual %s but Expected %s", actual.csdId, expected.csdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdPldgAcctNo, expected.csdPldgAcctNo, CSD_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRequestT, csdPldgAcctNo not matching. Actual %s but Expected %s", actual.csdPldgAcctNo, expected.csdPldgAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.asstPurpCod!= expected.asstPurpCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRequestT, asstPurpCodnot matching. Actual %d but Expected %d", actual.asstPurpCod, expected.asstPurpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqSecuMvtRequestT(inqSecuMvtRequestT actual, inqSecuMvtRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqSecuMvtRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqSecuMvtRecT(bscInqSecuMvtRecT actual, bscInqSecuMvtRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.clsPrc, expected.clsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, clsPrc not matching. Actual %s but Expected %s", actual.clsPrc, expected.clsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.strtBulk, expected.strtBulk, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, strtBulk not matching. Actual %s but Expected %s", actual.strtBulk, expected.strtBulk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.withBulk, expected.withBulk, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, withBulk not matching. Actual %s but Expected %s", actual.withBulk, expected.withBulk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.depBulk, expected.depBulk, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, depBulk not matching. Actual %s but Expected %s", actual.depBulk, expected.depBulk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.pendWithBulk, expected.pendWithBulk, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, pendWithBulk not matching. Actual %s but Expected %s", actual.pendWithBulk, expected.pendWithBulk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtBulk, expected.crtBulk, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, crtBulk not matching. Actual %s but Expected %s", actual.crtBulk, expected.crtBulk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.spcEquCollQty, expected.spcEquCollQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, spcEquCollQty not matching. Actual %s but Expected %s", actual.spcEquCollQty, expected.spcEquCollQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.usedSecQty, expected.usedSecQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, usedSecQty not matching. Actual %s but Expected %s", actual.usedSecQty, expected.usedSecQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mktValFctr, expected.mktValFctr, DRIV_MKT_VAL_FCTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, mktValFctr not matching. Actual %s but Expected %s", actual.mktValFctr, expected.mktValFctr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.asstPurpCod!= expected.asstPurpCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, asstPurpCodnot matching. Actual %d but Expected %d", actual.asstPurpCod, expected.asstPurpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.collDispDcml, expected.collDispDcml, DRIV_COLL_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, collDispDcml not matching. Actual %s but Expected %s", actual.collDispDcml, expected.collDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuTyp, expected.secuTyp, DRIV_SECU_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, secuTyp not matching. Actual %s but Expected %s", actual.secuTyp, expected.secuTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdId, expected.csdId, DRIV_CSD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, csdId not matching. Actual %s but Expected %s", actual.csdId, expected.csdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.csdPldgAcctNo, expected.csdPldgAcctNo, CSD_ACCT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, csdPldgAcctNo not matching. Actual %s but Expected %s", actual.csdPldgAcctNo, expected.csdPldgAcctNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.nonEvalRsn, expected.nonEvalRsn, NON_EVAL_RSN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtRecT, nonEvalRsn not matching. Actual %s but Expected %s", actual.nonEvalRsn, expected.nonEvalRsn);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqSecuMvtResponseT(bscInqSecuMvtResponseT actual, bscInqSecuMvtResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqSecuMvtResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_SECU_MVT_REC_MAX;i++) {
		compareBscInqSecuMvtRecT (actual.bscInqSecuMvtRec[i],expected.bscInqSecuMvtRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqSecuMvtResponseT(inqSecuMvtResponseT actual, inqSecuMvtResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqSecuMvtResponseT (actual.basic,expected.basic, logMsg);
}

