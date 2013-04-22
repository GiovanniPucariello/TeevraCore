#include <InqBOInfo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
extInqBOInfoRequestT getExtInqBOInfoRequestT(char* testCaseNum , const char *root) {
	extInqBOInfoRequestT vextInqBOInfoRequestT;
	int i;

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextInqBOInfoRequestT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("InqBOInfo.extInqBOInfoRequestT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextInqBOInfoRequestT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextInqBOInfoRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqBOInfo.extInqBOInfoRequestT.trnDat", ltrnDat);
	memcpy(vextInqBOInfoRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<STRT_TRN_SEQ_NO_LEN;i++) {
		vextInqBOInfoRequestT.strtTrnSeqNo[i]= ' ';
	}
	char lstrtTrnSeqNo[STRT_TRN_SEQ_NO_LEN] = {""};
	getStrProperty("InqBOInfo.extInqBOInfoRequestT.strtTrnSeqNo", lstrtTrnSeqNo);
	memcpy(vextInqBOInfoRequestT.strtTrnSeqNo, lstrtTrnSeqNo, STRT_TRN_SEQ_NO_LEN);

	for(i=0;i<STOP_TRN_SEQ_NO_LEN;i++) {
		vextInqBOInfoRequestT.stopTrnSeqNo[i]= ' ';
	}
	char lstopTrnSeqNo[STOP_TRN_SEQ_NO_LEN] = {""};
	getStrProperty("InqBOInfo.extInqBOInfoRequestT.stopTrnSeqNo", lstopTrnSeqNo);
	memcpy(vextInqBOInfoRequestT.stopTrnSeqNo, lstopTrnSeqNo, STOP_TRN_SEQ_NO_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vextInqBOInfoRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqBOInfo.extInqBOInfoRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vextInqBOInfoRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vextInqBOInfoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqBOInfoRequestT getInqBOInfoRequestT(char* testCaseNum , const char *root) {
	inqBOInfoRequestT vinqBOInfoRequestT;
	int i;

	vinqBOInfoRequestT.header = getDataHeaderT(testCaseNum, "inqBOInfoRequestT");
	vinqBOInfoRequestT.extension = getExtInqBOInfoRequestT(testCaseNum, "inqBOInfoRequestT");	return vinqBOInfoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extCapAdjTrnRecT getExtCapAdjTrnRecT(char* testCaseNum , const char *root) {
	extCapAdjTrnRecT vextCapAdjTrnRecT;
	int i;

	for(i=0;i<CAP_ADJ_TRN_TYP_LEN;i++) {
		vextCapAdjTrnRecT.capAdjTrnTyp[i]= ' ';
	}
	char lcapAdjTrnTyp[CAP_ADJ_TRN_TYP_LEN] = {""};
	getStrProperty("InqBOInfo.extCapAdjTrnRecT.capAdjTrnTyp", lcapAdjTrnTyp);
	memcpy(vextCapAdjTrnRecT.capAdjTrnTyp, lcapAdjTrnTyp, CAP_ADJ_TRN_TYP_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextCapAdjTrnRecT.capAdjEffDat[i]= ' ';
	}
	char lcapAdjEffDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqBOInfo.extCapAdjTrnRecT.capAdjEffDat", lcapAdjEffDat);
	memcpy(vextCapAdjTrnRecT.capAdjEffDat, lcapAdjEffDat, DRIV_DATE_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vextCapAdjTrnRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqBOInfo.extCapAdjTrnRecT.prodId", lprodId);
	memcpy(vextCapAdjTrnRecT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<DRIV_PROD_ID2_LEN;i++) {
		vextCapAdjTrnRecT.prodId2[i]= ' ';
	}
	char lprodId2[DRIV_PROD_ID2_LEN] = {""};
	getStrProperty("InqBOInfo.extCapAdjTrnRecT.prodId2", lprodId2);
	memcpy(vextCapAdjTrnRecT.prodId2, lprodId2, DRIV_PROD_ID2_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vextCapAdjTrnRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqBOInfo.extCapAdjTrnRecT.isinCod", lisinCod);
	memcpy(vextCapAdjTrnRecT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<CAP_ADJ_RTIO_LEN;i++) {
		vextCapAdjTrnRecT.capAdjRtio[i]= ' ';
	}
	char lcapAdjRtio[CAP_ADJ_RTIO_LEN] = {""};
	getStrProperty("InqBOInfo.extCapAdjTrnRecT.capAdjRtio", lcapAdjRtio);
	memcpy(vextCapAdjTrnRecT.capAdjRtio, lcapAdjRtio, CAP_ADJ_RTIO_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextCapAdjTrnRecT.cshValDat[i]= ' ';
	}
	char lcshValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqBOInfo.extCapAdjTrnRecT.cshValDat", lcshValDat);
	memcpy(vextCapAdjTrnRecT.cshValDat, lcshValDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextCapAdjTrnRecT.secuValDat[i]= ' ';
	}
	char lsecuValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqBOInfo.extCapAdjTrnRecT.secuValDat", lsecuValDat);
	memcpy(vextCapAdjTrnRecT.secuValDat, lsecuValDat, DRIV_DATE_LEN);
	return vextCapAdjTrnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extCapAdjTrnResponseT getExtCapAdjTrnResponseT(char* testCaseNum , const char *root) {
	extCapAdjTrnResponseT vextCapAdjTrnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vextCapAdjTrnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqBOInfo.extCapAdjTrnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vextCapAdjTrnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextCapAdjTrnResponseT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("InqBOInfo.extCapAdjTrnResponseT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextCapAdjTrnResponseT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);
	return vextCapAdjTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqBOInfoCapAdjResponseT getInqBOInfoCapAdjResponseT(char* testCaseNum , const char *root) {
	inqBOInfoCapAdjResponseT vinqBOInfoCapAdjResponseT;
	int i;

	vinqBOInfoCapAdjResponseT.header = getDataHeaderT(testCaseNum, "inqBOInfoCapAdjResponseT");
	vinqBOInfoCapAdjResponseT.extension = getExtCapAdjTrnResponseT(testCaseNum, "inqBOInfoCapAdjResponseT");	return vinqBOInfoCapAdjResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extCntrChgTrnRecT getExtCntrChgTrnRecT(char* testCaseNum , const char *root) {
	extCntrChgTrnRecT vextCntrChgTrnRecT;
	int i;

	char lcntrChgTrnTyp[1] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrChgTrnTyp", lcntrChgTrnTyp);
	vextCntrChgTrnRecT.cntrChgTrnTyp = lcntrChgTrnTyp[0];

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vextCntrChgTrnRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.currTypCod", lcurrTypCod);
	memcpy(vextCntrChgTrnRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char ldcmlShft[1] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.dcmlShft", ldcmlShft);
	vextCntrChgTrnRecT.dcmlShft = ldcmlShft[0];

	for(i=0;i<ISIN_COD_LEN;i++) {
		vextCntrChgTrnRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.isinCod", lisinCod);
	memcpy(vextCntrChgTrnRecT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextCntrChgTrnRecT.cntrExpDat[i]= ' ';
	}
	char lcntrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrExpDat", lcntrExpDat);
	memcpy(vextCntrChgTrnRecT.cntrExpDat, lcntrExpDat, DRIV_DATE_LEN);

	char lcntrGenNo[1] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrGenNo", lcntrGenNo);
	vextCntrChgTrnRecT.cntrGenNo = lcntrGenNo[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vextCntrChgTrnRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.prodId", lprodId);
	memcpy(vextCntrChgTrnRecT.prodId, lprodId, PROD_ID_LEN);

	char lcntrClasCod[1] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrClasCod", lcntrClasCod);
	vextCntrChgTrnRecT.cntrClasCod = lcntrClasCod[0];

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vextCntrChgTrnRecT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vextCntrChgTrnRecT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXER_PRC_LEN;i++) {
		vextCntrChgTrnRecT.cntrExerPrc[i]= ' ';
	}
	char lcntrExerPrc[CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrExerPrc", lcntrExerPrc);
	memcpy(vextCntrChgTrnRecT.cntrExerPrc, lcntrExerPrc, CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrVersNo", lcntrVersNo);
	vextCntrChgTrnRecT.cntrVersNo = lcntrVersNo[0];

	for(i=0;i<CNTR_SIZ_LEN;i++) {
		vextCntrChgTrnRecT.cntrSiz[i]= ' ';
	}
	char lcntrSiz[CNTR_SIZ_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrSiz", lcntrSiz);
	memcpy(vextCntrChgTrnRecT.cntrSiz, lcntrSiz, CNTR_SIZ_LEN);

	for(i=0;i<PROD_ID_NEW_LEN;i++) {
		vextCntrChgTrnRecT.prodIdNew[i]= ' ';
	}
	char lprodIdNew[PROD_ID_NEW_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.prodIdNew", lprodIdNew);
	memcpy(vextCntrChgTrnRecT.prodIdNew, lprodIdNew, PROD_ID_NEW_LEN);

	char lcntrClasCodNew[1] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrClasCodNew", lcntrClasCodNew);
	vextCntrChgTrnRecT.cntrClasCodNew = lcntrClasCodNew[0];

	for(i=0;i<CNTR_EXP_MTH_DAT_NEW_LEN;i++) {
		vextCntrChgTrnRecT.cntrExpMthDatNew[i]= ' ';
	}
	char lcntrExpMthDatNew[CNTR_EXP_MTH_DAT_NEW_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrExpMthDatNew", lcntrExpMthDatNew);
	memcpy(vextCntrChgTrnRecT.cntrExpMthDatNew, lcntrExpMthDatNew, CNTR_EXP_MTH_DAT_NEW_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_NEW_LEN;i++) {
		vextCntrChgTrnRecT.cntrExpYrDatNew[i]= ' ';
	}
	char lcntrExpYrDatNew[CNTR_EXP_YR_DAT_NEW_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrExpYrDatNew", lcntrExpYrDatNew);
	memcpy(vextCntrChgTrnRecT.cntrExpYrDatNew, lcntrExpYrDatNew, CNTR_EXP_YR_DAT_NEW_LEN);

	for(i=0;i<CNTR_EXER_PRC_NEW_LEN;i++) {
		vextCntrChgTrnRecT.cntrExerPrcNew[i]= ' ';
	}
	char lcntrExerPrcNew[CNTR_EXER_PRC_NEW_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrExerPrcNew", lcntrExerPrcNew);
	memcpy(vextCntrChgTrnRecT.cntrExerPrcNew, lcntrExerPrcNew, CNTR_EXER_PRC_NEW_LEN);

	char lcntrVersNoNew[1] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrVersNoNew", lcntrVersNoNew);
	vextCntrChgTrnRecT.cntrVersNoNew = lcntrVersNoNew[0];

	for(i=0;i<CNTR_SIZ_NEW_LEN;i++) {
		vextCntrChgTrnRecT.cntrSizNew[i]= ' ';
	}
	char lcntrSizNew[CNTR_SIZ_NEW_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cntrSizNew", lcntrSizNew);
	memcpy(vextCntrChgTrnRecT.cntrSizNew, lcntrSizNew, CNTR_SIZ_NEW_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextCntrChgTrnRecT.cshValDat[i]= ' ';
	}
	char lcshValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.cshValDat", lcshValDat);
	memcpy(vextCntrChgTrnRecT.cshValDat, lcshValDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextCntrChgTrnRecT.secuValDat[i]= ' ';
	}
	char lsecuValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.secuValDat", lsecuValDat);
	memcpy(vextCntrChgTrnRecT.secuValDat, lsecuValDat, DRIV_DATE_LEN);

	char lautManExerTyp[1] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.autManExerTyp", lautManExerTyp);
	vextCntrChgTrnRecT.autManExerTyp = lautManExerTyp[0];

	char lexerStylTyp[1] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.exerStylTyp", lexerStylTyp);
	vextCntrChgTrnRecT.exerStylTyp = lexerStylTyp[0];

	char lmgnStylTyp[1] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.mgnStylTyp", lmgnStylTyp);
	vextCntrChgTrnRecT.mgnStylTyp = lmgnStylTyp[0];

	char lexerPrcDcml[1] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnRecT.exerPrcDcml", lexerPrcDcml);
	vextCntrChgTrnRecT.exerPrcDcml = lexerPrcDcml[0];
	return vextCntrChgTrnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extCntrChgTrnResponseT getExtCntrChgTrnResponseT(char* testCaseNum , const char *root) {
	extCntrChgTrnResponseT vextCntrChgTrnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vextCntrChgTrnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vextCntrChgTrnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextCntrChgTrnResponseT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("InqBOInfo.extCntrChgTrnResponseT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextCntrChgTrnResponseT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);
	return vextCntrChgTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqBOInfoCntrChgResponseT getInqBOInfoCntrChgResponseT(char* testCaseNum , const char *root) {
	inqBOInfoCntrChgResponseT vinqBOInfoCntrChgResponseT;
	int i;

	vinqBOInfoCntrChgResponseT.header = getDataHeaderT(testCaseNum, "inqBOInfoCntrChgResponseT");
	vinqBOInfoCntrChgResponseT.extension = getExtCntrChgTrnResponseT(testCaseNum, "inqBOInfoCntrChgResponseT");	return vinqBOInfoCntrChgResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extExchRatTrnRec1T getExtExchRatTrnRec1T(char* testCaseNum , const char *root) {
	extExchRatTrnRec1T vextExchRatTrnRec1T;
	int i;

	for(i=0;i<NO_OF_EXCH_RAT_LEN;i++) {
		vextExchRatTrnRec1T.noOfExchRat[i]= ' ';
	}
	char lnoOfExchRat[NO_OF_EXCH_RAT_LEN] = {""};
	getStrProperty("InqBOInfo.extExchRatTrnRec1T.noOfExchRat", lnoOfExchRat);
	memcpy(vextExchRatTrnRec1T.noOfExchRat, lnoOfExchRat, NO_OF_EXCH_RAT_LEN);
	return vextExchRatTrnRec1T;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extExchRatTrnResponseT getExtExchRatTrnResponseT(char* testCaseNum , const char *root) {
	extExchRatTrnResponseT vextExchRatTrnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vextExchRatTrnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqBOInfo.extExchRatTrnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vextExchRatTrnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextExchRatTrnResponseT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("InqBOInfo.extExchRatTrnResponseT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextExchRatTrnResponseT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);
	return vextExchRatTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqBOInfoExchRatResponseT getInqBOInfoExchRatResponseT(char* testCaseNum , const char *root) {
	inqBOInfoExchRatResponseT vinqBOInfoExchRatResponseT;
	int i;

	vinqBOInfoExchRatResponseT.header = getDataHeaderT(testCaseNum, "inqBOInfoExchRatResponseT");
	vinqBOInfoExchRatResponseT.extension = getExtExchRatTrnResponseT(testCaseNum, "inqBOInfoExchRatResponseT");	return vinqBOInfoExchRatResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extProdChgTrnRecT getExtProdChgTrnRecT(char* testCaseNum , const char *root) {
	extProdChgTrnRecT vextProdChgTrnRecT;
	int i;

	for(i=0;i<PROD_CHG_TRN_TYP_LEN;i++) {
		vextProdChgTrnRecT.prodChgTrnTyp[i]= ' ';
	}
	char lprodChgTrnTyp[PROD_CHG_TRN_TYP_LEN] = {""};
	getStrProperty("InqBOInfo.extProdChgTrnRecT.prodChgTrnTyp", lprodChgTrnTyp);
	memcpy(vextProdChgTrnRecT.prodChgTrnTyp, lprodChgTrnTyp, PROD_CHG_TRN_TYP_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vextProdChgTrnRecT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqBOInfo.extProdChgTrnRecT.prodId", lprodId);
	memcpy(vextProdChgTrnRecT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vextProdChgTrnRecT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("InqBOInfo.extProdChgTrnRecT.isinCod", lisinCod);
	memcpy(vextProdChgTrnRecT.isinCod, lisinCod, ISIN_COD_LEN);

	char lexerPrcDcmlOld[1] = {""};
	getStrProperty("InqBOInfo.extProdChgTrnRecT.exerPrcDcmlOld", lexerPrcDcmlOld);
	vextProdChgTrnRecT.exerPrcDcmlOld = lexerPrcDcmlOld[0];

	char lexerPrcDcmlNew[1] = {""};
	getStrProperty("InqBOInfo.extProdChgTrnRecT.exerPrcDcmlNew", lexerPrcDcmlNew);
	vextProdChgTrnRecT.exerPrcDcmlNew = lexerPrcDcmlNew[0];
	return vextProdChgTrnRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extProdChgTrnResponseT getExtProdChgTrnResponseT(char* testCaseNum , const char *root) {
	extProdChgTrnResponseT vextProdChgTrnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vextProdChgTrnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqBOInfo.extProdChgTrnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vextProdChgTrnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextProdChgTrnResponseT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("InqBOInfo.extProdChgTrnResponseT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextProdChgTrnResponseT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);
	return vextProdChgTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqBOInfoProdChgResponseT getInqBOInfoProdChgResponseT(char* testCaseNum , const char *root) {
	inqBOInfoProdChgResponseT vinqBOInfoProdChgResponseT;
	int i;

	vinqBOInfoProdChgResponseT.header = getDataHeaderT(testCaseNum, "inqBOInfoProdChgResponseT");
	vinqBOInfoProdChgResponseT.extension = getExtProdChgTrnResponseT(testCaseNum, "inqBOInfoProdChgResponseT");	return vinqBOInfoProdChgResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extSetlPrcTrnResponseT getExtSetlPrcTrnResponseT(char* testCaseNum , const char *root) {
	extSetlPrcTrnResponseT vextSetlPrcTrnResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vextSetlPrcTrnResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqBOInfo.extSetlPrcTrnResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vextSetlPrcTrnResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextSetlPrcTrnResponseT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("InqBOInfo.extSetlPrcTrnResponseT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextSetlPrcTrnResponseT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);

	for(i=0;i<NO_OF_SETL_PRC_LEN;i++) {
		vextSetlPrcTrnResponseT.noOfSetlPrc[i]= ' ';
	}
	char lnoOfSetlPrc[NO_OF_SETL_PRC_LEN] = {""};
	getStrProperty("InqBOInfo.extSetlPrcTrnResponseT.noOfSetlPrc", lnoOfSetlPrc);
	memcpy(vextSetlPrcTrnResponseT.noOfSetlPrc, lnoOfSetlPrc, NO_OF_SETL_PRC_LEN);
	return vextSetlPrcTrnResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqBOInfoSetlPrcResponseT getInqBOInfoSetlPrcResponseT(char* testCaseNum , const char *root) {
	inqBOInfoSetlPrcResponseT vinqBOInfoSetlPrcResponseT;
	int i;

	vinqBOInfoSetlPrcResponseT.header = getDataHeaderT(testCaseNum, "inqBOInfoSetlPrcResponseT");
	vinqBOInfoSetlPrcResponseT.extension = getExtSetlPrcTrnResponseT(testCaseNum, "inqBOInfoSetlPrcResponseT");	return vinqBOInfoSetlPrcResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqBOInfoRequestT(extInqBOInfoRequestT actual, extInqBOInfoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqBOInfoRequestT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqBOInfoRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.strtTrnSeqNo, expected.strtTrnSeqNo, STRT_TRN_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqBOInfoRequestT, strtTrnSeqNo not matching. Actual %s but Expected %s", actual.strtTrnSeqNo, expected.strtTrnSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stopTrnSeqNo, expected.stopTrnSeqNo, STOP_TRN_SEQ_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqBOInfoRequestT, stopTrnSeqNo not matching. Actual %s but Expected %s", actual.stopTrnSeqNo, expected.stopTrnSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqBOInfoRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqBOInfoRequestT(inqBOInfoRequestT actual, inqBOInfoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtInqBOInfoRequestT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtCapAdjTrnRecT(extCapAdjTrnRecT actual, extCapAdjTrnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.capAdjTrnTyp, expected.capAdjTrnTyp, CAP_ADJ_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnRecT, capAdjTrnTyp not matching. Actual %s but Expected %s", actual.capAdjTrnTyp, expected.capAdjTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.capAdjEffDat, expected.capAdjEffDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnRecT, capAdjEffDat not matching. Actual %s but Expected %s", actual.capAdjEffDat, expected.capAdjEffDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId2, expected.prodId2, DRIV_PROD_ID2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnRecT, prodId2 not matching. Actual %s but Expected %s", actual.prodId2, expected.prodId2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.capAdjRtio, expected.capAdjRtio, CAP_ADJ_RTIO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnRecT, capAdjRtio not matching. Actual %s but Expected %s", actual.capAdjRtio, expected.capAdjRtio);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshValDat, expected.cshValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnRecT, cshValDat not matching. Actual %s but Expected %s", actual.cshValDat, expected.cshValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuValDat, expected.secuValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnRecT, secuValDat not matching. Actual %s but Expected %s", actual.secuValDat, expected.secuValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtCapAdjTrnResponseT(extCapAdjTrnResponseT actual, extCapAdjTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnResponseT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < EXT_CAP_ADJ_TRN_REC_MAX;i++) {
		compareExtCapAdjTrnRecT (actual.extCapAdjTrnRec[i],expected.extCapAdjTrnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqBOInfoCapAdjResponseT(inqBOInfoCapAdjResponseT actual, inqBOInfoCapAdjResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtCapAdjTrnResponseT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtCntrChgTrnRecT(extCntrChgTrnRecT actual, extCntrChgTrnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.cntrChgTrnTyp!= expected.cntrChgTrnTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrChgTrnTypnot matching. Actual %d but Expected %d", actual.cntrChgTrnTyp, expected.cntrChgTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.dcmlShft!= expected.dcmlShft) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, dcmlShftnot matching. Actual %d but Expected %d", actual.dcmlShft, expected.dcmlShft);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpDat, expected.cntrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrExpDat not matching. Actual %s but Expected %s", actual.cntrExpDat, expected.cntrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrGenNo!= expected.cntrGenNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrGenNonot matching. Actual %d but Expected %d", actual.cntrGenNo, expected.cntrGenNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExerPrc, expected.cntrExerPrc, CNTR_EXER_PRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrExerPrc not matching. Actual %s but Expected %s", actual.cntrExerPrc, expected.cntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrSiz, expected.cntrSiz, CNTR_SIZ_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrSiz not matching. Actual %s but Expected %s", actual.cntrSiz, expected.cntrSiz);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodIdNew, expected.prodIdNew, PROD_ID_NEW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, prodIdNew not matching. Actual %s but Expected %s", actual.prodIdNew, expected.prodIdNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCodNew!= expected.cntrClasCodNew) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrClasCodNewnot matching. Actual %d but Expected %d", actual.cntrClasCodNew, expected.cntrClasCodNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDatNew, expected.cntrExpMthDatNew, CNTR_EXP_MTH_DAT_NEW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrExpMthDatNew not matching. Actual %s but Expected %s", actual.cntrExpMthDatNew, expected.cntrExpMthDatNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDatNew, expected.cntrExpYrDatNew, CNTR_EXP_YR_DAT_NEW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrExpYrDatNew not matching. Actual %s but Expected %s", actual.cntrExpYrDatNew, expected.cntrExpYrDatNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExerPrcNew, expected.cntrExerPrcNew, CNTR_EXER_PRC_NEW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrExerPrcNew not matching. Actual %s but Expected %s", actual.cntrExerPrcNew, expected.cntrExerPrcNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNoNew!= expected.cntrVersNoNew) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrVersNoNewnot matching. Actual %d but Expected %d", actual.cntrVersNoNew, expected.cntrVersNoNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrSizNew, expected.cntrSizNew, CNTR_SIZ_NEW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cntrSizNew not matching. Actual %s but Expected %s", actual.cntrSizNew, expected.cntrSizNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshValDat, expected.cshValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, cshValDat not matching. Actual %s but Expected %s", actual.cshValDat, expected.cshValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuValDat, expected.secuValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, secuValDat not matching. Actual %s but Expected %s", actual.secuValDat, expected.secuValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.autManExerTyp!= expected.autManExerTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, autManExerTypnot matching. Actual %d but Expected %d", actual.autManExerTyp, expected.autManExerTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerStylTyp!= expected.exerStylTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, exerStylTypnot matching. Actual %d but Expected %d", actual.exerStylTyp, expected.exerStylTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.mgnStylTyp!= expected.mgnStylTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, mgnStylTypnot matching. Actual %d but Expected %d", actual.mgnStylTyp, expected.mgnStylTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerPrcDcml!= expected.exerPrcDcml) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnRecT, exerPrcDcmlnot matching. Actual %d but Expected %d", actual.exerPrcDcml, expected.exerPrcDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtCntrChgTrnResponseT(extCntrChgTrnResponseT actual, extCntrChgTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnResponseT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < EXT_CNTR_CHG_TRN_REC_MAX;i++) {
		compareExtCntrChgTrnRecT (actual.extCntrChgTrnRec[i],expected.extCntrChgTrnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqBOInfoCntrChgResponseT(inqBOInfoCntrChgResponseT actual, inqBOInfoCntrChgResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtCntrChgTrnResponseT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtExchRatTrnRec1T(extExchRatTrnRec1T actual, extExchRatTrnRec1T expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.noOfExchRat, expected.noOfExchRat, NO_OF_EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extExchRatTrnRec1T, noOfExchRat not matching. Actual %s but Expected %s", actual.noOfExchRat, expected.noOfExchRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < EXT_EXCH_RAT_TRN_REC_MAX;i++) {
		compareExtExchRatTrnRecT (actual.extExchRatTrnRec[i],expected.extExchRatTrnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtExchRatTrnResponseT(extExchRatTrnResponseT actual, extExchRatTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extExchRatTrnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extExchRatTrnResponseT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < EXT_EXCH_RAT_TRN_REC1_MAX;i++) {
		compareExtExchRatTrnRec1T (actual.extExchRatTrnRec1[i],expected.extExchRatTrnRec1[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqBOInfoExchRatResponseT(inqBOInfoExchRatResponseT actual, inqBOInfoExchRatResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtExchRatTrnResponseT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtProdChgTrnRecT(extProdChgTrnRecT actual, extProdChgTrnRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodChgTrnTyp, expected.prodChgTrnTyp, PROD_CHG_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnRecT, prodChgTrnTyp not matching. Actual %s but Expected %s", actual.prodChgTrnTyp, expected.prodChgTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnRecT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnRecT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerPrcDcmlOld!= expected.exerPrcDcmlOld) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnRecT, exerPrcDcmlOldnot matching. Actual %d but Expected %d", actual.exerPrcDcmlOld, expected.exerPrcDcmlOld);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerPrcDcmlNew!= expected.exerPrcDcmlNew) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnRecT, exerPrcDcmlNewnot matching. Actual %d but Expected %d", actual.exerPrcDcmlNew, expected.exerPrcDcmlNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtProdChgTrnResponseT(extProdChgTrnResponseT actual, extProdChgTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnResponseT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < EXT_PROD_CHG_TRN_REC_MAX;i++) {
		compareExtProdChgTrnRecT (actual.extProdChgTrnRec[i],expected.extProdChgTrnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqBOInfoProdChgResponseT(inqBOInfoProdChgResponseT actual, inqBOInfoProdChgResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtProdChgTrnResponseT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtSetlPrcTrnResponseT(extSetlPrcTrnResponseT actual, extSetlPrcTrnResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnResponseT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.noOfSetlPrc, expected.noOfSetlPrc, NO_OF_SETL_PRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnResponseT, noOfSetlPrc not matching. Actual %s but Expected %s", actual.noOfSetlPrc, expected.noOfSetlPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < EXT_SETL_PRC_TRN_REC_MAX;i++) {
		compareExtSetlPrcTrnRecT (actual.extSetlPrcTrnRec[i],expected.extSetlPrcTrnRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqBOInfoSetlPrcResponseT(inqBOInfoSetlPrcResponseT actual, inqBOInfoSetlPrcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtSetlPrcTrnResponseT (actual.extension,expected.extension, logMsg);
}

