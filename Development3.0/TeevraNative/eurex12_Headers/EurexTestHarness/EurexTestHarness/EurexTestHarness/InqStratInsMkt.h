#include <InqStratInsMkt.hxx>
#define BUFFER_SIZE 1000


/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratInsMktGrpT getBscInqStratInsMktGrpT(char* testCaseNum , const char *root) {
	bscInqStratInsMktGrpT vbscInqStratInsMktGrpT;
	int i;

	for(i=0;i<PROD_ID_LEN;i++) {
		vbscInqStratInsMktGrpT.prodId[i]= ' ';
	}
	char lprodId[PROD_ID_LEN] = {""};
	getStrProperty("InqStratInsMkt.bscInqStratInsMktGrpT.prodId", lprodId);
	memcpy(vbscInqStratInsMktGrpT.prodId, lprodId, PROD_ID_LEN);

	for(i=0;i<STRAT_TYP_LEN;i++) {
		vbscInqStratInsMktGrpT.stratTyp[i]= ' ';
	}
	char lstratTyp[STRAT_TYP_LEN] = {""};
	getStrProperty("InqStratInsMkt.bscInqStratInsMktGrpT.stratTyp", lstratTyp);
	memcpy(vbscInqStratInsMktGrpT.stratTyp, lstratTyp, STRAT_TYP_LEN);
	return vbscInqStratInsMktGrpT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratInsMktRequestT getBscInqStratInsMktRequestT(char* testCaseNum , const char *root) {
	bscInqStratInsMktRequestT vbscInqStratInsMktRequestT;
	int i;

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqStratInsMktRequestT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqStratInsMkt.bscInqStratInsMktRequestT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqStratInsMktRequestT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqStratInsMktRequestT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqStratInsMkt.bscInqStratInsMktRequestT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqStratInsMktRequestT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);
	return vbscInqStratInsMktRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqStratInsMktRequestT getInqStratInsMktRequestT(char* testCaseNum , const char *root) {
	inqStratInsMktRequestT vinqStratInsMktRequestT;
	int i;

	vinqStratInsMktRequestT.header = getDataHeaderT(testCaseNum, "inqStratInsMktRequestT");
	vinqStratInsMktRequestT.basic = getBscInqStratInsMktRequestT(testCaseNum, "inqStratInsMktRequestT");	return vinqStratInsMktRequestT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratInsMktRecT getBscInqStratInsMktRecT(char* testCaseNum , const char *root) {
	bscInqStratInsMktRecT vbscInqStratInsMktRecT;
	int i;

	vbscInqStratInsMktRecT.stratIdGrp = getStratIdGrpT(testCaseNum, "bscInqStratInsMktRecT");
	vbscInqStratInsMktRecT.bstOrdrGrp = getBstOrdrGrpT(testCaseNum, "bscInqStratInsMktRecT");	return vbscInqStratInsMktRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
bscInqStratInsMktResponseT getBscInqStratInsMktResponseT(char* testCaseNum , const char *root) {
	bscInqStratInsMktResponseT vbscInqStratInsMktResponseT;
	int i;

	for(i=0;i<KEY_DATA_CTRL_BLK_LEN;i++) {
		vbscInqStratInsMktResponseT.keyDataCtrlBlk[i]= ' ';
	}
	char lkeyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN] = {""};
	getStrProperty("InqStratInsMkt.bscInqStratInsMktResponseT.keyDataCtrlBlk", lkeyDataCtrlBlk);
	memcpy(vbscInqStratInsMktResponseT.keyDataCtrlBlk, lkeyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN);

	for(i=0;i<DRIV_MLI_REC_CTR_LEN;i++) {
		vbscInqStratInsMktResponseT.mliRecCtr[i]= ' ';
	}
	char lmliRecCtr[DRIV_MLI_REC_CTR_LEN] = {""};
	getStrProperty("InqStratInsMkt.bscInqStratInsMktResponseT.mliRecCtr", lmliRecCtr);
	memcpy(vbscInqStratInsMktResponseT.mliRecCtr, lmliRecCtr, DRIV_MLI_REC_CTR_LEN);
	return vbscInqStratInsMktResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqStratInsMktRecT getExtInqStratInsMktRecT(char* testCaseNum , const char *root) {
	extInqStratInsMktRecT vextInqStratInsMktRecT;
	int i;

	for(i=0;i<DRIV_PRICE_LEN;i++) {
		vextInqStratInsMktRecT.lstTrdPrc[i]= ' ';
	}
	char llstTrdPrc[DRIV_PRICE_LEN] = {""};
	getStrProperty("InqStratInsMkt.extInqStratInsMktRecT.lstTrdPrc", llstTrdPrc);
	memcpy(vextInqStratInsMktRecT.lstTrdPrc, llstTrdPrc, DRIV_PRICE_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vextInqStratInsMktRecT.lstTrdQty[i]= ' ';
	}
	char llstTrdQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqStratInsMkt.extInqStratInsMktRecT.lstTrdQty", llstTrdQty);
	memcpy(vextInqStratInsMktRecT.lstTrdQty, llstTrdQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vextInqStratInsMktRecT.trdTim[i]= ' ';
	}
	char ltrdTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqStratInsMkt.extInqStratInsMktRecT.trdTim", ltrdTim);
	memcpy(vextInqStratInsMktRecT.trdTim, ltrdTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_TIME_LEN;i++) {
		vextInqStratInsMktRecT.stratReqTim[i]= ' ';
	}
	char lstratReqTim[DRIV_TIME_LEN] = {""};
	getStrProperty("InqStratInsMkt.extInqStratInsMktRecT.stratReqTim", lstratReqTim);
	memcpy(vextInqStratInsMktRecT.stratReqTim, lstratReqTim, DRIV_TIME_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vextInqStratInsMktRecT.stratReqBidQty[i]= ' ';
	}
	char lstratReqBidQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqStratInsMkt.extInqStratInsMktRecT.stratReqBidQty", lstratReqBidQty);
	memcpy(vextInqStratInsMktRecT.stratReqBidQty, lstratReqBidQty, DRIV_QUANTITY_LEN);

	for(i=0;i<DRIV_QUANTITY_LEN;i++) {
		vextInqStratInsMktRecT.stratReqAskQty[i]= ' ';
	}
	char lstratReqAskQty[DRIV_QUANTITY_LEN] = {""};
	getStrProperty("InqStratInsMkt.extInqStratInsMktRecT.stratReqAskQty", lstratReqAskQty);
	memcpy(vextInqStratInsMktRecT.stratReqAskQty, lstratReqAskQty, DRIV_QUANTITY_LEN);
	return vextInqStratInsMktRecT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
extInqStratInsMktResponseT getExtInqStratInsMktResponseT(char* testCaseNum , const char *root) {
	extInqStratInsMktResponseT vextInqStratInsMktResponseT;
	int i;
	return vextInqStratInsMktResponseT;
}

/**
* @Generated get<<InnerStruct>>()
*
**/
inqStratInsMktResponseT getInqStratInsMktResponseT(char* testCaseNum , const char *root) {
	inqStratInsMktResponseT vinqStratInsMktResponseT;
	int i;

	vinqStratInsMktResponseT.header = getDataHeaderT(testCaseNum, "inqStratInsMktResponseT");
	vinqStratInsMktResponseT.basic = getBscInqStratInsMktResponseT(testCaseNum, "inqStratInsMktResponseT");
	vinqStratInsMktResponseT.extension = getExtInqStratInsMktResponseT(testCaseNum, "inqStratInsMktResponseT");	return vinqStratInsMktResponseT;
}

/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratInsMktGrpT(bscInqStratInsMktGrpT actual, bscInqStratInsMktGrpT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.prodId, expected.prodId, PROD_ID_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratInsMktGrpT, prodId not matching. Actual %s but Expected %s", actual.prodId, expected.prodId);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratTyp, expected.stratTyp, STRAT_TYP_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratInsMktGrpT, stratTyp not matching. Actual %s but Expected %s", actual.stratTyp, expected.stratTyp);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratInsMktRequestT(bscInqStratInsMktRequestT actual, bscInqStratInsMktRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < BSC_INQ_STRAT_INS_MKT_GRP_MAX;i++) {
		compareBscInqStratInsMktGrpT (actual.bscInqStratInsMktGrp[i],expected.bscInqStratInsMktGrp[i], logMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratInsMktRequestT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratInsMktRequestT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqStratInsMktRequestT(inqStratInsMktRequestT actual, inqStratInsMktRequestT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqStratInsMktRequestT (actual.basic,expected.basic, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratInsMktRecT(bscInqStratInsMktRecT actual, bscInqStratInsMktRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareStratIdGrpT (actual.stratIdGrp,expected.stratIdGrp, logMsg);
	compareBstOrdrGrpT (actual.bstOrdrGrp,expected.bstOrdrGrp, logMsg);
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareBscInqStratInsMktResponseT(bscInqStratInsMktResponseT actual, bscInqStratInsMktResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.keyDataCtrlBlk, expected.keyDataCtrlBlk, KEY_DATA_CTRL_BLK_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratInsMktResponseT, keyDataCtrlBlk not matching. Actual %s but Expected %s", actual.keyDataCtrlBlk, expected.keyDataCtrlBlk);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.mliRecCtr, expected.mliRecCtr, DRIV_MLI_REC_CTR_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In bscInqStratInsMktResponseT, mliRecCtr not matching. Actual %s but Expected %s", actual.mliRecCtr, expected.mliRecCtr);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	for ( i = 0; i < BSC_INQ_STRAT_INS_MKT_REC_MAX;i++) {
		compareBscInqStratInsMktRecT (actual.bscInqStratInsMktRec[i],expected.bscInqStratInsMktRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqStratInsMktRecT(extInqStratInsMktRecT actual, extInqStratInsMktRecT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	if ( memcmp(actual.lstTrdPrc, expected.lstTrdPrc, DRIV_PRICE_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqStratInsMktRecT, lstTrdPrc not matching. Actual %s but Expected %s", actual.lstTrdPrc, expected.lstTrdPrc);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.lstTrdQty, expected.lstTrdQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqStratInsMktRecT, lstTrdQty not matching. Actual %s but Expected %s", actual.lstTrdQty, expected.lstTrdQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.trdTim, expected.trdTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqStratInsMktRecT, trdTim not matching. Actual %s but Expected %s", actual.trdTim, expected.trdTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratReqTim, expected.stratReqTim, DRIV_TIME_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqStratInsMktRecT, stratReqTim not matching. Actual %s but Expected %s", actual.stratReqTim, expected.stratReqTim);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratReqBidQty, expected.stratReqBidQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqStratInsMktRecT, stratReqBidQty not matching. Actual %s but Expected %s", actual.stratReqBidQty, expected.stratReqBidQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
	if ( memcmp(actual.stratReqAskQty, expected.stratReqAskQty, DRIV_QUANTITY_LEN)) {
		sprintf_s(tempLogMsg, BUFFER_SIZE, "In extInqStratInsMktRecT, stratReqAskQty not matching. Actual %s but Expected %s", actual.stratReqAskQty, expected.stratReqAskQty);
		strcat_s(logMsg, BUFFER_SIZE, tempLogMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareExtInqStratInsMktResponseT(extInqStratInsMktResponseT actual, extInqStratInsMktResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	for ( i = 0; i < EXT_INQ_STRAT_INS_MKT_REC_MAX;i++) {
		compareExtInqStratInsMktRecT (actual.extInqStratInsMktRec[i],expected.extInqStratInsMktRec[i], logMsg);
	}
}


/**
* @Generated compare<<InnerStruct>>()
*
**/
void compareInqStratInsMktResponseT(inqStratInsMktResponseT actual, inqStratInsMktResponseT expected, char* logMsg) {
	char tempLogMsg[BUFFER_SIZE];
	tempLogMsg[0] = '\0';
	int i;
	compareDataHeaderT (actual.header,expected.header, logMsg);
	compareBscInqStratInsMktResponseT (actual.basic,expected.basic, logMsg);
	compareExtInqStratInsMktResponseT (actual.extension,expected.extension, logMsg);
}

