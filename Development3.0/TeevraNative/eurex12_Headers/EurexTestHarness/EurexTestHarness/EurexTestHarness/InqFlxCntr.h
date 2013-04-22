#include <InqFlxCntr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFlxFutRequestT getBscInqFlxFutRequestT(char* testCaseNum , const char *root) {
	bscInqFlxFutRequestT vbscInqFlxFutRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqFlxFutRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqFlxFutRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqFlxFutRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscInqFlxFutRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRequestT.buyCod", lbuyCod);
	vbscInqFlxFutRequestT.buyCod = lbuyCod[0];

	vbscInqFlxFutRequestT.flxFutCntrIdGrp = getFlxFutCntrIdGrpT(testCaseNum, "bscInqFlxFutRequestT");
	vbscInqFlxFutRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqFlxFutRequestT");
	char lflxCntrTrnStsCod[1] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRequestT.flxCntrTrnStsCod", lflxCntrTrnStsCod);
	vbscInqFlxFutRequestT.flxCntrTrnStsCod = lflxCntrTrnStsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqFlxFutRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRequestT.trnDat", ltrnDat);
	memcpy(vbscInqFlxFutRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqFlxFutRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqFlxFutRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqFlxFutRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqFlxFutRequestT getExtInqFlxFutRequestT(char* testCaseNum , const char *root) {
	extInqFlxFutRequestT vextInqFlxFutRequestT;
	int i;

	vextInqFlxFutRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqFlxFutRequestT");
	vextInqFlxFutRequestT.txtGrp = getTxtGrpT(testCaseNum, "extInqFlxFutRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextInqFlxFutRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextInqFlxFutRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vextInqFlxFutRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqFlxFutRequestT getInqFlxFutRequestT(char* testCaseNum , const char *root) {
	inqFlxFutRequestT vinqFlxFutRequestT;
	int i;

	vinqFlxFutRequestT.header = getDataHeaderT(testCaseNum, "inqFlxFutRequestT");
	vinqFlxFutRequestT.basic = getBscInqFlxFutRequestT(testCaseNum, "inqFlxFutRequestT");
	vinqFlxFutRequestT.extension = getExtInqFlxFutRequestT(testCaseNum, "inqFlxFutRequestT");	return vinqFlxFutRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFlxFutRecT getBscInqFlxFutRecT(char* testCaseNum , const char *root) {
	bscInqFlxFutRecT vbscInqFlxFutRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRecT.buyCod", lbuyCod);
	vbscInqFlxFutRecT.buyCod = lbuyCod[0];

	vbscInqFlxFutRecT.flxFutCntrIdGrp = getFlxFutCntrIdGrpT(testCaseNum, "bscInqFlxFutRecT");
	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqFlxFutRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqFlxFutRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqFlxFutRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqFlxFutRecT");
	vbscInqFlxFutRecT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscInqFlxFutRecT");
	for(i=0;i<DRIV_TRN_ID_SFX_NO_PNT_LEN;i++) {
		vbscInqFlxFutRecT.trnIdSfxNoPnt[i]= ' ';
	}
	char ltrnIdSfxNoPnt[DRIV_TRN_ID_SFX_NO_PNT_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRecT.trnIdSfxNoPnt", ltrnIdSfxNoPnt);
	memcpy(vbscInqFlxFutRecT.trnIdSfxNoPnt, ltrnIdSfxNoPnt, DRIV_TRN_ID_SFX_NO_PNT_LEN);

	char ltrnAdjStsCod[1] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRecT.trnAdjStsCod", ltrnAdjStsCod);
	vbscInqFlxFutRecT.trnAdjStsCod = ltrnAdjStsCod[0];

	for(i=0;i<TRD_UNT_NO_LEN;i++) {
		vbscInqFlxFutRecT.trdUntNo[i]= ' ';
	}
	char ltrdUntNo[TRD_UNT_NO_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRecT.trdUntNo", ltrdUntNo);
	memcpy(vbscInqFlxFutRecT.trdUntNo, ltrdUntNo, TRD_UNT_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqFlxFutRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscInqFlxFutRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqFlxFutRecT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRecT.trdXQty", ltrdXQty);
	memcpy(vbscInqFlxFutRecT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	char lflxCntrTrnStsCod[1] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRecT.flxCntrTrnStsCod", lflxCntrTrnStsCod);
	vbscInqFlxFutRecT.flxCntrTrnStsCod = lflxCntrTrnStsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqFlxFutRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRecT.trnDat", ltrnDat);
	memcpy(vbscInqFlxFutRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqFlxFutRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRecT.trnTim", ltrnTim);
	memcpy(vbscInqFlxFutRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	vbscInqFlxFutRecT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "bscInqFlxFutRecT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqFlxFutRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqFlxFutRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqFlxFutRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFlxFutResponseT getBscInqFlxFutResponseT(char* testCaseNum , const char *root) {
	bscInqFlxFutResponseT vbscInqFlxFutResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqFlxFutResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqFlxFutResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqFlxFutResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxFutResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqFlxFutResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqFlxFutResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqFlxFutRecT getExtInqFlxFutRecT(char* testCaseNum , const char *root) {
	extInqFlxFutRecT vextInqFlxFutRecT;
	int i;

	vextInqFlxFutRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqFlxFutRecT");
	vextInqFlxFutRecT.txtGrp = getTxtGrpT(testCaseNum, "extInqFlxFutRecT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextInqFlxFutRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextInqFlxFutRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char labdnInd[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.abdnInd", labdnInd);
	vextInqFlxFutRecT.abdnInd = labdnInd[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextInqFlxFutRecT.flxCntrClsPrc[i]= ' ';
	}
	char lflxCntrClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.flxCntrClsPrc", lflxCntrClsPrc);
	memcpy(vextInqFlxFutRecT.flxCntrClsPrc, lflxCntrClsPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextInqFlxFutRecT.flxCntrStlPrc[i]= ' ';
	}
	char lflxCntrStlPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.flxCntrStlPrc", lflxCntrStlPrc);
	memcpy(vextInqFlxFutRecT.flxCntrStlPrc, lflxCntrStlPrc, DRIV_PRICE_LEN);

	char lclsStsCod[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.clsStsCod", lclsStsCod);
	vextInqFlxFutRecT.clsStsCod = lclsStsCod[0];

	char lflxCntrGuStsCod[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.flxCntrGuStsCod", lflxCntrGuStsCod);
	vextInqFlxFutRecT.flxCntrGuStsCod = lflxCntrGuStsCod[0];

	char ltakUpApprInd[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.takUpApprInd", ltakUpApprInd);
	vextInqFlxFutRecT.takUpApprInd = ltakUpApprInd[0];

	char lgivUpAcptInd[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.givUpAcptInd", lgivUpAcptInd);
	vextInqFlxFutRecT.givUpAcptInd = lgivUpAcptInd[0];

	char ltakUpAcptInd[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.takUpAcptInd", ltakUpAcptInd);
	vextInqFlxFutRecT.takUpAcptInd = ltakUpAcptInd[0];

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vextInqFlxFutRecT.membPropCtpyIdCod[i]= ' ';
	}
	char lmembPropCtpyIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.membPropCtpyIdCod", lmembPropCtpyIdCod);
	memcpy(vextInqFlxFutRecT.membPropCtpyIdCod, lmembPropCtpyIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vextInqFlxFutRecT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vextInqFlxFutRecT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	char lflxCntrMtnCod[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.flxCntrMtnCod", lflxCntrMtnCod);
	vextInqFlxFutRecT.flxCntrMtnCod = lflxCntrMtnCod[0];

	for(i=0;i<FLX_CNTR_ACTN_MAP_LEN;i++) {
		vextInqFlxFutRecT.flxCntrActnMap[i]= ' ';
	}
	char lflxCntrActnMap[FLX_CNTR_ACTN_MAP_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxFutRecT.flxCntrActnMap", lflxCntrActnMap);
	memcpy(vextInqFlxFutRecT.flxCntrActnMap, lflxCntrActnMap, FLX_CNTR_ACTN_MAP_LEN);
	return vextInqFlxFutRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqFlxFutResponseT getExtInqFlxFutResponseT(char* testCaseNum , const char *root) {
	extInqFlxFutResponseT vextInqFlxFutResponseT;
	int i;
	return vextInqFlxFutResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqFlxFutResponseT getInqFlxFutResponseT(char* testCaseNum , const char *root) {
	inqFlxFutResponseT vinqFlxFutResponseT;
	int i;

	vinqFlxFutResponseT.header = getDataHeaderT(testCaseNum, "inqFlxFutResponseT");
	vinqFlxFutResponseT.basic = getBscInqFlxFutResponseT(testCaseNum, "inqFlxFutResponseT");
	vinqFlxFutResponseT.extension = getExtInqFlxFutResponseT(testCaseNum, "inqFlxFutResponseT");	return vinqFlxFutResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFlxOptRequestT getBscInqFlxOptRequestT(char* testCaseNum , const char *root) {
	bscInqFlxOptRequestT vbscInqFlxOptRequestT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqFlxOptRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqFlxOptRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqFlxOptRequestT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscInqFlxOptRequestT");
	char lbuyCod[1] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRequestT.buyCod", lbuyCod);
	vbscInqFlxOptRequestT.buyCod = lbuyCod[0];

	vbscInqFlxOptRequestT.flxOptCntrIdGrp = getFlxOptCntrIdGrpT(testCaseNum, "bscInqFlxOptRequestT");
	vbscInqFlxOptRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqFlxOptRequestT");
	char lflxCntrTrnStsCod[1] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRequestT.flxCntrTrnStsCod", lflxCntrTrnStsCod);
	vbscInqFlxOptRequestT.flxCntrTrnStsCod = lflxCntrTrnStsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqFlxOptRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRequestT.trnDat", ltrnDat);
	memcpy(vbscInqFlxOptRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqFlxOptRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqFlxOptRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqFlxOptRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqFlxOptRequestT getExtInqFlxOptRequestT(char* testCaseNum , const char *root) {
	extInqFlxOptRequestT vextInqFlxOptRequestT;
	int i;

	vextInqFlxOptRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqFlxOptRequestT");
	vextInqFlxOptRequestT.txtGrp = getTxtGrpT(testCaseNum, "extInqFlxOptRequestT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextInqFlxOptRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextInqFlxOptRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);
	return vextInqFlxOptRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqFlxOptRequestT getInqFlxOptRequestT(char* testCaseNum , const char *root) {
	inqFlxOptRequestT vinqFlxOptRequestT;
	int i;

	vinqFlxOptRequestT.header = getDataHeaderT(testCaseNum, "inqFlxOptRequestT");
	vinqFlxOptRequestT.basic = getBscInqFlxOptRequestT(testCaseNum, "inqFlxOptRequestT");
	vinqFlxOptRequestT.extension = getExtInqFlxOptRequestT(testCaseNum, "inqFlxOptRequestT");	return vinqFlxOptRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFlxOptRecT getBscInqFlxOptRecT(char* testCaseNum , const char *root) {
	bscInqFlxOptRecT vbscInqFlxOptRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRecT.buyCod", lbuyCod);
	vbscInqFlxOptRecT.buyCod = lbuyCod[0];

	vbscInqFlxOptRecT.flxOptCntrIdGrp = getFlxOptCntrIdGrpT(testCaseNum, "bscInqFlxOptRecT");
	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqFlxOptRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqFlxOptRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqFlxOptRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqFlxOptRecT");
	vbscInqFlxOptRecT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscInqFlxOptRecT");
	for(i=0;i<DRIV_TRN_ID_SFX_NO_PNT_LEN;i++) {
		vbscInqFlxOptRecT.trnIdSfxNoPnt[i]= ' ';
	}
	char ltrnIdSfxNoPnt[DRIV_TRN_ID_SFX_NO_PNT_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRecT.trnIdSfxNoPnt", ltrnIdSfxNoPnt);
	memcpy(vbscInqFlxOptRecT.trnIdSfxNoPnt, ltrnIdSfxNoPnt, DRIV_TRN_ID_SFX_NO_PNT_LEN);

	char ltrnAdjStsCod[1] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRecT.trnAdjStsCod", ltrnAdjStsCod);
	vbscInqFlxOptRecT.trnAdjStsCod = ltrnAdjStsCod[0];

	for(i=0;i<TRD_UNT_NO_LEN;i++) {
		vbscInqFlxOptRecT.trdUntNo[i]= ' ';
	}
	char ltrdUntNo[TRD_UNT_NO_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRecT.trdUntNo", ltrdUntNo);
	memcpy(vbscInqFlxOptRecT.trdUntNo, ltrdUntNo, TRD_UNT_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqFlxOptRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscInqFlxOptRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqFlxOptRecT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRecT.trdXQty", ltrdXQty);
	memcpy(vbscInqFlxOptRecT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	char lflxCntrTrnStsCod[1] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRecT.flxCntrTrnStsCod", lflxCntrTrnStsCod);
	vbscInqFlxOptRecT.flxCntrTrnStsCod = lflxCntrTrnStsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqFlxOptRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRecT.trnDat", ltrnDat);
	memcpy(vbscInqFlxOptRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqFlxOptRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRecT.trnTim", ltrnTim);
	memcpy(vbscInqFlxOptRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	vbscInqFlxOptRecT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "bscInqFlxOptRecT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqFlxOptRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqFlxOptRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqFlxOptRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqFlxOptResponseT getBscInqFlxOptResponseT(char* testCaseNum , const char *root) {
	bscInqFlxOptResponseT vbscInqFlxOptResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqFlxOptResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqFlxOptResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqFlxOptResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqFlxCntr.bscInqFlxOptResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqFlxOptResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqFlxOptResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqFlxOptRecT getExtInqFlxOptRecT(char* testCaseNum , const char *root) {
	extInqFlxOptRecT vextInqFlxOptRecT;
	int i;

	vextInqFlxOptRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqFlxOptRecT");
	vextInqFlxOptRecT.txtGrp = getTxtGrpT(testCaseNum, "extInqFlxOptRecT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextInqFlxOptRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextInqFlxOptRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char labdnInd[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.abdnInd", labdnInd);
	vextInqFlxOptRecT.abdnInd = labdnInd[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextInqFlxOptRecT.flxCntrClsPrc[i]= ' ';
	}
	char lflxCntrClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.flxCntrClsPrc", lflxCntrClsPrc);
	memcpy(vextInqFlxOptRecT.flxCntrClsPrc, lflxCntrClsPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextInqFlxOptRecT.flxCntrStlPrc[i]= ' ';
	}
	char lflxCntrStlPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.flxCntrStlPrc", lflxCntrStlPrc);
	memcpy(vextInqFlxOptRecT.flxCntrStlPrc, lflxCntrStlPrc, DRIV_PRICE_LEN);

	char lclsStsCod[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.clsStsCod", lclsStsCod);
	vextInqFlxOptRecT.clsStsCod = lclsStsCod[0];

	char lflxCntrGuStsCod[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.flxCntrGuStsCod", lflxCntrGuStsCod);
	vextInqFlxOptRecT.flxCntrGuStsCod = lflxCntrGuStsCod[0];

	char ltakUpApprInd[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.takUpApprInd", ltakUpApprInd);
	vextInqFlxOptRecT.takUpApprInd = ltakUpApprInd[0];

	char lgivUpAcptInd[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.givUpAcptInd", lgivUpAcptInd);
	vextInqFlxOptRecT.givUpAcptInd = lgivUpAcptInd[0];

	char ltakUpAcptInd[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.takUpAcptInd", ltakUpAcptInd);
	vextInqFlxOptRecT.takUpAcptInd = ltakUpAcptInd[0];

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vextInqFlxOptRecT.membPropCtpyIdCod[i]= ' ';
	}
	char lmembPropCtpyIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.membPropCtpyIdCod", lmembPropCtpyIdCod);
	memcpy(vextInqFlxOptRecT.membPropCtpyIdCod, lmembPropCtpyIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vextInqFlxOptRecT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vextInqFlxOptRecT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	char lflxCntrMtnCod[1] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.flxCntrMtnCod", lflxCntrMtnCod);
	vextInqFlxOptRecT.flxCntrMtnCod = lflxCntrMtnCod[0];

	for(i=0;i<FLX_CNTR_ACTN_MAP_LEN;i++) {
		vextInqFlxOptRecT.flxCntrActnMap[i]= ' ';
	}
	char lflxCntrActnMap[FLX_CNTR_ACTN_MAP_LEN] = {""};
	getStrProperty("InqFlxCntr.extInqFlxOptRecT.flxCntrActnMap", lflxCntrActnMap);
	memcpy(vextInqFlxOptRecT.flxCntrActnMap, lflxCntrActnMap, FLX_CNTR_ACTN_MAP_LEN);
	return vextInqFlxOptRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqFlxOptResponseT getExtInqFlxOptResponseT(char* testCaseNum , const char *root) {
	extInqFlxOptResponseT vextInqFlxOptResponseT;
	int i;
	return vextInqFlxOptResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqFlxOptResponseT getInqFlxOptResponseT(char* testCaseNum , const char *root) {
	inqFlxOptResponseT vinqFlxOptResponseT;
	int i;

	vinqFlxOptResponseT.header = getDataHeaderT(testCaseNum, "inqFlxOptResponseT");
	vinqFlxOptResponseT.basic = getBscInqFlxOptResponseT(testCaseNum, "inqFlxOptResponseT");
	vinqFlxOptResponseT.extension = getExtInqFlxOptResponseT(testCaseNum, "inqFlxOptResponseT");	return vinqFlxOptResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFlxFutRequestT(bscInqFlxFutRequestT actual, bscInqFlxFutRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxFutCntrIdGrpT (actual.flxFutCntrIdGrp,expected.flxFutCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.flxCntrTrnStsCod!= expected.flxCntrTrnStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRequestT, flxCntrTrnStsCodnot matching. Actual %d but Expected %d", actual.flxCntrTrnStsCod, expected.flxCntrTrnStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqFlxFutRequestT(extInqFlxFutRequestT actual, extInqFlxFutRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqFlxFutRequestT(inqFlxFutRequestT actual, inqFlxFutRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqFlxFutRequestT (actual.basic,expected.basic, logMsg);
	compareExtInqFlxFutRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFlxFutRecT(bscInqFlxFutRecT actual, bscInqFlxFutRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxFutCntrIdGrpT (actual.flxFutCntrIdGrp,expected.flxFutCntrIdGrp, logMsg);
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if ( memcmp(actual.trnIdSfxNoPnt, expected.trnIdSfxNoPnt, DRIV_TRN_ID_SFX_NO_PNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRecT, trnIdSfxNoPnt not matching. Actual %s but Expected %s", actual.trnIdSfxNoPnt, expected.trnIdSfxNoPnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnAdjStsCod!= expected.trnAdjStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRecT, trnAdjStsCodnot matching. Actual %d but Expected %d", actual.trnAdjStsCod, expected.trnAdjStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdUntNo, expected.trdUntNo, TRD_UNT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRecT, trdUntNo not matching. Actual %s but Expected %s", actual.trdUntNo, expected.trdUntNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRecT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrTrnStsCod!= expected.flxCntrTrnStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRecT, flxCntrTrnStsCodnot matching. Actual %d but Expected %d", actual.flxCntrTrnStsCod, expected.flxCntrTrnStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFlxFutResponseT(bscInqFlxFutResponseT actual, bscInqFlxFutResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxFutResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_FLX_FUT_REC_MAX;i++) {
		compareBscInqFlxFutRecT (actual.bscInqFlxFutRec[i],expected.bscInqFlxFutRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqFlxFutRecT(extInqFlxFutRecT actual, extInqFlxFutRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.abdnInd!= expected.abdnInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, abdnIndnot matching. Actual %d but Expected %d", actual.abdnInd, expected.abdnInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrClsPrc, expected.flxCntrClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, flxCntrClsPrc not matching. Actual %s but Expected %s", actual.flxCntrClsPrc, expected.flxCntrClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrStlPrc, expected.flxCntrStlPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, flxCntrStlPrc not matching. Actual %s but Expected %s", actual.flxCntrStlPrc, expected.flxCntrStlPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.clsStsCod!= expected.clsStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, clsStsCodnot matching. Actual %d but Expected %d", actual.clsStsCod, expected.clsStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrGuStsCod!= expected.flxCntrGuStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, flxCntrGuStsCodnot matching. Actual %d but Expected %d", actual.flxCntrGuStsCod, expected.flxCntrGuStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.takUpApprInd!= expected.takUpApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, takUpApprIndnot matching. Actual %d but Expected %d", actual.takUpApprInd, expected.takUpApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.givUpAcptInd!= expected.givUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, givUpAcptIndnot matching. Actual %d but Expected %d", actual.givUpAcptInd, expected.givUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.takUpAcptInd!= expected.takUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, takUpAcptIndnot matching. Actual %d but Expected %d", actual.takUpAcptInd, expected.takUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membPropCtpyIdCod, expected.membPropCtpyIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, membPropCtpyIdCod not matching. Actual %s but Expected %s", actual.membPropCtpyIdCod, expected.membPropCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrMtnCod!= expected.flxCntrMtnCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, flxCntrMtnCodnot matching. Actual %d but Expected %d", actual.flxCntrMtnCod, expected.flxCntrMtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrActnMap, expected.flxCntrActnMap, FLX_CNTR_ACTN_MAP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxFutRecT, flxCntrActnMap not matching. Actual %s but Expected %s", actual.flxCntrActnMap, expected.flxCntrActnMap);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqFlxFutResponseT(extInqFlxFutResponseT actual, extInqFlxFutResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_FLX_FUT_REC_MAX;i++) {
		compareExtInqFlxFutRecT (actual.extInqFlxFutRec[i],expected.extInqFlxFutRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqFlxFutResponseT(inqFlxFutResponseT actual, inqFlxFutResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqFlxFutResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqFlxFutResponseT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFlxOptRequestT(bscInqFlxOptRequestT actual, bscInqFlxOptRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxOptCntrIdGrpT (actual.flxOptCntrIdGrp,expected.flxOptCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.flxCntrTrnStsCod!= expected.flxCntrTrnStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRequestT, flxCntrTrnStsCodnot matching. Actual %d but Expected %d", actual.flxCntrTrnStsCod, expected.flxCntrTrnStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqFlxOptRequestT(extInqFlxOptRequestT actual, extInqFlxOptRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqFlxOptRequestT(inqFlxOptRequestT actual, inqFlxOptRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqFlxOptRequestT (actual.basic,expected.basic, logMsg);
	compareExtInqFlxOptRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFlxOptRecT(bscInqFlxOptRecT actual, bscInqFlxOptRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxOptCntrIdGrpT (actual.flxOptCntrIdGrp,expected.flxOptCntrIdGrp, logMsg);
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if ( memcmp(actual.trnIdSfxNoPnt, expected.trnIdSfxNoPnt, DRIV_TRN_ID_SFX_NO_PNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRecT, trnIdSfxNoPnt not matching. Actual %s but Expected %s", actual.trnIdSfxNoPnt, expected.trnIdSfxNoPnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnAdjStsCod!= expected.trnAdjStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRecT, trnAdjStsCodnot matching. Actual %d but Expected %d", actual.trnAdjStsCod, expected.trnAdjStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdUntNo, expected.trdUntNo, TRD_UNT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRecT, trdUntNo not matching. Actual %s but Expected %s", actual.trdUntNo, expected.trdUntNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRecT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrTrnStsCod!= expected.flxCntrTrnStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRecT, flxCntrTrnStsCodnot matching. Actual %d but Expected %d", actual.flxCntrTrnStsCod, expected.flxCntrTrnStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqFlxOptResponseT(bscInqFlxOptResponseT actual, bscInqFlxOptResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqFlxOptResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_FLX_OPT_REC_MAX;i++) {
		compareBscInqFlxOptRecT (actual.bscInqFlxOptRec[i],expected.bscInqFlxOptRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqFlxOptRecT(extInqFlxOptRecT actual, extInqFlxOptRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.abdnInd!= expected.abdnInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, abdnIndnot matching. Actual %d but Expected %d", actual.abdnInd, expected.abdnInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrClsPrc, expected.flxCntrClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, flxCntrClsPrc not matching. Actual %s but Expected %s", actual.flxCntrClsPrc, expected.flxCntrClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrStlPrc, expected.flxCntrStlPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, flxCntrStlPrc not matching. Actual %s but Expected %s", actual.flxCntrStlPrc, expected.flxCntrStlPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.clsStsCod!= expected.clsStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, clsStsCodnot matching. Actual %d but Expected %d", actual.clsStsCod, expected.clsStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrGuStsCod!= expected.flxCntrGuStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, flxCntrGuStsCodnot matching. Actual %d but Expected %d", actual.flxCntrGuStsCod, expected.flxCntrGuStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.takUpApprInd!= expected.takUpApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, takUpApprIndnot matching. Actual %d but Expected %d", actual.takUpApprInd, expected.takUpApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.givUpAcptInd!= expected.givUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, givUpAcptIndnot matching. Actual %d but Expected %d", actual.givUpAcptInd, expected.givUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.takUpAcptInd!= expected.takUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, takUpAcptIndnot matching. Actual %d but Expected %d", actual.takUpAcptInd, expected.takUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membPropCtpyIdCod, expected.membPropCtpyIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, membPropCtpyIdCod not matching. Actual %s but Expected %s", actual.membPropCtpyIdCod, expected.membPropCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrMtnCod!= expected.flxCntrMtnCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, flxCntrMtnCodnot matching. Actual %d but Expected %d", actual.flxCntrMtnCod, expected.flxCntrMtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrActnMap, expected.flxCntrActnMap, FLX_CNTR_ACTN_MAP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqFlxOptRecT, flxCntrActnMap not matching. Actual %s but Expected %s", actual.flxCntrActnMap, expected.flxCntrActnMap);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqFlxOptResponseT(extInqFlxOptResponseT actual, extInqFlxOptResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_FLX_OPT_REC_MAX;i++) {
		compareExtInqFlxOptRecT (actual.extInqFlxOptRec[i],expected.extInqFlxOptRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqFlxOptResponseT(inqFlxOptResponseT actual, inqFlxOptResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqFlxOptResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqFlxOptResponseT (actual.extension,expected.extension, logMsg);
}

