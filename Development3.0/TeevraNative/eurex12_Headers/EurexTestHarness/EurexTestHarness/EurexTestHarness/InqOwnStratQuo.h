#include <InqOwnStratQuo.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOwnStratQuoGrpT getBscInqOwnStratQuoGrpT(char* testCaseNum , const char *root) {
	bscInqOwnStratQuoGrpT vbscInqOwnStratQuoGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqOwnStratQuoGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoGrpT.prodId", lprodId);
	memcpy(vbscInqOwnStratQuoGrpT.prodId, lprodId, PROD_ID_LEN);
	return vbscInqOwnStratQuoGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOwnStratQuoRequestT getBscInqOwnStratQuoRequestT(char* testCaseNum , const char *root) {
	bscInqOwnStratQuoRequestT vbscInqOwnStratQuoRequestT;
	int i;

	vbscInqOwnStratQuoRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqOwnStratQuoRequestT");
	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqOwnStratQuoRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqOwnStratQuoRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqOwnStratQuoRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqOwnStratQuoRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqOwnStratQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqOwnStratQuoRequestT getInqOwnStratQuoRequestT(char* testCaseNum , const char *root) {
	inqOwnStratQuoRequestT vinqOwnStratQuoRequestT;
	int i;

	vinqOwnStratQuoRequestT.header = getDataHeaderT(testCaseNum, "inqOwnStratQuoRequestT");
	vinqOwnStratQuoRequestT.basic = getBscInqOwnStratQuoRequestT(testCaseNum, "inqOwnStratQuoRequestT");	return vinqOwnStratQuoRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOwnStratQuoRecT getBscInqOwnStratQuoRecT(char* testCaseNum , const char *root) {
	bscInqOwnStratQuoRecT vbscInqOwnStratQuoRecT;
	int i;

	char lbuyCod[1] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.buyCod", lbuyCod);
	vbscInqOwnStratQuoRecT.buyCod = lbuyCod[0];

	vbscInqOwnStratQuoRecT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscInqOwnStratQuoRecT");
	vbscInqOwnStratQuoRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqOwnStratQuoRecT");
	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscInqOwnStratQuoRecT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.ordrNoBuy", lordrNoBuy);
	memcpy(vbscInqOwnStratQuoRecT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscInqOwnStratQuoRecT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.ordrNoSel", lordrNoSel);
	memcpy(vbscInqOwnStratQuoRecT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqOwnStratQuoRecT.quoBkQtyBuy[i]= ' ';
	}
	char lquoBkQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.quoBkQtyBuy", lquoBkQtyBuy);
	memcpy(vbscInqOwnStratQuoRecT.quoBkQtyBuy, lquoBkQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqOwnStratQuoRecT.quoBkQtySel[i]= ' ';
	}
	char lquoBkQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.quoBkQtySel", lquoBkQtySel);
	memcpy(vbscInqOwnStratQuoRecT.quoBkQtySel, lquoBkQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqOwnStratQuoRecT.quoExeQtyBuy[i]= ' ';
	}
	char lquoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.quoExeQtyBuy", lquoExeQtyBuy);
	memcpy(vbscInqOwnStratQuoRecT.quoExeQtyBuy, lquoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqOwnStratQuoRecT.quoExeQtySel[i]= ' ';
	}
	char lquoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.quoExeQtySel", lquoExeQtySel);
	memcpy(vbscInqOwnStratQuoRecT.quoExeQtySel, lquoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqOwnStratQuoRecT.quoExePrcBuy[i]= ' ';
	}
	char lquoExePrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.quoExePrcBuy", lquoExePrcBuy);
	memcpy(vbscInqOwnStratQuoRecT.quoExePrcBuy, lquoExePrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqOwnStratQuoRecT.quoExePrcSel[i]= ' ';
	}
	char lquoExePrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.quoExePrcSel", lquoExePrcSel);
	memcpy(vbscInqOwnStratQuoRecT.quoExePrcSel, lquoExePrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqOwnStratQuoRecT.quoPrioTimBuy[i]= ' ';
	}
	char lquoPrioTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.quoPrioTimBuy", lquoPrioTimBuy);
	memcpy(vbscInqOwnStratQuoRecT.quoPrioTimBuy, lquoPrioTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqOwnStratQuoRecT.quoPrioTimSel[i]= ' ';
	}
	char lquoPrioTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.quoPrioTimSel", lquoPrioTimSel);
	memcpy(vbscInqOwnStratQuoRecT.quoPrioTimSel, lquoPrioTimSel, DRIV_TIME_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqOwnStratQuoRecT.quoPrioDatBuy[i]= ' ';
	}
	char lquoPrioDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.quoPrioDatBuy", lquoPrioDatBuy);
	memcpy(vbscInqOwnStratQuoRecT.quoPrioDatBuy, lquoPrioDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqOwnStratQuoRecT.quoPrioDatSel[i]= ' ';
	}
	char lquoPrioDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.quoPrioDatSel", lquoPrioDatSel);
	memcpy(vbscInqOwnStratQuoRecT.quoPrioDatSel, lquoPrioDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqOwnStratQuoRecT.lstEvntDatBuy[i]= ' ';
	}
	char llstEvntDatBuy[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.lstEvntDatBuy", llstEvntDatBuy);
	memcpy(vbscInqOwnStratQuoRecT.lstEvntDatBuy, llstEvntDatBuy, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqOwnStratQuoRecT.lstEvntTimBuy[i]= ' ';
	}
	char llstEvntTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.lstEvntTimBuy", llstEvntTimBuy);
	memcpy(vbscInqOwnStratQuoRecT.lstEvntTimBuy, llstEvntTimBuy, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscInqOwnStratQuoRecT.lstEvntTrnIdBuy[i]= ' ';
	}
	char llstEvntTrnIdBuy[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.lstEvntTrnIdBuy", llstEvntTrnIdBuy);
	memcpy(vbscInqOwnStratQuoRecT.lstEvntTrnIdBuy, llstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN);

	for(i=0;i<DRIV_DATE_LEN;i++) {
		vbscInqOwnStratQuoRecT.lstEvntDatSel[i]= ' ';
	}
	char llstEvntDatSel[DRIV_DATE_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.lstEvntDatSel", llstEvntDatSel);
	memcpy(vbscInqOwnStratQuoRecT.lstEvntDatSel, llstEvntDatSel, DRIV_DATE_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqOwnStratQuoRecT.lstEvntTimSel[i]= ' ';
	}
	char llstEvntTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.lstEvntTimSel", llstEvntTimSel);
	memcpy(vbscInqOwnStratQuoRecT.lstEvntTimSel, llstEvntTimSel, DRIV_TIME_LEN);

	for(i=0;i<LST_EVNT_TRN_ID_LEN;i++) {
		vbscInqOwnStratQuoRecT.lstEvntTrnIdSel[i]= ' ';
	}
	char llstEvntTrnIdSel[LST_EVNT_TRN_ID_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoRecT.lstEvntTrnIdSel", llstEvntTrnIdSel);
	memcpy(vbscInqOwnStratQuoRecT.lstEvntTrnIdSel, llstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN);
	return vbscInqOwnStratQuoRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOwnStratQuoResponseT getBscInqOwnStratQuoResponseT(char* testCaseNum , const char *root) {
	bscInqOwnStratQuoResponseT vbscInqOwnStratQuoResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqOwnStratQuoResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqOwnStratQuoResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqOwnStratQuoResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnStratQuo.bscInqOwnStratQuoResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqOwnStratQuoResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqOwnStratQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqOwnStratQuoRecT getExtInqOwnStratQuoRecT(char* testCaseNum , const char *root) {
	extInqOwnStratQuoRecT vextInqOwnStratQuoRecT;
	int i;

	vextInqOwnStratQuoRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqOwnStratQuoRecT");	return vextInqOwnStratQuoRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqOwnStratQuoResponseT getExtInqOwnStratQuoResponseT(char* testCaseNum , const char *root) {
	extInqOwnStratQuoResponseT vextInqOwnStratQuoResponseT;
	int i;
	return vextInqOwnStratQuoResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqOwnStratQuoResponseT getInqOwnStratQuoResponseT(char* testCaseNum , const char *root) {
	inqOwnStratQuoResponseT vinqOwnStratQuoResponseT;
	int i;

	vinqOwnStratQuoResponseT.header = getDataHeaderT(testCaseNum, "inqOwnStratQuoResponseT");
	vinqOwnStratQuoResponseT.basic = getBscInqOwnStratQuoResponseT(testCaseNum, "inqOwnStratQuoResponseT");
	vinqOwnStratQuoResponseT.extension = getExtInqOwnStratQuoResponseT(testCaseNum, "inqOwnStratQuoResponseT");	return vinqOwnStratQuoResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOwnStratQuoGrpT(bscInqOwnStratQuoGrpT actual, bscInqOwnStratQuoGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOwnStratQuoRequestT(bscInqOwnStratQuoRequestT actual, bscInqOwnStratQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < BSC_INQ_OWN_STRAT_QUO_GRP_MAX;i++) {
		compareBscInqOwnStratQuoGrpT (actual.bscInqOwnStratQuoGrp[i],expected.bscInqOwnStratQuoGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqOwnStratQuoRequestT(inqOwnStratQuoRequestT actual, inqOwnStratQuoRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqOwnStratQuoRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOwnStratQuoRecT(bscInqOwnStratQuoRecT actual, bscInqOwnStratQuoRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtyBuy, expected.quoBkQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, quoBkQtyBuy not matching. Actual %s but Expected %s", actual.quoBkQtyBuy, expected.quoBkQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoBkQtySel, expected.quoBkQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, quoBkQtySel not matching. Actual %s but Expected %s", actual.quoBkQtySel, expected.quoBkQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtyBuy, expected.quoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, quoExeQtyBuy not matching. Actual %s but Expected %s", actual.quoExeQtyBuy, expected.quoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExeQtySel, expected.quoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, quoExeQtySel not matching. Actual %s but Expected %s", actual.quoExeQtySel, expected.quoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcBuy, expected.quoExePrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, quoExePrcBuy not matching. Actual %s but Expected %s", actual.quoExePrcBuy, expected.quoExePrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoExePrcSel, expected.quoExePrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, quoExePrcSel not matching. Actual %s but Expected %s", actual.quoExePrcSel, expected.quoExePrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimBuy, expected.quoPrioTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, quoPrioTimBuy not matching. Actual %s but Expected %s", actual.quoPrioTimBuy, expected.quoPrioTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioTimSel, expected.quoPrioTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, quoPrioTimSel not matching. Actual %s but Expected %s", actual.quoPrioTimSel, expected.quoPrioTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatBuy, expected.quoPrioDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, quoPrioDatBuy not matching. Actual %s but Expected %s", actual.quoPrioDatBuy, expected.quoPrioDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrioDatSel, expected.quoPrioDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, quoPrioDatSel not matching. Actual %s but Expected %s", actual.quoPrioDatSel, expected.quoPrioDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatBuy, expected.lstEvntDatBuy, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, lstEvntDatBuy not matching. Actual %s but Expected %s", actual.lstEvntDatBuy, expected.lstEvntDatBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimBuy, expected.lstEvntTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, lstEvntTimBuy not matching. Actual %s but Expected %s", actual.lstEvntTimBuy, expected.lstEvntTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, lstEvntTrnIdBuy not matching. Actual %s but Expected %s", actual.lstEvntTrnIdBuy, expected.lstEvntTrnIdBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntDatSel, expected.lstEvntDatSel, DRIV_DATE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, lstEvntDatSel not matching. Actual %s but Expected %s", actual.lstEvntDatSel, expected.lstEvntDatSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTimSel, expected.lstEvntTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, lstEvntTimSel not matching. Actual %s but Expected %s", actual.lstEvntTimSel, expected.lstEvntTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel, LST_EVNT_TRN_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoRecT, lstEvntTrnIdSel not matching. Actual %s but Expected %s", actual.lstEvntTrnIdSel, expected.lstEvntTrnIdSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOwnStratQuoResponseT(bscInqOwnStratQuoResponseT actual, bscInqOwnStratQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratQuoResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_OWN_STRAT_QUO_REC_MAX;i++) {
		compareBscInqOwnStratQuoRecT (actual.bscInqOwnStratQuoRec[i],expected.bscInqOwnStratQuoRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqOwnStratQuoRecT(extInqOwnStratQuoRecT actual, extInqOwnStratQuoRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqOwnStratQuoResponseT(extInqOwnStratQuoResponseT actual, extInqOwnStratQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_OWN_STRAT_QUO_REC_MAX;i++) {
		compareExtInqOwnStratQuoRecT (actual.extInqOwnStratQuoRec[i],expected.extInqOwnStratQuoRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqOwnStratQuoResponseT(inqOwnStratQuoResponseT actual, inqOwnStratQuoResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqOwnStratQuoResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqOwnStratQuoResponseT (actual.extension,expected.extension, logMsg);
}

