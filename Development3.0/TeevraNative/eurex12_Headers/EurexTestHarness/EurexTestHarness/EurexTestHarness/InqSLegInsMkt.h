#include <InqSLegInsMkt.hxx>
#define BUFFER_SIZE 1000

futInqSLegInsMktRequestT *vfutInqSLegInsMktRequestT;
futInqSLegInsMktResponseT *vfutInqSLegInsMktResponseT;
optInqSLegInsMktRequestT *voptInqSLegInsMktRequestT;
optInqSLegInsMktResponseT *voptInqSLegInsMktResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqSLegInsMktRequestT getFutBscInqSLegInsMktRequestT(char* testCaseNum , const char *root) {
	futBscInqSLegInsMktRequestT vfutBscInqSLegInsMktRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqSLegInsMktRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futBscInqSLegInsMktRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqSLegInsMktRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqSLegInsMktRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futBscInqSLegInsMktRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqSLegInsMktRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqSLegInsMktRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqSLegInsMktRecT getFutBscInqSLegInsMktRecT(char* testCaseNum , const char *root) {
	futBscInqSLegInsMktRecT vfutBscInqSLegInsMktRecT;
	int i;

	vfutBscInqSLegInsMktRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqSLegInsMktRecT");
	vfutBscInqSLegInsMktRecT.bstOrdrGrp = getBstOrdrGrpT(testCaseNum, "futBscInqSLegInsMktRecT");
	vfutBscInqSLegInsMktRecT.bstQuoOrdrGrp = getBstQuoOrdrGrpT(testCaseNum, "futBscInqSLegInsMktRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqSLegInsMktRecT.totTrdQty[i]= ' ';
	}
	char ltotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futBscInqSLegInsMktRecT.totTrdQty", ltotTrdQty);
	memcpy(vfutBscInqSLegInsMktRecT.totTrdQty, ltotTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqSLegInsMktRecT.lstClsPrc[i]= ' ';
	}
	char llstClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futBscInqSLegInsMktRecT.lstClsPrc", llstClsPrc);
	memcpy(vfutBscInqSLegInsMktRecT.lstClsPrc, llstClsPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqSLegInsMktRecT.lstSetlPrc[i]= ' ';
	}
	char llstSetlPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futBscInqSLegInsMktRecT.lstSetlPrc", llstSetlPrc);
	memcpy(vfutBscInqSLegInsMktRecT.lstSetlPrc, llstSetlPrc, DRIV_PRICE_LEN);

	for(i=0;i<SETL_DISP_DCML_LEN;i++) {
		vfutBscInqSLegInsMktRecT.setlDispDcml[i]= ' ';
	}
	char lsetlDispDcml[SETL_DISP_DCML_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futBscInqSLegInsMktRecT.setlDispDcml", lsetlDispDcml);
	memcpy(vfutBscInqSLegInsMktRecT.setlDispDcml, lsetlDispDcml, SETL_DISP_DCML_LEN);

	char lcntrStsValCod[1] = {""};
	getStrProperty("InqSLegInsMkt.futBscInqSLegInsMktRecT.cntrStsValCod", lcntrStsValCod);
	vfutBscInqSLegInsMktRecT.cntrStsValCod = lcntrStsValCod[0];

	for(i=0;i<PRCS_STS_VAL_COD_LEN;i++) {
		vfutBscInqSLegInsMktRecT.prcsStsValCod[i]= ' ';
	}
	char lprcsStsValCod[PRCS_STS_VAL_COD_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futBscInqSLegInsMktRecT.prcsStsValCod", lprcsStsValCod);
	memcpy(vfutBscInqSLegInsMktRecT.prcsStsValCod, lprcsStsValCod, PRCS_STS_VAL_COD_LEN);
	return vfutBscInqSLegInsMktRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqSLegInsMktResponseT getFutBscInqSLegInsMktResponseT(char* testCaseNum , const char *root) {
	futBscInqSLegInsMktResponseT vfutBscInqSLegInsMktResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqSLegInsMktResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futBscInqSLegInsMktResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqSLegInsMktResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqSLegInsMktResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futBscInqSLegInsMktResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqSLegInsMktResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqSLegInsMktResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqSLegInsMktRecT getFutExtInqSLegInsMktRecT(char* testCaseNum , const char *root) {
	futExtInqSLegInsMktRecT vfutExtInqSLegInsMktRecT;
	int i;

	char lprcTypInd[1] = {""};
	getStrProperty("InqSLegInsMkt.futExtInqSLegInsMktRecT.prcTypInd", lprcTypInd);
	vfutExtInqSLegInsMktRecT.prcTypInd = lprcTypInd[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtInqSLegInsMktRecT.dlyHghPrc[i]= ' ';
	}
	char ldlyHghPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futExtInqSLegInsMktRecT.dlyHghPrc", ldlyHghPrc);
	memcpy(vfutExtInqSLegInsMktRecT.dlyHghPrc, ldlyHghPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtInqSLegInsMktRecT.dlyLowPrc[i]= ' ';
	}
	char ldlyLowPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futExtInqSLegInsMktRecT.dlyLowPrc", ldlyLowPrc);
	memcpy(vfutExtInqSLegInsMktRecT.dlyLowPrc, ldlyLowPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtInqSLegInsMktRecT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futExtInqSLegInsMktRecT.lstTrdPrc", llstTrdPrc);
	memcpy(vfutExtInqSLegInsMktRecT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutExtInqSLegInsMktRecT.lstTrdQty[i]= ' ';
	}
	char llstTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futExtInqSLegInsMktRecT.lstTrdQty", llstTrdQty);
	memcpy(vfutExtInqSLegInsMktRecT.lstTrdQty, llstTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutExtInqSLegInsMktRecT.lstAuctPrc[i]= ' ';
	}
	char llstAuctPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futExtInqSLegInsMktRecT.lstAuctPrc", llstAuctPrc);
	memcpy(vfutExtInqSLegInsMktRecT.lstAuctPrc, llstAuctPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtInqSLegInsMktRecT.trdTim[i]= ' ';
	}
	char ltrdTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqSLegInsMkt.futExtInqSLegInsMktRecT.trdTim", ltrdTim);
	memcpy(vfutExtInqSLegInsMktRecT.trdTim, ltrdTim, DRIV_TIME_LEN);
	return vfutExtInqSLegInsMktRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqSLegInsMktResponseT getFutExtInqSLegInsMktResponseT(char* testCaseNum , const char *root) {
	futExtInqSLegInsMktResponseT vfutExtInqSLegInsMktResponseT;
	int i;
	return vfutExtInqSLegInsMktResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqSLegInsMktRequestT getOptBscInqSLegInsMktRequestT(char* testCaseNum , const char *root) {
	optBscInqSLegInsMktRequestT voptBscInqSLegInsMktRequestT;
	int i;

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqSLegInsMktRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optBscInqSLegInsMktRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqSLegInsMktRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqSLegInsMktRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optBscInqSLegInsMktRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqSLegInsMktRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqSLegInsMktRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqSLegInsMktRecT getOptBscInqSLegInsMktRecT(char* testCaseNum , const char *root) {
	optBscInqSLegInsMktRecT voptBscInqSLegInsMktRecT;
	int i;

	voptBscInqSLegInsMktRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqSLegInsMktRecT");
	voptBscInqSLegInsMktRecT.bstOrdrGrp = getBstOrdrGrpT(testCaseNum, "optBscInqSLegInsMktRecT");
	voptBscInqSLegInsMktRecT.bstQuoOrdrGrp = getBstQuoOrdrGrpT(testCaseNum, "optBscInqSLegInsMktRecT");
	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqSLegInsMktRecT.totTrdQty[i]= ' ';
	}
	char ltotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optBscInqSLegInsMktRecT.totTrdQty", ltotTrdQty);
	memcpy(voptBscInqSLegInsMktRecT.totTrdQty, ltotTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqSLegInsMktRecT.lstClsPrc[i]= ' ';
	}
	char llstClsPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optBscInqSLegInsMktRecT.lstClsPrc", llstClsPrc);
	memcpy(voptBscInqSLegInsMktRecT.lstClsPrc, llstClsPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqSLegInsMktRecT.lstSetlPrc[i]= ' ';
	}
	char llstSetlPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optBscInqSLegInsMktRecT.lstSetlPrc", llstSetlPrc);
	memcpy(voptBscInqSLegInsMktRecT.lstSetlPrc, llstSetlPrc, DRIV_PRICE_LEN);

	for(i=0;i<SETL_DISP_DCML_LEN;i++) {
		voptBscInqSLegInsMktRecT.setlDispDcml[i]= ' ';
	}
	char lsetlDispDcml[SETL_DISP_DCML_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optBscInqSLegInsMktRecT.setlDispDcml", lsetlDispDcml);
	memcpy(voptBscInqSLegInsMktRecT.setlDispDcml, lsetlDispDcml, SETL_DISP_DCML_LEN);

	char lcntrStsValCod[1] = {""};
	getStrProperty("InqSLegInsMkt.optBscInqSLegInsMktRecT.cntrStsValCod", lcntrStsValCod);
	voptBscInqSLegInsMktRecT.cntrStsValCod = lcntrStsValCod[0];

	for(i=0;i<PRCS_STS_VAL_COD_LEN;i++) {
		voptBscInqSLegInsMktRecT.prcsStsValCod[i]= ' ';
	}
	char lprcsStsValCod[PRCS_STS_VAL_COD_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optBscInqSLegInsMktRecT.prcsStsValCod", lprcsStsValCod);
	memcpy(voptBscInqSLegInsMktRecT.prcsStsValCod, lprcsStsValCod, PRCS_STS_VAL_COD_LEN);
	return voptBscInqSLegInsMktRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqSLegInsMktResponseT getOptBscInqSLegInsMktResponseT(char* testCaseNum , const char *root) {
	optBscInqSLegInsMktResponseT voptBscInqSLegInsMktResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqSLegInsMktResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optBscInqSLegInsMktResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqSLegInsMktResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqSLegInsMktResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optBscInqSLegInsMktResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqSLegInsMktResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqSLegInsMktResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqSLegInsMktRecT getOptExtInqSLegInsMktRecT(char* testCaseNum , const char *root) {
	optExtInqSLegInsMktRecT voptExtInqSLegInsMktRecT;
	int i;

	char lprcTypInd[1] = {""};
	getStrProperty("InqSLegInsMkt.optExtInqSLegInsMktRecT.prcTypInd", lprcTypInd);
	voptExtInqSLegInsMktRecT.prcTypInd = lprcTypInd[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqSLegInsMktRecT.dlyHghPrc[i]= ' ';
	}
	char ldlyHghPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optExtInqSLegInsMktRecT.dlyHghPrc", ldlyHghPrc);
	memcpy(voptExtInqSLegInsMktRecT.dlyHghPrc, ldlyHghPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqSLegInsMktRecT.dlyLowPrc[i]= ' ';
	}
	char ldlyLowPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optExtInqSLegInsMktRecT.dlyLowPrc", ldlyLowPrc);
	memcpy(voptExtInqSLegInsMktRecT.dlyLowPrc, ldlyLowPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqSLegInsMktRecT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optExtInqSLegInsMktRecT.lstTrdPrc", llstTrdPrc);
	memcpy(voptExtInqSLegInsMktRecT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptExtInqSLegInsMktRecT.lstTrdQty[i]= ' ';
	}
	char llstTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optExtInqSLegInsMktRecT.lstTrdQty", llstTrdQty);
	memcpy(voptExtInqSLegInsMktRecT.lstTrdQty, llstTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptExtInqSLegInsMktRecT.lstAuctPrc[i]= ' ';
	}
	char llstAuctPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optExtInqSLegInsMktRecT.lstAuctPrc", llstAuctPrc);
	memcpy(voptExtInqSLegInsMktRecT.lstAuctPrc, llstAuctPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptExtInqSLegInsMktRecT.trdTim[i]= ' ';
	}
	char ltrdTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqSLegInsMkt.optExtInqSLegInsMktRecT.trdTim", ltrdTim);
	memcpy(voptExtInqSLegInsMktRecT.trdTim, ltrdTim, DRIV_TIME_LEN);
	return voptExtInqSLegInsMktRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqSLegInsMktResponseT getOptExtInqSLegInsMktResponseT(char* testCaseNum , const char *root) {
	optExtInqSLegInsMktResponseT voptExtInqSLegInsMktResponseT;
	int i;
	return voptExtInqSLegInsMktResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqSLegInsMktRequestT* getFutInqSLegInsMktRequestT(char* testCaseNum) {
	vfutInqSLegInsMktRequestT = (futInqSLegInsMktRequestT*)malloc(sizeof(futInqSLegInsMktRequestT));
	int i;

	vfutInqSLegInsMktRequestT->header = getDataHeaderT(testCaseNum, "futInqSLegInsMktRequestT");
	vfutInqSLegInsMktRequestT->basic = getFutBscInqSLegInsMktRequestT(testCaseNum, "futInqSLegInsMktRequestT");
	return vfutInqSLegInsMktRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqSLegInsMktResponseT* getFutInqSLegInsMktResponseT(char* testCaseNum) {
	vfutInqSLegInsMktResponseT = (futInqSLegInsMktResponseT*)malloc(sizeof(futInqSLegInsMktResponseT));
	int i;

	vfutInqSLegInsMktResponseT->header = getDataHeaderT(testCaseNum, "futInqSLegInsMktResponseT");
	vfutInqSLegInsMktResponseT->basic = getFutBscInqSLegInsMktResponseT(testCaseNum, "futInqSLegInsMktResponseT");
	vfutInqSLegInsMktResponseT->extension = getFutExtInqSLegInsMktResponseT(testCaseNum, "futInqSLegInsMktResponseT");
	return vfutInqSLegInsMktResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqSLegInsMktRequestT* getOptInqSLegInsMktRequestT(char* testCaseNum) {
	voptInqSLegInsMktRequestT = (optInqSLegInsMktRequestT*)malloc(sizeof(optInqSLegInsMktRequestT));
	int i;

	voptInqSLegInsMktRequestT->header = getDataHeaderT(testCaseNum, "optInqSLegInsMktRequestT");
	voptInqSLegInsMktRequestT->basic = getOptBscInqSLegInsMktRequestT(testCaseNum, "optInqSLegInsMktRequestT");
	return voptInqSLegInsMktRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqSLegInsMktResponseT* getOptInqSLegInsMktResponseT(char* testCaseNum) {
	voptInqSLegInsMktResponseT = (optInqSLegInsMktResponseT*)malloc(sizeof(optInqSLegInsMktResponseT));
	int i;

	voptInqSLegInsMktResponseT->header = getDataHeaderT(testCaseNum, "optInqSLegInsMktResponseT");
	voptInqSLegInsMktResponseT->basic = getOptBscInqSLegInsMktResponseT(testCaseNum, "optInqSLegInsMktResponseT");
	voptInqSLegInsMktResponseT->extension = getOptExtInqSLegInsMktResponseT(testCaseNum, "optInqSLegInsMktResponseT");
	return voptInqSLegInsMktResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqSLegInsMktRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqSLegInsMktRequestT));
	futInqSLegInsMktRequestT *vfutInqSLegInsMktRequestT = getFutInqSLegInsMktRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqSLegInsMktRequestT), (jbyte*) vfutInqSLegInsMktRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqSLegInsMktResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqSLegInsMktResponseT));
	futInqSLegInsMktResponseT *vfutInqSLegInsMktResponseT = getFutInqSLegInsMktResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqSLegInsMktResponseT), (jbyte*) vfutInqSLegInsMktResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqSLegInsMktRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqSLegInsMktRequestT));
	optInqSLegInsMktRequestT *voptInqSLegInsMktRequestT = getOptInqSLegInsMktRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqSLegInsMktRequestT), (jbyte*) voptInqSLegInsMktRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqSLegInsMktResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqSLegInsMktResponseT));
	optInqSLegInsMktResponseT *voptInqSLegInsMktResponseT = getOptInqSLegInsMktResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqSLegInsMktResponseT), (jbyte*) voptInqSLegInsMktResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqSLegInsMktRequestT(futBscInqSLegInsMktRequestT actual, futBscInqSLegInsMktRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_S_LEG_INS_MKT_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSLegInsMktRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSLegInsMktRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqSLegInsMktRecT(futBscInqSLegInsMktRecT actual, futBscInqSLegInsMktRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareBstOrdrGrpT (actual.bstOrdrGrp,expected.bstOrdrGrp, logMsg);
	compareBstQuoOrdrGrpT (actual.bstQuoOrdrGrp,expected.bstQuoOrdrGrp, logMsg);
	if ( memcmp(actual.totTrdQty, expected.totTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSLegInsMktRecT, totTrdQty not matching. Actual %s but Expected %s", actual.totTrdQty, expected.totTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstClsPrc, expected.lstClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSLegInsMktRecT, lstClsPrc not matching. Actual %s but Expected %s", actual.lstClsPrc, expected.lstClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstSetlPrc, expected.lstSetlPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSLegInsMktRecT, lstSetlPrc not matching. Actual %s but Expected %s", actual.lstSetlPrc, expected.lstSetlPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDispDcml, expected.setlDispDcml, SETL_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSLegInsMktRecT, setlDispDcml not matching. Actual %s but Expected %s", actual.setlDispDcml, expected.setlDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrStsValCod!= expected.cntrStsValCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSLegInsMktRecT, cntrStsValCodnot matching. Actual %d but Expected %d", actual.cntrStsValCod, expected.cntrStsValCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prcsStsValCod, expected.prcsStsValCod, PRCS_STS_VAL_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSLegInsMktRecT, prcsStsValCod not matching. Actual %s but Expected %s", actual.prcsStsValCod, expected.prcsStsValCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqSLegInsMktResponseT(futBscInqSLegInsMktResponseT actual, futBscInqSLegInsMktResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSLegInsMktResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqSLegInsMktResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_S_LEG_INS_MKT_REC_MAX;i++) {
		compareFutBscInqSLegInsMktRecT (actual.futBscInqSLegInsMktRec[i],expected.futBscInqSLegInsMktRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqSLegInsMktRecT(futExtInqSLegInsMktRecT actual, futExtInqSLegInsMktRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.prcTypInd!= expected.prcTypInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSLegInsMktRecT, prcTypIndnot matching. Actual %d but Expected %d", actual.prcTypInd, expected.prcTypInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyHghPrc, expected.dlyHghPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSLegInsMktRecT, dlyHghPrc not matching. Actual %s but Expected %s", actual.dlyHghPrc, expected.dlyHghPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyLowPrc, expected.dlyLowPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSLegInsMktRecT, dlyLowPrc not matching. Actual %s but Expected %s", actual.dlyLowPrc, expected.dlyLowPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSLegInsMktRecT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdQty, expected.lstTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSLegInsMktRecT, lstTrdQty not matching. Actual %s but Expected %s", actual.lstTrdQty, expected.lstTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstAuctPrc, expected.lstAuctPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSLegInsMktRecT, lstAuctPrc not matching. Actual %s but Expected %s", actual.lstAuctPrc, expected.lstAuctPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdTim, expected.trdTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqSLegInsMktRecT, trdTim not matching. Actual %s but Expected %s", actual.trdTim, expected.trdTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqSLegInsMktResponseT(futExtInqSLegInsMktResponseT actual, futExtInqSLegInsMktResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_S_LEG_INS_MKT_REC_MAX;i++) {
		compareFutExtInqSLegInsMktRecT (actual.futExtInqSLegInsMktRec[i],expected.futExtInqSLegInsMktRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqSLegInsMktRequestT(optBscInqSLegInsMktRequestT actual, optBscInqSLegInsMktRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_BSC_INQ_S_LEG_INS_MKT_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegInsMktRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegInsMktRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqSLegInsMktRecT(optBscInqSLegInsMktRecT actual, optBscInqSLegInsMktRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareBstOrdrGrpT (actual.bstOrdrGrp,expected.bstOrdrGrp, logMsg);
	compareBstQuoOrdrGrpT (actual.bstQuoOrdrGrp,expected.bstQuoOrdrGrp, logMsg);
	if ( memcmp(actual.totTrdQty, expected.totTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegInsMktRecT, totTrdQty not matching. Actual %s but Expected %s", actual.totTrdQty, expected.totTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstClsPrc, expected.lstClsPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegInsMktRecT, lstClsPrc not matching. Actual %s but Expected %s", actual.lstClsPrc, expected.lstClsPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstSetlPrc, expected.lstSetlPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegInsMktRecT, lstSetlPrc not matching. Actual %s but Expected %s", actual.lstSetlPrc, expected.lstSetlPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.setlDispDcml, expected.setlDispDcml, SETL_DISP_DCML_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegInsMktRecT, setlDispDcml not matching. Actual %s but Expected %s", actual.setlDispDcml, expected.setlDispDcml);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrStsValCod!= expected.cntrStsValCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegInsMktRecT, cntrStsValCodnot matching. Actual %d but Expected %d", actual.cntrStsValCod, expected.cntrStsValCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prcsStsValCod, expected.prcsStsValCod, PRCS_STS_VAL_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegInsMktRecT, prcsStsValCod not matching. Actual %s but Expected %s", actual.prcsStsValCod, expected.prcsStsValCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqSLegInsMktResponseT(optBscInqSLegInsMktResponseT actual, optBscInqSLegInsMktResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegInsMktResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqSLegInsMktResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_S_LEG_INS_MKT_REC_MAX;i++) {
		compareOptBscInqSLegInsMktRecT (actual.optBscInqSLegInsMktRec[i],expected.optBscInqSLegInsMktRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqSLegInsMktRecT(optExtInqSLegInsMktRecT actual, optExtInqSLegInsMktRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.prcTypInd!= expected.prcTypInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSLegInsMktRecT, prcTypIndnot matching. Actual %d but Expected %d", actual.prcTypInd, expected.prcTypInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyHghPrc, expected.dlyHghPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSLegInsMktRecT, dlyHghPrc not matching. Actual %s but Expected %s", actual.dlyHghPrc, expected.dlyHghPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dlyLowPrc, expected.dlyLowPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSLegInsMktRecT, dlyLowPrc not matching. Actual %s but Expected %s", actual.dlyLowPrc, expected.dlyLowPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSLegInsMktRecT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdQty, expected.lstTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSLegInsMktRecT, lstTrdQty not matching. Actual %s but Expected %s", actual.lstTrdQty, expected.lstTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstAuctPrc, expected.lstAuctPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSLegInsMktRecT, lstAuctPrc not matching. Actual %s but Expected %s", actual.lstAuctPrc, expected.lstAuctPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdTim, expected.trdTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqSLegInsMktRecT, trdTim not matching. Actual %s but Expected %s", actual.trdTim, expected.trdTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqSLegInsMktResponseT(optExtInqSLegInsMktResponseT actual, optExtInqSLegInsMktResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_S_LEG_INS_MKT_REC_MAX;i++) {
		compareOptExtInqSLegInsMktRecT (actual.optExtInqSLegInsMktRec[i],expected.optExtInqSLegInsMktRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqSLegInsMktRequestT(futInqSLegInsMktRequestT actual, futInqSLegInsMktRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqSLegInsMktRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqSLegInsMktResponseT(futInqSLegInsMktResponseT actual, futInqSLegInsMktResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqSLegInsMktResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqSLegInsMktResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqSLegInsMktRequestT(optInqSLegInsMktRequestT actual, optInqSLegInsMktRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqSLegInsMktRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqSLegInsMktResponseT(optInqSLegInsMktResponseT actual, optInqSLegInsMktResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqSLegInsMktResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqSLegInsMktResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqSLegInsMktRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqSLegInsMktRequestT *actualData = (futInqSLegInsMktRequestT *)msgStruct;
	futInqSLegInsMktRequestT* expectedData = getFutInqSLegInsMktRequestT(testCaseNum);
	compareFutInqSLegInsMktRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqSLegInsMktResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqSLegInsMktResponseT *actualData = (futInqSLegInsMktResponseT *)msgStruct;
	futInqSLegInsMktResponseT* expectedData = getFutInqSLegInsMktResponseT(testCaseNum);
	compareFutInqSLegInsMktResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqSLegInsMktRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqSLegInsMktRequestT *actualData = (optInqSLegInsMktRequestT *)msgStruct;
	optInqSLegInsMktRequestT* expectedData = getOptInqSLegInsMktRequestT(testCaseNum);
	compareOptInqSLegInsMktRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqSLegInsMktResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqSLegInsMktResponseT *actualData = (optInqSLegInsMktResponseT *)msgStruct;
	optInqSLegInsMktResponseT* expectedData = getOptInqSLegInsMktResponseT(testCaseNum);
	compareOptInqSLegInsMktResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
