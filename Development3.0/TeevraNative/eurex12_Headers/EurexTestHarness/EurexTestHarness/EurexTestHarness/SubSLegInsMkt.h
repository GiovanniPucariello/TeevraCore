#include <SubSLegInsMkt.hxx>
#define BUFFER_SIZE 1000

futBscSubSLegInsMktSubjectT *vfutBscSubSLegInsMktSubjectT;
optBscSubSLegInsMktSubjectT *voptBscSubSLegInsMktSubjectT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSubSLegInsMktPubBcastT getFutBscSubSLegInsMktPubBcastT(char* testCaseNum , const char *root) {
	futBscSubSLegInsMktPubBcastT vfutBscSubSLegInsMktPubBcastT;
	int i;

	vfutBscSubSLegInsMktPubBcastT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscSubSLegInsMktPubBcastT");
	vfutBscSubSLegInsMktPubBcastT.bstOrdrGrp = getBstOrdrGrpT(testCaseNum, "futBscSubSLegInsMktPubBcastT");
	vfutBscSubSLegInsMktPubBcastT.bstQuoOrdrGrp = getBstQuoOrdrGrpT(testCaseNum, "futBscSubSLegInsMktPubBcastT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscSubSLegInsMktPubBcastT.totTrdQty[i]= ' ';
	}
	char ltotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futBscSubSLegInsMktPubBcastT.totTrdQty", ltotTrdQty);
	memcpy(vfutBscSubSLegInsMktPubBcastT.totTrdQty, ltotTrdQty, DRIV_QUANTITY_LEN);

	char lcntrStsValCod[1] = {""};
	getStrProperty("SubSLegInsMkt.futBscSubSLegInsMktPubBcastT.cntrStsValCod", lcntrStsValCod);
	vfutBscSubSLegInsMktPubBcastT.cntrStsValCod = lcntrStsValCod[0];
	return vfutBscSubSLegInsMktPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtSubSLegInsMktPubBcastT getFutExtSubSLegInsMktPubBcastT(char* testCaseNum , const char *root) {
	futExtSubSLegInsMktPubBcastT vfutExtSubSLegInsMktPubBcastT;
	int i;

	char lprcTypInd[1] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.prcTypInd", lprcTypInd);
	vfutExtSubSLegInsMktPubBcastT.prcTypInd = lprcTypInd[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtSubSLegInsMktPubBcastT.dlyHghPrc[i]= ' ';
	}
	char ldlyHghPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.dlyHghPrc", ldlyHghPrc);
	memcpy(vfutExtSubSLegInsMktPubBcastT.dlyHghPrc, ldlyHghPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtSubSLegInsMktPubBcastT.dlyLowPrc[i]= ' ';
	}
	char ldlyLowPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.dlyLowPrc", ldlyLowPrc);
	memcpy(vfutExtSubSLegInsMktPubBcastT.dlyLowPrc, ldlyLowPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtSubSLegInsMktPubBcastT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.lstTrdPrc", llstTrdPrc);
	memcpy(vfutExtSubSLegInsMktPubBcastT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtSubSLegInsMktPubBcastT.lstTrdQty[i]= ' ';
	}
	char llstTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.lstTrdQty", llstTrdQty);
	memcpy(vfutExtSubSLegInsMktPubBcastT.lstTrdQty, llstTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtSubSLegInsMktPubBcastT.lstAuctPrc[i]= ' ';
	}
	char llstAuctPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.lstAuctPrc", llstAuctPrc);
	memcpy(vfutExtSubSLegInsMktPubBcastT.lstAuctPrc, llstAuctPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtSubSLegInsMktPubBcastT.trdTim[i]= ' ';
	}
	char ltrdTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.trdTim", ltrdTim);
	memcpy(vfutExtSubSLegInsMktPubBcastT.trdTim, ltrdTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubSLegInsMktPubBcastT.crBidQty[i]= ' ';
	}
	char lcrBidQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.crBidQty", lcrBidQty);
	memcpy(vfutExtSubSLegInsMktPubBcastT.crBidQty, lcrBidQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubSLegInsMktPubBcastT.crAskQty[i]= ' ';
	}
	char lcrAskQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.crAskQty", lcrAskQty);
	memcpy(vfutExtSubSLegInsMktPubBcastT.crAskQty, lcrAskQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtSubSLegInsMktPubBcastT.crTim[i]= ' ';
	}
	char lcrTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.crTim", lcrTim);
	memcpy(vfutExtSubSLegInsMktPubBcastT.crTim, lcrTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubSLegInsMktPubBcastT.qrBidQty[i]= ' ';
	}
	char lqrBidQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.qrBidQty", lqrBidQty);
	memcpy(vfutExtSubSLegInsMktPubBcastT.qrBidQty, lqrBidQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubSLegInsMktPubBcastT.qrAskQty[i]= ' ';
	}
	char lqrAskQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.qrAskQty", lqrAskQty);
	memcpy(vfutExtSubSLegInsMktPubBcastT.qrAskQty, lqrAskQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtSubSLegInsMktPubBcastT.qrTim[i]= ' ';
	}
	char lqrTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.qrTim", lqrTim);
	memcpy(vfutExtSubSLegInsMktPubBcastT.qrTim, lqrTim, DRIV_TIME_LEN);

	char lblkAuctStsCod[1] = {""};
	getStrProperty("SubSLegInsMkt.futExtSubSLegInsMktPubBcastT.blkAuctStsCod", lblkAuctStsCod);
	vfutExtSubSLegInsMktPubBcastT.blkAuctStsCod = lblkAuctStsCod[0];
	return vfutExtSubSLegInsMktPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futSubSLegInsMktPubBcastT getFutSubSLegInsMktPubBcastT(char* testCaseNum , const char *root) {
	futSubSLegInsMktPubBcastT vfutSubSLegInsMktPubBcastT;
	int i;

	vfutSubSLegInsMktPubBcastT.header = getDataHeaderT(testCaseNum, "futSubSLegInsMktPubBcastT");
	vfutSubSLegInsMktPubBcastT.basic = getFutBscSubSLegInsMktPubBcastT(testCaseNum, "futSubSLegInsMktPubBcastT");
	vfutSubSLegInsMktPubBcastT.extension = getFutExtSubSLegInsMktPubBcastT(testCaseNum, "futSubSLegInsMktPubBcastT");	return vfutSubSLegInsMktPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscSubSLegInsMktPubBcastT getOptBscSubSLegInsMktPubBcastT(char* testCaseNum , const char *root) {
	optBscSubSLegInsMktPubBcastT voptBscSubSLegInsMktPubBcastT;
	int i;

	voptBscSubSLegInsMktPubBcastT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscSubSLegInsMktPubBcastT");
	voptBscSubSLegInsMktPubBcastT.bstOrdrGrp = getBstOrdrGrpT(testCaseNum, "optBscSubSLegInsMktPubBcastT");
	voptBscSubSLegInsMktPubBcastT.bstQuoOrdrGrp = getBstQuoOrdrGrpT(testCaseNum, "optBscSubSLegInsMktPubBcastT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscSubSLegInsMktPubBcastT.totTrdQty[i]= ' ';
	}
	char ltotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optBscSubSLegInsMktPubBcastT.totTrdQty", ltotTrdQty);
	memcpy(voptBscSubSLegInsMktPubBcastT.totTrdQty, ltotTrdQty, DRIV_QUANTITY_LEN);

	char lcntrStsValCod[1] = {""};
	getStrProperty("SubSLegInsMkt.optBscSubSLegInsMktPubBcastT.cntrStsValCod", lcntrStsValCod);
	voptBscSubSLegInsMktPubBcastT.cntrStsValCod = lcntrStsValCod[0];
	return voptBscSubSLegInsMktPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtSubSLegInsMktPubBcastT getOptExtSubSLegInsMktPubBcastT(char* testCaseNum , const char *root) {
	optExtSubSLegInsMktPubBcastT voptExtSubSLegInsMktPubBcastT;
	int i;

	char lprcTypInd[1] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.prcTypInd", lprcTypInd);
	voptExtSubSLegInsMktPubBcastT.prcTypInd = lprcTypInd[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtSubSLegInsMktPubBcastT.dlyHghPrc[i]= ' ';
	}
	char ldlyHghPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.dlyHghPrc", ldlyHghPrc);
	memcpy(voptExtSubSLegInsMktPubBcastT.dlyHghPrc, ldlyHghPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtSubSLegInsMktPubBcastT.dlyLowPrc[i]= ' ';
	}
	char ldlyLowPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.dlyLowPrc", ldlyLowPrc);
	memcpy(voptExtSubSLegInsMktPubBcastT.dlyLowPrc, ldlyLowPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtSubSLegInsMktPubBcastT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.lstTrdPrc", llstTrdPrc);
	memcpy(voptExtSubSLegInsMktPubBcastT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtSubSLegInsMktPubBcastT.lstTrdQty[i]= ' ';
	}
	char llstTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.lstTrdQty", llstTrdQty);
	memcpy(voptExtSubSLegInsMktPubBcastT.lstTrdQty, llstTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtSubSLegInsMktPubBcastT.lstAuctPrc[i]= ' ';
	}
	char llstAuctPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.lstAuctPrc", llstAuctPrc);
	memcpy(voptExtSubSLegInsMktPubBcastT.lstAuctPrc, llstAuctPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptExtSubSLegInsMktPubBcastT.trdTim[i]= ' ';
	}
	char ltrdTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.trdTim", ltrdTim);
	memcpy(voptExtSubSLegInsMktPubBcastT.trdTim, ltrdTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtSubSLegInsMktPubBcastT.crBidQty[i]= ' ';
	}
	char lcrBidQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.crBidQty", lcrBidQty);
	memcpy(voptExtSubSLegInsMktPubBcastT.crBidQty, lcrBidQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtSubSLegInsMktPubBcastT.crAskQty[i]= ' ';
	}
	char lcrAskQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.crAskQty", lcrAskQty);
	memcpy(voptExtSubSLegInsMktPubBcastT.crAskQty, lcrAskQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptExtSubSLegInsMktPubBcastT.crTim[i]= ' ';
	}
	char lcrTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.crTim", lcrTim);
	memcpy(voptExtSubSLegInsMktPubBcastT.crTim, lcrTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtSubSLegInsMktPubBcastT.qrBidQty[i]= ' ';
	}
	char lqrBidQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.qrBidQty", lqrBidQty);
	memcpy(voptExtSubSLegInsMktPubBcastT.qrBidQty, lqrBidQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtSubSLegInsMktPubBcastT.qrAskQty[i]= ' ';
	}
	char lqrAskQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.qrAskQty", lqrAskQty);
	memcpy(voptExtSubSLegInsMktPubBcastT.qrAskQty, lqrAskQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptExtSubSLegInsMktPubBcastT.qrTim[i]= ' ';
	}
	char lqrTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.qrTim", lqrTim);
	memcpy(voptExtSubSLegInsMktPubBcastT.qrTim, lqrTim, DRIV_TIME_LEN);

	char lblkAuctStsCod[1] = {""};
	getStrProperty("SubSLegInsMkt.optExtSubSLegInsMktPubBcastT.blkAuctStsCod", lblkAuctStsCod);
	voptExtSubSLegInsMktPubBcastT.blkAuctStsCod = lblkAuctStsCod[0];
	return voptExtSubSLegInsMktPubBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optSubSLegInsMktPubBcastT getOptSubSLegInsMktPubBcastT(char* testCaseNum , const char *root) {
	optSubSLegInsMktPubBcastT voptSubSLegInsMktPubBcastT;
	int i;

	voptSubSLegInsMktPubBcastT.header = getDataHeaderT(testCaseNum, "optSubSLegInsMktPubBcastT");
	voptSubSLegInsMktPubBcastT.basic = getOptBscSubSLegInsMktPubBcastT(testCaseNum, "optSubSLegInsMktPubBcastT");
	voptSubSLegInsMktPubBcastT.extension = getOptExtSubSLegInsMktPubBcastT(testCaseNum, "optSubSLegInsMktPubBcastT");	return voptSubSLegInsMktPubBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futBscSubSLegInsMktSubjectT* getFutBscSubSLegInsMktSubjectT(char* testCaseNum) {
	vfutBscSubSLegInsMktSubjectT = (futBscSubSLegInsMktSubjectT*)malloc(sizeof(futBscSubSLegInsMktSubjectT));
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscSubSLegInsMktSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futBscSubSLegInsMktSubjectT.prodId", lprodId);
	memcpy(vfutBscSubSLegInsMktSubjectT->prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutBscSubSLegInsMktSubjectT->cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futBscSubSLegInsMktSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vfutBscSubSLegInsMktSubjectT->cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutBscSubSLegInsMktSubjectT->cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futBscSubSLegInsMktSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vfutBscSubSLegInsMktSubjectT->cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<SUBJ_FILL_LEN;i++) {
		vfutBscSubSLegInsMktSubjectT->subjFill[i]= ' ';
	}
	char lsubjFill[SUBJ_FILL_LEN] = {""};
	getStrProperty("SubSLegInsMkt.futBscSubSLegInsMktSubjectT.subjFill", lsubjFill);
	memcpy(vfutBscSubSLegInsMktSubjectT->subjFill, lsubjFill, SUBJ_FILL_LEN);

	return vfutBscSubSLegInsMktSubjectT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optBscSubSLegInsMktSubjectT* getOptBscSubSLegInsMktSubjectT(char* testCaseNum) {
	voptBscSubSLegInsMktSubjectT = (optBscSubSLegInsMktSubjectT*)malloc(sizeof(optBscSubSLegInsMktSubjectT));
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscSubSLegInsMktSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optBscSubSLegInsMktSubjectT.prodId", lprodId);
	memcpy(voptBscSubSLegInsMktSubjectT->prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		voptBscSubSLegInsMktSubjectT->cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optBscSubSLegInsMktSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(voptBscSubSLegInsMktSubjectT->cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		voptBscSubSLegInsMktSubjectT->cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optBscSubSLegInsMktSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(voptBscSubSLegInsMktSubjectT->cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	char lcntrClasCod[1] = {""};
	getStrProperty("SubSLegInsMkt.optBscSubSLegInsMktSubjectT.cntrClasCod", lcntrClasCod);
	voptBscSubSLegInsMktSubjectT->cntrClasCod = lcntrClasCod[0];

	for(i=0;i<CNTR_EXER_PRC_LEN;i++) {
		voptBscSubSLegInsMktSubjectT->cntrExerPrc[i]= ' ';
	}
	char lcntrExerPrc[CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("SubSLegInsMkt.optBscSubSLegInsMktSubjectT.cntrExerPrc", lcntrExerPrc);
	memcpy(voptBscSubSLegInsMktSubjectT->cntrExerPrc, lcntrExerPrc, CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("SubSLegInsMkt.optBscSubSLegInsMktSubjectT.cntrVersNo", lcntrVersNo);
	voptBscSubSLegInsMktSubjectT->cntrVersNo = lcntrVersNo[0];

	return voptBscSubSLegInsMktSubjectT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutBscSubSLegInsMktSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futBscSubSLegInsMktSubjectT));
	futBscSubSLegInsMktSubjectT *vfutBscSubSLegInsMktSubjectT = getFutBscSubSLegInsMktSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futBscSubSLegInsMktSubjectT), (jbyte*) vfutBscSubSLegInsMktSubjectT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptBscSubSLegInsMktSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optBscSubSLegInsMktSubjectT));
	optBscSubSLegInsMktSubjectT *voptBscSubSLegInsMktSubjectT = getOptBscSubSLegInsMktSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optBscSubSLegInsMktSubjectT), (jbyte*) voptBscSubSLegInsMktSubjectT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSubSLegInsMktPubBcastT(futBscSubSLegInsMktPubBcastT actual, futBscSubSLegInsMktPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareBstOrdrGrpT (actual.bstOrdrGrp,expected.bstOrdrGrp, logMsg);
	compareBstQuoOrdrGrpT (actual.bstQuoOrdrGrp,expected.bstQuoOrdrGrp, logMsg);
	if ( memcmp(actual.totTrdQty, expected.totTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegInsMktPubBcastT, totTrdQty not matching. Actual %s but Expected %s", actual.totTrdQty, expected.totTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrStsValCod!= expected.cntrStsValCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegInsMktPubBcastT, cntrStsValCodnot matching. Actual %d but Expected %d", actual.cntrStsValCod, expected.cntrStsValCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtSubSLegInsMktPubBcastT(futExtSubSLegInsMktPubBcastT actual, futExtSubSLegInsMktPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.prcTypInd!= expected.prcTypInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, prcTypIndnot matching. Actual %d but Expected %d", actual.prcTypInd, expected.prcTypInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyHghPrc, expected.dlyHghPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, dlyHghPrc not matching. Actual %s but Expected %s", actual.dlyHghPrc, expected.dlyHghPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyLowPrc, expected.dlyLowPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, dlyLowPrc not matching. Actual %s but Expected %s", actual.dlyLowPrc, expected.dlyLowPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdQty, expected.lstTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, lstTrdQty not matching. Actual %s but Expected %s", actual.lstTrdQty, expected.lstTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstAuctPrc, expected.lstAuctPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, lstAuctPrc not matching. Actual %s but Expected %s", actual.lstAuctPrc, expected.lstAuctPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdTim, expected.trdTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, trdTim not matching. Actual %s but Expected %s", actual.trdTim, expected.trdTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crBidQty, expected.crBidQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, crBidQty not matching. Actual %s but Expected %s", actual.crBidQty, expected.crBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crAskQty, expected.crAskQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, crAskQty not matching. Actual %s but Expected %s", actual.crAskQty, expected.crAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crTim, expected.crTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, crTim not matching. Actual %s but Expected %s", actual.crTim, expected.crTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.qrBidQty, expected.qrBidQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, qrBidQty not matching. Actual %s but Expected %s", actual.qrBidQty, expected.qrBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.qrAskQty, expected.qrAskQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, qrAskQty not matching. Actual %s but Expected %s", actual.qrAskQty, expected.qrAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.qrTim, expected.qrTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, qrTim not matching. Actual %s but Expected %s", actual.qrTim, expected.qrTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.blkAuctStsCod!= expected.blkAuctStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegInsMktPubBcastT, blkAuctStsCodnot matching. Actual %d but Expected %d", actual.blkAuctStsCod, expected.blkAuctStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutSubSLegInsMktPubBcastT(futSubSLegInsMktPubBcastT actual, futSubSLegInsMktPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareFutBscSubSLegInsMktPubBcastT (actual.basic,expected.basic, logMsg);
	compareFutExtSubSLegInsMktPubBcastT (actual.extension,expected.extension, logMsg);
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscSubSLegInsMktPubBcastT(optBscSubSLegInsMktPubBcastT actual, optBscSubSLegInsMktPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareBstOrdrGrpT (actual.bstOrdrGrp,expected.bstOrdrGrp, logMsg);
	compareBstQuoOrdrGrpT (actual.bstQuoOrdrGrp,expected.bstQuoOrdrGrp, logMsg);
	if ( memcmp(actual.totTrdQty, expected.totTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegInsMktPubBcastT, totTrdQty not matching. Actual %s but Expected %s", actual.totTrdQty, expected.totTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrStsValCod!= expected.cntrStsValCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegInsMktPubBcastT, cntrStsValCodnot matching. Actual %d but Expected %d", actual.cntrStsValCod, expected.cntrStsValCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtSubSLegInsMktPubBcastT(optExtSubSLegInsMktPubBcastT actual, optExtSubSLegInsMktPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.prcTypInd!= expected.prcTypInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, prcTypIndnot matching. Actual %d but Expected %d", actual.prcTypInd, expected.prcTypInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyHghPrc, expected.dlyHghPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, dlyHghPrc not matching. Actual %s but Expected %s", actual.dlyHghPrc, expected.dlyHghPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyLowPrc, expected.dlyLowPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, dlyLowPrc not matching. Actual %s but Expected %s", actual.dlyLowPrc, expected.dlyLowPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdQty, expected.lstTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, lstTrdQty not matching. Actual %s but Expected %s", actual.lstTrdQty, expected.lstTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstAuctPrc, expected.lstAuctPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, lstAuctPrc not matching. Actual %s but Expected %s", actual.lstAuctPrc, expected.lstAuctPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdTim, expected.trdTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, trdTim not matching. Actual %s but Expected %s", actual.trdTim, expected.trdTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crBidQty, expected.crBidQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, crBidQty not matching. Actual %s but Expected %s", actual.crBidQty, expected.crBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crAskQty, expected.crAskQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, crAskQty not matching. Actual %s but Expected %s", actual.crAskQty, expected.crAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.crTim, expected.crTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, crTim not matching. Actual %s but Expected %s", actual.crTim, expected.crTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.qrBidQty, expected.qrBidQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, qrBidQty not matching. Actual %s but Expected %s", actual.qrBidQty, expected.qrBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.qrAskQty, expected.qrAskQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, qrAskQty not matching. Actual %s but Expected %s", actual.qrAskQty, expected.qrAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.qrTim, expected.qrTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, qrTim not matching. Actual %s but Expected %s", actual.qrTim, expected.qrTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.blkAuctStsCod!= expected.blkAuctStsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegInsMktPubBcastT, blkAuctStsCodnot matching. Actual %d but Expected %d", actual.blkAuctStsCod, expected.blkAuctStsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptSubSLegInsMktPubBcastT(optSubSLegInsMktPubBcastT actual, optSubSLegInsMktPubBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareOptBscSubSLegInsMktPubBcastT (actual.basic,expected.basic, logMsg);
	compareOptExtSubSLegInsMktPubBcastT (actual.extension,expected.extension, logMsg);
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutBscSubSLegInsMktSubjectT(futBscSubSLegInsMktSubjectT actual, futBscSubSLegInsMktSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegInsMktSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpYrDat!= expected.cntrExpYrDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegInsMktSubjectT, cntrExpYrDatnot matching. Actual %d but Expected %d", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpMthDat!= expected.cntrExpMthDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegInsMktSubjectT, cntrExpMthDatnot matching. Actual %d but Expected %d", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.subjFill!= expected.subjFill) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegInsMktSubjectT, subjFillnot matching. Actual %d but Expected %d", actual.subjFill, expected.subjFill);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptBscSubSLegInsMktSubjectT(optBscSubSLegInsMktSubjectT actual, optBscSubSLegInsMktSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegInsMktSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpYrDat!= expected.cntrExpYrDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegInsMktSubjectT, cntrExpYrDatnot matching. Actual %d but Expected %d", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpMthDat!= expected.cntrExpMthDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegInsMktSubjectT, cntrExpMthDatnot matching. Actual %d but Expected %d", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegInsMktSubjectT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExerPrc!= expected.cntrExerPrc) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegInsMktSubjectT, cntrExerPrcnot matching. Actual %d but Expected %d", actual.cntrExerPrc, expected.cntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegInsMktSubjectT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutBscSubSLegInsMktSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futBscSubSLegInsMktSubjectT *actualData = (futBscSubSLegInsMktSubjectT *)msgStruct;
	futBscSubSLegInsMktSubjectT* expectedData = getFutBscSubSLegInsMktSubjectT(testCaseNum);
	compareFutBscSubSLegInsMktSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptBscSubSLegInsMktSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optBscSubSLegInsMktSubjectT *actualData = (optBscSubSLegInsMktSubjectT *)msgStruct;
	optBscSubSLegInsMktSubjectT* expectedData = getOptBscSubSLegInsMktSubjectT(testCaseNum);
	compareOptBscSubSLegInsMktSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
