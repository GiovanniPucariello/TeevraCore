#include <SubBOInfo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
extCapAdjTrnPubBcastT getExtCapAdjTrnPubBcastT(char* testCaseNum , const char *root) {
	extCapAdjTrnPubBcastT vextCapAdjTrnPubBcastT;
	int i;

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextCapAdjTrnPubBcastT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("SubBOInfo.extCapAdjTrnPubBcastT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextCapAdjTrnPubBcastT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);

	for(i=0;i<CAP_ADJ_TRN_TYP_LEN;i++) {
		vextCapAdjTrnPubBcastT.capAdjTrnTyp[i]= ' ';
	}
	char lcapAdjTrnTyp[CAP_ADJ_TRN_TYP_LEN] = {""};
	getStrProperty("SubBOInfo.extCapAdjTrnPubBcastT.capAdjTrnTyp", lcapAdjTrnTyp);
	memcpy(vextCapAdjTrnPubBcastT.capAdjTrnTyp, lcapAdjTrnTyp, CAP_ADJ_TRN_TYP_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextCapAdjTrnPubBcastT.capAdjEffDat[i]= ' ';
	}
	char lcapAdjEffDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubBOInfo.extCapAdjTrnPubBcastT.capAdjEffDat", lcapAdjEffDat);
	memcpy(vextCapAdjTrnPubBcastT.capAdjEffDat, lcapAdjEffDat, DRIV_DATE_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vextCapAdjTrnPubBcastT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubBOInfo.extCapAdjTrnPubBcastT.prodId", lprodId);
	memcpy(vextCapAdjTrnPubBcastT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<DRIV_PROD_ID2_LEN;i++) {
		vextCapAdjTrnPubBcastT.prodId2[i]= ' ';
	}
	char lprodId2[DRIV_PROD_ID2_LEN] = {""};
	getStrProperty("SubBOInfo.extCapAdjTrnPubBcastT.prodId2", lprodId2);
	memcpy(vextCapAdjTrnPubBcastT.prodId2, lprodId2, DRIV_PROD_ID2_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vextCapAdjTrnPubBcastT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("SubBOInfo.extCapAdjTrnPubBcastT.isinCod", lisinCod);
	memcpy(vextCapAdjTrnPubBcastT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<CAP_ADJ_RTIO_LEN;i++) {
		vextCapAdjTrnPubBcastT.capAdjRtio[i]= ' ';
	}
	char lcapAdjRtio[CAP_ADJ_RTIO_LEN] = {""};
	getStrProperty("SubBOInfo.extCapAdjTrnPubBcastT.capAdjRtio", lcapAdjRtio);
	memcpy(vextCapAdjTrnPubBcastT.capAdjRtio, lcapAdjRtio, CAP_ADJ_RTIO_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextCapAdjTrnPubBcastT.cshValDat[i]= ' ';
	}
	char lcshValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubBOInfo.extCapAdjTrnPubBcastT.cshValDat", lcshValDat);
	memcpy(vextCapAdjTrnPubBcastT.cshValDat, lcshValDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextCapAdjTrnPubBcastT.secuValDat[i]= ' ';
	}
	char lsecuValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubBOInfo.extCapAdjTrnPubBcastT.secuValDat", lsecuValDat);
	memcpy(vextCapAdjTrnPubBcastT.secuValDat, lsecuValDat, DRIV_DATE_LEN);
	return vextCapAdjTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
capAdjTrnPubBcastT getCapAdjTrnPubBcastT(char* testCaseNum , const char *root) {
	capAdjTrnPubBcastT vcapAdjTrnPubBcastT;
	int i;

	vcapAdjTrnPubBcastT.seqNo = getBscSeqNoT(testCaseNum, "capAdjTrnPubBcastT");
	vcapAdjTrnPubBcastT.header = getDataHeaderT(testCaseNum, "capAdjTrnPubBcastT");
	vcapAdjTrnPubBcastT.extension = getExtCapAdjTrnPubBcastT(testCaseNum, "capAdjTrnPubBcastT");	return vcapAdjTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extCntrChgTrnPubBcastT getExtCntrChgTrnPubBcastT(char* testCaseNum , const char *root) {
	extCntrChgTrnPubBcastT vextCntrChgTrnPubBcastT;
	int i;

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextCntrChgTrnPubBcastT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextCntrChgTrnPubBcastT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);

	char lcntrChgTrnTyp[1] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrChgTrnTyp", lcntrChgTrnTyp);
	vextCntrChgTrnPubBcastT.cntrChgTrnTyp = lcntrChgTrnTyp[0];

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vextCntrChgTrnPubBcastT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.currTypCod", lcurrTypCod);
	memcpy(vextCntrChgTrnPubBcastT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	char ldcmlShft[1] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.dcmlShft", ldcmlShft);
	vextCntrChgTrnPubBcastT.dcmlShft = ldcmlShft[0];

	for(i=0;i<ISIN_COD_LEN;i++) {
		vextCntrChgTrnPubBcastT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.isinCod", lisinCod);
	memcpy(vextCntrChgTrnPubBcastT.isinCod, lisinCod, ISIN_COD_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextCntrChgTrnPubBcastT.cntrExpDat[i]= ' ';
	}
	char lcntrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrExpDat", lcntrExpDat);
	memcpy(vextCntrChgTrnPubBcastT.cntrExpDat, lcntrExpDat, DRIV_DATE_LEN);

	char lcntrGenNo[1] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrGenNo", lcntrGenNo);
	vextCntrChgTrnPubBcastT.cntrGenNo = lcntrGenNo[0];

	for(i=0;i<PROD_ID_LEN;i++) {
		vextCntrChgTrnPubBcastT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.prodId", lprodId);
	memcpy(vextCntrChgTrnPubBcastT.prodId, lprodId, PROD_ID_LEN);

	char lcntrClasCod[1] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrClasCod", lcntrClasCod);
	vextCntrChgTrnPubBcastT.cntrClasCod = lcntrClasCod[0];

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vextCntrChgTrnPubBcastT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vextCntrChgTrnPubBcastT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXER_PRC_LEN;i++) {
		vextCntrChgTrnPubBcastT.cntrExerPrc[i]= ' ';
	}
	char lcntrExerPrc[CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrExerPrc", lcntrExerPrc);
	memcpy(vextCntrChgTrnPubBcastT.cntrExerPrc, lcntrExerPrc, CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrVersNo", lcntrVersNo);
	vextCntrChgTrnPubBcastT.cntrVersNo = lcntrVersNo[0];

	for(i=0;i<CNTR_SIZ_LEN;i++) {
		vextCntrChgTrnPubBcastT.cntrSiz[i]= ' ';
	}
	char lcntrSiz[CNTR_SIZ_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrSiz", lcntrSiz);
	memcpy(vextCntrChgTrnPubBcastT.cntrSiz, lcntrSiz, CNTR_SIZ_LEN);

	for(i=0;i<PROD_ID_NEW_LEN;i++) {
		vextCntrChgTrnPubBcastT.prodIdNew[i]= ' ';
	}
	char lprodIdNew[PROD_ID_NEW_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.prodIdNew", lprodIdNew);
	memcpy(vextCntrChgTrnPubBcastT.prodIdNew, lprodIdNew, PROD_ID_NEW_LEN);

	char lcntrClasCodNew[1] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrClasCodNew", lcntrClasCodNew);
	vextCntrChgTrnPubBcastT.cntrClasCodNew = lcntrClasCodNew[0];

	for(i=0;i<CNTR_EXP_MTH_DAT_NEW_LEN;i++) {
		vextCntrChgTrnPubBcastT.cntrExpMthDatNew[i]= ' ';
	}
	char lcntrExpMthDatNew[CNTR_EXP_MTH_DAT_NEW_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrExpMthDatNew", lcntrExpMthDatNew);
	memcpy(vextCntrChgTrnPubBcastT.cntrExpMthDatNew, lcntrExpMthDatNew, CNTR_EXP_MTH_DAT_NEW_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_NEW_LEN;i++) {
		vextCntrChgTrnPubBcastT.cntrExpYrDatNew[i]= ' ';
	}
	char lcntrExpYrDatNew[CNTR_EXP_YR_DAT_NEW_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrExpYrDatNew", lcntrExpYrDatNew);
	memcpy(vextCntrChgTrnPubBcastT.cntrExpYrDatNew, lcntrExpYrDatNew, CNTR_EXP_YR_DAT_NEW_LEN);

	for(i=0;i<CNTR_EXER_PRC_NEW_LEN;i++) {
		vextCntrChgTrnPubBcastT.cntrExerPrcNew[i]= ' ';
	}
	char lcntrExerPrcNew[CNTR_EXER_PRC_NEW_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrExerPrcNew", lcntrExerPrcNew);
	memcpy(vextCntrChgTrnPubBcastT.cntrExerPrcNew, lcntrExerPrcNew, CNTR_EXER_PRC_NEW_LEN);

	char lcntrVersNoNew[1] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrVersNoNew", lcntrVersNoNew);
	vextCntrChgTrnPubBcastT.cntrVersNoNew = lcntrVersNoNew[0];

	for(i=0;i<CNTR_SIZ_NEW_LEN;i++) {
		vextCntrChgTrnPubBcastT.cntrSizNew[i]= ' ';
	}
	char lcntrSizNew[CNTR_SIZ_NEW_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cntrSizNew", lcntrSizNew);
	memcpy(vextCntrChgTrnPubBcastT.cntrSizNew, lcntrSizNew, CNTR_SIZ_NEW_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextCntrChgTrnPubBcastT.cshValDat[i]= ' ';
	}
	char lcshValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.cshValDat", lcshValDat);
	memcpy(vextCntrChgTrnPubBcastT.cshValDat, lcshValDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextCntrChgTrnPubBcastT.secuValDat[i]= ' ';
	}
	char lsecuValDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.secuValDat", lsecuValDat);
	memcpy(vextCntrChgTrnPubBcastT.secuValDat, lsecuValDat, DRIV_DATE_LEN);

	char lautManExerTyp[1] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.autManExerTyp", lautManExerTyp);
	vextCntrChgTrnPubBcastT.autManExerTyp = lautManExerTyp[0];

	char lexerStylTyp[1] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.exerStylTyp", lexerStylTyp);
	vextCntrChgTrnPubBcastT.exerStylTyp = lexerStylTyp[0];

	char lmgnStylTyp[1] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.mgnStylTyp", lmgnStylTyp);
	vextCntrChgTrnPubBcastT.mgnStylTyp = lmgnStylTyp[0];

	char lexerPrcDcml[1] = {""};
	getStrProperty("SubBOInfo.extCntrChgTrnPubBcastT.exerPrcDcml", lexerPrcDcml);
	vextCntrChgTrnPubBcastT.exerPrcDcml = lexerPrcDcml[0];
	return vextCntrChgTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
cntrChgTrnPubBcastT getCntrChgTrnPubBcastT(char* testCaseNum , const char *root) {
	cntrChgTrnPubBcastT vcntrChgTrnPubBcastT;
	int i;

	vcntrChgTrnPubBcastT.seqNo = getBscSeqNoT(testCaseNum, "cntrChgTrnPubBcastT");
	vcntrChgTrnPubBcastT.header = getDataHeaderT(testCaseNum, "cntrChgTrnPubBcastT");
	vcntrChgTrnPubBcastT.extension = getExtCntrChgTrnPubBcastT(testCaseNum, "cntrChgTrnPubBcastT");	return vcntrChgTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extExchRatTrnPubBcastT getExtExchRatTrnPubBcastT(char* testCaseNum , const char *root) {
	extExchRatTrnPubBcastT vextExchRatTrnPubBcastT;
	int i;

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextExchRatTrnPubBcastT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("SubBOInfo.extExchRatTrnPubBcastT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextExchRatTrnPubBcastT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);

	for(i=0;i<NO_OF_EXCH_RAT_LEN;i++) {
		vextExchRatTrnPubBcastT.noOfExchRat[i]= ' ';
	}
	char lnoOfExchRat[NO_OF_EXCH_RAT_LEN] = {""};
	getStrProperty("SubBOInfo.extExchRatTrnPubBcastT.noOfExchRat", lnoOfExchRat);
	memcpy(vextExchRatTrnPubBcastT.noOfExchRat, lnoOfExchRat, NO_OF_EXCH_RAT_LEN);
	return vextExchRatTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
exchRatTrnPubBcastT getExchRatTrnPubBcastT(char* testCaseNum , const char *root) {
	exchRatTrnPubBcastT vexchRatTrnPubBcastT;
	int i;

	vexchRatTrnPubBcastT.seqNo = getBscSeqNoT(testCaseNum, "exchRatTrnPubBcastT");
	vexchRatTrnPubBcastT.header = getDataHeaderT(testCaseNum, "exchRatTrnPubBcastT");
	vexchRatTrnPubBcastT.extension = getExtExchRatTrnPubBcastT(testCaseNum, "exchRatTrnPubBcastT");	return vexchRatTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extIdayCntrTrnPubBcastT getExtIdayCntrTrnPubBcastT(char* testCaseNum , const char *root) {
	extIdayCntrTrnPubBcastT vextIdayCntrTrnPubBcastT;
	int i;

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextIdayCntrTrnPubBcastT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("SubBOInfo.extIdayCntrTrnPubBcastT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextIdayCntrTrnPubBcastT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);

	for(i=0;i<PRIM_EXCH_ID_COD_LEN;i++) {
		vextIdayCntrTrnPubBcastT.primExchIdCod[i]= ' ';
	}
	char lprimExchIdCod[PRIM_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubBOInfo.extIdayCntrTrnPubBcastT.primExchIdCod", lprimExchIdCod);
	memcpy(vextIdayCntrTrnPubBcastT.primExchIdCod, lprimExchIdCod, PRIM_EXCH_ID_COD_LEN);

	vextIdayCntrTrnPubBcastT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "extIdayCntrTrnPubBcastT");
	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vextIdayCntrTrnPubBcastT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("SubBOInfo.extIdayCntrTrnPubBcastT.currTypCod", lcurrTypCod);
	memcpy(vextIdayCntrTrnPubBcastT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<TRD_UNT_NO_LEN;i++) {
		vextIdayCntrTrnPubBcastT.trdUntNo[i]= ' ';
	}
	char ltrdUntNo[TRD_UNT_NO_LEN] = {""};
	getStrProperty("SubBOInfo.extIdayCntrTrnPubBcastT.trdUntNo", ltrdUntNo);
	memcpy(vextIdayCntrTrnPubBcastT.trdUntNo, ltrdUntNo, TRD_UNT_NO_LEN);

	for(i=0;i<STRK_PRC_MULT_LEN;i++) {
		vextIdayCntrTrnPubBcastT.strkPrcMult[i]= ' ';
	}
	char lstrkPrcMult[STRK_PRC_MULT_LEN] = {""};
	getStrProperty("SubBOInfo.extIdayCntrTrnPubBcastT.strkPrcMult", lstrkPrcMult);
	memcpy(vextIdayCntrTrnPubBcastT.strkPrcMult, lstrkPrcMult, STRK_PRC_MULT_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vextIdayCntrTrnPubBcastT.cntrExpDat[i]= ' ';
	}
	char lcntrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubBOInfo.extIdayCntrTrnPubBcastT.cntrExpDat", lcntrExpDat);
	memcpy(vextIdayCntrTrnPubBcastT.cntrExpDat, lcntrExpDat, DRIV_DATE_LEN);

	char lcntrStsCod[1] = {""};
	getStrProperty("SubBOInfo.extIdayCntrTrnPubBcastT.cntrStsCod", lcntrStsCod);
	vextIdayCntrTrnPubBcastT.cntrStsCod = lcntrStsCod[0];

	char lcntrAsynInd[1] = {""};
	getStrProperty("SubBOInfo.extIdayCntrTrnPubBcastT.cntrAsynInd", lcntrAsynInd);
	vextIdayCntrTrnPubBcastT.cntrAsynInd = lcntrAsynInd[0];

	char llepoInd[1] = {""};
	getStrProperty("SubBOInfo.extIdayCntrTrnPubBcastT.lepoInd", llepoInd);
	vextIdayCntrTrnPubBcastT.lepoInd = llepoInd[0];

	vextIdayCntrTrnPubBcastT.occCntrIdGrp = getOccCntrIdGrpT(testCaseNum, "extIdayCntrTrnPubBcastT");	return vextIdayCntrTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
idayCntrTrnPubBcastT getIdayCntrTrnPubBcastT(char* testCaseNum , const char *root) {
	idayCntrTrnPubBcastT vidayCntrTrnPubBcastT;
	int i;

	vidayCntrTrnPubBcastT.seqNo = getBscSeqNoT(testCaseNum, "idayCntrTrnPubBcastT");
	vidayCntrTrnPubBcastT.header = getDataHeaderT(testCaseNum, "idayCntrTrnPubBcastT");
	vidayCntrTrnPubBcastT.extension = getExtIdayCntrTrnPubBcastT(testCaseNum, "idayCntrTrnPubBcastT");	return vidayCntrTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extProdChgTrnPubBcastT getExtProdChgTrnPubBcastT(char* testCaseNum , const char *root) {
	extProdChgTrnPubBcastT vextProdChgTrnPubBcastT;
	int i;

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextProdChgTrnPubBcastT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("SubBOInfo.extProdChgTrnPubBcastT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextProdChgTrnPubBcastT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);

	for(i=0;i<PROD_CHG_TRN_TYP_LEN;i++) {
		vextProdChgTrnPubBcastT.prodChgTrnTyp[i]= ' ';
	}
	char lprodChgTrnTyp[PROD_CHG_TRN_TYP_LEN] = {""};
	getStrProperty("SubBOInfo.extProdChgTrnPubBcastT.prodChgTrnTyp", lprodChgTrnTyp);
	memcpy(vextProdChgTrnPubBcastT.prodChgTrnTyp, lprodChgTrnTyp, PROD_CHG_TRN_TYP_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vextProdChgTrnPubBcastT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubBOInfo.extProdChgTrnPubBcastT.prodId", lprodId);
	memcpy(vextProdChgTrnPubBcastT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vextProdChgTrnPubBcastT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("SubBOInfo.extProdChgTrnPubBcastT.isinCod", lisinCod);
	memcpy(vextProdChgTrnPubBcastT.isinCod, lisinCod, ISIN_COD_LEN);

	char lexerPrcDcmlOld[1] = {""};
	getStrProperty("SubBOInfo.extProdChgTrnPubBcastT.exerPrcDcmlOld", lexerPrcDcmlOld);
	vextProdChgTrnPubBcastT.exerPrcDcmlOld = lexerPrcDcmlOld[0];

	char lexerPrcDcmlNew[1] = {""};
	getStrProperty("SubBOInfo.extProdChgTrnPubBcastT.exerPrcDcmlNew", lexerPrcDcmlNew);
	vextProdChgTrnPubBcastT.exerPrcDcmlNew = lexerPrcDcmlNew[0];
	return vextProdChgTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
prodChgTrnPubBcastT getProdChgTrnPubBcastT(char* testCaseNum , const char *root) {
	prodChgTrnPubBcastT vprodChgTrnPubBcastT;
	int i;

	vprodChgTrnPubBcastT.seqNo = getBscSeqNoT(testCaseNum, "prodChgTrnPubBcastT");
	vprodChgTrnPubBcastT.header = getDataHeaderT(testCaseNum, "prodChgTrnPubBcastT");
	vprodChgTrnPubBcastT.extension = getExtProdChgTrnPubBcastT(testCaseNum, "prodChgTrnPubBcastT");	return vprodChgTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extSetlPrcTrnPubBcastT getExtSetlPrcTrnPubBcastT(char* testCaseNum , const char *root) {
	extSetlPrcTrnPubBcastT vextSetlPrcTrnPubBcastT;
	int i;

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextSetlPrcTrnPubBcastT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("SubBOInfo.extSetlPrcTrnPubBcastT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextSetlPrcTrnPubBcastT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);

	for(i=0;i<NO_OF_SETL_PRC_LEN;i++) {
		vextSetlPrcTrnPubBcastT.noOfSetlPrc[i]= ' ';
	}
	char lnoOfSetlPrc[NO_OF_SETL_PRC_LEN] = {""};
	getStrProperty("SubBOInfo.extSetlPrcTrnPubBcastT.noOfSetlPrc", lnoOfSetlPrc);
	memcpy(vextSetlPrcTrnPubBcastT.noOfSetlPrc, lnoOfSetlPrc, NO_OF_SETL_PRC_LEN);
	return vextSetlPrcTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
setlPrcTrnPubBcastT getSetlPrcTrnPubBcastT(char* testCaseNum , const char *root) {
	setlPrcTrnPubBcastT vsetlPrcTrnPubBcastT;
	int i;

	vsetlPrcTrnPubBcastT.seqNo = getBscSeqNoT(testCaseNum, "setlPrcTrnPubBcastT");
	vsetlPrcTrnPubBcastT.header = getDataHeaderT(testCaseNum, "setlPrcTrnPubBcastT");
	vsetlPrcTrnPubBcastT.extension = getExtSetlPrcTrnPubBcastT(testCaseNum, "setlPrcTrnPubBcastT");	return vsetlPrcTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extStsMsgTrnPubBcastT getExtStsMsgTrnPubBcastT(char* testCaseNum , const char *root) {
	extStsMsgTrnPubBcastT vextStsMsgTrnPubBcastT;
	int i;

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vextStsMsgTrnPubBcastT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("SubBOInfo.extStsMsgTrnPubBcastT.boiTrnTyp", lboiTrnTyp);
	memcpy(vextStsMsgTrnPubBcastT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);

	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		vextStsMsgTrnPubBcastT.exchIdCod[i]= ' ';
	}
	char lexchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubBOInfo.extStsMsgTrnPubBcastT.exchIdCod", lexchIdCod);
	memcpy(vextStsMsgTrnPubBcastT.exchIdCod, lexchIdCod, DRIV_EXCH_ID_COD_LEN);

	for(i=0;i<STS_LEN;i++) {
		vextStsMsgTrnPubBcastT.sts[i]= ' ';
	}
	char lsts[STS_LEN] = {""};
	getStrProperty("SubBOInfo.extStsMsgTrnPubBcastT.sts", lsts);
	memcpy(vextStsMsgTrnPubBcastT.sts, lsts, STS_LEN);

	for(i=0;i<STS_PROD_ID_LEN;i++) {
		vextStsMsgTrnPubBcastT.stsProdId[i]= ' ';
	}
	char lstsProdId[STS_PROD_ID_LEN] = {""};
	getStrProperty("SubBOInfo.extStsMsgTrnPubBcastT.stsProdId", lstsProdId);
	memcpy(vextStsMsgTrnPubBcastT.stsProdId, lstsProdId, STS_PROD_ID_LEN);
	return vextStsMsgTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
stsMsgTrnPubBcastT getStsMsgTrnPubBcastT(char* testCaseNum , const char *root) {
	stsMsgTrnPubBcastT vstsMsgTrnPubBcastT;
	int i;

	vstsMsgTrnPubBcastT.seqNo = getBscSeqNoT(testCaseNum, "stsMsgTrnPubBcastT");
	vstsMsgTrnPubBcastT.header = getDataHeaderT(testCaseNum, "stsMsgTrnPubBcastT");
	vstsMsgTrnPubBcastT.extension = getExtStsMsgTrnPubBcastT(testCaseNum, "stsMsgTrnPubBcastT");	return vstsMsgTrnPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubBOInfoSubjectT getBscSubBOInfoSubjectT(char* testCaseNum , const char *root) {
	bscSubBOInfoSubjectT vbscSubBOInfoSubjectT;
	int i;

	for(i=0;i<BOI_TRN_TYP_LEN;i++) {
		vbscSubBOInfoSubjectT.boiTrnTyp[i]= ' ';
	}
	char lboiTrnTyp[BOI_TRN_TYP_LEN] = {""};
	getStrProperty("SubBOInfo.bscSubBOInfoSubjectT.boiTrnTyp", lboiTrnTyp);
	memcpy(vbscSubBOInfoSubjectT.boiTrnTyp, lboiTrnTyp, BOI_TRN_TYP_LEN);
	return vbscSubBOInfoSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtCapAdjTrnPubBcastT(extCapAdjTrnPubBcastT actual, extCapAdjTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnPubBcastT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.capAdjTrnTyp, expected.capAdjTrnTyp, CAP_ADJ_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnPubBcastT, capAdjTrnTyp not matching. Actual %s but Expected %s", actual.capAdjTrnTyp, expected.capAdjTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.capAdjEffDat, expected.capAdjEffDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnPubBcastT, capAdjEffDat not matching. Actual %s but Expected %s", actual.capAdjEffDat, expected.capAdjEffDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnPubBcastT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId2, expected.prodId2, DRIV_PROD_ID2_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnPubBcastT, prodId2 not matching. Actual %s but Expected %s", actual.prodId2, expected.prodId2);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnPubBcastT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.capAdjRtio, expected.capAdjRtio, CAP_ADJ_RTIO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnPubBcastT, capAdjRtio not matching. Actual %s but Expected %s", actual.capAdjRtio, expected.capAdjRtio);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshValDat, expected.cshValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnPubBcastT, cshValDat not matching. Actual %s but Expected %s", actual.cshValDat, expected.cshValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuValDat, expected.secuValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCapAdjTrnPubBcastT, secuValDat not matching. Actual %s but Expected %s", actual.secuValDat, expected.secuValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareCapAdjTrnPubBcastT(capAdjTrnPubBcastT actual, capAdjTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtCapAdjTrnPubBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtCntrChgTrnPubBcastT(extCntrChgTrnPubBcastT actual, extCntrChgTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrChgTrnTyp!= expected.cntrChgTrnTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrChgTrnTypnot matching. Actual %d but Expected %d", actual.cntrChgTrnTyp, expected.cntrChgTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.dcmlShft!= expected.dcmlShft) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, dcmlShftnot matching. Actual %d but Expected %d", actual.dcmlShft, expected.dcmlShft);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpDat, expected.cntrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrExpDat not matching. Actual %s but Expected %s", actual.cntrExpDat, expected.cntrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrGenNo!= expected.cntrGenNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrGenNonot matching. Actual %d but Expected %d", actual.cntrGenNo, expected.cntrGenNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExerPrc, expected.cntrExerPrc, CNTR_EXER_PRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrExerPrc not matching. Actual %s but Expected %s", actual.cntrExerPrc, expected.cntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrSiz, expected.cntrSiz, CNTR_SIZ_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrSiz not matching. Actual %s but Expected %s", actual.cntrSiz, expected.cntrSiz);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodIdNew, expected.prodIdNew, PROD_ID_NEW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, prodIdNew not matching. Actual %s but Expected %s", actual.prodIdNew, expected.prodIdNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCodNew!= expected.cntrClasCodNew) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrClasCodNewnot matching. Actual %d but Expected %d", actual.cntrClasCodNew, expected.cntrClasCodNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDatNew, expected.cntrExpMthDatNew, CNTR_EXP_MTH_DAT_NEW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrExpMthDatNew not matching. Actual %s but Expected %s", actual.cntrExpMthDatNew, expected.cntrExpMthDatNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDatNew, expected.cntrExpYrDatNew, CNTR_EXP_YR_DAT_NEW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrExpYrDatNew not matching. Actual %s but Expected %s", actual.cntrExpYrDatNew, expected.cntrExpYrDatNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExerPrcNew, expected.cntrExerPrcNew, CNTR_EXER_PRC_NEW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrExerPrcNew not matching. Actual %s but Expected %s", actual.cntrExerPrcNew, expected.cntrExerPrcNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNoNew!= expected.cntrVersNoNew) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrVersNoNewnot matching. Actual %d but Expected %d", actual.cntrVersNoNew, expected.cntrVersNoNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrSizNew, expected.cntrSizNew, CNTR_SIZ_NEW_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cntrSizNew not matching. Actual %s but Expected %s", actual.cntrSizNew, expected.cntrSizNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cshValDat, expected.cshValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, cshValDat not matching. Actual %s but Expected %s", actual.cshValDat, expected.cshValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.secuValDat, expected.secuValDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, secuValDat not matching. Actual %s but Expected %s", actual.secuValDat, expected.secuValDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.autManExerTyp!= expected.autManExerTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, autManExerTypnot matching. Actual %d but Expected %d", actual.autManExerTyp, expected.autManExerTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerStylTyp!= expected.exerStylTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, exerStylTypnot matching. Actual %d but Expected %d", actual.exerStylTyp, expected.exerStylTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.mgnStylTyp!= expected.mgnStylTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, mgnStylTypnot matching. Actual %d but Expected %d", actual.mgnStylTyp, expected.mgnStylTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerPrcDcml!= expected.exerPrcDcml) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extCntrChgTrnPubBcastT, exerPrcDcmlnot matching. Actual %d but Expected %d", actual.exerPrcDcml, expected.exerPrcDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareCntrChgTrnPubBcastT(cntrChgTrnPubBcastT actual, cntrChgTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtCntrChgTrnPubBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtExchRatTrnPubBcastT(extExchRatTrnPubBcastT actual, extExchRatTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extExchRatTrnPubBcastT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.noOfExchRat, expected.noOfExchRat, NO_OF_EXCH_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extExchRatTrnPubBcastT, noOfExchRat not matching. Actual %s but Expected %s", actual.noOfExchRat, expected.noOfExchRat);
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
void compareExchRatTrnPubBcastT(exchRatTrnPubBcastT actual, exchRatTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtExchRatTrnPubBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtIdayCntrTrnPubBcastT(extIdayCntrTrnPubBcastT actual, extIdayCntrTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extIdayCntrTrnPubBcastT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.primExchIdCod, expected.primExchIdCod, PRIM_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extIdayCntrTrnPubBcastT, primExchIdCod not matching. Actual %s but Expected %s", actual.primExchIdCod, expected.primExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extIdayCntrTrnPubBcastT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdUntNo, expected.trdUntNo, TRD_UNT_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extIdayCntrTrnPubBcastT, trdUntNo not matching. Actual %s but Expected %s", actual.trdUntNo, expected.trdUntNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.strkPrcMult, expected.strkPrcMult, STRK_PRC_MULT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extIdayCntrTrnPubBcastT, strkPrcMult not matching. Actual %s but Expected %s", actual.strkPrcMult, expected.strkPrcMult);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpDat, expected.cntrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extIdayCntrTrnPubBcastT, cntrExpDat not matching. Actual %s but Expected %s", actual.cntrExpDat, expected.cntrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrStsCod!= expected.cntrStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extIdayCntrTrnPubBcastT, cntrStsCodnot matching. Actual %d but Expected %d", actual.cntrStsCod, expected.cntrStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrAsynInd!= expected.cntrAsynInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extIdayCntrTrnPubBcastT, cntrAsynIndnot matching. Actual %d but Expected %d", actual.cntrAsynInd, expected.cntrAsynInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.lepoInd!= expected.lepoInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extIdayCntrTrnPubBcastT, lepoIndnot matching. Actual %d but Expected %d", actual.lepoInd, expected.lepoInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOccCntrIdGrpT (actual.occCntrIdGrp,expected.occCntrIdGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareIdayCntrTrnPubBcastT(idayCntrTrnPubBcastT actual, idayCntrTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtIdayCntrTrnPubBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtProdChgTrnPubBcastT(extProdChgTrnPubBcastT actual, extProdChgTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnPubBcastT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodChgTrnTyp, expected.prodChgTrnTyp, PROD_CHG_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnPubBcastT, prodChgTrnTyp not matching. Actual %s but Expected %s", actual.prodChgTrnTyp, expected.prodChgTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnPubBcastT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnPubBcastT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerPrcDcmlOld!= expected.exerPrcDcmlOld) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnPubBcastT, exerPrcDcmlOldnot matching. Actual %d but Expected %d", actual.exerPrcDcmlOld, expected.exerPrcDcmlOld);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.exerPrcDcmlNew!= expected.exerPrcDcmlNew) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extProdChgTrnPubBcastT, exerPrcDcmlNewnot matching. Actual %d but Expected %d", actual.exerPrcDcmlNew, expected.exerPrcDcmlNew);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareProdChgTrnPubBcastT(prodChgTrnPubBcastT actual, prodChgTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtProdChgTrnPubBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtSetlPrcTrnPubBcastT(extSetlPrcTrnPubBcastT actual, extSetlPrcTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnPubBcastT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.noOfSetlPrc, expected.noOfSetlPrc, NO_OF_SETL_PRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSetlPrcTrnPubBcastT, noOfSetlPrc not matching. Actual %s but Expected %s", actual.noOfSetlPrc, expected.noOfSetlPrc);
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
void compareSetlPrcTrnPubBcastT(setlPrcTrnPubBcastT actual, setlPrcTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtSetlPrcTrnPubBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtStsMsgTrnPubBcastT(extStsMsgTrnPubBcastT actual, extStsMsgTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extStsMsgTrnPubBcastT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.exchIdCod, expected.exchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extStsMsgTrnPubBcastT, exchIdCod not matching. Actual %s but Expected %s", actual.exchIdCod, expected.exchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.sts, expected.sts, STS_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extStsMsgTrnPubBcastT, sts not matching. Actual %s but Expected %s", actual.sts, expected.sts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stsProdId, expected.stsProdId, STS_PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extStsMsgTrnPubBcastT, stsProdId not matching. Actual %s but Expected %s", actual.stsProdId, expected.stsProdId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareStsMsgTrnPubBcastT(stsMsgTrnPubBcastT actual, stsMsgTrnPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareExtStsMsgTrnPubBcastT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubBOInfoSubjectT(bscSubBOInfoSubjectT actual, bscSubBOInfoSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.boiTrnTyp, expected.boiTrnTyp, BOI_TRN_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubBOInfoSubjectT, boiTrnTyp not matching. Actual %s but Expected %s", actual.boiTrnTyp, expected.boiTrnTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

