#include <SubFlxCntrConf.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubFlxFutConfPrivBcastT getBscSubFlxFutConfPrivBcastT(char* testCaseNum , const char *root) {
	bscSubFlxFutConfPrivBcastT vbscSubFlxFutConfPrivBcastT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfPrivBcastT.buyCod", lbuyCod);
	vbscSubFlxFutConfPrivBcastT.buyCod = lbuyCod[0];

	vbscSubFlxFutConfPrivBcastT.flxFutCntrIdGrp = getFlxFutCntrIdGrpT(testCaseNum, "bscSubFlxFutConfPrivBcastT");
	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscSubFlxFutConfPrivBcastT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfPrivBcastT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscSubFlxFutConfPrivBcastT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscSubFlxFutConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscSubFlxFutConfPrivBcastT");
	vbscSubFlxFutConfPrivBcastT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscSubFlxFutConfPrivBcastT");
	for(i=0;i<DRIV_TRN_ID_SFX_NO_PNT_LEN;i++) {
		vbscSubFlxFutConfPrivBcastT.trnIdSfxNoPnt[i]= ' ';
	}
	char ltrnIdSfxNoPnt[DRIV_TRN_ID_SFX_NO_PNT_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfPrivBcastT.trnIdSfxNoPnt", ltrnIdSfxNoPnt);
	memcpy(vbscSubFlxFutConfPrivBcastT.trnIdSfxNoPnt, ltrnIdSfxNoPnt, DRIV_TRN_ID_SFX_NO_PNT_LEN);

	char ltrnAdjStsCod[1] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfPrivBcastT.trnAdjStsCod", ltrnAdjStsCod);
	vbscSubFlxFutConfPrivBcastT.trnAdjStsCod = ltrnAdjStsCod[0];

	for(i=0;i<TRD_UNT_NO_LEN;i++) {
		vbscSubFlxFutConfPrivBcastT.trdUntNo[i]= ' ';
	}
	char ltrdUntNo[TRD_UNT_NO_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfPrivBcastT.trdUntNo", ltrdUntNo);
	memcpy(vbscSubFlxFutConfPrivBcastT.trdUntNo, ltrdUntNo, TRD_UNT_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscSubFlxFutConfPrivBcastT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfPrivBcastT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscSubFlxFutConfPrivBcastT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscSubFlxFutConfPrivBcastT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfPrivBcastT.trdXQty", ltrdXQty);
	memcpy(vbscSubFlxFutConfPrivBcastT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	char lflxCntrTrnStsCod[1] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfPrivBcastT.flxCntrTrnStsCod", lflxCntrTrnStsCod);
	vbscSubFlxFutConfPrivBcastT.flxCntrTrnStsCod = lflxCntrTrnStsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubFlxFutConfPrivBcastT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfPrivBcastT.trnDat", ltrnDat);
	memcpy(vbscSubFlxFutConfPrivBcastT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubFlxFutConfPrivBcastT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfPrivBcastT.trnTim", ltrnTim);
	memcpy(vbscSubFlxFutConfPrivBcastT.trnTim, ltrnTim, DRIV_TIME_LEN);

	vbscSubFlxFutConfPrivBcastT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "bscSubFlxFutConfPrivBcastT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscSubFlxFutConfPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscSubFlxFutConfPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscSubFlxFutConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extSubFlxFutConfPrivBcastT getExtSubFlxFutConfPrivBcastT(char* testCaseNum , const char *root) {
	extSubFlxFutConfPrivBcastT vextSubFlxFutConfPrivBcastT;
	int i;

	vextSubFlxFutConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extSubFlxFutConfPrivBcastT");
	vextSubFlxFutConfPrivBcastT.txtGrp = getTxtGrpT(testCaseNum, "extSubFlxFutConfPrivBcastT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextSubFlxFutConfPrivBcastT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxFutConfPrivBcastT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextSubFlxFutConfPrivBcastT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char labdnInd[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxFutConfPrivBcastT.abdnInd", labdnInd);
	vextSubFlxFutConfPrivBcastT.abdnInd = labdnInd[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextSubFlxFutConfPrivBcastT.flxCntrClsPrc[i]= ' ';
	}
	char lflxCntrClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxFutConfPrivBcastT.flxCntrClsPrc", lflxCntrClsPrc);
	memcpy(vextSubFlxFutConfPrivBcastT.flxCntrClsPrc, lflxCntrClsPrc, DRIV_PRICE_LEN);

	char lclsStsCod[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxFutConfPrivBcastT.clsStsCod", lclsStsCod);
	vextSubFlxFutConfPrivBcastT.clsStsCod = lclsStsCod[0];

	char lflxCntrGuStsCod[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxFutConfPrivBcastT.flxCntrGuStsCod", lflxCntrGuStsCod);
	vextSubFlxFutConfPrivBcastT.flxCntrGuStsCod = lflxCntrGuStsCod[0];

	char ltakUpApprInd[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxFutConfPrivBcastT.takUpApprInd", ltakUpApprInd);
	vextSubFlxFutConfPrivBcastT.takUpApprInd = ltakUpApprInd[0];

	char lgivUpAcptInd[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxFutConfPrivBcastT.givUpAcptInd", lgivUpAcptInd);
	vextSubFlxFutConfPrivBcastT.givUpAcptInd = lgivUpAcptInd[0];

	char ltakUpAcptInd[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxFutConfPrivBcastT.takUpAcptInd", ltakUpAcptInd);
	vextSubFlxFutConfPrivBcastT.takUpAcptInd = ltakUpAcptInd[0];

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vextSubFlxFutConfPrivBcastT.membPropCtpyIdCod[i]= ' ';
	}
	char lmembPropCtpyIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxFutConfPrivBcastT.membPropCtpyIdCod", lmembPropCtpyIdCod);
	memcpy(vextSubFlxFutConfPrivBcastT.membPropCtpyIdCod, lmembPropCtpyIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vextSubFlxFutConfPrivBcastT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxFutConfPrivBcastT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vextSubFlxFutConfPrivBcastT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	char lflxCntrMtnCod[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxFutConfPrivBcastT.flxCntrMtnCod", lflxCntrMtnCod);
	vextSubFlxFutConfPrivBcastT.flxCntrMtnCod = lflxCntrMtnCod[0];

	for(i=0;i<FLX_CNTR_ACTN_MAP_LEN;i++) {
		vextSubFlxFutConfPrivBcastT.flxCntrActnMap[i]= ' ';
	}
	char lflxCntrActnMap[FLX_CNTR_ACTN_MAP_LEN] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxFutConfPrivBcastT.flxCntrActnMap", lflxCntrActnMap);
	memcpy(vextSubFlxFutConfPrivBcastT.flxCntrActnMap, lflxCntrActnMap, FLX_CNTR_ACTN_MAP_LEN);
	return vextSubFlxFutConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subFlxFutConfPrivBcastT getSubFlxFutConfPrivBcastT(char* testCaseNum , const char *root) {
	subFlxFutConfPrivBcastT vsubFlxFutConfPrivBcastT;
	int i;

	vsubFlxFutConfPrivBcastT.seqNo = getFutBscSeqNoT(testCaseNum, "subFlxFutConfPrivBcastT");
	vsubFlxFutConfPrivBcastT.header = getDataHeaderT(testCaseNum, "subFlxFutConfPrivBcastT");
	vsubFlxFutConfPrivBcastT.basic = getBscSubFlxFutConfPrivBcastT(testCaseNum, "subFlxFutConfPrivBcastT");
	vsubFlxFutConfPrivBcastT.extension = getExtSubFlxFutConfPrivBcastT(testCaseNum, "subFlxFutConfPrivBcastT");	return vsubFlxFutConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubFlxFutConfSubjectT getBscSubFlxFutConfSubjectT(char* testCaseNum , const char *root) {
	bscSubFlxFutConfSubjectT vbscSubFlxFutConfSubjectT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscSubFlxFutConfSubjectT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfSubjectT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscSubFlxFutConfSubjectT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscSubFlxFutConfSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxFutConfSubjectT.prodId", lprodId);
	memcpy(vbscSubFlxFutConfSubjectT.prodId, lprodId, PROD_ID_LEN);
	return vbscSubFlxFutConfSubjectT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubFlxOptConfPrivBcastT getBscSubFlxOptConfPrivBcastT(char* testCaseNum , const char *root) {
	bscSubFlxOptConfPrivBcastT vbscSubFlxOptConfPrivBcastT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfPrivBcastT.buyCod", lbuyCod);
	vbscSubFlxOptConfPrivBcastT.buyCod = lbuyCod[0];

	vbscSubFlxOptConfPrivBcastT.flxOptCntrIdGrp = getFlxOptCntrIdGrpT(testCaseNum, "bscSubFlxOptConfPrivBcastT");
	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscSubFlxOptConfPrivBcastT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfPrivBcastT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscSubFlxOptConfPrivBcastT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscSubFlxOptConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscSubFlxOptConfPrivBcastT");
	vbscSubFlxOptConfPrivBcastT.flxCntrTrnIdGrp = getFlxCntrTrnIdGrpT(testCaseNum, "bscSubFlxOptConfPrivBcastT");
	for(i=0;i<DRIV_TRN_ID_SFX_NO_PNT_LEN;i++) {
		vbscSubFlxOptConfPrivBcastT.trnIdSfxNoPnt[i]= ' ';
	}
	char ltrnIdSfxNoPnt[DRIV_TRN_ID_SFX_NO_PNT_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfPrivBcastT.trnIdSfxNoPnt", ltrnIdSfxNoPnt);
	memcpy(vbscSubFlxOptConfPrivBcastT.trnIdSfxNoPnt, ltrnIdSfxNoPnt, DRIV_TRN_ID_SFX_NO_PNT_LEN);

	char ltrnAdjStsCod[1] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfPrivBcastT.trnAdjStsCod", ltrnAdjStsCod);
	vbscSubFlxOptConfPrivBcastT.trnAdjStsCod = ltrnAdjStsCod[0];

	for(i=0;i<TRD_UNT_NO_LEN;i++) {
		vbscSubFlxOptConfPrivBcastT.trdUntNo[i]= ' ';
	}
	char ltrdUntNo[TRD_UNT_NO_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfPrivBcastT.trdUntNo", ltrdUntNo);
	memcpy(vbscSubFlxOptConfPrivBcastT.trdUntNo, ltrdUntNo, TRD_UNT_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscSubFlxOptConfPrivBcastT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfPrivBcastT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscSubFlxOptConfPrivBcastT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscSubFlxOptConfPrivBcastT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfPrivBcastT.trdXQty", ltrdXQty);
	memcpy(vbscSubFlxOptConfPrivBcastT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	char lflxCntrTrnStsCod[1] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfPrivBcastT.flxCntrTrnStsCod", lflxCntrTrnStsCod);
	vbscSubFlxOptConfPrivBcastT.flxCntrTrnStsCod = lflxCntrTrnStsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubFlxOptConfPrivBcastT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfPrivBcastT.trnDat", ltrnDat);
	memcpy(vbscSubFlxOptConfPrivBcastT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubFlxOptConfPrivBcastT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfPrivBcastT.trnTim", ltrnTim);
	memcpy(vbscSubFlxOptConfPrivBcastT.trnTim, ltrnTim, DRIV_TIME_LEN);

	vbscSubFlxOptConfPrivBcastT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "bscSubFlxOptConfPrivBcastT");
	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscSubFlxOptConfPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscSubFlxOptConfPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscSubFlxOptConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extSubFlxOptConfPrivBcastT getExtSubFlxOptConfPrivBcastT(char* testCaseNum , const char *root) {
	extSubFlxOptConfPrivBcastT vextSubFlxOptConfPrivBcastT;
	int i;

	vextSubFlxOptConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extSubFlxOptConfPrivBcastT");
	vextSubFlxOptConfPrivBcastT.txtGrp = getTxtGrpT(testCaseNum, "extSubFlxOptConfPrivBcastT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextSubFlxOptConfPrivBcastT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxOptConfPrivBcastT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextSubFlxOptConfPrivBcastT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	char labdnInd[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxOptConfPrivBcastT.abdnInd", labdnInd);
	vextSubFlxOptConfPrivBcastT.abdnInd = labdnInd[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextSubFlxOptConfPrivBcastT.flxCntrClsPrc[i]= ' ';
	}
	char lflxCntrClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxOptConfPrivBcastT.flxCntrClsPrc", lflxCntrClsPrc);
	memcpy(vextSubFlxOptConfPrivBcastT.flxCntrClsPrc, lflxCntrClsPrc, DRIV_PRICE_LEN);

	char lclsStsCod[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxOptConfPrivBcastT.clsStsCod", lclsStsCod);
	vextSubFlxOptConfPrivBcastT.clsStsCod = lclsStsCod[0];

	char lflxCntrGuStsCod[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxOptConfPrivBcastT.flxCntrGuStsCod", lflxCntrGuStsCod);
	vextSubFlxOptConfPrivBcastT.flxCntrGuStsCod = lflxCntrGuStsCod[0];

	char ltakUpApprInd[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxOptConfPrivBcastT.takUpApprInd", ltakUpApprInd);
	vextSubFlxOptConfPrivBcastT.takUpApprInd = ltakUpApprInd[0];

	char lgivUpAcptInd[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxOptConfPrivBcastT.givUpAcptInd", lgivUpAcptInd);
	vextSubFlxOptConfPrivBcastT.givUpAcptInd = lgivUpAcptInd[0];

	char ltakUpAcptInd[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxOptConfPrivBcastT.takUpAcptInd", ltakUpAcptInd);
	vextSubFlxOptConfPrivBcastT.takUpAcptInd = ltakUpAcptInd[0];

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vextSubFlxOptConfPrivBcastT.membPropCtpyIdCod[i]= ' ';
	}
	char lmembPropCtpyIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxOptConfPrivBcastT.membPropCtpyIdCod", lmembPropCtpyIdCod);
	memcpy(vextSubFlxOptConfPrivBcastT.membPropCtpyIdCod, lmembPropCtpyIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vextSubFlxOptConfPrivBcastT.flxCntrSynProdId[i]= ' ';
	}
	char lflxCntrSynProdId[PROD_ID_LEN] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxOptConfPrivBcastT.flxCntrSynProdId", lflxCntrSynProdId);
	memcpy(vextSubFlxOptConfPrivBcastT.flxCntrSynProdId, lflxCntrSynProdId, PROD_ID_LEN);

	char lflxCntrMtnCod[1] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxOptConfPrivBcastT.flxCntrMtnCod", lflxCntrMtnCod);
	vextSubFlxOptConfPrivBcastT.flxCntrMtnCod = lflxCntrMtnCod[0];

	for(i=0;i<FLX_CNTR_ACTN_MAP_LEN;i++) {
		vextSubFlxOptConfPrivBcastT.flxCntrActnMap[i]= ' ';
	}
	char lflxCntrActnMap[FLX_CNTR_ACTN_MAP_LEN] = {""};
	getStrProperty("SubFlxCntrConf.extSubFlxOptConfPrivBcastT.flxCntrActnMap", lflxCntrActnMap);
	memcpy(vextSubFlxOptConfPrivBcastT.flxCntrActnMap, lflxCntrActnMap, FLX_CNTR_ACTN_MAP_LEN);
	return vextSubFlxOptConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subFlxOptConfPrivBcastT getSubFlxOptConfPrivBcastT(char* testCaseNum , const char *root) {
	subFlxOptConfPrivBcastT vsubFlxOptConfPrivBcastT;
	int i;

	vsubFlxOptConfPrivBcastT.seqNo = getOptBscSeqNoT(testCaseNum, "subFlxOptConfPrivBcastT");
	vsubFlxOptConfPrivBcastT.header = getDataHeaderT(testCaseNum, "subFlxOptConfPrivBcastT");
	vsubFlxOptConfPrivBcastT.basic = getBscSubFlxOptConfPrivBcastT(testCaseNum, "subFlxOptConfPrivBcastT");
	vsubFlxOptConfPrivBcastT.extension = getExtSubFlxOptConfPrivBcastT(testCaseNum, "subFlxOptConfPrivBcastT");	return vsubFlxOptConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubFlxOptConfSubjectT getBscSubFlxOptConfSubjectT(char* testCaseNum , const char *root) {
	bscSubFlxOptConfSubjectT vbscSubFlxOptConfSubjectT;
	int i;

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscSubFlxOptConfSubjectT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfSubjectT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscSubFlxOptConfSubjectT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscSubFlxOptConfSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubFlxCntrConf.bscSubFlxOptConfSubjectT.prodId", lprodId);
	memcpy(vbscSubFlxOptConfSubjectT.prodId, lprodId, PROD_ID_LEN);
	return vbscSubFlxOptConfSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubFlxFutConfPrivBcastT(bscSubFlxFutConfPrivBcastT actual, bscSubFlxFutConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxFutCntrIdGrpT (actual.flxFutCntrIdGrp,expected.flxFutCntrIdGrp, logMsg);
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfPrivBcastT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if ( memcmp(actual.trnIdSfxNoPnt, expected.trnIdSfxNoPnt, DRIV_TRN_ID_SFX_NO_PNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfPrivBcastT, trnIdSfxNoPnt not matching. Actual %s but Expected %s", actual.trnIdSfxNoPnt, expected.trnIdSfxNoPnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnAdjStsCod!= expected.trnAdjStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfPrivBcastT, trnAdjStsCodnot matching. Actual %d but Expected %d", actual.trnAdjStsCod, expected.trnAdjStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdUntNo, expected.trdUntNo, TRD_UNT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfPrivBcastT, trdUntNo not matching. Actual %s but Expected %s", actual.trdUntNo, expected.trdUntNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfPrivBcastT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfPrivBcastT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrTrnStsCod!= expected.flxCntrTrnStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfPrivBcastT, flxCntrTrnStsCodnot matching. Actual %d but Expected %d", actual.flxCntrTrnStsCod, expected.flxCntrTrnStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfPrivBcastT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfPrivBcastT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtSubFlxFutConfPrivBcastT(extSubFlxFutConfPrivBcastT actual, extSubFlxFutConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxFutConfPrivBcastT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.abdnInd!= expected.abdnInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxFutConfPrivBcastT, abdnIndnot matching. Actual %d but Expected %d", actual.abdnInd, expected.abdnInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrClsPrc, expected.flxCntrClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxFutConfPrivBcastT, flxCntrClsPrc not matching. Actual %s but Expected %s", actual.flxCntrClsPrc, expected.flxCntrClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.clsStsCod!= expected.clsStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxFutConfPrivBcastT, clsStsCodnot matching. Actual %d but Expected %d", actual.clsStsCod, expected.clsStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrGuStsCod!= expected.flxCntrGuStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxFutConfPrivBcastT, flxCntrGuStsCodnot matching. Actual %d but Expected %d", actual.flxCntrGuStsCod, expected.flxCntrGuStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.takUpApprInd!= expected.takUpApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxFutConfPrivBcastT, takUpApprIndnot matching. Actual %d but Expected %d", actual.takUpApprInd, expected.takUpApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.givUpAcptInd!= expected.givUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxFutConfPrivBcastT, givUpAcptIndnot matching. Actual %d but Expected %d", actual.givUpAcptInd, expected.givUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.takUpAcptInd!= expected.takUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxFutConfPrivBcastT, takUpAcptIndnot matching. Actual %d but Expected %d", actual.takUpAcptInd, expected.takUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membPropCtpyIdCod, expected.membPropCtpyIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxFutConfPrivBcastT, membPropCtpyIdCod not matching. Actual %s but Expected %s", actual.membPropCtpyIdCod, expected.membPropCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxFutConfPrivBcastT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrMtnCod!= expected.flxCntrMtnCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxFutConfPrivBcastT, flxCntrMtnCodnot matching. Actual %d but Expected %d", actual.flxCntrMtnCod, expected.flxCntrMtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrActnMap, expected.flxCntrActnMap, FLX_CNTR_ACTN_MAP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxFutConfPrivBcastT, flxCntrActnMap not matching. Actual %s but Expected %s", actual.flxCntrActnMap, expected.flxCntrActnMap);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubFlxFutConfPrivBcastT(subFlxFutConfPrivBcastT actual, subFlxFutConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubFlxFutConfPrivBcastT (actual.basic,expected.basic, logMsg);
	compareExtSubFlxFutConfPrivBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubFlxFutConfSubjectT(bscSubFlxFutConfSubjectT actual, bscSubFlxFutConfSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfSubjectT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxFutConfSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubFlxOptConfPrivBcastT(bscSubFlxOptConfPrivBcastT actual, bscSubFlxOptConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFlxOptCntrIdGrpT (actual.flxOptCntrIdGrp,expected.flxOptCntrIdGrp, logMsg);
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfPrivBcastT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	compareFlxCntrTrnIdGrpT (actual.flxCntrTrnIdGrp,expected.flxCntrTrnIdGrp, logMsg);
	if ( memcmp(actual.trnIdSfxNoPnt, expected.trnIdSfxNoPnt, DRIV_TRN_ID_SFX_NO_PNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfPrivBcastT, trnIdSfxNoPnt not matching. Actual %s but Expected %s", actual.trnIdSfxNoPnt, expected.trnIdSfxNoPnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnAdjStsCod!= expected.trnAdjStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfPrivBcastT, trnAdjStsCodnot matching. Actual %d but Expected %d", actual.trnAdjStsCod, expected.trnAdjStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdUntNo, expected.trdUntNo, TRD_UNT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfPrivBcastT, trdUntNo not matching. Actual %s but Expected %s", actual.trdUntNo, expected.trdUntNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfPrivBcastT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfPrivBcastT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrTrnStsCod!= expected.flxCntrTrnStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfPrivBcastT, flxCntrTrnStsCodnot matching. Actual %d but Expected %d", actual.flxCntrTrnStsCod, expected.flxCntrTrnStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfPrivBcastT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfPrivBcastT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtSubFlxOptConfPrivBcastT(extSubFlxOptConfPrivBcastT actual, extSubFlxOptConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxOptConfPrivBcastT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.abdnInd!= expected.abdnInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxOptConfPrivBcastT, abdnIndnot matching. Actual %d but Expected %d", actual.abdnInd, expected.abdnInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrClsPrc, expected.flxCntrClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxOptConfPrivBcastT, flxCntrClsPrc not matching. Actual %s but Expected %s", actual.flxCntrClsPrc, expected.flxCntrClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.clsStsCod!= expected.clsStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxOptConfPrivBcastT, clsStsCodnot matching. Actual %d but Expected %d", actual.clsStsCod, expected.clsStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrGuStsCod!= expected.flxCntrGuStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxOptConfPrivBcastT, flxCntrGuStsCodnot matching. Actual %d but Expected %d", actual.flxCntrGuStsCod, expected.flxCntrGuStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.takUpApprInd!= expected.takUpApprInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxOptConfPrivBcastT, takUpApprIndnot matching. Actual %d but Expected %d", actual.takUpApprInd, expected.takUpApprInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.givUpAcptInd!= expected.givUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxOptConfPrivBcastT, givUpAcptIndnot matching. Actual %d but Expected %d", actual.givUpAcptInd, expected.givUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.takUpAcptInd!= expected.takUpAcptInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxOptConfPrivBcastT, takUpAcptIndnot matching. Actual %d but Expected %d", actual.takUpAcptInd, expected.takUpAcptInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membPropCtpyIdCod, expected.membPropCtpyIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxOptConfPrivBcastT, membPropCtpyIdCod not matching. Actual %s but Expected %s", actual.membPropCtpyIdCod, expected.membPropCtpyIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrSynProdId, expected.flxCntrSynProdId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxOptConfPrivBcastT, flxCntrSynProdId not matching. Actual %s but Expected %s", actual.flxCntrSynProdId, expected.flxCntrSynProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.flxCntrMtnCod!= expected.flxCntrMtnCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxOptConfPrivBcastT, flxCntrMtnCodnot matching. Actual %d but Expected %d", actual.flxCntrMtnCod, expected.flxCntrMtnCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.flxCntrActnMap, expected.flxCntrActnMap, FLX_CNTR_ACTN_MAP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubFlxOptConfPrivBcastT, flxCntrActnMap not matching. Actual %s but Expected %s", actual.flxCntrActnMap, expected.flxCntrActnMap);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubFlxOptConfPrivBcastT(subFlxOptConfPrivBcastT actual, subFlxOptConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubFlxOptConfPrivBcastT (actual.basic,expected.basic, logMsg);
	compareExtSubFlxOptConfPrivBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubFlxOptConfSubjectT(bscSubFlxOptConfSubjectT actual, bscSubFlxOptConfSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfSubjectT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubFlxOptConfSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

