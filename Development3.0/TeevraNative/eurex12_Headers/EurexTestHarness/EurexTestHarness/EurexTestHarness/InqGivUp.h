#include <InqGivUp.hxx>
#define BUFFER_SIZE 1000

futInqGivUpRequestT *vfutInqGivUpRequestT;
futInqGivUpResponseT *vfutInqGivUpResponseT;
optInqGivUpRequestT *voptInqGivUpRequestT;
optInqGivUpResponseT *voptInqGivUpResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqGivUpRequestT getFutBscInqGivUpRequestT(char* testCaseNum , const char *root) {
	futBscInqGivUpRequestT vfutBscInqGivUpRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscInqGivUpRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscInqGivUpRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscInqGivUpRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscInqGivUpRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqGivUpRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRequestT.trnDat", ltrnDat);
	memcpy(vfutBscInqGivUpRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqGivUpRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRequestT.ordrNo", lordrNo);
	memcpy(vfutBscInqGivUpRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqGivUpRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRequestT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqGivUpRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lgutSts[1] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRequestT.gutSts", lgutSts);
	vfutBscInqGivUpRequestT.gutSts = lgutSts[0];

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqGivUpRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqGivUpRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqGivUpRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqGivUpRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqGivUpRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqGivUpRequestT getFutExtInqGivUpRequestT(char* testCaseNum , const char *root) {
	futExtInqGivUpRequestT vfutExtInqGivUpRequestT;
	int i;

	char ltrdTyp[1] = {""};
	getStrProperty("InqGivUp.futExtInqGivUpRequestT.trdTyp", ltrdTyp);
	vfutExtInqGivUpRequestT.trdTyp = ltrdTyp[0];

	vfutExtInqGivUpRequestT.txtGrpFilt = getTxtGrpFiltT(testCaseNum, "futExtInqGivUpRequestT");
	vfutExtInqGivUpRequestT.origTrnFiltGrp = getOrigTrnFiltGrpT(testCaseNum, "futExtInqGivUpRequestT");	return vfutExtInqGivUpRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqGivUpRecT getFutBscInqGivUpRecT(char* testCaseNum , const char *root) {
	futBscInqGivUpRecT vfutBscInqGivUpRecT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscInqGivUpRecT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscInqGivUpRecT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscInqGivUpRecT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscInqGivUpRecT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscInqGivUpRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscInqGivUpRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	vfutBscInqGivUpRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futBscInqGivUpRecT");
	vfutBscInqGivUpRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqGivUpRecT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqGivUpRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.trnDat", ltrnDat);
	memcpy(vfutBscInqGivUpRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqGivUpRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.ordrNo", lordrNo);
	memcpy(vfutBscInqGivUpRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqGivUpRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqGivUpRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscInqGivUpRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "futBscInqGivUpRecT");
	char lgutSts[1] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.gutSts", lgutSts);
	vfutBscInqGivUpRecT.gutSts = lgutSts[0];

	char lbuyCod[1] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.buyCod", lbuyCod);
	vfutBscInqGivUpRecT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqGivUpRecT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.lngQty", llngQty);
	memcpy(vfutBscInqGivUpRecT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqGivUpRecT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.shtQty", lshtQty);
	memcpy(vfutBscInqGivUpRecT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.opnClsCod", lopnClsCod);
	vfutBscInqGivUpRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqGivUpRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscInqGivUpRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqGivUpRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqGivUpRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqGivUpRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqGivUpResponseT getFutBscInqGivUpResponseT(char* testCaseNum , const char *root) {
	futBscInqGivUpResponseT vfutBscInqGivUpResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqGivUpResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqGivUpResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqGivUpResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqGivUp.futBscInqGivUpResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqGivUpResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqGivUpResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqGivUpRecT getFutExtInqGivUpRecT(char* testCaseNum , const char *root) {
	futExtInqGivUpRecT vfutExtInqGivUpRecT;
	int i;

	char ltrdTyp[1] = {""};
	getStrProperty("InqGivUp.futExtInqGivUpRecT.trdTyp", ltrdTyp);
	vfutExtInqGivUpRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtInqGivUpRecT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqGivUp.futExtInqGivUpRecT.ordrQty", lordrQty);
	memcpy(vfutExtInqGivUpRecT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtInqGivUpRecT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqGivUp.futExtInqGivUpRecT.ordrExePrc", lordrExePrc);
	memcpy(vfutExtInqGivUpRecT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	vfutExtInqGivUpRecT.txtGrpFrom = getTxtGrpFromT(testCaseNum, "futExtInqGivUpRecT");
	vfutExtInqGivUpRecT.txtGrpTo = getTxtGrpToT(testCaseNum, "futExtInqGivUpRecT");
	vfutExtInqGivUpRecT.origGuTuTrnGrp = getOrigGuTuTrnGrpT(testCaseNum, "futExtInqGivUpRecT");
	vfutExtInqGivUpRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futExtInqGivUpRecT");
	char lagrsrMtchInd[1] = {""};
	getStrProperty("InqGivUp.futExtInqGivUpRecT.agrsrMtchInd", lagrsrMtchInd);
	vfutExtInqGivUpRecT.agrsrMtchInd = lagrsrMtchInd[0];
	return vfutExtInqGivUpRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqGivUpResponseT getFutExtInqGivUpResponseT(char* testCaseNum , const char *root) {
	futExtInqGivUpResponseT vfutExtInqGivUpResponseT;
	int i;
	return vfutExtInqGivUpResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqGivUpRequestT getOptBscInqGivUpRequestT(char* testCaseNum , const char *root) {
	optBscInqGivUpRequestT voptBscInqGivUpRequestT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscInqGivUpRequestT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRequestT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscInqGivUpRequestT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscInqGivUpRequestT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRequestT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscInqGivUpRequestT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqGivUpRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRequestT.trnDat", ltrnDat);
	memcpy(voptBscInqGivUpRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscInqGivUpRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRequestT.ordrNo", lordrNo);
	memcpy(voptBscInqGivUpRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscInqGivUpRequestT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRequestT.trnIdNo", ltrnIdNo);
	memcpy(voptBscInqGivUpRequestT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	char lgutSts[1] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRequestT.gutSts", lgutSts);
	voptBscInqGivUpRequestT.gutSts = lgutSts[0];

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqGivUpRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqGivUpRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqGivUpRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqGivUpRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqGivUpRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqGivUpRequestT getOptExtInqGivUpRequestT(char* testCaseNum , const char *root) {
	optExtInqGivUpRequestT voptExtInqGivUpRequestT;
	int i;

	char ltrdTyp[1] = {""};
	getStrProperty("InqGivUp.optExtInqGivUpRequestT.trdTyp", ltrdTyp);
	voptExtInqGivUpRequestT.trdTyp = ltrdTyp[0];

	voptExtInqGivUpRequestT.txtGrpFilt = getTxtGrpFiltT(testCaseNum, "optExtInqGivUpRequestT");
	voptExtInqGivUpRequestT.origTrnFiltGrp = getOrigTrnFiltGrpT(testCaseNum, "optExtInqGivUpRequestT");	return voptExtInqGivUpRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqGivUpRecT getOptBscInqGivUpRecT(char* testCaseNum , const char *root) {
	optBscInqGivUpRecT voptBscInqGivUpRecT;
	int i;

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscInqGivUpRecT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscInqGivUpRecT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscInqGivUpRecT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscInqGivUpRecT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscInqGivUpRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscInqGivUpRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	voptBscInqGivUpRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optBscInqGivUpRecT");
	voptBscInqGivUpRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqGivUpRecT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqGivUpRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.trnDat", ltrnDat);
	memcpy(voptBscInqGivUpRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscInqGivUpRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.ordrNo", lordrNo);
	memcpy(voptBscInqGivUpRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscInqGivUpRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.trnIdNo", ltrnIdNo);
	memcpy(voptBscInqGivUpRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscInqGivUpRecT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "optBscInqGivUpRecT");
	char lgutSts[1] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.gutSts", lgutSts);
	voptBscInqGivUpRecT.gutSts = lgutSts[0];

	char lbuyCod[1] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.buyCod", lbuyCod);
	voptBscInqGivUpRecT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqGivUpRecT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.lngQty", llngQty);
	memcpy(voptBscInqGivUpRecT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqGivUpRecT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.shtQty", lshtQty);
	memcpy(voptBscInqGivUpRecT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.opnClsCod", lopnClsCod);
	voptBscInqGivUpRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqGivUpRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscInqGivUpRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscInqGivUpRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscInqGivUpRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscInqGivUpRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqGivUpResponseT getOptBscInqGivUpResponseT(char* testCaseNum , const char *root) {
	optBscInqGivUpResponseT voptBscInqGivUpResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqGivUpResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqGivUpResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqGivUpResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqGivUp.optBscInqGivUpResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqGivUpResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqGivUpResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqGivUpRecT getOptExtInqGivUpRecT(char* testCaseNum , const char *root) {
	optExtInqGivUpRecT voptExtInqGivUpRecT;
	int i;

	char ltrdTyp[1] = {""};
	getStrProperty("InqGivUp.optExtInqGivUpRecT.trdTyp", ltrdTyp);
	voptExtInqGivUpRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtInqGivUpRecT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqGivUp.optExtInqGivUpRecT.ordrQty", lordrQty);
	memcpy(voptExtInqGivUpRecT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqGivUpRecT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqGivUp.optExtInqGivUpRecT.ordrExePrc", lordrExePrc);
	memcpy(voptExtInqGivUpRecT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	voptExtInqGivUpRecT.txtGrpFrom = getTxtGrpFromT(testCaseNum, "optExtInqGivUpRecT");
	voptExtInqGivUpRecT.txtGrpTo = getTxtGrpToT(testCaseNum, "optExtInqGivUpRecT");
	voptExtInqGivUpRecT.origGuTuTrnGrp = getOrigGuTuTrnGrpT(testCaseNum, "optExtInqGivUpRecT");
	voptExtInqGivUpRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optExtInqGivUpRecT");
	char lagrsrMtchInd[1] = {""};
	getStrProperty("InqGivUp.optExtInqGivUpRecT.agrsrMtchInd", lagrsrMtchInd);
	voptExtInqGivUpRecT.agrsrMtchInd = lagrsrMtchInd[0];
	return voptExtInqGivUpRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqGivUpResponseT getOptExtInqGivUpResponseT(char* testCaseNum , const char *root) {
	optExtInqGivUpResponseT voptExtInqGivUpResponseT;
	int i;
	return voptExtInqGivUpResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqGivUpRequestT* getFutInqGivUpRequestT(char* testCaseNum) {
	vfutInqGivUpRequestT = (futInqGivUpRequestT*)malloc(sizeof(futInqGivUpRequestT));
	int i;

	vfutInqGivUpRequestT->header = getDataHeaderT(testCaseNum, "futInqGivUpRequestT");
	vfutInqGivUpRequestT->basic = getFutBscInqGivUpRequestT(testCaseNum, "futInqGivUpRequestT");
	vfutInqGivUpRequestT->extension = getFutExtInqGivUpRequestT(testCaseNum, "futInqGivUpRequestT");
	return vfutInqGivUpRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqGivUpResponseT* getFutInqGivUpResponseT(char* testCaseNum) {
	vfutInqGivUpResponseT = (futInqGivUpResponseT*)malloc(sizeof(futInqGivUpResponseT));
	int i;

	vfutInqGivUpResponseT->header = getDataHeaderT(testCaseNum, "futInqGivUpResponseT");
	vfutInqGivUpResponseT->basic = getFutBscInqGivUpResponseT(testCaseNum, "futInqGivUpResponseT");
	vfutInqGivUpResponseT->extension = getFutExtInqGivUpResponseT(testCaseNum, "futInqGivUpResponseT");
	return vfutInqGivUpResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqGivUpRequestT* getOptInqGivUpRequestT(char* testCaseNum) {
	voptInqGivUpRequestT = (optInqGivUpRequestT*)malloc(sizeof(optInqGivUpRequestT));
	int i;

	voptInqGivUpRequestT->header = getDataHeaderT(testCaseNum, "optInqGivUpRequestT");
	voptInqGivUpRequestT->basic = getOptBscInqGivUpRequestT(testCaseNum, "optInqGivUpRequestT");
	voptInqGivUpRequestT->extension = getOptExtInqGivUpRequestT(testCaseNum, "optInqGivUpRequestT");
	return voptInqGivUpRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqGivUpResponseT* getOptInqGivUpResponseT(char* testCaseNum) {
	voptInqGivUpResponseT = (optInqGivUpResponseT*)malloc(sizeof(optInqGivUpResponseT));
	int i;

	voptInqGivUpResponseT->header = getDataHeaderT(testCaseNum, "optInqGivUpResponseT");
	voptInqGivUpResponseT->basic = getOptBscInqGivUpResponseT(testCaseNum, "optInqGivUpResponseT");
	voptInqGivUpResponseT->extension = getOptExtInqGivUpResponseT(testCaseNum, "optInqGivUpResponseT");
	return voptInqGivUpResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqGivUpRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqGivUpRequestT));
	futInqGivUpRequestT *vfutInqGivUpRequestT = getFutInqGivUpRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqGivUpRequestT), (jbyte*) vfutInqGivUpRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqGivUpResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqGivUpResponseT));
	futInqGivUpResponseT *vfutInqGivUpResponseT = getFutInqGivUpResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqGivUpResponseT), (jbyte*) vfutInqGivUpResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqGivUpRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqGivUpRequestT));
	optInqGivUpRequestT *voptInqGivUpRequestT = getOptInqGivUpRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqGivUpRequestT), (jbyte*) voptInqGivUpRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqGivUpResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqGivUpResponseT));
	optInqGivUpResponseT *voptInqGivUpResponseT = getOptInqGivUpResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqGivUpResponseT), (jbyte*) voptInqGivUpResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqGivUpRequestT(futBscInqGivUpRequestT actual, futBscInqGivUpRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_GIV_UP_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRequestT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqGivUpRequestT(futExtInqGivUpRequestT actual, futExtInqGivUpRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqGivUpRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpFiltT (actual.txtGrpFilt,expected.txtGrpFilt, logMsg);
	compareOrigTrnFiltGrpT (actual.origTrnFiltGrp,expected.origTrnFiltGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqGivUpRecT(futBscInqGivUpRecT actual, futBscInqGivUpRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqGivUpResponseT(futBscInqGivUpResponseT actual, futBscInqGivUpResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqGivUpResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_GIV_UP_REC_MAX;i++) {
		compareFutBscInqGivUpRecT (actual.futBscInqGivUpRec[i],expected.futBscInqGivUpRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqGivUpRecT(futExtInqGivUpRecT actual, futExtInqGivUpRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqGivUpRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqGivUpRecT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqGivUpRecT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpFromT (actual.txtGrpFrom,expected.txtGrpFrom, logMsg);
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
	compareOrigGuTuTrnGrpT (actual.origGuTuTrnGrp,expected.origGuTuTrnGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.agrsrMtchInd!= expected.agrsrMtchInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqGivUpRecT, agrsrMtchIndnot matching. Actual %d but Expected %d", actual.agrsrMtchInd, expected.agrsrMtchInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqGivUpResponseT(futExtInqGivUpResponseT actual, futExtInqGivUpResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_GIV_UP_REC_MAX;i++) {
		compareFutExtInqGivUpRecT (actual.futExtInqGivUpRec[i],expected.futExtInqGivUpRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqGivUpRequestT(optBscInqGivUpRequestT actual, optBscInqGivUpRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRequestT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRequestT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_GIV_UP_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRequestT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRequestT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqGivUpRequestT(optExtInqGivUpRequestT actual, optExtInqGivUpRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqGivUpRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpFiltT (actual.txtGrpFilt,expected.txtGrpFilt, logMsg);
	compareOrigTrnFiltGrpT (actual.origTrnFiltGrp,expected.origTrnFiltGrp, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqGivUpRecT(optBscInqGivUpRecT actual, optBscInqGivUpRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqGivUpResponseT(optBscInqGivUpResponseT actual, optBscInqGivUpResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqGivUpResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_GIV_UP_REC_MAX;i++) {
		compareOptBscInqGivUpRecT (actual.optBscInqGivUpRec[i],expected.optBscInqGivUpRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqGivUpRecT(optExtInqGivUpRecT actual, optExtInqGivUpRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqGivUpRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqGivUpRecT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqGivUpRecT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpFromT (actual.txtGrpFrom,expected.txtGrpFrom, logMsg);
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
	compareOrigGuTuTrnGrpT (actual.origGuTuTrnGrp,expected.origGuTuTrnGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.agrsrMtchInd!= expected.agrsrMtchInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqGivUpRecT, agrsrMtchIndnot matching. Actual %d but Expected %d", actual.agrsrMtchInd, expected.agrsrMtchInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqGivUpResponseT(optExtInqGivUpResponseT actual, optExtInqGivUpResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_GIV_UP_REC_MAX;i++) {
		compareOptExtInqGivUpRecT (actual.optExtInqGivUpRec[i],expected.optExtInqGivUpRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqGivUpRequestT(futInqGivUpRequestT actual, futInqGivUpRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqGivUpRequestT (actual.basic,expected.basic, logMsg);	compareFutExtInqGivUpRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqGivUpResponseT(futInqGivUpResponseT actual, futInqGivUpResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqGivUpResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqGivUpResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqGivUpRequestT(optInqGivUpRequestT actual, optInqGivUpRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqGivUpRequestT (actual.basic,expected.basic, logMsg);	compareOptExtInqGivUpRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqGivUpResponseT(optInqGivUpResponseT actual, optInqGivUpResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqGivUpResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqGivUpResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqGivUpRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqGivUpRequestT *actualData = (futInqGivUpRequestT *)msgStruct;
	futInqGivUpRequestT* expectedData = getFutInqGivUpRequestT(testCaseNum);
	compareFutInqGivUpRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqGivUpResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqGivUpResponseT *actualData = (futInqGivUpResponseT *)msgStruct;
	futInqGivUpResponseT* expectedData = getFutInqGivUpResponseT(testCaseNum);
	compareFutInqGivUpResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqGivUpRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqGivUpRequestT *actualData = (optInqGivUpRequestT *)msgStruct;
	optInqGivUpRequestT* expectedData = getOptInqGivUpRequestT(testCaseNum);
	compareOptInqGivUpRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqGivUpResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqGivUpResponseT *actualData = (optInqGivUpResponseT *)msgStruct;
	optInqGivUpResponseT* expectedData = getOptInqGivUpResponseT(testCaseNum);
	compareOptInqGivUpResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
