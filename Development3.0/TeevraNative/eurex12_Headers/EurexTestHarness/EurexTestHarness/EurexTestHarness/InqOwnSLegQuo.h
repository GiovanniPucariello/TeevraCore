#include <InqOwnSLegQuo.hxx>
#define BUFFER_SIZE 1000

futInqOwnSLegQuoRequestT *vfutInqOwnSLegQuoRequestT;
futInqOwnSLegQuoResponseT *vfutInqOwnSLegQuoResponseT;
optInqOwnSLegQuoRequestT *voptInqOwnSLegQuoRequestT;
optInqOwnSLegQuoResponseT *voptInqOwnSLegQuoResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnSLegQuoRequestT getFutBscInqOwnSLegQuoRequestT(char* testCaseNum , const char *root) {
	futBscInqOwnSLegQuoRequestT vfutBscInqOwnSLegQuoRequestT;
	int i;

	vfutBscInqOwnSLegQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqOwnSLegQuoRequestT");
	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnSLegQuoRequestT.quoTimMin[i]= ' ';
	}
	char lquoTimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRequestT.quoTimMin", lquoTimMin);
	memcpy(vfutBscInqOwnSLegQuoRequestT.quoTimMin, lquoTimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnSLegQuoRequestT.quoTimMax[i]= ' ';
	}
	char lquoTimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRequestT.quoTimMax", lquoTimMax);
	memcpy(vfutBscInqOwnSLegQuoRequestT.quoTimMax, lquoTimMax, DRIV_TIME_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqOwnSLegQuoRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqOwnSLegQuoRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqOwnSLegQuoRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqOwnSLegQuoRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqOwnSLegQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnSLegQuoRecT getFutBscInqOwnSLegQuoRecT(char* testCaseNum , const char *root) {
	futBscInqOwnSLegQuoRecT vfutBscInqOwnSLegQuoRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.buyCod", lbuyCod);
	vfutBscInqOwnSLegQuoRecT.buyCod = lbuyCod[0];

	vfutBscInqOwnSLegQuoRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqOwnSLegQuoRecT");
	vfutBscInqOwnSLegQuoRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqOwnSLegQuoRecT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.ordrNoBuy", lordrNoBuy);
	memcpy(vfutBscInqOwnSLegQuoRecT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.ordrNoSel", lordrNoSel);
	memcpy(vfutBscInqOwnSLegQuoRecT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.quoBkQtyBuy[i]= ' ';
	}
	char lquoBkQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.quoBkQtyBuy", lquoBkQtyBuy);
	memcpy(vfutBscInqOwnSLegQuoRecT.quoBkQtyBuy, lquoBkQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.quoBkQtySel[i]= ' ';
	}
	char lquoBkQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.quoBkQtySel", lquoBkQtySel);
	memcpy(vfutBscInqOwnSLegQuoRecT.quoBkQtySel, lquoBkQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(vfutBscInqOwnSLegQuoRecT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.quoExeQtySel", lquoExeQtySel);
	memcpy(vfutBscInqOwnSLegQuoRecT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(vfutBscInqOwnSLegQuoRecT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.quoExePrcSel", lquoExePrcSel);
	memcpy(vfutBscInqOwnSLegQuoRecT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.quoPrioTimBuy[i]= ' ';
	}
	char lquoPrioTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.quoPrioTimBuy", lquoPrioTimBuy);
	memcpy(vfutBscInqOwnSLegQuoRecT.quoPrioTimBuy, lquoPrioTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.quoPrioTimSel[i]= ' ';
	}
	char lquoPrioTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.quoPrioTimSel", lquoPrioTimSel);
	memcpy(vfutBscInqOwnSLegQuoRecT.quoPrioTimSel, lquoPrioTimSel, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.quoPrioDatBuy[i]= ' ';
	}
	char lquoPrioDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.quoPrioDatBuy", lquoPrioDatBuy);
	memcpy(vfutBscInqOwnSLegQuoRecT.quoPrioDatBuy, lquoPrioDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.quoPrioDatSel[i]= ' ';
	}
	char lquoPrioDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.quoPrioDatSel", lquoPrioDatSel);
	memcpy(vfutBscInqOwnSLegQuoRecT.quoPrioDatSel, lquoPrioDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.lstEvntDatBuy[i]= ' ';
	}
	char llstEvntDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.lstEvntDatBuy", llstEvntDatBuy);
	memcpy(vfutBscInqOwnSLegQuoRecT.lstEvntDatBuy, llstEvntDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.lstEvntTimBuy[i]= ' ';
	}
	char llstEvntTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.lstEvntTimBuy", llstEvntTimBuy);
	memcpy(vfutBscInqOwnSLegQuoRecT.lstEvntTimBuy, llstEvntTimBuy, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.lstEvntTrnIdBuy[i]= ' ';
	}
	char llstEvntTrnIdBuy[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.lstEvntTrnIdBuy", llstEvntTrnIdBuy);
	memcpy(vfutBscInqOwnSLegQuoRecT.lstEvntTrnIdBuy, llstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.lstEvntDatSel[i]= ' ';
	}
	char llstEvntDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.lstEvntDatSel", llstEvntDatSel);
	memcpy(vfutBscInqOwnSLegQuoRecT.lstEvntDatSel, llstEvntDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.lstEvntTimSel[i]= ' ';
	}
	char llstEvntTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.lstEvntTimSel", llstEvntTimSel);
	memcpy(vfutBscInqOwnSLegQuoRecT.lstEvntTimSel, llstEvntTimSel, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscInqOwnSLegQuoRecT.lstEvntTrnIdSel[i]= ' ';
	}
	char llstEvntTrnIdSel[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoRecT.lstEvntTrnIdSel", llstEvntTrnIdSel);
	memcpy(vfutBscInqOwnSLegQuoRecT.lstEvntTrnIdSel, llstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN);
	return vfutBscInqOwnSLegQuoRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnSLegQuoResponseT getFutBscInqOwnSLegQuoResponseT(char* testCaseNum , const char *root) {
	futBscInqOwnSLegQuoResponseT vfutBscInqOwnSLegQuoResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqOwnSLegQuoResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqOwnSLegQuoResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqOwnSLegQuoResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.futBscInqOwnSLegQuoResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqOwnSLegQuoResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqOwnSLegQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqOwnSLegQuoRecT getFutExtInqOwnSLegQuoRecT(char* testCaseNum , const char *root) {
	futExtInqOwnSLegQuoRecT vfutExtInqOwnSLegQuoRecT;
	int i;

	vfutExtInqOwnSLegQuoRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtInqOwnSLegQuoRecT");	return vfutExtInqOwnSLegQuoRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqOwnSLegQuoResponseT getFutExtInqOwnSLegQuoResponseT(char* testCaseNum , const char *root) {
	futExtInqOwnSLegQuoResponseT vfutExtInqOwnSLegQuoResponseT;
	int i;
	return vfutExtInqOwnSLegQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqOwnSLegQuoRequestT getOptBscInqOwnSLegQuoRequestT(char* testCaseNum , const char *root) {
	optBscInqOwnSLegQuoRequestT voptBscInqOwnSLegQuoRequestT;
	int i;

	voptBscInqOwnSLegQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqOwnSLegQuoRequestT");
	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnSLegQuoRequestT.quoTimMin[i]= ' ';
	}
	char lquoTimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRequestT.quoTimMin", lquoTimMin);
	memcpy(voptBscInqOwnSLegQuoRequestT.quoTimMin, lquoTimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnSLegQuoRequestT.quoTimMax[i]= ' ';
	}
	char lquoTimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRequestT.quoTimMax", lquoTimMax);
	memcpy(voptBscInqOwnSLegQuoRequestT.quoTimMax, lquoTimMax, DRIV_TIME_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqOwnSLegQuoRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqOwnSLegQuoRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqOwnSLegQuoRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqOwnSLegQuoRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqOwnSLegQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqOwnSLegQuoRecT getOptBscInqOwnSLegQuoRecT(char* testCaseNum , const char *root) {
	optBscInqOwnSLegQuoRecT voptBscInqOwnSLegQuoRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.buyCod", lbuyCod);
	voptBscInqOwnSLegQuoRecT.buyCod = lbuyCod[0];

	voptBscInqOwnSLegQuoRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqOwnSLegQuoRecT");
	voptBscInqOwnSLegQuoRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqOwnSLegQuoRecT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.ordrNoBuy", lordrNoBuy);
	memcpy(voptBscInqOwnSLegQuoRecT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.ordrNoSel", lordrNoSel);
	memcpy(voptBscInqOwnSLegQuoRecT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.quoBkQtyBuy[i]= ' ';
	}
	char lquoBkQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.quoBkQtyBuy", lquoBkQtyBuy);
	memcpy(voptBscInqOwnSLegQuoRecT.quoBkQtyBuy, lquoBkQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.quoBkQtySel[i]= ' ';
	}
	char lquoBkQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.quoBkQtySel", lquoBkQtySel);
	memcpy(voptBscInqOwnSLegQuoRecT.quoBkQtySel, lquoBkQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(voptBscInqOwnSLegQuoRecT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.quoExeQtySel", lquoExeQtySel);
	memcpy(voptBscInqOwnSLegQuoRecT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(voptBscInqOwnSLegQuoRecT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.quoExePrcSel", lquoExePrcSel);
	memcpy(voptBscInqOwnSLegQuoRecT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.quoPrioTimBuy[i]= ' ';
	}
	char lquoPrioTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.quoPrioTimBuy", lquoPrioTimBuy);
	memcpy(voptBscInqOwnSLegQuoRecT.quoPrioTimBuy, lquoPrioTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.quoPrioTimSel[i]= ' ';
	}
	char lquoPrioTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.quoPrioTimSel", lquoPrioTimSel);
	memcpy(voptBscInqOwnSLegQuoRecT.quoPrioTimSel, lquoPrioTimSel, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.quoPrioDatBuy[i]= ' ';
	}
	char lquoPrioDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.quoPrioDatBuy", lquoPrioDatBuy);
	memcpy(voptBscInqOwnSLegQuoRecT.quoPrioDatBuy, lquoPrioDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.quoPrioDatSel[i]= ' ';
	}
	char lquoPrioDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.quoPrioDatSel", lquoPrioDatSel);
	memcpy(voptBscInqOwnSLegQuoRecT.quoPrioDatSel, lquoPrioDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.lstEvntDatBuy[i]= ' ';
	}
	char llstEvntDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.lstEvntDatBuy", llstEvntDatBuy);
	memcpy(voptBscInqOwnSLegQuoRecT.lstEvntDatBuy, llstEvntDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.lstEvntTimBuy[i]= ' ';
	}
	char llstEvntTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.lstEvntTimBuy", llstEvntTimBuy);
	memcpy(voptBscInqOwnSLegQuoRecT.lstEvntTimBuy, llstEvntTimBuy, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.lstEvntTrnIdBuy[i]= ' ';
	}
	char llstEvntTrnIdBuy[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.lstEvntTrnIdBuy", llstEvntTrnIdBuy);
	memcpy(voptBscInqOwnSLegQuoRecT.lstEvntTrnIdBuy, llstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.lstEvntDatSel[i]= ' ';
	}
	char llstEvntDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.lstEvntDatSel", llstEvntDatSel);
	memcpy(voptBscInqOwnSLegQuoRecT.lstEvntDatSel, llstEvntDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.lstEvntTimSel[i]= ' ';
	}
	char llstEvntTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.lstEvntTimSel", llstEvntTimSel);
	memcpy(voptBscInqOwnSLegQuoRecT.lstEvntTimSel, llstEvntTimSel, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptBscInqOwnSLegQuoRecT.lstEvntTrnIdSel[i]= ' ';
	}
	char llstEvntTrnIdSel[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoRecT.lstEvntTrnIdSel", llstEvntTrnIdSel);
	memcpy(voptBscInqOwnSLegQuoRecT.lstEvntTrnIdSel, llstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN);
	return voptBscInqOwnSLegQuoRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqOwnSLegQuoResponseT getOptBscInqOwnSLegQuoResponseT(char* testCaseNum , const char *root) {
	optBscInqOwnSLegQuoResponseT voptBscInqOwnSLegQuoResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqOwnSLegQuoResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqOwnSLegQuoResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqOwnSLegQuoResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnSLegQuo.optBscInqOwnSLegQuoResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqOwnSLegQuoResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqOwnSLegQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqOwnSLegQuoRecT getOptExtInqOwnSLegQuoRecT(char* testCaseNum , const char *root) {
	optExtInqOwnSLegQuoRecT voptExtInqOwnSLegQuoRecT;
	int i;

	voptExtInqOwnSLegQuoRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtInqOwnSLegQuoRecT");	return voptExtInqOwnSLegQuoRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqOwnSLegQuoResponseT getOptExtInqOwnSLegQuoResponseT(char* testCaseNum , const char *root) {
	optExtInqOwnSLegQuoResponseT voptExtInqOwnSLegQuoResponseT;
	int i;
	return voptExtInqOwnSLegQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqOwnSLegQuoRequestT* getFutInqOwnSLegQuoRequestT(char* testCaseNum) {
	vfutInqOwnSLegQuoRequestT = (futInqOwnSLegQuoRequestT*)malloc(sizeof(futInqOwnSLegQuoRequestT));
	int i;

	vfutInqOwnSLegQuoRequestT->header = getDataHeaderT(testCaseNum, "futInqOwnSLegQuoRequestT");
	vfutInqOwnSLegQuoRequestT->basic = getFutBscInqOwnSLegQuoRequestT(testCaseNum, "futInqOwnSLegQuoRequestT");
	return vfutInqOwnSLegQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqOwnSLegQuoResponseT* getFutInqOwnSLegQuoResponseT(char* testCaseNum) {
	vfutInqOwnSLegQuoResponseT = (futInqOwnSLegQuoResponseT*)malloc(sizeof(futInqOwnSLegQuoResponseT));
	int i;

	vfutInqOwnSLegQuoResponseT->header = getDataHeaderT(testCaseNum, "futInqOwnSLegQuoResponseT");
	vfutInqOwnSLegQuoResponseT->basic = getFutBscInqOwnSLegQuoResponseT(testCaseNum, "futInqOwnSLegQuoResponseT");
	vfutInqOwnSLegQuoResponseT->extension = getFutExtInqOwnSLegQuoResponseT(testCaseNum, "futInqOwnSLegQuoResponseT");
	return vfutInqOwnSLegQuoResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqOwnSLegQuoRequestT* getOptInqOwnSLegQuoRequestT(char* testCaseNum) {
	voptInqOwnSLegQuoRequestT = (optInqOwnSLegQuoRequestT*)malloc(sizeof(optInqOwnSLegQuoRequestT));
	int i;

	voptInqOwnSLegQuoRequestT->header = getDataHeaderT(testCaseNum, "optInqOwnSLegQuoRequestT");
	voptInqOwnSLegQuoRequestT->basic = getOptBscInqOwnSLegQuoRequestT(testCaseNum, "optInqOwnSLegQuoRequestT");
	return voptInqOwnSLegQuoRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqOwnSLegQuoResponseT* getOptInqOwnSLegQuoResponseT(char* testCaseNum) {
	voptInqOwnSLegQuoResponseT = (optInqOwnSLegQuoResponseT*)malloc(sizeof(optInqOwnSLegQuoResponseT));
	int i;

	voptInqOwnSLegQuoResponseT->header = getDataHeaderT(testCaseNum, "optInqOwnSLegQuoResponseT");
	voptInqOwnSLegQuoResponseT->basic = getOptBscInqOwnSLegQuoResponseT(testCaseNum, "optInqOwnSLegQuoResponseT");
	voptInqOwnSLegQuoResponseT->extension = getOptExtInqOwnSLegQuoResponseT(testCaseNum, "optInqOwnSLegQuoResponseT");
	return voptInqOwnSLegQuoResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqOwnSLegQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqOwnSLegQuoRequestT));
	futInqOwnSLegQuoRequestT *vfutInqOwnSLegQuoRequestT = getFutInqOwnSLegQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqOwnSLegQuoRequestT), (jbyte*) vfutInqOwnSLegQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqOwnSLegQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqOwnSLegQuoResponseT));
	futInqOwnSLegQuoResponseT *vfutInqOwnSLegQuoResponseT = getFutInqOwnSLegQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqOwnSLegQuoResponseT), (jbyte*) vfutInqOwnSLegQuoResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqOwnSLegQuoRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqOwnSLegQuoRequestT));
	optInqOwnSLegQuoRequestT *voptInqOwnSLegQuoRequestT = getOptInqOwnSLegQuoRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqOwnSLegQuoRequestT), (jbyte*) voptInqOwnSLegQuoRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqOwnSLegQuoResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqOwnSLegQuoResponseT));
	optInqOwnSLegQuoResponseT *voptInqOwnSLegQuoResponseT = getOptInqOwnSLegQuoResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqOwnSLegQuoResponseT), (jbyte*) voptInqOwnSLegQuoResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnSLegQuoRequestT(futBscInqOwnSLegQuoRequestT actual, futBscInqOwnSLegQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_OWN_S_LEG_QUO_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.quoTimMin, expected.quoTimMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRequestT, quoTimMin not matching. Actual %s but Expected %s", actual.quoTimMin, expected.quoTimMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTimMax, expected.quoTimMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRequestT, quoTimMax not matching. Actual %s but Expected %s", actual.quoTimMax, expected.quoTimMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnSLegQuoRecT(futBscInqOwnSLegQuoRecT actual, futBscInqOwnSLegQuoRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtyBuy, expected.quoBkQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, quoBkQtyBuy not matching. Actual %s but Expected %s", actual.quoBkQtyBuy, expected.quoBkQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtySel, expected.quoBkQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, quoBkQtySel not matching. Actual %s but Expected %s", actual.quoBkQtySel, expected.quoBkQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimBuy, expected.quoPrioTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, quoPrioTimBuy not matching. Actual %s but Expected %s", actual.quoPrioTimBuy, expected.quoPrioTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimSel, expected.quoPrioTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, quoPrioTimSel not matching. Actual %s but Expected %s", actual.quoPrioTimSel, expected.quoPrioTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatBuy, expected.quoPrioDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, quoPrioDatBuy not matching. Actual %s but Expected %s", actual.quoPrioDatBuy, expected.quoPrioDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatSel, expected.quoPrioDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, quoPrioDatSel not matching. Actual %s but Expected %s", actual.quoPrioDatSel, expected.quoPrioDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatBuy, expected.lstEvntDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, lstEvntDatBuy not matching. Actual %s but Expected %s", actual.lstEvntDatBuy, expected.lstEvntDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimBuy, expected.lstEvntTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, lstEvntTimBuy not matching. Actual %s but Expected %s", actual.lstEvntTimBuy, expected.lstEvntTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, lstEvntTrnIdBuy not matching. Actual %s but Expected %s", actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatSel, expected.lstEvntDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, lstEvntDatSel not matching. Actual %s but Expected %s", actual.lstEvntDatSel, expected.lstEvntDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimSel, expected.lstEvntTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, lstEvntTimSel not matching. Actual %s but Expected %s", actual.lstEvntTimSel, expected.lstEvntTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoRecT, lstEvntTrnIdSel not matching. Actual %s but Expected %s", actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnSLegQuoResponseT(futBscInqOwnSLegQuoResponseT actual, futBscInqOwnSLegQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegQuoResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_OWN_S_LEG_QUO_REC_MAX;i++) {
		compareFutBscInqOwnSLegQuoRecT (actual.futBscInqOwnSLegQuoRec[i],expected.futBscInqOwnSLegQuoRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqOwnSLegQuoRecT(futExtInqOwnSLegQuoRecT actual, futExtInqOwnSLegQuoRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqOwnSLegQuoResponseT(futExtInqOwnSLegQuoResponseT actual, futExtInqOwnSLegQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_OWN_S_LEG_QUO_REC_MAX;i++) {
		compareFutExtInqOwnSLegQuoRecT (actual.futExtInqOwnSLegQuoRec[i],expected.futExtInqOwnSLegQuoRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqOwnSLegQuoRequestT(optBscInqOwnSLegQuoRequestT actual, optBscInqOwnSLegQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_BSC_INQ_OWN_S_LEG_QUO_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.quoTimMin, expected.quoTimMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRequestT, quoTimMin not matching. Actual %s but Expected %s", actual.quoTimMin, expected.quoTimMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTimMax, expected.quoTimMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRequestT, quoTimMax not matching. Actual %s but Expected %s", actual.quoTimMax, expected.quoTimMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqOwnSLegQuoRecT(optBscInqOwnSLegQuoRecT actual, optBscInqOwnSLegQuoRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtyBuy, expected.quoBkQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, quoBkQtyBuy not matching. Actual %s but Expected %s", actual.quoBkQtyBuy, expected.quoBkQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtySel, expected.quoBkQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, quoBkQtySel not matching. Actual %s but Expected %s", actual.quoBkQtySel, expected.quoBkQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimBuy, expected.quoPrioTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, quoPrioTimBuy not matching. Actual %s but Expected %s", actual.quoPrioTimBuy, expected.quoPrioTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimSel, expected.quoPrioTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, quoPrioTimSel not matching. Actual %s but Expected %s", actual.quoPrioTimSel, expected.quoPrioTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatBuy, expected.quoPrioDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, quoPrioDatBuy not matching. Actual %s but Expected %s", actual.quoPrioDatBuy, expected.quoPrioDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatSel, expected.quoPrioDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, quoPrioDatSel not matching. Actual %s but Expected %s", actual.quoPrioDatSel, expected.quoPrioDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatBuy, expected.lstEvntDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, lstEvntDatBuy not matching. Actual %s but Expected %s", actual.lstEvntDatBuy, expected.lstEvntDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimBuy, expected.lstEvntTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, lstEvntTimBuy not matching. Actual %s but Expected %s", actual.lstEvntTimBuy, expected.lstEvntTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, lstEvntTrnIdBuy not matching. Actual %s but Expected %s", actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatSel, expected.lstEvntDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, lstEvntDatSel not matching. Actual %s but Expected %s", actual.lstEvntDatSel, expected.lstEvntDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimSel, expected.lstEvntTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, lstEvntTimSel not matching. Actual %s but Expected %s", actual.lstEvntTimSel, expected.lstEvntTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoRecT, lstEvntTrnIdSel not matching. Actual %s but Expected %s", actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqOwnSLegQuoResponseT(optBscInqOwnSLegQuoResponseT actual, optBscInqOwnSLegQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegQuoResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_OWN_S_LEG_QUO_REC_MAX;i++) {
		compareOptBscInqOwnSLegQuoRecT (actual.optBscInqOwnSLegQuoRec[i],expected.optBscInqOwnSLegQuoRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqOwnSLegQuoRecT(optExtInqOwnSLegQuoRecT actual, optExtInqOwnSLegQuoRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqOwnSLegQuoResponseT(optExtInqOwnSLegQuoResponseT actual, optExtInqOwnSLegQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_OWN_S_LEG_QUO_REC_MAX;i++) {
		compareOptExtInqOwnSLegQuoRecT (actual.optExtInqOwnSLegQuoRec[i],expected.optExtInqOwnSLegQuoRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqOwnSLegQuoRequestT(futInqOwnSLegQuoRequestT actual, futInqOwnSLegQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqOwnSLegQuoRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqOwnSLegQuoResponseT(futInqOwnSLegQuoResponseT actual, futInqOwnSLegQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqOwnSLegQuoResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqOwnSLegQuoResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqOwnSLegQuoRequestT(optInqOwnSLegQuoRequestT actual, optInqOwnSLegQuoRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqOwnSLegQuoRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqOwnSLegQuoResponseT(optInqOwnSLegQuoResponseT actual, optInqOwnSLegQuoResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqOwnSLegQuoResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqOwnSLegQuoResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqOwnSLegQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqOwnSLegQuoRequestT *actualData = (futInqOwnSLegQuoRequestT *)msgStruct;
	futInqOwnSLegQuoRequestT* expectedData = getFutInqOwnSLegQuoRequestT(testCaseNum);
	compareFutInqOwnSLegQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqOwnSLegQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqOwnSLegQuoResponseT *actualData = (futInqOwnSLegQuoResponseT *)msgStruct;
	futInqOwnSLegQuoResponseT* expectedData = getFutInqOwnSLegQuoResponseT(testCaseNum);
	compareFutInqOwnSLegQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqOwnSLegQuoRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqOwnSLegQuoRequestT *actualData = (optInqOwnSLegQuoRequestT *)msgStruct;
	optInqOwnSLegQuoRequestT* expectedData = getOptInqOwnSLegQuoRequestT(testCaseNum);
	compareOptInqOwnSLegQuoRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqOwnSLegQuoResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqOwnSLegQuoResponseT *actualData = (optInqOwnSLegQuoResponseT *)msgStruct;
	optInqOwnSLegQuoResponseT* expectedData = getOptInqOwnSLegQuoResponseT(testCaseNum);
	compareOptInqOwnSLegQuoResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
