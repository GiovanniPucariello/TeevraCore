#include <SubDLegOrdrConf.hxx>
#define BUFFER_SIZE 1000

futBscSubDLegOrdrConfSubjectT *vfutBscSubDLegOrdrConfSubjectT;
futSubDLegOrdrConfPrivBcastT *vfutSubDLegOrdrConfPrivBcastT;

/**
* @Generated get<<InnerStruct>>()
*
**/
futBscSubDLegOrdrConfPrivBcastT getFutBscSubDLegOrdrConfPrivBcastT(char* testCaseNum , const char *root) {
	futBscSubDLegOrdrConfPrivBcastT vfutBscSubDLegOrdrConfPrivBcastT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.buyCod", lbuyCod);
	vfutBscSubDLegOrdrConfPrivBcastT.buyCod = lbuyCod[0];

	vfutBscSubDLegOrdrConfPrivBcastT.futCntrIdGrp = getFutCntrIdGrpT(testCaseNum, "futBscSubDLegOrdrConfPrivBcastT");
	for(i=0;i<DBL_LEG_TYP_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.dblLegTyp[i]= ' ';
	}
	char ldblLegTyp[DBL_LEG_TYP_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.dblLegTyp", ldblLegTyp);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.dblLegTyp, ldblLegTyp, DBL_LEG_TYP_LEN);

	vfutBscSubDLegOrdrConfPrivBcastT.futCntrId2Grp = getFutCntrId2GrpT(testCaseNum, "futBscSubDLegOrdrConfPrivBcastT");
	vfutBscSubDLegOrdrConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "futBscSubDLegOrdrConfPrivBcastT");
	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.membExchIdCod", lmembExchIdCod);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrNo", lordrNo);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.ordrRmngQty[i]= ' ';
	}
	char lordrRmngQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrRmngQty", lordrRmngQty);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.ordrRmngQty, lordrRmngQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrExeQty", lordrExeQty);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.ordrTotExeQty[i]= ' ';
	}
	char lordrTotExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrTotExeQty", lordrTotExeQty);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.ordrTotExeQty, lordrTotExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrTotQty", lordrTotQty);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrTypCod", lordrTypCod);
	vfutBscSubDLegOrdrConfPrivBcastT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrExePrc", lordrExePrc);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrResCod", lordrResCod);
	vfutBscSubDLegOrdrConfPrivBcastT.ordrResCod = lordrResCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.ordrExpDat[i]= ' ';
	}
	char lordrExpDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrExpDat", lordrExpDat);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.ordrExpDat, lordrExpDat, DRIV_DATE_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.opnClsCod", lopnClsCod);
	vfutBscSubDLegOrdrConfPrivBcastT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrCreDat", lordrCreDat);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrCreTim", lordrCreTim);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.ordrPrioDat[i]= ' ';
	}
	char lordrPrioDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrPrioDat", lordrPrioDat);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.ordrPrioDat, lordrPrioDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.ordrPrioTim[i]= ' ';
	}
	char lordrPrioTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrPrioTim", lordrPrioTim);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.ordrPrioTim, lordrPrioTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.lstEvntDat", llstEvntDat);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.lstEvntTim", llstEvntTim);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_OBO_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.membExchIdCodObo[i]= ' ';
	}
	char lmembExchIdCodObo[MEMB_EXCH_ID_COD_OBO_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.membExchIdCodObo", lmembExchIdCodObo);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.membExchIdCodObo, lmembExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN);

	for(i=0;i<ORDR_TRN_TYP_ID_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.ordrTrnTypId[i]= ' ';
	}
	char lordrTrnTypId[ORDR_TRN_TYP_ID_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.ordrTrnTypId", lordrTrnTypId);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.ordrTrnTypId, lordrTrnTypId, ORDR_TRN_TYP_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vfutBscSubDLegOrdrConfPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vfutBscSubDLegOrdrConfPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vfutBscSubDLegOrdrConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
futExtSubDLegOrdrConfPrivBcastT getFutExtSubDLegOrdrConfPrivBcastT(char* testCaseNum , const char *root) {
	futExtSubDLegOrdrConfPrivBcastT vfutExtSubDLegOrdrConfPrivBcastT;
	int i;

	vfutExtSubDLegOrdrConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "futExtSubDLegOrdrConfPrivBcastT");
	vfutExtSubDLegOrdrConfPrivBcastT.txtGrp = getTxtGrpT(testCaseNum, "futExtSubDLegOrdrConfPrivBcastT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vfutExtSubDLegOrdrConfPrivBcastT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futExtSubDLegOrdrConfPrivBcastT.membClgIdCod", lmembClgIdCod);
	memcpy(vfutExtSubDLegOrdrConfPrivBcastT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vfutExtSubDLegOrdrConfPrivBcastT.ordrNoOld[i]= ' ';
	}
	char lordrNoOld[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futExtSubDLegOrdrConfPrivBcastT.ordrNoOld", lordrNoOld);
	memcpy(vfutExtSubDLegOrdrConfPrivBcastT.ordrNoOld, lordrNoOld, DRIV_ORDR_NO_LEN);

	vfutExtSubDLegOrdrConfPrivBcastT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "futExtSubDLegOrdrConfPrivBcastT");
	char lordrSts[1] = {""};
	getStrProperty("SubDLegOrdrConf.futExtSubDLegOrdrConfPrivBcastT.ordrSts", lordrSts);
	vfutExtSubDLegOrdrConfPrivBcastT.ordrSts = lordrSts[0];

	char lordrPersInd[1] = {""};
	getStrProperty("SubDLegOrdrConf.futExtSubDLegOrdrConfPrivBcastT.ordrPersInd", lordrPersInd);
	vfutExtSubDLegOrdrConfPrivBcastT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vfutExtSubDLegOrdrConfPrivBcastT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futExtSubDLegOrdrConfPrivBcastT.userOrdrRef", luserOrdrRef);
	memcpy(vfutExtSubDLegOrdrConfPrivBcastT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<ETS_SES_ID_LEN;i++) {
		vfutExtSubDLegOrdrConfPrivBcastT.etsSesId[i]= ' ';
	}
	char letsSesId[ETS_SES_ID_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futExtSubDLegOrdrConfPrivBcastT.etsSesId", letsSesId);
	memcpy(vfutExtSubDLegOrdrConfPrivBcastT.etsSesId, letsSesId, ETS_SES_ID_LEN);
	return vfutExtSubDLegOrdrConfPrivBcastT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futBscSubDLegOrdrConfSubjectT* getFutBscSubDLegOrdrConfSubjectT(char* testCaseNum) {
	vfutBscSubDLegOrdrConfSubjectT = (futBscSubDLegOrdrConfSubjectT*)malloc(sizeof(futBscSubDLegOrdrConfSubjectT));
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vfutBscSubDLegOrdrConfSubjectT->membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfSubjectT.membId", lmembId);
	memcpy(vfutBscSubDLegOrdrConfSubjectT->membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vfutBscSubDLegOrdrConfSubjectT->prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubDLegOrdrConf.futBscSubDLegOrdrConfSubjectT.prodId", lprodId);
	memcpy(vfutBscSubDLegOrdrConfSubjectT->prodId, lprodId, PROD_ID_LEN);

	return vfutBscSubDLegOrdrConfSubjectT;
}
/**
* @Generated get<<RootStruct>>()
*
**/
futSubDLegOrdrConfPrivBcastT* getFutSubDLegOrdrConfPrivBcastT(char* testCaseNum) {
	vfutSubDLegOrdrConfPrivBcastT = (futSubDLegOrdrConfPrivBcastT*)malloc(sizeof(futSubDLegOrdrConfPrivBcastT));
	int i;

	vfutSubDLegOrdrConfPrivBcastT->seqNo = getFutBscDLegSeqNoT(testCaseNum, "futSubDLegOrdrConfPrivBcastT");
	vfutSubDLegOrdrConfPrivBcastT->header = getDataHeaderT(testCaseNum, "futSubDLegOrdrConfPrivBcastT");
	vfutSubDLegOrdrConfPrivBcastT->basic = getFutBscSubDLegOrdrConfPrivBcastT(testCaseNum, "futSubDLegOrdrConfPrivBcastT");
	vfutSubDLegOrdrConfPrivBcastT->extension = getFutExtSubDLegOrdrConfPrivBcastT(testCaseNum, "futSubDLegOrdrConfPrivBcastT");
	return vfutSubDLegOrdrConfPrivBcastT;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutBscSubDLegOrdrConfSubjectTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futBscSubDLegOrdrConfSubjectT));
	futBscSubDLegOrdrConfSubjectT *vfutBscSubDLegOrdrConfSubjectT = getFutBscSubDLegOrdrConfSubjectT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futBscSubDLegOrdrConfSubjectT), (jbyte*) vfutBscSubDLegOrdrConfSubjectT);
	return jdatareq;
}

/**
* @Generated get<<RootStructArray>>()
*
**/
jbyteArray getFutSubDLegOrdrConfPrivBcastTArray(JNIEnv *env, char* testCaseNum) {
	jbyteArray jdatareq;
	jdatareq = env->NewByteArray(sizeof(futSubDLegOrdrConfPrivBcastT));
	futSubDLegOrdrConfPrivBcastT *vfutSubDLegOrdrConfPrivBcastT = getFutSubDLegOrdrConfPrivBcastT(testCaseNum);
	env->SetByteArrayRegion(jdatareq, 0, sizeof(futSubDLegOrdrConfPrivBcastT), (jbyte*) vfutSubDLegOrdrConfPrivBcastT);
	return jdatareq;
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutBscSubDLegOrdrConfPrivBcastT(futBscSubDLegOrdrConfPrivBcastT actual, futBscSubDLegOrdrConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrIdGrpT (actual.futCntrIdGrp,expected.futCntrIdGrp, logMsg);
	if ( memcmp(actual.dblLegTyp, expected.dblLegTyp, DBL_LEG_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, dblLegTyp not matching. Actual %s but Expected %s", actual.dblLegTyp, expected.dblLegTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareFutCntrId2GrpT (actual.futCntrId2Grp,expected.futCntrId2Grp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrRmngQty, expected.ordrRmngQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrRmngQty not matching. Actual %s but Expected %s", actual.ordrRmngQty, expected.ordrRmngQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotExeQty, expected.ordrTotExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrTotExeQty not matching. Actual %s but Expected %s", actual.ordrTotExeQty, expected.ordrTotExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExpDat, expected.ordrExpDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrExpDat not matching. Actual %s but Expected %s", actual.ordrExpDat, expected.ordrExpDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioDat, expected.ordrPrioDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrPrioDat not matching. Actual %s but Expected %s", actual.ordrPrioDat, expected.ordrPrioDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioTim, expected.ordrPrioTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrPrioTim not matching. Actual %s but Expected %s", actual.ordrPrioTim, expected.ordrPrioTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodObo, expected.membExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, membExchIdCodObo not matching. Actual %s but Expected %s", actual.membExchIdCodObo, expected.membExchIdCodObo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTrnTypId, expected.ordrTrnTypId, ORDR_TRN_TYP_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, ordrTrnTypId not matching. Actual %s but Expected %s", actual.ordrTrnTypId, expected.ordrTrnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareFutExtSubDLegOrdrConfPrivBcastT(futExtSubDLegOrdrConfPrivBcastT actual, futExtSubDLegOrdrConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegOrdrConfPrivBcastT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoOld, expected.ordrNoOld, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegOrdrConfPrivBcastT, ordrNoOld not matching. Actual %s but Expected %s", actual.ordrNoOld, expected.ordrNoOld);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if (actual.ordrSts!= expected.ordrSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegOrdrConfPrivBcastT, ordrStsnot matching. Actual %d but Expected %d", actual.ordrSts, expected.ordrSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegOrdrConfPrivBcastT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegOrdrConfPrivBcastT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.etsSesId, expected.etsSesId, ETS_SES_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futExtSubDLegOrdrConfPrivBcastT, etsSesId not matching. Actual %s but Expected %s", actual.etsSesId, expected.etsSesId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}



/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutBscSubDLegOrdrConfSubjectT(futBscSubDLegOrdrConfSubjectT actual, futBscSubDLegOrdrConfSubjectT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;

	if (actual.membId!= expected.membId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfSubjectT, membIdnot matching. Actual %d but Expected %d", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.prodId!= expected.prodId) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In futBscSubDLegOrdrConfSubjectT, prodIdnot matching. Actual %d but Expected %d", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStruct>>()
*
**/
void compareFutSubDLegOrdrConfPrivBcastT(futSubDLegOrdrConfPrivBcastT actual, futSubDLegOrdrConfPrivBcastT expected, jbyteArray msg, jbyte* msgStruct, JNIEnv *env, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareFutBscDLegSeqNoT (actual.seqNo,expected.seqNo, logMsg);	compareDataHeaderT (actual.header,expected.header, logMsg);	compareFutBscSubDLegOrdrConfPrivBcastT (actual.basic,expected.basic, logMsg);	compareFutExtSubDLegOrdrConfPrivBcastT (actual.extension,expected.extension, logMsg);
	env->ReleaseByteArrayElements(msg, msgStruct, 0);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutBscSubDLegOrdrConfSubjectTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futBscSubDLegOrdrConfSubjectT *actualData = (futBscSubDLegOrdrConfSubjectT *)msgStruct;
	futBscSubDLegOrdrConfSubjectT* expectedData = getFutBscSubDLegOrdrConfSubjectT(testCaseNum);
	compareFutBscSubDLegOrdrConfSubjectT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}

/**
* @Generated compare<<RootStructArray>>()
*
**/
void compareFutSubDLegOrdrConfPrivBcastTArray(jbyteArray msg, char* testCaseNum, JNIEnv *env, char* logMsg) {
	jbyte* msgStruct = (jbyte*)env->GetByteArrayElements(msg, 0);
	futSubDLegOrdrConfPrivBcastT *actualData = (futSubDLegOrdrConfPrivBcastT *)msgStruct;
	futSubDLegOrdrConfPrivBcastT* expectedData = getFutSubDLegOrdrConfPrivBcastT(testCaseNum);
	compareFutSubDLegOrdrConfPrivBcastT(*actualData, *expectedData, msg, msgStruct, env, logMsg);
}
