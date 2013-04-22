#include <InqHistPosTrn.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqHistPosTrnRequestT getBscInqHistPosTrnRequestT(char* testCaseNum , const char *root) {
	bscInqHistPosTrnRequestT vbscInqHistPosTrnRequestT;
	int i;

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqHistPosTrnRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRequestT.trnDat", ltrnDat);
	memcpy(vbscInqHistPosTrnRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<MEMB_ID_LEN;i++) {
		vbscInqHistPosTrnRequestT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRequestT.membId", lmembId);
	memcpy(vbscInqHistPosTrnRequestT.membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<DRIV_STRT_STM_SEQ_NO_LEN;i++) {
		vbscInqHistPosTrnRequestT.strtStmSeqNo[i]= ' ';
	}
	char lstrtStmSeqNo[DRIV_STRT_STM_SEQ_NO_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRequestT.strtStmSeqNo", lstrtStmSeqNo);
	memcpy(vbscInqHistPosTrnRequestT.strtStmSeqNo, lstrtStmSeqNo, DRIV_STRT_STM_SEQ_NO_LEN);

	for(i=0;i<DRIV_STOP_STM_SEQ_NO_LEN;i++) {
		vbscInqHistPosTrnRequestT.stopStmSeqNo[i]= ' ';
	}
	char lstopStmSeqNo[DRIV_STOP_STM_SEQ_NO_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRequestT.stopStmSeqNo", lstopStmSeqNo);
	memcpy(vbscInqHistPosTrnRequestT.stopStmSeqNo, lstopStmSeqNo, DRIV_STOP_STM_SEQ_NO_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqHistPosTrnRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqHistPosTrnRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqHistPosTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqHistPosTrnRequestT getInqHistPosTrnRequestT(char* testCaseNum , const char *root) {
	inqHistPosTrnRequestT vinqHistPosTrnRequestT;
	int i;

	vinqHistPosTrnRequestT.header = getDataHeaderT(testCaseNum, "inqHistPosTrnRequestT");
	vinqHistPosTrnRequestT.basic = getBscInqHistPosTrnRequestT(testCaseNum, "inqHistPosTrnRequestT");	return vinqHistPosTrnRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqHistPosTrnRecT getBscInqHistPosTrnRecT(char* testCaseNum , const char *root) {
	bscInqHistPosTrnRecT vbscInqHistPosTrnRecT;
	int i;

	for(i=0;i<PROD_LINE_LEN;i++) {
		vbscInqHistPosTrnRecT.recProdLine[i]= ' ';
	}
	char lrecProdLine[PROD_LINE_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.recProdLine", lrecProdLine);
	memcpy(vbscInqHistPosTrnRecT.recProdLine, lrecProdLine, PROD_LINE_LEN);

	for(i=0;i<DRIV_STM_SEQ_NO_LEN;i++) {
		vbscInqHistPosTrnRecT.stmSeqNo[i]= ' ';
	}
	char lstmSeqNo[DRIV_STM_SEQ_NO_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.stmSeqNo", lstmSeqNo);
	memcpy(vbscInqHistPosTrnRecT.stmSeqNo, lstmSeqNo, DRIV_STM_SEQ_NO_LEN);

	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		vbscInqHistPosTrnRecT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.posTrnTyp", lposTrnTyp);
	memcpy(vbscInqHistPosTrnRecT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.buyCod", lbuyCod);
	vbscInqHistPosTrnRecT.buyCod = lbuyCod[0];

	vbscInqHistPosTrnRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "bscInqHistPosTrnRecT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vbscInqHistPosTrnRecT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.dblLegTyp", ldblLegTyp);
	memcpy(vbscInqHistPosTrnRecT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	for(i=0;i<STRAT_TYP_LEN;i++) {
		vbscInqHistPosTrnRecT.stratTyp[i]= ' ';
	}
	char lstratTyp[STRAT_TYP_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.stratTyp", lstratTyp);
	memcpy(vbscInqHistPosTrnRecT.stratTyp, lstratTyp, STRAT_TYP_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscInqHistPosTrnRecT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscInqHistPosTrnRecT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscInqHistPosTrnRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqHistPosTrnRecT");
	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vbscInqHistPosTrnRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.trnIdNo", ltrnIdNo);
	memcpy(vbscInqHistPosTrnRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vbscInqHistPosTrnRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "bscInqHistPosTrnRecT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqHistPosTrnRecT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.shtQty", lshtQty);
	memcpy(vbscInqHistPosTrnRecT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqHistPosTrnRecT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.lngQty", llngQty);
	memcpy(vbscInqHistPosTrnRecT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqHistPosTrnRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscInqHistPosTrnRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lagrsrMtchInd[1] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.agrsrMtchInd", lagrsrMtchInd);
	vbscInqHistPosTrnRecT.agrsrMtchInd = lagrsrMtchInd[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqHistPosTrnRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.trnDat", ltrnDat);
	memcpy(vbscInqHistPosTrnRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqHistPosTrnRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.trnTim", ltrnTim);
	memcpy(vbscInqHistPosTrnRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.trdTyp", ltrdTyp);
	vbscInqHistPosTrnRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscInqHistPosTrnRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.ordrNo", lordrNo);
	memcpy(vbscInqHistPosTrnRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.ordrTypCod", lordrTypCod);
	vbscInqHistPosTrnRecT.ordrTypCod = lordrTypCod[0];

	char lordrResCod[1] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.ordrResCod", lordrResCod);
	vbscInqHistPosTrnRecT.ordrResCod = lordrResCod[0];

	char lopnClsCod[1] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.opnClsCod", lopnClsCod);
	vbscInqHistPosTrnRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqHistPosTrnRecT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.ordrQty", lordrQty);
	memcpy(vbscInqHistPosTrnRecT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqHistPosTrnRecT.ordrDat[i]= ' ';
	}
	char lordrDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.ordrDat", lordrDat);
	memcpy(vbscInqHistPosTrnRecT.ordrDat, lordrDat, DRIV_DATE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vbscInqHistPosTrnRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.currTypCod", lcurrTypCod);
	memcpy(vbscInqHistPosTrnRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char ldcmlShft[1] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.dcmlShft", ldcmlShft);
	vbscInqHistPosTrnRecT.dcmlShft = ldcmlShft[0];

	char lexerPrcDcml[1] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.exerPrcDcml", lexerPrcDcml);
	vbscInqHistPosTrnRecT.exerPrcDcml = lexerPrcDcml[0];

	for(i=0;i<PROD_DISP_DCML_LEN;i++) {
		vbscInqHistPosTrnRecT.prodDispDcml[i]= ' ';
	}
	char lprodDispDcml[PROD_DISP_DCML_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.prodDispDcml", lprodDispDcml);
	memcpy(vbscInqHistPosTrnRecT.prodDispDcml, lprodDispDcml, PROD_DISP_DCML_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqHistPosTrnRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqHistPosTrnRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqHistPosTrnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqHistPosTrnResponseT getBscInqHistPosTrnResponseT(char* testCaseNum , const char *root) {
	bscInqHistPosTrnResponseT vbscInqHistPosTrnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqHistPosTrnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqHistPosTrnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqHistPosTrnResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqHistPosTrn.bscInqHistPosTrnResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqHistPosTrnResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqHistPosTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqHistPosTrnRecT getExtInqHistPosTrnRecT(char* testCaseNum , const char *root) {
	extInqHistPosTrnRecT vextInqHistPosTrnRecT;
	int i;

	vextInqHistPosTrnRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqHistPosTrnRecT");
	vextInqHistPosTrnRecT.txtGrp = getTxtGrpT(testCaseNum, "extInqHistPosTrnRecT");
	char lordrPrtFilCod[1] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.ordrPrtFilCod", lordrPrtFilCod);
	vextInqHistPosTrnRecT.ordrPrtFilCod = lordrPrtFilCod[0];

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vextInqHistPosTrnRecT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.membClgIdCod", lmembClgIdCod);
	memcpy(vextInqHistPosTrnRecT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vextInqHistPosTrnRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.isinCod", lisinCod);
	memcpy(vextInqHistPosTrnRecT.isinCod, lisinCod, ISIN_COD_LEN);

	vextInqHistPosTrnRecT.gutGrp = getGutGrpT(testCaseNum, "extInqHistPosTrnRecT");
	for(i=0;i<GRS_BAS_LEN;i++) {
		vextInqHistPosTrnRecT.grsBas[i]= ' ';
	}
	char lgrsBas[GRS_BAS_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.grsBas", lgrsBas);
	memcpy(vextInqHistPosTrnRecT.grsBas, lgrsBas, GRS_BAS_LEN);

	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vextInqHistPosTrnRecT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.undrIsinCod", lundrIsinCod);
	memcpy(vextInqHistPosTrnRecT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vextInqHistPosTrnRecT.dsgnOpnLng[i]= ' ';
	}
	char ldsgnOpnLng[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.dsgnOpnLng", ldsgnOpnLng);
	memcpy(vextInqHistPosTrnRecT.dsgnOpnLng, ldsgnOpnLng, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vextInqHistPosTrnRecT.dsgnOpnSht[i]= ' ';
	}
	char ldsgnOpnSht[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.dsgnOpnSht", ldsgnOpnSht);
	memcpy(vextInqHistPosTrnRecT.dsgnOpnSht, ldsgnOpnSht, DRIV_QUANTITY_LEN);

	for(i=0;i<BON_ISIN_COD_LEN;i++) {
		vextInqHistPosTrnRecT.bonIsinCod[i]= ' ';
	}
	char lbonIsinCod[BON_ISIN_COD_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.bonIsinCod", lbonIsinCod);
	memcpy(vextInqHistPosTrnRecT.bonIsinCod, lbonIsinCod, BON_ISIN_COD_LEN);

	for(i=0;i<DRIV_PRM_AMNT_LEN;i++) {
		vextInqHistPosTrnRecT.prmAmnt[i]= ' ';
	}
	char lprmAmnt[DRIV_PRM_AMNT_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.prmAmnt", lprmAmnt);
	memcpy(vextInqHistPosTrnRecT.prmAmnt, lprmAmnt, DRIV_PRM_AMNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vextInqHistPosTrnRecT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(vextInqHistPosTrnRecT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vextInqHistPosTrnRecT.posnLngBal[i]= ' ';
	}
	char lposnLngBal[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.posnLngBal", lposnLngBal);
	memcpy(vextInqHistPosTrnRecT.posnLngBal, lposnLngBal, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vextInqHistPosTrnRecT.posnShtBal[i]= ' ';
	}
	char lposnShtBal[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.posnShtBal", lposnShtBal);
	memcpy(vextInqHistPosTrnRecT.posnShtBal, lposnShtBal, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextInqHistPosTrnRecT.cshValDat[i]= ' ';
	}
	char lcshValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.cshValDat", lcshValDat);
	memcpy(vextInqHistPosTrnRecT.cshValDat, lcshValDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextInqHistPosTrnRecT.secuValDat[i]= ' ';
	}
	char lsecuValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.secuValDat", lsecuValDat);
	memcpy(vextInqHistPosTrnRecT.secuValDat, lsecuValDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextInqHistPosTrnRecT.swapEndDat[i]= ' ';
	}
	char lswapEndDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.swapEndDat", lswapEndDat);
	memcpy(vextInqHistPosTrnRecT.swapEndDat, lswapEndDat, DRIV_DATE_LEN);

	for(i=0;i<CPN_FIX_RAT_LEN;i++) {
		vextInqHistPosTrnRecT.cpnFixRat[i]= ' ';
	}
	char lcpnFixRat[CPN_FIX_RAT_LEN] = {""};
	getStrProperty("InqHistPosTrn.extInqHistPosTrnRecT.cpnFixRat", lcpnFixRat);
	memcpy(vextInqHistPosTrnRecT.cpnFixRat, lcpnFixRat, CPN_FIX_RAT_LEN);

	vextInqHistPosTrnRecT.origTrnGrp = getOrigTrnGrpT(testCaseNum, "extInqHistPosTrnRecT");	return vextInqHistPosTrnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqHistPosTrnResponseT getExtInqHistPosTrnResponseT(char* testCaseNum , const char *root) {
	extInqHistPosTrnResponseT vextInqHistPosTrnResponseT;
	int i;
	return vextInqHistPosTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqHistPosTrnResponseT getInqHistPosTrnResponseT(char* testCaseNum , const char *root) {
	inqHistPosTrnResponseT vinqHistPosTrnResponseT;
	int i;

	vinqHistPosTrnResponseT.header = getDataHeaderT(testCaseNum, "inqHistPosTrnResponseT");
	vinqHistPosTrnResponseT.basic = getBscInqHistPosTrnResponseT(testCaseNum, "inqHistPosTrnResponseT");
	vinqHistPosTrnResponseT.extension = getExtInqHistPosTrnResponseT(testCaseNum, "inqHistPosTrnResponseT");	return vinqHistPosTrnResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqHistPosTrnRequestT(bscInqHistPosTrnRequestT actual, bscInqHistPosTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRequestT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.strtStmSeqNo, expected.strtStmSeqNo, DRIV_STRT_STM_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRequestT, strtStmSeqNo not matching. Actual %s but Expected %s", actual.strtStmSeqNo, expected.strtStmSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stopStmSeqNo, expected.stopStmSeqNo, DRIV_STOP_STM_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRequestT, stopStmSeqNo not matching. Actual %s but Expected %s", actual.stopStmSeqNo, expected.stopStmSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqHistPosTrnRequestT(inqHistPosTrnRequestT actual, inqHistPosTrnRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqHistPosTrnRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqHistPosTrnRecT(bscInqHistPosTrnRecT actual, bscInqHistPosTrnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.recProdLine, expected.recProdLine, PROD_LINE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, recProdLine not matching. Actual %s but Expected %s", actual.recProdLine, expected.recProdLine);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stmSeqNo, expected.stmSeqNo, DRIV_STM_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, stmSeqNo not matching. Actual %s but Expected %s", actual.stmSeqNo, expected.stmSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratTyp, expected.stratTyp, STRAT_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, stratTyp not matching. Actual %s but Expected %s", actual.stratTyp, expected.stratTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.agrsrMtchInd!= expected.agrsrMtchInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, agrsrMtchIndnot matching. Actual %d but Expected %d", actual.agrsrMtchInd, expected.agrsrMtchInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrDat, expected.ordrDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, ordrDat not matching. Actual %s but Expected %s", actual.ordrDat, expected.ordrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.dcmlShft!= expected.dcmlShft) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, dcmlShftnot matching. Actual %d but Expected %d", actual.dcmlShft, expected.dcmlShft);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerPrcDcml!= expected.exerPrcDcml) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, exerPrcDcmlnot matching. Actual %d but Expected %d", actual.exerPrcDcml, expected.exerPrcDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodDispDcml, expected.prodDispDcml, PROD_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, prodDispDcml not matching. Actual %s but Expected %s", actual.prodDispDcml, expected.prodDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqHistPosTrnResponseT(bscInqHistPosTrnResponseT actual, bscInqHistPosTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqHistPosTrnResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_HIST_POS_TRN_REC_MAX;i++) {
		compareBscInqHistPosTrnRecT (actual.bscInqHistPosTrnRec[i],expected.bscInqHistPosTrnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqHistPosTrnRecT(extInqHistPosTrnRecT actual, extInqHistPosTrnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if (actual.ordrPrtFilCod!= expected.ordrPrtFilCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, ordrPrtFilCodnot matching. Actual %d but Expected %d", actual.ordrPrtFilCod, expected.ordrPrtFilCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareGutGrpT (actual.gutGrp,expected.gutGrp, logMsg);
	if ( memcmp(actual.grsBas, expected.grsBas, GRS_BAS_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, grsBas not matching. Actual %s but Expected %s", actual.grsBas, expected.grsBas);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnLng, expected.dsgnOpnLng, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, dsgnOpnLng not matching. Actual %s but Expected %s", actual.dsgnOpnLng, expected.dsgnOpnLng);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnSht, expected.dsgnOpnSht, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, dsgnOpnSht not matching. Actual %s but Expected %s", actual.dsgnOpnSht, expected.dsgnOpnSht);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bonIsinCod, expected.bonIsinCod, BON_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, bonIsinCod not matching. Actual %s but Expected %s", actual.bonIsinCod, expected.bonIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prmAmnt, expected.prmAmnt, DRIV_PRM_AMNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, prmAmnt not matching. Actual %s but Expected %s", actual.prmAmnt, expected.prmAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.posnLngBal, expected.posnLngBal, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, posnLngBal not matching. Actual %s but Expected %s", actual.posnLngBal, expected.posnLngBal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.posnShtBal, expected.posnShtBal, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, posnShtBal not matching. Actual %s but Expected %s", actual.posnShtBal, expected.posnShtBal);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshValDat, expected.cshValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, cshValDat not matching. Actual %s but Expected %s", actual.cshValDat, expected.cshValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuValDat, expected.secuValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, secuValDat not matching. Actual %s but Expected %s", actual.secuValDat, expected.secuValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapEndDat, expected.swapEndDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, swapEndDat not matching. Actual %s but Expected %s", actual.swapEndDat, expected.swapEndDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cpnFixRat, expected.cpnFixRat, CPN_FIX_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqHistPosTrnRecT, cpnFixRat not matching. Actual %s but Expected %s", actual.cpnFixRat, expected.cpnFixRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOrigTrnGrpT (actual.origTrnGrp,expected.origTrnGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqHistPosTrnResponseT(extInqHistPosTrnResponseT actual, extInqHistPosTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_HIST_POS_TRN_REC_MAX;i++) {
		compareExtInqHistPosTrnRecT (actual.extInqHistPosTrnRec[i],expected.extInqHistPosTrnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqHistPosTrnResponseT(inqHistPosTrnResponseT actual, inqHistPosTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqHistPosTrnResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqHistPosTrnResponseT (actual.extension,expected.extension, logMsg);
}

