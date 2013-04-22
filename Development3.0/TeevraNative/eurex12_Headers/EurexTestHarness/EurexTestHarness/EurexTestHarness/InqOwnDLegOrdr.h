#include <InqOwnDLegOrdr.hxx>
#define BUFFER_SIZE 1000

futInqOwnDLegOrdrRequestT *vfutInqOwnDLegOrdrRequestT;
futInqOwnDLegOrdrResponseT *vfutInqOwnDLegOrdrResponseT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnDLegOrdrGrpT getFutBscInqOwnDLegOrdrGrpT(char* testCaseNum , const char *root) {
	futBscInqOwnDLegOrdrGrpT vfutBscInqOwnDLegOrdrGrpT;
	int i;

	vfutBscInqOwnDLegOrdrGrpT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqOwnDLegOrdrGrpT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscInqOwnDLegOrdrGrpT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrGrpT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscInqOwnDLegOrdrGrpT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscInqOwnDLegOrdrGrpT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscInqOwnDLegOrdrGrpT");	return vfutBscInqOwnDLegOrdrGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnDLegOrdrRequestT getFutBscInqOwnDLegOrdrRequestT(char* testCaseNum , const char *root) {
	futBscInqOwnDLegOrdrRequestT vfutBscInqOwnDLegOrdrRequestT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRequestT.buyCod", lbuyCod);
	vfutBscInqOwnDLegOrdrRequestT.buyCod = lbuyCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqOwnDLegOrdrRequestT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRequestT.ordrNo", lordrNo);
	memcpy(vfutBscInqOwnDLegOrdrRequestT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	vfutBscInqOwnDLegOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqOwnDLegOrdrRequestT");
	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutBscInqOwnDLegOrdrRequestT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRequestT.userOrdrRef", luserOrdrRef);
	memcpy(vfutBscInqOwnDLegOrdrRequestT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<MLI_CNTR_DATA_CTR_LEN;i++) {
		vfutBscInqOwnDLegOrdrRequestT.mliCntrDataCtr[i]= ' ';
	}
	char lmliCntrDataCtr[MLI_CNTR_DATA_CTR_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRequestT.mliCntrDataCtr", lmliCntrDataCtr);
	memcpy(vfutBscInqOwnDLegOrdrRequestT.mliCntrDataCtr, lmliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqOwnDLegOrdrRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqOwnDLegOrdrRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vfutBscInqOwnDLegOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnDLegOrdrRecT getFutBscInqOwnDLegOrdrRecT(char* testCaseNum , const char *root) {
	futBscInqOwnDLegOrdrRecT vfutBscInqOwnDLegOrdrRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.buyCod", lbuyCod);
	vfutBscInqOwnDLegOrdrRecT.buyCod = lbuyCod[0];

	vfutBscInqOwnDLegOrdrRecT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscInqOwnDLegOrdrRecT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscInqOwnDLegOrdrRecT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscInqOwnDLegOrdrRecT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscInqOwnDLegOrdrRecT");
	vfutBscInqOwnDLegOrdrRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscInqOwnDLegOrdrRecT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrNo", lordrNo);
	memcpy(vfutBscInqOwnDLegOrdrRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrBkQty", lordrBkQty);
	memcpy(vfutBscInqOwnDLegOrdrRecT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrExeQty", lordrExeQty);
	memcpy(vfutBscInqOwnDLegOrdrRecT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.ordrTotExeQty[i]= ' ';
	}
	char lordrTotExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrTotExeQty", lordrTotExeQty);
	memcpy(vfutBscInqOwnDLegOrdrRecT.ordrTotExeQty, lordrTotExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrTotQty", lordrTotQty);
	memcpy(vfutBscInqOwnDLegOrdrRecT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrTypCod", lordrTypCod);
	vfutBscInqOwnDLegOrdrRecT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrExePrc", lordrExePrc);
	memcpy(vfutBscInqOwnDLegOrdrRecT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrExpDat", lordrExpDat);
	memcpy(vfutBscInqOwnDLegOrdrRecT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lordrSts[1] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrSts", lordrSts);
	vfutBscInqOwnDLegOrdrRecT.ordrSts = lordrSts[0];

	char lopnClsCod[1] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.opnClsCod", lopnClsCod);
	vfutBscInqOwnDLegOrdrRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrCreDat", lordrCreDat);
	memcpy(vfutBscInqOwnDLegOrdrRecT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrCreTim", lordrCreTim);
	memcpy(vfutBscInqOwnDLegOrdrRecT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.ordrPrioDat[i]= ' ';
	}
	char lordrPrioDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrPrioDat", lordrPrioDat);
	memcpy(vfutBscInqOwnDLegOrdrRecT.ordrPrioDat, lordrPrioDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.ordrPrioTim[i]= ' ';
	}
	char lordrPrioTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.ordrPrioTim", lordrPrioTim);
	memcpy(vfutBscInqOwnDLegOrdrRecT.ordrPrioTim, lordrPrioTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.lstEvntDat", llstEvntDat);
	memcpy(vfutBscInqOwnDLegOrdrRecT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.lstEvntTim", llstEvntTim);
	memcpy(vfutBscInqOwnDLegOrdrRecT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutBscInqOwnDLegOrdrRecT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_OBO_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.membExchIdCodObo[i]= ' ';
	}
	char lmembExchIdCodObo[MEMB_EXCH_ID_COD_OBO_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.membExchIdCodObo", lmembExchIdCodObo);
	memcpy(vfutBscInqOwnDLegOrdrRecT.membExchIdCodObo, lmembExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscInqOwnDLegOrdrRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscInqOwnDLegOrdrRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscInqOwnDLegOrdrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscInqOwnDLegOrdrResponseT getFutBscInqOwnDLegOrdrResponseT(char* testCaseNum , const char *root) {
	futBscInqOwnDLegOrdrResponseT vfutBscInqOwnDLegOrdrResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vfutBscInqOwnDLegOrdrResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vfutBscInqOwnDLegOrdrResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vfutBscInqOwnDLegOrdrResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futBscInqOwnDLegOrdrResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vfutBscInqOwnDLegOrdrResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vfutBscInqOwnDLegOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqOwnDLegOrdrRecT getFutExtInqOwnDLegOrdrRecT(char* testCaseNum , const char *root) {
	futExtInqOwnDLegOrdrRecT vfutExtInqOwnDLegOrdrRecT;
	int i;

	vfutExtInqOwnDLegOrdrRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtInqOwnDLegOrdrRecT");
	vfutExtInqOwnDLegOrdrRecT.txtGrp = getTxtGrpT(testCaseNum, "futExtInqOwnDLegOrdrRecT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtInqOwnDLegOrdrRecT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futExtInqOwnDLegOrdrRecT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtInqOwnDLegOrdrRecT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	vfutExtInqOwnDLegOrdrRecT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "futExtInqOwnDLegOrdrRecT");
	char lordrPersInd[1] = {""};
	getStrProperty("InqOwnDLegOrdr.futExtInqOwnDLegOrdrRecT.ordrPersInd", lordrPersInd);
	vfutExtInqOwnDLegOrdrRecT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutExtInqOwnDLegOrdrRecT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futExtInqOwnDLegOrdrRecT.userOrdrRef", luserOrdrRef);
	memcpy(vfutExtInqOwnDLegOrdrRecT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<ETS_SES_ID_LEN;i++) {
		vfutExtInqOwnDLegOrdrRecT.etsSesId[i]= ' ';
	}
	char letsSesId[ETS_SES_ID_LEN] = {""};
	getStrProperty("InqOwnDLegOrdr.futExtInqOwnDLegOrdrRecT.etsSesId", letsSesId);
	memcpy(vfutExtInqOwnDLegOrdrRecT.etsSesId, letsSesId, ETS_SES_ID_LEN);
	return vfutExtInqOwnDLegOrdrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtInqOwnDLegOrdrResponseT getFutExtInqOwnDLegOrdrResponseT(char* testCaseNum , const char *root) {
	futExtInqOwnDLegOrdrResponseT vfutExtInqOwnDLegOrdrResponseT;
	int i;
	return vfutExtInqOwnDLegOrdrResponseT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqOwnDLegOrdrRequestT* getFutInqOwnDLegOrdrRequestT(char* testCaseNum) {
	vfutInqOwnDLegOrdrRequestT = (futInqOwnDLegOrdrRequestT*)malloc(sizeof(futInqOwnDLegOrdrRequestT));
	int i;

	vfutInqOwnDLegOrdrRequestT->header = getDataHeaderT(testCaseNum, "futInqOwnDLegOrdrRequestT");
	vfutInqOwnDLegOrdrRequestT->basic = getFutBscInqOwnDLegOrdrRequestT(testCaseNum, "futInqOwnDLegOrdrRequestT");
	return vfutInqOwnDLegOrdrRequestT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futInqOwnDLegOrdrResponseT* getFutInqOwnDLegOrdrResponseT(char* testCaseNum) {
	vfutInqOwnDLegOrdrResponseT = (futInqOwnDLegOrdrResponseT*)malloc(sizeof(futInqOwnDLegOrdrResponseT));
	int i;

	vfutInqOwnDLegOrdrResponseT->header = getDataHeaderT(testCaseNum, "futInqOwnDLegOrdrResponseT");
	vfutInqOwnDLegOrdrResponseT->basic = getFutBscInqOwnDLegOrdrResponseT(testCaseNum, "futInqOwnDLegOrdrResponseT");
	vfutInqOwnDLegOrdrResponseT->extension = getFutExtInqOwnDLegOrdrResponseT(testCaseNum, "futInqOwnDLegOrdrResponseT");
	return vfutInqOwnDLegOrdrResponseT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqOwnDLegOrdrRequestTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqOwnDLegOrdrRequestT));
	futInqOwnDLegOrdrRequestT *vfutInqOwnDLegOrdrRequestT = getFutInqOwnDLegOrdrRequestT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqOwnDLegOrdrRequestT), (jbyte*) vfutInqOwnDLegOrdrRequestT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutInqOwnDLegOrdrResponseTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futInqOwnDLegOrdrResponseT));
	futInqOwnDLegOrdrResponseT *vfutInqOwnDLegOrdrResponseT = getFutInqOwnDLegOrdrResponseT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futInqOwnDLegOrdrResponseT), (jbyte*) vfutInqOwnDLegOrdrResponseT);
	return jdatareq;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnDLegOrdrGrpT(futBscInqOwnDLegOrdrGrpT actual, futBscInqOwnDLegOrdrGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrGrpT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnDLegOrdrRequestT(futBscInqOwnDLegOrdrRequestT actual, futBscInqOwnDLegOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_BSC_INQ_OWN_D_LEG_ORDR_GRP_MAX;i++) {
		compareFutBscInqOwnDLegOrdrGrpT (actual.futBscInqOwnDLegOrdrGrp[i],expected.futBscInqOwnDLegOrdrGrp[i], logMsg);
	}
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRequestT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRequestT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRequestT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliCntrDataCtr, expected.mliCntrDataCtr, MLI_CNTR_DATA_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRequestT, mliCntrDataCtr not matching. Actual %s but Expected %s", actual.mliCntrDataCtr, expected.mliCntrDataCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnDLegOrdrRecT(futBscInqOwnDLegOrdrRecT actual, futBscInqOwnDLegOrdrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotExeQty, expected.ordrTotExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrTotExeQty not matching. Actual %s but Expected %s", actual.ordrTotExeQty, expected.ordrTotExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrSts!= expected.ordrSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrStsnot matching. Actual %d but Expected %d", actual.ordrSts, expected.ordrSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioDat, expected.ordrPrioDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrPrioDat not matching. Actual %s but Expected %s", actual.ordrPrioDat, expected.ordrPrioDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioTim, expected.ordrPrioTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, ordrPrioTim not matching. Actual %s but Expected %s", actual.ordrPrioTim, expected.ordrPrioTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodObo, expected.membExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, membExchIdCodObo not matching. Actual %s but Expected %s", actual.membExchIdCodObo, expected.membExchIdCodObo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscInqOwnDLegOrdrResponseT(futBscInqOwnDLegOrdrResponseT actual, futBscInqOwnDLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscInqOwnDLegOrdrResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < FUT_BSC_INQ_OWN_D_LEG_ORDR_REC_MAX;i++) {
		compareFutBscInqOwnDLegOrdrRecT (actual.futBscInqOwnDLegOrdrRec[i],expected.futBscInqOwnDLegOrdrRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqOwnDLegOrdrRecT(futExtInqOwnDLegOrdrRecT actual, futExtInqOwnDLegOrdrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnDLegOrdrRecT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnDLegOrdrRecT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnDLegOrdrRecT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.etsSesId, expected.etsSesId, ETS_SES_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtInqOwnDLegOrdrRecT, etsSesId not matching. Actual %s but Expected %s", actual.etsSesId, expected.etsSesId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtInqOwnDLegOrdrResponseT(futExtInqOwnDLegOrdrResponseT actual, futExtInqOwnDLegOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < FUT_EXT_INQ_OWN_D_LEG_ORDR_REC_MAX;i++) {
		compareFutExtInqOwnDLegOrdrRecT (actual.futExtInqOwnDLegOrdrRec[i],expected.futExtInqOwnDLegOrdrRec[i], logMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqOwnDLegOrdrRequestT(futInqOwnDLegOrdrRequestT actual, futInqOwnDLegOrdrRequestT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqOwnDLegOrdrRequestT (actual.basic,expected.basic, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutInqOwnDLegOrdrResponseT(futInqOwnDLegOrdrResponseT actual, futInqOwnDLegOrdrResponseT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscInqOwnDLegOrdrResponseT (actual.basic,expected.basic, logMsg);	compareFutExtInqOwnDLegOrdrResponseT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqOwnDLegOrdrRequestTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqOwnDLegOrdrRequestT *actualData = (futInqOwnDLegOrdrRequestT *)msgStruct;
	futInqOwnDLegOrdrRequestT* expectedData = getFutInqOwnDLegOrdrRequestT(testCaseNum);
	compareFutInqOwnDLegOrdrRequestT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutInqOwnDLegOrdrResponseTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futInqOwnDLegOrdrResponseT *actualData = (futInqOwnDLegOrdrResponseT *)msgStruct;
	futInqOwnDLegOrdrResponseT* expectedData = getFutInqOwnDLegOrdrResponseT(testCaseNum);
	compareFutInqOwnDLegOrdrResponseT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
