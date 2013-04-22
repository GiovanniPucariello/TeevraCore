#include <InqOwnStratOrdr.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOwnStratOrdrGrpT getBscInqOwnStratOrdrGrpT(char* testCaseNum , const char *root) {
	bscInqOwnStratOrdrGrpT vbscInqOwnStratOrdrGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqOwnStratOrdrGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrGrpT.prodId", lprodId);
	memcpy(vbscInqOwnStratOrdrGrpT.prodId, lprodId, PROD_ID_LEN);
	return vbscInqOwnStratOrdrGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOwnStratOrdrRequestT getBscInqOwnStratOrdrRequestT(char* testCaseNum , const char *root) {
	bscInqOwnStratOrdrRequestT vbscInqOwnStratOrdrRequestT;
	int i;

	vbscInqOwnStratOrdrRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqOwnStratOrdrRequestT");
	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqOwnStratOrdrRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqOwnStratOrdrRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqOwnStratOrdrRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqOwnStratOrdrRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqOwnStratOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqOwnStratOrdrRequestT getInqOwnStratOrdrRequestT(char* testCaseNum , const char *root) {
	inqOwnStratOrdrRequestT vinqOwnStratOrdrRequestT;
	int i;

	vinqOwnStratOrdrRequestT.header = getDataHeaderT(testCaseNum, "inqOwnStratOrdrRequestT");
	vinqOwnStratOrdrRequestT.basic = getBscInqOwnStratOrdrRequestT(testCaseNum, "inqOwnStratOrdrRequestT");	return vinqOwnStratOrdrRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOwnStratOrdrRecT getBscInqOwnStratOrdrRecT(char* testCaseNum , const char *root) {
	bscInqOwnStratOrdrRecT vbscInqOwnStratOrdrRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.buyCod", lbuyCod);
	vbscInqOwnStratOrdrRecT.buyCod = lbuyCod[0];

	vbscInqOwnStratOrdrRecT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscInqOwnStratOrdrRecT");
	vbscInqOwnStratOrdrRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqOwnStratOrdrRecT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscInqOwnStratOrdrRecT.ordrNo[i]= ' ';
	}
	char lordrNo[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrNo", lordrNo);
	memcpy(vbscInqOwnStratOrdrRecT.ordrNo, lordrNo, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqOwnStratOrdrRecT.ordrBkQty[i]= ' ';
	}
	char lordrBkQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrBkQty", lordrBkQty);
	memcpy(vbscInqOwnStratOrdrRecT.ordrBkQty, lordrBkQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqOwnStratOrdrRecT.ordrExeQty[i]= ' ';
	}
	char lordrExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrExeQty", lordrExeQty);
	memcpy(vbscInqOwnStratOrdrRecT.ordrExeQty, lordrExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqOwnStratOrdrRecT.ordrTotExeQty[i]= ' ';
	}
	char lordrTotExeQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrTotExeQty", lordrTotExeQty);
	memcpy(vbscInqOwnStratOrdrRecT.ordrTotExeQty, lordrTotExeQty, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqOwnStratOrdrRecT.ordrTotQty[i]= ' ';
	}
	char lordrTotQty[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrTotQty", lordrTotQty);
	memcpy(vbscInqOwnStratOrdrRecT.ordrTotQty, lordrTotQty, DRIV_VOLUME_LEN);

	char lordrTypCod[1] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrTypCod", lordrTypCod);
	vbscInqOwnStratOrdrRecT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqOwnStratOrdrRecT.ordrExePrc[i]= ' ';
	}
	char lordrExePrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrExePrc", lordrExePrc);
	memcpy(vbscInqOwnStratOrdrRecT.ordrExePrc, lordrExePrc, DRIV_PRICE_LEN);

	char lordrResCod[1] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrResCod", lordrResCod);
	vbscInqOwnStratOrdrRecT.ordrResCod = lordrResCod[0];

	char lordrSts[1] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrSts", lordrSts);
	vbscInqOwnStratOrdrRecT.ordrSts = lordrSts[0];

	char lopnClsCod[1] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.opnClsCod", lopnClsCod);
	vbscInqOwnStratOrdrRecT.opnClsCod = lopnClsCod[0];

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqOwnStratOrdrRecT.ordrCreDat[i]= ' ';
	}
	char lordrCreDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrCreDat", lordrCreDat);
	memcpy(vbscInqOwnStratOrdrRecT.ordrCreDat, lordrCreDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqOwnStratOrdrRecT.ordrCreTim[i]= ' ';
	}
	char lordrCreTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrCreTim", lordrCreTim);
	memcpy(vbscInqOwnStratOrdrRecT.ordrCreTim, lordrCreTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqOwnStratOrdrRecT.ordrPrioDat[i]= ' ';
	}
	char lordrPrioDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrPrioDat", lordrPrioDat);
	memcpy(vbscInqOwnStratOrdrRecT.ordrPrioDat, lordrPrioDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqOwnStratOrdrRecT.ordrPrioTim[i]= ' ';
	}
	char lordrPrioTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.ordrPrioTim", lordrPrioTim);
	memcpy(vbscInqOwnStratOrdrRecT.ordrPrioTim, lordrPrioTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqOwnStratOrdrRecT.lstEvntDat[i]= ' ';
	}
	char llstEvntDat[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.lstEvntDat", llstEvntDat);
	memcpy(vbscInqOwnStratOrdrRecT.lstEvntDat, llstEvntDat, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqOwnStratOrdrRecT.lstEvntTim[i]= ' ';
	}
	char llstEvntTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.lstEvntTim", llstEvntTim);
	memcpy(vbscInqOwnStratOrdrRecT.lstEvntTim, llstEvntTim, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscInqOwnStratOrdrRecT.lstEvntTrnId[i]= ' ';
	}
	char llstEvntTrnId[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.lstEvntTrnId", llstEvntTrnId);
	memcpy(vbscInqOwnStratOrdrRecT.lstEvntTrnId, llstEvntTrnId, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vbscInqOwnStratOrdrRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vbscInqOwnStratOrdrRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vbscInqOwnStratOrdrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOwnStratOrdrResponseT getBscInqOwnStratOrdrResponseT(char* testCaseNum , const char *root) {
	bscInqOwnStratOrdrResponseT vbscInqOwnStratOrdrResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqOwnStratOrdrResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqOwnStratOrdrResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqOwnStratOrdrResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.bscInqOwnStratOrdrResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqOwnStratOrdrResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqOwnStratOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqOwnStratOrdrRecT getExtInqOwnStratOrdrRecT(char* testCaseNum , const char *root) {
	extInqOwnStratOrdrRecT vextInqOwnStratOrdrRecT;
	int i;

	vextInqOwnStratOrdrRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqOwnStratOrdrRecT");
	vextInqOwnStratOrdrRecT.txtGrp = getTxtGrpT(testCaseNum, "extInqOwnStratOrdrRecT");
	for(i=0;i<MEMB_CLG_ID_COD_LEN;i++) {
		vextInqOwnStratOrdrRecT.membClgIdCod[i]= ' ';
	}
	char lmembClgIdCod[MEMB_CLG_ID_COD_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.extInqOwnStratOrdrRecT.membClgIdCod", lmembClgIdCod);
	memcpy(vextInqOwnStratOrdrRecT.membClgIdCod, lmembClgIdCod, MEMB_CLG_ID_COD_LEN);

	for(i=0;i<MEMB_EXCH_ID_COD_OBO_LEN;i++) {
		vextInqOwnStratOrdrRecT.membExchIdCodObo[i]= ' ';
	}
	char lmembExchIdCodObo[MEMB_EXCH_ID_COD_OBO_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.extInqOwnStratOrdrRecT.membExchIdCodObo", lmembExchIdCodObo);
	memcpy(vextInqOwnStratOrdrRecT.membExchIdCodObo, lmembExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN);

	vextInqOwnStratOrdrRecT.trdIdOboGrp = getTrdIdOboGrpT(testCaseNum, "extInqOwnStratOrdrRecT");
	char lordrPersInd[1] = {""};
	getStrProperty("InqOwnStratOrdr.extInqOwnStratOrdrRecT.ordrPersInd", lordrPersInd);
	vextInqOwnStratOrdrRecT.ordrPersInd = lordrPersInd[0];

	for(i=0;i<USER_ORDR_REF_LEN;i++) {
		vextInqOwnStratOrdrRecT.userOrdrRef[i]= ' ';
	}
	char luserOrdrRef[USER_ORDR_REF_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.extInqOwnStratOrdrRecT.userOrdrRef", luserOrdrRef);
	memcpy(vextInqOwnStratOrdrRecT.userOrdrRef, luserOrdrRef, USER_ORDR_REF_LEN);

	for(i=0;i<ETS_SES_ID_LEN;i++) {
		vextInqOwnStratOrdrRecT.etsSesId[i]= ' ';
	}
	char letsSesId[ETS_SES_ID_LEN] = {""};
	getStrProperty("InqOwnStratOrdr.extInqOwnStratOrdrRecT.etsSesId", letsSesId);
	memcpy(vextInqOwnStratOrdrRecT.etsSesId, letsSesId, ETS_SES_ID_LEN);
	return vextInqOwnStratOrdrRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqOwnStratOrdrResponseT getExtInqOwnStratOrdrResponseT(char* testCaseNum , const char *root) {
	extInqOwnStratOrdrResponseT vextInqOwnStratOrdrResponseT;
	int i;
	return vextInqOwnStratOrdrResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqOwnStratOrdrResponseT getInqOwnStratOrdrResponseT(char* testCaseNum , const char *root) {
	inqOwnStratOrdrResponseT vinqOwnStratOrdrResponseT;
	int i;

	vinqOwnStratOrdrResponseT.header = getDataHeaderT(testCaseNum, "inqOwnStratOrdrResponseT");
	vinqOwnStratOrdrResponseT.basic = getBscInqOwnStratOrdrResponseT(testCaseNum, "inqOwnStratOrdrResponseT");
	vinqOwnStratOrdrResponseT.extension = getExtInqOwnStratOrdrResponseT(testCaseNum, "inqOwnStratOrdrResponseT");	return vinqOwnStratOrdrResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOwnStratOrdrGrpT(bscInqOwnStratOrdrGrpT actual, bscInqOwnStratOrdrGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOwnStratOrdrRequestT(bscInqOwnStratOrdrRequestT actual, bscInqOwnStratOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < BSC_INQ_OWN_STRAT_ORDR_GRP_MAX;i++) {
		compareBscInqOwnStratOrdrGrpT (actual.bscInqOwnStratOrdrGrp[i],expected.bscInqOwnStratOrdrGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqOwnStratOrdrRequestT(inqOwnStratOrdrRequestT actual, inqOwnStratOrdrRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqOwnStratOrdrRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOwnStratOrdrRecT(bscInqOwnStratOrdrRecT actual, bscInqOwnStratOrdrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNo, expected.ordrNo, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrNo not matching. Actual %s but Expected %s", actual.ordrNo, expected.ordrNo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrBkQty, expected.ordrBkQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrBkQty not matching. Actual %s but Expected %s", actual.ordrBkQty, expected.ordrBkQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExeQty, expected.ordrExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrExeQty not matching. Actual %s but Expected %s", actual.ordrExeQty, expected.ordrExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotExeQty, expected.ordrTotExeQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrTotExeQty not matching. Actual %s but Expected %s", actual.ordrTotExeQty, expected.ordrTotExeQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrTotQty, expected.ordrTotQty, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrTotQty not matching. Actual %s but Expected %s", actual.ordrTotQty, expected.ordrTotQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrExePrc, expected.ordrExePrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrExePrc not matching. Actual %s but Expected %s", actual.ordrExePrc, expected.ordrExePrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrResCod!= expected.ordrResCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrResCodnot matching. Actual %d but Expected %d", actual.ordrResCod, expected.ordrResCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrSts!= expected.ordrSts) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrStsnot matching. Actual %d but Expected %d", actual.ordrSts, expected.ordrSts);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreDat, expected.ordrCreDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrCreDat not matching. Actual %s but Expected %s", actual.ordrCreDat, expected.ordrCreDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrCreTim, expected.ordrCreTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrCreTim not matching. Actual %s but Expected %s", actual.ordrCreTim, expected.ordrCreTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioDat, expected.ordrPrioDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrPrioDat not matching. Actual %s but Expected %s", actual.ordrPrioDat, expected.ordrPrioDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrPrioTim, expected.ordrPrioTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, ordrPrioTim not matching. Actual %s but Expected %s", actual.ordrPrioTim, expected.ordrPrioTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDat, expected.lstEvntDat, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, lstEvntDat not matching. Actual %s but Expected %s", actual.lstEvntDat, expected.lstEvntDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTim, expected.lstEvntTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, lstEvntTim not matching. Actual %s but Expected %s", actual.lstEvntTim, expected.lstEvntTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnId, expected.lstEvntTrnId, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, lstEvntTrnId not matching. Actual %s but Expected %s", actual.lstEvntTrnId, expected.lstEvntTrnId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOwnStratOrdrResponseT(bscInqOwnStratOrdrResponseT actual, bscInqOwnStratOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratOrdrResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_OWN_STRAT_ORDR_REC_MAX;i++) {
		compareBscInqOwnStratOrdrRecT (actual.bscInqOwnStratOrdrRec[i],expected.bscInqOwnStratOrdrRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqOwnStratOrdrRecT(extInqOwnStratOrdrRecT actual, extInqOwnStratOrdrRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membClgIdCod, expected.membClgIdCod, MEMB_CLG_ID_COD_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqOwnStratOrdrRecT, membClgIdCod not matching. Actual %s but Expected %s", actual.membClgIdCod, expected.membClgIdCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.membExchIdCodObo, expected.membExchIdCodObo, MEMB_EXCH_ID_COD_OBO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqOwnStratOrdrRecT, membExchIdCodObo not matching. Actual %s but Expected %s", actual.membExchIdCodObo, expected.membExchIdCodObo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareTrdIdOboGrpT (actual.trdIdOboGrp,expected.trdIdOboGrp, logMsg);
	if (actual.ordrPersInd!= expected.ordrPersInd) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqOwnStratOrdrRecT, ordrPersIndnot matching. Actual %d but Expected %d", actual.ordrPersInd, expected.ordrPersInd);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.userOrdrRef, expected.userOrdrRef, USER_ORDR_REF_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqOwnStratOrdrRecT, userOrdrRef not matching. Actual %s but Expected %s", actual.userOrdrRef, expected.userOrdrRef);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.etsSesId, expected.etsSesId, ETS_SES_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqOwnStratOrdrRecT, etsSesId not matching. Actual %s but Expected %s", actual.etsSesId, expected.etsSesId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqOwnStratOrdrResponseT(extInqOwnStratOrdrResponseT actual, extInqOwnStratOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_OWN_STRAT_ORDR_REC_MAX;i++) {
		compareExtInqOwnStratOrdrRecT (actual.extInqOwnStratOrdrRec[i],expected.extInqOwnStratOrdrRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqOwnStratOrdrResponseT(inqOwnStratOrdrResponseT actual, inqOwnStratOrdrResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqOwnStratOrdrResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqOwnStratOrdrResponseT (actual.extension,expected.extension, logMsg);
}

