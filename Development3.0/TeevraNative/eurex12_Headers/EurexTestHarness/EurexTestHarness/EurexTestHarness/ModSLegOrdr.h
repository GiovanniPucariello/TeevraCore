#include <ModSLegOrdr.hxx>
#define BUFFER_SIZE 1000

futModSLegOrdrRequestT *vfutModSLegOrdrRequestT;
futModSLegOrdrResponseT *vfutModSLegOrdrResponseT;
optModSLegOrdrRequestT *voptModSLegOrdrRequestT;
optModSLegOrdrResponseT *voptModSLegOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModSLegOrdrRequestT getFutBscModSLegOrdrRequestT(char* testCaseNum , const char *root) {
	futBscModSLegOrdrRequestT vfutBscModSLegOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrRequestT.buyCod", lbuyCod);
	vfutBscModSLegOrdrRequestT.buyCod = lbuyCod[0];

	vfutBscModSLegOrdrRequestT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscModSLegOrdrRequestT");
	vfutBscModSLegOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscModSLegOrdrRequestT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscModSLegOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscModSLegOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscModSLegOrdrRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrRequestT.ordrQty", lordrQty);
	memcpy(vfutBscModSLegOrdrRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscModSLegOrdrRequestT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrRequestT.ordrTotQty", lordrTotQty);
	memcpy(vfutBscModSLegOrdrRequestT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscModSLegOrdrRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrRequestT.ordrExePrc", lordrExePrc);
	memcpy(vfutBscModSLegOrdrRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscModSLegOrdrRequestT.ordrTrgPrc[i]= ' ';
	}
	char lordrTrgPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrRequestT.ordrTrgPrc", lordrTrgPrc);
	memcpy(vfutBscModSLegOrdrRequestT.ordrTrgPrc, lordrTrgPrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrRequestT.ordrResCod", lordrResCod);
	vfutBscModSLegOrdrRequestT.ordrResCod = lordrResCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscModSLegOrdrRequestT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrRequestT.ordrExpDat", lordrExpDat);
	memcpy(vfutBscModSLegOrdrRequestT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrRequestT.opnClsCod", lopnClsCod);
	vfutBscModSLegOrdrRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModSLegOrdrRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModSLegOrdrRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModSLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtModSLegOrdrRequestT getFutExtModSLegOrdrRequestT(char* testCaseNum , const char *root) {
	futExtModSLegOrdrRequestT vfutExtModSLegOrdrRequestT;
	int i;

	vfutExtModSLegOrdrRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtModSLegOrdrRequestT");
	vfutExtModSLegOrdrRequestT.txtGrp = getTxtGrpT(testCaseNum, "futExtModSLegOrdrRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtModSLegOrdrRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("ModSLegOrdr.futExtModSLegOrdrRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtModSLegOrdrRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	char lprcRsblChkInd[1] = {""};
	getStrProperty("ModSLegOrdr.futExtModSLegOrdrRequestT.prcRsblChkInd", lprcRsblChkInd);
	vfutExtModSLegOrdrRequestT.prcRsblChkInd = lprcRsblChkInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutExtModSLegOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("ModSLegOrdr.futExtModSLegOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(vfutExtModSLegOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);
	return vfutExtModSLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscModSLegOrdrResponseT getFutBscModSLegOrdrResponseT(char* testCaseNum , const char *root) {
	futBscModSLegOrdrResponseT vfutBscModSLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscModSLegOrdrResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrResponseT.ordrNo", lordrNo);
	memcpy(vfutBscModSLegOrdrResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscModSLegOrdrResponseT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrResponseT.ordrExeQty", lordrExeQty);
	memcpy(vfutBscModSLegOrdrResponseT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscModSLegOrdrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModSLegOrdr.futBscModSLegOrdrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscModSLegOrdrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscModSLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtModSLegOrdrResponseT getFutExtModSLegOrdrResponseT(char* testCaseNum , const char *root) {
	futExtModSLegOrdrResponseT vfutExtModSLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtModSLegOrdrResponseT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModSLegOrdr.futExtModSLegOrdrResponseT.ordrBkQty", lordrBkQty);
	memcpy(vfutExtModSLegOrdrResponseT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutExtModSLegOrdrResponseT.ordrCnclQty[i]= ' ';
	}
	char lordrCnclQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModSLegOrdr.futExtModSLegOrdrResponseT.ordrCnclQty", lordrCnclQty);
	memcpy(vfutExtModSLegOrdrResponseT.ordrCnclQty, lordrCnclQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutExtModSLegOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModSLegOrdr.futExtModSLegOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(vfutExtModSLegOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutExtModSLegOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("ModSLegOrdr.futExtModSLegOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(vfutExtModSLegOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutExtModSLegOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("ModSLegOrdr.futExtModSLegOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutExtModSLegOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return vfutExtModSLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModSLegOrdrRequestT getOptBscModSLegOrdrRequestT(char* testCaseNum , const char *root) {
	optBscModSLegOrdrRequestT voptBscModSLegOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("ModSLegOrdr.optBscModSLegOrdrRequestT.buyCod", lbuyCod);
	voptBscModSLegOrdrRequestT.buyCod = lbuyCod[0];

	voptBscModSLegOrdrRequestT.optCntrIdGrp = getOptCntrIdGrpT(testCaseNum, "optBscModSLegOrdrRequestT");
	voptBscModSLegOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "optBscModSLegOrdrRequestT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscModSLegOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModSLegOrdr.optBscModSLegOrdrRequestT.ordrNo", lordrNo);
	memcpy(voptBscModSLegOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscModSLegOrdrRequestT.ordrQty[i]= ' ';
	}
	char lordrQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModSLegOrdr.optBscModSLegOrdrRequestT.ordrQty", lordrQty);
	memcpy(voptBscModSLegOrdrRequestT.ordrQty, lordrQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscModSLegOrdrRequestT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModSLegOrdr.optBscModSLegOrdrRequestT.ordrTotQty", lordrTotQty);
	memcpy(voptBscModSLegOrdrRequestT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		voptBscModSLegOrdrRequestT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("ModSLegOrdr.optBscModSLegOrdrRequestT.ordrExePrc", lordrExePrc);
	memcpy(voptBscModSLegOrdrRequestT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("ModSLegOrdr.optBscModSLegOrdrRequestT.ordrResCod", lordrResCod);
	voptBscModSLegOrdrRequestT.ordrResCod = lordrResCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptBscModSLegOrdrRequestT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModSLegOrdr.optBscModSLegOrdrRequestT.ordrExpDat", lordrExpDat);
	memcpy(voptBscModSLegOrdrRequestT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("ModSLegOrdr.optBscModSLegOrdrRequestT.opnClsCod", lopnClsCod);
	voptBscModSLegOrdrRequestT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscModSLegOrdrRequestT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModSLegOrdr.optBscModSLegOrdrRequestT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscModSLegOrdrRequestT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscModSLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtModSLegOrdrRequestT getOptExtModSLegOrdrRequestT(char* testCaseNum , const char *root) {
	optExtModSLegOrdrRequestT voptExtModSLegOrdrRequestT;
	int i;

	voptExtModSLegOrdrRequestT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "optExtModSLegOrdrRequestT");
	voptExtModSLegOrdrRequestT.txtGrp = getTxtGrpT(testCaseNum, "optExtModSLegOrdrRequestT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		voptExtModSLegOrdrRequestT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("ModSLegOrdr.optExtModSLegOrdrRequestT.membClgIdCod", lmembClgIdCod);
	memcpy(voptExtModSLegOrdrRequestT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	char lprcRsblChkInd[1] = {""};
	getStrProperty("ModSLegOrdr.optExtModSLegOrdrRequestT.prcRsblChkInd", lprcRsblChkInd);
	voptExtModSLegOrdrRequestT.prcRsblChkInd = lprcRsblChkInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		voptExtModSLegOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("ModSLegOrdr.optExtModSLegOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(voptExtModSLegOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);
	return voptExtModSLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optBscModSLegOrdrResponseT getOptBscModSLegOrdrResponseT(char* testCaseNum , const char *root) {
	optBscModSLegOrdrResponseT voptBscModSLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		voptBscModSLegOrdrResponseT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("ModSLegOrdr.optBscModSLegOrdrResponseT.ordrNo", lordrNo);
	memcpy(voptBscModSLegOrdrResponseT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptBscModSLegOrdrResponseT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModSLegOrdr.optBscModSLegOrdrResponseT.ordrExeQty", lordrExeQty);
	memcpy(voptBscModSLegOrdrResponseT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		voptBscModSLegOrdrResponseT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("ModSLegOrdr.optBscModSLegOrdrResponseT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(voptBscModSLegOrdrResponseT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return voptBscModSLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
optExtModSLegOrdrResponseT getOptExtModSLegOrdrResponseT(char* testCaseNum , const char *root) {
	optExtModSLegOrdrResponseT voptExtModSLegOrdrResponseT;
	int i;

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtModSLegOrdrResponseT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModSLegOrdr.optExtModSLegOrdrResponseT.ordrBkQty", lordrBkQty);
	memcpy(voptExtModSLegOrdrResponseT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		voptExtModSLegOrdrResponseT.ordrCnclQty[i]= ' ';
	}
	char lordrCnclQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("ModSLegOrdr.optExtModSLegOrdrResponseT.ordrCnclQty", lordrCnclQty);
	memcpy(voptExtModSLegOrdrResponseT.ordrCnclQty, lordrCnclQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		voptExtModSLegOrdrResponseT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("ModSLegOrdr.optExtModSLegOrdrResponseT.lstEvntDat", llstEvntDat);
	memcpy(voptExtModSLegOrdrResponseT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		voptExtModSLegOrdrResponseT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("ModSLegOrdr.optExtModSLegOrdrResponseT.lstEvntTim", llstEvntTim);
	memcpy(voptExtModSLegOrdrResponseT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		voptExtModSLegOrdrResponseT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("ModSLegOrdr.optExtModSLegOrdrResponseT.lstEvntTrnId", llstEvntTrnId);
	memcpy(voptExtModSLegOrdrResponseT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);
	return voptExtModSLegOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModSLegOrdrRequestT* getFutModSLegOrdrRequestT(char* testCaseNum) {
	vfutModSLegOrdrRequestT = (futModSLegOrdrRequestT*)malloc(sizeof(futModSLegOrdrRequestT));
	int i;

	vfutModSLegOrdrRequestT->header = getDataHeaderT(testCaseNum, "futModSLegOrdrRequestT");
	vfutModSLegOrdrRequestT->basic = getFutBscModSLegOrdrRequestT(testCaseNum, "futModSLegOrdrRequestT");
	vfutModSLegOrdrRequestT->extension = getFutExtModSLegOrdrRequestT(testCaseNum, "futModSLegOrdrRequestT");
	return vfutModSLegOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futModSLegOrdrResponseT* getFutModSLegOrdrResponseT(char* testCaseNum) {
	vfutModSLegOrdrResponseT = (futModSLegOrdrResponseT*)malloc(sizeof(futModSLegOrdrResponseT));
	int i;

	vfutModSLegOrdrResponseT->header = getDataHeaderT(testCaseNum, "futModSLegOrdrResponseT");
	vfutModSLegOrdrResponseT->basic = getFutBscModSLegOrdrResponseT(testCaseNum, "futModSLegOrdrResponseT");
	vfutModSLegOrdrResponseT->extension = getFutExtModSLegOrdrResponseT(testCaseNum, "futModSLegOrdrResponseT");
	return vfutModSLegOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optModSLegOrdrRequestT* getOptModSLegOrdrRequestT(char* testCaseNum) {
	voptModSLegOrdrRequestT = (optModSLegOrdrRequestT*)malloc(sizeof(optModSLegOrdrRequestT));
	int i;

	voptModSLegOrdrRequestT->header = getDataHeaderT(testCaseNum, "optModSLegOrdrRequestT");
	voptModSLegOrdrRequestT->basic = getOptBscModSLegOrdrRequestT(testCaseNum, "optModSLegOrdrRequestT");
	voptModSLegOrdrRequestT->extension = getOptExtModSLegOrdrRequestT(testCaseNum, "optModSLegOrdrRequestT");
	return voptModSLegOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
optModSLegOrdrResponseT* getOptModSLegOrdrResponseT(char* testCaseNum) {
	voptModSLegOrdrResponseT = (optModSLegOrdrResponseT*)malloc(sizeof(optModSLegOrdrResponseT));
	int i;

	voptModSLegOrdrResponseT->header = getDataHeaderT(testCaseNum, "optModSLegOrdrResponseT");
	voptModSLegOrdrResponseT->basic = getOptBscModSLegOrdrResponseT(testCaseNum, "optModSLegOrdrResponseT");
	voptModSLegOrdrResponseT->extension = getOptExtModSLegOrdrResponseT(testCaseNum, "optModSLegOrdrResponseT");
	return voptModSLegOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModSLegOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModSLegOrdrRequestT));
	futModSLegOrdrRequestT *vfutModSLegOrdrRequestT = getFutModSLegOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModSLegOrdrRequestT), (jbyte*) vfutModSLegOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutModSLegOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futModSLegOrdrResponseT));
	futModSLegOrdrResponseT *vfutModSLegOrdrResponseT = getFutModSLegOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futModSLegOrdrResponseT), (jbyte*) vfutModSLegOrdrResponseT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptModSLegOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optModSLegOrdrRequestT));
	optModSLegOrdrRequestT *voptModSLegOrdrRequestT = getOptModSLegOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optModSLegOrdrRequestT), (jbyte*) voptModSLegOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getOptModSLegOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(optModSLegOrdrResponseT));
	optModSLegOrdrResponseT *voptModSLegOrdrResponseT = getOptModSLegOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(optModSLegOrdrResponseT), (jbyte*) voptModSLegOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModSLegOrdrRequestT(futBscModSLegOrdrRequestT actual, futBscModSLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrRequestT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTrgPrc, expected.ordrTrgPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrRequestT, ordrTrgPrc not matching. Actual %s but Expected %s", actual.ordrTrgPrc, expected.ordrTrgPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrRequestT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrRequestT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtModSLegOrdrRequestT(futExtModSLegOrdrRequestT actual, futExtModSLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModSLegOrdrRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModSLegOrdrRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModSLegOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscModSLegOrdrResponseT(futBscModSLegOrdrResponseT actual, futBscModSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrResponseT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscModSLegOrdrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtModSLegOrdrResponseT(futExtModSLegOrdrResponseT actual, futExtModSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModSLegOrdrResponseT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCnclQty, expected.ordrCnclQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModSLegOrdrResponseT, ordrCnclQty not matching. Actual %s but Expected %s", actual.ordrCnclQty, expected.ordrCnclQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModSLegOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModSLegOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtModSLegOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModSLegOrdrRequestT(optBscModSLegOrdrRequestT actual, optBscModSLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModSLegOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareOptCntrIdGrpT (actual.optCntrIdGrp,expected.optCntrIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModSLegOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrQty, expected.ordrQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModSLegOrdrRequestT, ordrQty not matching. Actual %s but Expected %s", actual.ordrQty, expected.ordrQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModSLegOrdrRequestT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModSLegOrdrRequestT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModSLegOrdrRequestT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModSLegOrdrRequestT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModSLegOrdrRequestT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModSLegOrdrRequestT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtModSLegOrdrRequestT(optExtModSLegOrdrRequestT actual, optExtModSLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtModSLegOrdrRequestT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prcRsblChkInd!= expected.prcRsblChkInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtModSLegOrdrRequestT, prcRsblChkIndnot matching. Actual %d but Expected %d", actual.prcRsblChkInd, expected.prcRsblChkInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtModSLegOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptBscModSLegOrdrResponseT(optBscModSLegOrdrResponseT actual, optBscModSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModSLegOrdrResponseT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModSLegOrdrResponseT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optBscModSLegOrdrResponseT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareOptExtModSLegOrdrResponseT(optExtModSLegOrdrResponseT actual, optExtModSLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtModSLegOrdrResponseT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCnclQty, expected.ordrCnclQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtModSLegOrdrResponseT, ordrCnclQty not matching. Actual %s but Expected %s", actual.ordrCnclQty, expected.ordrCnclQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtModSLegOrdrResponseT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtModSLegOrdrResponseT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In optExtModSLegOrdrResponseT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModSLegOrdrRequestT(futModSLegOrdrRequestT actual, futModSLegOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModSLegOrdrRequestT (actual.basic,expected.basic, logMsg);	compareFutExtModSLegOrdrRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutModSLegOrdrResponseT(futModSLegOrdrResponseT actual, futModSLegOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscModSLegOrdrResponseT (actual.basic,expected.basic, logMsg);	compareFutExtModSLegOrdrResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptModSLegOrdrRequestT(optModSLegOrdrRequestT actual, optModSLegOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscModSLegOrdrRequestT (actual.basic,expected.basic, logMsg);	compareOptExtModSLegOrdrRequestT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareOptModSLegOrdrResponseT(optModSLegOrdrResponseT actual, optModSLegOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareOptBscModSLegOrdrResponseT (actual.basic,expected.basic, logMsg);	compareOptExtModSLegOrdrResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModSLegOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModSLegOrdrRequestT *actualData = (futModSLegOrdrRequestT *)msgStruct;
	futModSLegOrdrRequestT* expectedData = getFutModSLegOrdrRequestT(testCaseNum);
	compareFutModSLegOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutModSLegOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futModSLegOrdrResponseT *actualData = (futModSLegOrdrResponseT *)msgStruct;
	futModSLegOrdrResponseT* expectedData = getFutModSLegOrdrResponseT(testCaseNum);
	compareFutModSLegOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptModSLegOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optModSLegOrdrRequestT *actualData = (optModSLegOrdrRequestT *)msgStruct;
	optModSLegOrdrRequestT* expectedData = getOptModSLegOrdrRequestT(testCaseNum);
	compareOptModSLegOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareOptModSLegOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	optModSLegOrdrResponseT *actualData = (optModSLegOrdrResponseT *)msgStruct;
	optModSLegOrdrResponseT* expectedData = getOptModSLegOrdrResponseT(testCaseNum);
	compareOptModSLegOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
