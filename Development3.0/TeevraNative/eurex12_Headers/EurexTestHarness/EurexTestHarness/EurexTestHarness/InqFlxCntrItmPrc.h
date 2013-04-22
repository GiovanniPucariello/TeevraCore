#include <InqFlxCntrItmPrc.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFlxOptItmPrcRequestT getBscInqFlxOptItmPrcRequestT(char* testCaseNum , const char *root) {
	bscInqFlxOptItmPrcRequestT vbscInqFlxOptItmPrcRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqFlxOptItmPrcRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqFlxOptItmPrcRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqFlxOptItmPrcRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscInqFlxOptItmPrcRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRequestT.buyCod", lbuyCod);
	vbscInqFlxOptItmPrcRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqFlxOptItmPrcRequestT.undrPrc[i]= ' ';
	}
	char lundrPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRequestT.undrPrc", lundrPrc);
	memcpy(vbscInqFlxOptItmPrcRequestT.undrPrc, lundrPrc, DRIV_PRICE_LEN);

	vbscInqFlxOptItmPrcRequestT.flxOptCntrIdGrp = getFlxOptCntrIdGrpT(testCaseNum, "bscInqFlxOptItmPrcRequestT");
	vbscInqFlxOptItmPrcRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqFlxOptItmPrcRequestT");
	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqFlxOptItmPrcRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqFlxOptItmPrcRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqFlxOptItmPrcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqFlxOptItmPrcRequestT getExtInqFlxOptItmPrcRequestT(char* testCaseNum , const char *root) {
	extInqFlxOptItmPrcRequestT vextInqFlxOptItmPrcRequestT;
	int i;

	vextInqFlxOptItmPrcRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqFlxOptItmPrcRequestT");
	vextInqFlxOptItmPrcRequestT.txtGrp = getTxtGrpT(testCaseNum, "extInqFlxOptItmPrcRequestT");	return vextInqFlxOptItmPrcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqFlxOptItmPrcRequestT getInqFlxOptItmPrcRequestT(char* testCaseNum , const char *root) {
	inqFlxOptItmPrcRequestT vinqFlxOptItmPrcRequestT;
	int i;

	vinqFlxOptItmPrcRequestT.header = getDataHeaderT(testCaseNum, "inqFlxOptItmPrcRequestT");
	vinqFlxOptItmPrcRequestT.basic = getBscInqFlxOptItmPrcRequestT(testCaseNum, "inqFlxOptItmPrcRequestT");
	vinqFlxOptItmPrcRequestT.extension = getExtInqFlxOptItmPrcRequestT(testCaseNum, "inqFlxOptItmPrcRequestT");	return vinqFlxOptItmPrcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFlxOptItmPrcRecT getBscInqFlxOptItmPrcRecT(char* testCaseNum , const char *root) {
	bscInqFlxOptItmPrcRecT vbscInqFlxOptItmPrcRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRecT.buyCod", lbuyCod);
	vbscInqFlxOptItmPrcRecT.buyCod = lbuyCod[0];

	vbscInqFlxOptItmPrcRecT.flxOptCntrIdGrp = getFlxOptCntrIdGrpT(testCaseNum, "bscInqFlxOptItmPrcRecT");
	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqFlxOptItmPrcRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqFlxOptItmPrcRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqFlxOptItmPrcRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqFlxOptItmPrcRecT");
	vbscInqFlxOptItmPrcRecT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscInqFlxOptItmPrcRecT");
	for(i=0;i<DRIV_TRN_ID_SFX_NO_PNT_LEN;i++) {
		vbscInqFlxOptItmPrcRecT.trnIdSfxNoPnt[i]= ' ';
	}
	char ltrnIdSfxNoPnt[DRIV_TRN_ID_SFX_NO_PNT_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRecT.trnIdSfxNoPnt", ltrnIdSfxNoPnt);
	memcpy(vbscInqFlxOptItmPrcRecT.trnIdSfxNoPnt, ltrnIdSfxNoPnt, DRIV_TRN_ID_SFX_NO_PNT_LEN);

	char ltrnAdjStsCod[1] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRecT.trnAdjStsCod", ltrnAdjStsCod);
	vbscInqFlxOptItmPrcRecT.trnAdjStsCod = ltrnAdjStsCod[0];

	for(i=0;i<TRD_UNT_NO_LEN;i++) {
		vbscInqFlxOptItmPrcRecT.trdUntNo[i]= ' ';
	}
	char ltrdUntNo[TRD_UNT_NO_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRecT.trdUntNo", ltrdUntNo);
	memcpy(vbscInqFlxOptItmPrcRecT.trdUntNo, ltrdUntNo, TRD_UNT_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqFlxOptItmPrcRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscInqFlxOptItmPrcRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqFlxOptItmPrcRecT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRecT.trdXQty", ltrdXQty);
	memcpy(vbscInqFlxOptItmPrcRecT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vbscInqFlxOptItmPrcRecT.itmAmnt[i]= ' ';
	}
	char litmAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRecT.itmAmnt", litmAmnt);
	memcpy(vbscInqFlxOptItmPrcRecT.itmAmnt, litmAmnt, DRIV_AMOUNT_LEN);

	char lflxCntrTrnStsCod[1] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRecT.flxCntrTrnStsCod", lflxCntrTrnStsCod);
	vbscInqFlxOptItmPrcRecT.flxCntrTrnStsCod = lflxCntrTrnStsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqFlxOptItmPrcRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRecT.trnDat", ltrnDat);
	memcpy(vbscInqFlxOptItmPrcRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqFlxOptItmPrcRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRecT.trnTim", ltrnTim);
	memcpy(vbscInqFlxOptItmPrcRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	vbscInqFlxOptItmPrcRecT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "bscInqFlxOptItmPrcRecT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqFlxOptItmPrcRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqFlxOptItmPrcRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqFlxOptItmPrcRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFlxOptItmPrcResponseT getBscInqFlxOptItmPrcResponseT(char* testCaseNum , const char *root) {
	bscInqFlxOptItmPrcResponseT vbscInqFlxOptItmPrcResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqFlxOptItmPrcResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqFlxOptItmPrcResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqFlxOptItmPrcResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.bscInqFlxOptItmPrcResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqFlxOptItmPrcResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqFlxOptItmPrcResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqFlxOptItmPrcRecT getExtInqFlxOptItmPrcRecT(char* testCaseNum , const char *root) {
	extInqFlxOptItmPrcRecT vextInqFlxOptItmPrcRecT;
	int i;

	vextInqFlxOptItmPrcRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqFlxOptItmPrcRecT");
	vextInqFlxOptItmPrcRecT.txtGrp = getTxtGrpT(testCaseNum, "extInqFlxOptItmPrcRecT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextInqFlxOptItmPrcRecT.flxCntrClsPrc[i]= ' ';
	}
	char lflxCntrClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.extInqFlxOptItmPrcRecT.flxCntrClsPrc", lflxCntrClsPrc);
	memcpy(vextInqFlxOptItmPrcRecT.flxCntrClsPrc, lflxCntrClsPrc, DRIV_PRICE_LEN);

	char lclsStsCod[1] = {""};
	getStrProperty("InqFlxCntrItmPrc.extInqFlxOptItmPrcRecT.clsStsCod", lclsStsCod);
	vextInqFlxOptItmPrcRecT.clsStsCod = lclsStsCod[0];

	char lflxCntrGuStsCod[1] = {""};
	getStrProperty("InqFlxCntrItmPrc.extInqFlxOptItmPrcRecT.flxCntrGuStsCod", lflxCntrGuStsCod);
	vextInqFlxOptItmPrcRecT.flxCntrGuStsCod = lflxCntrGuStsCod[0];

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vextInqFlxOptItmPrcRecT.membPropCtpyIdCod[i]= ' ';
	}
	char lmembPropCtpyIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.extInqFlxOptItmPrcRecT.membPropCtpyIdCod", lmembPropCtpyIdCod);
	memcpy(vextInqFlxOptItmPrcRecT.membPropCtpyIdCod, lmembPropCtpyIdCod, MEMB_EXCH_ID_COD_LEN);

	char labdnInd[1] = {""};
	getStrProperty("InqFlxCntrItmPrc.extInqFlxOptItmPrcRecT.abdnInd", labdnInd);
	vextInqFlxOptItmPrcRecT.abdnInd = labdnInd[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vextInqFlxOptItmPrcRecT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.extInqFlxOptItmPrcRecT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vextInqFlxOptItmPrcRecT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	char lflxCntrMtnCod[1] = {""};
	getStrProperty("InqFlxCntrItmPrc.extInqFlxOptItmPrcRecT.flxCntrMtnCod", lflxCntrMtnCod);
	vextInqFlxOptItmPrcRecT.flxCntrMtnCod = lflxCntrMtnCod[0];

	for(i=0;i<FLX_CNTR_ACTN_MAP_LEN;i++) {
		vextInqFlxOptItmPrcRecT.flxCntrActnMap[i]= ' ';
	}
	char lflxCntrActnMap[FLX_CNTR_ACTN_MAP_LEN] = {""};
	getStrProperty("InqFlxCntrItmPrc.extInqFlxOptItmPrcRecT.flxCntrActnMap", lflxCntrActnMap);
	memcpy(vextInqFlxOptItmPrcRecT.flxCntrActnMap, lflxCntrActnMap, FLX_CNTR_ACTN_MAP_LEN);
	return vextInqFlxOptItmPrcRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqFlxOptItmPrcResponseT getExtInqFlxOptItmPrcResponseT(char* testCaseNum , const char *root) {
	extInqFlxOptItmPrcResponseT vextInqFlxOptItmPrcResponseT;
	int i;
	return vextInqFlxOptItmPrcResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqFlxOptItmPrcResponseT getInqFlxOptItmPrcResponseT(char* testCaseNum , const char *root) {
	inqFlxOptItmPrcResponseT vinqFlxOptItmPrcResponseT;
	int i;

	vinqFlxOptItmPrcResponseT.header = getDataHeaderT(testCaseNum, "inqFlxOptItmPrcResponseT");
	vinqFlxOptItmPrcResponseT.basic = getBscInqFlxOptItmPrcResponseT(testCaseNum, "inqFlxOptItmPrcResponseT");
	vinqFlxOptItmPrcResponseT.extension = getExtInqFlxOptItmPrcResponseT(testCaseNum, "inqFlxOptItmPrcResponseT");	return vinqFlxOptItmPrcResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFlxOptItmPrcRequestT(bscInqFlxOptItmPrcRequestT actual, bscInqFlxOptItmPrcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrPrc, expected.undrPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRequestT, undrPrc not matching. Actual %s but Expected %s", actual.undrPrc, expected.undrPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxOptCntrIdGrpT (actual.flxOptCntrIdGrp,expected.flxOptCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqFlxOptItmPrcRequestT(extInqFlxOptItmPrcRequestT actual, extInqFlxOptItmPrcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqFlxOptItmPrcRequestT(inqFlxOptItmPrcRequestT actual, inqFlxOptItmPrcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqFlxOptItmPrcRequestT (actual.basic,expected.basic, logMsg);
	compareExtInqFlxOptItmPrcRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFlxOptItmPrcRecT(bscInqFlxOptItmPrcRecT actual, bscInqFlxOptItmPrcRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxOptCntrIdGrpT (actual.flxOptCntrIdGrp,expected.flxOptCntrIdGrp, logMsg);
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if ( memcmp(actual.trnIdSfxNoPnt, expected.trnIdSfxNoPnt, DRIV_TRN_ID_SFX_NO_PNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRecT, trnIdSfxNoPnt not matching. Actual %s but Expected %s", actual.trnIdSfxNoPnt, expected.trnIdSfxNoPnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnAdjStsCod!= expected.trnAdjStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRecT, trnAdjStsCodnot matching. Actual %d but Expected %d", actual.trnAdjStsCod, expected.trnAdjStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdUntNo, expected.trdUntNo, TRD_UNT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRecT, trdUntNo not matching. Actual %s but Expected %s", actual.trdUntNo, expected.trdUntNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRecT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.itmAmnt, expected.itmAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRecT, itmAmnt not matching. Actual %s but Expected %s", actual.itmAmnt, expected.itmAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrTrnStsCod!= expected.flxCntrTrnStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRecT, flxCntrTrnStsCodnot matching. Actual %d but Expected %d", actual.flxCntrTrnStsCod, expected.flxCntrTrnStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFlxOptItmPrcResponseT(bscInqFlxOptItmPrcResponseT actual, bscInqFlxOptItmPrcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptItmPrcResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_FLX_OPT_ITM_PRC_REC_MAX;i++) {
		compareBscInqFlxOptItmPrcRecT (actual.bscInqFlxOptItmPrcRec[i],expected.bscInqFlxOptItmPrcRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqFlxOptItmPrcRecT(extInqFlxOptItmPrcRecT actual, extInqFlxOptItmPrcRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.flxCntrClsPrc, expected.flxCntrClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptItmPrcRecT, flxCntrClsPrc not matching. Actual %s but Expected %s", actual.flxCntrClsPrc, expected.flxCntrClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.clsStsCod!= expected.clsStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptItmPrcRecT, clsStsCodnot matching. Actual %d but Expected %d", actual.clsStsCod, expected.clsStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrGuStsCod!= expected.flxCntrGuStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptItmPrcRecT, flxCntrGuStsCodnot matching. Actual %d but Expected %d", actual.flxCntrGuStsCod, expected.flxCntrGuStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membPropCtpyIdCod, expected.membPropCtpyIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptItmPrcRecT, membPropCtpyIdCod not matching. Actual %s but Expected %s", actual.membPropCtpyIdCod, expected.membPropCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.abdnInd!= expected.abdnInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptItmPrcRecT, abdnIndnot matching. Actual %d but Expected %d", actual.abdnInd, expected.abdnInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptItmPrcRecT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrMtnCod!= expected.flxCntrMtnCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptItmPrcRecT, flxCntrMtnCodnot matching. Actual %d but Expected %d", actual.flxCntrMtnCod, expected.flxCntrMtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrActnMap, expected.flxCntrActnMap, FLX_CNTR_ACTN_MAP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptItmPrcRecT, flxCntrActnMap not matching. Actual %s but Expected %s", actual.flxCntrActnMap, expected.flxCntrActnMap);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqFlxOptItmPrcResponseT(extInqFlxOptItmPrcResponseT actual, extInqFlxOptItmPrcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_FLX_OPT_ITM_PRC_REC_MAX;i++) {
		compareExtInqFlxOptItmPrcRecT (actual.extInqFlxOptItmPrcRec[i],expected.extInqFlxOptItmPrcRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqFlxOptItmPrcResponseT(inqFlxOptItmPrcResponseT actual, inqFlxOptItmPrcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqFlxOptItmPrcResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqFlxOptItmPrcResponseT (actual.extension,expected.extension, logMsg);
}

