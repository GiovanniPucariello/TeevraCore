#include <InqTakUp.hxx>
#define BUFFER_SIZE 1000

futInqTakUpRequestT *vfutInqTakUpRequestT;
futInqTakUpResponseT *vfutInqTakUpResponseT;
optInqTakUpRequestT *voptInqTakUpRequestT;
optInqTakUpResponseT *voptInqTakUpResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqTakUpRequestT getFutBscInqTakUpRequestT(char* testCaseNum , const char *root) {
	futBscInqTakUpRequestT vfutBscInqTakUpRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		vfutBscInqTakUpRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(vfutBscInqTakUpRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscInqTakUpRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscInqTakUpRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	vfutBscInqTakUpRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqTakUpRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqTakUpRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRequestT.trnDat", ltrnDat);
	memcpy(vfutBscInqTakUpRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqTakUpRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRequestT.ordrNo", lordrNo);
	memcpy(vfutBscInqTakUpRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqTakUpRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqTakUpRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lgutSts[1] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRequestT.gutSts", lgutSts);
	vfutBscInqTakUpRequestT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscInqTakUpRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscInqTakUpRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqTakUpRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqTakUpRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqTakUpRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqTakUpRequestT getFutExtInqTakUpRequestT(char* testCaseNum , const char *root) {
	futExtInqTakUpRequestT vfutExtInqTakUpRequestT;
	int i;

	char ltrdTyp[1] = {""};
	getStrProperty("InqTakUp.futExtInqTakUpRequestT.trdTyp", ltrdTyp);
	vfutExtInqTakUpRequestT.trdTyp = ltrdTyp[0];

	vfutExtInqTakUpRequestT.txtGrpFilt = getTxtGrpFiltT(testCaseNum, "futExtInqTakUpRequestT");
	vfutExtInqTakUpRequestT.origTrnFiltGrp = getOrigTrnFiltGrpT(testCaseNum, "futExtInqTakUpRequestT");	return vfutExtInqTakUpRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqTakUpRecT getFutBscInqTakUpRecT(char* testCaseNum , const char *root) {
	futBscInqTakUpRecT vfutBscInqTakUpRecT;
	int i;

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscInqTakUpRecT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscInqTakUpRecT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		vfutBscInqTakUpRecT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(vfutBscInqTakUpRecT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscInqTakUpRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscInqTakUpRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	vfutBscInqTakUpRecT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "futBscInqTakUpRecT");
	vfutBscInqTakUpRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqTakUpRecT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqTakUpRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.trnDat", ltrnDat);
	memcpy(vfutBscInqTakUpRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqTakUpRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.ordrNo", lordrNo);
	memcpy(vfutBscInqTakUpRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqTakUpRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqTakUpRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscInqTakUpRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "futBscInqTakUpRecT");
	char lgutSts[1] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.gutSts", lgutSts);
	vfutBscInqTakUpRecT.gutSts = lgutSts[0];

	char lgivUpHistInd[1] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.givUpHistInd", lgivUpHistInd);
	vfutBscInqTakUpRecT.givUpHistInd = lgivUpHistInd[0];

	char lbuyCod[1] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.buyCod", lbuyCod);
	vfutBscInqTakUpRecT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqTakUpRecT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.lngQty", llngQty);
	memcpy(vfutBscInqTakUpRecT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqTakUpRecT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.shtQty", lshtQty);
	memcpy(vfutBscInqTakUpRecT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.opnClsCod", lopnClsCod);
	vfutBscInqTakUpRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqTakUpRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscInqTakUpRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqTakUpRecT.trnVmarAmnt[i]= ' ';
	}
	char ltrnVmarAmnt[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.trnVmarAmnt", ltrnVmarAmnt);
	memcpy(vfutBscInqTakUpRecT.trnVmarAmnt, ltrnVmarAmnt, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscInqTakUpRecT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(vfutBscInqTakUpRecT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqTakUpRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqTakUpRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqTakUpRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqTakUpResponseT getFutBscInqTakUpResponseT(char* testCaseNum , const char *root) {
	futBscInqTakUpResponseT vfutBscInqTakUpResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqTakUpResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqTakUpResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqTakUpResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqTakUp.futBscInqTakUpResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqTakUpResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqTakUpResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqTakUpRecT getFutExtInqTakUpRecT(char* testCaseNum , const char *root) {
	futExtInqTakUpRecT vfutExtInqTakUpRecT;
	int i;

	char ltrdTyp[1] = {""};
	getStrProperty("InqTakUp.futExtInqTakUpRecT.trdTyp", ltrdTyp);
	vfutExtInqTakUpRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtInqTakUpRecT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqTakUp.futExtInqTakUpRecT.ordrQty", lordrQty);
	memcpy(vfutExtInqTakUpRecT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	vfutExtInqTakUpRecT.txtGrpFrom = getTxtGrpFromT(testCaseNum, "futExtInqTakUpRecT");
	vfutExtInqTakUpRecT.txtGrpTo = getTxtGrpToT(testCaseNum, "futExtInqTakUpRecT");
	vfutExtInqTakUpRecT.origGuTuTrnGrp = getOrigGuTuTrnGrpT(testCaseNum, "futExtInqTakUpRecT");
	char lagrsrMtchInd[1] = {""};
	getStrProperty("InqTakUp.futExtInqTakUpRecT.agrsrMtchInd", lagrsrMtchInd);
	vfutExtInqTakUpRecT.agrsrMtchInd = lagrsrMtchInd[0];
	return vfutExtInqTakUpRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqTakUpResponseT getFutExtInqTakUpResponseT(char* testCaseNum , const char *root) {
	futExtInqTakUpResponseT vfutExtInqTakUpResponseT;
	int i;
	return vfutExtInqTakUpResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqTakUpRequestT getOptBscInqTakUpRequestT(char* testCaseNum , const char *root) {
	optBscInqTakUpRequestT voptBscInqTakUpRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		voptBscInqTakUpRequestT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRequestT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(voptBscInqTakUpRequestT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscInqTakUpRequestT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRequestT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscInqTakUpRequestT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	voptBscInqTakUpRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqTakUpRequestT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqTakUpRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRequestT.trnDat", ltrnDat);
	memcpy(voptBscInqTakUpRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscInqTakUpRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRequestT.ordrNo", lordrNo);
	memcpy(voptBscInqTakUpRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscInqTakUpRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscInqTakUpRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lgutSts[1] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRequestT.gutSts", lgutSts);
	voptBscInqTakUpRequestT.gutSts = lgutSts[0];

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscInqTakUpRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscInqTakUpRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqTakUpRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqTakUpRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqTakUpRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqTakUpRequestT getOptExtInqTakUpRequestT(char* testCaseNum , const char *root) {
	optExtInqTakUpRequestT voptExtInqTakUpRequestT;
	int i;

	char ltrdTyp[1] = {""};
	getStrProperty("InqTakUp.optExtInqTakUpRequestT.trdTyp", ltrdTyp);
	voptExtInqTakUpRequestT.trdTyp = ltrdTyp[0];

	voptExtInqTakUpRequestT.txtGrpFilt = getTxtGrpFiltT(testCaseNum, "optExtInqTakUpRequestT");
	voptExtInqTakUpRequestT.origTrnFiltGrp = getOrigTrnFiltGrpT(testCaseNum, "optExtInqTakUpRequestT");	return voptExtInqTakUpRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqTakUpRecT getOptBscInqTakUpRecT(char* testCaseNum , const char *root) {
	optBscInqTakUpRecT voptBscInqTakUpRecT;
	int i;

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscInqTakUpRecT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscInqTakUpRecT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		voptBscInqTakUpRecT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(voptBscInqTakUpRecT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscInqTakUpRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscInqTakUpRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	voptBscInqTakUpRecT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "optBscInqTakUpRecT");
	voptBscInqTakUpRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqTakUpRecT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqTakUpRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.trnDat", ltrnDat);
	memcpy(voptBscInqTakUpRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscInqTakUpRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.ordrNo", lordrNo);
	memcpy(voptBscInqTakUpRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscInqTakUpRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.trnIdNo", ltrnIdNo);
	memcpy(voptBscInqTakUpRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscInqTakUpRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "optBscInqTakUpRecT");
	char lgutSts[1] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.gutSts", lgutSts);
	voptBscInqTakUpRecT.gutSts = lgutSts[0];

	char lgivUpHistInd[1] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.givUpHistInd", lgivUpHistInd);
	voptBscInqTakUpRecT.givUpHistInd = lgivUpHistInd[0];

	char lbuyCod[1] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.buyCod", lbuyCod);
	voptBscInqTakUpRecT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqTakUpRecT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.lngQty", llngQty);
	memcpy(voptBscInqTakUpRecT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqTakUpRecT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.shtQty", lshtQty);
	memcpy(voptBscInqTakUpRecT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.opnClsCod", lopnClsCod);
	voptBscInqTakUpRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqTakUpRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscInqTakUpRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscInqTakUpRecT.trnPrmAmnt[i]= ' ';
	}
	char ltrnPrmAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.trnPrmAmnt", ltrnPrmAmnt);
	memcpy(voptBscInqTakUpRecT.trnPrmAmnt, ltrnPrmAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscInqTakUpRecT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(voptBscInqTakUpRecT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscInqTakUpRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscInqTakUpRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscInqTakUpRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqTakUpResponseT getOptBscInqTakUpResponseT(char* testCaseNum , const char *root) {
	optBscInqTakUpResponseT voptBscInqTakUpResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqTakUpResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqTakUpResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqTakUpResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqTakUp.optBscInqTakUpResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqTakUpResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqTakUpResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqTakUpRecT getOptExtInqTakUpRecT(char* testCaseNum , const char *root) {
	optExtInqTakUpRecT voptExtInqTakUpRecT;
	int i;

	char ltrdTyp[1] = {""};
	getStrProperty("InqTakUp.optExtInqTakUpRecT.trdTyp", ltrdTyp);
	voptExtInqTakUpRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtInqTakUpRecT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqTakUp.optExtInqTakUpRecT.ordrQty", lordrQty);
	memcpy(voptExtInqTakUpRecT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	voptExtInqTakUpRecT.txtGrpFrom = getTxtGrpFromT(testCaseNum, "optExtInqTakUpRecT");
	voptExtInqTakUpRecT.txtGrpTo = getTxtGrpToT(testCaseNum, "optExtInqTakUpRecT");
	voptExtInqTakUpRecT.origGuTuTrnGrp = getOrigGuTuTrnGrpT(testCaseNum, "optExtInqTakUpRecT");
	char lagrsrMtchInd[1] = {""};
	getStrProperty("InqTakUp.optExtInqTakUpRecT.agrsrMtchInd", lagrsrMtchInd);
	voptExtInqTakUpRecT.agrsrMtchInd = lagrsrMtchInd[0];
	return voptExtInqTakUpRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqTakUpResponseT getOptExtInqTakUpResponseT(char* testCaseNum , const char *root) {
	optExtInqTakUpResponseT voptExtInqTakUpResponseT;
	int i;
	return voptExtInqTakUpResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqTakUpRequestT* getFutInqTakUpRequestT(char* testCaseNum) {
	vfutInqTakUpRequestT = (futInqTakUpRequestT*)malloc(sizeof(futInqTakUpRequestT));
	int i;

	vfutInqTakUpRequestT->header = getDataHeaderT(testCaseNum, "futInqTakUpRequestT");
	vfutInqTakUpRequestT->basic = getFutBscInqTakUpRequestT(testCaseNum, "futInqTakUpRequestT");
	vfutInqTakUpRequestT->extension = getFutExtInqTakUpRequestT(testCaseNum, "futInqTakUpRequestT");
	return vfutInqTakUpRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqTakUpResponseT* getFutInqTakUpResponseT(char* testCaseNum) {
	vfutInqTakUpResponseT = (futInqTakUpResponseT*)malloc(sizeof(futInqTakUpResponseT));
	int i;

	vfutInqTakUpResponseT->header = getDataHeaderT(testCaseNum, "futInqTakUpResponseT");
	vfutInqTakUpResponseT->basic = getFutBscInqTakUpResponseT(testCaseNum, "futInqTakUpResponseT");
	vfutInqTakUpResponseT->extension = getFutExtInqTakUpResponseT(testCaseNum, "futInqTakUpResponseT");
	return vfutInqTakUpResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqTakUpRequestT* getOptInqTakUpRequestT(char* testCaseNum) {
	voptInqTakUpRequestT = (optInqTakUpRequestT*)malloc(sizeof(optInqTakUpRequestT));
	int i;

	voptInqTakUpRequestT->header = getDataHeaderT(testCaseNum, "optInqTakUpRequestT");
	voptInqTakUpRequestT->basic = getOptBscInqTakUpRequestT(testCaseNum, "optInqTakUpRequestT");
	voptInqTakUpRequestT->extension = getOptExtInqTakUpRequestT(testCaseNum, "optInqTakUpRequestT");
	return voptInqTakUpRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqTakUpResponseT* getOptInqTakUpResponseT(char* testCaseNum) {
	voptInqTakUpResponseT = (optInqTakUpResponseT*)malloc(sizeof(optInqTakUpResponseT));
	int i;

	voptInqTakUpResponseT->header = getDataHeaderT(testCaseNum, "optInqTakUpResponseT");
	voptInqTakUpResponseT->basic = getOptBscInqTakUpResponseT(testCaseNum, "optInqTakUpResponseT");
	voptInqTakUpResponseT->extension = getOptExtInqTakUpResponseT(testCaseNum, "optInqTakUpResponseT");
	return voptInqTakUpResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqTakUpRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqTakUpRequestT));
	futInqTakUpRequestT *vfutInqTakUpRequestT = getFutInqTakUpRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqTakUpRequestT), (jbyte*) vfutInqTakUpRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqTakUpResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqTakUpResponseT));
	futInqTakUpResponseT *vfutInqTakUpResponseT = getFutInqTakUpResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqTakUpResponseT), (jbyte*) vfutInqTakUpResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqTakUpRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqTakUpRequestT));
	optInqTakUpRequestT *voptInqTakUpRequestT = getOptInqTakUpRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqTakUpRequestT), (jbyte*) voptInqTakUpRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqTakUpResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqTakUpResponseT));
	optInqTakUpResponseT *voptInqTakUpResponseT = getOptInqTakUpResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqTakUpResponseT), (jbyte*) voptInqTakUpResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqTakUpRequestT(futBscInqTakUpRequestT actual, futBscInqTakUpRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRequestT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqTakUpRequestT(futExtInqTakUpRequestT actual, futExtInqTakUpRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqTakUpRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpFiltT (actual.txtGrpFilt,expected.txtGrpFilt, logMsg);
	compareOrigTrnFiltGrpT (actual.origTrnFiltGrp,expected.origTrnFiltGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqTakUpRecT(futBscInqTakUpRecT actual, futBscInqTakUpRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.givUpHistInd!= expected.givUpHistInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, givUpHistIndnot matching. Actual %d but Expected %d", actual.givUpHistInd, expected.givUpHistInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnVmarAmnt, expected.trnVmarAmnt, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, trnVmarAmnt not matching. Actual %s but Expected %s", actual.trnVmarAmnt, expected.trnVmarAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqTakUpResponseT(futBscInqTakUpResponseT actual, futBscInqTakUpResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqTakUpResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_TAK_UP_REC_MAX;i++) {
		compareFutBscInqTakUpRecT (actual.futBscInqTakUpRec[i],expected.futBscInqTakUpRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqTakUpRecT(futExtInqTakUpRecT actual, futExtInqTakUpRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqTakUpRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqTakUpRecT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpFromT (actual.txtGrpFrom,expected.txtGrpFrom, logMsg);
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
	compareOrigGuTuTrnGrpT (actual.origGuTuTrnGrp,expected.origGuTuTrnGrp, logMsg);
	if (actual.agrsrMtchInd!= expected.agrsrMtchInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqTakUpRecT, agrsrMtchIndnot matching. Actual %d but Expected %d", actual.agrsrMtchInd, expected.agrsrMtchInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqTakUpResponseT(futExtInqTakUpResponseT actual, futExtInqTakUpResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_TAK_UP_REC_MAX;i++) {
		compareFutExtInqTakUpRecT (actual.futExtInqTakUpRec[i],expected.futExtInqTakUpRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqTakUpRequestT(optBscInqTakUpRequestT actual, optBscInqTakUpRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRequestT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRequestT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRequestT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqTakUpRequestT(optExtInqTakUpRequestT actual, optExtInqTakUpRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqTakUpRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpFiltT (actual.txtGrpFilt,expected.txtGrpFilt, logMsg);
	compareOrigTrnFiltGrpT (actual.origTrnFiltGrp,expected.origTrnFiltGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqTakUpRecT(optBscInqTakUpRecT actual, optBscInqTakUpRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.givUpHistInd!= expected.givUpHistInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, givUpHistIndnot matching. Actual %d but Expected %d", actual.givUpHistInd, expected.givUpHistInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnPrmAmnt, expected.trnPrmAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, trnPrmAmnt not matching. Actual %s but Expected %s", actual.trnPrmAmnt, expected.trnPrmAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqTakUpResponseT(optBscInqTakUpResponseT actual, optBscInqTakUpResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqTakUpResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_TAK_UP_REC_MAX;i++) {
		compareOptBscInqTakUpRecT (actual.optBscInqTakUpRec[i],expected.optBscInqTakUpRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqTakUpRecT(optExtInqTakUpRecT actual, optExtInqTakUpRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqTakUpRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqTakUpRecT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpFromT (actual.txtGrpFrom,expected.txtGrpFrom, logMsg);
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
	compareOrigGuTuTrnGrpT (actual.origGuTuTrnGrp,expected.origGuTuTrnGrp, logMsg);
	if (actual.agrsrMtchInd!= expected.agrsrMtchInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqTakUpRecT, agrsrMtchIndnot matching. Actual %d but Expected %d", actual.agrsrMtchInd, expected.agrsrMtchInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqTakUpResponseT(optExtInqTakUpResponseT actual, optExtInqTakUpResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_TAK_UP_REC_MAX;i++) {
		compareOptExtInqTakUpRecT (actual.optExtInqTakUpRec[i],expected.optExtInqTakUpRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqTakUpRequestT(futInqTakUpRequestT actual, futInqTakUpRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqTakUpRequestT (actual.basic,expected.basic, logMsg);	compareFutExtInqTakUpRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqTakUpResponseT(futInqTakUpResponseT actual, futInqTakUpResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqTakUpResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqTakUpResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqTakUpRequestT(optInqTakUpRequestT actual, optInqTakUpRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqTakUpRequestT (actual.basic,expected.basic, logMsg);	compareOptExtInqTakUpRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqTakUpResponseT(optInqTakUpResponseT actual, optInqTakUpResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqTakUpResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqTakUpResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqTakUpRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqTakUpRequestT *actualData = (futInqTakUpRequestT *)msgStruct;
	futInqTakUpRequestT* expectedData = getFutInqTakUpRequestT(testCaseNum);
	compareFutInqTakUpRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqTakUpResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqTakUpResponseT *actualData = (futInqTakUpResponseT *)msgStruct;
	futInqTakUpResponseT* expectedData = getFutInqTakUpResponseT(testCaseNum);
	compareFutInqTakUpResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqTakUpRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqTakUpRequestT *actualData = (optInqTakUpRequestT *)msgStruct;
	optInqTakUpRequestT* expectedData = getOptInqTakUpRequestT(testCaseNum);
	compareOptInqTakUpRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqTakUpResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqTakUpResponseT *actualData = (optInqTakUpResponseT *)msgStruct;
	optInqTakUpResponseT* expectedData = getOptInqTakUpResponseT(testCaseNum);
	compareOptInqTakUpResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
