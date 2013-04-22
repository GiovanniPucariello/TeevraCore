#include <InqAllTrd.hxx>
#define BUFFER_SIZE 1000

futInqAllTrdRequestT *vfutInqAllTrdRequestT;
futInqAllTrdResponseT *vfutInqAllTrdResponseT;
optInqAllTrdRequestT *voptInqAllTrdRequestT;
optInqAllTrdResponseT *voptInqAllTrdResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqAllTrdRequestT getFutBscInqAllTrdRequestT(char* testCaseNum , const char *root) {
	futBscInqAllTrdRequestT vfutBscInqAllTrdRequestT;
	int i;

	vfutBscInqAllTrdRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqAllTrdRequestT");
	vfutBscInqAllTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqAllTrdRequestT");
	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqAllTrdRequestT.timMin[i]= ' ';
	}
	char ltimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRequestT.timMin", ltimMin);
	memcpy(vfutBscInqAllTrdRequestT.timMin, ltimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqAllTrdRequestT.timMax[i]= ' ';
	}
	char ltimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRequestT.timMax", ltimMax);
	memcpy(vfutBscInqAllTrdRequestT.timMax, ltimMax, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqAllTrdRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRequestT.trnDat", ltrnDat);
	memcpy(vfutBscInqAllTrdRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRequestT.trdTyp", ltrdTyp);
	vfutBscInqAllTrdRequestT.trdTyp = ltrdTyp[0];

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqAllTrdRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqAllTrdRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqAllTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqAllTrdRecT getFutBscInqAllTrdRecT(char* testCaseNum , const char *root) {
	futBscInqAllTrdRecT vfutBscInqAllTrdRecT;
	int i;

	vfutBscInqAllTrdRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqAllTrdRecT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscInqAllTrdRecT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRecT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscInqAllTrdRecT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	for(i=0;i<STRAT_TYP_LEN;i++) {
		vfutBscInqAllTrdRecT.stratTyp[i]= ' ';
	}
	char lstratTyp[STRAT_TYP_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRecT.stratTyp", lstratTyp);
	memcpy(vfutBscInqAllTrdRecT.stratTyp, lstratTyp, STRAT_TYP_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		vfutBscInqAllTrdRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRecT.trnIdNo", ltrnIdNo);
	memcpy(vfutBscInqAllTrdRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqAllTrdRecT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRecT.trdXQty", ltrdXQty);
	memcpy(vfutBscInqAllTrdRecT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqAllTrdRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vfutBscInqAllTrdRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqAllTrdRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRecT.trnDat", ltrnDat);
	memcpy(vfutBscInqAllTrdRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqAllTrdRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRecT.trnTim", ltrnTim);
	memcpy(vfutBscInqAllTrdRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRecT.trdTyp", ltrdTyp);
	vfutBscInqAllTrdRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		vfutBscInqAllTrdRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRecT.currTypCod", lcurrTypCod);
	memcpy(vfutBscInqAllTrdRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqAllTrdRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqAllTrdRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqAllTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqAllTrdResponseT getFutBscInqAllTrdResponseT(char* testCaseNum , const char *root) {
	futBscInqAllTrdResponseT vfutBscInqAllTrdResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqAllTrdResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqAllTrdResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqAllTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqAllTrd.futBscInqAllTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqAllTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqAllTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqAllTrdRecT getFutExtInqAllTrdRecT(char* testCaseNum , const char *root) {
	futExtInqAllTrdRecT vfutExtInqAllTrdRecT;
	int i;

	for(i=0;i<UNDR_ISIN_COD_LEN;i++) {
		vfutExtInqAllTrdRecT.undrIsinCod[i]= ' ';
	}
	char lundrIsinCod[UNDR_ISIN_COD_LEN] = {""};
	getStrProperty("InqAllTrd.futExtInqAllTrdRecT.undrIsinCod", lundrIsinCod);
	memcpy(vfutExtInqAllTrdRecT.undrIsinCod, lundrIsinCod, UNDR_ISIN_COD_LEN);

	for(i=0;i<GRS_BAS_LEN;i++) {
		vfutExtInqAllTrdRecT.grsBas[i]= ' ';
	}
	char lgrsBas[GRS_BAS_LEN] = {""};
	getStrProperty("InqAllTrd.futExtInqAllTrdRecT.grsBas", lgrsBas);
	memcpy(vfutExtInqAllTrdRecT.grsBas, lgrsBas, GRS_BAS_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtInqAllTrdRecT.swapEndDat[i]= ' ';
	}
	char lswapEndDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllTrd.futExtInqAllTrdRecT.swapEndDat", lswapEndDat);
	memcpy(vfutExtInqAllTrdRecT.swapEndDat, lswapEndDat, DRIV_DATE_LEN);

	for(i=0;i<CPN_FIX_RAT_LEN;i++) {
		vfutExtInqAllTrdRecT.cpnFixRat[i]= ' ';
	}
	char lcpnFixRat[CPN_FIX_RAT_LEN] = {""};
	getStrProperty("InqAllTrd.futExtInqAllTrdRecT.cpnFixRat", lcpnFixRat);
	memcpy(vfutExtInqAllTrdRecT.cpnFixRat, lcpnFixRat, CPN_FIX_RAT_LEN);
	return vfutExtInqAllTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqAllTrdResponseT getFutExtInqAllTrdResponseT(char* testCaseNum , const char *root) {
	futExtInqAllTrdResponseT vfutExtInqAllTrdResponseT;
	int i;
	return vfutExtInqAllTrdResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAllTrdRequestT getOptBscInqAllTrdRequestT(char* testCaseNum , const char *root) {
	optBscInqAllTrdRequestT voptBscInqAllTrdRequestT;
	int i;

	voptBscInqAllTrdRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqAllTrdRequestT");
	voptBscInqAllTrdRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqAllTrdRequestT");
	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqAllTrdRequestT.timMin[i]= ' ';
	}
	char ltimMin[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRequestT.timMin", ltimMin);
	memcpy(voptBscInqAllTrdRequestT.timMin, ltimMin, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqAllTrdRequestT.timMax[i]= ' ';
	}
	char ltimMax[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRequestT.timMax", ltimMax);
	memcpy(voptBscInqAllTrdRequestT.timMax, ltimMax, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqAllTrdRequestT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRequestT.trnDat", ltrnDat);
	memcpy(voptBscInqAllTrdRequestT.trnDat, ltrnDat, DRIV_DATE_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRequestT.trdTyp", ltrdTyp);
	voptBscInqAllTrdRequestT.trdTyp = ltrdTyp[0];

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqAllTrdRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqAllTrdRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqAllTrdRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAllTrdRecT getOptBscInqAllTrdRecT(char* testCaseNum , const char *root) {
	optBscInqAllTrdRecT voptBscInqAllTrdRecT;
	int i;

	voptBscInqAllTrdRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqAllTrdRecT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		voptBscInqAllTrdRecT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRecT.dblLegTyp", ldblLegTyp);
	memcpy(voptBscInqAllTrdRecT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	for(i=0;i<STRAT_TYP_LEN;i++) {
		voptBscInqAllTrdRecT.stratTyp[i]= ' ';
	}
	char lstratTyp[STRAT_TYP_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRecT.stratTyp", lstratTyp);
	memcpy(voptBscInqAllTrdRecT.stratTyp, lstratTyp, STRAT_TYP_LEN);

	for(i=0;i<TRN_ID_NO_LEN;i++) {
		voptBscInqAllTrdRecT.trnIdNo[i]= ' ';
	}
	char ltrnIdNo[TRN_ID_NO_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRecT.trnIdNo", ltrnIdNo);
	memcpy(voptBscInqAllTrdRecT.trnIdNo, ltrnIdNo, TRN_ID_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqAllTrdRecT.trdXQty[i]= ' ';
	}
	char ltrdXQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRecT.trdXQty", ltrdXQty);
	memcpy(voptBscInqAllTrdRecT.trdXQty, ltrdXQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqAllTrdRecT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRecT.trdMtchPrc", ltrdMtchPrc);
	memcpy(voptBscInqAllTrdRecT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqAllTrdRecT.trnDat[i]= ' ';
	}
	char ltrnDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRecT.trnDat", ltrnDat);
	memcpy(voptBscInqAllTrdRecT.trnDat, ltrnDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqAllTrdRecT.trnTim[i]= ' ';
	}
	char ltrnTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRecT.trnTim", ltrnTim);
	memcpy(voptBscInqAllTrdRecT.trnTim, ltrnTim, DRIV_TIME_LEN);

	char ltrdTyp[1] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRecT.trdTyp", ltrdTyp);
	voptBscInqAllTrdRecT.trdTyp = ltrdTyp[0];

	for(i=0;i<CURR_TYP_COD_LEN;i++) {
		voptBscInqAllTrdRecT.currTypCod[i]= ' ';
	}
	char lcurrTypCod[CURR_TYP_COD_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRecT.currTypCod", lcurrTypCod);
	memcpy(voptBscInqAllTrdRecT.currTypCod, lcurrTypCod, CURR_TYP_COD_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscInqAllTrdRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscInqAllTrdRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscInqAllTrdRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqAllTrdResponseT getOptBscInqAllTrdResponseT(char* testCaseNum , const char *root) {
	optBscInqAllTrdResponseT voptBscInqAllTrdResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqAllTrdResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqAllTrdResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqAllTrdResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqAllTrd.optBscInqAllTrdResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqAllTrdResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqAllTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqAllTrdRequestT* getFutInqAllTrdRequestT(char* testCaseNum) {
	vfutInqAllTrdRequestT = (futInqAllTrdRequestT*)malloc(sizeof(futInqAllTrdRequestT));
	int i;

	vfutInqAllTrdRequestT->header = getDataHeaderT(testCaseNum, "futInqAllTrdRequestT");
	vfutInqAllTrdRequestT->basic = getFutBscInqAllTrdRequestT(testCaseNum, "futInqAllTrdRequestT");
	return vfutInqAllTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqAllTrdResponseT* getFutInqAllTrdResponseT(char* testCaseNum) {
	vfutInqAllTrdResponseT = (futInqAllTrdResponseT*)malloc(sizeof(futInqAllTrdResponseT));
	int i;

	vfutInqAllTrdResponseT->header = getDataHeaderT(testCaseNum, "futInqAllTrdResponseT");
	vfutInqAllTrdResponseT->basic = getFutBscInqAllTrdResponseT(testCaseNum, "futInqAllTrdResponseT");
	vfutInqAllTrdResponseT->extension = getFutExtInqAllTrdResponseT(testCaseNum, "futInqAllTrdResponseT");
	return vfutInqAllTrdResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqAllTrdRequestT* getOptInqAllTrdRequestT(char* testCaseNum) {
	voptInqAllTrdRequestT = (optInqAllTrdRequestT*)malloc(sizeof(optInqAllTrdRequestT));
	int i;

	voptInqAllTrdRequestT->header = getDataHeaderT(testCaseNum, "optInqAllTrdRequestT");
	voptInqAllTrdRequestT->basic = getOptBscInqAllTrdRequestT(testCaseNum, "optInqAllTrdRequestT");
	return voptInqAllTrdRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqAllTrdResponseT* getOptInqAllTrdResponseT(char* testCaseNum) {
	voptInqAllTrdResponseT = (optInqAllTrdResponseT*)malloc(sizeof(optInqAllTrdResponseT));
	int i;

	voptInqAllTrdResponseT->header = getDataHeaderT(testCaseNum, "optInqAllTrdResponseT");
	voptInqAllTrdResponseT->basic = getOptBscInqAllTrdResponseT(testCaseNum, "optInqAllTrdResponseT");
	return voptInqAllTrdResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqAllTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqAllTrdRequestT));
	futInqAllTrdRequestT *vfutInqAllTrdRequestT = getFutInqAllTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqAllTrdRequestT), (jbyte*) vfutInqAllTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqAllTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqAllTrdResponseT));
	futInqAllTrdResponseT *vfutInqAllTrdResponseT = getFutInqAllTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqAllTrdResponseT), (jbyte*) vfutInqAllTrdResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqAllTrdRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqAllTrdRequestT));
	optInqAllTrdRequestT *voptInqAllTrdRequestT = getOptInqAllTrdRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqAllTrdRequestT), (jbyte*) voptInqAllTrdRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqAllTrdResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqAllTrdResponseT));
	optInqAllTrdResponseT *voptInqAllTrdResponseT = getOptInqAllTrdResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqAllTrdResponseT), (jbyte*) voptInqAllTrdResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqAllTrdRequestT(futBscInqAllTrdRequestT actual, futBscInqAllTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.timMin, expected.timMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRequestT, timMin not matching. Actual %s but Expected %s", actual.timMin, expected.timMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMax, expected.timMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRequestT, timMax not matching. Actual %s but Expected %s", actual.timMax, expected.timMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqAllTrdRecT(futBscInqAllTrdRecT actual, futBscInqAllTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRecT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratTyp, expected.stratTyp, STRAT_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRecT, stratTyp not matching. Actual %s but Expected %s", actual.stratTyp, expected.stratTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRecT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqAllTrdResponseT(futBscInqAllTrdResponseT actual, futBscInqAllTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqAllTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_ALL_TRD_REC_MAX;i++) {
		compareFutBscInqAllTrdRecT (actual.futBscInqAllTrdRec[i],expected.futBscInqAllTrdRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqAllTrdRecT(futExtInqAllTrdRecT actual, futExtInqAllTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.undrIsinCod, expected.undrIsinCod, UNDR_ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqAllTrdRecT, undrIsinCod not matching. Actual %s but Expected %s", actual.undrIsinCod, expected.undrIsinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.grsBas, expected.grsBas, GRS_BAS_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqAllTrdRecT, grsBas not matching. Actual %s but Expected %s", actual.grsBas, expected.grsBas);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.swapEndDat, expected.swapEndDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqAllTrdRecT, swapEndDat not matching. Actual %s but Expected %s", actual.swapEndDat, expected.swapEndDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.cpnFixRat, expected.cpnFixRat, CPN_FIX_RAT_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqAllTrdRecT, cpnFixRat not matching. Actual %s but Expected %s", actual.cpnFixRat, expected.cpnFixRat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqAllTrdResponseT(futExtInqAllTrdResponseT actual, futExtInqAllTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_ALL_TRD_REC_MAX;i++) {
		compareFutExtInqAllTrdRecT (actual.futExtInqAllTrdRec[i],expected.futExtInqAllTrdRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAllTrdRequestT(optBscInqAllTrdRequestT actual, optBscInqAllTrdRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.timMin, expected.timMin, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRequestT, timMin not matching. Actual %s but Expected %s", actual.timMin, expected.timMin);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.timMax, expected.timMax, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRequestT, timMax not matching. Actual %s but Expected %s", actual.timMax, expected.timMax);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRequestT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRequestT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAllTrdRecT(optBscInqAllTrdRecT actual, optBscInqAllTrdRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRecT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratTyp, expected.stratTyp, STRAT_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRecT, stratTyp not matching. Actual %s but Expected %s", actual.stratTyp, expected.stratTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnIdNo, expected.trnIdNo, TRN_ID_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRecT, trnIdNo not matching. Actual %s but Expected %s", actual.trnIdNo, expected.trnIdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdXQty, expected.trdXQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRecT, trdXQty not matching. Actual %s but Expected %s", actual.trdXQty, expected.trdXQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRecT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnDat, expected.trnDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRecT, trnDat not matching. Actual %s but Expected %s", actual.trnDat, expected.trnDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trnTim, expected.trnTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRecT, trnTim not matching. Actual %s but Expected %s", actual.trnTim, expected.trnTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trdTyp!= expected.trdTyp) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRecT, trdTypnot matching. Actual %d but Expected %d", actual.trdTyp, expected.trdTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.currTypCod, expected.currTypCod, CURR_TYP_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRecT, currTypCod not matching. Actual %s but Expected %s", actual.currTypCod, expected.currTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqAllTrdResponseT(optBscInqAllTrdResponseT actual, optBscInqAllTrdResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqAllTrdResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_ALL_TRD_REC_MAX;i++) {
		compareOptBscInqAllTrdRecT (actual.optBscInqAllTrdRec[i],expected.optBscInqAllTrdRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqAllTrdRequestT(futInqAllTrdRequestT actual, futInqAllTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqAllTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqAllTrdResponseT(futInqAllTrdResponseT actual, futInqAllTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqAllTrdResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqAllTrdResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqAllTrdRequestT(optInqAllTrdRequestT actual, optInqAllTrdRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqAllTrdRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqAllTrdResponseT(optInqAllTrdResponseT actual, optInqAllTrdResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqAllTrdResponseT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqAllTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqAllTrdRequestT *actualData = (futInqAllTrdRequestT *)msgStruct;
	futInqAllTrdRequestT* expectedData = getFutInqAllTrdRequestT(testCaseNum);
	compareFutInqAllTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqAllTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqAllTrdResponseT *actualData = (futInqAllTrdResponseT *)msgStruct;
	futInqAllTrdResponseT* expectedData = getFutInqAllTrdResponseT(testCaseNum);
	compareFutInqAllTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqAllTrdRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqAllTrdRequestT *actualData = (optInqAllTrdRequestT *)msgStruct;
	optInqAllTrdRequestT* expectedData = getOptInqAllTrdRequestT(testCaseNum);
	compareOptInqAllTrdRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqAllTrdResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqAllTrdResponseT *actualData = (optInqAllTrdResponseT *)msgStruct;
	optInqAllTrdResponseT* expectedData = getOptInqAllTrdResponseT(testCaseNum);
	compareOptInqAllTrdResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
