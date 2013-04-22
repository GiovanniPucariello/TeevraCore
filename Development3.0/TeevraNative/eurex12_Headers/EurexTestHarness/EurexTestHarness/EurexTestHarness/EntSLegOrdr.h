#include <EntSLegOrdr.hxx>
#define BUFFER_SIZE 1000

futEntSLegOrdrRequestT *vfutEntSLegOrdrRequestT;
futEntSLegOrdrResponseT *vfutEntSLegOrdrResponseT;
optEntSLegOrdrRequestT *voptEntSLegOrdrRequestT;
optEntSLegOrdrResponseT *voptEntSLegOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntSLegOrdrRequestT getFutBscEntSLegOrdrRequestT(char* testCaseNum , const char *root) {
	futBscEntSLegOrdrRequestT vfutBscEntSLegOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntSLegOrdr.futBscEntSLegOrdrRequestT.buyCod", lbuyCod);
	vfutBscEntSLegOrdrRequestT.buyCod = lbuyCod[0];

	vfutBscEntSLegOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscEntSLegOrdrRequestT");
	vfutBscEntSLegOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscEntSLegOrdrRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntSLegOrdrRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegOrdr.futBscEntSLegOrdrRequestT.ordrQty", lordrQty);
	memcpy(vfutBscEntSLegOrdrRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntSLegOrdrRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntSLegOrdr.futBscEntSLegOrdrRequestT.ordrExePrc", lordrExePrc);
	memcpy(vfutBscEntSLegOrdrRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscEntSLegOrdrRequestT.ordrTrgPrc[i]= ' ';
	}
	char lordrTrgPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntSLegOrdr.futBscEntSLegOrdrRequestT.ordrTrgPrc", lordrTrgPrc);
	memcpy(vfutBscEntSLegOrdrRequestT.ordrTrgPrc, lordrTrgPrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("EntSLegOrdr.futBscEntSLegOrdrRequestT.ordrResCod", lordrResCod);
	vfutBscEntSLegOrdrRequestT.ordrResCod = lordrResCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscEntSLegOrdrRequestT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntSLegOrdr.futBscEntSLegOrdrRequestT.ordrExpDat", lordrExpDat);
	memcpy(vfutBscEntSLegOrdrRequestT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntSLegOrdr.futBscEntSLegOrdrRequestT.opnClsCod", lopnClsCod);
	vfutBscEntSLegOrdrRequestT.opnClsCod = lopnClsCod[0];
	return vfutBscEntSLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntSLegOrdrRequestT getFutExtEntSLegOrdrRequestT(char* testCaseNum , const char *root) {
	futExtEntSLegOrdrRequestT vfutExtEntSLegOrdrRequestT;
	int i;

	char lacctTypCod[1] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrRequestT.acctTypCod", lacctTypCod);
	vfutExtEntSLegOrdrRequestT.acctTypCod = lacctTypCod[0];

	char lacctTypNo[1] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrRequestT.acctTypNo", lacctTypNo);
	vfutExtEntSLegOrdrRequestT.acctTypNo = lacctTypNo[0];

	vfutExtEntSLegOrdrRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtEntSLegOrdrRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtEntSLegOrdrRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtEntSLegOrdrRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	char lprcRsblChkInd[1] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrRequestT.prcRsblChkInd", lprcRsblChkInd);
	vfutExtEntSLegOrdrRequestT.prcRsblChkInd = lprcRsblChkInd[0];

	char lordrPersInd[1] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrRequestT.ordrPersInd", lordrPersInd);
	vfutExtEntSLegOrdrRequestT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutExtEntSLegOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(vfutExtEntSLegOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<ETS_SES_ID_LEN;i++) {
		vfutExtEntSLegOrdrRequestT.etsSesId[i]= ' ';
	}
	char letsSesId[ETS_SES_ID_LEN] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrRequestT.etsSesId", letsSesId);
	memcpy(vfutExtEntSLegOrdrRequestT.etsSesId, letsSesId, ETS_SES_ID_LEN);
	return vfutExtEntSLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscEntSLegOrdrResponseT getFutBscEntSLegOrdrResponseT(char* testCaseNum , const char *root) {
	futBscEntSLegOrdrResponseT vfutBscEntSLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscEntSLegOrdrResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntSLegOrdr.futBscEntSLegOrdrResponseT.ordrNo", lordrNo);
	memcpy(vfutBscEntSLegOrdrResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscEntSLegOrdrResponseT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegOrdr.futBscEntSLegOrdrResponseT.ordrExeQty", lordrExeQty);
	memcpy(vfutBscEntSLegOrdrResponseT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscEntSLegOrdrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntSLegOrdr.futBscEntSLegOrdrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscEntSLegOrdrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscEntSLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtEntSLegOrdrResponseT getFutExtEntSLegOrdrResponseT(char* testCaseNum , const char *root) {
	futExtEntSLegOrdrResponseT vfutExtEntSLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtEntSLegOrdrResponseT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrResponseT.ordrBkQty", lordrBkQty);
	memcpy(vfutExtEntSLegOrdrResponseT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtEntSLegOrdrResponseT.ordrCnclQty[i]= ' ';
	}
	char lordrCnclQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrResponseT.ordrCnclQty", lordrCnclQty);
	memcpy(vfutExtEntSLegOrdrResponseT.ordrCnclQty, lordrCnclQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtEntSLegOrdrResponseT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrResponseT.ordrCreDat", lordrCreDat);
	memcpy(vfutExtEntSLegOrdrResponseT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtEntSLegOrdrResponseT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrResponseT.ordrCreTim", lordrCreTim);
	memcpy(vfutExtEntSLegOrdrResponseT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtEntSLegOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(vfutExtEntSLegOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtEntSLegOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(vfutExtEntSLegOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutExtEntSLegOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("EntSLegOrdr.futExtEntSLegOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutExtEntSLegOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vfutExtEntSLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntSLegOrdrRequestT getOptBscEntSLegOrdrRequestT(char* testCaseNum , const char *root) {
	optBscEntSLegOrdrRequestT voptBscEntSLegOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("EntSLegOrdr.optBscEntSLegOrdrRequestT.buyCod", lbuyCod);
	voptBscEntSLegOrdrRequestT.buyCod = lbuyCod[0];

	voptBscEntSLegOrdrRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscEntSLegOrdrRequestT");
	voptBscEntSLegOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscEntSLegOrdrRequestT");
	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntSLegOrdrRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegOrdr.optBscEntSLegOrdrRequestT.ordrQty", lordrQty);
	memcpy(voptBscEntSLegOrdrRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscEntSLegOrdrRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("EntSLegOrdr.optBscEntSLegOrdrRequestT.ordrExePrc", lordrExePrc);
	memcpy(voptBscEntSLegOrdrRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("EntSLegOrdr.optBscEntSLegOrdrRequestT.ordrResCod", lordrResCod);
	voptBscEntSLegOrdrRequestT.ordrResCod = lordrResCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscEntSLegOrdrRequestT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntSLegOrdr.optBscEntSLegOrdrRequestT.ordrExpDat", lordrExpDat);
	memcpy(voptBscEntSLegOrdrRequestT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("EntSLegOrdr.optBscEntSLegOrdrRequestT.opnClsCod", lopnClsCod);
	voptBscEntSLegOrdrRequestT.opnClsCod = lopnClsCod[0];
	return voptBscEntSLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntSLegOrdrRequestT getOptExtEntSLegOrdrRequestT(char* testCaseNum , const char *root) {
	optExtEntSLegOrdrRequestT voptExtEntSLegOrdrRequestT;
	int i;

	char lacctTypCod[1] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrRequestT.acctTypCod", lacctTypCod);
	voptExtEntSLegOrdrRequestT.acctTypCod = lacctTypCod[0];

	char lacctTypNo[1] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrRequestT.acctTypNo", lacctTypNo);
	voptExtEntSLegOrdrRequestT.acctTypNo = lacctTypNo[0];

	voptExtEntSLegOrdrRequestT.txtGrp = getTxtGrpT(testCaseNum, "optExtEntSLegOrdrRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptExtEntSLegOrdrRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptExtEntSLegOrdrRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	char lprcRsblChkInd[1] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrRequestT.prcRsblChkInd", lprcRsblChkInd);
	voptExtEntSLegOrdrRequestT.prcRsblChkInd = lprcRsblChkInd[0];

	char lordrPersInd[1] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrRequestT.ordrPersInd", lordrPersInd);
	voptExtEntSLegOrdrRequestT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		voptExtEntSLegOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(voptExtEntSLegOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<ETS_SES_ID_LEN;i++) {
		voptExtEntSLegOrdrRequestT.etsSesId[i]= ' ';
	}
	char letsSesId[ETS_SES_ID_LEN] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrRequestT.etsSesId", letsSesId);
	memcpy(voptExtEntSLegOrdrRequestT.etsSesId, letsSesId, ETS_SES_ID_LEN);
	return voptExtEntSLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscEntSLegOrdrResponseT getOptBscEntSLegOrdrResponseT(char* testCaseNum , const char *root) {
	optBscEntSLegOrdrResponseT voptBscEntSLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscEntSLegOrdrResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("EntSLegOrdr.optBscEntSLegOrdrResponseT.ordrNo", lordrNo);
	memcpy(voptBscEntSLegOrdrResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscEntSLegOrdrResponseT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegOrdr.optBscEntSLegOrdrResponseT.ordrExeQty", lordrExeQty);
	memcpy(voptBscEntSLegOrdrResponseT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscEntSLegOrdrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("EntSLegOrdr.optBscEntSLegOrdrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscEntSLegOrdrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscEntSLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtEntSLegOrdrResponseT getOptExtEntSLegOrdrResponseT(char* testCaseNum , const char *root) {
	optExtEntSLegOrdrResponseT voptExtEntSLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtEntSLegOrdrResponseT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrResponseT.ordrBkQty", lordrBkQty);
	memcpy(voptExtEntSLegOrdrResponseT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtEntSLegOrdrResponseT.ordrCnclQty[i]= ' ';
	}
	char lordrCnclQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrResponseT.ordrCnclQty", lordrCnclQty);
	memcpy(voptExtEntSLegOrdrResponseT.ordrCnclQty, lordrCnclQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptExtEntSLegOrdrResponseT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrResponseT.ordrCreDat", lordrCreDat);
	memcpy(voptExtEntSLegOrdrResponseT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptExtEntSLegOrdrResponseT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrResponseT.ordrCreTim", lordrCreTim);
	memcpy(voptExtEntSLegOrdrResponseT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptExtEntSLegOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(voptExtEntSLegOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptExtEntSLegOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(voptExtEntSLegOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptExtEntSLegOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("EntSLegOrdr.optExtEntSLegOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(voptExtEntSLegOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return voptExtEntSLegOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntSLegOrdrRequestT* getFutEntSLegOrdrRequestT(char* testCaseNum) {
	vfutEntSLegOrdrRequestT = (futEntSLegOrdrRequestT*)malloc(sizeof(futEntSLegOrdrRequestT));
	int i;

	vfutEntSLegOrdrRequestT->header = getDataHeaderT(testCaseNum, "futEntSLegOrdrRequestT");
	vfutEntSLegOrdrRequestT->basic = getFutBscEntSLegOrdrRequestT(testCaseNum, "futEntSLegOrdrRequestT");
	vfutEntSLegOrdrRequestT->extension = getFutExtEntSLegOrdrRequestT(testCaseNum, "futEntSLegOrdrRequestT");
	return vfutEntSLegOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futEntSLegOrdrResponseT* getFutEntSLegOrdrResponseT(char* testCaseNum) {
	vfutEntSLegOrdrResponseT = (futEntSLegOrdrResponseT*)malloc(sizeof(futEntSLegOrdrResponseT));
	int i;

	vfutEntSLegOrdrResponseT->header = getDataHeaderT(testCaseNum, "futEntSLegOrdrResponseT");
	vfutEntSLegOrdrResponseT->basic = getFutBscEntSLegOrdrResponseT(testCaseNum, "futEntSLegOrdrResponseT");
	vfutEntSLegOrdrResponseT->extension = getFutExtEntSLegOrdrResponseT(testCaseNum, "futEntSLegOrdrResponseT");
	return vfutEntSLegOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntSLegOrdrRequestT* getOptEntSLegOrdrRequestT(char* testCaseNum) {
	voptEntSLegOrdrRequestT = (optEntSLegOrdrRequestT*)malloc(sizeof(optEntSLegOrdrRequestT));
	int i;

	voptEntSLegOrdrRequestT->header = getDataHeaderT(testCaseNum, "optEntSLegOrdrRequestT");
	voptEntSLegOrdrRequestT->basic = getOptBscEntSLegOrdrRequestT(testCaseNum, "optEntSLegOrdrRequestT");
	voptEntSLegOrdrRequestT->extension = getOptExtEntSLegOrdrRequestT(testCaseNum, "optEntSLegOrdrRequestT");
	return voptEntSLegOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optEntSLegOrdrResponseT* getOptEntSLegOrdrResponseT(char* testCaseNum) {
	voptEntSLegOrdrResponseT = (optEntSLegOrdrResponseT*)malloc(sizeof(optEntSLegOrdrResponseT));
	int i;

	voptEntSLegOrdrResponseT->header = getDataHeaderT(testCaseNum, "optEntSLegOrdrResponseT");
	voptEntSLegOrdrResponseT->basic = getOptBscEntSLegOrdrResponseT(testCaseNum, "optEntSLegOrdrResponseT");
	voptEntSLegOrdrResponseT->extension = getOptExtEntSLegOrdrResponseT(testCaseNum, "optEntSLegOrdrResponseT");
	return voptEntSLegOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntSLegOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntSLegOrdrRequestT));
	futEntSLegOrdrRequestT *vfutEntSLegOrdrRequestT = getFutEntSLegOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntSLegOrdrRequestT), (jbyte*) vfutEntSLegOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutEntSLegOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futEntSLegOrdrResponseT));
	futEntSLegOrdrResponseT *vfutEntSLegOrdrResponseT = getFutEntSLegOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futEntSLegOrdrResponseT), (jbyte*) vfutEntSLegOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntSLegOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntSLegOrdrRequestT));
	optEntSLegOrdrRequestT *voptEntSLegOrdrRequestT = getOptEntSLegOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntSLegOrdrRequestT), (jbyte*) voptEntSLegOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptEntSLegOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optEntSLegOrdrResponseT));
	optEntSLegOrdrResponseT *voptEntSLegOrdrResponseT = getOptEntSLegOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optEntSLegOrdrResponseT), (jbyte*) voptEntSLegOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntSLegOrdrRequestT(futBscEntSLegOrdrRequestT actual, futBscEntSLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegOrdrRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegOrdrRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTrgPrc, expected.ordrTrgPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegOrdrRequestT, ordrTrgPrc not matching. Actual %s but Expected %s", actual.ordrTrgPrc, expected.ordrTrgPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegOrdrRequestT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegOrdrRequestT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntSLegOrdrRequestT(futExtEntSLegOrdrRequestT actual, futExtEntSLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.acctTypCod!= expected.acctTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrRequestT, acctTypCodnot matching. Actual %d but Expected %d", actual.acctTypCod, expected.acctTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.acctTypNo!= expected.acctTypNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrRequestT, acctTypNonot matching. Actual %d but Expected %d", actual.acctTypNo, expected.acctTypNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrRequestT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.etsSesId, expected.etsSesId, ETS_SES_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrRequestT, etsSesId not matching. Actual %s but Expected %s", actual.etsSesId, expected.etsSesId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscEntSLegOrdrResponseT(futBscEntSLegOrdrResponseT actual, futBscEntSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegOrdrResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegOrdrResponseT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscEntSLegOrdrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtEntSLegOrdrResponseT(futExtEntSLegOrdrResponseT actual, futExtEntSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrResponseT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCnclQty, expected.ordrCnclQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrResponseT, ordrCnclQty not matching. Actual %s but Expected %s", actual.ordrCnclQty, expected.ordrCnclQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrResponseT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrResponseT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtEntSLegOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntSLegOrdrRequestT(optBscEntSLegOrdrRequestT actual, optBscEntSLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegOrdrRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegOrdrRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegOrdrRequestT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegOrdrRequestT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntSLegOrdrRequestT(optExtEntSLegOrdrRequestT actual, optExtEntSLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.acctTypCod!= expected.acctTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrRequestT, acctTypCodnot matching. Actual %d but Expected %d", actual.acctTypCod, expected.acctTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.acctTypNo!= expected.acctTypNo) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrRequestT, acctTypNonot matching. Actual %d but Expected %d", actual.acctTypNo, expected.acctTypNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrRequestT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.etsSesId, expected.etsSesId, ETS_SES_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrRequestT, etsSesId not matching. Actual %s but Expected %s", actual.etsSesId, expected.etsSesId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscEntSLegOrdrResponseT(optBscEntSLegOrdrResponseT actual, optBscEntSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegOrdrResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegOrdrResponseT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscEntSLegOrdrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtEntSLegOrdrResponseT(optExtEntSLegOrdrResponseT actual, optExtEntSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrResponseT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCnclQty, expected.ordrCnclQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrResponseT, ordrCnclQty not matching. Actual %s but Expected %s", actual.ordrCnclQty, expected.ordrCnclQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrResponseT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrResponseT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtEntSLegOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntSLegOrdrRequestT(futEntSLegOrdrRequestT actual, futEntSLegOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntSLegOrdrRequestT (actual.basic,expected.basic, logMsg);	compareFutExtEntSLegOrdrRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutEntSLegOrdrResponseT(futEntSLegOrdrResponseT actual, futEntSLegOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscEntSLegOrdrResponseT (actual.basic,expected.basic, logMsg);	compareFutExtEntSLegOrdrResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntSLegOrdrRequestT(optEntSLegOrdrRequestT actual, optEntSLegOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntSLegOrdrRequestT (actual.basic,expected.basic, logMsg);	compareOptExtEntSLegOrdrRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptEntSLegOrdrResponseT(optEntSLegOrdrResponseT actual, optEntSLegOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscEntSLegOrdrResponseT (actual.basic,expected.basic, logMsg);	compareOptExtEntSLegOrdrResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntSLegOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntSLegOrdrRequestT *actualData = (futEntSLegOrdrRequestT *)msgStruct;
	futEntSLegOrdrRequestT* expectedData = getFutEntSLegOrdrRequestT(testCaseNum);
	compareFutEntSLegOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutEntSLegOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futEntSLegOrdrResponseT *actualData = (futEntSLegOrdrResponseT *)msgStruct;
	futEntSLegOrdrResponseT* expectedData = getFutEntSLegOrdrResponseT(testCaseNum);
	compareFutEntSLegOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntSLegOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntSLegOrdrRequestT *actualData = (optEntSLegOrdrRequestT *)msgStruct;
	optEntSLegOrdrRequestT* expectedData = getOptEntSLegOrdrRequestT(testCaseNum);
	compareOptEntSLegOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptEntSLegOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optEntSLegOrdrResponseT *actualData = (optEntSLegOrdrResponseT *)msgStruct;
	optEntSLegOrdrResponseT* expectedData = getOptEntSLegOrdrResponseT(testCaseNum);
	compareOptEntSLegOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
