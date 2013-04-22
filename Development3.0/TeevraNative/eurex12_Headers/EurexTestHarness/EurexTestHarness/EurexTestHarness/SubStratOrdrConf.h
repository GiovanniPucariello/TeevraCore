#include <SubStratOrdrConf.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubStratOrdrConfSubjectT getBscSubStratOrdrConfSubjectT(char* testCaseNum , const char *root) {
	bscSubStratOrdrConfSubjectT vbscSubStratOrdrConfSubjectT;
	int i;

	for(i=0;i<MEMB_ID_LEN;i++) {
		vbscSubStratOrdrConfSubjectT.membId[i]= ' ';
	}
	char lmembId[MEMB_ID_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfSubjectT.membId", lmembId);
	memcpy(vbscSubStratOrdrConfSubjectT.membId, lmembId, MEMB_ID_LEN);

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscSubStratOrdrConfSubjectT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfSubjectT.prodId", lprodId);
	memcpy(vbscSubStratOrdrConfSubjectT.prodId, lprodId, PROD_ID_LEN);
	return vbscSubStratOrdrConfSubjectT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscSubStratOrdrConfPrivBcastT getBscSubStratOrdrConfPrivBcastT(char* testCaseNum , const char *root) {
	bscSubStratOrdrConfPrivBcastT vbscSubStratOrdrConfPrivBcastT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.buyCod", lbuyCod);
	vbscSubStratOrdrConfPrivBcastT.buyCod = lbuyCod[0];

	vbscSubStratOrdrConfPrivBcastT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscSubStratOrdrConfPrivBcastT");
	for(i=0;i<MEMB_EXCH_ID_COD_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.membExchIdCod[i]= ' ';
	}
	char lmembExchIdCod[MEMB_EXCH_ID_COD_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.membExchIdCod", lmembExchIdCod);
	memcpy(vbscSubStratOrdrConfPrivBcastT.membExchIdCod, lmembExchIdCod, MEMB_EXCH_ID_COD_LEN);

	vbscSubStratOrdrConfPrivBcastT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscSubStratOrdrConfPrivBcastT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrNo", lordrNo);
	memcpy(vbscSubStratOrdrConfPrivBcastT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrBkQty", lordrBkQty);
	memcpy(vbscSubStratOrdrConfPrivBcastT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrExeQty", lordrExeQty);
	memcpy(vbscSubStratOrdrConfPrivBcastT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.ordrTotExeQty[i]= ' ';
	}
	char lordrTotExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrTotExeQty", lordrTotExeQty);
	memcpy(vbscSubStratOrdrConfPrivBcastT.ordrTotExeQty, lordrTotExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrTotQty", lordrTotQty);
	memcpy(vbscSubStratOrdrConfPrivBcastT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrTypCod", lordrTypCod);
	vbscSubStratOrdrConfPrivBcastT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrExePrc", lordrExePrc);
	memcpy(vbscSubStratOrdrConfPrivBcastT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrResCod", lordrResCod);
	vbscSubStratOrdrConfPrivBcastT.ordrResCod = lordrResCod[0];

	char lordrSts[1] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrSts", lordrSts);
	vbscSubStratOrdrConfPrivBcastT.ordrSts = lordrSts[0];

	char lopnClsCod[1] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.opnClsCod", lopnClsCod);
	vbscSubStratOrdrConfPrivBcastT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrCreDat", lordrCreDat);
	memcpy(vbscSubStratOrdrConfPrivBcastT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrCreTim", lordrCreTim);
	memcpy(vbscSubStratOrdrConfPrivBcastT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.ordrPrioDat[i]= ' ';
	}
	char lordrPrioDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrPrioDat", lordrPrioDat);
	memcpy(vbscSubStratOrdrConfPrivBcastT.ordrPrioDat, lordrPrioDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.ordrPrioTim[i]= ' ';
	}
	char lordrPrioTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrPrioTim", lordrPrioTim);
	memcpy(vbscSubStratOrdrConfPrivBcastT.ordrPrioTim, lordrPrioTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.lstEvntDat", llstEvntDat);
	memcpy(vbscSubStratOrdrConfPrivBcastT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.lstEvntTim", llstEvntTim);
	memcpy(vbscSubStratOrdrConfPrivBcastT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vbscSubStratOrdrConfPrivBcastT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<ORDR_TRN_TYP_ID_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.ordrTrnTypId[i]= ' ';
	}
	char lordrTrnTypId[ORDR_TRN_TYP_ID_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.ordrTrnTypId", lordrTrnTypId);
	memcpy(vbscSubStratOrdrConfPrivBcastT.ordrTrnTypId, lordrTrnTypId, ORDR_TRN_TYP_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscSubStratOrdrConfPrivBcastT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("SubStratOrdrConf.bscSubStratOrdrConfPrivBcastT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscSubStratOrdrConfPrivBcastT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscSubStratOrdrConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extSubStratOrdrConfPrivBcastT getExtSubStratOrdrConfPrivBcastT(char* testCaseNum , const char *root) {
	extSubStratOrdrConfPrivBcastT vextSubStratOrdrConfPrivBcastT;
	int i;

	vextSubStratOrdrConfPrivBcastT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extSubStratOrdrConfPrivBcastT");
	vextSubStratOrdrConfPrivBcastT.txtGrp = getTxtGrpT(testCaseNum, "extSubStratOrdrConfPrivBcastT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vextSubStratOrdrConfPrivBcastT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("SubStratOrdrConf.extSubStratOrdrConfPrivBcastT.membClgIdCod", lmembClgIdCod);
	memcpy(vextSubStratOrdrConfPrivBcastT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_OBO_LEN;i++) {
		vextSubStratOrdrConfPrivBcastT.membExchIdCodObo[i]= ' ';
	}
	char lmembExchIdCodObo[MEMB_EXCH_ID_COD_OBO_LEN] = {""};
	getStrProperty("SubStratOrdrConf.extSubStratOrdrConfPrivBcastT.membExchIdCodObo", lmembExchIdCodObo);
	memcpy(vextSubStratOrdrConfPrivBcastT.membExchIdCodObo, lmembExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN);

	vextSubStratOrdrConfPrivBcastT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "extSubStratOrdrConfPrivBcastT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vextSubStratOrdrConfPrivBcastT.ordrNoOld[i]= ' ';
	}
	char lordrNoOld[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("SubStratOrdrConf.extSubStratOrdrConfPrivBcastT.ordrNoOld", lordrNoOld);
	memcpy(vextSubStratOrdrConfPrivBcastT.ordrNoOld, lordrNoOld, DRIV_ORDR_NO_LEN);

	char lordrPersInd[1] = {""};
	getStrProperty("SubStratOrdrConf.extSubStratOrdrConfPrivBcastT.ordrPersInd", lordrPersInd);
	vextSubStratOrdrConfPrivBcastT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vextSubStratOrdrConfPrivBcastT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("SubStratOrdrConf.extSubStratOrdrConfPrivBcastT.userOrdrRef", luserOrdrRef);
	memcpy(vextSubStratOrdrConfPrivBcastT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<ETS_SES_ID_LEN;i++) {
		vextSubStratOrdrConfPrivBcastT.etsSesId[i]= ' ';
	}
	char letsSesId[ETS_SES_ID_LEN] = {""};
	getStrProperty("SubStratOrdrConf.extSubStratOrdrConfPrivBcastT.etsSesId", letsSesId);
	memcpy(vextSubStratOrdrConfPrivBcastT.etsSesId, letsSesId, ETS_SES_ID_LEN);
	return vextSubStratOrdrConfPrivBcastT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
subStratOrdrConfPrivBcastT getSubStratOrdrConfPrivBcastT(char* testCaseNum , const char *root) {
	subStratOrdrConfPrivBcastT vsubStratOrdrConfPrivBcastT;
	int i;

	vsubStratOrdrConfPrivBcastT.bscSeqNo = getBscSeqNoT(testCaseNum, "subStratOrdrConfPrivBcastT");
	vsubStratOrdrConfPrivBcastT.header = getDataHeaderT(testCaseNum, "subStratOrdrConfPrivBcastT");
	vsubStratOrdrConfPrivBcastT.basic = getBscSubStratOrdrConfPrivBcastT(testCaseNum, "subStratOrdrConfPrivBcastT");
	vsubStratOrdrConfPrivBcastT.extension = getExtSubStratOrdrConfPrivBcastT(testCaseNum, "subStratOrdrConfPrivBcastT");	return vsubStratOrdrConfPrivBcastT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubStratOrdrConfSubjectT(bscSubStratOrdrConfSubjectT actual, bscSubStratOrdrConfSubjectT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.membId, expected.membId, MEMB_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfSubjectT, membId not matching. Actual %s but Expected %s", actual.membId, expected.membId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfSubjectT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscSubStratOrdrConfPrivBcastT(bscSubStratOrdrConfPrivBcastT actual, bscSubStratOrdrConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	if ( memcmp(actual.membExchIdCod, expected.membExchIdCod, MEMB_EXCH_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, membExchIdCod not matching. Actual %s but Expected %s", actual.membExchIdCod, expected.membExchIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotExeQty, expected.ordrTotExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrTotExeQty not matching. Actual %s but Expected %s", actual.ordrTotExeQty, expected.ordrTotExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrSts!= expected.ordrSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrStsnot matching. Actual %d but Expected %d", actual.ordrSts, expected.ordrSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioDat, expected.ordrPrioDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrPrioDat not matching. Actual %s but Expected %s", actual.ordrPrioDat, expected.ordrPrioDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioTim, expected.ordrPrioTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrPrioTim not matching. Actual %s but Expected %s", actual.ordrPrioTim, expected.ordrPrioTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTrnTypId, expected.ordrTrnTypId, ORDR_TRN_TYP_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, ordrTrnTypId not matching. Actual %s but Expected %s", actual.ordrTrnTypId, expected.ordrTrnTypId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscSubStratOrdrConfPrivBcastT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtSubStratOrdrConfPrivBcastT(extSubStratOrdrConfPrivBcastT actual, extSubStratOrdrConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratOrdrConfPrivBcastT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodObo, expected.membExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratOrdrConfPrivBcastT, membExchIdCodObo not matching. Actual %s but Expected %s", actual.membExchIdCodObo, expected.membExchIdCodObo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if ( memcmp(actual.ordrNoOld, expected.ordrNoOld, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratOrdrConfPrivBcastT, ordrNoOld not matching. Actual %s but Expected %s", actual.ordrNoOld, expected.ordrNoOld);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratOrdrConfPrivBcastT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratOrdrConfPrivBcastT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.etsSesId, expected.etsSesId, ETS_SES_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extSubStratOrdrConfPrivBcastT, etsSesId not matching. Actual %s but Expected %s", actual.etsSesId, expected.etsSesId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareSubStratOrdrConfPrivBcastT(subStratOrdrConfPrivBcastT actual, subStratOrdrConfPrivBcastT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareBscSeqNoT (actual.bscSeqNo,expected.bscSeqNo, logMsg);
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscSubStratOrdrConfPrivBcastT (actual.basic,expected.basic, logMsg);
	compareExtSubStratOrdrConfPrivBcastT (actual.extension,expected.extension, logMsg);
}

