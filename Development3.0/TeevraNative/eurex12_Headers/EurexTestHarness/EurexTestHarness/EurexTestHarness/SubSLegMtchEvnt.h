#include <SubSLegMtchEvnt.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscMtchEvntGrpT getBscMtchEvntGrpT(char* testCaseNum , const char *root) {
	bscMtchEvntGrpT vbscMtchEvntGrpT;
	int i;

	vbscMtchEvntGrpT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscMtchEvntGrpT");
	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscMtchEvntGrpT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscMtchEvntGrpT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.opnClsCod", lopnClsCod);
	vbscMtchEvntGrpT.opnClsCod = lopnClsCod[0];

	char lordrTypCod[1] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrTypCod", lordrTypCod);
	vbscMtchEvntGrpT.ordrTypCod = lordrTypCod[0];

	char lordrResCod[1] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrResCod", lordrResCod);
	vbscMtchEvntGrpT.ordrResCod = lordrResCod[0];

	char lbuyCod[1] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.buyCod", lbuyCod);
	vbscMtchEvntGrpT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscMtchEvntGrpT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrNo", lordrNo);
	memcpy(vbscMtchEvntGrpT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscMtchEvntGrpT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrBkQty", lordrBkQty);
	memcpy(vbscMtchEvntGrpT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscMtchEvntGrpT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrExeQty", lordrExeQty);
	memcpy(vbscMtchEvntGrpT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscMtchEvntGrpT.ordrTotExeQty[i]= ' ';
	}
	char lordrTotExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrTotExeQty", lordrTotExeQty);
	memcpy(vbscMtchEvntGrpT.ordrTotExeQty, lordrTotExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscMtchEvntGrpT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrTotQty", lordrTotQty);
	memcpy(vbscMtchEvntGrpT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscMtchEvntGrpT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrExePrc", lordrExePrc);
	memcpy(vbscMtchEvntGrpT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscMtchEvntGrpT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrCreDat", lordrCreDat);
	memcpy(vbscMtchEvntGrpT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscMtchEvntGrpT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrCreTim", lordrCreTim);
	memcpy(vbscMtchEvntGrpT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscMtchEvntGrpT.ordrPrioDat[i]= ' ';
	}
	char lordrPrioDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrPrioDat", lordrPrioDat);
	memcpy(vbscMtchEvntGrpT.ordrPrioDat, lordrPrioDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscMtchEvntGrpT.ordrPrioTim[i]= ' ';
	}
	char lordrPrioTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrPrioTim", lordrPrioTim);
	memcpy(vbscMtchEvntGrpT.ordrPrioTim, lordrPrioTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscMtchEvntGrpT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.lstEvntDat", llstEvntDat);
	memcpy(vbscMtchEvntGrpT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscMtchEvntGrpT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.lstEvntTim", llstEvntTim);
	memcpy(vbscMtchEvntGrpT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscMtchEvntGrpT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vbscMtchEvntGrpT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<TRN_ID_SFX_NO_LEN;i++) {
		vbscMtchEvntGrpT.lstEvntTrnIdSfxNo[i]= ' ';
	}
	char llstEvntTrnIdSfxNo[TRN_ID_SFX_NO_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.lstEvntTrnIdSfxNo", llstEvntTrnIdSfxNo);
	memcpy(vbscMtchEvntGrpT.lstEvntTrnIdSfxNo, llstEvntTrnIdSfxNo, TRN_ID_SFX_NO_LEN);

	char llstEvntTrnInd[1] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.lstEvntTrnInd", llstEvntTrnInd);
	vbscMtchEvntGrpT.lstEvntTrnInd = llstEvntTrnInd[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscMtchEvntGrpT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrExpDat", lordrExpDat);
	memcpy(vbscMtchEvntGrpT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lordrSts[1] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrSts", lordrSts);
	vbscMtchEvntGrpT.ordrSts = lordrSts[0];

	for(i=0;i<ORDR_TRN_TYP_ID_LEN;i++) {
		vbscMtchEvntGrpT.ordrTrnTypId[i]= ' ';
	}
	char lordrTrnTypId[ORDR_TRN_TYP_ID_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrTrnTypId", lordrTrnTypId);
	memcpy(vbscMtchEvntGrpT.ordrTrnTypId, lordrTrnTypId, ORDR_TRN_TYP_ID_LEN);

	char lordrPersInd[1] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.ordrPersInd", lordrPersInd);
	vbscMtchEvntGrpT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vbscMtchEvntGrpT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.userOrdrRef", luserOrdrRef);
	memcpy(vbscMtchEvntGrpT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscMtchEvntGrpT.trdMtchQty[i]= ' ';
	}
	char ltrdMtchQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.trdMtchQty", ltrdMtchQty);
	memcpy(vbscMtchEvntGrpT.trdMtchQty, ltrdMtchQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscMtchEvntGrpT.trdMtchPrc[i]= ' ';
	}
	char ltrdMtchPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.trdMtchPrc", ltrdMtchPrc);
	memcpy(vbscMtchEvntGrpT.trdMtchPrc, ltrdMtchPrc, DRIV_PRICE_LEN);

	char lagrsrMtchInd[1] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.agrsrMtchInd", lagrsrMtchInd);
	vbscMtchEvntGrpT.agrsrMtchInd = lagrsrMtchInd[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscMtchEvntGrpT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.bscMtchEvntGrpT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscMtchEvntGrpT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscMtchEvntGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSubSLegMtchEvntBcastT getFutBscSubSLegMtchEvntBcastT(char* testCaseNum , const char *root) {
	futBscSubSLegMtchEvntBcastT vfutBscSubSLegMtchEvntBcastT;
	int i;

	vfutBscSubSLegMtchEvntBcastT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscSubSLegMtchEvntBcastT");
	for(i=0;i<TRD_NO_LEN;i++) {
		vfutBscSubSLegMtchEvntBcastT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.futBscSubSLegMtchEvntBcastT.trdNo", ltrdNo);
	memcpy(vfutBscSubSLegMtchEvntBcastT.trdNo, ltrdNo, TRD_NO_LEN);

	vfutBscSubSLegMtchEvntBcastT.bscMtchEvntGrp = getBscMtchEvntGrpT(testCaseNum, "futBscSubSLegMtchEvntBcastT");	return vfutBscSubSLegMtchEvntBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extMtchEvntGrpT getExtMtchEvntGrpT(char* testCaseNum , const char *root) {
	extMtchEvntGrpT vextMtchEvntGrpT;
	int i;

	vextMtchEvntGrpT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extMtchEvntGrpT");
	vextMtchEvntGrpT.txtGrp = getTxtGrpT(testCaseNum, "extMtchEvntGrpT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vextMtchEvntGrpT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.extMtchEvntGrpT.membClgIdCod", lmembClgIdCod);
	memcpy(vextMtchEvntGrpT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vextMtchEvntGrpT.ordrNoOld[i]= ' ';
	}
	char lordrNoOld[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.extMtchEvntGrpT.ordrNoOld", lordrNoOld);
	memcpy(vextMtchEvntGrpT.ordrNoOld, lordrNoOld, DRIV_ORDR_NO_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_OBO_LEN;i++) {
		vextMtchEvntGrpT.membExchIdCodObo[i]= ' ';
	}
	char lmembExchIdCodObo[MEMB_EXCH_ID_COD_OBO_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.extMtchEvntGrpT.membExchIdCodObo", lmembExchIdCodObo);
	memcpy(vextMtchEvntGrpT.membExchIdCodObo, lmembExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN);

	vextMtchEvntGrpT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "extMtchEvntGrpT");	return vextMtchEvntGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futSubSLegMtchEvntBcastT getFutSubSLegMtchEvntBcastT(char* testCaseNum , const char *root) {
	futSubSLegMtchEvntBcastT vfutSubSLegMtchEvntBcastT;
	int i;

	vfutSubSLegMtchEvntBcastT.prodSeqNoGrp = getProdSeqNoGrpT(testCaseNum, "futSubSLegMtchEvntBcastT");
	vfutSubSLegMtchEvntBcastT.header = getDataHeaderT(testCaseNum, "futSubSLegMtchEvntBcastT");
	vfutSubSLegMtchEvntBcastT.basic = getFutBscSubSLegMtchEvntBcastT(testCaseNum, "futSubSLegMtchEvntBcastT");
	vfutSubSLegMtchEvntBcastT.extension = getExtMtchEvntGrpT(testCaseNum, "futSubSLegMtchEvntBcastT");	return vfutSubSLegMtchEvntBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futSubSLegMtchEvntSubjectT getFutSubSLegMtchEvntSubjectT(char* testCaseNum , const char *root) {
	futSubSLegMtchEvntSubjectT vfutSubSLegMtchEvntSubjectT;
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vfutSubSLegMtchEvntSubjectT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.futSubSLegMtchEvntSubjectT.membId", lmembId);
	memcpy(vfutSubSLegMtchEvntSubjectT.membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutSubSLegMtchEvntSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.futSubSLegMtchEvntSubjectT.prodId", lprodId);
	memcpy(vfutSubSLegMtchEvntSubjectT.prodId, lprodId, PROD_ID_LEN);
	return vfutSubSLegMtchEvntSubjectT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscSubSLegMtchEvntBcastT getOptBscSubSLegMtchEvntBcastT(char* testCaseNum , const char *root) {
	optBscSubSLegMtchEvntBcastT voptBscSubSLegMtchEvntBcastT;
	int i;

	voptBscSubSLegMtchEvntBcastT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscSubSLegMtchEvntBcastT");
	for(i=0;i<TRD_NO_LEN;i++) {
		voptBscSubSLegMtchEvntBcastT.trdNo[i]= ' ';
	}
	char ltrdNo[TRD_NO_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.optBscSubSLegMtchEvntBcastT.trdNo", ltrdNo);
	memcpy(voptBscSubSLegMtchEvntBcastT.trdNo, ltrdNo, TRD_NO_LEN);

	voptBscSubSLegMtchEvntBcastT.bscMtchEvntGrp = getBscMtchEvntGrpT(testCaseNum, "optBscSubSLegMtchEvntBcastT");	return voptBscSubSLegMtchEvntBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optSubSLegMtchEvntBcastT getOptSubSLegMtchEvntBcastT(char* testCaseNum , const char *root) {
	optSubSLegMtchEvntBcastT voptSubSLegMtchEvntBcastT;
	int i;

	voptSubSLegMtchEvntBcastT.prodSeqNoGrp = getProdSeqNoGrpT(testCaseNum, "optSubSLegMtchEvntBcastT");
	voptSubSLegMtchEvntBcastT.header = getDataHeaderT(testCaseNum, "optSubSLegMtchEvntBcastT");
	voptSubSLegMtchEvntBcastT.basic = getOptBscSubSLegMtchEvntBcastT(testCaseNum, "optSubSLegMtchEvntBcastT");
	voptSubSLegMtchEvntBcastT.extension = getExtMtchEvntGrpT(testCaseNum, "optSubSLegMtchEvntBcastT");	return voptSubSLegMtchEvntBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optSubSLegMtchEvntSubjectT getOptSubSLegMtchEvntSubjectT(char* testCaseNum , const char *root) {
	optSubSLegMtchEvntSubjectT voptSubSLegMtchEvntSubjectT;
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		voptSubSLegMtchEvntSubjectT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.optSubSLegMtchEvntSubjectT.membId", lmembId);
	memcpy(voptSubSLegMtchEvntSubjectT.membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		voptSubSLegMtchEvntSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubSLegMtchEvnt.optSubSLegMtchEvntSubjectT.prodId", lprodId);
	memcpy(voptSubSLegMtchEvntSubjectT.prodId, lprodId, PROD_ID_LEN);
	return voptSubSLegMtchEvntSubjectT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscMtchEvntGrpT(bscMtchEvntGrpT actual, bscMtchEvntGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotExeQty, expected.ordrTotExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrTotExeQty not matching. Actual %s but Expected %s", actual.ordrTotExeQty, expected.ordrTotExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioDat, expected.ordrPrioDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrPrioDat not matching. Actual %s but Expected %s", actual.ordrPrioDat, expected.ordrPrioDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioTim, expected.ordrPrioTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrPrioTim not matching. Actual %s but Expected %s", actual.ordrPrioTim, expected.ordrPrioTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdSfxNo, expected.lstEvntTrnIdSfxNo, TRN_ID_SFX_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, lstEvntTrnIdSfxNo not matching. Actual %s but Expected %s", actual.lstEvntTrnIdSfxNo, expected.lstEvntTrnIdSfxNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.lstEvntTrnInd!= expected.lstEvntTrnInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, lstEvntTrnIndnot matching. Actual %d but Expected %d", actual.lstEvntTrnInd, expected.lstEvntTrnInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrSts!= expected.ordrSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrStsnot matching. Actual %d but Expected %d", actual.ordrSts, expected.ordrSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTrnTypId, expected.ordrTrnTypId, ORDR_TRN_TYP_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrTrnTypId not matching. Actual %s but Expected %s", actual.ordrTrnTypId, expected.ordrTrnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchQty, expected.trdMtchQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, trdMtchQty not matching. Actual %s but Expected %s", actual.trdMtchQty, expected.trdMtchQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdMtchPrc, expected.trdMtchPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, trdMtchPrc not matching. Actual %s but Expected %s", actual.trdMtchPrc, expected.trdMtchPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.agrsrMtchInd!= expected.agrsrMtchInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, agrsrMtchIndnot matching. Actual %d but Expected %d", actual.agrsrMtchInd, expected.agrsrMtchInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscMtchEvntGrpT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSubSLegMtchEvntBcastT(futBscSubSLegMtchEvntBcastT actual, futBscSubSLegMtchEvntBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubSLegMtchEvntBcastT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareBscMtchEvntGrpT (actual.bscMtchEvntGrp,expected.bscMtchEvntGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtMtchEvntGrpT(extMtchEvntGrpT actual, extMtchEvntGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extMtchEvntGrpT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoOld, expected.ordrNoOld, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extMtchEvntGrpT, ordrNoOld not matching. Actual %s but Expected %s", actual.ordrNoOld, expected.ordrNoOld);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodObo, expected.membExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extMtchEvntGrpT, membExchIdCodObo not matching. Actual %s but Expected %s", actual.membExchIdCodObo, expected.membExchIdCodObo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutSubSLegMtchEvntBcastT(futSubSLegMtchEvntBcastT actual, futSubSLegMtchEvntBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareProdSeqNoGrpT (actual.prodSeqNoGrp,expected.prodSeqNoGrp, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareFutBscSubSLegMtchEvntBcastT (actual.basic,expected.basic, logMsg);
	compareExtMtchEvntGrpT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutSubSLegMtchEvntSubjectT(futSubSLegMtchEvntSubjectT actual, futSubSLegMtchEvntSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futSubSLegMtchEvntSubjectT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futSubSLegMtchEvntSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscSubSLegMtchEvntBcastT(optBscSubSLegMtchEvntBcastT actual, optBscSubSLegMtchEvntBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	if ( memcmp(actual.trdNo, expected.trdNo, TRD_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscSubSLegMtchEvntBcastT, trdNo not matching. Actual %s but Expected %s", actual.trdNo, expected.trdNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareBscMtchEvntGrpT (actual.bscMtchEvntGrp,expected.bscMtchEvntGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptSubSLegMtchEvntBcastT(optSubSLegMtchEvntBcastT actual, optSubSLegMtchEvntBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareProdSeqNoGrpT (actual.prodSeqNoGrp,expected.prodSeqNoGrp, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareOptBscSubSLegMtchEvntBcastT (actual.basic,expected.basic, logMsg);
	compareExtMtchEvntGrpT (actual.extension,expected.extension, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptSubSLegMtchEvntSubjectT(optSubSLegMtchEvntSubjectT actual, optSubSLegMtchEvntSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optSubSLegMtchEvntSubjectT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optSubSLegMtchEvntSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}

