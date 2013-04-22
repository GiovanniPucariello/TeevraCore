#include <InqOwnBlkAuct.hxx>
#define BUFFER_SIZE 1000

futInqOwnBlkAuctRequestT *vfutInqOwnBlkAuctRequestT;
futInqOwnBlkAuctResponseT *vfutInqOwnBlkAuctResponseT;
optInqOwnBlkAuctRequestT *voptInqOwnBlkAuctRequestT;
optInqOwnBlkAuctResponseT *voptInqOwnBlkAuctResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnBlkAuctRequestT getFutBscInqOwnBlkAuctRequestT(char* testCaseNum , const char *root) {
	futBscInqOwnBlkAuctRequestT vfutBscInqOwnBlkAuctRequestT;
	int i;

	vfutBscInqOwnBlkAuctRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqOwnBlkAuctRequestT");
	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqOwnBlkAuctRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqOwnBlkAuctRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqOwnBlkAuctRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqOwnBlkAuctRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqOwnBlkAuctRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnBlkAuctRecT getFutBscInqOwnBlkAuctRecT(char* testCaseNum , const char *root) {
	futBscInqOwnBlkAuctRecT vfutBscInqOwnBlkAuctRecT;
	int i;

	vfutBscInqOwnBlkAuctRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqOwnBlkAuctRecT");
	vfutBscInqOwnBlkAuctRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqOwnBlkAuctRecT");
	char lbuyCod[1] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.buyCod", lbuyCod);
	vfutBscInqOwnBlkAuctRecT.buyCod = lbuyCod[0];

	char lordrTypCod[1] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.ordrTypCod", lordrTypCod);
	vfutBscInqOwnBlkAuctRecT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqOwnBlkAuctRecT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.ordrNoBuy", lordrNoBuy);
	memcpy(vfutBscInqOwnBlkAuctRecT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqOwnBlkAuctRecT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.ordrNoSel", lordrNoSel);
	memcpy(vfutBscInqOwnBlkAuctRecT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqOwnBlkAuctRecT.quoPrcBuy[i]= ' ';
	}
	char lquoPrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.quoPrcBuy", lquoPrcBuy);
	memcpy(vfutBscInqOwnBlkAuctRecT.quoPrcBuy, lquoPrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqOwnBlkAuctRecT.quoPrcSel[i]= ' ';
	}
	char lquoPrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.quoPrcSel", lquoPrcSel);
	memcpy(vfutBscInqOwnBlkAuctRecT.quoPrcSel, lquoPrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnBlkAuctRecT.blkAuctQuoQtyBuy[i]= ' ';
	}
	char lblkAuctQuoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.blkAuctQuoQtyBuy", lblkAuctQuoQtyBuy);
	memcpy(vfutBscInqOwnBlkAuctRecT.blkAuctQuoQtyBuy, lblkAuctQuoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnBlkAuctRecT.blkAuctQuoQtySel[i]= ' ';
	}
	char lblkAuctQuoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.blkAuctQuoQtySel", lblkAuctQuoQtySel);
	memcpy(vfutBscInqOwnBlkAuctRecT.blkAuctQuoQtySel, lblkAuctQuoQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnBlkAuctRecT.blkAuctQuoExeQtyBuy[i]= ' ';
	}
	char lblkAuctQuoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.blkAuctQuoExeQtyBuy", lblkAuctQuoExeQtyBuy);
	memcpy(vfutBscInqOwnBlkAuctRecT.blkAuctQuoExeQtyBuy, lblkAuctQuoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnBlkAuctRecT.blkAuctQuoExeQtySel[i]= ' ';
	}
	char lblkAuctQuoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.blkAuctQuoExeQtySel", lblkAuctQuoExeQtySel);
	memcpy(vfutBscInqOwnBlkAuctRecT.blkAuctQuoExeQtySel, lblkAuctQuoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnBlkAuctRecT.quoTrnTimBuy[i]= ' ';
	}
	char lquoTrnTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.quoTrnTimBuy", lquoTrnTimBuy);
	memcpy(vfutBscInqOwnBlkAuctRecT.quoTrnTimBuy, lquoTrnTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnBlkAuctRecT.quoTrnTimSel[i]= ' ';
	}
	char lquoTrnTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.quoTrnTimSel", lquoTrnTimSel);
	memcpy(vfutBscInqOwnBlkAuctRecT.quoTrnTimSel, lquoTrnTimSel, DRIV_TIME_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctRecT.opnClsCod", lopnClsCod);
	vfutBscInqOwnBlkAuctRecT.opnClsCod = lopnClsCod[0];
	return vfutBscInqOwnBlkAuctRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnBlkAuctResponseT getFutBscInqOwnBlkAuctResponseT(char* testCaseNum , const char *root) {
	futBscInqOwnBlkAuctResponseT vfutBscInqOwnBlkAuctResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqOwnBlkAuctResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqOwnBlkAuctResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqOwnBlkAuctResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futBscInqOwnBlkAuctResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqOwnBlkAuctResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqOwnBlkAuctResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqOwnBlkAuctRecT getFutExtInqOwnBlkAuctRecT(char* testCaseNum , const char *root) {
	futExtInqOwnBlkAuctRecT vfutExtInqOwnBlkAuctRecT;
	int i;

	vfutExtInqOwnBlkAuctRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtInqOwnBlkAuctRecT");
	vfutExtInqOwnBlkAuctRecT.txtGrp = getTxtGrpT(testCaseNum, "futExtInqOwnBlkAuctRecT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vfutExtInqOwnBlkAuctRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futExtInqOwnBlkAuctRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vfutExtInqOwnBlkAuctRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutExtInqOwnBlkAuctRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.futExtInqOwnBlkAuctRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutExtInqOwnBlkAuctRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutExtInqOwnBlkAuctRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqOwnBlkAuctResponseT getFutExtInqOwnBlkAuctResponseT(char* testCaseNum , const char *root) {
	futExtInqOwnBlkAuctResponseT vfutExtInqOwnBlkAuctResponseT;
	int i;
	return vfutExtInqOwnBlkAuctResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqOwnBlkAuctRequestT getOptBscInqOwnBlkAuctRequestT(char* testCaseNum , const char *root) {
	optBscInqOwnBlkAuctRequestT voptBscInqOwnBlkAuctRequestT;
	int i;

	voptBscInqOwnBlkAuctRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqOwnBlkAuctRequestT");
	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqOwnBlkAuctRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqOwnBlkAuctRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqOwnBlkAuctRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqOwnBlkAuctRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqOwnBlkAuctRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqOwnBlkAuctRecT getOptBscInqOwnBlkAuctRecT(char* testCaseNum , const char *root) {
	optBscInqOwnBlkAuctRecT voptBscInqOwnBlkAuctRecT;
	int i;

	voptBscInqOwnBlkAuctRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqOwnBlkAuctRecT");
	voptBscInqOwnBlkAuctRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqOwnBlkAuctRecT");
	char lbuyCod[1] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.buyCod", lbuyCod);
	voptBscInqOwnBlkAuctRecT.buyCod = lbuyCod[0];

	char lordrTypCod[1] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.ordrTypCod", lordrTypCod);
	voptBscInqOwnBlkAuctRecT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscInqOwnBlkAuctRecT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.ordrNoBuy", lordrNoBuy);
	memcpy(voptBscInqOwnBlkAuctRecT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscInqOwnBlkAuctRecT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.ordrNoSel", lordrNoSel);
	memcpy(voptBscInqOwnBlkAuctRecT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqOwnBlkAuctRecT.quoPrcBuy[i]= ' ';
	}
	char lquoPrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.quoPrcBuy", lquoPrcBuy);
	memcpy(voptBscInqOwnBlkAuctRecT.quoPrcBuy, lquoPrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqOwnBlkAuctRecT.quoPrcSel[i]= ' ';
	}
	char lquoPrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.quoPrcSel", lquoPrcSel);
	memcpy(voptBscInqOwnBlkAuctRecT.quoPrcSel, lquoPrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnBlkAuctRecT.blkAuctQuoQtyBuy[i]= ' ';
	}
	char lblkAuctQuoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.blkAuctQuoQtyBuy", lblkAuctQuoQtyBuy);
	memcpy(voptBscInqOwnBlkAuctRecT.blkAuctQuoQtyBuy, lblkAuctQuoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnBlkAuctRecT.blkAuctQuoQtySel[i]= ' ';
	}
	char lblkAuctQuoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.blkAuctQuoQtySel", lblkAuctQuoQtySel);
	memcpy(voptBscInqOwnBlkAuctRecT.blkAuctQuoQtySel, lblkAuctQuoQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnBlkAuctRecT.blkAuctQuoExeQtyBuy[i]= ' ';
	}
	char lblkAuctQuoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.blkAuctQuoExeQtyBuy", lblkAuctQuoExeQtyBuy);
	memcpy(voptBscInqOwnBlkAuctRecT.blkAuctQuoExeQtyBuy, lblkAuctQuoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnBlkAuctRecT.blkAuctQuoExeQtySel[i]= ' ';
	}
	char lblkAuctQuoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.blkAuctQuoExeQtySel", lblkAuctQuoExeQtySel);
	memcpy(voptBscInqOwnBlkAuctRecT.blkAuctQuoExeQtySel, lblkAuctQuoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnBlkAuctRecT.quoTrnTimBuy[i]= ' ';
	}
	char lquoTrnTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.quoTrnTimBuy", lquoTrnTimBuy);
	memcpy(voptBscInqOwnBlkAuctRecT.quoTrnTimBuy, lquoTrnTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnBlkAuctRecT.quoTrnTimSel[i]= ' ';
	}
	char lquoTrnTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.quoTrnTimSel", lquoTrnTimSel);
	memcpy(voptBscInqOwnBlkAuctRecT.quoTrnTimSel, lquoTrnTimSel, DRIV_TIME_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctRecT.opnClsCod", lopnClsCod);
	voptBscInqOwnBlkAuctRecT.opnClsCod = lopnClsCod[0];
	return voptBscInqOwnBlkAuctRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqOwnBlkAuctResponseT getOptBscInqOwnBlkAuctResponseT(char* testCaseNum , const char *root) {
	optBscInqOwnBlkAuctResponseT voptBscInqOwnBlkAuctResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqOwnBlkAuctResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqOwnBlkAuctResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqOwnBlkAuctResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optBscInqOwnBlkAuctResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqOwnBlkAuctResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqOwnBlkAuctResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqOwnBlkAuctRecT getOptExtInqOwnBlkAuctRecT(char* testCaseNum , const char *root) {
	optExtInqOwnBlkAuctRecT voptExtInqOwnBlkAuctRecT;
	int i;

	voptExtInqOwnBlkAuctRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtInqOwnBlkAuctRecT");
	voptExtInqOwnBlkAuctRecT.txtGrp = getTxtGrpT(testCaseNum, "optExtInqOwnBlkAuctRecT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		voptExtInqOwnBlkAuctRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optExtInqOwnBlkAuctRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(voptExtInqOwnBlkAuctRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptExtInqOwnBlkAuctRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqOwnBlkAuct.optExtInqOwnBlkAuctRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptExtInqOwnBlkAuctRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptExtInqOwnBlkAuctRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqOwnBlkAuctResponseT getOptExtInqOwnBlkAuctResponseT(char* testCaseNum , const char *root) {
	optExtInqOwnBlkAuctResponseT voptExtInqOwnBlkAuctResponseT;
	int i;
	return voptExtInqOwnBlkAuctResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqOwnBlkAuctRequestT* getFutInqOwnBlkAuctRequestT(char* testCaseNum) {
	vfutInqOwnBlkAuctRequestT = (futInqOwnBlkAuctRequestT*)malloc(sizeof(futInqOwnBlkAuctRequestT));
	int i;

	vfutInqOwnBlkAuctRequestT->header = getDataHeaderT(testCaseNum, "futInqOwnBlkAuctRequestT");
	vfutInqOwnBlkAuctRequestT->basic = getFutBscInqOwnBlkAuctRequestT(testCaseNum, "futInqOwnBlkAuctRequestT");
	return vfutInqOwnBlkAuctRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqOwnBlkAuctResponseT* getFutInqOwnBlkAuctResponseT(char* testCaseNum) {
	vfutInqOwnBlkAuctResponseT = (futInqOwnBlkAuctResponseT*)malloc(sizeof(futInqOwnBlkAuctResponseT));
	int i;

	vfutInqOwnBlkAuctResponseT->header = getDataHeaderT(testCaseNum, "futInqOwnBlkAuctResponseT");
	vfutInqOwnBlkAuctResponseT->basic = getFutBscInqOwnBlkAuctResponseT(testCaseNum, "futInqOwnBlkAuctResponseT");
	vfutInqOwnBlkAuctResponseT->extension = getFutExtInqOwnBlkAuctResponseT(testCaseNum, "futInqOwnBlkAuctResponseT");
	return vfutInqOwnBlkAuctResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqOwnBlkAuctRequestT* getOptInqOwnBlkAuctRequestT(char* testCaseNum) {
	voptInqOwnBlkAuctRequestT = (optInqOwnBlkAuctRequestT*)malloc(sizeof(optInqOwnBlkAuctRequestT));
	int i;

	voptInqOwnBlkAuctRequestT->header = getDataHeaderT(testCaseNum, "optInqOwnBlkAuctRequestT");
	voptInqOwnBlkAuctRequestT->basic = getOptBscInqOwnBlkAuctRequestT(testCaseNum, "optInqOwnBlkAuctRequestT");
	return voptInqOwnBlkAuctRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqOwnBlkAuctResponseT* getOptInqOwnBlkAuctResponseT(char* testCaseNum) {
	voptInqOwnBlkAuctResponseT = (optInqOwnBlkAuctResponseT*)malloc(sizeof(optInqOwnBlkAuctResponseT));
	int i;

	voptInqOwnBlkAuctResponseT->header = getDataHeaderT(testCaseNum, "optInqOwnBlkAuctResponseT");
	voptInqOwnBlkAuctResponseT->basic = getOptBscInqOwnBlkAuctResponseT(testCaseNum, "optInqOwnBlkAuctResponseT");
	voptInqOwnBlkAuctResponseT->extension = getOptExtInqOwnBlkAuctResponseT(testCaseNum, "optInqOwnBlkAuctResponseT");
	return voptInqOwnBlkAuctResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqOwnBlkAuctRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqOwnBlkAuctRequestT));
	futInqOwnBlkAuctRequestT *vfutInqOwnBlkAuctRequestT = getFutInqOwnBlkAuctRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqOwnBlkAuctRequestT), (jbyte*) vfutInqOwnBlkAuctRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqOwnBlkAuctResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqOwnBlkAuctResponseT));
	futInqOwnBlkAuctResponseT *vfutInqOwnBlkAuctResponseT = getFutInqOwnBlkAuctResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqOwnBlkAuctResponseT), (jbyte*) vfutInqOwnBlkAuctResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqOwnBlkAuctRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqOwnBlkAuctRequestT));
	optInqOwnBlkAuctRequestT *voptInqOwnBlkAuctRequestT = getOptInqOwnBlkAuctRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqOwnBlkAuctRequestT), (jbyte*) voptInqOwnBlkAuctRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqOwnBlkAuctResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqOwnBlkAuctResponseT));
	optInqOwnBlkAuctResponseT *voptInqOwnBlkAuctResponseT = getOptInqOwnBlkAuctResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqOwnBlkAuctResponseT), (jbyte*) voptInqOwnBlkAuctResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnBlkAuctRequestT(futBscInqOwnBlkAuctRequestT actual, futBscInqOwnBlkAuctRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_OWN_BLK_AUCT_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnBlkAuctRecT(futBscInqOwnBlkAuctRecT actual, futBscInqOwnBlkAuctRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrcBuy, expected.quoPrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, quoPrcBuy not matching. Actual %s but Expected %s", actual.quoPrcBuy, expected.quoPrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrcSel, expected.quoPrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, quoPrcSel not matching. Actual %s but Expected %s", actual.quoPrcSel, expected.quoPrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, blkAuctQuoQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, blkAuctQuoQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoExeQtyBuy, expected.blkAuctQuoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, blkAuctQuoExeQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoExeQtyBuy, expected.blkAuctQuoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoExeQtySel, expected.blkAuctQuoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, blkAuctQuoExeQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoExeQtySel, expected.blkAuctQuoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTrnTimBuy, expected.quoTrnTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, quoTrnTimBuy not matching. Actual %s but Expected %s", actual.quoTrnTimBuy, expected.quoTrnTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTrnTimSel, expected.quoTrnTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, quoTrnTimSel not matching. Actual %s but Expected %s", actual.quoTrnTimSel, expected.quoTrnTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnBlkAuctResponseT(futBscInqOwnBlkAuctResponseT actual, futBscInqOwnBlkAuctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnBlkAuctResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_INQ_OWN_BLK_AUCT_REC_MAX;i++) {
		compareFutBscInqOwnBlkAuctRecT (actual.futBscInqOwnBlkAuctRec[i],expected.futBscInqOwnBlkAuctRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqOwnBlkAuctRecT(futExtInqOwnBlkAuctRecT actual, futExtInqOwnBlkAuctRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnBlkAuctRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnBlkAuctRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqOwnBlkAuctResponseT(futExtInqOwnBlkAuctResponseT actual, futExtInqOwnBlkAuctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_INQ_OWN_BLK_AUCT_REC_MAX;i++) {
		compareFutExtInqOwnBlkAuctRecT (actual.futExtInqOwnBlkAuctRec[i],expected.futExtInqOwnBlkAuctRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqOwnBlkAuctRequestT(optBscInqOwnBlkAuctRequestT actual, optBscInqOwnBlkAuctRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_BSC_INQ_OWN_BLK_AUCT_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqOwnBlkAuctRecT(optBscInqOwnBlkAuctRecT actual, optBscInqOwnBlkAuctRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrcBuy, expected.quoPrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, quoPrcBuy not matching. Actual %s but Expected %s", actual.quoPrcBuy, expected.quoPrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrcSel, expected.quoPrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, quoPrcSel not matching. Actual %s but Expected %s", actual.quoPrcSel, expected.quoPrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, blkAuctQuoQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, blkAuctQuoQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoExeQtyBuy, expected.blkAuctQuoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, blkAuctQuoExeQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoExeQtyBuy, expected.blkAuctQuoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoExeQtySel, expected.blkAuctQuoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, blkAuctQuoExeQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoExeQtySel, expected.blkAuctQuoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTrnTimBuy, expected.quoTrnTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, quoTrnTimBuy not matching. Actual %s but Expected %s", actual.quoTrnTimBuy, expected.quoTrnTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTrnTimSel, expected.quoTrnTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, quoTrnTimSel not matching. Actual %s but Expected %s", actual.quoTrnTimSel, expected.quoTrnTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqOwnBlkAuctResponseT(optBscInqOwnBlkAuctResponseT actual, optBscInqOwnBlkAuctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnBlkAuctResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_INQ_OWN_BLK_AUCT_REC_MAX;i++) {
		compareOptBscInqOwnBlkAuctRecT (actual.optBscInqOwnBlkAuctRec[i],expected.optBscInqOwnBlkAuctRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqOwnBlkAuctRecT(optExtInqOwnBlkAuctRecT actual, optExtInqOwnBlkAuctRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqOwnBlkAuctRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqOwnBlkAuctRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqOwnBlkAuctResponseT(optExtInqOwnBlkAuctResponseT actual, optExtInqOwnBlkAuctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_INQ_OWN_BLK_AUCT_REC_MAX;i++) {
		compareOptExtInqOwnBlkAuctRecT (actual.optExtInqOwnBlkAuctRec[i],expected.optExtInqOwnBlkAuctRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqOwnBlkAuctRequestT(futInqOwnBlkAuctRequestT actual, futInqOwnBlkAuctRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqOwnBlkAuctRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqOwnBlkAuctResponseT(futInqOwnBlkAuctResponseT actual, futInqOwnBlkAuctResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqOwnBlkAuctResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqOwnBlkAuctResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqOwnBlkAuctRequestT(optInqOwnBlkAuctRequestT actual, optInqOwnBlkAuctRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqOwnBlkAuctRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqOwnBlkAuctResponseT(optInqOwnBlkAuctResponseT actual, optInqOwnBlkAuctResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqOwnBlkAuctResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqOwnBlkAuctResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqOwnBlkAuctRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqOwnBlkAuctRequestT *actualData = (futInqOwnBlkAuctRequestT *)msgStruct;
	futInqOwnBlkAuctRequestT* expectedData = getFutInqOwnBlkAuctRequestT(testCaseNum);
	compareFutInqOwnBlkAuctRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqOwnBlkAuctResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqOwnBlkAuctResponseT *actualData = (futInqOwnBlkAuctResponseT *)msgStruct;
	futInqOwnBlkAuctResponseT* expectedData = getFutInqOwnBlkAuctResponseT(testCaseNum);
	compareFutInqOwnBlkAuctResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqOwnBlkAuctRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqOwnBlkAuctRequestT *actualData = (optInqOwnBlkAuctRequestT *)msgStruct;
	optInqOwnBlkAuctRequestT* expectedData = getOptInqOwnBlkAuctRequestT(testCaseNum);
	compareOptInqOwnBlkAuctRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqOwnBlkAuctResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqOwnBlkAuctResponseT *actualData = (optInqOwnBlkAuctResponseT *)msgStruct;
	optInqOwnBlkAuctResponseT* expectedData = getOptInqOwnBlkAuctResponseT(testCaseNum);
	compareOptInqOwnBlkAuctResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
