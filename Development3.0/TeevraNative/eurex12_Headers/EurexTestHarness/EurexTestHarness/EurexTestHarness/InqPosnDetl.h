#include <InqPosnDetl.hxx>
#define BUFFER_SIZE 1000

futInqPosnDetlRequestT *vfutInqPosnDetlRequestT;
futInqPosnDetlResponseT *vfutInqPosnDetlResponseT;
optInqPosnDetlRequestT *voptInqPosnDetlRequestT;
optInqPosnDetlResponseT *voptInqPosnDetlResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqPosnDetlRequestT getFutBscInqPosnDetlRequestT(char* testCaseNum , const char *root) {
	futBscInqPosnDetlRequestT vfutBscInqPosnDetlRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutBscInqPosnDetlRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutBscInqPosnDetlRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscInqPosnDetlRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscInqPosnDetlRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqPosnDetlRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRequestT.trnDat", ltrnDat);
	memcpy(vfutBscInqPosnDetlRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	vfutBscInqPosnDetlRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqPosnDetlRequestT");
	vfutBscInqPosnDetlRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqPosnDetlRequestT");
	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		vfutBscInqPosnDetlRequestT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRequestT.posTrnTyp", lposTrnTyp);
	memcpy(vfutBscInqPosnDetlRequestT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqPosnDetlRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqPosnDetlRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqPosnDetlRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqPosnDetlRequestT getFutExtInqPosnDetlRequestT(char* testCaseNum , const char *root) {
	futExtInqPosnDetlRequestT vfutExtInqPosnDetlRequestT;
	int i;

	vfutExtInqPosnDetlRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtInqPosnDetlRequestT");
	vfutExtInqPosnDetlRequestT.origTrnFiltGrp = getOrigTrnFiltGrpT(testCaseNum, "futExtInqPosnDetlRequestT");	return vfutExtInqPosnDetlRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqPosnDetlRecT getFutBscInqPosnDetlRecT(char* testCaseNum , const char *root) {
	futBscInqPosnDetlRecT vfutBscInqPosnDetlRecT;
	int i;

	vfutBscInqPosnDetlRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqPosnDetlRecT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqPosnDetlRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.ordrNo", lordrNo);
	memcpy(vfutBscInqPosnDetlRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqPosnDetlRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqPosnDetlRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscInqPosnDetlRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "futBscInqPosnDetlRecT");
	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		vfutBscInqPosnDetlRecT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.posTrnTyp", lposTrnTyp);
	memcpy(vfutBscInqPosnDetlRecT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqPosnDetlRecT.prvLngQty[i]= ' ';
	}
	char lprvLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.prvLngQty", lprvLngQty);
	memcpy(vfutBscInqPosnDetlRecT.prvLngQty, lprvLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqPosnDetlRecT.prvShtQty[i]= ' ';
	}
	char lprvShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.prvShtQty", lprvShtQty);
	memcpy(vfutBscInqPosnDetlRecT.prvShtQty, lprvShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqPosnDetlRecT.crtLngQty[i]= ' ';
	}
	char lcrtLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.crtLngQty", lcrtLngQty);
	memcpy(vfutBscInqPosnDetlRecT.crtLngQty, lcrtLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqPosnDetlRecT.crtShtQty[i]= ' ';
	}
	char lcrtShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.crtShtQty", lcrtShtQty);
	memcpy(vfutBscInqPosnDetlRecT.crtShtQty, lcrtShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqPosnDetlRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.trnTim", ltrnTim);
	memcpy(vfutBscInqPosnDetlRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	for(i=0;i<PART_SUB_GRP_COD_LEN;i++) {
		vfutBscInqPosnDetlRecT.partSubGrpCod[i]= ' ';
	}
	char lpartSubGrpCod[PART_SUB_GRP_COD_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.partSubGrpCod", lpartSubGrpCod);
	memcpy(vfutBscInqPosnDetlRecT.partSubGrpCod, lpartSubGrpCod, PART_SUB_GRP_COD_LEN);

	for(i=0;i<PART_NO_LEN;i++) {
		vfutBscInqPosnDetlRecT.partNo[i]= ' ';
	}
	char lpartNo[PART_NO_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.partNo", lpartNo);
	memcpy(vfutBscInqPosnDetlRecT.partNo, lpartNo, PART_NO_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.buyCod", lbuyCod);
	vfutBscInqPosnDetlRecT.buyCod = lbuyCod[0];

	char lopnClsCod[1] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.opnClsCod", lopnClsCod);
	vfutBscInqPosnDetlRecT.opnClsCod = lopnClsCod[0];

	char lgutSts[1] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.gutSts", lgutSts);
	vfutBscInqPosnDetlRecT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqPosnDetlRecT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.lngQty", llngQty);
	memcpy(vfutBscInqPosnDetlRecT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqPosnDetlRecT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.shtQty", lshtQty);
	memcpy(vfutBscInqPosnDetlRecT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqPosnDetlRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscInqPosnDetlRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqPosnDetlRecT.trnVmarAmnt[i]= ' ';
	}
	char ltrnVmarAmnt[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.trnVmarAmnt", ltrnVmarAmnt);
	memcpy(vfutBscInqPosnDetlRecT.trnVmarAmnt, ltrnVmarAmnt, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscInqPosnDetlRecT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(vfutBscInqPosnDetlRecT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqPosnDetlRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqPosnDetlRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqPosnDetlRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqPosnDetlResponseT getFutBscInqPosnDetlResponseT(char* testCaseNum , const char *root) {
	futBscInqPosnDetlResponseT vfutBscInqPosnDetlResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqPosnDetlResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqPosnDetlResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqPosnDetlResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqPosnDetl.futBscInqPosnDetlResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqPosnDetlResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqPosnDetlResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqPosnDetlRecT getFutExtInqPosnDetlRecT(char* testCaseNum , const char *root) {
	futExtInqPosnDetlRecT vfutExtInqPosnDetlRecT;
	int i;

	char ltrdTyp[1] = {""};
	getStrProperty("InqPosnDetl.futExtInqPosnDetlRecT.trdTyp", ltrdTyp);
	vfutExtInqPosnDetlRecT.trdTyp = ltrdTyp[0];

	vfutExtInqPosnDetlRecT.txtGrp = getTxtGrpT(testCaseNum, "futExtInqPosnDetlRecT");
	vfutExtInqPosnDetlRecT.origTrnGrp = getOrigTrnGrpT(testCaseNum, "futExtInqPosnDetlRecT");	return vfutExtInqPosnDetlRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqPosnDetlResponseT getFutExtInqPosnDetlResponseT(char* testCaseNum , const char *root) {
	futExtInqPosnDetlResponseT vfutExtInqPosnDetlResponseT;
	int i;
	return vfutExtInqPosnDetlResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqPosnDetlRequestT getOptBscInqPosnDetlRequestT(char* testCaseNum , const char *root) {
	optBscInqPosnDetlRequestT voptBscInqPosnDetlRequestT;
	int i;

	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptBscInqPosnDetlRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptBscInqPosnDetlRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscInqPosnDetlRequestT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRequestT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscInqPosnDetlRequestT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqPosnDetlRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRequestT.trnDat", ltrnDat);
	memcpy(voptBscInqPosnDetlRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	voptBscInqPosnDetlRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscInqPosnDetlRequestT");
	voptBscInqPosnDetlRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqPosnDetlRequestT");
	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		voptBscInqPosnDetlRequestT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRequestT.posTrnTyp", lposTrnTyp);
	memcpy(voptBscInqPosnDetlRequestT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqPosnDetlRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqPosnDetlRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqPosnDetlRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqPosnDetlRequestT getOptExtInqPosnDetlRequestT(char* testCaseNum , const char *root) {
	optExtInqPosnDetlRequestT voptExtInqPosnDetlRequestT;
	int i;

	voptExtInqPosnDetlRequestT.txtGrp = getTxtGrpT(testCaseNum, "optExtInqPosnDetlRequestT");
	voptExtInqPosnDetlRequestT.origTrnFiltGrp = getOrigTrnFiltGrpT(testCaseNum, "optExtInqPosnDetlRequestT");	return voptExtInqPosnDetlRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqPosnDetlRecT getOptBscInqPosnDetlRecT(char* testCaseNum , const char *root) {
	optBscInqPosnDetlRecT voptBscInqPosnDetlRecT;
	int i;

	voptBscInqPosnDetlRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscInqPosnDetlRecT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscInqPosnDetlRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.ordrNo", lordrNo);
	memcpy(voptBscInqPosnDetlRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscInqPosnDetlRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.trnIdNo", ltrnIdNo);
	memcpy(voptBscInqPosnDetlRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscInqPosnDetlRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "optBscInqPosnDetlRecT");
	for(i=0;i<POS_TRN_TYP_LEN;i++) {
		voptBscInqPosnDetlRecT.posTrnTyp[i]= ' ';
	}
	char lposTrnTyp[POS_TRN_TYP_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.posTrnTyp", lposTrnTyp);
	memcpy(voptBscInqPosnDetlRecT.posTrnTyp, lposTrnTyp, POS_TRN_TYP_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqPosnDetlRecT.prvLngQty[i]= ' ';
	}
	char lprvLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.prvLngQty", lprvLngQty);
	memcpy(voptBscInqPosnDetlRecT.prvLngQty, lprvLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqPosnDetlRecT.prvShtQty[i]= ' ';
	}
	char lprvShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.prvShtQty", lprvShtQty);
	memcpy(voptBscInqPosnDetlRecT.prvShtQty, lprvShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqPosnDetlRecT.crtLngQty[i]= ' ';
	}
	char lcrtLngQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.crtLngQty", lcrtLngQty);
	memcpy(voptBscInqPosnDetlRecT.crtLngQty, lcrtLngQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqPosnDetlRecT.crtShtQty[i]= ' ';
	}
	char lcrtShtQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.crtShtQty", lcrtShtQty);
	memcpy(voptBscInqPosnDetlRecT.crtShtQty, lcrtShtQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqPosnDetlRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.trnTim", ltrnTim);
	memcpy(voptBscInqPosnDetlRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	for(i=0;i<PART_SUB_GRP_COD_LEN;i++) {
		voptBscInqPosnDetlRecT.partSubGrpCod[i]= ' ';
	}
	char lpartSubGrpCod[PART_SUB_GRP_COD_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.partSubGrpCod", lpartSubGrpCod);
	memcpy(voptBscInqPosnDetlRecT.partSubGrpCod, lpartSubGrpCod, PART_SUB_GRP_COD_LEN);

	for(i=0;i<PART_NO_LEN;i++) {
		voptBscInqPosnDetlRecT.partNo[i]= ' ';
	}
	char lpartNo[PART_NO_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.partNo", lpartNo);
	memcpy(voptBscInqPosnDetlRecT.partNo, lpartNo, PART_NO_LEN);

	char lbuyCod[1] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.buyCod", lbuyCod);
	voptBscInqPosnDetlRecT.buyCod = lbuyCod[0];

	char lopnClsCod[1] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.opnClsCod", lopnClsCod);
	voptBscInqPosnDetlRecT.opnClsCod = lopnClsCod[0];

	char lgutSts[1] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.gutSts", lgutSts);
	voptBscInqPosnDetlRecT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqPosnDetlRecT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.lngQty", llngQty);
	memcpy(voptBscInqPosnDetlRecT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqPosnDetlRecT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.shtQty", lshtQty);
	memcpy(voptBscInqPosnDetlRecT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqPosnDetlRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscInqPosnDetlRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscInqPosnDetlRecT.trnPrmAmnt[i]= ' ';
	}
	char ltrnPrmAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.trnPrmAmnt", ltrnPrmAmnt);
	memcpy(voptBscInqPosnDetlRecT.trnPrmAmnt, ltrnPrmAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscInqPosnDetlRecT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(voptBscInqPosnDetlRecT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscInqPosnDetlRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscInqPosnDetlRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscInqPosnDetlRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqPosnDetlResponseT getOptBscInqPosnDetlResponseT(char* testCaseNum , const char *root) {
	optBscInqPosnDetlResponseT voptBscInqPosnDetlResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqPosnDetlResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqPosnDetlResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqPosnDetlResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqPosnDetl.optBscInqPosnDetlResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqPosnDetlResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqPosnDetlResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqPosnDetlRecT getOptExtInqPosnDetlRecT(char* testCaseNum , const char *root) {
	optExtInqPosnDetlRecT voptExtInqPosnDetlRecT;
	int i;

	char ltrdTyp[1] = {""};
	getStrProperty("InqPosnDetl.optExtInqPosnDetlRecT.trdTyp", ltrdTyp);
	voptExtInqPosnDetlRecT.trdTyp = ltrdTyp[0];

	voptExtInqPosnDetlRecT.txtGrp = getTxtGrpT(testCaseNum, "optExtInqPosnDetlRecT");
	voptExtInqPosnDetlRecT.origTrnGrp = getOrigTrnGrpT(testCaseNum, "optExtInqPosnDetlRecT");	return voptExtInqPosnDetlRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqPosnDetlResponseT getOptExtInqPosnDetlResponseT(char* testCaseNum , const char *root) {
	optExtInqPosnDetlResponseT voptExtInqPosnDetlResponseT;
	int i;
	return voptExtInqPosnDetlResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqPosnDetlRequestT* getFutInqPosnDetlRequestT(char* testCaseNum) {
	vfutInqPosnDetlRequestT = (futInqPosnDetlRequestT*)malloc(sizeof(futInqPosnDetlRequestT));
	int i;

	vfutInqPosnDetlRequestT->header = getDataHeaderT(testCaseNum, "futInqPosnDetlRequestT");
	vfutInqPosnDetlRequestT->basic = getFutBscInqPosnDetlRequestT(testCaseNum, "futInqPosnDetlRequestT");
	vfutInqPosnDetlRequestT->extension = getFutExtInqPosnDetlRequestT(testCaseNum, "futInqPosnDetlRequestT");
	return vfutInqPosnDetlRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqPosnDetlResponseT* getFutInqPosnDetlResponseT(char* testCaseNum) {
	vfutInqPosnDetlResponseT = (futInqPosnDetlResponseT*)malloc(sizeof(futInqPosnDetlResponseT));
	int i;

	vfutInqPosnDetlResponseT->header = getDataHeaderT(testCaseNum, "futInqPosnDetlResponseT");
	vfutInqPosnDetlResponseT->basic = getFutBscInqPosnDetlResponseT(testCaseNum, "futInqPosnDetlResponseT");
	vfutInqPosnDetlResponseT->extension = getFutExtInqPosnDetlResponseT(testCaseNum, "futInqPosnDetlResponseT");
	return vfutInqPosnDetlResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqPosnDetlRequestT* getOptInqPosnDetlRequestT(char* testCaseNum) {
	voptInqPosnDetlRequestT = (optInqPosnDetlRequestT*)malloc(sizeof(optInqPosnDetlRequestT));
	int i;

	voptInqPosnDetlRequestT->header = getDataHeaderT(testCaseNum, "optInqPosnDetlRequestT");
	voptInqPosnDetlRequestT->basic = getOptBscInqPosnDetlRequestT(testCaseNum, "optInqPosnDetlRequestT");
	voptInqPosnDetlRequestT->extension = getOptExtInqPosnDetlRequestT(testCaseNum, "optInqPosnDetlRequestT");
	return voptInqPosnDetlRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqPosnDetlResponseT* getOptInqPosnDetlResponseT(char* testCaseNum) {
	voptInqPosnDetlResponseT = (optInqPosnDetlResponseT*)malloc(sizeof(optInqPosnDetlResponseT));
	int i;

	voptInqPosnDetlResponseT->header = getDataHeaderT(testCaseNum, "optInqPosnDetlResponseT");
	voptInqPosnDetlResponseT->basic = getOptBscInqPosnDetlResponseT(testCaseNum, "optInqPosnDetlResponseT");
	voptInqPosnDetlResponseT->extension = getOptExtInqPosnDetlResponseT(testCaseNum, "optInqPosnDetlResponseT");
	return voptInqPosnDetlResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqPosnDetlRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqPosnDetlRequestT));
	futInqPosnDetlRequestT *vfutInqPosnDetlRequestT = getFutInqPosnDetlRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqPosnDetlRequestT), (jbyte*) vfutInqPosnDetlRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqPosnDetlResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqPosnDetlResponseT));
	futInqPosnDetlResponseT *vfutInqPosnDetlResponseT = getFutInqPosnDetlResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqPosnDetlResponseT), (jbyte*) vfutInqPosnDetlResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqPosnDetlRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqPosnDetlRequestT));
	optInqPosnDetlRequestT *voptInqPosnDetlRequestT = getOptInqPosnDetlRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqPosnDetlRequestT), (jbyte*) voptInqPosnDetlRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqPosnDetlResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqPosnDetlResponseT));
	optInqPosnDetlResponseT *voptInqPosnDetlResponseT = getOptInqPosnDetlResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqPosnDetlResponseT), (jbyte*) voptInqPosnDetlResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqPosnDetlRequestT(futBscInqPosnDetlRequestT actual, futBscInqPosnDetlRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRequestT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqPosnDetlRequestT(futExtInqPosnDetlRequestT actual, futExtInqPosnDetlRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	compareOrigTrnFiltGrpT (actual.origTrnFiltGrp,expected.origTrnFiltGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqPosnDetlRecT(futBscInqPosnDetlRecT actual, futBscInqPosnDetlRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvLngQty, expected.prvLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, prvLngQty not matching. Actual %s but Expected %s", actual.prvLngQty, expected.prvLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvShtQty, expected.prvShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, prvShtQty not matching. Actual %s but Expected %s", actual.prvShtQty, expected.prvShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtLngQty, expected.crtLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, crtLngQty not matching. Actual %s but Expected %s", actual.crtLngQty, expected.crtLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtShtQty, expected.crtShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, crtShtQty not matching. Actual %s but Expected %s", actual.crtShtQty, expected.crtShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.partSubGrpCod, expected.partSubGrpCod, PART_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, partSubGrpCod not matching. Actual %s but Expected %s", actual.partSubGrpCod, expected.partSubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.partNo, expected.partNo, PART_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, partNo not matching. Actual %s but Expected %s", actual.partNo, expected.partNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnVmarAmnt, expected.trnVmarAmnt, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, trnVmarAmnt not matching. Actual %s but Expected %s", actual.trnVmarAmnt, expected.trnVmarAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqPosnDetlResponseT(futBscInqPosnDetlResponseT actual, futBscInqPosnDetlResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqPosnDetlResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_POSN_DETL_REC_MAX;i++) {
		compareFutBscInqPosnDetlRecT (actual.futBscInqPosnDetlRec[i],expected.futBscInqPosnDetlRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqPosnDetlRecT(futExtInqPosnDetlRecT actual, futExtInqPosnDetlRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqPosnDetlRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	compareOrigTrnGrpT (actual.origTrnGrp,expected.origTrnGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqPosnDetlResponseT(futExtInqPosnDetlResponseT actual, futExtInqPosnDetlResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_POSN_DETL_REC_MAX;i++) {
		compareFutExtInqPosnDetlRecT (actual.futExtInqPosnDetlRec[i],expected.futExtInqPosnDetlRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqPosnDetlRequestT(optBscInqPosnDetlRequestT actual, optBscInqPosnDetlRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRequestT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRequestT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqPosnDetlRequestT(optExtInqPosnDetlRequestT actual, optExtInqPosnDetlRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	compareOrigTrnFiltGrpT (actual.origTrnFiltGrp,expected.origTrnFiltGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqPosnDetlRecT(optBscInqPosnDetlRecT actual, optBscInqPosnDetlRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if ( memcmp(actual.posTrnTyp, expected.posTrnTyp, POS_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, posTrnTyp not matching. Actual %s but Expected %s", actual.posTrnTyp, expected.posTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvLngQty, expected.prvLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, prvLngQty not matching. Actual %s but Expected %s", actual.prvLngQty, expected.prvLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prvShtQty, expected.prvShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, prvShtQty not matching. Actual %s but Expected %s", actual.prvShtQty, expected.prvShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtLngQty, expected.crtLngQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, crtLngQty not matching. Actual %s but Expected %s", actual.crtLngQty, expected.crtLngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crtShtQty, expected.crtShtQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, crtShtQty not matching. Actual %s but Expected %s", actual.crtShtQty, expected.crtShtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.partSubGrpCod, expected.partSubGrpCod, PART_SUB_GRP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, partSubGrpCod not matching. Actual %s but Expected %s", actual.partSubGrpCod, expected.partSubGrpCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.partNo, expected.partNo, PART_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, partNo not matching. Actual %s but Expected %s", actual.partNo, expected.partNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnPrmAmnt, expected.trnPrmAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, trnPrmAmnt not matching. Actual %s but Expected %s", actual.trnPrmAmnt, expected.trnPrmAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqPosnDetlResponseT(optBscInqPosnDetlResponseT actual, optBscInqPosnDetlResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqPosnDetlResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_POSN_DETL_REC_MAX;i++) {
		compareOptBscInqPosnDetlRecT (actual.optBscInqPosnDetlRec[i],expected.optBscInqPosnDetlRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqPosnDetlRecT(optExtInqPosnDetlRecT actual, optExtInqPosnDetlRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqPosnDetlRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	compareOrigTrnGrpT (actual.origTrnGrp,expected.origTrnGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqPosnDetlResponseT(optExtInqPosnDetlResponseT actual, optExtInqPosnDetlResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_POSN_DETL_REC_MAX;i++) {
		compareOptExtInqPosnDetlRecT (actual.optExtInqPosnDetlRec[i],expected.optExtInqPosnDetlRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqPosnDetlRequestT(futInqPosnDetlRequestT actual, futInqPosnDetlRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqPosnDetlRequestT (actual.basic,expected.basic, logMsg);	compareFutExtInqPosnDetlRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqPosnDetlResponseT(futInqPosnDetlResponseT actual, futInqPosnDetlResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqPosnDetlResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqPosnDetlResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqPosnDetlRequestT(optInqPosnDetlRequestT actual, optInqPosnDetlRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqPosnDetlRequestT (actual.basic,expected.basic, logMsg);	compareOptExtInqPosnDetlRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqPosnDetlResponseT(optInqPosnDetlResponseT actual, optInqPosnDetlResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqPosnDetlResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqPosnDetlResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqPosnDetlRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqPosnDetlRequestT *actualData = (futInqPosnDetlRequestT *)msgStruct;
	futInqPosnDetlRequestT* expectedData = getFutInqPosnDetlRequestT(testCaseNum);
	compareFutInqPosnDetlRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqPosnDetlResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqPosnDetlResponseT *actualData = (futInqPosnDetlResponseT *)msgStruct;
	futInqPosnDetlResponseT* expectedData = getFutInqPosnDetlResponseT(testCaseNum);
	compareFutInqPosnDetlResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqPosnDetlRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqPosnDetlRequestT *actualData = (optInqPosnDetlRequestT *)msgStruct;
	optInqPosnDetlRequestT* expectedData = getOptInqPosnDetlRequestT(testCaseNum);
	compareOptInqPosnDetlRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqPosnDetlResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqPosnDetlResponseT *actualData = (optInqPosnDetlResponseT *)msgStruct;
	optInqPosnDetlResponseT* expectedData = getOptInqPosnDetlResponseT(testCaseNum);
	compareOptInqPosnDetlResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
