#include <SubGivUpTakUp.hxx>
#define BUFFER_SIZE 1000

futSubGivUpTakUpPrivBcastT *vfutSubGivUpTakUpPrivBcastT;
futBscSubGivUpTakUpSubjectT *vfutBscSubGivUpTakUpSubjectT;
optSubGivUpTakUpPrivBcastT *voptSubGivUpTakUpPrivBcastT;
optBscSubGivUpTakUpSubjectT *voptBscSubGivUpTakUpSubjectT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSubGivUpTakUpPrivBcastT getFutBscSubGivUpTakUpPrivBcastT(char* testCaseNum , const char *root) {
	futBscSubGivUpTakUpPrivBcastT vfutBscSubGivUpTakUpPrivBcastT;
	int i;

	char lgivUpTakUpInd[1] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.givUpTakUpInd", lgivUpTakUpInd);
	vfutBscSubGivUpTakUpPrivBcastT.givUpTakUpInd = lgivUpTakUpInd[0];

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	vfutBscSubGivUpTakUpPrivBcastT.acctTypCodFromGrp = getAcctTypCodFromGrpT(testCaseNum, "futBscSubGivUpTakUpPrivBcastT");
	vfutBscSubGivUpTakUpPrivBcastT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "futBscSubGivUpTakUpPrivBcastT");
	vfutBscSubGivUpTakUpPrivBcastT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscSubGivUpTakUpPrivBcastT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.trnDat", ltrnDat);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.ordrNo", lordrNo);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	vfutBscSubGivUpTakUpPrivBcastT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "futBscSubGivUpTakUpPrivBcastT");
	char lgutSts[1] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.gutSts", lgutSts);
	vfutBscSubGivUpTakUpPrivBcastT.gutSts = lgutSts[0];

	char lgutStsTrnsCod[1] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.gutStsTrnsCod", lgutStsTrnsCod);
	vfutBscSubGivUpTakUpPrivBcastT.gutStsTrnsCod = lgutStsTrnsCod[0];

	char lbuyCod[1] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.buyCod", lbuyCod);
	vfutBscSubGivUpTakUpPrivBcastT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.lngQty", llngQty);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.shtQty", lshtQty);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.opnClsCod", lopnClsCod);
	vfutBscSubGivUpTakUpPrivBcastT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.trnVmarAmnt[i]= ' ';
	}
	char ltrnVmarAmnt[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.trnVmarAmnt", ltrnVmarAmnt);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.trnVmarAmnt, ltrnVmarAmnt, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscSubGivUpTakUpPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscSubGivUpTakUpPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscSubGivUpTakUpPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtSubGivUpTakUpPrivBcastT getFutExtSubGivUpTakUpPrivBcastT(char* testCaseNum , const char *root) {
	futExtSubGivUpTakUpPrivBcastT vfutExtSubGivUpTakUpPrivBcastT;
	int i;

	vfutExtSubGivUpTakUpPrivBcastT.txtGrpFrom = getTxtGrpFromT(testCaseNum, "futExtSubGivUpTakUpPrivBcastT");
	vfutExtSubGivUpTakUpPrivBcastT.txtGrpTo = getTxtGrpToT(testCaseNum, "futExtSubGivUpTakUpPrivBcastT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubGivUpTakUpPrivBcastT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futExtSubGivUpTakUpPrivBcastT.ordrQty", lordrQty);
	memcpy(vfutExtSubGivUpTakUpPrivBcastT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtSubGivUpTakUpPrivBcastT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futExtSubGivUpTakUpPrivBcastT.ordrExePrc", lordrExePrc);
	memcpy(vfutExtSubGivUpTakUpPrivBcastT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("SubGivUpTakUp.futExtSubGivUpTakUpPrivBcastT.trdTyp", ltrdTyp);
	vfutExtSubGivUpTakUpPrivBcastT.trdTyp = ltrdTyp[0];

	vfutExtSubGivUpTakUpPrivBcastT.origGuTuTrnGrp = getOrigGuTuTrnGrpT(testCaseNum, "futExtSubGivUpTakUpPrivBcastT");
	vfutExtSubGivUpTakUpPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futExtSubGivUpTakUpPrivBcastT");	return vfutExtSubGivUpTakUpPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscSubGivUpTakUpPrivBcastT getOptBscSubGivUpTakUpPrivBcastT(char* testCaseNum , const char *root) {
	optBscSubGivUpTakUpPrivBcastT voptBscSubGivUpTakUpPrivBcastT;
	int i;

	char lgivUpTakUpInd[1] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.givUpTakUpInd", lgivUpTakUpInd);
	voptBscSubGivUpTakUpPrivBcastT.givUpTakUpInd = lgivUpTakUpInd[0];

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_FROM_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.membClgIdCodFrom[i]= ' ';
	}
	char lmembClgIdCodFrom[DRIV_MEMB_CLG_ID_COD_FROM_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.membClgIdCodFrom", lmembClgIdCodFrom);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.membClgIdCodFrom, lmembClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_FROM_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.membExchIdCodFrom[i]= ' ';
	}
	char lmembExchIdCodFrom[DRIV_MEMB_EXCH_ID_COD_FROM_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.membExchIdCodFrom", lmembExchIdCodFrom);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.membExchIdCodFrom, lmembExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN);

	for(i=0;i<DRIV_MEMB_CLG_ID_COD_TO_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.membClgIdCodTo[i]= ' ';
	}
	char lmembClgIdCodTo[DRIV_MEMB_CLG_ID_COD_TO_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.membClgIdCodTo", lmembClgIdCodTo);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.membClgIdCodTo, lmembClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN);

	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	voptBscSubGivUpTakUpPrivBcastT.acctTypCodFromGrp = getAcctTypCodFromGrpT(testCaseNum, "optBscSubGivUpTakUpPrivBcastT");
	voptBscSubGivUpTakUpPrivBcastT.acctTypCodToGrp = getAcctTypCodToGrpT(testCaseNum, "optBscSubGivUpTakUpPrivBcastT");
	voptBscSubGivUpTakUpPrivBcastT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscSubGivUpTakUpPrivBcastT");
	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.trnDat", ltrnDat);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.ordrNo", lordrNo);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.trnIdNo", ltrnIdNo);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	voptBscSubGivUpTakUpPrivBcastT.trnIdSfxGrp = getTrnIdSfxGrpT(testCaseNum, "optBscSubGivUpTakUpPrivBcastT");
	char lgutSts[1] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.gutSts", lgutSts);
	voptBscSubGivUpTakUpPrivBcastT.gutSts = lgutSts[0];

	char lgutStsTrnsCod[1] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.gutStsTrnsCod", lgutStsTrnsCod);
	voptBscSubGivUpTakUpPrivBcastT.gutStsTrnsCod = lgutStsTrnsCod[0];

	char lbuyCod[1] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.buyCod", lbuyCod);
	voptBscSubGivUpTakUpPrivBcastT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.lngQty[i]= ' ';
	}
	char llngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.lngQty", llngQty);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.lngQty, llngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.shtQty[i]= ' ';
	}
	char lshtQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.shtQty", lshtQty);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.shtQty, lshtQty, DRIV_VOLUME_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.opnClsCod", lopnClsCod);
	voptBscSubGivUpTakUpPrivBcastT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.trnPrmAmnt[i]= ' ';
	}
	char ltrnPrmAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.trnPrmAmnt", ltrnPrmAmnt);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.trnPrmAmnt, ltrnPrmAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_AMOUNT_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.trnFeeAmnt[i]= ' ';
	}
	char ltrnFeeAmnt[DRIV_AMOUNT_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.trnFeeAmnt", ltrnFeeAmnt);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.trnFeeAmnt, ltrnFeeAmnt, DRIV_AMOUNT_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscSubGivUpTakUpPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscSubGivUpTakUpPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscSubGivUpTakUpPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtSubGivUpTakUpPrivBcastT getOptExtSubGivUpTakUpPrivBcastT(char* testCaseNum , const char *root) {
	optExtSubGivUpTakUpPrivBcastT voptExtSubGivUpTakUpPrivBcastT;
	int i;

	voptExtSubGivUpTakUpPrivBcastT.txtGrpFrom = getTxtGrpFromT(testCaseNum, "optExtSubGivUpTakUpPrivBcastT");
	voptExtSubGivUpTakUpPrivBcastT.txtGrpTo = getTxtGrpToT(testCaseNum, "optExtSubGivUpTakUpPrivBcastT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtSubGivUpTakUpPrivBcastT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optExtSubGivUpTakUpPrivBcastT.ordrQty", lordrQty);
	memcpy(voptExtSubGivUpTakUpPrivBcastT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtSubGivUpTakUpPrivBcastT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optExtSubGivUpTakUpPrivBcastT.ordrExePrc", lordrExePrc);
	memcpy(voptExtSubGivUpTakUpPrivBcastT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("SubGivUpTakUp.optExtSubGivUpTakUpPrivBcastT.trdTyp", ltrdTyp);
	voptExtSubGivUpTakUpPrivBcastT.trdTyp = ltrdTyp[0];

	voptExtSubGivUpTakUpPrivBcastT.origGuTuTrnGrp = getOrigGuTuTrnGrpT(testCaseNum, "optExtSubGivUpTakUpPrivBcastT");
	voptExtSubGivUpTakUpPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optExtSubGivUpTakUpPrivBcastT");	return voptExtSubGivUpTakUpPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futSubGivUpTakUpPrivBcastT* getFutSubGivUpTakUpPrivBcastT(char* testCaseNum) {
	vfutSubGivUpTakUpPrivBcastT = (futSubGivUpTakUpPrivBcastT*)malloc(sizeof(futSubGivUpTakUpPrivBcastT));
	int i;

	vfutSubGivUpTakUpPrivBcastT->header = getDataHeaderT(testCaseNum, "futSubGivUpTakUpPrivBcastT");
	vfutSubGivUpTakUpPrivBcastT->basic = getFutBscSubGivUpTakUpPrivBcastT(testCaseNum, "futSubGivUpTakUpPrivBcastT");
	vfutSubGivUpTakUpPrivBcastT->extension = getFutExtSubGivUpTakUpPrivBcastT(testCaseNum, "futSubGivUpTakUpPrivBcastT");
	return vfutSubGivUpTakUpPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futBscSubGivUpTakUpSubjectT* getFutBscSubGivUpTakUpSubjectT(char* testCaseNum) {
	vfutBscSubGivUpTakUpSubjectT = (futBscSubGivUpTakUpSubjectT*)malloc(sizeof(futBscSubGivUpTakUpSubjectT));
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vfutBscSubGivUpTakUpSubjectT->membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpSubjectT.membId", lmembId);
	memcpy(vfutBscSubGivUpTakUpSubjectT->membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscSubGivUpTakUpSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpSubjectT.prodId", lprodId);
	memcpy(vfutBscSubGivUpTakUpSubjectT->prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutBscSubGivUpTakUpSubjectT->cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vfutBscSubGivUpTakUpSubjectT->cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutBscSubGivUpTakUpSubjectT->cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vfutBscSubGivUpTakUpSubjectT->cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<SUBJ_FILL_LEN;i++) {
		vfutBscSubGivUpTakUpSubjectT->subjFill[i]= ' ';
	}
	char lsubjFill[SUBJ_FILL_LEN] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpSubjectT.subjFill", lsubjFill);
	memcpy(vfutBscSubGivUpTakUpSubjectT->subjFill, lsubjFill, SUBJ_FILL_LEN);

	char lgivUpTakUpInd[1] = {""};
	getStrProperty("SubGivUpTakUp.futBscSubGivUpTakUpSubjectT.givUpTakUpInd", lgivUpTakUpInd);
	vfutBscSubGivUpTakUpSubjectT->givUpTakUpInd = lgivUpTakUpInd[0];

	return vfutBscSubGivUpTakUpSubjectT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optSubGivUpTakUpPrivBcastT* getOptSubGivUpTakUpPrivBcastT(char* testCaseNum) {
	voptSubGivUpTakUpPrivBcastT = (optSubGivUpTakUpPrivBcastT*)malloc(sizeof(optSubGivUpTakUpPrivBcastT));
	int i;

	voptSubGivUpTakUpPrivBcastT->header = getDataHeaderT(testCaseNum, "optSubGivUpTakUpPrivBcastT");
	voptSubGivUpTakUpPrivBcastT->basic = getOptBscSubGivUpTakUpPrivBcastT(testCaseNum, "optSubGivUpTakUpPrivBcastT");
	voptSubGivUpTakUpPrivBcastT->extension = getOptExtSubGivUpTakUpPrivBcastT(testCaseNum, "optSubGivUpTakUpPrivBcastT");
	return voptSubGivUpTakUpPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optBscSubGivUpTakUpSubjectT* getOptBscSubGivUpTakUpSubjectT(char* testCaseNum) {
	voptBscSubGivUpTakUpSubjectT = (optBscSubGivUpTakUpSubjectT*)malloc(sizeof(optBscSubGivUpTakUpSubjectT));
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		voptBscSubGivUpTakUpSubjectT->membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpSubjectT.membId", lmembId);
	memcpy(voptBscSubGivUpTakUpSubjectT->membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscSubGivUpTakUpSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpSubjectT.prodId", lprodId);
	memcpy(voptBscSubGivUpTakUpSubjectT->prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		voptBscSubGivUpTakUpSubjectT->cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(voptBscSubGivUpTakUpSubjectT->cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		voptBscSubGivUpTakUpSubjectT->cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(voptBscSubGivUpTakUpSubjectT->cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	char lcntrClasCod[1] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpSubjectT.cntrClasCod", lcntrClasCod);
	voptBscSubGivUpTakUpSubjectT->cntrClasCod = lcntrClasCod[0];

	for(i=0;i<CNTR_EXER_PRC_LEN;i++) {
		voptBscSubGivUpTakUpSubjectT->cntrExerPrc[i]= ' ';
	}
	char lcntrExerPrc[CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpSubjectT.cntrExerPrc", lcntrExerPrc);
	memcpy(voptBscSubGivUpTakUpSubjectT->cntrExerPrc, lcntrExerPrc, CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpSubjectT.cntrVersNo", lcntrVersNo);
	voptBscSubGivUpTakUpSubjectT->cntrVersNo = lcntrVersNo[0];

	char lgivUpTakUpInd[1] = {""};
	getStrProperty("SubGivUpTakUp.optBscSubGivUpTakUpSubjectT.givUpTakUpInd", lgivUpTakUpInd);
	voptBscSubGivUpTakUpSubjectT->givUpTakUpInd = lgivUpTakUpInd[0];

	return voptBscSubGivUpTakUpSubjectT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutSubGivUpTakUpPrivBcastTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futSubGivUpTakUpPrivBcastT));
	futSubGivUpTakUpPrivBcastT *vfutSubGivUpTakUpPrivBcastT = getFutSubGivUpTakUpPrivBcastT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futSubGivUpTakUpPrivBcastT), (jbyte*) vfutSubGivUpTakUpPrivBcastT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutBscSubGivUpTakUpSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futBscSubGivUpTakUpSubjectT));
	futBscSubGivUpTakUpSubjectT *vfutBscSubGivUpTakUpSubjectT = getFutBscSubGivUpTakUpSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futBscSubGivUpTakUpSubjectT), (jbyte*) vfutBscSubGivUpTakUpSubjectT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptSubGivUpTakUpPrivBcastTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optSubGivUpTakUpPrivBcastT));
	optSubGivUpTakUpPrivBcastT *voptSubGivUpTakUpPrivBcastT = getOptSubGivUpTakUpPrivBcastT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optSubGivUpTakUpPrivBcastT), (jbyte*) voptSubGivUpTakUpPrivBcastT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptBscSubGivUpTakUpSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optBscSubGivUpTakUpSubjectT));
	optBscSubGivUpTakUpSubjectT *voptBscSubGivUpTakUpSubjectT = getOptBscSubGivUpTakUpSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optBscSubGivUpTakUpSubjectT), (jbyte*) voptBscSubGivUpTakUpSubjectT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSubGivUpTakUpPrivBcastT(futBscSubGivUpTakUpPrivBcastT actual, futBscSubGivUpTakUpPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.givUpTakUpInd!= expected.givUpTakUpInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, givUpTakUpIndnot matching. Actual %d but Expected %d", actual.givUpTakUpInd, expected.givUpTakUpInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodFromGrpT (actual.acctTypCodFromGrp,expected.acctTypCodFromGrp, logMsg);
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.gutStsTrnsCod!= expected.gutStsTrnsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, gutStsTrnsCodnot matching. Actual %d but Expected %d", actual.gutStsTrnsCod, expected.gutStsTrnsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnVmarAmnt, expected.trnVmarAmnt, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, trnVmarAmnt not matching. Actual %s but Expected %s", actual.trnVmarAmnt, expected.trnVmarAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtSubGivUpTakUpPrivBcastT(futExtSubGivUpTakUpPrivBcastT actual, futExtSubGivUpTakUpPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpFromT (actual.txtGrpFrom,expected.txtGrpFrom, logMsg);
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubGivUpTakUpPrivBcastT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubGivUpTakUpPrivBcastT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubGivUpTakUpPrivBcastT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOrigGuTuTrnGrpT (actual.origGuTuTrnGrp,expected.origGuTuTrnGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscSubGivUpTakUpPrivBcastT(optBscSubGivUpTakUpPrivBcastT actual, optBscSubGivUpTakUpPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.givUpTakUpInd!= expected.givUpTakUpInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, givUpTakUpIndnot matching. Actual %d but Expected %d", actual.givUpTakUpInd, expected.givUpTakUpInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodFrom, expected.membClgIdCodFrom, DRIV_MEMB_CLG_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, membClgIdCodFrom not matching. Actual %s but Expected %s", actual.membClgIdCodFrom, expected.membClgIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodFrom, expected.membExchIdCodFrom, DRIV_MEMB_EXCH_ID_COD_FROM_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, membExchIdCodFrom not matching. Actual %s but Expected %s", actual.membExchIdCodFrom, expected.membExchIdCodFrom);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membClgIdCodTo, expected.membClgIdCodTo, DRIV_MEMB_CLG_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, membClgIdCodTo not matching. Actual %s but Expected %s", actual.membClgIdCodTo, expected.membClgIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodFromGrpT (actual.acctTypCodFromGrp,expected.acctTypCodFromGrp, logMsg);
	compareAcctTypCodToGrpT (actual.acctTypCodToGrp,expected.acctTypCodToGrp, logMsg);
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrnIdSfxGrpT (actual.trnIdSfxGrp,expected.trnIdSfxGrp, logMsg);
	if (actual.gutSts!= expected.gutSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, gutStsnot matching. Actual %d but Expected %d", actual.gutSts, expected.gutSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.gutStsTrnsCod!= expected.gutStsTrnsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, gutStsTrnsCodnot matching. Actual %d but Expected %d", actual.gutStsTrnsCod, expected.gutStsTrnsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lngQty, expected.lngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, lngQty not matching. Actual %s but Expected %s", actual.lngQty, expected.lngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.shtQty, expected.shtQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, shtQty not matching. Actual %s but Expected %s", actual.shtQty, expected.shtQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnPrmAmnt, expected.trnPrmAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, trnPrmAmnt not matching. Actual %s but Expected %s", actual.trnPrmAmnt, expected.trnPrmAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnFeeAmnt, expected.trnFeeAmnt, DRIV_AMOUNT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, trnFeeAmnt not matching. Actual %s but Expected %s", actual.trnFeeAmnt, expected.trnFeeAmnt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtSubGivUpTakUpPrivBcastT(optExtSubGivUpTakUpPrivBcastT actual, optExtSubGivUpTakUpPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTxtGrpFromT (actual.txtGrpFrom,expected.txtGrpFrom, logMsg);
	compareTxtGrpToT (actual.txtGrpTo,expected.txtGrpTo, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubGivUpTakUpPrivBcastT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubGivUpTakUpPrivBcastT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubGivUpTakUpPrivBcastT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOrigGuTuTrnGrpT (actual.origGuTuTrnGrp,expected.origGuTuTrnGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutSubGivUpTakUpPrivBcastT(futSubGivUpTakUpPrivBcastT actual, futSubGivUpTakUpPrivBcastT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscSubGivUpTakUpPrivBcastT (actual.basic,expected.basic, logMsg);	compareFutExtSubGivUpTakUpPrivBcastT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutBscSubGivUpTakUpSubjectT(futBscSubGivUpTakUpSubjectT actual, futBscSubGivUpTakUpSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.membId!= expected.membId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpSubjectT, membIdnot matching. Actual %d but Expected %d", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpYrDat!= expected.cntrExpYrDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpSubjectT, cntrExpYrDatnot matching. Actual %d but Expected %d", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpMthDat!= expected.cntrExpMthDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpSubjectT, cntrExpMthDatnot matching. Actual %d but Expected %d", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.subjFill!= expected.subjFill) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpSubjectT, subjFillnot matching. Actual %d but Expected %d", actual.subjFill, expected.subjFill);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.givUpTakUpInd!= expected.givUpTakUpInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubGivUpTakUpSubjectT, givUpTakUpIndnot matching. Actual %d but Expected %d", actual.givUpTakUpInd, expected.givUpTakUpInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptSubGivUpTakUpPrivBcastT(optSubGivUpTakUpPrivBcastT actual, optSubGivUpTakUpPrivBcastT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscSubGivUpTakUpPrivBcastT (actual.basic,expected.basic, logMsg);	compareOptExtSubGivUpTakUpPrivBcastT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptBscSubGivUpTakUpSubjectT(optBscSubGivUpTakUpSubjectT actual, optBscSubGivUpTakUpSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.membId!= expected.membId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpSubjectT, membIdnot matching. Actual %d but Expected %d", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpYrDat!= expected.cntrExpYrDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpSubjectT, cntrExpYrDatnot matching. Actual %d but Expected %d", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpMthDat!= expected.cntrExpMthDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpSubjectT, cntrExpMthDatnot matching. Actual %d but Expected %d", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpSubjectT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExerPrc!= expected.cntrExerPrc) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpSubjectT, cntrExerPrcnot matching. Actual %d but Expected %d", actual.cntrExerPrc, expected.cntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpSubjectT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.givUpTakUpInd!= expected.givUpTakUpInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubGivUpTakUpSubjectT, givUpTakUpIndnot matching. Actual %d but Expected %d", actual.givUpTakUpInd, expected.givUpTakUpInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutSubGivUpTakUpPrivBcastTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futSubGivUpTakUpPrivBcastT *actualData = (futSubGivUpTakUpPrivBcastT *)msgStruct;
	futSubGivUpTakUpPrivBcastT* expectedData = getFutSubGivUpTakUpPrivBcastT(testCaseNum);
	compareFutSubGivUpTakUpPrivBcastT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutBscSubGivUpTakUpSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futBscSubGivUpTakUpSubjectT *actualData = (futBscSubGivUpTakUpSubjectT *)msgStruct;
	futBscSubGivUpTakUpSubjectT* expectedData = getFutBscSubGivUpTakUpSubjectT(testCaseNum);
	compareFutBscSubGivUpTakUpSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptSubGivUpTakUpPrivBcastTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optSubGivUpTakUpPrivBcastT *actualData = (optSubGivUpTakUpPrivBcastT *)msgStruct;
	optSubGivUpTakUpPrivBcastT* expectedData = getOptSubGivUpTakUpPrivBcastT(testCaseNum);
	compareOptSubGivUpTakUpPrivBcastT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptBscSubGivUpTakUpSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optBscSubGivUpTakUpSubjectT *actualData = (optBscSubGivUpTakUpSubjectT *)msgStruct;
	optBscSubGivUpTakUpSubjectT* expectedData = getOptBscSubGivUpTakUpSubjectT(testCaseNum);
	compareOptBscSubGivUpTakUpSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
