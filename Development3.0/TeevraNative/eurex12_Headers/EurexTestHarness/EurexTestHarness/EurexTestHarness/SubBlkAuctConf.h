#include <SubBlkAuctConf.hxx>
#define BUFFER_SIZE 1000

futSubBlkAuctConfPrivBcastT *vfutSubBlkAuctConfPrivBcastT;
optSubBlkAuctConfPrivBcastT *voptSubBlkAuctConfPrivBcastT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSubBlkAuctConfPrivBcastT getFutBscSubBlkAuctConfPrivBcastT(char* testCaseNum , const char *root) {
	futBscSubBlkAuctConfPrivBcastT vfutBscSubBlkAuctConfPrivBcastT;
	int i;

	vfutBscSubBlkAuctConfPrivBcastT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscSubBlkAuctConfPrivBcastT");
	vfutBscSubBlkAuctConfPrivBcastT.blkAuctPotPrcGrp = getBlkAuctPotPrcGrpT(testCaseNum, "futBscSubBlkAuctConfPrivBcastT");	return vfutBscSubBlkAuctConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtSubBlkAuctConfPrivBcastT getFutExtSubBlkAuctConfPrivBcastT(char* testCaseNum , const char *root) {
	futExtSubBlkAuctConfPrivBcastT vfutExtSubBlkAuctConfPrivBcastT;
	int i;

	vfutExtSubBlkAuctConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futExtSubBlkAuctConfPrivBcastT");
	char lbuyCod[1] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.buyCod", lbuyCod);
	vfutExtSubBlkAuctConfPrivBcastT.buyCod = lbuyCod[0];

	char lordrTypCod[1] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.ordrTypCod", lordrTypCod);
	vfutExtSubBlkAuctConfPrivBcastT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutExtSubBlkAuctConfPrivBcastT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.ordrNoBuy", lordrNoBuy);
	memcpy(vfutExtSubBlkAuctConfPrivBcastT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutExtSubBlkAuctConfPrivBcastT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.ordrNoSel", lordrNoSel);
	memcpy(vfutExtSubBlkAuctConfPrivBcastT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtSubBlkAuctConfPrivBcastT.quoPrcBuy[i]= ' ';
	}
	char lquoPrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.quoPrcBuy", lquoPrcBuy);
	memcpy(vfutExtSubBlkAuctConfPrivBcastT.quoPrcBuy, lquoPrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtSubBlkAuctConfPrivBcastT.quoPrcSel[i]= ' ';
	}
	char lquoPrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.quoPrcSel", lquoPrcSel);
	memcpy(vfutExtSubBlkAuctConfPrivBcastT.quoPrcSel, lquoPrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubBlkAuctConfPrivBcastT.blkAuctQuoQtyBuy[i]= ' ';
	}
	char lblkAuctQuoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.blkAuctQuoQtyBuy", lblkAuctQuoQtyBuy);
	memcpy(vfutExtSubBlkAuctConfPrivBcastT.blkAuctQuoQtyBuy, lblkAuctQuoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubBlkAuctConfPrivBcastT.blkAuctQuoQtySel[i]= ' ';
	}
	char lblkAuctQuoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.blkAuctQuoQtySel", lblkAuctQuoQtySel);
	memcpy(vfutExtSubBlkAuctConfPrivBcastT.blkAuctQuoQtySel, lblkAuctQuoQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubBlkAuctConfPrivBcastT.blkAuctQuoExeQtyBuy[i]= ' ';
	}
	char lblkAuctQuoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.blkAuctQuoExeQtyBuy", lblkAuctQuoExeQtyBuy);
	memcpy(vfutExtSubBlkAuctConfPrivBcastT.blkAuctQuoExeQtyBuy, lblkAuctQuoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtSubBlkAuctConfPrivBcastT.blkAuctQuoExeQtySel[i]= ' ';
	}
	char lblkAuctQuoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.blkAuctQuoExeQtySel", lblkAuctQuoExeQtySel);
	memcpy(vfutExtSubBlkAuctConfPrivBcastT.blkAuctQuoExeQtySel, lblkAuctQuoExeQtySel, DRIV_VOLUME_LEN);

	char ltrnTypId[1] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.trnTypId", ltrnTypId);
	vfutExtSubBlkAuctConfPrivBcastT.trnTypId = ltrnTypId[0];

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtSubBlkAuctConfPrivBcastT.quoTrnTimBuy[i]= ' ';
	}
	char lquoTrnTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.quoTrnTimBuy", lquoTrnTimBuy);
	memcpy(vfutExtSubBlkAuctConfPrivBcastT.quoTrnTimBuy, lquoTrnTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtSubBlkAuctConfPrivBcastT.quoTrnTimSel[i]= ' ';
	}
	char lquoTrnTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.quoTrnTimSel", lquoTrnTimSel);
	memcpy(vfutExtSubBlkAuctConfPrivBcastT.quoTrnTimSel, lquoTrnTimSel, DRIV_TIME_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.opnClsCod", lopnClsCod);
	vfutExtSubBlkAuctConfPrivBcastT.opnClsCod = lopnClsCod[0];

	vfutExtSubBlkAuctConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtSubBlkAuctConfPrivBcastT");
	vfutExtSubBlkAuctConfPrivBcastT.txtGrp = getTxtGrpT(testCaseNum, "futExtSubBlkAuctConfPrivBcastT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutExtSubBlkAuctConfPrivBcastT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutExtSubBlkAuctConfPrivBcastT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutExtSubBlkAuctConfPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futExtSubBlkAuctConfPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutExtSubBlkAuctConfPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutExtSubBlkAuctConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futSubBlkAuctConfSubjectT getFutSubBlkAuctConfSubjectT(char* testCaseNum , const char *root) {
	futSubBlkAuctConfSubjectT vfutSubBlkAuctConfSubjectT;
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vfutSubBlkAuctConfSubjectT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futSubBlkAuctConfSubjectT.membId", lmembId);
	memcpy(vfutSubBlkAuctConfSubjectT.membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutSubBlkAuctConfSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futSubBlkAuctConfSubjectT.prodId", lprodId);
	memcpy(vfutSubBlkAuctConfSubjectT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutSubBlkAuctConfSubjectT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futSubBlkAuctConfSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vfutSubBlkAuctConfSubjectT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutSubBlkAuctConfSubjectT.cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futSubBlkAuctConfSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vfutSubBlkAuctConfSubjectT.cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<SUBJ_FILL_LEN;i++) {
		vfutSubBlkAuctConfSubjectT.subjFill[i]= ' ';
	}
	char lsubjFill[SUBJ_FILL_LEN] = {""};
	getStrProperty("SubBlkAuctConf.futSubBlkAuctConfSubjectT.subjFill", lsubjFill);
	memcpy(vfutSubBlkAuctConfSubjectT.subjFill, lsubjFill, SUBJ_FILL_LEN);
	return vfutSubBlkAuctConfSubjectT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscSubBlkAuctConfPrivBcastT getOptBscSubBlkAuctConfPrivBcastT(char* testCaseNum , const char *root) {
	optBscSubBlkAuctConfPrivBcastT voptBscSubBlkAuctConfPrivBcastT;
	int i;

	voptBscSubBlkAuctConfPrivBcastT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscSubBlkAuctConfPrivBcastT");
	voptBscSubBlkAuctConfPrivBcastT.blkAuctPotPrcGrp = getBlkAuctPotPrcGrpT(testCaseNum, "optBscSubBlkAuctConfPrivBcastT");	return voptBscSubBlkAuctConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtSubBlkAuctConfPrivBcastT getOptExtSubBlkAuctConfPrivBcastT(char* testCaseNum , const char *root) {
	optExtSubBlkAuctConfPrivBcastT voptExtSubBlkAuctConfPrivBcastT;
	int i;

	voptExtSubBlkAuctConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optExtSubBlkAuctConfPrivBcastT");
	char lbuyCod[1] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.buyCod", lbuyCod);
	voptExtSubBlkAuctConfPrivBcastT.buyCod = lbuyCod[0];

	char lordrTypCod[1] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.ordrTypCod", lordrTypCod);
	voptExtSubBlkAuctConfPrivBcastT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptExtSubBlkAuctConfPrivBcastT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.ordrNoBuy", lordrNoBuy);
	memcpy(voptExtSubBlkAuctConfPrivBcastT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptExtSubBlkAuctConfPrivBcastT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.ordrNoSel", lordrNoSel);
	memcpy(voptExtSubBlkAuctConfPrivBcastT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtSubBlkAuctConfPrivBcastT.quoPrcBuy[i]= ' ';
	}
	char lquoPrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.quoPrcBuy", lquoPrcBuy);
	memcpy(voptExtSubBlkAuctConfPrivBcastT.quoPrcBuy, lquoPrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtSubBlkAuctConfPrivBcastT.quoPrcSel[i]= ' ';
	}
	char lquoPrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.quoPrcSel", lquoPrcSel);
	memcpy(voptExtSubBlkAuctConfPrivBcastT.quoPrcSel, lquoPrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtSubBlkAuctConfPrivBcastT.blkAuctQuoQtyBuy[i]= ' ';
	}
	char lblkAuctQuoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.blkAuctQuoQtyBuy", lblkAuctQuoQtyBuy);
	memcpy(voptExtSubBlkAuctConfPrivBcastT.blkAuctQuoQtyBuy, lblkAuctQuoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtSubBlkAuctConfPrivBcastT.blkAuctQuoQtySel[i]= ' ';
	}
	char lblkAuctQuoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.blkAuctQuoQtySel", lblkAuctQuoQtySel);
	memcpy(voptExtSubBlkAuctConfPrivBcastT.blkAuctQuoQtySel, lblkAuctQuoQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtSubBlkAuctConfPrivBcastT.blkAuctQuoExeQtyBuy[i]= ' ';
	}
	char lblkAuctQuoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.blkAuctQuoExeQtyBuy", lblkAuctQuoExeQtyBuy);
	memcpy(voptExtSubBlkAuctConfPrivBcastT.blkAuctQuoExeQtyBuy, lblkAuctQuoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtSubBlkAuctConfPrivBcastT.blkAuctQuoExeQtySel[i]= ' ';
	}
	char lblkAuctQuoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.blkAuctQuoExeQtySel", lblkAuctQuoExeQtySel);
	memcpy(voptExtSubBlkAuctConfPrivBcastT.blkAuctQuoExeQtySel, lblkAuctQuoExeQtySel, DRIV_VOLUME_LEN);

	char ltrnTypId[1] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.trnTypId", ltrnTypId);
	voptExtSubBlkAuctConfPrivBcastT.trnTypId = ltrnTypId[0];

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptExtSubBlkAuctConfPrivBcastT.quoTrnTimBuy[i]= ' ';
	}
	char lquoTrnTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.quoTrnTimBuy", lquoTrnTimBuy);
	memcpy(voptExtSubBlkAuctConfPrivBcastT.quoTrnTimBuy, lquoTrnTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptExtSubBlkAuctConfPrivBcastT.quoTrnTimSel[i]= ' ';
	}
	char lquoTrnTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.quoTrnTimSel", lquoTrnTimSel);
	memcpy(voptExtSubBlkAuctConfPrivBcastT.quoTrnTimSel, lquoTrnTimSel, DRIV_TIME_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.opnClsCod", lopnClsCod);
	voptExtSubBlkAuctConfPrivBcastT.opnClsCod = lopnClsCod[0];

	voptExtSubBlkAuctConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtSubBlkAuctConfPrivBcastT");
	voptExtSubBlkAuctConfPrivBcastT.txtGrp = getTxtGrpT(testCaseNum, "optExtSubBlkAuctConfPrivBcastT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptExtSubBlkAuctConfPrivBcastT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptExtSubBlkAuctConfPrivBcastT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptExtSubBlkAuctConfPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optExtSubBlkAuctConfPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptExtSubBlkAuctConfPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptExtSubBlkAuctConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optSubBlkAuctConfSubjectT getOptSubBlkAuctConfSubjectT(char* testCaseNum , const char *root) {
	optSubBlkAuctConfSubjectT voptSubBlkAuctConfSubjectT;
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		voptSubBlkAuctConfSubjectT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optSubBlkAuctConfSubjectT.membId", lmembId);
	memcpy(voptSubBlkAuctConfSubjectT.membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		voptSubBlkAuctConfSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optSubBlkAuctConfSubjectT.prodId", lprodId);
	memcpy(voptSubBlkAuctConfSubjectT.prodId, lprodId, PROD_ID_LEN);

	char lcntrClasCod[1] = {""};
	getStrProperty("SubBlkAuctConf.optSubBlkAuctConfSubjectT.cntrClasCod", lcntrClasCod);
	voptSubBlkAuctConfSubjectT.cntrClasCod = lcntrClasCod[0];

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		voptSubBlkAuctConfSubjectT.cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optSubBlkAuctConfSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(voptSubBlkAuctConfSubjectT.cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		voptSubBlkAuctConfSubjectT.cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optSubBlkAuctConfSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(voptSubBlkAuctConfSubjectT.cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXER_PRC_LEN;i++) {
		voptSubBlkAuctConfSubjectT.cntrExerPrc[i]= ' ';
	}
	char lcntrExerPrc[CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("SubBlkAuctConf.optSubBlkAuctConfSubjectT.cntrExerPrc", lcntrExerPrc);
	memcpy(voptSubBlkAuctConfSubjectT.cntrExerPrc, lcntrExerPrc, CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("SubBlkAuctConf.optSubBlkAuctConfSubjectT.cntrVersNo", lcntrVersNo);
	voptSubBlkAuctConfSubjectT.cntrVersNo = lcntrVersNo[0];
	return voptSubBlkAuctConfSubjectT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futSubBlkAuctConfPrivBcastT* getFutSubBlkAuctConfPrivBcastT(char* testCaseNum) {
	vfutSubBlkAuctConfPrivBcastT = (futSubBlkAuctConfPrivBcastT*)malloc(sizeof(futSubBlkAuctConfPrivBcastT));
	int i;

	vfutSubBlkAuctConfPrivBcastT->header = getDataHeaderT(testCaseNum, "futSubBlkAuctConfPrivBcastT");
	vfutSubBlkAuctConfPrivBcastT->basic = getFutBscSubBlkAuctConfPrivBcastT(testCaseNum, "futSubBlkAuctConfPrivBcastT");
	vfutSubBlkAuctConfPrivBcastT->extension = getFutExtSubBlkAuctConfPrivBcastT(testCaseNum, "futSubBlkAuctConfPrivBcastT");
	return vfutSubBlkAuctConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optSubBlkAuctConfPrivBcastT* getOptSubBlkAuctConfPrivBcastT(char* testCaseNum) {
	voptSubBlkAuctConfPrivBcastT = (optSubBlkAuctConfPrivBcastT*)malloc(sizeof(optSubBlkAuctConfPrivBcastT));
	int i;

	voptSubBlkAuctConfPrivBcastT->header = getDataHeaderT(testCaseNum, "optSubBlkAuctConfPrivBcastT");
	voptSubBlkAuctConfPrivBcastT->basic = getOptBscSubBlkAuctConfPrivBcastT(testCaseNum, "optSubBlkAuctConfPrivBcastT");
	voptSubBlkAuctConfPrivBcastT->extension = getOptExtSubBlkAuctConfPrivBcastT(testCaseNum, "optSubBlkAuctConfPrivBcastT");
	return voptSubBlkAuctConfPrivBcastT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutSubBlkAuctConfPrivBcastTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futSubBlkAuctConfPrivBcastT));
	futSubBlkAuctConfPrivBcastT *vfutSubBlkAuctConfPrivBcastT = getFutSubBlkAuctConfPrivBcastT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futSubBlkAuctConfPrivBcastT), (jbyte*) vfutSubBlkAuctConfPrivBcastT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptSubBlkAuctConfPrivBcastTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optSubBlkAuctConfPrivBcastT));
	optSubBlkAuctConfPrivBcastT *voptSubBlkAuctConfPrivBcastT = getOptSubBlkAuctConfPrivBcastT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optSubBlkAuctConfPrivBcastT), (jbyte*) voptSubBlkAuctConfPrivBcastT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSubBlkAuctConfPrivBcastT(futBscSubBlkAuctConfPrivBcastT actual, futBscSubBlkAuctConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareBlkAuctPotPrcGrpT (actual.blkAuctPotPrcGrp,expected.blkAuctPotPrcGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtSubBlkAuctConfPrivBcastT(futExtSubBlkAuctConfPrivBcastT actual, futExtSubBlkAuctConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrcBuy, expected.quoPrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, quoPrcBuy not matching. Actual %s but Expected %s", actual.quoPrcBuy, expected.quoPrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrcSel, expected.quoPrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, quoPrcSel not matching. Actual %s but Expected %s", actual.quoPrcSel, expected.quoPrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, blkAuctQuoQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, blkAuctQuoQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoExeQtyBuy, expected.blkAuctQuoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, blkAuctQuoExeQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoExeQtyBuy, expected.blkAuctQuoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoExeQtySel, expected.blkAuctQuoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, blkAuctQuoExeQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoExeQtySel, expected.blkAuctQuoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnTypId!= expected.trnTypId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, trnTypIdnot matching. Actual %d but Expected %d", actual.trnTypId, expected.trnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTrnTimBuy, expected.quoTrnTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, quoTrnTimBuy not matching. Actual %s but Expected %s", actual.quoTrnTimBuy, expected.quoTrnTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTrnTimSel, expected.quoTrnTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, quoTrnTimSel not matching. Actual %s but Expected %s", actual.quoTrnTimSel, expected.quoTrnTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubBlkAuctConfPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutSubBlkAuctConfSubjectT(futSubBlkAuctConfSubjectT actual, futSubBlkAuctConfSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futSubBlkAuctConfSubjectT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futSubBlkAuctConfSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futSubBlkAuctConfSubjectT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat, expected.cntrExpYrDat, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futSubBlkAuctConfSubjectT, cntrExpYrDat not matching. Actual %s but Expected %s", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.subjFill, expected.subjFill, SUBJ_FILL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futSubBlkAuctConfSubjectT, subjFill not matching. Actual %s but Expected %s", actual.subjFill, expected.subjFill);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscSubBlkAuctConfPrivBcastT(optBscSubBlkAuctConfPrivBcastT actual, optBscSubBlkAuctConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareBlkAuctPotPrcGrpT (actual.blkAuctPotPrcGrp,expected.blkAuctPotPrcGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtSubBlkAuctConfPrivBcastT(optExtSubBlkAuctConfPrivBcastT actual, optExtSubBlkAuctConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrcBuy, expected.quoPrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, quoPrcBuy not matching. Actual %s but Expected %s", actual.quoPrcBuy, expected.quoPrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrcSel, expected.quoPrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, quoPrcSel not matching. Actual %s but Expected %s", actual.quoPrcSel, expected.quoPrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, blkAuctQuoQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, blkAuctQuoQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoExeQtyBuy, expected.blkAuctQuoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, blkAuctQuoExeQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoExeQtyBuy, expected.blkAuctQuoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoExeQtySel, expected.blkAuctQuoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, blkAuctQuoExeQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoExeQtySel, expected.blkAuctQuoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnTypId!= expected.trnTypId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, trnTypIdnot matching. Actual %d but Expected %d", actual.trnTypId, expected.trnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTrnTimBuy, expected.quoTrnTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, quoTrnTimBuy not matching. Actual %s but Expected %s", actual.quoTrnTimBuy, expected.quoTrnTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTrnTimSel, expected.quoTrnTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, quoTrnTimSel not matching. Actual %s but Expected %s", actual.quoTrnTimSel, expected.quoTrnTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubBlkAuctConfPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptSubBlkAuctConfSubjectT(optSubBlkAuctConfSubjectT actual, optSubBlkAuctConfSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optSubBlkAuctConfSubjectT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optSubBlkAuctConfSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optSubBlkAuctConfSubjectT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpMthDat, expected.cntrExpMthDat, CNTR_EXP_MTH_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optSubBlkAuctConfSubjectT, cntrExpMthDat not matching. Actual %s but Expected %s", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExpYrDat, expected.cntrExpYrDat, CNTR_EXP_YR_DAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optSubBlkAuctConfSubjectT, cntrExpYrDat not matching. Actual %s but Expected %s", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrExerPrc, expected.cntrExerPrc, CNTR_EXER_PRC_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optSubBlkAuctConfSubjectT, cntrExerPrc not matching. Actual %s but Expected %s", actual.cntrExerPrc, expected.cntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optSubBlkAuctConfSubjectT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutSubBlkAuctConfPrivBcastT(futSubBlkAuctConfPrivBcastT actual, futSubBlkAuctConfPrivBcastT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscSubBlkAuctConfPrivBcastT (actual.basic,expected.basic, logMsg);	compareFutExtSubBlkAuctConfPrivBcastT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptSubBlkAuctConfPrivBcastT(optSubBlkAuctConfPrivBcastT actual, optSubBlkAuctConfPrivBcastT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscSubBlkAuctConfPrivBcastT (actual.basic,expected.basic, logMsg);	compareOptExtSubBlkAuctConfPrivBcastT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutSubBlkAuctConfPrivBcastTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futSubBlkAuctConfPrivBcastT *actualData = (futSubBlkAuctConfPrivBcastT *)msgStruct;
	futSubBlkAuctConfPrivBcastT* expectedData = getFutSubBlkAuctConfPrivBcastT(testCaseNum);
	compareFutSubBlkAuctConfPrivBcastT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptSubBlkAuctConfPrivBcastTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optSubBlkAuctConfPrivBcastT *actualData = (optSubBlkAuctConfPrivBcastT *)msgStruct;
	optSubBlkAuctConfPrivBcastT* expectedData = getOptSubBlkAuctConfPrivBcastT(testCaseNum);
	compareOptSubBlkAuctConfPrivBcastT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
