#include <InqSetlPrc.hxx>
#define BUFFER_SIZE 1000

futInqSetlPrcRequestT *vfutInqSetlPrcRequestT;
futInqSetlPrcResponseT *vfutInqSetlPrcResponseT;
optInqSetlPrcRequestT *voptInqSetlPrcRequestT;
optInqSetlPrcResponseT *voptInqSetlPrcResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqSetlPrcRequestT getFutBscInqSetlPrcRequestT(char* testCaseNum , const char *root) {
	futBscInqSetlPrcRequestT vfutBscInqSetlPrcRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqSetlPrcRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqSetlPrc.futBscInqSetlPrcRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqSetlPrcRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqSetlPrcRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqSetlPrc.futBscInqSetlPrcRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqSetlPrcRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqSetlPrcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqSetlPrcRecT getFutBscInqSetlPrcRecT(char* testCaseNum , const char *root) {
	futBscInqSetlPrcRecT vfutBscInqSetlPrcRecT;
	int i;

	vfutBscInqSetlPrcRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqSetlPrcRecT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqSetlPrcRecT.cntrSetlPrc[i]= ' ';
	}
	char lcntrSetlPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.futBscInqSetlPrcRecT.cntrSetlPrc", lcntrSetlPrc);
	memcpy(vfutBscInqSetlPrcRecT.cntrSetlPrc, lcntrSetlPrc, DRIV_PRICE_LEN);

	for(i=0;i<SETL_DISP_DCML_LEN;i++) {
		vfutBscInqSetlPrcRecT.setlDispDcml[i]= ' ';
	}
	char lsetlDispDcml[SETL_DISP_DCML_LEN] = {""};
	getStrProperty("InqSetlPrc.futBscInqSetlPrcRecT.setlDispDcml", lsetlDispDcml);
	memcpy(vfutBscInqSetlPrcRecT.setlDispDcml, lsetlDispDcml, SETL_DISP_DCML_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqSetlPrcRecT.cntrSetlPrcDat[i]= ' ';
	}
	char lcntrSetlPrcDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqSetlPrc.futBscInqSetlPrcRecT.cntrSetlPrcDat", lcntrSetlPrcDat);
	memcpy(vfutBscInqSetlPrcRecT.cntrSetlPrcDat, lcntrSetlPrcDat, DRIV_DATE_LEN);

	for(i=0;i<UNDR_ID_LEN;i++) {
		vfutBscInqSetlPrcRecT.undrId[i]= ' ';
	}
	char lundrId[UNDR_ID_LEN] = {""};
	getStrProperty("InqSetlPrc.futBscInqSetlPrcRecT.undrId", lundrId);
	memcpy(vfutBscInqSetlPrcRecT.undrId, lundrId, UNDR_ID_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqSetlPrcRecT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.futBscInqSetlPrcRecT.lstTrdPrc", llstTrdPrc);
	memcpy(vfutBscInqSetlPrcRecT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqSetlPrcRecT.trdDat[i]= ' ';
	}
	char ltrdDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqSetlPrc.futBscInqSetlPrcRecT.trdDat", ltrdDat);
	memcpy(vfutBscInqSetlPrcRecT.trdDat, ltrdDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqSetlPrcRecT.trdTim[i]= ' ';
	}
	char ltrdTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqSetlPrc.futBscInqSetlPrcRecT.trdTim", ltrdTim);
	memcpy(vfutBscInqSetlPrcRecT.trdTim, ltrdTim, DRIV_TIME_LEN);
	return vfutBscInqSetlPrcRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqSetlPrcResponseT getFutBscInqSetlPrcResponseT(char* testCaseNum , const char *root) {
	futBscInqSetlPrcResponseT vfutBscInqSetlPrcResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqSetlPrcResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqSetlPrc.futBscInqSetlPrcResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqSetlPrcResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqSetlPrcResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqSetlPrc.futBscInqSetlPrcResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqSetlPrcResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqSetlPrcResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqSetlPrcRecT getFutExtInqSetlPrcRecT(char* testCaseNum , const char *root) {
	futExtInqSetlPrcRecT vfutExtInqSetlPrcRecT;
	int i;

	char lsetlPrcCod[1] = {""};
	getStrProperty("InqSetlPrc.futExtInqSetlPrcRecT.setlPrcCod", lsetlPrcCod);
	vfutExtInqSetlPrcRecT.setlPrcCod = lsetlPrcCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtInqSetlPrcRecT.undrClsPrc[i]= ' ';
	}
	char lundrClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.futExtInqSetlPrcRecT.undrClsPrc", lundrClsPrc);
	memcpy(vfutExtInqSetlPrcRecT.undrClsPrc, lundrClsPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtInqSetlPrcRecT.lstBidPrc[i]= ' ';
	}
	char llstBidPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.futExtInqSetlPrcRecT.lstBidPrc", llstBidPrc);
	memcpy(vfutExtInqSetlPrcRecT.lstBidPrc, llstBidPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtInqSetlPrcRecT.lstAskPrc[i]= ' ';
	}
	char llstAskPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.futExtInqSetlPrcRecT.lstAskPrc", llstAskPrc);
	memcpy(vfutExtInqSetlPrcRecT.lstAskPrc, llstAskPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtInqSetlPrcRecT.mgnClsPrc[i]= ' ';
	}
	char lmgnClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.futExtInqSetlPrcRecT.mgnClsPrc", lmgnClsPrc);
	memcpy(vfutExtInqSetlPrcRecT.mgnClsPrc, lmgnClsPrc, DRIV_PRICE_LEN);

	char lapprCod[1] = {""};
	getStrProperty("InqSetlPrc.futExtInqSetlPrcRecT.apprCod", lapprCod);
	vfutExtInqSetlPrcRecT.apprCod = lapprCod[0];

	for(i=0;i<IMPL_VOL_LEN;i++) {
		vfutExtInqSetlPrcRecT.implVol[i]= ' ';
	}
	char limplVol[IMPL_VOL_LEN] = {""};
	getStrProperty("InqSetlPrc.futExtInqSetlPrcRecT.implVol", limplVol);
	memcpy(vfutExtInqSetlPrcRecT.implVol, limplVol, IMPL_VOL_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqSetlPrcRecT.opnInt[i]= ' ';
	}
	char lopnInt[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSetlPrc.futExtInqSetlPrcRecT.opnInt", lopnInt);
	memcpy(vfutExtInqSetlPrcRecT.opnInt, lopnInt, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtInqSetlPrcRecT.undrFinSetlPrc[i]= ' ';
	}
	char lundrFinSetlPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.futExtInqSetlPrcRecT.undrFinSetlPrc", lundrFinSetlPrc);
	memcpy(vfutExtInqSetlPrcRecT.undrFinSetlPrc, lundrFinSetlPrc, DRIV_PRICE_LEN);

	char lfinSetlPrcCalcCod[1] = {""};
	getStrProperty("InqSetlPrc.futExtInqSetlPrcRecT.finSetlPrcCalcCod", lfinSetlPrcCalcCod);
	vfutExtInqSetlPrcRecT.finSetlPrcCalcCod = lfinSetlPrcCalcCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutExtInqSetlPrcRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqSetlPrc.futExtInqSetlPrcRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutExtInqSetlPrcRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutExtInqSetlPrcRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqSetlPrcResponseT getFutExtInqSetlPrcResponseT(char* testCaseNum , const char *root) {
	futExtInqSetlPrcResponseT vfutExtInqSetlPrcResponseT;
	int i;
	return vfutExtInqSetlPrcResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqSetlPrcRequestT getOptBscInqSetlPrcRequestT(char* testCaseNum , const char *root) {
	optBscInqSetlPrcRequestT voptBscInqSetlPrcRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqSetlPrcRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqSetlPrc.optBscInqSetlPrcRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqSetlPrcRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqSetlPrcRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqSetlPrc.optBscInqSetlPrcRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqSetlPrcRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqSetlPrcRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqSetlPrcRecT getOptBscInqSetlPrcRecT(char* testCaseNum , const char *root) {
	optBscInqSetlPrcRecT voptBscInqSetlPrcRecT;
	int i;

	voptBscInqSetlPrcRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqSetlPrcRecT");
	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqSetlPrcRecT.cntrSetlPrc[i]= ' ';
	}
	char lcntrSetlPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.optBscInqSetlPrcRecT.cntrSetlPrc", lcntrSetlPrc);
	memcpy(voptBscInqSetlPrcRecT.cntrSetlPrc, lcntrSetlPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqSetlPrcRecT.cntrSetlPrcDat[i]= ' ';
	}
	char lcntrSetlPrcDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqSetlPrc.optBscInqSetlPrcRecT.cntrSetlPrcDat", lcntrSetlPrcDat);
	memcpy(voptBscInqSetlPrcRecT.cntrSetlPrcDat, lcntrSetlPrcDat, DRIV_DATE_LEN);

	for(i=0;i<SETL_DISP_DCML_LEN;i++) {
		voptBscInqSetlPrcRecT.setlDispDcml[i]= ' ';
	}
	char lsetlDispDcml[SETL_DISP_DCML_LEN] = {""};
	getStrProperty("InqSetlPrc.optBscInqSetlPrcRecT.setlDispDcml", lsetlDispDcml);
	memcpy(voptBscInqSetlPrcRecT.setlDispDcml, lsetlDispDcml, SETL_DISP_DCML_LEN);

	for(i=0;i<UNDR_ID_LEN;i++) {
		voptBscInqSetlPrcRecT.undrId[i]= ' ';
	}
	char lundrId[UNDR_ID_LEN] = {""};
	getStrProperty("InqSetlPrc.optBscInqSetlPrcRecT.undrId", lundrId);
	memcpy(voptBscInqSetlPrcRecT.undrId, lundrId, UNDR_ID_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqSetlPrcRecT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.optBscInqSetlPrcRecT.lstTrdPrc", llstTrdPrc);
	memcpy(voptBscInqSetlPrcRecT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqSetlPrcRecT.trdDat[i]= ' ';
	}
	char ltrdDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqSetlPrc.optBscInqSetlPrcRecT.trdDat", ltrdDat);
	memcpy(voptBscInqSetlPrcRecT.trdDat, ltrdDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqSetlPrcRecT.trdTim[i]= ' ';
	}
	char ltrdTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqSetlPrc.optBscInqSetlPrcRecT.trdTim", ltrdTim);
	memcpy(voptBscInqSetlPrcRecT.trdTim, ltrdTim, DRIV_TIME_LEN);
	return voptBscInqSetlPrcRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqSetlPrcResponseT getOptBscInqSetlPrcResponseT(char* testCaseNum , const char *root) {
	optBscInqSetlPrcResponseT voptBscInqSetlPrcResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqSetlPrcResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqSetlPrc.optBscInqSetlPrcResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqSetlPrcResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqSetlPrcResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqSetlPrc.optBscInqSetlPrcResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqSetlPrcResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqSetlPrcResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqSetlPrcRecT getOptExtInqSetlPrcRecT(char* testCaseNum , const char *root) {
	optExtInqSetlPrcRecT voptExtInqSetlPrcRecT;
	int i;

	char lsetlPrcCod[1] = {""};
	getStrProperty("InqSetlPrc.optExtInqSetlPrcRecT.setlPrcCod", lsetlPrcCod);
	voptExtInqSetlPrcRecT.setlPrcCod = lsetlPrcCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqSetlPrcRecT.undrClsPrc[i]= ' ';
	}
	char lundrClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.optExtInqSetlPrcRecT.undrClsPrc", lundrClsPrc);
	memcpy(voptExtInqSetlPrcRecT.undrClsPrc, lundrClsPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqSetlPrcRecT.lstBidPrc[i]= ' ';
	}
	char llstBidPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.optExtInqSetlPrcRecT.lstBidPrc", llstBidPrc);
	memcpy(voptExtInqSetlPrcRecT.lstBidPrc, llstBidPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqSetlPrcRecT.lstAskPrc[i]= ' ';
	}
	char llstAskPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.optExtInqSetlPrcRecT.lstAskPrc", llstAskPrc);
	memcpy(voptExtInqSetlPrcRecT.lstAskPrc, llstAskPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqSetlPrcRecT.mgnClsPrc[i]= ' ';
	}
	char lmgnClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.optExtInqSetlPrcRecT.mgnClsPrc", lmgnClsPrc);
	memcpy(voptExtInqSetlPrcRecT.mgnClsPrc, lmgnClsPrc, DRIV_PRICE_LEN);

	char lapprCod[1] = {""};
	getStrProperty("InqSetlPrc.optExtInqSetlPrcRecT.apprCod", lapprCod);
	voptExtInqSetlPrcRecT.apprCod = lapprCod[0];

	for(i=0;i<IMPL_VOL_LEN;i++) {
		voptExtInqSetlPrcRecT.implVol[i]= ' ';
	}
	char limplVol[IMPL_VOL_LEN] = {""};
	getStrProperty("InqSetlPrc.optExtInqSetlPrcRecT.implVol", limplVol);
	memcpy(voptExtInqSetlPrcRecT.implVol, limplVol, IMPL_VOL_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqSetlPrcRecT.opnInt[i]= ' ';
	}
	char lopnInt[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSetlPrc.optExtInqSetlPrcRecT.opnInt", lopnInt);
	memcpy(voptExtInqSetlPrcRecT.opnInt, lopnInt, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqSetlPrcRecT.undrFinSetlPrc[i]= ' ';
	}
	char lundrFinSetlPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSetlPrc.optExtInqSetlPrcRecT.undrFinSetlPrc", lundrFinSetlPrc);
	memcpy(voptExtInqSetlPrcRecT.undrFinSetlPrc, lundrFinSetlPrc, DRIV_PRICE_LEN);

	char lfinSetlPrcCalcCod[1] = {""};
	getStrProperty("InqSetlPrc.optExtInqSetlPrcRecT.finSetlPrcCalcCod", lfinSetlPrcCalcCod);
	voptExtInqSetlPrcRecT.finSetlPrcCalcCod = lfinSetlPrcCalcCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptExtInqSetlPrcRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqSetlPrc.optExtInqSetlPrcRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptExtInqSetlPrcRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptExtInqSetlPrcRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqSetlPrcResponseT getOptExtInqSetlPrcResponseT(char* testCaseNum , const char *root) {
	optExtInqSetlPrcResponseT voptExtInqSetlPrcResponseT;
	int i;
	return voptExtInqSetlPrcResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqSetlPrcRequestT* getFutInqSetlPrcRequestT(char* testCaseNum) {
	vfutInqSetlPrcRequestT = (futInqSetlPrcRequestT*)malloc(sizeof(futInqSetlPrcRequestT));
	int i;

	vfutInqSetlPrcRequestT->header = getDataHeaderT(testCaseNum, "futInqSetlPrcRequestT");
	vfutInqSetlPrcRequestT->basic = getFutBscInqSetlPrcRequestT(testCaseNum, "futInqSetlPrcRequestT");
	return vfutInqSetlPrcRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqSetlPrcResponseT* getFutInqSetlPrcResponseT(char* testCaseNum) {
	vfutInqSetlPrcResponseT = (futInqSetlPrcResponseT*)malloc(sizeof(futInqSetlPrcResponseT));
	int i;

	vfutInqSetlPrcResponseT->header = getDataHeaderT(testCaseNum, "futInqSetlPrcResponseT");
	vfutInqSetlPrcResponseT->basic = getFutBscInqSetlPrcResponseT(testCaseNum, "futInqSetlPrcResponseT");
	vfutInqSetlPrcResponseT->extension = getFutExtInqSetlPrcResponseT(testCaseNum, "futInqSetlPrcResponseT");
	return vfutInqSetlPrcResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqSetlPrcRequestT* getOptInqSetlPrcRequestT(char* testCaseNum) {
	voptInqSetlPrcRequestT = (optInqSetlPrcRequestT*)malloc(sizeof(optInqSetlPrcRequestT));
	int i;

	voptInqSetlPrcRequestT->header = getDataHeaderT(testCaseNum, "optInqSetlPrcRequestT");
	voptInqSetlPrcRequestT->basic = getOptBscInqSetlPrcRequestT(testCaseNum, "optInqSetlPrcRequestT");
	return voptInqSetlPrcRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqSetlPrcResponseT* getOptInqSetlPrcResponseT(char* testCaseNum) {
	voptInqSetlPrcResponseT = (optInqSetlPrcResponseT*)malloc(sizeof(optInqSetlPrcResponseT));
	int i;

	voptInqSetlPrcResponseT->header = getDataHeaderT(testCaseNum, "optInqSetlPrcResponseT");
	voptInqSetlPrcResponseT->basic = getOptBscInqSetlPrcResponseT(testCaseNum, "optInqSetlPrcResponseT");
	voptInqSetlPrcResponseT->extension = getOptExtInqSetlPrcResponseT(testCaseNum, "optInqSetlPrcResponseT");
	return voptInqSetlPrcResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqSetlPrcRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqSetlPrcRequestT));
	futInqSetlPrcRequestT *vfutInqSetlPrcRequestT = getFutInqSetlPrcRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqSetlPrcRequestT), (jbyte*) vfutInqSetlPrcRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqSetlPrcResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqSetlPrcResponseT));
	futInqSetlPrcResponseT *vfutInqSetlPrcResponseT = getFutInqSetlPrcResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqSetlPrcResponseT), (jbyte*) vfutInqSetlPrcResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqSetlPrcRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqSetlPrcRequestT));
	optInqSetlPrcRequestT *voptInqSetlPrcRequestT = getOptInqSetlPrcRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqSetlPrcRequestT), (jbyte*) voptInqSetlPrcRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqSetlPrcResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqSetlPrcResponseT));
	optInqSetlPrcResponseT *voptInqSetlPrcResponseT = getOptInqSetlPrcResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqSetlPrcResponseT), (jbyte*) voptInqSetlPrcResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqSetlPrcRequestT(futBscInqSetlPrcRequestT actual, futBscInqSetlPrcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_SETL_PRC_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSetlPrcRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSetlPrcRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqSetlPrcRecT(futBscInqSetlPrcRecT actual, futBscInqSetlPrcRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.cntrSetlPrc, expected.cntrSetlPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSetlPrcRecT, cntrSetlPrc not matching. Actual %s but Expected %s", actual.cntrSetlPrc, expected.cntrSetlPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDispDcml, expected.setlDispDcml, SETL_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSetlPrcRecT, setlDispDcml not matching. Actual %s but Expected %s", actual.setlDispDcml, expected.setlDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrSetlPrcDat, expected.cntrSetlPrcDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSetlPrcRecT, cntrSetlPrcDat not matching. Actual %s but Expected %s", actual.cntrSetlPrcDat, expected.cntrSetlPrcDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrId, expected.undrId, UNDR_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSetlPrcRecT, undrId not matching. Actual %s but Expected %s", actual.undrId, expected.undrId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSetlPrcRecT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdDat, expected.trdDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSetlPrcRecT, trdDat not matching. Actual %s but Expected %s", actual.trdDat, expected.trdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdTim, expected.trdTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSetlPrcRecT, trdTim not matching. Actual %s but Expected %s", actual.trdTim, expected.trdTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqSetlPrcResponseT(futBscInqSetlPrcResponseT actual, futBscInqSetlPrcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSetlPrcResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSetlPrcResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_SETL_PRC_REC_MAX;i++) {
		compareFutBscInqSetlPrcRecT (actual.futBscInqSetlPrcRec[i],expected.futBscInqSetlPrcRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqSetlPrcRecT(futExtInqSetlPrcRecT actual, futExtInqSetlPrcRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.setlPrcCod!= expected.setlPrcCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSetlPrcRecT, setlPrcCodnot matching. Actual %d but Expected %d", actual.setlPrcCod, expected.setlPrcCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrClsPrc, expected.undrClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSetlPrcRecT, undrClsPrc not matching. Actual %s but Expected %s", actual.undrClsPrc, expected.undrClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstBidPrc, expected.lstBidPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSetlPrcRecT, lstBidPrc not matching. Actual %s but Expected %s", actual.lstBidPrc, expected.lstBidPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstAskPrc, expected.lstAskPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSetlPrcRecT, lstAskPrc not matching. Actual %s but Expected %s", actual.lstAskPrc, expected.lstAskPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mgnClsPrc, expected.mgnClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSetlPrcRecT, mgnClsPrc not matching. Actual %s but Expected %s", actual.mgnClsPrc, expected.mgnClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.apprCod!= expected.apprCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSetlPrcRecT, apprCodnot matching. Actual %d but Expected %d", actual.apprCod, expected.apprCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.implVol, expected.implVol, IMPL_VOL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSetlPrcRecT, implVol not matching. Actual %s but Expected %s", actual.implVol, expected.implVol);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.opnInt, expected.opnInt, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSetlPrcRecT, opnInt not matching. Actual %s but Expected %s", actual.opnInt, expected.opnInt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrFinSetlPrc, expected.undrFinSetlPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSetlPrcRecT, undrFinSetlPrc not matching. Actual %s but Expected %s", actual.undrFinSetlPrc, expected.undrFinSetlPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.finSetlPrcCalcCod!= expected.finSetlPrcCalcCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSetlPrcRecT, finSetlPrcCalcCodnot matching. Actual %d but Expected %d", actual.finSetlPrcCalcCod, expected.finSetlPrcCalcCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSetlPrcRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqSetlPrcResponseT(futExtInqSetlPrcResponseT actual, futExtInqSetlPrcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_SETL_PRC_REC_MAX;i++) {
		compareFutExtInqSetlPrcRecT (actual.futExtInqSetlPrcRec[i],expected.futExtInqSetlPrcRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqSetlPrcRequestT(optBscInqSetlPrcRequestT actual, optBscInqSetlPrcRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_BSC_INQ_SETL_PRC_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSetlPrcRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSetlPrcRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqSetlPrcRecT(optBscInqSetlPrcRecT actual, optBscInqSetlPrcRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.cntrSetlPrc, expected.cntrSetlPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSetlPrcRecT, cntrSetlPrc not matching. Actual %s but Expected %s", actual.cntrSetlPrc, expected.cntrSetlPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cntrSetlPrcDat, expected.cntrSetlPrcDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSetlPrcRecT, cntrSetlPrcDat not matching. Actual %s but Expected %s", actual.cntrSetlPrcDat, expected.cntrSetlPrcDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDispDcml, expected.setlDispDcml, SETL_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSetlPrcRecT, setlDispDcml not matching. Actual %s but Expected %s", actual.setlDispDcml, expected.setlDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrId, expected.undrId, UNDR_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSetlPrcRecT, undrId not matching. Actual %s but Expected %s", actual.undrId, expected.undrId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSetlPrcRecT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdDat, expected.trdDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSetlPrcRecT, trdDat not matching. Actual %s but Expected %s", actual.trdDat, expected.trdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdTim, expected.trdTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSetlPrcRecT, trdTim not matching. Actual %s but Expected %s", actual.trdTim, expected.trdTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqSetlPrcResponseT(optBscInqSetlPrcResponseT actual, optBscInqSetlPrcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSetlPrcResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSetlPrcResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_SETL_PRC_REC_MAX;i++) {
		compareOptBscInqSetlPrcRecT (actual.optBscInqSetlPrcRec[i],expected.optBscInqSetlPrcRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqSetlPrcRecT(optExtInqSetlPrcRecT actual, optExtInqSetlPrcRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.setlPrcCod!= expected.setlPrcCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSetlPrcRecT, setlPrcCodnot matching. Actual %d but Expected %d", actual.setlPrcCod, expected.setlPrcCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrClsPrc, expected.undrClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSetlPrcRecT, undrClsPrc not matching. Actual %s but Expected %s", actual.undrClsPrc, expected.undrClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstBidPrc, expected.lstBidPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSetlPrcRecT, lstBidPrc not matching. Actual %s but Expected %s", actual.lstBidPrc, expected.lstBidPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstAskPrc, expected.lstAskPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSetlPrcRecT, lstAskPrc not matching. Actual %s but Expected %s", actual.lstAskPrc, expected.lstAskPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mgnClsPrc, expected.mgnClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSetlPrcRecT, mgnClsPrc not matching. Actual %s but Expected %s", actual.mgnClsPrc, expected.mgnClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.apprCod!= expected.apprCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSetlPrcRecT, apprCodnot matching. Actual %d but Expected %d", actual.apprCod, expected.apprCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.implVol, expected.implVol, IMPL_VOL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSetlPrcRecT, implVol not matching. Actual %s but Expected %s", actual.implVol, expected.implVol);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.opnInt, expected.opnInt, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSetlPrcRecT, opnInt not matching. Actual %s but Expected %s", actual.opnInt, expected.opnInt);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.undrFinSetlPrc, expected.undrFinSetlPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSetlPrcRecT, undrFinSetlPrc not matching. Actual %s but Expected %s", actual.undrFinSetlPrc, expected.undrFinSetlPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.finSetlPrcCalcCod!= expected.finSetlPrcCalcCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSetlPrcRecT, finSetlPrcCalcCodnot matching. Actual %d but Expected %d", actual.finSetlPrcCalcCod, expected.finSetlPrcCalcCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSetlPrcRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqSetlPrcResponseT(optExtInqSetlPrcResponseT actual, optExtInqSetlPrcResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_SETL_PRC_REC_MAX;i++) {
		compareOptExtInqSetlPrcRecT (actual.optExtInqSetlPrcRec[i],expected.optExtInqSetlPrcRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqSetlPrcRequestT(futInqSetlPrcRequestT actual, futInqSetlPrcRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqSetlPrcRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqSetlPrcResponseT(futInqSetlPrcResponseT actual, futInqSetlPrcResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqSetlPrcResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqSetlPrcResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqSetlPrcRequestT(optInqSetlPrcRequestT actual, optInqSetlPrcRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqSetlPrcRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqSetlPrcResponseT(optInqSetlPrcResponseT actual, optInqSetlPrcResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqSetlPrcResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqSetlPrcResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqSetlPrcRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqSetlPrcRequestT *actualData = (futInqSetlPrcRequestT *)msgStruct;
	futInqSetlPrcRequestT* expectedData = getFutInqSetlPrcRequestT(testCaseNum);
	compareFutInqSetlPrcRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqSetlPrcResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqSetlPrcResponseT *actualData = (futInqSetlPrcResponseT *)msgStruct;
	futInqSetlPrcResponseT* expectedData = getFutInqSetlPrcResponseT(testCaseNum);
	compareFutInqSetlPrcResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqSetlPrcRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqSetlPrcRequestT *actualData = (optInqSetlPrcRequestT *)msgStruct;
	optInqSetlPrcRequestT* expectedData = getOptInqSetlPrcRequestT(testCaseNum);
	compareOptInqSetlPrcRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqSetlPrcResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqSetlPrcResponseT *actualData = (optInqSetlPrcResponseT *)msgStruct;
	optInqSetlPrcResponseT* expectedData = getOptInqSetlPrcResponseT(testCaseNum);
	compareOptInqSetlPrcResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
