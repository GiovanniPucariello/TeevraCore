#include <SubSLegQuoConf.hxx>
#define BUFFER_SIZE 1000

futSubSLegQuoConfPrivBcastT *vfutSubSLegQuoConfPrivBcastT;
futBscSubSLegQuoConfSubjectT *vfutBscSubSLegQuoConfSubjectT;
optSubSLegQuoConfPrivBcastT *voptSubSLegQuoConfPrivBcastT;
optBscSubSLegQuoConfSubjectT *voptBscSubSLegQuoConfSubjectT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSubSLegQuoConfPrivBcastT getFutBscSubSLegQuoConfPrivBcastT(char* testCaseNum , const char *root) {
	futBscSubSLegQuoConfPrivBcastT vfutBscSubSLegQuoConfPrivBcastT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.buyCod", lbuyCod);
	vfutBscSubSLegQuoConfPrivBcastT.buyCod = lbuyCod[0];

	vfutBscSubSLegQuoConfPrivBcastT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscSubSLegQuoConfPrivBcastT");
	vfutBscSubSLegQuoConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscSubSLegQuoConfPrivBcastT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.ordrNoBuy", lordrNoBuy);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.ordrNoSel", lordrNoSel);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.quoBkQtyBuy[i]= ' ';
	}
	char lquoBkQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.quoBkQtyBuy", lquoBkQtyBuy);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.quoBkQtyBuy, lquoBkQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.quoBkQtySel[i]= ' ';
	}
	char lquoBkQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.quoBkQtySel", lquoBkQtySel);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.quoBkQtySel, lquoBkQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.quoExeQtySel", lquoExeQtySel);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.quoExePrcSel", lquoExePrcSel);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.quoPrioTimBuy[i]= ' ';
	}
	char lquoPrioTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.quoPrioTimBuy", lquoPrioTimBuy);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.quoPrioTimBuy, lquoPrioTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.quoPrioTimSel[i]= ' ';
	}
	char lquoPrioTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.quoPrioTimSel", lquoPrioTimSel);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.quoPrioTimSel, lquoPrioTimSel, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.quoPrioDatBuy[i]= ' ';
	}
	char lquoPrioDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.quoPrioDatBuy", lquoPrioDatBuy);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.quoPrioDatBuy, lquoPrioDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.quoPrioDatSel[i]= ' ';
	}
	char lquoPrioDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.quoPrioDatSel", lquoPrioDatSel);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.quoPrioDatSel, lquoPrioDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.lstEvntDatBuy[i]= ' ';
	}
	char llstEvntDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.lstEvntDatBuy", llstEvntDatBuy);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.lstEvntDatBuy, llstEvntDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.lstEvntTimBuy[i]= ' ';
	}
	char llstEvntTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.lstEvntTimBuy", llstEvntTimBuy);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.lstEvntTimBuy, llstEvntTimBuy, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.lstEvntTrnIdBuy[i]= ' ';
	}
	char llstEvntTrnIdBuy[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.lstEvntTrnIdBuy", llstEvntTrnIdBuy);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.lstEvntTrnIdBuy, llstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.lstEvntDatSel[i]= ' ';
	}
	char llstEvntDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.lstEvntDatSel", llstEvntDatSel);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.lstEvntDatSel, llstEvntDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.lstEvntTimSel[i]= ' ';
	}
	char llstEvntTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.lstEvntTimSel", llstEvntTimSel);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.lstEvntTimSel, llstEvntTimSel, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscSubSLegQuoConfPrivBcastT.lstEvntTrnIdSel[i]= ' ';
	}
	char llstEvntTrnIdSel[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.lstEvntTrnIdSel", llstEvntTrnIdSel);
	memcpy(vfutBscSubSLegQuoConfPrivBcastT.lstEvntTrnIdSel, llstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN);

	char ltrnTypId[1] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfPrivBcastT.trnTypId", ltrnTypId);
	vfutBscSubSLegQuoConfPrivBcastT.trnTypId = ltrnTypId[0];
	return vfutBscSubSLegQuoConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtSubSLegQuoConfPrivBcastT getFutExtSubSLegQuoConfPrivBcastT(char* testCaseNum , const char *root) {
	futExtSubSLegQuoConfPrivBcastT vfutExtSubSLegQuoConfPrivBcastT;
	int i;

	vfutExtSubSLegQuoConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtSubSLegQuoConfPrivBcastT");	return vfutExtSubSLegQuoConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscSubSLegQuoConfPrivBcastT getOptBscSubSLegQuoConfPrivBcastT(char* testCaseNum , const char *root) {
	optBscSubSLegQuoConfPrivBcastT voptBscSubSLegQuoConfPrivBcastT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.buyCod", lbuyCod);
	voptBscSubSLegQuoConfPrivBcastT.buyCod = lbuyCod[0];

	voptBscSubSLegQuoConfPrivBcastT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscSubSLegQuoConfPrivBcastT");
	voptBscSubSLegQuoConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscSubSLegQuoConfPrivBcastT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.ordrNoBuy", lordrNoBuy);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.ordrNoSel", lordrNoSel);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.quoBkQtyBuy[i]= ' ';
	}
	char lquoBkQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.quoBkQtyBuy", lquoBkQtyBuy);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.quoBkQtyBuy, lquoBkQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.quoBkQtySel[i]= ' ';
	}
	char lquoBkQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.quoBkQtySel", lquoBkQtySel);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.quoBkQtySel, lquoBkQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.quoExeQtySel", lquoExeQtySel);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.quoExePrcSel", lquoExePrcSel);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.quoPrioTimBuy[i]= ' ';
	}
	char lquoPrioTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.quoPrioTimBuy", lquoPrioTimBuy);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.quoPrioTimBuy, lquoPrioTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.quoPrioTimSel[i]= ' ';
	}
	char lquoPrioTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.quoPrioTimSel", lquoPrioTimSel);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.quoPrioTimSel, lquoPrioTimSel, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.quoPrioDatBuy[i]= ' ';
	}
	char lquoPrioDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.quoPrioDatBuy", lquoPrioDatBuy);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.quoPrioDatBuy, lquoPrioDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.quoPrioDatSel[i]= ' ';
	}
	char lquoPrioDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.quoPrioDatSel", lquoPrioDatSel);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.quoPrioDatSel, lquoPrioDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.lstEvntDatBuy[i]= ' ';
	}
	char llstEvntDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.lstEvntDatBuy", llstEvntDatBuy);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.lstEvntDatBuy, llstEvntDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.lstEvntTimBuy[i]= ' ';
	}
	char llstEvntTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.lstEvntTimBuy", llstEvntTimBuy);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.lstEvntTimBuy, llstEvntTimBuy, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.lstEvntTrnIdBuy[i]= ' ';
	}
	char llstEvntTrnIdBuy[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.lstEvntTrnIdBuy", llstEvntTrnIdBuy);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.lstEvntTrnIdBuy, llstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.lstEvntDatSel[i]= ' ';
	}
	char llstEvntDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.lstEvntDatSel", llstEvntDatSel);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.lstEvntDatSel, llstEvntDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.lstEvntTimSel[i]= ' ';
	}
	char llstEvntTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.lstEvntTimSel", llstEvntTimSel);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.lstEvntTimSel, llstEvntTimSel, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptBscSubSLegQuoConfPrivBcastT.lstEvntTrnIdSel[i]= ' ';
	}
	char llstEvntTrnIdSel[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.lstEvntTrnIdSel", llstEvntTrnIdSel);
	memcpy(voptBscSubSLegQuoConfPrivBcastT.lstEvntTrnIdSel, llstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN);

	char ltrnTypId[1] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfPrivBcastT.trnTypId", ltrnTypId);
	voptBscSubSLegQuoConfPrivBcastT.trnTypId = ltrnTypId[0];
	return voptBscSubSLegQuoConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtSubSLegQuoConfPrivBcastT getOptExtSubSLegQuoConfPrivBcastT(char* testCaseNum , const char *root) {
	optExtSubSLegQuoConfPrivBcastT voptExtSubSLegQuoConfPrivBcastT;
	int i;

	voptExtSubSLegQuoConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtSubSLegQuoConfPrivBcastT");	return voptExtSubSLegQuoConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futSubSLegQuoConfPrivBcastT* getFutSubSLegQuoConfPrivBcastT(char* testCaseNum) {
	vfutSubSLegQuoConfPrivBcastT = (futSubSLegQuoConfPrivBcastT*)malloc(sizeof(futSubSLegQuoConfPrivBcastT));
	int i;

	vfutSubSLegQuoConfPrivBcastT->header = getDataHeaderT(testCaseNum, "futSubSLegQuoConfPrivBcastT");
	vfutSubSLegQuoConfPrivBcastT->basic = getFutBscSubSLegQuoConfPrivBcastT(testCaseNum, "futSubSLegQuoConfPrivBcastT");
	vfutSubSLegQuoConfPrivBcastT->extension = getFutExtSubSLegQuoConfPrivBcastT(testCaseNum, "futSubSLegQuoConfPrivBcastT");
	return vfutSubSLegQuoConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futBscSubSLegQuoConfSubjectT* getFutBscSubSLegQuoConfSubjectT(char* testCaseNum) {
	vfutBscSubSLegQuoConfSubjectT = (futBscSubSLegQuoConfSubjectT*)malloc(sizeof(futBscSubSLegQuoConfSubjectT));
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vfutBscSubSLegQuoConfSubjectT->membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfSubjectT.membId", lmembId);
	memcpy(vfutBscSubSLegQuoConfSubjectT->membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscSubSLegQuoConfSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfSubjectT.prodId", lprodId);
	memcpy(vfutBscSubSLegQuoConfSubjectT->prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutBscSubSLegQuoConfSubjectT->cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vfutBscSubSLegQuoConfSubjectT->cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutBscSubSLegQuoConfSubjectT->cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vfutBscSubSLegQuoConfSubjectT->cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<SUBJ_FILL_LEN;i++) {
		vfutBscSubSLegQuoConfSubjectT->subjFill[i]= ' ';
	}
	char lsubjFill[SUBJ_FILL_LEN] = {""};
	getStrProperty("SubSLegQuoConf.futBscSubSLegQuoConfSubjectT.subjFill", lsubjFill);
	memcpy(vfutBscSubSLegQuoConfSubjectT->subjFill, lsubjFill, SUBJ_FILL_LEN);

	return vfutBscSubSLegQuoConfSubjectT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optSubSLegQuoConfPrivBcastT* getOptSubSLegQuoConfPrivBcastT(char* testCaseNum) {
	voptSubSLegQuoConfPrivBcastT = (optSubSLegQuoConfPrivBcastT*)malloc(sizeof(optSubSLegQuoConfPrivBcastT));
	int i;

	voptSubSLegQuoConfPrivBcastT->header = getDataHeaderT(testCaseNum, "optSubSLegQuoConfPrivBcastT");
	voptSubSLegQuoConfPrivBcastT->basic = getOptBscSubSLegQuoConfPrivBcastT(testCaseNum, "optSubSLegQuoConfPrivBcastT");
	voptSubSLegQuoConfPrivBcastT->extension = getOptExtSubSLegQuoConfPrivBcastT(testCaseNum, "optSubSLegQuoConfPrivBcastT");
	return voptSubSLegQuoConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optBscSubSLegQuoConfSubjectT* getOptBscSubSLegQuoConfSubjectT(char* testCaseNum) {
	voptBscSubSLegQuoConfSubjectT = (optBscSubSLegQuoConfSubjectT*)malloc(sizeof(optBscSubSLegQuoConfSubjectT));
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		voptBscSubSLegQuoConfSubjectT->membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfSubjectT.membId", lmembId);
	memcpy(voptBscSubSLegQuoConfSubjectT->membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscSubSLegQuoConfSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfSubjectT.prodId", lprodId);
	memcpy(voptBscSubSLegQuoConfSubjectT->prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		voptBscSubSLegQuoConfSubjectT->cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(voptBscSubSLegQuoConfSubjectT->cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		voptBscSubSLegQuoConfSubjectT->cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(voptBscSubSLegQuoConfSubjectT->cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	char lcntrClasCod[1] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfSubjectT.cntrClasCod", lcntrClasCod);
	voptBscSubSLegQuoConfSubjectT->cntrClasCod = lcntrClasCod[0];

	for(i=0;i<CNTR_EXER_PRC_LEN;i++) {
		voptBscSubSLegQuoConfSubjectT->cntrExerPrc[i]= ' ';
	}
	char lcntrExerPrc[CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfSubjectT.cntrExerPrc", lcntrExerPrc);
	memcpy(voptBscSubSLegQuoConfSubjectT->cntrExerPrc, lcntrExerPrc, CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("SubSLegQuoConf.optBscSubSLegQuoConfSubjectT.cntrVersNo", lcntrVersNo);
	voptBscSubSLegQuoConfSubjectT->cntrVersNo = lcntrVersNo[0];

	return voptBscSubSLegQuoConfSubjectT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutSubSLegQuoConfPrivBcastTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futSubSLegQuoConfPrivBcastT));
	futSubSLegQuoConfPrivBcastT *vfutSubSLegQuoConfPrivBcastT = getFutSubSLegQuoConfPrivBcastT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futSubSLegQuoConfPrivBcastT), (jbyte*) vfutSubSLegQuoConfPrivBcastT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutBscSubSLegQuoConfSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futBscSubSLegQuoConfSubjectT));
	futBscSubSLegQuoConfSubjectT *vfutBscSubSLegQuoConfSubjectT = getFutBscSubSLegQuoConfSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futBscSubSLegQuoConfSubjectT), (jbyte*) vfutBscSubSLegQuoConfSubjectT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptSubSLegQuoConfPrivBcastTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optSubSLegQuoConfPrivBcastT));
	optSubSLegQuoConfPrivBcastT *voptSubSLegQuoConfPrivBcastT = getOptSubSLegQuoConfPrivBcastT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optSubSLegQuoConfPrivBcastT), (jbyte*) voptSubSLegQuoConfPrivBcastT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptBscSubSLegQuoConfSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optBscSubSLegQuoConfSubjectT));
	optBscSubSLegQuoConfSubjectT *voptBscSubSLegQuoConfSubjectT = getOptBscSubSLegQuoConfSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optBscSubSLegQuoConfSubjectT), (jbyte*) voptBscSubSLegQuoConfSubjectT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSubSLegQuoConfPrivBcastT(futBscSubSLegQuoConfPrivBcastT actual, futBscSubSLegQuoConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtyBuy, expected.quoBkQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, quoBkQtyBuy not matching. Actual %s but Expected %s", actual.quoBkQtyBuy, expected.quoBkQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtySel, expected.quoBkQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, quoBkQtySel not matching. Actual %s but Expected %s", actual.quoBkQtySel, expected.quoBkQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimBuy, expected.quoPrioTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, quoPrioTimBuy not matching. Actual %s but Expected %s", actual.quoPrioTimBuy, expected.quoPrioTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimSel, expected.quoPrioTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, quoPrioTimSel not matching. Actual %s but Expected %s", actual.quoPrioTimSel, expected.quoPrioTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatBuy, expected.quoPrioDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, quoPrioDatBuy not matching. Actual %s but Expected %s", actual.quoPrioDatBuy, expected.quoPrioDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatSel, expected.quoPrioDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, quoPrioDatSel not matching. Actual %s but Expected %s", actual.quoPrioDatSel, expected.quoPrioDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatBuy, expected.lstEvntDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, lstEvntDatBuy not matching. Actual %s but Expected %s", actual.lstEvntDatBuy, expected.lstEvntDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimBuy, expected.lstEvntTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, lstEvntTimBuy not matching. Actual %s but Expected %s", actual.lstEvntTimBuy, expected.lstEvntTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, lstEvntTrnIdBuy not matching. Actual %s but Expected %s", actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatSel, expected.lstEvntDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, lstEvntDatSel not matching. Actual %s but Expected %s", actual.lstEvntDatSel, expected.lstEvntDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimSel, expected.lstEvntTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, lstEvntTimSel not matching. Actual %s but Expected %s", actual.lstEvntTimSel, expected.lstEvntTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, lstEvntTrnIdSel not matching. Actual %s but Expected %s", actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnTypId!= expected.trnTypId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfPrivBcastT, trnTypIdnot matching. Actual %d but Expected %d", actual.trnTypId, expected.trnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtSubSLegQuoConfPrivBcastT(futExtSubSLegQuoConfPrivBcastT actual, futExtSubSLegQuoConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}




/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscSubSLegQuoConfPrivBcastT(optBscSubSLegQuoConfPrivBcastT actual, optBscSubSLegQuoConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtyBuy, expected.quoBkQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, quoBkQtyBuy not matching. Actual %s but Expected %s", actual.quoBkQtyBuy, expected.quoBkQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtySel, expected.quoBkQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, quoBkQtySel not matching. Actual %s but Expected %s", actual.quoBkQtySel, expected.quoBkQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimBuy, expected.quoPrioTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, quoPrioTimBuy not matching. Actual %s but Expected %s", actual.quoPrioTimBuy, expected.quoPrioTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimSel, expected.quoPrioTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, quoPrioTimSel not matching. Actual %s but Expected %s", actual.quoPrioTimSel, expected.quoPrioTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatBuy, expected.quoPrioDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, quoPrioDatBuy not matching. Actual %s but Expected %s", actual.quoPrioDatBuy, expected.quoPrioDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatSel, expected.quoPrioDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, quoPrioDatSel not matching. Actual %s but Expected %s", actual.quoPrioDatSel, expected.quoPrioDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatBuy, expected.lstEvntDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, lstEvntDatBuy not matching. Actual %s but Expected %s", actual.lstEvntDatBuy, expected.lstEvntDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimBuy, expected.lstEvntTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, lstEvntTimBuy not matching. Actual %s but Expected %s", actual.lstEvntTimBuy, expected.lstEvntTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, lstEvntTrnIdBuy not matching. Actual %s but Expected %s", actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatSel, expected.lstEvntDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, lstEvntDatSel not matching. Actual %s but Expected %s", actual.lstEvntDatSel, expected.lstEvntDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimSel, expected.lstEvntTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, lstEvntTimSel not matching. Actual %s but Expected %s", actual.lstEvntTimSel, expected.lstEvntTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, lstEvntTrnIdSel not matching. Actual %s but Expected %s", actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.trnTypId!= expected.trnTypId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfPrivBcastT, trnTypIdnot matching. Actual %d but Expected %d", actual.trnTypId, expected.trnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtSubSLegQuoConfPrivBcastT(optExtSubSLegQuoConfPrivBcastT actual, optExtSubSLegQuoConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutSubSLegQuoConfPrivBcastT(futSubSLegQuoConfPrivBcastT actual, futSubSLegQuoConfPrivBcastT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscSubSLegQuoConfPrivBcastT (actual.basic,expected.basic, logMsg);	compareFutExtSubSLegQuoConfPrivBcastT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutBscSubSLegQuoConfSubjectT(futBscSubSLegQuoConfSubjectT actual, futBscSubSLegQuoConfSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.membId!= expected.membId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfSubjectT, membIdnot matching. Actual %d but Expected %d", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpYrDat!= expected.cntrExpYrDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfSubjectT, cntrExpYrDatnot matching. Actual %d but Expected %d", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpMthDat!= expected.cntrExpMthDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfSubjectT, cntrExpMthDatnot matching. Actual %d but Expected %d", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.subjFill!= expected.subjFill) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegQuoConfSubjectT, subjFillnot matching. Actual %d but Expected %d", actual.subjFill, expected.subjFill);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptSubSLegQuoConfPrivBcastT(optSubSLegQuoConfPrivBcastT actual, optSubSLegQuoConfPrivBcastT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscSubSLegQuoConfPrivBcastT (actual.basic,expected.basic, logMsg);	compareOptExtSubSLegQuoConfPrivBcastT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptBscSubSLegQuoConfSubjectT(optBscSubSLegQuoConfSubjectT actual, optBscSubSLegQuoConfSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.membId!= expected.membId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfSubjectT, membIdnot matching. Actual %d but Expected %d", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpYrDat!= expected.cntrExpYrDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfSubjectT, cntrExpYrDatnot matching. Actual %d but Expected %d", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpMthDat!= expected.cntrExpMthDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfSubjectT, cntrExpMthDatnot matching. Actual %d but Expected %d", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfSubjectT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExerPrc!= expected.cntrExerPrc) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfSubjectT, cntrExerPrcnot matching. Actual %d but Expected %d", actual.cntrExerPrc, expected.cntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegQuoConfSubjectT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutSubSLegQuoConfPrivBcastTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futSubSLegQuoConfPrivBcastT *actualData = (futSubSLegQuoConfPrivBcastT *)msgStruct;
	futSubSLegQuoConfPrivBcastT* expectedData = getFutSubSLegQuoConfPrivBcastT(testCaseNum);
	compareFutSubSLegQuoConfPrivBcastT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutBscSubSLegQuoConfSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futBscSubSLegQuoConfSubjectT *actualData = (futBscSubSLegQuoConfSubjectT *)msgStruct;
	futBscSubSLegQuoConfSubjectT* expectedData = getFutBscSubSLegQuoConfSubjectT(testCaseNum);
	compareFutBscSubSLegQuoConfSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptSubSLegQuoConfPrivBcastTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optSubSLegQuoConfPrivBcastT *actualData = (optSubSLegQuoConfPrivBcastT *)msgStruct;
	optSubSLegQuoConfPrivBcastT* expectedData = getOptSubSLegQuoConfPrivBcastT(testCaseNum);
	compareOptSubSLegQuoConfPrivBcastT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptBscSubSLegQuoConfSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optBscSubSLegQuoConfSubjectT *actualData = (optBscSubSLegQuoConfSubjectT *)msgStruct;
	optBscSubSLegQuoConfSubjectT* expectedData = getOptBscSubSLegQuoConfSubjectT(testCaseNum);
	compareOptBscSubSLegQuoConfSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
