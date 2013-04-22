#include <InqOwnSLegOrdr.hxx>
#define BUFFER_SIZE 1000

futInqOwnSLegOrdrRequestT *vfutInqOwnSLegOrdrRequestT;
futInqOwnSLegOrdrResponseT *vfutInqOwnSLegOrdrResponseT;
optInqOwnSLegOrdrRequestT *voptInqOwnSLegOrdrRequestT;
optInqOwnSLegOrdrResponseT *voptInqOwnSLegOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnSLegOrdrRequestT getFutBscInqOwnSLegOrdrRequestT(char* testCaseNum , const char *root) {
	futBscInqOwnSLegOrdrRequestT vfutBscInqOwnSLegOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRequestT.buyCod", lbuyCod);
	vfutBscInqOwnSLegOrdrRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqOwnSLegOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscInqOwnSLegOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	vfutBscInqOwnSLegOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqOwnSLegOrdrRequestT");
	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutBscInqOwnSLegOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(vfutBscInqOwnSLegOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqOwnSLegOrdrRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqOwnSLegOrdrRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqOwnSLegOrdrRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqOwnSLegOrdrRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqOwnSLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnSLegOrdrRecT getFutBscInqOwnSLegOrdrRecT(char* testCaseNum , const char *root) {
	futBscInqOwnSLegOrdrRecT vfutBscInqOwnSLegOrdrRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.buyCod", lbuyCod);
	vfutBscInqOwnSLegOrdrRecT.buyCod = lbuyCod[0];

	vfutBscInqOwnSLegOrdrRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqOwnSLegOrdrRecT");
	vfutBscInqOwnSLegOrdrRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqOwnSLegOrdrRecT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrNo", lordrNo);
	memcpy(vfutBscInqOwnSLegOrdrRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrBkQty", lordrBkQty);
	memcpy(vfutBscInqOwnSLegOrdrRecT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrExeQty", lordrExeQty);
	memcpy(vfutBscInqOwnSLegOrdrRecT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.ordrTotExeQty[i]= ' ';
	}
	char lordrTotExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrTotExeQty", lordrTotExeQty);
	memcpy(vfutBscInqOwnSLegOrdrRecT.ordrTotExeQty, lordrTotExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrTotQty", lordrTotQty);
	memcpy(vfutBscInqOwnSLegOrdrRecT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrTypCod", lordrTypCod);
	vfutBscInqOwnSLegOrdrRecT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrExePrc", lordrExePrc);
	memcpy(vfutBscInqOwnSLegOrdrRecT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.ordrTrgPrc[i]= ' ';
	}
	char lordrTrgPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrTrgPrc", lordrTrgPrc);
	memcpy(vfutBscInqOwnSLegOrdrRecT.ordrTrgPrc, lordrTrgPrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrResCod", lordrResCod);
	vfutBscInqOwnSLegOrdrRecT.ordrResCod = lordrResCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrExpDat", lordrExpDat);
	memcpy(vfutBscInqOwnSLegOrdrRecT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.opnClsCod", lopnClsCod);
	vfutBscInqOwnSLegOrdrRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrCreDat", lordrCreDat);
	memcpy(vfutBscInqOwnSLegOrdrRecT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrCreTim", lordrCreTim);
	memcpy(vfutBscInqOwnSLegOrdrRecT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.ordrPrioDat[i]= ' ';
	}
	char lordrPrioDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrPrioDat", lordrPrioDat);
	memcpy(vfutBscInqOwnSLegOrdrRecT.ordrPrioDat, lordrPrioDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.ordrPrioTim[i]= ' ';
	}
	char lordrPrioTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.ordrPrioTim", lordrPrioTim);
	memcpy(vfutBscInqOwnSLegOrdrRecT.ordrPrioTim, lordrPrioTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.lstEvntDat", llstEvntDat);
	memcpy(vfutBscInqOwnSLegOrdrRecT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.lstEvntTim", llstEvntTim);
	memcpy(vfutBscInqOwnSLegOrdrRecT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutBscInqOwnSLegOrdrRecT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_OBO_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.membExchIdCodObo[i]= ' ';
	}
	char lmembExchIdCodObo[MEMB_EXCH_ID_COD_OBO_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.membExchIdCodObo", lmembExchIdCodObo);
	memcpy(vfutBscInqOwnSLegOrdrRecT.membExchIdCodObo, lmembExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqOwnSLegOrdrRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqOwnSLegOrdrRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqOwnSLegOrdrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnSLegOrdrResponseT getFutBscInqOwnSLegOrdrResponseT(char* testCaseNum , const char *root) {
	futBscInqOwnSLegOrdrResponseT vfutBscInqOwnSLegOrdrResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqOwnSLegOrdrResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqOwnSLegOrdrResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqOwnSLegOrdrResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futBscInqOwnSLegOrdrResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqOwnSLegOrdrResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqOwnSLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqOwnSLegOrdrRecT getFutExtInqOwnSLegOrdrRecT(char* testCaseNum , const char *root) {
	futExtInqOwnSLegOrdrRecT vfutExtInqOwnSLegOrdrRecT;
	int i;

	vfutExtInqOwnSLegOrdrRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtInqOwnSLegOrdrRecT");
	vfutExtInqOwnSLegOrdrRecT.txtGrp = getTxtGrpT(testCaseNum, "futExtInqOwnSLegOrdrRecT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtInqOwnSLegOrdrRecT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futExtInqOwnSLegOrdrRecT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtInqOwnSLegOrdrRecT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	vfutExtInqOwnSLegOrdrRecT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "futExtInqOwnSLegOrdrRecT");
	char lordrPersInd[1] = {""};
	getStrProperty("InqOwnSLegOrdr.futExtInqOwnSLegOrdrRecT.ordrPersInd", lordrPersInd);
	vfutExtInqOwnSLegOrdrRecT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutExtInqOwnSLegOrdrRecT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futExtInqOwnSLegOrdrRecT.userOrdrRef", luserOrdrRef);
	memcpy(vfutExtInqOwnSLegOrdrRecT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<ETS_SES_ID_LEN;i++) {
		vfutExtInqOwnSLegOrdrRecT.etsSesId[i]= ' ';
	}
	char letsSesId[ETS_SES_ID_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.futExtInqOwnSLegOrdrRecT.etsSesId", letsSesId);
	memcpy(vfutExtInqOwnSLegOrdrRecT.etsSesId, letsSesId, ETS_SES_ID_LEN);
	return vfutExtInqOwnSLegOrdrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqOwnSLegOrdrResponseT getFutExtInqOwnSLegOrdrResponseT(char* testCaseNum , const char *root) {
	futExtInqOwnSLegOrdrResponseT vfutExtInqOwnSLegOrdrResponseT;
	int i;
	return vfutExtInqOwnSLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqOwnSLegOrdrRequestT getOptBscInqOwnSLegOrdrRequestT(char* testCaseNum , const char *root) {
	optBscInqOwnSLegOrdrRequestT voptBscInqOwnSLegOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRequestT.buyCod", lbuyCod);
	voptBscInqOwnSLegOrdrRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscInqOwnSLegOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRequestT.ordrNo", lordrNo);
	memcpy(voptBscInqOwnSLegOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	voptBscInqOwnSLegOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqOwnSLegOrdrRequestT");
	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		voptBscInqOwnSLegOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(voptBscInqOwnSLegOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		voptBscInqOwnSLegOrdrRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(voptBscInqOwnSLegOrdrRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqOwnSLegOrdrRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqOwnSLegOrdrRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return voptBscInqOwnSLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqOwnSLegOrdrRecT getOptBscInqOwnSLegOrdrRecT(char* testCaseNum , const char *root) {
	optBscInqOwnSLegOrdrRecT voptBscInqOwnSLegOrdrRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.buyCod", lbuyCod);
	voptBscInqOwnSLegOrdrRecT.buyCod = lbuyCod[0];

	voptBscInqOwnSLegOrdrRecT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscInqOwnSLegOrdrRecT");
	voptBscInqOwnSLegOrdrRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscInqOwnSLegOrdrRecT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.ordrNo", lordrNo);
	memcpy(voptBscInqOwnSLegOrdrRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.ordrBkQty", lordrBkQty);
	memcpy(voptBscInqOwnSLegOrdrRecT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.ordrExeQty", lordrExeQty);
	memcpy(voptBscInqOwnSLegOrdrRecT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.ordrTotExeQty[i]= ' ';
	}
	char lordrTotExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.ordrTotExeQty", lordrTotExeQty);
	memcpy(voptBscInqOwnSLegOrdrRecT.ordrTotExeQty, lordrTotExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.ordrTotQty", lordrTotQty);
	memcpy(voptBscInqOwnSLegOrdrRecT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.ordrTypCod", lordrTypCod);
	voptBscInqOwnSLegOrdrRecT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.ordrExePrc", lordrExePrc);
	memcpy(voptBscInqOwnSLegOrdrRecT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.ordrExpDat", lordrExpDat);
	memcpy(voptBscInqOwnSLegOrdrRecT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.opnClsCod", lopnClsCod);
	voptBscInqOwnSLegOrdrRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.ordrCreDat", lordrCreDat);
	memcpy(voptBscInqOwnSLegOrdrRecT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.ordrCreTim", lordrCreTim);
	memcpy(voptBscInqOwnSLegOrdrRecT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.ordrPrioDat[i]= ' ';
	}
	char lordrPrioDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.ordrPrioDat", lordrPrioDat);
	memcpy(voptBscInqOwnSLegOrdrRecT.ordrPrioDat, lordrPrioDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.ordrPrioTim[i]= ' ';
	}
	char lordrPrioTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.ordrPrioTim", lordrPrioTim);
	memcpy(voptBscInqOwnSLegOrdrRecT.ordrPrioTim, lordrPrioTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.lstEvntDat", llstEvntDat);
	memcpy(voptBscInqOwnSLegOrdrRecT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.lstEvntTim", llstEvntTim);
	memcpy(voptBscInqOwnSLegOrdrRecT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.lstEvntTrnId", llstEvntTrnId);
	memcpy(voptBscInqOwnSLegOrdrRecT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_OBO_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.membExchIdCodObo[i]= ' ';
	}
	char lmembExchIdCodObo[MEMB_EXCH_ID_COD_OBO_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.membExchIdCodObo", lmembExchIdCodObo);
	memcpy(voptBscInqOwnSLegOrdrRecT.membExchIdCodObo, lmembExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscInqOwnSLegOrdrRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscInqOwnSLegOrdrRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscInqOwnSLegOrdrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscInqOwnSLegOrdrResponseT getOptBscInqOwnSLegOrdrResponseT(char* testCaseNum , const char *root) {
	optBscInqOwnSLegOrdrResponseT voptBscInqOwnSLegOrdrResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		voptBscInqOwnSLegOrdrResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(voptBscInqOwnSLegOrdrResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		voptBscInqOwnSLegOrdrResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optBscInqOwnSLegOrdrResponseT.mliRecCtr", lmliRecCtr);
	memcpy(voptBscInqOwnSLegOrdrResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return voptBscInqOwnSLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqOwnSLegOrdrRecT getOptExtInqOwnSLegOrdrRecT(char* testCaseNum , const char *root) {
	optExtInqOwnSLegOrdrRecT voptExtInqOwnSLegOrdrRecT;
	int i;

	voptExtInqOwnSLegOrdrRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtInqOwnSLegOrdrRecT");
	voptExtInqOwnSLegOrdrRecT.txtGrp = getTxtGrpT(testCaseNum, "optExtInqOwnSLegOrdrRecT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptExtInqOwnSLegOrdrRecT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optExtInqOwnSLegOrdrRecT.membClgIdCod", lmembClgIdCod);
	memcpy(voptExtInqOwnSLegOrdrRecT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	voptExtInqOwnSLegOrdrRecT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "optExtInqOwnSLegOrdrRecT");
	char lordrPersInd[1] = {""};
	getStrProperty("InqOwnSLegOrdr.optExtInqOwnSLegOrdrRecT.ordrPersInd", lordrPersInd);
	voptExtInqOwnSLegOrdrRecT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		voptExtInqOwnSLegOrdrRecT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optExtInqOwnSLegOrdrRecT.userOrdrRef", luserOrdrRef);
	memcpy(voptExtInqOwnSLegOrdrRecT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<ETS_SES_ID_LEN;i++) {
		voptExtInqOwnSLegOrdrRecT.etsSesId[i]= ' ';
	}
	char letsSesId[ETS_SES_ID_LEN] = {""};
	getStrProperty("InqOwnSLegOrdr.optExtInqOwnSLegOrdrRecT.etsSesId", letsSesId);
	memcpy(voptExtInqOwnSLegOrdrRecT.etsSesId, letsSesId, ETS_SES_ID_LEN);
	return voptExtInqOwnSLegOrdrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtInqOwnSLegOrdrResponseT getOptExtInqOwnSLegOrdrResponseT(char* testCaseNum , const char *root) {
	optExtInqOwnSLegOrdrResponseT voptExtInqOwnSLegOrdrResponseT;
	int i;
	return voptExtInqOwnSLegOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqOwnSLegOrdrRequestT* getFutInqOwnSLegOrdrRequestT(char* testCaseNum) {
	vfutInqOwnSLegOrdrRequestT = (futInqOwnSLegOrdrRequestT*)malloc(sizeof(futInqOwnSLegOrdrRequestT));
	int i;

	vfutInqOwnSLegOrdrRequestT->header = getDataHeaderT(testCaseNum, "futInqOwnSLegOrdrRequestT");
	vfutInqOwnSLegOrdrRequestT->basic = getFutBscInqOwnSLegOrdrRequestT(testCaseNum, "futInqOwnSLegOrdrRequestT");
	return vfutInqOwnSLegOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqOwnSLegOrdrResponseT* getFutInqOwnSLegOrdrResponseT(char* testCaseNum) {
	vfutInqOwnSLegOrdrResponseT = (futInqOwnSLegOrdrResponseT*)malloc(sizeof(futInqOwnSLegOrdrResponseT));
	int i;

	vfutInqOwnSLegOrdrResponseT->header = getDataHeaderT(testCaseNum, "futInqOwnSLegOrdrResponseT");
	vfutInqOwnSLegOrdrResponseT->basic = getFutBscInqOwnSLegOrdrResponseT(testCaseNum, "futInqOwnSLegOrdrResponseT");
	vfutInqOwnSLegOrdrResponseT->extension = getFutExtInqOwnSLegOrdrResponseT(testCaseNum, "futInqOwnSLegOrdrResponseT");
	return vfutInqOwnSLegOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqOwnSLegOrdrRequestT* getOptInqOwnSLegOrdrRequestT(char* testCaseNum) {
	voptInqOwnSLegOrdrRequestT = (optInqOwnSLegOrdrRequestT*)malloc(sizeof(optInqOwnSLegOrdrRequestT));
	int i;

	voptInqOwnSLegOrdrRequestT->header = getDataHeaderT(testCaseNum, "optInqOwnSLegOrdrRequestT");
	voptInqOwnSLegOrdrRequestT->basic = getOptBscInqOwnSLegOrdrRequestT(testCaseNum, "optInqOwnSLegOrdrRequestT");
	return voptInqOwnSLegOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optInqOwnSLegOrdrResponseT* getOptInqOwnSLegOrdrResponseT(char* testCaseNum) {
	voptInqOwnSLegOrdrResponseT = (optInqOwnSLegOrdrResponseT*)malloc(sizeof(optInqOwnSLegOrdrResponseT));
	int i;

	voptInqOwnSLegOrdrResponseT->header = getDataHeaderT(testCaseNum, "optInqOwnSLegOrdrResponseT");
	voptInqOwnSLegOrdrResponseT->basic = getOptBscInqOwnSLegOrdrResponseT(testCaseNum, "optInqOwnSLegOrdrResponseT");
	voptInqOwnSLegOrdrResponseT->extension = getOptExtInqOwnSLegOrdrResponseT(testCaseNum, "optInqOwnSLegOrdrResponseT");
	return voptInqOwnSLegOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqOwnSLegOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqOwnSLegOrdrRequestT));
	futInqOwnSLegOrdrRequestT *vfutInqOwnSLegOrdrRequestT = getFutInqOwnSLegOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqOwnSLegOrdrRequestT), (jbyte*) vfutInqOwnSLegOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqOwnSLegOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqOwnSLegOrdrResponseT));
	futInqOwnSLegOrdrResponseT *vfutInqOwnSLegOrdrResponseT = getFutInqOwnSLegOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqOwnSLegOrdrResponseT), (jbyte*) vfutInqOwnSLegOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqOwnSLegOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqOwnSLegOrdrRequestT));
	optInqOwnSLegOrdrRequestT *voptInqOwnSLegOrdrRequestT = getOptInqOwnSLegOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqOwnSLegOrdrRequestT), (jbyte*) voptInqOwnSLegOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptInqOwnSLegOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optInqOwnSLegOrdrResponseT));
	optInqOwnSLegOrdrResponseT *voptInqOwnSLegOrdrResponseT = getOptInqOwnSLegOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optInqOwnSLegOrdrResponseT), (jbyte*) voptInqOwnSLegOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnSLegOrdrRequestT(futBscInqOwnSLegOrdrRequestT actual, futBscInqOwnSLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_OWN_S_LEG_ORDR_GRP_MAX;i++) {
		compareFutCntrIdGrpT (actual.futCntrIdGrp[i],expected.futCntrIdGrp[i], logMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnSLegOrdrRecT(futBscInqOwnSLegOrdrRecT actual, futBscInqOwnSLegOrdrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotExeQty, expected.ordrTotExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrTotExeQty not matching. Actual %s but Expected %s", actual.ordrTotExeQty, expected.ordrTotExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTrgPrc, expected.ordrTrgPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrTrgPrc not matching. Actual %s but Expected %s", actual.ordrTrgPrc, expected.ordrTrgPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioDat, expected.ordrPrioDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrPrioDat not matching. Actual %s but Expected %s", actual.ordrPrioDat, expected.ordrPrioDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioTim, expected.ordrPrioTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, ordrPrioTim not matching. Actual %s but Expected %s", actual.ordrPrioTim, expected.ordrPrioTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodObo, expected.membExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, membExchIdCodObo not matching. Actual %s but Expected %s", actual.membExchIdCodObo, expected.membExchIdCodObo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnSLegOrdrResponseT(futBscInqOwnSLegOrdrResponseT actual, futBscInqOwnSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnSLegOrdrResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_OWN_S_LEG_ORDR_REC_MAX;i++) {
		compareFutBscInqOwnSLegOrdrRecT (actual.futBscInqOwnSLegOrdrRec[i],expected.futBscInqOwnSLegOrdrRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqOwnSLegOrdrRecT(futExtInqOwnSLegOrdrRecT actual, futExtInqOwnSLegOrdrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnSLegOrdrRecT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnSLegOrdrRecT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnSLegOrdrRecT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.etsSesId, expected.etsSesId, ETS_SES_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnSLegOrdrRecT, etsSesId not matching. Actual %s but Expected %s", actual.etsSesId, expected.etsSesId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqOwnSLegOrdrResponseT(futExtInqOwnSLegOrdrResponseT actual, futExtInqOwnSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_OWN_S_LEG_ORDR_REC_MAX;i++) {
		compareFutExtInqOwnSLegOrdrRecT (actual.futExtInqOwnSLegOrdrRec[i],expected.futExtInqOwnSLegOrdrRec[i], logMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqOwnSLegOrdrRequestT(optBscInqOwnSLegOrdrRequestT actual, optBscInqOwnSLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_BSC_INQ_OWN_S_LEG_ORDR_GRP_MAX;i++) {
		compareOptCntrIdGrpT (actual.optCntrIdGrp[i],expected.optCntrIdGrp[i], logMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqOwnSLegOrdrRecT(optBscInqOwnSLegOrdrRecT actual, optBscInqOwnSLegOrdrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotExeQty, expected.ordrTotExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, ordrTotExeQty not matching. Actual %s but Expected %s", actual.ordrTotExeQty, expected.ordrTotExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioDat, expected.ordrPrioDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, ordrPrioDat not matching. Actual %s but Expected %s", actual.ordrPrioDat, expected.ordrPrioDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioTim, expected.ordrPrioTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, ordrPrioTim not matching. Actual %s but Expected %s", actual.ordrPrioTim, expected.ordrPrioTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodObo, expected.membExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, membExchIdCodObo not matching. Actual %s but Expected %s", actual.membExchIdCodObo, expected.membExchIdCodObo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscInqOwnSLegOrdrResponseT(optBscInqOwnSLegOrdrResponseT actual, optBscInqOwnSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscInqOwnSLegOrdrResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < OPT_BSC_INQ_OWN_S_LEG_ORDR_REC_MAX;i++) {
		compareOptBscInqOwnSLegOrdrRecT (actual.optBscInqOwnSLegOrdrRec[i],expected.optBscInqOwnSLegOrdrRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqOwnSLegOrdrRecT(optExtInqOwnSLegOrdrRecT actual, optExtInqOwnSLegOrdrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqOwnSLegOrdrRecT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqOwnSLegOrdrRecT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqOwnSLegOrdrRecT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.etsSesId, expected.etsSesId, ETS_SES_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtInqOwnSLegOrdrRecT, etsSesId not matching. Actual %s but Expected %s", actual.etsSesId, expected.etsSesId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtInqOwnSLegOrdrResponseT(optExtInqOwnSLegOrdrResponseT actual, optExtInqOwnSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < OPT_EXT_INQ_OWN_S_LEG_ORDR_REC_MAX;i++) {
		compareOptExtInqOwnSLegOrdrRecT (actual.optExtInqOwnSLegOrdrRec[i],expected.optExtInqOwnSLegOrdrRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqOwnSLegOrdrRequestT(futInqOwnSLegOrdrRequestT actual, futInqOwnSLegOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqOwnSLegOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqOwnSLegOrdrResponseT(futInqOwnSLegOrdrResponseT actual, futInqOwnSLegOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqOwnSLegOrdrResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqOwnSLegOrdrResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqOwnSLegOrdrRequestT(optInqOwnSLegOrdrRequestT actual, optInqOwnSLegOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqOwnSLegOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptInqOwnSLegOrdrResponseT(optInqOwnSLegOrdrResponseT actual, optInqOwnSLegOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscInqOwnSLegOrdrResponseT (actual.basic,expected.basic, logMsg);	compareOptExtInqOwnSLegOrdrResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqOwnSLegOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqOwnSLegOrdrRequestT *actualData = (futInqOwnSLegOrdrRequestT *)msgStruct;
	futInqOwnSLegOrdrRequestT* expectedData = getFutInqOwnSLegOrdrRequestT(testCaseNum);
	compareFutInqOwnSLegOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqOwnSLegOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqOwnSLegOrdrResponseT *actualData = (futInqOwnSLegOrdrResponseT *)msgStruct;
	futInqOwnSLegOrdrResponseT* expectedData = getFutInqOwnSLegOrdrResponseT(testCaseNum);
	compareFutInqOwnSLegOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqOwnSLegOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqOwnSLegOrdrRequestT *actualData = (optInqOwnSLegOrdrRequestT *)msgStruct;
	optInqOwnSLegOrdrRequestT* expectedData = getOptInqOwnSLegOrdrRequestT(testCaseNum);
	compareOptInqOwnSLegOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptInqOwnSLegOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optInqOwnSLegOrdrResponseT *actualData = (optInqOwnSLegOrdrResponseT *)msgStruct;
	optInqOwnSLegOrdrResponseT* expectedData = getOptInqOwnSLegOrdrResponseT(testCaseNum);
	compareOptInqOwnSLegOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
