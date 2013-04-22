#include <SubTrdConf.hxx>
#define BUFFER_SIZE 1000

futSubTrdConfPrivBcastT *vfutSubTrdConfPrivBcastT;
futBscSubTrdConfSubjectT *vfutBscSubTrdConfSubjectT;
optSubTrdConfPrivBcastT *voptSubTrdConfPrivBcastT;
optBscSubTrdConfSubjectT *voptBscSubTrdConfSubjectT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSubTrdConfPrivBcastT getFutBscSubTrdConfPrivBcastT(char* testCaseNum , const char *root) {
	futBscSubTrdConfPrivBcastT vfutBscSubTrdConfPrivBcastT;
	int i;

	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.posTrnTyp", lposTrnTyp);
	memcpy(vfutBscSubTrdConfPrivBcastT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.buyCod", lbuyCod);
	vfutBscSubTrdConfPrivBcastT.buyCod = lbuyCod[0];

	vfutBscSubTrdConfPrivBcastT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscSubTrdConfPrivBcastT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscSubTrdConfPrivBcastT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	for(i=0;i<STRAT_TYP_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.stratTyp[i]= ' ';
	}
	char lstratTyp[STRAT_TYP_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.stratTyp", lstratTyp);
	memcpy(vfutBscSubTrdConfPrivBcastT.stratTyp, lstratTyp, STRAT_TYP_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscSubTrdConfPrivBcastT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vfutBscSubTrdConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscSubTrdConfPrivBcastT");
	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscSubTrdConfPrivBcastT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscSubTrdConfPrivBcastT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "futBscSubTrdConfPrivBcastT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.shtQty", lshtQty);
	memcpy(vfutBscSubTrdConfPrivBcastT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.lngQty", llngQty);
	memcpy(vfutBscSubTrdConfPrivBcastT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscSubTrdConfPrivBcastT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lagrsrMtchInd[1] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.agrsrMtchInd", lagrsrMtchInd);
	vfutBscSubTrdConfPrivBcastT.agrsrMtchInd = lagrsrMtchInd[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.trnDat", ltrnDat);
	memcpy(vfutBscSubTrdConfPrivBcastT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.trnTim", ltrnTim);
	memcpy(vfutBscSubTrdConfPrivBcastT.trnTim, ltrnTim, DRIV_TIME_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.trdTyp", ltrdTyp);
	vfutBscSubTrdConfPrivBcastT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.ordrNo", lordrNo);
	memcpy(vfutBscSubTrdConfPrivBcastT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.ordrTypCod", lordrTypCod);
	vfutBscSubTrdConfPrivBcastT.ordrTypCod = lordrTypCod[0];

	char lordrResCod[1] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.ordrResCod", lordrResCod);
	vfutBscSubTrdConfPrivBcastT.ordrResCod = lordrResCod[0];

	char lopnClsCod[1] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.opnClsCod", lopnClsCod);
	vfutBscSubTrdConfPrivBcastT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.ordrQty", lordrQty);
	memcpy(vfutBscSubTrdConfPrivBcastT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.ordrDat[i]= ' ';
	}
	char lordrDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.ordrDat", lordrDat);
	memcpy(vfutBscSubTrdConfPrivBcastT.ordrDat, lordrDat, DRIV_DATE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.currTypCod", lcurrTypCod);
	memcpy(vfutBscSubTrdConfPrivBcastT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char ldcmlShft[1] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.dcmlShft", ldcmlShft);
	vfutBscSubTrdConfPrivBcastT.dcmlShft = ldcmlShft[0];

	char lexerPrcDcml[1] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.exerPrcDcml", lexerPrcDcml);
	vfutBscSubTrdConfPrivBcastT.exerPrcDcml = lexerPrcDcml[0];

	for(i=0;i<PROD_DISP_DCML_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.prodDispDcml[i]= ' ';
	}
	char lprodDispDcml[PROD_DISP_DCML_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.prodDispDcml", lprodDispDcml);
	memcpy(vfutBscSubTrdConfPrivBcastT.prodDispDcml, lprodDispDcml, PROD_DISP_DCML_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscSubTrdConfPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscSubTrdConfPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscSubTrdConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtSubTrdConfPrivBcastT getFutExtSubTrdConfPrivBcastT(char* testCaseNum , const char *root) {
	futExtSubTrdConfPrivBcastT vfutExtSubTrdConfPrivBcastT;
	int i;

	vfutExtSubTrdConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtSubTrdConfPrivBcastT");
	vfutExtSubTrdConfPrivBcastT.txtGrp = getTxtGrpT(testCaseNum, "futExtSubTrdConfPrivBcastT");
	char lordrPrtFilCod[1] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.ordrPrtFilCod", lordrPrtFilCod);
	vfutExtSubTrdConfPrivBcastT.ordrPrtFilCod = lordrPrtFilCod[0];

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtSubTrdConfPrivBcastT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.isinCod", lisinCod);
	memcpy(vfutExtSubTrdConfPrivBcastT.isinCod, lisinCod, ISIN_COD_LEN);

	vfutExtSubTrdConfPrivBcastT.gutGrp = getGutGrpT(testCaseNum, "futExtSubTrdConfPrivBcastT");
	for(i=0;i<GRS_BAS_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.grsBas[i]= ' ';
	}
	char lgrsBas[GRS_BAS_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.grsBas", lgrsBas);
	memcpy(vfutExtSubTrdConfPrivBcastT.grsBas, lgrsBas, GRS_BAS_LEN);

	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.undrIsinCod", lundrIsinCod);
	memcpy(vfutExtSubTrdConfPrivBcastT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.dsgnOpnLng[i]= ' ';
	}
	char ldsgnOpnLng[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.dsgnOpnLng", ldsgnOpnLng);
	memcpy(vfutExtSubTrdConfPrivBcastT.dsgnOpnLng, ldsgnOpnLng, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.dsgnOpnSht[i]= ' ';
	}
	char ldsgnOpnSht[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.dsgnOpnSht", ldsgnOpnSht);
	memcpy(vfutExtSubTrdConfPrivBcastT.dsgnOpnSht, ldsgnOpnSht, DRIV_QUANTITY_LEN);

	for(i=0;i<BON_ISIN_COD_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.bonIsinCod[i]= ' ';
	}
	char lbonIsinCod[BON_ISIN_COD_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.bonIsinCod", lbonIsinCod);
	memcpy(vfutExtSubTrdConfPrivBcastT.bonIsinCod, lbonIsinCod, BON_ISIN_COD_LEN);

	for(i=0;i<DRIV_PRM_AMNT_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.prmAmnt[i]= ' ';
	}
	char lprmAmnt[DRIV_PRM_AMNT_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.prmAmnt", lprmAmnt);
	memcpy(vfutExtSubTrdConfPrivBcastT.prmAmnt, lprmAmnt, DRIV_PRM_AMNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(vfutExtSubTrdConfPrivBcastT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.cshValDat[i]= ' ';
	}
	char lcshValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.cshValDat", lcshValDat);
	memcpy(vfutExtSubTrdConfPrivBcastT.cshValDat, lcshValDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.secuValDat[i]= ' ';
	}
	char lsecuValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.secuValDat", lsecuValDat);
	memcpy(vfutExtSubTrdConfPrivBcastT.secuValDat, lsecuValDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.swapEndDat[i]= ' ';
	}
	char lswapEndDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.swapEndDat", lswapEndDat);
	memcpy(vfutExtSubTrdConfPrivBcastT.swapEndDat, lswapEndDat, DRIV_DATE_LEN);

	for(i=0;i<CPN_FIX_RAT_LEN;i++) {
		vfutExtSubTrdConfPrivBcastT.cpnFixRat[i]= ' ';
	}
	char lcpnFixRat[CPN_FIX_RAT_LEN] = {""};
	getStrProperty("SubTrdConf.futExtSubTrdConfPrivBcastT.cpnFixRat", lcpnFixRat);
	memcpy(vfutExtSubTrdConfPrivBcastT.cpnFixRat, lcpnFixRat, CPN_FIX_RAT_LEN);

	vfutExtSubTrdConfPrivBcastT.origTrnGrp = getOrigTrnGrpT(testCaseNum, "futExtSubTrdConfPrivBcastT");	return vfutExtSubTrdConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscSubTrdConfPrivBcastT getOptBscSubTrdConfPrivBcastT(char* testCaseNum , const char *root) {
	optBscSubTrdConfPrivBcastT voptBscSubTrdConfPrivBcastT;
	int i;

	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.posTrnTyp", lposTrnTyp);
	memcpy(voptBscSubTrdConfPrivBcastT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.buyCod", lbuyCod);
	voptBscSubTrdConfPrivBcastT.buyCod = lbuyCod[0];

	voptBscSubTrdConfPrivBcastT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscSubTrdConfPrivBcastT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.dblLegTyp", ldblLegTyp);
	memcpy(voptBscSubTrdConfPrivBcastT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	for(i=0;i<STRAT_TYP_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.stratTyp[i]= ' ';
	}
	char lstratTyp[STRAT_TYP_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.stratTyp", lstratTyp);
	memcpy(voptBscSubTrdConfPrivBcastT.stratTyp, lstratTyp, STRAT_TYP_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscSubTrdConfPrivBcastT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	voptBscSubTrdConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscSubTrdConfPrivBcastT");
	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.trnIdNo", ltrnIdNo);
	memcpy(voptBscSubTrdConfPrivBcastT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscSubTrdConfPrivBcastT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "optBscSubTrdConfPrivBcastT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.shtQty", lshtQty);
	memcpy(voptBscSubTrdConfPrivBcastT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.lngQty", llngQty);
	memcpy(voptBscSubTrdConfPrivBcastT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscSubTrdConfPrivBcastT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lagrsrMtchInd[1] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.agrsrMtchInd", lagrsrMtchInd);
	voptBscSubTrdConfPrivBcastT.agrsrMtchInd = lagrsrMtchInd[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.trnDat", ltrnDat);
	memcpy(voptBscSubTrdConfPrivBcastT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.trnTim", ltrnTim);
	memcpy(voptBscSubTrdConfPrivBcastT.trnTim, ltrnTim, DRIV_TIME_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.trdTyp", ltrdTyp);
	voptBscSubTrdConfPrivBcastT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.ordrNo", lordrNo);
	memcpy(voptBscSubTrdConfPrivBcastT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.ordrTypCod", lordrTypCod);
	voptBscSubTrdConfPrivBcastT.ordrTypCod = lordrTypCod[0];

	char lordrResCod[1] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.ordrResCod", lordrResCod);
	voptBscSubTrdConfPrivBcastT.ordrResCod = lordrResCod[0];

	char lopnClsCod[1] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.opnClsCod", lopnClsCod);
	voptBscSubTrdConfPrivBcastT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.ordrQty", lordrQty);
	memcpy(voptBscSubTrdConfPrivBcastT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.ordrDat[i]= ' ';
	}
	char lordrDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.ordrDat", lordrDat);
	memcpy(voptBscSubTrdConfPrivBcastT.ordrDat, lordrDat, DRIV_DATE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.currTypCod", lcurrTypCod);
	memcpy(voptBscSubTrdConfPrivBcastT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char ldcmlShft[1] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.dcmlShft", ldcmlShft);
	voptBscSubTrdConfPrivBcastT.dcmlShft = ldcmlShft[0];

	char lexerPrcDcml[1] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.exerPrcDcml", lexerPrcDcml);
	voptBscSubTrdConfPrivBcastT.exerPrcDcml = lexerPrcDcml[0];

	for(i=0;i<PROD_DISP_DCML_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.prodDispDcml[i]= ' ';
	}
	char lprodDispDcml[PROD_DISP_DCML_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.prodDispDcml", lprodDispDcml);
	memcpy(voptBscSubTrdConfPrivBcastT.prodDispDcml, lprodDispDcml, PROD_DISP_DCML_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscSubTrdConfPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscSubTrdConfPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscSubTrdConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtSubTrdConfPrivBcastT getOptExtSubTrdConfPrivBcastT(char* testCaseNum , const char *root) {
	optExtSubTrdConfPrivBcastT voptExtSubTrdConfPrivBcastT;
	int i;

	voptExtSubTrdConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtSubTrdConfPrivBcastT");
	voptExtSubTrdConfPrivBcastT.txtGrp = getTxtGrpT(testCaseNum, "optExtSubTrdConfPrivBcastT");
	char lordrPrtFilCod[1] = {""};
	getStrProperty("SubTrdConf.optExtSubTrdConfPrivBcastT.ordrPrtFilCod", lordrPrtFilCod);
	voptExtSubTrdConfPrivBcastT.ordrPrtFilCod = lordrPrtFilCod[0];

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptExtSubTrdConfPrivBcastT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("SubTrdConf.optExtSubTrdConfPrivBcastT.membClgIdCod", lmembClgIdCod);
	memcpy(voptExtSubTrdConfPrivBcastT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		voptExtSubTrdConfPrivBcastT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("SubTrdConf.optExtSubTrdConfPrivBcastT.isinCod", lisinCod);
	memcpy(voptExtSubTrdConfPrivBcastT.isinCod, lisinCod, ISIN_COD_LEN);

	voptExtSubTrdConfPrivBcastT.gutGrp = getGutGrpT(testCaseNum, "optExtSubTrdConfPrivBcastT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtSubTrdConfPrivBcastT.dsgnOpnLng[i]= ' ';
	}
	char ldsgnOpnLng[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubTrdConf.optExtSubTrdConfPrivBcastT.dsgnOpnLng", ldsgnOpnLng);
	memcpy(voptExtSubTrdConfPrivBcastT.dsgnOpnLng, ldsgnOpnLng, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtSubTrdConfPrivBcastT.dsgnOpnSht[i]= ' ';
	}
	char ldsgnOpnSht[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubTrdConf.optExtSubTrdConfPrivBcastT.dsgnOpnSht", ldsgnOpnSht);
	memcpy(voptExtSubTrdConfPrivBcastT.dsgnOpnSht, ldsgnOpnSht, DRIV_QUANTITY_LEN);

	for(i=0;i<BON_ISIN_COD_LEN;i++) {
		voptExtSubTrdConfPrivBcastT.bonIsinCod[i]= ' ';
	}
	char lbonIsinCod[BON_ISIN_COD_LEN] = {""};
	getStrProperty("SubTrdConf.optExtSubTrdConfPrivBcastT.bonIsinCod", lbonIsinCod);
	memcpy(voptExtSubTrdConfPrivBcastT.bonIsinCod, lbonIsinCod, BON_ISIN_COD_LEN);

	for(i=0;i<DRIV_PRM_AMNT_LEN;i++) {
		voptExtSubTrdConfPrivBcastT.prmAmnt[i]= ' ';
	}
	char lprmAmnt[DRIV_PRM_AMNT_LEN] = {""};
	getStrProperty("SubTrdConf.optExtSubTrdConfPrivBcastT.prmAmnt", lprmAmnt);
	memcpy(voptExtSubTrdConfPrivBcastT.prmAmnt, lprmAmnt, DRIV_PRM_AMNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptExtSubTrdConfPrivBcastT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("SubTrdConf.optExtSubTrdConfPrivBcastT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(voptExtSubTrdConfPrivBcastT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptExtSubTrdConfPrivBcastT.cshValDat[i]= ' ';
	}
	char lcshValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubTrdConf.optExtSubTrdConfPrivBcastT.cshValDat", lcshValDat);
	memcpy(voptExtSubTrdConfPrivBcastT.cshValDat, lcshValDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptExtSubTrdConfPrivBcastT.secuValDat[i]= ' ';
	}
	char lsecuValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubTrdConf.optExtSubTrdConfPrivBcastT.secuValDat", lsecuValDat);
	memcpy(voptExtSubTrdConfPrivBcastT.secuValDat, lsecuValDat, DRIV_DATE_LEN);

	voptExtSubTrdConfPrivBcastT.origTrnGrp = getOrigTrnGrpT(testCaseNum, "optExtSubTrdConfPrivBcastT");	return voptExtSubTrdConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futSubTrdConfPrivBcastT* getFutSubTrdConfPrivBcastT(char* testCaseNum) {
	vfutSubTrdConfPrivBcastT = (futSubTrdConfPrivBcastT*)malloc(sizeof(futSubTrdConfPrivBcastT));
	int i;

	vfutSubTrdConfPrivBcastT->seqNo = getFutBscSeqNoT(testCaseNum, "futSubTrdConfPrivBcastT");
	vfutSubTrdConfPrivBcastT->header = getDataHeaderT(testCaseNum, "futSubTrdConfPrivBcastT");
	vfutSubTrdConfPrivBcastT->basic = getFutBscSubTrdConfPrivBcastT(testCaseNum, "futSubTrdConfPrivBcastT");
	vfutSubTrdConfPrivBcastT->extension = getFutExtSubTrdConfPrivBcastT(testCaseNum, "futSubTrdConfPrivBcastT");
	return vfutSubTrdConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futBscSubTrdConfSubjectT* getFutBscSubTrdConfSubjectT(char* testCaseNum) {
	vfutBscSubTrdConfSubjectT = (futBscSubTrdConfSubjectT*)malloc(sizeof(futBscSubTrdConfSubjectT));
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vfutBscSubTrdConfSubjectT->membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfSubjectT.membId", lmembId);
	memcpy(vfutBscSubTrdConfSubjectT->membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscSubTrdConfSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfSubjectT.prodId", lprodId);
	memcpy(vfutBscSubTrdConfSubjectT->prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutBscSubTrdConfSubjectT->cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vfutBscSubTrdConfSubjectT->cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutBscSubTrdConfSubjectT->cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vfutBscSubTrdConfSubjectT->cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<SUBJ_FILL_LEN;i++) {
		vfutBscSubTrdConfSubjectT->subjFill[i]= ' ';
	}
	char lsubjFill[SUBJ_FILL_LEN] = {""};
	getStrProperty("SubTrdConf.futBscSubTrdConfSubjectT.subjFill", lsubjFill);
	memcpy(vfutBscSubTrdConfSubjectT->subjFill, lsubjFill, SUBJ_FILL_LEN);

	return vfutBscSubTrdConfSubjectT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optSubTrdConfPrivBcastT* getOptSubTrdConfPrivBcastT(char* testCaseNum) {
	voptSubTrdConfPrivBcastT = (optSubTrdConfPrivBcastT*)malloc(sizeof(optSubTrdConfPrivBcastT));
	int i;

	voptSubTrdConfPrivBcastT->seqNo = getOptBscSeqNoT(testCaseNum, "optSubTrdConfPrivBcastT");
	voptSubTrdConfPrivBcastT->header = getDataHeaderT(testCaseNum, "optSubTrdConfPrivBcastT");
	voptSubTrdConfPrivBcastT->basic = getOptBscSubTrdConfPrivBcastT(testCaseNum, "optSubTrdConfPrivBcastT");
	voptSubTrdConfPrivBcastT->extension = getOptExtSubTrdConfPrivBcastT(testCaseNum, "optSubTrdConfPrivBcastT");
	return voptSubTrdConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optBscSubTrdConfSubjectT* getOptBscSubTrdConfSubjectT(char* testCaseNum) {
	voptBscSubTrdConfSubjectT = (optBscSubTrdConfSubjectT*)malloc(sizeof(optBscSubTrdConfSubjectT));
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		voptBscSubTrdConfSubjectT->membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfSubjectT.membId", lmembId);
	memcpy(voptBscSubTrdConfSubjectT->membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscSubTrdConfSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfSubjectT.prodId", lprodId);
	memcpy(voptBscSubTrdConfSubjectT->prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		voptBscSubTrdConfSubjectT->cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(voptBscSubTrdConfSubjectT->cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		voptBscSubTrdConfSubjectT->cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(voptBscSubTrdConfSubjectT->cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	char lcntrClasCod[1] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfSubjectT.cntrClasCod", lcntrClasCod);
	voptBscSubTrdConfSubjectT->cntrClasCod = lcntrClasCod[0];

	for(i=0;i<CNTR_EXER_PRC_LEN;i++) {
		voptBscSubTrdConfSubjectT->cntrExerPrc[i]= ' ';
	}
	char lcntrExerPrc[CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfSubjectT.cntrExerPrc", lcntrExerPrc);
	memcpy(voptBscSubTrdConfSubjectT->cntrExerPrc, lcntrExerPrc, CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("SubTrdConf.optBscSubTrdConfSubjectT.cntrVersNo", lcntrVersNo);
	voptBscSubTrdConfSubjectT->cntrVersNo = lcntrVersNo[0];

	return voptBscSubTrdConfSubjectT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutSubTrdConfPrivBcastTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futSubTrdConfPrivBcastT));
	futSubTrdConfPrivBcastT *vfutSubTrdConfPrivBcastT = getFutSubTrdConfPrivBcastT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futSubTrdConfPrivBcastT), (jbyte*) vfutSubTrdConfPrivBcastT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutBscSubTrdConfSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futBscSubTrdConfSubjectT));
	futBscSubTrdConfSubjectT *vfutBscSubTrdConfSubjectT = getFutBscSubTrdConfSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futBscSubTrdConfSubjectT), (jbyte*) vfutBscSubTrdConfSubjectT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptSubTrdConfPrivBcastTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optSubTrdConfPrivBcastT));
	optSubTrdConfPrivBcastT *voptSubTrdConfPrivBcastT = getOptSubTrdConfPrivBcastT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optSubTrdConfPrivBcastT), (jbyte*) voptSubTrdConfPrivBcastT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptBscSubTrdConfSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optBscSubTrdConfSubjectT));
	optBscSubTrdConfSubjectT *voptBscSubTrdConfSubjectT = getOptBscSubTrdConfSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optBscSubTrdConfSubjectT), (jbyte*) voptBscSubTrdConfSubjectT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSubTrdConfPrivBcastT(futBscSubTrdConfPrivBcastT actual, futBscSubTrdConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratTyp, expected.stratTyp, STRAT_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, stratTyp not matching. Actual %s but Expected %s", actual.stratTyp, expected.stratTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.agrsrMtchInd!= expected.agrsrMtchInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, agrsrMtchIndnot matching. Actual %d but Expected %d", actual.agrsrMtchInd, expected.agrsrMtchInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrDat, expected.ordrDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, ordrDat not matching. Actual %s but Expected %s", actual.ordrDat, expected.ordrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.dcmlShft!= expected.dcmlShft) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, dcmlShftnot matching. Actual %d but Expected %d", actual.dcmlShft, expected.dcmlShft);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerPrcDcml!= expected.exerPrcDcml) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, exerPrcDcmlnot matching. Actual %d but Expected %d", actual.exerPrcDcml, expected.exerPrcDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodDispDcml, expected.prodDispDcml, PROD_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, prodDispDcml not matching. Actual %s but Expected %s", actual.prodDispDcml, expected.prodDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtSubTrdConfPrivBcastT(futExtSubTrdConfPrivBcastT actual, futExtSubTrdConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if (actual.ordrPrtFilCod!= expected.ordrPrtFilCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, ordrPrtFilCodnot matching. Actual %d but Expected %d", actual.ordrPrtFilCod, expected.ordrPrtFilCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareGutGrpT (actual.gutGrp,expected.gutGrp, logMsg);
	if ( memcmp(actual.grsBas, expected.grsBas, GRS_BAS_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, grsBas not matching. Actual %s but Expected %s", actual.grsBas, expected.grsBas);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnLng, expected.dsgnOpnLng, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, dsgnOpnLng not matching. Actual %s but Expected %s", actual.dsgnOpnLng, expected.dsgnOpnLng);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnSht, expected.dsgnOpnSht, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, dsgnOpnSht not matching. Actual %s but Expected %s", actual.dsgnOpnSht, expected.dsgnOpnSht);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bonIsinCod, expected.bonIsinCod, BON_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, bonIsinCod not matching. Actual %s but Expected %s", actual.bonIsinCod, expected.bonIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prmAmnt, expected.prmAmnt, DRIV_PRM_AMNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, prmAmnt not matching. Actual %s but Expected %s", actual.prmAmnt, expected.prmAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshValDat, expected.cshValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, cshValDat not matching. Actual %s but Expected %s", actual.cshValDat, expected.cshValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuValDat, expected.secuValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, secuValDat not matching. Actual %s but Expected %s", actual.secuValDat, expected.secuValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapEndDat, expected.swapEndDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, swapEndDat not matching. Actual %s but Expected %s", actual.swapEndDat, expected.swapEndDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cpnFixRat, expected.cpnFixRat, CPN_FIX_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubTrdConfPrivBcastT, cpnFixRat not matching. Actual %s but Expected %s", actual.cpnFixRat, expected.cpnFixRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOrigTrnGrpT (actual.origTrnGrp,expected.origTrnGrp, logMsg);
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscSubTrdConfPrivBcastT(optBscSubTrdConfPrivBcastT actual, optBscSubTrdConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratTyp, expected.stratTyp, STRAT_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, stratTyp not matching. Actual %s but Expected %s", actual.stratTyp, expected.stratTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.agrsrMtchInd!= expected.agrsrMtchInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, agrsrMtchIndnot matching. Actual %d but Expected %d", actual.agrsrMtchInd, expected.agrsrMtchInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrDat, expected.ordrDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, ordrDat not matching. Actual %s but Expected %s", actual.ordrDat, expected.ordrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.dcmlShft!= expected.dcmlShft) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, dcmlShftnot matching. Actual %d but Expected %d", actual.dcmlShft, expected.dcmlShft);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerPrcDcml!= expected.exerPrcDcml) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, exerPrcDcmlnot matching. Actual %d but Expected %d", actual.exerPrcDcml, expected.exerPrcDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodDispDcml, expected.prodDispDcml, PROD_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, prodDispDcml not matching. Actual %s but Expected %s", actual.prodDispDcml, expected.prodDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtSubTrdConfPrivBcastT(optExtSubTrdConfPrivBcastT actual, optExtSubTrdConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if (actual.ordrPrtFilCod!= expected.ordrPrtFilCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubTrdConfPrivBcastT, ordrPrtFilCodnot matching. Actual %d but Expected %d", actual.ordrPrtFilCod, expected.ordrPrtFilCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubTrdConfPrivBcastT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubTrdConfPrivBcastT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareGutGrpT (actual.gutGrp,expected.gutGrp, logMsg);
	if ( memcmp(actual.dsgnOpnLng, expected.dsgnOpnLng, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubTrdConfPrivBcastT, dsgnOpnLng not matching. Actual %s but Expected %s", actual.dsgnOpnLng, expected.dsgnOpnLng);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dsgnOpnSht, expected.dsgnOpnSht, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubTrdConfPrivBcastT, dsgnOpnSht not matching. Actual %s but Expected %s", actual.dsgnOpnSht, expected.dsgnOpnSht);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bonIsinCod, expected.bonIsinCod, BON_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubTrdConfPrivBcastT, bonIsinCod not matching. Actual %s but Expected %s", actual.bonIsinCod, expected.bonIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prmAmnt, expected.prmAmnt, DRIV_PRM_AMNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubTrdConfPrivBcastT, prmAmnt not matching. Actual %s but Expected %s", actual.prmAmnt, expected.prmAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubTrdConfPrivBcastT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshValDat, expected.cshValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubTrdConfPrivBcastT, cshValDat not matching. Actual %s but Expected %s", actual.cshValDat, expected.cshValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuValDat, expected.secuValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubTrdConfPrivBcastT, secuValDat not matching. Actual %s but Expected %s", actual.secuValDat, expected.secuValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOrigTrnGrpT (actual.origTrnGrp,expected.origTrnGrp, logMsg);
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutSubTrdConfPrivBcastT(futSubTrdConfPrivBcastT actual, futSubTrdConfPrivBcastT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscSubTrdConfPrivBcastT (actual.basic,expected.basic, logMsg);	compareFutExtSubTrdConfPrivBcastT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutBscSubTrdConfSubjectT(futBscSubTrdConfSubjectT actual, futBscSubTrdConfSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.membId!= expected.membId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfSubjectT, membIdnot matching. Actual %d but Expected %d", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpYrDat!= expected.cntrExpYrDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfSubjectT, cntrExpYrDatnot matching. Actual %d but Expected %d", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpMthDat!= expected.cntrExpMthDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfSubjectT, cntrExpMthDatnot matching. Actual %d but Expected %d", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.subjFill!= expected.subjFill) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubTrdConfSubjectT, subjFillnot matching. Actual %d but Expected %d", actual.subjFill, expected.subjFill);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptSubTrdConfPrivBcastT(optSubTrdConfPrivBcastT actual, optSubTrdConfPrivBcastT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscSubTrdConfPrivBcastT (actual.basic,expected.basic, logMsg);	compareOptExtSubTrdConfPrivBcastT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptBscSubTrdConfSubjectT(optBscSubTrdConfSubjectT actual, optBscSubTrdConfSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.membId!= expected.membId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfSubjectT, membIdnot matching. Actual %d but Expected %d", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpYrDat!= expected.cntrExpYrDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfSubjectT, cntrExpYrDatnot matching. Actual %d but Expected %d", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpMthDat!= expected.cntrExpMthDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfSubjectT, cntrExpMthDatnot matching. Actual %d but Expected %d", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfSubjectT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExerPrc!= expected.cntrExerPrc) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfSubjectT, cntrExerPrcnot matching. Actual %d but Expected %d", actual.cntrExerPrc, expected.cntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubTrdConfSubjectT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutSubTrdConfPrivBcastTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futSubTrdConfPrivBcastT *actualData = (futSubTrdConfPrivBcastT *)msgStruct;
	futSubTrdConfPrivBcastT* expectedData = getFutSubTrdConfPrivBcastT(testCaseNum);
	compareFutSubTrdConfPrivBcastT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutBscSubTrdConfSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futBscSubTrdConfSubjectT *actualData = (futBscSubTrdConfSubjectT *)msgStruct;
	futBscSubTrdConfSubjectT* expectedData = getFutBscSubTrdConfSubjectT(testCaseNum);
	compareFutBscSubTrdConfSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptSubTrdConfPrivBcastTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optSubTrdConfPrivBcastT *actualData = (optSubTrdConfPrivBcastT *)msgStruct;
	optSubTrdConfPrivBcastT* expectedData = getOptSubTrdConfPrivBcastT(testCaseNum);
	compareOptSubTrdConfPrivBcastT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptBscSubTrdConfSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optBscSubTrdConfSubjectT *actualData = (optBscSubTrdConfSubjectT *)msgStruct;
	optBscSubTrdConfSubjectT* expectedData = getOptBscSubTrdConfSubjectT(testCaseNum);
	compareOptBscSubTrdConfSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
