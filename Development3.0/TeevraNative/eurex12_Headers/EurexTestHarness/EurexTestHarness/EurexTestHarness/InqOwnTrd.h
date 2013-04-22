#include <InqOwnTrd.hxx>
#define BUFFER_SIZE 1000

futInqOwnTrdRequestT *vfutInqOwnTrdRequestT;
futInqOwnTrdResponseT *vfutInqOwnTrdResponseT;
optInqOwnTrdRequestT *voptInqOwnTrdRequestT;
optInqOwnTrdResponseT *voptInqOwnTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnTrdRequestT getFutBscInqOwnTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqOwnTrdRequestT vfutBscInqOwnTrdRequestT;
	int i;

	vfutBscInqOwnTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqOwnTrdRequestT");
	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnTrdRequestT.timMin[i]= ' ';
	}
	char ltimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRequestT.timMin", ltimMin);
	memcpy(vfutBscInqOwnTrdRequestT.timMin, ltimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnTrdRequestT.timMax[i]= ' ';
	}
	char ltimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRequestT.timMax", ltimMax);
	memcpy(vfutBscInqOwnTrdRequestT.timMax, ltimMax, DRIV_TIME_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRequestT.trdTyp", ltrdTyp);
	vfutBscInqOwnTrdRequestT.trdTyp = ltrdTyp[0];

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqOwnTrdRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqOwnTrdRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqOwnTrdRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqOwnTrdRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqOwnTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnTrdRecT getFutBscInqOwnTrdRecT(char* testCaseNum , const char *root) {
	futBscInqOwnTrdRecT vfutBscInqOwnTrdRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.buyCod", lbuyCod);
	vfutBscInqOwnTrdRecT.buyCod = lbuyCod[0];

	vfutBscInqOwnTrdRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqOwnTrdRecT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscInqOwnTrdRecT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscInqOwnTrdRecT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	for(i=0;i<STRAT_TYP_LEN;i++) {
		vfutBscInqOwnTrdRecT.stratTyp[i]= ' ';
	}
	char lstratTyp[STRAT_TYP_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.stratTyp", lstratTyp);
	memcpy(vfutBscInqOwnTrdRecT.stratTyp, lstratTyp, STRAT_TYP_LEN);

	vfutBscInqOwnTrdRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqOwnTrdRecT");
	char lordrPrtFilCod[1] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.ordrPrtFilCod", lordrPrtFilCod);
	vfutBscInqOwnTrdRecT.ordrPrtFilCod = lordrPrtFilCod[0];

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqOwnTrdRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqOwnTrdRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnTrdRecT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.ordrExeQty", lordrExeQty);
	memcpy(vfutBscInqOwnTrdRecT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqOwnTrdRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscInqOwnTrdRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lagrsrMtchInd[1] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.agrsrMtchInd", lagrsrMtchInd);
	vfutBscInqOwnTrdRecT.agrsrMtchInd = lagrsrMtchInd[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnTrdRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.trnDat", ltrnDat);
	memcpy(vfutBscInqOwnTrdRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnTrdRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.trnTim", ltrnTim);
	memcpy(vfutBscInqOwnTrdRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.trdTyp", ltrdTyp);
	vfutBscInqOwnTrdRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqOwnTrdRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.ordrNo", lordrNo);
	memcpy(vfutBscInqOwnTrdRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.ordrTypCod", lordrTypCod);
	vfutBscInqOwnTrdRecT.ordrTypCod = lordrTypCod[0];

	char lordrResCod[1] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.ordrResCod", lordrResCod);
	vfutBscInqOwnTrdRecT.ordrResCod = lordrResCod[0];

	char lopnClsCod[1] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.opnClsCod", lopnClsCod);
	vfutBscInqOwnTrdRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnTrdRecT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.ordrQty", lordrQty);
	memcpy(vfutBscInqOwnTrdRecT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnTrdRecT.ordrDat[i]= ' ';
	}
	char lordrDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.ordrDat", lordrDat);
	memcpy(vfutBscInqOwnTrdRecT.ordrDat, lordrDat, DRIV_DATE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscInqOwnTrdRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.currTypCod", lcurrTypCod);
	memcpy(vfutBscInqOwnTrdRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		vfutBscInqOwnTrdRecT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.posTrnTyp", lposTrnTyp);
	memcpy(vfutBscInqOwnTrdRecT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqOwnTrdRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqOwnTrdRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqOwnTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnTrdResponseT getFutBscInqOwnTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqOwnTrdResponseT vfutBscInqOwnTrdResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqOwnTrdResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqOwnTrdResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqOwnTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnTrd.futBscInqOwnTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqOwnTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqOwnTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqOwnTrdRecT getFutExtInqOwnTrdRecT(char* testCaseNum , const char *root) {
	futExtInqOwnTrdRecT vfutExtInqOwnTrdRecT;
	int i;

	char lacctTypCod[1] = {""};
	getStrProperty("InqOwnTrd.futExtInqOwnTrdRecT.acctTypCod", lacctTypCod);
	vfutExtInqOwnTrdRecT.acctTypCod = lacctTypCod[0];

	char lacctTypNo[1] = {""};
	getStrProperty("InqOwnTrd.futExtInqOwnTrdRecT.acctTypNo", lacctTypNo);
	vfutExtInqOwnTrdRecT.acctTypNo = lacctTypNo[0];

	vfutExtInqOwnTrdRecT.txtGrp = getTxtGrpT(testCaseNum, "futExtInqOwnTrdRecT");
	vfutExtInqOwnTrdRecT.gutGrp = getGutGrpT(testCaseNum, "futExtInqOwnTrdRecT");
	for(i=0;i<GRS_BAS_LEN;i++) {
		vfutExtInqOwnTrdRecT.grsBas[i]= ' ';
	}
	char lgrsBas[GRS_BAS_LEN] = {""};
	getStrProperty("InqOwnTrd.futExtInqOwnTrdRecT.grsBas", lgrsBas);
	memcpy(vfutExtInqOwnTrdRecT.grsBas, lgrsBas, GRS_BAS_LEN);

	for(i=0;i<BON_ISIN_COD_LEN;i++) {
		vfutExtInqOwnTrdRecT.bonIsinCod[i]= ' ';
	}
	char lbonIsinCod[BON_ISIN_COD_LEN] = {""};
	getStrProperty("InqOwnTrd.futExtInqOwnTrdRecT.bonIsinCod", lbonIsinCod);
	memcpy(vfutExtInqOwnTrdRecT.bonIsinCod, lbonIsinCod, BON_ISIN_COD_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtInqOwnTrdRecT.swapEndDat[i]= ' ';
	}
	char lswapEndDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnTrd.futExtInqOwnTrdRecT.swapEndDat", lswapEndDat);
	memcpy(vfutExtInqOwnTrdRecT.swapEndDat, lswapEndDat, DRIV_DATE_LEN);

	for(i=0;i<CPN_FIX_RAT_LEN;i++) {
		vfutExtInqOwnTrdRecT.cpnFixRat[i]= ' ';
	}
	char lcpnFixRat[CPN_FIX_RAT_LEN] = {""};
	getStrProperty("InqOwnTrd.futExtInqOwnTrdRecT.cpnFixRat", lcpnFixRat);
	memcpy(vfutExtInqOwnTrdRecT.cpnFixRat, lcpnFixRat, CPN_FIX_RAT_LEN);
	return vfutExtInqOwnTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqOwnTrdResponseT getFutExtInqOwnTrdResponseT(char* testCaseNum , const char *root) {
	futExtInqOwnTrdResponseT vfutExtInqOwnTrdResponseT;
	int i;
	return vfutExtInqOwnTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqOwnTrdRequestT getOptBscInqOwnTrdRequestT(char* testCaseNum , const char *root) {
	optBscInqOwnTrdRequestT voptBscInqOwnTrdRequestT;
	int i;

	voptBscInqOwnTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqOwnTrdRequestT");
	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnTrdRequestT.timMin[i]= ' ';
	}
	char ltimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRequestT.timMin", ltimMin);
	memcpy(voptBscInqOwnTrdRequestT.timMin, ltimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnTrdRequestT.timMax[i]= ' ';
	}
	char ltimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRequestT.timMax", ltimMax);
	memcpy(voptBscInqOwnTrdRequestT.timMax, ltimMax, DRIV_TIME_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRequestT.trdTyp", ltrdTyp);
	voptBscInqOwnTrdRequestT.trdTyp = ltrdTyp[0];

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqOwnTrdRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqOwnTrdRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqOwnTrdRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqOwnTrdRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqOwnTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqOwnTrdRecT getOptBscInqOwnTrdRecT(char* testCaseNum , const char *root) {
	optBscInqOwnTrdRecT voptBscInqOwnTrdRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.buyCod", lbuyCod);
	voptBscInqOwnTrdRecT.buyCod = lbuyCod[0];

	voptBscInqOwnTrdRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqOwnTrdRecT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		voptBscInqOwnTrdRecT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.dblLegTyp", ldblLegTyp);
	memcpy(voptBscInqOwnTrdRecT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	for(i=0;i<STRAT_TYP_LEN;i++) {
		voptBscInqOwnTrdRecT.stratTyp[i]= ' ';
	}
	char lstratTyp[STRAT_TYP_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.stratTyp", lstratTyp);
	memcpy(voptBscInqOwnTrdRecT.stratTyp, lstratTyp, STRAT_TYP_LEN);

	voptBscInqOwnTrdRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqOwnTrdRecT");
	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscInqOwnTrdRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.trnIdNo", ltrnIdNo);
	memcpy(voptBscInqOwnTrdRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lordrPrtFilCod[1] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.ordrPrtFilCod", lordrPrtFilCod);
	voptBscInqOwnTrdRecT.ordrPrtFilCod = lordrPrtFilCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnTrdRecT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.ordrExeQty", lordrExeQty);
	memcpy(voptBscInqOwnTrdRecT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqOwnTrdRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscInqOwnTrdRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lagrsrMtchInd[1] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.agrsrMtchInd", lagrsrMtchInd);
	voptBscInqOwnTrdRecT.agrsrMtchInd = lagrsrMtchInd[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqOwnTrdRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.trnDat", ltrnDat);
	memcpy(voptBscInqOwnTrdRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnTrdRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.trnTim", ltrnTim);
	memcpy(voptBscInqOwnTrdRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.trdTyp", ltrdTyp);
	voptBscInqOwnTrdRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscInqOwnTrdRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.ordrNo", lordrNo);
	memcpy(voptBscInqOwnTrdRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.ordrTypCod", lordrTypCod);
	voptBscInqOwnTrdRecT.ordrTypCod = lordrTypCod[0];

	char lordrResCod[1] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.ordrResCod", lordrResCod);
	voptBscInqOwnTrdRecT.ordrResCod = lordrResCod[0];

	char lopnClsCod[1] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.opnClsCod", lopnClsCod);
	voptBscInqOwnTrdRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnTrdRecT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.ordrQty", lordrQty);
	memcpy(voptBscInqOwnTrdRecT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqOwnTrdRecT.ordrDat[i]= ' ';
	}
	char lordrDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.ordrDat", lordrDat);
	memcpy(voptBscInqOwnTrdRecT.ordrDat, lordrDat, DRIV_DATE_LEN);

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		voptBscInqOwnTrdRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.currTypCod", lcurrTypCod);
	memcpy(voptBscInqOwnTrdRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		voptBscInqOwnTrdRecT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.posTrnTyp", lposTrnTyp);
	memcpy(voptBscInqOwnTrdRecT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscInqOwnTrdRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscInqOwnTrdRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscInqOwnTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqOwnTrdResponseT getOptBscInqOwnTrdResponseT(char* testCaseNum , const char *root) {
	optBscInqOwnTrdResponseT voptBscInqOwnTrdResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqOwnTrdResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqOwnTrdResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqOwnTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnTrd.optBscInqOwnTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqOwnTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqOwnTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqOwnTrdRecT getOptExtInqOwnTrdRecT(char* testCaseNum , const char *root) {
	optExtInqOwnTrdRecT voptExtInqOwnTrdRecT;
	int i;

	voptExtInqOwnTrdRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtInqOwnTrdRecT");
	voptExtInqOwnTrdRecT.txtGrp = getTxtGrpT(testCaseNum, "optExtInqOwnTrdRecT");
	voptExtInqOwnTrdRecT.gutGrp = getGutGrpT(testCaseNum, "optExtInqOwnTrdRecT");	return voptExtInqOwnTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqOwnTrdResponseT getOptExtInqOwnTrdResponseT(char* testCaseNum , const char *root) {
	optExtInqOwnTrdResponseT voptExtInqOwnTrdResponseT;
	int i;
	return voptExtInqOwnTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqOwnTrdRequestT* getFutInqOwnTrdRequestT(char* testCaseNum) {
	vfutInqOwnTrdRequestT = (futInqOwnTrdRequestT*)malloc(sizeof(futInqOwnTrdRequestT));
	int i;

	vfutInqOwnTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqOwnTrdRequestT");
	vfutInqOwnTrdRequestT->basic = getFutBscInqOwnTrdRequestT(testCaseNum, "futInqOwnTrdRequestT");
	return vfutInqOwnTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqOwnTrdResponseT* getFutInqOwnTrdResponseT(char* testCaseNum) {
	vfutInqOwnTrdResponseT = (futInqOwnTrdResponseT*)malloc(sizeof(futInqOwnTrdResponseT));
	int i;

	vfutInqOwnTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqOwnTrdResponseT");
	vfutInqOwnTrdResponseT->basic = getFutBscInqOwnTrdResponseT(testCaseNum, "futInqOwnTrdResponseT");
	vfutInqOwnTrdResponseT->extension = getFutExtInqOwnTrdResponseT(testCaseNum, "futInqOwnTrdResponseT");
	return vfutInqOwnTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqOwnTrdRequestT* getOptInqOwnTrdRequestT(char* testCaseNum) {
	voptInqOwnTrdRequestT = (optInqOwnTrdRequestT*)malloc(sizeof(optInqOwnTrdRequestT));
	int i;

	voptInqOwnTrdRequestT->header = getDataHeaderT(testCaseNum, "optInqOwnTrdRequestT");
	voptInqOwnTrdRequestT->basic = getOptBscInqOwnTrdRequestT(testCaseNum, "optInqOwnTrdRequestT");
	return voptInqOwnTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqOwnTrdResponseT* getOptInqOwnTrdResponseT(char* testCaseNum) {
	voptInqOwnTrdResponseT = (optInqOwnTrdResponseT*)malloc(sizeof(optInqOwnTrdResponseT));
	int i;

	voptInqOwnTrdResponseT->header = getDataHeaderT(testCaseNum, "optInqOwnTrdResponseT");
	voptInqOwnTrdResponseT->basic = getOptBscInqOwnTrdResponseT(testCaseNum, "optInqOwnTrdResponseT");
	voptInqOwnTrdResponseT->extension = getOptExtInqOwnTrdResponseT(testCaseNum, "optInqOwnTrdResponseT");
	return voptInqOwnTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqOwnTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqOwnTrdRequestT));
	futInqOwnTrdRequestT *vfutInqOwnTrdRequestT = getFutInqOwnTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqOwnTrdRequestT), (jbyte*) vfutInqOwnTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqOwnTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqOwnTrdResponseT));
	futInqOwnTrdResponseT *vfutInqOwnTrdResponseT = getFutInqOwnTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqOwnTrdResponseT), (jbyte*) vfutInqOwnTrdResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqOwnTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqOwnTrdRequestT));
	optInqOwnTrdRequestT *voptInqOwnTrdRequestT = getOptInqOwnTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqOwnTrdRequestT), (jbyte*) voptInqOwnTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqOwnTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqOwnTrdResponseT));
	optInqOwnTrdResponseT *voptInqOwnTrdResponseT = getOptInqOwnTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqOwnTrdResponseT), (jbyte*) voptInqOwnTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnTrdRequestT(futBscInqOwnTrdRequestT actual, futBscInqOwnTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_OWN_TRD_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.timMin, expected.timMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRequestT, timMin not matching. Actual %s but Expected %s", actual.timMin, expected.timMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMax, expected.timMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRequestT, timMax not matching. Actual %s but Expected %s", actual.timMax, expected.timMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnTrdRecT(futBscInqOwnTrdRecT actual, futBscInqOwnTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratTyp, expected.stratTyp, STRAT_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, stratTyp not matching. Actual %s but Expected %s", actual.stratTyp, expected.stratTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.ordrPrtFilCod!= expected.ordrPrtFilCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, ordrPrtFilCodnot matching. Actual %d but Expected %d", actual.ordrPrtFilCod, expected.ordrPrtFilCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.agrsrMtchInd!= expected.agrsrMtchInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, agrsrMtchIndnot matching. Actual %d but Expected %d", actual.agrsrMtchInd, expected.agrsrMtchInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrDat, expected.ordrDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, ordrDat not matching. Actual %s but Expected %s", actual.ordrDat, expected.ordrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnTrdResponseT(futBscInqOwnTrdResponseT actual, futBscInqOwnTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_OWN_TRD_REC_MAX;i++) {
		compareFutBscInqOwnTrdRecT (actual.futBscInqOwnTrdRec[i],expected.futBscInqOwnTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqOwnTrdRecT(futExtInqOwnTrdRecT actual, futExtInqOwnTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.acctTypCod!= expected.acctTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnTrdRecT, acctTypCodnot matching. Actual %d but Expected %d", actual.acctTypCod, expected.acctTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.acctTypNo!= expected.acctTypNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnTrdRecT, acctTypNonot matching. Actual %d but Expected %d", actual.acctTypNo, expected.acctTypNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	compareGutGrpT (actual.gutGrp,expected.gutGrp, logMsg);
	if ( memcmp(actual.grsBas, expected.grsBas, GRS_BAS_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnTrdRecT, grsBas not matching. Actual %s but Expected %s", actual.grsBas, expected.grsBas);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.bonIsinCod, expected.bonIsinCod, BON_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnTrdRecT, bonIsinCod not matching. Actual %s but Expected %s", actual.bonIsinCod, expected.bonIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapEndDat, expected.swapEndDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnTrdRecT, swapEndDat not matching. Actual %s but Expected %s", actual.swapEndDat, expected.swapEndDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cpnFixRat, expected.cpnFixRat, CPN_FIX_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnTrdRecT, cpnFixRat not matching. Actual %s but Expected %s", actual.cpnFixRat, expected.cpnFixRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqOwnTrdResponseT(futExtInqOwnTrdResponseT actual, futExtInqOwnTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_OWN_TRD_REC_MAX;i++) {
		compareFutExtInqOwnTrdRecT (actual.futExtInqOwnTrdRec[i],expected.futExtInqOwnTrdRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqOwnTrdRequestT(optBscInqOwnTrdRequestT actual, optBscInqOwnTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_BSC_INQ_OWN_TRD_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.timMin, expected.timMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRequestT, timMin not matching. Actual %s but Expected %s", actual.timMin, expected.timMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMax, expected.timMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRequestT, timMax not matching. Actual %s but Expected %s", actual.timMax, expected.timMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqOwnTrdRecT(optBscInqOwnTrdRecT actual, optBscInqOwnTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratTyp, expected.stratTyp, STRAT_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, stratTyp not matching. Actual %s but Expected %s", actual.stratTyp, expected.stratTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrPrtFilCod!= expected.ordrPrtFilCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, ordrPrtFilCodnot matching. Actual %d but Expected %d", actual.ordrPrtFilCod, expected.ordrPrtFilCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.agrsrMtchInd!= expected.agrsrMtchInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, agrsrMtchIndnot matching. Actual %d but Expected %d", actual.agrsrMtchInd, expected.agrsrMtchInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrDat, expected.ordrDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, ordrDat not matching. Actual %s but Expected %s", actual.ordrDat, expected.ordrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqOwnTrdResponseT(optBscInqOwnTrdResponseT actual, optBscInqOwnTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_OWN_TRD_REC_MAX;i++) {
		compareOptBscInqOwnTrdRecT (actual.optBscInqOwnTrdRec[i],expected.optBscInqOwnTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqOwnTrdRecT(optExtInqOwnTrdRecT actual, optExtInqOwnTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	compareGutGrpT (actual.gutGrp,expected.gutGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqOwnTrdResponseT(optExtInqOwnTrdResponseT actual, optExtInqOwnTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_OWN_TRD_REC_MAX;i++) {
		compareOptExtInqOwnTrdRecT (actual.optExtInqOwnTrdRec[i],expected.optExtInqOwnTrdRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqOwnTrdRequestT(futInqOwnTrdRequestT actual, futInqOwnTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqOwnTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqOwnTrdResponseT(futInqOwnTrdResponseT actual, futInqOwnTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqOwnTrdResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqOwnTrdResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqOwnTrdRequestT(optInqOwnTrdRequestT actual, optInqOwnTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqOwnTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqOwnTrdResponseT(optInqOwnTrdResponseT actual, optInqOwnTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqOwnTrdResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqOwnTrdResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqOwnTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqOwnTrdRequestT *actualData = (futInqOwnTrdRequestT *)msgStruct;
	futInqOwnTrdRequestT* expectedData = getFutInqOwnTrdRequestT(testCaseNum);
	compareFutInqOwnTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqOwnTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqOwnTrdResponseT *actualData = (futInqOwnTrdResponseT *)msgStruct;
	futInqOwnTrdResponseT* expectedData = getFutInqOwnTrdResponseT(testCaseNum);
	compareFutInqOwnTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqOwnTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqOwnTrdRequestT *actualData = (optInqOwnTrdRequestT *)msgStruct;
	optInqOwnTrdRequestT* expectedData = getOptInqOwnTrdRequestT(testCaseNum);
	compareOptInqOwnTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqOwnTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqOwnTrdResponseT *actualData = (optInqOwnTrdResponseT *)msgStruct;
	optInqOwnTrdResponseT* expectedData = getOptInqOwnTrdResponseT(testCaseNum);
	compareOptInqOwnTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
