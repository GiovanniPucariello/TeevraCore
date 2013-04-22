#include <InqOwnStratBlkAuct.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOwnStratBlkAuctGrpT getBscInqOwnStratBlkAuctGrpT(char* testCaseNum , const char *root) {
	bscInqOwnStratBlkAuctGrpT vbscInqOwnStratBlkAuctGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqOwnStratBlkAuctGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctGrpT.prodId", lprodId);
	memcpy(vbscInqOwnStratBlkAuctGrpT.prodId, lprodId, PROD_ID_LEN);
	return vbscInqOwnStratBlkAuctGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOwnStratBlkAuctRequestT getBscInqOwnStratBlkAuctRequestT(char* testCaseNum , const char *root) {
	bscInqOwnStratBlkAuctRequestT vbscInqOwnStratBlkAuctRequestT;
	int i;

	vbscInqOwnStratBlkAuctRequestT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqOwnStratBlkAuctRequestT");
	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqOwnStratBlkAuctRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqOwnStratBlkAuctRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqOwnStratBlkAuctRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqOwnStratBlkAuctRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqOwnStratBlkAuctRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqOwnStratBlkAuctRequestT getInqOwnStratBlkAuctRequestT(char* testCaseNum , const char *root) {
	inqOwnStratBlkAuctRequestT vinqOwnStratBlkAuctRequestT;
	int i;

	vinqOwnStratBlkAuctRequestT.header = getDataHeaderT(testCaseNum, "inqOwnStratBlkAuctRequestT");
	vinqOwnStratBlkAuctRequestT.basic = getBscInqOwnStratBlkAuctRequestT(testCaseNum, "inqOwnStratBlkAuctRequestT");	return vinqOwnStratBlkAuctRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOwnStratBlkAuctRecT getBscInqOwnStratBlkAuctRecT(char* testCaseNum , const char *root) {
	bscInqOwnStratBlkAuctRecT vbscInqOwnStratBlkAuctRecT;
	int i;

	vbscInqOwnStratBlkAuctRecT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscInqOwnStratBlkAuctRecT");
	vbscInqOwnStratBlkAuctRecT.trdrIdGrp = getTrdrIdGrpT(testCaseNum, "bscInqOwnStratBlkAuctRecT");
	char lbuyCod[1] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.buyCod", lbuyCod);
	vbscInqOwnStratBlkAuctRecT.buyCod = lbuyCod[0];

	char lordrTypCod[1] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.ordrTypCod", lordrTypCod);
	vbscInqOwnStratBlkAuctRecT.ordrTypCod = lordrTypCod[0];

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscInqOwnStratBlkAuctRecT.ordrNoBuy[i]= ' ';
	}
	char lordrNoBuy[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.ordrNoBuy", lordrNoBuy);
	memcpy(vbscInqOwnStratBlkAuctRecT.ordrNoBuy, lordrNoBuy, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_ORDR_NO_LEN;i++) {
		vbscInqOwnStratBlkAuctRecT.ordrNoSel[i]= ' ';
	}
	char lordrNoSel[DRIV_ORDR_NO_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.ordrNoSel", lordrNoSel);
	memcpy(vbscInqOwnStratBlkAuctRecT.ordrNoSel, lordrNoSel, DRIV_ORDR_NO_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqOwnStratBlkAuctRecT.quoPrcBuy[i]= ' ';
	}
	char lquoPrcBuy[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.quoPrcBuy", lquoPrcBuy);
	memcpy(vbscInqOwnStratBlkAuctRecT.quoPrcBuy, lquoPrcBuy, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vbscInqOwnStratBlkAuctRecT.quoPrcSel[i]= ' ';
	}
	char lquoPrcSel[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.quoPrcSel", lquoPrcSel);
	memcpy(vbscInqOwnStratBlkAuctRecT.quoPrcSel, lquoPrcSel, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqOwnStratBlkAuctRecT.blkAuctQuoQtyBuy[i]= ' ';
	}
	char lblkAuctQuoQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.blkAuctQuoQtyBuy", lblkAuctQuoQtyBuy);
	memcpy(vbscInqOwnStratBlkAuctRecT.blkAuctQuoQtyBuy, lblkAuctQuoQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqOwnStratBlkAuctRecT.blkAuctQuoQtySel[i]= ' ';
	}
	char lblkAuctQuoQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.blkAuctQuoQtySel", lblkAuctQuoQtySel);
	memcpy(vbscInqOwnStratBlkAuctRecT.blkAuctQuoQtySel, lblkAuctQuoQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqOwnStratBlkAuctRecT.blkAuctQuoExeQtyBuy[i]= ' ';
	}
	char lblkAuctQuoExeQtyBuy[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.blkAuctQuoExeQtyBuy", lblkAuctQuoExeQtyBuy);
	memcpy(vbscInqOwnStratBlkAuctRecT.blkAuctQuoExeQtyBuy, lblkAuctQuoExeQtyBuy, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_VOLUME_LEN;i++) {
		vbscInqOwnStratBlkAuctRecT.blkAuctQuoExeQtySel[i]= ' ';
	}
	char lblkAuctQuoExeQtySel[DRIV_VOLUME_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.blkAuctQuoExeQtySel", lblkAuctQuoExeQtySel);
	memcpy(vbscInqOwnStratBlkAuctRecT.blkAuctQuoExeQtySel, lblkAuctQuoExeQtySel, DRIV_VOLUME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqOwnStratBlkAuctRecT.quoTrnTimBuy[i]= ' ';
	}
	char lquoTrnTimBuy[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.quoTrnTimBuy", lquoTrnTimBuy);
	memcpy(vbscInqOwnStratBlkAuctRecT.quoTrnTimBuy, lquoTrnTimBuy, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vbscInqOwnStratBlkAuctRecT.quoTrnTimSel[i]= ' ';
	}
	char lquoTrnTimSel[DRIV_TIME_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.quoTrnTimSel", lquoTrnTimSel);
	memcpy(vbscInqOwnStratBlkAuctRecT.quoTrnTimSel, lquoTrnTimSel, DRIV_TIME_LEN);

	char lopnClsCod[1] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctRecT.opnClsCod", lopnClsCod);
	vbscInqOwnStratBlkAuctRecT.opnClsCod = lopnClsCod[0];
	return vbscInqOwnStratBlkAuctRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqOwnStratBlkAuctResponseT getBscInqOwnStratBlkAuctResponseT(char* testCaseNum , const char *root) {
	bscInqOwnStratBlkAuctResponseT vbscInqOwnStratBlkAuctResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqOwnStratBlkAuctResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqOwnStratBlkAuctResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqOwnStratBlkAuctResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.bscInqOwnStratBlkAuctResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqOwnStratBlkAuctResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqOwnStratBlkAuctResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqOwnStratBlkAuctRecT getExtInqOwnStratBlkAuctRecT(char* testCaseNum , const char *root) {
	extInqOwnStratBlkAuctRecT vextInqOwnStratBlkAuctRecT;
	int i;

	vextInqOwnStratBlkAuctRecT.acctTypCodGrp = getAcctTypCodGrpT(testCaseNum, "extInqOwnStratBlkAuctRecT");
	vextInqOwnStratBlkAuctRecT.txtGrp = getTxtGrpT(testCaseNum, "extInqOwnStratBlkAuctRecT");
	for(i=0;i<DRIV_MEMB_EXCH_ID_COD_TO_LEN;i++) {
		vextInqOwnStratBlkAuctRecT.membExchIdCodTo[i]= ' ';
	}
	char lmembExchIdCodTo[DRIV_MEMB_EXCH_ID_COD_TO_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.extInqOwnStratBlkAuctRecT.membExchIdCodTo", lmembExchIdCodTo);
	memcpy(vextInqOwnStratBlkAuctRecT.membExchIdCodTo, lmembExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN);

	for(i=0;i<DRIV_TIMESTAMP_LEN;i++) {
		vextInqOwnStratBlkAuctRecT.dateLstUpdDat[i]= ' ';
	}
	char ldateLstUpdDat[DRIV_TIMESTAMP_LEN] = {""};
	getStrProperty("InqOwnStratBlkAuct.extInqOwnStratBlkAuctRecT.dateLstUpdDat", ldateLstUpdDat);
	memcpy(vextInqOwnStratBlkAuctRecT.dateLstUpdDat, ldateLstUpdDat, DRIV_TIMESTAMP_LEN);
	return vextInqOwnStratBlkAuctRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqOwnStratBlkAuctResponseT getExtInqOwnStratBlkAuctResponseT(char* testCaseNum , const char *root) {
	extInqOwnStratBlkAuctResponseT vextInqOwnStratBlkAuctResponseT;
	int i;
	return vextInqOwnStratBlkAuctResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqOwnStratBlkAuctResponseT getInqOwnStratBlkAuctResponseT(char* testCaseNum , const char *root) {
	inqOwnStratBlkAuctResponseT vinqOwnStratBlkAuctResponseT;
	int i;

	vinqOwnStratBlkAuctResponseT.header = getDataHeaderT(testCaseNum, "inqOwnStratBlkAuctResponseT");
	vinqOwnStratBlkAuctResponseT.basic = getBscInqOwnStratBlkAuctResponseT(testCaseNum, "inqOwnStratBlkAuctResponseT");
	vinqOwnStratBlkAuctResponseT.extension = getExtInqOwnStratBlkAuctResponseT(testCaseNum, "inqOwnStratBlkAuctResponseT");	return vinqOwnStratBlkAuctResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOwnStratBlkAuctGrpT(bscInqOwnStratBlkAuctGrpT actual, bscInqOwnStratBlkAuctGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOwnStratBlkAuctRequestT(bscInqOwnStratBlkAuctRequestT actual, bscInqOwnStratBlkAuctRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < BSC_INQ_OWN_STRAT_BLK_AUCT_GRP_MAX;i++) {
		compareBscInqOwnStratBlkAuctGrpT (actual.bscInqOwnStratBlkAuctGrp[i],expected.bscInqOwnStratBlkAuctGrp[i], logMsg);
	}
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqOwnStratBlkAuctRequestT(inqOwnStratBlkAuctRequestT actual, inqOwnStratBlkAuctRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqOwnStratBlkAuctRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOwnStratBlkAuctRecT(bscInqOwnStratBlkAuctRecT actual, bscInqOwnStratBlkAuctRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareTrdrIdGrpT (actual.trdrIdGrp,expected.trdrIdGrp, logMsg);
	if (actual.buyCod!= expected.buyCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, buyCodnot matching. Actual %d but Expected %d", actual.buyCod, expected.buyCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.ordrTypCod!= expected.ordrTypCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, ordrTypCodnot matching. Actual %d but Expected %d", actual.ordrTypCod, expected.ordrTypCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoBuy, expected.ordrNoBuy, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, ordrNoBuy not matching. Actual %s but Expected %s", actual.ordrNoBuy, expected.ordrNoBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.ordrNoSel, expected.ordrNoSel, DRIV_ORDR_NO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, ordrNoSel not matching. Actual %s but Expected %s", actual.ordrNoSel, expected.ordrNoSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrcBuy, expected.quoPrcBuy, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, quoPrcBuy not matching. Actual %s but Expected %s", actual.quoPrcBuy, expected.quoPrcBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoPrcSel, expected.quoPrcSel, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, quoPrcSel not matching. Actual %s but Expected %s", actual.quoPrcSel, expected.quoPrcSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, blkAuctQuoQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoQtyBuy, expected.blkAuctQuoQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, blkAuctQuoQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoQtySel, expected.blkAuctQuoQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoExeQtyBuy, expected.blkAuctQuoExeQtyBuy, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, blkAuctQuoExeQtyBuy not matching. Actual %s but Expected %s", actual.blkAuctQuoExeQtyBuy, expected.blkAuctQuoExeQtyBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.blkAuctQuoExeQtySel, expected.blkAuctQuoExeQtySel, DRIV_VOLUME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, blkAuctQuoExeQtySel not matching. Actual %s but Expected %s", actual.blkAuctQuoExeQtySel, expected.blkAuctQuoExeQtySel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTrnTimBuy, expected.quoTrnTimBuy, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, quoTrnTimBuy not matching. Actual %s but Expected %s", actual.quoTrnTimBuy, expected.quoTrnTimBuy);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.quoTrnTimSel, expected.quoTrnTimSel, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, quoTrnTimSel not matching. Actual %s but Expected %s", actual.quoTrnTimSel, expected.quoTrnTimSel);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if (actual.opnClsCod!= expected.opnClsCod) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctRecT, opnClsCodnot matching. Actual %d but Expected %d", actual.opnClsCod, expected.opnClsCod);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqOwnStratBlkAuctResponseT(bscInqOwnStratBlkAuctResponseT actual, bscInqOwnStratBlkAuctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqOwnStratBlkAuctResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < INQ_OWN_STRAT_BLK_AUCT_REC_MAX;i++) {
		compareBscInqOwnStratBlkAuctRecT (actual.bscInqOwnStratBlkAuctRec[i],expected.bscInqOwnStratBlkAuctRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqOwnStratBlkAuctRecT(extInqOwnStratBlkAuctRecT actual, extInqOwnStratBlkAuctRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareAcctTypCodGrpT (actual.acctTypCodGrp,expected.acctTypCodGrp, logMsg);
	compareTxtGrpT (actual.txtGrp,expected.txtGrp, logMsg);
	if ( memcmp(actual.membExchIdCodTo, expected.membExchIdCodTo, DRIV_MEMB_EXCH_ID_COD_TO_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqOwnStratBlkAuctRecT, membExchIdCodTo not matching. Actual %s but Expected %s", actual.membExchIdCodTo, expected.membExchIdCodTo);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.dateLstUpdDat, expected.dateLstUpdDat, DRIV_TIMESTAMP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqOwnStratBlkAuctRecT, dateLstUpdDat not matching. Actual %s but Expected %s", actual.dateLstUpdDat, expected.dateLstUpdDat);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqOwnStratBlkAuctResponseT(extInqOwnStratBlkAuctResponseT actual, extInqOwnStratBlkAuctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < INQ_OWN_STRAT_BLK_AUCT_REC_MAX;i++) {
		compareExtInqOwnStratBlkAuctRecT (actual.extInqOwnStratBlkAuctRec[i],expected.extInqOwnStratBlkAuctRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqOwnStratBlkAuctResponseT(inqOwnStratBlkAuctResponseT actual, inqOwnStratBlkAuctResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqOwnStratBlkAuctResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqOwnStratBlkAuctResponseT (actual.extension,expected.extension, logMsg);
}

