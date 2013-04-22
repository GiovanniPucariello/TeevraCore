#include <InqAllSLegTrd.hxx>
#define BUFFER_SIZE 1000

futInqAllSLegTrdRequestT *vfutInqAllSLegTrdRequestT;
futInqAllSLegTrdResponseT *vfutInqAllSLegTrdResponseT;
optInqAllSLegTrdRequestT *voptInqAllSLegTrdRequestT;
optInqAllSLegTrdResponseT *voptInqAllSLegTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqAllSLegTrdRequestT getFutBscInqAllSLegTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqAllSLegTrdRequestT vfutBscInqAllSLegTrdRequestT;
	int i;

	vfutBscInqAllSLegTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqAllSLegTrdRequestT");
	char ltrdOrigTyp[1] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRequestT.trdOrigTyp", ltrdOrigTyp);
	vfutBscInqAllSLegTrdRequestT.trdOrigTyp = ltrdOrigTyp[0];

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRequestT.trdTyp", ltrdTyp);
	vfutBscInqAllSLegTrdRequestT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqAllSLegTrdRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRequestT.trnDat", ltrnDat);
	memcpy(vfutBscInqAllSLegTrdRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqAllSLegTrdRequestT.timMin[i]= ' ';
	}
	char ltimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRequestT.timMin", ltimMin);
	memcpy(vfutBscInqAllSLegTrdRequestT.timMin, ltimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqAllSLegTrdRequestT.timMax[i]= ' ';
	}
	char ltimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRequestT.timMax", ltimMax);
	memcpy(vfutBscInqAllSLegTrdRequestT.timMax, ltimMax, DRIV_TIME_LEN);

	for(i=0;i<TRD_EVNT_TRN_ID_MIN_LEN;i++) {
		vfutBscInqAllSLegTrdRequestT.trdEvntSeqNoMin[i]= ' ';
	}
	char ltrdEvntSeqNoMin[TRD_EVNT_TRN_ID_MIN_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRequestT.trdEvntSeqNoMin", ltrdEvntSeqNoMin);
	memcpy(vfutBscInqAllSLegTrdRequestT.trdEvntSeqNoMin, ltrdEvntSeqNoMin, TRD_EVNT_TRN_ID_MIN_LEN);

	for(i=0;i<TRD_EVNT_TRN_ID_MAX_LEN;i++) {
		vfutBscInqAllSLegTrdRequestT.trdEvntSeqNoMax[i]= ' ';
	}
	char ltrdEvntSeqNoMax[TRD_EVNT_TRN_ID_MAX_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRequestT.trdEvntSeqNoMax", ltrdEvntSeqNoMax);
	memcpy(vfutBscInqAllSLegTrdRequestT.trdEvntSeqNoMax, ltrdEvntSeqNoMax, TRD_EVNT_TRN_ID_MAX_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqAllSLegTrdRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqAllSLegTrdRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqAllSLegTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqAllSLegTrdRecT getFutBscInqAllSLegTrdRecT(char* testCaseNum , const char *root) {
	futBscInqAllSLegTrdRecT vfutBscInqAllSLegTrdRecT;
	int i;

	vfutBscInqAllSLegTrdRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqAllSLegTrdRecT");
	for(i=0;i<TRD_EVNT_TRN_ID_LEN;i++) {
		vfutBscInqAllSLegTrdRecT.trdEvntSeqNo[i]= ' ';
	}
	char ltrdEvntSeqNo[TRD_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.trdEvntSeqNo", ltrdEvntSeqNo);
	memcpy(vfutBscInqAllSLegTrdRecT.trdEvntSeqNo, ltrdEvntSeqNo, TRD_EVNT_TRN_ID_LEN);

	char ltrdPrcTyp[1] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.trdPrcTyp", ltrdPrcTyp);
	vfutBscInqAllSLegTrdRecT.trdPrcTyp = ltrdPrcTyp[0];

	char lrevsInd[1] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.revsInd", lrevsInd);
	vfutBscInqAllSLegTrdRecT.revsInd = lrevsInd[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqAllSLegTrdRecT.trdQty[i]= ' ';
	}
	char ltrdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.trdQty", ltrdQty);
	memcpy(vfutBscInqAllSLegTrdRecT.trdQty, ltrdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqAllSLegTrdRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscInqAllSLegTrdRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqAllSLegTrdRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.trnDat", ltrnDat);
	memcpy(vfutBscInqAllSLegTrdRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqAllSLegTrdRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.trnTim", ltrnTim);
	memcpy(vfutBscInqAllSLegTrdRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	for(i=0;i<NO_OF_BUY_LEN;i++) {
		vfutBscInqAllSLegTrdRecT.noOfBuy[i]= ' ';
	}
	char lnoOfBuy[NO_OF_BUY_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.noOfBuy", lnoOfBuy);
	memcpy(vfutBscInqAllSLegTrdRecT.noOfBuy, lnoOfBuy, NO_OF_BUY_LEN);

	for(i=0;i<NO_OF_SEL_LEN;i++) {
		vfutBscInqAllSLegTrdRecT.noOfSel[i]= ' ';
	}
	char lnoOfSel[NO_OF_SEL_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.noOfSel", lnoOfSel);
	memcpy(vfutBscInqAllSLegTrdRecT.noOfSel, lnoOfSel, NO_OF_SEL_LEN);

	char lagrsrSidCod[1] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.agrsrSidCod", lagrsrSidCod);
	vfutBscInqAllSLegTrdRecT.agrsrSidCod = lagrsrSidCod[0];

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vfutBscInqAllSLegTrdRecT.totTrdQty[i]= ' ';
	}
	char ltotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.totTrdQty", ltotTrdQty);
	memcpy(vfutBscInqAllSLegTrdRecT.totTrdQty, ltotTrdQty, DRIV_QUANTITY_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.trdTyp", ltrdTyp);
	vfutBscInqAllSLegTrdRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqAllSLegTrdRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdRecT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqAllSLegTrdRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return vfutBscInqAllSLegTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqAllSLegTrdResponseT getFutBscInqAllSLegTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqAllSLegTrdResponseT vfutBscInqAllSLegTrdResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqAllSLegTrdResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqAllSLegTrdResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqAllSLegTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqAllSLegTrd.futBscInqAllSLegTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqAllSLegTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqAllSLegTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAllSLegTrdRequestT getOptBscInqAllSLegTrdRequestT(char* testCaseNum , const char *root) {
	optBscInqAllSLegTrdRequestT voptBscInqAllSLegTrdRequestT;
	int i;

	voptBscInqAllSLegTrdRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqAllSLegTrdRequestT");
	char ltrdOrigTyp[1] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRequestT.trdOrigTyp", ltrdOrigTyp);
	voptBscInqAllSLegTrdRequestT.trdOrigTyp = ltrdOrigTyp[0];

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRequestT.trdTyp", ltrdTyp);
	voptBscInqAllSLegTrdRequestT.trdTyp = ltrdTyp[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqAllSLegTrdRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRequestT.trnDat", ltrnDat);
	memcpy(voptBscInqAllSLegTrdRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqAllSLegTrdRequestT.timMin[i]= ' ';
	}
	char ltimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRequestT.timMin", ltimMin);
	memcpy(voptBscInqAllSLegTrdRequestT.timMin, ltimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqAllSLegTrdRequestT.timMax[i]= ' ';
	}
	char ltimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRequestT.timMax", ltimMax);
	memcpy(voptBscInqAllSLegTrdRequestT.timMax, ltimMax, DRIV_TIME_LEN);

	for(i=0;i<TRD_EVNT_TRN_ID_MIN_LEN;i++) {
		voptBscInqAllSLegTrdRequestT.trdEvntSeqNoMin[i]= ' ';
	}
	char ltrdEvntSeqNoMin[TRD_EVNT_TRN_ID_MIN_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRequestT.trdEvntSeqNoMin", ltrdEvntSeqNoMin);
	memcpy(voptBscInqAllSLegTrdRequestT.trdEvntSeqNoMin, ltrdEvntSeqNoMin, TRD_EVNT_TRN_ID_MIN_LEN);

	for(i=0;i<TRD_EVNT_TRN_ID_MAX_LEN;i++) {
		voptBscInqAllSLegTrdRequestT.trdEvntSeqNoMax[i]= ' ';
	}
	char ltrdEvntSeqNoMax[TRD_EVNT_TRN_ID_MAX_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRequestT.trdEvntSeqNoMax", ltrdEvntSeqNoMax);
	memcpy(voptBscInqAllSLegTrdRequestT.trdEvntSeqNoMax, ltrdEvntSeqNoMax, TRD_EVNT_TRN_ID_MAX_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqAllSLegTrdRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqAllSLegTrdRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqAllSLegTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAllSLegTrdRecT getOptBscInqAllSLegTrdRecT(char* testCaseNum , const char *root) {
	optBscInqAllSLegTrdRecT voptBscInqAllSLegTrdRecT;
	int i;

	voptBscInqAllSLegTrdRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqAllSLegTrdRecT");
	for(i=0;i<TRD_EVNT_TRN_ID_LEN;i++) {
		voptBscInqAllSLegTrdRecT.trdEvntSeqNo[i]= ' ';
	}
	char ltrdEvntSeqNo[TRD_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.trdEvntSeqNo", ltrdEvntSeqNo);
	memcpy(voptBscInqAllSLegTrdRecT.trdEvntSeqNo, ltrdEvntSeqNo, TRD_EVNT_TRN_ID_LEN);

	char ltrdPrcTyp[1] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.trdPrcTyp", ltrdPrcTyp);
	voptBscInqAllSLegTrdRecT.trdPrcTyp = ltrdPrcTyp[0];

	char lrevsInd[1] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.revsInd", lrevsInd);
	voptBscInqAllSLegTrdRecT.revsInd = lrevsInd[0];

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqAllSLegTrdRecT.trdQty[i]= ' ';
	}
	char ltrdQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.trdQty", ltrdQty);
	memcpy(voptBscInqAllSLegTrdRecT.trdQty, ltrdQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqAllSLegTrdRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscInqAllSLegTrdRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqAllSLegTrdRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.trnDat", ltrnDat);
	memcpy(voptBscInqAllSLegTrdRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqAllSLegTrdRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.trnTim", ltrnTim);
	memcpy(voptBscInqAllSLegTrdRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	for(i=0;i<NO_OF_BUY_LEN;i++) {
		voptBscInqAllSLegTrdRecT.noOfBuy[i]= ' ';
	}
	char lnoOfBuy[NO_OF_BUY_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.noOfBuy", lnoOfBuy);
	memcpy(voptBscInqAllSLegTrdRecT.noOfBuy, lnoOfBuy, NO_OF_BUY_LEN);

	for(i=0;i<NO_OF_SEL_LEN;i++) {
		voptBscInqAllSLegTrdRecT.noOfSel[i]= ' ';
	}
	char lnoOfSel[NO_OF_SEL_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.noOfSel", lnoOfSel);
	memcpy(voptBscInqAllSLegTrdRecT.noOfSel, lnoOfSel, NO_OF_SEL_LEN);

	char lagrsrSidCod[1] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.agrsrSidCod", lagrsrSidCod);
	voptBscInqAllSLegTrdRecT.agrsrSidCod = lagrsrSidCod[0];

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		voptBscInqAllSLegTrdRecT.totTrdQty[i]= ' ';
	}
	char ltotTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.totTrdQty", ltotTrdQty);
	memcpy(voptBscInqAllSLegTrdRecT.totTrdQty, ltotTrdQty, DRIV_QUANTITY_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.trdTyp", ltrdTyp);
	voptBscInqAllSLegTrdRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscInqAllSLegTrdRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdRecT.trnIdNo", ltrnIdNo);
	memcpy(voptBscInqAllSLegTrdRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);
	return voptBscInqAllSLegTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAllSLegTrdResponseT getOptBscInqAllSLegTrdResponseT(char* testCaseNum , const char *root) {
	optBscInqAllSLegTrdResponseT voptBscInqAllSLegTrdResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqAllSLegTrdResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqAllSLegTrdResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqAllSLegTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqAllSLegTrd.optBscInqAllSLegTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqAllSLegTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqAllSLegTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqAllSLegTrdRequestT* getFutInqAllSLegTrdRequestT(char* testCaseNum) {
	vfutInqAllSLegTrdRequestT = (futInqAllSLegTrdRequestT*)malloc(sizeof(futInqAllSLegTrdRequestT));
	int i;

	vfutInqAllSLegTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqAllSLegTrdRequestT");
	vfutInqAllSLegTrdRequestT->basic = getFutBscInqAllSLegTrdRequestT(testCaseNum, "futInqAllSLegTrdRequestT");
	return vfutInqAllSLegTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqAllSLegTrdResponseT* getFutInqAllSLegTrdResponseT(char* testCaseNum) {
	vfutInqAllSLegTrdResponseT = (futInqAllSLegTrdResponseT*)malloc(sizeof(futInqAllSLegTrdResponseT));
	int i;

	vfutInqAllSLegTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqAllSLegTrdResponseT");
	vfutInqAllSLegTrdResponseT->basic = getFutBscInqAllSLegTrdResponseT(testCaseNum, "futInqAllSLegTrdResponseT");
	return vfutInqAllSLegTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqAllSLegTrdRequestT* getOptInqAllSLegTrdRequestT(char* testCaseNum) {
	voptInqAllSLegTrdRequestT = (optInqAllSLegTrdRequestT*)malloc(sizeof(optInqAllSLegTrdRequestT));
	int i;

	voptInqAllSLegTrdRequestT->header = getDataHeaderT(testCaseNum, "optInqAllSLegTrdRequestT");
	voptInqAllSLegTrdRequestT->basic = getOptBscInqAllSLegTrdRequestT(testCaseNum, "optInqAllSLegTrdRequestT");
	return voptInqAllSLegTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqAllSLegTrdResponseT* getOptInqAllSLegTrdResponseT(char* testCaseNum) {
	voptInqAllSLegTrdResponseT = (optInqAllSLegTrdResponseT*)malloc(sizeof(optInqAllSLegTrdResponseT));
	int i;

	voptInqAllSLegTrdResponseT->header = getDataHeaderT(testCaseNum, "optInqAllSLegTrdResponseT");
	voptInqAllSLegTrdResponseT->basic = getOptBscInqAllSLegTrdResponseT(testCaseNum, "optInqAllSLegTrdResponseT");
	return voptInqAllSLegTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqAllSLegTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqAllSLegTrdRequestT));
	futInqAllSLegTrdRequestT *vfutInqAllSLegTrdRequestT = getFutInqAllSLegTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqAllSLegTrdRequestT), (jbyte*) vfutInqAllSLegTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqAllSLegTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqAllSLegTrdResponseT));
	futInqAllSLegTrdResponseT *vfutInqAllSLegTrdResponseT = getFutInqAllSLegTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqAllSLegTrdResponseT), (jbyte*) vfutInqAllSLegTrdResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqAllSLegTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqAllSLegTrdRequestT));
	optInqAllSLegTrdRequestT *voptInqAllSLegTrdRequestT = getOptInqAllSLegTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqAllSLegTrdRequestT), (jbyte*) voptInqAllSLegTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqAllSLegTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqAllSLegTrdResponseT));
	optInqAllSLegTrdResponseT *voptInqAllSLegTrdResponseT = getOptInqAllSLegTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqAllSLegTrdResponseT), (jbyte*) voptInqAllSLegTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqAllSLegTrdRequestT(futBscInqAllSLegTrdRequestT actual, futBscInqAllSLegTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if (actual.trdOrigTyp!= expected.trdOrigTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRequestT, trdOrigTypnot matching. Actual %d but Expected %d", actual.trdOrigTyp, expected.trdOrigTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMin, expected.timMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRequestT, timMin not matching. Actual %s but Expected %s", actual.timMin, expected.timMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMax, expected.timMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRequestT, timMax not matching. Actual %s but Expected %s", actual.timMax, expected.timMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdEvntSeqNoMin, expected.trdEvntSeqNoMin, TRD_EVNT_TRN_ID_MIN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRequestT, trdEvntSeqNoMin not matching. Actual %s but Expected %s", actual.trdEvntSeqNoMin, expected.trdEvntSeqNoMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdEvntSeqNoMax, expected.trdEvntSeqNoMax, TRD_EVNT_TRN_ID_MAX_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRequestT, trdEvntSeqNoMax not matching. Actual %s but Expected %s", actual.trdEvntSeqNoMax, expected.trdEvntSeqNoMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqAllSLegTrdRecT(futBscInqAllSLegTrdRecT actual, futBscInqAllSLegTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trdEvntSeqNo, expected.trdEvntSeqNo, TRD_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, trdEvntSeqNo not matching. Actual %s but Expected %s", actual.trdEvntSeqNo, expected.trdEvntSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdPrcTyp!= expected.trdPrcTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, trdPrcTypnot matching. Actual %d but Expected %d", actual.trdPrcTyp, expected.trdPrcTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.revsInd!= expected.revsInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, revsIndnot matching. Actual %d but Expected %d", actual.revsInd, expected.revsInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdQty, expected.trdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, trdQty not matching. Actual %s but Expected %s", actual.trdQty, expected.trdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.noOfBuy, expected.noOfBuy, NO_OF_BUY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, noOfBuy not matching. Actual %s but Expected %s", actual.noOfBuy, expected.noOfBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.noOfSel, expected.noOfSel, NO_OF_SEL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, noOfSel not matching. Actual %s but Expected %s", actual.noOfSel, expected.noOfSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.agrsrSidCod!= expected.agrsrSidCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, agrsrSidCodnot matching. Actual %d but Expected %d", actual.agrsrSidCod, expected.agrsrSidCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totTrdQty, expected.totTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, totTrdQty not matching. Actual %s but Expected %s", actual.totTrdQty, expected.totTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqAllSLegTrdResponseT(futBscInqAllSLegTrdResponseT actual, futBscInqAllSLegTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllSLegTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_ALL_SLEG_TRD_REC_MAX;i++) {
		compareFutBscInqAllSLegTrdRecT (actual.futBscInqAllSLegTrdRec[i],expected.futBscInqAllSLegTrdRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAllSLegTrdRequestT(optBscInqAllSLegTrdRequestT actual, optBscInqAllSLegTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if (actual.trdOrigTyp!= expected.trdOrigTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRequestT, trdOrigTypnot matching. Actual %d but Expected %d", actual.trdOrigTyp, expected.trdOrigTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMin, expected.timMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRequestT, timMin not matching. Actual %s but Expected %s", actual.timMin, expected.timMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMax, expected.timMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRequestT, timMax not matching. Actual %s but Expected %s", actual.timMax, expected.timMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdEvntSeqNoMin, expected.trdEvntSeqNoMin, TRD_EVNT_TRN_ID_MIN_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRequestT, trdEvntSeqNoMin not matching. Actual %s but Expected %s", actual.trdEvntSeqNoMin, expected.trdEvntSeqNoMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdEvntSeqNoMax, expected.trdEvntSeqNoMax, TRD_EVNT_TRN_ID_MAX_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRequestT, trdEvntSeqNoMax not matching. Actual %s but Expected %s", actual.trdEvntSeqNoMax, expected.trdEvntSeqNoMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAllSLegTrdRecT(optBscInqAllSLegTrdRecT actual, optBscInqAllSLegTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trdEvntSeqNo, expected.trdEvntSeqNo, TRD_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, trdEvntSeqNo not matching. Actual %s but Expected %s", actual.trdEvntSeqNo, expected.trdEvntSeqNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdPrcTyp!= expected.trdPrcTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, trdPrcTypnot matching. Actual %d but Expected %d", actual.trdPrcTyp, expected.trdPrcTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.revsInd!= expected.revsInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, revsIndnot matching. Actual %d but Expected %d", actual.revsInd, expected.revsInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdQty, expected.trdQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, trdQty not matching. Actual %s but Expected %s", actual.trdQty, expected.trdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.noOfBuy, expected.noOfBuy, NO_OF_BUY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, noOfBuy not matching. Actual %s but Expected %s", actual.noOfBuy, expected.noOfBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.noOfSel, expected.noOfSel, NO_OF_SEL_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, noOfSel not matching. Actual %s but Expected %s", actual.noOfSel, expected.noOfSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.agrsrSidCod!= expected.agrsrSidCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, agrsrSidCodnot matching. Actual %d but Expected %d", actual.agrsrSidCod, expected.agrsrSidCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.totTrdQty, expected.totTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, totTrdQty not matching. Actual %s but Expected %s", actual.totTrdQty, expected.totTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAllSLegTrdResponseT(optBscInqAllSLegTrdResponseT actual, optBscInqAllSLegTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllSLegTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_ALL_SLEG_TRD_REC_MAX;i++) {
		compareOptBscInqAllSLegTrdRecT (actual.optBscInqAllSLegTrdRec[i],expected.optBscInqAllSLegTrdRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqAllSLegTrdRequestT(futInqAllSLegTrdRequestT actual, futInqAllSLegTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqAllSLegTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqAllSLegTrdResponseT(futInqAllSLegTrdResponseT actual, futInqAllSLegTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqAllSLegTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqAllSLegTrdRequestT(optInqAllSLegTrdRequestT actual, optInqAllSLegTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqAllSLegTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqAllSLegTrdResponseT(optInqAllSLegTrdResponseT actual, optInqAllSLegTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqAllSLegTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqAllSLegTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqAllSLegTrdRequestT *actualData = (futInqAllSLegTrdRequestT *)msgStruct;
	futInqAllSLegTrdRequestT* expectedData = getFutInqAllSLegTrdRequestT(testCaseNum);
	compareFutInqAllSLegTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqAllSLegTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqAllSLegTrdResponseT *actualData = (futInqAllSLegTrdResponseT *)msgStruct;
	futInqAllSLegTrdResponseT* expectedData = getFutInqAllSLegTrdResponseT(testCaseNum);
	compareFutInqAllSLegTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqAllSLegTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqAllSLegTrdRequestT *actualData = (optInqAllSLegTrdRequestT *)msgStruct;
	optInqAllSLegTrdRequestT* expectedData = getOptInqAllSLegTrdRequestT(testCaseNum);
	compareOptInqAllSLegTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqAllSLegTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqAllSLegTrdResponseT *actualData = (optInqAllSLegTrdResponseT *)msgStruct;
	optInqAllSLegTrdResponseT* expectedData = getOptInqAllSLegTrdResponseT(testCaseNum);
	compareOptInqAllSLegTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
