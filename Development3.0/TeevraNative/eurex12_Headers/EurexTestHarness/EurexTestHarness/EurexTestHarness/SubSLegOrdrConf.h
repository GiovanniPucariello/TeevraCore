#include <SubSLegOrdrConf.hxx>
#define BUFFER_SIZE 1000

futBscSubSLegOrdrConfSubjectT *vfutBscSubSLegOrdrConfSubjectT;
futSubSLegOrdrConfPrivBcastT *vfutSubSLegOrdrConfPrivBcastT;
optSubSLegOrdrConfPrivBcastT *voptSubSLegOrdrConfPrivBcastT;
optBscSubSLegOrdrConfSubjectT *voptBscSubSLegOrdrConfSubjectT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSubSLegOrdrConfPrivBcastT getFutBscSubSLegOrdrConfPrivBcastT(char* testCaseNum , const char *root) {
	futBscSubSLegOrdrConfPrivBcastT vfutBscSubSLegOrdrConfPrivBcastT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.buyCod", lbuyCod);
	vfutBscSubSLegOrdrConfPrivBcastT.buyCod = lbuyCod[0];

	vfutBscSubSLegOrdrConfPrivBcastT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscSubSLegOrdrConfPrivBcastT");
	vfutBscSubSLegOrdrConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscSubSLegOrdrConfPrivBcastT");
	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrNo", lordrNo);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrRmngQty[i]= ' ';
	}
	char lordrRmngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrRmngQty", lordrRmngQty);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrRmngQty, lordrRmngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrExeQty", lordrExeQty);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrTotExeQty[i]= ' ';
	}
	char lordrTotExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrTotExeQty", lordrTotExeQty);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrTotExeQty, lordrTotExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrTotQty", lordrTotQty);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrTypCod", lordrTypCod);
	vfutBscSubSLegOrdrConfPrivBcastT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrExePrc", lordrExePrc);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrTrgPrc[i]= ' ';
	}
	char lordrTrgPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrTrgPrc", lordrTrgPrc);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrTrgPrc, lordrTrgPrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrResCod", lordrResCod);
	vfutBscSubSLegOrdrConfPrivBcastT.ordrResCod = lordrResCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrExpDat", lordrExpDat);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.opnClsCod", lopnClsCod);
	vfutBscSubSLegOrdrConfPrivBcastT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrCreDat", lordrCreDat);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrCreTim", lordrCreTim);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrPrioDat[i]= ' ';
	}
	char lordrPrioDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrPrioDat", lordrPrioDat);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrPrioDat, lordrPrioDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrPrioTim[i]= ' ';
	}
	char lordrPrioTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrPrioTim", lordrPrioTim);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrPrioTim, lordrPrioTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.lstEvntDat", llstEvntDat);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.lstEvntTim", llstEvntTim);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_OBO_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.membExchIdCodObo[i]= ' ';
	}
	char lmembExchIdCodObo[MEMB_EXCH_ID_COD_OBO_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.membExchIdCodObo", lmembExchIdCodObo);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.membExchIdCodObo, lmembExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN);

	for(i=0;i<ORDR_TRN_TYP_ID_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.ordrTrnTypId[i]= ' ';
	}
	char lordrTrnTypId[ORDR_TRN_TYP_ID_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.ordrTrnTypId", lordrTrnTypId);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.ordrTrnTypId, lordrTrnTypId, ORDR_TRN_TYP_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscSubSLegOrdrConfPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscSubSLegOrdrConfPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscSubSLegOrdrConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtSubSLegOrdrConfPrivBcastT getFutExtSubSLegOrdrConfPrivBcastT(char* testCaseNum , const char *root) {
	futExtSubSLegOrdrConfPrivBcastT vfutExtSubSLegOrdrConfPrivBcastT;
	int i;

	vfutExtSubSLegOrdrConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtSubSLegOrdrConfPrivBcastT");
	vfutExtSubSLegOrdrConfPrivBcastT.txtGrp = getTxtGrpT(testCaseNum, "futExtSubSLegOrdrConfPrivBcastT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtSubSLegOrdrConfPrivBcastT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futExtSubSLegOrdrConfPrivBcastT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtSubSLegOrdrConfPrivBcastT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutExtSubSLegOrdrConfPrivBcastT.ordrNoOld[i]= ' ';
	}
	char lordrNoOld[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futExtSubSLegOrdrConfPrivBcastT.ordrNoOld", lordrNoOld);
	memcpy(vfutExtSubSLegOrdrConfPrivBcastT.ordrNoOld, lordrNoOld, DRIV_ORDR_NO_LEN);

	vfutExtSubSLegOrdrConfPrivBcastT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "futExtSubSLegOrdrConfPrivBcastT");
	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		vfutExtSubSLegOrdrConfPrivBcastT.exchIdCod[i]= ' ';
	}
	char lexchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futExtSubSLegOrdrConfPrivBcastT.exchIdCod", lexchIdCod);
	memcpy(vfutExtSubSLegOrdrConfPrivBcastT.exchIdCod, lexchIdCod, DRIV_EXCH_ID_COD_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		vfutExtSubSLegOrdrConfPrivBcastT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futExtSubSLegOrdrConfPrivBcastT.isinCod", lisinCod);
	memcpy(vfutExtSubSLegOrdrConfPrivBcastT.isinCod, lisinCod, ISIN_COD_LEN);

	char lordrPersInd[1] = {""};
	getStrProperty("SubSLegOrdrConf.futExtSubSLegOrdrConfPrivBcastT.ordrPersInd", lordrPersInd);
	vfutExtSubSLegOrdrConfPrivBcastT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutExtSubSLegOrdrConfPrivBcastT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futExtSubSLegOrdrConfPrivBcastT.userOrdrRef", luserOrdrRef);
	memcpy(vfutExtSubSLegOrdrConfPrivBcastT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<ETS_SES_ID_LEN;i++) {
		vfutExtSubSLegOrdrConfPrivBcastT.etsSesId[i]= ' ';
	}
	char letsSesId[ETS_SES_ID_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futExtSubSLegOrdrConfPrivBcastT.etsSesId", letsSesId);
	memcpy(vfutExtSubSLegOrdrConfPrivBcastT.etsSesId, letsSesId, ETS_SES_ID_LEN);
	return vfutExtSubSLegOrdrConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscSubSLegOrdrConfPrivBcastT getOptBscSubSLegOrdrConfPrivBcastT(char* testCaseNum , const char *root) {
	optBscSubSLegOrdrConfPrivBcastT voptBscSubSLegOrdrConfPrivBcastT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.buyCod", lbuyCod);
	voptBscSubSLegOrdrConfPrivBcastT.buyCod = lbuyCod[0];

	voptBscSubSLegOrdrConfPrivBcastT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscSubSLegOrdrConfPrivBcastT");
	voptBscSubSLegOrdrConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscSubSLegOrdrConfPrivBcastT");
	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.membExchIdCod", lmembExchIdCod);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrNo", lordrNo);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.ordrRmngQty[i]= ' ';
	}
	char lordrRmngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrRmngQty", lordrRmngQty);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.ordrRmngQty, lordrRmngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrExeQty", lordrExeQty);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.ordrTotExeQty[i]= ' ';
	}
	char lordrTotExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrTotExeQty", lordrTotExeQty);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.ordrTotExeQty, lordrTotExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrTotQty", lordrTotQty);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrTypCod", lordrTypCod);
	voptBscSubSLegOrdrConfPrivBcastT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrExePrc", lordrExePrc);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrResCod", lordrResCod);
	voptBscSubSLegOrdrConfPrivBcastT.ordrResCod = lordrResCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrExpDat", lordrExpDat);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.opnClsCod", lopnClsCod);
	voptBscSubSLegOrdrConfPrivBcastT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrCreDat", lordrCreDat);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrCreTim", lordrCreTim);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.ordrPrioDat[i]= ' ';
	}
	char lordrPrioDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrPrioDat", lordrPrioDat);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.ordrPrioDat, lordrPrioDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.ordrPrioTim[i]= ' ';
	}
	char lordrPrioTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrPrioTim", lordrPrioTim);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.ordrPrioTim, lordrPrioTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.lstEvntDat", llstEvntDat);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.lstEvntTim", llstEvntTim);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.lstEvntTrnId", llstEvntTrnId);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_OBO_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.membExchIdCodObo[i]= ' ';
	}
	char lmembExchIdCodObo[MEMB_EXCH_ID_COD_OBO_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.membExchIdCodObo", lmembExchIdCodObo);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.membExchIdCodObo, lmembExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN);

	for(i=0;i<ORDR_TRN_TYP_ID_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.ordrTrnTypId[i]= ' ';
	}
	char lordrTrnTypId[ORDR_TRN_TYP_ID_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.ordrTrnTypId", lordrTrnTypId);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.ordrTrnTypId, lordrTrnTypId, ORDR_TRN_TYP_ID_LEN);

	char lcntrGenNo[1] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.cntrGenNo", lcntrGenNo);
	voptBscSubSLegOrdrConfPrivBcastT.cntrGenNo = lcntrGenNo[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscSubSLegOrdrConfPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscSubSLegOrdrConfPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscSubSLegOrdrConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtSubSLegOrdrConfPrivBcastT getOptExtSubSLegOrdrConfPrivBcastT(char* testCaseNum , const char *root) {
	optExtSubSLegOrdrConfPrivBcastT voptExtSubSLegOrdrConfPrivBcastT;
	int i;

	voptExtSubSLegOrdrConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtSubSLegOrdrConfPrivBcastT");
	voptExtSubSLegOrdrConfPrivBcastT.txtGrp = getTxtGrpT(testCaseNum, "optExtSubSLegOrdrConfPrivBcastT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptExtSubSLegOrdrConfPrivBcastT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optExtSubSLegOrdrConfPrivBcastT.membClgIdCod", lmembClgIdCod);
	memcpy(voptExtSubSLegOrdrConfPrivBcastT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptExtSubSLegOrdrConfPrivBcastT.ordrNoOld[i]= ' ';
	}
	char lordrNoOld[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optExtSubSLegOrdrConfPrivBcastT.ordrNoOld", lordrNoOld);
	memcpy(voptExtSubSLegOrdrConfPrivBcastT.ordrNoOld, lordrNoOld, DRIV_ORDR_NO_LEN);

	voptExtSubSLegOrdrConfPrivBcastT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "optExtSubSLegOrdrConfPrivBcastT");
	for(i=0;i<DRIV_EXCH_ID_COD_LEN;i++) {
		voptExtSubSLegOrdrConfPrivBcastT.exchIdCod[i]= ' ';
	}
	char lexchIdCod[DRIV_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optExtSubSLegOrdrConfPrivBcastT.exchIdCod", lexchIdCod);
	memcpy(voptExtSubSLegOrdrConfPrivBcastT.exchIdCod, lexchIdCod, DRIV_EXCH_ID_COD_LEN);

	for(i=0;i<ISIN_COD_LEN;i++) {
		voptExtSubSLegOrdrConfPrivBcastT.isinCod[i]= ' ';
	}
	char lisinCod[ISIN_COD_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optExtSubSLegOrdrConfPrivBcastT.isinCod", lisinCod);
	memcpy(voptExtSubSLegOrdrConfPrivBcastT.isinCod, lisinCod, ISIN_COD_LEN);

	char lordrPersInd[1] = {""};
	getStrProperty("SubSLegOrdrConf.optExtSubSLegOrdrConfPrivBcastT.ordrPersInd", lordrPersInd);
	voptExtSubSLegOrdrConfPrivBcastT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		voptExtSubSLegOrdrConfPrivBcastT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optExtSubSLegOrdrConfPrivBcastT.userOrdrRef", luserOrdrRef);
	memcpy(voptExtSubSLegOrdrConfPrivBcastT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<ETS_SES_ID_LEN;i++) {
		voptExtSubSLegOrdrConfPrivBcastT.etsSesId[i]= ' ';
	}
	char letsSesId[ETS_SES_ID_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optExtSubSLegOrdrConfPrivBcastT.etsSesId", letsSesId);
	memcpy(voptExtSubSLegOrdrConfPrivBcastT.etsSesId, letsSesId, ETS_SES_ID_LEN);
	return voptExtSubSLegOrdrConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futBscSubSLegOrdrConfSubjectT* getFutBscSubSLegOrdrConfSubjectT(char* testCaseNum) {
	vfutBscSubSLegOrdrConfSubjectT = (futBscSubSLegOrdrConfSubjectT*)malloc(sizeof(futBscSubSLegOrdrConfSubjectT));
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vfutBscSubSLegOrdrConfSubjectT->membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfSubjectT.membId", lmembId);
	memcpy(vfutBscSubSLegOrdrConfSubjectT->membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscSubSLegOrdrConfSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfSubjectT.prodId", lprodId);
	memcpy(vfutBscSubSLegOrdrConfSubjectT->prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		vfutBscSubSLegOrdrConfSubjectT->cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(vfutBscSubSLegOrdrConfSubjectT->cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		vfutBscSubSLegOrdrConfSubjectT->cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(vfutBscSubSLegOrdrConfSubjectT->cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	for(i=0;i<SUBJ_FILL_LEN;i++) {
		vfutBscSubSLegOrdrConfSubjectT->subjFill[i]= ' ';
	}
	char lsubjFill[SUBJ_FILL_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.futBscSubSLegOrdrConfSubjectT.subjFill", lsubjFill);
	memcpy(vfutBscSubSLegOrdrConfSubjectT->subjFill, lsubjFill, SUBJ_FILL_LEN);

	return vfutBscSubSLegOrdrConfSubjectT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futSubSLegOrdrConfPrivBcastT* getFutSubSLegOrdrConfPrivBcastT(char* testCaseNum) {
	vfutSubSLegOrdrConfPrivBcastT = (futSubSLegOrdrConfPrivBcastT*)malloc(sizeof(futSubSLegOrdrConfPrivBcastT));
	int i;

	vfutSubSLegOrdrConfPrivBcastT->seqNo = getFutBscSeqNoT(testCaseNum, "futSubSLegOrdrConfPrivBcastT");
	vfutSubSLegOrdrConfPrivBcastT->header = getDataHeaderT(testCaseNum, "futSubSLegOrdrConfPrivBcastT");
	vfutSubSLegOrdrConfPrivBcastT->basic = getFutBscSubSLegOrdrConfPrivBcastT(testCaseNum, "futSubSLegOrdrConfPrivBcastT");
	vfutSubSLegOrdrConfPrivBcastT->extension = getFutExtSubSLegOrdrConfPrivBcastT(testCaseNum, "futSubSLegOrdrConfPrivBcastT");
	return vfutSubSLegOrdrConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optSubSLegOrdrConfPrivBcastT* getOptSubSLegOrdrConfPrivBcastT(char* testCaseNum) {
	voptSubSLegOrdrConfPrivBcastT = (optSubSLegOrdrConfPrivBcastT*)malloc(sizeof(optSubSLegOrdrConfPrivBcastT));
	int i;

	voptSubSLegOrdrConfPrivBcastT->seqNo = getOptBscSeqNoT(testCaseNum, "optSubSLegOrdrConfPrivBcastT");
	voptSubSLegOrdrConfPrivBcastT->header = getDataHeaderT(testCaseNum, "optSubSLegOrdrConfPrivBcastT");
	voptSubSLegOrdrConfPrivBcastT->basic = getOptBscSubSLegOrdrConfPrivBcastT(testCaseNum, "optSubSLegOrdrConfPrivBcastT");
	voptSubSLegOrdrConfPrivBcastT->extension = getOptExtSubSLegOrdrConfPrivBcastT(testCaseNum, "optSubSLegOrdrConfPrivBcastT");
	return voptSubSLegOrdrConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optBscSubSLegOrdrConfSubjectT* getOptBscSubSLegOrdrConfSubjectT(char* testCaseNum) {
	voptBscSubSLegOrdrConfSubjectT = (optBscSubSLegOrdrConfSubjectT*)malloc(sizeof(optBscSubSLegOrdrConfSubjectT));
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		voptBscSubSLegOrdrConfSubjectT->membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfSubjectT.membId", lmembId);
	memcpy(voptBscSubSLegOrdrConfSubjectT->membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		voptBscSubSLegOrdrConfSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfSubjectT.prodId", lprodId);
	memcpy(voptBscSubSLegOrdrConfSubjectT->prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<CNTR_EXP_YR_DAT_LEN;i++) {
		voptBscSubSLegOrdrConfSubjectT->cntrExpYrDat[i]= ' ';
	}
	char lcntrExpYrDat[CNTR_EXP_YR_DAT_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfSubjectT.cntrExpYrDat", lcntrExpYrDat);
	memcpy(voptBscSubSLegOrdrConfSubjectT->cntrExpYrDat, lcntrExpYrDat, CNTR_EXP_YR_DAT_LEN);

	for(i=0;i<CNTR_EXP_MTH_DAT_LEN;i++) {
		voptBscSubSLegOrdrConfSubjectT->cntrExpMthDat[i]= ' ';
	}
	char lcntrExpMthDat[CNTR_EXP_MTH_DAT_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfSubjectT.cntrExpMthDat", lcntrExpMthDat);
	memcpy(voptBscSubSLegOrdrConfSubjectT->cntrExpMthDat, lcntrExpMthDat, CNTR_EXP_MTH_DAT_LEN);

	char lcntrClasCod[1] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfSubjectT.cntrClasCod", lcntrClasCod);
	voptBscSubSLegOrdrConfSubjectT->cntrClasCod = lcntrClasCod[0];

	for(i=0;i<CNTR_EXER_PRC_LEN;i++) {
		voptBscSubSLegOrdrConfSubjectT->cntrExerPrc[i]= ' ';
	}
	char lcntrExerPrc[CNTR_EXER_PRC_LEN] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfSubjectT.cntrExerPrc", lcntrExerPrc);
	memcpy(voptBscSubSLegOrdrConfSubjectT->cntrExerPrc, lcntrExerPrc, CNTR_EXER_PRC_LEN);

	char lcntrVersNo[1] = {""};
	getStrProperty("SubSLegOrdrConf.optBscSubSLegOrdrConfSubjectT.cntrVersNo", lcntrVersNo);
	voptBscSubSLegOrdrConfSubjectT->cntrVersNo = lcntrVersNo[0];

	return voptBscSubSLegOrdrConfSubjectT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutBscSubSLegOrdrConfSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futBscSubSLegOrdrConfSubjectT));
	futBscSubSLegOrdrConfSubjectT *vfutBscSubSLegOrdrConfSubjectT = getFutBscSubSLegOrdrConfSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futBscSubSLegOrdrConfSubjectT), (jbyte*) vfutBscSubSLegOrdrConfSubjectT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutSubSLegOrdrConfPrivBcastTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futSubSLegOrdrConfPrivBcastT));
	futSubSLegOrdrConfPrivBcastT *vfutSubSLegOrdrConfPrivBcastT = getFutSubSLegOrdrConfPrivBcastT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futSubSLegOrdrConfPrivBcastT), (jbyte*) vfutSubSLegOrdrConfPrivBcastT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptSubSLegOrdrConfPrivBcastTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optSubSLegOrdrConfPrivBcastT));
	optSubSLegOrdrConfPrivBcastT *voptSubSLegOrdrConfPrivBcastT = getOptSubSLegOrdrConfPrivBcastT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optSubSLegOrdrConfPrivBcastT), (jbyte*) voptSubSLegOrdrConfPrivBcastT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptBscSubSLegOrdrConfSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optBscSubSLegOrdrConfSubjectT));
	optBscSubSLegOrdrConfSubjectT *voptBscSubSLegOrdrConfSubjectT = getOptBscSubSLegOrdrConfSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optBscSubSLegOrdrConfSubjectT), (jbyte*) voptBscSubSLegOrdrConfSubjectT);
	return jdatareq;
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSubSLegOrdrConfPrivBcastT(futBscSubSLegOrdrConfPrivBcastT actual, futBscSubSLegOrdrConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrRmngQty, expected.ordrRmngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrRmngQty not matching. Actual %s but Expected %s", actual.ordrRmngQty, expected.ordrRmngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotExeQty, expected.ordrTotExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrTotExeQty not matching. Actual %s but Expected %s", actual.ordrTotExeQty, expected.ordrTotExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTrgPrc, expected.ordrTrgPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrTrgPrc not matching. Actual %s but Expected %s", actual.ordrTrgPrc, expected.ordrTrgPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioDat, expected.ordrPrioDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrPrioDat not matching. Actual %s but Expected %s", actual.ordrPrioDat, expected.ordrPrioDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioTim, expected.ordrPrioTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrPrioTim not matching. Actual %s but Expected %s", actual.ordrPrioTim, expected.ordrPrioTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodObo, expected.membExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, membExchIdCodObo not matching. Actual %s but Expected %s", actual.membExchIdCodObo, expected.membExchIdCodObo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTrnTypId, expected.ordrTrnTypId, ORDR_TRN_TYP_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, ordrTrnTypId not matching. Actual %s but Expected %s", actual.ordrTrnTypId, expected.ordrTrnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtSubSLegOrdrConfPrivBcastT(futExtSubSLegOrdrConfPrivBcastT actual, futExtSubSLegOrdrConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegOrdrConfPrivBcastT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoOld, expected.ordrNoOld, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegOrdrConfPrivBcastT, ordrNoOld not matching. Actual %s but Expected %s", actual.ordrNoOld, expected.ordrNoOld);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if ( memcmp(actual.exchIdCod, expected.exchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegOrdrConfPrivBcastT, exchIdCod not matching. Actual %s but Expected %s", actual.exchIdCod, expected.exchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegOrdrConfPrivBcastT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegOrdrConfPrivBcastT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegOrdrConfPrivBcastT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.etsSesId, expected.etsSesId, ETS_SES_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubSLegOrdrConfPrivBcastT, etsSesId not matching. Actual %s but Expected %s", actual.etsSesId, expected.etsSesId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscSubSLegOrdrConfPrivBcastT(optBscSubSLegOrdrConfPrivBcastT actual, optBscSubSLegOrdrConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrRmngQty, expected.ordrRmngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrRmngQty not matching. Actual %s but Expected %s", actual.ordrRmngQty, expected.ordrRmngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotExeQty, expected.ordrTotExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrTotExeQty not matching. Actual %s but Expected %s", actual.ordrTotExeQty, expected.ordrTotExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioDat, expected.ordrPrioDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrPrioDat not matching. Actual %s but Expected %s", actual.ordrPrioDat, expected.ordrPrioDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioTim, expected.ordrPrioTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrPrioTim not matching. Actual %s but Expected %s", actual.ordrPrioTim, expected.ordrPrioTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodObo, expected.membExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, membExchIdCodObo not matching. Actual %s but Expected %s", actual.membExchIdCodObo, expected.membExchIdCodObo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTrnTypId, expected.ordrTrnTypId, ORDR_TRN_TYP_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, ordrTrnTypId not matching. Actual %s but Expected %s", actual.ordrTrnTypId, expected.ordrTrnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrGenNo!= expected.cntrGenNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, cntrGenNonot matching. Actual %d but Expected %d", actual.cntrGenNo, expected.cntrGenNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtSubSLegOrdrConfPrivBcastT(optExtSubSLegOrdrConfPrivBcastT actual, optExtSubSLegOrdrConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegOrdrConfPrivBcastT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoOld, expected.ordrNoOld, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegOrdrConfPrivBcastT, ordrNoOld not matching. Actual %s but Expected %s", actual.ordrNoOld, expected.ordrNoOld);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if ( memcmp(actual.exchIdCod, expected.exchIdCod, DRIV_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegOrdrConfPrivBcastT, exchIdCod not matching. Actual %s but Expected %s", actual.exchIdCod, expected.exchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.isinCod, expected.isinCod, ISIN_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegOrdrConfPrivBcastT, isinCod not matching. Actual %s but Expected %s", actual.isinCod, expected.isinCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegOrdrConfPrivBcastT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegOrdrConfPrivBcastT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.etsSesId, expected.etsSesId, ETS_SES_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtSubSLegOrdrConfPrivBcastT, etsSesId not matching. Actual %s but Expected %s", actual.etsSesId, expected.etsSesId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}




/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutBscSubSLegOrdrConfSubjectT(futBscSubSLegOrdrConfSubjectT actual, futBscSubSLegOrdrConfSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.membId!= expected.membId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfSubjectT, membIdnot matching. Actual %d but Expected %d", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpYrDat!= expected.cntrExpYrDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfSubjectT, cntrExpYrDatnot matching. Actual %d but Expected %d", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpMthDat!= expected.cntrExpMthDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfSubjectT, cntrExpMthDatnot matching. Actual %d but Expected %d", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.subjFill!= expected.subjFill) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegOrdrConfSubjectT, subjFillnot matching. Actual %d but Expected %d", actual.subjFill, expected.subjFill);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutSubSLegOrdrConfPrivBcastT(futSubSLegOrdrConfPrivBcastT actual, futSubSLegOrdrConfPrivBcastT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscSubSLegOrdrConfPrivBcastT (actual.basic,expected.basic, logMsg);	compareFutExtSubSLegOrdrConfPrivBcastT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptSubSLegOrdrConfPrivBcastT(optSubSLegOrdrConfPrivBcastT actual, optSubSLegOrdrConfPrivBcastT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptBscSeqNoT (actual.seqNo,expected.seqNo, logMsg);	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscSubSLegOrdrConfPrivBcastT (actual.basic,expected.basic, logMsg);	compareOptExtSubSLegOrdrConfPrivBcastT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptBscSubSLegOrdrConfSubjectT(optBscSubSLegOrdrConfSubjectT actual, optBscSubSLegOrdrConfSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.membId!= expected.membId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfSubjectT, membIdnot matching. Actual %d but Expected %d", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpYrDat!= expected.cntrExpYrDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfSubjectT, cntrExpYrDatnot matching. Actual %d but Expected %d", actual.cntrExpYrDat, expected.cntrExpYrDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExpMthDat!= expected.cntrExpMthDat) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfSubjectT, cntrExpMthDatnot matching. Actual %d but Expected %d", actual.cntrExpMthDat, expected.cntrExpMthDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrClasCod!= expected.cntrClasCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfSubjectT, cntrClasCodnot matching. Actual %d but Expected %d", actual.cntrClasCod, expected.cntrClasCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrExerPrc!= expected.cntrExerPrc) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfSubjectT, cntrExerPrcnot matching. Actual %d but Expected %d", actual.cntrExerPrc, expected.cntrExerPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.cntrVersNo!= expected.cntrVersNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegOrdrConfSubjectT, cntrVersNonot matching. Actual %d but Expected %d", actual.cntrVersNo, expected.cntrVersNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutBscSubSLegOrdrConfSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futBscSubSLegOrdrConfSubjectT *actualData = (futBscSubSLegOrdrConfSubjectT *)msgStruct;
	futBscSubSLegOrdrConfSubjectT* expectedData = getFutBscSubSLegOrdrConfSubjectT(testCaseNum);
	compareFutBscSubSLegOrdrConfSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutSubSLegOrdrConfPrivBcastTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futSubSLegOrdrConfPrivBcastT *actualData = (futSubSLegOrdrConfPrivBcastT *)msgStruct;
	futSubSLegOrdrConfPrivBcastT* expectedData = getFutSubSLegOrdrConfPrivBcastT(testCaseNum);
	compareFutSubSLegOrdrConfPrivBcastT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptSubSLegOrdrConfPrivBcastTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optSubSLegOrdrConfPrivBcastT *actualData = (optSubSLegOrdrConfPrivBcastT *)msgStruct;
	optSubSLegOrdrConfPrivBcastT* expectedData = getOptSubSLegOrdrConfPrivBcastT(testCaseNum);
	compareOptSubSLegOrdrConfPrivBcastT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptBscSubSLegOrdrConfSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optBscSubSLegOrdrConfSubjectT *actualData = (optBscSubSLegOrdrConfSubjectT *)msgStruct;
	optBscSubSLegOrdrConfSubjectT* expectedData = getOptBscSubSLegOrdrConfSubjectT(testCaseNum);
	compareOptBscSubSLegOrdrConfSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
